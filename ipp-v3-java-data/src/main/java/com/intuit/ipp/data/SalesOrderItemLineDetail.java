//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.14 at 04:24:27 PM PST 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * 
 * 				Product: ALL
 * 				Description: SalesOrder item detail for
 * 				a transaction line.
 * 			
 * 
 * <p>Java class for SalesOrderItemLineDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesOrderItemLineDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}SalesItemLineDetail">
 *       &lt;sequence>
 *         &lt;element name="ManuallyClosed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesOrderItemLineDetail", propOrder = {
    "manuallyClosed"
})
public class SalesOrderItemLineDetail
    extends SalesItemLineDetail
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ManuallyClosed")
    protected Boolean manuallyClosed;

    /**
     * Gets the value of the manuallyClosed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isManuallyClosed() {
        return manuallyClosed;
    }

    /**
     * Sets the value of the manuallyClosed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManuallyClosed(Boolean value) {
        this.manuallyClosed = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SalesOrderItemLineDetail)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final SalesOrderItemLineDetail that = ((SalesOrderItemLineDetail) object);
        {
            Boolean lhsManuallyClosed;
            lhsManuallyClosed = this.isManuallyClosed();
            Boolean rhsManuallyClosed;
            rhsManuallyClosed = that.isManuallyClosed();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "manuallyClosed", lhsManuallyClosed), LocatorUtils.property(thatLocator, "manuallyClosed", rhsManuallyClosed), lhsManuallyClosed, rhsManuallyClosed)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            Boolean theManuallyClosed;
            theManuallyClosed = this.isManuallyClosed();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "manuallyClosed", theManuallyClosed), currentHashCode, theManuallyClosed);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
