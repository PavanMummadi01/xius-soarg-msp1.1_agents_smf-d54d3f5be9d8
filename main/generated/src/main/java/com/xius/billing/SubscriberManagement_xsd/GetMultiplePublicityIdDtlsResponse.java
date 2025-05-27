/**
 * GetMultiplePublicityIdDtlsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class GetMultiplePublicityIdDtlsResponse  implements java.io.Serializable {
    private com.xius.billing.SubscriberManagement_xsd.PublicityIdDtlsType[] publicityIdDtls;

    private java.lang.String totalCharge;

    private java.lang.String message;

    public GetMultiplePublicityIdDtlsResponse() {
    }

    public GetMultiplePublicityIdDtlsResponse(
           com.xius.billing.SubscriberManagement_xsd.PublicityIdDtlsType[] publicityIdDtls,
           java.lang.String totalCharge,
           java.lang.String message) {
           this.publicityIdDtls = publicityIdDtls;
           this.totalCharge = totalCharge;
           this.message = message;
    }


    /**
     * Gets the publicityIdDtls value for this GetMultiplePublicityIdDtlsResponse.
     * 
     * @return publicityIdDtls
     */
    public com.xius.billing.SubscriberManagement_xsd.PublicityIdDtlsType[] getPublicityIdDtls() {
        return publicityIdDtls;
    }


    /**
     * Sets the publicityIdDtls value for this GetMultiplePublicityIdDtlsResponse.
     * 
     * @param publicityIdDtls
     */
    public void setPublicityIdDtls(com.xius.billing.SubscriberManagement_xsd.PublicityIdDtlsType[] publicityIdDtls) {
        this.publicityIdDtls = publicityIdDtls;
    }

    public com.xius.billing.SubscriberManagement_xsd.PublicityIdDtlsType getPublicityIdDtls(int i) {
        return this.publicityIdDtls[i];
    }

    public void setPublicityIdDtls(int i, com.xius.billing.SubscriberManagement_xsd.PublicityIdDtlsType _value) {
        this.publicityIdDtls[i] = _value;
    }


    /**
     * Gets the totalCharge value for this GetMultiplePublicityIdDtlsResponse.
     * 
     * @return totalCharge
     */
    public java.lang.String getTotalCharge() {
        return totalCharge;
    }


    /**
     * Sets the totalCharge value for this GetMultiplePublicityIdDtlsResponse.
     * 
     * @param totalCharge
     */
    public void setTotalCharge(java.lang.String totalCharge) {
        this.totalCharge = totalCharge;
    }


    /**
     * Gets the message value for this GetMultiplePublicityIdDtlsResponse.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this GetMultiplePublicityIdDtlsResponse.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMultiplePublicityIdDtlsResponse)) return false;
        GetMultiplePublicityIdDtlsResponse other = (GetMultiplePublicityIdDtlsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.publicityIdDtls==null && other.getPublicityIdDtls()==null) || 
             (this.publicityIdDtls!=null &&
              java.util.Arrays.equals(this.publicityIdDtls, other.getPublicityIdDtls()))) &&
            ((this.totalCharge==null && other.getTotalCharge()==null) || 
             (this.totalCharge!=null &&
              this.totalCharge.equals(other.getTotalCharge()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage())));
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
        if (getPublicityIdDtls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPublicityIdDtls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPublicityIdDtls(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTotalCharge() != null) {
            _hashCode += getTotalCharge().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetMultiplePublicityIdDtlsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetMultiplePublicityIdDtlsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicityIdDtls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "publicityIdDtls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "publicityIdDtlsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "totalCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "message"));
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
