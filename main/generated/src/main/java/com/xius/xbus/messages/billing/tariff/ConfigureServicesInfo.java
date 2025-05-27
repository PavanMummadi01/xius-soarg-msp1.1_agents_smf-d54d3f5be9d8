/**
 * ConfigureServicesInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.tariff;


/**
 * ConfigureServicesPreInfo
 */
public class ConfigureServicesInfo  implements java.io.Serializable {
    private com.xius.xbus.messages.billing.tariff.CallBarredNumbers callBarredNumbers;

    private com.xius.xbus.messages.billing.tariff.SpecialNumbers specialNumbers;

    public ConfigureServicesInfo() {
    }

    public ConfigureServicesInfo(
           com.xius.xbus.messages.billing.tariff.CallBarredNumbers callBarredNumbers,
           com.xius.xbus.messages.billing.tariff.SpecialNumbers specialNumbers) {
           this.callBarredNumbers = callBarredNumbers;
           this.specialNumbers = specialNumbers;
    }


    /**
     * Gets the callBarredNumbers value for this ConfigureServicesInfo.
     * 
     * @return callBarredNumbers
     */
    public com.xius.xbus.messages.billing.tariff.CallBarredNumbers getCallBarredNumbers() {
        return callBarredNumbers;
    }


    /**
     * Sets the callBarredNumbers value for this ConfigureServicesInfo.
     * 
     * @param callBarredNumbers
     */
    public void setCallBarredNumbers(com.xius.xbus.messages.billing.tariff.CallBarredNumbers callBarredNumbers) {
        this.callBarredNumbers = callBarredNumbers;
    }


    /**
     * Gets the specialNumbers value for this ConfigureServicesInfo.
     * 
     * @return specialNumbers
     */
    public com.xius.xbus.messages.billing.tariff.SpecialNumbers getSpecialNumbers() {
        return specialNumbers;
    }


    /**
     * Sets the specialNumbers value for this ConfigureServicesInfo.
     * 
     * @param specialNumbers
     */
    public void setSpecialNumbers(com.xius.xbus.messages.billing.tariff.SpecialNumbers specialNumbers) {
        this.specialNumbers = specialNumbers;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfigureServicesInfo)) return false;
        ConfigureServicesInfo other = (ConfigureServicesInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.callBarredNumbers==null && other.getCallBarredNumbers()==null) || 
             (this.callBarredNumbers!=null &&
              this.callBarredNumbers.equals(other.getCallBarredNumbers()))) &&
            ((this.specialNumbers==null && other.getSpecialNumbers()==null) || 
             (this.specialNumbers!=null &&
              this.specialNumbers.equals(other.getSpecialNumbers())));
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
        if (getCallBarredNumbers() != null) {
            _hashCode += getCallBarredNumbers().hashCode();
        }
        if (getSpecialNumbers() != null) {
            _hashCode += getSpecialNumbers().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfigureServicesInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "ConfigureServicesInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callBarredNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "callBarredNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "CallBarredNumbers"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "specialNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "SpecialNumbers"));
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
