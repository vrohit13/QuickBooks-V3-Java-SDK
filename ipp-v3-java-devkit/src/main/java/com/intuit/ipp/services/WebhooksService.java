package com.intuit.ipp.services;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import com.intuit.ipp.util.StringUtils;

import com.intuit.ipp.data.WebhooksEvent;
import com.intuit.ipp.util.Config;
import com.intuit.ipp.util.Logger;

/**
 * Class to provide webhooks related functions
 *
 */
public class WebhooksService {

	/**
	 * the logger instance
	 */
	private static final org.slf4j.Logger LOG = Logger.getLogger();
	
	/**
	 * define algorithm
	 */
	private static final String ALGORITHM = "HmacSHA256";
	
	public boolean verifyPayload(String intuitSignature, String payload) {	
		try {
			SecretKeySpec secretKey = new SecretKeySpec(getVerifierKey().getBytes("UTF-8"), ALGORITHM);
			Mac mac = Mac.getInstance(ALGORITHM);
			mac.init(secretKey);
			String hash = DatatypeConverter.printBase64Binary(mac.doFinal(payload.getBytes()));
			return hash.equals(intuitSignature);
		} catch (NoSuchAlgorithmException e) {
			LOG.error("NoSuchAlgorithmException while validating payload", e);
			return false;
		} catch (UnsupportedEncodingException e) {
			LOG.error("UnsupportedEncodingException while validating payload", e);
			return false;
		} catch (InvalidKeyException e) {
			LOG.error("InvalidKeyException validating payload", e);
			return false;
		}
	} 
	
	public WebhooksEvent getWebhooksEvent(String payload) {
		
		if (!StringUtils.hasText(payload)) {
			return null;
		}
		try {
			ObjectMapper mapper = new ObjectMapper();
			return mapper.readValue(payload, WebhooksEvent.class);
		} catch (JsonParseException e) {
			LOG.error("Error while parsing payload", e);
			return null;
		} catch (JsonMappingException e) {
			LOG.error("Error while mapping payload", e);
			return null;
		} catch (IOException e) {
			LOG.error("IO exception while parsing payload", e);
			return null;
		}
			
	}
	
	/**
     * Verifier key to validate webhooks payload
     * @return
     */
    private String getVerifierKey() {
    	return Config.getProperty(Config.WEBHOOKS_VERIFIER_TOKEN);
    }
	

}
