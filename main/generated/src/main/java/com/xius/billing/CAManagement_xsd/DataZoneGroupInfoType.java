/**
 * DataZoneGroupInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.CAManagement_xsd;

public class DataZoneGroupInfoType  implements java.io.Serializable {
    private java.lang.Long zoneGroupId;

    private java.lang.String zoneGroupName;

    public DataZoneGroupInfoType() {
    }

    public DataZoneGroupInfoType(
           java.lang.Long zoneGroupId,
           java.lang.String zoneGroupName) {
           this.zoneGroupId = zoneGroupId;
           this.zoneGroupName = zoneGroupName;
    }


    /**
     * Gets the zoneGroupId value for this DataZoneGroupInfoType.
     * 
     * @return zoneGroupId
     */
    public java.lang.Long getZoneGroupId() {
        return zoneGroupId;
    }


    /**
     * Sets the zoneGroupId value for this DataZoneGroupInfoType.
     * 
     * @param zoneGroupId
     */
    public void setZoneGroupId(java.lang.Long zoneGroupId) {
        this.zoneGroupId = zoneGroupId;
    }


    /**
     * Gets the zoneGroupName value for this DataZoneGroupInfoType.
     * 
     * @return zoneGroupName
     */
    public java.lang.String getZoneGroupName() {
        return zoneGroupName;
    }


    /**
     * Sets the zoneGroupName value for this DataZoneGroupInfoType.
     * 
     * @param zoneGroupName
     */
    public void setZoneGroupName(java.lang.String zoneGroupName) {
        this.zoneGroupName = zoneGroupName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DataZoneGroupInfoType)) return false;
        DataZoneGroupInfoType other = (DataZoneGroupInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.zoneGroupId==null && other.getZoneGroupId()==null) || 
             (this.zoneGroupId!=null &&
              this.zoneGroupId.equals(other.getZoneGroupId()))) &&
            ((this.zoneGroupName==null && other.getZoneGroupName()==null) || 
             (this.zoneGroupName!=null &&
              this.zoneGroupName.equals(other.getZoneGroupName())));
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
        if (getZoneGroupId() != null) {
            _hashCode += getZoneGroupId().hashCode();
        }
        if (getZoneGroupName() != null) {
            _hashCode += getZoneGroupName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DataZoneGroupInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "DataZoneGroupInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zoneGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "zoneGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zoneGroupName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "zoneGroupName"));
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
