/**
 * FiveGProvisionResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.TTprovisioning_xsd;

public class FiveGProvisionResponse  implements java.io.Serializable {
    private com.xius.tia.TTprovisioning_xsd.ResponseDataType responseData;

    public FiveGProvisionResponse() {
    }

    public FiveGProvisionResponse(
           com.xius.tia.TTprovisioning_xsd.ResponseDataType responseData) {
           this.responseData = responseData;
    }


    /**
     * Gets the responseData value for this FiveGProvisionResponse.
     * 
     * @return responseData
     */
    public com.xius.tia.TTprovisioning_xsd.ResponseDataType getResponseData() {
        return responseData;
    }


    /**
     * Sets the responseData value for this FiveGProvisionResponse.
     * 
     * @param responseData
     */
    public void setResponseData(com.xius.tia.TTprovisioning_xsd.ResponseDataType responseData) {
        this.responseData = responseData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FiveGProvisionResponse)) return false;
        FiveGProvisionResponse other = (FiveGProvisionResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.responseData==null && other.getResponseData()==null) || 
             (this.responseData!=null &&
              this.responseData.equals(other.getResponseData())));
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
        if (getResponseData() != null) {
            _hashCode += getResponseData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FiveGProvisionResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "fiveGProvisionResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "ResponseData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "ResponseDataType"));
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
