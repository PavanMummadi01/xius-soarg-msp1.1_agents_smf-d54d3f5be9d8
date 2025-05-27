/**
 * PersonalData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.provisioning;

public class PersonalData  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private java.lang.String annualIncome;

    private java.lang.String city;

    private java.lang.String county;

    private java.util.Calendar dob;

    private java.lang.String driversLicence;

    private java.lang.String driversLicenceState;

    private java.lang.String employer;

    private java.lang.Integer employerLength;

    private java.lang.String ethnic;

    private net.bcgi.si.messages.mvnoapi.common.GenderType gender;

    private java.lang.String gmpc;

    private net.bcgi.si.messages.mvnoapi.common.PersonalIdentityType identityType;

    private java.lang.String industry;

    private java.lang.String msisdn;

    private java.lang.String nationality;

    private java.lang.String occupation;

    private java.lang.String password;

    private java.lang.String personalIdentificationNumber;

    private java.lang.String pleaseSpecify;

    private java.lang.String securityAnswer;

    private java.lang.String securityQuestion;

    private java.lang.String simImageName;

    private java.lang.String sourceOfInfo;

    private java.lang.String ssn;

    private java.lang.String userId;

    private java.lang.String workPhone;

    private org.apache.axis.message.MessageElement [] _any;

    public PersonalData() {
    }

    public PersonalData(
           java.lang.String annualIncome,
           java.lang.String city,
           java.lang.String county,
           java.util.Calendar dob,
           java.lang.String driversLicence,
           java.lang.String driversLicenceState,
           java.lang.String employer,
           java.lang.Integer employerLength,
           java.lang.String ethnic,
           net.bcgi.si.messages.mvnoapi.common.GenderType gender,
           java.lang.String gmpc,
           net.bcgi.si.messages.mvnoapi.common.PersonalIdentityType identityType,
           java.lang.String industry,
           java.lang.String msisdn,
           java.lang.String nationality,
           java.lang.String occupation,
           java.lang.String password,
           java.lang.String personalIdentificationNumber,
           java.lang.String pleaseSpecify,
           java.lang.String securityAnswer,
           java.lang.String securityQuestion,
           java.lang.String simImageName,
           java.lang.String sourceOfInfo,
           java.lang.String ssn,
           java.lang.String userId,
           java.lang.String workPhone,
           org.apache.axis.message.MessageElement [] _any) {
           this.annualIncome = annualIncome;
           this.city = city;
           this.county = county;
           this.dob = dob;
           this.driversLicence = driversLicence;
           this.driversLicenceState = driversLicenceState;
           this.employer = employer;
           this.employerLength = employerLength;
           this.ethnic = ethnic;
           this.gender = gender;
           this.gmpc = gmpc;
           this.identityType = identityType;
           this.industry = industry;
           this.msisdn = msisdn;
           this.nationality = nationality;
           this.occupation = occupation;
           this.password = password;
           this.personalIdentificationNumber = personalIdentificationNumber;
           this.pleaseSpecify = pleaseSpecify;
           this.securityAnswer = securityAnswer;
           this.securityQuestion = securityQuestion;
           this.simImageName = simImageName;
           this.sourceOfInfo = sourceOfInfo;
           this.ssn = ssn;
           this.userId = userId;
           this.workPhone = workPhone;
           this._any = _any;
    }


    /**
     * Gets the annualIncome value for this PersonalData.
     * 
     * @return annualIncome
     */
    public java.lang.String getAnnualIncome() {
        return annualIncome;
    }


    /**
     * Sets the annualIncome value for this PersonalData.
     * 
     * @param annualIncome
     */
    public void setAnnualIncome(java.lang.String annualIncome) {
        this.annualIncome = annualIncome;
    }


    /**
     * Gets the city value for this PersonalData.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this PersonalData.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the county value for this PersonalData.
     * 
     * @return county
     */
    public java.lang.String getCounty() {
        return county;
    }


    /**
     * Sets the county value for this PersonalData.
     * 
     * @param county
     */
    public void setCounty(java.lang.String county) {
        this.county = county;
    }


    /**
     * Gets the dob value for this PersonalData.
     * 
     * @return dob
     */
    public java.util.Calendar getDob() {
        return dob;
    }


    /**
     * Sets the dob value for this PersonalData.
     * 
     * @param dob
     */
    public void setDob(java.util.Calendar dob) {
        this.dob = dob;
    }


    /**
     * Gets the driversLicence value for this PersonalData.
     * 
     * @return driversLicence
     */
    public java.lang.String getDriversLicence() {
        return driversLicence;
    }


    /**
     * Sets the driversLicence value for this PersonalData.
     * 
     * @param driversLicence
     */
    public void setDriversLicence(java.lang.String driversLicence) {
        this.driversLicence = driversLicence;
    }


    /**
     * Gets the driversLicenceState value for this PersonalData.
     * 
     * @return driversLicenceState
     */
    public java.lang.String getDriversLicenceState() {
        return driversLicenceState;
    }


    /**
     * Sets the driversLicenceState value for this PersonalData.
     * 
     * @param driversLicenceState
     */
    public void setDriversLicenceState(java.lang.String driversLicenceState) {
        this.driversLicenceState = driversLicenceState;
    }


    /**
     * Gets the employer value for this PersonalData.
     * 
     * @return employer
     */
    public java.lang.String getEmployer() {
        return employer;
    }


    /**
     * Sets the employer value for this PersonalData.
     * 
     * @param employer
     */
    public void setEmployer(java.lang.String employer) {
        this.employer = employer;
    }


    /**
     * Gets the employerLength value for this PersonalData.
     * 
     * @return employerLength
     */
    public java.lang.Integer getEmployerLength() {
        return employerLength;
    }


    /**
     * Sets the employerLength value for this PersonalData.
     * 
     * @param employerLength
     */
    public void setEmployerLength(java.lang.Integer employerLength) {
        this.employerLength = employerLength;
    }


    /**
     * Gets the ethnic value for this PersonalData.
     * 
     * @return ethnic
     */
    public java.lang.String getEthnic() {
        return ethnic;
    }


    /**
     * Sets the ethnic value for this PersonalData.
     * 
     * @param ethnic
     */
    public void setEthnic(java.lang.String ethnic) {
        this.ethnic = ethnic;
    }


    /**
     * Gets the gender value for this PersonalData.
     * 
     * @return gender
     */
    public net.bcgi.si.messages.mvnoapi.common.GenderType getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this PersonalData.
     * 
     * @param gender
     */
    public void setGender(net.bcgi.si.messages.mvnoapi.common.GenderType gender) {
        this.gender = gender;
    }


    /**
     * Gets the gmpc value for this PersonalData.
     * 
     * @return gmpc
     */
    public java.lang.String getGmpc() {
        return gmpc;
    }


    /**
     * Sets the gmpc value for this PersonalData.
     * 
     * @param gmpc
     */
    public void setGmpc(java.lang.String gmpc) {
        this.gmpc = gmpc;
    }


    /**
     * Gets the identityType value for this PersonalData.
     * 
     * @return identityType
     */
    public net.bcgi.si.messages.mvnoapi.common.PersonalIdentityType getIdentityType() {
        return identityType;
    }


    /**
     * Sets the identityType value for this PersonalData.
     * 
     * @param identityType
     */
    public void setIdentityType(net.bcgi.si.messages.mvnoapi.common.PersonalIdentityType identityType) {
        this.identityType = identityType;
    }


    /**
     * Gets the industry value for this PersonalData.
     * 
     * @return industry
     */
    public java.lang.String getIndustry() {
        return industry;
    }


    /**
     * Sets the industry value for this PersonalData.
     * 
     * @param industry
     */
    public void setIndustry(java.lang.String industry) {
        this.industry = industry;
    }


    /**
     * Gets the msisdn value for this PersonalData.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this PersonalData.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the nationality value for this PersonalData.
     * 
     * @return nationality
     */
    public java.lang.String getNationality() {
        return nationality;
    }


    /**
     * Sets the nationality value for this PersonalData.
     * 
     * @param nationality
     */
    public void setNationality(java.lang.String nationality) {
        this.nationality = nationality;
    }


    /**
     * Gets the occupation value for this PersonalData.
     * 
     * @return occupation
     */
    public java.lang.String getOccupation() {
        return occupation;
    }


    /**
     * Sets the occupation value for this PersonalData.
     * 
     * @param occupation
     */
    public void setOccupation(java.lang.String occupation) {
        this.occupation = occupation;
    }


    /**
     * Gets the password value for this PersonalData.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this PersonalData.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the personalIdentificationNumber value for this PersonalData.
     * 
     * @return personalIdentificationNumber
     */
    public java.lang.String getPersonalIdentificationNumber() {
        return personalIdentificationNumber;
    }


    /**
     * Sets the personalIdentificationNumber value for this PersonalData.
     * 
     * @param personalIdentificationNumber
     */
    public void setPersonalIdentificationNumber(java.lang.String personalIdentificationNumber) {
        this.personalIdentificationNumber = personalIdentificationNumber;
    }


    /**
     * Gets the pleaseSpecify value for this PersonalData.
     * 
     * @return pleaseSpecify
     */
    public java.lang.String getPleaseSpecify() {
        return pleaseSpecify;
    }


    /**
     * Sets the pleaseSpecify value for this PersonalData.
     * 
     * @param pleaseSpecify
     */
    public void setPleaseSpecify(java.lang.String pleaseSpecify) {
        this.pleaseSpecify = pleaseSpecify;
    }


    /**
     * Gets the securityAnswer value for this PersonalData.
     * 
     * @return securityAnswer
     */
    public java.lang.String getSecurityAnswer() {
        return securityAnswer;
    }


    /**
     * Sets the securityAnswer value for this PersonalData.
     * 
     * @param securityAnswer
     */
    public void setSecurityAnswer(java.lang.String securityAnswer) {
        this.securityAnswer = securityAnswer;
    }


    /**
     * Gets the securityQuestion value for this PersonalData.
     * 
     * @return securityQuestion
     */
    public java.lang.String getSecurityQuestion() {
        return securityQuestion;
    }


    /**
     * Sets the securityQuestion value for this PersonalData.
     * 
     * @param securityQuestion
     */
    public void setSecurityQuestion(java.lang.String securityQuestion) {
        this.securityQuestion = securityQuestion;
    }


    /**
     * Gets the simImageName value for this PersonalData.
     * 
     * @return simImageName
     */
    public java.lang.String getSimImageName() {
        return simImageName;
    }


    /**
     * Sets the simImageName value for this PersonalData.
     * 
     * @param simImageName
     */
    public void setSimImageName(java.lang.String simImageName) {
        this.simImageName = simImageName;
    }


    /**
     * Gets the sourceOfInfo value for this PersonalData.
     * 
     * @return sourceOfInfo
     */
    public java.lang.String getSourceOfInfo() {
        return sourceOfInfo;
    }


    /**
     * Sets the sourceOfInfo value for this PersonalData.
     * 
     * @param sourceOfInfo
     */
    public void setSourceOfInfo(java.lang.String sourceOfInfo) {
        this.sourceOfInfo = sourceOfInfo;
    }


    /**
     * Gets the ssn value for this PersonalData.
     * 
     * @return ssn
     */
    public java.lang.String getSsn() {
        return ssn;
    }


    /**
     * Sets the ssn value for this PersonalData.
     * 
     * @param ssn
     */
    public void setSsn(java.lang.String ssn) {
        this.ssn = ssn;
    }


    /**
     * Gets the userId value for this PersonalData.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this PersonalData.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }


    /**
     * Gets the workPhone value for this PersonalData.
     * 
     * @return workPhone
     */
    public java.lang.String getWorkPhone() {
        return workPhone;
    }


    /**
     * Sets the workPhone value for this PersonalData.
     * 
     * @param workPhone
     */
    public void setWorkPhone(java.lang.String workPhone) {
        this.workPhone = workPhone;
    }


    /**
     * Gets the _any value for this PersonalData.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this PersonalData.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PersonalData)) return false;
        PersonalData other = (PersonalData) obj;
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
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.county==null && other.getCounty()==null) || 
             (this.county!=null &&
              this.county.equals(other.getCounty()))) &&
            ((this.dob==null && other.getDob()==null) || 
             (this.dob!=null &&
              this.dob.equals(other.getDob()))) &&
            ((this.driversLicence==null && other.getDriversLicence()==null) || 
             (this.driversLicence!=null &&
              this.driversLicence.equals(other.getDriversLicence()))) &&
            ((this.driversLicenceState==null && other.getDriversLicenceState()==null) || 
             (this.driversLicenceState!=null &&
              this.driversLicenceState.equals(other.getDriversLicenceState()))) &&
            ((this.employer==null && other.getEmployer()==null) || 
             (this.employer!=null &&
              this.employer.equals(other.getEmployer()))) &&
            ((this.employerLength==null && other.getEmployerLength()==null) || 
             (this.employerLength!=null &&
              this.employerLength.equals(other.getEmployerLength()))) &&
            ((this.ethnic==null && other.getEthnic()==null) || 
             (this.ethnic!=null &&
              this.ethnic.equals(other.getEthnic()))) &&
            ((this.gender==null && other.getGender()==null) || 
             (this.gender!=null &&
              this.gender.equals(other.getGender()))) &&
            ((this.gmpc==null && other.getGmpc()==null) || 
             (this.gmpc!=null &&
              this.gmpc.equals(other.getGmpc()))) &&
            ((this.identityType==null && other.getIdentityType()==null) || 
             (this.identityType!=null &&
              this.identityType.equals(other.getIdentityType()))) &&
            ((this.industry==null && other.getIndustry()==null) || 
             (this.industry!=null &&
              this.industry.equals(other.getIndustry()))) &&
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.nationality==null && other.getNationality()==null) || 
             (this.nationality!=null &&
              this.nationality.equals(other.getNationality()))) &&
            ((this.occupation==null && other.getOccupation()==null) || 
             (this.occupation!=null &&
              this.occupation.equals(other.getOccupation()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.personalIdentificationNumber==null && other.getPersonalIdentificationNumber()==null) || 
             (this.personalIdentificationNumber!=null &&
              this.personalIdentificationNumber.equals(other.getPersonalIdentificationNumber()))) &&
            ((this.pleaseSpecify==null && other.getPleaseSpecify()==null) || 
             (this.pleaseSpecify!=null &&
              this.pleaseSpecify.equals(other.getPleaseSpecify()))) &&
            ((this.securityAnswer==null && other.getSecurityAnswer()==null) || 
             (this.securityAnswer!=null &&
              this.securityAnswer.equals(other.getSecurityAnswer()))) &&
            ((this.securityQuestion==null && other.getSecurityQuestion()==null) || 
             (this.securityQuestion!=null &&
              this.securityQuestion.equals(other.getSecurityQuestion()))) &&
            ((this.simImageName==null && other.getSimImageName()==null) || 
             (this.simImageName!=null &&
              this.simImageName.equals(other.getSimImageName()))) &&
            ((this.sourceOfInfo==null && other.getSourceOfInfo()==null) || 
             (this.sourceOfInfo!=null &&
              this.sourceOfInfo.equals(other.getSourceOfInfo()))) &&
            ((this.ssn==null && other.getSsn()==null) || 
             (this.ssn!=null &&
              this.ssn.equals(other.getSsn()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
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
        if (getAnnualIncome() != null) {
            _hashCode += getAnnualIncome().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getCounty() != null) {
            _hashCode += getCounty().hashCode();
        }
        if (getDob() != null) {
            _hashCode += getDob().hashCode();
        }
        if (getDriversLicence() != null) {
            _hashCode += getDriversLicence().hashCode();
        }
        if (getDriversLicenceState() != null) {
            _hashCode += getDriversLicenceState().hashCode();
        }
        if (getEmployer() != null) {
            _hashCode += getEmployer().hashCode();
        }
        if (getEmployerLength() != null) {
            _hashCode += getEmployerLength().hashCode();
        }
        if (getEthnic() != null) {
            _hashCode += getEthnic().hashCode();
        }
        if (getGender() != null) {
            _hashCode += getGender().hashCode();
        }
        if (getGmpc() != null) {
            _hashCode += getGmpc().hashCode();
        }
        if (getIdentityType() != null) {
            _hashCode += getIdentityType().hashCode();
        }
        if (getIndustry() != null) {
            _hashCode += getIndustry().hashCode();
        }
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getNationality() != null) {
            _hashCode += getNationality().hashCode();
        }
        if (getOccupation() != null) {
            _hashCode += getOccupation().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getPersonalIdentificationNumber() != null) {
            _hashCode += getPersonalIdentificationNumber().hashCode();
        }
        if (getPleaseSpecify() != null) {
            _hashCode += getPleaseSpecify().hashCode();
        }
        if (getSecurityAnswer() != null) {
            _hashCode += getSecurityAnswer().hashCode();
        }
        if (getSecurityQuestion() != null) {
            _hashCode += getSecurityQuestion().hashCode();
        }
        if (getSimImageName() != null) {
            _hashCode += getSimImageName().hashCode();
        }
        if (getSourceOfInfo() != null) {
            _hashCode += getSourceOfInfo().hashCode();
        }
        if (getSsn() != null) {
            _hashCode += getSsn().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
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
        new org.apache.axis.description.TypeDesc(PersonalData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "PersonalData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annualIncome");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "annualIncome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("county");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "county"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dob");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "dob"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("driversLicence");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "driversLicence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("driversLicenceState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "driversLicenceState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "employer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employerLength");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "employerLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ethnic");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "ethnic"));
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
        elemField.setFieldName("identityType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "identityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "PersonalIdentityType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("industry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "industry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nationality");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "nationality"));
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
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalIdentificationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "personalIdentificationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pleaseSpecify");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "pleaseSpecify"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityAnswer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "securityAnswer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityQuestion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "securityQuestion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("simImageName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "simImageName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceOfInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "sourceOfInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ssn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "ssn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "workPhone"));
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
