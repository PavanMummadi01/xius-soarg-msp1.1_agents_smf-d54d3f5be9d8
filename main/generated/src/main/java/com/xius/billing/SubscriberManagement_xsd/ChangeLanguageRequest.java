/**
 * ChangeLanguageRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class ChangeLanguageRequest  implements java.io.Serializable {
    private com.xius.billing.SubscriberManagement_xsd.AccountType account;

    private java.lang.String newLanguage;

    private java.lang.String IVR;

    public ChangeLanguageRequest() {
    }

    public ChangeLanguageRequest(
           com.xius.billing.SubscriberManagement_xsd.AccountType account,
           java.lang.String newLanguage,
           java.lang.String IVR) {
           this.account = account;
           this.newLanguage = newLanguage;
           this.IVR = IVR;
    }


    /**
     * Gets the account value for this ChangeLanguageRequest.
     * 
     * @return account
     */
    public com.xius.billing.SubscriberManagement_xsd.AccountType getAccount() {
        return account;
    }


    /**
     * Sets the account value for this ChangeLanguageRequest.
     * 
     * @param account
     */
    public void setAccount(com.xius.billing.SubscriberManagement_xsd.AccountType account) {
        this.account = account;
    }


    /**
     * Gets the newLanguage value for this ChangeLanguageRequest.
     * 
     * @return newLanguage
     */
    public java.lang.String getNewLanguage() {
        return newLanguage;
    }


    /**
     * Sets the newLanguage value for this ChangeLanguageRequest.
     * 
     * @param newLanguage
     */
    public void setNewLanguage(java.lang.String newLanguage) {
        this.newLanguage = newLanguage;
    }


    /**
     * Gets the IVR value for this ChangeLanguageRequest.
     * 
     * @return IVR
     */
    public java.lang.String getIVR() {
        return IVR;
    }


    /**
     * Sets the IVR value for this ChangeLanguageRequest.
     * 
     * @param IVR
     */
    public void setIVR(java.lang.String IVR) {
        this.IVR = IVR;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeLanguageRequest)) return false;
        ChangeLanguageRequest other = (ChangeLanguageRequest) obj;
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
            ((this.newLanguage==null && other.getNewLanguage()==null) || 
             (this.newLanguage!=null &&
              this.newLanguage.equals(other.getNewLanguage()))) &&
            ((this.IVR==null && other.getIVR()==null) || 
             (this.IVR!=null &&
              this.IVR.equals(other.getIVR())));
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
        if (getNewLanguage() != null) {
            _hashCode += getNewLanguage().hashCode();
        }
        if (getIVR() != null) {
            _hashCode += getIVR().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeLanguageRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ChangeLanguageRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "AccountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newLanguage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "newLanguage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IVR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "IVR"));
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
