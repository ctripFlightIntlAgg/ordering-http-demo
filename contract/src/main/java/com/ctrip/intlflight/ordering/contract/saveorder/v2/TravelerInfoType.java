/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.intlflight.ordering.contract.saveorder.v2;

import com.ctrip.intlflight.ordering.contract.commontype.v1.FFPInfoType;
import com.ctrip.intlflight.ordering.contract.commontype.v1.GenderType;
import com.ctrip.intlflight.ordering.contract.commontype.v1.TravelerCategoryCodeType;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

/**
 * 乘客信息
 */
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelerInfoType", namespace = "urn:com:ctrip:flight:intl:booking:order:contract:saveorder:v2", propOrder = {
    "infoId",
    "gender",
    "idCardList",
    "travelerCategoryCode",
    "birthday",
    "nationality",
    "ffpNoList",
    "mobilephone",
    "saveCommonTraveler",
    "travelerMiscInfo",
    "countryCode",
    "email"
})
@SuppressWarnings("all")
public class TravelerInfoType implements Serializable {

    private static final long serialVersionUID = 1L;

    public TravelerInfoType(
        String infoId, 
        GenderType gender,
        List<IDCardExtType> idCardList,
        TravelerCategoryCodeType travelerCategoryCode,
        String birthday, 
        String nationality, 
        List<FFPInfoType> ffpNoList,
        String mobilephone, 
        boolean saveCommonTraveler, 
        TravelerMiscInfoType travelerMiscInfo,
        String countryCode, 
        String email) {
        this.infoId = infoId;
        this.gender = gender;
        this.idCardList = idCardList;
        this.travelerCategoryCode = travelerCategoryCode;
        this.birthday = birthday;
        this.nationality = nationality;
        this.ffpNoList = ffpNoList;
        this.mobilephone = mobilephone;
        this.saveCommonTraveler = saveCommonTraveler;
        this.travelerMiscInfo = travelerMiscInfo;
        this.countryCode = countryCode;
        this.email = email;
    }

    public TravelerInfoType() {
        this.gender = GenderType.values()[0];
        this.travelerCategoryCode = TravelerCategoryCodeType.values()[0];
    }

    @JsonProperty("InfoId")
    @XmlElement(name = "InfoId")
    private String infoId;

    @JsonProperty("Gender")
    @XmlElement(name = "Gender")
    private GenderType gender;

    @JsonProperty("IDCardList")
    @XmlElement(name = "IDCard")
    @XmlElementWrapper(name = "IDCardList")
    private List<IDCardExtType> idCardList;

    @JsonProperty("TravelerCategoryCode")
    @XmlElement(name = "TravelerCategoryCode")
    private TravelerCategoryCodeType travelerCategoryCode;

    @JsonProperty("Birthday")
    @XmlElement(name = "Birthday")
    private String birthday;

    @JsonProperty("Nationality")
    @XmlElement(name = "Nationality")
    private String nationality;

    @JsonProperty("FFPNoList")
    @XmlElement(name = "FFPNo", namespace = "urn:com:ctrip:flight:intl:booking:order:contract:commontype:v1")
    @XmlElementWrapper(name = "FFPNoList")
    private List<FFPInfoType> ffpNoList;

    @JsonProperty("Mobilephone")
    @XmlElement(name = "Mobilephone")
    private String mobilephone;

    @JsonProperty("SaveCommonTraveler")
    @XmlElement(name = "SaveCommonTraveler")
    private boolean saveCommonTraveler;

    @JsonProperty("TravelerMiscInfo")
    @XmlElement(name = "TravelerMiscInfo")
    private TravelerMiscInfoType travelerMiscInfo;

    @JsonProperty("CountryCode")
    @XmlElement(name = "CountryCode")
    private String countryCode;

    @JsonProperty("Email")
    @XmlElement(name = "Email")
    private String email;

    /**
     * *公共服务保存乘机人信息的主键[通过接口获取的常用乘机人信息中，包含InfoId]
     */
    public String getInfoId() {
        return this.infoId;
    }

    public void setInfoId(String infoId) {
        this.infoId = infoId;
    }

    /**
     * *性别
     */
    public GenderType getGender() {
        return this.gender;
    }

    public void setGender(GenderType gender) {
        this.gender = gender;
    }

    /**
     * 乘客证件信息列表
     */
    public List<IDCardExtType> getIdCardList() {
        return this.idCardList;
    }

    public void setIdCardList(List<IDCardExtType> idCardList) {
        this.idCardList = idCardList;
    }

    /**
     * 乘客类型：成人/儿童/婴儿
     */
    public TravelerCategoryCodeType getTravelerCategoryCode() {
        return this.travelerCategoryCode;
    }

    public void setTravelerCategoryCode(TravelerCategoryCodeType travelerCategoryCode) {
        this.travelerCategoryCode = travelerCategoryCode;
    }

    /**
     * *出生日期 yyyy-MM-dd
     */
    public String getBirthday() {
        return this.birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    /**
     * *国籍
     */
    public String getNationality() {
        return this.nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    /**
     * 常旅客信息列表
     */
    public List<FFPInfoType> getFfpNoList() {
        return this.ffpNoList;
    }

    public void setFfpNoList(List<FFPInfoType> ffpNoList) {
        this.ffpNoList = ffpNoList;
    }

    /**
     * 航班信息短信
     */
    public String getMobilephone() {
        return this.mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone;
    }

    /**
     * 是否保存为常用乘机人
     */
    public boolean getSaveCommonTraveler() {
        return this.saveCommonTraveler;
    }

    public void setSaveCommonTraveler(boolean saveCommonTraveler) {
        this.saveCommonTraveler = saveCommonTraveler;
    }

    /**
     * 乘机人综合信息
     */
    public TravelerMiscInfoType getTravelerMiscInfo() {
        return this.travelerMiscInfo;
    }

    public void setTravelerMiscInfo(TravelerMiscInfoType travelerMiscInfo) {
        this.travelerMiscInfo = travelerMiscInfo;
    }

    /**
     * 国家码(手机)
     */
    public String getCountryCode() {
        return this.countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * 乘机人邮箱
     */
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final TravelerInfoType other = (TravelerInfoType)obj;
        return
            Objects.equal(this.infoId, other.infoId) && 
            Objects.equal(this.gender, other.gender) && 
            Objects.equal(this.idCardList, other.idCardList) && 
            Objects.equal(this.travelerCategoryCode, other.travelerCategoryCode) && 
            Objects.equal(this.birthday, other.birthday) && 
            Objects.equal(this.nationality, other.nationality) && 
            Objects.equal(this.ffpNoList, other.ffpNoList) && 
            Objects.equal(this.mobilephone, other.mobilephone) && 
            Objects.equal(this.saveCommonTraveler, other.saveCommonTraveler) && 
            Objects.equal(this.travelerMiscInfo, other.travelerMiscInfo) && 
            Objects.equal(this.countryCode, other.countryCode) && 
            Objects.equal(this.email, other.email);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.infoId);
        result = 31 * result + Objects.hashCode(this.gender);
        result = 31 * result + Objects.hashCode(this.idCardList);
        result = 31 * result + Objects.hashCode(this.travelerCategoryCode);
        result = 31 * result + Objects.hashCode(this.birthday);
        result = 31 * result + Objects.hashCode(this.nationality);
        result = 31 * result + Objects.hashCode(this.ffpNoList);
        result = 31 * result + Objects.hashCode(this.mobilephone);
        result = 31 * result + Objects.hashCode(this.saveCommonTraveler);
        result = 31 * result + Objects.hashCode(this.travelerMiscInfo);
        result = 31 * result + Objects.hashCode(this.countryCode);
        result = 31 * result + Objects.hashCode(this.email);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("infoId", infoId)
            .add("gender", gender)
            .add("idCardList", idCardList)
            .add("travelerCategoryCode", travelerCategoryCode)
            .add("birthday", birthday)
            .add("nationality", nationality)
            .add("ffpNoList", ffpNoList)
            .add("mobilephone", mobilephone)
            .add("saveCommonTraveler", saveCommonTraveler)
            .add("travelerMiscInfo", travelerMiscInfo)
            .add("countryCode", countryCode)
            .add("email", email)
            .toString();
    }

}