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
 * 签证产品信息类型
 */
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VisaProductInfoType", namespace = "urn:com:ctrip:flight:intl:booking:order:contract:saveorder:v2", propOrder = {
    "clientType",
    "contactEmail"
})
@SuppressWarnings("all")
public class VisaProductInfoType implements Serializable {

    private static final long serialVersionUID = 1L;

    public VisaProductInfoType(
        String clientType, 
        String contactEmail) {
        this.clientType = clientType;
        this.contactEmail = contactEmail;
    }

    public VisaProductInfoType() {
    }

    @JsonProperty("ClientType")
    @XmlElement(name = "ClientType")
    private String clientType;

    @JsonProperty("ContactEmail")
    @XmlElement(name = "ContactEmail")
    private String contactEmail;

    /**
     * 客户类型，传值请严格按照 ClientTypeEnum 枚举 Name 传值
     */
    public String getClientType() {
        return this.clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    /**
     * 联系邮箱，为空则默认使用 ContactInfo.ContactEmail 机票联系人邮箱
     */
    public String getContactEmail() {
        return this.contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final VisaProductInfoType other = (VisaProductInfoType)obj;
        return
            Objects.equal(this.clientType, other.clientType) && 
            Objects.equal(this.contactEmail, other.contactEmail);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.clientType);
        result = 31 * result + Objects.hashCode(this.contactEmail);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("clientType", clientType)
            .add("contactEmail", contactEmail)
            .toString();
    }

}