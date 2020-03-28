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
 * 
 *         发票信息
 *       
 */
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceType", namespace = "urn:com:ctrip:flight:intl:booking:order:contract:saveorder:v2", propOrder = {
    "payer",
    "remarks",
    "amount",
    "invoiceTitleType",
    "taxpayerNumber",
    "invoiceId",
    "isEInvoice"
})
@SuppressWarnings("all")
public class InvoiceType implements Serializable {

    private static final long serialVersionUID = 1L;

    public InvoiceType(
        String payer, 
        String remarks, 
        BigDecimal amount, 
        String invoiceTitleType, 
        String taxpayerNumber, 
        long invoiceId, 
        boolean isEInvoice) {
        this.payer = payer;
        this.remarks = remarks;
        this.amount = amount;
        this.invoiceTitleType = invoiceTitleType;
        this.taxpayerNumber = taxpayerNumber;
        this.invoiceId = invoiceId;
        this.isEInvoice = isEInvoice;
    }

    public InvoiceType() {
        this.amount = new BigDecimal(0);
    }

    @JsonProperty("Payer")
    @XmlElement(name = "Payer")
    private String payer;

    @JsonProperty("Remarks")
    @XmlElement(name = "Remarks")
    private String remarks;

    @JsonProperty("Amount")
    @XmlElement(name = "Amount")
    private BigDecimal amount;

    @JsonProperty("InvoiceTitleType")
    @XmlElement(name = "InvoiceTitleType")
    private String invoiceTitleType;

    @JsonProperty("TaxpayerNumber")
    @XmlElement(name = "TaxpayerNumber")
    private String taxpayerNumber;

    @JsonProperty("InvoiceId")
    @XmlElement(name = "InvoiceId")
    private long invoiceId;

    @JsonProperty("IsEInvoice")
    @XmlElement(name = "IsEInvoice")
    private boolean isEInvoice;

    /**
     * 发票抬头
     */
    public String getPayer() {
        return this.payer;
    }

    public void setPayer(String payer) {
        this.payer = payer;
    }

    /**
     * 发票备注
     */
    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * 发票金额
     */
    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 发票类型 P:个人 B:公司
     */
    public String getInvoiceTitleType() {
        return this.invoiceTitleType;
    }

    public void setInvoiceTitleType(String invoiceTitleType) {
        this.invoiceTitleType = invoiceTitleType;
    }

    /**
     * 纳税人识别号
     */
    public String getTaxpayerNumber() {
        return this.taxpayerNumber;
    }

    public void setTaxpayerNumber(String taxpayerNumber) {
        this.taxpayerNumber = taxpayerNumber;
    }

    /**
     * 常用发票ID号，值>0则更新常用发票信息，为0会新增到常用发票信息中
     */
    public long getInvoiceId() {
        return this.invoiceId;
    }

    public void setInvoiceId(long invoiceId) {
        this.invoiceId = invoiceId;
    }

    /**
     * 是否电子发票
     */
    public boolean getIsEInvoice() {
        return this.isEInvoice;
    }

    public void setIsEInvoice(boolean isEInvoice) {
        this.isEInvoice = isEInvoice;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final InvoiceType other = (InvoiceType)obj;
        return
            Objects.equal(this.payer, other.payer) && 
            Objects.equal(this.remarks, other.remarks) && 
            Objects.equal(this.amount, other.amount) && 
            Objects.equal(this.invoiceTitleType, other.invoiceTitleType) && 
            Objects.equal(this.taxpayerNumber, other.taxpayerNumber) && 
            Objects.equal(this.invoiceId, other.invoiceId) && 
            Objects.equal(this.isEInvoice, other.isEInvoice);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.payer);
        result = 31 * result + Objects.hashCode(this.remarks);
        result = 31 * result + Objects.hashCode(this.amount);
        result = 31 * result + Objects.hashCode(this.invoiceTitleType);
        result = 31 * result + Objects.hashCode(this.taxpayerNumber);
        result = 31 * result + Objects.hashCode(this.invoiceId);
        result = 31 * result + Objects.hashCode(this.isEInvoice);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("payer", payer)
            .add("remarks", remarks)
            .add("amount", amount)
            .add("invoiceTitleType", invoiceTitleType)
            .add("taxpayerNumber", taxpayerNumber)
            .add("invoiceId", invoiceId)
            .add("isEInvoice", isEInvoice)
            .toString();
    }

}