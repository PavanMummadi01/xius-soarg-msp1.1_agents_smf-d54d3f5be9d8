/**
 * GetTroubleTktStatusResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class GetTroubleTktStatusResponse  implements java.io.Serializable {
    private java.lang.String message;

    private java.lang.Integer extCount;

    private com.xius.billing.AccountManagement_xsd.TktStatusTypeData[] tktStatusList;

    public GetTroubleTktStatusResponse() {
    }

    public GetTroubleTktStatusResponse(
           java.lang.String message,
           java.lang.Integer extCount,
           com.xius.billing.AccountManagement_xsd.TktStatusTypeData[] tktStatusList) {
           this.message = message;
           this.extCount = extCount;
           this.tktStatusList = tktStatusList;
    }


    /**
     * Gets the message value for this GetTroubleTktStatusResponse.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this GetTroubleTktStatusResponse.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the extCount value for this GetTroubleTktStatusResponse.
     * 
     * @return extCount
     */
    public java.lang.Integer getExtCount() {
        return extCount;
    }


    /**
     * Sets the extCount value for this GetTroubleTktStatusResponse.
     * 
     * @param extCount
     */
    public void setExtCount(java.lang.Integer extCount) {
        this.extCount = extCount;
    }


    /**
     * Gets the tktStatusList value for this GetTroubleTktStatusResponse.
     * 
     * @return tktStatusList
     */
    public com.xius.billing.AccountManagement_xsd.TktStatusTypeData[] getTktStatusList() {
        return tktStatusList;
    }


    /**
     * Sets the tktStatusList value for this GetTroubleTktStatusResponse.
     * 
     * @param tktStatusList
     */
    public void setTktStatusList(com.xius.billing.AccountManagement_xsd.TktStatusTypeData[] tktStatusList) {
        this.tktStatusList = tktStatusList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTroubleTktStatusResponse)) return false;
        GetTroubleTktStatusResponse other = (GetTroubleTktStatusResponse) obj;
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
            ((this.extCount==null && other.getExtCount()==null) || 
             (this.extCount!=null &&
              this.extCount.equals(other.getExtCount()))) &&
            ((this.tktStatusList==null && other.getTktStatusList()==null) || 
             (this.tktStatusList!=null &&
              java.util.Arrays.equals(this.tktStatusList, other.getTktStatusList())));
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
        if (getExtCount() != null) {
            _hashCode += getExtCount().hashCode();
        }
        if (getTktStatusList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTktStatusList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTktStatusList(), i);
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
        new org.apache.axis.description.TypeDesc(GetTroubleTktStatusResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetTroubleTktStatusResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "extCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tktStatusList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "TktStatusList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "TktStatusTypeData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "TktStatusTypeData"));
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
