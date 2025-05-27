/**
 * DataPlanTinyInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.tariff;

public class DataPlanTinyInfoType  implements java.io.Serializable {
    private java.lang.String publicityId;

    private com.xius.xbus.messages.billing.tariff.SubUnSubType subscriptionType;

    public DataPlanTinyInfoType() {
    }

    public DataPlanTinyInfoType(
           java.lang.String publicityId,
           com.xius.xbus.messages.billing.tariff.SubUnSubType subscriptionType) {
           this.publicityId = publicityId;
           this.subscriptionType = subscriptionType;
    }


    /**
     * Gets the publicityId value for this DataPlanTinyInfoType.
     * 
     * @return publicityId
     */
    public java.lang.String getPublicityId() {
        return publicityId;
    }


    /**
     * Sets the publicityId value for this DataPlanTinyInfoType.
     * 
     * @param publicityId
     */
    public void setPublicityId(java.lang.String publicityId) {
        this.publicityId = publicityId;
    }


    /**
     * Gets the subscriptionType value for this DataPlanTinyInfoType.
     * 
     * @return subscriptionType
     */
    public com.xius.xbus.messages.billing.tariff.SubUnSubType getSubscriptionType() {
        return subscriptionType;
    }


    /**
     * Sets the subscriptionType value for this DataPlanTinyInfoType.
     * 
     * @param subscriptionType
     */
    public void setSubscriptionType(com.xius.xbus.messages.billing.tariff.SubUnSubType subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DataPlanTinyInfoType)) return false;
        DataPlanTinyInfoType other = (DataPlanTinyInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.publicityId==null && other.getPublicityId()==null) || 
             (this.publicityId!=null &&
              this.publicityId.equals(other.getPublicityId()))) &&
            ((this.subscriptionType==null && other.getSubscriptionType()==null) || 
             (this.subscriptionType!=null &&
              this.subscriptionType.equals(other.getSubscriptionType())));
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
        if (getPublicityId() != null) {
            _hashCode += getPublicityId().hashCode();
        }
        if (getSubscriptionType() != null) {
            _hashCode += getSubscriptionType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DataPlanTinyInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "DataPlanTinyInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "publicityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "subscriptionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "SubUnSubType"));
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
