/**
 * GetMulBndlNameDetailsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class GetMulBndlNameDetailsResponse  implements java.io.Serializable {
    private com.xius.billing.SubscriberManagement_xsd.BundleNameDtlsType[] bundleNameDtls;

    private java.lang.String message;

    private java.lang.String totalCharge;

    public GetMulBndlNameDetailsResponse() {
    }

    public GetMulBndlNameDetailsResponse(
           com.xius.billing.SubscriberManagement_xsd.BundleNameDtlsType[] bundleNameDtls,
           java.lang.String message,
           java.lang.String totalCharge) {
           this.bundleNameDtls = bundleNameDtls;
           this.message = message;
           this.totalCharge = totalCharge;
    }


    /**
     * Gets the bundleNameDtls value for this GetMulBndlNameDetailsResponse.
     * 
     * @return bundleNameDtls
     */
    public com.xius.billing.SubscriberManagement_xsd.BundleNameDtlsType[] getBundleNameDtls() {
        return bundleNameDtls;
    }


    /**
     * Sets the bundleNameDtls value for this GetMulBndlNameDetailsResponse.
     * 
     * @param bundleNameDtls
     */
    public void setBundleNameDtls(com.xius.billing.SubscriberManagement_xsd.BundleNameDtlsType[] bundleNameDtls) {
        this.bundleNameDtls = bundleNameDtls;
    }

    public com.xius.billing.SubscriberManagement_xsd.BundleNameDtlsType getBundleNameDtls(int i) {
        return this.bundleNameDtls[i];
    }

    public void setBundleNameDtls(int i, com.xius.billing.SubscriberManagement_xsd.BundleNameDtlsType _value) {
        this.bundleNameDtls[i] = _value;
    }


    /**
     * Gets the message value for this GetMulBndlNameDetailsResponse.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this GetMulBndlNameDetailsResponse.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the totalCharge value for this GetMulBndlNameDetailsResponse.
     * 
     * @return totalCharge
     */
    public java.lang.String getTotalCharge() {
        return totalCharge;
    }


    /**
     * Sets the totalCharge value for this GetMulBndlNameDetailsResponse.
     * 
     * @param totalCharge
     */
    public void setTotalCharge(java.lang.String totalCharge) {
        this.totalCharge = totalCharge;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMulBndlNameDetailsResponse)) return false;
        GetMulBndlNameDetailsResponse other = (GetMulBndlNameDetailsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bundleNameDtls==null && other.getBundleNameDtls()==null) || 
             (this.bundleNameDtls!=null &&
              java.util.Arrays.equals(this.bundleNameDtls, other.getBundleNameDtls()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.totalCharge==null && other.getTotalCharge()==null) || 
             (this.totalCharge!=null &&
              this.totalCharge.equals(other.getTotalCharge())));
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
        if (getBundleNameDtls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBundleNameDtls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBundleNameDtls(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getTotalCharge() != null) {
            _hashCode += getTotalCharge().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetMulBndlNameDetailsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getMulBndlNameDetailsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bundleNameDtls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "bundleNameDtls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "bundleNameDtlsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "totalCharge"));
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
