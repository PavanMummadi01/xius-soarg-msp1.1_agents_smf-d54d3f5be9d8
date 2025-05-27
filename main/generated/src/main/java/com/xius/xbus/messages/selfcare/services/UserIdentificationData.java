/**
 * UserIdentificationData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.selfcare.services;

public class UserIdentificationData  implements java.io.Serializable {
    private java.lang.String mdn;

    private java.util.Calendar dateOfBirth;

    private java.lang.String emailID;

    private java.lang.String lastName;

    private java.lang.String personalIdentificationNumber;

    private com.xius.xbus.messages.common.PersonalIdentityType personalIdentityType;

    private java.lang.String personalIDType;

    public UserIdentificationData() {
    }

    public UserIdentificationData(
           java.lang.String mdn,
           java.util.Calendar dateOfBirth,
           java.lang.String emailID,
           java.lang.String lastName,
           java.lang.String personalIdentificationNumber,
           com.xius.xbus.messages.common.PersonalIdentityType personalIdentityType,
           java.lang.String personalIDType) {
           this.mdn = mdn;
           this.dateOfBirth = dateOfBirth;
           this.emailID = emailID;
           this.lastName = lastName;
           this.personalIdentificationNumber = personalIdentificationNumber;
           this.personalIdentityType = personalIdentityType;
           this.personalIDType = personalIDType;
    }


    /**
     * Gets the mdn value for this UserIdentificationData.
     * 
     * @return mdn
     */
    public java.lang.String getMdn() {
        return mdn;
    }


    /**
     * Sets the mdn value for this UserIdentificationData.
     * 
     * @param mdn
     */
    public void setMdn(java.lang.String mdn) {
        this.mdn = mdn;
    }


    /**
     * Gets the dateOfBirth value for this UserIdentificationData.
     * 
     * @return dateOfBirth
     */
    public java.util.Calendar getDateOfBirth() {
        return dateOfBirth;
    }


    /**
     * Sets the dateOfBirth value for this UserIdentificationData.
     * 
     * @param dateOfBirth
     */
    public void setDateOfBirth(java.util.Calendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    /**
     * Gets the emailID value for this UserIdentificationData.
     * 
     * @return emailID
     */
    public java.lang.String getEmailID() {
        return emailID;
    }


    /**
     * Sets the emailID value for this UserIdentificationData.
     * 
     * @param emailID
     */
    public void setEmailID(java.lang.String emailID) {
        this.emailID = emailID;
    }


    /**
     * Gets the lastName value for this UserIdentificationData.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this UserIdentificationData.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the personalIdentificationNumber value for this UserIdentificationData.
     * 
     * @return personalIdentificationNumber
     */
    public java.lang.String getPersonalIdentificationNumber() {
        return personalIdentificationNumber;
    }


    /**
     * Sets the personalIdentificationNumber value for this UserIdentificationData.
     * 
     * @param personalIdentificationNumber
     */
    public void setPersonalIdentificationNumber(java.lang.String personalIdentificationNumber) {
        this.personalIdentificationNumber = personalIdentificationNumber;
    }


    /**
     * Gets the personalIdentityType value for this UserIdentificationData.
     * 
     * @return personalIdentityType
     */
    public com.xius.xbus.messages.common.PersonalIdentityType getPersonalIdentityType() {
        return personalIdentityType;
    }


    /**
     * Sets the personalIdentityType value for this UserIdentificationData.
     * 
     * @param personalIdentityType
     */
    public void setPersonalIdentityType(com.xius.xbus.messages.common.PersonalIdentityType personalIdentityType) {
        this.personalIdentityType = personalIdentityType;
    }


    /**
     * Gets the personalIDType value for this UserIdentificationData.
     * 
     * @return personalIDType
     */
    public java.lang.String getPersonalIDType() {
        return personalIDType;
    }


    /**
     * Sets the personalIDType value for this UserIdentificationData.
     * 
     * @param personalIDType
     */
    public void setPersonalIDType(java.lang.String personalIDType) {
        this.personalIDType = personalIDType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserIdentificationData)) return false;
        UserIdentificationData other = (UserIdentificationData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mdn==null && other.getMdn()==null) || 
             (this.mdn!=null &&
              this.mdn.equals(other.getMdn()))) &&
            ((this.dateOfBirth==null && other.getDateOfBirth()==null) || 
             (this.dateOfBirth!=null &&
              this.dateOfBirth.equals(other.getDateOfBirth()))) &&
            ((this.emailID==null && other.getEmailID()==null) || 
             (this.emailID!=null &&
              this.emailID.equals(other.getEmailID()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.personalIdentificationNumber==null && other.getPersonalIdentificationNumber()==null) || 
             (this.personalIdentificationNumber!=null &&
              this.personalIdentificationNumber.equals(other.getPersonalIdentificationNumber()))) &&
            ((this.personalIdentityType==null && other.getPersonalIdentityType()==null) || 
             (this.personalIdentityType!=null &&
              this.personalIdentityType.equals(other.getPersonalIdentityType()))) &&
            ((this.personalIDType==null && other.getPersonalIDType()==null) || 
             (this.personalIDType!=null &&
              this.personalIDType.equals(other.getPersonalIDType())));
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
        if (getMdn() != null) {
            _hashCode += getMdn().hashCode();
        }
        if (getDateOfBirth() != null) {
            _hashCode += getDateOfBirth().hashCode();
        }
        if (getEmailID() != null) {
            _hashCode += getEmailID().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getPersonalIdentificationNumber() != null) {
            _hashCode += getPersonalIdentificationNumber().hashCode();
        }
        if (getPersonalIdentityType() != null) {
            _hashCode += getPersonalIdentityType().hashCode();
        }
        if (getPersonalIDType() != null) {
            _hashCode += getPersonalIDType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserIdentificationData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "UserIdentificationData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "mdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfBirth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "dateOfBirth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "emailID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "lastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalIdentificationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "personalIdentificationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalIdentityType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "personalIdentityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "PersonalIdentityType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalIDType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "personalIDType"));
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
