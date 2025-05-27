/**
 * PortInRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.provisioning;

public class PortInRequest  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private net.bcgi.si.messages.mvnoapi.provisioning.AccountId accountId;

    private java.lang.String authorization;

    private net.bcgi.si.messages.mvnoapi.device.DeviceIdKey deviceId;

    private net.bcgi.si.messages.mvnoapi.device.DeviceHardwareData hardwareData;

    private net.bcgi.si.messages.mvnoapi.device.DeviceLockData lockData;

    private java.lang.String mdn;

    private java.lang.String messageID;

    private net.bcgi.si.messages.mvnoapi.common.BillingAddressData newAddressData;

    private java.lang.String oldAccount;

    private net.bcgi.si.messages.mvnoapi.common.BillingAddressData oldAddressData;

    private net.bcgi.si.messages.mvnoapi.common.SecurityId securityId;

    private net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext;

    private java.lang.String socialSecurityNo;

    private java.lang.String taxId;

    private java.lang.String timeZone;

    private java.lang.String version;

    private org.apache.axis.message.MessageElement [] _any;

    public PortInRequest() {
    }

    public PortInRequest(
           net.bcgi.si.messages.mvnoapi.provisioning.AccountId accountId,
           java.lang.String authorization,
           net.bcgi.si.messages.mvnoapi.device.DeviceIdKey deviceId,
           net.bcgi.si.messages.mvnoapi.device.DeviceHardwareData hardwareData,
           net.bcgi.si.messages.mvnoapi.device.DeviceLockData lockData,
           java.lang.String mdn,
           java.lang.String messageID,
           net.bcgi.si.messages.mvnoapi.common.BillingAddressData newAddressData,
           java.lang.String oldAccount,
           net.bcgi.si.messages.mvnoapi.common.BillingAddressData oldAddressData,
           net.bcgi.si.messages.mvnoapi.common.SecurityId securityId,
           net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext,
           java.lang.String socialSecurityNo,
           java.lang.String taxId,
           java.lang.String timeZone,
           java.lang.String version,
           org.apache.axis.message.MessageElement [] _any) {
           this.accountId = accountId;
           this.authorization = authorization;
           this.deviceId = deviceId;
           this.hardwareData = hardwareData;
           this.lockData = lockData;
           this.mdn = mdn;
           this.messageID = messageID;
           this.newAddressData = newAddressData;
           this.oldAccount = oldAccount;
           this.oldAddressData = oldAddressData;
           this.securityId = securityId;
           this.serviceContext = serviceContext;
           this.socialSecurityNo = socialSecurityNo;
           this.taxId = taxId;
           this.timeZone = timeZone;
           this.version = version;
           this._any = _any;
    }


    /**
     * Gets the accountId value for this PortInRequest.
     * 
     * @return accountId
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.AccountId getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this PortInRequest.
     * 
     * @param accountId
     */
    public void setAccountId(net.bcgi.si.messages.mvnoapi.provisioning.AccountId accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the authorization value for this PortInRequest.
     * 
     * @return authorization
     */
    public java.lang.String getAuthorization() {
        return authorization;
    }


    /**
     * Sets the authorization value for this PortInRequest.
     * 
     * @param authorization
     */
    public void setAuthorization(java.lang.String authorization) {
        this.authorization = authorization;
    }


    /**
     * Gets the deviceId value for this PortInRequest.
     * 
     * @return deviceId
     */
    public net.bcgi.si.messages.mvnoapi.device.DeviceIdKey getDeviceId() {
        return deviceId;
    }


    /**
     * Sets the deviceId value for this PortInRequest.
     * 
     * @param deviceId
     */
    public void setDeviceId(net.bcgi.si.messages.mvnoapi.device.DeviceIdKey deviceId) {
        this.deviceId = deviceId;
    }


    /**
     * Gets the hardwareData value for this PortInRequest.
     * 
     * @return hardwareData
     */
    public net.bcgi.si.messages.mvnoapi.device.DeviceHardwareData getHardwareData() {
        return hardwareData;
    }


    /**
     * Sets the hardwareData value for this PortInRequest.
     * 
     * @param hardwareData
     */
    public void setHardwareData(net.bcgi.si.messages.mvnoapi.device.DeviceHardwareData hardwareData) {
        this.hardwareData = hardwareData;
    }


    /**
     * Gets the lockData value for this PortInRequest.
     * 
     * @return lockData
     */
    public net.bcgi.si.messages.mvnoapi.device.DeviceLockData getLockData() {
        return lockData;
    }


    /**
     * Sets the lockData value for this PortInRequest.
     * 
     * @param lockData
     */
    public void setLockData(net.bcgi.si.messages.mvnoapi.device.DeviceLockData lockData) {
        this.lockData = lockData;
    }


    /**
     * Gets the mdn value for this PortInRequest.
     * 
     * @return mdn
     */
    public java.lang.String getMdn() {
        return mdn;
    }


    /**
     * Sets the mdn value for this PortInRequest.
     * 
     * @param mdn
     */
    public void setMdn(java.lang.String mdn) {
        this.mdn = mdn;
    }


    /**
     * Gets the messageID value for this PortInRequest.
     * 
     * @return messageID
     */
    public java.lang.String getMessageID() {
        return messageID;
    }


    /**
     * Sets the messageID value for this PortInRequest.
     * 
     * @param messageID
     */
    public void setMessageID(java.lang.String messageID) {
        this.messageID = messageID;
    }


    /**
     * Gets the newAddressData value for this PortInRequest.
     * 
     * @return newAddressData
     */
    public net.bcgi.si.messages.mvnoapi.common.BillingAddressData getNewAddressData() {
        return newAddressData;
    }


    /**
     * Sets the newAddressData value for this PortInRequest.
     * 
     * @param newAddressData
     */
    public void setNewAddressData(net.bcgi.si.messages.mvnoapi.common.BillingAddressData newAddressData) {
        this.newAddressData = newAddressData;
    }


    /**
     * Gets the oldAccount value for this PortInRequest.
     * 
     * @return oldAccount
     */
    public java.lang.String getOldAccount() {
        return oldAccount;
    }


    /**
     * Sets the oldAccount value for this PortInRequest.
     * 
     * @param oldAccount
     */
    public void setOldAccount(java.lang.String oldAccount) {
        this.oldAccount = oldAccount;
    }


    /**
     * Gets the oldAddressData value for this PortInRequest.
     * 
     * @return oldAddressData
     */
    public net.bcgi.si.messages.mvnoapi.common.BillingAddressData getOldAddressData() {
        return oldAddressData;
    }


    /**
     * Sets the oldAddressData value for this PortInRequest.
     * 
     * @param oldAddressData
     */
    public void setOldAddressData(net.bcgi.si.messages.mvnoapi.common.BillingAddressData oldAddressData) {
        this.oldAddressData = oldAddressData;
    }


    /**
     * Gets the securityId value for this PortInRequest.
     * 
     * @return securityId
     */
    public net.bcgi.si.messages.mvnoapi.common.SecurityId getSecurityId() {
        return securityId;
    }


    /**
     * Sets the securityId value for this PortInRequest.
     * 
     * @param securityId
     */
    public void setSecurityId(net.bcgi.si.messages.mvnoapi.common.SecurityId securityId) {
        this.securityId = securityId;
    }


    /**
     * Gets the serviceContext value for this PortInRequest.
     * 
     * @return serviceContext
     */
    public net.bcgi.si.messages.mvnoapi.common.ServiceContext getServiceContext() {
        return serviceContext;
    }


    /**
     * Sets the serviceContext value for this PortInRequest.
     * 
     * @param serviceContext
     */
    public void setServiceContext(net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext) {
        this.serviceContext = serviceContext;
    }


    /**
     * Gets the socialSecurityNo value for this PortInRequest.
     * 
     * @return socialSecurityNo
     */
    public java.lang.String getSocialSecurityNo() {
        return socialSecurityNo;
    }


    /**
     * Sets the socialSecurityNo value for this PortInRequest.
     * 
     * @param socialSecurityNo
     */
    public void setSocialSecurityNo(java.lang.String socialSecurityNo) {
        this.socialSecurityNo = socialSecurityNo;
    }


    /**
     * Gets the taxId value for this PortInRequest.
     * 
     * @return taxId
     */
    public java.lang.String getTaxId() {
        return taxId;
    }


    /**
     * Sets the taxId value for this PortInRequest.
     * 
     * @param taxId
     */
    public void setTaxId(java.lang.String taxId) {
        this.taxId = taxId;
    }


    /**
     * Gets the timeZone value for this PortInRequest.
     * 
     * @return timeZone
     */
    public java.lang.String getTimeZone() {
        return timeZone;
    }


    /**
     * Sets the timeZone value for this PortInRequest.
     * 
     * @param timeZone
     */
    public void setTimeZone(java.lang.String timeZone) {
        this.timeZone = timeZone;
    }


    /**
     * Gets the version value for this PortInRequest.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this PortInRequest.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the _any value for this PortInRequest.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this PortInRequest.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PortInRequest)) return false;
        PortInRequest other = (PortInRequest) obj;
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
            ((this.deviceId==null && other.getDeviceId()==null) || 
             (this.deviceId!=null &&
              this.deviceId.equals(other.getDeviceId()))) &&
            ((this.hardwareData==null && other.getHardwareData()==null) || 
             (this.hardwareData!=null &&
              this.hardwareData.equals(other.getHardwareData()))) &&
            ((this.lockData==null && other.getLockData()==null) || 
             (this.lockData!=null &&
              this.lockData.equals(other.getLockData()))) &&
            ((this.mdn==null && other.getMdn()==null) || 
             (this.mdn!=null &&
              this.mdn.equals(other.getMdn()))) &&
            ((this.messageID==null && other.getMessageID()==null) || 
             (this.messageID!=null &&
              this.messageID.equals(other.getMessageID()))) &&
            ((this.newAddressData==null && other.getNewAddressData()==null) || 
             (this.newAddressData!=null &&
              this.newAddressData.equals(other.getNewAddressData()))) &&
            ((this.oldAccount==null && other.getOldAccount()==null) || 
             (this.oldAccount!=null &&
              this.oldAccount.equals(other.getOldAccount()))) &&
            ((this.oldAddressData==null && other.getOldAddressData()==null) || 
             (this.oldAddressData!=null &&
              this.oldAddressData.equals(other.getOldAddressData()))) &&
            ((this.securityId==null && other.getSecurityId()==null) || 
             (this.securityId!=null &&
              this.securityId.equals(other.getSecurityId()))) &&
            ((this.serviceContext==null && other.getServiceContext()==null) || 
             (this.serviceContext!=null &&
              this.serviceContext.equals(other.getServiceContext()))) &&
            ((this.socialSecurityNo==null && other.getSocialSecurityNo()==null) || 
             (this.socialSecurityNo!=null &&
              this.socialSecurityNo.equals(other.getSocialSecurityNo()))) &&
            ((this.taxId==null && other.getTaxId()==null) || 
             (this.taxId!=null &&
              this.taxId.equals(other.getTaxId()))) &&
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
        if (getDeviceId() != null) {
            _hashCode += getDeviceId().hashCode();
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
        if (getMessageID() != null) {
            _hashCode += getMessageID().hashCode();
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
        if (getSecurityId() != null) {
            _hashCode += getSecurityId().hashCode();
        }
        if (getServiceContext() != null) {
            _hashCode += getServiceContext().hashCode();
        }
        if (getSocialSecurityNo() != null) {
            _hashCode += getSocialSecurityNo().hashCode();
        }
        if (getTaxId() != null) {
            _hashCode += getTaxId().hashCode();
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
        new org.apache.axis.description.TypeDesc(PortInRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "PortInRequest"));
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
        elemField.setFieldName("deviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "deviceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "DeviceIdKey"));
        elemField.setNillable(false);
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
        elemField.setFieldName("messageID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "messageID"));
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
        elemField.setFieldName("socialSecurityNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "socialSecurityNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
