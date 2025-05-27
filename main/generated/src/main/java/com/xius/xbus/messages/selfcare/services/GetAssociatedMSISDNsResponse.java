/**
 * GetAssociatedMSISDNsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.selfcare.services;

public class GetAssociatedMSISDNsResponse  extends com.xius.xbus.messages.common.WSResponse  implements java.io.Serializable {
    private com.xius.xbus.messages.selfcare.services.AssociatedMSISDN[] associatedMSISDNList;

    private com.xius.xbus.messages.selfcare.services.Service[] servicesList;

    public GetAssociatedMSISDNsResponse() {
    }

    public GetAssociatedMSISDNsResponse(
           com.xius.xbus.messages.common.StatusCode statusCode,
           java.util.Calendar timeStamp,
           java.lang.String correlationID,
           com.xius.xbus.messages.common.ErrorData[] errors,
           java.lang.String version,
           com.xius.xbus.messages.selfcare.services.AssociatedMSISDN[] associatedMSISDNList,
           com.xius.xbus.messages.selfcare.services.Service[] servicesList) {
        super(
            statusCode,
            timeStamp,
            correlationID,
            errors,
            version);
        this.associatedMSISDNList = associatedMSISDNList;
        this.servicesList = servicesList;
    }


    /**
     * Gets the associatedMSISDNList value for this GetAssociatedMSISDNsResponse.
     * 
     * @return associatedMSISDNList
     */
    public com.xius.xbus.messages.selfcare.services.AssociatedMSISDN[] getAssociatedMSISDNList() {
        return associatedMSISDNList;
    }


    /**
     * Sets the associatedMSISDNList value for this GetAssociatedMSISDNsResponse.
     * 
     * @param associatedMSISDNList
     */
    public void setAssociatedMSISDNList(com.xius.xbus.messages.selfcare.services.AssociatedMSISDN[] associatedMSISDNList) {
        this.associatedMSISDNList = associatedMSISDNList;
    }


    /**
     * Gets the servicesList value for this GetAssociatedMSISDNsResponse.
     * 
     * @return servicesList
     */
    public com.xius.xbus.messages.selfcare.services.Service[] getServicesList() {
        return servicesList;
    }


    /**
     * Sets the servicesList value for this GetAssociatedMSISDNsResponse.
     * 
     * @param servicesList
     */
    public void setServicesList(com.xius.xbus.messages.selfcare.services.Service[] servicesList) {
        this.servicesList = servicesList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAssociatedMSISDNsResponse)) return false;
        GetAssociatedMSISDNsResponse other = (GetAssociatedMSISDNsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.associatedMSISDNList==null && other.getAssociatedMSISDNList()==null) || 
             (this.associatedMSISDNList!=null &&
              java.util.Arrays.equals(this.associatedMSISDNList, other.getAssociatedMSISDNList()))) &&
            ((this.servicesList==null && other.getServicesList()==null) || 
             (this.servicesList!=null &&
              java.util.Arrays.equals(this.servicesList, other.getServicesList())));
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
        if (getAssociatedMSISDNList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssociatedMSISDNList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssociatedMSISDNList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getServicesList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServicesList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServicesList(), i);
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
        new org.apache.axis.description.TypeDesc(GetAssociatedMSISDNsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">getAssociatedMSISDNsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associatedMSISDNList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "associatedMSISDNList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "AssociatedMSISDN"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "AssociatedMSISDN"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicesList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "servicesList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "Service"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "serviceList"));
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
