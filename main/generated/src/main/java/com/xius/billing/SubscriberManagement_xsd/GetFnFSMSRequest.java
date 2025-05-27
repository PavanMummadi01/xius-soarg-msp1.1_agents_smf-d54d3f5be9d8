/**
 * GetFnFSMSRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class GetFnFSMSRequest  implements java.io.Serializable {
    private com.xius.billing.SubscriberManagement_xsd.AccountType account;

    private com.xius.billing.SubscriberManagement_xsd.ProvisionType provision;

    public GetFnFSMSRequest() {
    }

    public GetFnFSMSRequest(
           com.xius.billing.SubscriberManagement_xsd.AccountType account,
           com.xius.billing.SubscriberManagement_xsd.ProvisionType provision) {
           this.account = account;
           this.provision = provision;
    }


    /**
     * Gets the account value for this GetFnFSMSRequest.
     * 
     * @return account
     */
    public com.xius.billing.SubscriberManagement_xsd.AccountType getAccount() {
        return account;
    }


    /**
     * Sets the account value for this GetFnFSMSRequest.
     * 
     * @param account
     */
    public void setAccount(com.xius.billing.SubscriberManagement_xsd.AccountType account) {
        this.account = account;
    }


    /**
     * Gets the provision value for this GetFnFSMSRequest.
     * 
     * @return provision
     */
    public com.xius.billing.SubscriberManagement_xsd.ProvisionType getProvision() {
        return provision;
    }


    /**
     * Sets the provision value for this GetFnFSMSRequest.
     * 
     * @param provision
     */
    public void setProvision(com.xius.billing.SubscriberManagement_xsd.ProvisionType provision) {
        this.provision = provision;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetFnFSMSRequest)) return false;
        GetFnFSMSRequest other = (GetFnFSMSRequest) obj;
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
            ((this.provision==null && other.getProvision()==null) || 
             (this.provision!=null &&
              this.provision.equals(other.getProvision())));
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
        if (getProvision() != null) {
            _hashCode += getProvision().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetFnFSMSRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetFnFSMSRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "AccountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provision");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "Provision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ProvisionType"));
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
