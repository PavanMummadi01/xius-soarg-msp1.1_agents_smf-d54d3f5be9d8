/**
 * CategoryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.tariff;

public class CategoryType  implements java.io.Serializable {
    private java.lang.String name;

    private com.xius.xbus.messages.billing.tariff.PlanDetails[] planDetails;

    public CategoryType() {
    }

    public CategoryType(
           java.lang.String name,
           com.xius.xbus.messages.billing.tariff.PlanDetails[] planDetails) {
           this.name = name;
           this.planDetails = planDetails;
    }


    /**
     * Gets the name value for this CategoryType.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CategoryType.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the planDetails value for this CategoryType.
     * 
     * @return planDetails
     */
    public com.xius.xbus.messages.billing.tariff.PlanDetails[] getPlanDetails() {
        return planDetails;
    }


    /**
     * Sets the planDetails value for this CategoryType.
     * 
     * @param planDetails
     */
    public void setPlanDetails(com.xius.xbus.messages.billing.tariff.PlanDetails[] planDetails) {
        this.planDetails = planDetails;
    }

    public com.xius.xbus.messages.billing.tariff.PlanDetails getPlanDetails(int i) {
        return this.planDetails[i];
    }

    public void setPlanDetails(int i, com.xius.xbus.messages.billing.tariff.PlanDetails _value) {
        this.planDetails[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CategoryType)) return false;
        CategoryType other = (CategoryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.planDetails==null && other.getPlanDetails()==null) || 
             (this.planDetails!=null &&
              java.util.Arrays.equals(this.planDetails, other.getPlanDetails())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPlanDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPlanDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPlanDetails(), i);
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
        new org.apache.axis.description.TypeDesc(CategoryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "CategoryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "planDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "PlanDetails"));
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
