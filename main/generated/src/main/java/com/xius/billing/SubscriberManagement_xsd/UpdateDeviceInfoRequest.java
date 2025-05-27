/**
 * UpdateDeviceInfoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class UpdateDeviceInfoRequest  implements java.io.Serializable {
    private com.xius.billing.SubscriberManagement_xsd.AccountType account;

    private java.lang.String cancelDate;

    private java.lang.String expiryDate;

    private java.lang.String passcode;

    private java.lang.String intialAllowed;

    private java.lang.String VRULanguage;

    private java.lang.String messageLevel;

    public UpdateDeviceInfoRequest() {
    }

    public UpdateDeviceInfoRequest(
           com.xius.billing.SubscriberManagement_xsd.AccountType account,
           java.lang.String cancelDate,
           java.lang.String expiryDate,
           java.lang.String passcode,
           java.lang.String intialAllowed,
           java.lang.String VRULanguage,
           java.lang.String messageLevel) {
           this.account = account;
           this.cancelDate = cancelDate;
           this.expiryDate = expiryDate;
           this.passcode = passcode;
           this.intialAllowed = intialAllowed;
           this.VRULanguage = VRULanguage;
           this.messageLevel = messageLevel;
    }


    /**
     * Gets the account value for this UpdateDeviceInfoRequest.
     * 
     * @return account
     */
    public com.xius.billing.SubscriberManagement_xsd.AccountType getAccount() {
        return account;
    }


    /**
     * Sets the account value for this UpdateDeviceInfoRequest.
     * 
     * @param account
     */
    public void setAccount(com.xius.billing.SubscriberManagement_xsd.AccountType account) {
        this.account = account;
    }


    /**
     * Gets the cancelDate value for this UpdateDeviceInfoRequest.
     * 
     * @return cancelDate
     */
    public java.lang.String getCancelDate() {
        return cancelDate;
    }


    /**
     * Sets the cancelDate value for this UpdateDeviceInfoRequest.
     * 
     * @param cancelDate
     */
    public void setCancelDate(java.lang.String cancelDate) {
        this.cancelDate = cancelDate;
    }


    /**
     * Gets the expiryDate value for this UpdateDeviceInfoRequest.
     * 
     * @return expiryDate
     */
    public java.lang.String getExpiryDate() {
        return expiryDate;
    }


    /**
     * Sets the expiryDate value for this UpdateDeviceInfoRequest.
     * 
     * @param expiryDate
     */
    public void setExpiryDate(java.lang.String expiryDate) {
        this.expiryDate = expiryDate;
    }


    /**
     * Gets the passcode value for this UpdateDeviceInfoRequest.
     * 
     * @return passcode
     */
    public java.lang.String getPasscode() {
        return passcode;
    }


    /**
     * Sets the passcode value for this UpdateDeviceInfoRequest.
     * 
     * @param passcode
     */
    public void setPasscode(java.lang.String passcode) {
        this.passcode = passcode;
    }


    /**
     * Gets the intialAllowed value for this UpdateDeviceInfoRequest.
     * 
     * @return intialAllowed
     */
    public java.lang.String getIntialAllowed() {
        return intialAllowed;
    }


    /**
     * Sets the intialAllowed value for this UpdateDeviceInfoRequest.
     * 
     * @param intialAllowed
     */
    public void setIntialAllowed(java.lang.String intialAllowed) {
        this.intialAllowed = intialAllowed;
    }


    /**
     * Gets the VRULanguage value for this UpdateDeviceInfoRequest.
     * 
     * @return VRULanguage
     */
    public java.lang.String getVRULanguage() {
        return VRULanguage;
    }


    /**
     * Sets the VRULanguage value for this UpdateDeviceInfoRequest.
     * 
     * @param VRULanguage
     */
    public void setVRULanguage(java.lang.String VRULanguage) {
        this.VRULanguage = VRULanguage;
    }


    /**
     * Gets the messageLevel value for this UpdateDeviceInfoRequest.
     * 
     * @return messageLevel
     */
    public java.lang.String getMessageLevel() {
        return messageLevel;
    }


    /**
     * Sets the messageLevel value for this UpdateDeviceInfoRequest.
     * 
     * @param messageLevel
     */
    public void setMessageLevel(java.lang.String messageLevel) {
        this.messageLevel = messageLevel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateDeviceInfoRequest)) return false;
        UpdateDeviceInfoRequest other = (UpdateDeviceInfoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.cancelDate==null && other.getCancelDate()==null) || 
             (this.cancelDate!=null &&
              this.cancelDate.equals(other.getCancelDate()))) &&
            ((this.expiryDate==null && other.getExpiryDate()==null) || 
             (this.expiryDate!=null &&
              this.expiryDate.equals(other.getExpiryDate()))) &&
            ((this.passcode==null && other.getPasscode()==null) || 
             (this.passcode!=null &&
              this.passcode.equals(other.getPasscode()))) &&
            ((this.intialAllowed==null && other.getIntialAllowed()==null) || 
             (this.intialAllowed!=null &&
              this.intialAllowed.equals(other.getIntialAllowed()))) &&
            ((this.VRULanguage==null && other.getVRULanguage()==null) || 
             (this.VRULanguage!=null &&
              this.VRULanguage.equals(other.getVRULanguage()))) &&
            ((this.messageLevel==null && other.getMessageLevel()==null) || 
             (this.messageLevel!=null &&
              this.messageLevel.equals(other.getMessageLevel())));
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
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getCancelDate() != null) {
            _hashCode += getCancelDate().hashCode();
        }
        if (getExpiryDate() != null) {
            _hashCode += getExpiryDate().hashCode();
        }
        if (getPasscode() != null) {
            _hashCode += getPasscode().hashCode();
        }
        if (getIntialAllowed() != null) {
            _hashCode += getIntialAllowed().hashCode();
        }
        if (getVRULanguage() != null) {
            _hashCode += getVRULanguage().hashCode();
        }
        if (getMessageLevel() != null) {
            _hashCode += getMessageLevel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateDeviceInfoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "UpdateDeviceInfoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "AccountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "cancelDate"));
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
        elemField.setFieldName("passcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "passcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intialAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "intialAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VRULanguage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "VRULanguage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "messageLevel"));
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
