/**
 * RechargeInquiryRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.BalanceManagement_xsd;

public class RechargeInquiryRequest  implements java.io.Serializable {
    private java.lang.String orgtransRefNumber;

    private java.lang.String transRefNumber;

    public RechargeInquiryRequest() {
    }

    public RechargeInquiryRequest(
           java.lang.String orgtransRefNumber,
           java.lang.String transRefNumber) {
           this.orgtransRefNumber = orgtransRefNumber;
           this.transRefNumber = transRefNumber;
    }


    /**
     * Gets the orgtransRefNumber value for this RechargeInquiryRequest.
     * 
     * @return orgtransRefNumber
     */
    public java.lang.String getOrgtransRefNumber() {
        return orgtransRefNumber;
    }


    /**
     * Sets the orgtransRefNumber value for this RechargeInquiryRequest.
     * 
     * @param orgtransRefNumber
     */
    public void setOrgtransRefNumber(java.lang.String orgtransRefNumber) {
        this.orgtransRefNumber = orgtransRefNumber;
    }


    /**
     * Gets the transRefNumber value for this RechargeInquiryRequest.
     * 
     * @return transRefNumber
     */
    public java.lang.String getTransRefNumber() {
        return transRefNumber;
    }


    /**
     * Sets the transRefNumber value for this RechargeInquiryRequest.
     * 
     * @param transRefNumber
     */
    public void setTransRefNumber(java.lang.String transRefNumber) {
        this.transRefNumber = transRefNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RechargeInquiryRequest)) return false;
        RechargeInquiryRequest other = (RechargeInquiryRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.orgtransRefNumber==null && other.getOrgtransRefNumber()==null) || 
             (this.orgtransRefNumber!=null &&
              this.orgtransRefNumber.equals(other.getOrgtransRefNumber()))) &&
            ((this.transRefNumber==null && other.getTransRefNumber()==null) || 
             (this.transRefNumber!=null &&
              this.transRefNumber.equals(other.getTransRefNumber())));
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
        if (getOrgtransRefNumber() != null) {
            _hashCode += getOrgtransRefNumber().hashCode();
        }
        if (getTransRefNumber() != null) {
            _hashCode += getTransRefNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RechargeInquiryRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", ">rechargeInquiryRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgtransRefNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "OrgtransRefNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transRefNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "transRefNumber"));
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
