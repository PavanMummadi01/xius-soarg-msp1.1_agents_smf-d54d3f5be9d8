/**
 * ServUnitsItemViewType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.selfcare.communityaccountservice;

public class ServUnitsItemViewType  implements java.io.Serializable {
    private java.lang.Long serviceId;

    private java.lang.String serviceName;

    private java.lang.String unitType;

    private java.math.BigDecimal unitValue;

    private java.math.BigDecimal topUpCharge;

    private java.lang.Long srvcUnitLimit;

    public ServUnitsItemViewType() {
    }

    public ServUnitsItemViewType(
           java.lang.Long serviceId,
           java.lang.String serviceName,
           java.lang.String unitType,
           java.math.BigDecimal unitValue,
           java.math.BigDecimal topUpCharge,
           java.lang.Long srvcUnitLimit) {
           this.serviceId = serviceId;
           this.serviceName = serviceName;
           this.unitType = unitType;
           this.unitValue = unitValue;
           this.topUpCharge = topUpCharge;
           this.srvcUnitLimit = srvcUnitLimit;
    }


    /**
     * Gets the serviceId value for this ServUnitsItemViewType.
     * 
     * @return serviceId
     */
    public java.lang.Long getServiceId() {
        return serviceId;
    }


    /**
     * Sets the serviceId value for this ServUnitsItemViewType.
     * 
     * @param serviceId
     */
    public void setServiceId(java.lang.Long serviceId) {
        this.serviceId = serviceId;
    }


    /**
     * Gets the serviceName value for this ServUnitsItemViewType.
     * 
     * @return serviceName
     */
    public java.lang.String getServiceName() {
        return serviceName;
    }


    /**
     * Sets the serviceName value for this ServUnitsItemViewType.
     * 
     * @param serviceName
     */
    public void setServiceName(java.lang.String serviceName) {
        this.serviceName = serviceName;
    }


    /**
     * Gets the unitType value for this ServUnitsItemViewType.
     * 
     * @return unitType
     */
    public java.lang.String getUnitType() {
        return unitType;
    }


    /**
     * Sets the unitType value for this ServUnitsItemViewType.
     * 
     * @param unitType
     */
    public void setUnitType(java.lang.String unitType) {
        this.unitType = unitType;
    }


    /**
     * Gets the unitValue value for this ServUnitsItemViewType.
     * 
     * @return unitValue
     */
    public java.math.BigDecimal getUnitValue() {
        return unitValue;
    }


    /**
     * Sets the unitValue value for this ServUnitsItemViewType.
     * 
     * @param unitValue
     */
    public void setUnitValue(java.math.BigDecimal unitValue) {
        this.unitValue = unitValue;
    }


    /**
     * Gets the topUpCharge value for this ServUnitsItemViewType.
     * 
     * @return topUpCharge
     */
    public java.math.BigDecimal getTopUpCharge() {
        return topUpCharge;
    }


    /**
     * Sets the topUpCharge value for this ServUnitsItemViewType.
     * 
     * @param topUpCharge
     */
    public void setTopUpCharge(java.math.BigDecimal topUpCharge) {
        this.topUpCharge = topUpCharge;
    }


    /**
     * Gets the srvcUnitLimit value for this ServUnitsItemViewType.
     * 
     * @return srvcUnitLimit
     */
    public java.lang.Long getSrvcUnitLimit() {
        return srvcUnitLimit;
    }


    /**
     * Sets the srvcUnitLimit value for this ServUnitsItemViewType.
     * 
     * @param srvcUnitLimit
     */
    public void setSrvcUnitLimit(java.lang.Long srvcUnitLimit) {
        this.srvcUnitLimit = srvcUnitLimit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServUnitsItemViewType)) return false;
        ServUnitsItemViewType other = (ServUnitsItemViewType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serviceId==null && other.getServiceId()==null) || 
             (this.serviceId!=null &&
              this.serviceId.equals(other.getServiceId()))) &&
            ((this.serviceName==null && other.getServiceName()==null) || 
             (this.serviceName!=null &&
              this.serviceName.equals(other.getServiceName()))) &&
            ((this.unitType==null && other.getUnitType()==null) || 
             (this.unitType!=null &&
              this.unitType.equals(other.getUnitType()))) &&
            ((this.unitValue==null && other.getUnitValue()==null) || 
             (this.unitValue!=null &&
              this.unitValue.equals(other.getUnitValue()))) &&
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
        if (getServiceId() != null) {
            _hashCode += getServiceId().hashCode();
        }
        if (getServiceName() != null) {
            _hashCode += getServiceName().hashCode();
        }
        if (getUnitType() != null) {
            _hashCode += getUnitType().hashCode();
        }
        if (getUnitValue() != null) {
            _hashCode += getUnitValue().hashCode();
        }
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
        new org.apache.axis.description.TypeDesc(ServUnitsItemViewType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "ServUnitsItemViewType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "serviceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "serviceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "unitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "unitValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
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
