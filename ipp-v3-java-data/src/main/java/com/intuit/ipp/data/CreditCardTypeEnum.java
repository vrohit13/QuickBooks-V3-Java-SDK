//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.14 at 04:24:27 PM PST 
//


package com.intuit.ipp.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditCardTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreditCardTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AmEx"/>
 *     &lt;enumeration value="DebitCard"/>
 *     &lt;enumeration value="Discover"/>
 *     &lt;enumeration value="GiftCard"/>
 *     &lt;enumeration value="MasterCard"/>
 *     &lt;enumeration value="OtherCreditCard"/>
 *     &lt;enumeration value="Visa"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CreditCardTypeEnum")
@XmlEnum
public enum CreditCardTypeEnum {

    @XmlEnumValue("AmEx")
    AM_EX("AmEx"),
    @XmlEnumValue("DebitCard")
    DEBIT_CARD("DebitCard"),
    @XmlEnumValue("Discover")
    DISCOVER("Discover"),
    @XmlEnumValue("GiftCard")
    GIFT_CARD("GiftCard"),
    @XmlEnumValue("MasterCard")
    MASTER_CARD("MasterCard"),
    @XmlEnumValue("OtherCreditCard")
    OTHER_CREDIT_CARD("OtherCreditCard"),
    @XmlEnumValue("Visa")
    VISA("Visa");
    private final String value;

    CreditCardTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CreditCardTypeEnum fromValue(String v) {
        for (CreditCardTypeEnum c: CreditCardTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
