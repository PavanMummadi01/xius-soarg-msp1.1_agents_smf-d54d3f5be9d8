/**
 * ResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.SorianacardIntegration_xsd;

public class ResponseType  implements java.io.Serializable {
    private java.lang.Boolean success;

    private java.lang.String error;

    private com.xius.tia.SorianacardIntegration_xsd.CustomerIDType clientID;

    private com.xius.tia.SorianacardIntegration_xsd.UserDefinedType userdefinedtype;

    public ResponseType() {
    }

    public ResponseType(
           java.lang.Boolean success,
           java.lang.String error,
           com.xius.tia.SorianacardIntegration_xsd.CustomerIDType clientID,
           com.xius.tia.SorianacardIntegration_xsd.UserDefinedType userdefinedtype) {
           this.success = success;
           this.error = error;
           this.clientID = clientID;
           this.userdefinedtype = userdefinedtype;
    }


    /**
     * Gets the success value for this ResponseType.
     * 
     * @return success
     */
    public java.lang.Boolean getSuccess() {
        return success;
    }


    /**
     * Sets the success value for this ResponseType.
     * 
     * @param success
     */
    public void setSuccess(java.lang.Boolean success) {
        this.success = success;
    }


    /**
     * Gets the error value for this ResponseType.
     * 
     * @return error
     */
    public java.lang.String getError() {
        return error;
    }


    /**
     * Sets the error value for this ResponseType.
     * 
     * @param error
     */
    public void setError(java.lang.String error) {
        this.error = error;
    }


    /**
     * Gets the clientID value for this ResponseType.
     * 
     * @return clientID
     */
    public com.xius.tia.SorianacardIntegration_xsd.CustomerIDType getClientID() {
        return clientID;
    }


    /**
     * Sets the clientID value for this ResponseType.
     * 
     * @param clientID
     */
    public void setClientID(com.xius.tia.SorianacardIntegration_xsd.CustomerIDType clientID) {
        this.clientID = clientID;
    }


    /**
     * Gets the userdefinedtype value for this ResponseType.
     * 
     * @return userdefinedtype
     */
    public com.xius.tia.SorianacardIntegration_xsd.UserDefinedType getUserdefinedtype() {
        return userdefinedtype;
    }


    /**
     * Sets the userdefinedtype value for this ResponseType.
     * 
     * @param userdefinedtype
     */
    public void setUserdefinedtype(com.xius.tia.SorianacardIntegration_xsd.UserDefinedType userdefinedtype) {
        this.userdefinedtype = userdefinedtype;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponseType)) return false;
        ResponseType other = (ResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.success==null && other.getSuccess()==null) || 
             (this.success!=null &&
              this.success.equals(other.getSuccess()))) &&
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              this.error.equals(other.getError()))) &&
            ((this.clientID==null && other.getClientID()==null) || 
             (this.clientID!=null &&
              this.clientID.equals(other.getClientID()))) &&
            ((this.userdefinedtype==null && other.getUserdefinedtype()==null) || 
             (this.userdefinedtype!=null &&
              this.userdefinedtype.equals(other.getUserdefinedtype())));
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
        if (getSuccess() != null) {
            _hashCode += getSuccess().hashCode();
        }
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        if (getClientID() != null) {
            _hashCode += getClientID().hashCode();
        }
        if (getUserdefinedtype() != null) {
            _hashCode += getUserdefinedtype().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/SorianacardIntegration.xsd", "ResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("success");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/SorianacardIntegration.xsd", "Success"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/SorianacardIntegration.xsd", "Error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/SorianacardIntegration.xsd", "clientID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/SorianacardIntegration.xsd", "customerIDType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userdefinedtype");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/SorianacardIntegration.xsd", "userdefinedtype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/SorianacardIntegration.xsd", "UserDefinedType"));
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
