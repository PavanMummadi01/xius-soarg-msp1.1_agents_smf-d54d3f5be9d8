/**
 * UpdateServicesResponseUnSubscribedServices.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.tariff;

public class UpdateServicesResponseUnSubscribedServices  implements java.io.Serializable {
    private com.xius.xbus.messages.billing.tariff.Service[] unSubSuccessList;

    private com.xius.xbus.messages.billing.tariff.Service[] unSubFailureList;

    public UpdateServicesResponseUnSubscribedServices() {
    }

    public UpdateServicesResponseUnSubscribedServices(
           com.xius.xbus.messages.billing.tariff.Service[] unSubSuccessList,
           com.xius.xbus.messages.billing.tariff.Service[] unSubFailureList) {
           this.unSubSuccessList = unSubSuccessList;
           this.unSubFailureList = unSubFailureList;
    }


    /**
     * Gets the unSubSuccessList value for this UpdateServicesResponseUnSubscribedServices.
     * 
     * @return unSubSuccessList
     */
    public com.xius.xbus.messages.billing.tariff.Service[] getUnSubSuccessList() {
        return unSubSuccessList;
    }


    /**
     * Sets the unSubSuccessList value for this UpdateServicesResponseUnSubscribedServices.
     * 
     * @param unSubSuccessList
     */
    public void setUnSubSuccessList(com.xius.xbus.messages.billing.tariff.Service[] unSubSuccessList) {
        this.unSubSuccessList = unSubSuccessList;
    }


    /**
     * Gets the unSubFailureList value for this UpdateServicesResponseUnSubscribedServices.
     * 
     * @return unSubFailureList
     */
    public com.xius.xbus.messages.billing.tariff.Service[] getUnSubFailureList() {
        return unSubFailureList;
    }


    /**
     * Sets the unSubFailureList value for this UpdateServicesResponseUnSubscribedServices.
     * 
     * @param unSubFailureList
     */
    public void setUnSubFailureList(com.xius.xbus.messages.billing.tariff.Service[] unSubFailureList) {
        this.unSubFailureList = unSubFailureList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateServicesResponseUnSubscribedServices)) return false;
        UpdateServicesResponseUnSubscribedServices other = (UpdateServicesResponseUnSubscribedServices) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.unSubSuccessList==null && other.getUnSubSuccessList()==null) || 
             (this.unSubSuccessList!=null &&
              java.util.Arrays.equals(this.unSubSuccessList, other.getUnSubSuccessList()))) &&
            ((this.unSubFailureList==null && other.getUnSubFailureList()==null) || 
             (this.unSubFailureList!=null &&
              java.util.Arrays.equals(this.unSubFailureList, other.getUnSubFailureList())));
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
        if (getUnSubSuccessList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnSubSuccessList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnSubSuccessList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUnSubFailureList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnSubFailureList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnSubFailureList(), i);
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
        new org.apache.axis.description.TypeDesc(UpdateServicesResponseUnSubscribedServices.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">>updateServicesResponse>unSubscribedServices"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unSubSuccessList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "unSubSuccessList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "Service"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "serviceList"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unSubFailureList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "unSubFailureList"));
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
