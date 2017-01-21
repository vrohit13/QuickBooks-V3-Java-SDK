package com.intuit.ipp.interceptors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.intuit.ipp.core.Context;
import com.intuit.ipp.exception.FMSException;
import com.intuit.ipp.services.CallbackMessage;
import com.intuit.ipp.util.Config;
import com.intuit.ipp.util.Logger;
import com.intuit.ipp.util.StringUtils;

/**
 * Class to provide the provision to add interceptors in the order those have to be executed. 
 * 
 */
public class IntuitInterceptorProvider implements Callable<Void> {

	/**
	 * logger instance
	 */
	private static final org.slf4j.Logger LOG = Logger.getLogger();
	
	/**
	 * variable requestInterceptors is used for keeping the request interceptors
	 */
	private List<Interceptor> requestInterceptors = new ArrayList<Interceptor>();

	/**
	 * variable responseInterceptors is used for keeping the response interceptors
	 */
	private List<Interceptor> responseInterceptors = new ArrayList<Interceptor>();

	/**
	 * variable intuitMessage
	 */
	private IntuitMessage intuitMessage = null;
	
	/**
	 * Constructor IntuitInterceptorProvider
	 */
	public IntuitInterceptorProvider() {

		requestInterceptors.add(new PrepareRequestInterceptor());
		requestInterceptors.add(new SerializeInterceptor());
		requestInterceptors.add(new CompressionInterceptor());
		//requestInterceptors.add(new ConnectionInterceptor());
		requestInterceptors.add(getConnectionInterceptor());

		responseInterceptors.add(new DecompressionInterceptor());
		responseInterceptors.add(new DeserializeInterceptor());
		responseInterceptors.add(new HandleResponseInterceptor());
	}

	/**
	 * Method to execute the interceptors (request and response) which are added
	 * 
	 * @param intuitMessage the intuit message
	 * @throws FMSException the FMSException
	 */
	public void executeInterceptors(final IntuitMessage intuitMessage) throws FMSException {
		executeRequestInterceptors(intuitMessage);
		executeResponseInterceptors(intuitMessage);
	}

	/**
	 * Method to execute only request interceptors which are added to requestInterceptors list
	 * 
	 * @param intuitMessage the intuit message
	 * @throws FMSException the FMSException
	 */
	protected void executeRequestInterceptors(final IntuitMessage intuitMessage) throws FMSException {
		Iterator<Interceptor> itr = requestInterceptors.iterator();
		while (itr.hasNext()) {
			Interceptor interceptor = itr.next();
			interceptor.execute(intuitMessage);
		}
	}

	/**
	 * Method to execute only response interceptors which are added to the responseInterceptors list
	 * 
	 * @param intuitMessage the intuit message
	 * @throws FMSException the FMSException
	 */
	protected void executeResponseInterceptors(final IntuitMessage intuitMessage) throws FMSException {
		Iterator<Interceptor> itr = responseInterceptors.iterator();
		while (itr.hasNext()) {
			Interceptor interceptor = itr.next();
			interceptor.execute(intuitMessage);
		}
	}
	
	/**
	 * Method to execute interceptors in case of Async operations.
	 * 
	 * @param intuitMessage the intuit message
	 */
	public void executeAsyncInterceptors(final IntuitMessage intuitMessage) {
		this.intuitMessage = intuitMessage;
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		executorService.submit(this);
	}
	
	
	private Interceptor getConnectionInterceptor() {
		String httpTransport = Config.getProperty(Config.HTTP_TRANSPORT);
		if (StringUtils.hasText(httpTransport) && httpTransport.equals(HTTPURLConnectionInterceptor.HTTP_URL_CONNECTION)) {
			return new HTTPURLConnectionInterceptor();
		}
		return new HTTPClientConnectionInterceptor();	
	}
	/**
	 * Callable interface method will be executed
	 * 
	 * @return Void the Class object representing the Java keyword void
	 * @throws Exception the callable exception
	 */
	@Override
	public Void call() throws FMSException {
		CallbackMessage callbackMessage = new CallbackMessage();
		try {
			executeInterceptors(intuitMessage);
		} catch (FMSException e) {
			callbackMessage.setFMSException(e);
			LOG.error("Exception in interceptor flow", e);
		}
		// set callbackMessage
		intuitMessage.getResponseElements().setCallbackMessage(callbackMessage);
		
		// execute callback handler interceptor
		new CallbackHandlerInterceptor().execute(intuitMessage);
		
		return null;
	}

    /**
     * Returns current request interceptors.
     * It is used to extend and overwrite existing order
     * @return interceptors list
     */
    protected List<Interceptor> getRequestInterceptors() {
        return requestInterceptors;
    }

    /**
     * Updates interceptors
     * @param requestInterceptors list
     */
    protected void setRequestInterceptors(List<Interceptor> requestInterceptors) {
        this.requestInterceptors = requestInterceptors;
    }
	
}
