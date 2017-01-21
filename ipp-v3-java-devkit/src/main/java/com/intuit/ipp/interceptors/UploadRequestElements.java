package com.intuit.ipp.interceptors;

import java.io.InputStream;

/**
 * 
 * Class to hold the request elements for upload functionality
 *
 */
public class UploadRequestElements {

	/**
	 * variable TEMPLATE_ENTITY_BOUNDARY
	 */
	public static final String TEMPLATE_ENTITY_BOUNDARY = "\r\n--%s\r\nContent-Disposition: form-data; name=\"%s\"\r\nContent-Type: %s\r\n\r\n";
	
	/**
	 * variable TEMPLATE_CONTENT_BOUNDARY
	 */
	public static final String TEMPLATE_CONTENT_BOUNDARY = "\r\n\r\n--%s\r\nContent-Disposition: form-data; name=\"%s\" %s\r\n%s\r\n";
	
	/**
	 * variable boundaryForEntity
	 */
	private String boundaryForEntity;
	
	/**
	 * variable boundaryForContent
	 */
	private String boundaryForContent;
	
	/**
	 * variable docContent
	 */
	private InputStream docContent;
	
	/**
	 * variable boundaryId
	 */
	private String boundaryId;

    public String getElementsId() {
        return elementsId;
    }

    public void setElementsId(String elementsId) {
        this.elementsId = elementsId;
    }

    /**
     * Id which related to specific entity
     */
    private String elementsId;

	/**
	 * Gets boundaryForEntity
	 * 
	 * @return boundaryForEntity
	 */
	public String getBoundaryForEntity() {
		return boundaryForEntity;
	}

	/**
	 * Sets boundaryForEntity
	 * 
	 * @param boundaryForEntity
	 */
	public void setBoundaryForEntity(String boundaryForEntity) {
		this.boundaryForEntity = boundaryForEntity;
	}

	/**
	 * Gets boundaryForContent
	 * 
	 * @return boundaryForContent
	 */
	public String getBoundaryForContent() {
		return boundaryForContent;
	}

	/**
	 * Sets boundaryForContent
	 * 
	 * @param boundaryForContent
	 */
	public void setBoundaryForContent(String boundaryForContent) {
		this.boundaryForContent = boundaryForContent;
	}

	/**
	 * Gets docContent
	 * 
	 * @return docContent
	 */
	public InputStream getDocContent() {
		return docContent;
	}

	/**
	 * Sets docContent
	 * 
	 * @param docContent
	 */
	public void setDocContent(InputStream docContent) {
		this.docContent = docContent;
	}

	/**
	 * Gets boundaryId
	 * 
	 * @return boundaryId
	 */
	public String getBoundaryId() {
		return boundaryId;
	}

	/**
	 * Sets boundaryId
	 * 
	 * @param boundaryId
	 */
	public void setBoundaryId(String boundaryId) {
		this.boundaryId = boundaryId;
	}
	
}
