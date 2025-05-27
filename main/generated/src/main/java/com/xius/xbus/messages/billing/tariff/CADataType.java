/**
 * CADataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.tariff;

public class CADataType  implements java.io.Serializable {
    private java.lang.Long caPkgId;

    private java.lang.String caPkgName;

    private java.lang.String chargeId;

    private java.math.BigDecimal charge;

    public CADataType() {
    }

    public CADataType(
           java.lang.Long caPkgId,
           java.lang.String caPkgName,
           java.lang.String chargeId,
           java.math.BigDecimal charge) {
           this.caPkgId = caPkgId;
           this.caPkgName = caPkgName;
           this.chargeId = chargeId;
           this.charge = charge;
    }


    /**
     * Gets the caPkgId value for this CADataType.
     * 
     * @return caPkgId
     */
    public java.lang.Long getCaPkgId() {
        return caPkgId;
    }


    /**
     * Sets the caPkgId value for this CADataType.
     * 
     * @param caPkgId
     */
    public void setCaPkgId(java.lang.Long caPkgId) {
        this.caPkgId = caPkgId;
    }


    /**
     * Gets the caPkgName value for this CADataType.
     * 
     * @return caPkgName
     */
    public java.lang.String getCaPkgName() {
        return caPkgName;
    }


    /**
     * Sets the caPkgName value for this CADataType.
     * 
     * @param caPkgName
     */
    public void setCaPkgName(java.lang.String caPkgName) {
        this.caPkgName = caPkgName;
    }


    /**
     * Gets the chargeId value for this CADataType.
     * 
     * @return chargeId
     */
    public java.lang.String getChargeId() {
        return chargeId;
    }


    /**
     * Sets the chargeId value for this CADataType.
     * 
     * @param chargeId
     */
    public void setChargeId(java.lang.String chargeId) {
        this.chargeId = chargeId;
    }


    /**
     * Gets the charge value for this CADataType.
     * 
     * @return charge
     */
    public java.math.BigDecimal getCharge() {
        return charge;
    }


    /**
     * Sets the charge value for this CADataType.
     * 
     * @param charge
     */
    public void setCharge(java.math.BigDecimal charge) {
        this.charge = charge;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CADataType)) return false;
        CADataType other = (CADataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.caPkgId==null && other.getCaPkgId()==null) || 
             (this.caPkgId!=null &&
              this.caPkgId.equals(other.getCaPkgId()))) &&
            ((this.caPkgName==null && other.getCaPkgName()==null) || 
             (this.caPkgName!=null &&
              this.caPkgName.equals(other.getCaPkgName()))) &&
            ((this.chargeId==null && other.getChargeId()==null) || 
             (this.chargeId!=null &&
              this.chargeId.equals(other.getChargeId()))) &&
            ((this.charge==null && other.getCharge()==null) || 
             (this.charge!=null &&
              this.charge.equals(other.getCharge())));
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
        if (getCaPkgId() != null) {
            _hashCode += getCaPkgId().hashCode();
        }
        if (getCaPkgName() != null) {
            _hashCode += getCaPkgName().hashCode();
        }
        if (getChargeId() != null) {
            _hashCode += getChargeId().hashCode();
        }
        if (getCharge() != null) {
            _hashCode += getCharge().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CADataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "CADataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caPkgId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "caPkgId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caPkgName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "caPkgName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "chargeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("charge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "charge"));
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
