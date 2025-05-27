/**
 * UnSubOptionalServicesFailureType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class UnSubOptionalServicesFailureType  implements java.io.Serializable {
    private java.lang.String message;

    private com.xius.billing.SubscriberManagement_xsd.ServiceFailureType[] unSubservicesFailure;

    public UnSubOptionalServicesFailureType() {
    }

    public UnSubOptionalServicesFailureType(
           java.lang.String message,
           com.xius.billing.SubscriberManagement_xsd.ServiceFailureType[] unSubservicesFailure) {
           this.message = message;
           this.unSubservicesFailure = unSubservicesFailure;
    }


    /**
     * Gets the message value for this UnSubOptionalServicesFailureType.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this UnSubOptionalServicesFailureType.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the unSubservicesFailure value for this UnSubOptionalServicesFailureType.
     * 
     * @return unSubservicesFailure
     */
    public com.xius.billing.SubscriberManagement_xsd.ServiceFailureType[] getUnSubservicesFailure() {
        return unSubservicesFailure;
    }


    /**
     * Sets the unSubservicesFailure value for this UnSubOptionalServicesFailureType.
     * 
     * @param unSubservicesFailure
     */
    public void setUnSubservicesFailure(com.xius.billing.SubscriberManagement_xsd.ServiceFailureType[] unSubservicesFailure) {
        this.unSubservicesFailure = unSubservicesFailure;
    }

    public com.xius.billing.SubscriberManagement_xsd.ServiceFailureType getUnSubservicesFailure(int i) {
        return this.unSubservicesFailure[i];
    }

    public void setUnSubservicesFailure(int i, com.xius.billing.SubscriberManagement_xsd.ServiceFailureType _value) {
        this.unSubservicesFailure[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UnSubOptionalServicesFailureType)) return false;
        UnSubOptionalServicesFailureType other = (UnSubOptionalServicesFailureType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.unSubservicesFailure==null && other.getUnSubservicesFailure()==null) || 
             (this.unSubservicesFailure!=null &&
              java.util.Arrays.equals(this.unSubservicesFailure, other.getUnSubservicesFailure())));
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
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getUnSubservicesFailure() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnSubservicesFailure());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnSubservicesFailure(), i);
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
        new org.apache.axis.description.TypeDesc(UnSubOptionalServicesFailureType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "UnSubOptionalServicesFailureType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unSubservicesFailure");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "unSubservicesFailure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ServiceFailureType"));
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
