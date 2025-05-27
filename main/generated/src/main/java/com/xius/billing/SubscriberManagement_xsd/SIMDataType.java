/**
 * SIMDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class SIMDataType  implements java.io.Serializable {
    private java.lang.String sim;

    private com.xius.billing.SubscriberManagement_xsd.DataPlanTinyInfoType[] plansList;

    public SIMDataType() {
    }

    public SIMDataType(
           java.lang.String sim,
           com.xius.billing.SubscriberManagement_xsd.DataPlanTinyInfoType[] plansList) {
           this.sim = sim;
           this.plansList = plansList;
    }


    /**
     * Gets the sim value for this SIMDataType.
     * 
     * @return sim
     */
    public java.lang.String getSim() {
        return sim;
    }


    /**
     * Sets the sim value for this SIMDataType.
     * 
     * @param sim
     */
    public void setSim(java.lang.String sim) {
        this.sim = sim;
    }


    /**
     * Gets the plansList value for this SIMDataType.
     * 
     * @return plansList
     */
    public com.xius.billing.SubscriberManagement_xsd.DataPlanTinyInfoType[] getPlansList() {
        return plansList;
    }


    /**
     * Sets the plansList value for this SIMDataType.
     * 
     * @param plansList
     */
    public void setPlansList(com.xius.billing.SubscriberManagement_xsd.DataPlanTinyInfoType[] plansList) {
        this.plansList = plansList;
    }

    public com.xius.billing.SubscriberManagement_xsd.DataPlanTinyInfoType getPlansList(int i) {
        return this.plansList[i];
    }

    public void setPlansList(int i, com.xius.billing.SubscriberManagement_xsd.DataPlanTinyInfoType _value) {
        this.plansList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SIMDataType)) return false;
        SIMDataType other = (SIMDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sim==null && other.getSim()==null) || 
             (this.sim!=null &&
              this.sim.equals(other.getSim()))) &&
            ((this.plansList==null && other.getPlansList()==null) || 
             (this.plansList!=null &&
              java.util.Arrays.equals(this.plansList, other.getPlansList())));
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
        if (getSim() != null) {
            _hashCode += getSim().hashCode();
        }
        if (getPlansList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPlansList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPlansList(), i);
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
        new org.apache.axis.description.TypeDesc(SIMDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "SIMDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sim");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "sim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plansList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "plansList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "DataPlanTinyInfoType"));
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
