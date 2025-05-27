/**
 * GetAccountResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.subscriber;

public class GetAccountResponse  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private java.lang.String MDN;

    private net.bcgi.si.messages.mvnoapi.subscriber.AccountNumberMap accountNumberMap;

    private net.bcgi.si.messages.mvnoapi.subscriber.AccountStatus accountStatus;

    private net.bcgi.si.messages.mvnoapi.common.AlternateAccountId alternateAccountId;

    private net.bcgi.si.messages.mvnoapi.subscriber.BalanceDetails balancedetails;

    private net.bcgi.si.messages.mvnoapi.common.BillingAddressData billingAddressData;

    private net.bcgi.si.messages.mvnoapi.provisioning.BillingMethodType billingMethod;

    private java.lang.String correlationID;

    private net.bcgi.si.messages.mvnoapi.device.DeviceNetworkData deviceNetworkData;

    private net.bcgi.si.messages.mvnoapi.common.ErrorData[] errors;

    private net.bcgi.si.messages.mvnoapi.provisioning.PersonalData personalData;

    private java.lang.String servicePlan;

    private java.lang.Double sevicePlanfee;

    private net.bcgi.si.messages.mvnoapi.common.StatusCode statusCode;

    private net.bcgi.si.messages.mvnoapi.subscriber.SubscriberDetailsInfo subDetailsInfo;

    private java.util.Calendar timeStamp;

    private net.bcgi.si.messages.mvnoapi.provisioning.UserDefinedInfo userDefined;

    private java.lang.String version;

    private org.apache.axis.message.MessageElement [] _any;

    public GetAccountResponse() {
    }

    public GetAccountResponse(
           java.lang.String MDN,
           net.bcgi.si.messages.mvnoapi.subscriber.AccountNumberMap accountNumberMap,
           net.bcgi.si.messages.mvnoapi.subscriber.AccountStatus accountStatus,
           net.bcgi.si.messages.mvnoapi.common.AlternateAccountId alternateAccountId,
           net.bcgi.si.messages.mvnoapi.subscriber.BalanceDetails balancedetails,
           net.bcgi.si.messages.mvnoapi.common.BillingAddressData billingAddressData,
           net.bcgi.si.messages.mvnoapi.provisioning.BillingMethodType billingMethod,
           java.lang.String correlationID,
           net.bcgi.si.messages.mvnoapi.device.DeviceNetworkData deviceNetworkData,
           net.bcgi.si.messages.mvnoapi.common.ErrorData[] errors,
           net.bcgi.si.messages.mvnoapi.provisioning.PersonalData personalData,
           java.lang.String servicePlan,
           java.lang.Double sevicePlanfee,
           net.bcgi.si.messages.mvnoapi.common.StatusCode statusCode,
           net.bcgi.si.messages.mvnoapi.subscriber.SubscriberDetailsInfo subDetailsInfo,
           java.util.Calendar timeStamp,
           net.bcgi.si.messages.mvnoapi.provisioning.UserDefinedInfo userDefined,
           java.lang.String version,
           org.apache.axis.message.MessageElement [] _any) {
           this.MDN = MDN;
           this.accountNumberMap = accountNumberMap;
           this.accountStatus = accountStatus;
           this.alternateAccountId = alternateAccountId;
           this.balancedetails = balancedetails;
           this.billingAddressData = billingAddressData;
           this.billingMethod = billingMethod;
           this.correlationID = correlationID;
           this.deviceNetworkData = deviceNetworkData;
           this.errors = errors;
           this.personalData = personalData;
           this.servicePlan = servicePlan;
           this.sevicePlanfee = sevicePlanfee;
           this.statusCode = statusCode;
           this.subDetailsInfo = subDetailsInfo;
           this.timeStamp = timeStamp;
           this.userDefined = userDefined;
           this.version = version;
           this._any = _any;
    }


    /**
     * Gets the MDN value for this GetAccountResponse.
     * 
     * @return MDN
     */
    public java.lang.String getMDN() {
        return MDN;
    }


    /**
     * Sets the MDN value for this GetAccountResponse.
     * 
     * @param MDN
     */
    public void setMDN(java.lang.String MDN) {
        this.MDN = MDN;
    }


    /**
     * Gets the accountNumberMap value for this GetAccountResponse.
     * 
     * @return accountNumberMap
     */
    public net.bcgi.si.messages.mvnoapi.subscriber.AccountNumberMap getAccountNumberMap() {
        return accountNumberMap;
    }


    /**
     * Sets the accountNumberMap value for this GetAccountResponse.
     * 
     * @param accountNumberMap
     */
    public void setAccountNumberMap(net.bcgi.si.messages.mvnoapi.subscriber.AccountNumberMap accountNumberMap) {
        this.accountNumberMap = accountNumberMap;
    }


    /**
     * Gets the accountStatus value for this GetAccountResponse.
     * 
     * @return accountStatus
     */
    public net.bcgi.si.messages.mvnoapi.subscriber.AccountStatus getAccountStatus() {
        return accountStatus;
    }


    /**
     * Sets the accountStatus value for this GetAccountResponse.
     * 
     * @param accountStatus
     */
    public void setAccountStatus(net.bcgi.si.messages.mvnoapi.subscriber.AccountStatus accountStatus) {
        this.accountStatus = accountStatus;
    }


    /**
     * Gets the alternateAccountId value for this GetAccountResponse.
     * 
     * @return alternateAccountId
     */
    public net.bcgi.si.messages.mvnoapi.common.AlternateAccountId getAlternateAccountId() {
        return alternateAccountId;
    }


    /**
     * Sets the alternateAccountId value for this GetAccountResponse.
     * 
     * @param alternateAccountId
     */
    public void setAlternateAccountId(net.bcgi.si.messages.mvnoapi.common.AlternateAccountId alternateAccountId) {
        this.alternateAccountId = alternateAccountId;
    }


    /**
     * Gets the balancedetails value for this GetAccountResponse.
     * 
     * @return balancedetails
     */
    public net.bcgi.si.messages.mvnoapi.subscriber.BalanceDetails getBalancedetails() {
        return balancedetails;
    }


    /**
     * Sets the balancedetails value for this GetAccountResponse.
     * 
     * @param balancedetails
     */
    public void setBalancedetails(net.bcgi.si.messages.mvnoapi.subscriber.BalanceDetails balancedetails) {
        this.balancedetails = balancedetails;
    }


    /**
     * Gets the billingAddressData value for this GetAccountResponse.
     * 
     * @return billingAddressData
     */
    public net.bcgi.si.messages.mvnoapi.common.BillingAddressData getBillingAddressData() {
        return billingAddressData;
    }


    /**
     * Sets the billingAddressData value for this GetAccountResponse.
     * 
     * @param billingAddressData
     */
    public void setBillingAddressData(net.bcgi.si.messages.mvnoapi.common.BillingAddressData billingAddressData) {
        this.billingAddressData = billingAddressData;
    }


    /**
     * Gets the billingMethod value for this GetAccountResponse.
     * 
     * @return billingMethod
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.BillingMethodType getBillingMethod() {
        return billingMethod;
    }


    /**
     * Sets the billingMethod value for this GetAccountResponse.
     * 
     * @param billingMethod
     */
    public void setBillingMethod(net.bcgi.si.messages.mvnoapi.provisioning.BillingMethodType billingMethod) {
        this.billingMethod = billingMethod;
    }


    /**
     * Gets the correlationID value for this GetAccountResponse.
     * 
     * @return correlationID
     */
    public java.lang.String getCorrelationID() {
        return correlationID;
    }


    /**
     * Sets the correlationID value for this GetAccountResponse.
     * 
     * @param correlationID
     */
    public void setCorrelationID(java.lang.String correlationID) {
        this.correlationID = correlationID;
    }


    /**
     * Gets the deviceNetworkData value for this GetAccountResponse.
     * 
     * @return deviceNetworkData
     */
    public net.bcgi.si.messages.mvnoapi.device.DeviceNetworkData getDeviceNetworkData() {
        return deviceNetworkData;
    }


    /**
     * Sets the deviceNetworkData value for this GetAccountResponse.
     * 
     * @param deviceNetworkData
     */
    public void setDeviceNetworkData(net.bcgi.si.messages.mvnoapi.device.DeviceNetworkData deviceNetworkData) {
        this.deviceNetworkData = deviceNetworkData;
    }


    /**
     * Gets the errors value for this GetAccountResponse.
     * 
     * @return errors
     */
    public net.bcgi.si.messages.mvnoapi.common.ErrorData[] getErrors() {
        return errors;
    }


    /**
     * Sets the errors value for this GetAccountResponse.
     * 
     * @param errors
     */
    public void setErrors(net.bcgi.si.messages.mvnoapi.common.ErrorData[] errors) {
        this.errors = errors;
    }


    /**
     * Gets the personalData value for this GetAccountResponse.
     * 
     * @return personalData
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.PersonalData getPersonalData() {
        return personalData;
    }


    /**
     * Sets the personalData value for this GetAccountResponse.
     * 
     * @param personalData
     */
    public void setPersonalData(net.bcgi.si.messages.mvnoapi.provisioning.PersonalData personalData) {
        this.personalData = personalData;
    }


    /**
     * Gets the servicePlan value for this GetAccountResponse.
     * 
     * @return servicePlan
     */
    public java.lang.String getServicePlan() {
        return servicePlan;
    }


    /**
     * Sets the servicePlan value for this GetAccountResponse.
     * 
     * @param servicePlan
     */
    public void setServicePlan(java.lang.String servicePlan) {
        this.servicePlan = servicePlan;
    }


    /**
     * Gets the sevicePlanfee value for this GetAccountResponse.
     * 
     * @return sevicePlanfee
     */
    public java.lang.Double getSevicePlanfee() {
        return sevicePlanfee;
    }


    /**
     * Sets the sevicePlanfee value for this GetAccountResponse.
     * 
     * @param sevicePlanfee
     */
    public void setSevicePlanfee(java.lang.Double sevicePlanfee) {
        this.sevicePlanfee = sevicePlanfee;
    }


    /**
     * Gets the statusCode value for this GetAccountResponse.
     * 
     * @return statusCode
     */
    public net.bcgi.si.messages.mvnoapi.common.StatusCode getStatusCode() {
        return statusCode;
    }


    /**
     * Sets the statusCode value for this GetAccountResponse.
     * 
     * @param statusCode
     */
    public void setStatusCode(net.bcgi.si.messages.mvnoapi.common.StatusCode statusCode) {
        this.statusCode = statusCode;
    }


    /**
     * Gets the subDetailsInfo value for this GetAccountResponse.
     * 
     * @return subDetailsInfo
     */
    public net.bcgi.si.messages.mvnoapi.subscriber.SubscriberDetailsInfo getSubDetailsInfo() {
        return subDetailsInfo;
    }


    /**
     * Sets the subDetailsInfo value for this GetAccountResponse.
     * 
     * @param subDetailsInfo
     */
    public void setSubDetailsInfo(net.bcgi.si.messages.mvnoapi.subscriber.SubscriberDetailsInfo subDetailsInfo) {
        this.subDetailsInfo = subDetailsInfo;
    }


    /**
     * Gets the timeStamp value for this GetAccountResponse.
     * 
     * @return timeStamp
     */
    public java.util.Calendar getTimeStamp() {
        return timeStamp;
    }


    /**
     * Sets the timeStamp value for this GetAccountResponse.
     * 
     * @param timeStamp
     */
    public void setTimeStamp(java.util.Calendar timeStamp) {
        this.timeStamp = timeStamp;
    }


    /**
     * Gets the userDefined value for this GetAccountResponse.
     * 
     * @return userDefined
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.UserDefinedInfo getUserDefined() {
        return userDefined;
    }


    /**
     * Sets the userDefined value for this GetAccountResponse.
     * 
     * @param userDefined
     */
    public void setUserDefined(net.bcgi.si.messages.mvnoapi.provisioning.UserDefinedInfo userDefined) {
        this.userDefined = userDefined;
    }


    /**
     * Gets the version value for this GetAccountResponse.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this GetAccountResponse.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the _any value for this GetAccountResponse.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this GetAccountResponse.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAccountResponse)) return false;
        GetAccountResponse other = (GetAccountResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MDN==null && other.getMDN()==null) || 
             (this.MDN!=null &&
              this.MDN.equals(other.getMDN()))) &&
            ((this.accountNumberMap==null && other.getAccountNumberMap()==null) || 
             (this.accountNumberMap!=null &&
              this.accountNumberMap.equals(other.getAccountNumberMap()))) &&
            ((this.accountStatus==null && other.getAccountStatus()==null) || 
             (this.accountStatus!=null &&
              this.accountStatus.equals(other.getAccountStatus()))) &&
            ((this.alternateAccountId==null && other.getAlternateAccountId()==null) || 
             (this.alternateAccountId!=null &&
              this.alternateAccountId.equals(other.getAlternateAccountId()))) &&
            ((this.balancedetails==null && other.getBalancedetails()==null) || 
             (this.balancedetails!=null &&
              this.balancedetails.equals(other.getBalancedetails()))) &&
            ((this.billingAddressData==null && other.getBillingAddressData()==null) || 
             (this.billingAddressData!=null &&
              this.billingAddressData.equals(other.getBillingAddressData()))) &&
            ((this.billingMethod==null && other.getBillingMethod()==null) || 
             (this.billingMethod!=null &&
              this.billingMethod.equals(other.getBillingMethod()))) &&
            ((this.correlationID==null && other.getCorrelationID()==null) || 
             (this.correlationID!=null &&
              this.correlationID.equals(other.getCorrelationID()))) &&
            ((this.deviceNetworkData==null && other.getDeviceNetworkData()==null) || 
             (this.deviceNetworkData!=null &&
              this.deviceNetworkData.equals(other.getDeviceNetworkData()))) &&
            ((this.errors==null && other.getErrors()==null) || 
             (this.errors!=null &&
              java.util.Arrays.equals(this.errors, other.getErrors()))) &&
            ((this.personalData==null && other.getPersonalData()==null) || 
             (this.personalData!=null &&
              this.personalData.equals(other.getPersonalData()))) &&
            ((this.servicePlan==null && other.getServicePlan()==null) || 
             (this.servicePlan!=null &&
              this.servicePlan.equals(other.getServicePlan()))) &&
            ((this.sevicePlanfee==null && other.getSevicePlanfee()==null) || 
             (this.sevicePlanfee!=null &&
              this.sevicePlanfee.equals(other.getSevicePlanfee()))) &&
            ((this.statusCode==null && other.getStatusCode()==null) || 
             (this.statusCode!=null &&
              this.statusCode.equals(other.getStatusCode()))) &&
            ((this.subDetailsInfo==null && other.getSubDetailsInfo()==null) || 
             (this.subDetailsInfo!=null &&
              this.subDetailsInfo.equals(other.getSubDetailsInfo()))) &&
            ((this.timeStamp==null && other.getTimeStamp()==null) || 
             (this.timeStamp!=null &&
              this.timeStamp.equals(other.getTimeStamp()))) &&
            ((this.userDefined==null && other.getUserDefined()==null) || 
             (this.userDefined!=null &&
              this.userDefined.equals(other.getUserDefined()))) &&
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
        if (getMDN() != null) {
            _hashCode += getMDN().hashCode();
        }
        if (getAccountNumberMap() != null) {
            _hashCode += getAccountNumberMap().hashCode();
        }
        if (getAccountStatus() != null) {
            _hashCode += getAccountStatus().hashCode();
        }
        if (getAlternateAccountId() != null) {
            _hashCode += getAlternateAccountId().hashCode();
        }
        if (getBalancedetails() != null) {
            _hashCode += getBalancedetails().hashCode();
        }
        if (getBillingAddressData() != null) {
            _hashCode += getBillingAddressData().hashCode();
        }
        if (getBillingMethod() != null) {
            _hashCode += getBillingMethod().hashCode();
        }
        if (getCorrelationID() != null) {
            _hashCode += getCorrelationID().hashCode();
        }
        if (getDeviceNetworkData() != null) {
            _hashCode += getDeviceNetworkData().hashCode();
        }
        if (getErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPersonalData() != null) {
            _hashCode += getPersonalData().hashCode();
        }
        if (getServicePlan() != null) {
            _hashCode += getServicePlan().hashCode();
        }
        if (getSevicePlanfee() != null) {
            _hashCode += getSevicePlanfee().hashCode();
        }
        if (getStatusCode() != null) {
            _hashCode += getStatusCode().hashCode();
        }
        if (getSubDetailsInfo() != null) {
            _hashCode += getSubDetailsInfo().hashCode();
        }
        if (getTimeStamp() != null) {
            _hashCode += getTimeStamp().hashCode();
        }
        if (getUserDefined() != null) {
            _hashCode += getUserDefined().hashCode();
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
        new org.apache.axis.description.TypeDesc(GetAccountResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "GetAccountResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "MDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumberMap");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "accountNumberMap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "AccountNumberMap"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "accountStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "AccountStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateAccountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "alternateAccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "AlternateAccountId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balancedetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "balancedetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "BalanceDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAddressData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "billingAddressData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "BillingAddressData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "billingMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "BillingMethodType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correlationID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "correlationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceNetworkData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "deviceNetworkData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "DeviceNetworkData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "errors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "ErrorData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "ErrorData"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "personalData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "PersonalData"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicePlan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "servicePlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sevicePlanfee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "sevicePlanfee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "statusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "StatusCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subDetailsInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "subDetailsInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "SubscriberDetailsInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeStamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "timeStamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefined");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "userDefined"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "UserDefinedInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
