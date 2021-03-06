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
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 风险控制信息
 */
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckRiskInfoType", namespace = "urn:com:ctrip:flight:intl:booking:order:contract:saveorder:v2", propOrder = {
    "clientID",
    "latitude",
    "longitude",
    "clientVersion",
    "riskResult",
    "rmsToken",
    "vid"
})
@SuppressWarnings("all")
public class CheckRiskInfoType implements Serializable {

    private static final long serialVersionUID = 1L;

    public CheckRiskInfoType(
        String clientID, 
        BigDecimal latitude, 
        BigDecimal longitude, 
        String clientVersion, 
        String riskResult, 
        String rmsToken, 
        String vid) {
        this.clientID = clientID;
        this.latitude = latitude;
        this.longitude = longitude;
        this.clientVersion = clientVersion;
        this.riskResult = riskResult;
        this.rmsToken = rmsToken;
        this.vid = vid;
    }

    public CheckRiskInfoType() {
        this.latitude = new BigDecimal(0);
        this.longitude = new BigDecimal(0);
    }

    @JsonProperty("ClientID")
    @XmlElement(name = "ClientID")
    private String clientID;

    @JsonProperty("Latitude")
    @XmlElement(name = "Latitude")
    private BigDecimal latitude;

    @JsonProperty("Longitude")
    @XmlElement(name = "Longitude")
    private BigDecimal longitude;

    @JsonProperty("ClientVersion")
    @XmlElement(name = "ClientVersion")
    private String clientVersion;

    @JsonProperty("RiskResult")
    @XmlElement(name = "RiskResult")
    private String riskResult;

    @JsonProperty("RmsToken")
    @XmlElement(name = "RmsToken")
    private String rmsToken;

    @JsonProperty("vid")
    @XmlElement(name = "vid")
    private String vid;

    /**
     * 设备号
     */
    public String getClientID() {
        return this.clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    /**
     * 经度
     */
    public BigDecimal getLatitude() {
        return this.latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    /**
     * 纬度
     */
    public BigDecimal getLongitude() {
        return this.longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    /**
     * 版本号
     */
    public String getClientVersion() {
        return this.clientVersion;
    }

    public void setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
    }

    /**
     * 前端验证风控结果
     */
    public String getRiskResult() {
        return this.riskResult;
    }

    public void setRiskResult(String riskResult) {
        this.riskResult = riskResult;
    }

    /**
     * RmsToken参数传给风控
     */
    public String getRmsToken() {
        return this.rmsToken;
    }

    public void setRmsToken(String rmsToken) {
        this.rmsToken = rmsToken;
    }

    /**
     * 用户浏览器唯一ID
     */
    public String getVid() {
        return this.vid;
    }

    public void setVid(String vid) {
        this.vid = vid;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final CheckRiskInfoType other = (CheckRiskInfoType)obj;
        return
            Objects.equal(this.clientID, other.clientID) && 
            Objects.equal(this.latitude, other.latitude) && 
            Objects.equal(this.longitude, other.longitude) && 
            Objects.equal(this.clientVersion, other.clientVersion) && 
            Objects.equal(this.riskResult, other.riskResult) && 
            Objects.equal(this.rmsToken, other.rmsToken) && 
            Objects.equal(this.vid, other.vid);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.clientID);
        result = 31 * result + Objects.hashCode(this.latitude);
        result = 31 * result + Objects.hashCode(this.longitude);
        result = 31 * result + Objects.hashCode(this.clientVersion);
        result = 31 * result + Objects.hashCode(this.riskResult);
        result = 31 * result + Objects.hashCode(this.rmsToken);
        result = 31 * result + Objects.hashCode(this.vid);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("clientID", clientID)
            .add("latitude", latitude)
            .add("longitude", longitude)
            .add("clientVersion", clientVersion)
            .add("riskResult", riskResult)
            .add("rmsToken", rmsToken)
            .add("vid", vid)
            .toString();
    }

}