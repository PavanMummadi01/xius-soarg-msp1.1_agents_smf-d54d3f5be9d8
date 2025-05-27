/**
 * SubServicesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.tariff;

public class SubServicesType  implements java.io.Serializable {
    private java.lang.Long basicServiceId;

    private java.lang.String basicServiceName;

    private java.lang.Long derivedServiceId;

    private java.lang.String derivedServiceName;

    private java.lang.String status;

    public SubServicesType() {
    }

    public SubServicesType(
           java.lang.Long basicServiceId,
           java.lang.String basicServiceName,
           java.lang.Long derivedServiceId,
           java.lang.String derivedServiceName,
           java.lang.String status) {
           this.basicServiceId = basicServiceId;
           this.basicServiceName = basicServiceName;
           this.derivedServiceId = derivedServiceId;
           this.derivedServiceName = derivedServiceName;
           this.status = status;
    }


    /**
     * Gets the basicServiceId value for this SubServicesType.
     * 
     * @return basicServiceId
     */
    public java.lang.Long getBasicServiceId() {
        return basicServiceId;
    }


    /**
     * Sets the basicServiceId value for this SubServicesType.
     * 
     * @param basicServiceId
     */
    public void setBasicServiceId(java.lang.Long basicServiceId) {
        this.basicServiceId = basicServiceId;
    }


    /**
     * Gets the basicServiceName value for this SubServicesType.
     * 
     * @return basicServiceName
     */
    public java.lang.String getBasicServiceName() {
        return basicServiceName;
    }


    /**
     * Sets the basicServiceName value for this SubServicesType.
     * 
     * @param basicServiceName
     */
    public void setBasicServiceName(java.lang.String basicServiceName) {
        this.basicServiceName = basicServiceName;
    }


    /**
     * Gets the derivedServiceId value for this SubServicesType.
     * 
     * @return derivedServiceId
     */
    public java.lang.Long getDerivedServiceId() {
        return derivedServiceId;
    }


    /**
     * Sets the derivedServiceId value for this SubServicesType.
     * 
     * @param derivedServiceId
     */
    public void setDerivedServiceId(java.lang.Long derivedServiceId) {
        this.derivedServiceId = derivedServiceId;
    }


    /**
     * Gets the derivedServiceName value for this SubServicesType.
     * 
     * @return derivedServiceName
     */
    public java.lang.String getDerivedServiceName() {
        return derivedServiceName;
    }


    /**
     * Sets the derivedServiceName value for this SubServicesType.
     * 
     * @param derivedServiceName
     */
    public void setDerivedServiceName(java.lang.String derivedServiceName) {
        this.derivedServiceName = derivedServiceName;
    }


    /**
     * Gets the status value for this SubServicesType.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this SubServicesType.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubServicesType)) return false;
        SubServicesType other = (SubServicesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.basicServiceId==null && other.getBasicServiceId()==null) || 
             (this.basicServiceId!=null &&
              this.basicServiceId.equals(other.getBasicServiceId()))) &&
            ((this.basicServiceName==null && other.getBasicServiceName()==null) || 
             (this.basicServiceName!=null &&
              this.basicServiceName.equals(other.getBasicServiceName()))) &&
            ((this.derivedServiceId==null && other.getDerivedServiceId()==null) || 
             (this.derivedServiceId!=null &&
              this.derivedServiceId.equals(other.getDerivedServiceId()))) &&
            ((this.derivedServiceName==null && other.getDerivedServiceName()==null) || 
             (this.derivedServiceName!=null &&
              this.derivedServiceName.equals(other.getDerivedServiceName()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getBasicServiceId() != null) {
            _hashCode += getBasicServiceId().hashCode();
        }
        if (getBasicServiceName() != null) {
            _hashCode += getBasicServiceName().hashCode();
        }
        if (getDerivedServiceId() != null) {
            _hashCode += getDerivedServiceId().hashCode();
        }
        if (getDerivedServiceName() != null) {
            _hashCode += getDerivedServiceName().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubServicesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "SubServicesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basicServiceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "basicServiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basicServiceName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "basicServiceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("derivedServiceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "derivedServiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("derivedServiceName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "derivedServiceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "status"));
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
