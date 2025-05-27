/**
 * GetTopUpScheduleResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xiusbcgi.xbus.scare.CorpManagement_xsd;

public class GetTopUpScheduleResponse  implements java.io.Serializable {
    private com.xiusbcgi.xbus.scare.CorpManagement_xsd.UploadDetails[] topUpScheduleList;

    public GetTopUpScheduleResponse() {
    }

    public GetTopUpScheduleResponse(
           com.xiusbcgi.xbus.scare.CorpManagement_xsd.UploadDetails[] topUpScheduleList) {
           this.topUpScheduleList = topUpScheduleList;
    }


    /**
     * Gets the topUpScheduleList value for this GetTopUpScheduleResponse.
     * 
     * @return topUpScheduleList
     */
    public com.xiusbcgi.xbus.scare.CorpManagement_xsd.UploadDetails[] getTopUpScheduleList() {
        return topUpScheduleList;
    }


    /**
     * Sets the topUpScheduleList value for this GetTopUpScheduleResponse.
     * 
     * @param topUpScheduleList
     */
    public void setTopUpScheduleList(com.xiusbcgi.xbus.scare.CorpManagement_xsd.UploadDetails[] topUpScheduleList) {
        this.topUpScheduleList = topUpScheduleList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTopUpScheduleResponse)) return false;
        GetTopUpScheduleResponse other = (GetTopUpScheduleResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.topUpScheduleList==null && other.getTopUpScheduleList()==null) || 
             (this.topUpScheduleList!=null &&
              java.util.Arrays.equals(this.topUpScheduleList, other.getTopUpScheduleList())));
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
        if (getTopUpScheduleList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTopUpScheduleList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTopUpScheduleList(), i);
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
        new org.apache.axis.description.TypeDesc(GetTopUpScheduleResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "GetTopUpScheduleResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topUpScheduleList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "topUpScheduleList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "UploadDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "topUpSchedule"));
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
