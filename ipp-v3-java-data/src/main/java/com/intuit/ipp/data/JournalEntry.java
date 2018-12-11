//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.08 at 07:59:36 PM PST 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * Accounting transaction, consists of journal lines,
 * 				each of which is either a debit or a credit. The total of the debits
 * 				must equal the total of the credits.
 * 
 * <p>Java class for JournalEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JournalEntry">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}Transaction">
 *       &lt;sequence>
 *         &lt;element name="Adjustment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HomeCurrencyAdjustment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EnteredInHomeCurrency" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TotalAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="HomeTotalAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="JournalEntryEx" type="{http://schema.intuit.com/finance/v3}IntuitAnyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JournalEntry", propOrder = {
    "adjustment",
    "homeCurrencyAdjustment",
    "enteredInHomeCurrency",
    "totalAmt",
    "homeTotalAmt",
    "journalEntryEx"
})
public class JournalEntry
    extends Transaction
    implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Adjustment")
    protected Boolean adjustment;
    @XmlElement(name = "HomeCurrencyAdjustment")
    protected Boolean homeCurrencyAdjustment;
    @XmlElement(name = "EnteredInHomeCurrency")
    protected Boolean enteredInHomeCurrency;
    @XmlElement(name = "TotalAmt")
    protected BigDecimal totalAmt;
    @XmlElement(name = "HomeTotalAmt")
    protected BigDecimal homeTotalAmt;
    @XmlElement(name = "JournalEntryEx")
    protected IntuitAnyType journalEntryEx;

    /**
     * Gets the value of the adjustment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdjustment() {
        return adjustment;
    }

    /**
     * Sets the value of the adjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdjustment(Boolean value) {
        this.adjustment = value;
    }

    /**
     * Gets the value of the homeCurrencyAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHomeCurrencyAdjustment() {
        return homeCurrencyAdjustment;
    }

    /**
     * Sets the value of the homeCurrencyAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHomeCurrencyAdjustment(Boolean value) {
        this.homeCurrencyAdjustment = value;
    }

    /**
     * Gets the value of the enteredInHomeCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnteredInHomeCurrency() {
        return enteredInHomeCurrency;
    }

    /**
     * Sets the value of the enteredInHomeCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnteredInHomeCurrency(Boolean value) {
        this.enteredInHomeCurrency = value;
    }

    /**
     * Gets the value of the totalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmt() {
        return totalAmt;
    }

    /**
     * Sets the value of the totalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmt(BigDecimal value) {
        this.totalAmt = value;
    }

    /**
     * Gets the value of the homeTotalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHomeTotalAmt() {
        return homeTotalAmt;
    }

    /**
     * Sets the value of the homeTotalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHomeTotalAmt(BigDecimal value) {
        this.homeTotalAmt = value;
    }

    /**
     * Gets the value of the journalEntryEx property.
     * 
     * @return
     *     possible object is
     *     {@link IntuitAnyType }
     *     
     */
    public IntuitAnyType getJournalEntryEx() {
        return journalEntryEx;
    }

    /**
     * Sets the value of the journalEntryEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntuitAnyType }
     *     
     */
    public void setJournalEntryEx(IntuitAnyType value) {
        this.journalEntryEx = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final JournalEntry that = ((JournalEntry) object);
        {
            Boolean lhsAdjustment;
            lhsAdjustment = this.isAdjustment();
            Boolean rhsAdjustment;
            rhsAdjustment = that.isAdjustment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "adjustment", lhsAdjustment), LocatorUtils.property(thatLocator, "adjustment", rhsAdjustment), lhsAdjustment, rhsAdjustment, (this.adjustment!= null), (that.adjustment!= null))) {
                return false;
            }
        }
        {
            Boolean lhsHomeCurrencyAdjustment;
            lhsHomeCurrencyAdjustment = this.isHomeCurrencyAdjustment();
            Boolean rhsHomeCurrencyAdjustment;
            rhsHomeCurrencyAdjustment = that.isHomeCurrencyAdjustment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "homeCurrencyAdjustment", lhsHomeCurrencyAdjustment), LocatorUtils.property(thatLocator, "homeCurrencyAdjustment", rhsHomeCurrencyAdjustment), lhsHomeCurrencyAdjustment, rhsHomeCurrencyAdjustment, (this.homeCurrencyAdjustment!= null), (that.homeCurrencyAdjustment!= null))) {
                return false;
            }
        }
        {
            Boolean lhsEnteredInHomeCurrency;
            lhsEnteredInHomeCurrency = this.isEnteredInHomeCurrency();
            Boolean rhsEnteredInHomeCurrency;
            rhsEnteredInHomeCurrency = that.isEnteredInHomeCurrency();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "enteredInHomeCurrency", lhsEnteredInHomeCurrency), LocatorUtils.property(thatLocator, "enteredInHomeCurrency", rhsEnteredInHomeCurrency), lhsEnteredInHomeCurrency, rhsEnteredInHomeCurrency, (this.enteredInHomeCurrency!= null), (that.enteredInHomeCurrency!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsTotalAmt;
            lhsTotalAmt = this.getTotalAmt();
            BigDecimal rhsTotalAmt;
            rhsTotalAmt = that.getTotalAmt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalAmt", lhsTotalAmt), LocatorUtils.property(thatLocator, "totalAmt", rhsTotalAmt), lhsTotalAmt, rhsTotalAmt, (this.totalAmt!= null), (that.totalAmt!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsHomeTotalAmt;
            lhsHomeTotalAmt = this.getHomeTotalAmt();
            BigDecimal rhsHomeTotalAmt;
            rhsHomeTotalAmt = that.getHomeTotalAmt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "homeTotalAmt", lhsHomeTotalAmt), LocatorUtils.property(thatLocator, "homeTotalAmt", rhsHomeTotalAmt), lhsHomeTotalAmt, rhsHomeTotalAmt, (this.homeTotalAmt!= null), (that.homeTotalAmt!= null))) {
                return false;
            }
        }
        {
            IntuitAnyType lhsJournalEntryEx;
            lhsJournalEntryEx = this.getJournalEntryEx();
            IntuitAnyType rhsJournalEntryEx;
            rhsJournalEntryEx = that.getJournalEntryEx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "journalEntryEx", lhsJournalEntryEx), LocatorUtils.property(thatLocator, "journalEntryEx", rhsJournalEntryEx), lhsJournalEntryEx, rhsJournalEntryEx, (this.journalEntryEx!= null), (that.journalEntryEx!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            Boolean theAdjustment;
            theAdjustment = this.isAdjustment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "adjustment", theAdjustment), currentHashCode, theAdjustment, (this.adjustment!= null));
        }
        {
            Boolean theHomeCurrencyAdjustment;
            theHomeCurrencyAdjustment = this.isHomeCurrencyAdjustment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "homeCurrencyAdjustment", theHomeCurrencyAdjustment), currentHashCode, theHomeCurrencyAdjustment, (this.homeCurrencyAdjustment!= null));
        }
        {
            Boolean theEnteredInHomeCurrency;
            theEnteredInHomeCurrency = this.isEnteredInHomeCurrency();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "enteredInHomeCurrency", theEnteredInHomeCurrency), currentHashCode, theEnteredInHomeCurrency, (this.enteredInHomeCurrency!= null));
        }
        {
            BigDecimal theTotalAmt;
            theTotalAmt = this.getTotalAmt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalAmt", theTotalAmt), currentHashCode, theTotalAmt, (this.totalAmt!= null));
        }
        {
            BigDecimal theHomeTotalAmt;
            theHomeTotalAmt = this.getHomeTotalAmt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "homeTotalAmt", theHomeTotalAmt), currentHashCode, theHomeTotalAmt, (this.homeTotalAmt!= null));
        }
        {
            IntuitAnyType theJournalEntryEx;
            theJournalEntryEx = this.getJournalEntryEx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "journalEntryEx", theJournalEntryEx), currentHashCode, theJournalEntryEx, (this.journalEntryEx!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
