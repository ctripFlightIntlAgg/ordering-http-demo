/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package contract.saveorder.v2;

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
 * 每一个订单订位记录
 */
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PNRRecordInfoType", namespace = "urn:com:ctrip:flight:intl:booking:order:contract:saveorder:v2", propOrder = {
    "officeNo",
    "recordNo",
    "extOrderID"
})
@SuppressWarnings("all")
public class PNRRecordInfoType implements Serializable {

    private static final long serialVersionUID = 1L;

    public PNRRecordInfoType(
        String officeNo, 
        String recordNo, 
        String extOrderID) {
        this.officeNo = officeNo;
        this.recordNo = recordNo;
        this.extOrderID = extOrderID;
    }

    public PNRRecordInfoType() {
    }

    @JsonProperty("OfficeNo")
    @XmlElement(name = "OfficeNo")
    private String officeNo;

    @JsonProperty("RecordNo")
    @XmlElement(name = "RecordNo")
    private String recordNo;

    @JsonProperty("ExtOrderID")
    @XmlElement(name = "ExtOrderID")
    private String extOrderID;

    /**
     * 订位OfficeNo
     */
    public String getOfficeNo() {
        return this.officeNo;
    }

    public void setOfficeNo(String officeNo) {
        this.officeNo = officeNo;
    }

    /**
     * 订位RecordNo
     */
    public String getRecordNo() {
        return this.recordNo;
    }

    public void setRecordNo(String recordNo) {
        this.recordNo = recordNo;
    }

    /**
     * 外部订单号
     */
    public String getExtOrderID() {
        return this.extOrderID;
    }

    public void setExtOrderID(String extOrderID) {
        this.extOrderID = extOrderID;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final PNRRecordInfoType other = (PNRRecordInfoType)obj;
        return
            Objects.equal(this.officeNo, other.officeNo) && 
            Objects.equal(this.recordNo, other.recordNo) && 
            Objects.equal(this.extOrderID, other.extOrderID);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.officeNo);
        result = 31 * result + Objects.hashCode(this.recordNo);
        result = 31 * result + Objects.hashCode(this.extOrderID);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("officeNo", officeNo)
            .add("recordNo", recordNo)
            .add("extOrderID", extOrderID)
            .toString();
    }

}