/**
 * FailureDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class FailureDataType  implements java.io.Serializable {
    private java.lang.String failedMSISDN;

    private java.lang.String failReason;

    public FailureDataType() {
    }

    public FailureDataType(
           java.lang.String failedMSISDN,
           java.lang.String failReason) {
           this.failedMSISDN = failedMSISDN;
           this.failReason = failReason;
    }


    /**
     * Gets the failedMSISDN value for this FailureDataType.
     * 
     * @return failedMSISDN
     */
    public java.lang.String getFailedMSISDN() {
        return failedMSISDN;
    }


    /**
     * Sets the failedMSISDN value for this FailureDataType.
     * 
     * @param failedMSISDN
     */
    public void setFailedMSISDN(java.lang.String failedMSISDN) {
        this.failedMSISDN = failedMSISDN;
    }


    /**
     * Gets the failReason value for this FailureDataType.
     * 
     * @return failReason
     */
    public java.lang.String getFailReason() {
        return failReason;
    }


    /**
     * Sets the failReason value for this FailureDataType.
     * 
     * @param failReason
     */
    public void setFailReason(java.lang.String failReason) {
        this.failReason = failReason;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FailureDataType)) return false;
        FailureDataType other = (FailureDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.failedMSISDN==null && other.getFailedMSISDN()==null) || 
             (this.failedMSISDN!=null &&
              this.failedMSISDN.equals(other.getFailedMSISDN()))) &&
            ((this.failReason==null && other.getFailReason()==null) || 
             (this.failReason!=null &&
              this.failReason.equals(other.getFailReason())));
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
        if (getFailedMSISDN() != null) {
            _hashCode += getFailedMSISDN().hashCode();
        }
        if (getFailReason() != null) {
            _hashCode += getFailReason().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FailureDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "FailureDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "FailedMSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "FailReason"));
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
