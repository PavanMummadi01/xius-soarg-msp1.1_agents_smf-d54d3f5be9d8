/**
 * UserIdentificationData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.subscriber;

public class UserIdentificationData  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private java.lang.String MDN;

    private java.util.Calendar dateOfBirth;

    private java.lang.String emailID;

    private java.lang.String lastName;

    private java.lang.String personalIdentificationNumber;

    private net.bcgi.si.messages.mvnoapi.common.PersonalIdentityType personalIdentityType;

    private org.apache.axis.message.MessageElement [] _any;

    public UserIdentificationData() {
    }

    public UserIdentificationData(
           java.lang.String MDN,
           java.util.Calendar dateOfBirth,
           java.lang.String emailID,
           java.lang.String lastName,
           java.lang.String personalIdentificationNumber,
           net.bcgi.si.messages.mvnoapi.common.PersonalIdentityType personalIdentityType,
           org.apache.axis.message.MessageElement [] _any) {
           this.MDN = MDN;
           this.dateOfBirth = dateOfBirth;
           this.emailID = emailID;
           this.lastName = lastName;
           this.personalIdentificationNumber = personalIdentificationNumber;
           this.personalIdentityType = personalIdentityType;
           this._any = _any;
    }


    /**
     * Gets the MDN value for this UserIdentificationData.
     * 
     * @return MDN
     */
    public java.lang.String getMDN() {
        return MDN;
    }


    /**
     * Sets the MDN value for this UserIdentificationData.
     * 
     * @param MDN
     */
    public void setMDN(java.lang.String MDN) {
        this.MDN = MDN;
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
    public net.bcgi.si.messages.mvnoapi.common.PersonalIdentityType getPersonalIdentityType() {
        return personalIdentityType;
    }


    /**
     * Sets the personalIdentityType value for this UserIdentificationData.
     * 
     * @param personalIdentityType
     */
    public void setPersonalIdentityType(net.bcgi.si.messages.mvnoapi.common.PersonalIdentityType personalIdentityType) {
        this.personalIdentityType = personalIdentityType;
    }


    /**
     * Gets the _any value for this UserIdentificationData.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this UserIdentificationData.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
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
            ((this.MDN==null && other.getMDN()==null) || 
             (this.MDN!=null &&
              this.MDN.equals(other.getMDN()))) &&
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
            ((this._any==null && other.get_any()==null) || 
             (this._any!=null &&
              java.util.Arrays.equals(this._any, other.get_any())));
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
        if (getMDN() != null) {
            _hashCode += getMDN().hashCode();
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
        if (get_any() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_any());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_any(), i);
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
        new org.apache.axis.description.TypeDesc(UserIdentificationData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "UserIdentificationData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "MDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfBirth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "dateOfBirth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "emailID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "lastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalIdentificationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "personalIdentificationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalIdentityType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "personalIdentityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "PersonalIdentityType"));
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
