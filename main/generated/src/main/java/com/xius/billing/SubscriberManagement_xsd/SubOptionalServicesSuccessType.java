/**
 * SubOptionalServicesSuccessType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class SubOptionalServicesSuccessType  implements java.io.Serializable {
    private java.lang.String message;

    private com.xius.billing.SubscriberManagement_xsd.ServiceSuccessType[] subServicesSuccess;

    public SubOptionalServicesSuccessType() {
    }

    public SubOptionalServicesSuccessType(
           java.lang.String message,
           com.xius.billing.SubscriberManagement_xsd.ServiceSuccessType[] subServicesSuccess) {
           this.message = message;
           this.subServicesSuccess = subServicesSuccess;
    }


    /**
     * Gets the message value for this SubOptionalServicesSuccessType.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this SubOptionalServicesSuccessType.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the subServicesSuccess value for this SubOptionalServicesSuccessType.
     * 
     * @return subServicesSuccess
     */
    public com.xius.billing.SubscriberManagement_xsd.ServiceSuccessType[] getSubServicesSuccess() {
        return subServicesSuccess;
    }


    /**
     * Sets the subServicesSuccess value for this SubOptionalServicesSuccessType.
     * 
     * @param subServicesSuccess
     */
    public void setSubServicesSuccess(com.xius.billing.SubscriberManagement_xsd.ServiceSuccessType[] subServicesSuccess) {
        this.subServicesSuccess = subServicesSuccess;
    }

    public com.xius.billing.SubscriberManagement_xsd.ServiceSuccessType getSubServicesSuccess(int i) {
        return this.subServicesSuccess[i];
    }

    public void setSubServicesSuccess(int i, com.xius.billing.SubscriberManagement_xsd.ServiceSuccessType _value) {
        this.subServicesSuccess[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubOptionalServicesSuccessType)) return false;
        SubOptionalServicesSuccessType other = (SubOptionalServicesSuccessType) obj;
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
            ((this.subServicesSuccess==null && other.getSubServicesSuccess()==null) || 
             (this.subServicesSuccess!=null &&
              java.util.Arrays.equals(this.subServicesSuccess, other.getSubServicesSuccess())));
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
        if (getSubServicesSuccess() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubServicesSuccess());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubServicesSuccess(), i);
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
        new org.apache.axis.description.TypeDesc(SubOptionalServicesSuccessType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "SubOptionalServicesSuccessType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subServicesSuccess");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "subServicesSuccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ServiceSuccessType"));
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
