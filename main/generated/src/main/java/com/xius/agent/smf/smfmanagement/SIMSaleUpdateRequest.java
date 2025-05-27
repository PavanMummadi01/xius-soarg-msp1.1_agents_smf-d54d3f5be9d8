
package com.xius.agent.smf.smfmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SIMSaleUpdateRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SIMSaleUpdateRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransactionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="externalTransId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurentStateId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="newMSISDN" type="{http://smf.agent.xius.com/SMFManagement.xsd}MSISDNType" minOccurs="0"/>
 *         &lt;element name="oldMSISDN" type="{http://smf.agent.xius.com/SMFManagement.xsd}MSISDNType" minOccurs="0"/>
 *         &lt;element name="oldSIM" type="{http://smf.agent.xius.com/SMFManagement.xsd}SIMType" minOccurs="0"/>
 *         &lt;element name="newSIM" type="{http://smf.agent.xius.com/SMFManagement.xsd}SIMType" minOccurs="0"/>
 *         &lt;element name="oldIMSI" type="{http://smf.agent.xius.com/SMFManagement.xsd}IMSIType" minOccurs="0"/>
 *         &lt;element name="newIMSI" type="{http://smf.agent.xius.com/SMFManagement.xsd}IMSIType" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Externalstatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Externalremarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Responsecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Responsemsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extErrorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="failedNode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="volteTransID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="volteDeProvRespCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="simSaleTransID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flag_4G" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flag_5G" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insertSubsFlowTrackerTransID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insertSubsFlowTrackGenTransID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newCcMsisdn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldCcMsisdn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="officeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isIvrRequired" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ivr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isVmsRequired" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientMsisdn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="donorMsisdn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="neMsgParticipants" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="finalSmsConfigMap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dynamicMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ussdConfigMap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailConfigMap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isDebitSuccess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceContext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="simType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isCorp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authenticateCarrierid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="iccNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="balanceAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promoDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expiryTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tokenLife" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="categoryId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rechargeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secondName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tarrifPlanInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tariffPackId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="packageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="svcEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="svcStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailSubject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isPseudo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mdnForChngsimUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="auditOldSim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="iccId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="languageInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="auditNewSim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="auditAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="auditMsisdn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SIMSaleUpdateRequest", propOrder = {
    "transactionId",
    "externalTransId",
    "curentStateId",
    "newMSISDN",
    "oldMSISDN",
    "oldSIM",
    "newSIM",
    "oldIMSI",
    "newIMSI",
    "status",
    "remarks",
    "externalstatus",
    "externalremarks",
    "responsecode",
    "responsemsg",
    "extErrorCode",
    "failedNode",
    "volteTransID",
    "volteDeProvRespCode",
    "simSaleTransID",
    "flag4G",
    "flag5G",
    "insertSubsFlowTrackerTransID",
    "insertSubsFlowTrackGenTransID",
    "newCcMsisdn",
    "oldCcMsisdn",
    "officeCode",
    "isIvrRequired",
    "ivr",
    "isVmsRequired",
    "recipientMsisdn",
    "donorMsisdn",
    "count",
    "maxSize",
    "transType",
    "neMsgParticipants",
    "finalSmsConfigMap",
    "dynamicMessage",
    "ussdConfigMap",
    "emailConfigMap",
    "isDebitSuccess",
    "serviceContext",
    "operator",
    "simType",
    "userType",
    "isCorp",
    "authenticateCarrierid",
    "iccNo",
    "emailId",
    "balanceAmount",
    "newPassword",
    "orderDate",
    "promoDetails",
    "taxId",
    "expiryTime",
    "token",
    "tokenLife",
    "categoryId",
    "rechargeCode",
    "secondName",
    "tarrifPlanInfo",
    "tariffPackId",
    "packageName",
    "startDate",
    "endDate",
    "svcEndDate",
    "svcStartDate",
    "emailSubject",
    "userName",
    "isPseudo",
    "mdnForChngsimUrl",
    "auditOldSim",
    "iccId",
    "languageInfo",
    "auditNewSim",
    "auditAction",
    "auditMsisdn",
    "data"
})
public class SIMSaleUpdateRequest {

    @XmlElement(name = "TransactionId", required = true)
    protected String transactionId;
    protected String externalTransId;
    @XmlElement(name = "CurentStateId")
    protected long curentStateId;
    protected String newMSISDN;
    protected String oldMSISDN;
    protected String oldSIM;
    protected String newSIM;
    protected String oldIMSI;
    protected String newIMSI;
    protected String status;
    protected String remarks;
    @XmlElement(name = "Externalstatus")
    protected String externalstatus;
    @XmlElement(name = "Externalremarks")
    protected String externalremarks;
    @XmlElement(name = "Responsecode")
    protected String responsecode;
    @XmlElement(name = "Responsemsg")
    protected String responsemsg;
    protected String extErrorCode;
    protected String failedNode;
    protected String volteTransID;
    protected String volteDeProvRespCode;
    protected String simSaleTransID;
    @XmlElement(name = "flag_4G")
    protected String flag4G;
    @XmlElement(name = "flag_5G")
    protected String flag5G;
    protected String insertSubsFlowTrackerTransID;
    protected String insertSubsFlowTrackGenTransID;
    protected String newCcMsisdn;
    protected String oldCcMsisdn;
    @XmlElement(nillable = true)
    protected String officeCode;
    @XmlElement(nillable = true)
    protected String isIvrRequired;
    @XmlElement(nillable = true)
    protected String ivr;
    @XmlElement(nillable = true)
    protected String isVmsRequired;
    @XmlElement(nillable = true)
    protected String recipientMsisdn;
    @XmlElement(nillable = true)
    protected String donorMsisdn;
    @XmlElement(nillable = true)
    protected String count;
    @XmlElement(nillable = true)
    protected String maxSize;
    @XmlElement(nillable = true)
    protected String transType;
    @XmlElement(nillable = true)
    protected String neMsgParticipants;
    @XmlElement(nillable = true)
    protected String finalSmsConfigMap;
    @XmlElement(nillable = true)
    protected String dynamicMessage;
    @XmlElement(nillable = true)
    protected String ussdConfigMap;
    @XmlElement(nillable = true)
    protected String emailConfigMap;
    @XmlElement(nillable = true)
    protected String isDebitSuccess;
    @XmlElement(nillable = true)
    protected String serviceContext;
    @XmlElement(nillable = true)
    protected String operator;
    @XmlElement(nillable = true)
    protected String simType;
    @XmlElement(nillable = true)
    protected String userType;
    @XmlElement(nillable = true)
    protected String isCorp;
    @XmlElement(nillable = true)
    protected String authenticateCarrierid;
    @XmlElement(nillable = true)
    protected String iccNo;
    @XmlElement(nillable = true)
    protected String emailId;
    @XmlElement(nillable = true)
    protected String balanceAmount;
    @XmlElement(nillable = true)
    protected String newPassword;
    @XmlElement(nillable = true)
    protected String orderDate;
    @XmlElement(nillable = true)
    protected String promoDetails;
    @XmlElement(nillable = true)
    protected String taxId;
    @XmlElement(nillable = true)
    protected String expiryTime;
    @XmlElement(nillable = true)
    protected String token;
    @XmlElement(nillable = true)
    protected String tokenLife;
    @XmlElement(nillable = true)
    protected String categoryId;
    @XmlElement(nillable = true)
    protected String rechargeCode;
    @XmlElement(nillable = true)
    protected String secondName;
    @XmlElement(nillable = true)
    protected String tarrifPlanInfo;
    @XmlElement(nillable = true)
    protected String tariffPackId;
    @XmlElement(nillable = true)
    protected String packageName;
    @XmlElement(nillable = true)
    protected String startDate;
    @XmlElement(nillable = true)
    protected String endDate;
    @XmlElement(nillable = true)
    protected String svcEndDate;
    @XmlElement(nillable = true)
    protected String svcStartDate;
    @XmlElement(nillable = true)
    protected String emailSubject;
    @XmlElement(nillable = true)
    protected String userName;
    @XmlElement(nillable = true)
    protected String isPseudo;
    @XmlElement(nillable = true)
    protected String mdnForChngsimUrl;
    @XmlElement(nillable = true)
    protected String auditOldSim;
    @XmlElement(nillable = true)
    protected String iccId;
    @XmlElement(nillable = true)
    protected String languageInfo;
    @XmlElement(nillable = true)
    protected String auditNewSim;
    @XmlElement(nillable = true)
    protected String auditAction;
    @XmlElement(nillable = true)
    protected String auditMsisdn;
    @XmlElement(nillable = true)
    protected String data;

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
     * Gets the value of the externalTransId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalTransId() {
        return externalTransId;
    }

    /**
     * Sets the value of the externalTransId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalTransId(String value) {
        this.externalTransId = value;
    }

    /**
     * Gets the value of the curentStateId property.
     * 
     */
    public long getCurentStateId() {
        return curentStateId;
    }

    /**
     * Sets the value of the curentStateId property.
     * 
     */
    public void setCurentStateId(long value) {
        this.curentStateId = value;
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
     * Gets the value of the externalstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalstatus() {
        return externalstatus;
    }

    /**
     * Sets the value of the externalstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalstatus(String value) {
        this.externalstatus = value;
    }

    /**
     * Gets the value of the externalremarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalremarks() {
        return externalremarks;
    }

    /**
     * Sets the value of the externalremarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalremarks(String value) {
        this.externalremarks = value;
    }

    /**
     * Gets the value of the responsecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsecode() {
        return responsecode;
    }

    /**
     * Sets the value of the responsecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsecode(String value) {
        this.responsecode = value;
    }

    /**
     * Gets the value of the responsemsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsemsg() {
        return responsemsg;
    }

    /**
     * Sets the value of the responsemsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsemsg(String value) {
        this.responsemsg = value;
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

    /**
     * Gets the value of the failedNode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailedNode() {
        return failedNode;
    }

    /**
     * Sets the value of the failedNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailedNode(String value) {
        this.failedNode = value;
    }

    /**
     * Gets the value of the volteTransID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolteTransID() {
        return volteTransID;
    }

    /**
     * Sets the value of the volteTransID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolteTransID(String value) {
        this.volteTransID = value;
    }

    /**
     * Gets the value of the volteDeProvRespCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolteDeProvRespCode() {
        return volteDeProvRespCode;
    }

    /**
     * Sets the value of the volteDeProvRespCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolteDeProvRespCode(String value) {
        this.volteDeProvRespCode = value;
    }

    /**
     * Gets the value of the simSaleTransID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimSaleTransID() {
        return simSaleTransID;
    }

    /**
     * Sets the value of the simSaleTransID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimSaleTransID(String value) {
        this.simSaleTransID = value;
    }

    /**
     * Gets the value of the flag4G property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlag4G() {
        return flag4G;
    }

    /**
     * Sets the value of the flag4G property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlag4G(String value) {
        this.flag4G = value;
    }

    /**
     * Gets the value of the flag5G property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlag5G() {
        return flag5G;
    }

    /**
     * Sets the value of the flag5G property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlag5G(String value) {
        this.flag5G = value;
    }

    /**
     * Gets the value of the insertSubsFlowTrackerTransID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsertSubsFlowTrackerTransID() {
        return insertSubsFlowTrackerTransID;
    }

    /**
     * Sets the value of the insertSubsFlowTrackerTransID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsertSubsFlowTrackerTransID(String value) {
        this.insertSubsFlowTrackerTransID = value;
    }

    /**
     * Gets the value of the insertSubsFlowTrackGenTransID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsertSubsFlowTrackGenTransID() {
        return insertSubsFlowTrackGenTransID;
    }

    /**
     * Sets the value of the insertSubsFlowTrackGenTransID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsertSubsFlowTrackGenTransID(String value) {
        this.insertSubsFlowTrackGenTransID = value;
    }

    /**
     * Gets the value of the newCcMsisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewCcMsisdn() {
        return newCcMsisdn;
    }

    /**
     * Sets the value of the newCcMsisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewCcMsisdn(String value) {
        this.newCcMsisdn = value;
    }

    /**
     * Gets the value of the oldCcMsisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldCcMsisdn() {
        return oldCcMsisdn;
    }

    /**
     * Sets the value of the oldCcMsisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldCcMsisdn(String value) {
        this.oldCcMsisdn = value;
    }

    /**
     * Gets the value of the officeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeCode() {
        return officeCode;
    }

    /**
     * Sets the value of the officeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeCode(String value) {
        this.officeCode = value;
    }

    /**
     * Gets the value of the isIvrRequired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsIvrRequired() {
        return isIvrRequired;
    }

    /**
     * Sets the value of the isIvrRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsIvrRequired(String value) {
        this.isIvrRequired = value;
    }

    /**
     * Gets the value of the ivr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIvr() {
        return ivr;
    }

    /**
     * Sets the value of the ivr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIvr(String value) {
        this.ivr = value;
    }

    /**
     * Gets the value of the isVmsRequired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsVmsRequired() {
        return isVmsRequired;
    }

    /**
     * Sets the value of the isVmsRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsVmsRequired(String value) {
        this.isVmsRequired = value;
    }

    /**
     * Gets the value of the recipientMsisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientMsisdn() {
        return recipientMsisdn;
    }

    /**
     * Sets the value of the recipientMsisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientMsisdn(String value) {
        this.recipientMsisdn = value;
    }

    /**
     * Gets the value of the donorMsisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDonorMsisdn() {
        return donorMsisdn;
    }

    /**
     * Sets the value of the donorMsisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDonorMsisdn(String value) {
        this.donorMsisdn = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCount(String value) {
        this.count = value;
    }

    /**
     * Gets the value of the maxSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxSize() {
        return maxSize;
    }

    /**
     * Sets the value of the maxSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxSize(String value) {
        this.maxSize = value;
    }

    /**
     * Gets the value of the transType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransType() {
        return transType;
    }

    /**
     * Sets the value of the transType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransType(String value) {
        this.transType = value;
    }

    /**
     * Gets the value of the neMsgParticipants property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNeMsgParticipants() {
        return neMsgParticipants;
    }

    /**
     * Sets the value of the neMsgParticipants property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNeMsgParticipants(String value) {
        this.neMsgParticipants = value;
    }

    /**
     * Gets the value of the finalSmsConfigMap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinalSmsConfigMap() {
        return finalSmsConfigMap;
    }

    /**
     * Sets the value of the finalSmsConfigMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinalSmsConfigMap(String value) {
        this.finalSmsConfigMap = value;
    }

    /**
     * Gets the value of the dynamicMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDynamicMessage() {
        return dynamicMessage;
    }

    /**
     * Sets the value of the dynamicMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDynamicMessage(String value) {
        this.dynamicMessage = value;
    }

    /**
     * Gets the value of the ussdConfigMap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUssdConfigMap() {
        return ussdConfigMap;
    }

    /**
     * Sets the value of the ussdConfigMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUssdConfigMap(String value) {
        this.ussdConfigMap = value;
    }

    /**
     * Gets the value of the emailConfigMap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailConfigMap() {
        return emailConfigMap;
    }

    /**
     * Sets the value of the emailConfigMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailConfigMap(String value) {
        this.emailConfigMap = value;
    }

    /**
     * Gets the value of the isDebitSuccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsDebitSuccess() {
        return isDebitSuccess;
    }

    /**
     * Sets the value of the isDebitSuccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsDebitSuccess(String value) {
        this.isDebitSuccess = value;
    }

    /**
     * Gets the value of the serviceContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceContext() {
        return serviceContext;
    }

    /**
     * Sets the value of the serviceContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceContext(String value) {
        this.serviceContext = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperator(String value) {
        this.operator = value;
    }

    /**
     * Gets the value of the simType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimType() {
        return simType;
    }

    /**
     * Sets the value of the simType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimType(String value) {
        this.simType = value;
    }

    /**
     * Gets the value of the userType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserType() {
        return userType;
    }

    /**
     * Sets the value of the userType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserType(String value) {
        this.userType = value;
    }

    /**
     * Gets the value of the isCorp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsCorp() {
        return isCorp;
    }

    /**
     * Sets the value of the isCorp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsCorp(String value) {
        this.isCorp = value;
    }

    /**
     * Gets the value of the authenticateCarrierid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticateCarrierid() {
        return authenticateCarrierid;
    }

    /**
     * Sets the value of the authenticateCarrierid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticateCarrierid(String value) {
        this.authenticateCarrierid = value;
    }

    /**
     * Gets the value of the iccNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIccNo() {
        return iccNo;
    }

    /**
     * Sets the value of the iccNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIccNo(String value) {
        this.iccNo = value;
    }

    /**
     * Gets the value of the emailId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailId() {
        return emailId;
    }

    /**
     * Sets the value of the emailId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailId(String value) {
        this.emailId = value;
    }

    /**
     * Gets the value of the balanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceAmount() {
        return balanceAmount;
    }

    /**
     * Sets the value of the balanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceAmount(String value) {
        this.balanceAmount = value;
    }

    /**
     * Gets the value of the newPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPassword() {
        return newPassword;
    }

    /**
     * Sets the value of the newPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPassword(String value) {
        this.newPassword = value;
    }

    /**
     * Gets the value of the orderDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderDate() {
        return orderDate;
    }

    /**
     * Sets the value of the orderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderDate(String value) {
        this.orderDate = value;
    }

    /**
     * Gets the value of the promoDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoDetails() {
        return promoDetails;
    }

    /**
     * Sets the value of the promoDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoDetails(String value) {
        this.promoDetails = value;
    }

    /**
     * Gets the value of the taxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxId() {
        return taxId;
    }

    /**
     * Sets the value of the taxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxId(String value) {
        this.taxId = value;
    }

    /**
     * Gets the value of the expiryTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryTime() {
        return expiryTime;
    }

    /**
     * Sets the value of the expiryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryTime(String value) {
        this.expiryTime = value;
    }

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the tokenLife property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenLife() {
        return tokenLife;
    }

    /**
     * Sets the value of the tokenLife property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenLife(String value) {
        this.tokenLife = value;
    }

    /**
     * Gets the value of the categoryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryId() {
        return categoryId;
    }

    /**
     * Sets the value of the categoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryId(String value) {
        this.categoryId = value;
    }

    /**
     * Gets the value of the rechargeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRechargeCode() {
        return rechargeCode;
    }

    /**
     * Sets the value of the rechargeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRechargeCode(String value) {
        this.rechargeCode = value;
    }

    /**
     * Gets the value of the secondName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondName() {
        return secondName;
    }

    /**
     * Sets the value of the secondName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondName(String value) {
        this.secondName = value;
    }

    /**
     * Gets the value of the tarrifPlanInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarrifPlanInfo() {
        return tarrifPlanInfo;
    }

    /**
     * Sets the value of the tarrifPlanInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarrifPlanInfo(String value) {
        this.tarrifPlanInfo = value;
    }

    /**
     * Gets the value of the tariffPackId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffPackId() {
        return tariffPackId;
    }

    /**
     * Sets the value of the tariffPackId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffPackId(String value) {
        this.tariffPackId = value;
    }

    /**
     * Gets the value of the packageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageName() {
        return packageName;
    }

    /**
     * Sets the value of the packageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageName(String value) {
        this.packageName = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the svcEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcEndDate() {
        return svcEndDate;
    }

    /**
     * Sets the value of the svcEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcEndDate(String value) {
        this.svcEndDate = value;
    }

    /**
     * Gets the value of the svcStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcStartDate() {
        return svcStartDate;
    }

    /**
     * Sets the value of the svcStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcStartDate(String value) {
        this.svcStartDate = value;
    }

    /**
     * Gets the value of the emailSubject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailSubject() {
        return emailSubject;
    }

    /**
     * Sets the value of the emailSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailSubject(String value) {
        this.emailSubject = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the isPseudo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsPseudo() {
        return isPseudo;
    }

    /**
     * Sets the value of the isPseudo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsPseudo(String value) {
        this.isPseudo = value;
    }

    /**
     * Gets the value of the mdnForChngsimUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdnForChngsimUrl() {
        return mdnForChngsimUrl;
    }

    /**
     * Sets the value of the mdnForChngsimUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdnForChngsimUrl(String value) {
        this.mdnForChngsimUrl = value;
    }

    /**
     * Gets the value of the auditOldSim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditOldSim() {
        return auditOldSim;
    }

    /**
     * Sets the value of the auditOldSim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditOldSim(String value) {
        this.auditOldSim = value;
    }

    /**
     * Gets the value of the iccId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIccId() {
        return iccId;
    }

    /**
     * Sets the value of the iccId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIccId(String value) {
        this.iccId = value;
    }

    /**
     * Gets the value of the languageInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageInfo() {
        return languageInfo;
    }

    /**
     * Sets the value of the languageInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageInfo(String value) {
        this.languageInfo = value;
    }

    /**
     * Gets the value of the auditNewSim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditNewSim() {
        return auditNewSim;
    }

    /**
     * Sets the value of the auditNewSim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditNewSim(String value) {
        this.auditNewSim = value;
    }

    /**
     * Gets the value of the auditAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditAction() {
        return auditAction;
    }

    /**
     * Sets the value of the auditAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditAction(String value) {
        this.auditAction = value;
    }

    /**
     * Gets the value of the auditMsisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditMsisdn() {
        return auditMsisdn;
    }

    /**
     * Sets the value of the auditMsisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditMsisdn(String value) {
        this.auditMsisdn = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData(String value) {
        this.data = value;
    }

}
