/**
 * ValidateIDResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class ValidateIDResponse  implements java.io.Serializable {
    private java.lang.Boolean isValid;

    public ValidateIDResponse() {
    }

    public ValidateIDResponse(
           java.lang.Boolean isValid) {
           this.isValid = isValid;
    }


    /**
     * Gets the isValid value for this ValidateIDResponse.
     * 
     * @return isValid
     */
    public java.lang.Boolean getIsValid() {
        return isValid;
    }


    /**
     * Sets the isValid value for this ValidateIDResponse.
     * 
     * @param isValid
     */
    public void setIsValid(java.lang.Boolean isValid) {
        this.isValid = isValid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValidateIDResponse)) return false;
        ValidateIDResponse other = (ValidateIDResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.isValid==null && other.getIsValid()==null) || 
             (this.isValid!=null &&
              this.isValid.equals(other.getIsValid())));
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
        if (getIsValid() != null) {
            _hashCode += getIsValid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValidateIDResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ValidateIDResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isValid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "isValid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
