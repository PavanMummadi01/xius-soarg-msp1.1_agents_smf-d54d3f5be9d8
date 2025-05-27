/**
 * ChangeDeviceRetryRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.provisioning.device;


/**
 * 1. Location Id will be considered as zip code in case of change
 * 					MSISDN.
 * 					2. All choice elements are of strict choice,
 * 					any one element is expected as input within a choice tag.
 * 					3. If more than one element is present for a choice it will be
 * 					treated as validation error
 */
public class ChangeDeviceRetryRequest  extends com.xius.xbus.messages.common.WSRequest  implements java.io.Serializable {
    private com.xius.xbus.messages.common.AccountType account;

    private com.xius.xbus.messages.provisioning.device.DeviceType deviceType;

    private java.lang.String oldValue;

    private java.lang.String newValue;

    private java.lang.Long charges;

    private java.lang.String newSerialNo;

    private java.lang.String zipCode;

    private java.lang.String provComp;

    private java.lang.String idValue;

    private java.lang.String failedNode;

    private java.lang.String transactionID;

    private java.lang.String activityType;

    private java.lang.String oldMsisdn;

    private java.lang.String newMsisdn;

    private java.lang.String oldIMSI;

    private java.lang.String newIMSI;

    private java.lang.String currStateId;

    private java.lang.String status;

    private java.lang.String remarks;

    private java.lang.String customField1;

    private java.lang.String oldAccountId;

    private java.lang.String newAccountId;

    private java.lang.String statusChangeDate;

    private java.lang.String oldState;

    private java.lang.String newState;

    private java.lang.String technology;

    private java.lang.String extTransId2;

    private java.lang.String channel;

    private java.lang.String customField2;

    private java.lang.String customField3;

    private java.lang.String customField4;

    private java.lang.String customField5;

    private java.lang.String customField6;

    private java.lang.String unsubATP_YN;

    private java.lang.String nir;

    private java.lang.String volteTransID;

    private java.lang.String volteDeProvRespCode;

    private java.lang.String simSaleTransID;

    private java.lang.String flag_4G;

    private java.lang.String flag_5G;

    private java.lang.String insertSubsFlowTrackerTransID;

    private java.lang.String insertSubsFlowTrackGenTransID;

    private java.lang.String oldCCMsisdn;

    private java.lang.String newCCMsisdn;

    private java.lang.String userName;

    private java.lang.String userPassword;

    private java.lang.String userDefined1;

    private java.lang.String userDefined2;

    private java.lang.String userDefined3;

    public ChangeDeviceRetryRequest() {
    }

    public ChangeDeviceRetryRequest(
           com.xius.xbus.messages.common.UserType userType,
           java.lang.String messageID,
           com.xius.xbus.messages.common.SecurityId securityId,
           com.xius.xbus.messages.common.ServiceContext serviceContext,
           java.lang.String version,
           com.xius.xbus.messages.common.AccountType account,
           com.xius.xbus.messages.provisioning.device.DeviceType deviceType,
           java.lang.String oldValue,
           java.lang.String newValue,
           java.lang.Long charges,
           java.lang.String newSerialNo,
           java.lang.String zipCode,
           java.lang.String provComp,
           java.lang.String idValue,
           java.lang.String failedNode,
           java.lang.String transactionID,
           java.lang.String activityType,
           java.lang.String oldMsisdn,
           java.lang.String newMsisdn,
           java.lang.String oldIMSI,
           java.lang.String newIMSI,
           java.lang.String currStateId,
           java.lang.String status,
           java.lang.String remarks,
           java.lang.String customField1,
           java.lang.String oldAccountId,
           java.lang.String newAccountId,
           java.lang.String statusChangeDate,
           java.lang.String oldState,
           java.lang.String newState,
           java.lang.String technology,
           java.lang.String extTransId2,
           java.lang.String channel,
           java.lang.String customField2,
           java.lang.String customField3,
           java.lang.String customField4,
           java.lang.String customField5,
           java.lang.String customField6,
           java.lang.String unsubATP_YN,
           java.lang.String nir,
           java.lang.String volteTransID,
           java.lang.String volteDeProvRespCode,
           java.lang.String simSaleTransID,
           java.lang.String flag_4G,
           java.lang.String flag_5G,
           java.lang.String insertSubsFlowTrackerTransID,
           java.lang.String insertSubsFlowTrackGenTransID,
           java.lang.String oldCCMsisdn,
           java.lang.String newCCMsisdn,
           java.lang.String userName,
           java.lang.String userPassword,
           java.lang.String userDefined1,
           java.lang.String userDefined2,
           java.lang.String userDefined3) {
        super(
            userType,
            messageID,
            securityId,
            serviceContext,
            version);
        this.account = account;
        this.deviceType = deviceType;
        this.oldValue = oldValue;
        this.newValue = newValue;
        this.charges = charges;
        this.newSerialNo = newSerialNo;
        this.zipCode = zipCode;
        this.provComp = provComp;
        this.idValue = idValue;
        this.failedNode = failedNode;
        this.transactionID = transactionID;
        this.activityType = activityType;
        this.oldMsisdn = oldMsisdn;
        this.newMsisdn = newMsisdn;
        this.oldIMSI = oldIMSI;
        this.newIMSI = newIMSI;
        this.currStateId = currStateId;
        this.status = status;
        this.remarks = remarks;
        this.customField1 = customField1;
        this.oldAccountId = oldAccountId;
        this.newAccountId = newAccountId;
        this.statusChangeDate = statusChangeDate;
        this.oldState = oldState;
        this.newState = newState;
        this.technology = technology;
        this.extTransId2 = extTransId2;
        this.channel = channel;
        this.customField2 = customField2;
        this.customField3 = customField3;
        this.customField4 = customField4;
        this.customField5 = customField5;
        this.customField6 = customField6;
        this.unsubATP_YN = unsubATP_YN;
        this.nir = nir;
        this.volteTransID = volteTransID;
        this.volteDeProvRespCode = volteDeProvRespCode;
        this.simSaleTransID = simSaleTransID;
        this.flag_4G = flag_4G;
        this.flag_5G = flag_5G;
        this.insertSubsFlowTrackerTransID = insertSubsFlowTrackerTransID;
        this.insertSubsFlowTrackGenTransID = insertSubsFlowTrackGenTransID;
        this.oldCCMsisdn = oldCCMsisdn;
        this.newCCMsisdn = newCCMsisdn;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userDefined1 = userDefined1;
        this.userDefined2 = userDefined2;
        this.userDefined3 = userDefined3;
    }


    /**
     * Gets the account value for this ChangeDeviceRetryRequest.
     * 
     * @return account
     */
    public com.xius.xbus.messages.common.AccountType getAccount() {
        return account;
    }


    /**
     * Sets the account value for this ChangeDeviceRetryRequest.
     * 
     * @param account
     */
    public void setAccount(com.xius.xbus.messages.common.AccountType account) {
        this.account = account;
    }


    /**
     * Gets the deviceType value for this ChangeDeviceRetryRequest.
     * 
     * @return deviceType
     */
    public com.xius.xbus.messages.provisioning.device.DeviceType getDeviceType() {
        return deviceType;
    }


    /**
     * Sets the deviceType value for this ChangeDeviceRetryRequest.
     * 
     * @param deviceType
     */
    public void setDeviceType(com.xius.xbus.messages.provisioning.device.DeviceType deviceType) {
        this.deviceType = deviceType;
    }


    /**
     * Gets the oldValue value for this ChangeDeviceRetryRequest.
     * 
     * @return oldValue
     */
    public java.lang.String getOldValue() {
        return oldValue;
    }


    /**
     * Sets the oldValue value for this ChangeDeviceRetryRequest.
     * 
     * @param oldValue
     */
    public void setOldValue(java.lang.String oldValue) {
        this.oldValue = oldValue;
    }


    /**
     * Gets the newValue value for this ChangeDeviceRetryRequest.
     * 
     * @return newValue
     */
    public java.lang.String getNewValue() {
        return newValue;
    }


    /**
     * Sets the newValue value for this ChangeDeviceRetryRequest.
     * 
     * @param newValue
     */
    public void setNewValue(java.lang.String newValue) {
        this.newValue = newValue;
    }


    /**
     * Gets the charges value for this ChangeDeviceRetryRequest.
     * 
     * @return charges
     */
    public java.lang.Long getCharges() {
        return charges;
    }


    /**
     * Sets the charges value for this ChangeDeviceRetryRequest.
     * 
     * @param charges
     */
    public void setCharges(java.lang.Long charges) {
        this.charges = charges;
    }


    /**
     * Gets the newSerialNo value for this ChangeDeviceRetryRequest.
     * 
     * @return newSerialNo
     */
    public java.lang.String getNewSerialNo() {
        return newSerialNo;
    }


    /**
     * Sets the newSerialNo value for this ChangeDeviceRetryRequest.
     * 
     * @param newSerialNo
     */
    public void setNewSerialNo(java.lang.String newSerialNo) {
        this.newSerialNo = newSerialNo;
    }


    /**
     * Gets the zipCode value for this ChangeDeviceRetryRequest.
     * 
     * @return zipCode
     */
    public java.lang.String getZipCode() {
        return zipCode;
    }


    /**
     * Sets the zipCode value for this ChangeDeviceRetryRequest.
     * 
     * @param zipCode
     */
    public void setZipCode(java.lang.String zipCode) {
        this.zipCode = zipCode;
    }


    /**
     * Gets the provComp value for this ChangeDeviceRetryRequest.
     * 
     * @return provComp
     */
    public java.lang.String getProvComp() {
        return provComp;
    }


    /**
     * Sets the provComp value for this ChangeDeviceRetryRequest.
     * 
     * @param provComp
     */
    public void setProvComp(java.lang.String provComp) {
        this.provComp = provComp;
    }


    /**
     * Gets the idValue value for this ChangeDeviceRetryRequest.
     * 
     * @return idValue
     */
    public java.lang.String getIdValue() {
        return idValue;
    }


    /**
     * Sets the idValue value for this ChangeDeviceRetryRequest.
     * 
     * @param idValue
     */
    public void setIdValue(java.lang.String idValue) {
        this.idValue = idValue;
    }


    /**
     * Gets the failedNode value for this ChangeDeviceRetryRequest.
     * 
     * @return failedNode
     */
    public java.lang.String getFailedNode() {
        return failedNode;
    }


    /**
     * Sets the failedNode value for this ChangeDeviceRetryRequest.
     * 
     * @param failedNode
     */
    public void setFailedNode(java.lang.String failedNode) {
        this.failedNode = failedNode;
    }


    /**
     * Gets the transactionID value for this ChangeDeviceRetryRequest.
     * 
     * @return transactionID
     */
    public java.lang.String getTransactionID() {
        return transactionID;
    }


    /**
     * Sets the transactionID value for this ChangeDeviceRetryRequest.
     * 
     * @param transactionID
     */
    public void setTransactionID(java.lang.String transactionID) {
        this.transactionID = transactionID;
    }


    /**
     * Gets the activityType value for this ChangeDeviceRetryRequest.
     * 
     * @return activityType
     */
    public java.lang.String getActivityType() {
        return activityType;
    }


    /**
     * Sets the activityType value for this ChangeDeviceRetryRequest.
     * 
     * @param activityType
     */
    public void setActivityType(java.lang.String activityType) {
        this.activityType = activityType;
    }


    /**
     * Gets the oldMsisdn value for this ChangeDeviceRetryRequest.
     * 
     * @return oldMsisdn
     */
    public java.lang.String getOldMsisdn() {
        return oldMsisdn;
    }


    /**
     * Sets the oldMsisdn value for this ChangeDeviceRetryRequest.
     * 
     * @param oldMsisdn
     */
    public void setOldMsisdn(java.lang.String oldMsisdn) {
        this.oldMsisdn = oldMsisdn;
    }


    /**
     * Gets the newMsisdn value for this ChangeDeviceRetryRequest.
     * 
     * @return newMsisdn
     */
    public java.lang.String getNewMsisdn() {
        return newMsisdn;
    }


    /**
     * Sets the newMsisdn value for this ChangeDeviceRetryRequest.
     * 
     * @param newMsisdn
     */
    public void setNewMsisdn(java.lang.String newMsisdn) {
        this.newMsisdn = newMsisdn;
    }


    /**
     * Gets the oldIMSI value for this ChangeDeviceRetryRequest.
     * 
     * @return oldIMSI
     */
    public java.lang.String getOldIMSI() {
        return oldIMSI;
    }


    /**
     * Sets the oldIMSI value for this ChangeDeviceRetryRequest.
     * 
     * @param oldIMSI
     */
    public void setOldIMSI(java.lang.String oldIMSI) {
        this.oldIMSI = oldIMSI;
    }


    /**
     * Gets the newIMSI value for this ChangeDeviceRetryRequest.
     * 
     * @return newIMSI
     */
    public java.lang.String getNewIMSI() {
        return newIMSI;
    }


    /**
     * Sets the newIMSI value for this ChangeDeviceRetryRequest.
     * 
     * @param newIMSI
     */
    public void setNewIMSI(java.lang.String newIMSI) {
        this.newIMSI = newIMSI;
    }


    /**
     * Gets the currStateId value for this ChangeDeviceRetryRequest.
     * 
     * @return currStateId
     */
    public java.lang.String getCurrStateId() {
        return currStateId;
    }


    /**
     * Sets the currStateId value for this ChangeDeviceRetryRequest.
     * 
     * @param currStateId
     */
    public void setCurrStateId(java.lang.String currStateId) {
        this.currStateId = currStateId;
    }


    /**
     * Gets the status value for this ChangeDeviceRetryRequest.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ChangeDeviceRetryRequest.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the remarks value for this ChangeDeviceRetryRequest.
     * 
     * @return remarks
     */
    public java.lang.String getRemarks() {
        return remarks;
    }


    /**
     * Sets the remarks value for this ChangeDeviceRetryRequest.
     * 
     * @param remarks
     */
    public void setRemarks(java.lang.String remarks) {
        this.remarks = remarks;
    }


    /**
     * Gets the customField1 value for this ChangeDeviceRetryRequest.
     * 
     * @return customField1
     */
    public java.lang.String getCustomField1() {
        return customField1;
    }


    /**
     * Sets the customField1 value for this ChangeDeviceRetryRequest.
     * 
     * @param customField1
     */
    public void setCustomField1(java.lang.String customField1) {
        this.customField1 = customField1;
    }


    /**
     * Gets the oldAccountId value for this ChangeDeviceRetryRequest.
     * 
     * @return oldAccountId
     */
    public java.lang.String getOldAccountId() {
        return oldAccountId;
    }


    /**
     * Sets the oldAccountId value for this ChangeDeviceRetryRequest.
     * 
     * @param oldAccountId
     */
    public void setOldAccountId(java.lang.String oldAccountId) {
        this.oldAccountId = oldAccountId;
    }


    /**
     * Gets the newAccountId value for this ChangeDeviceRetryRequest.
     * 
     * @return newAccountId
     */
    public java.lang.String getNewAccountId() {
        return newAccountId;
    }


    /**
     * Sets the newAccountId value for this ChangeDeviceRetryRequest.
     * 
     * @param newAccountId
     */
    public void setNewAccountId(java.lang.String newAccountId) {
        this.newAccountId = newAccountId;
    }


    /**
     * Gets the statusChangeDate value for this ChangeDeviceRetryRequest.
     * 
     * @return statusChangeDate
     */
    public java.lang.String getStatusChangeDate() {
        return statusChangeDate;
    }


    /**
     * Sets the statusChangeDate value for this ChangeDeviceRetryRequest.
     * 
     * @param statusChangeDate
     */
    public void setStatusChangeDate(java.lang.String statusChangeDate) {
        this.statusChangeDate = statusChangeDate;
    }


    /**
     * Gets the oldState value for this ChangeDeviceRetryRequest.
     * 
     * @return oldState
     */
    public java.lang.String getOldState() {
        return oldState;
    }


    /**
     * Sets the oldState value for this ChangeDeviceRetryRequest.
     * 
     * @param oldState
     */
    public void setOldState(java.lang.String oldState) {
        this.oldState = oldState;
    }


    /**
     * Gets the newState value for this ChangeDeviceRetryRequest.
     * 
     * @return newState
     */
    public java.lang.String getNewState() {
        return newState;
    }


    /**
     * Sets the newState value for this ChangeDeviceRetryRequest.
     * 
     * @param newState
     */
    public void setNewState(java.lang.String newState) {
        this.newState = newState;
    }


    /**
     * Gets the technology value for this ChangeDeviceRetryRequest.
     * 
     * @return technology
     */
    public java.lang.String getTechnology() {
        return technology;
    }


    /**
     * Sets the technology value for this ChangeDeviceRetryRequest.
     * 
     * @param technology
     */
    public void setTechnology(java.lang.String technology) {
        this.technology = technology;
    }


    /**
     * Gets the extTransId2 value for this ChangeDeviceRetryRequest.
     * 
     * @return extTransId2
     */
    public java.lang.String getExtTransId2() {
        return extTransId2;
    }


    /**
     * Sets the extTransId2 value for this ChangeDeviceRetryRequest.
     * 
     * @param extTransId2
     */
    public void setExtTransId2(java.lang.String extTransId2) {
        this.extTransId2 = extTransId2;
    }


    /**
     * Gets the channel value for this ChangeDeviceRetryRequest.
     * 
     * @return channel
     */
    public java.lang.String getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this ChangeDeviceRetryRequest.
     * 
     * @param channel
     */
    public void setChannel(java.lang.String channel) {
        this.channel = channel;
    }


    /**
     * Gets the customField2 value for this ChangeDeviceRetryRequest.
     * 
     * @return customField2
     */
    public java.lang.String getCustomField2() {
        return customField2;
    }


    /**
     * Sets the customField2 value for this ChangeDeviceRetryRequest.
     * 
     * @param customField2
     */
    public void setCustomField2(java.lang.String customField2) {
        this.customField2 = customField2;
    }


    /**
     * Gets the customField3 value for this ChangeDeviceRetryRequest.
     * 
     * @return customField3
     */
    public java.lang.String getCustomField3() {
        return customField3;
    }


    /**
     * Sets the customField3 value for this ChangeDeviceRetryRequest.
     * 
     * @param customField3
     */
    public void setCustomField3(java.lang.String customField3) {
        this.customField3 = customField3;
    }


    /**
     * Gets the customField4 value for this ChangeDeviceRetryRequest.
     * 
     * @return customField4
     */
    public java.lang.String getCustomField4() {
        return customField4;
    }


    /**
     * Sets the customField4 value for this ChangeDeviceRetryRequest.
     * 
     * @param customField4
     */
    public void setCustomField4(java.lang.String customField4) {
        this.customField4 = customField4;
    }


    /**
     * Gets the customField5 value for this ChangeDeviceRetryRequest.
     * 
     * @return customField5
     */
    public java.lang.String getCustomField5() {
        return customField5;
    }


    /**
     * Sets the customField5 value for this ChangeDeviceRetryRequest.
     * 
     * @param customField5
     */
    public void setCustomField5(java.lang.String customField5) {
        this.customField5 = customField5;
    }


    /**
     * Gets the customField6 value for this ChangeDeviceRetryRequest.
     * 
     * @return customField6
     */
    public java.lang.String getCustomField6() {
        return customField6;
    }


    /**
     * Sets the customField6 value for this ChangeDeviceRetryRequest.
     * 
     * @param customField6
     */
    public void setCustomField6(java.lang.String customField6) {
        this.customField6 = customField6;
    }


    /**
     * Gets the unsubATP_YN value for this ChangeDeviceRetryRequest.
     * 
     * @return unsubATP_YN
     */
    public java.lang.String getUnsubATP_YN() {
        return unsubATP_YN;
    }


    /**
     * Sets the unsubATP_YN value for this ChangeDeviceRetryRequest.
     * 
     * @param unsubATP_YN
     */
    public void setUnsubATP_YN(java.lang.String unsubATP_YN) {
        this.unsubATP_YN = unsubATP_YN;
    }


    /**
     * Gets the nir value for this ChangeDeviceRetryRequest.
     * 
     * @return nir
     */
    public java.lang.String getNir() {
        return nir;
    }


    /**
     * Sets the nir value for this ChangeDeviceRetryRequest.
     * 
     * @param nir
     */
    public void setNir(java.lang.String nir) {
        this.nir = nir;
    }


    /**
     * Gets the volteTransID value for this ChangeDeviceRetryRequest.
     * 
     * @return volteTransID
     */
    public java.lang.String getVolteTransID() {
        return volteTransID;
    }


    /**
     * Sets the volteTransID value for this ChangeDeviceRetryRequest.
     * 
     * @param volteTransID
     */
    public void setVolteTransID(java.lang.String volteTransID) {
        this.volteTransID = volteTransID;
    }


    /**
     * Gets the volteDeProvRespCode value for this ChangeDeviceRetryRequest.
     * 
     * @return volteDeProvRespCode
     */
    public java.lang.String getVolteDeProvRespCode() {
        return volteDeProvRespCode;
    }


    /**
     * Sets the volteDeProvRespCode value for this ChangeDeviceRetryRequest.
     * 
     * @param volteDeProvRespCode
     */
    public void setVolteDeProvRespCode(java.lang.String volteDeProvRespCode) {
        this.volteDeProvRespCode = volteDeProvRespCode;
    }


    /**
     * Gets the simSaleTransID value for this ChangeDeviceRetryRequest.
     * 
     * @return simSaleTransID
     */
    public java.lang.String getSimSaleTransID() {
        return simSaleTransID;
    }


    /**
     * Sets the simSaleTransID value for this ChangeDeviceRetryRequest.
     * 
     * @param simSaleTransID
     */
    public void setSimSaleTransID(java.lang.String simSaleTransID) {
        this.simSaleTransID = simSaleTransID;
    }


    /**
     * Gets the flag_4G value for this ChangeDeviceRetryRequest.
     * 
     * @return flag_4G
     */
    public java.lang.String getFlag_4G() {
        return flag_4G;
    }


    /**
     * Sets the flag_4G value for this ChangeDeviceRetryRequest.
     * 
     * @param flag_4G
     */
    public void setFlag_4G(java.lang.String flag_4G) {
        this.flag_4G = flag_4G;
    }


    /**
     * Gets the flag_5G value for this ChangeDeviceRetryRequest.
     * 
     * @return flag_5G
     */
    public java.lang.String getFlag_5G() {
        return flag_5G;
    }


    /**
     * Sets the flag_5G value for this ChangeDeviceRetryRequest.
     * 
     * @param flag_5G
     */
    public void setFlag_5G(java.lang.String flag_5G) {
        this.flag_5G = flag_5G;
    }


    /**
     * Gets the insertSubsFlowTrackerTransID value for this ChangeDeviceRetryRequest.
     * 
     * @return insertSubsFlowTrackerTransID
     */
    public java.lang.String getInsertSubsFlowTrackerTransID() {
        return insertSubsFlowTrackerTransID;
    }


    /**
     * Sets the insertSubsFlowTrackerTransID value for this ChangeDeviceRetryRequest.
     * 
     * @param insertSubsFlowTrackerTransID
     */
    public void setInsertSubsFlowTrackerTransID(java.lang.String insertSubsFlowTrackerTransID) {
        this.insertSubsFlowTrackerTransID = insertSubsFlowTrackerTransID;
    }


    /**
     * Gets the insertSubsFlowTrackGenTransID value for this ChangeDeviceRetryRequest.
     * 
     * @return insertSubsFlowTrackGenTransID
     */
    public java.lang.String getInsertSubsFlowTrackGenTransID() {
        return insertSubsFlowTrackGenTransID;
    }


    /**
     * Sets the insertSubsFlowTrackGenTransID value for this ChangeDeviceRetryRequest.
     * 
     * @param insertSubsFlowTrackGenTransID
     */
    public void setInsertSubsFlowTrackGenTransID(java.lang.String insertSubsFlowTrackGenTransID) {
        this.insertSubsFlowTrackGenTransID = insertSubsFlowTrackGenTransID;
    }


    /**
     * Gets the oldCCMsisdn value for this ChangeDeviceRetryRequest.
     * 
     * @return oldCCMsisdn
     */
    public java.lang.String getOldCCMsisdn() {
        return oldCCMsisdn;
    }


    /**
     * Sets the oldCCMsisdn value for this ChangeDeviceRetryRequest.
     * 
     * @param oldCCMsisdn
     */
    public void setOldCCMsisdn(java.lang.String oldCCMsisdn) {
        this.oldCCMsisdn = oldCCMsisdn;
    }


    /**
     * Gets the newCCMsisdn value for this ChangeDeviceRetryRequest.
     * 
     * @return newCCMsisdn
     */
    public java.lang.String getNewCCMsisdn() {
        return newCCMsisdn;
    }


    /**
     * Sets the newCCMsisdn value for this ChangeDeviceRetryRequest.
     * 
     * @param newCCMsisdn
     */
    public void setNewCCMsisdn(java.lang.String newCCMsisdn) {
        this.newCCMsisdn = newCCMsisdn;
    }


    /**
     * Gets the userName value for this ChangeDeviceRetryRequest.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this ChangeDeviceRetryRequest.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the userPassword value for this ChangeDeviceRetryRequest.
     * 
     * @return userPassword
     */
    public java.lang.String getUserPassword() {
        return userPassword;
    }


    /**
     * Sets the userPassword value for this ChangeDeviceRetryRequest.
     * 
     * @param userPassword
     */
    public void setUserPassword(java.lang.String userPassword) {
        this.userPassword = userPassword;
    }


    /**
     * Gets the userDefined1 value for this ChangeDeviceRetryRequest.
     * 
     * @return userDefined1
     */
    public java.lang.String getUserDefined1() {
        return userDefined1;
    }


    /**
     * Sets the userDefined1 value for this ChangeDeviceRetryRequest.
     * 
     * @param userDefined1
     */
    public void setUserDefined1(java.lang.String userDefined1) {
        this.userDefined1 = userDefined1;
    }


    /**
     * Gets the userDefined2 value for this ChangeDeviceRetryRequest.
     * 
     * @return userDefined2
     */
    public java.lang.String getUserDefined2() {
        return userDefined2;
    }


    /**
     * Sets the userDefined2 value for this ChangeDeviceRetryRequest.
     * 
     * @param userDefined2
     */
    public void setUserDefined2(java.lang.String userDefined2) {
        this.userDefined2 = userDefined2;
    }


    /**
     * Gets the userDefined3 value for this ChangeDeviceRetryRequest.
     * 
     * @return userDefined3
     */
    public java.lang.String getUserDefined3() {
        return userDefined3;
    }


    /**
     * Sets the userDefined3 value for this ChangeDeviceRetryRequest.
     * 
     * @param userDefined3
     */
    public void setUserDefined3(java.lang.String userDefined3) {
        this.userDefined3 = userDefined3;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeDeviceRetryRequest)) return false;
        ChangeDeviceRetryRequest other = (ChangeDeviceRetryRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.deviceType==null && other.getDeviceType()==null) || 
             (this.deviceType!=null &&
              this.deviceType.equals(other.getDeviceType()))) &&
            ((this.oldValue==null && other.getOldValue()==null) || 
             (this.oldValue!=null &&
              this.oldValue.equals(other.getOldValue()))) &&
            ((this.newValue==null && other.getNewValue()==null) || 
             (this.newValue!=null &&
              this.newValue.equals(other.getNewValue()))) &&
            ((this.charges==null && other.getCharges()==null) || 
             (this.charges!=null &&
              this.charges.equals(other.getCharges()))) &&
            ((this.newSerialNo==null && other.getNewSerialNo()==null) || 
             (this.newSerialNo!=null &&
              this.newSerialNo.equals(other.getNewSerialNo()))) &&
            ((this.zipCode==null && other.getZipCode()==null) || 
             (this.zipCode!=null &&
              this.zipCode.equals(other.getZipCode()))) &&
            ((this.provComp==null && other.getProvComp()==null) || 
             (this.provComp!=null &&
              this.provComp.equals(other.getProvComp()))) &&
            ((this.idValue==null && other.getIdValue()==null) || 
             (this.idValue!=null &&
              this.idValue.equals(other.getIdValue()))) &&
            ((this.failedNode==null && other.getFailedNode()==null) || 
             (this.failedNode!=null &&
              this.failedNode.equals(other.getFailedNode()))) &&
            ((this.transactionID==null && other.getTransactionID()==null) || 
             (this.transactionID!=null &&
              this.transactionID.equals(other.getTransactionID()))) &&
            ((this.activityType==null && other.getActivityType()==null) || 
             (this.activityType!=null &&
              this.activityType.equals(other.getActivityType()))) &&
            ((this.oldMsisdn==null && other.getOldMsisdn()==null) || 
             (this.oldMsisdn!=null &&
              this.oldMsisdn.equals(other.getOldMsisdn()))) &&
            ((this.newMsisdn==null && other.getNewMsisdn()==null) || 
             (this.newMsisdn!=null &&
              this.newMsisdn.equals(other.getNewMsisdn()))) &&
            ((this.oldIMSI==null && other.getOldIMSI()==null) || 
             (this.oldIMSI!=null &&
              this.oldIMSI.equals(other.getOldIMSI()))) &&
            ((this.newIMSI==null && other.getNewIMSI()==null) || 
             (this.newIMSI!=null &&
              this.newIMSI.equals(other.getNewIMSI()))) &&
            ((this.currStateId==null && other.getCurrStateId()==null) || 
             (this.currStateId!=null &&
              this.currStateId.equals(other.getCurrStateId()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.remarks==null && other.getRemarks()==null) || 
             (this.remarks!=null &&
              this.remarks.equals(other.getRemarks()))) &&
            ((this.customField1==null && other.getCustomField1()==null) || 
             (this.customField1!=null &&
              this.customField1.equals(other.getCustomField1()))) &&
            ((this.oldAccountId==null && other.getOldAccountId()==null) || 
             (this.oldAccountId!=null &&
              this.oldAccountId.equals(other.getOldAccountId()))) &&
            ((this.newAccountId==null && other.getNewAccountId()==null) || 
             (this.newAccountId!=null &&
              this.newAccountId.equals(other.getNewAccountId()))) &&
            ((this.statusChangeDate==null && other.getStatusChangeDate()==null) || 
             (this.statusChangeDate!=null &&
              this.statusChangeDate.equals(other.getStatusChangeDate()))) &&
            ((this.oldState==null && other.getOldState()==null) || 
             (this.oldState!=null &&
              this.oldState.equals(other.getOldState()))) &&
            ((this.newState==null && other.getNewState()==null) || 
             (this.newState!=null &&
              this.newState.equals(other.getNewState()))) &&
            ((this.technology==null && other.getTechnology()==null) || 
             (this.technology!=null &&
              this.technology.equals(other.getTechnology()))) &&
            ((this.extTransId2==null && other.getExtTransId2()==null) || 
             (this.extTransId2!=null &&
              this.extTransId2.equals(other.getExtTransId2()))) &&
            ((this.channel==null && other.getChannel()==null) || 
             (this.channel!=null &&
              this.channel.equals(other.getChannel()))) &&
            ((this.customField2==null && other.getCustomField2()==null) || 
             (this.customField2!=null &&
              this.customField2.equals(other.getCustomField2()))) &&
            ((this.customField3==null && other.getCustomField3()==null) || 
             (this.customField3!=null &&
              this.customField3.equals(other.getCustomField3()))) &&
            ((this.customField4==null && other.getCustomField4()==null) || 
             (this.customField4!=null &&
              this.customField4.equals(other.getCustomField4()))) &&
            ((this.customField5==null && other.getCustomField5()==null) || 
             (this.customField5!=null &&
              this.customField5.equals(other.getCustomField5()))) &&
            ((this.customField6==null && other.getCustomField6()==null) || 
             (this.customField6!=null &&
              this.customField6.equals(other.getCustomField6()))) &&
            ((this.unsubATP_YN==null && other.getUnsubATP_YN()==null) || 
             (this.unsubATP_YN!=null &&
              this.unsubATP_YN.equals(other.getUnsubATP_YN()))) &&
            ((this.nir==null && other.getNir()==null) || 
             (this.nir!=null &&
              this.nir.equals(other.getNir()))) &&
            ((this.volteTransID==null && other.getVolteTransID()==null) || 
             (this.volteTransID!=null &&
              this.volteTransID.equals(other.getVolteTransID()))) &&
            ((this.volteDeProvRespCode==null && other.getVolteDeProvRespCode()==null) || 
             (this.volteDeProvRespCode!=null &&
              this.volteDeProvRespCode.equals(other.getVolteDeProvRespCode()))) &&
            ((this.simSaleTransID==null && other.getSimSaleTransID()==null) || 
             (this.simSaleTransID!=null &&
              this.simSaleTransID.equals(other.getSimSaleTransID()))) &&
            ((this.flag_4G==null && other.getFlag_4G()==null) || 
             (this.flag_4G!=null &&
              this.flag_4G.equals(other.getFlag_4G()))) &&
            ((this.flag_5G==null && other.getFlag_5G()==null) || 
             (this.flag_5G!=null &&
              this.flag_5G.equals(other.getFlag_5G()))) &&
            ((this.insertSubsFlowTrackerTransID==null && other.getInsertSubsFlowTrackerTransID()==null) || 
             (this.insertSubsFlowTrackerTransID!=null &&
              this.insertSubsFlowTrackerTransID.equals(other.getInsertSubsFlowTrackerTransID()))) &&
            ((this.insertSubsFlowTrackGenTransID==null && other.getInsertSubsFlowTrackGenTransID()==null) || 
             (this.insertSubsFlowTrackGenTransID!=null &&
              this.insertSubsFlowTrackGenTransID.equals(other.getInsertSubsFlowTrackGenTransID()))) &&
            ((this.oldCCMsisdn==null && other.getOldCCMsisdn()==null) || 
             (this.oldCCMsisdn!=null &&
              this.oldCCMsisdn.equals(other.getOldCCMsisdn()))) &&
            ((this.newCCMsisdn==null && other.getNewCCMsisdn()==null) || 
             (this.newCCMsisdn!=null &&
              this.newCCMsisdn.equals(other.getNewCCMsisdn()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.userPassword==null && other.getUserPassword()==null) || 
             (this.userPassword!=null &&
              this.userPassword.equals(other.getUserPassword()))) &&
            ((this.userDefined1==null && other.getUserDefined1()==null) || 
             (this.userDefined1!=null &&
              this.userDefined1.equals(other.getUserDefined1()))) &&
            ((this.userDefined2==null && other.getUserDefined2()==null) || 
             (this.userDefined2!=null &&
              this.userDefined2.equals(other.getUserDefined2()))) &&
            ((this.userDefined3==null && other.getUserDefined3()==null) || 
             (this.userDefined3!=null &&
              this.userDefined3.equals(other.getUserDefined3())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getDeviceType() != null) {
            _hashCode += getDeviceType().hashCode();
        }
        if (getOldValue() != null) {
            _hashCode += getOldValue().hashCode();
        }
        if (getNewValue() != null) {
            _hashCode += getNewValue().hashCode();
        }
        if (getCharges() != null) {
            _hashCode += getCharges().hashCode();
        }
        if (getNewSerialNo() != null) {
            _hashCode += getNewSerialNo().hashCode();
        }
        if (getZipCode() != null) {
            _hashCode += getZipCode().hashCode();
        }
        if (getProvComp() != null) {
            _hashCode += getProvComp().hashCode();
        }
        if (getIdValue() != null) {
            _hashCode += getIdValue().hashCode();
        }
        if (getFailedNode() != null) {
            _hashCode += getFailedNode().hashCode();
        }
        if (getTransactionID() != null) {
            _hashCode += getTransactionID().hashCode();
        }
        if (getActivityType() != null) {
            _hashCode += getActivityType().hashCode();
        }
        if (getOldMsisdn() != null) {
            _hashCode += getOldMsisdn().hashCode();
        }
        if (getNewMsisdn() != null) {
            _hashCode += getNewMsisdn().hashCode();
        }
        if (getOldIMSI() != null) {
            _hashCode += getOldIMSI().hashCode();
        }
        if (getNewIMSI() != null) {
            _hashCode += getNewIMSI().hashCode();
        }
        if (getCurrStateId() != null) {
            _hashCode += getCurrStateId().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getRemarks() != null) {
            _hashCode += getRemarks().hashCode();
        }
        if (getCustomField1() != null) {
            _hashCode += getCustomField1().hashCode();
        }
        if (getOldAccountId() != null) {
            _hashCode += getOldAccountId().hashCode();
        }
        if (getNewAccountId() != null) {
            _hashCode += getNewAccountId().hashCode();
        }
        if (getStatusChangeDate() != null) {
            _hashCode += getStatusChangeDate().hashCode();
        }
        if (getOldState() != null) {
            _hashCode += getOldState().hashCode();
        }
        if (getNewState() != null) {
            _hashCode += getNewState().hashCode();
        }
        if (getTechnology() != null) {
            _hashCode += getTechnology().hashCode();
        }
        if (getExtTransId2() != null) {
            _hashCode += getExtTransId2().hashCode();
        }
        if (getChannel() != null) {
            _hashCode += getChannel().hashCode();
        }
        if (getCustomField2() != null) {
            _hashCode += getCustomField2().hashCode();
        }
        if (getCustomField3() != null) {
            _hashCode += getCustomField3().hashCode();
        }
        if (getCustomField4() != null) {
            _hashCode += getCustomField4().hashCode();
        }
        if (getCustomField5() != null) {
            _hashCode += getCustomField5().hashCode();
        }
        if (getCustomField6() != null) {
            _hashCode += getCustomField6().hashCode();
        }
        if (getUnsubATP_YN() != null) {
            _hashCode += getUnsubATP_YN().hashCode();
        }
        if (getNir() != null) {
            _hashCode += getNir().hashCode();
        }
        if (getVolteTransID() != null) {
            _hashCode += getVolteTransID().hashCode();
        }
        if (getVolteDeProvRespCode() != null) {
            _hashCode += getVolteDeProvRespCode().hashCode();
        }
        if (getSimSaleTransID() != null) {
            _hashCode += getSimSaleTransID().hashCode();
        }
        if (getFlag_4G() != null) {
            _hashCode += getFlag_4G().hashCode();
        }
        if (getFlag_5G() != null) {
            _hashCode += getFlag_5G().hashCode();
        }
        if (getInsertSubsFlowTrackerTransID() != null) {
            _hashCode += getInsertSubsFlowTrackerTransID().hashCode();
        }
        if (getInsertSubsFlowTrackGenTransID() != null) {
            _hashCode += getInsertSubsFlowTrackGenTransID().hashCode();
        }
        if (getOldCCMsisdn() != null) {
            _hashCode += getOldCCMsisdn().hashCode();
        }
        if (getNewCCMsisdn() != null) {
            _hashCode += getNewCCMsisdn().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getUserPassword() != null) {
            _hashCode += getUserPassword().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeDeviceRetryRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", ">changeDeviceRetryRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "AccountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "deviceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "DeviceType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "oldValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "newValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("charges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "charges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newSerialNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "newSerialNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "zipCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provComp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "provComp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "idValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedNode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "failedNode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "transactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "activityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldMsisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "oldMsisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newMsisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "newMsisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldIMSI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "oldIMSI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newIMSI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "newIMSI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currStateId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "currStateId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remarks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "remarks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customField1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "customField1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldAccountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "oldAccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newAccountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "newAccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusChangeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "statusChangeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "oldState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "newState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("technology");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "technology"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extTransId2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "extTransId2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "channel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customField2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "customField2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customField3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "customField3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customField4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "customField4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customField5");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "customField5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customField6");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "customField6"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unsubATP_YN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "unsubATP_YN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nir");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "nir"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volteTransID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "volteTransID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volteDeProvRespCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "volteDeProvRespCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("simSaleTransID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "simSaleTransID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flag_4G");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "flag_4G"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flag_5G");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "flag_5G"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertSubsFlowTrackerTransID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "insertSubsFlowTrackerTransID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertSubsFlowTrackGenTransID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "insertSubsFlowTrackGenTransID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldCCMsisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "oldCCMsisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newCCMsisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "newCCMsisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "userName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "userPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefined1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "userDefined1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefined2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "userDefined2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefined3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "userDefined3"));
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
