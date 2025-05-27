/**
 * DPlanType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.tariff;

public class DPlanType  implements java.io.Serializable {
    private com.xius.xbus.messages.billing.tariff.DPlanDetailType[] subscribedPlans;

    private com.xius.xbus.messages.billing.tariff.DPlanDetailType[] availablePlans;

    public DPlanType() {
    }

    public DPlanType(
           com.xius.xbus.messages.billing.tariff.DPlanDetailType[] subscribedPlans,
           com.xius.xbus.messages.billing.tariff.DPlanDetailType[] availablePlans) {
           this.subscribedPlans = subscribedPlans;
           this.availablePlans = availablePlans;
    }


    /**
     * Gets the subscribedPlans value for this DPlanType.
     * 
     * @return subscribedPlans
     */
    public com.xius.xbus.messages.billing.tariff.DPlanDetailType[] getSubscribedPlans() {
        return subscribedPlans;
    }


    /**
     * Sets the subscribedPlans value for this DPlanType.
     * 
     * @param subscribedPlans
     */
    public void setSubscribedPlans(com.xius.xbus.messages.billing.tariff.DPlanDetailType[] subscribedPlans) {
        this.subscribedPlans = subscribedPlans;
    }


    /**
     * Gets the availablePlans value for this DPlanType.
     * 
     * @return availablePlans
     */
    public com.xius.xbus.messages.billing.tariff.DPlanDetailType[] getAvailablePlans() {
        return availablePlans;
    }


    /**
     * Sets the availablePlans value for this DPlanType.
     * 
     * @param availablePlans
     */
    public void setAvailablePlans(com.xius.xbus.messages.billing.tariff.DPlanDetailType[] availablePlans) {
        this.availablePlans = availablePlans;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DPlanType)) return false;
        DPlanType other = (DPlanType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subscribedPlans==null && other.getSubscribedPlans()==null) || 
             (this.subscribedPlans!=null &&
              java.util.Arrays.equals(this.subscribedPlans, other.getSubscribedPlans()))) &&
            ((this.availablePlans==null && other.getAvailablePlans()==null) || 
             (this.availablePlans!=null &&
              java.util.Arrays.equals(this.availablePlans, other.getAvailablePlans())));
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
        if (getSubscribedPlans() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubscribedPlans());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubscribedPlans(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAvailablePlans() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvailablePlans());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvailablePlans(), i);
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
        new org.apache.axis.description.TypeDesc(DPlanType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "DPlanType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscribedPlans");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "subscribedPlans"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "DPlanDetailType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "dataPlan"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availablePlans");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "availablePlans"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "DPlanDetailType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "dataPlan"));
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
