/**
 * CatogoryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.BalanceManagement_xsd;

public class CatogoryType  implements java.io.Serializable {
    private java.lang.String catogoryName;

    private com.xius.billing.BalanceManagement_xsd.PlansType[] plan;

    public CatogoryType() {
    }

    public CatogoryType(
           java.lang.String catogoryName,
           com.xius.billing.BalanceManagement_xsd.PlansType[] plan) {
           this.catogoryName = catogoryName;
           this.plan = plan;
    }


    /**
     * Gets the catogoryName value for this CatogoryType.
     * 
     * @return catogoryName
     */
    public java.lang.String getCatogoryName() {
        return catogoryName;
    }


    /**
     * Sets the catogoryName value for this CatogoryType.
     * 
     * @param catogoryName
     */
    public void setCatogoryName(java.lang.String catogoryName) {
        this.catogoryName = catogoryName;
    }


    /**
     * Gets the plan value for this CatogoryType.
     * 
     * @return plan
     */
    public com.xius.billing.BalanceManagement_xsd.PlansType[] getPlan() {
        return plan;
    }


    /**
     * Sets the plan value for this CatogoryType.
     * 
     * @param plan
     */
    public void setPlan(com.xius.billing.BalanceManagement_xsd.PlansType[] plan) {
        this.plan = plan;
    }

    public com.xius.billing.BalanceManagement_xsd.PlansType getPlan(int i) {
        return this.plan[i];
    }

    public void setPlan(int i, com.xius.billing.BalanceManagement_xsd.PlansType _value) {
        this.plan[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CatogoryType)) return false;
        CatogoryType other = (CatogoryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.catogoryName==null && other.getCatogoryName()==null) || 
             (this.catogoryName!=null &&
              this.catogoryName.equals(other.getCatogoryName()))) &&
            ((this.plan==null && other.getPlan()==null) || 
             (this.plan!=null &&
              java.util.Arrays.equals(this.plan, other.getPlan())));
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
        if (getCatogoryName() != null) {
            _hashCode += getCatogoryName().hashCode();
        }
        if (getPlan() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPlan());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPlan(), i);
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
        new org.apache.axis.description.TypeDesc(CatogoryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "catogoryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catogoryName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "catogoryName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "Plan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "plansType"));
        elemField.setMinOccurs(0);
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
