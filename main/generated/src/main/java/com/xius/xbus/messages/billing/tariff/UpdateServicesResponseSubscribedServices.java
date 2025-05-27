/**
 * UpdateServicesResponseSubscribedServices.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.tariff;

public class UpdateServicesResponseSubscribedServices  implements java.io.Serializable {
    private com.xius.xbus.messages.billing.tariff.Service[] subSuccessList;

    private com.xius.xbus.messages.billing.tariff.Service[] subFailureList;

    public UpdateServicesResponseSubscribedServices() {
    }

    public UpdateServicesResponseSubscribedServices(
           com.xius.xbus.messages.billing.tariff.Service[] subSuccessList,
           com.xius.xbus.messages.billing.tariff.Service[] subFailureList) {
           this.subSuccessList = subSuccessList;
           this.subFailureList = subFailureList;
    }


    /**
     * Gets the subSuccessList value for this UpdateServicesResponseSubscribedServices.
     * 
     * @return subSuccessList
     */
    public com.xius.xbus.messages.billing.tariff.Service[] getSubSuccessList() {
        return subSuccessList;
    }


    /**
     * Sets the subSuccessList value for this UpdateServicesResponseSubscribedServices.
     * 
     * @param subSuccessList
     */
    public void setSubSuccessList(com.xius.xbus.messages.billing.tariff.Service[] subSuccessList) {
        this.subSuccessList = subSuccessList;
    }


    /**
     * Gets the subFailureList value for this UpdateServicesResponseSubscribedServices.
     * 
     * @return subFailureList
     */
    public com.xius.xbus.messages.billing.tariff.Service[] getSubFailureList() {
        return subFailureList;
    }


    /**
     * Sets the subFailureList value for this UpdateServicesResponseSubscribedServices.
     * 
     * @param subFailureList
     */
    public void setSubFailureList(com.xius.xbus.messages.billing.tariff.Service[] subFailureList) {
        this.subFailureList = subFailureList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateServicesResponseSubscribedServices)) return false;
        UpdateServicesResponseSubscribedServices other = (UpdateServicesResponseSubscribedServices) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subSuccessList==null && other.getSubSuccessList()==null) || 
             (this.subSuccessList!=null &&
              java.util.Arrays.equals(this.subSuccessList, other.getSubSuccessList()))) &&
            ((this.subFailureList==null && other.getSubFailureList()==null) || 
             (this.subFailureList!=null &&
              java.util.Arrays.equals(this.subFailureList, other.getSubFailureList())));
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
        if (getSubSuccessList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubSuccessList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubSuccessList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubFailureList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubFailureList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubFailureList(), i);
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
        new org.apache.axis.description.TypeDesc(UpdateServicesResponseSubscribedServices.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">>updateServicesResponse>subscribedServices"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subSuccessList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "subSuccessList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "Service"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "serviceList"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subFailureList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "subFailureList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "Service"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "serviceList"));
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
