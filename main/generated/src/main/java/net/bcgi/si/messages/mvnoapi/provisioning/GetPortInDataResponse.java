/**
 * GetPortInDataResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.provisioning;

public class GetPortInDataResponse  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private net.bcgi.si.messages.mvnoapi.provisioning.AccountId accountId;

    private java.lang.String authorization;

    private java.lang.String correlationID;

    private net.bcgi.si.messages.mvnoapi.device.DeviceIdKey deviceId;

    private net.bcgi.si.messages.mvnoapi.common.ErrorData[] errors;

    private net.bcgi.si.messages.mvnoapi.device.DeviceHardwareData hardwareData;

    private net.bcgi.si.messages.mvnoapi.device.DeviceLockData lockData;

    private java.lang.String mdn;

    private net.bcgi.si.messages.mvnoapi.common.BillingAddressData newAddressData;

    private java.lang.String oldAccount;

    private net.bcgi.si.messages.mvnoapi.common.BillingAddressData oldAddressData;

    private java.lang.String socialSecurityNo;

    private net.bcgi.si.messages.mvnoapi.common.StatusCode statusCode;

    private java.lang.String taxId;

    private java.util.Calendar timeStamp;

    private java.lang.String timeZone;

    private java.lang.String version;

    private org.apache.axis.message.MessageElement [] _any;

    public GetPortInDataResponse() {
    }

    public GetPortInDataResponse(
           net.bcgi.si.messages.mvnoapi.provisioning.AccountId accountId,
           java.lang.String authorization,
           java.lang.String correlationID,
           net.bcgi.si.messages.mvnoapi.device.DeviceIdKey deviceId,
           net.bcgi.si.messages.mvnoapi.common.ErrorData[] errors,
           net.bcgi.si.messages.mvnoapi.device.DeviceHardwareData hardwareData,
           net.bcgi.si.messages.mvnoapi.device.DeviceLockData lockData,
           java.lang.String mdn,
           net.bcgi.si.messages.mvnoapi.common.BillingAddressData newAddressData,
           java.lang.String oldAccount,
           net.bcgi.si.messages.mvnoapi.common.BillingAddressData oldAddressData,
           java.lang.String socialSecurityNo,
           net.bcgi.si.messages.mvnoapi.common.StatusCode statusCode,
           java.lang.String taxId,
           java.util.Calendar timeStamp,
           java.lang.String timeZone,
           java.lang.String version,
           org.apache.axis.message.MessageElement [] _any) {
           this.accountId = accountId;
           this.authorization = authorization;
           this.correlationID = correlationID;
           this.deviceId = deviceId;
           this.errors = errors;
           this.hardwareData = hardwareData;
           this.lockData = lockData;
           this.mdn = mdn;
           this.newAddressData = newAddressData;
           this.oldAccount = oldAccount;
           this.oldAddressData = oldAddressData;
           this.socialSecurityNo = socialSecurityNo;
           this.statusCode = statusCode;
           this.taxId = taxId;
           this.timeStamp = timeStamp;
           this.timeZone = timeZone;
           this.version = version;
           this._any = _any;
    }


    /**
     * Gets the accountId value for this GetPortInDataResponse.
     * 
     * @return accountId
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.AccountId getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this GetPortInDataResponse.
     * 
     * @param accountId
     */
    public void setAccountId(net.bcgi.si.messages.mvnoapi.provisioning.AccountId accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the authorization value for this GetPortInDataResponse.
     * 
     * @return authorization
     */
    public java.lang.String getAuthorization() {
        return authorization;
    }


    /**
     * Sets the authorization value for this GetPortInDataResponse.
     * 
     * @param authorization
     */
    public void setAuthorization(java.lang.String authorization) {
        this.authorization = authorization;
    }


    /**
     * Gets the correlationID value for this GetPortInDataResponse.
     * 
     * @return correlationID
     */
    public java.lang.String getCorrelationID() {
        return correlationID;
    }


    /**
     * Sets the correlationID value for this GetPortInDataResponse.
     * 
     * @param correlationID
     */
    public void setCorrelationID(java.lang.String correlationID) {
        this.correlationID = correlationID;
    }


    /**
     * Gets the deviceId value for this GetPortInDataResponse.
     * 
     * @return deviceId
     */
    public net.bcgi.si.messages.mvnoapi.device.DeviceIdKey getDeviceId() {
        return deviceId;
    }


    /**
     * Sets the deviceId value for this GetPortInDataResponse.
     * 
     * @param deviceId
     */
    public void setDeviceId(net.bcgi.si.messages.mvnoapi.device.DeviceIdKey deviceId) {
        this.deviceId = deviceId;
    }


    /**
     * Gets the errors value for this GetPortInDataResponse.
     * 
     * @return errors
     */
    public net.bcgi.si.messages.mvnoapi.common.ErrorData[] getErrors() {
        return errors;
    }


    /**
     * Sets the errors value for this GetPortInDataResponse.
     * 
     * @param errors
     */
    public void setErrors(net.bcgi.si.messages.mvnoapi.common.ErrorData[] errors) {
        this.errors = errors;
    }


    /**
     * Gets the hardwareData value for this GetPortInDataResponse.
     * 
     * @return hardwareData
     */
    public net.bcgi.si.messages.mvnoapi.device.DeviceHardwareData getHardwareData() {
        return hardwareData;
    }


    /**
     * Sets the hardwareData value for this GetPortInDataResponse.
     * 
     * @param hardwareData
     */
    public void setHardwareData(net.bcgi.si.messages.mvnoapi.device.DeviceHardwareData hardwareData) {
        this.hardwareData = hardwareData;
    }


    /**
     * Gets the lockData value for this GetPortInDataResponse.
     * 
     * @return lockData
     */
    public net.bcgi.si.messages.mvnoapi.device.DeviceLockData getLockData() {
        return lockData;
    }


    /**
     * Sets the lockData value for this GetPortInDataResponse.
     * 
     * @param lockData
     */
    public void setLockData(net.bcgi.si.messages.mvnoapi.device.DeviceLockData lockData) {
        this.lockData = lockData;
    }


    /**
     * Gets the mdn value for this GetPortInDataResponse.
     * 
     * @return mdn
     */
    public java.lang.String getMdn() {
        return mdn;
    }


    /**
     * Sets the mdn value for this GetPortInDataResponse.
     * 
     * @param mdn
     */
    public void setMdn(java.lang.String mdn) {
        this.mdn = mdn;
    }


    /**
     * Gets the newAddressData value for this GetPortInDataResponse.
     * 
     * @return newAddressData
     */
    public net.bcgi.si.messages.mvnoapi.common.BillingAddressData getNewAddressData() {
        return newAddressData;
    }


    /**
     * Sets the newAddressData value for this GetPortInDataResponse.
     * 
     * @param newAddressData
     */
    public void setNewAddressData(net.bcgi.si.messages.mvnoapi.common.BillingAddressData newAddressData) {
        this.newAddressData = newAddressData;
    }


    /**
     * Gets the oldAccount value for this GetPortInDataResponse.
     * 
     * @return oldAccount
     */
    public java.lang.String getOldAccount() {
        return oldAccount;
    }


    /**
     * Sets the oldAccount value for this GetPortInDataResponse.
     * 
     * @param oldAccount
     */
    public void setOldAccount(java.lang.String oldAccount) {
        this.oldAccount = oldAccount;
    }


    /**
     * Gets the oldAddressData value for this GetPortInDataResponse.
     * 
     * @return oldAddressData
     */
    public net.bcgi.si.messages.mvnoapi.common.BillingAddressData getOldAddressData() {
        return oldAddressData;
    }


    /**
     * Sets the oldAddressData value for this GetPortInDataResponse.
     * 
     * @param oldAddressData
     */
    public void setOldAddressData(net.bcgi.si.messages.mvnoapi.common.BillingAddressData oldAddressData) {
        this.oldAddressData = oldAddressData;
    }


    /**
     * Gets the socialSecurityNo value for this GetPortInDataResponse.
     * 
     * @return socialSecurityNo
     */
    public java.lang.String getSocialSecurityNo() {
        return socialSecurityNo;
    }


    /**
     * Sets the socialSecurityNo value for this GetPortInDataResponse.
     * 
     * @param socialSecurityNo
     */
    public void setSocialSecurityNo(java.lang.String socialSecurityNo) {
        this.socialSecurityNo = socialSecurityNo;
    }


    /**
     * Gets the statusCode value for this GetPortInDataResponse.
     * 
     * @return statusCode
     */
    public net.bcgi.si.messages.mvnoapi.common.StatusCode getStatusCode() {
        return statusCode;
    }


    /**
     * Sets the statusCode value for this GetPortInDataResponse.
     * 
     * @param statusCode
     */
    public void setStatusCode(net.bcgi.si.messages.mvnoapi.common.StatusCode statusCode) {
        this.statusCode = statusCode;
    }


    /**
     * Gets the taxId value for this GetPortInDataResponse.
     * 
     * @return taxId
     */
    public java.lang.String getTaxId() {
        return taxId;
    }


    /**
     * Sets the taxId value for this GetPortInDataResponse.
     * 
     * @param taxId
     */
    public void setTaxId(java.lang.String taxId) {
        this.taxId = taxId;
    }


    /**
     * Gets the timeStamp value for this GetPortInDataResponse.
     * 
     * @return timeStamp
     */
    public java.util.Calendar getTimeStamp() {
        return timeStamp;
    }


    /**
     * Sets the timeStamp value for this GetPortInDataResponse.
     * 
     * @param timeStamp
     */
    public void setTimeStamp(java.util.Calendar timeStamp) {
        this.timeStamp = timeStamp;
    }


    /**
     * Gets the timeZone value for this GetPortInDataResponse.
     * 
     * @return timeZone
     */
    public java.lang.String getTimeZone() {
        return timeZone;
    }


    /**
     * Sets the timeZone value for this GetPortInDataResponse.
     * 
     * @param timeZone
     */
    public void setTimeZone(java.lang.String timeZone) {
        this.timeZone = timeZone;
    }


    /**
     * Gets the version value for this GetPortInDataResponse.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this GetPortInDataResponse.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the _any value for this GetPortInDataResponse.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this GetPortInDataResponse.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPortInDataResponse)) return false;
        GetPortInDataResponse other = (GetPortInDataResponse) obj;
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
            ((this.authorization==null && other.getAuthorization()==null) || 
             (this.authorization!=null &&
              this.authorization.equals(other.getAuthorization()))) &&
            ((this.correlationID==null && other.getCorrelationID()==null) || 
             (this.correlationID!=null &&
              this.correlationID.equals(other.getCorrelationID()))) &&
            ((this.deviceId==null && other.getDeviceId()==null) || 
             (this.deviceId!=null &&
              this.deviceId.equals(other.getDeviceId()))) &&
            ((this.errors==null && other.getErrors()==null) || 
             (this.errors!=null &&
              java.util.Arrays.equals(this.errors, other.getErrors()))) &&
            ((this.hardwareData==null && other.getHardwareData()==null) || 
             (this.hardwareData!=null &&
              this.hardwareData.equals(other.getHardwareData()))) &&
            ((this.lockData==null && other.getLockData()==null) || 
             (this.lockData!=null &&
              this.lockData.equals(other.getLockData()))) &&
            ((this.mdn==null && other.getMdn()==null) || 
             (this.mdn!=null &&
              this.mdn.equals(other.getMdn()))) &&
            ((this.newAddressData==null && other.getNewAddressData()==null) || 
             (this.newAddressData!=null &&
              this.newAddressData.equals(other.getNewAddressData()))) &&
            ((this.oldAccount==null && other.getOldAccount()==null) || 
             (this.oldAccount!=null &&
              this.oldAccount.equals(other.getOldAccount()))) &&
            ((this.oldAddressData==null && other.getOldAddressData()==null) || 
             (this.oldAddressData!=null &&
              this.oldAddressData.equals(other.getOldAddressData()))) &&
            ((this.socialSecurityNo==null && other.getSocialSecurityNo()==null) || 
             (this.socialSecurityNo!=null &&
              this.socialSecurityNo.equals(other.getSocialSecurityNo()))) &&
            ((this.statusCode==null && other.getStatusCode()==null) || 
             (this.statusCode!=null &&
              this.statusCode.equals(other.getStatusCode()))) &&
            ((this.taxId==null && other.getTaxId()==null) || 
             (this.taxId!=null &&
              this.taxId.equals(other.getTaxId()))) &&
            ((this.timeStamp==null && other.getTimeStamp()==null) || 
             (this.timeStamp!=null &&
              this.timeStamp.equals(other.getTimeStamp()))) &&
            ((this.timeZone==null && other.getTimeZone()==null) || 
             (this.timeZone!=null &&
              this.timeZone.equals(other.getTimeZone()))) &&
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
        if (getAuthorization() != null) {
            _hashCode += getAuthorization().hashCode();
        }
        if (getCorrelationID() != null) {
            _hashCode += getCorrelationID().hashCode();
        }
        if (getDeviceId() != null) {
            _hashCode += getDeviceId().hashCode();
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
        if (getHardwareData() != null) {
            _hashCode += getHardwareData().hashCode();
        }
        if (getLockData() != null) {
            _hashCode += getLockData().hashCode();
        }
        if (getMdn() != null) {
            _hashCode += getMdn().hashCode();
        }
        if (getNewAddressData() != null) {
            _hashCode += getNewAddressData().hashCode();
        }
        if (getOldAccount() != null) {
            _hashCode += getOldAccount().hashCode();
        }
        if (getOldAddressData() != null) {
            _hashCode += getOldAddressData().hashCode();
        }
        if (getSocialSecurityNo() != null) {
            _hashCode += getSocialSecurityNo().hashCode();
        }
        if (getStatusCode() != null) {
            _hashCode += getStatusCode().hashCode();
        }
        if (getTaxId() != null) {
            _hashCode += getTaxId().hashCode();
        }
        if (getTimeStamp() != null) {
            _hashCode += getTimeStamp().hashCode();
        }
        if (getTimeZone() != null) {
            _hashCode += getTimeZone().hashCode();
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
        new org.apache.axis.description.TypeDesc(GetPortInDataResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "GetPortInDataResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "accountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "AccountId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorization");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "authorization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correlationID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "correlationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "deviceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "DeviceIdKey"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "errors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "ErrorData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "ErrorData"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hardwareData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "hardwareData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "DeviceHardwareData"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "lockData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "DeviceLockData"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "mdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newAddressData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "newAddressData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "BillingAddressData"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "oldAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldAddressData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "oldAddressData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "BillingAddressData"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("socialSecurityNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "socialSecurityNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "statusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "StatusCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "taxId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeStamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "timeStamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "timeZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "version"));
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
