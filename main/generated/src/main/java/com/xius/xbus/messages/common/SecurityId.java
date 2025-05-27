/**
 * SecurityId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.common;

public class SecurityId  implements java.io.Serializable {
    private java.lang.String securityToken;

    private java.lang.String userAccountName;

    private java.lang.String userAccountPassword;

    public SecurityId() {
    }

    public SecurityId(
           java.lang.String securityToken,
           java.lang.String userAccountName,
           java.lang.String userAccountPassword) {
           this.securityToken = securityToken;
           this.userAccountName = userAccountName;
           this.userAccountPassword = userAccountPassword;
    }


    /**
     * Gets the securityToken value for this SecurityId.
     * 
     * @return securityToken
     */
    public java.lang.String getSecurityToken() {
        return securityToken;
    }


    /**
     * Sets the securityToken value for this SecurityId.
     * 
     * @param securityToken
     */
    public void setSecurityToken(java.lang.String securityToken) {
        this.securityToken = securityToken;
    }


    /**
     * Gets the userAccountName value for this SecurityId.
     * 
     * @return userAccountName
     */
    public java.lang.String getUserAccountName() {
        return userAccountName;
    }


    /**
     * Sets the userAccountName value for this SecurityId.
     * 
     * @param userAccountName
     */
    public void setUserAccountName(java.lang.String userAccountName) {
        this.userAccountName = userAccountName;
    }


    /**
     * Gets the userAccountPassword value for this SecurityId.
     * 
     * @return userAccountPassword
     */
    public java.lang.String getUserAccountPassword() {
        return userAccountPassword;
    }


    /**
     * Sets the userAccountPassword value for this SecurityId.
     * 
     * @param userAccountPassword
     */
    public void setUserAccountPassword(java.lang.String userAccountPassword) {
        this.userAccountPassword = userAccountPassword;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SecurityId)) return false;
        SecurityId other = (SecurityId) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.securityToken==null && other.getSecurityToken()==null) || 
             (this.securityToken!=null &&
              this.securityToken.equals(other.getSecurityToken()))) &&
            ((this.userAccountName==null && other.getUserAccountName()==null) || 
             (this.userAccountName!=null &&
              this.userAccountName.equals(other.getUserAccountName()))) &&
            ((this.userAccountPassword==null && other.getUserAccountPassword()==null) || 
             (this.userAccountPassword!=null &&
              this.userAccountPassword.equals(other.getUserAccountPassword())));
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
        if (getSecurityToken() != null) {
            _hashCode += getSecurityToken().hashCode();
        }
        if (getUserAccountName() != null) {
            _hashCode += getUserAccountName().hashCode();
        }
        if (getUserAccountPassword() != null) {
            _hashCode += getUserAccountPassword().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SecurityId.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "SecurityId"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityToken");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "securityToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userAccountName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "userAccountName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userAccountPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "userAccountPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
