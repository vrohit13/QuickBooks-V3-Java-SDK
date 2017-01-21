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
 * <p>Java class for TransactionLocationTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionLocationTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WithinFrance"/>
 *     &lt;enumeration value="FranceOverseas"/>
 *     &lt;enumeration value="OutsideFranceWithEU"/>
 *     &lt;enumeration value="OutsideEU"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransactionLocationTypeEnum")
@XmlEnum
public enum TransactionLocationTypeEnum {

    @XmlEnumValue("WithinFrance")
    WITHIN_FRANCE("WithinFrance"),
    @XmlEnumValue("FranceOverseas")
    FRANCE_OVERSEAS("FranceOverseas"),
    @XmlEnumValue("OutsideFranceWithEU")
    OUTSIDE_FRANCE_WITH_EU("OutsideFranceWithEU"),
    @XmlEnumValue("OutsideEU")
    OUTSIDE_EU("OutsideEU");
    private final String value;

    TransactionLocationTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionLocationTypeEnum fromValue(String v) {
        for (TransactionLocationTypeEnum c: TransactionLocationTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
