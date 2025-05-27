/**
 * AppendBulkIMSIsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class AppendBulkIMSIsRequest  implements java.io.Serializable {
    private java.lang.String[] msisdnRecFlagArr;

    public AppendBulkIMSIsRequest() {
    }

    public AppendBulkIMSIsRequest(
           java.lang.String[] msisdnRecFlagArr) {
           this.msisdnRecFlagArr = msisdnRecFlagArr;
    }


    /**
     * Gets the msisdnRecFlagArr value for this AppendBulkIMSIsRequest.
     * 
     * @return msisdnRecFlagArr
     */
    public java.lang.String[] getMsisdnRecFlagArr() {
        return msisdnRecFlagArr;
    }


    /**
     * Sets the msisdnRecFlagArr value for this AppendBulkIMSIsRequest.
     * 
     * @param msisdnRecFlagArr
     */
    public void setMsisdnRecFlagArr(java.lang.String[] msisdnRecFlagArr) {
        this.msisdnRecFlagArr = msisdnRecFlagArr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AppendBulkIMSIsRequest)) return false;
        AppendBulkIMSIsRequest other = (AppendBulkIMSIsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.msisdnRecFlagArr==null && other.getMsisdnRecFlagArr()==null) || 
             (this.msisdnRecFlagArr!=null &&
              java.util.Arrays.equals(this.msisdnRecFlagArr, other.getMsisdnRecFlagArr())));
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
        if (getMsisdnRecFlagArr() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMsisdnRecFlagArr());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMsisdnRecFlagArr(), i);
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
        new org.apache.axis.description.TypeDesc(AppendBulkIMSIsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "AppendBulkIMSIsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdnRecFlagArr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "msisdnRecFlagArr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "msisdnIMSIRecFlag"));
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
