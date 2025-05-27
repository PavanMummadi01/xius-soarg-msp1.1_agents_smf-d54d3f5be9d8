/**
 * ValidateSimResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class ValidateSimResponse  implements java.io.Serializable {
    private java.lang.String[] failedSIMs;

    private java.lang.String[] successSIMs;

    private java.lang.String respCode;

    private java.lang.String respmsg;

    public ValidateSimResponse() {
    }

    public ValidateSimResponse(
           java.lang.String[] failedSIMs,
           java.lang.String[] successSIMs,
           java.lang.String respCode,
           java.lang.String respmsg) {
           this.failedSIMs = failedSIMs;
           this.successSIMs = successSIMs;
           this.respCode = respCode;
           this.respmsg = respmsg;
    }


    /**
     * Gets the failedSIMs value for this ValidateSimResponse.
     * 
     * @return failedSIMs
     */
    public java.lang.String[] getFailedSIMs() {
        return failedSIMs;
    }


    /**
     * Sets the failedSIMs value for this ValidateSimResponse.
     * 
     * @param failedSIMs
     */
    public void setFailedSIMs(java.lang.String[] failedSIMs) {
        this.failedSIMs = failedSIMs;
    }

    public java.lang.String getFailedSIMs(int i) {
        return this.failedSIMs[i];
    }

    public void setFailedSIMs(int i, java.lang.String _value) {
        this.failedSIMs[i] = _value;
    }


    /**
     * Gets the successSIMs value for this ValidateSimResponse.
     * 
     * @return successSIMs
     */
    public java.lang.String[] getSuccessSIMs() {
        return successSIMs;
    }


    /**
     * Sets the successSIMs value for this ValidateSimResponse.
     * 
     * @param successSIMs
     */
    public void setSuccessSIMs(java.lang.String[] successSIMs) {
        this.successSIMs = successSIMs;
    }

    public java.lang.String getSuccessSIMs(int i) {
        return this.successSIMs[i];
    }

    public void setSuccessSIMs(int i, java.lang.String _value) {
        this.successSIMs[i] = _value;
    }


    /**
     * Gets the respCode value for this ValidateSimResponse.
     * 
     * @return respCode
     */
    public java.lang.String getRespCode() {
        return respCode;
    }


    /**
     * Sets the respCode value for this ValidateSimResponse.
     * 
     * @param respCode
     */
    public void setRespCode(java.lang.String respCode) {
        this.respCode = respCode;
    }


    /**
     * Gets the respmsg value for this ValidateSimResponse.
     * 
     * @return respmsg
     */
    public java.lang.String getRespmsg() {
        return respmsg;
    }


    /**
     * Sets the respmsg value for this ValidateSimResponse.
     * 
     * @param respmsg
     */
    public void setRespmsg(java.lang.String respmsg) {
        this.respmsg = respmsg;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValidateSimResponse)) return false;
        ValidateSimResponse other = (ValidateSimResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.failedSIMs==null && other.getFailedSIMs()==null) || 
             (this.failedSIMs!=null &&
              java.util.Arrays.equals(this.failedSIMs, other.getFailedSIMs()))) &&
            ((this.successSIMs==null && other.getSuccessSIMs()==null) || 
             (this.successSIMs!=null &&
              java.util.Arrays.equals(this.successSIMs, other.getSuccessSIMs()))) &&
            ((this.respCode==null && other.getRespCode()==null) || 
             (this.respCode!=null &&
              this.respCode.equals(other.getRespCode()))) &&
            ((this.respmsg==null && other.getRespmsg()==null) || 
             (this.respmsg!=null &&
              this.respmsg.equals(other.getRespmsg())));
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
        if (getFailedSIMs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFailedSIMs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFailedSIMs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSuccessSIMs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSuccessSIMs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSuccessSIMs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRespCode() != null) {
            _hashCode += getRespCode().hashCode();
        }
        if (getRespmsg() != null) {
            _hashCode += getRespmsg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValidateSimResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "validateSimResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedSIMs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "failedSIMs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SIMType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("successSIMs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "successSIMs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SIMType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("respCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "respCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("respmsg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "respmsg"));
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
