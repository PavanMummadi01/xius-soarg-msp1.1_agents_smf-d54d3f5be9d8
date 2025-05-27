/**
 * AccountPreferences.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.subscriber;

public class AccountPreferences  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private net.bcgi.si.messages.mvnoapi.subscriber.LanguageType language;

    private net.bcgi.si.messages.mvnoapi.subscriber.MessageLevelType messageLevel;

    private java.lang.String securityCode;

    private org.apache.axis.message.MessageElement [] _any;

    public AccountPreferences() {
    }

    public AccountPreferences(
           net.bcgi.si.messages.mvnoapi.subscriber.LanguageType language,
           net.bcgi.si.messages.mvnoapi.subscriber.MessageLevelType messageLevel,
           java.lang.String securityCode,
           org.apache.axis.message.MessageElement [] _any) {
           this.language = language;
           this.messageLevel = messageLevel;
           this.securityCode = securityCode;
           this._any = _any;
    }


    /**
     * Gets the language value for this AccountPreferences.
     * 
     * @return language
     */
    public net.bcgi.si.messages.mvnoapi.subscriber.LanguageType getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this AccountPreferences.
     * 
     * @param language
     */
    public void setLanguage(net.bcgi.si.messages.mvnoapi.subscriber.LanguageType language) {
        this.language = language;
    }


    /**
     * Gets the messageLevel value for this AccountPreferences.
     * 
     * @return messageLevel
     */
    public net.bcgi.si.messages.mvnoapi.subscriber.MessageLevelType getMessageLevel() {
        return messageLevel;
    }


    /**
     * Sets the messageLevel value for this AccountPreferences.
     * 
     * @param messageLevel
     */
    public void setMessageLevel(net.bcgi.si.messages.mvnoapi.subscriber.MessageLevelType messageLevel) {
        this.messageLevel = messageLevel;
    }


    /**
     * Gets the securityCode value for this AccountPreferences.
     * 
     * @return securityCode
     */
    public java.lang.String getSecurityCode() {
        return securityCode;
    }


    /**
     * Sets the securityCode value for this AccountPreferences.
     * 
     * @param securityCode
     */
    public void setSecurityCode(java.lang.String securityCode) {
        this.securityCode = securityCode;
    }


    /**
     * Gets the _any value for this AccountPreferences.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this AccountPreferences.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountPreferences)) return false;
        AccountPreferences other = (AccountPreferences) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.messageLevel==null && other.getMessageLevel()==null) || 
             (this.messageLevel!=null &&
              this.messageLevel.equals(other.getMessageLevel()))) &&
            ((this.securityCode==null && other.getSecurityCode()==null) || 
             (this.securityCode!=null &&
              this.securityCode.equals(other.getSecurityCode()))) &&
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
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        if (getMessageLevel() != null) {
            _hashCode += getMessageLevel().hashCode();
        }
        if (getSecurityCode() != null) {
            _hashCode += getSecurityCode().hashCode();
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
        new org.apache.axis.description.TypeDesc(AccountPreferences.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "AccountPreferences"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "LanguageType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "messageLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "MessageLevelType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "securityCode"));
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
