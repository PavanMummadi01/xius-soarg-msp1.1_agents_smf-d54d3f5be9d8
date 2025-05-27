/**
 * PkgSrvcUtsViewItemType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.selfcare.communityaccountservice;

public class PkgSrvcUtsViewItemType  implements java.io.Serializable {
    private java.lang.Long unitsSrvcId;

    private java.lang.String unitsSrvcName;

    private java.lang.String unitType;

    private java.lang.Long unitValue;

    private java.lang.String unitTopUpCharge;

    private java.lang.Long servUnitMaxTransPecen;

    private java.lang.Long servUnitMaxTransLimit;

    public PkgSrvcUtsViewItemType() {
    }

    public PkgSrvcUtsViewItemType(
           java.lang.Long unitsSrvcId,
           java.lang.String unitsSrvcName,
           java.lang.String unitType,
           java.lang.Long unitValue,
           java.lang.String unitTopUpCharge,
           java.lang.Long servUnitMaxTransPecen,
           java.lang.Long servUnitMaxTransLimit) {
           this.unitsSrvcId = unitsSrvcId;
           this.unitsSrvcName = unitsSrvcName;
           this.unitType = unitType;
           this.unitValue = unitValue;
           this.unitTopUpCharge = unitTopUpCharge;
           this.servUnitMaxTransPecen = servUnitMaxTransPecen;
           this.servUnitMaxTransLimit = servUnitMaxTransLimit;
    }


    /**
     * Gets the unitsSrvcId value for this PkgSrvcUtsViewItemType.
     * 
     * @return unitsSrvcId
     */
    public java.lang.Long getUnitsSrvcId() {
        return unitsSrvcId;
    }


    /**
     * Sets the unitsSrvcId value for this PkgSrvcUtsViewItemType.
     * 
     * @param unitsSrvcId
     */
    public void setUnitsSrvcId(java.lang.Long unitsSrvcId) {
        this.unitsSrvcId = unitsSrvcId;
    }


    /**
     * Gets the unitsSrvcName value for this PkgSrvcUtsViewItemType.
     * 
     * @return unitsSrvcName
     */
    public java.lang.String getUnitsSrvcName() {
        return unitsSrvcName;
    }


    /**
     * Sets the unitsSrvcName value for this PkgSrvcUtsViewItemType.
     * 
     * @param unitsSrvcName
     */
    public void setUnitsSrvcName(java.lang.String unitsSrvcName) {
        this.unitsSrvcName = unitsSrvcName;
    }


    /**
     * Gets the unitType value for this PkgSrvcUtsViewItemType.
     * 
     * @return unitType
     */
    public java.lang.String getUnitType() {
        return unitType;
    }


    /**
     * Sets the unitType value for this PkgSrvcUtsViewItemType.
     * 
     * @param unitType
     */
    public void setUnitType(java.lang.String unitType) {
        this.unitType = unitType;
    }


    /**
     * Gets the unitValue value for this PkgSrvcUtsViewItemType.
     * 
     * @return unitValue
     */
    public java.lang.Long getUnitValue() {
        return unitValue;
    }


    /**
     * Sets the unitValue value for this PkgSrvcUtsViewItemType.
     * 
     * @param unitValue
     */
    public void setUnitValue(java.lang.Long unitValue) {
        this.unitValue = unitValue;
    }


    /**
     * Gets the unitTopUpCharge value for this PkgSrvcUtsViewItemType.
     * 
     * @return unitTopUpCharge
     */
    public java.lang.String getUnitTopUpCharge() {
        return unitTopUpCharge;
    }


    /**
     * Sets the unitTopUpCharge value for this PkgSrvcUtsViewItemType.
     * 
     * @param unitTopUpCharge
     */
    public void setUnitTopUpCharge(java.lang.String unitTopUpCharge) {
        this.unitTopUpCharge = unitTopUpCharge;
    }


    /**
     * Gets the servUnitMaxTransPecen value for this PkgSrvcUtsViewItemType.
     * 
     * @return servUnitMaxTransPecen
     */
    public java.lang.Long getServUnitMaxTransPecen() {
        return servUnitMaxTransPecen;
    }


    /**
     * Sets the servUnitMaxTransPecen value for this PkgSrvcUtsViewItemType.
     * 
     * @param servUnitMaxTransPecen
     */
    public void setServUnitMaxTransPecen(java.lang.Long servUnitMaxTransPecen) {
        this.servUnitMaxTransPecen = servUnitMaxTransPecen;
    }


    /**
     * Gets the servUnitMaxTransLimit value for this PkgSrvcUtsViewItemType.
     * 
     * @return servUnitMaxTransLimit
     */
    public java.lang.Long getServUnitMaxTransLimit() {
        return servUnitMaxTransLimit;
    }


    /**
     * Sets the servUnitMaxTransLimit value for this PkgSrvcUtsViewItemType.
     * 
     * @param servUnitMaxTransLimit
     */
    public void setServUnitMaxTransLimit(java.lang.Long servUnitMaxTransLimit) {
        this.servUnitMaxTransLimit = servUnitMaxTransLimit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PkgSrvcUtsViewItemType)) return false;
        PkgSrvcUtsViewItemType other = (PkgSrvcUtsViewItemType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.unitsSrvcId==null && other.getUnitsSrvcId()==null) || 
             (this.unitsSrvcId!=null &&
              this.unitsSrvcId.equals(other.getUnitsSrvcId()))) &&
            ((this.unitsSrvcName==null && other.getUnitsSrvcName()==null) || 
             (this.unitsSrvcName!=null &&
              this.unitsSrvcName.equals(other.getUnitsSrvcName()))) &&
            ((this.unitType==null && other.getUnitType()==null) || 
             (this.unitType!=null &&
              this.unitType.equals(other.getUnitType()))) &&
            ((this.unitValue==null && other.getUnitValue()==null) || 
             (this.unitValue!=null &&
              this.unitValue.equals(other.getUnitValue()))) &&
            ((this.unitTopUpCharge==null && other.getUnitTopUpCharge()==null) || 
             (this.unitTopUpCharge!=null &&
              this.unitTopUpCharge.equals(other.getUnitTopUpCharge()))) &&
            ((this.servUnitMaxTransPecen==null && other.getServUnitMaxTransPecen()==null) || 
             (this.servUnitMaxTransPecen!=null &&
              this.servUnitMaxTransPecen.equals(other.getServUnitMaxTransPecen()))) &&
            ((this.servUnitMaxTransLimit==null && other.getServUnitMaxTransLimit()==null) || 
             (this.servUnitMaxTransLimit!=null &&
              this.servUnitMaxTransLimit.equals(other.getServUnitMaxTransLimit())));
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
        if (getUnitsSrvcId() != null) {
            _hashCode += getUnitsSrvcId().hashCode();
        }
        if (getUnitsSrvcName() != null) {
            _hashCode += getUnitsSrvcName().hashCode();
        }
        if (getUnitType() != null) {
            _hashCode += getUnitType().hashCode();
        }
        if (getUnitValue() != null) {
            _hashCode += getUnitValue().hashCode();
        }
        if (getUnitTopUpCharge() != null) {
            _hashCode += getUnitTopUpCharge().hashCode();
        }
        if (getServUnitMaxTransPecen() != null) {
            _hashCode += getServUnitMaxTransPecen().hashCode();
        }
        if (getServUnitMaxTransLimit() != null) {
            _hashCode += getServUnitMaxTransLimit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PkgSrvcUtsViewItemType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "PkgSrvcUtsViewItemType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitsSrvcId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "unitsSrvcId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitsSrvcName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "unitsSrvcName"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitTopUpCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "unitTopUpCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servUnitMaxTransPecen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "servUnitMaxTransPecen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servUnitMaxTransLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "servUnitMaxTransLimit"));
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
