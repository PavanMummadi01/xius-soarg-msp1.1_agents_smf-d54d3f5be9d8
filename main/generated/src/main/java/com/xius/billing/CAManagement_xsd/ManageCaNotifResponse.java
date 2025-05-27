/**
 * ManageCaNotifResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.CAManagement_xsd;

public class ManageCaNotifResponse  implements java.io.Serializable {
    private java.lang.String message;

    private com.xius.billing.CAManagement_xsd.CaNotifDtlsItem[] caNotifDtls;

    public ManageCaNotifResponse() {
    }

    public ManageCaNotifResponse(
           java.lang.String message,
           com.xius.billing.CAManagement_xsd.CaNotifDtlsItem[] caNotifDtls) {
           this.message = message;
           this.caNotifDtls = caNotifDtls;
    }


    /**
     * Gets the message value for this ManageCaNotifResponse.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this ManageCaNotifResponse.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the caNotifDtls value for this ManageCaNotifResponse.
     * 
     * @return caNotifDtls
     */
    public com.xius.billing.CAManagement_xsd.CaNotifDtlsItem[] getCaNotifDtls() {
        return caNotifDtls;
    }


    /**
     * Sets the caNotifDtls value for this ManageCaNotifResponse.
     * 
     * @param caNotifDtls
     */
    public void setCaNotifDtls(com.xius.billing.CAManagement_xsd.CaNotifDtlsItem[] caNotifDtls) {
        this.caNotifDtls = caNotifDtls;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManageCaNotifResponse)) return false;
        ManageCaNotifResponse other = (ManageCaNotifResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.caNotifDtls==null && other.getCaNotifDtls()==null) || 
             (this.caNotifDtls!=null &&
              java.util.Arrays.equals(this.caNotifDtls, other.getCaNotifDtls())));
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
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getCaNotifDtls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCaNotifDtls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCaNotifDtls(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManageCaNotifResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "ManageCaNotifResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caNotifDtls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "caNotifDtls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "caNotifDtlsItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "caNotifDtlsList"));
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
