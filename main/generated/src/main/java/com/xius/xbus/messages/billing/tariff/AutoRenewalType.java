/**
 * AutoRenewalType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.tariff;

public class AutoRenewalType  implements java.io.Serializable {
    private boolean flag;

    private java.lang.String maxAutoRenewalCount;

    public AutoRenewalType() {
    }

    public AutoRenewalType(
           boolean flag,
           java.lang.String maxAutoRenewalCount) {
           this.flag = flag;
           this.maxAutoRenewalCount = maxAutoRenewalCount;
    }


    /**
     * Gets the flag value for this AutoRenewalType.
     * 
     * @return flag
     */
    public boolean isFlag() {
        return flag;
    }


    /**
     * Sets the flag value for this AutoRenewalType.
     * 
     * @param flag
     */
    public void setFlag(boolean flag) {
        this.flag = flag;
    }


    /**
     * Gets the maxAutoRenewalCount value for this AutoRenewalType.
     * 
     * @return maxAutoRenewalCount
     */
    public java.lang.String getMaxAutoRenewalCount() {
        return maxAutoRenewalCount;
    }


    /**
     * Sets the maxAutoRenewalCount value for this AutoRenewalType.
     * 
     * @param maxAutoRenewalCount
     */
    public void setMaxAutoRenewalCount(java.lang.String maxAutoRenewalCount) {
        this.maxAutoRenewalCount = maxAutoRenewalCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AutoRenewalType)) return false;
        AutoRenewalType other = (AutoRenewalType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.flag == other.isFlag() &&
            ((this.maxAutoRenewalCount==null && other.getMaxAutoRenewalCount()==null) || 
             (this.maxAutoRenewalCount!=null &&
              this.maxAutoRenewalCount.equals(other.getMaxAutoRenewalCount())));
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
        _hashCode += (isFlag() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMaxAutoRenewalCount() != null) {
            _hashCode += getMaxAutoRenewalCount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AutoRenewalType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "AutoRenewalType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "flag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxAutoRenewalCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "maxAutoRenewalCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
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
