/**
 * ManageProvsngRetryRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class ManageProvsngRetryRequest  implements java.io.Serializable {
    private com.xius.billing.AccountManagement_xsd.ManageProvsngRetry manageProvsngRetryType;

    public ManageProvsngRetryRequest() {
    }

    public ManageProvsngRetryRequest(
           com.xius.billing.AccountManagement_xsd.ManageProvsngRetry manageProvsngRetryType) {
           this.manageProvsngRetryType = manageProvsngRetryType;
    }


    /**
     * Gets the manageProvsngRetryType value for this ManageProvsngRetryRequest.
     * 
     * @return manageProvsngRetryType
     */
    public com.xius.billing.AccountManagement_xsd.ManageProvsngRetry getManageProvsngRetryType() {
        return manageProvsngRetryType;
    }


    /**
     * Sets the manageProvsngRetryType value for this ManageProvsngRetryRequest.
     * 
     * @param manageProvsngRetryType
     */
    public void setManageProvsngRetryType(com.xius.billing.AccountManagement_xsd.ManageProvsngRetry manageProvsngRetryType) {
        this.manageProvsngRetryType = manageProvsngRetryType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManageProvsngRetryRequest)) return false;
        ManageProvsngRetryRequest other = (ManageProvsngRetryRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.manageProvsngRetryType==null && other.getManageProvsngRetryType()==null) || 
             (this.manageProvsngRetryType!=null &&
              this.manageProvsngRetryType.equals(other.getManageProvsngRetryType())));
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
        if (getManageProvsngRetryType() != null) {
            _hashCode += getManageProvsngRetryType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManageProvsngRetryRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ManageProvsngRetryRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manageProvsngRetryType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "manageProvsngRetryType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ManageProvsngRetry"));
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
