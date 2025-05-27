/**
 * ChangeDeviceRequest.java
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
public class ChangeDeviceRequest  extends com.xius.xbus.messages.common.WSRequest  implements java.io.Serializable {
    private com.xius.xbus.messages.common.AccountType account;

    private com.xius.xbus.messages.provisioning.device.DeviceType deviceType;

    private java.lang.String oldValue;

    private java.lang.String newValue;

    private java.lang.Long charges;

    private java.lang.String newSerialNo;

    private java.lang.String zipCode;

    private java.lang.String provComp;

    private java.lang.String idValue;

    public ChangeDeviceRequest() {
    }

    public ChangeDeviceRequest(
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
           java.lang.String idValue) {
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
    }


    /**
     * Gets the account value for this ChangeDeviceRequest.
     * 
     * @return account
     */
    public com.xius.xbus.messages.common.AccountType getAccount() {
        return account;
    }


    /**
     * Sets the account value for this ChangeDeviceRequest.
     * 
     * @param account
     */
    public void setAccount(com.xius.xbus.messages.common.AccountType account) {
        this.account = account;
    }


    /**
     * Gets the deviceType value for this ChangeDeviceRequest.
     * 
     * @return deviceType
     */
    public com.xius.xbus.messages.provisioning.device.DeviceType getDeviceType() {
        return deviceType;
    }


    /**
     * Sets the deviceType value for this ChangeDeviceRequest.
     * 
     * @param deviceType
     */
    public void setDeviceType(com.xius.xbus.messages.provisioning.device.DeviceType deviceType) {
        this.deviceType = deviceType;
    }


    /**
     * Gets the oldValue value for this ChangeDeviceRequest.
     * 
     * @return oldValue
     */
    public java.lang.String getOldValue() {
        return oldValue;
    }


    /**
     * Sets the oldValue value for this ChangeDeviceRequest.
     * 
     * @param oldValue
     */
    public void setOldValue(java.lang.String oldValue) {
        this.oldValue = oldValue;
    }


    /**
     * Gets the newValue value for this ChangeDeviceRequest.
     * 
     * @return newValue
     */
    public java.lang.String getNewValue() {
        return newValue;
    }


    /**
     * Sets the newValue value for this ChangeDeviceRequest.
     * 
     * @param newValue
     */
    public void setNewValue(java.lang.String newValue) {
        this.newValue = newValue;
    }


    /**
     * Gets the charges value for this ChangeDeviceRequest.
     * 
     * @return charges
     */
    public java.lang.Long getCharges() {
        return charges;
    }


    /**
     * Sets the charges value for this ChangeDeviceRequest.
     * 
     * @param charges
     */
    public void setCharges(java.lang.Long charges) {
        this.charges = charges;
    }


    /**
     * Gets the newSerialNo value for this ChangeDeviceRequest.
     * 
     * @return newSerialNo
     */
    public java.lang.String getNewSerialNo() {
        return newSerialNo;
    }


    /**
     * Sets the newSerialNo value for this ChangeDeviceRequest.
     * 
     * @param newSerialNo
     */
    public void setNewSerialNo(java.lang.String newSerialNo) {
        this.newSerialNo = newSerialNo;
    }


    /**
     * Gets the zipCode value for this ChangeDeviceRequest.
     * 
     * @return zipCode
     */
    public java.lang.String getZipCode() {
        return zipCode;
    }


    /**
     * Sets the zipCode value for this ChangeDeviceRequest.
     * 
     * @param zipCode
     */
    public void setZipCode(java.lang.String zipCode) {
        this.zipCode = zipCode;
    }


    /**
     * Gets the provComp value for this ChangeDeviceRequest.
     * 
     * @return provComp
     */
    public java.lang.String getProvComp() {
        return provComp;
    }


    /**
     * Sets the provComp value for this ChangeDeviceRequest.
     * 
     * @param provComp
     */
    public void setProvComp(java.lang.String provComp) {
        this.provComp = provComp;
    }


    /**
     * Gets the idValue value for this ChangeDeviceRequest.
     * 
     * @return idValue
     */
    public java.lang.String getIdValue() {
        return idValue;
    }


    /**
     * Sets the idValue value for this ChangeDeviceRequest.
     * 
     * @param idValue
     */
    public void setIdValue(java.lang.String idValue) {
        this.idValue = idValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeDeviceRequest)) return false;
        ChangeDeviceRequest other = (ChangeDeviceRequest) obj;
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
              this.idValue.equals(other.getIdValue())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeDeviceRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", ">changeDeviceRequest"));
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
