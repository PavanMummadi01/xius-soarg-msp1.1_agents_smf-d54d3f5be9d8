/**
 * RetrieveVoucherRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.BalanceManagement_xsd;

public class RetrieveVoucherRequest  implements java.io.Serializable {
    private java.lang.Long vchrNumber;

    private java.lang.Long vchrPin;

    public RetrieveVoucherRequest() {
    }

    public RetrieveVoucherRequest(
           java.lang.Long vchrNumber,
           java.lang.Long vchrPin) {
           this.vchrNumber = vchrNumber;
           this.vchrPin = vchrPin;
    }


    /**
     * Gets the vchrNumber value for this RetrieveVoucherRequest.
     * 
     * @return vchrNumber
     */
    public java.lang.Long getVchrNumber() {
        return vchrNumber;
    }


    /**
     * Sets the vchrNumber value for this RetrieveVoucherRequest.
     * 
     * @param vchrNumber
     */
    public void setVchrNumber(java.lang.Long vchrNumber) {
        this.vchrNumber = vchrNumber;
    }


    /**
     * Gets the vchrPin value for this RetrieveVoucherRequest.
     * 
     * @return vchrPin
     */
    public java.lang.Long getVchrPin() {
        return vchrPin;
    }


    /**
     * Sets the vchrPin value for this RetrieveVoucherRequest.
     * 
     * @param vchrPin
     */
    public void setVchrPin(java.lang.Long vchrPin) {
        this.vchrPin = vchrPin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetrieveVoucherRequest)) return false;
        RetrieveVoucherRequest other = (RetrieveVoucherRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vchrNumber==null && other.getVchrNumber()==null) || 
             (this.vchrNumber!=null &&
              this.vchrNumber.equals(other.getVchrNumber()))) &&
            ((this.vchrPin==null && other.getVchrPin()==null) || 
             (this.vchrPin!=null &&
              this.vchrPin.equals(other.getVchrPin())));
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
        if (getVchrNumber() != null) {
            _hashCode += getVchrNumber().hashCode();
        }
        if (getVchrPin() != null) {
            _hashCode += getVchrPin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RetrieveVoucherRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "RetrieveVoucherRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vchrNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "vchrNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vchrPin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "vchrPin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
