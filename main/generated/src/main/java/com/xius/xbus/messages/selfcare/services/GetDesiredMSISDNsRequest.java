/**
 * GetDesiredMSISDNsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.selfcare.services;

public class GetDesiredMSISDNsRequest  extends com.xius.xbus.messages.common.WSRequest  implements java.io.Serializable {
    private java.lang.String networkName;

    private java.lang.String preferFourDigits;

    public GetDesiredMSISDNsRequest() {
    }

    public GetDesiredMSISDNsRequest(
           com.xius.xbus.messages.common.UserType userType,
           java.lang.String messageID,
           com.xius.xbus.messages.common.SecurityId securityId,
           com.xius.xbus.messages.common.ServiceContext serviceContext,
           java.lang.String version,
           java.lang.String networkName,
           java.lang.String preferFourDigits) {
        super(
            userType,
            messageID,
            securityId,
            serviceContext,
            version);
        this.networkName = networkName;
        this.preferFourDigits = preferFourDigits;
    }


    /**
     * Gets the networkName value for this GetDesiredMSISDNsRequest.
     * 
     * @return networkName
     */
    public java.lang.String getNetworkName() {
        return networkName;
    }


    /**
     * Sets the networkName value for this GetDesiredMSISDNsRequest.
     * 
     * @param networkName
     */
    public void setNetworkName(java.lang.String networkName) {
        this.networkName = networkName;
    }


    /**
     * Gets the preferFourDigits value for this GetDesiredMSISDNsRequest.
     * 
     * @return preferFourDigits
     */
    public java.lang.String getPreferFourDigits() {
        return preferFourDigits;
    }


    /**
     * Sets the preferFourDigits value for this GetDesiredMSISDNsRequest.
     * 
     * @param preferFourDigits
     */
    public void setPreferFourDigits(java.lang.String preferFourDigits) {
        this.preferFourDigits = preferFourDigits;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDesiredMSISDNsRequest)) return false;
        GetDesiredMSISDNsRequest other = (GetDesiredMSISDNsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.networkName==null && other.getNetworkName()==null) || 
             (this.networkName!=null &&
              this.networkName.equals(other.getNetworkName()))) &&
            ((this.preferFourDigits==null && other.getPreferFourDigits()==null) || 
             (this.preferFourDigits!=null &&
              this.preferFourDigits.equals(other.getPreferFourDigits())));
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
        if (getNetworkName() != null) {
            _hashCode += getNetworkName().hashCode();
        }
        if (getPreferFourDigits() != null) {
            _hashCode += getPreferFourDigits().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDesiredMSISDNsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">getDesiredMSISDNsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "networkName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferFourDigits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "preferFourDigits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
