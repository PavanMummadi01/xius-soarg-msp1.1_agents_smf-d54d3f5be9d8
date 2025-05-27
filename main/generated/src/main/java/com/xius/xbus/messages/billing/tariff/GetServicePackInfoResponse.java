/**
 * GetServicePackInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.tariff;

public class GetServicePackInfoResponse  extends com.xius.xbus.messages.common.WSResponse  implements java.io.Serializable {
    private com.xius.xbus.messages.billing.tariff.ServicePackInfoType[] servicePackInfoList;

    public GetServicePackInfoResponse() {
    }

    public GetServicePackInfoResponse(
           com.xius.xbus.messages.common.StatusCode statusCode,
           java.util.Calendar timeStamp,
           java.lang.String correlationID,
           com.xius.xbus.messages.common.ErrorData[] errors,
           java.lang.String version,
           com.xius.xbus.messages.billing.tariff.ServicePackInfoType[] servicePackInfoList) {
        super(
            statusCode,
            timeStamp,
            correlationID,
            errors,
            version);
        this.servicePackInfoList = servicePackInfoList;
    }


    /**
     * Gets the servicePackInfoList value for this GetServicePackInfoResponse.
     * 
     * @return servicePackInfoList
     */
    public com.xius.xbus.messages.billing.tariff.ServicePackInfoType[] getServicePackInfoList() {
        return servicePackInfoList;
    }


    /**
     * Sets the servicePackInfoList value for this GetServicePackInfoResponse.
     * 
     * @param servicePackInfoList
     */
    public void setServicePackInfoList(com.xius.xbus.messages.billing.tariff.ServicePackInfoType[] servicePackInfoList) {
        this.servicePackInfoList = servicePackInfoList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetServicePackInfoResponse)) return false;
        GetServicePackInfoResponse other = (GetServicePackInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.servicePackInfoList==null && other.getServicePackInfoList()==null) || 
             (this.servicePackInfoList!=null &&
              java.util.Arrays.equals(this.servicePackInfoList, other.getServicePackInfoList())));
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
        if (getServicePackInfoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServicePackInfoList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServicePackInfoList(), i);
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
        new org.apache.axis.description.TypeDesc(GetServicePackInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getServicePackInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicePackInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "servicePackInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "ServicePackInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "ServicePackInfo"));
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
