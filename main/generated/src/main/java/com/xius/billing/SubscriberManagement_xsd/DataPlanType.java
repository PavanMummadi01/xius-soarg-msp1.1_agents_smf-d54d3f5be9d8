/**
 * DataPlanType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class DataPlanType  implements java.io.Serializable {
    private com.xius.billing.SubscriberManagement_xsd.DataPlanInfoType[] assignedPlan;

    private com.xius.billing.SubscriberManagement_xsd.DataPlanInfoType[] availablePlan;

    public DataPlanType() {
    }

    public DataPlanType(
           com.xius.billing.SubscriberManagement_xsd.DataPlanInfoType[] assignedPlan,
           com.xius.billing.SubscriberManagement_xsd.DataPlanInfoType[] availablePlan) {
           this.assignedPlan = assignedPlan;
           this.availablePlan = availablePlan;
    }


    /**
     * Gets the assignedPlan value for this DataPlanType.
     * 
     * @return assignedPlan
     */
    public com.xius.billing.SubscriberManagement_xsd.DataPlanInfoType[] getAssignedPlan() {
        return assignedPlan;
    }


    /**
     * Sets the assignedPlan value for this DataPlanType.
     * 
     * @param assignedPlan
     */
    public void setAssignedPlan(com.xius.billing.SubscriberManagement_xsd.DataPlanInfoType[] assignedPlan) {
        this.assignedPlan = assignedPlan;
    }

    public com.xius.billing.SubscriberManagement_xsd.DataPlanInfoType getAssignedPlan(int i) {
        return this.assignedPlan[i];
    }

    public void setAssignedPlan(int i, com.xius.billing.SubscriberManagement_xsd.DataPlanInfoType _value) {
        this.assignedPlan[i] = _value;
    }


    /**
     * Gets the availablePlan value for this DataPlanType.
     * 
     * @return availablePlan
     */
    public com.xius.billing.SubscriberManagement_xsd.DataPlanInfoType[] getAvailablePlan() {
        return availablePlan;
    }


    /**
     * Sets the availablePlan value for this DataPlanType.
     * 
     * @param availablePlan
     */
    public void setAvailablePlan(com.xius.billing.SubscriberManagement_xsd.DataPlanInfoType[] availablePlan) {
        this.availablePlan = availablePlan;
    }

    public com.xius.billing.SubscriberManagement_xsd.DataPlanInfoType getAvailablePlan(int i) {
        return this.availablePlan[i];
    }

    public void setAvailablePlan(int i, com.xius.billing.SubscriberManagement_xsd.DataPlanInfoType _value) {
        this.availablePlan[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DataPlanType)) return false;
        DataPlanType other = (DataPlanType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.assignedPlan==null && other.getAssignedPlan()==null) || 
             (this.assignedPlan!=null &&
              java.util.Arrays.equals(this.assignedPlan, other.getAssignedPlan()))) &&
            ((this.availablePlan==null && other.getAvailablePlan()==null) || 
             (this.availablePlan!=null &&
              java.util.Arrays.equals(this.availablePlan, other.getAvailablePlan())));
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
        if (getAssignedPlan() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssignedPlan());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssignedPlan(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAvailablePlan() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvailablePlan());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvailablePlan(), i);
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
        new org.apache.axis.description.TypeDesc(DataPlanType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "DataPlanType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignedPlan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "assignedPlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "DataPlanInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availablePlan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "availablePlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "DataPlanInfoType"));
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
