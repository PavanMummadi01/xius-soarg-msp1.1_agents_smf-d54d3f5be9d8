/**
 * ActivateAccountRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.provisioning;

public class ActivateAccountRequest  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private net.bcgi.si.messages.mvnoapi.provisioning.AccountId accountId;

    private java.lang.String accountType;

    private java.util.Calendar activationDate;

    private net.bcgi.si.messages.mvnoapi.common.BillingAddressData addressData;

    private java.lang.String creditClassCode;

    private java.lang.String customerType;

    private java.util.Calendar dateOfBirth;

    private net.bcgi.si.messages.mvnoapi.device.DeviceIdKey deviceId;

    private net.bcgi.si.messages.mvnoapi.device.DeviceHardwareData hardwareData;

    private net.bcgi.si.messages.mvnoapi.device.DeviceLockData lockData;

    private java.lang.String messageID;

    private net.bcgi.si.messages.mvnoapi.provisioning.PaymentInfo paymentInfo;

    private java.lang.String prepayStatusCode;

    private java.lang.String prepayType;

    private net.bcgi.si.messages.mvnoapi.provisioning.RegistrationFeeDetails registrationFeeDetails;

    private net.bcgi.si.messages.mvnoapi.common.SecurityId securityId;

    private net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext;

    private java.lang.Integer totalBalanceDue;

    private java.lang.String version;

    private org.apache.axis.message.MessageElement [] _any;

    public ActivateAccountRequest() {
    }

    public ActivateAccountRequest(
           net.bcgi.si.messages.mvnoapi.provisioning.AccountId accountId,
           java.lang.String accountType,
           java.util.Calendar activationDate,
           net.bcgi.si.messages.mvnoapi.common.BillingAddressData addressData,
           java.lang.String creditClassCode,
           java.lang.String customerType,
           java.util.Calendar dateOfBirth,
           net.bcgi.si.messages.mvnoapi.device.DeviceIdKey deviceId,
           net.bcgi.si.messages.mvnoapi.device.DeviceHardwareData hardwareData,
           net.bcgi.si.messages.mvnoapi.device.DeviceLockData lockData,
           java.lang.String messageID,
           net.bcgi.si.messages.mvnoapi.provisioning.PaymentInfo paymentInfo,
           java.lang.String prepayStatusCode,
           java.lang.String prepayType,
           net.bcgi.si.messages.mvnoapi.provisioning.RegistrationFeeDetails registrationFeeDetails,
           net.bcgi.si.messages.mvnoapi.common.SecurityId securityId,
           net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext,
           java.lang.Integer totalBalanceDue,
           java.lang.String version,
           org.apache.axis.message.MessageElement [] _any) {
           this.accountId = accountId;
           this.accountType = accountType;
           this.activationDate = activationDate;
           this.addressData = addressData;
           this.creditClassCode = creditClassCode;
           this.customerType = customerType;
           this.dateOfBirth = dateOfBirth;
           this.deviceId = deviceId;
           this.hardwareData = hardwareData;
           this.lockData = lockData;
           this.messageID = messageID;
           this.paymentInfo = paymentInfo;
           this.prepayStatusCode = prepayStatusCode;
           this.prepayType = prepayType;
           this.registrationFeeDetails = registrationFeeDetails;
           this.securityId = securityId;
           this.serviceContext = serviceContext;
           this.totalBalanceDue = totalBalanceDue;
           this.version = version;
           this._any = _any;
    }


    /**
     * Gets the accountId value for this ActivateAccountRequest.
     * 
     * @return accountId
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.AccountId getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this ActivateAccountRequest.
     * 
     * @param accountId
     */
    public void setAccountId(net.bcgi.si.messages.mvnoapi.provisioning.AccountId accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the accountType value for this ActivateAccountRequest.
     * 
     * @return accountType
     */
    public java.lang.String getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this ActivateAccountRequest.
     * 
     * @param accountType
     */
    public void setAccountType(java.lang.String accountType) {
        this.accountType = accountType;
    }


    /**
     * Gets the activationDate value for this ActivateAccountRequest.
     * 
     * @return activationDate
     */
    public java.util.Calendar getActivationDate() {
        return activationDate;
    }


    /**
     * Sets the activationDate value for this ActivateAccountRequest.
     * 
     * @param activationDate
     */
    public void setActivationDate(java.util.Calendar activationDate) {
        this.activationDate = activationDate;
    }


    /**
     * Gets the addressData value for this ActivateAccountRequest.
     * 
     * @return addressData
     */
    public net.bcgi.si.messages.mvnoapi.common.BillingAddressData getAddressData() {
        return addressData;
    }


    /**
     * Sets the addressData value for this ActivateAccountRequest.
     * 
     * @param addressData
     */
    public void setAddressData(net.bcgi.si.messages.mvnoapi.common.BillingAddressData addressData) {
        this.addressData = addressData;
    }


    /**
     * Gets the creditClassCode value for this ActivateAccountRequest.
     * 
     * @return creditClassCode
     */
    public java.lang.String getCreditClassCode() {
        return creditClassCode;
    }


    /**
     * Sets the creditClassCode value for this ActivateAccountRequest.
     * 
     * @param creditClassCode
     */
    public void setCreditClassCode(java.lang.String creditClassCode) {
        this.creditClassCode = creditClassCode;
    }


    /**
     * Gets the customerType value for this ActivateAccountRequest.
     * 
     * @return customerType
     */
    public java.lang.String getCustomerType() {
        return customerType;
    }


    /**
     * Sets the customerType value for this ActivateAccountRequest.
     * 
     * @param customerType
     */
    public void setCustomerType(java.lang.String customerType) {
        this.customerType = customerType;
    }


    /**
     * Gets the dateOfBirth value for this ActivateAccountRequest.
     * 
     * @return dateOfBirth
     */
    public java.util.Calendar getDateOfBirth() {
        return dateOfBirth;
    }


    /**
     * Sets the dateOfBirth value for this ActivateAccountRequest.
     * 
     * @param dateOfBirth
     */
    public void setDateOfBirth(java.util.Calendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    /**
     * Gets the deviceId value for this ActivateAccountRequest.
     * 
     * @return deviceId
     */
    public net.bcgi.si.messages.mvnoapi.device.DeviceIdKey getDeviceId() {
        return deviceId;
    }


    /**
     * Sets the deviceId value for this ActivateAccountRequest.
     * 
     * @param deviceId
     */
    public void setDeviceId(net.bcgi.si.messages.mvnoapi.device.DeviceIdKey deviceId) {
        this.deviceId = deviceId;
    }


    /**
     * Gets the hardwareData value for this ActivateAccountRequest.
     * 
     * @return hardwareData
     */
    public net.bcgi.si.messages.mvnoapi.device.DeviceHardwareData getHardwareData() {
        return hardwareData;
    }


    /**
     * Sets the hardwareData value for this ActivateAccountRequest.
     * 
     * @param hardwareData
     */
    public void setHardwareData(net.bcgi.si.messages.mvnoapi.device.DeviceHardwareData hardwareData) {
        this.hardwareData = hardwareData;
    }


    /**
     * Gets the lockData value for this ActivateAccountRequest.
     * 
     * @return lockData
     */
    public net.bcgi.si.messages.mvnoapi.device.DeviceLockData getLockData() {
        return lockData;
    }


    /**
     * Sets the lockData value for this ActivateAccountRequest.
     * 
     * @param lockData
     */
    public void setLockData(net.bcgi.si.messages.mvnoapi.device.DeviceLockData lockData) {
        this.lockData = lockData;
    }


    /**
     * Gets the messageID value for this ActivateAccountRequest.
     * 
     * @return messageID
     */
    public java.lang.String getMessageID() {
        return messageID;
    }


    /**
     * Sets the messageID value for this ActivateAccountRequest.
     * 
     * @param messageID
     */
    public void setMessageID(java.lang.String messageID) {
        this.messageID = messageID;
    }


    /**
     * Gets the paymentInfo value for this ActivateAccountRequest.
     * 
     * @return paymentInfo
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.PaymentInfo getPaymentInfo() {
        return paymentInfo;
    }


    /**
     * Sets the paymentInfo value for this ActivateAccountRequest.
     * 
     * @param paymentInfo
     */
    public void setPaymentInfo(net.bcgi.si.messages.mvnoapi.provisioning.PaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
    }


    /**
     * Gets the prepayStatusCode value for this ActivateAccountRequest.
     * 
     * @return prepayStatusCode
     */
    public java.lang.String getPrepayStatusCode() {
        return prepayStatusCode;
    }


    /**
     * Sets the prepayStatusCode value for this ActivateAccountRequest.
     * 
     * @param prepayStatusCode
     */
    public void setPrepayStatusCode(java.lang.String prepayStatusCode) {
        this.prepayStatusCode = prepayStatusCode;
    }


    /**
     * Gets the prepayType value for this ActivateAccountRequest.
     * 
     * @return prepayType
     */
    public java.lang.String getPrepayType() {
        return prepayType;
    }


    /**
     * Sets the prepayType value for this ActivateAccountRequest.
     * 
     * @param prepayType
     */
    public void setPrepayType(java.lang.String prepayType) {
        this.prepayType = prepayType;
    }


    /**
     * Gets the registrationFeeDetails value for this ActivateAccountRequest.
     * 
     * @return registrationFeeDetails
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.RegistrationFeeDetails getRegistrationFeeDetails() {
        return registrationFeeDetails;
    }


    /**
     * Sets the registrationFeeDetails value for this ActivateAccountRequest.
     * 
     * @param registrationFeeDetails
     */
    public void setRegistrationFeeDetails(net.bcgi.si.messages.mvnoapi.provisioning.RegistrationFeeDetails registrationFeeDetails) {
        this.registrationFeeDetails = registrationFeeDetails;
    }


    /**
     * Gets the securityId value for this ActivateAccountRequest.
     * 
     * @return securityId
     */
    public net.bcgi.si.messages.mvnoapi.common.SecurityId getSecurityId() {
        return securityId;
    }


    /**
     * Sets the securityId value for this ActivateAccountRequest.
     * 
     * @param securityId
     */
    public void setSecurityId(net.bcgi.si.messages.mvnoapi.common.SecurityId securityId) {
        this.securityId = securityId;
    }


    /**
     * Gets the serviceContext value for this ActivateAccountRequest.
     * 
     * @return serviceContext
     */
    public net.bcgi.si.messages.mvnoapi.common.ServiceContext getServiceContext() {
        return serviceContext;
    }


    /**
     * Sets the serviceContext value for this ActivateAccountRequest.
     * 
     * @param serviceContext
     */
    public void setServiceContext(net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext) {
        this.serviceContext = serviceContext;
    }


    /**
     * Gets the totalBalanceDue value for this ActivateAccountRequest.
     * 
     * @return totalBalanceDue
     */
    public java.lang.Integer getTotalBalanceDue() {
        return totalBalanceDue;
    }


    /**
     * Sets the totalBalanceDue value for this ActivateAccountRequest.
     * 
     * @param totalBalanceDue
     */
    public void setTotalBalanceDue(java.lang.Integer totalBalanceDue) {
        this.totalBalanceDue = totalBalanceDue;
    }


    /**
     * Gets the version value for this ActivateAccountRequest.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this ActivateAccountRequest.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the _any value for this ActivateAccountRequest.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this ActivateAccountRequest.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ActivateAccountRequest)) return false;
        ActivateAccountRequest other = (ActivateAccountRequest) obj;
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
            ((this.accountType==null && other.getAccountType()==null) || 
             (this.accountType!=null &&
              this.accountType.equals(other.getAccountType()))) &&
            ((this.activationDate==null && other.getActivationDate()==null) || 
             (this.activationDate!=null &&
              this.activationDate.equals(other.getActivationDate()))) &&
            ((this.addressData==null && other.getAddressData()==null) || 
             (this.addressData!=null &&
              this.addressData.equals(other.getAddressData()))) &&
            ((this.creditClassCode==null && other.getCreditClassCode()==null) || 
             (this.creditClassCode!=null &&
              this.creditClassCode.equals(other.getCreditClassCode()))) &&
            ((this.customerType==null && other.getCustomerType()==null) || 
             (this.customerType!=null &&
              this.customerType.equals(other.getCustomerType()))) &&
            ((this.dateOfBirth==null && other.getDateOfBirth()==null) || 
             (this.dateOfBirth!=null &&
              this.dateOfBirth.equals(other.getDateOfBirth()))) &&
            ((this.deviceId==null && other.getDeviceId()==null) || 
             (this.deviceId!=null &&
              this.deviceId.equals(other.getDeviceId()))) &&
            ((this.hardwareData==null && other.getHardwareData()==null) || 
             (this.hardwareData!=null &&
              this.hardwareData.equals(other.getHardwareData()))) &&
            ((this.lockData==null && other.getLockData()==null) || 
             (this.lockData!=null &&
              this.lockData.equals(other.getLockData()))) &&
            ((this.messageID==null && other.getMessageID()==null) || 
             (this.messageID!=null &&
              this.messageID.equals(other.getMessageID()))) &&
            ((this.paymentInfo==null && other.getPaymentInfo()==null) || 
             (this.paymentInfo!=null &&
              this.paymentInfo.equals(other.getPaymentInfo()))) &&
            ((this.prepayStatusCode==null && other.getPrepayStatusCode()==null) || 
             (this.prepayStatusCode!=null &&
              this.prepayStatusCode.equals(other.getPrepayStatusCode()))) &&
            ((this.prepayType==null && other.getPrepayType()==null) || 
             (this.prepayType!=null &&
              this.prepayType.equals(other.getPrepayType()))) &&
            ((this.registrationFeeDetails==null && other.getRegistrationFeeDetails()==null) || 
             (this.registrationFeeDetails!=null &&
              this.registrationFeeDetails.equals(other.getRegistrationFeeDetails()))) &&
            ((this.securityId==null && other.getSecurityId()==null) || 
             (this.securityId!=null &&
              this.securityId.equals(other.getSecurityId()))) &&
            ((this.serviceContext==null && other.getServiceContext()==null) || 
             (this.serviceContext!=null &&
              this.serviceContext.equals(other.getServiceContext()))) &&
            ((this.totalBalanceDue==null && other.getTotalBalanceDue()==null) || 
             (this.totalBalanceDue!=null &&
              this.totalBalanceDue.equals(other.getTotalBalanceDue()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
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
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getAccountType() != null) {
            _hashCode += getAccountType().hashCode();
        }
        if (getActivationDate() != null) {
            _hashCode += getActivationDate().hashCode();
        }
        if (getAddressData() != null) {
            _hashCode += getAddressData().hashCode();
        }
        if (getCreditClassCode() != null) {
            _hashCode += getCreditClassCode().hashCode();
        }
        if (getCustomerType() != null) {
            _hashCode += getCustomerType().hashCode();
        }
        if (getDateOfBirth() != null) {
            _hashCode += getDateOfBirth().hashCode();
        }
        if (getDeviceId() != null) {
            _hashCode += getDeviceId().hashCode();
        }
        if (getHardwareData() != null) {
            _hashCode += getHardwareData().hashCode();
        }
        if (getLockData() != null) {
            _hashCode += getLockData().hashCode();
        }
        if (getMessageID() != null) {
            _hashCode += getMessageID().hashCode();
        }
        if (getPaymentInfo() != null) {
            _hashCode += getPaymentInfo().hashCode();
        }
        if (getPrepayStatusCode() != null) {
            _hashCode += getPrepayStatusCode().hashCode();
        }
        if (getPrepayType() != null) {
            _hashCode += getPrepayType().hashCode();
        }
        if (getRegistrationFeeDetails() != null) {
            _hashCode += getRegistrationFeeDetails().hashCode();
        }
        if (getSecurityId() != null) {
            _hashCode += getSecurityId().hashCode();
        }
        if (getServiceContext() != null) {
            _hashCode += getServiceContext().hashCode();
        }
        if (getTotalBalanceDue() != null) {
            _hashCode += getTotalBalanceDue().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
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
        new org.apache.axis.description.TypeDesc(ActivateAccountRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "ActivateAccountRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "accountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "AccountId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "accountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "activationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "addressData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "BillingAddressData"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditClassCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "creditClassCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "customerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfBirth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "dateOfBirth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "deviceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "DeviceIdKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hardwareData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "hardwareData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "DeviceHardwareData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "lockData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "DeviceLockData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "messageID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "paymentInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "PaymentInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prepayStatusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "prepayStatusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prepayType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "prepayType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registrationFeeDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "registrationFeeDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "RegistrationFeeDetails"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "securityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "SecurityId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceContext");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "serviceContext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "ServiceContext"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalBalanceDue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "totalBalanceDue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "version"));
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
