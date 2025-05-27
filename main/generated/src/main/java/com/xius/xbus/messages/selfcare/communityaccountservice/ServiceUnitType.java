/**
 * ServiceUnitType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.selfcare.communityaccountservice;

public class ServiceUnitType  implements java.io.Serializable {
    private long serviceId;

    private java.lang.String unitType;

    private long unitValue;

    private java.math.BigDecimal topUpCharge;

    private java.lang.Long srvcUnitLimit;

    public ServiceUnitType() {
    }

    public ServiceUnitType(
           long serviceId,
           java.lang.String unitType,
           long unitValue,
           java.math.BigDecimal topUpCharge,
           java.lang.Long srvcUnitLimit) {
           this.serviceId = serviceId;
           this.unitType = unitType;
           this.unitValue = unitValue;
           this.topUpCharge = topUpCharge;
           this.srvcUnitLimit = srvcUnitLimit;
    }


    /**
     * Gets the serviceId value for this ServiceUnitType.
     * 
     * @return serviceId
     */
    public long getServiceId() {
        return serviceId;
    }


    /**
     * Sets the serviceId value for this ServiceUnitType.
     * 
     * @param serviceId
     */
    public void setServiceId(long serviceId) {
        this.serviceId = serviceId;
    }


    /**
     * Gets the unitType value for this ServiceUnitType.
     * 
     * @return unitType
     */
    public java.lang.String getUnitType() {
        return unitType;
    }


    /**
     * Sets the unitType value for this ServiceUnitType.
     * 
     * @param unitType
     */
    public void setUnitType(java.lang.String unitType) {
        this.unitType = unitType;
    }


    /**
     * Gets the unitValue value for this ServiceUnitType.
     * 
     * @return unitValue
     */
    public long getUnitValue() {
        return unitValue;
    }


    /**
     * Sets the unitValue value for this ServiceUnitType.
     * 
     * @param unitValue
     */
    public void setUnitValue(long unitValue) {
        this.unitValue = unitValue;
    }


    /**
     * Gets the topUpCharge value for this ServiceUnitType.
     * 
     * @return topUpCharge
     */
    public java.math.BigDecimal getTopUpCharge() {
        return topUpCharge;
    }


    /**
     * Sets the topUpCharge value for this ServiceUnitType.
     * 
     * @param topUpCharge
     */
    public void setTopUpCharge(java.math.BigDecimal topUpCharge) {
        this.topUpCharge = topUpCharge;
    }


    /**
     * Gets the srvcUnitLimit value for this ServiceUnitType.
     * 
     * @return srvcUnitLimit
     */
    public java.lang.Long getSrvcUnitLimit() {
        return srvcUnitLimit;
    }


    /**
     * Sets the srvcUnitLimit value for this ServiceUnitType.
     * 
     * @param srvcUnitLimit
     */
    public void setSrvcUnitLimit(java.lang.Long srvcUnitLimit) {
        this.srvcUnitLimit = srvcUnitLimit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceUnitType)) return false;
        ServiceUnitType other = (ServiceUnitType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.serviceId == other.getServiceId() &&
            ((this.unitType==null && other.getUnitType()==null) || 
             (this.unitType!=null &&
              this.unitType.equals(other.getUnitType()))) &&
            this.unitValue == other.getUnitValue() &&
            ((this.topUpCharge==null && other.getTopUpCharge()==null) || 
             (this.topUpCharge!=null &&
              this.topUpCharge.equals(other.getTopUpCharge()))) &&
            ((this.srvcUnitLimit==null && other.getSrvcUnitLimit()==null) || 
             (this.srvcUnitLimit!=null &&
              this.srvcUnitLimit.equals(other.getSrvcUnitLimit())));
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
        _hashCode += new Long(getServiceId()).hashCode();
        if (getUnitType() != null) {
            _hashCode += getUnitType().hashCode();
        }
        _hashCode += new Long(getUnitValue()).hashCode();
        if (getTopUpCharge() != null) {
            _hashCode += getTopUpCharge().hashCode();
        }
        if (getSrvcUnitLimit() != null) {
            _hashCode += getSrvcUnitLimit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceUnitType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "ServiceUnitType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "serviceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "unitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "unitValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topUpCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "topUpCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srvcUnitLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "srvcUnitLimit"));
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
