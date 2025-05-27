/**
 * ChangePasswordResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.selfcare.services;

public class ChangePasswordResponse  extends com.xius.xbus.messages.common.WSResponse  implements java.io.Serializable {
    private java.lang.String userAccountName;

    private java.lang.String userAccountPassword;

    private java.lang.String carrierId;

    public ChangePasswordResponse() {
    }

    public ChangePasswordResponse(
           com.xius.xbus.messages.common.StatusCode statusCode,
           java.util.Calendar timeStamp,
           java.lang.String correlationID,
           com.xius.xbus.messages.common.ErrorData[] errors,
           java.lang.String version,
           java.lang.String userAccountName,
           java.lang.String userAccountPassword,
           java.lang.String carrierId) {
        super(
            statusCode,
            timeStamp,
            correlationID,
            errors,
            version);
        this.userAccountName = userAccountName;
        this.userAccountPassword = userAccountPassword;
        this.carrierId = carrierId;
    }


    /**
     * Gets the userAccountName value for this ChangePasswordResponse.
     * 
     * @return userAccountName
     */
    public java.lang.String getUserAccountName() {
        return userAccountName;
    }


    /**
     * Sets the userAccountName value for this ChangePasswordResponse.
     * 
     * @param userAccountName
     */
    public void setUserAccountName(java.lang.String userAccountName) {
        this.userAccountName = userAccountName;
    }


    /**
     * Gets the userAccountPassword value for this ChangePasswordResponse.
     * 
     * @return userAccountPassword
     */
    public java.lang.String getUserAccountPassword() {
        return userAccountPassword;
    }


    /**
     * Sets the userAccountPassword value for this ChangePasswordResponse.
     * 
     * @param userAccountPassword
     */
    public void setUserAccountPassword(java.lang.String userAccountPassword) {
        this.userAccountPassword = userAccountPassword;
    }


    /**
     * Gets the carrierId value for this ChangePasswordResponse.
     * 
     * @return carrierId
     */
    public java.lang.String getCarrierId() {
        return carrierId;
    }


    /**
     * Sets the carrierId value for this ChangePasswordResponse.
     * 
     * @param carrierId
     */
    public void setCarrierId(java.lang.String carrierId) {
        this.carrierId = carrierId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangePasswordResponse)) return false;
        ChangePasswordResponse other = (ChangePasswordResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.userAccountName==null && other.getUserAccountName()==null) || 
             (this.userAccountName!=null &&
              this.userAccountName.equals(other.getUserAccountName()))) &&
            ((this.userAccountPassword==null && other.getUserAccountPassword()==null) || 
             (this.userAccountPassword!=null &&
              this.userAccountPassword.equals(other.getUserAccountPassword()))) &&
            ((this.carrierId==null && other.getCarrierId()==null) || 
             (this.carrierId!=null &&
              this.carrierId.equals(other.getCarrierId())));
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
        if (getUserAccountName() != null) {
            _hashCode += getUserAccountName().hashCode();
        }
        if (getUserAccountPassword() != null) {
            _hashCode += getUserAccountPassword().hashCode();
        }
        if (getCarrierId() != null) {
            _hashCode += getCarrierId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangePasswordResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">changePasswordResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userAccountName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "userAccountName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userAccountPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "userAccountPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "carrierId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
