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
 * <p>Java class for CCPaymentStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CCPaymentStatusEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Completed"/>
 *     &lt;enumeration value="Voided"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CCPaymentStatusEnum")
@XmlEnum
public enum CCPaymentStatusEnum {

    @XmlEnumValue("Completed")
    COMPLETED("Completed"),
    @XmlEnumValue("Voided")
    VOIDED("Voided"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    CCPaymentStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CCPaymentStatusEnum fromValue(String v) {
        for (CCPaymentStatusEnum c: CCPaymentStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
