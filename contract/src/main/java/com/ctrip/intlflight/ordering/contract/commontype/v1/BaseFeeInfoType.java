/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.intlflight.ordering.contract.commontype.v1;

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
 * 退改签服务费
 */
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseFeeInfoType", namespace = "urn:com:ctrip:flight:intl:booking:order:contract:commontype:v1", propOrder = {
    "revalidationFeeDetail",
    "exchangeFeeDetail",
    "refundFeeDetail",
    "strictRevReiFeeDetail",
    "currencyInfo",
    "taxRefundFeeDetail"
})
@SuppressWarnings("all")
public class BaseFeeInfoType implements Serializable {

    private static final long serialVersionUID = 1L;

    public BaseFeeInfoType(
        ExtraFeeDetail revalidationFeeDetail,
        ExtraFeeDetail exchangeFeeDetail,
        ExtraFeeDetail refundFeeDetail,
        ExtraFeeDetail strictRevReiFeeDetail,
        CurrencyInfoType currencyInfo,
        ExtraFeeDetail taxRefundFeeDetail) {
        this.revalidationFeeDetail = revalidationFeeDetail;
        this.exchangeFeeDetail = exchangeFeeDetail;
        this.refundFeeDetail = refundFeeDetail;
        this.strictRevReiFeeDetail = strictRevReiFeeDetail;
        this.currencyInfo = currencyInfo;
        this.taxRefundFeeDetail = taxRefundFeeDetail;
    }

    public BaseFeeInfoType() {
    }

    @JsonProperty("RevalidationFeeDetail")
    @XmlElement(name = "RevalidationFeeDetail")
    private ExtraFeeDetail revalidationFeeDetail;

    @JsonProperty("ExchangeFeeDetail")
    @XmlElement(name = "ExchangeFeeDetail")
    private ExtraFeeDetail exchangeFeeDetail;

    @JsonProperty("RefundFeeDetail")
    @XmlElement(name = "RefundFeeDetail")
    private ExtraFeeDetail refundFeeDetail;

    @JsonProperty("StrictRevReiFeeDetail")
    @XmlElement(name = "StrictRevReiFeeDetail")
    private ExtraFeeDetail strictRevReiFeeDetail;

    @JsonProperty("CurrencyInfo")
    @XmlElement(name = "CurrencyInfo")
    private CurrencyInfoType currencyInfo;

    @JsonProperty("TaxRefundFeeDetail")
    @XmlElement(name = "TaxRefundFeeDetail")
    private ExtraFeeDetail taxRefundFeeDetail;

    /**
     * 改期服务费详情
     */
    public ExtraFeeDetail getRevalidationFeeDetail() {
        return this.revalidationFeeDetail;
    }

    public void setRevalidationFeeDetail(ExtraFeeDetail revalidationFeeDetail) {
        this.revalidationFeeDetail = revalidationFeeDetail;
    }

    /**
     * 换开服务费详情
     */
    public ExtraFeeDetail getExchangeFeeDetail() {
        return this.exchangeFeeDetail;
    }

    public void setExchangeFeeDetail(ExtraFeeDetail exchangeFeeDetail) {
        this.exchangeFeeDetail = exchangeFeeDetail;
    }

    /**
     * 退票服务费详情
     */
    public ExtraFeeDetail getRefundFeeDetail() {
        return this.refundFeeDetail;
    }

    public void setRefundFeeDetail(ExtraFeeDetail refundFeeDetail) {
        this.refundFeeDetail = refundFeeDetail;
    }

    /**
     * 与改期和换开取严结点StrictRevReiFareInfo对应的服务费详情
     */
    public ExtraFeeDetail getStrictRevReiFeeDetail() {
        return this.strictRevReiFeeDetail;
    }

    public void setStrictRevReiFeeDetail(ExtraFeeDetail strictRevReiFeeDetail) {
        this.strictRevReiFeeDetail = strictRevReiFeeDetail;
    }

    /**
     * 录入币种信息
     */
    public CurrencyInfoType getCurrencyInfo() {
        return this.currencyInfo;
    }

    public void setCurrencyInfo(CurrencyInfoType currencyInfo) {
        this.currencyInfo = currencyInfo;
    }

    /**
     * 仅退税手续费
     */
    public ExtraFeeDetail getTaxRefundFeeDetail() {
        return this.taxRefundFeeDetail;
    }

    public void setTaxRefundFeeDetail(ExtraFeeDetail taxRefundFeeDetail) {
        this.taxRefundFeeDetail = taxRefundFeeDetail;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final BaseFeeInfoType other = (BaseFeeInfoType)obj;
        return
            Objects.equal(this.revalidationFeeDetail, other.revalidationFeeDetail) && 
            Objects.equal(this.exchangeFeeDetail, other.exchangeFeeDetail) && 
            Objects.equal(this.refundFeeDetail, other.refundFeeDetail) && 
            Objects.equal(this.strictRevReiFeeDetail, other.strictRevReiFeeDetail) && 
            Objects.equal(this.currencyInfo, other.currencyInfo) && 
            Objects.equal(this.taxRefundFeeDetail, other.taxRefundFeeDetail);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.revalidationFeeDetail);
        result = 31 * result + Objects.hashCode(this.exchangeFeeDetail);
        result = 31 * result + Objects.hashCode(this.refundFeeDetail);
        result = 31 * result + Objects.hashCode(this.strictRevReiFeeDetail);
        result = 31 * result + Objects.hashCode(this.currencyInfo);
        result = 31 * result + Objects.hashCode(this.taxRefundFeeDetail);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("revalidationFeeDetail", revalidationFeeDetail)
            .add("exchangeFeeDetail", exchangeFeeDetail)
            .add("refundFeeDetail", refundFeeDetail)
            .add("strictRevReiFeeDetail", strictRevReiFeeDetail)
            .add("currencyInfo", currencyInfo)
            .add("taxRefundFeeDetail", taxRefundFeeDetail)
            .toString();
    }

}