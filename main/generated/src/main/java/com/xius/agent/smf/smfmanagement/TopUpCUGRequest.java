
package com.xius.agent.smf.smfmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TopUpCUGRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TopUpCUGRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="topUpCUGList" type="{http://smf.agent.xius.com/SMFManagement.xsd}TopUpCUGListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopUpCUGRequest", propOrder = {
    "topUpCUGList"
})
public class TopUpCUGRequest {

    @XmlElement(required = true)
    protected TopUpCUGListType topUpCUGList;

    /**
     * Gets the value of the topUpCUGList property.
     * 
     * @return
     *     possible object is
     *     {@link TopUpCUGListType }
     *     
     */
    public TopUpCUGListType getTopUpCUGList() {
        return topUpCUGList;
    }

    /**
     * Sets the value of the topUpCUGList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TopUpCUGListType }
     *     
     */
    public void setTopUpCUGList(TopUpCUGListType value) {
        this.topUpCUGList = value;
    }

}
