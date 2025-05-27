/**
 * ChildLimitItemViewType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.CAManagement_xsd;

public class ChildLimitItemViewType  implements java.io.Serializable {
    private java.lang.Long srvcId;

    private java.lang.String srvcName;

    private java.lang.String unitType;

    private java.math.BigDecimal limitValue;

    private java.math.BigDecimal topUpCharge;

    public ChildLimitItemViewType() {
    }

    public ChildLimitItemViewType(
           java.lang.Long srvcId,
           java.lang.String srvcName,
           java.lang.String unitType,
           java.math.BigDecimal limitValue,
           java.math.BigDecimal topUpCharge) {
           this.srvcId = srvcId;
           this.srvcName = srvcName;
           this.unitType = unitType;
           this.limitValue = limitValue;
           this.topUpCharge = topUpCharge;
    }


    /**
     * Gets the srvcId value for this ChildLimitItemViewType.
     * 
     * @return srvcId
     */
    public java.lang.Long getSrvcId() {
        return srvcId;
    }


    /**
     * Sets the srvcId value for this ChildLimitItemViewType.
     * 
     * @param srvcId
     */
    public void setSrvcId(java.lang.Long srvcId) {
        this.srvcId = srvcId;
    }


    /**
     * Gets the srvcName value for this ChildLimitItemViewType.
     * 
     * @return srvcName
     */
    public java.lang.String getSrvcName() {
        return srvcName;
    }


    /**
     * Sets the srvcName value for this ChildLimitItemViewType.
     * 
     * @param srvcName
     */
    public void setSrvcName(java.lang.String srvcName) {
        this.srvcName = srvcName;
    }


    /**
     * Gets the unitType value for this ChildLimitItemViewType.
     * 
     * @return unitType
     */
    public java.lang.String getUnitType() {
        return unitType;
    }


    /**
     * Sets the unitType value for this ChildLimitItemViewType.
     * 
     * @param unitType
     */
    public void setUnitType(java.lang.String unitType) {
        this.unitType = unitType;
    }


    /**
     * Gets the limitValue value for this ChildLimitItemViewType.
     * 
     * @return limitValue
     */
    public java.math.BigDecimal getLimitValue() {
        return limitValue;
    }


    /**
     * Sets the limitValue value for this ChildLimitItemViewType.
     * 
     * @param limitValue
     */
    public void setLimitValue(java.math.BigDecimal limitValue) {
        this.limitValue = limitValue;
    }


    /**
     * Gets the topUpCharge value for this ChildLimitItemViewType.
     * 
     * @return topUpCharge
     */
    public java.math.BigDecimal getTopUpCharge() {
        return topUpCharge;
    }


    /**
     * Sets the topUpCharge value for this ChildLimitItemViewType.
     * 
     * @param topUpCharge
     */
    public void setTopUpCharge(java.math.BigDecimal topUpCharge) {
        this.topUpCharge = topUpCharge;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChildLimitItemViewType)) return false;
        ChildLimitItemViewType other = (ChildLimitItemViewType) obj;
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
            ((this.limitValue==null && other.getLimitValue()==null) || 
             (this.limitValue!=null &&
              this.limitValue.equals(other.getLimitValue()))) &&
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
        if (getLimitValue() != null) {
            _hashCode += getLimitValue().hashCode();
        }
        if (getTopUpCharge() != null) {
            _hashCode += getTopUpCharge().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChildLimitItemViewType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "ChildLimitItemViewType"));
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
        elemField.setFieldName("limitValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "limitValue"));
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
