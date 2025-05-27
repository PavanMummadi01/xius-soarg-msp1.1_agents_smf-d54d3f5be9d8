/**
 * GetMulBndlNameDetailsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class GetMulBndlNameDetailsRequest  implements java.io.Serializable {
    private java.lang.String[] bundleName;

    private java.lang.String msisdn;

    public GetMulBndlNameDetailsRequest() {
    }

    public GetMulBndlNameDetailsRequest(
           java.lang.String[] bundleName,
           java.lang.String msisdn) {
           this.bundleName = bundleName;
           this.msisdn = msisdn;
    }


    /**
     * Gets the bundleName value for this GetMulBndlNameDetailsRequest.
     * 
     * @return bundleName
     */
    public java.lang.String[] getBundleName() {
        return bundleName;
    }


    /**
     * Sets the bundleName value for this GetMulBndlNameDetailsRequest.
     * 
     * @param bundleName
     */
    public void setBundleName(java.lang.String[] bundleName) {
        this.bundleName = bundleName;
    }

    public java.lang.String getBundleName(int i) {
        return this.bundleName[i];
    }

    public void setBundleName(int i, java.lang.String _value) {
        this.bundleName[i] = _value;
    }


    /**
     * Gets the msisdn value for this GetMulBndlNameDetailsRequest.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this GetMulBndlNameDetailsRequest.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMulBndlNameDetailsRequest)) return false;
        GetMulBndlNameDetailsRequest other = (GetMulBndlNameDetailsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bundleName==null && other.getBundleName()==null) || 
             (this.bundleName!=null &&
              java.util.Arrays.equals(this.bundleName, other.getBundleName()))) &&
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn())));
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
        if (getBundleName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBundleName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBundleName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetMulBndlNameDetailsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getMulBndlNameDetailsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bundleName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "bundleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
