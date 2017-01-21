//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.14 at 04:24:27 PM PST 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.intuit.sb.cdm.util.v3.DateAdapter;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * An asset you do not expect to convert to cash
 * 				during one year of normal operations.
 * 				A fixed asset is usually
 * 				something that is necessary for the operation of your business, such
 * 				as a truck, cash register, or computer.
 * 			
 * 
 * <p>Java class for FixedAsset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FixedAsset">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}IntuitEntity">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AcquiredAs" type="{http://schema.intuit.com/finance/v3}AcquiredAsEnum" minOccurs="0"/>
 *         &lt;element name="PurchaseDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PurchaseDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PurchaseCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Vendor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssetAccountRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *         &lt;element name="SalesDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SalesPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SalesExpense" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PONumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WarrantyExpDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssetNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CostBasis" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Depreciation" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BookValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="FixedAssetEx" type="{http://schema.intuit.com/finance/v3}IntuitAnyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FixedAsset", propOrder = {
    "name",
    "active",
    "acquiredAs",
    "purchaseDesc",
    "purchaseDate",
    "purchaseCost",
    "vendor",
    "assetAccountRef",
    "salesDesc",
    "salesDate",
    "salesPrice",
    "salesExpense",
    "location",
    "poNumber",
    "serialNumber",
    "warrantyExpDate",
    "description",
    "notes",
    "assetNum",
    "costBasis",
    "depreciation",
    "bookValue",
    "fixedAssetEx"
})
public class FixedAsset
    extends IntuitEntity
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Active")
    protected Boolean active;
    @XmlElement(name = "AcquiredAs")
    protected AcquiredAsEnum acquiredAs;
    @XmlElement(name = "PurchaseDesc")
    protected String purchaseDesc;
    @XmlElement(name = "PurchaseDate", type = String.class)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date purchaseDate;
    @XmlElement(name = "PurchaseCost")
    protected BigDecimal purchaseCost;
    @XmlElement(name = "Vendor")
    protected String vendor;
    @XmlElement(name = "AssetAccountRef")
    protected ReferenceType assetAccountRef;
    @XmlElement(name = "SalesDesc")
    protected String salesDesc;
    @XmlElement(name = "SalesDate", type = String.class)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date salesDate;
    @XmlElement(name = "SalesPrice")
    protected BigDecimal salesPrice;
    @XmlElement(name = "SalesExpense")
    protected BigDecimal salesExpense;
    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "PONumber")
    protected String poNumber;
    @XmlElement(name = "SerialNumber")
    protected String serialNumber;
    @XmlElement(name = "WarrantyExpDate", type = String.class)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date warrantyExpDate;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElement(name = "AssetNum")
    protected Integer assetNum;
    @XmlElement(name = "CostBasis")
    protected BigDecimal costBasis;
    @XmlElement(name = "Depreciation")
    protected BigDecimal depreciation;
    @XmlElement(name = "BookValue")
    protected BigDecimal bookValue;
    @XmlElement(name = "FixedAssetEx")
    protected IntuitAnyType fixedAssetEx;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the acquiredAs property.
     * 
     * @return
     *     possible object is
     *     {@link AcquiredAsEnum }
     *     
     */
    public AcquiredAsEnum getAcquiredAs() {
        return acquiredAs;
    }

    /**
     * Sets the value of the acquiredAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcquiredAsEnum }
     *     
     */
    public void setAcquiredAs(AcquiredAsEnum value) {
        this.acquiredAs = value;
    }

    /**
     * Gets the value of the purchaseDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseDesc() {
        return purchaseDesc;
    }

    /**
     * Sets the value of the purchaseDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseDesc(String value) {
        this.purchaseDesc = value;
    }

    /**
     * Gets the value of the purchaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getPurchaseDate() {
        return purchaseDate;
    }

    /**
     * Sets the value of the purchaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseDate(Date value) {
        this.purchaseDate = value;
    }

    /**
     * Gets the value of the purchaseCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPurchaseCost() {
        return purchaseCost;
    }

    /**
     * Sets the value of the purchaseCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPurchaseCost(BigDecimal value) {
        this.purchaseCost = value;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendor(String value) {
        this.vendor = value;
    }

    /**
     * Gets the value of the assetAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getAssetAccountRef() {
        return assetAccountRef;
    }

    /**
     * Sets the value of the assetAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setAssetAccountRef(ReferenceType value) {
        this.assetAccountRef = value;
    }

    /**
     * Gets the value of the salesDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesDesc() {
        return salesDesc;
    }

    /**
     * Sets the value of the salesDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesDesc(String value) {
        this.salesDesc = value;
    }

    /**
     * Gets the value of the salesDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getSalesDate() {
        return salesDate;
    }

    /**
     * Sets the value of the salesDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesDate(Date value) {
        this.salesDate = value;
    }

    /**
     * Gets the value of the salesPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSalesPrice() {
        return salesPrice;
    }

    /**
     * Sets the value of the salesPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSalesPrice(BigDecimal value) {
        this.salesPrice = value;
    }

    /**
     * Gets the value of the salesExpense property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSalesExpense() {
        return salesExpense;
    }

    /**
     * Sets the value of the salesExpense property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSalesExpense(BigDecimal value) {
        this.salesExpense = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the poNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPONumber() {
        return poNumber;
    }

    /**
     * Sets the value of the poNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPONumber(String value) {
        this.poNumber = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the warrantyExpDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getWarrantyExpDate() {
        return warrantyExpDate;
    }

    /**
     * Sets the value of the warrantyExpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarrantyExpDate(Date value) {
        this.warrantyExpDate = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the assetNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAssetNum() {
        return assetNum;
    }

    /**
     * Sets the value of the assetNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAssetNum(Integer value) {
        this.assetNum = value;
    }

    /**
     * Gets the value of the costBasis property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCostBasis() {
        return costBasis;
    }

    /**
     * Sets the value of the costBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCostBasis(BigDecimal value) {
        this.costBasis = value;
    }

    /**
     * Gets the value of the depreciation property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDepreciation() {
        return depreciation;
    }

    /**
     * Sets the value of the depreciation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDepreciation(BigDecimal value) {
        this.depreciation = value;
    }

    /**
     * Gets the value of the bookValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBookValue() {
        return bookValue;
    }

    /**
     * Sets the value of the bookValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBookValue(BigDecimal value) {
        this.bookValue = value;
    }

    /**
     * Gets the value of the fixedAssetEx property.
     * 
     * @return
     *     possible object is
     *     {@link IntuitAnyType }
     *     
     */
    public IntuitAnyType getFixedAssetEx() {
        return fixedAssetEx;
    }

    /**
     * Sets the value of the fixedAssetEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntuitAnyType }
     *     
     */
    public void setFixedAssetEx(IntuitAnyType value) {
        this.fixedAssetEx = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FixedAsset)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final FixedAsset that = ((FixedAsset) object);
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            Boolean lhsActive;
            lhsActive = this.isActive();
            Boolean rhsActive;
            rhsActive = that.isActive();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "active", lhsActive), LocatorUtils.property(thatLocator, "active", rhsActive), lhsActive, rhsActive)) {
                return false;
            }
        }
        {
            AcquiredAsEnum lhsAcquiredAs;
            lhsAcquiredAs = this.getAcquiredAs();
            AcquiredAsEnum rhsAcquiredAs;
            rhsAcquiredAs = that.getAcquiredAs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "acquiredAs", lhsAcquiredAs), LocatorUtils.property(thatLocator, "acquiredAs", rhsAcquiredAs), lhsAcquiredAs, rhsAcquiredAs)) {
                return false;
            }
        }
        {
            String lhsPurchaseDesc;
            lhsPurchaseDesc = this.getPurchaseDesc();
            String rhsPurchaseDesc;
            rhsPurchaseDesc = that.getPurchaseDesc();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "purchaseDesc", lhsPurchaseDesc), LocatorUtils.property(thatLocator, "purchaseDesc", rhsPurchaseDesc), lhsPurchaseDesc, rhsPurchaseDesc)) {
                return false;
            }
        }
        {
            Date lhsPurchaseDate;
            lhsPurchaseDate = this.getPurchaseDate();
            Date rhsPurchaseDate;
            rhsPurchaseDate = that.getPurchaseDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "purchaseDate", lhsPurchaseDate), LocatorUtils.property(thatLocator, "purchaseDate", rhsPurchaseDate), lhsPurchaseDate, rhsPurchaseDate)) {
                return false;
            }
        }
        {
            BigDecimal lhsPurchaseCost;
            lhsPurchaseCost = this.getPurchaseCost();
            BigDecimal rhsPurchaseCost;
            rhsPurchaseCost = that.getPurchaseCost();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "purchaseCost", lhsPurchaseCost), LocatorUtils.property(thatLocator, "purchaseCost", rhsPurchaseCost), lhsPurchaseCost, rhsPurchaseCost)) {
                return false;
            }
        }
        {
            String lhsVendor;
            lhsVendor = this.getVendor();
            String rhsVendor;
            rhsVendor = that.getVendor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vendor", lhsVendor), LocatorUtils.property(thatLocator, "vendor", rhsVendor), lhsVendor, rhsVendor)) {
                return false;
            }
        }
        {
            ReferenceType lhsAssetAccountRef;
            lhsAssetAccountRef = this.getAssetAccountRef();
            ReferenceType rhsAssetAccountRef;
            rhsAssetAccountRef = that.getAssetAccountRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "assetAccountRef", lhsAssetAccountRef), LocatorUtils.property(thatLocator, "assetAccountRef", rhsAssetAccountRef), lhsAssetAccountRef, rhsAssetAccountRef)) {
                return false;
            }
        }
        {
            String lhsSalesDesc;
            lhsSalesDesc = this.getSalesDesc();
            String rhsSalesDesc;
            rhsSalesDesc = that.getSalesDesc();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "salesDesc", lhsSalesDesc), LocatorUtils.property(thatLocator, "salesDesc", rhsSalesDesc), lhsSalesDesc, rhsSalesDesc)) {
                return false;
            }
        }
        {
            Date lhsSalesDate;
            lhsSalesDate = this.getSalesDate();
            Date rhsSalesDate;
            rhsSalesDate = that.getSalesDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "salesDate", lhsSalesDate), LocatorUtils.property(thatLocator, "salesDate", rhsSalesDate), lhsSalesDate, rhsSalesDate)) {
                return false;
            }
        }
        {
            BigDecimal lhsSalesPrice;
            lhsSalesPrice = this.getSalesPrice();
            BigDecimal rhsSalesPrice;
            rhsSalesPrice = that.getSalesPrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "salesPrice", lhsSalesPrice), LocatorUtils.property(thatLocator, "salesPrice", rhsSalesPrice), lhsSalesPrice, rhsSalesPrice)) {
                return false;
            }
        }
        {
            BigDecimal lhsSalesExpense;
            lhsSalesExpense = this.getSalesExpense();
            BigDecimal rhsSalesExpense;
            rhsSalesExpense = that.getSalesExpense();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "salesExpense", lhsSalesExpense), LocatorUtils.property(thatLocator, "salesExpense", rhsSalesExpense), lhsSalesExpense, rhsSalesExpense)) {
                return false;
            }
        }
        {
            String lhsLocation;
            lhsLocation = this.getLocation();
            String rhsLocation;
            rhsLocation = that.getLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "location", lhsLocation), LocatorUtils.property(thatLocator, "location", rhsLocation), lhsLocation, rhsLocation)) {
                return false;
            }
        }
        {
            String lhsPONumber;
            lhsPONumber = this.getPONumber();
            String rhsPONumber;
            rhsPONumber = that.getPONumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "poNumber", lhsPONumber), LocatorUtils.property(thatLocator, "poNumber", rhsPONumber), lhsPONumber, rhsPONumber)) {
                return false;
            }
        }
        {
            String lhsSerialNumber;
            lhsSerialNumber = this.getSerialNumber();
            String rhsSerialNumber;
            rhsSerialNumber = that.getSerialNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serialNumber", lhsSerialNumber), LocatorUtils.property(thatLocator, "serialNumber", rhsSerialNumber), lhsSerialNumber, rhsSerialNumber)) {
                return false;
            }
        }
        {
            Date lhsWarrantyExpDate;
            lhsWarrantyExpDate = this.getWarrantyExpDate();
            Date rhsWarrantyExpDate;
            rhsWarrantyExpDate = that.getWarrantyExpDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "warrantyExpDate", lhsWarrantyExpDate), LocatorUtils.property(thatLocator, "warrantyExpDate", rhsWarrantyExpDate), lhsWarrantyExpDate, rhsWarrantyExpDate)) {
                return false;
            }
        }
        {
            String lhsDescription;
            lhsDescription = this.getDescription();
            String rhsDescription;
            rhsDescription = that.getDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription)) {
                return false;
            }
        }
        {
            String lhsNotes;
            lhsNotes = this.getNotes();
            String rhsNotes;
            rhsNotes = that.getNotes();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "notes", lhsNotes), LocatorUtils.property(thatLocator, "notes", rhsNotes), lhsNotes, rhsNotes)) {
                return false;
            }
        }
        {
            Integer lhsAssetNum;
            lhsAssetNum = this.getAssetNum();
            Integer rhsAssetNum;
            rhsAssetNum = that.getAssetNum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "assetNum", lhsAssetNum), LocatorUtils.property(thatLocator, "assetNum", rhsAssetNum), lhsAssetNum, rhsAssetNum)) {
                return false;
            }
        }
        {
            BigDecimal lhsCostBasis;
            lhsCostBasis = this.getCostBasis();
            BigDecimal rhsCostBasis;
            rhsCostBasis = that.getCostBasis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "costBasis", lhsCostBasis), LocatorUtils.property(thatLocator, "costBasis", rhsCostBasis), lhsCostBasis, rhsCostBasis)) {
                return false;
            }
        }
        {
            BigDecimal lhsDepreciation;
            lhsDepreciation = this.getDepreciation();
            BigDecimal rhsDepreciation;
            rhsDepreciation = that.getDepreciation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "depreciation", lhsDepreciation), LocatorUtils.property(thatLocator, "depreciation", rhsDepreciation), lhsDepreciation, rhsDepreciation)) {
                return false;
            }
        }
        {
            BigDecimal lhsBookValue;
            lhsBookValue = this.getBookValue();
            BigDecimal rhsBookValue;
            rhsBookValue = that.getBookValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bookValue", lhsBookValue), LocatorUtils.property(thatLocator, "bookValue", rhsBookValue), lhsBookValue, rhsBookValue)) {
                return false;
            }
        }
        {
            IntuitAnyType lhsFixedAssetEx;
            lhsFixedAssetEx = this.getFixedAssetEx();
            IntuitAnyType rhsFixedAssetEx;
            rhsFixedAssetEx = that.getFixedAssetEx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fixedAssetEx", lhsFixedAssetEx), LocatorUtils.property(thatLocator, "fixedAssetEx", rhsFixedAssetEx), lhsFixedAssetEx, rhsFixedAssetEx)) {
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
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            Boolean theActive;
            theActive = this.isActive();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "active", theActive), currentHashCode, theActive);
        }
        {
            AcquiredAsEnum theAcquiredAs;
            theAcquiredAs = this.getAcquiredAs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "acquiredAs", theAcquiredAs), currentHashCode, theAcquiredAs);
        }
        {
            String thePurchaseDesc;
            thePurchaseDesc = this.getPurchaseDesc();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "purchaseDesc", thePurchaseDesc), currentHashCode, thePurchaseDesc);
        }
        {
            Date thePurchaseDate;
            thePurchaseDate = this.getPurchaseDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "purchaseDate", thePurchaseDate), currentHashCode, thePurchaseDate);
        }
        {
            BigDecimal thePurchaseCost;
            thePurchaseCost = this.getPurchaseCost();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "purchaseCost", thePurchaseCost), currentHashCode, thePurchaseCost);
        }
        {
            String theVendor;
            theVendor = this.getVendor();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vendor", theVendor), currentHashCode, theVendor);
        }
        {
            ReferenceType theAssetAccountRef;
            theAssetAccountRef = this.getAssetAccountRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "assetAccountRef", theAssetAccountRef), currentHashCode, theAssetAccountRef);
        }
        {
            String theSalesDesc;
            theSalesDesc = this.getSalesDesc();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "salesDesc", theSalesDesc), currentHashCode, theSalesDesc);
        }
        {
            Date theSalesDate;
            theSalesDate = this.getSalesDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "salesDate", theSalesDate), currentHashCode, theSalesDate);
        }
        {
            BigDecimal theSalesPrice;
            theSalesPrice = this.getSalesPrice();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "salesPrice", theSalesPrice), currentHashCode, theSalesPrice);
        }
        {
            BigDecimal theSalesExpense;
            theSalesExpense = this.getSalesExpense();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "salesExpense", theSalesExpense), currentHashCode, theSalesExpense);
        }
        {
            String theLocation;
            theLocation = this.getLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "location", theLocation), currentHashCode, theLocation);
        }
        {
            String thePONumber;
            thePONumber = this.getPONumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "poNumber", thePONumber), currentHashCode, thePONumber);
        }
        {
            String theSerialNumber;
            theSerialNumber = this.getSerialNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serialNumber", theSerialNumber), currentHashCode, theSerialNumber);
        }
        {
            Date theWarrantyExpDate;
            theWarrantyExpDate = this.getWarrantyExpDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "warrantyExpDate", theWarrantyExpDate), currentHashCode, theWarrantyExpDate);
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription);
        }
        {
            String theNotes;
            theNotes = this.getNotes();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "notes", theNotes), currentHashCode, theNotes);
        }
        {
            Integer theAssetNum;
            theAssetNum = this.getAssetNum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "assetNum", theAssetNum), currentHashCode, theAssetNum);
        }
        {
            BigDecimal theCostBasis;
            theCostBasis = this.getCostBasis();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "costBasis", theCostBasis), currentHashCode, theCostBasis);
        }
        {
            BigDecimal theDepreciation;
            theDepreciation = this.getDepreciation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "depreciation", theDepreciation), currentHashCode, theDepreciation);
        }
        {
            BigDecimal theBookValue;
            theBookValue = this.getBookValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bookValue", theBookValue), currentHashCode, theBookValue);
        }
        {
            IntuitAnyType theFixedAssetEx;
            theFixedAssetEx = this.getFixedAssetEx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fixedAssetEx", theFixedAssetEx), currentHashCode, theFixedAssetEx);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
