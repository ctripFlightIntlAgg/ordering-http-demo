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
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

/**
 * *机票产品
 */
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightProductType", namespace = "urn:com:ctrip:flight:intl:booking:order:contract:saveorder:v2", propOrder = {
    "flightOrigDestList"
})
@SuppressWarnings("all")
public class FlightProductType implements Serializable {

    private static final long serialVersionUID = 1L;

    public FlightProductType(
        List<FlightOrigDestType> flightOrigDestList) {
        this.flightOrigDestList = flightOrigDestList;
    }

    public FlightProductType() {
    }

    @JsonProperty("FlightOrigDestList")
    @XmlElement(name = "FlightOrigDest")
    @XmlElementWrapper(name = "FlightOrigDestList")
    private List<FlightOrigDestType> flightOrigDestList;

    /**
     * *行程信息，跟查询的请求行程相同
     */
    public List<FlightOrigDestType> getFlightOrigDestList() {
        return this.flightOrigDestList;
    }

    public void setFlightOrigDestList(List<FlightOrigDestType> flightOrigDestList) {
        this.flightOrigDestList = flightOrigDestList;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final FlightProductType other = (FlightProductType)obj;
        return
            Objects.equal(this.flightOrigDestList, other.flightOrigDestList);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.flightOrigDestList);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("flightOrigDestList", flightOrigDestList)
            .toString();
    }

}