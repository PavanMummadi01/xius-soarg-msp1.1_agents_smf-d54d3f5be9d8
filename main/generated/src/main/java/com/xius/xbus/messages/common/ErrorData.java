/**
 * ErrorData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.common;

public class ErrorData  implements java.io.Serializable {
    private com.xius.xbus.messages.common.ErrorCategory errorCategory;

    private java.lang.String errorCode;

    private java.lang.String errorMessage;

    private com.xius.xbus.messages.common.SeverityCode severityCode;

    public ErrorData() {
    }

    public ErrorData(
           com.xius.xbus.messages.common.ErrorCategory errorCategory,
           java.lang.String errorCode,
           java.lang.String errorMessage,
           com.xius.xbus.messages.common.SeverityCode severityCode) {
           this.errorCategory = errorCategory;
           this.errorCode = errorCode;
           this.errorMessage = errorMessage;
           this.severityCode = severityCode;
    }


    /**
     * Gets the errorCategory value for this ErrorData.
     * 
     * @return errorCategory
     */
    public com.xius.xbus.messages.common.ErrorCategory getErrorCategory() {
        return errorCategory;
    }


    /**
     * Sets the errorCategory value for this ErrorData.
     * 
     * @param errorCategory
     */
    public void setErrorCategory(com.xius.xbus.messages.common.ErrorCategory errorCategory) {
        this.errorCategory = errorCategory;
    }


    /**
     * Gets the errorCode value for this ErrorData.
     * 
     * @return errorCode
     */
    public java.lang.String getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this ErrorData.
     * 
     * @param errorCode
     */
    public void setErrorCode(java.lang.String errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the errorMessage value for this ErrorData.
     * 
     * @return errorMessage
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this ErrorData.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }


    /**
     * Gets the severityCode value for this ErrorData.
     * 
     * @return severityCode
     */
    public com.xius.xbus.messages.common.SeverityCode getSeverityCode() {
        return severityCode;
    }


    /**
     * Sets the severityCode value for this ErrorData.
     * 
     * @param severityCode
     */
    public void setSeverityCode(com.xius.xbus.messages.common.SeverityCode severityCode) {
        this.severityCode = severityCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ErrorData)) return false;
        ErrorData other = (ErrorData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.errorCategory==null && other.getErrorCategory()==null) || 
             (this.errorCategory!=null &&
              this.errorCategory.equals(other.getErrorCategory()))) &&
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode()))) &&
            ((this.errorMessage==null && other.getErrorMessage()==null) || 
             (this.errorMessage!=null &&
              this.errorMessage.equals(other.getErrorMessage()))) &&
            ((this.severityCode==null && other.getSeverityCode()==null) || 
             (this.severityCode!=null &&
              this.severityCode.equals(other.getSeverityCode())));
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
        if (getErrorCategory() != null) {
            _hashCode += getErrorCategory().hashCode();
        }
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        if (getErrorMessage() != null) {
            _hashCode += getErrorMessage().hashCode();
        }
        if (getSeverityCode() != null) {
            _hashCode += getSeverityCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ErrorData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "ErrorData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "errorCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "ErrorCategory"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "errorMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("severityCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "severityCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "SeverityCode"));
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
