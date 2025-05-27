/**
 * UpdateCAAccountRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.selfcare.communityaccountservice;

public class UpdateCAAccountRequest  extends com.xius.xbus.messages.common.WSRequest  implements java.io.Serializable {
    private com.xius.xbus.messages.selfcare.communityaccountservice.IDType id;

    private com.xius.xbus.messages.common.OptionFlagType optionFlag;

    public UpdateCAAccountRequest() {
    }

    public UpdateCAAccountRequest(
           com.xius.xbus.messages.common.UserType userType,
           java.lang.String messageID,
           com.xius.xbus.messages.common.SecurityId securityId,
           com.xius.xbus.messages.common.ServiceContext serviceContext,
           java.lang.String version,
           com.xius.xbus.messages.selfcare.communityaccountservice.IDType id,
           com.xius.xbus.messages.common.OptionFlagType optionFlag) {
        super(
            userType,
            messageID,
            securityId,
            serviceContext,
            version);
        this.id = id;
        this.optionFlag = optionFlag;
    }


    /**
     * Gets the id value for this UpdateCAAccountRequest.
     * 
     * @return id
     */
    public com.xius.xbus.messages.selfcare.communityaccountservice.IDType getId() {
        return id;
    }


    /**
     * Sets the id value for this UpdateCAAccountRequest.
     * 
     * @param id
     */
    public void setId(com.xius.xbus.messages.selfcare.communityaccountservice.IDType id) {
        this.id = id;
    }


    /**
     * Gets the optionFlag value for this UpdateCAAccountRequest.
     * 
     * @return optionFlag
     */
    public com.xius.xbus.messages.common.OptionFlagType getOptionFlag() {
        return optionFlag;
    }


    /**
     * Sets the optionFlag value for this UpdateCAAccountRequest.
     * 
     * @param optionFlag
     */
    public void setOptionFlag(com.xius.xbus.messages.common.OptionFlagType optionFlag) {
        this.optionFlag = optionFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateCAAccountRequest)) return false;
        UpdateCAAccountRequest other = (UpdateCAAccountRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.optionFlag==null && other.getOptionFlag()==null) || 
             (this.optionFlag!=null &&
              this.optionFlag.equals(other.getOptionFlag())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getOptionFlag() != null) {
            _hashCode += getOptionFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateCAAccountRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">UpdateCAAccountRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "IDType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "optionFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "OptionFlagType"));
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
