/**
 * GetSettlementDataResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xiusbcgi.xbus.scare.CorpManagement_xsd;

public class GetSettlementDataResponse  implements java.io.Serializable {
    private com.xiusbcgi.xbus.scare.CorpManagement_xsd.PaySettlementDataType[] paySettleDataList;

    public GetSettlementDataResponse() {
    }

    public GetSettlementDataResponse(
           com.xiusbcgi.xbus.scare.CorpManagement_xsd.PaySettlementDataType[] paySettleDataList) {
           this.paySettleDataList = paySettleDataList;
    }


    /**
     * Gets the paySettleDataList value for this GetSettlementDataResponse.
     * 
     * @return paySettleDataList
     */
    public com.xiusbcgi.xbus.scare.CorpManagement_xsd.PaySettlementDataType[] getPaySettleDataList() {
        return paySettleDataList;
    }


    /**
     * Sets the paySettleDataList value for this GetSettlementDataResponse.
     * 
     * @param paySettleDataList
     */
    public void setPaySettleDataList(com.xiusbcgi.xbus.scare.CorpManagement_xsd.PaySettlementDataType[] paySettleDataList) {
        this.paySettleDataList = paySettleDataList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSettlementDataResponse)) return false;
        GetSettlementDataResponse other = (GetSettlementDataResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.paySettleDataList==null && other.getPaySettleDataList()==null) || 
             (this.paySettleDataList!=null &&
              java.util.Arrays.equals(this.paySettleDataList, other.getPaySettleDataList())));
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
        if (getPaySettleDataList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaySettleDataList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaySettleDataList(), i);
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
        new org.apache.axis.description.TypeDesc(GetSettlementDataResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "GetSettlementDataResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paySettleDataList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "paySettleDataList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "PaySettlementDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "paySettlementData"));
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
