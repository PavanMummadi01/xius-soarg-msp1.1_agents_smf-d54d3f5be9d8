/**
 * PkgServcUnitsItemType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.CAManagement_xsd;

public class PkgServcUnitsItemType  implements java.io.Serializable {
    private long unitsSrvcId;

    private java.lang.String unitType;

    private long unitValue;

    private java.lang.Long srvcUnitLimit;

    public PkgServcUnitsItemType() {
    }

    public PkgServcUnitsItemType(
           long unitsSrvcId,
           java.lang.String unitType,
           long unitValue,
           java.lang.Long srvcUnitLimit) {
           this.unitsSrvcId = unitsSrvcId;
           this.unitType = unitType;
           this.unitValue = unitValue;
           this.srvcUnitLimit = srvcUnitLimit;
    }


    /**
     * Gets the unitsSrvcId value for this PkgServcUnitsItemType.
     * 
     * @return unitsSrvcId
     */
    public long getUnitsSrvcId() {
        return unitsSrvcId;
    }


    /**
     * Sets the unitsSrvcId value for this PkgServcUnitsItemType.
     * 
     * @param unitsSrvcId
     */
    public void setUnitsSrvcId(long unitsSrvcId) {
        this.unitsSrvcId = unitsSrvcId;
    }


    /**
     * Gets the unitType value for this PkgServcUnitsItemType.
     * 
     * @return unitType
     */
    public java.lang.String getUnitType() {
        return unitType;
    }


    /**
     * Sets the unitType value for this PkgServcUnitsItemType.
     * 
     * @param unitType
     */
    public void setUnitType(java.lang.String unitType) {
        this.unitType = unitType;
    }


    /**
     * Gets the unitValue value for this PkgServcUnitsItemType.
     * 
     * @return unitValue
     */
    public long getUnitValue() {
        return unitValue;
    }


    /**
     * Sets the unitValue value for this PkgServcUnitsItemType.
     * 
     * @param unitValue
     */
    public void setUnitValue(long unitValue) {
        this.unitValue = unitValue;
    }


    /**
     * Gets the srvcUnitLimit value for this PkgServcUnitsItemType.
     * 
     * @return srvcUnitLimit
     */
    public java.lang.Long getSrvcUnitLimit() {
        return srvcUnitLimit;
    }


    /**
     * Sets the srvcUnitLimit value for this PkgServcUnitsItemType.
     * 
     * @param srvcUnitLimit
     */
    public void setSrvcUnitLimit(java.lang.Long srvcUnitLimit) {
        this.srvcUnitLimit = srvcUnitLimit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PkgServcUnitsItemType)) return false;
        PkgServcUnitsItemType other = (PkgServcUnitsItemType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.unitsSrvcId == other.getUnitsSrvcId() &&
            ((this.unitType==null && other.getUnitType()==null) || 
             (this.unitType!=null &&
              this.unitType.equals(other.getUnitType()))) &&
            this.unitValue == other.getUnitValue() &&
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
        _hashCode += new Long(getUnitsSrvcId()).hashCode();
        if (getUnitType() != null) {
            _hashCode += getUnitType().hashCode();
        }
        _hashCode += new Long(getUnitValue()).hashCode();
        if (getSrvcUnitLimit() != null) {
            _hashCode += getSrvcUnitLimit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PkgServcUnitsItemType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "PkgServcUnitsItemType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitsSrvcId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "unitsSrvcId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "unitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "unitValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srvcUnitLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "srvcUnitLimit"));
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
