/**
 * ManageOfficeCodeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.selfcare.corpcustomerservice;

public class ManageOfficeCodeResponse  extends com.xius.xbus.messages.common.WSResponse  implements java.io.Serializable {
    private java.lang.String[] successSims;

    private java.lang.String[] failureSims;

    public ManageOfficeCodeResponse() {
    }

    public ManageOfficeCodeResponse(
           com.xius.xbus.messages.common.StatusCode statusCode,
           java.util.Calendar timeStamp,
           java.lang.String correlationID,
           com.xius.xbus.messages.common.ErrorData[] errors,
           java.lang.String version,
           java.lang.String[] successSims,
           java.lang.String[] failureSims) {
        super(
            statusCode,
            timeStamp,
            correlationID,
            errors,
            version);
        this.successSims = successSims;
        this.failureSims = failureSims;
    }


    /**
     * Gets the successSims value for this ManageOfficeCodeResponse.
     * 
     * @return successSims
     */
    public java.lang.String[] getSuccessSims() {
        return successSims;
    }


    /**
     * Sets the successSims value for this ManageOfficeCodeResponse.
     * 
     * @param successSims
     */
    public void setSuccessSims(java.lang.String[] successSims) {
        this.successSims = successSims;
    }

    public java.lang.String getSuccessSims(int i) {
        return this.successSims[i];
    }

    public void setSuccessSims(int i, java.lang.String _value) {
        this.successSims[i] = _value;
    }


    /**
     * Gets the failureSims value for this ManageOfficeCodeResponse.
     * 
     * @return failureSims
     */
    public java.lang.String[] getFailureSims() {
        return failureSims;
    }


    /**
     * Sets the failureSims value for this ManageOfficeCodeResponse.
     * 
     * @param failureSims
     */
    public void setFailureSims(java.lang.String[] failureSims) {
        this.failureSims = failureSims;
    }

    public java.lang.String getFailureSims(int i) {
        return this.failureSims[i];
    }

    public void setFailureSims(int i, java.lang.String _value) {
        this.failureSims[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManageOfficeCodeResponse)) return false;
        ManageOfficeCodeResponse other = (ManageOfficeCodeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.successSims==null && other.getSuccessSims()==null) || 
             (this.successSims!=null &&
              java.util.Arrays.equals(this.successSims, other.getSuccessSims()))) &&
            ((this.failureSims==null && other.getFailureSims()==null) || 
             (this.failureSims!=null &&
              java.util.Arrays.equals(this.failureSims, other.getFailureSims())));
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
        if (getSuccessSims() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSuccessSims());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSuccessSims(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFailureSims() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFailureSims());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFailureSims(), i);
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
        new org.apache.axis.description.TypeDesc(ManageOfficeCodeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/corpcustomerservice", ">ManageOfficeCodeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("successSims");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/corpcustomerservice", "successSims"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "SimType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failureSims");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/corpcustomerservice", "failureSims"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "SimType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
