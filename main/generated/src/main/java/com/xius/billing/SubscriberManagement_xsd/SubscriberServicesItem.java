/**
 * SubscriberServicesItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class SubscriberServicesItem  implements java.io.Serializable {
    private java.lang.Long basicServiceId;

    private java.lang.String basicServiceName;

    private java.lang.Long derivedServiceId;

    private java.lang.String derivedServiceName;

    private java.lang.String status;

    public SubscriberServicesItem() {
    }

    public SubscriberServicesItem(
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
     * Gets the basicServiceId value for this SubscriberServicesItem.
     * 
     * @return basicServiceId
     */
    public java.lang.Long getBasicServiceId() {
        return basicServiceId;
    }


    /**
     * Sets the basicServiceId value for this SubscriberServicesItem.
     * 
     * @param basicServiceId
     */
    public void setBasicServiceId(java.lang.Long basicServiceId) {
        this.basicServiceId = basicServiceId;
    }


    /**
     * Gets the basicServiceName value for this SubscriberServicesItem.
     * 
     * @return basicServiceName
     */
    public java.lang.String getBasicServiceName() {
        return basicServiceName;
    }


    /**
     * Sets the basicServiceName value for this SubscriberServicesItem.
     * 
     * @param basicServiceName
     */
    public void setBasicServiceName(java.lang.String basicServiceName) {
        this.basicServiceName = basicServiceName;
    }


    /**
     * Gets the derivedServiceId value for this SubscriberServicesItem.
     * 
     * @return derivedServiceId
     */
    public java.lang.Long getDerivedServiceId() {
        return derivedServiceId;
    }


    /**
     * Sets the derivedServiceId value for this SubscriberServicesItem.
     * 
     * @param derivedServiceId
     */
    public void setDerivedServiceId(java.lang.Long derivedServiceId) {
        this.derivedServiceId = derivedServiceId;
    }


    /**
     * Gets the derivedServiceName value for this SubscriberServicesItem.
     * 
     * @return derivedServiceName
     */
    public java.lang.String getDerivedServiceName() {
        return derivedServiceName;
    }


    /**
     * Sets the derivedServiceName value for this SubscriberServicesItem.
     * 
     * @param derivedServiceName
     */
    public void setDerivedServiceName(java.lang.String derivedServiceName) {
        this.derivedServiceName = derivedServiceName;
    }


    /**
     * Gets the status value for this SubscriberServicesItem.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this SubscriberServicesItem.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubscriberServicesItem)) return false;
        SubscriberServicesItem other = (SubscriberServicesItem) obj;
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
        new org.apache.axis.description.TypeDesc(SubscriberServicesItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "SubscriberServicesItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basicServiceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "basicServiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basicServiceName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "basicServiceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("derivedServiceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "derivedServiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("derivedServiceName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "derivedServiceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "status"));
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
