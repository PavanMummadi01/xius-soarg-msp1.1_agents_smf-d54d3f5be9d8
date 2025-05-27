/**
 * DeviceGroupInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.CAManagement_xsd;

public class DeviceGroupInfoType  implements java.io.Serializable {
    private java.lang.Long deviceGroupSeqNo;

    private java.lang.String deviceGroupName;

    public DeviceGroupInfoType() {
    }

    public DeviceGroupInfoType(
           java.lang.Long deviceGroupSeqNo,
           java.lang.String deviceGroupName) {
           this.deviceGroupSeqNo = deviceGroupSeqNo;
           this.deviceGroupName = deviceGroupName;
    }


    /**
     * Gets the deviceGroupSeqNo value for this DeviceGroupInfoType.
     * 
     * @return deviceGroupSeqNo
     */
    public java.lang.Long getDeviceGroupSeqNo() {
        return deviceGroupSeqNo;
    }


    /**
     * Sets the deviceGroupSeqNo value for this DeviceGroupInfoType.
     * 
     * @param deviceGroupSeqNo
     */
    public void setDeviceGroupSeqNo(java.lang.Long deviceGroupSeqNo) {
        this.deviceGroupSeqNo = deviceGroupSeqNo;
    }


    /**
     * Gets the deviceGroupName value for this DeviceGroupInfoType.
     * 
     * @return deviceGroupName
     */
    public java.lang.String getDeviceGroupName() {
        return deviceGroupName;
    }


    /**
     * Sets the deviceGroupName value for this DeviceGroupInfoType.
     * 
     * @param deviceGroupName
     */
    public void setDeviceGroupName(java.lang.String deviceGroupName) {
        this.deviceGroupName = deviceGroupName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeviceGroupInfoType)) return false;
        DeviceGroupInfoType other = (DeviceGroupInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deviceGroupSeqNo==null && other.getDeviceGroupSeqNo()==null) || 
             (this.deviceGroupSeqNo!=null &&
              this.deviceGroupSeqNo.equals(other.getDeviceGroupSeqNo()))) &&
            ((this.deviceGroupName==null && other.getDeviceGroupName()==null) || 
             (this.deviceGroupName!=null &&
              this.deviceGroupName.equals(other.getDeviceGroupName())));
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
        if (getDeviceGroupSeqNo() != null) {
            _hashCode += getDeviceGroupSeqNo().hashCode();
        }
        if (getDeviceGroupName() != null) {
            _hashCode += getDeviceGroupName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeviceGroupInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "DeviceGroupInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceGroupSeqNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "deviceGroupSeqNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceGroupName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "deviceGroupName"));
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
