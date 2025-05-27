/**
 * SimActivateResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.provisioning.device;

public class SimActivateResponse  extends com.xius.xbus.messages.common.WSResponse  implements java.io.Serializable {
    private java.lang.String actualMsisdn;

    private java.lang.String simNumber;

    public SimActivateResponse() {
    }

    public SimActivateResponse(
           com.xius.xbus.messages.common.StatusCode statusCode,
           java.util.Calendar timeStamp,
           java.lang.String correlationID,
           com.xius.xbus.messages.common.ErrorData[] errors,
           java.lang.String version,
           java.lang.String actualMsisdn,
           java.lang.String simNumber) {
        super(
            statusCode,
            timeStamp,
            correlationID,
            errors,
            version);
        this.actualMsisdn = actualMsisdn;
        this.simNumber = simNumber;
    }


    /**
     * Gets the actualMsisdn value for this SimActivateResponse.
     * 
     * @return actualMsisdn
     */
    public java.lang.String getActualMsisdn() {
        return actualMsisdn;
    }


    /**
     * Sets the actualMsisdn value for this SimActivateResponse.
     * 
     * @param actualMsisdn
     */
    public void setActualMsisdn(java.lang.String actualMsisdn) {
        this.actualMsisdn = actualMsisdn;
    }


    /**
     * Gets the simNumber value for this SimActivateResponse.
     * 
     * @return simNumber
     */
    public java.lang.String getSimNumber() {
        return simNumber;
    }


    /**
     * Sets the simNumber value for this SimActivateResponse.
     * 
     * @param simNumber
     */
    public void setSimNumber(java.lang.String simNumber) {
        this.simNumber = simNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SimActivateResponse)) return false;
        SimActivateResponse other = (SimActivateResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.actualMsisdn==null && other.getActualMsisdn()==null) || 
             (this.actualMsisdn!=null &&
              this.actualMsisdn.equals(other.getActualMsisdn()))) &&
            ((this.simNumber==null && other.getSimNumber()==null) || 
             (this.simNumber!=null &&
              this.simNumber.equals(other.getSimNumber())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getActualMsisdn() != null) {
            _hashCode += getActualMsisdn().hashCode();
        }
        if (getSimNumber() != null) {
            _hashCode += getSimNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SimActivateResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", ">SimActivateResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualMsisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "ActualMsisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("simNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "SimNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
