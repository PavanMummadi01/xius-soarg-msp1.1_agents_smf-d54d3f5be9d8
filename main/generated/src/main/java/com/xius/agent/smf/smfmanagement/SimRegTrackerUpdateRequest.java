
package com.xius.agent.smf.smfmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for simRegTrackerUpdateRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="simRegTrackerUpdateRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transRefNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="failedNode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INITIATED_FROM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCOUNT_MDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SIM_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EVENT_FLAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NEW_PASSWORD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REGISTRATION_REQUIRED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ICC_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REGISTRATION_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCOUNT_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SC_ICCNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GOLDEN_ICC_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NORMAL_ORDER_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SUB_ACCOUNT_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HLR_FR_CONNECTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HLRFR_CONNECTION_ON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IS_CORP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ORDER_LIST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MSISDN_LIST_long" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="UTIL_LIST" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CHARGES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MSISDN_LIST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DEVICE_ID_KEY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NEW_VALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AUTHENTICATE_CARRIERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DT_FAILURE_ERROR_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DENOMINATIONS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TAX_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EMAIL_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BALANCE_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ORDER_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NEW_VALIDITY_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PORT_REQ_FORM_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PORT_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REJECTED_DATA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NPR_SUBM_TIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="THRESHOLD_TIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COMP_EMAIL_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NOTIFICATION_DATA_EMAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NEW_MDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FR_TRN_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NEW_CC_MSISDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OLD_CC_MSISDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OLD_IMSI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SERVICE_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IMSI_SIM_REGISTRATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OLD_IMSI_SIM_REGISTRATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACTUAL_MSISDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCOUNT_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BLOCKED_MSISDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CREDIT_LIMTI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OLD_CC_MDN_LIST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NEW_CC_MDN_LIST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PROMO_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="USSD_MDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DEALER_USER_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INPUT_ICC_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCOUNT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LOCATION_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TARIFF_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WORKGROUP_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IMEI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SALE_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRICE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="simisactual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="simpsuedo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invalidaccountstate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="updateproductstatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nokadidcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="getorderdetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inputpersonaldata" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="getaccountdetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requesttype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="networkname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="middlename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postpaid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldvalue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newimsi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subtransactionid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="iccid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imsi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="auditoldsim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="msisdn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="officecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="auditoldmsisdn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="auditnewmsisdn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="auditimsi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="auditaction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="auditiccid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="auditnewsim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="auditmsisdn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldmsisdn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newmsisdn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="failedmsisdnslistold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="failedmsisdnslistnew" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="issubscribed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flag5G" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returncode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="responsecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newsim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldsim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="externaltransid2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loginid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "simRegTrackerUpdateRequest", propOrder = {
    "transRefNumber",
    "status",
    "remarks",
    "failedNode",
    "initiatedfrom",
    "accountmdn",
    "simnumber",
    "eventflag",
    "newpassword",
    "registrationrequired",
    "iccno",
    "registrationtype",
    "accountstatus",
    "sciccno",
    "goldeniccno",
    "normalorderid",
    "subaccountstatus",
    "hlrfrconnection",
    "hlrfrconnectionon",
    "iscorp",
    "orderlist",
    "msisdnlistLong",
    "utillist",
    "charges",
    "msisdnlist",
    "deviceidkey",
    "newvalue",
    "authenticatecarrierid",
    "dtfailureerrorcode",
    "denominations",
    "taxid",
    "emailid",
    "balanceamount",
    "orderdate",
    "newvaliditydate",
    "portreqformid",
    "portid",
    "rejecteddata",
    "nprsubmtime",
    "thresholdtime",
    "compemailid",
    "notificationdataemail",
    "mdn",
    "newmdn",
    "frtrnno",
    "newccmsisdn",
    "oldccmsisdn",
    "oldimsi",
    "servicetype",
    "imsisimregistration",
    "oldimsisimregistration",
    "actualmsisdn",
    "accountid",
    "blockedmsisdn",
    "creditlimti",
    "oldccmdnlist",
    "newccmdnlist",
    "promocode",
    "ussdmdn",
    "dealeruserid",
    "inputiccno",
    "accounttype",
    "locationcode",
    "tariffid",
    "workgroupid",
    "imei",
    "saletype",
    "price",
    "simisactual",
    "simpsuedo",
    "invalidaccountstate",
    "reason",
    "updateproductstatus",
    "nokadidcode",
    "getorderdetails",
    "errorcode",
    "inputpersonaldata",
    "getaccountdetails",
    "requesttype",
    "username",
    "networkname",
    "middlename",
    "postpaid",
    "oldvalue",
    "newimsi",
    "transactionid",
    "subtransactionid",
    "iccid",
    "imsi",
    "auditoldsim",
    "msisdn",
    "officecode",
    "auditoldmsisdn",
    "auditnewmsisdn",
    "auditimsi",
    "auditaction",
    "auditiccid",
    "data",
    "auditnewsim",
    "auditmsisdn",
    "oldmsisdn",
    "newmsisdn",
    "failedmsisdnslistold",
    "failedmsisdnslistnew",
    "issubscribed",
    "flag5G",
    "returncode",
    "responsecode",
    "newsim",
    "oldsim",
    "externaltransid2",
    "loginid",
    "active",
    "userid",
    "content",
    "zipCode",
    "errorCode"
})
public class SimRegTrackerUpdateRequest {

    @XmlElement(required = true)
    protected String transRefNumber;
    protected String status;
    protected String remarks;
    protected String failedNode;
    @XmlElement(name = "INITIATED_FROM")
    protected String initiatedfrom;
    @XmlElement(name = "ACCOUNT_MDN")
    protected String accountmdn;
    @XmlElement(name = "SIM_NUMBER")
    protected String simnumber;
    @XmlElement(name = "EVENT_FLAG")
    protected String eventflag;
    @XmlElement(name = "NEW_PASSWORD")
    protected String newpassword;
    @XmlElement(name = "REGISTRATION_REQUIRED")
    protected String registrationrequired;
    @XmlElement(name = "ICC_NO")
    protected String iccno;
    @XmlElement(name = "REGISTRATION_TYPE")
    protected String registrationtype;
    @XmlElement(name = "ACCOUNT_STATUS")
    protected String accountstatus;
    @XmlElement(name = "SC_ICCNO")
    protected String sciccno;
    @XmlElement(name = "GOLDEN_ICC_NO")
    protected String goldeniccno;
    @XmlElement(name = "NORMAL_ORDER_ID")
    protected String normalorderid;
    @XmlElement(name = "SUB_ACCOUNT_STATUS")
    protected String subaccountstatus;
    @XmlElement(name = "HLR_FR_CONNECTION")
    protected String hlrfrconnection;
    @XmlElement(name = "HLRFR_CONNECTION_ON")
    protected String hlrfrconnectionon;
    @XmlElement(name = "IS_CORP")
    protected String iscorp;
    @XmlElement(name = "ORDER_LIST")
    protected String orderlist;
    @XmlElement(name = "MSISDN_LIST_long")
    protected Long msisdnlistLong;
    @XmlElement(name = "UTIL_LIST")
    protected Long utillist;
    @XmlElement(name = "CHARGES")
    protected String charges;
    @XmlElement(name = "MSISDN_LIST")
    protected String msisdnlist;
    @XmlElement(name = "DEVICE_ID_KEY")
    protected String deviceidkey;
    @XmlElement(name = "NEW_VALUE")
    protected String newvalue;
    @XmlElement(name = "AUTHENTICATE_CARRIERID")
    protected String authenticatecarrierid;
    @XmlElement(name = "DT_FAILURE_ERROR_CODE")
    protected String dtfailureerrorcode;
    @XmlElement(name = "DENOMINATIONS")
    protected String denominations;
    @XmlElement(name = "TAX_ID")
    protected String taxid;
    @XmlElement(name = "EMAIL_ID")
    protected String emailid;
    @XmlElement(name = "BALANCE_AMOUNT")
    protected String balanceamount;
    @XmlElement(name = "ORDER_DATE")
    protected String orderdate;
    @XmlElement(name = "NEW_VALIDITY_DATE")
    protected String newvaliditydate;
    @XmlElement(name = "PORT_REQ_FORM_ID")
    protected String portreqformid;
    @XmlElement(name = "PORT_ID")
    protected String portid;
    @XmlElement(name = "REJECTED_DATA")
    protected String rejecteddata;
    @XmlElement(name = "NPR_SUBM_TIME")
    protected String nprsubmtime;
    @XmlElement(name = "THRESHOLD_TIME")
    protected String thresholdtime;
    @XmlElement(name = "COMP_EMAIL_ID")
    protected String compemailid;
    @XmlElement(name = "NOTIFICATION_DATA_EMAIL")
    protected String notificationdataemail;
    @XmlElement(name = "MDN")
    protected String mdn;
    @XmlElement(name = "NEW_MDN")
    protected String newmdn;
    @XmlElement(name = "FR_TRN_NO")
    protected String frtrnno;
    @XmlElement(name = "NEW_CC_MSISDN")
    protected String newccmsisdn;
    @XmlElement(name = "OLD_CC_MSISDN")
    protected String oldccmsisdn;
    @XmlElement(name = "OLD_IMSI")
    protected String oldimsi;
    @XmlElement(name = "SERVICE_TYPE")
    protected String servicetype;
    @XmlElement(name = "IMSI_SIM_REGISTRATION")
    protected String imsisimregistration;
    @XmlElement(name = "OLD_IMSI_SIM_REGISTRATION")
    protected String oldimsisimregistration;
    @XmlElement(name = "ACTUAL_MSISDN")
    protected String actualmsisdn;
    @XmlElement(name = "ACCOUNT_ID")
    protected String accountid;
    @XmlElement(name = "BLOCKED_MSISDN")
    protected String blockedmsisdn;
    @XmlElement(name = "CREDIT_LIMTI")
    protected String creditlimti;
    @XmlElement(name = "OLD_CC_MDN_LIST")
    protected String oldccmdnlist;
    @XmlElement(name = "NEW_CC_MDN_LIST")
    protected String newccmdnlist;
    @XmlElement(name = "PROMO_CODE")
    protected String promocode;
    @XmlElement(name = "USSD_MDN")
    protected String ussdmdn;
    @XmlElement(name = "DEALER_USER_ID")
    protected String dealeruserid;
    @XmlElement(name = "INPUT_ICC_NO")
    protected String inputiccno;
    @XmlElement(name = "ACCOUNT_TYPE")
    protected String accounttype;
    @XmlElement(name = "LOCATION_CODE")
    protected String locationcode;
    @XmlElement(name = "TARIFF_ID")
    protected String tariffid;
    @XmlElement(name = "WORKGROUP_ID")
    protected String workgroupid;
    @XmlElement(name = "IMEI")
    protected String imei;
    @XmlElement(name = "SALE_TYPE")
    protected String saletype;
    @XmlElement(name = "PRICE")
    protected String price;
    protected String simisactual;
    protected String simpsuedo;
    protected String invalidaccountstate;
    protected String reason;
    protected String updateproductstatus;
    protected String nokadidcode;
    protected String getorderdetails;
    protected String errorcode;
    protected String inputpersonaldata;
    protected String getaccountdetails;
    protected String requesttype;
    protected String username;
    protected String networkname;
    protected String middlename;
    protected String postpaid;
    protected String oldvalue;
    protected String newimsi;
    protected String transactionid;
    protected String subtransactionid;
    protected String iccid;
    protected String imsi;
    protected String auditoldsim;
    protected String msisdn;
    protected String officecode;
    protected String auditoldmsisdn;
    protected String auditnewmsisdn;
    protected String auditimsi;
    protected String auditaction;
    protected String auditiccid;
    protected String data;
    protected String auditnewsim;
    protected String auditmsisdn;
    protected String oldmsisdn;
    protected String newmsisdn;
    protected String failedmsisdnslistold;
    protected String failedmsisdnslistnew;
    protected String issubscribed;
    protected String flag5G;
    protected String returncode;
    protected String responsecode;
    protected String newsim;
    protected String oldsim;
    protected String externaltransid2;
    protected String loginid;
    protected String active;
    protected String userid;
    protected String content;
    protected String zipCode;
    protected String errorCode;

    /**
     * Gets the value of the transRefNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransRefNumber() {
        return transRefNumber;
    }

    /**
     * Sets the value of the transRefNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransRefNumber(String value) {
        this.transRefNumber = value;
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
     * Gets the value of the initiatedfrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINITIATEDFROM() {
        return initiatedfrom;
    }

    /**
     * Sets the value of the initiatedfrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINITIATEDFROM(String value) {
        this.initiatedfrom = value;
    }

    /**
     * Gets the value of the accountmdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOUNTMDN() {
        return accountmdn;
    }

    /**
     * Sets the value of the accountmdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNTMDN(String value) {
        this.accountmdn = value;
    }

    /**
     * Gets the value of the simnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIMNUMBER() {
        return simnumber;
    }

    /**
     * Sets the value of the simnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIMNUMBER(String value) {
        this.simnumber = value;
    }

    /**
     * Gets the value of the eventflag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEVENTFLAG() {
        return eventflag;
    }

    /**
     * Sets the value of the eventflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEVENTFLAG(String value) {
        this.eventflag = value;
    }

    /**
     * Gets the value of the newpassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNEWPASSWORD() {
        return newpassword;
    }

    /**
     * Sets the value of the newpassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNEWPASSWORD(String value) {
        this.newpassword = value;
    }

    /**
     * Gets the value of the registrationrequired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREGISTRATIONREQUIRED() {
        return registrationrequired;
    }

    /**
     * Sets the value of the registrationrequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREGISTRATIONREQUIRED(String value) {
        this.registrationrequired = value;
    }

    /**
     * Gets the value of the iccno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICCNO() {
        return iccno;
    }

    /**
     * Sets the value of the iccno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICCNO(String value) {
        this.iccno = value;
    }

    /**
     * Gets the value of the registrationtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREGISTRATIONTYPE() {
        return registrationtype;
    }

    /**
     * Sets the value of the registrationtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREGISTRATIONTYPE(String value) {
        this.registrationtype = value;
    }

    /**
     * Gets the value of the accountstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOUNTSTATUS() {
        return accountstatus;
    }

    /**
     * Sets the value of the accountstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNTSTATUS(String value) {
        this.accountstatus = value;
    }

    /**
     * Gets the value of the sciccno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCICCNO() {
        return sciccno;
    }

    /**
     * Sets the value of the sciccno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCICCNO(String value) {
        this.sciccno = value;
    }

    /**
     * Gets the value of the goldeniccno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGOLDENICCNO() {
        return goldeniccno;
    }

    /**
     * Sets the value of the goldeniccno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGOLDENICCNO(String value) {
        this.goldeniccno = value;
    }

    /**
     * Gets the value of the normalorderid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNORMALORDERID() {
        return normalorderid;
    }

    /**
     * Sets the value of the normalorderid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNORMALORDERID(String value) {
        this.normalorderid = value;
    }

    /**
     * Gets the value of the subaccountstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUBACCOUNTSTATUS() {
        return subaccountstatus;
    }

    /**
     * Sets the value of the subaccountstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUBACCOUNTSTATUS(String value) {
        this.subaccountstatus = value;
    }

    /**
     * Gets the value of the hlrfrconnection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHLRFRCONNECTION() {
        return hlrfrconnection;
    }

    /**
     * Sets the value of the hlrfrconnection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHLRFRCONNECTION(String value) {
        this.hlrfrconnection = value;
    }

    /**
     * Gets the value of the hlrfrconnectionon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHLRFRCONNECTIONON() {
        return hlrfrconnectionon;
    }

    /**
     * Sets the value of the hlrfrconnectionon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHLRFRCONNECTIONON(String value) {
        this.hlrfrconnectionon = value;
    }

    /**
     * Gets the value of the iscorp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISCORP() {
        return iscorp;
    }

    /**
     * Sets the value of the iscorp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISCORP(String value) {
        this.iscorp = value;
    }

    /**
     * Gets the value of the orderlist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORDERLIST() {
        return orderlist;
    }

    /**
     * Sets the value of the orderlist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORDERLIST(String value) {
        this.orderlist = value;
    }

    /**
     * Gets the value of the msisdnlistLong property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMSISDNLISTLong() {
        return msisdnlistLong;
    }

    /**
     * Sets the value of the msisdnlistLong property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMSISDNLISTLong(Long value) {
        this.msisdnlistLong = value;
    }

    /**
     * Gets the value of the utillist property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUTILLIST() {
        return utillist;
    }

    /**
     * Sets the value of the utillist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUTILLIST(Long value) {
        this.utillist = value;
    }

    /**
     * Gets the value of the charges property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHARGES() {
        return charges;
    }

    /**
     * Sets the value of the charges property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHARGES(String value) {
        this.charges = value;
    }

    /**
     * Gets the value of the msisdnlist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSISDNLIST() {
        return msisdnlist;
    }

    /**
     * Sets the value of the msisdnlist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSISDNLIST(String value) {
        this.msisdnlist = value;
    }

    /**
     * Gets the value of the deviceidkey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEVICEIDKEY() {
        return deviceidkey;
    }

    /**
     * Sets the value of the deviceidkey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEVICEIDKEY(String value) {
        this.deviceidkey = value;
    }

    /**
     * Gets the value of the newvalue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNEWVALUE() {
        return newvalue;
    }

    /**
     * Sets the value of the newvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNEWVALUE(String value) {
        this.newvalue = value;
    }

    /**
     * Gets the value of the authenticatecarrierid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTHENTICATECARRIERID() {
        return authenticatecarrierid;
    }

    /**
     * Sets the value of the authenticatecarrierid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTHENTICATECARRIERID(String value) {
        this.authenticatecarrierid = value;
    }

    /**
     * Gets the value of the dtfailureerrorcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTFAILUREERRORCODE() {
        return dtfailureerrorcode;
    }

    /**
     * Sets the value of the dtfailureerrorcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTFAILUREERRORCODE(String value) {
        this.dtfailureerrorcode = value;
    }

    /**
     * Gets the value of the denominations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDENOMINATIONS() {
        return denominations;
    }

    /**
     * Sets the value of the denominations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDENOMINATIONS(String value) {
        this.denominations = value;
    }

    /**
     * Gets the value of the taxid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAXID() {
        return taxid;
    }

    /**
     * Sets the value of the taxid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAXID(String value) {
        this.taxid = value;
    }

    /**
     * Gets the value of the emailid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMAILID() {
        return emailid;
    }

    /**
     * Sets the value of the emailid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMAILID(String value) {
        this.emailid = value;
    }

    /**
     * Gets the value of the balanceamount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBALANCEAMOUNT() {
        return balanceamount;
    }

    /**
     * Sets the value of the balanceamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBALANCEAMOUNT(String value) {
        this.balanceamount = value;
    }

    /**
     * Gets the value of the orderdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORDERDATE() {
        return orderdate;
    }

    /**
     * Sets the value of the orderdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORDERDATE(String value) {
        this.orderdate = value;
    }

    /**
     * Gets the value of the newvaliditydate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNEWVALIDITYDATE() {
        return newvaliditydate;
    }

    /**
     * Sets the value of the newvaliditydate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNEWVALIDITYDATE(String value) {
        this.newvaliditydate = value;
    }

    /**
     * Gets the value of the portreqformid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPORTREQFORMID() {
        return portreqformid;
    }

    /**
     * Sets the value of the portreqformid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPORTREQFORMID(String value) {
        this.portreqformid = value;
    }

    /**
     * Gets the value of the portid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPORTID() {
        return portid;
    }

    /**
     * Sets the value of the portid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPORTID(String value) {
        this.portid = value;
    }

    /**
     * Gets the value of the rejecteddata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREJECTEDDATA() {
        return rejecteddata;
    }

    /**
     * Sets the value of the rejecteddata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREJECTEDDATA(String value) {
        this.rejecteddata = value;
    }

    /**
     * Gets the value of the nprsubmtime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNPRSUBMTIME() {
        return nprsubmtime;
    }

    /**
     * Sets the value of the nprsubmtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNPRSUBMTIME(String value) {
        this.nprsubmtime = value;
    }

    /**
     * Gets the value of the thresholdtime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTHRESHOLDTIME() {
        return thresholdtime;
    }

    /**
     * Sets the value of the thresholdtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTHRESHOLDTIME(String value) {
        this.thresholdtime = value;
    }

    /**
     * Gets the value of the compemailid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMPEMAILID() {
        return compemailid;
    }

    /**
     * Sets the value of the compemailid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMPEMAILID(String value) {
        this.compemailid = value;
    }

    /**
     * Gets the value of the notificationdataemail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOTIFICATIONDATAEMAIL() {
        return notificationdataemail;
    }

    /**
     * Sets the value of the notificationdataemail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOTIFICATIONDATAEMAIL(String value) {
        this.notificationdataemail = value;
    }

    /**
     * Gets the value of the mdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDN() {
        return mdn;
    }

    /**
     * Sets the value of the mdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDN(String value) {
        this.mdn = value;
    }

    /**
     * Gets the value of the newmdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNEWMDN() {
        return newmdn;
    }

    /**
     * Sets the value of the newmdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNEWMDN(String value) {
        this.newmdn = value;
    }

    /**
     * Gets the value of the frtrnno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFRTRNNO() {
        return frtrnno;
    }

    /**
     * Sets the value of the frtrnno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFRTRNNO(String value) {
        this.frtrnno = value;
    }

    /**
     * Gets the value of the newccmsisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNEWCCMSISDN() {
        return newccmsisdn;
    }

    /**
     * Sets the value of the newccmsisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNEWCCMSISDN(String value) {
        this.newccmsisdn = value;
    }

    /**
     * Gets the value of the oldccmsisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOLDCCMSISDN() {
        return oldccmsisdn;
    }

    /**
     * Sets the value of the oldccmsisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOLDCCMSISDN(String value) {
        this.oldccmsisdn = value;
    }

    /**
     * Gets the value of the oldimsi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOLDIMSI() {
        return oldimsi;
    }

    /**
     * Sets the value of the oldimsi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOLDIMSI(String value) {
        this.oldimsi = value;
    }

    /**
     * Gets the value of the servicetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSERVICETYPE() {
        return servicetype;
    }

    /**
     * Sets the value of the servicetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSERVICETYPE(String value) {
        this.servicetype = value;
    }

    /**
     * Gets the value of the imsisimregistration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMSISIMREGISTRATION() {
        return imsisimregistration;
    }

    /**
     * Sets the value of the imsisimregistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMSISIMREGISTRATION(String value) {
        this.imsisimregistration = value;
    }

    /**
     * Gets the value of the oldimsisimregistration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOLDIMSISIMREGISTRATION() {
        return oldimsisimregistration;
    }

    /**
     * Sets the value of the oldimsisimregistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOLDIMSISIMREGISTRATION(String value) {
        this.oldimsisimregistration = value;
    }

    /**
     * Gets the value of the actualmsisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACTUALMSISDN() {
        return actualmsisdn;
    }

    /**
     * Sets the value of the actualmsisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACTUALMSISDN(String value) {
        this.actualmsisdn = value;
    }

    /**
     * Gets the value of the accountid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOUNTID() {
        return accountid;
    }

    /**
     * Sets the value of the accountid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNTID(String value) {
        this.accountid = value;
    }

    /**
     * Gets the value of the blockedmsisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBLOCKEDMSISDN() {
        return blockedmsisdn;
    }

    /**
     * Sets the value of the blockedmsisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBLOCKEDMSISDN(String value) {
        this.blockedmsisdn = value;
    }

    /**
     * Gets the value of the creditlimti property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCREDITLIMTI() {
        return creditlimti;
    }

    /**
     * Sets the value of the creditlimti property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCREDITLIMTI(String value) {
        this.creditlimti = value;
    }

    /**
     * Gets the value of the oldccmdnlist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOLDCCMDNLIST() {
        return oldccmdnlist;
    }

    /**
     * Sets the value of the oldccmdnlist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOLDCCMDNLIST(String value) {
        this.oldccmdnlist = value;
    }

    /**
     * Gets the value of the newccmdnlist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNEWCCMDNLIST() {
        return newccmdnlist;
    }

    /**
     * Sets the value of the newccmdnlist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNEWCCMDNLIST(String value) {
        this.newccmdnlist = value;
    }

    /**
     * Gets the value of the promocode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROMOCODE() {
        return promocode;
    }

    /**
     * Sets the value of the promocode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROMOCODE(String value) {
        this.promocode = value;
    }

    /**
     * Gets the value of the ussdmdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSSDMDN() {
        return ussdmdn;
    }

    /**
     * Sets the value of the ussdmdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSSDMDN(String value) {
        this.ussdmdn = value;
    }

    /**
     * Gets the value of the dealeruserid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEALERUSERID() {
        return dealeruserid;
    }

    /**
     * Sets the value of the dealeruserid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEALERUSERID(String value) {
        this.dealeruserid = value;
    }

    /**
     * Gets the value of the inputiccno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINPUTICCNO() {
        return inputiccno;
    }

    /**
     * Sets the value of the inputiccno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINPUTICCNO(String value) {
        this.inputiccno = value;
    }

    /**
     * Gets the value of the accounttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOUNTTYPE() {
        return accounttype;
    }

    /**
     * Sets the value of the accounttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNTTYPE(String value) {
        this.accounttype = value;
    }

    /**
     * Gets the value of the locationcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCATIONCODE() {
        return locationcode;
    }

    /**
     * Sets the value of the locationcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCATIONCODE(String value) {
        this.locationcode = value;
    }

    /**
     * Gets the value of the tariffid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTARIFFID() {
        return tariffid;
    }

    /**
     * Sets the value of the tariffid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTARIFFID(String value) {
        this.tariffid = value;
    }

    /**
     * Gets the value of the workgroupid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWORKGROUPID() {
        return workgroupid;
    }

    /**
     * Sets the value of the workgroupid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWORKGROUPID(String value) {
        this.workgroupid = value;
    }

    /**
     * Gets the value of the imei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMEI() {
        return imei;
    }

    /**
     * Sets the value of the imei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMEI(String value) {
        this.imei = value;
    }

    /**
     * Gets the value of the saletype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSALETYPE() {
        return saletype;
    }

    /**
     * Sets the value of the saletype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSALETYPE(String value) {
        this.saletype = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRICE() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRICE(String value) {
        this.price = value;
    }

    /**
     * Gets the value of the simisactual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimisactual() {
        return simisactual;
    }

    /**
     * Sets the value of the simisactual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimisactual(String value) {
        this.simisactual = value;
    }

    /**
     * Gets the value of the simpsuedo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimpsuedo() {
        return simpsuedo;
    }

    /**
     * Sets the value of the simpsuedo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimpsuedo(String value) {
        this.simpsuedo = value;
    }

    /**
     * Gets the value of the invalidaccountstate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvalidaccountstate() {
        return invalidaccountstate;
    }

    /**
     * Sets the value of the invalidaccountstate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvalidaccountstate(String value) {
        this.invalidaccountstate = value;
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
     * Gets the value of the updateproductstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateproductstatus() {
        return updateproductstatus;
    }

    /**
     * Sets the value of the updateproductstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateproductstatus(String value) {
        this.updateproductstatus = value;
    }

    /**
     * Gets the value of the nokadidcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNokadidcode() {
        return nokadidcode;
    }

    /**
     * Sets the value of the nokadidcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNokadidcode(String value) {
        this.nokadidcode = value;
    }

    /**
     * Gets the value of the getorderdetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetorderdetails() {
        return getorderdetails;
    }

    /**
     * Sets the value of the getorderdetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetorderdetails(String value) {
        this.getorderdetails = value;
    }

    /**
     * Gets the value of the errorcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorcode() {
        return errorcode;
    }

    /**
     * Sets the value of the errorcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorcode(String value) {
        this.errorcode = value;
    }

    /**
     * Gets the value of the inputpersonaldata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputpersonaldata() {
        return inputpersonaldata;
    }

    /**
     * Sets the value of the inputpersonaldata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputpersonaldata(String value) {
        this.inputpersonaldata = value;
    }

    /**
     * Gets the value of the getaccountdetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetaccountdetails() {
        return getaccountdetails;
    }

    /**
     * Sets the value of the getaccountdetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetaccountdetails(String value) {
        this.getaccountdetails = value;
    }

    /**
     * Gets the value of the requesttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequesttype() {
        return requesttype;
    }

    /**
     * Sets the value of the requesttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequesttype(String value) {
        this.requesttype = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the networkname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkname() {
        return networkname;
    }

    /**
     * Sets the value of the networkname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkname(String value) {
        this.networkname = value;
    }

    /**
     * Gets the value of the middlename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddlename() {
        return middlename;
    }

    /**
     * Sets the value of the middlename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddlename(String value) {
        this.middlename = value;
    }

    /**
     * Gets the value of the postpaid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostpaid() {
        return postpaid;
    }

    /**
     * Sets the value of the postpaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostpaid(String value) {
        this.postpaid = value;
    }

    /**
     * Gets the value of the oldvalue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldvalue() {
        return oldvalue;
    }

    /**
     * Sets the value of the oldvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldvalue(String value) {
        this.oldvalue = value;
    }

    /**
     * Gets the value of the newimsi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewimsi() {
        return newimsi;
    }

    /**
     * Sets the value of the newimsi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewimsi(String value) {
        this.newimsi = value;
    }

    /**
     * Gets the value of the transactionid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionid() {
        return transactionid;
    }

    /**
     * Sets the value of the transactionid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionid(String value) {
        this.transactionid = value;
    }

    /**
     * Gets the value of the subtransactionid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtransactionid() {
        return subtransactionid;
    }

    /**
     * Sets the value of the subtransactionid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtransactionid(String value) {
        this.subtransactionid = value;
    }

    /**
     * Gets the value of the iccid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIccid() {
        return iccid;
    }

    /**
     * Sets the value of the iccid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIccid(String value) {
        this.iccid = value;
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
     * Gets the value of the auditoldsim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditoldsim() {
        return auditoldsim;
    }

    /**
     * Sets the value of the auditoldsim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditoldsim(String value) {
        this.auditoldsim = value;
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
     * Gets the value of the officecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficecode() {
        return officecode;
    }

    /**
     * Sets the value of the officecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficecode(String value) {
        this.officecode = value;
    }

    /**
     * Gets the value of the auditoldmsisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditoldmsisdn() {
        return auditoldmsisdn;
    }

    /**
     * Sets the value of the auditoldmsisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditoldmsisdn(String value) {
        this.auditoldmsisdn = value;
    }

    /**
     * Gets the value of the auditnewmsisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditnewmsisdn() {
        return auditnewmsisdn;
    }

    /**
     * Sets the value of the auditnewmsisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditnewmsisdn(String value) {
        this.auditnewmsisdn = value;
    }

    /**
     * Gets the value of the auditimsi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditimsi() {
        return auditimsi;
    }

    /**
     * Sets the value of the auditimsi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditimsi(String value) {
        this.auditimsi = value;
    }

    /**
     * Gets the value of the auditaction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditaction() {
        return auditaction;
    }

    /**
     * Sets the value of the auditaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditaction(String value) {
        this.auditaction = value;
    }

    /**
     * Gets the value of the auditiccid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditiccid() {
        return auditiccid;
    }

    /**
     * Sets the value of the auditiccid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditiccid(String value) {
        this.auditiccid = value;
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

    /**
     * Gets the value of the auditnewsim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditnewsim() {
        return auditnewsim;
    }

    /**
     * Sets the value of the auditnewsim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditnewsim(String value) {
        this.auditnewsim = value;
    }

    /**
     * Gets the value of the auditmsisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditmsisdn() {
        return auditmsisdn;
    }

    /**
     * Sets the value of the auditmsisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditmsisdn(String value) {
        this.auditmsisdn = value;
    }

    /**
     * Gets the value of the oldmsisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldmsisdn() {
        return oldmsisdn;
    }

    /**
     * Sets the value of the oldmsisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldmsisdn(String value) {
        this.oldmsisdn = value;
    }

    /**
     * Gets the value of the newmsisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewmsisdn() {
        return newmsisdn;
    }

    /**
     * Sets the value of the newmsisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewmsisdn(String value) {
        this.newmsisdn = value;
    }

    /**
     * Gets the value of the failedmsisdnslistold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailedmsisdnslistold() {
        return failedmsisdnslistold;
    }

    /**
     * Sets the value of the failedmsisdnslistold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailedmsisdnslistold(String value) {
        this.failedmsisdnslistold = value;
    }

    /**
     * Gets the value of the failedmsisdnslistnew property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailedmsisdnslistnew() {
        return failedmsisdnslistnew;
    }

    /**
     * Sets the value of the failedmsisdnslistnew property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailedmsisdnslistnew(String value) {
        this.failedmsisdnslistnew = value;
    }

    /**
     * Gets the value of the issubscribed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssubscribed() {
        return issubscribed;
    }

    /**
     * Sets the value of the issubscribed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssubscribed(String value) {
        this.issubscribed = value;
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
     * Gets the value of the returncode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturncode() {
        return returncode;
    }

    /**
     * Sets the value of the returncode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturncode(String value) {
        this.returncode = value;
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
     * Gets the value of the newsim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewsim() {
        return newsim;
    }

    /**
     * Sets the value of the newsim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewsim(String value) {
        this.newsim = value;
    }

    /**
     * Gets the value of the oldsim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldsim() {
        return oldsim;
    }

    /**
     * Sets the value of the oldsim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldsim(String value) {
        this.oldsim = value;
    }

    /**
     * Gets the value of the externaltransid2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternaltransid2() {
        return externaltransid2;
    }

    /**
     * Sets the value of the externaltransid2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternaltransid2(String value) {
        this.externaltransid2 = value;
    }

    /**
     * Gets the value of the loginid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginid() {
        return loginid;
    }

    /**
     * Sets the value of the loginid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginid(String value) {
        this.loginid = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActive(String value) {
        this.active = value;
    }

    /**
     * Gets the value of the userid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserid() {
        return userid;
    }

    /**
     * Sets the value of the userid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserid(String value) {
        this.userid = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Gets the value of the zipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

}
