package com.intuit.ipp.example;

import static com.intuit.ipp.query.GenerateQuery.$;
import static com.intuit.ipp.query.GenerateQuery.select;

import java.util.ArrayList;
import java.util.List;

import com.intuit.ipp.core.Context;
import com.intuit.ipp.core.ServiceType;
import com.intuit.ipp.data.Customer;
import com.intuit.ipp.exception.AuthenticationException;
import com.intuit.ipp.exception.BadRequestException;
import com.intuit.ipp.exception.ConfigurationException;
import com.intuit.ipp.exception.FMSException;
import com.intuit.ipp.exception.InternalServiceException;
import com.intuit.ipp.exception.InvalidRequestException;
import com.intuit.ipp.exception.InvalidTokenException;
import com.intuit.ipp.exception.ServiceException;
import com.intuit.ipp.exception.ServiceUnavailableException;
import com.intuit.ipp.exception.ValidationException;
import com.intuit.ipp.query.GenerateQuery;
import com.intuit.ipp.security.OAuthAuthorizer;
import com.intuit.ipp.services.DataService;
import com.intuit.ipp.services.QueryResult;
import com.intuit.ipp.util.Config;

public class QueryOperationTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String appToken = "replace app token here";

				String consumerKey = "replace consumer key here";
				String consumerSecret = "replace consumer secret here";
				String accessToken = "replace acces token  here";
				String accessTokenSecret = "replace access token secret here";

		OAuthAuthorizer oauth = new OAuthAuthorizer(consumerKey, consumerSecret, accessToken, accessTokenSecret);

		ServiceType type = ServiceType.QBO;
		String realmID = "replace company id here";//"219431353";
		Context context = null;

		try {
			context = new Context(oauth, appToken, type, realmID);

			DataService service = new DataService(context);

			Customer customer = GenerateQuery.createQueryEntity(Customer.class);
			/*String query = select($(customer.getId()), $(customer.getDisplayName()))
					.where($(customer.getId()).eq("NG:2285964")).build();*/
			
			String query = select($(customer.getId()), $(customer.getDisplayName())).generate();
			
			List<String> includeQueryParam = new ArrayList<String>();
			includeQueryParam.add("firsttxndate");
			context.setIncludeParam(includeQueryParam);
			
			List<String> queryList = new ArrayList<String>();
			queryList.add(query);

			QueryResult queryResult = service.executeQuery(query);
			System.out.println("executeQuery called...");
			if (queryResult != null) {
				System.out.println("queryResult...");
				System.out.println(queryResult.getStartPosition());
				System.out.println(queryResult.getEntities().size());
			}

			System.out.println("I'm done");
		} catch (FMSException e) {
			if (e instanceof AuthenticationException) {
				System.out.println("Handling Authentication Exception");
				e.printStackTrace();
			} else if (e instanceof AuthenticationException) {
				System.out.println("Handling Authorization Exception");
				e.printStackTrace();
			} else if (e instanceof BadRequestException) {
				System.out.println("Handling Bad Request Exception");
				e.printStackTrace();
			} else if (e instanceof ConfigurationException) {
				System.out.println("Handling Configuration Exception");
				e.printStackTrace();
			} else if (e instanceof InternalServiceException) {
				System.out.println("Handling Internal Service Exception");
				e.printStackTrace();
			} else if (e instanceof InvalidRequestException) {
				System.out.println("Handling Invalid Request Exception");
				e.printStackTrace();
			} else if (e instanceof InvalidTokenException) {
				System.out.println("Handling Invalid Token Exception");
				e.printStackTrace();
			} else if (e instanceof ServiceException) {
				System.out.println("Handling Service Exception");
				e.printStackTrace();
			} else if (e instanceof ServiceUnavailableException) {
				System.out.println("Service Unavailable Exception");
				e.printStackTrace();
			} else if (e instanceof ValidationException) {
				System.out.println("Service Validation Exception");
				e.printStackTrace();
			} else {
				e.printStackTrace();
			}
		}

	}

}
