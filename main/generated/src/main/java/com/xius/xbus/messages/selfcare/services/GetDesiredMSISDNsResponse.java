/**
 * GetDesiredMSISDNsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.selfcare.services;

public class GetDesiredMSISDNsResponse  extends com.xius.xbus.messages.common.WSResponse  implements java.io.Serializable {
    private java.lang.String[] preferredMSISDNList;

    public GetDesiredMSISDNsResponse() {
    }

    public GetDesiredMSISDNsResponse(
           com.xius.xbus.messages.common.StatusCode statusCode,
           java.util.Calendar timeStamp,
           java.lang.String correlationID,
           com.xius.xbus.messages.common.ErrorData[] errors,
           java.lang.String version,
           java.lang.String[] preferredMSISDNList) {
        super(
            statusCode,
            timeStamp,
            correlationID,
            errors,
            version);
        this.preferredMSISDNList = preferredMSISDNList;
    }


    /**
     * Gets the preferredMSISDNList value for this GetDesiredMSISDNsResponse.
     * 
     * @return preferredMSISDNList
     */
    public java.lang.String[] getPreferredMSISDNList() {
        return preferredMSISDNList;
    }


    /**
     * Sets the preferredMSISDNList value for this GetDesiredMSISDNsResponse.
     * 
     * @param preferredMSISDNList
     */
    public void setPreferredMSISDNList(java.lang.String[] preferredMSISDNList) {
        this.preferredMSISDNList = preferredMSISDNList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDesiredMSISDNsResponse)) return false;
        GetDesiredMSISDNsResponse other = (GetDesiredMSISDNsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.preferredMSISDNList==null && other.getPreferredMSISDNList()==null) || 
             (this.preferredMSISDNList!=null &&
              java.util.Arrays.equals(this.preferredMSISDNList, other.getPreferredMSISDNList())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getPreferredMSISDNList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPreferredMSISDNList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPreferredMSISDNList(), i);
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
        new org.apache.axis.description.TypeDesc(GetDesiredMSISDNsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">getDesiredMSISDNsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredMSISDNList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "preferredMSISDNList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "string"));
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
