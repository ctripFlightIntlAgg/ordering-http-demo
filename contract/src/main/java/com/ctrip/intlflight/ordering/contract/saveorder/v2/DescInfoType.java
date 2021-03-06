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
 * 备注信息
 */
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescInfoType", namespace = "urn:com:ctrip:flight:intl:booking:order:contract:saveorder:v2", propOrder = {
    "orderDesc",
    "processDesc",
    "changeReason"
})
@SuppressWarnings("all")
public class DescInfoType implements Serializable {

    private static final long serialVersionUID = 1L;

    public DescInfoType(
        String orderDesc, 
        String processDesc, 
        String changeReason) {
        this.orderDesc = orderDesc;
        this.processDesc = processDesc;
        this.changeReason = changeReason;
    }

    public DescInfoType() {
    }

    @JsonProperty("OrderDesc")
    @XmlElement(name = "OrderDesc")
    private String orderDesc;

    @JsonProperty("ProcessDesc")
    @XmlElement(name = "ProcessDesc")
    private String processDesc;

    @JsonProperty("ChangeReason")
    @XmlElement(name = "ChangeReason")
    private String changeReason;

    /**
     * 订单备注
     */
    public String getOrderDesc() {
        return this.orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }

    /**
     * 处理备注
     */
    public String getProcessDesc() {
        return this.processDesc;
    }

    public void setProcessDesc(String processDesc) {
        this.processDesc = processDesc;
    }

    /**
     * 修改原因
     */
    public String getChangeReason() {
        return this.changeReason;
    }

    public void setChangeReason(String changeReason) {
        this.changeReason = changeReason;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final DescInfoType other = (DescInfoType)obj;
        return
            Objects.equal(this.orderDesc, other.orderDesc) && 
            Objects.equal(this.processDesc, other.processDesc) && 
            Objects.equal(this.changeReason, other.changeReason);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.orderDesc);
        result = 31 * result + Objects.hashCode(this.processDesc);
        result = 31 * result + Objects.hashCode(this.changeReason);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("orderDesc", orderDesc)
            .add("processDesc", processDesc)
            .add("changeReason", changeReason)
            .toString();
    }

}