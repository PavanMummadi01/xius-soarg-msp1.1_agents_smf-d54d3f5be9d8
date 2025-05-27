/**
 * SrvcUnitsItemViewType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.CAManagement_xsd;

public class SrvcUnitsItemViewType  implements java.io.Serializable {
    private java.lang.Long srvcId;

    private java.lang.String srvcName;

    private java.lang.String unitType;

    private java.math.BigDecimal unitValue;

    private java.math.BigDecimal topUpCharge;

    public SrvcUnitsItemViewType() {
    }

    public SrvcUnitsItemViewType(
           java.lang.Long srvcId,
           java.lang.String srvcName,
           java.lang.String unitType,
           java.math.BigDecimal unitValue,
           java.math.BigDecimal topUpCharge) {
           this.srvcId = srvcId;
           this.srvcName = srvcName;
           this.unitType = unitType;
           this.unitValue = unitValue;
           this.topUpCharge = topUpCharge;
    }


    /**
     * Gets the srvcId value for this SrvcUnitsItemViewType.
     * 
     * @return srvcId
     */
    public java.lang.Long getSrvcId() {
        return srvcId;
    }


    /**
     * Sets the srvcId value for this SrvcUnitsItemViewType.
     * 
     * @param srvcId
     */
    public void setSrvcId(java.lang.Long srvcId) {
        this.srvcId = srvcId;
    }


    /**
     * Gets the srvcName value for this SrvcUnitsItemViewType.
     * 
     * @return srvcName
     */
    public java.lang.String getSrvcName() {
        return srvcName;
    }


    /**
     * Sets the srvcName value for this SrvcUnitsItemViewType.
     * 
     * @param srvcName
     */
    public void setSrvcName(java.lang.String srvcName) {
        this.srvcName = srvcName;
    }


    /**
     * Gets the unitType value for this SrvcUnitsItemViewType.
     * 
     * @return unitType
     */
    public java.lang.String getUnitType() {
        return unitType;
    }


    /**
     * Sets the unitType value for this SrvcUnitsItemViewType.
     * 
     * @param unitType
     */
    public void setUnitType(java.lang.String unitType) {
        this.unitType = unitType;
    }


    /**
     * Gets the unitValue value for this SrvcUnitsItemViewType.
     * 
     * @return unitValue
     */
    public java.math.BigDecimal getUnitValue() {
        return unitValue;
    }


    /**
     * Sets the unitValue value for this SrvcUnitsItemViewType.
     * 
     * @param unitValue
     */
    public void setUnitValue(java.math.BigDecimal unitValue) {
        this.unitValue = unitValue;
    }


    /**
     * Gets the topUpCharge value for this SrvcUnitsItemViewType.
     * 
     * @return topUpCharge
     */
    public java.math.BigDecimal getTopUpCharge() {
        return topUpCharge;
    }


    /**
     * Sets the topUpCharge value for this SrvcUnitsItemViewType.
     * 
     * @param topUpCharge
     */
    public void setTopUpCharge(java.math.BigDecimal topUpCharge) {
        this.topUpCharge = topUpCharge;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SrvcUnitsItemViewType)) return false;
        SrvcUnitsItemViewType other = (SrvcUnitsItemViewType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.srvcId==null && other.getSrvcId()==null) || 
             (this.srvcId!=null &&
              this.srvcId.equals(other.getSrvcId()))) &&
            ((this.srvcName==null && other.getSrvcName()==null) || 
             (this.srvcName!=null &&
              this.srvcName.equals(other.getSrvcName()))) &&
            ((this.unitType==null && other.getUnitType()==null) || 
             (this.unitType!=null &&
              this.unitType.equals(other.getUnitType()))) &&
            ((this.unitValue==null && other.getUnitValue()==null) || 
             (this.unitValue!=null &&
              this.unitValue.equals(other.getUnitValue()))) &&
            ((this.topUpCharge==null && other.getTopUpCharge()==null) || 
             (this.topUpCharge!=null &&
              this.topUpCharge.equals(other.getTopUpCharge())));
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
        if (getSrvcId() != null) {
            _hashCode += getSrvcId().hashCode();
        }
        if (getSrvcName() != null) {
            _hashCode += getSrvcName().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SrvcUnitsItemViewType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "SrvcUnitsItemViewType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srvcId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "srvcId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srvcName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "srvcName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "unitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "unitValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topUpCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "topUpCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
