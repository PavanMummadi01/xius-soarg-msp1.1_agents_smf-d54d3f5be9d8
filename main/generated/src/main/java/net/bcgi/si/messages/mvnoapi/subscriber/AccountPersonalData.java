/**
 * AccountPersonalData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.subscriber;

public class AccountPersonalData  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private java.lang.Integer socialSecurityNumber;

    private net.bcgi.si.messages.mvnoapi.provisioning.AccountId accountId;

    private net.bcgi.si.messages.mvnoapi.subscriber.AddressData alternateAddress;

    private java.util.Calendar birthDate;

    private java.lang.String contactName;

    private java.lang.String creditAgency;

    private java.lang.Float creditHistory;

    private java.lang.Integer creditRating;

    private java.lang.String driverLicenceState;

    private java.lang.String driversLicence;

    private java.lang.String employer;

    private java.lang.Integer employerLength;

    private java.util.Calendar jointBirthDate;

    private java.lang.Integer jointSocialSecurityNumber;

    private java.lang.String workPhone;

    private org.apache.axis.message.MessageElement [] _any;

    public AccountPersonalData() {
    }

    public AccountPersonalData(
           java.lang.Integer socialSecurityNumber,
           net.bcgi.si.messages.mvnoapi.provisioning.AccountId accountId,
           net.bcgi.si.messages.mvnoapi.subscriber.AddressData alternateAddress,
           java.util.Calendar birthDate,
           java.lang.String contactName,
           java.lang.String creditAgency,
           java.lang.Float creditHistory,
           java.lang.Integer creditRating,
           java.lang.String driverLicenceState,
           java.lang.String driversLicence,
           java.lang.String employer,
           java.lang.Integer employerLength,
           java.util.Calendar jointBirthDate,
           java.lang.Integer jointSocialSecurityNumber,
           java.lang.String workPhone,
           org.apache.axis.message.MessageElement [] _any) {
           this.socialSecurityNumber = socialSecurityNumber;
           this.accountId = accountId;
           this.alternateAddress = alternateAddress;
           this.birthDate = birthDate;
           this.contactName = contactName;
           this.creditAgency = creditAgency;
           this.creditHistory = creditHistory;
           this.creditRating = creditRating;
           this.driverLicenceState = driverLicenceState;
           this.driversLicence = driversLicence;
           this.employer = employer;
           this.employerLength = employerLength;
           this.jointBirthDate = jointBirthDate;
           this.jointSocialSecurityNumber = jointSocialSecurityNumber;
           this.workPhone = workPhone;
           this._any = _any;
    }


    /**
     * Gets the socialSecurityNumber value for this AccountPersonalData.
     * 
     * @return socialSecurityNumber
     */
    public java.lang.Integer getSocialSecurityNumber() {
        return socialSecurityNumber;
    }


    /**
     * Sets the socialSecurityNumber value for this AccountPersonalData.
     * 
     * @param socialSecurityNumber
     */
    public void setSocialSecurityNumber(java.lang.Integer socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }


    /**
     * Gets the accountId value for this AccountPersonalData.
     * 
     * @return accountId
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.AccountId getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this AccountPersonalData.
     * 
     * @param accountId
     */
    public void setAccountId(net.bcgi.si.messages.mvnoapi.provisioning.AccountId accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the alternateAddress value for this AccountPersonalData.
     * 
     * @return alternateAddress
     */
    public net.bcgi.si.messages.mvnoapi.subscriber.AddressData getAlternateAddress() {
        return alternateAddress;
    }


    /**
     * Sets the alternateAddress value for this AccountPersonalData.
     * 
     * @param alternateAddress
     */
    public void setAlternateAddress(net.bcgi.si.messages.mvnoapi.subscriber.AddressData alternateAddress) {
        this.alternateAddress = alternateAddress;
    }


    /**
     * Gets the birthDate value for this AccountPersonalData.
     * 
     * @return birthDate
     */
    public java.util.Calendar getBirthDate() {
        return birthDate;
    }


    /**
     * Sets the birthDate value for this AccountPersonalData.
     * 
     * @param birthDate
     */
    public void setBirthDate(java.util.Calendar birthDate) {
        this.birthDate = birthDate;
    }


    /**
     * Gets the contactName value for this AccountPersonalData.
     * 
     * @return contactName
     */
    public java.lang.String getContactName() {
        return contactName;
    }


    /**
     * Sets the contactName value for this AccountPersonalData.
     * 
     * @param contactName
     */
    public void setContactName(java.lang.String contactName) {
        this.contactName = contactName;
    }


    /**
     * Gets the creditAgency value for this AccountPersonalData.
     * 
     * @return creditAgency
     */
    public java.lang.String getCreditAgency() {
        return creditAgency;
    }


    /**
     * Sets the creditAgency value for this AccountPersonalData.
     * 
     * @param creditAgency
     */
    public void setCreditAgency(java.lang.String creditAgency) {
        this.creditAgency = creditAgency;
    }


    /**
     * Gets the creditHistory value for this AccountPersonalData.
     * 
     * @return creditHistory
     */
    public java.lang.Float getCreditHistory() {
        return creditHistory;
    }


    /**
     * Sets the creditHistory value for this AccountPersonalData.
     * 
     * @param creditHistory
     */
    public void setCreditHistory(java.lang.Float creditHistory) {
        this.creditHistory = creditHistory;
    }


    /**
     * Gets the creditRating value for this AccountPersonalData.
     * 
     * @return creditRating
     */
    public java.lang.Integer getCreditRating() {
        return creditRating;
    }


    /**
     * Sets the creditRating value for this AccountPersonalData.
     * 
     * @param creditRating
     */
    public void setCreditRating(java.lang.Integer creditRating) {
        this.creditRating = creditRating;
    }


    /**
     * Gets the driverLicenceState value for this AccountPersonalData.
     * 
     * @return driverLicenceState
     */
    public java.lang.String getDriverLicenceState() {
        return driverLicenceState;
    }


    /**
     * Sets the driverLicenceState value for this AccountPersonalData.
     * 
     * @param driverLicenceState
     */
    public void setDriverLicenceState(java.lang.String driverLicenceState) {
        this.driverLicenceState = driverLicenceState;
    }


    /**
     * Gets the driversLicence value for this AccountPersonalData.
     * 
     * @return driversLicence
     */
    public java.lang.String getDriversLicence() {
        return driversLicence;
    }


    /**
     * Sets the driversLicence value for this AccountPersonalData.
     * 
     * @param driversLicence
     */
    public void setDriversLicence(java.lang.String driversLicence) {
        this.driversLicence = driversLicence;
    }


    /**
     * Gets the employer value for this AccountPersonalData.
     * 
     * @return employer
     */
    public java.lang.String getEmployer() {
        return employer;
    }


    /**
     * Sets the employer value for this AccountPersonalData.
     * 
     * @param employer
     */
    public void setEmployer(java.lang.String employer) {
        this.employer = employer;
    }


    /**
     * Gets the employerLength value for this AccountPersonalData.
     * 
     * @return employerLength
     */
    public java.lang.Integer getEmployerLength() {
        return employerLength;
    }


    /**
     * Sets the employerLength value for this AccountPersonalData.
     * 
     * @param employerLength
     */
    public void setEmployerLength(java.lang.Integer employerLength) {
        this.employerLength = employerLength;
    }


    /**
     * Gets the jointBirthDate value for this AccountPersonalData.
     * 
     * @return jointBirthDate
     */
    public java.util.Calendar getJointBirthDate() {
        return jointBirthDate;
    }


    /**
     * Sets the jointBirthDate value for this AccountPersonalData.
     * 
     * @param jointBirthDate
     */
    public void setJointBirthDate(java.util.Calendar jointBirthDate) {
        this.jointBirthDate = jointBirthDate;
    }


    /**
     * Gets the jointSocialSecurityNumber value for this AccountPersonalData.
     * 
     * @return jointSocialSecurityNumber
     */
    public java.lang.Integer getJointSocialSecurityNumber() {
        return jointSocialSecurityNumber;
    }


    /**
     * Sets the jointSocialSecurityNumber value for this AccountPersonalData.
     * 
     * @param jointSocialSecurityNumber
     */
    public void setJointSocialSecurityNumber(java.lang.Integer jointSocialSecurityNumber) {
        this.jointSocialSecurityNumber = jointSocialSecurityNumber;
    }


    /**
     * Gets the workPhone value for this AccountPersonalData.
     * 
     * @return workPhone
     */
    public java.lang.String getWorkPhone() {
        return workPhone;
    }


    /**
     * Sets the workPhone value for this AccountPersonalData.
     * 
     * @param workPhone
     */
    public void setWorkPhone(java.lang.String workPhone) {
        this.workPhone = workPhone;
    }


    /**
     * Gets the _any value for this AccountPersonalData.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this AccountPersonalData.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountPersonalData)) return false;
        AccountPersonalData other = (AccountPersonalData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.socialSecurityNumber==null && other.getSocialSecurityNumber()==null) || 
             (this.socialSecurityNumber!=null &&
              this.socialSecurityNumber.equals(other.getSocialSecurityNumber()))) &&
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.alternateAddress==null && other.getAlternateAddress()==null) || 
             (this.alternateAddress!=null &&
              this.alternateAddress.equals(other.getAlternateAddress()))) &&
            ((this.birthDate==null && other.getBirthDate()==null) || 
             (this.birthDate!=null &&
              this.birthDate.equals(other.getBirthDate()))) &&
            ((this.contactName==null && other.getContactName()==null) || 
             (this.contactName!=null &&
              this.contactName.equals(other.getContactName()))) &&
            ((this.creditAgency==null && other.getCreditAgency()==null) || 
             (this.creditAgency!=null &&
              this.creditAgency.equals(other.getCreditAgency()))) &&
            ((this.creditHistory==null && other.getCreditHistory()==null) || 
             (this.creditHistory!=null &&
              this.creditHistory.equals(other.getCreditHistory()))) &&
            ((this.creditRating==null && other.getCreditRating()==null) || 
             (this.creditRating!=null &&
              this.creditRating.equals(other.getCreditRating()))) &&
            ((this.driverLicenceState==null && other.getDriverLicenceState()==null) || 
             (this.driverLicenceState!=null &&
              this.driverLicenceState.equals(other.getDriverLicenceState()))) &&
            ((this.driversLicence==null && other.getDriversLicence()==null) || 
             (this.driversLicence!=null &&
              this.driversLicence.equals(other.getDriversLicence()))) &&
            ((this.employer==null && other.getEmployer()==null) || 
             (this.employer!=null &&
              this.employer.equals(other.getEmployer()))) &&
            ((this.employerLength==null && other.getEmployerLength()==null) || 
             (this.employerLength!=null &&
              this.employerLength.equals(other.getEmployerLength()))) &&
            ((this.jointBirthDate==null && other.getJointBirthDate()==null) || 
             (this.jointBirthDate!=null &&
              this.jointBirthDate.equals(other.getJointBirthDate()))) &&
            ((this.jointSocialSecurityNumber==null && other.getJointSocialSecurityNumber()==null) || 
             (this.jointSocialSecurityNumber!=null &&
              this.jointSocialSecurityNumber.equals(other.getJointSocialSecurityNumber()))) &&
            ((this.workPhone==null && other.getWorkPhone()==null) || 
             (this.workPhone!=null &&
              this.workPhone.equals(other.getWorkPhone()))) &&
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
        if (getSocialSecurityNumber() != null) {
            _hashCode += getSocialSecurityNumber().hashCode();
        }
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getAlternateAddress() != null) {
            _hashCode += getAlternateAddress().hashCode();
        }
        if (getBirthDate() != null) {
            _hashCode += getBirthDate().hashCode();
        }
        if (getContactName() != null) {
            _hashCode += getContactName().hashCode();
        }
        if (getCreditAgency() != null) {
            _hashCode += getCreditAgency().hashCode();
        }
        if (getCreditHistory() != null) {
            _hashCode += getCreditHistory().hashCode();
        }
        if (getCreditRating() != null) {
            _hashCode += getCreditRating().hashCode();
        }
        if (getDriverLicenceState() != null) {
            _hashCode += getDriverLicenceState().hashCode();
        }
        if (getDriversLicence() != null) {
            _hashCode += getDriversLicence().hashCode();
        }
        if (getEmployer() != null) {
            _hashCode += getEmployer().hashCode();
        }
        if (getEmployerLength() != null) {
            _hashCode += getEmployerLength().hashCode();
        }
        if (getJointBirthDate() != null) {
            _hashCode += getJointBirthDate().hashCode();
        }
        if (getJointSocialSecurityNumber() != null) {
            _hashCode += getJointSocialSecurityNumber().hashCode();
        }
        if (getWorkPhone() != null) {
            _hashCode += getWorkPhone().hashCode();
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
        new org.apache.axis.description.TypeDesc(AccountPersonalData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "AccountPersonalData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("socialSecurityNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "socialSecurityNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "accountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "AccountId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "alternateAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "AddressData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birthDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "birthDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "contactName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditAgency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "creditAgency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditHistory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "creditHistory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditRating");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "creditRating"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("driverLicenceState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "driverLicenceState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("driversLicence");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "driversLicence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "employer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employerLength");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "employerLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jointBirthDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "jointBirthDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jointSocialSecurityNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "jointSocialSecurityNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "workPhone"));
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
