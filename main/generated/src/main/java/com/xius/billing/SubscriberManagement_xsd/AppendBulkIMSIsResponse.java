/**
 * AppendBulkIMSIsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class AppendBulkIMSIsResponse  implements java.io.Serializable {
    private java.lang.String[] msisdnIMSIRecFlagArr;

    public AppendBulkIMSIsResponse() {
    }

    public AppendBulkIMSIsResponse(
           java.lang.String[] msisdnIMSIRecFlagArr) {
           this.msisdnIMSIRecFlagArr = msisdnIMSIRecFlagArr;
    }


    /**
     * Gets the msisdnIMSIRecFlagArr value for this AppendBulkIMSIsResponse.
     * 
     * @return msisdnIMSIRecFlagArr
     */
    public java.lang.String[] getMsisdnIMSIRecFlagArr() {
        return msisdnIMSIRecFlagArr;
    }


    /**
     * Sets the msisdnIMSIRecFlagArr value for this AppendBulkIMSIsResponse.
     * 
     * @param msisdnIMSIRecFlagArr
     */
    public void setMsisdnIMSIRecFlagArr(java.lang.String[] msisdnIMSIRecFlagArr) {
        this.msisdnIMSIRecFlagArr = msisdnIMSIRecFlagArr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AppendBulkIMSIsResponse)) return false;
        AppendBulkIMSIsResponse other = (AppendBulkIMSIsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.msisdnIMSIRecFlagArr==null && other.getMsisdnIMSIRecFlagArr()==null) || 
             (this.msisdnIMSIRecFlagArr!=null &&
              java.util.Arrays.equals(this.msisdnIMSIRecFlagArr, other.getMsisdnIMSIRecFlagArr())));
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
        if (getMsisdnIMSIRecFlagArr() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMsisdnIMSIRecFlagArr());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMsisdnIMSIRecFlagArr(), i);
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
        new org.apache.axis.description.TypeDesc(AppendBulkIMSIsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "AppendBulkIMSIsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdnIMSIRecFlagArr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "msisdnIMSIRecFlagArr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
