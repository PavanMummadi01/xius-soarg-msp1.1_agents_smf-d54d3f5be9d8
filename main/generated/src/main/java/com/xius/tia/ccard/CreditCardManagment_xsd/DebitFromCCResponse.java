/**
 * DebitFromCCResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.ccard.CreditCardManagment_xsd;

public class DebitFromCCResponse  implements java.io.Serializable {
    private com.xius.tia.ccard.CreditCardManagment_xsd.ResultDataType result;

    public DebitFromCCResponse() {
    }

    public DebitFromCCResponse(
           com.xius.tia.ccard.CreditCardManagment_xsd.ResultDataType result) {
           this.result = result;
    }


    /**
     * Gets the result value for this DebitFromCCResponse.
     * 
     * @return result
     */
    public com.xius.tia.ccard.CreditCardManagment_xsd.ResultDataType getResult() {
        return result;
    }


    /**
     * Sets the result value for this DebitFromCCResponse.
     * 
     * @param result
     */
    public void setResult(com.xius.tia.ccard.CreditCardManagment_xsd.ResultDataType result) {
        this.result = result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DebitFromCCResponse)) return false;
        DebitFromCCResponse other = (DebitFromCCResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              this.result.equals(other.getResult())));
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
        if (getResult() != null) {
            _hashCode += getResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DebitFromCCResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "debitFromCCResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "ResultDataType"));
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
