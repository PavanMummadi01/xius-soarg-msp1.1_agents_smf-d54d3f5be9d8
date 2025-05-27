/**
 * UpdateDeviceAllRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.device;

public class UpdateDeviceAllRequest  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private net.bcgi.si.messages.mvnoapi.provisioning.AccountId accountId;

    private java.lang.String carrierSpecificTimeZone;

    private net.bcgi.si.messages.mvnoapi.common.BillingAddressData deviceAddress;

    private java.lang.String equipmentManufacturer;

    private java.lang.String equipmentModel;

    private java.lang.String messageID;

    private net.bcgi.si.messages.mvnoapi.common.SecurityId securityId;

    private net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext;

    private java.lang.Integer unlockCode;

    private net.bcgi.si.messages.mvnoapi.device.PrepaidAccountDetails updatePrepaidAccount;

    private java.lang.String version;

    private org.apache.axis.message.MessageElement [] _any;

    public UpdateDeviceAllRequest() {
    }

    public UpdateDeviceAllRequest(
           net.bcgi.si.messages.mvnoapi.provisioning.AccountId accountId,
           java.lang.String carrierSpecificTimeZone,
           net.bcgi.si.messages.mvnoapi.common.BillingAddressData deviceAddress,
           java.lang.String equipmentManufacturer,
           java.lang.String equipmentModel,
           java.lang.String messageID,
           net.bcgi.si.messages.mvnoapi.common.SecurityId securityId,
           net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext,
           java.lang.Integer unlockCode,
           net.bcgi.si.messages.mvnoapi.device.PrepaidAccountDetails updatePrepaidAccount,
           java.lang.String version,
           org.apache.axis.message.MessageElement [] _any) {
           this.accountId = accountId;
           this.carrierSpecificTimeZone = carrierSpecificTimeZone;
           this.deviceAddress = deviceAddress;
           this.equipmentManufacturer = equipmentManufacturer;
           this.equipmentModel = equipmentModel;
           this.messageID = messageID;
           this.securityId = securityId;
           this.serviceContext = serviceContext;
           this.unlockCode = unlockCode;
           this.updatePrepaidAccount = updatePrepaidAccount;
           this.version = version;
           this._any = _any;
    }


    /**
     * Gets the accountId value for this UpdateDeviceAllRequest.
     * 
     * @return accountId
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.AccountId getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this UpdateDeviceAllRequest.
     * 
     * @param accountId
     */
    public void setAccountId(net.bcgi.si.messages.mvnoapi.provisioning.AccountId accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the carrierSpecificTimeZone value for this UpdateDeviceAllRequest.
     * 
     * @return carrierSpecificTimeZone
     */
    public java.lang.String getCarrierSpecificTimeZone() {
        return carrierSpecificTimeZone;
    }


    /**
     * Sets the carrierSpecificTimeZone value for this UpdateDeviceAllRequest.
     * 
     * @param carrierSpecificTimeZone
     */
    public void setCarrierSpecificTimeZone(java.lang.String carrierSpecificTimeZone) {
        this.carrierSpecificTimeZone = carrierSpecificTimeZone;
    }


    /**
     * Gets the deviceAddress value for this UpdateDeviceAllRequest.
     * 
     * @return deviceAddress
     */
    public net.bcgi.si.messages.mvnoapi.common.BillingAddressData getDeviceAddress() {
        return deviceAddress;
    }


    /**
     * Sets the deviceAddress value for this UpdateDeviceAllRequest.
     * 
     * @param deviceAddress
     */
    public void setDeviceAddress(net.bcgi.si.messages.mvnoapi.common.BillingAddressData deviceAddress) {
        this.deviceAddress = deviceAddress;
    }


    /**
     * Gets the equipmentManufacturer value for this UpdateDeviceAllRequest.
     * 
     * @return equipmentManufacturer
     */
    public java.lang.String getEquipmentManufacturer() {
        return equipmentManufacturer;
    }


    /**
     * Sets the equipmentManufacturer value for this UpdateDeviceAllRequest.
     * 
     * @param equipmentManufacturer
     */
    public void setEquipmentManufacturer(java.lang.String equipmentManufacturer) {
        this.equipmentManufacturer = equipmentManufacturer;
    }


    /**
     * Gets the equipmentModel value for this UpdateDeviceAllRequest.
     * 
     * @return equipmentModel
     */
    public java.lang.String getEquipmentModel() {
        return equipmentModel;
    }


    /**
     * Sets the equipmentModel value for this UpdateDeviceAllRequest.
     * 
     * @param equipmentModel
     */
    public void setEquipmentModel(java.lang.String equipmentModel) {
        this.equipmentModel = equipmentModel;
    }


    /**
     * Gets the messageID value for this UpdateDeviceAllRequest.
     * 
     * @return messageID
     */
    public java.lang.String getMessageID() {
        return messageID;
    }


    /**
     * Sets the messageID value for this UpdateDeviceAllRequest.
     * 
     * @param messageID
     */
    public void setMessageID(java.lang.String messageID) {
        this.messageID = messageID;
    }


    /**
     * Gets the securityId value for this UpdateDeviceAllRequest.
     * 
     * @return securityId
     */
    public net.bcgi.si.messages.mvnoapi.common.SecurityId getSecurityId() {
        return securityId;
    }


    /**
     * Sets the securityId value for this UpdateDeviceAllRequest.
     * 
     * @param securityId
     */
    public void setSecurityId(net.bcgi.si.messages.mvnoapi.common.SecurityId securityId) {
        this.securityId = securityId;
    }


    /**
     * Gets the serviceContext value for this UpdateDeviceAllRequest.
     * 
     * @return serviceContext
     */
    public net.bcgi.si.messages.mvnoapi.common.ServiceContext getServiceContext() {
        return serviceContext;
    }


    /**
     * Sets the serviceContext value for this UpdateDeviceAllRequest.
     * 
     * @param serviceContext
     */
    public void setServiceContext(net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext) {
        this.serviceContext = serviceContext;
    }


    /**
     * Gets the unlockCode value for this UpdateDeviceAllRequest.
     * 
     * @return unlockCode
     */
    public java.lang.Integer getUnlockCode() {
        return unlockCode;
    }


    /**
     * Sets the unlockCode value for this UpdateDeviceAllRequest.
     * 
     * @param unlockCode
     */
    public void setUnlockCode(java.lang.Integer unlockCode) {
        this.unlockCode = unlockCode;
    }


    /**
     * Gets the updatePrepaidAccount value for this UpdateDeviceAllRequest.
     * 
     * @return updatePrepaidAccount
     */
    public net.bcgi.si.messages.mvnoapi.device.PrepaidAccountDetails getUpdatePrepaidAccount() {
        return updatePrepaidAccount;
    }


    /**
     * Sets the updatePrepaidAccount value for this UpdateDeviceAllRequest.
     * 
     * @param updatePrepaidAccount
     */
    public void setUpdatePrepaidAccount(net.bcgi.si.messages.mvnoapi.device.PrepaidAccountDetails updatePrepaidAccount) {
        this.updatePrepaidAccount = updatePrepaidAccount;
    }


    /**
     * Gets the version value for this UpdateDeviceAllRequest.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this UpdateDeviceAllRequest.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the _any value for this UpdateDeviceAllRequest.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this UpdateDeviceAllRequest.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateDeviceAllRequest)) return false;
        UpdateDeviceAllRequest other = (UpdateDeviceAllRequest) obj;
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
            ((this.carrierSpecificTimeZone==null && other.getCarrierSpecificTimeZone()==null) || 
             (this.carrierSpecificTimeZone!=null &&
              this.carrierSpecificTimeZone.equals(other.getCarrierSpecificTimeZone()))) &&
            ((this.deviceAddress==null && other.getDeviceAddress()==null) || 
             (this.deviceAddress!=null &&
              this.deviceAddress.equals(other.getDeviceAddress()))) &&
            ((this.equipmentManufacturer==null && other.getEquipmentManufacturer()==null) || 
             (this.equipmentManufacturer!=null &&
              this.equipmentManufacturer.equals(other.getEquipmentManufacturer()))) &&
            ((this.equipmentModel==null && other.getEquipmentModel()==null) || 
             (this.equipmentModel!=null &&
              this.equipmentModel.equals(other.getEquipmentModel()))) &&
            ((this.messageID==null && other.getMessageID()==null) || 
             (this.messageID!=null &&
              this.messageID.equals(other.getMessageID()))) &&
            ((this.securityId==null && other.getSecurityId()==null) || 
             (this.securityId!=null &&
              this.securityId.equals(other.getSecurityId()))) &&
            ((this.serviceContext==null && other.getServiceContext()==null) || 
             (this.serviceContext!=null &&
              this.serviceContext.equals(other.getServiceContext()))) &&
            ((this.unlockCode==null && other.getUnlockCode()==null) || 
             (this.unlockCode!=null &&
              this.unlockCode.equals(other.getUnlockCode()))) &&
            ((this.updatePrepaidAccount==null && other.getUpdatePrepaidAccount()==null) || 
             (this.updatePrepaidAccount!=null &&
              this.updatePrepaidAccount.equals(other.getUpdatePrepaidAccount()))) &&
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
        if (getCarrierSpecificTimeZone() != null) {
            _hashCode += getCarrierSpecificTimeZone().hashCode();
        }
        if (getDeviceAddress() != null) {
            _hashCode += getDeviceAddress().hashCode();
        }
        if (getEquipmentManufacturer() != null) {
            _hashCode += getEquipmentManufacturer().hashCode();
        }
        if (getEquipmentModel() != null) {
            _hashCode += getEquipmentModel().hashCode();
        }
        if (getMessageID() != null) {
            _hashCode += getMessageID().hashCode();
        }
        if (getSecurityId() != null) {
            _hashCode += getSecurityId().hashCode();
        }
        if (getServiceContext() != null) {
            _hashCode += getServiceContext().hashCode();
        }
        if (getUnlockCode() != null) {
            _hashCode += getUnlockCode().hashCode();
        }
        if (getUpdatePrepaidAccount() != null) {
            _hashCode += getUpdatePrepaidAccount().hashCode();
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
        new org.apache.axis.description.TypeDesc(UpdateDeviceAllRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "UpdateDeviceAllRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "accountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "AccountId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierSpecificTimeZone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "carrierSpecificTimeZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "deviceAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "BillingAddressData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("equipmentManufacturer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "equipmentManufacturer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("equipmentModel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "equipmentModel"));
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
        elemField.setFieldName("unlockCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "unlockCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updatePrepaidAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "updatePrepaidAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "PrepaidAccountDetails"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "version"));
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
