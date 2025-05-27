
package com.xius.agent.smf.smfmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FirstLUUpdateRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FirstLUUpdateRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currentStateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SIM" type="{http://smf.agent.xius.com/SMFManagement.xsd}SIMType" minOccurs="0"/>
 *         &lt;element name="oldMSISDN" type="{http://smf.agent.xius.com/SMFManagement.xsd}MSISDNType" minOccurs="0"/>
 *         &lt;element name="newMSISDN" type="{http://smf.agent.xius.com/SMFManagement.xsd}MSISDNType" minOccurs="0"/>
 *         &lt;element name="BAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="linkTransId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extErrorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FirstLUUpdateRequest", propOrder = {
    "transactionId",
    "currentStateId",
    "sim",
    "oldMSISDN",
    "newMSISDN",
    "ban",
    "linkTransId",
    "status",
    "remarks",
    "extErrorCode"
})
public class FirstLUUpdateRequest {

    protected String transactionId;
    protected String currentStateId;
    @XmlElement(name = "SIM")
    protected String sim;
    protected String oldMSISDN;
    protected String newMSISDN;
    @XmlElement(name = "BAN")
    protected String ban;
    protected String linkTransId;
    protected String status;
    protected String remarks;
    protected String extErrorCode;

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the currentStateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentStateId() {
        return currentStateId;
    }

    /**
     * Sets the value of the currentStateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentStateId(String value) {
        this.currentStateId = value;
    }

    /**
     * Gets the value of the sim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIM() {
        return sim;
    }

    /**
     * Sets the value of the sim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIM(String value) {
        this.sim = value;
    }

    /**
     * Gets the value of the oldMSISDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldMSISDN() {
        return oldMSISDN;
    }

    /**
     * Sets the value of the oldMSISDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldMSISDN(String value) {
        this.oldMSISDN = value;
    }

    /**
     * Gets the value of the newMSISDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewMSISDN() {
        return newMSISDN;
    }

    /**
     * Sets the value of the newMSISDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewMSISDN(String value) {
        this.newMSISDN = value;
    }

    /**
     * Gets the value of the ban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBAN() {
        return ban;
    }

    /**
     * Sets the value of the ban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBAN(String value) {
        this.ban = value;
    }

    /**
     * Gets the value of the linkTransId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkTransId() {
        return linkTransId;
    }

    /**
     * Sets the value of the linkTransId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkTransId(String value) {
        this.linkTransId = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the extErrorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtErrorCode() {
        return extErrorCode;
    }

    /**
     * Sets the value of the extErrorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtErrorCode(String value) {
        this.extErrorCode = value;
    }

}
