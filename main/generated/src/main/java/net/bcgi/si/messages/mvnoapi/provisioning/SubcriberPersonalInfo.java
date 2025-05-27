/**
 * SubcriberPersonalInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.provisioning;

public class SubcriberPersonalInfo  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private java.lang.String annualIncome;

    private java.util.Calendar dateOfBirth;

    private java.lang.String firstName;

    private net.bcgi.si.messages.mvnoapi.common.GenderType gender;

    private java.lang.String gmpc;

    private net.bcgi.si.messages.mvnoapi.common.PersonalIdentityType idType;

    private java.lang.String idValue;

    private java.lang.String industry;

    private java.lang.String lastName;

    private java.lang.String occupation;

    private java.lang.String oldIC;

    private java.lang.String personalIdType;

    private java.lang.String surName;

    private java.lang.String userId;

    private java.lang.String userName;

    private org.apache.axis.message.MessageElement [] _any;

    public SubcriberPersonalInfo() {
    }

    public SubcriberPersonalInfo(
           java.lang.String annualIncome,
           java.util.Calendar dateOfBirth,
           java.lang.String firstName,
           net.bcgi.si.messages.mvnoapi.common.GenderType gender,
           java.lang.String gmpc,
           net.bcgi.si.messages.mvnoapi.common.PersonalIdentityType idType,
           java.lang.String idValue,
           java.lang.String industry,
           java.lang.String lastName,
           java.lang.String occupation,
           java.lang.String oldIC,
           java.lang.String personalIdType,
           java.lang.String surName,
           java.lang.String userId,
           java.lang.String userName,
           org.apache.axis.message.MessageElement [] _any) {
           this.annualIncome = annualIncome;
           this.dateOfBirth = dateOfBirth;
           this.firstName = firstName;
           this.gender = gender;
           this.gmpc = gmpc;
           this.idType = idType;
           this.idValue = idValue;
           this.industry = industry;
           this.lastName = lastName;
           this.occupation = occupation;
           this.oldIC = oldIC;
           this.personalIdType = personalIdType;
           this.surName = surName;
           this.userId = userId;
           this.userName = userName;
           this._any = _any;
    }


    /**
     * Gets the annualIncome value for this SubcriberPersonalInfo.
     * 
     * @return annualIncome
     */
    public java.lang.String getAnnualIncome() {
        return annualIncome;
    }


    /**
     * Sets the annualIncome value for this SubcriberPersonalInfo.
     * 
     * @param annualIncome
     */
    public void setAnnualIncome(java.lang.String annualIncome) {
        this.annualIncome = annualIncome;
    }


    /**
     * Gets the dateOfBirth value for this SubcriberPersonalInfo.
     * 
     * @return dateOfBirth
     */
    public java.util.Calendar getDateOfBirth() {
        return dateOfBirth;
    }


    /**
     * Sets the dateOfBirth value for this SubcriberPersonalInfo.
     * 
     * @param dateOfBirth
     */
    public void setDateOfBirth(java.util.Calendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    /**
     * Gets the firstName value for this SubcriberPersonalInfo.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this SubcriberPersonalInfo.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the gender value for this SubcriberPersonalInfo.
     * 
     * @return gender
     */
    public net.bcgi.si.messages.mvnoapi.common.GenderType getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this SubcriberPersonalInfo.
     * 
     * @param gender
     */
    public void setGender(net.bcgi.si.messages.mvnoapi.common.GenderType gender) {
        this.gender = gender;
    }


    /**
     * Gets the gmpc value for this SubcriberPersonalInfo.
     * 
     * @return gmpc
     */
    public java.lang.String getGmpc() {
        return gmpc;
    }


    /**
     * Sets the gmpc value for this SubcriberPersonalInfo.
     * 
     * @param gmpc
     */
    public void setGmpc(java.lang.String gmpc) {
        this.gmpc = gmpc;
    }


    /**
     * Gets the idType value for this SubcriberPersonalInfo.
     * 
     * @return idType
     */
    public net.bcgi.si.messages.mvnoapi.common.PersonalIdentityType getIdType() {
        return idType;
    }


    /**
     * Sets the idType value for this SubcriberPersonalInfo.
     * 
     * @param idType
     */
    public void setIdType(net.bcgi.si.messages.mvnoapi.common.PersonalIdentityType idType) {
        this.idType = idType;
    }


    /**
     * Gets the idValue value for this SubcriberPersonalInfo.
     * 
     * @return idValue
     */
    public java.lang.String getIdValue() {
        return idValue;
    }


    /**
     * Sets the idValue value for this SubcriberPersonalInfo.
     * 
     * @param idValue
     */
    public void setIdValue(java.lang.String idValue) {
        this.idValue = idValue;
    }


    /**
     * Gets the industry value for this SubcriberPersonalInfo.
     * 
     * @return industry
     */
    public java.lang.String getIndustry() {
        return industry;
    }


    /**
     * Sets the industry value for this SubcriberPersonalInfo.
     * 
     * @param industry
     */
    public void setIndustry(java.lang.String industry) {
        this.industry = industry;
    }


    /**
     * Gets the lastName value for this SubcriberPersonalInfo.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this SubcriberPersonalInfo.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the occupation value for this SubcriberPersonalInfo.
     * 
     * @return occupation
     */
    public java.lang.String getOccupation() {
        return occupation;
    }


    /**
     * Sets the occupation value for this SubcriberPersonalInfo.
     * 
     * @param occupation
     */
    public void setOccupation(java.lang.String occupation) {
        this.occupation = occupation;
    }


    /**
     * Gets the oldIC value for this SubcriberPersonalInfo.
     * 
     * @return oldIC
     */
    public java.lang.String getOldIC() {
        return oldIC;
    }


    /**
     * Sets the oldIC value for this SubcriberPersonalInfo.
     * 
     * @param oldIC
     */
    public void setOldIC(java.lang.String oldIC) {
        this.oldIC = oldIC;
    }


    /**
     * Gets the personalIdType value for this SubcriberPersonalInfo.
     * 
     * @return personalIdType
     */
    public java.lang.String getPersonalIdType() {
        return personalIdType;
    }


    /**
     * Sets the personalIdType value for this SubcriberPersonalInfo.
     * 
     * @param personalIdType
     */
    public void setPersonalIdType(java.lang.String personalIdType) {
        this.personalIdType = personalIdType;
    }


    /**
     * Gets the surName value for this SubcriberPersonalInfo.
     * 
     * @return surName
     */
    public java.lang.String getSurName() {
        return surName;
    }


    /**
     * Sets the surName value for this SubcriberPersonalInfo.
     * 
     * @param surName
     */
    public void setSurName(java.lang.String surName) {
        this.surName = surName;
    }


    /**
     * Gets the userId value for this SubcriberPersonalInfo.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this SubcriberPersonalInfo.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }


    /**
     * Gets the userName value for this SubcriberPersonalInfo.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this SubcriberPersonalInfo.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the _any value for this SubcriberPersonalInfo.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this SubcriberPersonalInfo.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubcriberPersonalInfo)) return false;
        SubcriberPersonalInfo other = (SubcriberPersonalInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.annualIncome==null && other.getAnnualIncome()==null) || 
             (this.annualIncome!=null &&
              this.annualIncome.equals(other.getAnnualIncome()))) &&
            ((this.dateOfBirth==null && other.getDateOfBirth()==null) || 
             (this.dateOfBirth!=null &&
              this.dateOfBirth.equals(other.getDateOfBirth()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.gender==null && other.getGender()==null) || 
             (this.gender!=null &&
              this.gender.equals(other.getGender()))) &&
            ((this.gmpc==null && other.getGmpc()==null) || 
             (this.gmpc!=null &&
              this.gmpc.equals(other.getGmpc()))) &&
            ((this.idType==null && other.getIdType()==null) || 
             (this.idType!=null &&
              this.idType.equals(other.getIdType()))) &&
            ((this.idValue==null && other.getIdValue()==null) || 
             (this.idValue!=null &&
              this.idValue.equals(other.getIdValue()))) &&
            ((this.industry==null && other.getIndustry()==null) || 
             (this.industry!=null &&
              this.industry.equals(other.getIndustry()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.occupation==null && other.getOccupation()==null) || 
             (this.occupation!=null &&
              this.occupation.equals(other.getOccupation()))) &&
            ((this.oldIC==null && other.getOldIC()==null) || 
             (this.oldIC!=null &&
              this.oldIC.equals(other.getOldIC()))) &&
            ((this.personalIdType==null && other.getPersonalIdType()==null) || 
             (this.personalIdType!=null &&
              this.personalIdType.equals(other.getPersonalIdType()))) &&
            ((this.surName==null && other.getSurName()==null) || 
             (this.surName!=null &&
              this.surName.equals(other.getSurName()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
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
        if (getAnnualIncome() != null) {
            _hashCode += getAnnualIncome().hashCode();
        }
        if (getDateOfBirth() != null) {
            _hashCode += getDateOfBirth().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getGender() != null) {
            _hashCode += getGender().hashCode();
        }
        if (getGmpc() != null) {
            _hashCode += getGmpc().hashCode();
        }
        if (getIdType() != null) {
            _hashCode += getIdType().hashCode();
        }
        if (getIdValue() != null) {
            _hashCode += getIdValue().hashCode();
        }
        if (getIndustry() != null) {
            _hashCode += getIndustry().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getOccupation() != null) {
            _hashCode += getOccupation().hashCode();
        }
        if (getOldIC() != null) {
            _hashCode += getOldIC().hashCode();
        }
        if (getPersonalIdType() != null) {
            _hashCode += getPersonalIdType().hashCode();
        }
        if (getSurName() != null) {
            _hashCode += getSurName().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
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
        new org.apache.axis.description.TypeDesc(SubcriberPersonalInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "subcriberPersonalInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annualIncome");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "annualIncome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfBirth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "dateOfBirth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gender");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "gender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "GenderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gmpc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "gmpc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "idType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "PersonalIdentityType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "idValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("industry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "industry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "lastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("occupation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "occupation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldIC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "oldIC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalIdType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "personalIdType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "surName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "userName"));
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
