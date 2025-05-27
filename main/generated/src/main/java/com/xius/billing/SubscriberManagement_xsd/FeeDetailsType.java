/**
 * FeeDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class FeeDetailsType  implements java.io.Serializable {
    private java.lang.String activationFee;

    private java.lang.String rentalFee;

    public FeeDetailsType() {
    }

    public FeeDetailsType(
           java.lang.String activationFee,
           java.lang.String rentalFee) {
           this.activationFee = activationFee;
           this.rentalFee = rentalFee;
    }


    /**
     * Gets the activationFee value for this FeeDetailsType.
     * 
     * @return activationFee
     */
    public java.lang.String getActivationFee() {
        return activationFee;
    }


    /**
     * Sets the activationFee value for this FeeDetailsType.
     * 
     * @param activationFee
     */
    public void setActivationFee(java.lang.String activationFee) {
        this.activationFee = activationFee;
    }


    /**
     * Gets the rentalFee value for this FeeDetailsType.
     * 
     * @return rentalFee
     */
    public java.lang.String getRentalFee() {
        return rentalFee;
    }


    /**
     * Sets the rentalFee value for this FeeDetailsType.
     * 
     * @param rentalFee
     */
    public void setRentalFee(java.lang.String rentalFee) {
        this.rentalFee = rentalFee;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeeDetailsType)) return false;
        FeeDetailsType other = (FeeDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.activationFee==null && other.getActivationFee()==null) || 
             (this.activationFee!=null &&
              this.activationFee.equals(other.getActivationFee()))) &&
            ((this.rentalFee==null && other.getRentalFee()==null) || 
             (this.rentalFee!=null &&
              this.rentalFee.equals(other.getRentalFee())));
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
        if (getActivationFee() != null) {
            _hashCode += getActivationFee().hashCode();
        }
        if (getRentalFee() != null) {
            _hashCode += getRentalFee().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeeDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "FeeDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "activationFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rentalFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "rentalFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
