/**
 * ChangePasswordRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.selfcare.services;

public class ChangePasswordRequest  extends com.xius.xbus.messages.common.WSRequest  implements java.io.Serializable {
    private java.lang.String newPassword;

    private java.lang.String oldPassword;

    private java.lang.String personalIdentityNumber;

    private com.xius.xbus.messages.common.SubscriberIdKeyType personalIdentityType;

    private java.lang.String updatedUsername;

    private java.lang.String userId;

    public ChangePasswordRequest() {
    }

    public ChangePasswordRequest(
           com.xius.xbus.messages.common.UserType userType,
           java.lang.String messageID,
           com.xius.xbus.messages.common.SecurityId securityId,
           com.xius.xbus.messages.common.ServiceContext serviceContext,
           java.lang.String version,
           java.lang.String newPassword,
           java.lang.String oldPassword,
           java.lang.String personalIdentityNumber,
           com.xius.xbus.messages.common.SubscriberIdKeyType personalIdentityType,
           java.lang.String updatedUsername,
           java.lang.String userId) {
        super(
            userType,
            messageID,
            securityId,
            serviceContext,
            version);
        this.newPassword = newPassword;
        this.oldPassword = oldPassword;
        this.personalIdentityNumber = personalIdentityNumber;
        this.personalIdentityType = personalIdentityType;
        this.updatedUsername = updatedUsername;
        this.userId = userId;
    }


    /**
     * Gets the newPassword value for this ChangePasswordRequest.
     * 
     * @return newPassword
     */
    public java.lang.String getNewPassword() {
        return newPassword;
    }


    /**
     * Sets the newPassword value for this ChangePasswordRequest.
     * 
     * @param newPassword
     */
    public void setNewPassword(java.lang.String newPassword) {
        this.newPassword = newPassword;
    }


    /**
     * Gets the oldPassword value for this ChangePasswordRequest.
     * 
     * @return oldPassword
     */
    public java.lang.String getOldPassword() {
        return oldPassword;
    }


    /**
     * Sets the oldPassword value for this ChangePasswordRequest.
     * 
     * @param oldPassword
     */
    public void setOldPassword(java.lang.String oldPassword) {
        this.oldPassword = oldPassword;
    }


    /**
     * Gets the personalIdentityNumber value for this ChangePasswordRequest.
     * 
     * @return personalIdentityNumber
     */
    public java.lang.String getPersonalIdentityNumber() {
        return personalIdentityNumber;
    }


    /**
     * Sets the personalIdentityNumber value for this ChangePasswordRequest.
     * 
     * @param personalIdentityNumber
     */
    public void setPersonalIdentityNumber(java.lang.String personalIdentityNumber) {
        this.personalIdentityNumber = personalIdentityNumber;
    }


    /**
     * Gets the personalIdentityType value for this ChangePasswordRequest.
     * 
     * @return personalIdentityType
     */
    public com.xius.xbus.messages.common.SubscriberIdKeyType getPersonalIdentityType() {
        return personalIdentityType;
    }


    /**
     * Sets the personalIdentityType value for this ChangePasswordRequest.
     * 
     * @param personalIdentityType
     */
    public void setPersonalIdentityType(com.xius.xbus.messages.common.SubscriberIdKeyType personalIdentityType) {
        this.personalIdentityType = personalIdentityType;
    }


    /**
     * Gets the updatedUsername value for this ChangePasswordRequest.
     * 
     * @return updatedUsername
     */
    public java.lang.String getUpdatedUsername() {
        return updatedUsername;
    }


    /**
     * Sets the updatedUsername value for this ChangePasswordRequest.
     * 
     * @param updatedUsername
     */
    public void setUpdatedUsername(java.lang.String updatedUsername) {
        this.updatedUsername = updatedUsername;
    }


    /**
     * Gets the userId value for this ChangePasswordRequest.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this ChangePasswordRequest.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangePasswordRequest)) return false;
        ChangePasswordRequest other = (ChangePasswordRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.newPassword==null && other.getNewPassword()==null) || 
             (this.newPassword!=null &&
              this.newPassword.equals(other.getNewPassword()))) &&
            ((this.oldPassword==null && other.getOldPassword()==null) || 
             (this.oldPassword!=null &&
              this.oldPassword.equals(other.getOldPassword()))) &&
            ((this.personalIdentityNumber==null && other.getPersonalIdentityNumber()==null) || 
             (this.personalIdentityNumber!=null &&
              this.personalIdentityNumber.equals(other.getPersonalIdentityNumber()))) &&
            ((this.personalIdentityType==null && other.getPersonalIdentityType()==null) || 
             (this.personalIdentityType!=null &&
              this.personalIdentityType.equals(other.getPersonalIdentityType()))) &&
            ((this.updatedUsername==null && other.getUpdatedUsername()==null) || 
             (this.updatedUsername!=null &&
              this.updatedUsername.equals(other.getUpdatedUsername()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId())));
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
        if (getNewPassword() != null) {
            _hashCode += getNewPassword().hashCode();
        }
        if (getOldPassword() != null) {
            _hashCode += getOldPassword().hashCode();
        }
        if (getPersonalIdentityNumber() != null) {
            _hashCode += getPersonalIdentityNumber().hashCode();
        }
        if (getPersonalIdentityType() != null) {
            _hashCode += getPersonalIdentityType().hashCode();
        }
        if (getUpdatedUsername() != null) {
            _hashCode += getUpdatedUsername().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangePasswordRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">changePasswordRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "newPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "oldPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalIdentityNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "personalIdentityNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalIdentityType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "personalIdentityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "SubscriberIdKeyType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updatedUsername");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "updatedUsername"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "userId"));
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
