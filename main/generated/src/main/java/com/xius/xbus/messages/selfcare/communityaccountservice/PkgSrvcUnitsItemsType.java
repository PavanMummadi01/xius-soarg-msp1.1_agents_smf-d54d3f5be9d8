/**
 * PkgSrvcUnitsItemsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.selfcare.communityaccountservice;

public class PkgSrvcUnitsItemsType  implements java.io.Serializable {
    private long utsServiceId;

    private java.lang.String unitType;

    private long unitValue;

    private java.math.BigDecimal unitTopupCharge;

    private java.lang.Long srvcUnitLimit;

    public PkgSrvcUnitsItemsType() {
    }

    public PkgSrvcUnitsItemsType(
           long utsServiceId,
           java.lang.String unitType,
           long unitValue,
           java.math.BigDecimal unitTopupCharge,
           java.lang.Long srvcUnitLimit) {
           this.utsServiceId = utsServiceId;
           this.unitType = unitType;
           this.unitValue = unitValue;
           this.unitTopupCharge = unitTopupCharge;
           this.srvcUnitLimit = srvcUnitLimit;
    }


    /**
     * Gets the utsServiceId value for this PkgSrvcUnitsItemsType.
     * 
     * @return utsServiceId
     */
    public long getUtsServiceId() {
        return utsServiceId;
    }


    /**
     * Sets the utsServiceId value for this PkgSrvcUnitsItemsType.
     * 
     * @param utsServiceId
     */
    public void setUtsServiceId(long utsServiceId) {
        this.utsServiceId = utsServiceId;
    }


    /**
     * Gets the unitType value for this PkgSrvcUnitsItemsType.
     * 
     * @return unitType
     */
    public java.lang.String getUnitType() {
        return unitType;
    }


    /**
     * Sets the unitType value for this PkgSrvcUnitsItemsType.
     * 
     * @param unitType
     */
    public void setUnitType(java.lang.String unitType) {
        this.unitType = unitType;
    }


    /**
     * Gets the unitValue value for this PkgSrvcUnitsItemsType.
     * 
     * @return unitValue
     */
    public long getUnitValue() {
        return unitValue;
    }


    /**
     * Sets the unitValue value for this PkgSrvcUnitsItemsType.
     * 
     * @param unitValue
     */
    public void setUnitValue(long unitValue) {
        this.unitValue = unitValue;
    }


    /**
     * Gets the unitTopupCharge value for this PkgSrvcUnitsItemsType.
     * 
     * @return unitTopupCharge
     */
    public java.math.BigDecimal getUnitTopupCharge() {
        return unitTopupCharge;
    }


    /**
     * Sets the unitTopupCharge value for this PkgSrvcUnitsItemsType.
     * 
     * @param unitTopupCharge
     */
    public void setUnitTopupCharge(java.math.BigDecimal unitTopupCharge) {
        this.unitTopupCharge = unitTopupCharge;
    }


    /**
     * Gets the srvcUnitLimit value for this PkgSrvcUnitsItemsType.
     * 
     * @return srvcUnitLimit
     */
    public java.lang.Long getSrvcUnitLimit() {
        return srvcUnitLimit;
    }


    /**
     * Sets the srvcUnitLimit value for this PkgSrvcUnitsItemsType.
     * 
     * @param srvcUnitLimit
     */
    public void setSrvcUnitLimit(java.lang.Long srvcUnitLimit) {
        this.srvcUnitLimit = srvcUnitLimit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PkgSrvcUnitsItemsType)) return false;
        PkgSrvcUnitsItemsType other = (PkgSrvcUnitsItemsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.utsServiceId == other.getUtsServiceId() &&
            ((this.unitType==null && other.getUnitType()==null) || 
             (this.unitType!=null &&
              this.unitType.equals(other.getUnitType()))) &&
            this.unitValue == other.getUnitValue() &&
            ((this.unitTopupCharge==null && other.getUnitTopupCharge()==null) || 
             (this.unitTopupCharge!=null &&
              this.unitTopupCharge.equals(other.getUnitTopupCharge()))) &&
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
        _hashCode += new Long(getUtsServiceId()).hashCode();
        if (getUnitType() != null) {
            _hashCode += getUnitType().hashCode();
        }
        _hashCode += new Long(getUnitValue()).hashCode();
        if (getUnitTopupCharge() != null) {
            _hashCode += getUnitTopupCharge().hashCode();
        }
        if (getSrvcUnitLimit() != null) {
            _hashCode += getSrvcUnitLimit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PkgSrvcUnitsItemsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "PkgSrvcUnitsItemsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("utsServiceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "utsServiceId"));
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
        elemField.setFieldName("unitTopupCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "unitTopupCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
