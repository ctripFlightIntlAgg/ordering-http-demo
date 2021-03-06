/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.intlflight.ordering.contract.saveorder.v2;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 *         乘机人综合信息类型
 *       
 */
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelerMiscInfoType", namespace = "urn:com:ctrip:flight:intl:booking:order:contract:saveorder:v2", propOrder = {
    "isVirtualCard",
    "seat",
    "meals",
    "wheelChair",
    "cradle"
})
@SuppressWarnings("all")
public class TravelerMiscInfoType implements Serializable {

    private static final long serialVersionUID = 1L;

    public TravelerMiscInfoType(
        boolean isVirtualCard, 
        String seat, 
        String meals, 
        String wheelChair, 
        String cradle) {
        this.isVirtualCard = isVirtualCard;
        this.seat = seat;
        this.meals = meals;
        this.wheelChair = wheelChair;
        this.cradle = cradle;
    }

    public TravelerMiscInfoType() {
    }

    @JsonProperty("IsVirtualCard")
    @XmlElement(name = "IsVirtualCard")
    private boolean isVirtualCard;

    @JsonProperty("Seat")
    @XmlElement(name = "Seat")
    private String seat;

    @JsonProperty("Meals")
    @XmlElement(name = "Meals")
    private String meals;

    @JsonProperty("WheelChair")
    @XmlElement(name = "WheelChair")
    private String wheelChair;

    @JsonProperty("Cradle")
    @XmlElement(name = "Cradle")
    private String cradle;

    /**
     * 是否虚拟卡
     */
    public boolean getIsVirtualCard() {
        return this.isVirtualCard;
    }

    public void setIsVirtualCard(boolean isVirtualCard) {
        this.isVirtualCard = isVirtualCard;
    }

    /**
     * 座位
     */
    public String getSeat() {
        return this.seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    /**
     * 餐食
     */
    public String getMeals() {
        return this.meals;
    }

    public void setMeals(String meals) {
        this.meals = meals;
    }

    /**
     * 轮椅
     */
    public String getWheelChair() {
        return this.wheelChair;
    }

    public void setWheelChair(String wheelChair) {
        this.wheelChair = wheelChair;
    }

    /**
     * 摇篮
     */
    public String getCradle() {
        return this.cradle;
    }

    public void setCradle(String cradle) {
        this.cradle = cradle;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final TravelerMiscInfoType other = (TravelerMiscInfoType)obj;
        return
            Objects.equal(this.isVirtualCard, other.isVirtualCard) && 
            Objects.equal(this.seat, other.seat) && 
            Objects.equal(this.meals, other.meals) && 
            Objects.equal(this.wheelChair, other.wheelChair) && 
            Objects.equal(this.cradle, other.cradle);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.isVirtualCard);
        result = 31 * result + Objects.hashCode(this.seat);
        result = 31 * result + Objects.hashCode(this.meals);
        result = 31 * result + Objects.hashCode(this.wheelChair);
        result = 31 * result + Objects.hashCode(this.cradle);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("isVirtualCard", isVirtualCard)
            .add("seat", seat)
            .add("meals", meals)
            .add("wheelChair", wheelChair)
            .add("cradle", cradle)
            .toString();
    }

}