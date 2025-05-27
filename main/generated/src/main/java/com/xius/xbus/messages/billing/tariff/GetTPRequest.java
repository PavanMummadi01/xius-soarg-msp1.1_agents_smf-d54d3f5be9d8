/**
 * GetTPRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.tariff;

public class GetTPRequest  extends com.xius.xbus.messages.common.WSRequest  implements java.io.Serializable {
    private com.xius.xbus.messages.common.AccountType account;

    private java.lang.String eventFlag;

    private java.lang.String atpCategory;

    public GetTPRequest() {
    }

    public GetTPRequest(
           com.xius.xbus.messages.common.UserType userType,
           java.lang.String messageID,
           com.xius.xbus.messages.common.SecurityId securityId,
           com.xius.xbus.messages.common.ServiceContext serviceContext,
           java.lang.String version,
           com.xius.xbus.messages.common.AccountType account,
           java.lang.String eventFlag,
           java.lang.String atpCategory) {
        super(
            userType,
            messageID,
            securityId,
            serviceContext,
            version);
        this.account = account;
        this.eventFlag = eventFlag;
        this.atpCategory = atpCategory;
    }


    /**
     * Gets the account value for this GetTPRequest.
     * 
     * @return account
     */
    public com.xius.xbus.messages.common.AccountType getAccount() {
        return account;
    }


    /**
     * Sets the account value for this GetTPRequest.
     * 
     * @param account
     */
    public void setAccount(com.xius.xbus.messages.common.AccountType account) {
        this.account = account;
    }


    /**
     * Gets the eventFlag value for this GetTPRequest.
     * 
     * @return eventFlag
     */
    public java.lang.String getEventFlag() {
        return eventFlag;
    }


    /**
     * Sets the eventFlag value for this GetTPRequest.
     * 
     * @param eventFlag
     */
    public void setEventFlag(java.lang.String eventFlag) {
        this.eventFlag = eventFlag;
    }


    /**
     * Gets the atpCategory value for this GetTPRequest.
     * 
     * @return atpCategory
     */
    public java.lang.String getAtpCategory() {
        return atpCategory;
    }


    /**
     * Sets the atpCategory value for this GetTPRequest.
     * 
     * @param atpCategory
     */
    public void setAtpCategory(java.lang.String atpCategory) {
        this.atpCategory = atpCategory;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTPRequest)) return false;
        GetTPRequest other = (GetTPRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.eventFlag==null && other.getEventFlag()==null) || 
             (this.eventFlag!=null &&
              this.eventFlag.equals(other.getEventFlag()))) &&
            ((this.atpCategory==null && other.getAtpCategory()==null) || 
             (this.atpCategory!=null &&
              this.atpCategory.equals(other.getAtpCategory())));
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
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getEventFlag() != null) {
            _hashCode += getEventFlag().hashCode();
        }
        if (getAtpCategory() != null) {
            _hashCode += getAtpCategory().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetTPRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getTPRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "AccountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "eventFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atpCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "atpCategory"));
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
