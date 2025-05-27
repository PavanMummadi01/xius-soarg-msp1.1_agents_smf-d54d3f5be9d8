
package com.xius.agent.smf.smfmanagement;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManageProvsngRetry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManageProvsngRetry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="networkName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="networkId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="registrationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="selfcareActStatusType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actionFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="node" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="channel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="retryUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mtiRemarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mtiActionFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mtiStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dealerMsisdn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dealerUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="initiatedFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promoCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registrationRequ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chargeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="logId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="homePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="officePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailLangPref" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderBooking" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ethic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pleaseSpecify" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceofInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occupation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="industry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="annualIncome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gmpc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="issueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idDoB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nationalityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="familyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fatherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="grandFatherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idExpiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subtribeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="englishFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="englishLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="englishSecondName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="englishThirdName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secondName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="thirdName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="simNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imsi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="blockedMSISDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="msisdn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billFreq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditLimit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="billingDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tariffPlanID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isSudo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="FRTransNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="oldIMSI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldCCNDC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newCCNDC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actualMsisdn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="pseudoMSISDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gsmImsiTransNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gprsImsiTransNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="simType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="iccStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="errorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idExistsFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newMsisdnCCNDC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldMsisdnCCNDC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newMDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldMDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="smsLanguageId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sendNotificationFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isSendNotification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messageConnFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="goldenOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="failedNode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="simCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acctRetrievalType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="retrievalType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newValidityDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newGracePeroidIEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="errorCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="preferFourDigits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correlationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voucherPIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provisionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transferorMSISDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transfereeMSISDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ivrData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vmsData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indexNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="maxRecords" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isCorp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ussdMDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hlrFrConnection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="newExpDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManageProvsngRetry", propOrder = {
    "networkName",
    "networkId",
    "registrationType",
    "selfcareActStatusType",
    "transId",
    "status",
    "actionFlag",
    "operationName",
    "node",
    "channel",
    "retryUserName",
    "mtiRemarks",
    "mtiActionFlag",
    "mtiStatus",
    "dealerMsisdn",
    "dealerUserId",
    "orderID",
    "initiatedFrom",
    "promoCode",
    "registrationRequ",
    "chargeCode",
    "message",
    "logId",
    "address1",
    "address2",
    "address3",
    "postalCode",
    "state",
    "city",
    "homePhone",
    "officePhone",
    "country",
    "emailId",
    "emailLangPref",
    "orderInfo",
    "orderBooking",
    "ethic",
    "pleaseSpecify",
    "sourceofInfo",
    "firstName",
    "lastName",
    "userName",
    "dateOfBirth",
    "gender",
    "idType",
    "idValue",
    "occupation",
    "industry",
    "annualIncome",
    "oldIC",
    "gmpc",
    "userId",
    "issueDate",
    "expiryDate",
    "idDoB",
    "nationalityCode",
    "familyName",
    "fatherName",
    "grandFatherName",
    "idExpiryDate",
    "subtribeName",
    "englishFirstName",
    "englishLastName",
    "englishSecondName",
    "englishThirdName",
    "secondName",
    "thirdName",
    "workPhone",
    "simNumber",
    "imsi",
    "blockedMSISDN",
    "msisdn",
    "billType",
    "billFreq",
    "creditLimit",
    "billingDate",
    "tariffPlanID",
    "isSudo",
    "frTransNo",
    "oldIMSI",
    "serviceType",
    "oldCCNDC",
    "newCCNDC",
    "actualMsisdn",
    "accountId",
    "pseudoMSISDN",
    "gsmImsiTransNo",
    "gprsImsiTransNo",
    "transactionNo",
    "simType",
    "createdBy",
    "iccStatus",
    "errorCode",
    "errorMessage",
    "userType",
    "idExistsFlag",
    "messageId",
    "accountType",
    "newMsisdnCCNDC",
    "oldMsisdnCCNDC",
    "password",
    "newMDN",
    "oldMDN",
    "requestType",
    "newPassword",
    "orderDate",
    "smsLanguageId",
    "sendNotificationFlag",
    "isSendNotification",
    "messageConnFlag",
    "goldenOrderId",
    "failedNode",
    "simCategory",
    "acctRetrievalType",
    "retrievalType",
    "transactionData",
    "newValidityDate",
    "newGracePeroidIEndDate",
    "reason",
    "amount",
    "errorCategory",
    "preferFourDigits",
    "correlationID",
    "voucherPIN",
    "provisionType",
    "transferorMSISDN",
    "transfereeMSISDN",
    "ivrData",
    "vmsData",
    "indexNo",
    "maxRecords",
    "isCorp",
    "ussdMDN",
    "hlrFrConnection",
    "creditAmount",
    "newExpDate"
})
public class ManageProvsngRetry {

    protected String networkName;
    protected Long networkId;
    protected String registrationType;
    protected String selfcareActStatusType;
    protected String transId;
    protected String status;
    protected String actionFlag;
    protected String operationName;
    protected String node;
    protected String channel;
    protected String retryUserName;
    protected String mtiRemarks;
    protected String mtiActionFlag;
    protected String mtiStatus;
    protected String dealerMsisdn;
    protected String dealerUserId;
    protected String orderID;
    protected String initiatedFrom;
    protected String promoCode;
    protected String registrationRequ;
    protected String chargeCode;
    protected String message;
    protected String logId;
    protected String address1;
    protected String address2;
    protected String address3;
    protected String postalCode;
    protected String state;
    protected String city;
    protected String homePhone;
    protected String officePhone;
    protected String country;
    protected String emailId;
    protected String emailLangPref;
    protected String orderInfo;
    protected String orderBooking;
    protected String ethic;
    protected String pleaseSpecify;
    protected String sourceofInfo;
    protected String firstName;
    protected String lastName;
    protected String userName;
    protected String dateOfBirth;
    protected String gender;
    protected String idType;
    protected String idValue;
    protected String occupation;
    protected String industry;
    protected String annualIncome;
    protected String oldIC;
    protected String gmpc;
    protected String userId;
    protected String issueDate;
    protected String expiryDate;
    protected String idDoB;
    protected String nationalityCode;
    protected String familyName;
    protected String fatherName;
    protected String grandFatherName;
    protected String idExpiryDate;
    protected String subtribeName;
    protected String englishFirstName;
    protected String englishLastName;
    protected String englishSecondName;
    protected String englishThirdName;
    protected String secondName;
    protected String thirdName;
    protected String workPhone;
    protected String simNumber;
    protected String imsi;
    protected String blockedMSISDN;
    protected String msisdn;
    protected String billType;
    protected String billFreq;
    protected BigDecimal creditLimit;
    protected String billingDate;
    protected Long tariffPlanID;
    protected Long isSudo;
    @XmlElement(name = "FRTransNo")
    protected Long frTransNo;
    protected String oldIMSI;
    protected String serviceType;
    protected String oldCCNDC;
    protected String newCCNDC;
    protected String actualMsisdn;
    protected Long accountId;
    protected String pseudoMSISDN;
    protected String gsmImsiTransNo;
    protected String gprsImsiTransNo;
    protected String transactionNo;
    protected String simType;
    protected String createdBy;
    protected String iccStatus;
    protected Long errorCode;
    protected String errorMessage;
    protected String userType;
    protected String idExistsFlag;
    protected String messageId;
    protected String accountType;
    protected String newMsisdnCCNDC;
    protected String oldMsisdnCCNDC;
    protected String password;
    protected String newMDN;
    protected String oldMDN;
    protected String requestType;
    protected String newPassword;
    protected String orderDate;
    protected Integer smsLanguageId;
    protected Boolean sendNotificationFlag;
    protected String isSendNotification;
    protected String messageConnFlag;
    protected String goldenOrderId;
    protected String failedNode;
    protected String simCategory;
    protected String acctRetrievalType;
    protected String retrievalType;
    protected String transactionData;
    protected String newValidityDate;
    protected String newGracePeroidIEndDate;
    protected String reason;
    protected Double amount;
    protected String errorCategory;
    protected String preferFourDigits;
    protected String correlationID;
    protected String voucherPIN;
    protected String provisionType;
    protected String transferorMSISDN;
    protected String transfereeMSISDN;
    protected String ivrData;
    protected String vmsData;
    protected Long indexNo;
    protected Long maxRecords;
    protected Boolean isCorp;
    protected String ussdMDN;
    protected String hlrFrConnection;
    protected Double creditAmount;
    protected String newExpDate;

    /**
     * Gets the value of the networkName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkName() {
        return networkName;
    }

    /**
     * Sets the value of the networkName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkName(String value) {
        this.networkName = value;
    }

    /**
     * Gets the value of the networkId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNetworkId() {
        return networkId;
    }

    /**
     * Sets the value of the networkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNetworkId(Long value) {
        this.networkId = value;
    }

    /**
     * Gets the value of the registrationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationType() {
        return registrationType;
    }

    /**
     * Sets the value of the registrationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationType(String value) {
        this.registrationType = value;
    }

    /**
     * Gets the value of the selfcareActStatusType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelfcareActStatusType() {
        return selfcareActStatusType;
    }

    /**
     * Sets the value of the selfcareActStatusType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelfcareActStatusType(String value) {
        this.selfcareActStatusType = value;
    }

    /**
     * Gets the value of the transId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransId() {
        return transId;
    }

    /**
     * Sets the value of the transId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransId(String value) {
        this.transId = value;
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
     * Gets the value of the actionFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionFlag() {
        return actionFlag;
    }

    /**
     * Sets the value of the actionFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionFlag(String value) {
        this.actionFlag = value;
    }

    /**
     * Gets the value of the operationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationName() {
        return operationName;
    }

    /**
     * Sets the value of the operationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationName(String value) {
        this.operationName = value;
    }

    /**
     * Gets the value of the node property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNode() {
        return node;
    }

    /**
     * Sets the value of the node property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNode(String value) {
        this.node = value;
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
     * Gets the value of the retryUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetryUserName() {
        return retryUserName;
    }

    /**
     * Sets the value of the retryUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetryUserName(String value) {
        this.retryUserName = value;
    }

    /**
     * Gets the value of the mtiRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtiRemarks() {
        return mtiRemarks;
    }

    /**
     * Sets the value of the mtiRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtiRemarks(String value) {
        this.mtiRemarks = value;
    }

    /**
     * Gets the value of the mtiActionFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtiActionFlag() {
        return mtiActionFlag;
    }

    /**
     * Sets the value of the mtiActionFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtiActionFlag(String value) {
        this.mtiActionFlag = value;
    }

    /**
     * Gets the value of the mtiStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtiStatus() {
        return mtiStatus;
    }

    /**
     * Sets the value of the mtiStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtiStatus(String value) {
        this.mtiStatus = value;
    }

    /**
     * Gets the value of the dealerMsisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealerMsisdn() {
        return dealerMsisdn;
    }

    /**
     * Sets the value of the dealerMsisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealerMsisdn(String value) {
        this.dealerMsisdn = value;
    }

    /**
     * Gets the value of the dealerUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealerUserId() {
        return dealerUserId;
    }

    /**
     * Sets the value of the dealerUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealerUserId(String value) {
        this.dealerUserId = value;
    }

    /**
     * Gets the value of the orderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderID() {
        return orderID;
    }

    /**
     * Sets the value of the orderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderID(String value) {
        this.orderID = value;
    }

    /**
     * Gets the value of the initiatedFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitiatedFrom() {
        return initiatedFrom;
    }

    /**
     * Sets the value of the initiatedFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitiatedFrom(String value) {
        this.initiatedFrom = value;
    }

    /**
     * Gets the value of the promoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoCode() {
        return promoCode;
    }

    /**
     * Sets the value of the promoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoCode(String value) {
        this.promoCode = value;
    }

    /**
     * Gets the value of the registrationRequ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationRequ() {
        return registrationRequ;
    }

    /**
     * Sets the value of the registrationRequ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationRequ(String value) {
        this.registrationRequ = value;
    }

    /**
     * Gets the value of the chargeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeCode() {
        return chargeCode;
    }

    /**
     * Sets the value of the chargeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeCode(String value) {
        this.chargeCode = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the logId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogId() {
        return logId;
    }

    /**
     * Sets the value of the logId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogId(String value) {
        this.logId = value;
    }

    /**
     * Gets the value of the address1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * Sets the value of the address1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress1(String value) {
        this.address1 = value;
    }

    /**
     * Gets the value of the address2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress2(String value) {
        this.address2 = value;
    }

    /**
     * Gets the value of the address3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress3() {
        return address3;
    }

    /**
     * Sets the value of the address3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress3(String value) {
        this.address3 = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the homePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * Sets the value of the homePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePhone(String value) {
        this.homePhone = value;
    }

    /**
     * Gets the value of the officePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficePhone() {
        return officePhone;
    }

    /**
     * Sets the value of the officePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficePhone(String value) {
        this.officePhone = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
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
     * Gets the value of the emailLangPref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailLangPref() {
        return emailLangPref;
    }

    /**
     * Sets the value of the emailLangPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailLangPref(String value) {
        this.emailLangPref = value;
    }

    /**
     * Gets the value of the orderInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderInfo() {
        return orderInfo;
    }

    /**
     * Sets the value of the orderInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderInfo(String value) {
        this.orderInfo = value;
    }

    /**
     * Gets the value of the orderBooking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderBooking() {
        return orderBooking;
    }

    /**
     * Sets the value of the orderBooking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderBooking(String value) {
        this.orderBooking = value;
    }

    /**
     * Gets the value of the ethic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEthic() {
        return ethic;
    }

    /**
     * Sets the value of the ethic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEthic(String value) {
        this.ethic = value;
    }

    /**
     * Gets the value of the pleaseSpecify property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPleaseSpecify() {
        return pleaseSpecify;
    }

    /**
     * Sets the value of the pleaseSpecify property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPleaseSpecify(String value) {
        this.pleaseSpecify = value;
    }

    /**
     * Gets the value of the sourceofInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceofInfo() {
        return sourceofInfo;
    }

    /**
     * Sets the value of the sourceofInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceofInfo(String value) {
        this.sourceofInfo = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
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
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfBirth(String value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the idType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdType() {
        return idType;
    }

    /**
     * Sets the value of the idType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdType(String value) {
        this.idType = value;
    }

    /**
     * Gets the value of the idValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdValue() {
        return idValue;
    }

    /**
     * Sets the value of the idValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdValue(String value) {
        this.idValue = value;
    }

    /**
     * Gets the value of the occupation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * Sets the value of the occupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupation(String value) {
        this.occupation = value;
    }

    /**
     * Gets the value of the industry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustry() {
        return industry;
    }

    /**
     * Sets the value of the industry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustry(String value) {
        this.industry = value;
    }

    /**
     * Gets the value of the annualIncome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnualIncome() {
        return annualIncome;
    }

    /**
     * Sets the value of the annualIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnualIncome(String value) {
        this.annualIncome = value;
    }

    /**
     * Gets the value of the oldIC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldIC() {
        return oldIC;
    }

    /**
     * Sets the value of the oldIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldIC(String value) {
        this.oldIC = value;
    }

    /**
     * Gets the value of the gmpc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGmpc() {
        return gmpc;
    }

    /**
     * Sets the value of the gmpc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGmpc(String value) {
        this.gmpc = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the issueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueDate(String value) {
        this.issueDate = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryDate(String value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the idDoB property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdDoB() {
        return idDoB;
    }

    /**
     * Sets the value of the idDoB property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdDoB(String value) {
        this.idDoB = value;
    }

    /**
     * Gets the value of the nationalityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalityCode() {
        return nationalityCode;
    }

    /**
     * Sets the value of the nationalityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalityCode(String value) {
        this.nationalityCode = value;
    }

    /**
     * Gets the value of the familyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyName() {
        return familyName;
    }

    /**
     * Sets the value of the familyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyName(String value) {
        this.familyName = value;
    }

    /**
     * Gets the value of the fatherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatherName() {
        return fatherName;
    }

    /**
     * Sets the value of the fatherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatherName(String value) {
        this.fatherName = value;
    }

    /**
     * Gets the value of the grandFatherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrandFatherName() {
        return grandFatherName;
    }

    /**
     * Sets the value of the grandFatherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrandFatherName(String value) {
        this.grandFatherName = value;
    }

    /**
     * Gets the value of the idExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdExpiryDate() {
        return idExpiryDate;
    }

    /**
     * Sets the value of the idExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdExpiryDate(String value) {
        this.idExpiryDate = value;
    }

    /**
     * Gets the value of the subtribeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtribeName() {
        return subtribeName;
    }

    /**
     * Sets the value of the subtribeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtribeName(String value) {
        this.subtribeName = value;
    }

    /**
     * Gets the value of the englishFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnglishFirstName() {
        return englishFirstName;
    }

    /**
     * Sets the value of the englishFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnglishFirstName(String value) {
        this.englishFirstName = value;
    }

    /**
     * Gets the value of the englishLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnglishLastName() {
        return englishLastName;
    }

    /**
     * Sets the value of the englishLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnglishLastName(String value) {
        this.englishLastName = value;
    }

    /**
     * Gets the value of the englishSecondName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnglishSecondName() {
        return englishSecondName;
    }

    /**
     * Sets the value of the englishSecondName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnglishSecondName(String value) {
        this.englishSecondName = value;
    }

    /**
     * Gets the value of the englishThirdName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnglishThirdName() {
        return englishThirdName;
    }

    /**
     * Sets the value of the englishThirdName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnglishThirdName(String value) {
        this.englishThirdName = value;
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
     * Gets the value of the thirdName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdName() {
        return thirdName;
    }

    /**
     * Sets the value of the thirdName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdName(String value) {
        this.thirdName = value;
    }

    /**
     * Gets the value of the workPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkPhone() {
        return workPhone;
    }

    /**
     * Sets the value of the workPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkPhone(String value) {
        this.workPhone = value;
    }

    /**
     * Gets the value of the simNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimNumber() {
        return simNumber;
    }

    /**
     * Sets the value of the simNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimNumber(String value) {
        this.simNumber = value;
    }

    /**
     * Gets the value of the imsi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImsi() {
        return imsi;
    }

    /**
     * Sets the value of the imsi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImsi(String value) {
        this.imsi = value;
    }

    /**
     * Gets the value of the blockedMSISDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockedMSISDN() {
        return blockedMSISDN;
    }

    /**
     * Sets the value of the blockedMSISDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockedMSISDN(String value) {
        this.blockedMSISDN = value;
    }

    /**
     * Gets the value of the msisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsisdn() {
        return msisdn;
    }

    /**
     * Sets the value of the msisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsisdn(String value) {
        this.msisdn = value;
    }

    /**
     * Gets the value of the billType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillType() {
        return billType;
    }

    /**
     * Sets the value of the billType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillType(String value) {
        this.billType = value;
    }

    /**
     * Gets the value of the billFreq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillFreq() {
        return billFreq;
    }

    /**
     * Sets the value of the billFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillFreq(String value) {
        this.billFreq = value;
    }

    /**
     * Gets the value of the creditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    /**
     * Sets the value of the creditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditLimit(BigDecimal value) {
        this.creditLimit = value;
    }

    /**
     * Gets the value of the billingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingDate() {
        return billingDate;
    }

    /**
     * Sets the value of the billingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingDate(String value) {
        this.billingDate = value;
    }

    /**
     * Gets the value of the tariffPlanID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTariffPlanID() {
        return tariffPlanID;
    }

    /**
     * Sets the value of the tariffPlanID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTariffPlanID(Long value) {
        this.tariffPlanID = value;
    }

    /**
     * Gets the value of the isSudo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsSudo() {
        return isSudo;
    }

    /**
     * Sets the value of the isSudo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsSudo(Long value) {
        this.isSudo = value;
    }

    /**
     * Gets the value of the frTransNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFRTransNo() {
        return frTransNo;
    }

    /**
     * Sets the value of the frTransNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFRTransNo(Long value) {
        this.frTransNo = value;
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
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the oldCCNDC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldCCNDC() {
        return oldCCNDC;
    }

    /**
     * Sets the value of the oldCCNDC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldCCNDC(String value) {
        this.oldCCNDC = value;
    }

    /**
     * Gets the value of the newCCNDC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewCCNDC() {
        return newCCNDC;
    }

    /**
     * Sets the value of the newCCNDC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewCCNDC(String value) {
        this.newCCNDC = value;
    }

    /**
     * Gets the value of the actualMsisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualMsisdn() {
        return actualMsisdn;
    }

    /**
     * Sets the value of the actualMsisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualMsisdn(String value) {
        this.actualMsisdn = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccountId(Long value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the pseudoMSISDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPseudoMSISDN() {
        return pseudoMSISDN;
    }

    /**
     * Sets the value of the pseudoMSISDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPseudoMSISDN(String value) {
        this.pseudoMSISDN = value;
    }

    /**
     * Gets the value of the gsmImsiTransNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGsmImsiTransNo() {
        return gsmImsiTransNo;
    }

    /**
     * Sets the value of the gsmImsiTransNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGsmImsiTransNo(String value) {
        this.gsmImsiTransNo = value;
    }

    /**
     * Gets the value of the gprsImsiTransNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGprsImsiTransNo() {
        return gprsImsiTransNo;
    }

    /**
     * Sets the value of the gprsImsiTransNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGprsImsiTransNo(String value) {
        this.gprsImsiTransNo = value;
    }

    /**
     * Gets the value of the transactionNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionNo() {
        return transactionNo;
    }

    /**
     * Sets the value of the transactionNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionNo(String value) {
        this.transactionNo = value;
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
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the iccStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIccStatus() {
        return iccStatus;
    }

    /**
     * Sets the value of the iccStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIccStatus(String value) {
        this.iccStatus = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setErrorCode(Long value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
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
     * Gets the value of the idExistsFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdExistsFlag() {
        return idExistsFlag;
    }

    /**
     * Sets the value of the idExistsFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdExistsFlag(String value) {
        this.idExistsFlag = value;
    }

    /**
     * Gets the value of the messageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageId(String value) {
        this.messageId = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountType(String value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the newMsisdnCCNDC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewMsisdnCCNDC() {
        return newMsisdnCCNDC;
    }

    /**
     * Sets the value of the newMsisdnCCNDC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewMsisdnCCNDC(String value) {
        this.newMsisdnCCNDC = value;
    }

    /**
     * Gets the value of the oldMsisdnCCNDC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldMsisdnCCNDC() {
        return oldMsisdnCCNDC;
    }

    /**
     * Sets the value of the oldMsisdnCCNDC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldMsisdnCCNDC(String value) {
        this.oldMsisdnCCNDC = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the newMDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewMDN() {
        return newMDN;
    }

    /**
     * Sets the value of the newMDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewMDN(String value) {
        this.newMDN = value;
    }

    /**
     * Gets the value of the oldMDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldMDN() {
        return oldMDN;
    }

    /**
     * Sets the value of the oldMDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldMDN(String value) {
        this.oldMDN = value;
    }

    /**
     * Gets the value of the requestType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestType() {
        return requestType;
    }

    /**
     * Sets the value of the requestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestType(String value) {
        this.requestType = value;
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
     * Gets the value of the smsLanguageId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSmsLanguageId() {
        return smsLanguageId;
    }

    /**
     * Sets the value of the smsLanguageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSmsLanguageId(Integer value) {
        this.smsLanguageId = value;
    }

    /**
     * Gets the value of the sendNotificationFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendNotificationFlag() {
        return sendNotificationFlag;
    }

    /**
     * Sets the value of the sendNotificationFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendNotificationFlag(Boolean value) {
        this.sendNotificationFlag = value;
    }

    /**
     * Gets the value of the isSendNotification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsSendNotification() {
        return isSendNotification;
    }

    /**
     * Sets the value of the isSendNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsSendNotification(String value) {
        this.isSendNotification = value;
    }

    /**
     * Gets the value of the messageConnFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageConnFlag() {
        return messageConnFlag;
    }

    /**
     * Sets the value of the messageConnFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageConnFlag(String value) {
        this.messageConnFlag = value;
    }

    /**
     * Gets the value of the goldenOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoldenOrderId() {
        return goldenOrderId;
    }

    /**
     * Sets the value of the goldenOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoldenOrderId(String value) {
        this.goldenOrderId = value;
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
     * Gets the value of the simCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimCategory() {
        return simCategory;
    }

    /**
     * Sets the value of the simCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimCategory(String value) {
        this.simCategory = value;
    }

    /**
     * Gets the value of the acctRetrievalType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctRetrievalType() {
        return acctRetrievalType;
    }

    /**
     * Sets the value of the acctRetrievalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctRetrievalType(String value) {
        this.acctRetrievalType = value;
    }

    /**
     * Gets the value of the retrievalType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetrievalType() {
        return retrievalType;
    }

    /**
     * Sets the value of the retrievalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetrievalType(String value) {
        this.retrievalType = value;
    }

    /**
     * Gets the value of the transactionData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionData() {
        return transactionData;
    }

    /**
     * Sets the value of the transactionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionData(String value) {
        this.transactionData = value;
    }

    /**
     * Gets the value of the newValidityDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewValidityDate() {
        return newValidityDate;
    }

    /**
     * Sets the value of the newValidityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewValidityDate(String value) {
        this.newValidityDate = value;
    }

    /**
     * Gets the value of the newGracePeroidIEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewGracePeroidIEndDate() {
        return newGracePeroidIEndDate;
    }

    /**
     * Sets the value of the newGracePeroidIEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewGracePeroidIEndDate(String value) {
        this.newGracePeroidIEndDate = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmount(Double value) {
        this.amount = value;
    }

    /**
     * Gets the value of the errorCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCategory() {
        return errorCategory;
    }

    /**
     * Sets the value of the errorCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCategory(String value) {
        this.errorCategory = value;
    }

    /**
     * Gets the value of the preferFourDigits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferFourDigits() {
        return preferFourDigits;
    }

    /**
     * Sets the value of the preferFourDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferFourDigits(String value) {
        this.preferFourDigits = value;
    }

    /**
     * Gets the value of the correlationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelationID() {
        return correlationID;
    }

    /**
     * Sets the value of the correlationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelationID(String value) {
        this.correlationID = value;
    }

    /**
     * Gets the value of the voucherPIN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoucherPIN() {
        return voucherPIN;
    }

    /**
     * Sets the value of the voucherPIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoucherPIN(String value) {
        this.voucherPIN = value;
    }

    /**
     * Gets the value of the provisionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvisionType() {
        return provisionType;
    }

    /**
     * Sets the value of the provisionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvisionType(String value) {
        this.provisionType = value;
    }

    /**
     * Gets the value of the transferorMSISDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferorMSISDN() {
        return transferorMSISDN;
    }

    /**
     * Sets the value of the transferorMSISDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferorMSISDN(String value) {
        this.transferorMSISDN = value;
    }

    /**
     * Gets the value of the transfereeMSISDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransfereeMSISDN() {
        return transfereeMSISDN;
    }

    /**
     * Sets the value of the transfereeMSISDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransfereeMSISDN(String value) {
        this.transfereeMSISDN = value;
    }

    /**
     * Gets the value of the ivrData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIvrData() {
        return ivrData;
    }

    /**
     * Sets the value of the ivrData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIvrData(String value) {
        this.ivrData = value;
    }

    /**
     * Gets the value of the vmsData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVmsData() {
        return vmsData;
    }

    /**
     * Sets the value of the vmsData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVmsData(String value) {
        this.vmsData = value;
    }

    /**
     * Gets the value of the indexNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIndexNo() {
        return indexNo;
    }

    /**
     * Sets the value of the indexNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIndexNo(Long value) {
        this.indexNo = value;
    }

    /**
     * Gets the value of the maxRecords property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxRecords() {
        return maxRecords;
    }

    /**
     * Sets the value of the maxRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxRecords(Long value) {
        this.maxRecords = value;
    }

    /**
     * Gets the value of the isCorp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCorp() {
        return isCorp;
    }

    /**
     * Sets the value of the isCorp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCorp(Boolean value) {
        this.isCorp = value;
    }

    /**
     * Gets the value of the ussdMDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUssdMDN() {
        return ussdMDN;
    }

    /**
     * Sets the value of the ussdMDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUssdMDN(String value) {
        this.ussdMDN = value;
    }

    /**
     * Gets the value of the hlrFrConnection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHlrFrConnection() {
        return hlrFrConnection;
    }

    /**
     * Sets the value of the hlrFrConnection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHlrFrConnection(String value) {
        this.hlrFrConnection = value;
    }

    /**
     * Gets the value of the creditAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCreditAmount() {
        return creditAmount;
    }

    /**
     * Sets the value of the creditAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCreditAmount(Double value) {
        this.creditAmount = value;
    }

    /**
     * Gets the value of the newExpDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewExpDate() {
        return newExpDate;
    }

    /**
     * Sets the value of the newExpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewExpDate(String value) {
        this.newExpDate = value;
    }

}
