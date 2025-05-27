/**
 * CreditProfilesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class CreditProfilesType  implements java.io.Serializable {
    private com.xius.billing.AccountManagement_xsd.CreditProfilesListType[] available;

    private com.xius.billing.AccountManagement_xsd.CreditProfilesListType[] assigned;

    public CreditProfilesType() {
    }

    public CreditProfilesType(
           com.xius.billing.AccountManagement_xsd.CreditProfilesListType[] available,
           com.xius.billing.AccountManagement_xsd.CreditProfilesListType[] assigned) {
           this.available = available;
           this.assigned = assigned;
    }


    /**
     * Gets the available value for this CreditProfilesType.
     * 
     * @return available
     */
    public com.xius.billing.AccountManagement_xsd.CreditProfilesListType[] getAvailable() {
        return available;
    }


    /**
     * Sets the available value for this CreditProfilesType.
     * 
     * @param available
     */
    public void setAvailable(com.xius.billing.AccountManagement_xsd.CreditProfilesListType[] available) {
        this.available = available;
    }

    public com.xius.billing.AccountManagement_xsd.CreditProfilesListType getAvailable(int i) {
        return this.available[i];
    }

    public void setAvailable(int i, com.xius.billing.AccountManagement_xsd.CreditProfilesListType _value) {
        this.available[i] = _value;
    }


    /**
     * Gets the assigned value for this CreditProfilesType.
     * 
     * @return assigned
     */
    public com.xius.billing.AccountManagement_xsd.CreditProfilesListType[] getAssigned() {
        return assigned;
    }


    /**
     * Sets the assigned value for this CreditProfilesType.
     * 
     * @param assigned
     */
    public void setAssigned(com.xius.billing.AccountManagement_xsd.CreditProfilesListType[] assigned) {
        this.assigned = assigned;
    }

    public com.xius.billing.AccountManagement_xsd.CreditProfilesListType getAssigned(int i) {
        return this.assigned[i];
    }

    public void setAssigned(int i, com.xius.billing.AccountManagement_xsd.CreditProfilesListType _value) {
        this.assigned[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditProfilesType)) return false;
        CreditProfilesType other = (CreditProfilesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.available==null && other.getAvailable()==null) || 
             (this.available!=null &&
              java.util.Arrays.equals(this.available, other.getAvailable()))) &&
            ((this.assigned==null && other.getAssigned()==null) || 
             (this.assigned!=null &&
              java.util.Arrays.equals(this.assigned, other.getAssigned())));
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
        if (getAvailable() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvailable());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvailable(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAssigned() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssigned());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssigned(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreditProfilesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "CreditProfilesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("available");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "available"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "CreditProfilesListType"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assigned");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "assigned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "CreditProfilesListType"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
