/**
 * AccountChallengeData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.provisioning;

public class AccountChallengeData  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private java.lang.String challengeAnswer;

    private java.lang.String challengeQuestion;

    private org.apache.axis.message.MessageElement [] _any;

    public AccountChallengeData() {
    }

    public AccountChallengeData(
           java.lang.String challengeAnswer,
           java.lang.String challengeQuestion,
           org.apache.axis.message.MessageElement [] _any) {
           this.challengeAnswer = challengeAnswer;
           this.challengeQuestion = challengeQuestion;
           this._any = _any;
    }


    /**
     * Gets the challengeAnswer value for this AccountChallengeData.
     * 
     * @return challengeAnswer
     */
    public java.lang.String getChallengeAnswer() {
        return challengeAnswer;
    }


    /**
     * Sets the challengeAnswer value for this AccountChallengeData.
     * 
     * @param challengeAnswer
     */
    public void setChallengeAnswer(java.lang.String challengeAnswer) {
        this.challengeAnswer = challengeAnswer;
    }


    /**
     * Gets the challengeQuestion value for this AccountChallengeData.
     * 
     * @return challengeQuestion
     */
    public java.lang.String getChallengeQuestion() {
        return challengeQuestion;
    }


    /**
     * Sets the challengeQuestion value for this AccountChallengeData.
     * 
     * @param challengeQuestion
     */
    public void setChallengeQuestion(java.lang.String challengeQuestion) {
        this.challengeQuestion = challengeQuestion;
    }


    /**
     * Gets the _any value for this AccountChallengeData.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this AccountChallengeData.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountChallengeData)) return false;
        AccountChallengeData other = (AccountChallengeData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.challengeAnswer==null && other.getChallengeAnswer()==null) || 
             (this.challengeAnswer!=null &&
              this.challengeAnswer.equals(other.getChallengeAnswer()))) &&
            ((this.challengeQuestion==null && other.getChallengeQuestion()==null) || 
             (this.challengeQuestion!=null &&
              this.challengeQuestion.equals(other.getChallengeQuestion()))) &&
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
        if (getChallengeAnswer() != null) {
            _hashCode += getChallengeAnswer().hashCode();
        }
        if (getChallengeQuestion() != null) {
            _hashCode += getChallengeQuestion().hashCode();
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
        new org.apache.axis.description.TypeDesc(AccountChallengeData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "AccountChallengeData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("challengeAnswer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "challengeAnswer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("challengeQuestion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "challengeQuestion"));
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
