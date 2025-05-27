/**
 * PkgAddOnViewItemType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.CAManagement_xsd;

public class PkgAddOnViewItemType  implements java.io.Serializable {
    private java.lang.Long feturId;

    private java.lang.String feturName;

    private java.lang.Long priority;

    private java.math.BigDecimal charge;

    public PkgAddOnViewItemType() {
    }

    public PkgAddOnViewItemType(
           java.lang.Long feturId,
           java.lang.String feturName,
           java.lang.Long priority,
           java.math.BigDecimal charge) {
           this.feturId = feturId;
           this.feturName = feturName;
           this.priority = priority;
           this.charge = charge;
    }


    /**
     * Gets the feturId value for this PkgAddOnViewItemType.
     * 
     * @return feturId
     */
    public java.lang.Long getFeturId() {
        return feturId;
    }


    /**
     * Sets the feturId value for this PkgAddOnViewItemType.
     * 
     * @param feturId
     */
    public void setFeturId(java.lang.Long feturId) {
        this.feturId = feturId;
    }


    /**
     * Gets the feturName value for this PkgAddOnViewItemType.
     * 
     * @return feturName
     */
    public java.lang.String getFeturName() {
        return feturName;
    }


    /**
     * Sets the feturName value for this PkgAddOnViewItemType.
     * 
     * @param feturName
     */
    public void setFeturName(java.lang.String feturName) {
        this.feturName = feturName;
    }


    /**
     * Gets the priority value for this PkgAddOnViewItemType.
     * 
     * @return priority
     */
    public java.lang.Long getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this PkgAddOnViewItemType.
     * 
     * @param priority
     */
    public void setPriority(java.lang.Long priority) {
        this.priority = priority;
    }


    /**
     * Gets the charge value for this PkgAddOnViewItemType.
     * 
     * @return charge
     */
    public java.math.BigDecimal getCharge() {
        return charge;
    }


    /**
     * Sets the charge value for this PkgAddOnViewItemType.
     * 
     * @param charge
     */
    public void setCharge(java.math.BigDecimal charge) {
        this.charge = charge;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PkgAddOnViewItemType)) return false;
        PkgAddOnViewItemType other = (PkgAddOnViewItemType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.feturId==null && other.getFeturId()==null) || 
             (this.feturId!=null &&
              this.feturId.equals(other.getFeturId()))) &&
            ((this.feturName==null && other.getFeturName()==null) || 
             (this.feturName!=null &&
              this.feturName.equals(other.getFeturName()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
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
        if (getFeturId() != null) {
            _hashCode += getFeturId().hashCode();
        }
        if (getFeturName() != null) {
            _hashCode += getFeturName().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getCharge() != null) {
            _hashCode += getCharge().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PkgAddOnViewItemType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "PkgAddOnViewItemType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feturId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "feturId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feturName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "feturName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
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
