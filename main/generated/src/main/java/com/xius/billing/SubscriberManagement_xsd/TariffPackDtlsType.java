/**
 * TariffPackDtlsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class TariffPackDtlsType  implements java.io.Serializable {
    private java.lang.String tariffPackageDesc;

    private java.lang.String tariffPackageId;

    public TariffPackDtlsType() {
    }

    public TariffPackDtlsType(
           java.lang.String tariffPackageDesc,
           java.lang.String tariffPackageId) {
           this.tariffPackageDesc = tariffPackageDesc;
           this.tariffPackageId = tariffPackageId;
    }


    /**
     * Gets the tariffPackageDesc value for this TariffPackDtlsType.
     * 
     * @return tariffPackageDesc
     */
    public java.lang.String getTariffPackageDesc() {
        return tariffPackageDesc;
    }


    /**
     * Sets the tariffPackageDesc value for this TariffPackDtlsType.
     * 
     * @param tariffPackageDesc
     */
    public void setTariffPackageDesc(java.lang.String tariffPackageDesc) {
        this.tariffPackageDesc = tariffPackageDesc;
    }


    /**
     * Gets the tariffPackageId value for this TariffPackDtlsType.
     * 
     * @return tariffPackageId
     */
    public java.lang.String getTariffPackageId() {
        return tariffPackageId;
    }


    /**
     * Sets the tariffPackageId value for this TariffPackDtlsType.
     * 
     * @param tariffPackageId
     */
    public void setTariffPackageId(java.lang.String tariffPackageId) {
        this.tariffPackageId = tariffPackageId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TariffPackDtlsType)) return false;
        TariffPackDtlsType other = (TariffPackDtlsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tariffPackageDesc==null && other.getTariffPackageDesc()==null) || 
             (this.tariffPackageDesc!=null &&
              this.tariffPackageDesc.equals(other.getTariffPackageDesc()))) &&
            ((this.tariffPackageId==null && other.getTariffPackageId()==null) || 
             (this.tariffPackageId!=null &&
              this.tariffPackageId.equals(other.getTariffPackageId())));
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
        if (getTariffPackageDesc() != null) {
            _hashCode += getTariffPackageDesc().hashCode();
        }
        if (getTariffPackageId() != null) {
            _hashCode += getTariffPackageId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TariffPackDtlsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "tariffPackDtlsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tariffPackageDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "tariffPackageDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tariffPackageId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "tariffPackageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
