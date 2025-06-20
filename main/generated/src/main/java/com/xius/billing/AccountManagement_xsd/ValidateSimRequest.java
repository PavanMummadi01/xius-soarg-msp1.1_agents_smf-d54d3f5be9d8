/**
 * ValidateSimRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class ValidateSimRequest  implements java.io.Serializable {
    private java.lang.String[] SIMs;

    private java.lang.String idValues;

    public ValidateSimRequest() {
    }

    public ValidateSimRequest(
           java.lang.String[] SIMs,
           java.lang.String idValues) {
           this.SIMs = SIMs;
           this.idValues = idValues;
    }


    /**
     * Gets the SIMs value for this ValidateSimRequest.
     * 
     * @return SIMs
     */
    public java.lang.String[] getSIMs() {
        return SIMs;
    }


    /**
     * Sets the SIMs value for this ValidateSimRequest.
     * 
     * @param SIMs
     */
    public void setSIMs(java.lang.String[] SIMs) {
        this.SIMs = SIMs;
    }

    public java.lang.String getSIMs(int i) {
        return this.SIMs[i];
    }

    public void setSIMs(int i, java.lang.String _value) {
        this.SIMs[i] = _value;
    }


    /**
     * Gets the idValues value for this ValidateSimRequest.
     * 
     * @return idValues
     */
    public java.lang.String getIdValues() {
        return idValues;
    }


    /**
     * Sets the idValues value for this ValidateSimRequest.
     * 
     * @param idValues
     */
    public void setIdValues(java.lang.String idValues) {
        this.idValues = idValues;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValidateSimRequest)) return false;
        ValidateSimRequest other = (ValidateSimRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.SIMs==null && other.getSIMs()==null) || 
             (this.SIMs!=null &&
              java.util.Arrays.equals(this.SIMs, other.getSIMs()))) &&
            ((this.idValues==null && other.getIdValues()==null) || 
             (this.idValues!=null &&
              this.idValues.equals(other.getIdValues())));
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
        if (getSIMs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSIMs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSIMs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIdValues() != null) {
            _hashCode += getIdValues().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValidateSimRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "validateSimRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SIMs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SIMs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SIMType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idValues");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "idValues"));
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
