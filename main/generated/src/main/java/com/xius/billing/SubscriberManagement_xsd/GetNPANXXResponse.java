/**
 * GetNPANXXResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class GetNPANXXResponse  implements java.io.Serializable {
    private java.lang.String message;

    private com.xius.billing.SubscriberManagement_xsd.NPANXXListType[] NPANXXList;

    public GetNPANXXResponse() {
    }

    public GetNPANXXResponse(
           java.lang.String message,
           com.xius.billing.SubscriberManagement_xsd.NPANXXListType[] NPANXXList) {
           this.message = message;
           this.NPANXXList = NPANXXList;
    }


    /**
     * Gets the message value for this GetNPANXXResponse.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this GetNPANXXResponse.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the NPANXXList value for this GetNPANXXResponse.
     * 
     * @return NPANXXList
     */
    public com.xius.billing.SubscriberManagement_xsd.NPANXXListType[] getNPANXXList() {
        return NPANXXList;
    }


    /**
     * Sets the NPANXXList value for this GetNPANXXResponse.
     * 
     * @param NPANXXList
     */
    public void setNPANXXList(com.xius.billing.SubscriberManagement_xsd.NPANXXListType[] NPANXXList) {
        this.NPANXXList = NPANXXList;
    }

    public com.xius.billing.SubscriberManagement_xsd.NPANXXListType getNPANXXList(int i) {
        return this.NPANXXList[i];
    }

    public void setNPANXXList(int i, com.xius.billing.SubscriberManagement_xsd.NPANXXListType _value) {
        this.NPANXXList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetNPANXXResponse)) return false;
        GetNPANXXResponse other = (GetNPANXXResponse) obj;
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
            ((this.NPANXXList==null && other.getNPANXXList()==null) || 
             (this.NPANXXList!=null &&
              java.util.Arrays.equals(this.NPANXXList, other.getNPANXXList())));
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
        if (getNPANXXList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNPANXXList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNPANXXList(), i);
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
        new org.apache.axis.description.TypeDesc(GetNPANXXResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetNPANXXResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NPANXXList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "NPANXXList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "NPANXXListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
