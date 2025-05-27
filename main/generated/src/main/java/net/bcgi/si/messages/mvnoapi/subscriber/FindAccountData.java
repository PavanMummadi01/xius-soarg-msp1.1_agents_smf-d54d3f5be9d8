/**
 * FindAccountData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.subscriber;

public class FindAccountData  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private java.lang.String accountNumber;

    private net.bcgi.si.messages.mvnoapi.subscriber.AccountStatus accountStatus;

    private java.lang.String businessName;

    private java.lang.String challengeAnswer;

    private java.lang.String challengeQuestion;

    private java.lang.String firstName;

    private java.lang.String lastName;

    private java.lang.String line1;

    private java.lang.Integer marketId;

    private java.lang.Integer score;

    private java.lang.Integer socialSecurityNumber;

    private java.lang.Integer totalDue;

    private org.apache.axis.message.MessageElement [] _any;

    public FindAccountData() {
    }

    public FindAccountData(
           java.lang.String accountNumber,
           net.bcgi.si.messages.mvnoapi.subscriber.AccountStatus accountStatus,
           java.lang.String businessName,
           java.lang.String challengeAnswer,
           java.lang.String challengeQuestion,
           java.lang.String firstName,
           java.lang.String lastName,
           java.lang.String line1,
           java.lang.Integer marketId,
           java.lang.Integer score,
           java.lang.Integer socialSecurityNumber,
           java.lang.Integer totalDue,
           org.apache.axis.message.MessageElement [] _any) {
           this.accountNumber = accountNumber;
           this.accountStatus = accountStatus;
           this.businessName = businessName;
           this.challengeAnswer = challengeAnswer;
           this.challengeQuestion = challengeQuestion;
           this.firstName = firstName;
           this.lastName = lastName;
           this.line1 = line1;
           this.marketId = marketId;
           this.score = score;
           this.socialSecurityNumber = socialSecurityNumber;
           this.totalDue = totalDue;
           this._any = _any;
    }


    /**
     * Gets the accountNumber value for this FindAccountData.
     * 
     * @return accountNumber
     */
    public java.lang.String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this FindAccountData.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(java.lang.String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the accountStatus value for this FindAccountData.
     * 
     * @return accountStatus
     */
    public net.bcgi.si.messages.mvnoapi.subscriber.AccountStatus getAccountStatus() {
        return accountStatus;
    }


    /**
     * Sets the accountStatus value for this FindAccountData.
     * 
     * @param accountStatus
     */
    public void setAccountStatus(net.bcgi.si.messages.mvnoapi.subscriber.AccountStatus accountStatus) {
        this.accountStatus = accountStatus;
    }


    /**
     * Gets the businessName value for this FindAccountData.
     * 
     * @return businessName
     */
    public java.lang.String getBusinessName() {
        return businessName;
    }


    /**
     * Sets the businessName value for this FindAccountData.
     * 
     * @param businessName
     */
    public void setBusinessName(java.lang.String businessName) {
        this.businessName = businessName;
    }


    /**
     * Gets the challengeAnswer value for this FindAccountData.
     * 
     * @return challengeAnswer
     */
    public java.lang.String getChallengeAnswer() {
        return challengeAnswer;
    }


    /**
     * Sets the challengeAnswer value for this FindAccountData.
     * 
     * @param challengeAnswer
     */
    public void setChallengeAnswer(java.lang.String challengeAnswer) {
        this.challengeAnswer = challengeAnswer;
    }


    /**
     * Gets the challengeQuestion value for this FindAccountData.
     * 
     * @return challengeQuestion
     */
    public java.lang.String getChallengeQuestion() {
        return challengeQuestion;
    }


    /**
     * Sets the challengeQuestion value for this FindAccountData.
     * 
     * @param challengeQuestion
     */
    public void setChallengeQuestion(java.lang.String challengeQuestion) {
        this.challengeQuestion = challengeQuestion;
    }


    /**
     * Gets the firstName value for this FindAccountData.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this FindAccountData.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the lastName value for this FindAccountData.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this FindAccountData.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the line1 value for this FindAccountData.
     * 
     * @return line1
     */
    public java.lang.String getLine1() {
        return line1;
    }


    /**
     * Sets the line1 value for this FindAccountData.
     * 
     * @param line1
     */
    public void setLine1(java.lang.String line1) {
        this.line1 = line1;
    }


    /**
     * Gets the marketId value for this FindAccountData.
     * 
     * @return marketId
     */
    public java.lang.Integer getMarketId() {
        return marketId;
    }


    /**
     * Sets the marketId value for this FindAccountData.
     * 
     * @param marketId
     */
    public void setMarketId(java.lang.Integer marketId) {
        this.marketId = marketId;
    }


    /**
     * Gets the score value for this FindAccountData.
     * 
     * @return score
     */
    public java.lang.Integer getScore() {
        return score;
    }


    /**
     * Sets the score value for this FindAccountData.
     * 
     * @param score
     */
    public void setScore(java.lang.Integer score) {
        this.score = score;
    }


    /**
     * Gets the socialSecurityNumber value for this FindAccountData.
     * 
     * @return socialSecurityNumber
     */
    public java.lang.Integer getSocialSecurityNumber() {
        return socialSecurityNumber;
    }


    /**
     * Sets the socialSecurityNumber value for this FindAccountData.
     * 
     * @param socialSecurityNumber
     */
    public void setSocialSecurityNumber(java.lang.Integer socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }


    /**
     * Gets the totalDue value for this FindAccountData.
     * 
     * @return totalDue
     */
    public java.lang.Integer getTotalDue() {
        return totalDue;
    }


    /**
     * Sets the totalDue value for this FindAccountData.
     * 
     * @param totalDue
     */
    public void setTotalDue(java.lang.Integer totalDue) {
        this.totalDue = totalDue;
    }


    /**
     * Gets the _any value for this FindAccountData.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this FindAccountData.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FindAccountData)) return false;
        FindAccountData other = (FindAccountData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.accountStatus==null && other.getAccountStatus()==null) || 
             (this.accountStatus!=null &&
              this.accountStatus.equals(other.getAccountStatus()))) &&
            ((this.businessName==null && other.getBusinessName()==null) || 
             (this.businessName!=null &&
              this.businessName.equals(other.getBusinessName()))) &&
            ((this.challengeAnswer==null && other.getChallengeAnswer()==null) || 
             (this.challengeAnswer!=null &&
              this.challengeAnswer.equals(other.getChallengeAnswer()))) &&
            ((this.challengeQuestion==null && other.getChallengeQuestion()==null) || 
             (this.challengeQuestion!=null &&
              this.challengeQuestion.equals(other.getChallengeQuestion()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.line1==null && other.getLine1()==null) || 
             (this.line1!=null &&
              this.line1.equals(other.getLine1()))) &&
            ((this.marketId==null && other.getMarketId()==null) || 
             (this.marketId!=null &&
              this.marketId.equals(other.getMarketId()))) &&
            ((this.score==null && other.getScore()==null) || 
             (this.score!=null &&
              this.score.equals(other.getScore()))) &&
            ((this.socialSecurityNumber==null && other.getSocialSecurityNumber()==null) || 
             (this.socialSecurityNumber!=null &&
              this.socialSecurityNumber.equals(other.getSocialSecurityNumber()))) &&
            ((this.totalDue==null && other.getTotalDue()==null) || 
             (this.totalDue!=null &&
              this.totalDue.equals(other.getTotalDue()))) &&
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
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getAccountStatus() != null) {
            _hashCode += getAccountStatus().hashCode();
        }
        if (getBusinessName() != null) {
            _hashCode += getBusinessName().hashCode();
        }
        if (getChallengeAnswer() != null) {
            _hashCode += getChallengeAnswer().hashCode();
        }
        if (getChallengeQuestion() != null) {
            _hashCode += getChallengeQuestion().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getLine1() != null) {
            _hashCode += getLine1().hashCode();
        }
        if (getMarketId() != null) {
            _hashCode += getMarketId().hashCode();
        }
        if (getScore() != null) {
            _hashCode += getScore().hashCode();
        }
        if (getSocialSecurityNumber() != null) {
            _hashCode += getSocialSecurityNumber().hashCode();
        }
        if (getTotalDue() != null) {
            _hashCode += getTotalDue().hashCode();
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
        new org.apache.axis.description.TypeDesc(FindAccountData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "FindAccountData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "accountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "accountStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "AccountStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "businessName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("challengeAnswer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "challengeAnswer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("challengeQuestion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "challengeQuestion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "firstName"));
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
        elemField.setFieldName("line1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "line1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "marketId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("score");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "score"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("socialSecurityNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "socialSecurityNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalDue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "totalDue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
