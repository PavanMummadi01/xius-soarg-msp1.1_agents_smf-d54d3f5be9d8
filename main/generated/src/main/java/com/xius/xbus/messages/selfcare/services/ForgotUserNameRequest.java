/**
 * ForgotUserNameRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.selfcare.services;

public class ForgotUserNameRequest  extends com.xius.xbus.messages.common.WSRequest  implements java.io.Serializable {
    private java.lang.String userId;

    private java.lang.String carrierName;

    private com.xius.xbus.messages.selfcare.services.UserIdentificationData userIdentificationData;

    public ForgotUserNameRequest() {
    }

    public ForgotUserNameRequest(
           com.xius.xbus.messages.common.UserType userType,
           java.lang.String messageID,
           com.xius.xbus.messages.common.SecurityId securityId,
           com.xius.xbus.messages.common.ServiceContext serviceContext,
           java.lang.String version,
           java.lang.String userId,
           java.lang.String carrierName,
           com.xius.xbus.messages.selfcare.services.UserIdentificationData userIdentificationData) {
        super(
            userType,
            messageID,
            securityId,
            serviceContext,
            version);
        this.userId = userId;
        this.carrierName = carrierName;
        this.userIdentificationData = userIdentificationData;
    }


    /**
     * Gets the userId value for this ForgotUserNameRequest.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this ForgotUserNameRequest.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }


    /**
     * Gets the carrierName value for this ForgotUserNameRequest.
     * 
     * @return carrierName
     */
    public java.lang.String getCarrierName() {
        return carrierName;
    }


    /**
     * Sets the carrierName value for this ForgotUserNameRequest.
     * 
     * @param carrierName
     */
    public void setCarrierName(java.lang.String carrierName) {
        this.carrierName = carrierName;
    }


    /**
     * Gets the userIdentificationData value for this ForgotUserNameRequest.
     * 
     * @return userIdentificationData
     */
    public com.xius.xbus.messages.selfcare.services.UserIdentificationData getUserIdentificationData() {
        return userIdentificationData;
    }


    /**
     * Sets the userIdentificationData value for this ForgotUserNameRequest.
     * 
     * @param userIdentificationData
     */
    public void setUserIdentificationData(com.xius.xbus.messages.selfcare.services.UserIdentificationData userIdentificationData) {
        this.userIdentificationData = userIdentificationData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ForgotUserNameRequest)) return false;
        ForgotUserNameRequest other = (ForgotUserNameRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.carrierName==null && other.getCarrierName()==null) || 
             (this.carrierName!=null &&
              this.carrierName.equals(other.getCarrierName()))) &&
            ((this.userIdentificationData==null && other.getUserIdentificationData()==null) || 
             (this.userIdentificationData!=null &&
              this.userIdentificationData.equals(other.getUserIdentificationData())));
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
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getCarrierName() != null) {
            _hashCode += getCarrierName().hashCode();
        }
        if (getUserIdentificationData() != null) {
            _hashCode += getUserIdentificationData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ForgotUserNameRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">forgotUserNameRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "carrierName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userIdentificationData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "userIdentificationData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "UserIdentificationData"));
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
