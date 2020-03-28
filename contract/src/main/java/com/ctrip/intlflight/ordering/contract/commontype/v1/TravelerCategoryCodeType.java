// Generated by eBay Common SDK Platform
package com.ctrip.intlflight.ordering.contract.commontype.v1;

import com.fasterxml.jackson.annotation.JsonValue;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnumValue;

/**
 * 乘客类型：成人/儿童/婴儿
 */
@XmlType(name = "TravelerCategoryCodeType")
@XmlEnum
@SuppressWarnings("all")
public enum TravelerCategoryCodeType {

    @XmlEnumValue("ADT")
    ADT(0, "ADT"),

    @XmlEnumValue("CHD")
    CHD(1, "CHD"),

    @XmlEnumValue("INF")
    INF(2, "INF");

    private final int intValue;
    private final String value;

    TravelerCategoryCodeType(int intValue, String value) {
        this.intValue = intValue;
        this.value = value;
    }

    public int getValue() {
        return intValue;
    }

    @JsonValue
    public String value() {
        return value;
    }

    public static TravelerCategoryCodeType fromValue(String v) {
        for (TravelerCategoryCodeType e: TravelerCategoryCodeType.values()) {
            if (e.value.equalsIgnoreCase(v)) {
                return e;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public static TravelerCategoryCodeType findByValue(int value) {
        switch (value) {
            case 0:
                return ADT;
            case 1:
                return CHD;
            case 2:
                return INF;
            default:
                return null;
        }
    }
}