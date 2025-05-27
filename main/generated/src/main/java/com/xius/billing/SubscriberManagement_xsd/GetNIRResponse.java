/**
 * GetNIRResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class GetNIRResponse  implements java.io.Serializable {
    private com.xius.billing.SubscriberManagement_xsd.RegionNirDetailsType[] regionNirDetails;

    private java.lang.String message;

    public GetNIRResponse() {
    }

    public GetNIRResponse(
           com.xius.billing.SubscriberManagement_xsd.RegionNirDetailsType[] regionNirDetails,
           java.lang.String message) {
           this.regionNirDetails = regionNirDetails;
           this.message = message;
    }


    /**
     * Gets the regionNirDetails value for this GetNIRResponse.
     * 
     * @return regionNirDetails
     */
    public com.xius.billing.SubscriberManagement_xsd.RegionNirDetailsType[] getRegionNirDetails() {
        return regionNirDetails;
    }


    /**
     * Sets the regionNirDetails value for this GetNIRResponse.
     * 
     * @param regionNirDetails
     */
    public void setRegionNirDetails(com.xius.billing.SubscriberManagement_xsd.RegionNirDetailsType[] regionNirDetails) {
        this.regionNirDetails = regionNirDetails;
    }

    public com.xius.billing.SubscriberManagement_xsd.RegionNirDetailsType getRegionNirDetails(int i) {
        return this.regionNirDetails[i];
    }

    public void setRegionNirDetails(int i, com.xius.billing.SubscriberManagement_xsd.RegionNirDetailsType _value) {
        this.regionNirDetails[i] = _value;
    }


    /**
     * Gets the message value for this GetNIRResponse.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this GetNIRResponse.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetNIRResponse)) return false;
        GetNIRResponse other = (GetNIRResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.regionNirDetails==null && other.getRegionNirDetails()==null) || 
             (this.regionNirDetails!=null &&
              java.util.Arrays.equals(this.regionNirDetails, other.getRegionNirDetails()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage())));
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
        if (getRegionNirDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRegionNirDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRegionNirDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetNIRResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getNIRResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionNirDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "regionNirDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "regionNirDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "message"));
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
