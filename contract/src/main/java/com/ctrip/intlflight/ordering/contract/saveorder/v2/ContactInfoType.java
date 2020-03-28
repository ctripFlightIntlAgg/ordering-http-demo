/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.intlflight.ordering.contract.saveorder.v2;

import com.ctrip.intlflight.ordering.contract.commontype.v1.GenderType;
import com.ctrip.intlflight.ordering.contract.commontype.v1.IDCardInfoType;
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
 * 联系人信息
 */
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactInfoType", namespace = "urn:com:ctrip:flight:intl:booking:order:contract:saveorder:v2", propOrder = {
    "personName",
    "contactEmail",
    "mobilePhone",
    "foreignMobile",
    "idCard",
    "countryCodeForeign",
    "gender",
    "destinationAddressInfo"
})
@SuppressWarnings("all")
public class ContactInfoType implements Serializable {

    private static final long serialVersionUID = 1L;

    public ContactInfoType(
        String personName, 
        String contactEmail, 
        String mobilePhone, 
        String foreignMobile, 
        IDCardInfoType idCard,
        String countryCodeForeign, 
        GenderType gender,
        AddressInfoType destinationAddressInfo) {
        this.personName = personName;
        this.contactEmail = contactEmail;
        this.mobilePhone = mobilePhone;
        this.foreignMobile = foreignMobile;
        this.idCard = idCard;
        this.countryCodeForeign = countryCodeForeign;
        this.gender = gender;
        this.destinationAddressInfo = destinationAddressInfo;
    }

    public ContactInfoType() {
        this.gender = GenderType.values()[0];
    }

    @JsonProperty("PersonName")
    @XmlElement(name = "PersonName")
    private String personName;

    @JsonProperty("ContactEmail")
    @XmlElement(name = "ContactEmail")
    private String contactEmail;

    @JsonProperty("MobilePhone")
    @XmlElement(name = "MobilePhone")
    private String mobilePhone;

    @JsonProperty("ForeignMobile")
    @XmlElement(name = "ForeignMobile")
    private String foreignMobile;

    @JsonProperty("IDCard")
    @XmlElement(name = "IDCard")
    private IDCardInfoType idCard;

    @JsonProperty("CountryCodeForeign")
    @XmlElement(name = "CountryCodeForeign")
    private String countryCodeForeign;

    @JsonProperty("Gender")
    @XmlElement(name = "Gender")
    private GenderType gender;

    @JsonProperty("DestinationAddressInfo")
    @XmlElement(name = "DestinationAddressInfo")
    private AddressInfoType destinationAddressInfo;

    /**
     * *联系人全名
     */
    public String getPersonName() {
        return this.personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    /**
     * Email
     */
    public String getContactEmail() {
        return this.contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    /**
     * Mobile
     */
    public String getMobilePhone() {
        return this.mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    /**
     * 国外手机
     */
    public String getForeignMobile() {
        return this.foreignMobile;
    }

    public void setForeignMobile(String foreignMobile) {
        this.foreignMobile = foreignMobile;
    }

    /**
     * 证件信息
     */
    public IDCardInfoType getIdCard() {
        return this.idCard;
    }

    public void setIdCard(IDCardInfoType idCard) {
        this.idCard = idCard;
    }

    /**
     * 国外国家码(手机)
     */
    public String getCountryCodeForeign() {
        return this.countryCodeForeign;
    }

    public void setCountryCodeForeign(String countryCodeForeign) {
        this.countryCodeForeign = countryCodeForeign;
    }

    /**
     * 性别
     */
    public GenderType getGender() {
        return this.gender;
    }

    public void setGender(GenderType gender) {
        this.gender = gender;
    }

    /**
     * 目的地 地址信息
     */
    public AddressInfoType getDestinationAddressInfo() {
        return this.destinationAddressInfo;
    }

    public void setDestinationAddressInfo(AddressInfoType destinationAddressInfo) {
        this.destinationAddressInfo = destinationAddressInfo;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final ContactInfoType other = (ContactInfoType)obj;
        return
            Objects.equal(this.personName, other.personName) && 
            Objects.equal(this.contactEmail, other.contactEmail) && 
            Objects.equal(this.mobilePhone, other.mobilePhone) && 
            Objects.equal(this.foreignMobile, other.foreignMobile) && 
            Objects.equal(this.idCard, other.idCard) && 
            Objects.equal(this.countryCodeForeign, other.countryCodeForeign) && 
            Objects.equal(this.gender, other.gender) && 
            Objects.equal(this.destinationAddressInfo, other.destinationAddressInfo);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.personName);
        result = 31 * result + Objects.hashCode(this.contactEmail);
        result = 31 * result + Objects.hashCode(this.mobilePhone);
        result = 31 * result + Objects.hashCode(this.foreignMobile);
        result = 31 * result + Objects.hashCode(this.idCard);
        result = 31 * result + Objects.hashCode(this.countryCodeForeign);
        result = 31 * result + Objects.hashCode(this.gender);
        result = 31 * result + Objects.hashCode(this.destinationAddressInfo);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("personName", personName)
            .add("contactEmail", contactEmail)
            .add("mobilePhone", mobilePhone)
            .add("foreignMobile", foreignMobile)
            .add("idCard", idCard)
            .add("countryCodeForeign", countryCodeForeign)
            .add("gender", gender)
            .add("destinationAddressInfo", destinationAddressInfo)
            .toString();
    }

}