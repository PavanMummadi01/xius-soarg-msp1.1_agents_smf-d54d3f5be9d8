/**
 * UnSubscribedType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class UnSubscribedType  implements java.io.Serializable {
    private com.xius.billing.SubscriberManagement_xsd.UnSubOptionalServicesSuccessType unSubscribeOptionalServicesSuccess;

    private com.xius.billing.SubscriberManagement_xsd.UnSubOptionalServicesFailureType unSubscribeOptionalServicesFailure;

    public UnSubscribedType() {
    }

    public UnSubscribedType(
           com.xius.billing.SubscriberManagement_xsd.UnSubOptionalServicesSuccessType unSubscribeOptionalServicesSuccess,
           com.xius.billing.SubscriberManagement_xsd.UnSubOptionalServicesFailureType unSubscribeOptionalServicesFailure) {
           this.unSubscribeOptionalServicesSuccess = unSubscribeOptionalServicesSuccess;
           this.unSubscribeOptionalServicesFailure = unSubscribeOptionalServicesFailure;
    }


    /**
     * Gets the unSubscribeOptionalServicesSuccess value for this UnSubscribedType.
     * 
     * @return unSubscribeOptionalServicesSuccess
     */
    public com.xius.billing.SubscriberManagement_xsd.UnSubOptionalServicesSuccessType getUnSubscribeOptionalServicesSuccess() {
        return unSubscribeOptionalServicesSuccess;
    }


    /**
     * Sets the unSubscribeOptionalServicesSuccess value for this UnSubscribedType.
     * 
     * @param unSubscribeOptionalServicesSuccess
     */
    public void setUnSubscribeOptionalServicesSuccess(com.xius.billing.SubscriberManagement_xsd.UnSubOptionalServicesSuccessType unSubscribeOptionalServicesSuccess) {
        this.unSubscribeOptionalServicesSuccess = unSubscribeOptionalServicesSuccess;
    }


    /**
     * Gets the unSubscribeOptionalServicesFailure value for this UnSubscribedType.
     * 
     * @return unSubscribeOptionalServicesFailure
     */
    public com.xius.billing.SubscriberManagement_xsd.UnSubOptionalServicesFailureType getUnSubscribeOptionalServicesFailure() {
        return unSubscribeOptionalServicesFailure;
    }


    /**
     * Sets the unSubscribeOptionalServicesFailure value for this UnSubscribedType.
     * 
     * @param unSubscribeOptionalServicesFailure
     */
    public void setUnSubscribeOptionalServicesFailure(com.xius.billing.SubscriberManagement_xsd.UnSubOptionalServicesFailureType unSubscribeOptionalServicesFailure) {
        this.unSubscribeOptionalServicesFailure = unSubscribeOptionalServicesFailure;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UnSubscribedType)) return false;
        UnSubscribedType other = (UnSubscribedType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.unSubscribeOptionalServicesSuccess==null && other.getUnSubscribeOptionalServicesSuccess()==null) || 
             (this.unSubscribeOptionalServicesSuccess!=null &&
              this.unSubscribeOptionalServicesSuccess.equals(other.getUnSubscribeOptionalServicesSuccess()))) &&
            ((this.unSubscribeOptionalServicesFailure==null && other.getUnSubscribeOptionalServicesFailure()==null) || 
             (this.unSubscribeOptionalServicesFailure!=null &&
              this.unSubscribeOptionalServicesFailure.equals(other.getUnSubscribeOptionalServicesFailure())));
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
        if (getUnSubscribeOptionalServicesSuccess() != null) {
            _hashCode += getUnSubscribeOptionalServicesSuccess().hashCode();
        }
        if (getUnSubscribeOptionalServicesFailure() != null) {
            _hashCode += getUnSubscribeOptionalServicesFailure().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UnSubscribedType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "UnSubscribedType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unSubscribeOptionalServicesSuccess");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "unSubscribeOptionalServicesSuccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "UnSubOptionalServicesSuccessType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unSubscribeOptionalServicesFailure");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "unSubscribeOptionalServicesFailure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "UnSubOptionalServicesFailureType"));
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
