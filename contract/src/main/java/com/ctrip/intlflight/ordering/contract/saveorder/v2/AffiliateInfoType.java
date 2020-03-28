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
 * 分销联盟有关信息
 */
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffiliateInfoType", namespace = "urn:com:ctrip:flight:intl:booking:order:contract:saveorder:v2", propOrder = {
    "allianceID",
    "sid",
    "ouID",
    "allianceOrderId"
})
@SuppressWarnings("all")
public class AffiliateInfoType implements Serializable {

    private static final long serialVersionUID = 1L;

    public AffiliateInfoType(
        int allianceID, 
        int sid, 
        String ouID, 
        String allianceOrderId) {
        this.allianceID = allianceID;
        this.sid = sid;
        this.ouID = ouID;
        this.allianceOrderId = allianceOrderId;
    }

    public AffiliateInfoType() {
    }

    @JsonProperty("AllianceID")
    @XmlElement(name = "AllianceID")
    private int allianceID;

    @JsonProperty("SID")
    @XmlElement(name = "SID")
    private int sid;

    @JsonProperty("OuID")
    @XmlElement(name = "OuID")
    private String ouID;

    @JsonProperty("AllianceOrderId")
    @XmlElement(name = "AllianceOrderId")
    private String allianceOrderId;

    /**
     * 联盟号
     */
    public int getAllianceID() {
        return this.allianceID;
    }

    public void setAllianceID(int allianceID) {
        this.allianceID = allianceID;
    }

    /**
     * 联盟使用站点号
     */
    public int getSid() {
        return this.sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    /**
     * 联盟下的子联盟号
     */
    public String getOuID() {
        return this.ouID;
    }

    public void setOuID(String ouID) {
        this.ouID = ouID;
    }

    /**
     * 分销商订单号
     */
    public String getAllianceOrderId() {
        return this.allianceOrderId;
    }

    public void setAllianceOrderId(String allianceOrderId) {
        this.allianceOrderId = allianceOrderId;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final AffiliateInfoType other = (AffiliateInfoType)obj;
        return
            Objects.equal(this.allianceID, other.allianceID) && 
            Objects.equal(this.sid, other.sid) && 
            Objects.equal(this.ouID, other.ouID) && 
            Objects.equal(this.allianceOrderId, other.allianceOrderId);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.allianceID);
        result = 31 * result + Objects.hashCode(this.sid);
        result = 31 * result + Objects.hashCode(this.ouID);
        result = 31 * result + Objects.hashCode(this.allianceOrderId);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("allianceID", allianceID)
            .add("sid", sid)
            .add("ouID", ouID)
            .add("allianceOrderId", allianceOrderId)
            .toString();
    }

}