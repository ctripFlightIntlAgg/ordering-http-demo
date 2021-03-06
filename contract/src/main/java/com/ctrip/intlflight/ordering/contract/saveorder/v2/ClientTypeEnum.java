// Generated by eBay Common SDK Platform
package com.ctrip.intlflight.ordering.contract.saveorder.v2;

import com.fasterxml.jackson.annotation.JsonValue;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnumValue;

/**
 * 签证客户类型
 */
@XmlType(name = "ClientTypeEnum")
@XmlEnum
@SuppressWarnings("all")
public enum ClientTypeEnum {

    /**
     * 未知
     */
    @XmlEnumValue("UNKNOWN")
    UNKNOWN(0, "UNKNOWN"),

    /**
     * 在职
     */
    @XmlEnumValue("ON_THE_JOB")
    ON_THE_JOB(1, "ON_THE_JOB"),

    /**
     * 自由职业
     */
    @XmlEnumValue("FREELANCE")
    FREELANCE(2, "FREELANCE"),

    /**
     * 在校学生
     */
    @XmlEnumValue("STUDENT")
    STUDENT(3, "STUDENT"),

    /**
     * 退休
     */
    @XmlEnumValue("RETIREE")
    RETIREE(4, "RETIREE"),

    /**
     * 学龄前儿童
     */
    @XmlEnumValue("PRESCHOOLERS")
    PRESCHOOLERS(5, "PRESCHOOLERS"),

    /**
     * 18周岁以下
     */
    @XmlEnumValue("UNDER_18_YEARS_OLD")
    UNDER_18_YEARS_OLD(6, "UNDER_18_YEARS_OLD"),

    /**
     * 18周岁（含）至20周岁
     */
    @XmlEnumValue("BETWEEN_18_AND_20_YEARS_OLD")
    BETWEEN_18_AND_20_YEARS_OLD(7, "BETWEEN_18_AND_20_YEARS_OLD"),

    /**
     * 20周岁（含）及以上
     */
    @XmlEnumValue("INCLUSIVE_AND_ABOVE_20_YEARS_OLD")
    INCLUSIVE_AND_ABOVE_20_YEARS_OLD(8, "INCLUSIVE_AND_ABOVE_20_YEARS_OLD");

    private final int intValue;
    private final String value;

    ClientTypeEnum(int intValue, String value) {
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

    public static ClientTypeEnum fromValue(String v) {
        for (ClientTypeEnum e: ClientTypeEnum.values()) {
            if (e.value.equalsIgnoreCase(v)) {
                return e;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public static ClientTypeEnum findByValue(int value) {
        switch (value) {
            case 0:
                return UNKNOWN;
            case 1:
                return ON_THE_JOB;
            case 2:
                return FREELANCE;
            case 3:
                return STUDENT;
            case 4:
                return RETIREE;
            case 5:
                return PRESCHOOLERS;
            case 6:
                return UNDER_18_YEARS_OLD;
            case 7:
                return BETWEEN_18_AND_20_YEARS_OLD;
            case 8:
                return INCLUSIVE_AND_ABOVE_20_YEARS_OLD;
            default:
                return null;
        }
    }
}