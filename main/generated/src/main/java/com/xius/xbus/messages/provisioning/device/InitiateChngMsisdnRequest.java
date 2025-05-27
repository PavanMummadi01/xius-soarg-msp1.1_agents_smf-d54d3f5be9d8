/**
 * InitiateChngMsisdnRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.provisioning.device;

public class InitiateChngMsisdnRequest  extends com.xius.xbus.messages.common.WSRequest  implements java.io.Serializable {
    private com.xius.xbus.messages.common.AccountType account;

    private com.xius.xbus.messages.provisioning.device.DeviceType deviceType;

    private java.lang.String oldMSISDN;

    private java.lang.String oldsim;

    private java.lang.String oldimsi;

    private java.lang.String zipCode;

    private java.lang.String idValue;

    private java.lang.String NIR;

    public InitiateChngMsisdnRequest() {
    }

    public InitiateChngMsisdnRequest(
           com.xius.xbus.messages.common.UserType userType,
           java.lang.String messageID,
           com.xius.xbus.messages.common.SecurityId securityId,
           com.xius.xbus.messages.common.ServiceContext serviceContext,
           java.lang.String version,
           com.xius.xbus.messages.common.AccountType account,
           com.xius.xbus.messages.provisioning.device.DeviceType deviceType,
           java.lang.String oldMSISDN,
           java.lang.String oldsim,
           java.lang.String oldimsi,
           java.lang.String zipCode,
           java.lang.String idValue,
           java.lang.String NIR) {
        super(
            userType,
            messageID,
            securityId,
            serviceContext,
            version);
        this.account = account;
        this.deviceType = deviceType;
        this.oldMSISDN = oldMSISDN;
        this.oldsim = oldsim;
        this.oldimsi = oldimsi;
        this.zipCode = zipCode;
        this.idValue = idValue;
        this.NIR = NIR;
    }


    /**
     * Gets the account value for this InitiateChngMsisdnRequest.
     * 
     * @return account
     */
    public com.xius.xbus.messages.common.AccountType getAccount() {
        return account;
    }


    /**
     * Sets the account value for this InitiateChngMsisdnRequest.
     * 
     * @param account
     */
    public void setAccount(com.xius.xbus.messages.common.AccountType account) {
        this.account = account;
    }


    /**
     * Gets the deviceType value for this InitiateChngMsisdnRequest.
     * 
     * @return deviceType
     */
    public com.xius.xbus.messages.provisioning.device.DeviceType getDeviceType() {
        return deviceType;
    }


    /**
     * Sets the deviceType value for this InitiateChngMsisdnRequest.
     * 
     * @param deviceType
     */
    public void setDeviceType(com.xius.xbus.messages.provisioning.device.DeviceType deviceType) {
        this.deviceType = deviceType;
    }


    /**
     * Gets the oldMSISDN value for this InitiateChngMsisdnRequest.
     * 
     * @return oldMSISDN
     */
    public java.lang.String getOldMSISDN() {
        return oldMSISDN;
    }


    /**
     * Sets the oldMSISDN value for this InitiateChngMsisdnRequest.
     * 
     * @param oldMSISDN
     */
    public void setOldMSISDN(java.lang.String oldMSISDN) {
        this.oldMSISDN = oldMSISDN;
    }


    /**
     * Gets the oldsim value for this InitiateChngMsisdnRequest.
     * 
     * @return oldsim
     */
    public java.lang.String getOldsim() {
        return oldsim;
    }


    /**
     * Sets the oldsim value for this InitiateChngMsisdnRequest.
     * 
     * @param oldsim
     */
    public void setOldsim(java.lang.String oldsim) {
        this.oldsim = oldsim;
    }


    /**
     * Gets the oldimsi value for this InitiateChngMsisdnRequest.
     * 
     * @return oldimsi
     */
    public java.lang.String getOldimsi() {
        return oldimsi;
    }


    /**
     * Sets the oldimsi value for this InitiateChngMsisdnRequest.
     * 
     * @param oldimsi
     */
    public void setOldimsi(java.lang.String oldimsi) {
        this.oldimsi = oldimsi;
    }


    /**
     * Gets the zipCode value for this InitiateChngMsisdnRequest.
     * 
     * @return zipCode
     */
    public java.lang.String getZipCode() {
        return zipCode;
    }


    /**
     * Sets the zipCode value for this InitiateChngMsisdnRequest.
     * 
     * @param zipCode
     */
    public void setZipCode(java.lang.String zipCode) {
        this.zipCode = zipCode;
    }


    /**
     * Gets the idValue value for this InitiateChngMsisdnRequest.
     * 
     * @return idValue
     */
    public java.lang.String getIdValue() {
        return idValue;
    }


    /**
     * Sets the idValue value for this InitiateChngMsisdnRequest.
     * 
     * @param idValue
     */
    public void setIdValue(java.lang.String idValue) {
        this.idValue = idValue;
    }


    /**
     * Gets the NIR value for this InitiateChngMsisdnRequest.
     * 
     * @return NIR
     */
    public java.lang.String getNIR() {
        return NIR;
    }


    /**
     * Sets the NIR value for this InitiateChngMsisdnRequest.
     * 
     * @param NIR
     */
    public void setNIR(java.lang.String NIR) {
        this.NIR = NIR;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InitiateChngMsisdnRequest)) return false;
        InitiateChngMsisdnRequest other = (InitiateChngMsisdnRequest) obj;
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
            ((this.oldMSISDN==null && other.getOldMSISDN()==null) || 
             (this.oldMSISDN!=null &&
              this.oldMSISDN.equals(other.getOldMSISDN()))) &&
            ((this.oldsim==null && other.getOldsim()==null) || 
             (this.oldsim!=null &&
              this.oldsim.equals(other.getOldsim()))) &&
            ((this.oldimsi==null && other.getOldimsi()==null) || 
             (this.oldimsi!=null &&
              this.oldimsi.equals(other.getOldimsi()))) &&
            ((this.zipCode==null && other.getZipCode()==null) || 
             (this.zipCode!=null &&
              this.zipCode.equals(other.getZipCode()))) &&
            ((this.idValue==null && other.getIdValue()==null) || 
             (this.idValue!=null &&
              this.idValue.equals(other.getIdValue()))) &&
            ((this.NIR==null && other.getNIR()==null) || 
             (this.NIR!=null &&
              this.NIR.equals(other.getNIR())));
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
        if (getOldMSISDN() != null) {
            _hashCode += getOldMSISDN().hashCode();
        }
        if (getOldsim() != null) {
            _hashCode += getOldsim().hashCode();
        }
        if (getOldimsi() != null) {
            _hashCode += getOldimsi().hashCode();
        }
        if (getZipCode() != null) {
            _hashCode += getZipCode().hashCode();
        }
        if (getIdValue() != null) {
            _hashCode += getIdValue().hashCode();
        }
        if (getNIR() != null) {
            _hashCode += getNIR().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InitiateChngMsisdnRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", ">initiateChngMsisdnRequest"));
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
        elemField.setFieldName("oldMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "oldMSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldsim");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "oldsim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldimsi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "oldimsi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "zipCode"));
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
        elemField.setFieldName("NIR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "NIR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
