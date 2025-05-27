/**
 * UpdateServicesResponseInvalidServices.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.tariff;

public class UpdateServicesResponseInvalidServices  implements java.io.Serializable {
    private com.xius.xbus.messages.billing.tariff.Service[] invalidServicesList;

    private java.lang.String reason;

    public UpdateServicesResponseInvalidServices() {
    }

    public UpdateServicesResponseInvalidServices(
           com.xius.xbus.messages.billing.tariff.Service[] invalidServicesList,
           java.lang.String reason) {
           this.invalidServicesList = invalidServicesList;
           this.reason = reason;
    }


    /**
     * Gets the invalidServicesList value for this UpdateServicesResponseInvalidServices.
     * 
     * @return invalidServicesList
     */
    public com.xius.xbus.messages.billing.tariff.Service[] getInvalidServicesList() {
        return invalidServicesList;
    }


    /**
     * Sets the invalidServicesList value for this UpdateServicesResponseInvalidServices.
     * 
     * @param invalidServicesList
     */
    public void setInvalidServicesList(com.xius.xbus.messages.billing.tariff.Service[] invalidServicesList) {
        this.invalidServicesList = invalidServicesList;
    }


    /**
     * Gets the reason value for this UpdateServicesResponseInvalidServices.
     * 
     * @return reason
     */
    public java.lang.String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this UpdateServicesResponseInvalidServices.
     * 
     * @param reason
     */
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateServicesResponseInvalidServices)) return false;
        UpdateServicesResponseInvalidServices other = (UpdateServicesResponseInvalidServices) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.invalidServicesList==null && other.getInvalidServicesList()==null) || 
             (this.invalidServicesList!=null &&
              java.util.Arrays.equals(this.invalidServicesList, other.getInvalidServicesList()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason())));
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
        if (getInvalidServicesList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInvalidServicesList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInvalidServicesList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateServicesResponseInvalidServices.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">>updateServicesResponse>invalidServices"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invalidServicesList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "invalidServicesList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "Service"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "serviceList"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
