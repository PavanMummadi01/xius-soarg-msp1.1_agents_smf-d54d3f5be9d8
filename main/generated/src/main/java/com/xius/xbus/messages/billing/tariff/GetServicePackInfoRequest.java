/**
 * GetServicePackInfoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.tariff;

public class GetServicePackInfoRequest  extends com.xius.xbus.messages.common.WSRequest  implements java.io.Serializable {
    private com.xius.xbus.messages.common.AccountType account;

    private java.lang.String caSvcpkgFlag;

    private java.lang.String atpCategory;

    public GetServicePackInfoRequest() {
    }

    public GetServicePackInfoRequest(
           com.xius.xbus.messages.common.UserType userType,
           java.lang.String messageID,
           com.xius.xbus.messages.common.SecurityId securityId,
           com.xius.xbus.messages.common.ServiceContext serviceContext,
           java.lang.String version,
           com.xius.xbus.messages.common.AccountType account,
           java.lang.String caSvcpkgFlag,
           java.lang.String atpCategory) {
        super(
            userType,
            messageID,
            securityId,
            serviceContext,
            version);
        this.account = account;
        this.caSvcpkgFlag = caSvcpkgFlag;
        this.atpCategory = atpCategory;
    }


    /**
     * Gets the account value for this GetServicePackInfoRequest.
     * 
     * @return account
     */
    public com.xius.xbus.messages.common.AccountType getAccount() {
        return account;
    }


    /**
     * Sets the account value for this GetServicePackInfoRequest.
     * 
     * @param account
     */
    public void setAccount(com.xius.xbus.messages.common.AccountType account) {
        this.account = account;
    }


    /**
     * Gets the caSvcpkgFlag value for this GetServicePackInfoRequest.
     * 
     * @return caSvcpkgFlag
     */
    public java.lang.String getCaSvcpkgFlag() {
        return caSvcpkgFlag;
    }


    /**
     * Sets the caSvcpkgFlag value for this GetServicePackInfoRequest.
     * 
     * @param caSvcpkgFlag
     */
    public void setCaSvcpkgFlag(java.lang.String caSvcpkgFlag) {
        this.caSvcpkgFlag = caSvcpkgFlag;
    }


    /**
     * Gets the atpCategory value for this GetServicePackInfoRequest.
     * 
     * @return atpCategory
     */
    public java.lang.String getAtpCategory() {
        return atpCategory;
    }


    /**
     * Sets the atpCategory value for this GetServicePackInfoRequest.
     * 
     * @param atpCategory
     */
    public void setAtpCategory(java.lang.String atpCategory) {
        this.atpCategory = atpCategory;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetServicePackInfoRequest)) return false;
        GetServicePackInfoRequest other = (GetServicePackInfoRequest) obj;
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
            ((this.caSvcpkgFlag==null && other.getCaSvcpkgFlag()==null) || 
             (this.caSvcpkgFlag!=null &&
              this.caSvcpkgFlag.equals(other.getCaSvcpkgFlag()))) &&
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
        if (getCaSvcpkgFlag() != null) {
            _hashCode += getCaSvcpkgFlag().hashCode();
        }
        if (getAtpCategory() != null) {
            _hashCode += getAtpCategory().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetServicePackInfoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getServicePackInfoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "AccountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caSvcpkgFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "caSvcpkgFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
