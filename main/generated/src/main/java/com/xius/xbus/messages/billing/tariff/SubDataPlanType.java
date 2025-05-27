/**
 * SubDataPlanType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.tariff;

public class SubDataPlanType  implements java.io.Serializable {
    private com.xius.xbus.messages.billing.tariff.SubDataPlanDetailType[] subscribedPlans;

    public SubDataPlanType() {
    }

    public SubDataPlanType(
           com.xius.xbus.messages.billing.tariff.SubDataPlanDetailType[] subscribedPlans) {
           this.subscribedPlans = subscribedPlans;
    }


    /**
     * Gets the subscribedPlans value for this SubDataPlanType.
     * 
     * @return subscribedPlans
     */
    public com.xius.xbus.messages.billing.tariff.SubDataPlanDetailType[] getSubscribedPlans() {
        return subscribedPlans;
    }


    /**
     * Sets the subscribedPlans value for this SubDataPlanType.
     * 
     * @param subscribedPlans
     */
    public void setSubscribedPlans(com.xius.xbus.messages.billing.tariff.SubDataPlanDetailType[] subscribedPlans) {
        this.subscribedPlans = subscribedPlans;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubDataPlanType)) return false;
        SubDataPlanType other = (SubDataPlanType) obj;
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
              java.util.Arrays.equals(this.subscribedPlans, other.getSubscribedPlans())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubDataPlanType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "SubDataPlanType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscribedPlans");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "subscribedPlans"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "SubDataPlanDetailType"));
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
