/**
 * BalanceIdDtlsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class BalanceIdDtlsType  implements java.io.Serializable {
    private java.lang.String balanceCategory;

    private java.lang.String balanceId;

    public BalanceIdDtlsType() {
    }

    public BalanceIdDtlsType(
           java.lang.String balanceCategory,
           java.lang.String balanceId) {
           this.balanceCategory = balanceCategory;
           this.balanceId = balanceId;
    }


    /**
     * Gets the balanceCategory value for this BalanceIdDtlsType.
     * 
     * @return balanceCategory
     */
    public java.lang.String getBalanceCategory() {
        return balanceCategory;
    }


    /**
     * Sets the balanceCategory value for this BalanceIdDtlsType.
     * 
     * @param balanceCategory
     */
    public void setBalanceCategory(java.lang.String balanceCategory) {
        this.balanceCategory = balanceCategory;
    }


    /**
     * Gets the balanceId value for this BalanceIdDtlsType.
     * 
     * @return balanceId
     */
    public java.lang.String getBalanceId() {
        return balanceId;
    }


    /**
     * Sets the balanceId value for this BalanceIdDtlsType.
     * 
     * @param balanceId
     */
    public void setBalanceId(java.lang.String balanceId) {
        this.balanceId = balanceId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BalanceIdDtlsType)) return false;
        BalanceIdDtlsType other = (BalanceIdDtlsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.balanceCategory==null && other.getBalanceCategory()==null) || 
             (this.balanceCategory!=null &&
              this.balanceCategory.equals(other.getBalanceCategory()))) &&
            ((this.balanceId==null && other.getBalanceId()==null) || 
             (this.balanceId!=null &&
              this.balanceId.equals(other.getBalanceId())));
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
        if (getBalanceCategory() != null) {
            _hashCode += getBalanceCategory().hashCode();
        }
        if (getBalanceId() != null) {
            _hashCode += getBalanceId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BalanceIdDtlsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "balanceIdDtlsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "balanceCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "balanceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
