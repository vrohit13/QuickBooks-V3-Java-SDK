//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.14 at 04:24:27 PM PST 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 *  Describes the Other Name (aka Payee). QBD only
 * 
 * <p>Java class for OtherName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherName">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}NameBase">
 *       &lt;sequence>
 *         &lt;element name="AcctNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAddr" type="{http://schema.intuit.com/finance/v3}PhysicalAddress" minOccurs="0"/>
 *         &lt;element name="OtherAddr" type="{http://schema.intuit.com/finance/v3}PhysicalAddress" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OtherNameEx" type="{http://schema.intuit.com/finance/v3}IntuitAnyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherName", propOrder = {
    "acctNum",
    "primaryAddr",
    "otherAddr",
    "otherNameEx"
})
public class OtherName
    extends NameBase
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "AcctNum")
    protected String acctNum;
    @XmlElement(name = "PrimaryAddr")
    protected PhysicalAddress primaryAddr;
    @XmlElement(name = "OtherAddr")
    protected List<PhysicalAddress> otherAddr;
    @XmlElement(name = "OtherNameEx")
    protected IntuitAnyType otherNameEx;

    /**
     * Gets the value of the acctNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctNum() {
        return acctNum;
    }

    /**
     * Sets the value of the acctNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctNum(String value) {
        this.acctNum = value;
    }

    /**
     * Gets the value of the primaryAddr property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalAddress }
     *     
     */
    public PhysicalAddress getPrimaryAddr() {
        return primaryAddr;
    }

    /**
     * Sets the value of the primaryAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalAddress }
     *     
     */
    public void setPrimaryAddr(PhysicalAddress value) {
        this.primaryAddr = value;
    }

    /**
     * Gets the value of the otherAddr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherAddr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherAddr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysicalAddress }
     * 
     * 
     */
    public List<PhysicalAddress> getOtherAddr() {
        if (otherAddr == null) {
            otherAddr = new ArrayList<PhysicalAddress>();
        }
        return this.otherAddr;
    }

    /**
     * Gets the value of the otherNameEx property.
     * 
     * @return
     *     possible object is
     *     {@link IntuitAnyType }
     *     
     */
    public IntuitAnyType getOtherNameEx() {
        return otherNameEx;
    }

    /**
     * Sets the value of the otherNameEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntuitAnyType }
     *     
     */
    public void setOtherNameEx(IntuitAnyType value) {
        this.otherNameEx = value;
    }

    /**
     * Sets the value of the otherAddr property.
     * 
     * @param otherAddr
     *     allowed object is
     *     {@link PhysicalAddress }
     *     
     */
    public void setOtherAddr(List<PhysicalAddress> otherAddr) {
        this.otherAddr = otherAddr;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof OtherName)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final OtherName that = ((OtherName) object);
        {
            String lhsAcctNum;
            lhsAcctNum = this.getAcctNum();
            String rhsAcctNum;
            rhsAcctNum = that.getAcctNum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "acctNum", lhsAcctNum), LocatorUtils.property(thatLocator, "acctNum", rhsAcctNum), lhsAcctNum, rhsAcctNum)) {
                return false;
            }
        }
        {
            PhysicalAddress lhsPrimaryAddr;
            lhsPrimaryAddr = this.getPrimaryAddr();
            PhysicalAddress rhsPrimaryAddr;
            rhsPrimaryAddr = that.getPrimaryAddr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "primaryAddr", lhsPrimaryAddr), LocatorUtils.property(thatLocator, "primaryAddr", rhsPrimaryAddr), lhsPrimaryAddr, rhsPrimaryAddr)) {
                return false;
            }
        }
        {
            List<PhysicalAddress> lhsOtherAddr;
            lhsOtherAddr = (((this.otherAddr!= null)&&(!this.otherAddr.isEmpty()))?this.getOtherAddr():null);
            List<PhysicalAddress> rhsOtherAddr;
            rhsOtherAddr = (((that.otherAddr!= null)&&(!that.otherAddr.isEmpty()))?that.getOtherAddr():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "otherAddr", lhsOtherAddr), LocatorUtils.property(thatLocator, "otherAddr", rhsOtherAddr), lhsOtherAddr, rhsOtherAddr)) {
                return false;
            }
        }
        {
            IntuitAnyType lhsOtherNameEx;
            lhsOtherNameEx = this.getOtherNameEx();
            IntuitAnyType rhsOtherNameEx;
            rhsOtherNameEx = that.getOtherNameEx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "otherNameEx", lhsOtherNameEx), LocatorUtils.property(thatLocator, "otherNameEx", rhsOtherNameEx), lhsOtherNameEx, rhsOtherNameEx)) {
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
            String theAcctNum;
            theAcctNum = this.getAcctNum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "acctNum", theAcctNum), currentHashCode, theAcctNum);
        }
        {
            PhysicalAddress thePrimaryAddr;
            thePrimaryAddr = this.getPrimaryAddr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "primaryAddr", thePrimaryAddr), currentHashCode, thePrimaryAddr);
        }
        {
            List<PhysicalAddress> theOtherAddr;
            theOtherAddr = (((this.otherAddr!= null)&&(!this.otherAddr.isEmpty()))?this.getOtherAddr():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "otherAddr", theOtherAddr), currentHashCode, theOtherAddr);
        }
        {
            IntuitAnyType theOtherNameEx;
            theOtherNameEx = this.getOtherNameEx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "otherNameEx", theOtherNameEx), currentHashCode, theOtherNameEx);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
