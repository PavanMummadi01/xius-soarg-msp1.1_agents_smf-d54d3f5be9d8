/**
 * ManageCommActATPResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.selfcare.communityaccountservice;

public class ManageCommActATPResponse  extends com.xius.xbus.messages.common.WSResponse  implements java.io.Serializable {
    private com.xius.xbus.messages.selfcare.communityaccountservice.ErrorDetailsItem[] errorDetails;

    public ManageCommActATPResponse() {
    }

    public ManageCommActATPResponse(
           com.xius.xbus.messages.common.StatusCode statusCode,
           java.util.Calendar timeStamp,
           java.lang.String correlationID,
           com.xius.xbus.messages.common.ErrorData[] errors,
           java.lang.String version,
           com.xius.xbus.messages.selfcare.communityaccountservice.ErrorDetailsItem[] errorDetails) {
        super(
            statusCode,
            timeStamp,
            correlationID,
            errors,
            version);
        this.errorDetails = errorDetails;
    }


    /**
     * Gets the errorDetails value for this ManageCommActATPResponse.
     * 
     * @return errorDetails
     */
    public com.xius.xbus.messages.selfcare.communityaccountservice.ErrorDetailsItem[] getErrorDetails() {
        return errorDetails;
    }


    /**
     * Sets the errorDetails value for this ManageCommActATPResponse.
     * 
     * @param errorDetails
     */
    public void setErrorDetails(com.xius.xbus.messages.selfcare.communityaccountservice.ErrorDetailsItem[] errorDetails) {
        this.errorDetails = errorDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManageCommActATPResponse)) return false;
        ManageCommActATPResponse other = (ManageCommActATPResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.errorDetails==null && other.getErrorDetails()==null) || 
             (this.errorDetails!=null &&
              java.util.Arrays.equals(this.errorDetails, other.getErrorDetails())));
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
        if (getErrorDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getErrorDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getErrorDetails(), i);
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
        new org.apache.axis.description.TypeDesc(ManageCommActATPResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">ManageCommActATPResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "errorDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "ErrorDetailsItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "errorDetailsList"));
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
