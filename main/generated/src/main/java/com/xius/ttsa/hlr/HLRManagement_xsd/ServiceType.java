/**
 * ServiceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.ttsa.hlr.HLRManagement_xsd;

public class ServiceType  implements java.io.Serializable {
    private java.lang.Integer ssCode;

    private java.lang.Integer subUnsubFlag;

    public ServiceType() {
    }

    public ServiceType(
           java.lang.Integer ssCode,
           java.lang.Integer subUnsubFlag) {
           this.ssCode = ssCode;
           this.subUnsubFlag = subUnsubFlag;
    }


    /**
     * Gets the ssCode value for this ServiceType.
     * 
     * @return ssCode
     */
    public java.lang.Integer getSsCode() {
        return ssCode;
    }


    /**
     * Sets the ssCode value for this ServiceType.
     * 
     * @param ssCode
     */
    public void setSsCode(java.lang.Integer ssCode) {
        this.ssCode = ssCode;
    }


    /**
     * Gets the subUnsubFlag value for this ServiceType.
     * 
     * @return subUnsubFlag
     */
    public java.lang.Integer getSubUnsubFlag() {
        return subUnsubFlag;
    }


    /**
     * Sets the subUnsubFlag value for this ServiceType.
     * 
     * @param subUnsubFlag
     */
    public void setSubUnsubFlag(java.lang.Integer subUnsubFlag) {
        this.subUnsubFlag = subUnsubFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceType)) return false;
        ServiceType other = (ServiceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ssCode==null && other.getSsCode()==null) || 
             (this.ssCode!=null &&
              this.ssCode.equals(other.getSsCode()))) &&
            ((this.subUnsubFlag==null && other.getSubUnsubFlag()==null) || 
             (this.subUnsubFlag!=null &&
              this.subUnsubFlag.equals(other.getSubUnsubFlag())));
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
        if (getSsCode() != null) {
            _hashCode += getSsCode().hashCode();
        }
        if (getSubUnsubFlag() != null) {
            _hashCode += getSubUnsubFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "ServiceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ssCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "ssCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subUnsubFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "subUnsubFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
