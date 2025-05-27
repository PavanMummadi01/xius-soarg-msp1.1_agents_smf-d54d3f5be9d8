/**
 * DpiValidationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.TIAManagement_xsd;

public class DpiValidationRequest  implements java.io.Serializable {
    private java.lang.String dpiValue;

    private java.lang.String dpiType;

    public DpiValidationRequest() {
    }

    public DpiValidationRequest(
           java.lang.String dpiValue,
           java.lang.String dpiType) {
           this.dpiValue = dpiValue;
           this.dpiType = dpiType;
    }


    /**
     * Gets the dpiValue value for this DpiValidationRequest.
     * 
     * @return dpiValue
     */
    public java.lang.String getDpiValue() {
        return dpiValue;
    }


    /**
     * Sets the dpiValue value for this DpiValidationRequest.
     * 
     * @param dpiValue
     */
    public void setDpiValue(java.lang.String dpiValue) {
        this.dpiValue = dpiValue;
    }


    /**
     * Gets the dpiType value for this DpiValidationRequest.
     * 
     * @return dpiType
     */
    public java.lang.String getDpiType() {
        return dpiType;
    }


    /**
     * Sets the dpiType value for this DpiValidationRequest.
     * 
     * @param dpiType
     */
    public void setDpiType(java.lang.String dpiType) {
        this.dpiType = dpiType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DpiValidationRequest)) return false;
        DpiValidationRequest other = (DpiValidationRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dpiValue==null && other.getDpiValue()==null) || 
             (this.dpiValue!=null &&
              this.dpiValue.equals(other.getDpiValue()))) &&
            ((this.dpiType==null && other.getDpiType()==null) || 
             (this.dpiType!=null &&
              this.dpiType.equals(other.getDpiType())));
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
        if (getDpiValue() != null) {
            _hashCode += getDpiValue().hashCode();
        }
        if (getDpiType() != null) {
            _hashCode += getDpiType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DpiValidationRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "dpiValidationRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dpiValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "dpiValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dpiType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "dpiType"));
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
