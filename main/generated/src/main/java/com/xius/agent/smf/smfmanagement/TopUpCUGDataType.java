
package com.xius.agent.smf.smfmanagement;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TopUpCUGDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TopUpCUGDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parentMSISDN" type="{http://smf.agent.xius.com/SMFManagement.xsd}MSISDNType"/>
 *         &lt;element name="topUpAmt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="transId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopUpCUGDataType", propOrder = {
    "parentMSISDN",
    "topUpAmt",
    "transId",
    "groupId"
})
public class TopUpCUGDataType {

    @XmlElement(required = true)
    protected String parentMSISDN;
    @XmlElement(required = true)
    protected BigDecimal topUpAmt;
    protected Long transId;
    protected Long groupId;

    /**
     * Gets the value of the parentMSISDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentMSISDN() {
        return parentMSISDN;
    }

    /**
     * Sets the value of the parentMSISDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentMSISDN(String value) {
        this.parentMSISDN = value;
    }

    /**
     * Gets the value of the topUpAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTopUpAmt() {
        return topUpAmt;
    }

    /**
     * Sets the value of the topUpAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTopUpAmt(BigDecimal value) {
        this.topUpAmt = value;
    }

    /**
     * Gets the value of the transId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransId() {
        return transId;
    }

    /**
     * Sets the value of the transId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransId(Long value) {
        this.transId = value;
    }

    /**
     * Gets the value of the groupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGroupId(Long value) {
        this.groupId = value;
    }

}
