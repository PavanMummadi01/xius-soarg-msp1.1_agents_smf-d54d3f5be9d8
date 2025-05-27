/**
 * SubscribedType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class SubscribedType  implements java.io.Serializable {
    private com.xius.billing.SubscriberManagement_xsd.SubOptionalServicesSuccessType subscribeOptionalServicesSuccess;

    private com.xius.billing.SubscriberManagement_xsd.SubOptionalServicesFailureType subscribeOptionalServicesFailure;

    public SubscribedType() {
    }

    public SubscribedType(
           com.xius.billing.SubscriberManagement_xsd.SubOptionalServicesSuccessType subscribeOptionalServicesSuccess,
           com.xius.billing.SubscriberManagement_xsd.SubOptionalServicesFailureType subscribeOptionalServicesFailure) {
           this.subscribeOptionalServicesSuccess = subscribeOptionalServicesSuccess;
           this.subscribeOptionalServicesFailure = subscribeOptionalServicesFailure;
    }


    /**
     * Gets the subscribeOptionalServicesSuccess value for this SubscribedType.
     * 
     * @return subscribeOptionalServicesSuccess
     */
    public com.xius.billing.SubscriberManagement_xsd.SubOptionalServicesSuccessType getSubscribeOptionalServicesSuccess() {
        return subscribeOptionalServicesSuccess;
    }


    /**
     * Sets the subscribeOptionalServicesSuccess value for this SubscribedType.
     * 
     * @param subscribeOptionalServicesSuccess
     */
    public void setSubscribeOptionalServicesSuccess(com.xius.billing.SubscriberManagement_xsd.SubOptionalServicesSuccessType subscribeOptionalServicesSuccess) {
        this.subscribeOptionalServicesSuccess = subscribeOptionalServicesSuccess;
    }


    /**
     * Gets the subscribeOptionalServicesFailure value for this SubscribedType.
     * 
     * @return subscribeOptionalServicesFailure
     */
    public com.xius.billing.SubscriberManagement_xsd.SubOptionalServicesFailureType getSubscribeOptionalServicesFailure() {
        return subscribeOptionalServicesFailure;
    }


    /**
     * Sets the subscribeOptionalServicesFailure value for this SubscribedType.
     * 
     * @param subscribeOptionalServicesFailure
     */
    public void setSubscribeOptionalServicesFailure(com.xius.billing.SubscriberManagement_xsd.SubOptionalServicesFailureType subscribeOptionalServicesFailure) {
        this.subscribeOptionalServicesFailure = subscribeOptionalServicesFailure;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubscribedType)) return false;
        SubscribedType other = (SubscribedType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subscribeOptionalServicesSuccess==null && other.getSubscribeOptionalServicesSuccess()==null) || 
             (this.subscribeOptionalServicesSuccess!=null &&
              this.subscribeOptionalServicesSuccess.equals(other.getSubscribeOptionalServicesSuccess()))) &&
            ((this.subscribeOptionalServicesFailure==null && other.getSubscribeOptionalServicesFailure()==null) || 
             (this.subscribeOptionalServicesFailure!=null &&
              this.subscribeOptionalServicesFailure.equals(other.getSubscribeOptionalServicesFailure())));
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
        if (getSubscribeOptionalServicesSuccess() != null) {
            _hashCode += getSubscribeOptionalServicesSuccess().hashCode();
        }
        if (getSubscribeOptionalServicesFailure() != null) {
            _hashCode += getSubscribeOptionalServicesFailure().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubscribedType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "SubscribedType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscribeOptionalServicesSuccess");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "subscribeOptionalServicesSuccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "SubOptionalServicesSuccessType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscribeOptionalServicesFailure");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "subscribeOptionalServicesFailure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "SubOptionalServicesFailureType"));
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
