/**
 * SubscriberDetailsInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.subscriber;

public class SubscriberDetailsInfo  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private java.math.BigDecimal accntBalance;

    private java.lang.Long accountId;

    private java.lang.String activationDate;

    private java.lang.String dataExpiryDate;

    private java.lang.Long earnedCreditsinLast30Days;

    private java.lang.String expiryDate;

    private java.lang.Long freeSMSCount;

    private java.math.BigDecimal freeSMSRuppes;

    private java.lang.String gprsServStatus;

    private java.lang.String gracePeriod1EndDate;

    private java.lang.Long imsiNo;

    private java.lang.String language;

    private java.math.BigDecimal lastCallCharge;

    private java.lang.String lastCallDate;

    private java.math.BigDecimal lastReloadAmount;

    private java.lang.String lastReloadTimeStamp;

    private java.lang.String lastTransaction;

    private java.math.BigDecimal lastTransactionCharge;

    private java.lang.String lastTransactionTimestamp;

    private java.lang.Long latestTarrifPlanID;

    private java.lang.Long msisdn;

    private java.lang.String pin;

    private java.math.BigDecimal promoBalance;

    private java.lang.Long promoDataBytes;

    private java.lang.String promoDataExpiryDate;

    private java.lang.String promoValidityDate;

    private java.lang.String simSerialNo;

    private java.lang.String status;

    private java.lang.String statusDate;

    private java.lang.String subscriberTimeZone;

    private java.lang.String tarrifName;

    private java.math.BigDecimal thresholdBalance;

    private java.math.BigDecimal totalBalance;

    private java.lang.Long totalEarnedCredits;

    private java.lang.Long totalUsedCredits;

    private java.lang.Long usedCreditsinLast30Days;

    private java.lang.String validityDate;

    private java.lang.String vmsServiceStatus;

    private org.apache.axis.message.MessageElement [] _any;

    public SubscriberDetailsInfo() {
    }

    public SubscriberDetailsInfo(
           java.math.BigDecimal accntBalance,
           java.lang.Long accountId,
           java.lang.String activationDate,
           java.lang.String dataExpiryDate,
           java.lang.Long earnedCreditsinLast30Days,
           java.lang.String expiryDate,
           java.lang.Long freeSMSCount,
           java.math.BigDecimal freeSMSRuppes,
           java.lang.String gprsServStatus,
           java.lang.String gracePeriod1EndDate,
           java.lang.Long imsiNo,
           java.lang.String language,
           java.math.BigDecimal lastCallCharge,
           java.lang.String lastCallDate,
           java.math.BigDecimal lastReloadAmount,
           java.lang.String lastReloadTimeStamp,
           java.lang.String lastTransaction,
           java.math.BigDecimal lastTransactionCharge,
           java.lang.String lastTransactionTimestamp,
           java.lang.Long latestTarrifPlanID,
           java.lang.Long msisdn,
           java.lang.String pin,
           java.math.BigDecimal promoBalance,
           java.lang.Long promoDataBytes,
           java.lang.String promoDataExpiryDate,
           java.lang.String promoValidityDate,
           java.lang.String simSerialNo,
           java.lang.String status,
           java.lang.String statusDate,
           java.lang.String subscriberTimeZone,
           java.lang.String tarrifName,
           java.math.BigDecimal thresholdBalance,
           java.math.BigDecimal totalBalance,
           java.lang.Long totalEarnedCredits,
           java.lang.Long totalUsedCredits,
           java.lang.Long usedCreditsinLast30Days,
           java.lang.String validityDate,
           java.lang.String vmsServiceStatus,
           org.apache.axis.message.MessageElement [] _any) {
           this.accntBalance = accntBalance;
           this.accountId = accountId;
           this.activationDate = activationDate;
           this.dataExpiryDate = dataExpiryDate;
           this.earnedCreditsinLast30Days = earnedCreditsinLast30Days;
           this.expiryDate = expiryDate;
           this.freeSMSCount = freeSMSCount;
           this.freeSMSRuppes = freeSMSRuppes;
           this.gprsServStatus = gprsServStatus;
           this.gracePeriod1EndDate = gracePeriod1EndDate;
           this.imsiNo = imsiNo;
           this.language = language;
           this.lastCallCharge = lastCallCharge;
           this.lastCallDate = lastCallDate;
           this.lastReloadAmount = lastReloadAmount;
           this.lastReloadTimeStamp = lastReloadTimeStamp;
           this.lastTransaction = lastTransaction;
           this.lastTransactionCharge = lastTransactionCharge;
           this.lastTransactionTimestamp = lastTransactionTimestamp;
           this.latestTarrifPlanID = latestTarrifPlanID;
           this.msisdn = msisdn;
           this.pin = pin;
           this.promoBalance = promoBalance;
           this.promoDataBytes = promoDataBytes;
           this.promoDataExpiryDate = promoDataExpiryDate;
           this.promoValidityDate = promoValidityDate;
           this.simSerialNo = simSerialNo;
           this.status = status;
           this.statusDate = statusDate;
           this.subscriberTimeZone = subscriberTimeZone;
           this.tarrifName = tarrifName;
           this.thresholdBalance = thresholdBalance;
           this.totalBalance = totalBalance;
           this.totalEarnedCredits = totalEarnedCredits;
           this.totalUsedCredits = totalUsedCredits;
           this.usedCreditsinLast30Days = usedCreditsinLast30Days;
           this.validityDate = validityDate;
           this.vmsServiceStatus = vmsServiceStatus;
           this._any = _any;
    }


    /**
     * Gets the accntBalance value for this SubscriberDetailsInfo.
     * 
     * @return accntBalance
     */
    public java.math.BigDecimal getAccntBalance() {
        return accntBalance;
    }


    /**
     * Sets the accntBalance value for this SubscriberDetailsInfo.
     * 
     * @param accntBalance
     */
    public void setAccntBalance(java.math.BigDecimal accntBalance) {
        this.accntBalance = accntBalance;
    }


    /**
     * Gets the accountId value for this SubscriberDetailsInfo.
     * 
     * @return accountId
     */
    public java.lang.Long getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this SubscriberDetailsInfo.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.Long accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the activationDate value for this SubscriberDetailsInfo.
     * 
     * @return activationDate
     */
    public java.lang.String getActivationDate() {
        return activationDate;
    }


    /**
     * Sets the activationDate value for this SubscriberDetailsInfo.
     * 
     * @param activationDate
     */
    public void setActivationDate(java.lang.String activationDate) {
        this.activationDate = activationDate;
    }


    /**
     * Gets the dataExpiryDate value for this SubscriberDetailsInfo.
     * 
     * @return dataExpiryDate
     */
    public java.lang.String getDataExpiryDate() {
        return dataExpiryDate;
    }


    /**
     * Sets the dataExpiryDate value for this SubscriberDetailsInfo.
     * 
     * @param dataExpiryDate
     */
    public void setDataExpiryDate(java.lang.String dataExpiryDate) {
        this.dataExpiryDate = dataExpiryDate;
    }


    /**
     * Gets the earnedCreditsinLast30Days value for this SubscriberDetailsInfo.
     * 
     * @return earnedCreditsinLast30Days
     */
    public java.lang.Long getEarnedCreditsinLast30Days() {
        return earnedCreditsinLast30Days;
    }


    /**
     * Sets the earnedCreditsinLast30Days value for this SubscriberDetailsInfo.
     * 
     * @param earnedCreditsinLast30Days
     */
    public void setEarnedCreditsinLast30Days(java.lang.Long earnedCreditsinLast30Days) {
        this.earnedCreditsinLast30Days = earnedCreditsinLast30Days;
    }


    /**
     * Gets the expiryDate value for this SubscriberDetailsInfo.
     * 
     * @return expiryDate
     */
    public java.lang.String getExpiryDate() {
        return expiryDate;
    }


    /**
     * Sets the expiryDate value for this SubscriberDetailsInfo.
     * 
     * @param expiryDate
     */
    public void setExpiryDate(java.lang.String expiryDate) {
        this.expiryDate = expiryDate;
    }


    /**
     * Gets the freeSMSCount value for this SubscriberDetailsInfo.
     * 
     * @return freeSMSCount
     */
    public java.lang.Long getFreeSMSCount() {
        return freeSMSCount;
    }


    /**
     * Sets the freeSMSCount value for this SubscriberDetailsInfo.
     * 
     * @param freeSMSCount
     */
    public void setFreeSMSCount(java.lang.Long freeSMSCount) {
        this.freeSMSCount = freeSMSCount;
    }


    /**
     * Gets the freeSMSRuppes value for this SubscriberDetailsInfo.
     * 
     * @return freeSMSRuppes
     */
    public java.math.BigDecimal getFreeSMSRuppes() {
        return freeSMSRuppes;
    }


    /**
     * Sets the freeSMSRuppes value for this SubscriberDetailsInfo.
     * 
     * @param freeSMSRuppes
     */
    public void setFreeSMSRuppes(java.math.BigDecimal freeSMSRuppes) {
        this.freeSMSRuppes = freeSMSRuppes;
    }


    /**
     * Gets the gprsServStatus value for this SubscriberDetailsInfo.
     * 
     * @return gprsServStatus
     */
    public java.lang.String getGprsServStatus() {
        return gprsServStatus;
    }


    /**
     * Sets the gprsServStatus value for this SubscriberDetailsInfo.
     * 
     * @param gprsServStatus
     */
    public void setGprsServStatus(java.lang.String gprsServStatus) {
        this.gprsServStatus = gprsServStatus;
    }


    /**
     * Gets the gracePeriod1EndDate value for this SubscriberDetailsInfo.
     * 
     * @return gracePeriod1EndDate
     */
    public java.lang.String getGracePeriod1EndDate() {
        return gracePeriod1EndDate;
    }


    /**
     * Sets the gracePeriod1EndDate value for this SubscriberDetailsInfo.
     * 
     * @param gracePeriod1EndDate
     */
    public void setGracePeriod1EndDate(java.lang.String gracePeriod1EndDate) {
        this.gracePeriod1EndDate = gracePeriod1EndDate;
    }


    /**
     * Gets the imsiNo value for this SubscriberDetailsInfo.
     * 
     * @return imsiNo
     */
    public java.lang.Long getImsiNo() {
        return imsiNo;
    }


    /**
     * Sets the imsiNo value for this SubscriberDetailsInfo.
     * 
     * @param imsiNo
     */
    public void setImsiNo(java.lang.Long imsiNo) {
        this.imsiNo = imsiNo;
    }


    /**
     * Gets the language value for this SubscriberDetailsInfo.
     * 
     * @return language
     */
    public java.lang.String getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this SubscriberDetailsInfo.
     * 
     * @param language
     */
    public void setLanguage(java.lang.String language) {
        this.language = language;
    }


    /**
     * Gets the lastCallCharge value for this SubscriberDetailsInfo.
     * 
     * @return lastCallCharge
     */
    public java.math.BigDecimal getLastCallCharge() {
        return lastCallCharge;
    }


    /**
     * Sets the lastCallCharge value for this SubscriberDetailsInfo.
     * 
     * @param lastCallCharge
     */
    public void setLastCallCharge(java.math.BigDecimal lastCallCharge) {
        this.lastCallCharge = lastCallCharge;
    }


    /**
     * Gets the lastCallDate value for this SubscriberDetailsInfo.
     * 
     * @return lastCallDate
     */
    public java.lang.String getLastCallDate() {
        return lastCallDate;
    }


    /**
     * Sets the lastCallDate value for this SubscriberDetailsInfo.
     * 
     * @param lastCallDate
     */
    public void setLastCallDate(java.lang.String lastCallDate) {
        this.lastCallDate = lastCallDate;
    }


    /**
     * Gets the lastReloadAmount value for this SubscriberDetailsInfo.
     * 
     * @return lastReloadAmount
     */
    public java.math.BigDecimal getLastReloadAmount() {
        return lastReloadAmount;
    }


    /**
     * Sets the lastReloadAmount value for this SubscriberDetailsInfo.
     * 
     * @param lastReloadAmount
     */
    public void setLastReloadAmount(java.math.BigDecimal lastReloadAmount) {
        this.lastReloadAmount = lastReloadAmount;
    }


    /**
     * Gets the lastReloadTimeStamp value for this SubscriberDetailsInfo.
     * 
     * @return lastReloadTimeStamp
     */
    public java.lang.String getLastReloadTimeStamp() {
        return lastReloadTimeStamp;
    }


    /**
     * Sets the lastReloadTimeStamp value for this SubscriberDetailsInfo.
     * 
     * @param lastReloadTimeStamp
     */
    public void setLastReloadTimeStamp(java.lang.String lastReloadTimeStamp) {
        this.lastReloadTimeStamp = lastReloadTimeStamp;
    }


    /**
     * Gets the lastTransaction value for this SubscriberDetailsInfo.
     * 
     * @return lastTransaction
     */
    public java.lang.String getLastTransaction() {
        return lastTransaction;
    }


    /**
     * Sets the lastTransaction value for this SubscriberDetailsInfo.
     * 
     * @param lastTransaction
     */
    public void setLastTransaction(java.lang.String lastTransaction) {
        this.lastTransaction = lastTransaction;
    }


    /**
     * Gets the lastTransactionCharge value for this SubscriberDetailsInfo.
     * 
     * @return lastTransactionCharge
     */
    public java.math.BigDecimal getLastTransactionCharge() {
        return lastTransactionCharge;
    }


    /**
     * Sets the lastTransactionCharge value for this SubscriberDetailsInfo.
     * 
     * @param lastTransactionCharge
     */
    public void setLastTransactionCharge(java.math.BigDecimal lastTransactionCharge) {
        this.lastTransactionCharge = lastTransactionCharge;
    }


    /**
     * Gets the lastTransactionTimestamp value for this SubscriberDetailsInfo.
     * 
     * @return lastTransactionTimestamp
     */
    public java.lang.String getLastTransactionTimestamp() {
        return lastTransactionTimestamp;
    }


    /**
     * Sets the lastTransactionTimestamp value for this SubscriberDetailsInfo.
     * 
     * @param lastTransactionTimestamp
     */
    public void setLastTransactionTimestamp(java.lang.String lastTransactionTimestamp) {
        this.lastTransactionTimestamp = lastTransactionTimestamp;
    }


    /**
     * Gets the latestTarrifPlanID value for this SubscriberDetailsInfo.
     * 
     * @return latestTarrifPlanID
     */
    public java.lang.Long getLatestTarrifPlanID() {
        return latestTarrifPlanID;
    }


    /**
     * Sets the latestTarrifPlanID value for this SubscriberDetailsInfo.
     * 
     * @param latestTarrifPlanID
     */
    public void setLatestTarrifPlanID(java.lang.Long latestTarrifPlanID) {
        this.latestTarrifPlanID = latestTarrifPlanID;
    }


    /**
     * Gets the msisdn value for this SubscriberDetailsInfo.
     * 
     * @return msisdn
     */
    public java.lang.Long getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this SubscriberDetailsInfo.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.Long msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the pin value for this SubscriberDetailsInfo.
     * 
     * @return pin
     */
    public java.lang.String getPin() {
        return pin;
    }


    /**
     * Sets the pin value for this SubscriberDetailsInfo.
     * 
     * @param pin
     */
    public void setPin(java.lang.String pin) {
        this.pin = pin;
    }


    /**
     * Gets the promoBalance value for this SubscriberDetailsInfo.
     * 
     * @return promoBalance
     */
    public java.math.BigDecimal getPromoBalance() {
        return promoBalance;
    }


    /**
     * Sets the promoBalance value for this SubscriberDetailsInfo.
     * 
     * @param promoBalance
     */
    public void setPromoBalance(java.math.BigDecimal promoBalance) {
        this.promoBalance = promoBalance;
    }


    /**
     * Gets the promoDataBytes value for this SubscriberDetailsInfo.
     * 
     * @return promoDataBytes
     */
    public java.lang.Long getPromoDataBytes() {
        return promoDataBytes;
    }


    /**
     * Sets the promoDataBytes value for this SubscriberDetailsInfo.
     * 
     * @param promoDataBytes
     */
    public void setPromoDataBytes(java.lang.Long promoDataBytes) {
        this.promoDataBytes = promoDataBytes;
    }


    /**
     * Gets the promoDataExpiryDate value for this SubscriberDetailsInfo.
     * 
     * @return promoDataExpiryDate
     */
    public java.lang.String getPromoDataExpiryDate() {
        return promoDataExpiryDate;
    }


    /**
     * Sets the promoDataExpiryDate value for this SubscriberDetailsInfo.
     * 
     * @param promoDataExpiryDate
     */
    public void setPromoDataExpiryDate(java.lang.String promoDataExpiryDate) {
        this.promoDataExpiryDate = promoDataExpiryDate;
    }


    /**
     * Gets the promoValidityDate value for this SubscriberDetailsInfo.
     * 
     * @return promoValidityDate
     */
    public java.lang.String getPromoValidityDate() {
        return promoValidityDate;
    }


    /**
     * Sets the promoValidityDate value for this SubscriberDetailsInfo.
     * 
     * @param promoValidityDate
     */
    public void setPromoValidityDate(java.lang.String promoValidityDate) {
        this.promoValidityDate = promoValidityDate;
    }


    /**
     * Gets the simSerialNo value for this SubscriberDetailsInfo.
     * 
     * @return simSerialNo
     */
    public java.lang.String getSimSerialNo() {
        return simSerialNo;
    }


    /**
     * Sets the simSerialNo value for this SubscriberDetailsInfo.
     * 
     * @param simSerialNo
     */
    public void setSimSerialNo(java.lang.String simSerialNo) {
        this.simSerialNo = simSerialNo;
    }


    /**
     * Gets the status value for this SubscriberDetailsInfo.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this SubscriberDetailsInfo.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the statusDate value for this SubscriberDetailsInfo.
     * 
     * @return statusDate
     */
    public java.lang.String getStatusDate() {
        return statusDate;
    }


    /**
     * Sets the statusDate value for this SubscriberDetailsInfo.
     * 
     * @param statusDate
     */
    public void setStatusDate(java.lang.String statusDate) {
        this.statusDate = statusDate;
    }


    /**
     * Gets the subscriberTimeZone value for this SubscriberDetailsInfo.
     * 
     * @return subscriberTimeZone
     */
    public java.lang.String getSubscriberTimeZone() {
        return subscriberTimeZone;
    }


    /**
     * Sets the subscriberTimeZone value for this SubscriberDetailsInfo.
     * 
     * @param subscriberTimeZone
     */
    public void setSubscriberTimeZone(java.lang.String subscriberTimeZone) {
        this.subscriberTimeZone = subscriberTimeZone;
    }


    /**
     * Gets the tarrifName value for this SubscriberDetailsInfo.
     * 
     * @return tarrifName
     */
    public java.lang.String getTarrifName() {
        return tarrifName;
    }


    /**
     * Sets the tarrifName value for this SubscriberDetailsInfo.
     * 
     * @param tarrifName
     */
    public void setTarrifName(java.lang.String tarrifName) {
        this.tarrifName = tarrifName;
    }


    /**
     * Gets the thresholdBalance value for this SubscriberDetailsInfo.
     * 
     * @return thresholdBalance
     */
    public java.math.BigDecimal getThresholdBalance() {
        return thresholdBalance;
    }


    /**
     * Sets the thresholdBalance value for this SubscriberDetailsInfo.
     * 
     * @param thresholdBalance
     */
    public void setThresholdBalance(java.math.BigDecimal thresholdBalance) {
        this.thresholdBalance = thresholdBalance;
    }


    /**
     * Gets the totalBalance value for this SubscriberDetailsInfo.
     * 
     * @return totalBalance
     */
    public java.math.BigDecimal getTotalBalance() {
        return totalBalance;
    }


    /**
     * Sets the totalBalance value for this SubscriberDetailsInfo.
     * 
     * @param totalBalance
     */
    public void setTotalBalance(java.math.BigDecimal totalBalance) {
        this.totalBalance = totalBalance;
    }


    /**
     * Gets the totalEarnedCredits value for this SubscriberDetailsInfo.
     * 
     * @return totalEarnedCredits
     */
    public java.lang.Long getTotalEarnedCredits() {
        return totalEarnedCredits;
    }


    /**
     * Sets the totalEarnedCredits value for this SubscriberDetailsInfo.
     * 
     * @param totalEarnedCredits
     */
    public void setTotalEarnedCredits(java.lang.Long totalEarnedCredits) {
        this.totalEarnedCredits = totalEarnedCredits;
    }


    /**
     * Gets the totalUsedCredits value for this SubscriberDetailsInfo.
     * 
     * @return totalUsedCredits
     */
    public java.lang.Long getTotalUsedCredits() {
        return totalUsedCredits;
    }


    /**
     * Sets the totalUsedCredits value for this SubscriberDetailsInfo.
     * 
     * @param totalUsedCredits
     */
    public void setTotalUsedCredits(java.lang.Long totalUsedCredits) {
        this.totalUsedCredits = totalUsedCredits;
    }


    /**
     * Gets the usedCreditsinLast30Days value for this SubscriberDetailsInfo.
     * 
     * @return usedCreditsinLast30Days
     */
    public java.lang.Long getUsedCreditsinLast30Days() {
        return usedCreditsinLast30Days;
    }


    /**
     * Sets the usedCreditsinLast30Days value for this SubscriberDetailsInfo.
     * 
     * @param usedCreditsinLast30Days
     */
    public void setUsedCreditsinLast30Days(java.lang.Long usedCreditsinLast30Days) {
        this.usedCreditsinLast30Days = usedCreditsinLast30Days;
    }


    /**
     * Gets the validityDate value for this SubscriberDetailsInfo.
     * 
     * @return validityDate
     */
    public java.lang.String getValidityDate() {
        return validityDate;
    }


    /**
     * Sets the validityDate value for this SubscriberDetailsInfo.
     * 
     * @param validityDate
     */
    public void setValidityDate(java.lang.String validityDate) {
        this.validityDate = validityDate;
    }


    /**
     * Gets the vmsServiceStatus value for this SubscriberDetailsInfo.
     * 
     * @return vmsServiceStatus
     */
    public java.lang.String getVmsServiceStatus() {
        return vmsServiceStatus;
    }


    /**
     * Sets the vmsServiceStatus value for this SubscriberDetailsInfo.
     * 
     * @param vmsServiceStatus
     */
    public void setVmsServiceStatus(java.lang.String vmsServiceStatus) {
        this.vmsServiceStatus = vmsServiceStatus;
    }


    /**
     * Gets the _any value for this SubscriberDetailsInfo.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this SubscriberDetailsInfo.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubscriberDetailsInfo)) return false;
        SubscriberDetailsInfo other = (SubscriberDetailsInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accntBalance==null && other.getAccntBalance()==null) || 
             (this.accntBalance!=null &&
              this.accntBalance.equals(other.getAccntBalance()))) &&
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.activationDate==null && other.getActivationDate()==null) || 
             (this.activationDate!=null &&
              this.activationDate.equals(other.getActivationDate()))) &&
            ((this.dataExpiryDate==null && other.getDataExpiryDate()==null) || 
             (this.dataExpiryDate!=null &&
              this.dataExpiryDate.equals(other.getDataExpiryDate()))) &&
            ((this.earnedCreditsinLast30Days==null && other.getEarnedCreditsinLast30Days()==null) || 
             (this.earnedCreditsinLast30Days!=null &&
              this.earnedCreditsinLast30Days.equals(other.getEarnedCreditsinLast30Days()))) &&
            ((this.expiryDate==null && other.getExpiryDate()==null) || 
             (this.expiryDate!=null &&
              this.expiryDate.equals(other.getExpiryDate()))) &&
            ((this.freeSMSCount==null && other.getFreeSMSCount()==null) || 
             (this.freeSMSCount!=null &&
              this.freeSMSCount.equals(other.getFreeSMSCount()))) &&
            ((this.freeSMSRuppes==null && other.getFreeSMSRuppes()==null) || 
             (this.freeSMSRuppes!=null &&
              this.freeSMSRuppes.equals(other.getFreeSMSRuppes()))) &&
            ((this.gprsServStatus==null && other.getGprsServStatus()==null) || 
             (this.gprsServStatus!=null &&
              this.gprsServStatus.equals(other.getGprsServStatus()))) &&
            ((this.gracePeriod1EndDate==null && other.getGracePeriod1EndDate()==null) || 
             (this.gracePeriod1EndDate!=null &&
              this.gracePeriod1EndDate.equals(other.getGracePeriod1EndDate()))) &&
            ((this.imsiNo==null && other.getImsiNo()==null) || 
             (this.imsiNo!=null &&
              this.imsiNo.equals(other.getImsiNo()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.lastCallCharge==null && other.getLastCallCharge()==null) || 
             (this.lastCallCharge!=null &&
              this.lastCallCharge.equals(other.getLastCallCharge()))) &&
            ((this.lastCallDate==null && other.getLastCallDate()==null) || 
             (this.lastCallDate!=null &&
              this.lastCallDate.equals(other.getLastCallDate()))) &&
            ((this.lastReloadAmount==null && other.getLastReloadAmount()==null) || 
             (this.lastReloadAmount!=null &&
              this.lastReloadAmount.equals(other.getLastReloadAmount()))) &&
            ((this.lastReloadTimeStamp==null && other.getLastReloadTimeStamp()==null) || 
             (this.lastReloadTimeStamp!=null &&
              this.lastReloadTimeStamp.equals(other.getLastReloadTimeStamp()))) &&
            ((this.lastTransaction==null && other.getLastTransaction()==null) || 
             (this.lastTransaction!=null &&
              this.lastTransaction.equals(other.getLastTransaction()))) &&
            ((this.lastTransactionCharge==null && other.getLastTransactionCharge()==null) || 
             (this.lastTransactionCharge!=null &&
              this.lastTransactionCharge.equals(other.getLastTransactionCharge()))) &&
            ((this.lastTransactionTimestamp==null && other.getLastTransactionTimestamp()==null) || 
             (this.lastTransactionTimestamp!=null &&
              this.lastTransactionTimestamp.equals(other.getLastTransactionTimestamp()))) &&
            ((this.latestTarrifPlanID==null && other.getLatestTarrifPlanID()==null) || 
             (this.latestTarrifPlanID!=null &&
              this.latestTarrifPlanID.equals(other.getLatestTarrifPlanID()))) &&
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.pin==null && other.getPin()==null) || 
             (this.pin!=null &&
              this.pin.equals(other.getPin()))) &&
            ((this.promoBalance==null && other.getPromoBalance()==null) || 
             (this.promoBalance!=null &&
              this.promoBalance.equals(other.getPromoBalance()))) &&
            ((this.promoDataBytes==null && other.getPromoDataBytes()==null) || 
             (this.promoDataBytes!=null &&
              this.promoDataBytes.equals(other.getPromoDataBytes()))) &&
            ((this.promoDataExpiryDate==null && other.getPromoDataExpiryDate()==null) || 
             (this.promoDataExpiryDate!=null &&
              this.promoDataExpiryDate.equals(other.getPromoDataExpiryDate()))) &&
            ((this.promoValidityDate==null && other.getPromoValidityDate()==null) || 
             (this.promoValidityDate!=null &&
              this.promoValidityDate.equals(other.getPromoValidityDate()))) &&
            ((this.simSerialNo==null && other.getSimSerialNo()==null) || 
             (this.simSerialNo!=null &&
              this.simSerialNo.equals(other.getSimSerialNo()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.statusDate==null && other.getStatusDate()==null) || 
             (this.statusDate!=null &&
              this.statusDate.equals(other.getStatusDate()))) &&
            ((this.subscriberTimeZone==null && other.getSubscriberTimeZone()==null) || 
             (this.subscriberTimeZone!=null &&
              this.subscriberTimeZone.equals(other.getSubscriberTimeZone()))) &&
            ((this.tarrifName==null && other.getTarrifName()==null) || 
             (this.tarrifName!=null &&
              this.tarrifName.equals(other.getTarrifName()))) &&
            ((this.thresholdBalance==null && other.getThresholdBalance()==null) || 
             (this.thresholdBalance!=null &&
              this.thresholdBalance.equals(other.getThresholdBalance()))) &&
            ((this.totalBalance==null && other.getTotalBalance()==null) || 
             (this.totalBalance!=null &&
              this.totalBalance.equals(other.getTotalBalance()))) &&
            ((this.totalEarnedCredits==null && other.getTotalEarnedCredits()==null) || 
             (this.totalEarnedCredits!=null &&
              this.totalEarnedCredits.equals(other.getTotalEarnedCredits()))) &&
            ((this.totalUsedCredits==null && other.getTotalUsedCredits()==null) || 
             (this.totalUsedCredits!=null &&
              this.totalUsedCredits.equals(other.getTotalUsedCredits()))) &&
            ((this.usedCreditsinLast30Days==null && other.getUsedCreditsinLast30Days()==null) || 
             (this.usedCreditsinLast30Days!=null &&
              this.usedCreditsinLast30Days.equals(other.getUsedCreditsinLast30Days()))) &&
            ((this.validityDate==null && other.getValidityDate()==null) || 
             (this.validityDate!=null &&
              this.validityDate.equals(other.getValidityDate()))) &&
            ((this.vmsServiceStatus==null && other.getVmsServiceStatus()==null) || 
             (this.vmsServiceStatus!=null &&
              this.vmsServiceStatus.equals(other.getVmsServiceStatus()))) &&
            ((this._any==null && other.get_any()==null) || 
             (this._any!=null &&
              java.util.Arrays.equals(this._any, other.get_any())));
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
        if (getAccntBalance() != null) {
            _hashCode += getAccntBalance().hashCode();
        }
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getActivationDate() != null) {
            _hashCode += getActivationDate().hashCode();
        }
        if (getDataExpiryDate() != null) {
            _hashCode += getDataExpiryDate().hashCode();
        }
        if (getEarnedCreditsinLast30Days() != null) {
            _hashCode += getEarnedCreditsinLast30Days().hashCode();
        }
        if (getExpiryDate() != null) {
            _hashCode += getExpiryDate().hashCode();
        }
        if (getFreeSMSCount() != null) {
            _hashCode += getFreeSMSCount().hashCode();
        }
        if (getFreeSMSRuppes() != null) {
            _hashCode += getFreeSMSRuppes().hashCode();
        }
        if (getGprsServStatus() != null) {
            _hashCode += getGprsServStatus().hashCode();
        }
        if (getGracePeriod1EndDate() != null) {
            _hashCode += getGracePeriod1EndDate().hashCode();
        }
        if (getImsiNo() != null) {
            _hashCode += getImsiNo().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        if (getLastCallCharge() != null) {
            _hashCode += getLastCallCharge().hashCode();
        }
        if (getLastCallDate() != null) {
            _hashCode += getLastCallDate().hashCode();
        }
        if (getLastReloadAmount() != null) {
            _hashCode += getLastReloadAmount().hashCode();
        }
        if (getLastReloadTimeStamp() != null) {
            _hashCode += getLastReloadTimeStamp().hashCode();
        }
        if (getLastTransaction() != null) {
            _hashCode += getLastTransaction().hashCode();
        }
        if (getLastTransactionCharge() != null) {
            _hashCode += getLastTransactionCharge().hashCode();
        }
        if (getLastTransactionTimestamp() != null) {
            _hashCode += getLastTransactionTimestamp().hashCode();
        }
        if (getLatestTarrifPlanID() != null) {
            _hashCode += getLatestTarrifPlanID().hashCode();
        }
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getPin() != null) {
            _hashCode += getPin().hashCode();
        }
        if (getPromoBalance() != null) {
            _hashCode += getPromoBalance().hashCode();
        }
        if (getPromoDataBytes() != null) {
            _hashCode += getPromoDataBytes().hashCode();
        }
        if (getPromoDataExpiryDate() != null) {
            _hashCode += getPromoDataExpiryDate().hashCode();
        }
        if (getPromoValidityDate() != null) {
            _hashCode += getPromoValidityDate().hashCode();
        }
        if (getSimSerialNo() != null) {
            _hashCode += getSimSerialNo().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getStatusDate() != null) {
            _hashCode += getStatusDate().hashCode();
        }
        if (getSubscriberTimeZone() != null) {
            _hashCode += getSubscriberTimeZone().hashCode();
        }
        if (getTarrifName() != null) {
            _hashCode += getTarrifName().hashCode();
        }
        if (getThresholdBalance() != null) {
            _hashCode += getThresholdBalance().hashCode();
        }
        if (getTotalBalance() != null) {
            _hashCode += getTotalBalance().hashCode();
        }
        if (getTotalEarnedCredits() != null) {
            _hashCode += getTotalEarnedCredits().hashCode();
        }
        if (getTotalUsedCredits() != null) {
            _hashCode += getTotalUsedCredits().hashCode();
        }
        if (getUsedCreditsinLast30Days() != null) {
            _hashCode += getUsedCreditsinLast30Days().hashCode();
        }
        if (getValidityDate() != null) {
            _hashCode += getValidityDate().hashCode();
        }
        if (getVmsServiceStatus() != null) {
            _hashCode += getVmsServiceStatus().hashCode();
        }
        if (get_any() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_any());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_any(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubscriberDetailsInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "SubscriberDetailsInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accntBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "accntBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "accountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "activationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataExpiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "dataExpiryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("earnedCreditsinLast30Days");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "earnedCreditsinLast30Days"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "expiryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeSMSCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "freeSMSCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeSMSRuppes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "freeSMSRuppes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gprsServStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "gprsServStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gracePeriod1EndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "gracePeriod1EndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imsiNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "imsiNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastCallCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "lastCallCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastCallDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "lastCallDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastReloadAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "lastReloadAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastReloadTimeStamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "lastReloadTimeStamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "lastTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastTransactionCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "lastTransactionCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastTransactionTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "lastTransactionTimestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latestTarrifPlanID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "latestTarrifPlanID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "pin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promoBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "promoBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promoDataBytes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "promoDataBytes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promoDataExpiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "promoDataExpiryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promoValidityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "promoValidityDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("simSerialNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "simSerialNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "statusDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberTimeZone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "subscriberTimeZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tarrifName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "tarrifName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thresholdBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "thresholdBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "totalBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalEarnedCredits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "totalEarnedCredits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalUsedCredits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "totalUsedCredits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usedCreditsinLast30Days");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "usedCreditsinLast30Days"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "validityDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmsServiceStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "vmsServiceStatus"));
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
