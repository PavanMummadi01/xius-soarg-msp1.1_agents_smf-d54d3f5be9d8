/**
 * PkgAddOnItemType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.CAManagement_xsd;

public class PkgAddOnItemType  implements java.io.Serializable {
    private long feturId;

    private long priority;

    private java.math.BigDecimal charge;

    public PkgAddOnItemType() {
    }

    public PkgAddOnItemType(
           long feturId,
           long priority,
           java.math.BigDecimal charge) {
           this.feturId = feturId;
           this.priority = priority;
           this.charge = charge;
    }


    /**
     * Gets the feturId value for this PkgAddOnItemType.
     * 
     * @return feturId
     */
    public long getFeturId() {
        return feturId;
    }


    /**
     * Sets the feturId value for this PkgAddOnItemType.
     * 
     * @param feturId
     */
    public void setFeturId(long feturId) {
        this.feturId = feturId;
    }


    /**
     * Gets the priority value for this PkgAddOnItemType.
     * 
     * @return priority
     */
    public long getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this PkgAddOnItemType.
     * 
     * @param priority
     */
    public void setPriority(long priority) {
        this.priority = priority;
    }


    /**
     * Gets the charge value for this PkgAddOnItemType.
     * 
     * @return charge
     */
    public java.math.BigDecimal getCharge() {
        return charge;
    }


    /**
     * Sets the charge value for this PkgAddOnItemType.
     * 
     * @param charge
     */
    public void setCharge(java.math.BigDecimal charge) {
        this.charge = charge;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PkgAddOnItemType)) return false;
        PkgAddOnItemType other = (PkgAddOnItemType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.feturId == other.getFeturId() &&
            this.priority == other.getPriority() &&
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
        _hashCode += new Long(getFeturId()).hashCode();
        _hashCode += new Long(getPriority()).hashCode();
        if (getCharge() != null) {
            _hashCode += getCharge().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PkgAddOnItemType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "PkgAddOnItemType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feturId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "feturId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("charge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "charge"));
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
