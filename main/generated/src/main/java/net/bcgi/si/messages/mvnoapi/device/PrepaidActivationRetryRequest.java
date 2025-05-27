/**
 * PrepaidActivationRetryRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.device;

public class PrepaidActivationRetryRequest  implements java.io.Serializable {
    private java.lang.String ATPId;

    private java.lang.String SNA;

    private java.lang.String accountId;

    private java.lang.String accountMdn;

    private java.lang.String accountStatus;

    private java.lang.String active;

    private java.lang.String actualMsisdn;

    private net.bcgi.si.messages.mvnoapi.provisioning.SubcriberAddressInfo addressInfo;

    private java.lang.String atpId;

    private java.lang.String auditaction;

    private java.lang.String auditiccid;

    private java.lang.String auditimsi;

    private java.lang.String auditmsisdn;

    private java.lang.String auditnewmsisdn;

    private java.lang.String auditnewsim;

    private java.lang.String auditoldmsisdn;

    private java.lang.String auditoldsim;

    private java.lang.String authenticateCarrierid;

    private java.lang.String balanceAmount;

    private java.lang.String billDay;

    private java.lang.String blockedMsisdn;

    private java.lang.String channel;

    private java.lang.String charges;

    private java.lang.String compEmailId;

    private java.lang.String content;

    private java.lang.String creditLimti;

    private java.lang.String data;

    private java.lang.String dealerUserId;

    private java.lang.String denominations;

    private java.lang.String deviceIdKey;

    private java.lang.String dtFailureErrorCode;

    private java.lang.String errorcode;

    private java.lang.String eventFlag;

    private java.lang.String externaltransid2;

    private java.lang.String failedNode;

    private java.lang.String failedmsisdnslistnew;

    private java.lang.String failedmsisdnslistold;

    private java.lang.String flag5G;

    private java.lang.String frTrnNo;

    private java.lang.String getaccountdetails;

    private java.lang.String getorderdetails;

    private java.lang.String goldenIccno;

    private java.lang.String hlrfrConnection;

    private java.lang.String hlrfrConnectionOn;

    private java.lang.String iccNo;

    private java.lang.String iccid;

    private java.lang.String imei;

    private java.lang.String imsi;

    private java.lang.String imsiSimRegistration;

    private java.lang.String initiatedFrom;

    private java.lang.String inputIccNo;

    private java.lang.String inputpersonaldata;

    private java.lang.String invalidaccountstate;

    private java.lang.String isCorp;

    private java.lang.String issubscribed;

    private java.lang.String locationCode;

    private java.lang.String loginid;

    private java.lang.String mdn;

    private java.lang.String messageID;

    private java.lang.String middlename;

    private java.lang.String msisdn;

    private net.bcgi.si.messages.mvnoapi.provisioning.MSISDNInfo msisdnInfo;

    private java.lang.String msisdnlist;

    private java.lang.String msisdnlistlong;

    private java.lang.String networkName;

    private java.lang.String networkid;

    private java.lang.String networkname;

    private java.lang.String newCCMMdnList;

    private java.lang.String newCCmsisdn;

    private java.lang.String newMdn;

    private java.lang.String newPassword;

    private java.lang.String newValidityDate;

    private java.lang.String newValue;

    private java.lang.String newimsi;

    private java.lang.String newmsisdn;

    private java.lang.String newsim;

    private java.lang.String nokadidcode;

    private java.lang.String normalOrderId;

    private java.lang.String notificationDataEmail;

    private java.lang.String nprSubmTime;

    private java.lang.String officeCode;

    private java.lang.String officecode;

    private java.lang.String oldCCMMdnList;

    private java.lang.String oldCCmsisdn;

    private java.lang.String oldIMSI;

    private java.lang.String oldImsiSimRegistration;

    private java.lang.String oldmdn;

    private java.lang.String oldmsisdn;

    private java.lang.String oldsim;

    private java.lang.String oldvalue;

    private java.lang.String orderDate;

    private java.lang.String orderID;

    private java.lang.String orderList;

    private net.bcgi.si.messages.mvnoapi.provisioning.SubscriberOtherInfo otherInfo;

    private net.bcgi.si.messages.mvnoapi.provisioning.SubcriberPersonalInfo personalInfo;

    private java.lang.String portId;

    private java.lang.String portReqFormId;

    private java.lang.String postpaid;

    private java.lang.String price;

    private java.lang.String promoCode;

    private java.lang.String reason;

    private java.lang.Boolean registrationRequired;

    private net.bcgi.si.messages.mvnoapi.provisioning.RegistrationType registrationType;

    private java.lang.String rejectedData;

    private java.lang.String requesttype;

    private java.lang.String responsecode;

    private java.lang.String returncode;

    private java.lang.String saleType;

    private java.lang.String scIccno;

    private net.bcgi.si.messages.mvnoapi.common.SecurityId securityId;

    private net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext;

    private java.lang.String serviceType;

    private java.lang.String simisactual;

    private java.lang.String simpsuedo;

    private java.lang.String sna;

    private java.lang.String subAccountStatus;

    private net.bcgi.si.messages.mvnoapi.common.SelfcareAccountStatusType subscriberStatus;

    private java.lang.String subtransactionid;

    private java.lang.String tariffPackageId;

    private java.lang.String taxId;

    private java.lang.String thresholdTime;

    private java.lang.String transRefNumber;

    private java.lang.String transactionID;

    private java.lang.String transactionid;

    private java.lang.String updateproductstatus;

    private java.lang.String userAccountName;

    private java.lang.String userAccountPassword;

    private java.lang.String userDefined1;

    private java.lang.String userDefined2;

    private java.lang.String userDefined3;

    private java.lang.String userType;

    private java.lang.String userid;

    private java.lang.String username;

    private java.lang.String ussdMdn;

    private java.lang.String utilList;

    private java.lang.String version;

    private java.lang.String workgroupId;

    private java.lang.String zipcode;

    public PrepaidActivationRetryRequest() {
    }

    public PrepaidActivationRetryRequest(
           java.lang.String ATPId,
           java.lang.String SNA,
           java.lang.String accountId,
           java.lang.String accountMdn,
           java.lang.String accountStatus,
           java.lang.String active,
           java.lang.String actualMsisdn,
           net.bcgi.si.messages.mvnoapi.provisioning.SubcriberAddressInfo addressInfo,
           java.lang.String atpId,
           java.lang.String auditaction,
           java.lang.String auditiccid,
           java.lang.String auditimsi,
           java.lang.String auditmsisdn,
           java.lang.String auditnewmsisdn,
           java.lang.String auditnewsim,
           java.lang.String auditoldmsisdn,
           java.lang.String auditoldsim,
           java.lang.String authenticateCarrierid,
           java.lang.String balanceAmount,
           java.lang.String billDay,
           java.lang.String blockedMsisdn,
           java.lang.String channel,
           java.lang.String charges,
           java.lang.String compEmailId,
           java.lang.String content,
           java.lang.String creditLimti,
           java.lang.String data,
           java.lang.String dealerUserId,
           java.lang.String denominations,
           java.lang.String deviceIdKey,
           java.lang.String dtFailureErrorCode,
           java.lang.String errorcode,
           java.lang.String eventFlag,
           java.lang.String externaltransid2,
           java.lang.String failedNode,
           java.lang.String failedmsisdnslistnew,
           java.lang.String failedmsisdnslistold,
           java.lang.String flag5G,
           java.lang.String frTrnNo,
           java.lang.String getaccountdetails,
           java.lang.String getorderdetails,
           java.lang.String goldenIccno,
           java.lang.String hlrfrConnection,
           java.lang.String hlrfrConnectionOn,
           java.lang.String iccNo,
           java.lang.String iccid,
           java.lang.String imei,
           java.lang.String imsi,
           java.lang.String imsiSimRegistration,
           java.lang.String initiatedFrom,
           java.lang.String inputIccNo,
           java.lang.String inputpersonaldata,
           java.lang.String invalidaccountstate,
           java.lang.String isCorp,
           java.lang.String issubscribed,
           java.lang.String locationCode,
           java.lang.String loginid,
           java.lang.String mdn,
           java.lang.String messageID,
           java.lang.String middlename,
           java.lang.String msisdn,
           net.bcgi.si.messages.mvnoapi.provisioning.MSISDNInfo msisdnInfo,
           java.lang.String msisdnlist,
           java.lang.String msisdnlistlong,
           java.lang.String networkName,
           java.lang.String networkid,
           java.lang.String networkname,
           java.lang.String newCCMMdnList,
           java.lang.String newCCmsisdn,
           java.lang.String newMdn,
           java.lang.String newPassword,
           java.lang.String newValidityDate,
           java.lang.String newValue,
           java.lang.String newimsi,
           java.lang.String newmsisdn,
           java.lang.String newsim,
           java.lang.String nokadidcode,
           java.lang.String normalOrderId,
           java.lang.String notificationDataEmail,
           java.lang.String nprSubmTime,
           java.lang.String officeCode,
           java.lang.String officecode,
           java.lang.String oldCCMMdnList,
           java.lang.String oldCCmsisdn,
           java.lang.String oldIMSI,
           java.lang.String oldImsiSimRegistration,
           java.lang.String oldmdn,
           java.lang.String oldmsisdn,
           java.lang.String oldsim,
           java.lang.String oldvalue,
           java.lang.String orderDate,
           java.lang.String orderID,
           java.lang.String orderList,
           net.bcgi.si.messages.mvnoapi.provisioning.SubscriberOtherInfo otherInfo,
           net.bcgi.si.messages.mvnoapi.provisioning.SubcriberPersonalInfo personalInfo,
           java.lang.String portId,
           java.lang.String portReqFormId,
           java.lang.String postpaid,
           java.lang.String price,
           java.lang.String promoCode,
           java.lang.String reason,
           java.lang.Boolean registrationRequired,
           net.bcgi.si.messages.mvnoapi.provisioning.RegistrationType registrationType,
           java.lang.String rejectedData,
           java.lang.String requesttype,
           java.lang.String responsecode,
           java.lang.String returncode,
           java.lang.String saleType,
           java.lang.String scIccno,
           net.bcgi.si.messages.mvnoapi.common.SecurityId securityId,
           net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext,
           java.lang.String serviceType,
           java.lang.String simisactual,
           java.lang.String simpsuedo,
           java.lang.String sna,
           java.lang.String subAccountStatus,
           net.bcgi.si.messages.mvnoapi.common.SelfcareAccountStatusType subscriberStatus,
           java.lang.String subtransactionid,
           java.lang.String tariffPackageId,
           java.lang.String taxId,
           java.lang.String thresholdTime,
           java.lang.String transRefNumber,
           java.lang.String transactionID,
           java.lang.String transactionid,
           java.lang.String updateproductstatus,
           java.lang.String userAccountName,
           java.lang.String userAccountPassword,
           java.lang.String userDefined1,
           java.lang.String userDefined2,
           java.lang.String userDefined3,
           java.lang.String userType,
           java.lang.String userid,
           java.lang.String username,
           java.lang.String ussdMdn,
           java.lang.String utilList,
           java.lang.String version,
           java.lang.String workgroupId,
           java.lang.String zipcode) {
           this.ATPId = ATPId;
           this.SNA = SNA;
           this.accountId = accountId;
           this.accountMdn = accountMdn;
           this.accountStatus = accountStatus;
           this.active = active;
           this.actualMsisdn = actualMsisdn;
           this.addressInfo = addressInfo;
           this.atpId = atpId;
           this.auditaction = auditaction;
           this.auditiccid = auditiccid;
           this.auditimsi = auditimsi;
           this.auditmsisdn = auditmsisdn;
           this.auditnewmsisdn = auditnewmsisdn;
           this.auditnewsim = auditnewsim;
           this.auditoldmsisdn = auditoldmsisdn;
           this.auditoldsim = auditoldsim;
           this.authenticateCarrierid = authenticateCarrierid;
           this.balanceAmount = balanceAmount;
           this.billDay = billDay;
           this.blockedMsisdn = blockedMsisdn;
           this.channel = channel;
           this.charges = charges;
           this.compEmailId = compEmailId;
           this.content = content;
           this.creditLimti = creditLimti;
           this.data = data;
           this.dealerUserId = dealerUserId;
           this.denominations = denominations;
           this.deviceIdKey = deviceIdKey;
           this.dtFailureErrorCode = dtFailureErrorCode;
           this.errorcode = errorcode;
           this.eventFlag = eventFlag;
           this.externaltransid2 = externaltransid2;
           this.failedNode = failedNode;
           this.failedmsisdnslistnew = failedmsisdnslistnew;
           this.failedmsisdnslistold = failedmsisdnslistold;
           this.flag5G = flag5G;
           this.frTrnNo = frTrnNo;
           this.getaccountdetails = getaccountdetails;
           this.getorderdetails = getorderdetails;
           this.goldenIccno = goldenIccno;
           this.hlrfrConnection = hlrfrConnection;
           this.hlrfrConnectionOn = hlrfrConnectionOn;
           this.iccNo = iccNo;
           this.iccid = iccid;
           this.imei = imei;
           this.imsi = imsi;
           this.imsiSimRegistration = imsiSimRegistration;
           this.initiatedFrom = initiatedFrom;
           this.inputIccNo = inputIccNo;
           this.inputpersonaldata = inputpersonaldata;
           this.invalidaccountstate = invalidaccountstate;
           this.isCorp = isCorp;
           this.issubscribed = issubscribed;
           this.locationCode = locationCode;
           this.loginid = loginid;
           this.mdn = mdn;
           this.messageID = messageID;
           this.middlename = middlename;
           this.msisdn = msisdn;
           this.msisdnInfo = msisdnInfo;
           this.msisdnlist = msisdnlist;
           this.msisdnlistlong = msisdnlistlong;
           this.networkName = networkName;
           this.networkid = networkid;
           this.networkname = networkname;
           this.newCCMMdnList = newCCMMdnList;
           this.newCCmsisdn = newCCmsisdn;
           this.newMdn = newMdn;
           this.newPassword = newPassword;
           this.newValidityDate = newValidityDate;
           this.newValue = newValue;
           this.newimsi = newimsi;
           this.newmsisdn = newmsisdn;
           this.newsim = newsim;
           this.nokadidcode = nokadidcode;
           this.normalOrderId = normalOrderId;
           this.notificationDataEmail = notificationDataEmail;
           this.nprSubmTime = nprSubmTime;
           this.officeCode = officeCode;
           this.officecode = officecode;
           this.oldCCMMdnList = oldCCMMdnList;
           this.oldCCmsisdn = oldCCmsisdn;
           this.oldIMSI = oldIMSI;
           this.oldImsiSimRegistration = oldImsiSimRegistration;
           this.oldmdn = oldmdn;
           this.oldmsisdn = oldmsisdn;
           this.oldsim = oldsim;
           this.oldvalue = oldvalue;
           this.orderDate = orderDate;
           this.orderID = orderID;
           this.orderList = orderList;
           this.otherInfo = otherInfo;
           this.personalInfo = personalInfo;
           this.portId = portId;
           this.portReqFormId = portReqFormId;
           this.postpaid = postpaid;
           this.price = price;
           this.promoCode = promoCode;
           this.reason = reason;
           this.registrationRequired = registrationRequired;
           this.registrationType = registrationType;
           this.rejectedData = rejectedData;
           this.requesttype = requesttype;
           this.responsecode = responsecode;
           this.returncode = returncode;
           this.saleType = saleType;
           this.scIccno = scIccno;
           this.securityId = securityId;
           this.serviceContext = serviceContext;
           this.serviceType = serviceType;
           this.simisactual = simisactual;
           this.simpsuedo = simpsuedo;
           this.sna = sna;
           this.subAccountStatus = subAccountStatus;
           this.subscriberStatus = subscriberStatus;
           this.subtransactionid = subtransactionid;
           this.tariffPackageId = tariffPackageId;
           this.taxId = taxId;
           this.thresholdTime = thresholdTime;
           this.transRefNumber = transRefNumber;
           this.transactionID = transactionID;
           this.transactionid = transactionid;
           this.updateproductstatus = updateproductstatus;
           this.userAccountName = userAccountName;
           this.userAccountPassword = userAccountPassword;
           this.userDefined1 = userDefined1;
           this.userDefined2 = userDefined2;
           this.userDefined3 = userDefined3;
           this.userType = userType;
           this.userid = userid;
           this.username = username;
           this.ussdMdn = ussdMdn;
           this.utilList = utilList;
           this.version = version;
           this.workgroupId = workgroupId;
           this.zipcode = zipcode;
    }


    /**
     * Gets the ATPId value for this PrepaidActivationRetryRequest.
     * 
     * @return ATPId
     */
    public java.lang.String getATPId() {
        return ATPId;
    }


    /**
     * Sets the ATPId value for this PrepaidActivationRetryRequest.
     * 
     * @param ATPId
     */
    public void setATPId(java.lang.String ATPId) {
        this.ATPId = ATPId;
    }


    /**
     * Gets the SNA value for this PrepaidActivationRetryRequest.
     * 
     * @return SNA
     */
    public java.lang.String getSNA() {
        return SNA;
    }


    /**
     * Sets the SNA value for this PrepaidActivationRetryRequest.
     * 
     * @param SNA
     */
    public void setSNA(java.lang.String SNA) {
        this.SNA = SNA;
    }


    /**
     * Gets the accountId value for this PrepaidActivationRetryRequest.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this PrepaidActivationRetryRequest.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the accountMdn value for this PrepaidActivationRetryRequest.
     * 
     * @return accountMdn
     */
    public java.lang.String getAccountMdn() {
        return accountMdn;
    }


    /**
     * Sets the accountMdn value for this PrepaidActivationRetryRequest.
     * 
     * @param accountMdn
     */
    public void setAccountMdn(java.lang.String accountMdn) {
        this.accountMdn = accountMdn;
    }


    /**
     * Gets the accountStatus value for this PrepaidActivationRetryRequest.
     * 
     * @return accountStatus
     */
    public java.lang.String getAccountStatus() {
        return accountStatus;
    }


    /**
     * Sets the accountStatus value for this PrepaidActivationRetryRequest.
     * 
     * @param accountStatus
     */
    public void setAccountStatus(java.lang.String accountStatus) {
        this.accountStatus = accountStatus;
    }


    /**
     * Gets the active value for this PrepaidActivationRetryRequest.
     * 
     * @return active
     */
    public java.lang.String getActive() {
        return active;
    }


    /**
     * Sets the active value for this PrepaidActivationRetryRequest.
     * 
     * @param active
     */
    public void setActive(java.lang.String active) {
        this.active = active;
    }


    /**
     * Gets the actualMsisdn value for this PrepaidActivationRetryRequest.
     * 
     * @return actualMsisdn
     */
    public java.lang.String getActualMsisdn() {
        return actualMsisdn;
    }


    /**
     * Sets the actualMsisdn value for this PrepaidActivationRetryRequest.
     * 
     * @param actualMsisdn
     */
    public void setActualMsisdn(java.lang.String actualMsisdn) {
        this.actualMsisdn = actualMsisdn;
    }


    /**
     * Gets the addressInfo value for this PrepaidActivationRetryRequest.
     * 
     * @return addressInfo
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.SubcriberAddressInfo getAddressInfo() {
        return addressInfo;
    }


    /**
     * Sets the addressInfo value for this PrepaidActivationRetryRequest.
     * 
     * @param addressInfo
     */
    public void setAddressInfo(net.bcgi.si.messages.mvnoapi.provisioning.SubcriberAddressInfo addressInfo) {
        this.addressInfo = addressInfo;
    }


    /**
     * Gets the atpId value for this PrepaidActivationRetryRequest.
     * 
     * @return atpId
     */
    public java.lang.String getAtpId() {
        return atpId;
    }


    /**
     * Sets the atpId value for this PrepaidActivationRetryRequest.
     * 
     * @param atpId
     */
    public void setAtpId(java.lang.String atpId) {
        this.atpId = atpId;
    }


    /**
     * Gets the auditaction value for this PrepaidActivationRetryRequest.
     * 
     * @return auditaction
     */
    public java.lang.String getAuditaction() {
        return auditaction;
    }


    /**
     * Sets the auditaction value for this PrepaidActivationRetryRequest.
     * 
     * @param auditaction
     */
    public void setAuditaction(java.lang.String auditaction) {
        this.auditaction = auditaction;
    }


    /**
     * Gets the auditiccid value for this PrepaidActivationRetryRequest.
     * 
     * @return auditiccid
     */
    public java.lang.String getAuditiccid() {
        return auditiccid;
    }


    /**
     * Sets the auditiccid value for this PrepaidActivationRetryRequest.
     * 
     * @param auditiccid
     */
    public void setAuditiccid(java.lang.String auditiccid) {
        this.auditiccid = auditiccid;
    }


    /**
     * Gets the auditimsi value for this PrepaidActivationRetryRequest.
     * 
     * @return auditimsi
     */
    public java.lang.String getAuditimsi() {
        return auditimsi;
    }


    /**
     * Sets the auditimsi value for this PrepaidActivationRetryRequest.
     * 
     * @param auditimsi
     */
    public void setAuditimsi(java.lang.String auditimsi) {
        this.auditimsi = auditimsi;
    }


    /**
     * Gets the auditmsisdn value for this PrepaidActivationRetryRequest.
     * 
     * @return auditmsisdn
     */
    public java.lang.String getAuditmsisdn() {
        return auditmsisdn;
    }


    /**
     * Sets the auditmsisdn value for this PrepaidActivationRetryRequest.
     * 
     * @param auditmsisdn
     */
    public void setAuditmsisdn(java.lang.String auditmsisdn) {
        this.auditmsisdn = auditmsisdn;
    }


    /**
     * Gets the auditnewmsisdn value for this PrepaidActivationRetryRequest.
     * 
     * @return auditnewmsisdn
     */
    public java.lang.String getAuditnewmsisdn() {
        return auditnewmsisdn;
    }


    /**
     * Sets the auditnewmsisdn value for this PrepaidActivationRetryRequest.
     * 
     * @param auditnewmsisdn
     */
    public void setAuditnewmsisdn(java.lang.String auditnewmsisdn) {
        this.auditnewmsisdn = auditnewmsisdn;
    }


    /**
     * Gets the auditnewsim value for this PrepaidActivationRetryRequest.
     * 
     * @return auditnewsim
     */
    public java.lang.String getAuditnewsim() {
        return auditnewsim;
    }


    /**
     * Sets the auditnewsim value for this PrepaidActivationRetryRequest.
     * 
     * @param auditnewsim
     */
    public void setAuditnewsim(java.lang.String auditnewsim) {
        this.auditnewsim = auditnewsim;
    }


    /**
     * Gets the auditoldmsisdn value for this PrepaidActivationRetryRequest.
     * 
     * @return auditoldmsisdn
     */
    public java.lang.String getAuditoldmsisdn() {
        return auditoldmsisdn;
    }


    /**
     * Sets the auditoldmsisdn value for this PrepaidActivationRetryRequest.
     * 
     * @param auditoldmsisdn
     */
    public void setAuditoldmsisdn(java.lang.String auditoldmsisdn) {
        this.auditoldmsisdn = auditoldmsisdn;
    }


    /**
     * Gets the auditoldsim value for this PrepaidActivationRetryRequest.
     * 
     * @return auditoldsim
     */
    public java.lang.String getAuditoldsim() {
        return auditoldsim;
    }


    /**
     * Sets the auditoldsim value for this PrepaidActivationRetryRequest.
     * 
     * @param auditoldsim
     */
    public void setAuditoldsim(java.lang.String auditoldsim) {
        this.auditoldsim = auditoldsim;
    }


    /**
     * Gets the authenticateCarrierid value for this PrepaidActivationRetryRequest.
     * 
     * @return authenticateCarrierid
     */
    public java.lang.String getAuthenticateCarrierid() {
        return authenticateCarrierid;
    }


    /**
     * Sets the authenticateCarrierid value for this PrepaidActivationRetryRequest.
     * 
     * @param authenticateCarrierid
     */
    public void setAuthenticateCarrierid(java.lang.String authenticateCarrierid) {
        this.authenticateCarrierid = authenticateCarrierid;
    }


    /**
     * Gets the balanceAmount value for this PrepaidActivationRetryRequest.
     * 
     * @return balanceAmount
     */
    public java.lang.String getBalanceAmount() {
        return balanceAmount;
    }


    /**
     * Sets the balanceAmount value for this PrepaidActivationRetryRequest.
     * 
     * @param balanceAmount
     */
    public void setBalanceAmount(java.lang.String balanceAmount) {
        this.balanceAmount = balanceAmount;
    }


    /**
     * Gets the billDay value for this PrepaidActivationRetryRequest.
     * 
     * @return billDay
     */
    public java.lang.String getBillDay() {
        return billDay;
    }


    /**
     * Sets the billDay value for this PrepaidActivationRetryRequest.
     * 
     * @param billDay
     */
    public void setBillDay(java.lang.String billDay) {
        this.billDay = billDay;
    }


    /**
     * Gets the blockedMsisdn value for this PrepaidActivationRetryRequest.
     * 
     * @return blockedMsisdn
     */
    public java.lang.String getBlockedMsisdn() {
        return blockedMsisdn;
    }


    /**
     * Sets the blockedMsisdn value for this PrepaidActivationRetryRequest.
     * 
     * @param blockedMsisdn
     */
    public void setBlockedMsisdn(java.lang.String blockedMsisdn) {
        this.blockedMsisdn = blockedMsisdn;
    }


    /**
     * Gets the channel value for this PrepaidActivationRetryRequest.
     * 
     * @return channel
     */
    public java.lang.String getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this PrepaidActivationRetryRequest.
     * 
     * @param channel
     */
    public void setChannel(java.lang.String channel) {
        this.channel = channel;
    }


    /**
     * Gets the charges value for this PrepaidActivationRetryRequest.
     * 
     * @return charges
     */
    public java.lang.String getCharges() {
        return charges;
    }


    /**
     * Sets the charges value for this PrepaidActivationRetryRequest.
     * 
     * @param charges
     */
    public void setCharges(java.lang.String charges) {
        this.charges = charges;
    }


    /**
     * Gets the compEmailId value for this PrepaidActivationRetryRequest.
     * 
     * @return compEmailId
     */
    public java.lang.String getCompEmailId() {
        return compEmailId;
    }


    /**
     * Sets the compEmailId value for this PrepaidActivationRetryRequest.
     * 
     * @param compEmailId
     */
    public void setCompEmailId(java.lang.String compEmailId) {
        this.compEmailId = compEmailId;
    }


    /**
     * Gets the content value for this PrepaidActivationRetryRequest.
     * 
     * @return content
     */
    public java.lang.String getContent() {
        return content;
    }


    /**
     * Sets the content value for this PrepaidActivationRetryRequest.
     * 
     * @param content
     */
    public void setContent(java.lang.String content) {
        this.content = content;
    }


    /**
     * Gets the creditLimti value for this PrepaidActivationRetryRequest.
     * 
     * @return creditLimti
     */
    public java.lang.String getCreditLimti() {
        return creditLimti;
    }


    /**
     * Sets the creditLimti value for this PrepaidActivationRetryRequest.
     * 
     * @param creditLimti
     */
    public void setCreditLimti(java.lang.String creditLimti) {
        this.creditLimti = creditLimti;
    }


    /**
     * Gets the data value for this PrepaidActivationRetryRequest.
     * 
     * @return data
     */
    public java.lang.String getData() {
        return data;
    }


    /**
     * Sets the data value for this PrepaidActivationRetryRequest.
     * 
     * @param data
     */
    public void setData(java.lang.String data) {
        this.data = data;
    }


    /**
     * Gets the dealerUserId value for this PrepaidActivationRetryRequest.
     * 
     * @return dealerUserId
     */
    public java.lang.String getDealerUserId() {
        return dealerUserId;
    }


    /**
     * Sets the dealerUserId value for this PrepaidActivationRetryRequest.
     * 
     * @param dealerUserId
     */
    public void setDealerUserId(java.lang.String dealerUserId) {
        this.dealerUserId = dealerUserId;
    }


    /**
     * Gets the denominations value for this PrepaidActivationRetryRequest.
     * 
     * @return denominations
     */
    public java.lang.String getDenominations() {
        return denominations;
    }


    /**
     * Sets the denominations value for this PrepaidActivationRetryRequest.
     * 
     * @param denominations
     */
    public void setDenominations(java.lang.String denominations) {
        this.denominations = denominations;
    }


    /**
     * Gets the deviceIdKey value for this PrepaidActivationRetryRequest.
     * 
     * @return deviceIdKey
     */
    public java.lang.String getDeviceIdKey() {
        return deviceIdKey;
    }


    /**
     * Sets the deviceIdKey value for this PrepaidActivationRetryRequest.
     * 
     * @param deviceIdKey
     */
    public void setDeviceIdKey(java.lang.String deviceIdKey) {
        this.deviceIdKey = deviceIdKey;
    }


    /**
     * Gets the dtFailureErrorCode value for this PrepaidActivationRetryRequest.
     * 
     * @return dtFailureErrorCode
     */
    public java.lang.String getDtFailureErrorCode() {
        return dtFailureErrorCode;
    }


    /**
     * Sets the dtFailureErrorCode value for this PrepaidActivationRetryRequest.
     * 
     * @param dtFailureErrorCode
     */
    public void setDtFailureErrorCode(java.lang.String dtFailureErrorCode) {
        this.dtFailureErrorCode = dtFailureErrorCode;
    }


    /**
     * Gets the errorcode value for this PrepaidActivationRetryRequest.
     * 
     * @return errorcode
     */
    public java.lang.String getErrorcode() {
        return errorcode;
    }


    /**
     * Sets the errorcode value for this PrepaidActivationRetryRequest.
     * 
     * @param errorcode
     */
    public void setErrorcode(java.lang.String errorcode) {
        this.errorcode = errorcode;
    }


    /**
     * Gets the eventFlag value for this PrepaidActivationRetryRequest.
     * 
     * @return eventFlag
     */
    public java.lang.String getEventFlag() {
        return eventFlag;
    }


    /**
     * Sets the eventFlag value for this PrepaidActivationRetryRequest.
     * 
     * @param eventFlag
     */
    public void setEventFlag(java.lang.String eventFlag) {
        this.eventFlag = eventFlag;
    }


    /**
     * Gets the externaltransid2 value for this PrepaidActivationRetryRequest.
     * 
     * @return externaltransid2
     */
    public java.lang.String getExternaltransid2() {
        return externaltransid2;
    }


    /**
     * Sets the externaltransid2 value for this PrepaidActivationRetryRequest.
     * 
     * @param externaltransid2
     */
    public void setExternaltransid2(java.lang.String externaltransid2) {
        this.externaltransid2 = externaltransid2;
    }


    /**
     * Gets the failedNode value for this PrepaidActivationRetryRequest.
     * 
     * @return failedNode
     */
    public java.lang.String getFailedNode() {
        return failedNode;
    }


    /**
     * Sets the failedNode value for this PrepaidActivationRetryRequest.
     * 
     * @param failedNode
     */
    public void setFailedNode(java.lang.String failedNode) {
        this.failedNode = failedNode;
    }


    /**
     * Gets the failedmsisdnslistnew value for this PrepaidActivationRetryRequest.
     * 
     * @return failedmsisdnslistnew
     */
    public java.lang.String getFailedmsisdnslistnew() {
        return failedmsisdnslistnew;
    }


    /**
     * Sets the failedmsisdnslistnew value for this PrepaidActivationRetryRequest.
     * 
     * @param failedmsisdnslistnew
     */
    public void setFailedmsisdnslistnew(java.lang.String failedmsisdnslistnew) {
        this.failedmsisdnslistnew = failedmsisdnslistnew;
    }


    /**
     * Gets the failedmsisdnslistold value for this PrepaidActivationRetryRequest.
     * 
     * @return failedmsisdnslistold
     */
    public java.lang.String getFailedmsisdnslistold() {
        return failedmsisdnslistold;
    }


    /**
     * Sets the failedmsisdnslistold value for this PrepaidActivationRetryRequest.
     * 
     * @param failedmsisdnslistold
     */
    public void setFailedmsisdnslistold(java.lang.String failedmsisdnslistold) {
        this.failedmsisdnslistold = failedmsisdnslistold;
    }


    /**
     * Gets the flag5G value for this PrepaidActivationRetryRequest.
     * 
     * @return flag5G
     */
    public java.lang.String getFlag5G() {
        return flag5G;
    }


    /**
     * Sets the flag5G value for this PrepaidActivationRetryRequest.
     * 
     * @param flag5G
     */
    public void setFlag5G(java.lang.String flag5G) {
        this.flag5G = flag5G;
    }


    /**
     * Gets the frTrnNo value for this PrepaidActivationRetryRequest.
     * 
     * @return frTrnNo
     */
    public java.lang.String getFrTrnNo() {
        return frTrnNo;
    }


    /**
     * Sets the frTrnNo value for this PrepaidActivationRetryRequest.
     * 
     * @param frTrnNo
     */
    public void setFrTrnNo(java.lang.String frTrnNo) {
        this.frTrnNo = frTrnNo;
    }


    /**
     * Gets the getaccountdetails value for this PrepaidActivationRetryRequest.
     * 
     * @return getaccountdetails
     */
    public java.lang.String getGetaccountdetails() {
        return getaccountdetails;
    }


    /**
     * Sets the getaccountdetails value for this PrepaidActivationRetryRequest.
     * 
     * @param getaccountdetails
     */
    public void setGetaccountdetails(java.lang.String getaccountdetails) {
        this.getaccountdetails = getaccountdetails;
    }


    /**
     * Gets the getorderdetails value for this PrepaidActivationRetryRequest.
     * 
     * @return getorderdetails
     */
    public java.lang.String getGetorderdetails() {
        return getorderdetails;
    }


    /**
     * Sets the getorderdetails value for this PrepaidActivationRetryRequest.
     * 
     * @param getorderdetails
     */
    public void setGetorderdetails(java.lang.String getorderdetails) {
        this.getorderdetails = getorderdetails;
    }


    /**
     * Gets the goldenIccno value for this PrepaidActivationRetryRequest.
     * 
     * @return goldenIccno
     */
    public java.lang.String getGoldenIccno() {
        return goldenIccno;
    }


    /**
     * Sets the goldenIccno value for this PrepaidActivationRetryRequest.
     * 
     * @param goldenIccno
     */
    public void setGoldenIccno(java.lang.String goldenIccno) {
        this.goldenIccno = goldenIccno;
    }


    /**
     * Gets the hlrfrConnection value for this PrepaidActivationRetryRequest.
     * 
     * @return hlrfrConnection
     */
    public java.lang.String getHlrfrConnection() {
        return hlrfrConnection;
    }


    /**
     * Sets the hlrfrConnection value for this PrepaidActivationRetryRequest.
     * 
     * @param hlrfrConnection
     */
    public void setHlrfrConnection(java.lang.String hlrfrConnection) {
        this.hlrfrConnection = hlrfrConnection;
    }


    /**
     * Gets the hlrfrConnectionOn value for this PrepaidActivationRetryRequest.
     * 
     * @return hlrfrConnectionOn
     */
    public java.lang.String getHlrfrConnectionOn() {
        return hlrfrConnectionOn;
    }


    /**
     * Sets the hlrfrConnectionOn value for this PrepaidActivationRetryRequest.
     * 
     * @param hlrfrConnectionOn
     */
    public void setHlrfrConnectionOn(java.lang.String hlrfrConnectionOn) {
        this.hlrfrConnectionOn = hlrfrConnectionOn;
    }


    /**
     * Gets the iccNo value for this PrepaidActivationRetryRequest.
     * 
     * @return iccNo
     */
    public java.lang.String getIccNo() {
        return iccNo;
    }


    /**
     * Sets the iccNo value for this PrepaidActivationRetryRequest.
     * 
     * @param iccNo
     */
    public void setIccNo(java.lang.String iccNo) {
        this.iccNo = iccNo;
    }


    /**
     * Gets the iccid value for this PrepaidActivationRetryRequest.
     * 
     * @return iccid
     */
    public java.lang.String getIccid() {
        return iccid;
    }


    /**
     * Sets the iccid value for this PrepaidActivationRetryRequest.
     * 
     * @param iccid
     */
    public void setIccid(java.lang.String iccid) {
        this.iccid = iccid;
    }


    /**
     * Gets the imei value for this PrepaidActivationRetryRequest.
     * 
     * @return imei
     */
    public java.lang.String getImei() {
        return imei;
    }


    /**
     * Sets the imei value for this PrepaidActivationRetryRequest.
     * 
     * @param imei
     */
    public void setImei(java.lang.String imei) {
        this.imei = imei;
    }


    /**
     * Gets the imsi value for this PrepaidActivationRetryRequest.
     * 
     * @return imsi
     */
    public java.lang.String getImsi() {
        return imsi;
    }


    /**
     * Sets the imsi value for this PrepaidActivationRetryRequest.
     * 
     * @param imsi
     */
    public void setImsi(java.lang.String imsi) {
        this.imsi = imsi;
    }


    /**
     * Gets the imsiSimRegistration value for this PrepaidActivationRetryRequest.
     * 
     * @return imsiSimRegistration
     */
    public java.lang.String getImsiSimRegistration() {
        return imsiSimRegistration;
    }


    /**
     * Sets the imsiSimRegistration value for this PrepaidActivationRetryRequest.
     * 
     * @param imsiSimRegistration
     */
    public void setImsiSimRegistration(java.lang.String imsiSimRegistration) {
        this.imsiSimRegistration = imsiSimRegistration;
    }


    /**
     * Gets the initiatedFrom value for this PrepaidActivationRetryRequest.
     * 
     * @return initiatedFrom
     */
    public java.lang.String getInitiatedFrom() {
        return initiatedFrom;
    }


    /**
     * Sets the initiatedFrom value for this PrepaidActivationRetryRequest.
     * 
     * @param initiatedFrom
     */
    public void setInitiatedFrom(java.lang.String initiatedFrom) {
        this.initiatedFrom = initiatedFrom;
    }


    /**
     * Gets the inputIccNo value for this PrepaidActivationRetryRequest.
     * 
     * @return inputIccNo
     */
    public java.lang.String getInputIccNo() {
        return inputIccNo;
    }


    /**
     * Sets the inputIccNo value for this PrepaidActivationRetryRequest.
     * 
     * @param inputIccNo
     */
    public void setInputIccNo(java.lang.String inputIccNo) {
        this.inputIccNo = inputIccNo;
    }


    /**
     * Gets the inputpersonaldata value for this PrepaidActivationRetryRequest.
     * 
     * @return inputpersonaldata
     */
    public java.lang.String getInputpersonaldata() {
        return inputpersonaldata;
    }


    /**
     * Sets the inputpersonaldata value for this PrepaidActivationRetryRequest.
     * 
     * @param inputpersonaldata
     */
    public void setInputpersonaldata(java.lang.String inputpersonaldata) {
        this.inputpersonaldata = inputpersonaldata;
    }


    /**
     * Gets the invalidaccountstate value for this PrepaidActivationRetryRequest.
     * 
     * @return invalidaccountstate
     */
    public java.lang.String getInvalidaccountstate() {
        return invalidaccountstate;
    }


    /**
     * Sets the invalidaccountstate value for this PrepaidActivationRetryRequest.
     * 
     * @param invalidaccountstate
     */
    public void setInvalidaccountstate(java.lang.String invalidaccountstate) {
        this.invalidaccountstate = invalidaccountstate;
    }


    /**
     * Gets the isCorp value for this PrepaidActivationRetryRequest.
     * 
     * @return isCorp
     */
    public java.lang.String getIsCorp() {
        return isCorp;
    }


    /**
     * Sets the isCorp value for this PrepaidActivationRetryRequest.
     * 
     * @param isCorp
     */
    public void setIsCorp(java.lang.String isCorp) {
        this.isCorp = isCorp;
    }


    /**
     * Gets the issubscribed value for this PrepaidActivationRetryRequest.
     * 
     * @return issubscribed
     */
    public java.lang.String getIssubscribed() {
        return issubscribed;
    }


    /**
     * Sets the issubscribed value for this PrepaidActivationRetryRequest.
     * 
     * @param issubscribed
     */
    public void setIssubscribed(java.lang.String issubscribed) {
        this.issubscribed = issubscribed;
    }


    /**
     * Gets the locationCode value for this PrepaidActivationRetryRequest.
     * 
     * @return locationCode
     */
    public java.lang.String getLocationCode() {
        return locationCode;
    }


    /**
     * Sets the locationCode value for this PrepaidActivationRetryRequest.
     * 
     * @param locationCode
     */
    public void setLocationCode(java.lang.String locationCode) {
        this.locationCode = locationCode;
    }


    /**
     * Gets the loginid value for this PrepaidActivationRetryRequest.
     * 
     * @return loginid
     */
    public java.lang.String getLoginid() {
        return loginid;
    }


    /**
     * Sets the loginid value for this PrepaidActivationRetryRequest.
     * 
     * @param loginid
     */
    public void setLoginid(java.lang.String loginid) {
        this.loginid = loginid;
    }


    /**
     * Gets the mdn value for this PrepaidActivationRetryRequest.
     * 
     * @return mdn
     */
    public java.lang.String getMdn() {
        return mdn;
    }


    /**
     * Sets the mdn value for this PrepaidActivationRetryRequest.
     * 
     * @param mdn
     */
    public void setMdn(java.lang.String mdn) {
        this.mdn = mdn;
    }


    /**
     * Gets the messageID value for this PrepaidActivationRetryRequest.
     * 
     * @return messageID
     */
    public java.lang.String getMessageID() {
        return messageID;
    }


    /**
     * Sets the messageID value for this PrepaidActivationRetryRequest.
     * 
     * @param messageID
     */
    public void setMessageID(java.lang.String messageID) {
        this.messageID = messageID;
    }


    /**
     * Gets the middlename value for this PrepaidActivationRetryRequest.
     * 
     * @return middlename
     */
    public java.lang.String getMiddlename() {
        return middlename;
    }


    /**
     * Sets the middlename value for this PrepaidActivationRetryRequest.
     * 
     * @param middlename
     */
    public void setMiddlename(java.lang.String middlename) {
        this.middlename = middlename;
    }


    /**
     * Gets the msisdn value for this PrepaidActivationRetryRequest.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this PrepaidActivationRetryRequest.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the msisdnInfo value for this PrepaidActivationRetryRequest.
     * 
     * @return msisdnInfo
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.MSISDNInfo getMsisdnInfo() {
        return msisdnInfo;
    }


    /**
     * Sets the msisdnInfo value for this PrepaidActivationRetryRequest.
     * 
     * @param msisdnInfo
     */
    public void setMsisdnInfo(net.bcgi.si.messages.mvnoapi.provisioning.MSISDNInfo msisdnInfo) {
        this.msisdnInfo = msisdnInfo;
    }


    /**
     * Gets the msisdnlist value for this PrepaidActivationRetryRequest.
     * 
     * @return msisdnlist
     */
    public java.lang.String getMsisdnlist() {
        return msisdnlist;
    }


    /**
     * Sets the msisdnlist value for this PrepaidActivationRetryRequest.
     * 
     * @param msisdnlist
     */
    public void setMsisdnlist(java.lang.String msisdnlist) {
        this.msisdnlist = msisdnlist;
    }


    /**
     * Gets the msisdnlistlong value for this PrepaidActivationRetryRequest.
     * 
     * @return msisdnlistlong
     */
    public java.lang.String getMsisdnlistlong() {
        return msisdnlistlong;
    }


    /**
     * Sets the msisdnlistlong value for this PrepaidActivationRetryRequest.
     * 
     * @param msisdnlistlong
     */
    public void setMsisdnlistlong(java.lang.String msisdnlistlong) {
        this.msisdnlistlong = msisdnlistlong;
    }


    /**
     * Gets the networkName value for this PrepaidActivationRetryRequest.
     * 
     * @return networkName
     */
    public java.lang.String getNetworkName() {
        return networkName;
    }


    /**
     * Sets the networkName value for this PrepaidActivationRetryRequest.
     * 
     * @param networkName
     */
    public void setNetworkName(java.lang.String networkName) {
        this.networkName = networkName;
    }


    /**
     * Gets the networkid value for this PrepaidActivationRetryRequest.
     * 
     * @return networkid
     */
    public java.lang.String getNetworkid() {
        return networkid;
    }


    /**
     * Sets the networkid value for this PrepaidActivationRetryRequest.
     * 
     * @param networkid
     */
    public void setNetworkid(java.lang.String networkid) {
        this.networkid = networkid;
    }


    /**
     * Gets the networkname value for this PrepaidActivationRetryRequest.
     * 
     * @return networkname
     */
    public java.lang.String getNetworkname() {
        return networkname;
    }


    /**
     * Sets the networkname value for this PrepaidActivationRetryRequest.
     * 
     * @param networkname
     */
    public void setNetworkname(java.lang.String networkname) {
        this.networkname = networkname;
    }


    /**
     * Gets the newCCMMdnList value for this PrepaidActivationRetryRequest.
     * 
     * @return newCCMMdnList
     */
    public java.lang.String getNewCCMMdnList() {
        return newCCMMdnList;
    }


    /**
     * Sets the newCCMMdnList value for this PrepaidActivationRetryRequest.
     * 
     * @param newCCMMdnList
     */
    public void setNewCCMMdnList(java.lang.String newCCMMdnList) {
        this.newCCMMdnList = newCCMMdnList;
    }


    /**
     * Gets the newCCmsisdn value for this PrepaidActivationRetryRequest.
     * 
     * @return newCCmsisdn
     */
    public java.lang.String getNewCCmsisdn() {
        return newCCmsisdn;
    }


    /**
     * Sets the newCCmsisdn value for this PrepaidActivationRetryRequest.
     * 
     * @param newCCmsisdn
     */
    public void setNewCCmsisdn(java.lang.String newCCmsisdn) {
        this.newCCmsisdn = newCCmsisdn;
    }


    /**
     * Gets the newMdn value for this PrepaidActivationRetryRequest.
     * 
     * @return newMdn
     */
    public java.lang.String getNewMdn() {
        return newMdn;
    }


    /**
     * Sets the newMdn value for this PrepaidActivationRetryRequest.
     * 
     * @param newMdn
     */
    public void setNewMdn(java.lang.String newMdn) {
        this.newMdn = newMdn;
    }


    /**
     * Gets the newPassword value for this PrepaidActivationRetryRequest.
     * 
     * @return newPassword
     */
    public java.lang.String getNewPassword() {
        return newPassword;
    }


    /**
     * Sets the newPassword value for this PrepaidActivationRetryRequest.
     * 
     * @param newPassword
     */
    public void setNewPassword(java.lang.String newPassword) {
        this.newPassword = newPassword;
    }


    /**
     * Gets the newValidityDate value for this PrepaidActivationRetryRequest.
     * 
     * @return newValidityDate
     */
    public java.lang.String getNewValidityDate() {
        return newValidityDate;
    }


    /**
     * Sets the newValidityDate value for this PrepaidActivationRetryRequest.
     * 
     * @param newValidityDate
     */
    public void setNewValidityDate(java.lang.String newValidityDate) {
        this.newValidityDate = newValidityDate;
    }


    /**
     * Gets the newValue value for this PrepaidActivationRetryRequest.
     * 
     * @return newValue
     */
    public java.lang.String getNewValue() {
        return newValue;
    }


    /**
     * Sets the newValue value for this PrepaidActivationRetryRequest.
     * 
     * @param newValue
     */
    public void setNewValue(java.lang.String newValue) {
        this.newValue = newValue;
    }


    /**
     * Gets the newimsi value for this PrepaidActivationRetryRequest.
     * 
     * @return newimsi
     */
    public java.lang.String getNewimsi() {
        return newimsi;
    }


    /**
     * Sets the newimsi value for this PrepaidActivationRetryRequest.
     * 
     * @param newimsi
     */
    public void setNewimsi(java.lang.String newimsi) {
        this.newimsi = newimsi;
    }


    /**
     * Gets the newmsisdn value for this PrepaidActivationRetryRequest.
     * 
     * @return newmsisdn
     */
    public java.lang.String getNewmsisdn() {
        return newmsisdn;
    }


    /**
     * Sets the newmsisdn value for this PrepaidActivationRetryRequest.
     * 
     * @param newmsisdn
     */
    public void setNewmsisdn(java.lang.String newmsisdn) {
        this.newmsisdn = newmsisdn;
    }


    /**
     * Gets the newsim value for this PrepaidActivationRetryRequest.
     * 
     * @return newsim
     */
    public java.lang.String getNewsim() {
        return newsim;
    }


    /**
     * Sets the newsim value for this PrepaidActivationRetryRequest.
     * 
     * @param newsim
     */
    public void setNewsim(java.lang.String newsim) {
        this.newsim = newsim;
    }


    /**
     * Gets the nokadidcode value for this PrepaidActivationRetryRequest.
     * 
     * @return nokadidcode
     */
    public java.lang.String getNokadidcode() {
        return nokadidcode;
    }


    /**
     * Sets the nokadidcode value for this PrepaidActivationRetryRequest.
     * 
     * @param nokadidcode
     */
    public void setNokadidcode(java.lang.String nokadidcode) {
        this.nokadidcode = nokadidcode;
    }


    /**
     * Gets the normalOrderId value for this PrepaidActivationRetryRequest.
     * 
     * @return normalOrderId
     */
    public java.lang.String getNormalOrderId() {
        return normalOrderId;
    }


    /**
     * Sets the normalOrderId value for this PrepaidActivationRetryRequest.
     * 
     * @param normalOrderId
     */
    public void setNormalOrderId(java.lang.String normalOrderId) {
        this.normalOrderId = normalOrderId;
    }


    /**
     * Gets the notificationDataEmail value for this PrepaidActivationRetryRequest.
     * 
     * @return notificationDataEmail
     */
    public java.lang.String getNotificationDataEmail() {
        return notificationDataEmail;
    }


    /**
     * Sets the notificationDataEmail value for this PrepaidActivationRetryRequest.
     * 
     * @param notificationDataEmail
     */
    public void setNotificationDataEmail(java.lang.String notificationDataEmail) {
        this.notificationDataEmail = notificationDataEmail;
    }


    /**
     * Gets the nprSubmTime value for this PrepaidActivationRetryRequest.
     * 
     * @return nprSubmTime
     */
    public java.lang.String getNprSubmTime() {
        return nprSubmTime;
    }


    /**
     * Sets the nprSubmTime value for this PrepaidActivationRetryRequest.
     * 
     * @param nprSubmTime
     */
    public void setNprSubmTime(java.lang.String nprSubmTime) {
        this.nprSubmTime = nprSubmTime;
    }


    /**
     * Gets the officeCode value for this PrepaidActivationRetryRequest.
     * 
     * @return officeCode
     */
    public java.lang.String getOfficeCode() {
        return officeCode;
    }


    /**
     * Sets the officeCode value for this PrepaidActivationRetryRequest.
     * 
     * @param officeCode
     */
    public void setOfficeCode(java.lang.String officeCode) {
        this.officeCode = officeCode;
    }


    /**
     * Gets the officecode value for this PrepaidActivationRetryRequest.
     * 
     * @return officecode
     */
    public java.lang.String getOfficecode() {
        return officecode;
    }


    /**
     * Sets the officecode value for this PrepaidActivationRetryRequest.
     * 
     * @param officecode
     */
    public void setOfficecode(java.lang.String officecode) {
        this.officecode = officecode;
    }


    /**
     * Gets the oldCCMMdnList value for this PrepaidActivationRetryRequest.
     * 
     * @return oldCCMMdnList
     */
    public java.lang.String getOldCCMMdnList() {
        return oldCCMMdnList;
    }


    /**
     * Sets the oldCCMMdnList value for this PrepaidActivationRetryRequest.
     * 
     * @param oldCCMMdnList
     */
    public void setOldCCMMdnList(java.lang.String oldCCMMdnList) {
        this.oldCCMMdnList = oldCCMMdnList;
    }


    /**
     * Gets the oldCCmsisdn value for this PrepaidActivationRetryRequest.
     * 
     * @return oldCCmsisdn
     */
    public java.lang.String getOldCCmsisdn() {
        return oldCCmsisdn;
    }


    /**
     * Sets the oldCCmsisdn value for this PrepaidActivationRetryRequest.
     * 
     * @param oldCCmsisdn
     */
    public void setOldCCmsisdn(java.lang.String oldCCmsisdn) {
        this.oldCCmsisdn = oldCCmsisdn;
    }


    /**
     * Gets the oldIMSI value for this PrepaidActivationRetryRequest.
     * 
     * @return oldIMSI
     */
    public java.lang.String getOldIMSI() {
        return oldIMSI;
    }


    /**
     * Sets the oldIMSI value for this PrepaidActivationRetryRequest.
     * 
     * @param oldIMSI
     */
    public void setOldIMSI(java.lang.String oldIMSI) {
        this.oldIMSI = oldIMSI;
    }


    /**
     * Gets the oldImsiSimRegistration value for this PrepaidActivationRetryRequest.
     * 
     * @return oldImsiSimRegistration
     */
    public java.lang.String getOldImsiSimRegistration() {
        return oldImsiSimRegistration;
    }


    /**
     * Sets the oldImsiSimRegistration value for this PrepaidActivationRetryRequest.
     * 
     * @param oldImsiSimRegistration
     */
    public void setOldImsiSimRegistration(java.lang.String oldImsiSimRegistration) {
        this.oldImsiSimRegistration = oldImsiSimRegistration;
    }


    /**
     * Gets the oldmdn value for this PrepaidActivationRetryRequest.
     * 
     * @return oldmdn
     */
    public java.lang.String getOldmdn() {
        return oldmdn;
    }


    /**
     * Sets the oldmdn value for this PrepaidActivationRetryRequest.
     * 
     * @param oldmdn
     */
    public void setOldmdn(java.lang.String oldmdn) {
        this.oldmdn = oldmdn;
    }


    /**
     * Gets the oldmsisdn value for this PrepaidActivationRetryRequest.
     * 
     * @return oldmsisdn
     */
    public java.lang.String getOldmsisdn() {
        return oldmsisdn;
    }


    /**
     * Sets the oldmsisdn value for this PrepaidActivationRetryRequest.
     * 
     * @param oldmsisdn
     */
    public void setOldmsisdn(java.lang.String oldmsisdn) {
        this.oldmsisdn = oldmsisdn;
    }


    /**
     * Gets the oldsim value for this PrepaidActivationRetryRequest.
     * 
     * @return oldsim
     */
    public java.lang.String getOldsim() {
        return oldsim;
    }


    /**
     * Sets the oldsim value for this PrepaidActivationRetryRequest.
     * 
     * @param oldsim
     */
    public void setOldsim(java.lang.String oldsim) {
        this.oldsim = oldsim;
    }


    /**
     * Gets the oldvalue value for this PrepaidActivationRetryRequest.
     * 
     * @return oldvalue
     */
    public java.lang.String getOldvalue() {
        return oldvalue;
    }


    /**
     * Sets the oldvalue value for this PrepaidActivationRetryRequest.
     * 
     * @param oldvalue
     */
    public void setOldvalue(java.lang.String oldvalue) {
        this.oldvalue = oldvalue;
    }


    /**
     * Gets the orderDate value for this PrepaidActivationRetryRequest.
     * 
     * @return orderDate
     */
    public java.lang.String getOrderDate() {
        return orderDate;
    }


    /**
     * Sets the orderDate value for this PrepaidActivationRetryRequest.
     * 
     * @param orderDate
     */
    public void setOrderDate(java.lang.String orderDate) {
        this.orderDate = orderDate;
    }


    /**
     * Gets the orderID value for this PrepaidActivationRetryRequest.
     * 
     * @return orderID
     */
    public java.lang.String getOrderID() {
        return orderID;
    }


    /**
     * Sets the orderID value for this PrepaidActivationRetryRequest.
     * 
     * @param orderID
     */
    public void setOrderID(java.lang.String orderID) {
        this.orderID = orderID;
    }


    /**
     * Gets the orderList value for this PrepaidActivationRetryRequest.
     * 
     * @return orderList
     */
    public java.lang.String getOrderList() {
        return orderList;
    }


    /**
     * Sets the orderList value for this PrepaidActivationRetryRequest.
     * 
     * @param orderList
     */
    public void setOrderList(java.lang.String orderList) {
        this.orderList = orderList;
    }


    /**
     * Gets the otherInfo value for this PrepaidActivationRetryRequest.
     * 
     * @return otherInfo
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.SubscriberOtherInfo getOtherInfo() {
        return otherInfo;
    }


    /**
     * Sets the otherInfo value for this PrepaidActivationRetryRequest.
     * 
     * @param otherInfo
     */
    public void setOtherInfo(net.bcgi.si.messages.mvnoapi.provisioning.SubscriberOtherInfo otherInfo) {
        this.otherInfo = otherInfo;
    }


    /**
     * Gets the personalInfo value for this PrepaidActivationRetryRequest.
     * 
     * @return personalInfo
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.SubcriberPersonalInfo getPersonalInfo() {
        return personalInfo;
    }


    /**
     * Sets the personalInfo value for this PrepaidActivationRetryRequest.
     * 
     * @param personalInfo
     */
    public void setPersonalInfo(net.bcgi.si.messages.mvnoapi.provisioning.SubcriberPersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
    }


    /**
     * Gets the portId value for this PrepaidActivationRetryRequest.
     * 
     * @return portId
     */
    public java.lang.String getPortId() {
        return portId;
    }


    /**
     * Sets the portId value for this PrepaidActivationRetryRequest.
     * 
     * @param portId
     */
    public void setPortId(java.lang.String portId) {
        this.portId = portId;
    }


    /**
     * Gets the portReqFormId value for this PrepaidActivationRetryRequest.
     * 
     * @return portReqFormId
     */
    public java.lang.String getPortReqFormId() {
        return portReqFormId;
    }


    /**
     * Sets the portReqFormId value for this PrepaidActivationRetryRequest.
     * 
     * @param portReqFormId
     */
    public void setPortReqFormId(java.lang.String portReqFormId) {
        this.portReqFormId = portReqFormId;
    }


    /**
     * Gets the postpaid value for this PrepaidActivationRetryRequest.
     * 
     * @return postpaid
     */
    public java.lang.String getPostpaid() {
        return postpaid;
    }


    /**
     * Sets the postpaid value for this PrepaidActivationRetryRequest.
     * 
     * @param postpaid
     */
    public void setPostpaid(java.lang.String postpaid) {
        this.postpaid = postpaid;
    }


    /**
     * Gets the price value for this PrepaidActivationRetryRequest.
     * 
     * @return price
     */
    public java.lang.String getPrice() {
        return price;
    }


    /**
     * Sets the price value for this PrepaidActivationRetryRequest.
     * 
     * @param price
     */
    public void setPrice(java.lang.String price) {
        this.price = price;
    }


    /**
     * Gets the promoCode value for this PrepaidActivationRetryRequest.
     * 
     * @return promoCode
     */
    public java.lang.String getPromoCode() {
        return promoCode;
    }


    /**
     * Sets the promoCode value for this PrepaidActivationRetryRequest.
     * 
     * @param promoCode
     */
    public void setPromoCode(java.lang.String promoCode) {
        this.promoCode = promoCode;
    }


    /**
     * Gets the reason value for this PrepaidActivationRetryRequest.
     * 
     * @return reason
     */
    public java.lang.String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this PrepaidActivationRetryRequest.
     * 
     * @param reason
     */
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }


    /**
     * Gets the registrationRequired value for this PrepaidActivationRetryRequest.
     * 
     * @return registrationRequired
     */
    public java.lang.Boolean getRegistrationRequired() {
        return registrationRequired;
    }


    /**
     * Sets the registrationRequired value for this PrepaidActivationRetryRequest.
     * 
     * @param registrationRequired
     */
    public void setRegistrationRequired(java.lang.Boolean registrationRequired) {
        this.registrationRequired = registrationRequired;
    }


    /**
     * Gets the registrationType value for this PrepaidActivationRetryRequest.
     * 
     * @return registrationType
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.RegistrationType getRegistrationType() {
        return registrationType;
    }


    /**
     * Sets the registrationType value for this PrepaidActivationRetryRequest.
     * 
     * @param registrationType
     */
    public void setRegistrationType(net.bcgi.si.messages.mvnoapi.provisioning.RegistrationType registrationType) {
        this.registrationType = registrationType;
    }


    /**
     * Gets the rejectedData value for this PrepaidActivationRetryRequest.
     * 
     * @return rejectedData
     */
    public java.lang.String getRejectedData() {
        return rejectedData;
    }


    /**
     * Sets the rejectedData value for this PrepaidActivationRetryRequest.
     * 
     * @param rejectedData
     */
    public void setRejectedData(java.lang.String rejectedData) {
        this.rejectedData = rejectedData;
    }


    /**
     * Gets the requesttype value for this PrepaidActivationRetryRequest.
     * 
     * @return requesttype
     */
    public java.lang.String getRequesttype() {
        return requesttype;
    }


    /**
     * Sets the requesttype value for this PrepaidActivationRetryRequest.
     * 
     * @param requesttype
     */
    public void setRequesttype(java.lang.String requesttype) {
        this.requesttype = requesttype;
    }


    /**
     * Gets the responsecode value for this PrepaidActivationRetryRequest.
     * 
     * @return responsecode
     */
    public java.lang.String getResponsecode() {
        return responsecode;
    }


    /**
     * Sets the responsecode value for this PrepaidActivationRetryRequest.
     * 
     * @param responsecode
     */
    public void setResponsecode(java.lang.String responsecode) {
        this.responsecode = responsecode;
    }


    /**
     * Gets the returncode value for this PrepaidActivationRetryRequest.
     * 
     * @return returncode
     */
    public java.lang.String getReturncode() {
        return returncode;
    }


    /**
     * Sets the returncode value for this PrepaidActivationRetryRequest.
     * 
     * @param returncode
     */
    public void setReturncode(java.lang.String returncode) {
        this.returncode = returncode;
    }


    /**
     * Gets the saleType value for this PrepaidActivationRetryRequest.
     * 
     * @return saleType
     */
    public java.lang.String getSaleType() {
        return saleType;
    }


    /**
     * Sets the saleType value for this PrepaidActivationRetryRequest.
     * 
     * @param saleType
     */
    public void setSaleType(java.lang.String saleType) {
        this.saleType = saleType;
    }


    /**
     * Gets the scIccno value for this PrepaidActivationRetryRequest.
     * 
     * @return scIccno
     */
    public java.lang.String getScIccno() {
        return scIccno;
    }


    /**
     * Sets the scIccno value for this PrepaidActivationRetryRequest.
     * 
     * @param scIccno
     */
    public void setScIccno(java.lang.String scIccno) {
        this.scIccno = scIccno;
    }


    /**
     * Gets the securityId value for this PrepaidActivationRetryRequest.
     * 
     * @return securityId
     */
    public net.bcgi.si.messages.mvnoapi.common.SecurityId getSecurityId() {
        return securityId;
    }


    /**
     * Sets the securityId value for this PrepaidActivationRetryRequest.
     * 
     * @param securityId
     */
    public void setSecurityId(net.bcgi.si.messages.mvnoapi.common.SecurityId securityId) {
        this.securityId = securityId;
    }


    /**
     * Gets the serviceContext value for this PrepaidActivationRetryRequest.
     * 
     * @return serviceContext
     */
    public net.bcgi.si.messages.mvnoapi.common.ServiceContext getServiceContext() {
        return serviceContext;
    }


    /**
     * Sets the serviceContext value for this PrepaidActivationRetryRequest.
     * 
     * @param serviceContext
     */
    public void setServiceContext(net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext) {
        this.serviceContext = serviceContext;
    }


    /**
     * Gets the serviceType value for this PrepaidActivationRetryRequest.
     * 
     * @return serviceType
     */
    public java.lang.String getServiceType() {
        return serviceType;
    }


    /**
     * Sets the serviceType value for this PrepaidActivationRetryRequest.
     * 
     * @param serviceType
     */
    public void setServiceType(java.lang.String serviceType) {
        this.serviceType = serviceType;
    }


    /**
     * Gets the simisactual value for this PrepaidActivationRetryRequest.
     * 
     * @return simisactual
     */
    public java.lang.String getSimisactual() {
        return simisactual;
    }


    /**
     * Sets the simisactual value for this PrepaidActivationRetryRequest.
     * 
     * @param simisactual
     */
    public void setSimisactual(java.lang.String simisactual) {
        this.simisactual = simisactual;
    }


    /**
     * Gets the simpsuedo value for this PrepaidActivationRetryRequest.
     * 
     * @return simpsuedo
     */
    public java.lang.String getSimpsuedo() {
        return simpsuedo;
    }


    /**
     * Sets the simpsuedo value for this PrepaidActivationRetryRequest.
     * 
     * @param simpsuedo
     */
    public void setSimpsuedo(java.lang.String simpsuedo) {
        this.simpsuedo = simpsuedo;
    }


    /**
     * Gets the sna value for this PrepaidActivationRetryRequest.
     * 
     * @return sna
     */
    public java.lang.String getSna() {
        return sna;
    }


    /**
     * Sets the sna value for this PrepaidActivationRetryRequest.
     * 
     * @param sna
     */
    public void setSna(java.lang.String sna) {
        this.sna = sna;
    }


    /**
     * Gets the subAccountStatus value for this PrepaidActivationRetryRequest.
     * 
     * @return subAccountStatus
     */
    public java.lang.String getSubAccountStatus() {
        return subAccountStatus;
    }


    /**
     * Sets the subAccountStatus value for this PrepaidActivationRetryRequest.
     * 
     * @param subAccountStatus
     */
    public void setSubAccountStatus(java.lang.String subAccountStatus) {
        this.subAccountStatus = subAccountStatus;
    }


    /**
     * Gets the subscriberStatus value for this PrepaidActivationRetryRequest.
     * 
     * @return subscriberStatus
     */
    public net.bcgi.si.messages.mvnoapi.common.SelfcareAccountStatusType getSubscriberStatus() {
        return subscriberStatus;
    }


    /**
     * Sets the subscriberStatus value for this PrepaidActivationRetryRequest.
     * 
     * @param subscriberStatus
     */
    public void setSubscriberStatus(net.bcgi.si.messages.mvnoapi.common.SelfcareAccountStatusType subscriberStatus) {
        this.subscriberStatus = subscriberStatus;
    }


    /**
     * Gets the subtransactionid value for this PrepaidActivationRetryRequest.
     * 
     * @return subtransactionid
     */
    public java.lang.String getSubtransactionid() {
        return subtransactionid;
    }


    /**
     * Sets the subtransactionid value for this PrepaidActivationRetryRequest.
     * 
     * @param subtransactionid
     */
    public void setSubtransactionid(java.lang.String subtransactionid) {
        this.subtransactionid = subtransactionid;
    }


    /**
     * Gets the tariffPackageId value for this PrepaidActivationRetryRequest.
     * 
     * @return tariffPackageId
     */
    public java.lang.String getTariffPackageId() {
        return tariffPackageId;
    }


    /**
     * Sets the tariffPackageId value for this PrepaidActivationRetryRequest.
     * 
     * @param tariffPackageId
     */
    public void setTariffPackageId(java.lang.String tariffPackageId) {
        this.tariffPackageId = tariffPackageId;
    }


    /**
     * Gets the taxId value for this PrepaidActivationRetryRequest.
     * 
     * @return taxId
     */
    public java.lang.String getTaxId() {
        return taxId;
    }


    /**
     * Sets the taxId value for this PrepaidActivationRetryRequest.
     * 
     * @param taxId
     */
    public void setTaxId(java.lang.String taxId) {
        this.taxId = taxId;
    }


    /**
     * Gets the thresholdTime value for this PrepaidActivationRetryRequest.
     * 
     * @return thresholdTime
     */
    public java.lang.String getThresholdTime() {
        return thresholdTime;
    }


    /**
     * Sets the thresholdTime value for this PrepaidActivationRetryRequest.
     * 
     * @param thresholdTime
     */
    public void setThresholdTime(java.lang.String thresholdTime) {
        this.thresholdTime = thresholdTime;
    }


    /**
     * Gets the transRefNumber value for this PrepaidActivationRetryRequest.
     * 
     * @return transRefNumber
     */
    public java.lang.String getTransRefNumber() {
        return transRefNumber;
    }


    /**
     * Sets the transRefNumber value for this PrepaidActivationRetryRequest.
     * 
     * @param transRefNumber
     */
    public void setTransRefNumber(java.lang.String transRefNumber) {
        this.transRefNumber = transRefNumber;
    }


    /**
     * Gets the transactionID value for this PrepaidActivationRetryRequest.
     * 
     * @return transactionID
     */
    public java.lang.String getTransactionID() {
        return transactionID;
    }


    /**
     * Sets the transactionID value for this PrepaidActivationRetryRequest.
     * 
     * @param transactionID
     */
    public void setTransactionID(java.lang.String transactionID) {
        this.transactionID = transactionID;
    }


    /**
     * Gets the transactionid value for this PrepaidActivationRetryRequest.
     * 
     * @return transactionid
     */
    public java.lang.String getTransactionid() {
        return transactionid;
    }


    /**
     * Sets the transactionid value for this PrepaidActivationRetryRequest.
     * 
     * @param transactionid
     */
    public void setTransactionid(java.lang.String transactionid) {
        this.transactionid = transactionid;
    }


    /**
     * Gets the updateproductstatus value for this PrepaidActivationRetryRequest.
     * 
     * @return updateproductstatus
     */
    public java.lang.String getUpdateproductstatus() {
        return updateproductstatus;
    }


    /**
     * Sets the updateproductstatus value for this PrepaidActivationRetryRequest.
     * 
     * @param updateproductstatus
     */
    public void setUpdateproductstatus(java.lang.String updateproductstatus) {
        this.updateproductstatus = updateproductstatus;
    }


    /**
     * Gets the userAccountName value for this PrepaidActivationRetryRequest.
     * 
     * @return userAccountName
     */
    public java.lang.String getUserAccountName() {
        return userAccountName;
    }


    /**
     * Sets the userAccountName value for this PrepaidActivationRetryRequest.
     * 
     * @param userAccountName
     */
    public void setUserAccountName(java.lang.String userAccountName) {
        this.userAccountName = userAccountName;
    }


    /**
     * Gets the userAccountPassword value for this PrepaidActivationRetryRequest.
     * 
     * @return userAccountPassword
     */
    public java.lang.String getUserAccountPassword() {
        return userAccountPassword;
    }


    /**
     * Sets the userAccountPassword value for this PrepaidActivationRetryRequest.
     * 
     * @param userAccountPassword
     */
    public void setUserAccountPassword(java.lang.String userAccountPassword) {
        this.userAccountPassword = userAccountPassword;
    }


    /**
     * Gets the userDefined1 value for this PrepaidActivationRetryRequest.
     * 
     * @return userDefined1
     */
    public java.lang.String getUserDefined1() {
        return userDefined1;
    }


    /**
     * Sets the userDefined1 value for this PrepaidActivationRetryRequest.
     * 
     * @param userDefined1
     */
    public void setUserDefined1(java.lang.String userDefined1) {
        this.userDefined1 = userDefined1;
    }


    /**
     * Gets the userDefined2 value for this PrepaidActivationRetryRequest.
     * 
     * @return userDefined2
     */
    public java.lang.String getUserDefined2() {
        return userDefined2;
    }


    /**
     * Sets the userDefined2 value for this PrepaidActivationRetryRequest.
     * 
     * @param userDefined2
     */
    public void setUserDefined2(java.lang.String userDefined2) {
        this.userDefined2 = userDefined2;
    }


    /**
     * Gets the userDefined3 value for this PrepaidActivationRetryRequest.
     * 
     * @return userDefined3
     */
    public java.lang.String getUserDefined3() {
        return userDefined3;
    }


    /**
     * Sets the userDefined3 value for this PrepaidActivationRetryRequest.
     * 
     * @param userDefined3
     */
    public void setUserDefined3(java.lang.String userDefined3) {
        this.userDefined3 = userDefined3;
    }


    /**
     * Gets the userType value for this PrepaidActivationRetryRequest.
     * 
     * @return userType
     */
    public java.lang.String getUserType() {
        return userType;
    }


    /**
     * Sets the userType value for this PrepaidActivationRetryRequest.
     * 
     * @param userType
     */
    public void setUserType(java.lang.String userType) {
        this.userType = userType;
    }


    /**
     * Gets the userid value for this PrepaidActivationRetryRequest.
     * 
     * @return userid
     */
    public java.lang.String getUserid() {
        return userid;
    }


    /**
     * Sets the userid value for this PrepaidActivationRetryRequest.
     * 
     * @param userid
     */
    public void setUserid(java.lang.String userid) {
        this.userid = userid;
    }


    /**
     * Gets the username value for this PrepaidActivationRetryRequest.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this PrepaidActivationRetryRequest.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }


    /**
     * Gets the ussdMdn value for this PrepaidActivationRetryRequest.
     * 
     * @return ussdMdn
     */
    public java.lang.String getUssdMdn() {
        return ussdMdn;
    }


    /**
     * Sets the ussdMdn value for this PrepaidActivationRetryRequest.
     * 
     * @param ussdMdn
     */
    public void setUssdMdn(java.lang.String ussdMdn) {
        this.ussdMdn = ussdMdn;
    }


    /**
     * Gets the utilList value for this PrepaidActivationRetryRequest.
     * 
     * @return utilList
     */
    public java.lang.String getUtilList() {
        return utilList;
    }


    /**
     * Sets the utilList value for this PrepaidActivationRetryRequest.
     * 
     * @param utilList
     */
    public void setUtilList(java.lang.String utilList) {
        this.utilList = utilList;
    }


    /**
     * Gets the version value for this PrepaidActivationRetryRequest.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this PrepaidActivationRetryRequest.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the workgroupId value for this PrepaidActivationRetryRequest.
     * 
     * @return workgroupId
     */
    public java.lang.String getWorkgroupId() {
        return workgroupId;
    }


    /**
     * Sets the workgroupId value for this PrepaidActivationRetryRequest.
     * 
     * @param workgroupId
     */
    public void setWorkgroupId(java.lang.String workgroupId) {
        this.workgroupId = workgroupId;
    }


    /**
     * Gets the zipcode value for this PrepaidActivationRetryRequest.
     * 
     * @return zipcode
     */
    public java.lang.String getZipcode() {
        return zipcode;
    }


    /**
     * Sets the zipcode value for this PrepaidActivationRetryRequest.
     * 
     * @param zipcode
     */
    public void setZipcode(java.lang.String zipcode) {
        this.zipcode = zipcode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PrepaidActivationRetryRequest)) return false;
        PrepaidActivationRetryRequest other = (PrepaidActivationRetryRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ATPId==null && other.getATPId()==null) || 
             (this.ATPId!=null &&
              this.ATPId.equals(other.getATPId()))) &&
            ((this.SNA==null && other.getSNA()==null) || 
             (this.SNA!=null &&
              this.SNA.equals(other.getSNA()))) &&
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.accountMdn==null && other.getAccountMdn()==null) || 
             (this.accountMdn!=null &&
              this.accountMdn.equals(other.getAccountMdn()))) &&
            ((this.accountStatus==null && other.getAccountStatus()==null) || 
             (this.accountStatus!=null &&
              this.accountStatus.equals(other.getAccountStatus()))) &&
            ((this.active==null && other.getActive()==null) || 
             (this.active!=null &&
              this.active.equals(other.getActive()))) &&
            ((this.actualMsisdn==null && other.getActualMsisdn()==null) || 
             (this.actualMsisdn!=null &&
              this.actualMsisdn.equals(other.getActualMsisdn()))) &&
            ((this.addressInfo==null && other.getAddressInfo()==null) || 
             (this.addressInfo!=null &&
              this.addressInfo.equals(other.getAddressInfo()))) &&
            ((this.atpId==null && other.getAtpId()==null) || 
             (this.atpId!=null &&
              this.atpId.equals(other.getAtpId()))) &&
            ((this.auditaction==null && other.getAuditaction()==null) || 
             (this.auditaction!=null &&
              this.auditaction.equals(other.getAuditaction()))) &&
            ((this.auditiccid==null && other.getAuditiccid()==null) || 
             (this.auditiccid!=null &&
              this.auditiccid.equals(other.getAuditiccid()))) &&
            ((this.auditimsi==null && other.getAuditimsi()==null) || 
             (this.auditimsi!=null &&
              this.auditimsi.equals(other.getAuditimsi()))) &&
            ((this.auditmsisdn==null && other.getAuditmsisdn()==null) || 
             (this.auditmsisdn!=null &&
              this.auditmsisdn.equals(other.getAuditmsisdn()))) &&
            ((this.auditnewmsisdn==null && other.getAuditnewmsisdn()==null) || 
             (this.auditnewmsisdn!=null &&
              this.auditnewmsisdn.equals(other.getAuditnewmsisdn()))) &&
            ((this.auditnewsim==null && other.getAuditnewsim()==null) || 
             (this.auditnewsim!=null &&
              this.auditnewsim.equals(other.getAuditnewsim()))) &&
            ((this.auditoldmsisdn==null && other.getAuditoldmsisdn()==null) || 
             (this.auditoldmsisdn!=null &&
              this.auditoldmsisdn.equals(other.getAuditoldmsisdn()))) &&
            ((this.auditoldsim==null && other.getAuditoldsim()==null) || 
             (this.auditoldsim!=null &&
              this.auditoldsim.equals(other.getAuditoldsim()))) &&
            ((this.authenticateCarrierid==null && other.getAuthenticateCarrierid()==null) || 
             (this.authenticateCarrierid!=null &&
              this.authenticateCarrierid.equals(other.getAuthenticateCarrierid()))) &&
            ((this.balanceAmount==null && other.getBalanceAmount()==null) || 
             (this.balanceAmount!=null &&
              this.balanceAmount.equals(other.getBalanceAmount()))) &&
            ((this.billDay==null && other.getBillDay()==null) || 
             (this.billDay!=null &&
              this.billDay.equals(other.getBillDay()))) &&
            ((this.blockedMsisdn==null && other.getBlockedMsisdn()==null) || 
             (this.blockedMsisdn!=null &&
              this.blockedMsisdn.equals(other.getBlockedMsisdn()))) &&
            ((this.channel==null && other.getChannel()==null) || 
             (this.channel!=null &&
              this.channel.equals(other.getChannel()))) &&
            ((this.charges==null && other.getCharges()==null) || 
             (this.charges!=null &&
              this.charges.equals(other.getCharges()))) &&
            ((this.compEmailId==null && other.getCompEmailId()==null) || 
             (this.compEmailId!=null &&
              this.compEmailId.equals(other.getCompEmailId()))) &&
            ((this.content==null && other.getContent()==null) || 
             (this.content!=null &&
              this.content.equals(other.getContent()))) &&
            ((this.creditLimti==null && other.getCreditLimti()==null) || 
             (this.creditLimti!=null &&
              this.creditLimti.equals(other.getCreditLimti()))) &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData()))) &&
            ((this.dealerUserId==null && other.getDealerUserId()==null) || 
             (this.dealerUserId!=null &&
              this.dealerUserId.equals(other.getDealerUserId()))) &&
            ((this.denominations==null && other.getDenominations()==null) || 
             (this.denominations!=null &&
              this.denominations.equals(other.getDenominations()))) &&
            ((this.deviceIdKey==null && other.getDeviceIdKey()==null) || 
             (this.deviceIdKey!=null &&
              this.deviceIdKey.equals(other.getDeviceIdKey()))) &&
            ((this.dtFailureErrorCode==null && other.getDtFailureErrorCode()==null) || 
             (this.dtFailureErrorCode!=null &&
              this.dtFailureErrorCode.equals(other.getDtFailureErrorCode()))) &&
            ((this.errorcode==null && other.getErrorcode()==null) || 
             (this.errorcode!=null &&
              this.errorcode.equals(other.getErrorcode()))) &&
            ((this.eventFlag==null && other.getEventFlag()==null) || 
             (this.eventFlag!=null &&
              this.eventFlag.equals(other.getEventFlag()))) &&
            ((this.externaltransid2==null && other.getExternaltransid2()==null) || 
             (this.externaltransid2!=null &&
              this.externaltransid2.equals(other.getExternaltransid2()))) &&
            ((this.failedNode==null && other.getFailedNode()==null) || 
             (this.failedNode!=null &&
              this.failedNode.equals(other.getFailedNode()))) &&
            ((this.failedmsisdnslistnew==null && other.getFailedmsisdnslistnew()==null) || 
             (this.failedmsisdnslistnew!=null &&
              this.failedmsisdnslistnew.equals(other.getFailedmsisdnslistnew()))) &&
            ((this.failedmsisdnslistold==null && other.getFailedmsisdnslistold()==null) || 
             (this.failedmsisdnslistold!=null &&
              this.failedmsisdnslistold.equals(other.getFailedmsisdnslistold()))) &&
            ((this.flag5G==null && other.getFlag5G()==null) || 
             (this.flag5G!=null &&
              this.flag5G.equals(other.getFlag5G()))) &&
            ((this.frTrnNo==null && other.getFrTrnNo()==null) || 
             (this.frTrnNo!=null &&
              this.frTrnNo.equals(other.getFrTrnNo()))) &&
            ((this.getaccountdetails==null && other.getGetaccountdetails()==null) || 
             (this.getaccountdetails!=null &&
              this.getaccountdetails.equals(other.getGetaccountdetails()))) &&
            ((this.getorderdetails==null && other.getGetorderdetails()==null) || 
             (this.getorderdetails!=null &&
              this.getorderdetails.equals(other.getGetorderdetails()))) &&
            ((this.goldenIccno==null && other.getGoldenIccno()==null) || 
             (this.goldenIccno!=null &&
              this.goldenIccno.equals(other.getGoldenIccno()))) &&
            ((this.hlrfrConnection==null && other.getHlrfrConnection()==null) || 
             (this.hlrfrConnection!=null &&
              this.hlrfrConnection.equals(other.getHlrfrConnection()))) &&
            ((this.hlrfrConnectionOn==null && other.getHlrfrConnectionOn()==null) || 
             (this.hlrfrConnectionOn!=null &&
              this.hlrfrConnectionOn.equals(other.getHlrfrConnectionOn()))) &&
            ((this.iccNo==null && other.getIccNo()==null) || 
             (this.iccNo!=null &&
              this.iccNo.equals(other.getIccNo()))) &&
            ((this.iccid==null && other.getIccid()==null) || 
             (this.iccid!=null &&
              this.iccid.equals(other.getIccid()))) &&
            ((this.imei==null && other.getImei()==null) || 
             (this.imei!=null &&
              this.imei.equals(other.getImei()))) &&
            ((this.imsi==null && other.getImsi()==null) || 
             (this.imsi!=null &&
              this.imsi.equals(other.getImsi()))) &&
            ((this.imsiSimRegistration==null && other.getImsiSimRegistration()==null) || 
             (this.imsiSimRegistration!=null &&
              this.imsiSimRegistration.equals(other.getImsiSimRegistration()))) &&
            ((this.initiatedFrom==null && other.getInitiatedFrom()==null) || 
             (this.initiatedFrom!=null &&
              this.initiatedFrom.equals(other.getInitiatedFrom()))) &&
            ((this.inputIccNo==null && other.getInputIccNo()==null) || 
             (this.inputIccNo!=null &&
              this.inputIccNo.equals(other.getInputIccNo()))) &&
            ((this.inputpersonaldata==null && other.getInputpersonaldata()==null) || 
             (this.inputpersonaldata!=null &&
              this.inputpersonaldata.equals(other.getInputpersonaldata()))) &&
            ((this.invalidaccountstate==null && other.getInvalidaccountstate()==null) || 
             (this.invalidaccountstate!=null &&
              this.invalidaccountstate.equals(other.getInvalidaccountstate()))) &&
            ((this.isCorp==null && other.getIsCorp()==null) || 
             (this.isCorp!=null &&
              this.isCorp.equals(other.getIsCorp()))) &&
            ((this.issubscribed==null && other.getIssubscribed()==null) || 
             (this.issubscribed!=null &&
              this.issubscribed.equals(other.getIssubscribed()))) &&
            ((this.locationCode==null && other.getLocationCode()==null) || 
             (this.locationCode!=null &&
              this.locationCode.equals(other.getLocationCode()))) &&
            ((this.loginid==null && other.getLoginid()==null) || 
             (this.loginid!=null &&
              this.loginid.equals(other.getLoginid()))) &&
            ((this.mdn==null && other.getMdn()==null) || 
             (this.mdn!=null &&
              this.mdn.equals(other.getMdn()))) &&
            ((this.messageID==null && other.getMessageID()==null) || 
             (this.messageID!=null &&
              this.messageID.equals(other.getMessageID()))) &&
            ((this.middlename==null && other.getMiddlename()==null) || 
             (this.middlename!=null &&
              this.middlename.equals(other.getMiddlename()))) &&
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.msisdnInfo==null && other.getMsisdnInfo()==null) || 
             (this.msisdnInfo!=null &&
              this.msisdnInfo.equals(other.getMsisdnInfo()))) &&
            ((this.msisdnlist==null && other.getMsisdnlist()==null) || 
             (this.msisdnlist!=null &&
              this.msisdnlist.equals(other.getMsisdnlist()))) &&
            ((this.msisdnlistlong==null && other.getMsisdnlistlong()==null) || 
             (this.msisdnlistlong!=null &&
              this.msisdnlistlong.equals(other.getMsisdnlistlong()))) &&
            ((this.networkName==null && other.getNetworkName()==null) || 
             (this.networkName!=null &&
              this.networkName.equals(other.getNetworkName()))) &&
            ((this.networkid==null && other.getNetworkid()==null) || 
             (this.networkid!=null &&
              this.networkid.equals(other.getNetworkid()))) &&
            ((this.networkname==null && other.getNetworkname()==null) || 
             (this.networkname!=null &&
              this.networkname.equals(other.getNetworkname()))) &&
            ((this.newCCMMdnList==null && other.getNewCCMMdnList()==null) || 
             (this.newCCMMdnList!=null &&
              this.newCCMMdnList.equals(other.getNewCCMMdnList()))) &&
            ((this.newCCmsisdn==null && other.getNewCCmsisdn()==null) || 
             (this.newCCmsisdn!=null &&
              this.newCCmsisdn.equals(other.getNewCCmsisdn()))) &&
            ((this.newMdn==null && other.getNewMdn()==null) || 
             (this.newMdn!=null &&
              this.newMdn.equals(other.getNewMdn()))) &&
            ((this.newPassword==null && other.getNewPassword()==null) || 
             (this.newPassword!=null &&
              this.newPassword.equals(other.getNewPassword()))) &&
            ((this.newValidityDate==null && other.getNewValidityDate()==null) || 
             (this.newValidityDate!=null &&
              this.newValidityDate.equals(other.getNewValidityDate()))) &&
            ((this.newValue==null && other.getNewValue()==null) || 
             (this.newValue!=null &&
              this.newValue.equals(other.getNewValue()))) &&
            ((this.newimsi==null && other.getNewimsi()==null) || 
             (this.newimsi!=null &&
              this.newimsi.equals(other.getNewimsi()))) &&
            ((this.newmsisdn==null && other.getNewmsisdn()==null) || 
             (this.newmsisdn!=null &&
              this.newmsisdn.equals(other.getNewmsisdn()))) &&
            ((this.newsim==null && other.getNewsim()==null) || 
             (this.newsim!=null &&
              this.newsim.equals(other.getNewsim()))) &&
            ((this.nokadidcode==null && other.getNokadidcode()==null) || 
             (this.nokadidcode!=null &&
              this.nokadidcode.equals(other.getNokadidcode()))) &&
            ((this.normalOrderId==null && other.getNormalOrderId()==null) || 
             (this.normalOrderId!=null &&
              this.normalOrderId.equals(other.getNormalOrderId()))) &&
            ((this.notificationDataEmail==null && other.getNotificationDataEmail()==null) || 
             (this.notificationDataEmail!=null &&
              this.notificationDataEmail.equals(other.getNotificationDataEmail()))) &&
            ((this.nprSubmTime==null && other.getNprSubmTime()==null) || 
             (this.nprSubmTime!=null &&
              this.nprSubmTime.equals(other.getNprSubmTime()))) &&
            ((this.officeCode==null && other.getOfficeCode()==null) || 
             (this.officeCode!=null &&
              this.officeCode.equals(other.getOfficeCode()))) &&
            ((this.officecode==null && other.getOfficecode()==null) || 
             (this.officecode!=null &&
              this.officecode.equals(other.getOfficecode()))) &&
            ((this.oldCCMMdnList==null && other.getOldCCMMdnList()==null) || 
             (this.oldCCMMdnList!=null &&
              this.oldCCMMdnList.equals(other.getOldCCMMdnList()))) &&
            ((this.oldCCmsisdn==null && other.getOldCCmsisdn()==null) || 
             (this.oldCCmsisdn!=null &&
              this.oldCCmsisdn.equals(other.getOldCCmsisdn()))) &&
            ((this.oldIMSI==null && other.getOldIMSI()==null) || 
             (this.oldIMSI!=null &&
              this.oldIMSI.equals(other.getOldIMSI()))) &&
            ((this.oldImsiSimRegistration==null && other.getOldImsiSimRegistration()==null) || 
             (this.oldImsiSimRegistration!=null &&
              this.oldImsiSimRegistration.equals(other.getOldImsiSimRegistration()))) &&
            ((this.oldmdn==null && other.getOldmdn()==null) || 
             (this.oldmdn!=null &&
              this.oldmdn.equals(other.getOldmdn()))) &&
            ((this.oldmsisdn==null && other.getOldmsisdn()==null) || 
             (this.oldmsisdn!=null &&
              this.oldmsisdn.equals(other.getOldmsisdn()))) &&
            ((this.oldsim==null && other.getOldsim()==null) || 
             (this.oldsim!=null &&
              this.oldsim.equals(other.getOldsim()))) &&
            ((this.oldvalue==null && other.getOldvalue()==null) || 
             (this.oldvalue!=null &&
              this.oldvalue.equals(other.getOldvalue()))) &&
            ((this.orderDate==null && other.getOrderDate()==null) || 
             (this.orderDate!=null &&
              this.orderDate.equals(other.getOrderDate()))) &&
            ((this.orderID==null && other.getOrderID()==null) || 
             (this.orderID!=null &&
              this.orderID.equals(other.getOrderID()))) &&
            ((this.orderList==null && other.getOrderList()==null) || 
             (this.orderList!=null &&
              this.orderList.equals(other.getOrderList()))) &&
            ((this.otherInfo==null && other.getOtherInfo()==null) || 
             (this.otherInfo!=null &&
              this.otherInfo.equals(other.getOtherInfo()))) &&
            ((this.personalInfo==null && other.getPersonalInfo()==null) || 
             (this.personalInfo!=null &&
              this.personalInfo.equals(other.getPersonalInfo()))) &&
            ((this.portId==null && other.getPortId()==null) || 
             (this.portId!=null &&
              this.portId.equals(other.getPortId()))) &&
            ((this.portReqFormId==null && other.getPortReqFormId()==null) || 
             (this.portReqFormId!=null &&
              this.portReqFormId.equals(other.getPortReqFormId()))) &&
            ((this.postpaid==null && other.getPostpaid()==null) || 
             (this.postpaid!=null &&
              this.postpaid.equals(other.getPostpaid()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            ((this.promoCode==null && other.getPromoCode()==null) || 
             (this.promoCode!=null &&
              this.promoCode.equals(other.getPromoCode()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason()))) &&
            ((this.registrationRequired==null && other.getRegistrationRequired()==null) || 
             (this.registrationRequired!=null &&
              this.registrationRequired.equals(other.getRegistrationRequired()))) &&
            ((this.registrationType==null && other.getRegistrationType()==null) || 
             (this.registrationType!=null &&
              this.registrationType.equals(other.getRegistrationType()))) &&
            ((this.rejectedData==null && other.getRejectedData()==null) || 
             (this.rejectedData!=null &&
              this.rejectedData.equals(other.getRejectedData()))) &&
            ((this.requesttype==null && other.getRequesttype()==null) || 
             (this.requesttype!=null &&
              this.requesttype.equals(other.getRequesttype()))) &&
            ((this.responsecode==null && other.getResponsecode()==null) || 
             (this.responsecode!=null &&
              this.responsecode.equals(other.getResponsecode()))) &&
            ((this.returncode==null && other.getReturncode()==null) || 
             (this.returncode!=null &&
              this.returncode.equals(other.getReturncode()))) &&
            ((this.saleType==null && other.getSaleType()==null) || 
             (this.saleType!=null &&
              this.saleType.equals(other.getSaleType()))) &&
            ((this.scIccno==null && other.getScIccno()==null) || 
             (this.scIccno!=null &&
              this.scIccno.equals(other.getScIccno()))) &&
            ((this.securityId==null && other.getSecurityId()==null) || 
             (this.securityId!=null &&
              this.securityId.equals(other.getSecurityId()))) &&
            ((this.serviceContext==null && other.getServiceContext()==null) || 
             (this.serviceContext!=null &&
              this.serviceContext.equals(other.getServiceContext()))) &&
            ((this.serviceType==null && other.getServiceType()==null) || 
             (this.serviceType!=null &&
              this.serviceType.equals(other.getServiceType()))) &&
            ((this.simisactual==null && other.getSimisactual()==null) || 
             (this.simisactual!=null &&
              this.simisactual.equals(other.getSimisactual()))) &&
            ((this.simpsuedo==null && other.getSimpsuedo()==null) || 
             (this.simpsuedo!=null &&
              this.simpsuedo.equals(other.getSimpsuedo()))) &&
            ((this.sna==null && other.getSna()==null) || 
             (this.sna!=null &&
              this.sna.equals(other.getSna()))) &&
            ((this.subAccountStatus==null && other.getSubAccountStatus()==null) || 
             (this.subAccountStatus!=null &&
              this.subAccountStatus.equals(other.getSubAccountStatus()))) &&
            ((this.subscriberStatus==null && other.getSubscriberStatus()==null) || 
             (this.subscriberStatus!=null &&
              this.subscriberStatus.equals(other.getSubscriberStatus()))) &&
            ((this.subtransactionid==null && other.getSubtransactionid()==null) || 
             (this.subtransactionid!=null &&
              this.subtransactionid.equals(other.getSubtransactionid()))) &&
            ((this.tariffPackageId==null && other.getTariffPackageId()==null) || 
             (this.tariffPackageId!=null &&
              this.tariffPackageId.equals(other.getTariffPackageId()))) &&
            ((this.taxId==null && other.getTaxId()==null) || 
             (this.taxId!=null &&
              this.taxId.equals(other.getTaxId()))) &&
            ((this.thresholdTime==null && other.getThresholdTime()==null) || 
             (this.thresholdTime!=null &&
              this.thresholdTime.equals(other.getThresholdTime()))) &&
            ((this.transRefNumber==null && other.getTransRefNumber()==null) || 
             (this.transRefNumber!=null &&
              this.transRefNumber.equals(other.getTransRefNumber()))) &&
            ((this.transactionID==null && other.getTransactionID()==null) || 
             (this.transactionID!=null &&
              this.transactionID.equals(other.getTransactionID()))) &&
            ((this.transactionid==null && other.getTransactionid()==null) || 
             (this.transactionid!=null &&
              this.transactionid.equals(other.getTransactionid()))) &&
            ((this.updateproductstatus==null && other.getUpdateproductstatus()==null) || 
             (this.updateproductstatus!=null &&
              this.updateproductstatus.equals(other.getUpdateproductstatus()))) &&
            ((this.userAccountName==null && other.getUserAccountName()==null) || 
             (this.userAccountName!=null &&
              this.userAccountName.equals(other.getUserAccountName()))) &&
            ((this.userAccountPassword==null && other.getUserAccountPassword()==null) || 
             (this.userAccountPassword!=null &&
              this.userAccountPassword.equals(other.getUserAccountPassword()))) &&
            ((this.userDefined1==null && other.getUserDefined1()==null) || 
             (this.userDefined1!=null &&
              this.userDefined1.equals(other.getUserDefined1()))) &&
            ((this.userDefined2==null && other.getUserDefined2()==null) || 
             (this.userDefined2!=null &&
              this.userDefined2.equals(other.getUserDefined2()))) &&
            ((this.userDefined3==null && other.getUserDefined3()==null) || 
             (this.userDefined3!=null &&
              this.userDefined3.equals(other.getUserDefined3()))) &&
            ((this.userType==null && other.getUserType()==null) || 
             (this.userType!=null &&
              this.userType.equals(other.getUserType()))) &&
            ((this.userid==null && other.getUserid()==null) || 
             (this.userid!=null &&
              this.userid.equals(other.getUserid()))) &&
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername()))) &&
            ((this.ussdMdn==null && other.getUssdMdn()==null) || 
             (this.ussdMdn!=null &&
              this.ussdMdn.equals(other.getUssdMdn()))) &&
            ((this.utilList==null && other.getUtilList()==null) || 
             (this.utilList!=null &&
              this.utilList.equals(other.getUtilList()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.workgroupId==null && other.getWorkgroupId()==null) || 
             (this.workgroupId!=null &&
              this.workgroupId.equals(other.getWorkgroupId()))) &&
            ((this.zipcode==null && other.getZipcode()==null) || 
             (this.zipcode!=null &&
              this.zipcode.equals(other.getZipcode())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getATPId() != null) {
            _hashCode += getATPId().hashCode();
        }
        if (getSNA() != null) {
            _hashCode += getSNA().hashCode();
        }
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getAccountMdn() != null) {
            _hashCode += getAccountMdn().hashCode();
        }
        if (getAccountStatus() != null) {
            _hashCode += getAccountStatus().hashCode();
        }
        if (getActive() != null) {
            _hashCode += getActive().hashCode();
        }
        if (getActualMsisdn() != null) {
            _hashCode += getActualMsisdn().hashCode();
        }
        if (getAddressInfo() != null) {
            _hashCode += getAddressInfo().hashCode();
        }
        if (getAtpId() != null) {
            _hashCode += getAtpId().hashCode();
        }
        if (getAuditaction() != null) {
            _hashCode += getAuditaction().hashCode();
        }
        if (getAuditiccid() != null) {
            _hashCode += getAuditiccid().hashCode();
        }
        if (getAuditimsi() != null) {
            _hashCode += getAuditimsi().hashCode();
        }
        if (getAuditmsisdn() != null) {
            _hashCode += getAuditmsisdn().hashCode();
        }
        if (getAuditnewmsisdn() != null) {
            _hashCode += getAuditnewmsisdn().hashCode();
        }
        if (getAuditnewsim() != null) {
            _hashCode += getAuditnewsim().hashCode();
        }
        if (getAuditoldmsisdn() != null) {
            _hashCode += getAuditoldmsisdn().hashCode();
        }
        if (getAuditoldsim() != null) {
            _hashCode += getAuditoldsim().hashCode();
        }
        if (getAuthenticateCarrierid() != null) {
            _hashCode += getAuthenticateCarrierid().hashCode();
        }
        if (getBalanceAmount() != null) {
            _hashCode += getBalanceAmount().hashCode();
        }
        if (getBillDay() != null) {
            _hashCode += getBillDay().hashCode();
        }
        if (getBlockedMsisdn() != null) {
            _hashCode += getBlockedMsisdn().hashCode();
        }
        if (getChannel() != null) {
            _hashCode += getChannel().hashCode();
        }
        if (getCharges() != null) {
            _hashCode += getCharges().hashCode();
        }
        if (getCompEmailId() != null) {
            _hashCode += getCompEmailId().hashCode();
        }
        if (getContent() != null) {
            _hashCode += getContent().hashCode();
        }
        if (getCreditLimti() != null) {
            _hashCode += getCreditLimti().hashCode();
        }
        if (getData() != null) {
            _hashCode += getData().hashCode();
        }
        if (getDealerUserId() != null) {
            _hashCode += getDealerUserId().hashCode();
        }
        if (getDenominations() != null) {
            _hashCode += getDenominations().hashCode();
        }
        if (getDeviceIdKey() != null) {
            _hashCode += getDeviceIdKey().hashCode();
        }
        if (getDtFailureErrorCode() != null) {
            _hashCode += getDtFailureErrorCode().hashCode();
        }
        if (getErrorcode() != null) {
            _hashCode += getErrorcode().hashCode();
        }
        if (getEventFlag() != null) {
            _hashCode += getEventFlag().hashCode();
        }
        if (getExternaltransid2() != null) {
            _hashCode += getExternaltransid2().hashCode();
        }
        if (getFailedNode() != null) {
            _hashCode += getFailedNode().hashCode();
        }
        if (getFailedmsisdnslistnew() != null) {
            _hashCode += getFailedmsisdnslistnew().hashCode();
        }
        if (getFailedmsisdnslistold() != null) {
            _hashCode += getFailedmsisdnslistold().hashCode();
        }
        if (getFlag5G() != null) {
            _hashCode += getFlag5G().hashCode();
        }
        if (getFrTrnNo() != null) {
            _hashCode += getFrTrnNo().hashCode();
        }
        if (getGetaccountdetails() != null) {
            _hashCode += getGetaccountdetails().hashCode();
        }
        if (getGetorderdetails() != null) {
            _hashCode += getGetorderdetails().hashCode();
        }
        if (getGoldenIccno() != null) {
            _hashCode += getGoldenIccno().hashCode();
        }
        if (getHlrfrConnection() != null) {
            _hashCode += getHlrfrConnection().hashCode();
        }
        if (getHlrfrConnectionOn() != null) {
            _hashCode += getHlrfrConnectionOn().hashCode();
        }
        if (getIccNo() != null) {
            _hashCode += getIccNo().hashCode();
        }
        if (getIccid() != null) {
            _hashCode += getIccid().hashCode();
        }
        if (getImei() != null) {
            _hashCode += getImei().hashCode();
        }
        if (getImsi() != null) {
            _hashCode += getImsi().hashCode();
        }
        if (getImsiSimRegistration() != null) {
            _hashCode += getImsiSimRegistration().hashCode();
        }
        if (getInitiatedFrom() != null) {
            _hashCode += getInitiatedFrom().hashCode();
        }
        if (getInputIccNo() != null) {
            _hashCode += getInputIccNo().hashCode();
        }
        if (getInputpersonaldata() != null) {
            _hashCode += getInputpersonaldata().hashCode();
        }
        if (getInvalidaccountstate() != null) {
            _hashCode += getInvalidaccountstate().hashCode();
        }
        if (getIsCorp() != null) {
            _hashCode += getIsCorp().hashCode();
        }
        if (getIssubscribed() != null) {
            _hashCode += getIssubscribed().hashCode();
        }
        if (getLocationCode() != null) {
            _hashCode += getLocationCode().hashCode();
        }
        if (getLoginid() != null) {
            _hashCode += getLoginid().hashCode();
        }
        if (getMdn() != null) {
            _hashCode += getMdn().hashCode();
        }
        if (getMessageID() != null) {
            _hashCode += getMessageID().hashCode();
        }
        if (getMiddlename() != null) {
            _hashCode += getMiddlename().hashCode();
        }
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getMsisdnInfo() != null) {
            _hashCode += getMsisdnInfo().hashCode();
        }
        if (getMsisdnlist() != null) {
            _hashCode += getMsisdnlist().hashCode();
        }
        if (getMsisdnlistlong() != null) {
            _hashCode += getMsisdnlistlong().hashCode();
        }
        if (getNetworkName() != null) {
            _hashCode += getNetworkName().hashCode();
        }
        if (getNetworkid() != null) {
            _hashCode += getNetworkid().hashCode();
        }
        if (getNetworkname() != null) {
            _hashCode += getNetworkname().hashCode();
        }
        if (getNewCCMMdnList() != null) {
            _hashCode += getNewCCMMdnList().hashCode();
        }
        if (getNewCCmsisdn() != null) {
            _hashCode += getNewCCmsisdn().hashCode();
        }
        if (getNewMdn() != null) {
            _hashCode += getNewMdn().hashCode();
        }
        if (getNewPassword() != null) {
            _hashCode += getNewPassword().hashCode();
        }
        if (getNewValidityDate() != null) {
            _hashCode += getNewValidityDate().hashCode();
        }
        if (getNewValue() != null) {
            _hashCode += getNewValue().hashCode();
        }
        if (getNewimsi() != null) {
            _hashCode += getNewimsi().hashCode();
        }
        if (getNewmsisdn() != null) {
            _hashCode += getNewmsisdn().hashCode();
        }
        if (getNewsim() != null) {
            _hashCode += getNewsim().hashCode();
        }
        if (getNokadidcode() != null) {
            _hashCode += getNokadidcode().hashCode();
        }
        if (getNormalOrderId() != null) {
            _hashCode += getNormalOrderId().hashCode();
        }
        if (getNotificationDataEmail() != null) {
            _hashCode += getNotificationDataEmail().hashCode();
        }
        if (getNprSubmTime() != null) {
            _hashCode += getNprSubmTime().hashCode();
        }
        if (getOfficeCode() != null) {
            _hashCode += getOfficeCode().hashCode();
        }
        if (getOfficecode() != null) {
            _hashCode += getOfficecode().hashCode();
        }
        if (getOldCCMMdnList() != null) {
            _hashCode += getOldCCMMdnList().hashCode();
        }
        if (getOldCCmsisdn() != null) {
            _hashCode += getOldCCmsisdn().hashCode();
        }
        if (getOldIMSI() != null) {
            _hashCode += getOldIMSI().hashCode();
        }
        if (getOldImsiSimRegistration() != null) {
            _hashCode += getOldImsiSimRegistration().hashCode();
        }
        if (getOldmdn() != null) {
            _hashCode += getOldmdn().hashCode();
        }
        if (getOldmsisdn() != null) {
            _hashCode += getOldmsisdn().hashCode();
        }
        if (getOldsim() != null) {
            _hashCode += getOldsim().hashCode();
        }
        if (getOldvalue() != null) {
            _hashCode += getOldvalue().hashCode();
        }
        if (getOrderDate() != null) {
            _hashCode += getOrderDate().hashCode();
        }
        if (getOrderID() != null) {
            _hashCode += getOrderID().hashCode();
        }
        if (getOrderList() != null) {
            _hashCode += getOrderList().hashCode();
        }
        if (getOtherInfo() != null) {
            _hashCode += getOtherInfo().hashCode();
        }
        if (getPersonalInfo() != null) {
            _hashCode += getPersonalInfo().hashCode();
        }
        if (getPortId() != null) {
            _hashCode += getPortId().hashCode();
        }
        if (getPortReqFormId() != null) {
            _hashCode += getPortReqFormId().hashCode();
        }
        if (getPostpaid() != null) {
            _hashCode += getPostpaid().hashCode();
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        if (getPromoCode() != null) {
            _hashCode += getPromoCode().hashCode();
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        if (getRegistrationRequired() != null) {
            _hashCode += getRegistrationRequired().hashCode();
        }
        if (getRegistrationType() != null) {
            _hashCode += getRegistrationType().hashCode();
        }
        if (getRejectedData() != null) {
            _hashCode += getRejectedData().hashCode();
        }
        if (getRequesttype() != null) {
            _hashCode += getRequesttype().hashCode();
        }
        if (getResponsecode() != null) {
            _hashCode += getResponsecode().hashCode();
        }
        if (getReturncode() != null) {
            _hashCode += getReturncode().hashCode();
        }
        if (getSaleType() != null) {
            _hashCode += getSaleType().hashCode();
        }
        if (getScIccno() != null) {
            _hashCode += getScIccno().hashCode();
        }
        if (getSecurityId() != null) {
            _hashCode += getSecurityId().hashCode();
        }
        if (getServiceContext() != null) {
            _hashCode += getServiceContext().hashCode();
        }
        if (getServiceType() != null) {
            _hashCode += getServiceType().hashCode();
        }
        if (getSimisactual() != null) {
            _hashCode += getSimisactual().hashCode();
        }
        if (getSimpsuedo() != null) {
            _hashCode += getSimpsuedo().hashCode();
        }
        if (getSna() != null) {
            _hashCode += getSna().hashCode();
        }
        if (getSubAccountStatus() != null) {
            _hashCode += getSubAccountStatus().hashCode();
        }
        if (getSubscriberStatus() != null) {
            _hashCode += getSubscriberStatus().hashCode();
        }
        if (getSubtransactionid() != null) {
            _hashCode += getSubtransactionid().hashCode();
        }
        if (getTariffPackageId() != null) {
            _hashCode += getTariffPackageId().hashCode();
        }
        if (getTaxId() != null) {
            _hashCode += getTaxId().hashCode();
        }
        if (getThresholdTime() != null) {
            _hashCode += getThresholdTime().hashCode();
        }
        if (getTransRefNumber() != null) {
            _hashCode += getTransRefNumber().hashCode();
        }
        if (getTransactionID() != null) {
            _hashCode += getTransactionID().hashCode();
        }
        if (getTransactionid() != null) {
            _hashCode += getTransactionid().hashCode();
        }
        if (getUpdateproductstatus() != null) {
            _hashCode += getUpdateproductstatus().hashCode();
        }
        if (getUserAccountName() != null) {
            _hashCode += getUserAccountName().hashCode();
        }
        if (getUserAccountPassword() != null) {
            _hashCode += getUserAccountPassword().hashCode();
        }
        if (getUserDefined1() != null) {
            _hashCode += getUserDefined1().hashCode();
        }
        if (getUserDefined2() != null) {
            _hashCode += getUserDefined2().hashCode();
        }
        if (getUserDefined3() != null) {
            _hashCode += getUserDefined3().hashCode();
        }
        if (getUserType() != null) {
            _hashCode += getUserType().hashCode();
        }
        if (getUserid() != null) {
            _hashCode += getUserid().hashCode();
        }
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        if (getUssdMdn() != null) {
            _hashCode += getUssdMdn().hashCode();
        }
        if (getUtilList() != null) {
            _hashCode += getUtilList().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getWorkgroupId() != null) {
            _hashCode += getWorkgroupId().hashCode();
        }
        if (getZipcode() != null) {
            _hashCode += getZipcode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PrepaidActivationRetryRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "PrepaidActivationRetryRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ATPId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "ATPId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SNA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "SNA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "accountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountMdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "accountMdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "accountStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualMsisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "actualMsisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "addressInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "subcriberAddressInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atpId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "atpId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditaction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "auditaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditiccid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "auditiccid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditimsi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "auditimsi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditmsisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "auditmsisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditnewmsisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "auditnewmsisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditnewsim");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "auditnewsim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditoldmsisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "auditoldmsisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditoldsim");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "auditoldsim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authenticateCarrierid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "authenticateCarrierid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "balanceAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billDay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "billDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blockedMsisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "blockedMsisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "channel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("charges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "charges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compEmailId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "compEmailId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("content");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "content"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditLimti");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "creditLimti"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dealerUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "dealerUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denominations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "denominations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceIdKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "deviceIdKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtFailureErrorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "dtFailureErrorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "errorcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "eventFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externaltransid2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "externaltransid2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedNode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "failedNode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedmsisdnslistnew");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "failedmsisdnslistnew"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedmsisdnslistold");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "failedmsisdnslistold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flag5G");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "flag5G"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frTrnNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "frTrnNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getaccountdetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "getaccountdetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getorderdetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "getorderdetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("goldenIccno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "goldenIccno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hlrfrConnection");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "hlrfrConnection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hlrfrConnectionOn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "hlrfrConnectionOn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iccNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "iccNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iccid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "iccid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imei");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "imei"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imsi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "imsi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imsiSimRegistration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "imsiSimRegistration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initiatedFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "initiatedFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inputIccNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "inputIccNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inputpersonaldata");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "inputpersonaldata"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invalidaccountstate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "invalidaccountstate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCorp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "isCorp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issubscribed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "issubscribed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "locationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "loginid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "mdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "messageID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("middlename");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "middlename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdnInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "msisdnInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "MSISDNInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdnlist");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "msisdnlist"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdnlistlong");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "msisdnlistlong"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "networkName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "networkid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "networkname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newCCMMdnList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "newCCMMdnList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newCCmsisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "newCCmsisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newMdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "newMdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "newPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newValidityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "newValidityDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "newValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newimsi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "newimsi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newmsisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "newmsisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newsim");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "newsim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nokadidcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "nokadidcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("normalOrderId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "normalOrderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationDataEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "notificationDataEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nprSubmTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "nprSubmTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "officeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officecode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "officecode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldCCMMdnList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "oldCCMMdnList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldCCmsisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "oldCCmsisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldIMSI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "oldIMSI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldImsiSimRegistration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "oldImsiSimRegistration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldmdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "oldmdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldmsisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "oldmsisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldsim");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "oldsim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldvalue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "oldvalue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "orderDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "orderID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "orderList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "otherInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "subscriberOtherInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "personalInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "subcriberPersonalInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "portId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portReqFormId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "portReqFormId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postpaid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "postpaid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promoCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "promoCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registrationRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "registrationRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registrationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "registrationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "RegistrationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rejectedData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "rejectedData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requesttype");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "requesttype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responsecode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "responsecode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returncode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "returncode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saleType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "saleType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scIccno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "scIccno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "securityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "SecurityId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceContext");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "serviceContext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "ServiceContext"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "serviceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("simisactual");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "simisactual"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("simpsuedo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "simpsuedo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sna");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "sna"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subAccountStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "subAccountStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "subscriberStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "SelfcareAccountStatusType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subtransactionid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "subtransactionid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tariffPackageId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "tariffPackageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "taxId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thresholdTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "thresholdTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transRefNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "transRefNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "transactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "transactionid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateproductstatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "updateproductstatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userAccountName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "userAccountName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userAccountPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "userAccountPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefined1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "userDefined1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefined2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "userDefined2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefined3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "userDefined3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "userType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "userid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ussdMdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "ussdMdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("utilList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "utilList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workgroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "workgroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zipcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "zipcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
