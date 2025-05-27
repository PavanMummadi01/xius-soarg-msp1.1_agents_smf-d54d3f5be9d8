
package com.xius.agent.smf.smfmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SIMSaleRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SIMSaleRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActivityType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="oldMSISDN" type="{http://smf.agent.xius.com/SMFManagement.xsd}MSISDNType" minOccurs="0"/>
 *         &lt;element name="newMSISDN" type="{http://smf.agent.xius.com/SMFManagement.xsd}MSISDNType" minOccurs="0"/>
 *         &lt;element name="oldSIM" type="{http://smf.agent.xius.com/SMFManagement.xsd}SIMType" minOccurs="0"/>
 *         &lt;element name="newSIM" type="{http://smf.agent.xius.com/SMFManagement.xsd}SIMType" minOccurs="0"/>
 *         &lt;element name="oldIMSI" type="{http://smf.agent.xius.com/SMFManagement.xsd}IMSIType" minOccurs="0"/>
 *         &lt;element name="newIMSI" type="{http://smf.agent.xius.com/SMFManagement.xsd}IMSIType" minOccurs="0"/>
 *         &lt;element name="CurentStateId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CustomField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="technology" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newAccountId" type="{http://smf.agent.xius.com/SMFManagement.xsd}AccountIdType" minOccurs="0"/>
 *         &lt;element name="oldAccountId" type="{http://smf.agent.xius.com/SMFManagement.xsd}AccountIdType" minOccurs="0"/>
 *         &lt;element name="externalTransId2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="channel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customField2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customField3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customField4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customField5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customField6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="service" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="baseIdsDerivdIds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ATPIDs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chargeIDs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="publicityIDs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="activationfees" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ATPUniqueID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="atpUnSubsFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NIR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SIMSaleRequest", propOrder = {
    "activityType",
    "oldMSISDN",
    "newMSISDN",
    "oldSIM",
    "newSIM",
    "oldIMSI",
    "newIMSI",
    "curentStateId",
    "customField",
    "technology",
    "newAccountId",
    "oldAccountId",
    "externalTransId2",
    "channel",
    "customField2",
    "customField3",
    "customField4",
    "customField5",
    "customField6",
    "service",
    "baseIdsDerivdIds",
    "atpiDs",
    "chargeIDs",
    "publicityIDs",
    "activationfees",
    "atpUniqueID",
    "atpUnSubsFlag",
    "nir"
})
public class SIMSaleRequest {

    @XmlElement(name = "ActivityType", required = true)
    protected String activityType;
    protected String oldMSISDN;
    protected String newMSISDN;
    protected String oldSIM;
    protected String newSIM;
    protected String oldIMSI;
    protected String newIMSI;
    @XmlElement(name = "CurentStateId")
    protected Long curentStateId;
    @XmlElement(name = "CustomField")
    protected String customField;
    protected String technology;
    protected String newAccountId;
    protected String oldAccountId;
    protected String externalTransId2;
    protected String channel;
    protected String customField2;
    protected String customField3;
    protected String customField4;
    protected String customField5;
    protected String customField6;
    protected String service;
    protected String baseIdsDerivdIds;
    @XmlElement(name = "ATPIDs")
    protected String atpiDs;
    protected String chargeIDs;
    protected String publicityIDs;
    protected String activationfees;
    @XmlElement(name = "ATPUniqueID")
    protected String atpUniqueID;
    protected String atpUnSubsFlag;
    @XmlElement(name = "NIR")
    protected String nir;

    /**
     * Gets the value of the activityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityType() {
        return activityType;
    }

    /**
     * Sets the value of the activityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityType(String value) {
        this.activityType = value;
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
     * Gets the value of the oldSIM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldSIM() {
        return oldSIM;
    }

    /**
     * Sets the value of the oldSIM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldSIM(String value) {
        this.oldSIM = value;
    }

    /**
     * Gets the value of the newSIM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewSIM() {
        return newSIM;
    }

    /**
     * Sets the value of the newSIM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewSIM(String value) {
        this.newSIM = value;
    }

    /**
     * Gets the value of the oldIMSI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldIMSI() {
        return oldIMSI;
    }

    /**
     * Sets the value of the oldIMSI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldIMSI(String value) {
        this.oldIMSI = value;
    }

    /**
     * Gets the value of the newIMSI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewIMSI() {
        return newIMSI;
    }

    /**
     * Sets the value of the newIMSI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewIMSI(String value) {
        this.newIMSI = value;
    }

    /**
     * Gets the value of the curentStateId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCurentStateId() {
        return curentStateId;
    }

    /**
     * Sets the value of the curentStateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCurentStateId(Long value) {
        this.curentStateId = value;
    }

    /**
     * Gets the value of the customField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomField() {
        return customField;
    }

    /**
     * Sets the value of the customField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomField(String value) {
        this.customField = value;
    }

    /**
     * Gets the value of the technology property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnology() {
        return technology;
    }

    /**
     * Sets the value of the technology property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnology(String value) {
        this.technology = value;
    }

    /**
     * Gets the value of the newAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewAccountId() {
        return newAccountId;
    }

    /**
     * Sets the value of the newAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewAccountId(String value) {
        this.newAccountId = value;
    }

    /**
     * Gets the value of the oldAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldAccountId() {
        return oldAccountId;
    }

    /**
     * Sets the value of the oldAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldAccountId(String value) {
        this.oldAccountId = value;
    }

    /**
     * Gets the value of the externalTransId2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalTransId2() {
        return externalTransId2;
    }

    /**
     * Sets the value of the externalTransId2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalTransId2(String value) {
        this.externalTransId2 = value;
    }

    /**
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannel(String value) {
        this.channel = value;
    }

    /**
     * Gets the value of the customField2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomField2() {
        return customField2;
    }

    /**
     * Sets the value of the customField2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomField2(String value) {
        this.customField2 = value;
    }

    /**
     * Gets the value of the customField3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomField3() {
        return customField3;
    }

    /**
     * Sets the value of the customField3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomField3(String value) {
        this.customField3 = value;
    }

    /**
     * Gets the value of the customField4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomField4() {
        return customField4;
    }

    /**
     * Sets the value of the customField4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomField4(String value) {
        this.customField4 = value;
    }

    /**
     * Gets the value of the customField5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomField5() {
        return customField5;
    }

    /**
     * Sets the value of the customField5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomField5(String value) {
        this.customField5 = value;
    }

    /**
     * Gets the value of the customField6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomField6() {
        return customField6;
    }

    /**
     * Sets the value of the customField6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomField6(String value) {
        this.customField6 = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setService(String value) {
        this.service = value;
    }

    /**
     * Gets the value of the baseIdsDerivdIds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseIdsDerivdIds() {
        return baseIdsDerivdIds;
    }

    /**
     * Sets the value of the baseIdsDerivdIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseIdsDerivdIds(String value) {
        this.baseIdsDerivdIds = value;
    }

    /**
     * Gets the value of the atpiDs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATPIDs() {
        return atpiDs;
    }

    /**
     * Sets the value of the atpiDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATPIDs(String value) {
        this.atpiDs = value;
    }

    /**
     * Gets the value of the chargeIDs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeIDs() {
        return chargeIDs;
    }

    /**
     * Sets the value of the chargeIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeIDs(String value) {
        this.chargeIDs = value;
    }

    /**
     * Gets the value of the publicityIDs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicityIDs() {
        return publicityIDs;
    }

    /**
     * Sets the value of the publicityIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicityIDs(String value) {
        this.publicityIDs = value;
    }

    /**
     * Gets the value of the activationfees property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivationfees() {
        return activationfees;
    }

    /**
     * Sets the value of the activationfees property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivationfees(String value) {
        this.activationfees = value;
    }

    /**
     * Gets the value of the atpUniqueID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATPUniqueID() {
        return atpUniqueID;
    }

    /**
     * Sets the value of the atpUniqueID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATPUniqueID(String value) {
        this.atpUniqueID = value;
    }

    /**
     * Gets the value of the atpUnSubsFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtpUnSubsFlag() {
        return atpUnSubsFlag;
    }

    /**
     * Sets the value of the atpUnSubsFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtpUnSubsFlag(String value) {
        this.atpUnSubsFlag = value;
    }

    /**
     * Gets the value of the nir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNIR() {
        return nir;
    }

    /**
     * Sets the value of the nir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNIR(String value) {
        this.nir = value;
    }

}
