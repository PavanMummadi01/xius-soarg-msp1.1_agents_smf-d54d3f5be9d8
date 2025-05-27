/**
 * GetAccountRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.selfcare.services;

public class GetAccountRequest  extends com.xius.xbus.messages.common.WSRequest  implements java.io.Serializable {
    private java.lang.String msisdn;

    private java.lang.String ivr;

    private java.lang.String vms;

    private com.xius.xbus.messages.common.AccountRetrievalType retrievalType;

    private com.xius.xbus.messages.common.AccountRetrievalIdType actRetrievalType;

    private java.lang.String actRetrievalValue;

    public GetAccountRequest() {
    }

    public GetAccountRequest(
           com.xius.xbus.messages.common.UserType userType,
           java.lang.String messageID,
           com.xius.xbus.messages.common.SecurityId securityId,
           com.xius.xbus.messages.common.ServiceContext serviceContext,
           java.lang.String version,
           java.lang.String msisdn,
           java.lang.String ivr,
           java.lang.String vms,
           com.xius.xbus.messages.common.AccountRetrievalType retrievalType,
           com.xius.xbus.messages.common.AccountRetrievalIdType actRetrievalType,
           java.lang.String actRetrievalValue) {
        super(
            userType,
            messageID,
            securityId,
            serviceContext,
            version);
        this.msisdn = msisdn;
        this.ivr = ivr;
        this.vms = vms;
        this.retrievalType = retrievalType;
        this.actRetrievalType = actRetrievalType;
        this.actRetrievalValue = actRetrievalValue;
    }


    /**
     * Gets the msisdn value for this GetAccountRequest.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this GetAccountRequest.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the ivr value for this GetAccountRequest.
     * 
     * @return ivr
     */
    public java.lang.String getIvr() {
        return ivr;
    }


    /**
     * Sets the ivr value for this GetAccountRequest.
     * 
     * @param ivr
     */
    public void setIvr(java.lang.String ivr) {
        this.ivr = ivr;
    }


    /**
     * Gets the vms value for this GetAccountRequest.
     * 
     * @return vms
     */
    public java.lang.String getVms() {
        return vms;
    }


    /**
     * Sets the vms value for this GetAccountRequest.
     * 
     * @param vms
     */
    public void setVms(java.lang.String vms) {
        this.vms = vms;
    }


    /**
     * Gets the retrievalType value for this GetAccountRequest.
     * 
     * @return retrievalType
     */
    public com.xius.xbus.messages.common.AccountRetrievalType getRetrievalType() {
        return retrievalType;
    }


    /**
     * Sets the retrievalType value for this GetAccountRequest.
     * 
     * @param retrievalType
     */
    public void setRetrievalType(com.xius.xbus.messages.common.AccountRetrievalType retrievalType) {
        this.retrievalType = retrievalType;
    }


    /**
     * Gets the actRetrievalType value for this GetAccountRequest.
     * 
     * @return actRetrievalType
     */
    public com.xius.xbus.messages.common.AccountRetrievalIdType getActRetrievalType() {
        return actRetrievalType;
    }


    /**
     * Sets the actRetrievalType value for this GetAccountRequest.
     * 
     * @param actRetrievalType
     */
    public void setActRetrievalType(com.xius.xbus.messages.common.AccountRetrievalIdType actRetrievalType) {
        this.actRetrievalType = actRetrievalType;
    }


    /**
     * Gets the actRetrievalValue value for this GetAccountRequest.
     * 
     * @return actRetrievalValue
     */
    public java.lang.String getActRetrievalValue() {
        return actRetrievalValue;
    }


    /**
     * Sets the actRetrievalValue value for this GetAccountRequest.
     * 
     * @param actRetrievalValue
     */
    public void setActRetrievalValue(java.lang.String actRetrievalValue) {
        this.actRetrievalValue = actRetrievalValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAccountRequest)) return false;
        GetAccountRequest other = (GetAccountRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.ivr==null && other.getIvr()==null) || 
             (this.ivr!=null &&
              this.ivr.equals(other.getIvr()))) &&
            ((this.vms==null && other.getVms()==null) || 
             (this.vms!=null &&
              this.vms.equals(other.getVms()))) &&
            ((this.retrievalType==null && other.getRetrievalType()==null) || 
             (this.retrievalType!=null &&
              this.retrievalType.equals(other.getRetrievalType()))) &&
            ((this.actRetrievalType==null && other.getActRetrievalType()==null) || 
             (this.actRetrievalType!=null &&
              this.actRetrievalType.equals(other.getActRetrievalType()))) &&
            ((this.actRetrievalValue==null && other.getActRetrievalValue()==null) || 
             (this.actRetrievalValue!=null &&
              this.actRetrievalValue.equals(other.getActRetrievalValue())));
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
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getIvr() != null) {
            _hashCode += getIvr().hashCode();
        }
        if (getVms() != null) {
            _hashCode += getVms().hashCode();
        }
        if (getRetrievalType() != null) {
            _hashCode += getRetrievalType().hashCode();
        }
        if (getActRetrievalType() != null) {
            _hashCode += getActRetrievalType().hashCode();
        }
        if (getActRetrievalValue() != null) {
            _hashCode += getActRetrievalValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAccountRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">getAccountRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ivr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "ivr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vms");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "vms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retrievalType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "retrievalType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "AccountRetrievalType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actRetrievalType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "actRetrievalType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "AccountRetrievalIdType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actRetrievalValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "actRetrievalValue"));
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
