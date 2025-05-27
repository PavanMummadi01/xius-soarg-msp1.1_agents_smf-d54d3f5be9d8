/**
 * GetTPActivationFeeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class GetTPActivationFeeResponse  implements java.io.Serializable {
    private com.xius.billing.SubscriberManagement_xsd.FeeDetailsType feeDetails;

    public GetTPActivationFeeResponse() {
    }

    public GetTPActivationFeeResponse(
           com.xius.billing.SubscriberManagement_xsd.FeeDetailsType feeDetails) {
           this.feeDetails = feeDetails;
    }


    /**
     * Gets the feeDetails value for this GetTPActivationFeeResponse.
     * 
     * @return feeDetails
     */
    public com.xius.billing.SubscriberManagement_xsd.FeeDetailsType getFeeDetails() {
        return feeDetails;
    }


    /**
     * Sets the feeDetails value for this GetTPActivationFeeResponse.
     * 
     * @param feeDetails
     */
    public void setFeeDetails(com.xius.billing.SubscriberManagement_xsd.FeeDetailsType feeDetails) {
        this.feeDetails = feeDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTPActivationFeeResponse)) return false;
        GetTPActivationFeeResponse other = (GetTPActivationFeeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.feeDetails==null && other.getFeeDetails()==null) || 
             (this.feeDetails!=null &&
              this.feeDetails.equals(other.getFeeDetails())));
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
        if (getFeeDetails() != null) {
            _hashCode += getFeeDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetTPActivationFeeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getTPActivationFeeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "FeeDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "FeeDetailsType"));
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
