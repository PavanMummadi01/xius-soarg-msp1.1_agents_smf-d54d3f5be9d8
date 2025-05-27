/**
 * UpdateActDataRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class UpdateActDataRequest  implements java.io.Serializable {
    private com.xius.billing.AccountManagement_xsd.AccountType account;

    private java.lang.String validityDate;

    private java.lang.String expiryDate;

    private java.lang.String gracePeriod1;

    private java.lang.String passCode;

    private java.lang.String VRULanguage;

    public UpdateActDataRequest() {
    }

    public UpdateActDataRequest(
           com.xius.billing.AccountManagement_xsd.AccountType account,
           java.lang.String validityDate,
           java.lang.String expiryDate,
           java.lang.String gracePeriod1,
           java.lang.String passCode,
           java.lang.String VRULanguage) {
           this.account = account;
           this.validityDate = validityDate;
           this.expiryDate = expiryDate;
           this.gracePeriod1 = gracePeriod1;
           this.passCode = passCode;
           this.VRULanguage = VRULanguage;
    }


    /**
     * Gets the account value for this UpdateActDataRequest.
     * 
     * @return account
     */
    public com.xius.billing.AccountManagement_xsd.AccountType getAccount() {
        return account;
    }


    /**
     * Sets the account value for this UpdateActDataRequest.
     * 
     * @param account
     */
    public void setAccount(com.xius.billing.AccountManagement_xsd.AccountType account) {
        this.account = account;
    }


    /**
     * Gets the validityDate value for this UpdateActDataRequest.
     * 
     * @return validityDate
     */
    public java.lang.String getValidityDate() {
        return validityDate;
    }


    /**
     * Sets the validityDate value for this UpdateActDataRequest.
     * 
     * @param validityDate
     */
    public void setValidityDate(java.lang.String validityDate) {
        this.validityDate = validityDate;
    }


    /**
     * Gets the expiryDate value for this UpdateActDataRequest.
     * 
     * @return expiryDate
     */
    public java.lang.String getExpiryDate() {
        return expiryDate;
    }


    /**
     * Sets the expiryDate value for this UpdateActDataRequest.
     * 
     * @param expiryDate
     */
    public void setExpiryDate(java.lang.String expiryDate) {
        this.expiryDate = expiryDate;
    }


    /**
     * Gets the gracePeriod1 value for this UpdateActDataRequest.
     * 
     * @return gracePeriod1
     */
    public java.lang.String getGracePeriod1() {
        return gracePeriod1;
    }


    /**
     * Sets the gracePeriod1 value for this UpdateActDataRequest.
     * 
     * @param gracePeriod1
     */
    public void setGracePeriod1(java.lang.String gracePeriod1) {
        this.gracePeriod1 = gracePeriod1;
    }


    /**
     * Gets the passCode value for this UpdateActDataRequest.
     * 
     * @return passCode
     */
    public java.lang.String getPassCode() {
        return passCode;
    }


    /**
     * Sets the passCode value for this UpdateActDataRequest.
     * 
     * @param passCode
     */
    public void setPassCode(java.lang.String passCode) {
        this.passCode = passCode;
    }


    /**
     * Gets the VRULanguage value for this UpdateActDataRequest.
     * 
     * @return VRULanguage
     */
    public java.lang.String getVRULanguage() {
        return VRULanguage;
    }


    /**
     * Sets the VRULanguage value for this UpdateActDataRequest.
     * 
     * @param VRULanguage
     */
    public void setVRULanguage(java.lang.String VRULanguage) {
        this.VRULanguage = VRULanguage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateActDataRequest)) return false;
        UpdateActDataRequest other = (UpdateActDataRequest) obj;
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
            ((this.validityDate==null && other.getValidityDate()==null) || 
             (this.validityDate!=null &&
              this.validityDate.equals(other.getValidityDate()))) &&
            ((this.expiryDate==null && other.getExpiryDate()==null) || 
             (this.expiryDate!=null &&
              this.expiryDate.equals(other.getExpiryDate()))) &&
            ((this.gracePeriod1==null && other.getGracePeriod1()==null) || 
             (this.gracePeriod1!=null &&
              this.gracePeriod1.equals(other.getGracePeriod1()))) &&
            ((this.passCode==null && other.getPassCode()==null) || 
             (this.passCode!=null &&
              this.passCode.equals(other.getPassCode()))) &&
            ((this.VRULanguage==null && other.getVRULanguage()==null) || 
             (this.VRULanguage!=null &&
              this.VRULanguage.equals(other.getVRULanguage())));
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
        if (getValidityDate() != null) {
            _hashCode += getValidityDate().hashCode();
        }
        if (getExpiryDate() != null) {
            _hashCode += getExpiryDate().hashCode();
        }
        if (getGracePeriod1() != null) {
            _hashCode += getGracePeriod1().hashCode();
        }
        if (getPassCode() != null) {
            _hashCode += getPassCode().hashCode();
        }
        if (getVRULanguage() != null) {
            _hashCode += getVRULanguage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateActDataRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "UpdateActDataRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "AccountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "validityDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "expiryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gracePeriod1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "gracePeriod1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "passCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VRULanguage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "VRULanguage"));
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
