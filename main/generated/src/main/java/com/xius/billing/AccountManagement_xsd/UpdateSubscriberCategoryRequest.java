/**
 * UpdateSubscriberCategoryRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class UpdateSubscriberCategoryRequest  implements java.io.Serializable {
    private java.math.BigInteger networkId;

    private com.xius.billing.AccountManagement_xsd.AccountType accountType;

    private java.math.BigInteger categoryId;

    public UpdateSubscriberCategoryRequest() {
    }

    public UpdateSubscriberCategoryRequest(
           java.math.BigInteger networkId,
           com.xius.billing.AccountManagement_xsd.AccountType accountType,
           java.math.BigInteger categoryId) {
           this.networkId = networkId;
           this.accountType = accountType;
           this.categoryId = categoryId;
    }


    /**
     * Gets the networkId value for this UpdateSubscriberCategoryRequest.
     * 
     * @return networkId
     */
    public java.math.BigInteger getNetworkId() {
        return networkId;
    }


    /**
     * Sets the networkId value for this UpdateSubscriberCategoryRequest.
     * 
     * @param networkId
     */
    public void setNetworkId(java.math.BigInteger networkId) {
        this.networkId = networkId;
    }


    /**
     * Gets the accountType value for this UpdateSubscriberCategoryRequest.
     * 
     * @return accountType
     */
    public com.xius.billing.AccountManagement_xsd.AccountType getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this UpdateSubscriberCategoryRequest.
     * 
     * @param accountType
     */
    public void setAccountType(com.xius.billing.AccountManagement_xsd.AccountType accountType) {
        this.accountType = accountType;
    }


    /**
     * Gets the categoryId value for this UpdateSubscriberCategoryRequest.
     * 
     * @return categoryId
     */
    public java.math.BigInteger getCategoryId() {
        return categoryId;
    }


    /**
     * Sets the categoryId value for this UpdateSubscriberCategoryRequest.
     * 
     * @param categoryId
     */
    public void setCategoryId(java.math.BigInteger categoryId) {
        this.categoryId = categoryId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateSubscriberCategoryRequest)) return false;
        UpdateSubscriberCategoryRequest other = (UpdateSubscriberCategoryRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.networkId==null && other.getNetworkId()==null) || 
             (this.networkId!=null &&
              this.networkId.equals(other.getNetworkId()))) &&
            ((this.accountType==null && other.getAccountType()==null) || 
             (this.accountType!=null &&
              this.accountType.equals(other.getAccountType()))) &&
            ((this.categoryId==null && other.getCategoryId()==null) || 
             (this.categoryId!=null &&
              this.categoryId.equals(other.getCategoryId())));
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
        if (getNetworkId() != null) {
            _hashCode += getNetworkId().hashCode();
        }
        if (getAccountType() != null) {
            _hashCode += getAccountType().hashCode();
        }
        if (getCategoryId() != null) {
            _hashCode += getCategoryId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateSubscriberCategoryRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "updateSubscriberCategoryRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "networkId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "accountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "AccountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "categoryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
