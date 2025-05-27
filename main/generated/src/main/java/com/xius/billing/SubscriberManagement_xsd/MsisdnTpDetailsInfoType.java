/**
 * MsisdnTpDetailsInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class MsisdnTpDetailsInfoType  implements java.io.Serializable {
    private java.lang.String tariff_package_desc;

    private java.lang.Long tariff_package_id;

    public MsisdnTpDetailsInfoType() {
    }

    public MsisdnTpDetailsInfoType(
           java.lang.String tariff_package_desc,
           java.lang.Long tariff_package_id) {
           this.tariff_package_desc = tariff_package_desc;
           this.tariff_package_id = tariff_package_id;
    }


    /**
     * Gets the tariff_package_desc value for this MsisdnTpDetailsInfoType.
     * 
     * @return tariff_package_desc
     */
    public java.lang.String getTariff_package_desc() {
        return tariff_package_desc;
    }


    /**
     * Sets the tariff_package_desc value for this MsisdnTpDetailsInfoType.
     * 
     * @param tariff_package_desc
     */
    public void setTariff_package_desc(java.lang.String tariff_package_desc) {
        this.tariff_package_desc = tariff_package_desc;
    }


    /**
     * Gets the tariff_package_id value for this MsisdnTpDetailsInfoType.
     * 
     * @return tariff_package_id
     */
    public java.lang.Long getTariff_package_id() {
        return tariff_package_id;
    }


    /**
     * Sets the tariff_package_id value for this MsisdnTpDetailsInfoType.
     * 
     * @param tariff_package_id
     */
    public void setTariff_package_id(java.lang.Long tariff_package_id) {
        this.tariff_package_id = tariff_package_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MsisdnTpDetailsInfoType)) return false;
        MsisdnTpDetailsInfoType other = (MsisdnTpDetailsInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tariff_package_desc==null && other.getTariff_package_desc()==null) || 
             (this.tariff_package_desc!=null &&
              this.tariff_package_desc.equals(other.getTariff_package_desc()))) &&
            ((this.tariff_package_id==null && other.getTariff_package_id()==null) || 
             (this.tariff_package_id!=null &&
              this.tariff_package_id.equals(other.getTariff_package_id())));
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
        if (getTariff_package_desc() != null) {
            _hashCode += getTariff_package_desc().hashCode();
        }
        if (getTariff_package_id() != null) {
            _hashCode += getTariff_package_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MsisdnTpDetailsInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "msisdnTpDetailsInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tariff_package_desc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "tariff_package_desc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tariff_package_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "tariff_package_id"));
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
