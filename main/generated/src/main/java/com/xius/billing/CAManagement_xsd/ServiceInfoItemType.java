/**
 * ServiceInfoItemType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.CAManagement_xsd;

public class ServiceInfoItemType  implements java.io.Serializable {
    private java.lang.Long servcId;

    private java.lang.String servcType;

    public ServiceInfoItemType() {
    }

    public ServiceInfoItemType(
           java.lang.Long servcId,
           java.lang.String servcType) {
           this.servcId = servcId;
           this.servcType = servcType;
    }


    /**
     * Gets the servcId value for this ServiceInfoItemType.
     * 
     * @return servcId
     */
    public java.lang.Long getServcId() {
        return servcId;
    }


    /**
     * Sets the servcId value for this ServiceInfoItemType.
     * 
     * @param servcId
     */
    public void setServcId(java.lang.Long servcId) {
        this.servcId = servcId;
    }


    /**
     * Gets the servcType value for this ServiceInfoItemType.
     * 
     * @return servcType
     */
    public java.lang.String getServcType() {
        return servcType;
    }


    /**
     * Sets the servcType value for this ServiceInfoItemType.
     * 
     * @param servcType
     */
    public void setServcType(java.lang.String servcType) {
        this.servcType = servcType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceInfoItemType)) return false;
        ServiceInfoItemType other = (ServiceInfoItemType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.servcId==null && other.getServcId()==null) || 
             (this.servcId!=null &&
              this.servcId.equals(other.getServcId()))) &&
            ((this.servcType==null && other.getServcType()==null) || 
             (this.servcType!=null &&
              this.servcType.equals(other.getServcType())));
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
        if (getServcId() != null) {
            _hashCode += getServcId().hashCode();
        }
        if (getServcType() != null) {
            _hashCode += getServcType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceInfoItemType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "ServiceInfoItemType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servcId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "servcId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servcType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "servcType"));
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
