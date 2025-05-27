/**
 * GetSubscriberInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class GetSubscriberInfoResponse  implements java.io.Serializable {
    private java.lang.Long accountId;

    private java.lang.Long MSISDN;

    private java.lang.String validityDate;

    private java.lang.String activationDate;

    private java.lang.String gracePeriod1EndDate;

    private java.lang.String expiryDate;

    private java.math.BigDecimal thresholdBalance;

    private java.math.BigDecimal accntBalance;

    private java.lang.String status;

    private java.lang.String statusDate;

    private java.lang.String language;

    private java.math.BigDecimal promoBalance;

    private java.lang.String promoValidityDate;

    private java.lang.String dataExpiryDate;

    private java.lang.String lastCallDate;

    private java.math.BigDecimal lastCallCharge;

    private java.math.BigDecimal totalBalance;

    private java.lang.String subscriberTimeZone;

    private java.lang.String PIN;

    private java.lang.String VMSServiceStatus;

    private java.lang.Long totalEarnedCredits;

    private java.lang.Long earnedCreditsinLast30Days;

    private java.lang.Long usedCreditsinLast30Days;

    private java.lang.Long freeSMSCount;

    private java.math.BigDecimal freeSMSRuppes;

    private java.lang.Long promoDataBytes;

    private java.lang.String promoDataExpiryDate;

    private java.lang.String GPRSServStatus;

    private java.lang.String lastReloadTimeStamp;

    private java.math.BigDecimal lastReloadAmount;

    private java.lang.Long imsiNo;

    private java.lang.Long latestTarrifPlanID;

    private java.lang.String simSerialNo;

    private java.lang.String tarrifName;

    private java.lang.Long totalUsedCredits;

    private java.lang.String lastTransAction;

    private java.math.BigDecimal lastTransCharge;

    private java.lang.String lastTransTimestamp;

    private java.math.BigDecimal availableCredit;

    public GetSubscriberInfoResponse() {
    }

    public GetSubscriberInfoResponse(
           java.lang.Long accountId,
           java.lang.Long MSISDN,
           java.lang.String validityDate,
           java.lang.String activationDate,
           java.lang.String gracePeriod1EndDate,
           java.lang.String expiryDate,
           java.math.BigDecimal thresholdBalance,
           java.math.BigDecimal accntBalance,
           java.lang.String status,
           java.lang.String statusDate,
           java.lang.String language,
           java.math.BigDecimal promoBalance,
           java.lang.String promoValidityDate,
           java.lang.String dataExpiryDate,
           java.lang.String lastCallDate,
           java.math.BigDecimal lastCallCharge,
           java.math.BigDecimal totalBalance,
           java.lang.String subscriberTimeZone,
           java.lang.String PIN,
           java.lang.String VMSServiceStatus,
           java.lang.Long totalEarnedCredits,
           java.lang.Long earnedCreditsinLast30Days,
           java.lang.Long usedCreditsinLast30Days,
           java.lang.Long freeSMSCount,
           java.math.BigDecimal freeSMSRuppes,
           java.lang.Long promoDataBytes,
           java.lang.String promoDataExpiryDate,
           java.lang.String GPRSServStatus,
           java.lang.String lastReloadTimeStamp,
           java.math.BigDecimal lastReloadAmount,
           java.lang.Long imsiNo,
           java.lang.Long latestTarrifPlanID,
           java.lang.String simSerialNo,
           java.lang.String tarrifName,
           java.lang.Long totalUsedCredits,
           java.lang.String lastTransAction,
           java.math.BigDecimal lastTransCharge,
           java.lang.String lastTransTimestamp,
           java.math.BigDecimal availableCredit) {
           this.accountId = accountId;
           this.MSISDN = MSISDN;
           this.validityDate = validityDate;
           this.activationDate = activationDate;
           this.gracePeriod1EndDate = gracePeriod1EndDate;
           this.expiryDate = expiryDate;
           this.thresholdBalance = thresholdBalance;
           this.accntBalance = accntBalance;
           this.status = status;
           this.statusDate = statusDate;
           this.language = language;
           this.promoBalance = promoBalance;
           this.promoValidityDate = promoValidityDate;
           this.dataExpiryDate = dataExpiryDate;
           this.lastCallDate = lastCallDate;
           this.lastCallCharge = lastCallCharge;
           this.totalBalance = totalBalance;
           this.subscriberTimeZone = subscriberTimeZone;
           this.PIN = PIN;
           this.VMSServiceStatus = VMSServiceStatus;
           this.totalEarnedCredits = totalEarnedCredits;
           this.earnedCreditsinLast30Days = earnedCreditsinLast30Days;
           this.usedCreditsinLast30Days = usedCreditsinLast30Days;
           this.freeSMSCount = freeSMSCount;
           this.freeSMSRuppes = freeSMSRuppes;
           this.promoDataBytes = promoDataBytes;
           this.promoDataExpiryDate = promoDataExpiryDate;
           this.GPRSServStatus = GPRSServStatus;
           this.lastReloadTimeStamp = lastReloadTimeStamp;
           this.lastReloadAmount = lastReloadAmount;
           this.imsiNo = imsiNo;
           this.latestTarrifPlanID = latestTarrifPlanID;
           this.simSerialNo = simSerialNo;
           this.tarrifName = tarrifName;
           this.totalUsedCredits = totalUsedCredits;
           this.lastTransAction = lastTransAction;
           this.lastTransCharge = lastTransCharge;
           this.lastTransTimestamp = lastTransTimestamp;
           this.availableCredit = availableCredit;
    }


    /**
     * Gets the accountId value for this GetSubscriberInfoResponse.
     * 
     * @return accountId
     */
    public java.lang.Long getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this GetSubscriberInfoResponse.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.Long accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the MSISDN value for this GetSubscriberInfoResponse.
     * 
     * @return MSISDN
     */
    public java.lang.Long getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this GetSubscriberInfoResponse.
     * 
     * @param MSISDN
     */
    public void setMSISDN(java.lang.Long MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the validityDate value for this GetSubscriberInfoResponse.
     * 
     * @return validityDate
     */
    public java.lang.String getValidityDate() {
        return validityDate;
    }


    /**
     * Sets the validityDate value for this GetSubscriberInfoResponse.
     * 
     * @param validityDate
     */
    public void setValidityDate(java.lang.String validityDate) {
        this.validityDate = validityDate;
    }


    /**
     * Gets the activationDate value for this GetSubscriberInfoResponse.
     * 
     * @return activationDate
     */
    public java.lang.String getActivationDate() {
        return activationDate;
    }


    /**
     * Sets the activationDate value for this GetSubscriberInfoResponse.
     * 
     * @param activationDate
     */
    public void setActivationDate(java.lang.String activationDate) {
        this.activationDate = activationDate;
    }


    /**
     * Gets the gracePeriod1EndDate value for this GetSubscriberInfoResponse.
     * 
     * @return gracePeriod1EndDate
     */
    public java.lang.String getGracePeriod1EndDate() {
        return gracePeriod1EndDate;
    }


    /**
     * Sets the gracePeriod1EndDate value for this GetSubscriberInfoResponse.
     * 
     * @param gracePeriod1EndDate
     */
    public void setGracePeriod1EndDate(java.lang.String gracePeriod1EndDate) {
        this.gracePeriod1EndDate = gracePeriod1EndDate;
    }


    /**
     * Gets the expiryDate value for this GetSubscriberInfoResponse.
     * 
     * @return expiryDate
     */
    public java.lang.String getExpiryDate() {
        return expiryDate;
    }


    /**
     * Sets the expiryDate value for this GetSubscriberInfoResponse.
     * 
     * @param expiryDate
     */
    public void setExpiryDate(java.lang.String expiryDate) {
        this.expiryDate = expiryDate;
    }


    /**
     * Gets the thresholdBalance value for this GetSubscriberInfoResponse.
     * 
     * @return thresholdBalance
     */
    public java.math.BigDecimal getThresholdBalance() {
        return thresholdBalance;
    }


    /**
     * Sets the thresholdBalance value for this GetSubscriberInfoResponse.
     * 
     * @param thresholdBalance
     */
    public void setThresholdBalance(java.math.BigDecimal thresholdBalance) {
        this.thresholdBalance = thresholdBalance;
    }


    /**
     * Gets the accntBalance value for this GetSubscriberInfoResponse.
     * 
     * @return accntBalance
     */
    public java.math.BigDecimal getAccntBalance() {
        return accntBalance;
    }


    /**
     * Sets the accntBalance value for this GetSubscriberInfoResponse.
     * 
     * @param accntBalance
     */
    public void setAccntBalance(java.math.BigDecimal accntBalance) {
        this.accntBalance = accntBalance;
    }


    /**
     * Gets the status value for this GetSubscriberInfoResponse.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this GetSubscriberInfoResponse.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the statusDate value for this GetSubscriberInfoResponse.
     * 
     * @return statusDate
     */
    public java.lang.String getStatusDate() {
        return statusDate;
    }


    /**
     * Sets the statusDate value for this GetSubscriberInfoResponse.
     * 
     * @param statusDate
     */
    public void setStatusDate(java.lang.String statusDate) {
        this.statusDate = statusDate;
    }


    /**
     * Gets the language value for this GetSubscriberInfoResponse.
     * 
     * @return language
     */
    public java.lang.String getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this GetSubscriberInfoResponse.
     * 
     * @param language
     */
    public void setLanguage(java.lang.String language) {
        this.language = language;
    }


    /**
     * Gets the promoBalance value for this GetSubscriberInfoResponse.
     * 
     * @return promoBalance
     */
    public java.math.BigDecimal getPromoBalance() {
        return promoBalance;
    }


    /**
     * Sets the promoBalance value for this GetSubscriberInfoResponse.
     * 
     * @param promoBalance
     */
    public void setPromoBalance(java.math.BigDecimal promoBalance) {
        this.promoBalance = promoBalance;
    }


    /**
     * Gets the promoValidityDate value for this GetSubscriberInfoResponse.
     * 
     * @return promoValidityDate
     */
    public java.lang.String getPromoValidityDate() {
        return promoValidityDate;
    }


    /**
     * Sets the promoValidityDate value for this GetSubscriberInfoResponse.
     * 
     * @param promoValidityDate
     */
    public void setPromoValidityDate(java.lang.String promoValidityDate) {
        this.promoValidityDate = promoValidityDate;
    }


    /**
     * Gets the dataExpiryDate value for this GetSubscriberInfoResponse.
     * 
     * @return dataExpiryDate
     */
    public java.lang.String getDataExpiryDate() {
        return dataExpiryDate;
    }


    /**
     * Sets the dataExpiryDate value for this GetSubscriberInfoResponse.
     * 
     * @param dataExpiryDate
     */
    public void setDataExpiryDate(java.lang.String dataExpiryDate) {
        this.dataExpiryDate = dataExpiryDate;
    }


    /**
     * Gets the lastCallDate value for this GetSubscriberInfoResponse.
     * 
     * @return lastCallDate
     */
    public java.lang.String getLastCallDate() {
        return lastCallDate;
    }


    /**
     * Sets the lastCallDate value for this GetSubscriberInfoResponse.
     * 
     * @param lastCallDate
     */
    public void setLastCallDate(java.lang.String lastCallDate) {
        this.lastCallDate = lastCallDate;
    }


    /**
     * Gets the lastCallCharge value for this GetSubscriberInfoResponse.
     * 
     * @return lastCallCharge
     */
    public java.math.BigDecimal getLastCallCharge() {
        return lastCallCharge;
    }


    /**
     * Sets the lastCallCharge value for this GetSubscriberInfoResponse.
     * 
     * @param lastCallCharge
     */
    public void setLastCallCharge(java.math.BigDecimal lastCallCharge) {
        this.lastCallCharge = lastCallCharge;
    }


    /**
     * Gets the totalBalance value for this GetSubscriberInfoResponse.
     * 
     * @return totalBalance
     */
    public java.math.BigDecimal getTotalBalance() {
        return totalBalance;
    }


    /**
     * Sets the totalBalance value for this GetSubscriberInfoResponse.
     * 
     * @param totalBalance
     */
    public void setTotalBalance(java.math.BigDecimal totalBalance) {
        this.totalBalance = totalBalance;
    }


    /**
     * Gets the subscriberTimeZone value for this GetSubscriberInfoResponse.
     * 
     * @return subscriberTimeZone
     */
    public java.lang.String getSubscriberTimeZone() {
        return subscriberTimeZone;
    }


    /**
     * Sets the subscriberTimeZone value for this GetSubscriberInfoResponse.
     * 
     * @param subscriberTimeZone
     */
    public void setSubscriberTimeZone(java.lang.String subscriberTimeZone) {
        this.subscriberTimeZone = subscriberTimeZone;
    }


    /**
     * Gets the PIN value for this GetSubscriberInfoResponse.
     * 
     * @return PIN
     */
    public java.lang.String getPIN() {
        return PIN;
    }


    /**
     * Sets the PIN value for this GetSubscriberInfoResponse.
     * 
     * @param PIN
     */
    public void setPIN(java.lang.String PIN) {
        this.PIN = PIN;
    }


    /**
     * Gets the VMSServiceStatus value for this GetSubscriberInfoResponse.
     * 
     * @return VMSServiceStatus
     */
    public java.lang.String getVMSServiceStatus() {
        return VMSServiceStatus;
    }


    /**
     * Sets the VMSServiceStatus value for this GetSubscriberInfoResponse.
     * 
     * @param VMSServiceStatus
     */
    public void setVMSServiceStatus(java.lang.String VMSServiceStatus) {
        this.VMSServiceStatus = VMSServiceStatus;
    }


    /**
     * Gets the totalEarnedCredits value for this GetSubscriberInfoResponse.
     * 
     * @return totalEarnedCredits
     */
    public java.lang.Long getTotalEarnedCredits() {
        return totalEarnedCredits;
    }


    /**
     * Sets the totalEarnedCredits value for this GetSubscriberInfoResponse.
     * 
     * @param totalEarnedCredits
     */
    public void setTotalEarnedCredits(java.lang.Long totalEarnedCredits) {
        this.totalEarnedCredits = totalEarnedCredits;
    }


    /**
     * Gets the earnedCreditsinLast30Days value for this GetSubscriberInfoResponse.
     * 
     * @return earnedCreditsinLast30Days
     */
    public java.lang.Long getEarnedCreditsinLast30Days() {
        return earnedCreditsinLast30Days;
    }


    /**
     * Sets the earnedCreditsinLast30Days value for this GetSubscriberInfoResponse.
     * 
     * @param earnedCreditsinLast30Days
     */
    public void setEarnedCreditsinLast30Days(java.lang.Long earnedCreditsinLast30Days) {
        this.earnedCreditsinLast30Days = earnedCreditsinLast30Days;
    }


    /**
     * Gets the usedCreditsinLast30Days value for this GetSubscriberInfoResponse.
     * 
     * @return usedCreditsinLast30Days
     */
    public java.lang.Long getUsedCreditsinLast30Days() {
        return usedCreditsinLast30Days;
    }


    /**
     * Sets the usedCreditsinLast30Days value for this GetSubscriberInfoResponse.
     * 
     * @param usedCreditsinLast30Days
     */
    public void setUsedCreditsinLast30Days(java.lang.Long usedCreditsinLast30Days) {
        this.usedCreditsinLast30Days = usedCreditsinLast30Days;
    }


    /**
     * Gets the freeSMSCount value for this GetSubscriberInfoResponse.
     * 
     * @return freeSMSCount
     */
    public java.lang.Long getFreeSMSCount() {
        return freeSMSCount;
    }


    /**
     * Sets the freeSMSCount value for this GetSubscriberInfoResponse.
     * 
     * @param freeSMSCount
     */
    public void setFreeSMSCount(java.lang.Long freeSMSCount) {
        this.freeSMSCount = freeSMSCount;
    }


    /**
     * Gets the freeSMSRuppes value for this GetSubscriberInfoResponse.
     * 
     * @return freeSMSRuppes
     */
    public java.math.BigDecimal getFreeSMSRuppes() {
        return freeSMSRuppes;
    }


    /**
     * Sets the freeSMSRuppes value for this GetSubscriberInfoResponse.
     * 
     * @param freeSMSRuppes
     */
    public void setFreeSMSRuppes(java.math.BigDecimal freeSMSRuppes) {
        this.freeSMSRuppes = freeSMSRuppes;
    }


    /**
     * Gets the promoDataBytes value for this GetSubscriberInfoResponse.
     * 
     * @return promoDataBytes
     */
    public java.lang.Long getPromoDataBytes() {
        return promoDataBytes;
    }


    /**
     * Sets the promoDataBytes value for this GetSubscriberInfoResponse.
     * 
     * @param promoDataBytes
     */
    public void setPromoDataBytes(java.lang.Long promoDataBytes) {
        this.promoDataBytes = promoDataBytes;
    }


    /**
     * Gets the promoDataExpiryDate value for this GetSubscriberInfoResponse.
     * 
     * @return promoDataExpiryDate
     */
    public java.lang.String getPromoDataExpiryDate() {
        return promoDataExpiryDate;
    }


    /**
     * Sets the promoDataExpiryDate value for this GetSubscriberInfoResponse.
     * 
     * @param promoDataExpiryDate
     */
    public void setPromoDataExpiryDate(java.lang.String promoDataExpiryDate) {
        this.promoDataExpiryDate = promoDataExpiryDate;
    }


    /**
     * Gets the GPRSServStatus value for this GetSubscriberInfoResponse.
     * 
     * @return GPRSServStatus
     */
    public java.lang.String getGPRSServStatus() {
        return GPRSServStatus;
    }


    /**
     * Sets the GPRSServStatus value for this GetSubscriberInfoResponse.
     * 
     * @param GPRSServStatus
     */
    public void setGPRSServStatus(java.lang.String GPRSServStatus) {
        this.GPRSServStatus = GPRSServStatus;
    }


    /**
     * Gets the lastReloadTimeStamp value for this GetSubscriberInfoResponse.
     * 
     * @return lastReloadTimeStamp
     */
    public java.lang.String getLastReloadTimeStamp() {
        return lastReloadTimeStamp;
    }


    /**
     * Sets the lastReloadTimeStamp value for this GetSubscriberInfoResponse.
     * 
     * @param lastReloadTimeStamp
     */
    public void setLastReloadTimeStamp(java.lang.String lastReloadTimeStamp) {
        this.lastReloadTimeStamp = lastReloadTimeStamp;
    }


    /**
     * Gets the lastReloadAmount value for this GetSubscriberInfoResponse.
     * 
     * @return lastReloadAmount
     */
    public java.math.BigDecimal getLastReloadAmount() {
        return lastReloadAmount;
    }


    /**
     * Sets the lastReloadAmount value for this GetSubscriberInfoResponse.
     * 
     * @param lastReloadAmount
     */
    public void setLastReloadAmount(java.math.BigDecimal lastReloadAmount) {
        this.lastReloadAmount = lastReloadAmount;
    }


    /**
     * Gets the imsiNo value for this GetSubscriberInfoResponse.
     * 
     * @return imsiNo
     */
    public java.lang.Long getImsiNo() {
        return imsiNo;
    }


    /**
     * Sets the imsiNo value for this GetSubscriberInfoResponse.
     * 
     * @param imsiNo
     */
    public void setImsiNo(java.lang.Long imsiNo) {
        this.imsiNo = imsiNo;
    }


    /**
     * Gets the latestTarrifPlanID value for this GetSubscriberInfoResponse.
     * 
     * @return latestTarrifPlanID
     */
    public java.lang.Long getLatestTarrifPlanID() {
        return latestTarrifPlanID;
    }


    /**
     * Sets the latestTarrifPlanID value for this GetSubscriberInfoResponse.
     * 
     * @param latestTarrifPlanID
     */
    public void setLatestTarrifPlanID(java.lang.Long latestTarrifPlanID) {
        this.latestTarrifPlanID = latestTarrifPlanID;
    }


    /**
     * Gets the simSerialNo value for this GetSubscriberInfoResponse.
     * 
     * @return simSerialNo
     */
    public java.lang.String getSimSerialNo() {
        return simSerialNo;
    }


    /**
     * Sets the simSerialNo value for this GetSubscriberInfoResponse.
     * 
     * @param simSerialNo
     */
    public void setSimSerialNo(java.lang.String simSerialNo) {
        this.simSerialNo = simSerialNo;
    }


    /**
     * Gets the tarrifName value for this GetSubscriberInfoResponse.
     * 
     * @return tarrifName
     */
    public java.lang.String getTarrifName() {
        return tarrifName;
    }


    /**
     * Sets the tarrifName value for this GetSubscriberInfoResponse.
     * 
     * @param tarrifName
     */
    public void setTarrifName(java.lang.String tarrifName) {
        this.tarrifName = tarrifName;
    }


    /**
     * Gets the totalUsedCredits value for this GetSubscriberInfoResponse.
     * 
     * @return totalUsedCredits
     */
    public java.lang.Long getTotalUsedCredits() {
        return totalUsedCredits;
    }


    /**
     * Sets the totalUsedCredits value for this GetSubscriberInfoResponse.
     * 
     * @param totalUsedCredits
     */
    public void setTotalUsedCredits(java.lang.Long totalUsedCredits) {
        this.totalUsedCredits = totalUsedCredits;
    }


    /**
     * Gets the lastTransAction value for this GetSubscriberInfoResponse.
     * 
     * @return lastTransAction
     */
    public java.lang.String getLastTransAction() {
        return lastTransAction;
    }


    /**
     * Sets the lastTransAction value for this GetSubscriberInfoResponse.
     * 
     * @param lastTransAction
     */
    public void setLastTransAction(java.lang.String lastTransAction) {
        this.lastTransAction = lastTransAction;
    }


    /**
     * Gets the lastTransCharge value for this GetSubscriberInfoResponse.
     * 
     * @return lastTransCharge
     */
    public java.math.BigDecimal getLastTransCharge() {
        return lastTransCharge;
    }


    /**
     * Sets the lastTransCharge value for this GetSubscriberInfoResponse.
     * 
     * @param lastTransCharge
     */
    public void setLastTransCharge(java.math.BigDecimal lastTransCharge) {
        this.lastTransCharge = lastTransCharge;
    }


    /**
     * Gets the lastTransTimestamp value for this GetSubscriberInfoResponse.
     * 
     * @return lastTransTimestamp
     */
    public java.lang.String getLastTransTimestamp() {
        return lastTransTimestamp;
    }


    /**
     * Sets the lastTransTimestamp value for this GetSubscriberInfoResponse.
     * 
     * @param lastTransTimestamp
     */
    public void setLastTransTimestamp(java.lang.String lastTransTimestamp) {
        this.lastTransTimestamp = lastTransTimestamp;
    }


    /**
     * Gets the availableCredit value for this GetSubscriberInfoResponse.
     * 
     * @return availableCredit
     */
    public java.math.BigDecimal getAvailableCredit() {
        return availableCredit;
    }


    /**
     * Sets the availableCredit value for this GetSubscriberInfoResponse.
     * 
     * @param availableCredit
     */
    public void setAvailableCredit(java.math.BigDecimal availableCredit) {
        this.availableCredit = availableCredit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSubscriberInfoResponse)) return false;
        GetSubscriberInfoResponse other = (GetSubscriberInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.MSISDN==null && other.getMSISDN()==null) || 
             (this.MSISDN!=null &&
              this.MSISDN.equals(other.getMSISDN()))) &&
            ((this.validityDate==null && other.getValidityDate()==null) || 
             (this.validityDate!=null &&
              this.validityDate.equals(other.getValidityDate()))) &&
            ((this.activationDate==null && other.getActivationDate()==null) || 
             (this.activationDate!=null &&
              this.activationDate.equals(other.getActivationDate()))) &&
            ((this.gracePeriod1EndDate==null && other.getGracePeriod1EndDate()==null) || 
             (this.gracePeriod1EndDate!=null &&
              this.gracePeriod1EndDate.equals(other.getGracePeriod1EndDate()))) &&
            ((this.expiryDate==null && other.getExpiryDate()==null) || 
             (this.expiryDate!=null &&
              this.expiryDate.equals(other.getExpiryDate()))) &&
            ((this.thresholdBalance==null && other.getThresholdBalance()==null) || 
             (this.thresholdBalance!=null &&
              this.thresholdBalance.equals(other.getThresholdBalance()))) &&
            ((this.accntBalance==null && other.getAccntBalance()==null) || 
             (this.accntBalance!=null &&
              this.accntBalance.equals(other.getAccntBalance()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.statusDate==null && other.getStatusDate()==null) || 
             (this.statusDate!=null &&
              this.statusDate.equals(other.getStatusDate()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.promoBalance==null && other.getPromoBalance()==null) || 
             (this.promoBalance!=null &&
              this.promoBalance.equals(other.getPromoBalance()))) &&
            ((this.promoValidityDate==null && other.getPromoValidityDate()==null) || 
             (this.promoValidityDate!=null &&
              this.promoValidityDate.equals(other.getPromoValidityDate()))) &&
            ((this.dataExpiryDate==null && other.getDataExpiryDate()==null) || 
             (this.dataExpiryDate!=null &&
              this.dataExpiryDate.equals(other.getDataExpiryDate()))) &&
            ((this.lastCallDate==null && other.getLastCallDate()==null) || 
             (this.lastCallDate!=null &&
              this.lastCallDate.equals(other.getLastCallDate()))) &&
            ((this.lastCallCharge==null && other.getLastCallCharge()==null) || 
             (this.lastCallCharge!=null &&
              this.lastCallCharge.equals(other.getLastCallCharge()))) &&
            ((this.totalBalance==null && other.getTotalBalance()==null) || 
             (this.totalBalance!=null &&
              this.totalBalance.equals(other.getTotalBalance()))) &&
            ((this.subscriberTimeZone==null && other.getSubscriberTimeZone()==null) || 
             (this.subscriberTimeZone!=null &&
              this.subscriberTimeZone.equals(other.getSubscriberTimeZone()))) &&
            ((this.PIN==null && other.getPIN()==null) || 
             (this.PIN!=null &&
              this.PIN.equals(other.getPIN()))) &&
            ((this.VMSServiceStatus==null && other.getVMSServiceStatus()==null) || 
             (this.VMSServiceStatus!=null &&
              this.VMSServiceStatus.equals(other.getVMSServiceStatus()))) &&
            ((this.totalEarnedCredits==null && other.getTotalEarnedCredits()==null) || 
             (this.totalEarnedCredits!=null &&
              this.totalEarnedCredits.equals(other.getTotalEarnedCredits()))) &&
            ((this.earnedCreditsinLast30Days==null && other.getEarnedCreditsinLast30Days()==null) || 
             (this.earnedCreditsinLast30Days!=null &&
              this.earnedCreditsinLast30Days.equals(other.getEarnedCreditsinLast30Days()))) &&
            ((this.usedCreditsinLast30Days==null && other.getUsedCreditsinLast30Days()==null) || 
             (this.usedCreditsinLast30Days!=null &&
              this.usedCreditsinLast30Days.equals(other.getUsedCreditsinLast30Days()))) &&
            ((this.freeSMSCount==null && other.getFreeSMSCount()==null) || 
             (this.freeSMSCount!=null &&
              this.freeSMSCount.equals(other.getFreeSMSCount()))) &&
            ((this.freeSMSRuppes==null && other.getFreeSMSRuppes()==null) || 
             (this.freeSMSRuppes!=null &&
              this.freeSMSRuppes.equals(other.getFreeSMSRuppes()))) &&
            ((this.promoDataBytes==null && other.getPromoDataBytes()==null) || 
             (this.promoDataBytes!=null &&
              this.promoDataBytes.equals(other.getPromoDataBytes()))) &&
            ((this.promoDataExpiryDate==null && other.getPromoDataExpiryDate()==null) || 
             (this.promoDataExpiryDate!=null &&
              this.promoDataExpiryDate.equals(other.getPromoDataExpiryDate()))) &&
            ((this.GPRSServStatus==null && other.getGPRSServStatus()==null) || 
             (this.GPRSServStatus!=null &&
              this.GPRSServStatus.equals(other.getGPRSServStatus()))) &&
            ((this.lastReloadTimeStamp==null && other.getLastReloadTimeStamp()==null) || 
             (this.lastReloadTimeStamp!=null &&
              this.lastReloadTimeStamp.equals(other.getLastReloadTimeStamp()))) &&
            ((this.lastReloadAmount==null && other.getLastReloadAmount()==null) || 
             (this.lastReloadAmount!=null &&
              this.lastReloadAmount.equals(other.getLastReloadAmount()))) &&
            ((this.imsiNo==null && other.getImsiNo()==null) || 
             (this.imsiNo!=null &&
              this.imsiNo.equals(other.getImsiNo()))) &&
            ((this.latestTarrifPlanID==null && other.getLatestTarrifPlanID()==null) || 
             (this.latestTarrifPlanID!=null &&
              this.latestTarrifPlanID.equals(other.getLatestTarrifPlanID()))) &&
            ((this.simSerialNo==null && other.getSimSerialNo()==null) || 
             (this.simSerialNo!=null &&
              this.simSerialNo.equals(other.getSimSerialNo()))) &&
            ((this.tarrifName==null && other.getTarrifName()==null) || 
             (this.tarrifName!=null &&
              this.tarrifName.equals(other.getTarrifName()))) &&
            ((this.totalUsedCredits==null && other.getTotalUsedCredits()==null) || 
             (this.totalUsedCredits!=null &&
              this.totalUsedCredits.equals(other.getTotalUsedCredits()))) &&
            ((this.lastTransAction==null && other.getLastTransAction()==null) || 
             (this.lastTransAction!=null &&
              this.lastTransAction.equals(other.getLastTransAction()))) &&
            ((this.lastTransCharge==null && other.getLastTransCharge()==null) || 
             (this.lastTransCharge!=null &&
              this.lastTransCharge.equals(other.getLastTransCharge()))) &&
            ((this.lastTransTimestamp==null && other.getLastTransTimestamp()==null) || 
             (this.lastTransTimestamp!=null &&
              this.lastTransTimestamp.equals(other.getLastTransTimestamp()))) &&
            ((this.availableCredit==null && other.getAvailableCredit()==null) || 
             (this.availableCredit!=null &&
              this.availableCredit.equals(other.getAvailableCredit())));
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
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getMSISDN() != null) {
            _hashCode += getMSISDN().hashCode();
        }
        if (getValidityDate() != null) {
            _hashCode += getValidityDate().hashCode();
        }
        if (getActivationDate() != null) {
            _hashCode += getActivationDate().hashCode();
        }
        if (getGracePeriod1EndDate() != null) {
            _hashCode += getGracePeriod1EndDate().hashCode();
        }
        if (getExpiryDate() != null) {
            _hashCode += getExpiryDate().hashCode();
        }
        if (getThresholdBalance() != null) {
            _hashCode += getThresholdBalance().hashCode();
        }
        if (getAccntBalance() != null) {
            _hashCode += getAccntBalance().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getStatusDate() != null) {
            _hashCode += getStatusDate().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        if (getPromoBalance() != null) {
            _hashCode += getPromoBalance().hashCode();
        }
        if (getPromoValidityDate() != null) {
            _hashCode += getPromoValidityDate().hashCode();
        }
        if (getDataExpiryDate() != null) {
            _hashCode += getDataExpiryDate().hashCode();
        }
        if (getLastCallDate() != null) {
            _hashCode += getLastCallDate().hashCode();
        }
        if (getLastCallCharge() != null) {
            _hashCode += getLastCallCharge().hashCode();
        }
        if (getTotalBalance() != null) {
            _hashCode += getTotalBalance().hashCode();
        }
        if (getSubscriberTimeZone() != null) {
            _hashCode += getSubscriberTimeZone().hashCode();
        }
        if (getPIN() != null) {
            _hashCode += getPIN().hashCode();
        }
        if (getVMSServiceStatus() != null) {
            _hashCode += getVMSServiceStatus().hashCode();
        }
        if (getTotalEarnedCredits() != null) {
            _hashCode += getTotalEarnedCredits().hashCode();
        }
        if (getEarnedCreditsinLast30Days() != null) {
            _hashCode += getEarnedCreditsinLast30Days().hashCode();
        }
        if (getUsedCreditsinLast30Days() != null) {
            _hashCode += getUsedCreditsinLast30Days().hashCode();
        }
        if (getFreeSMSCount() != null) {
            _hashCode += getFreeSMSCount().hashCode();
        }
        if (getFreeSMSRuppes() != null) {
            _hashCode += getFreeSMSRuppes().hashCode();
        }
        if (getPromoDataBytes() != null) {
            _hashCode += getPromoDataBytes().hashCode();
        }
        if (getPromoDataExpiryDate() != null) {
            _hashCode += getPromoDataExpiryDate().hashCode();
        }
        if (getGPRSServStatus() != null) {
            _hashCode += getGPRSServStatus().hashCode();
        }
        if (getLastReloadTimeStamp() != null) {
            _hashCode += getLastReloadTimeStamp().hashCode();
        }
        if (getLastReloadAmount() != null) {
            _hashCode += getLastReloadAmount().hashCode();
        }
        if (getImsiNo() != null) {
            _hashCode += getImsiNo().hashCode();
        }
        if (getLatestTarrifPlanID() != null) {
            _hashCode += getLatestTarrifPlanID().hashCode();
        }
        if (getSimSerialNo() != null) {
            _hashCode += getSimSerialNo().hashCode();
        }
        if (getTarrifName() != null) {
            _hashCode += getTarrifName().hashCode();
        }
        if (getTotalUsedCredits() != null) {
            _hashCode += getTotalUsedCredits().hashCode();
        }
        if (getLastTransAction() != null) {
            _hashCode += getLastTransAction().hashCode();
        }
        if (getLastTransCharge() != null) {
            _hashCode += getLastTransCharge().hashCode();
        }
        if (getLastTransTimestamp() != null) {
            _hashCode += getLastTransTimestamp().hashCode();
        }
        if (getAvailableCredit() != null) {
            _hashCode += getAvailableCredit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSubscriberInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetSubscriberInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "accountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "MSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "validityDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "activationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gracePeriod1EndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "gracePeriod1EndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "expiryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thresholdBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "thresholdBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accntBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "accntBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "statusDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promoBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "promoBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promoValidityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "promoValidityDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataExpiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "dataExpiryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastCallDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "lastCallDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastCallCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "lastCallCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "totalBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberTimeZone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "subscriberTimeZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PIN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "PIN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VMSServiceStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "VMSServiceStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalEarnedCredits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "totalEarnedCredits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("earnedCreditsinLast30Days");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "earnedCreditsinLast30Days"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usedCreditsinLast30Days");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "usedCreditsinLast30Days"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeSMSCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "freeSMSCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeSMSRuppes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "freeSMSRuppes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promoDataBytes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "promoDataBytes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promoDataExpiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "promoDataExpiryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GPRSServStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GPRSServStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastReloadTimeStamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "lastReloadTimeStamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastReloadAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "lastReloadAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imsiNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "imsiNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latestTarrifPlanID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "latestTarrifPlanID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("simSerialNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "simSerialNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tarrifName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "tarrifName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalUsedCredits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "totalUsedCredits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastTransAction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "lastTransAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastTransCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "lastTransCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastTransTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "lastTransTimestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableCredit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "availableCredit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
