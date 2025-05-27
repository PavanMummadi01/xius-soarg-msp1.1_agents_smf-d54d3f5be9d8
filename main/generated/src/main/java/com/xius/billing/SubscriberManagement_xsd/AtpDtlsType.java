/**
 * AtpDtlsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class AtpDtlsType  implements java.io.Serializable {
    private java.lang.String servicePackageDesc;

    private java.lang.String servicePackageId;

    private java.lang.String publicityId;

    public AtpDtlsType() {
    }

    public AtpDtlsType(
           java.lang.String servicePackageDesc,
           java.lang.String servicePackageId,
           java.lang.String publicityId) {
           this.servicePackageDesc = servicePackageDesc;
           this.servicePackageId = servicePackageId;
           this.publicityId = publicityId;
    }


    /**
     * Gets the servicePackageDesc value for this AtpDtlsType.
     * 
     * @return servicePackageDesc
     */
    public java.lang.String getServicePackageDesc() {
        return servicePackageDesc;
    }


    /**
     * Sets the servicePackageDesc value for this AtpDtlsType.
     * 
     * @param servicePackageDesc
     */
    public void setServicePackageDesc(java.lang.String servicePackageDesc) {
        this.servicePackageDesc = servicePackageDesc;
    }


    /**
     * Gets the servicePackageId value for this AtpDtlsType.
     * 
     * @return servicePackageId
     */
    public java.lang.String getServicePackageId() {
        return servicePackageId;
    }


    /**
     * Sets the servicePackageId value for this AtpDtlsType.
     * 
     * @param servicePackageId
     */
    public void setServicePackageId(java.lang.String servicePackageId) {
        this.servicePackageId = servicePackageId;
    }


    /**
     * Gets the publicityId value for this AtpDtlsType.
     * 
     * @return publicityId
     */
    public java.lang.String getPublicityId() {
        return publicityId;
    }


    /**
     * Sets the publicityId value for this AtpDtlsType.
     * 
     * @param publicityId
     */
    public void setPublicityId(java.lang.String publicityId) {
        this.publicityId = publicityId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AtpDtlsType)) return false;
        AtpDtlsType other = (AtpDtlsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.servicePackageDesc==null && other.getServicePackageDesc()==null) || 
             (this.servicePackageDesc!=null &&
              this.servicePackageDesc.equals(other.getServicePackageDesc()))) &&
            ((this.servicePackageId==null && other.getServicePackageId()==null) || 
             (this.servicePackageId!=null &&
              this.servicePackageId.equals(other.getServicePackageId()))) &&
            ((this.publicityId==null && other.getPublicityId()==null) || 
             (this.publicityId!=null &&
              this.publicityId.equals(other.getPublicityId())));
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
        if (getServicePackageDesc() != null) {
            _hashCode += getServicePackageDesc().hashCode();
        }
        if (getServicePackageId() != null) {
            _hashCode += getServicePackageId().hashCode();
        }
        if (getPublicityId() != null) {
            _hashCode += getPublicityId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AtpDtlsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "atpDtlsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicePackageDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "servicePackageDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicePackageId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "servicePackageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "publicityId"));
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
