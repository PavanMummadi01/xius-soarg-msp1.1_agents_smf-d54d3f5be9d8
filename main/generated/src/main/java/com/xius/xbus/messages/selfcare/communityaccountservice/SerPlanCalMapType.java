/**
 * SerPlanCalMapType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.selfcare.communityaccountservice;

public class SerPlanCalMapType  implements java.io.Serializable {
    private long caldrId;

    private long caldrServiceId;

    private java.lang.Long vistNtwId;

    public SerPlanCalMapType() {
    }

    public SerPlanCalMapType(
           long caldrId,
           long caldrServiceId,
           java.lang.Long vistNtwId) {
           this.caldrId = caldrId;
           this.caldrServiceId = caldrServiceId;
           this.vistNtwId = vistNtwId;
    }


    /**
     * Gets the caldrId value for this SerPlanCalMapType.
     * 
     * @return caldrId
     */
    public long getCaldrId() {
        return caldrId;
    }


    /**
     * Sets the caldrId value for this SerPlanCalMapType.
     * 
     * @param caldrId
     */
    public void setCaldrId(long caldrId) {
        this.caldrId = caldrId;
    }


    /**
     * Gets the caldrServiceId value for this SerPlanCalMapType.
     * 
     * @return caldrServiceId
     */
    public long getCaldrServiceId() {
        return caldrServiceId;
    }


    /**
     * Sets the caldrServiceId value for this SerPlanCalMapType.
     * 
     * @param caldrServiceId
     */
    public void setCaldrServiceId(long caldrServiceId) {
        this.caldrServiceId = caldrServiceId;
    }


    /**
     * Gets the vistNtwId value for this SerPlanCalMapType.
     * 
     * @return vistNtwId
     */
    public java.lang.Long getVistNtwId() {
        return vistNtwId;
    }


    /**
     * Sets the vistNtwId value for this SerPlanCalMapType.
     * 
     * @param vistNtwId
     */
    public void setVistNtwId(java.lang.Long vistNtwId) {
        this.vistNtwId = vistNtwId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SerPlanCalMapType)) return false;
        SerPlanCalMapType other = (SerPlanCalMapType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.caldrId == other.getCaldrId() &&
            this.caldrServiceId == other.getCaldrServiceId() &&
            ((this.vistNtwId==null && other.getVistNtwId()==null) || 
             (this.vistNtwId!=null &&
              this.vistNtwId.equals(other.getVistNtwId())));
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
        _hashCode += new Long(getCaldrId()).hashCode();
        _hashCode += new Long(getCaldrServiceId()).hashCode();
        if (getVistNtwId() != null) {
            _hashCode += getVistNtwId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SerPlanCalMapType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "SerPlanCalMapType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caldrId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "caldrId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caldrServiceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "caldrServiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vistNtwId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "vistNtwId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
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
