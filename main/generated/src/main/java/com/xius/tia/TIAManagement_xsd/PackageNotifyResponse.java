/**
 * PackageNotifyResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.TIAManagement_xsd;

public class PackageNotifyResponse  implements java.io.Serializable {
    private java.lang.String transStatus;

    private java.lang.String reason;

    private com.xius.tia.TIAManagement_xsd.ResponseDataType responseData;

    public PackageNotifyResponse() {
    }

    public PackageNotifyResponse(
           java.lang.String transStatus,
           java.lang.String reason,
           com.xius.tia.TIAManagement_xsd.ResponseDataType responseData) {
           this.transStatus = transStatus;
           this.reason = reason;
           this.responseData = responseData;
    }


    /**
     * Gets the transStatus value for this PackageNotifyResponse.
     * 
     * @return transStatus
     */
    public java.lang.String getTransStatus() {
        return transStatus;
    }


    /**
     * Sets the transStatus value for this PackageNotifyResponse.
     * 
     * @param transStatus
     */
    public void setTransStatus(java.lang.String transStatus) {
        this.transStatus = transStatus;
    }


    /**
     * Gets the reason value for this PackageNotifyResponse.
     * 
     * @return reason
     */
    public java.lang.String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this PackageNotifyResponse.
     * 
     * @param reason
     */
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }


    /**
     * Gets the responseData value for this PackageNotifyResponse.
     * 
     * @return responseData
     */
    public com.xius.tia.TIAManagement_xsd.ResponseDataType getResponseData() {
        return responseData;
    }


    /**
     * Sets the responseData value for this PackageNotifyResponse.
     * 
     * @param responseData
     */
    public void setResponseData(com.xius.tia.TIAManagement_xsd.ResponseDataType responseData) {
        this.responseData = responseData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PackageNotifyResponse)) return false;
        PackageNotifyResponse other = (PackageNotifyResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transStatus==null && other.getTransStatus()==null) || 
             (this.transStatus!=null &&
              this.transStatus.equals(other.getTransStatus()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason()))) &&
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
        if (getTransStatus() != null) {
            _hashCode += getTransStatus().hashCode();
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        if (getResponseData() != null) {
            _hashCode += getResponseData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PackageNotifyResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "PackageNotifyResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "transStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "responseData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "ResponseDataType"));
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
