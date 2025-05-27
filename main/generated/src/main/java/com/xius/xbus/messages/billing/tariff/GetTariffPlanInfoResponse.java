/**
 * GetTariffPlanInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.tariff;

public class GetTariffPlanInfoResponse  extends com.xius.xbus.messages.common.WSResponse  implements java.io.Serializable {
    private java.lang.String tariffId;

    private java.lang.String tariffName;

    private java.lang.String versionNumber;

    private java.lang.String zoneGroupName;

    private java.lang.String effectiveDate;

    private java.lang.String locationNetwork;

    private java.lang.String rentalAmount;

    private java.lang.String serviceTax;

    private java.lang.String rentalCycleDays;

    private java.lang.String freeRentalDays;

    private java.lang.String thresholdAmount;

    private java.lang.String lockPeriod;

    private java.lang.String billDetailsRequest;

    private java.lang.String creditLevelRequest;

    private java.lang.String transferorCharges;

    private java.lang.String transfereeCharges;

    private java.lang.String changeMSISDNCharges;

    private java.lang.String maxAmountPerTransfer;

    private java.lang.String deductRentalswithinvalidityPeriodBalance;

    private java.lang.String firstTimeDeductFlag;

    private java.lang.String lateRechargeFeeSlabs;

    private com.xius.xbus.messages.billing.tariff.Service[] validityPeriodServices;

    private com.xius.xbus.messages.billing.tariff.Service[] gracePeriodServices;

    private java.lang.String accountID;

    private java.lang.String currentTariffPlanName;

    private java.lang.String newTariffPlan;

    private double administrativeCharges;

    public GetTariffPlanInfoResponse() {
    }

    public GetTariffPlanInfoResponse(
           com.xius.xbus.messages.common.StatusCode statusCode,
           java.util.Calendar timeStamp,
           java.lang.String correlationID,
           com.xius.xbus.messages.common.ErrorData[] errors,
           java.lang.String version,
           java.lang.String tariffId,
           java.lang.String tariffName,
           java.lang.String versionNumber,
           java.lang.String zoneGroupName,
           java.lang.String effectiveDate,
           java.lang.String locationNetwork,
           java.lang.String rentalAmount,
           java.lang.String serviceTax,
           java.lang.String rentalCycleDays,
           java.lang.String freeRentalDays,
           java.lang.String thresholdAmount,
           java.lang.String lockPeriod,
           java.lang.String billDetailsRequest,
           java.lang.String creditLevelRequest,
           java.lang.String transferorCharges,
           java.lang.String transfereeCharges,
           java.lang.String changeMSISDNCharges,
           java.lang.String maxAmountPerTransfer,
           java.lang.String deductRentalswithinvalidityPeriodBalance,
           java.lang.String firstTimeDeductFlag,
           java.lang.String lateRechargeFeeSlabs,
           com.xius.xbus.messages.billing.tariff.Service[] validityPeriodServices,
           com.xius.xbus.messages.billing.tariff.Service[] gracePeriodServices,
           java.lang.String accountID,
           java.lang.String currentTariffPlanName,
           java.lang.String newTariffPlan,
           double administrativeCharges) {
        super(
            statusCode,
            timeStamp,
            correlationID,
            errors,
            version);
        this.tariffId = tariffId;
        this.tariffName = tariffName;
        this.versionNumber = versionNumber;
        this.zoneGroupName = zoneGroupName;
        this.effectiveDate = effectiveDate;
        this.locationNetwork = locationNetwork;
        this.rentalAmount = rentalAmount;
        this.serviceTax = serviceTax;
        this.rentalCycleDays = rentalCycleDays;
        this.freeRentalDays = freeRentalDays;
        this.thresholdAmount = thresholdAmount;
        this.lockPeriod = lockPeriod;
        this.billDetailsRequest = billDetailsRequest;
        this.creditLevelRequest = creditLevelRequest;
        this.transferorCharges = transferorCharges;
        this.transfereeCharges = transfereeCharges;
        this.changeMSISDNCharges = changeMSISDNCharges;
        this.maxAmountPerTransfer = maxAmountPerTransfer;
        this.deductRentalswithinvalidityPeriodBalance = deductRentalswithinvalidityPeriodBalance;
        this.firstTimeDeductFlag = firstTimeDeductFlag;
        this.lateRechargeFeeSlabs = lateRechargeFeeSlabs;
        this.validityPeriodServices = validityPeriodServices;
        this.gracePeriodServices = gracePeriodServices;
        this.accountID = accountID;
        this.currentTariffPlanName = currentTariffPlanName;
        this.newTariffPlan = newTariffPlan;
        this.administrativeCharges = administrativeCharges;
    }


    /**
     * Gets the tariffId value for this GetTariffPlanInfoResponse.
     * 
     * @return tariffId
     */
    public java.lang.String getTariffId() {
        return tariffId;
    }


    /**
     * Sets the tariffId value for this GetTariffPlanInfoResponse.
     * 
     * @param tariffId
     */
    public void setTariffId(java.lang.String tariffId) {
        this.tariffId = tariffId;
    }


    /**
     * Gets the tariffName value for this GetTariffPlanInfoResponse.
     * 
     * @return tariffName
     */
    public java.lang.String getTariffName() {
        return tariffName;
    }


    /**
     * Sets the tariffName value for this GetTariffPlanInfoResponse.
     * 
     * @param tariffName
     */
    public void setTariffName(java.lang.String tariffName) {
        this.tariffName = tariffName;
    }


    /**
     * Gets the versionNumber value for this GetTariffPlanInfoResponse.
     * 
     * @return versionNumber
     */
    public java.lang.String getVersionNumber() {
        return versionNumber;
    }


    /**
     * Sets the versionNumber value for this GetTariffPlanInfoResponse.
     * 
     * @param versionNumber
     */
    public void setVersionNumber(java.lang.String versionNumber) {
        this.versionNumber = versionNumber;
    }


    /**
     * Gets the zoneGroupName value for this GetTariffPlanInfoResponse.
     * 
     * @return zoneGroupName
     */
    public java.lang.String getZoneGroupName() {
        return zoneGroupName;
    }


    /**
     * Sets the zoneGroupName value for this GetTariffPlanInfoResponse.
     * 
     * @param zoneGroupName
     */
    public void setZoneGroupName(java.lang.String zoneGroupName) {
        this.zoneGroupName = zoneGroupName;
    }


    /**
     * Gets the effectiveDate value for this GetTariffPlanInfoResponse.
     * 
     * @return effectiveDate
     */
    public java.lang.String getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this GetTariffPlanInfoResponse.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(java.lang.String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the locationNetwork value for this GetTariffPlanInfoResponse.
     * 
     * @return locationNetwork
     */
    public java.lang.String getLocationNetwork() {
        return locationNetwork;
    }


    /**
     * Sets the locationNetwork value for this GetTariffPlanInfoResponse.
     * 
     * @param locationNetwork
     */
    public void setLocationNetwork(java.lang.String locationNetwork) {
        this.locationNetwork = locationNetwork;
    }


    /**
     * Gets the rentalAmount value for this GetTariffPlanInfoResponse.
     * 
     * @return rentalAmount
     */
    public java.lang.String getRentalAmount() {
        return rentalAmount;
    }


    /**
     * Sets the rentalAmount value for this GetTariffPlanInfoResponse.
     * 
     * @param rentalAmount
     */
    public void setRentalAmount(java.lang.String rentalAmount) {
        this.rentalAmount = rentalAmount;
    }


    /**
     * Gets the serviceTax value for this GetTariffPlanInfoResponse.
     * 
     * @return serviceTax
     */
    public java.lang.String getServiceTax() {
        return serviceTax;
    }


    /**
     * Sets the serviceTax value for this GetTariffPlanInfoResponse.
     * 
     * @param serviceTax
     */
    public void setServiceTax(java.lang.String serviceTax) {
        this.serviceTax = serviceTax;
    }


    /**
     * Gets the rentalCycleDays value for this GetTariffPlanInfoResponse.
     * 
     * @return rentalCycleDays
     */
    public java.lang.String getRentalCycleDays() {
        return rentalCycleDays;
    }


    /**
     * Sets the rentalCycleDays value for this GetTariffPlanInfoResponse.
     * 
     * @param rentalCycleDays
     */
    public void setRentalCycleDays(java.lang.String rentalCycleDays) {
        this.rentalCycleDays = rentalCycleDays;
    }


    /**
     * Gets the freeRentalDays value for this GetTariffPlanInfoResponse.
     * 
     * @return freeRentalDays
     */
    public java.lang.String getFreeRentalDays() {
        return freeRentalDays;
    }


    /**
     * Sets the freeRentalDays value for this GetTariffPlanInfoResponse.
     * 
     * @param freeRentalDays
     */
    public void setFreeRentalDays(java.lang.String freeRentalDays) {
        this.freeRentalDays = freeRentalDays;
    }


    /**
     * Gets the thresholdAmount value for this GetTariffPlanInfoResponse.
     * 
     * @return thresholdAmount
     */
    public java.lang.String getThresholdAmount() {
        return thresholdAmount;
    }


    /**
     * Sets the thresholdAmount value for this GetTariffPlanInfoResponse.
     * 
     * @param thresholdAmount
     */
    public void setThresholdAmount(java.lang.String thresholdAmount) {
        this.thresholdAmount = thresholdAmount;
    }


    /**
     * Gets the lockPeriod value for this GetTariffPlanInfoResponse.
     * 
     * @return lockPeriod
     */
    public java.lang.String getLockPeriod() {
        return lockPeriod;
    }


    /**
     * Sets the lockPeriod value for this GetTariffPlanInfoResponse.
     * 
     * @param lockPeriod
     */
    public void setLockPeriod(java.lang.String lockPeriod) {
        this.lockPeriod = lockPeriod;
    }


    /**
     * Gets the billDetailsRequest value for this GetTariffPlanInfoResponse.
     * 
     * @return billDetailsRequest
     */
    public java.lang.String getBillDetailsRequest() {
        return billDetailsRequest;
    }


    /**
     * Sets the billDetailsRequest value for this GetTariffPlanInfoResponse.
     * 
     * @param billDetailsRequest
     */
    public void setBillDetailsRequest(java.lang.String billDetailsRequest) {
        this.billDetailsRequest = billDetailsRequest;
    }


    /**
     * Gets the creditLevelRequest value for this GetTariffPlanInfoResponse.
     * 
     * @return creditLevelRequest
     */
    public java.lang.String getCreditLevelRequest() {
        return creditLevelRequest;
    }


    /**
     * Sets the creditLevelRequest value for this GetTariffPlanInfoResponse.
     * 
     * @param creditLevelRequest
     */
    public void setCreditLevelRequest(java.lang.String creditLevelRequest) {
        this.creditLevelRequest = creditLevelRequest;
    }


    /**
     * Gets the transferorCharges value for this GetTariffPlanInfoResponse.
     * 
     * @return transferorCharges
     */
    public java.lang.String getTransferorCharges() {
        return transferorCharges;
    }


    /**
     * Sets the transferorCharges value for this GetTariffPlanInfoResponse.
     * 
     * @param transferorCharges
     */
    public void setTransferorCharges(java.lang.String transferorCharges) {
        this.transferorCharges = transferorCharges;
    }


    /**
     * Gets the transfereeCharges value for this GetTariffPlanInfoResponse.
     * 
     * @return transfereeCharges
     */
    public java.lang.String getTransfereeCharges() {
        return transfereeCharges;
    }


    /**
     * Sets the transfereeCharges value for this GetTariffPlanInfoResponse.
     * 
     * @param transfereeCharges
     */
    public void setTransfereeCharges(java.lang.String transfereeCharges) {
        this.transfereeCharges = transfereeCharges;
    }


    /**
     * Gets the changeMSISDNCharges value for this GetTariffPlanInfoResponse.
     * 
     * @return changeMSISDNCharges
     */
    public java.lang.String getChangeMSISDNCharges() {
        return changeMSISDNCharges;
    }


    /**
     * Sets the changeMSISDNCharges value for this GetTariffPlanInfoResponse.
     * 
     * @param changeMSISDNCharges
     */
    public void setChangeMSISDNCharges(java.lang.String changeMSISDNCharges) {
        this.changeMSISDNCharges = changeMSISDNCharges;
    }


    /**
     * Gets the maxAmountPerTransfer value for this GetTariffPlanInfoResponse.
     * 
     * @return maxAmountPerTransfer
     */
    public java.lang.String getMaxAmountPerTransfer() {
        return maxAmountPerTransfer;
    }


    /**
     * Sets the maxAmountPerTransfer value for this GetTariffPlanInfoResponse.
     * 
     * @param maxAmountPerTransfer
     */
    public void setMaxAmountPerTransfer(java.lang.String maxAmountPerTransfer) {
        this.maxAmountPerTransfer = maxAmountPerTransfer;
    }


    /**
     * Gets the deductRentalswithinvalidityPeriodBalance value for this GetTariffPlanInfoResponse.
     * 
     * @return deductRentalswithinvalidityPeriodBalance
     */
    public java.lang.String getDeductRentalswithinvalidityPeriodBalance() {
        return deductRentalswithinvalidityPeriodBalance;
    }


    /**
     * Sets the deductRentalswithinvalidityPeriodBalance value for this GetTariffPlanInfoResponse.
     * 
     * @param deductRentalswithinvalidityPeriodBalance
     */
    public void setDeductRentalswithinvalidityPeriodBalance(java.lang.String deductRentalswithinvalidityPeriodBalance) {
        this.deductRentalswithinvalidityPeriodBalance = deductRentalswithinvalidityPeriodBalance;
    }


    /**
     * Gets the firstTimeDeductFlag value for this GetTariffPlanInfoResponse.
     * 
     * @return firstTimeDeductFlag
     */
    public java.lang.String getFirstTimeDeductFlag() {
        return firstTimeDeductFlag;
    }


    /**
     * Sets the firstTimeDeductFlag value for this GetTariffPlanInfoResponse.
     * 
     * @param firstTimeDeductFlag
     */
    public void setFirstTimeDeductFlag(java.lang.String firstTimeDeductFlag) {
        this.firstTimeDeductFlag = firstTimeDeductFlag;
    }


    /**
     * Gets the lateRechargeFeeSlabs value for this GetTariffPlanInfoResponse.
     * 
     * @return lateRechargeFeeSlabs
     */
    public java.lang.String getLateRechargeFeeSlabs() {
        return lateRechargeFeeSlabs;
    }


    /**
     * Sets the lateRechargeFeeSlabs value for this GetTariffPlanInfoResponse.
     * 
     * @param lateRechargeFeeSlabs
     */
    public void setLateRechargeFeeSlabs(java.lang.String lateRechargeFeeSlabs) {
        this.lateRechargeFeeSlabs = lateRechargeFeeSlabs;
    }


    /**
     * Gets the validityPeriodServices value for this GetTariffPlanInfoResponse.
     * 
     * @return validityPeriodServices
     */
    public com.xius.xbus.messages.billing.tariff.Service[] getValidityPeriodServices() {
        return validityPeriodServices;
    }


    /**
     * Sets the validityPeriodServices value for this GetTariffPlanInfoResponse.
     * 
     * @param validityPeriodServices
     */
    public void setValidityPeriodServices(com.xius.xbus.messages.billing.tariff.Service[] validityPeriodServices) {
        this.validityPeriodServices = validityPeriodServices;
    }

    public com.xius.xbus.messages.billing.tariff.Service getValidityPeriodServices(int i) {
        return this.validityPeriodServices[i];
    }

    public void setValidityPeriodServices(int i, com.xius.xbus.messages.billing.tariff.Service _value) {
        this.validityPeriodServices[i] = _value;
    }


    /**
     * Gets the gracePeriodServices value for this GetTariffPlanInfoResponse.
     * 
     * @return gracePeriodServices
     */
    public com.xius.xbus.messages.billing.tariff.Service[] getGracePeriodServices() {
        return gracePeriodServices;
    }


    /**
     * Sets the gracePeriodServices value for this GetTariffPlanInfoResponse.
     * 
     * @param gracePeriodServices
     */
    public void setGracePeriodServices(com.xius.xbus.messages.billing.tariff.Service[] gracePeriodServices) {
        this.gracePeriodServices = gracePeriodServices;
    }

    public com.xius.xbus.messages.billing.tariff.Service getGracePeriodServices(int i) {
        return this.gracePeriodServices[i];
    }

    public void setGracePeriodServices(int i, com.xius.xbus.messages.billing.tariff.Service _value) {
        this.gracePeriodServices[i] = _value;
    }


    /**
     * Gets the accountID value for this GetTariffPlanInfoResponse.
     * 
     * @return accountID
     */
    public java.lang.String getAccountID() {
        return accountID;
    }


    /**
     * Sets the accountID value for this GetTariffPlanInfoResponse.
     * 
     * @param accountID
     */
    public void setAccountID(java.lang.String accountID) {
        this.accountID = accountID;
    }


    /**
     * Gets the currentTariffPlanName value for this GetTariffPlanInfoResponse.
     * 
     * @return currentTariffPlanName
     */
    public java.lang.String getCurrentTariffPlanName() {
        return currentTariffPlanName;
    }


    /**
     * Sets the currentTariffPlanName value for this GetTariffPlanInfoResponse.
     * 
     * @param currentTariffPlanName
     */
    public void setCurrentTariffPlanName(java.lang.String currentTariffPlanName) {
        this.currentTariffPlanName = currentTariffPlanName;
    }


    /**
     * Gets the newTariffPlan value for this GetTariffPlanInfoResponse.
     * 
     * @return newTariffPlan
     */
    public java.lang.String getNewTariffPlan() {
        return newTariffPlan;
    }


    /**
     * Sets the newTariffPlan value for this GetTariffPlanInfoResponse.
     * 
     * @param newTariffPlan
     */
    public void setNewTariffPlan(java.lang.String newTariffPlan) {
        this.newTariffPlan = newTariffPlan;
    }


    /**
     * Gets the administrativeCharges value for this GetTariffPlanInfoResponse.
     * 
     * @return administrativeCharges
     */
    public double getAdministrativeCharges() {
        return administrativeCharges;
    }


    /**
     * Sets the administrativeCharges value for this GetTariffPlanInfoResponse.
     * 
     * @param administrativeCharges
     */
    public void setAdministrativeCharges(double administrativeCharges) {
        this.administrativeCharges = administrativeCharges;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTariffPlanInfoResponse)) return false;
        GetTariffPlanInfoResponse other = (GetTariffPlanInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.tariffId==null && other.getTariffId()==null) || 
             (this.tariffId!=null &&
              this.tariffId.equals(other.getTariffId()))) &&
            ((this.tariffName==null && other.getTariffName()==null) || 
             (this.tariffName!=null &&
              this.tariffName.equals(other.getTariffName()))) &&
            ((this.versionNumber==null && other.getVersionNumber()==null) || 
             (this.versionNumber!=null &&
              this.versionNumber.equals(other.getVersionNumber()))) &&
            ((this.zoneGroupName==null && other.getZoneGroupName()==null) || 
             (this.zoneGroupName!=null &&
              this.zoneGroupName.equals(other.getZoneGroupName()))) &&
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate()))) &&
            ((this.locationNetwork==null && other.getLocationNetwork()==null) || 
             (this.locationNetwork!=null &&
              this.locationNetwork.equals(other.getLocationNetwork()))) &&
            ((this.rentalAmount==null && other.getRentalAmount()==null) || 
             (this.rentalAmount!=null &&
              this.rentalAmount.equals(other.getRentalAmount()))) &&
            ((this.serviceTax==null && other.getServiceTax()==null) || 
             (this.serviceTax!=null &&
              this.serviceTax.equals(other.getServiceTax()))) &&
            ((this.rentalCycleDays==null && other.getRentalCycleDays()==null) || 
             (this.rentalCycleDays!=null &&
              this.rentalCycleDays.equals(other.getRentalCycleDays()))) &&
            ((this.freeRentalDays==null && other.getFreeRentalDays()==null) || 
             (this.freeRentalDays!=null &&
              this.freeRentalDays.equals(other.getFreeRentalDays()))) &&
            ((this.thresholdAmount==null && other.getThresholdAmount()==null) || 
             (this.thresholdAmount!=null &&
              this.thresholdAmount.equals(other.getThresholdAmount()))) &&
            ((this.lockPeriod==null && other.getLockPeriod()==null) || 
             (this.lockPeriod!=null &&
              this.lockPeriod.equals(other.getLockPeriod()))) &&
            ((this.billDetailsRequest==null && other.getBillDetailsRequest()==null) || 
             (this.billDetailsRequest!=null &&
              this.billDetailsRequest.equals(other.getBillDetailsRequest()))) &&
            ((this.creditLevelRequest==null && other.getCreditLevelRequest()==null) || 
             (this.creditLevelRequest!=null &&
              this.creditLevelRequest.equals(other.getCreditLevelRequest()))) &&
            ((this.transferorCharges==null && other.getTransferorCharges()==null) || 
             (this.transferorCharges!=null &&
              this.transferorCharges.equals(other.getTransferorCharges()))) &&
            ((this.transfereeCharges==null && other.getTransfereeCharges()==null) || 
             (this.transfereeCharges!=null &&
              this.transfereeCharges.equals(other.getTransfereeCharges()))) &&
            ((this.changeMSISDNCharges==null && other.getChangeMSISDNCharges()==null) || 
             (this.changeMSISDNCharges!=null &&
              this.changeMSISDNCharges.equals(other.getChangeMSISDNCharges()))) &&
            ((this.maxAmountPerTransfer==null && other.getMaxAmountPerTransfer()==null) || 
             (this.maxAmountPerTransfer!=null &&
              this.maxAmountPerTransfer.equals(other.getMaxAmountPerTransfer()))) &&
            ((this.deductRentalswithinvalidityPeriodBalance==null && other.getDeductRentalswithinvalidityPeriodBalance()==null) || 
             (this.deductRentalswithinvalidityPeriodBalance!=null &&
              this.deductRentalswithinvalidityPeriodBalance.equals(other.getDeductRentalswithinvalidityPeriodBalance()))) &&
            ((this.firstTimeDeductFlag==null && other.getFirstTimeDeductFlag()==null) || 
             (this.firstTimeDeductFlag!=null &&
              this.firstTimeDeductFlag.equals(other.getFirstTimeDeductFlag()))) &&
            ((this.lateRechargeFeeSlabs==null && other.getLateRechargeFeeSlabs()==null) || 
             (this.lateRechargeFeeSlabs!=null &&
              this.lateRechargeFeeSlabs.equals(other.getLateRechargeFeeSlabs()))) &&
            ((this.validityPeriodServices==null && other.getValidityPeriodServices()==null) || 
             (this.validityPeriodServices!=null &&
              java.util.Arrays.equals(this.validityPeriodServices, other.getValidityPeriodServices()))) &&
            ((this.gracePeriodServices==null && other.getGracePeriodServices()==null) || 
             (this.gracePeriodServices!=null &&
              java.util.Arrays.equals(this.gracePeriodServices, other.getGracePeriodServices()))) &&
            ((this.accountID==null && other.getAccountID()==null) || 
             (this.accountID!=null &&
              this.accountID.equals(other.getAccountID()))) &&
            ((this.currentTariffPlanName==null && other.getCurrentTariffPlanName()==null) || 
             (this.currentTariffPlanName!=null &&
              this.currentTariffPlanName.equals(other.getCurrentTariffPlanName()))) &&
            ((this.newTariffPlan==null && other.getNewTariffPlan()==null) || 
             (this.newTariffPlan!=null &&
              this.newTariffPlan.equals(other.getNewTariffPlan()))) &&
            this.administrativeCharges == other.getAdministrativeCharges();
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
        if (getTariffId() != null) {
            _hashCode += getTariffId().hashCode();
        }
        if (getTariffName() != null) {
            _hashCode += getTariffName().hashCode();
        }
        if (getVersionNumber() != null) {
            _hashCode += getVersionNumber().hashCode();
        }
        if (getZoneGroupName() != null) {
            _hashCode += getZoneGroupName().hashCode();
        }
        if (getEffectiveDate() != null) {
            _hashCode += getEffectiveDate().hashCode();
        }
        if (getLocationNetwork() != null) {
            _hashCode += getLocationNetwork().hashCode();
        }
        if (getRentalAmount() != null) {
            _hashCode += getRentalAmount().hashCode();
        }
        if (getServiceTax() != null) {
            _hashCode += getServiceTax().hashCode();
        }
        if (getRentalCycleDays() != null) {
            _hashCode += getRentalCycleDays().hashCode();
        }
        if (getFreeRentalDays() != null) {
            _hashCode += getFreeRentalDays().hashCode();
        }
        if (getThresholdAmount() != null) {
            _hashCode += getThresholdAmount().hashCode();
        }
        if (getLockPeriod() != null) {
            _hashCode += getLockPeriod().hashCode();
        }
        if (getBillDetailsRequest() != null) {
            _hashCode += getBillDetailsRequest().hashCode();
        }
        if (getCreditLevelRequest() != null) {
            _hashCode += getCreditLevelRequest().hashCode();
        }
        if (getTransferorCharges() != null) {
            _hashCode += getTransferorCharges().hashCode();
        }
        if (getTransfereeCharges() != null) {
            _hashCode += getTransfereeCharges().hashCode();
        }
        if (getChangeMSISDNCharges() != null) {
            _hashCode += getChangeMSISDNCharges().hashCode();
        }
        if (getMaxAmountPerTransfer() != null) {
            _hashCode += getMaxAmountPerTransfer().hashCode();
        }
        if (getDeductRentalswithinvalidityPeriodBalance() != null) {
            _hashCode += getDeductRentalswithinvalidityPeriodBalance().hashCode();
        }
        if (getFirstTimeDeductFlag() != null) {
            _hashCode += getFirstTimeDeductFlag().hashCode();
        }
        if (getLateRechargeFeeSlabs() != null) {
            _hashCode += getLateRechargeFeeSlabs().hashCode();
        }
        if (getValidityPeriodServices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValidityPeriodServices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValidityPeriodServices(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGracePeriodServices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGracePeriodServices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGracePeriodServices(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAccountID() != null) {
            _hashCode += getAccountID().hashCode();
        }
        if (getCurrentTariffPlanName() != null) {
            _hashCode += getCurrentTariffPlanName().hashCode();
        }
        if (getNewTariffPlan() != null) {
            _hashCode += getNewTariffPlan().hashCode();
        }
        _hashCode += new Double(getAdministrativeCharges()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetTariffPlanInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getTariffPlanInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tariffId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "tariffId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tariffName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "tariffName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "versionNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zoneGroupName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "zoneGroupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "effectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationNetwork");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "locationNetwork"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rentalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "rentalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceTax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "serviceTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rentalCycleDays");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "rentalCycleDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeRentalDays");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "freeRentalDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thresholdAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "thresholdAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "lockPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billDetailsRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "billDetailsRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditLevelRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "creditLevelRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferorCharges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "transferorCharges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transfereeCharges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "transfereeCharges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeMSISDNCharges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "changeMSISDNCharges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxAmountPerTransfer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "maxAmountPerTransfer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deductRentalswithinvalidityPeriodBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "deductRentalswithinvalidityPeriodBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstTimeDeductFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "firstTimeDeductFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lateRechargeFeeSlabs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "lateRechargeFeeSlabs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validityPeriodServices");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "validityPeriodServices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "Service"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gracePeriodServices");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "gracePeriodServices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "Service"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "accountID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentTariffPlanName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "currentTariffPlanName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newTariffPlan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "newTariffPlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("administrativeCharges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "administrativeCharges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
