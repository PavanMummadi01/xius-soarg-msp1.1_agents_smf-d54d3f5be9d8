/**
 * ConfigureServicesRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.tariff;

public class ConfigureServicesRequest  extends com.xius.xbus.messages.common.WSRequest  implements java.io.Serializable {
    private com.xius.xbus.messages.common.AccountType account;

    private com.xius.xbus.messages.billing.tariff.ConfigureServicesInfo configureServicesInfo;

    public ConfigureServicesRequest() {
    }

    public ConfigureServicesRequest(
           com.xius.xbus.messages.common.UserType userType,
           java.lang.String messageID,
           com.xius.xbus.messages.common.SecurityId securityId,
           com.xius.xbus.messages.common.ServiceContext serviceContext,
           java.lang.String version,
           com.xius.xbus.messages.common.AccountType account,
           com.xius.xbus.messages.billing.tariff.ConfigureServicesInfo configureServicesInfo) {
        super(
            userType,
            messageID,
            securityId,
            serviceContext,
            version);
        this.account = account;
        this.configureServicesInfo = configureServicesInfo;
    }


    /**
     * Gets the account value for this ConfigureServicesRequest.
     * 
     * @return account
     */
    public com.xius.xbus.messages.common.AccountType getAccount() {
        return account;
    }


    /**
     * Sets the account value for this ConfigureServicesRequest.
     * 
     * @param account
     */
    public void setAccount(com.xius.xbus.messages.common.AccountType account) {
        this.account = account;
    }


    /**
     * Gets the configureServicesInfo value for this ConfigureServicesRequest.
     * 
     * @return configureServicesInfo
     */
    public com.xius.xbus.messages.billing.tariff.ConfigureServicesInfo getConfigureServicesInfo() {
        return configureServicesInfo;
    }


    /**
     * Sets the configureServicesInfo value for this ConfigureServicesRequest.
     * 
     * @param configureServicesInfo
     */
    public void setConfigureServicesInfo(com.xius.xbus.messages.billing.tariff.ConfigureServicesInfo configureServicesInfo) {
        this.configureServicesInfo = configureServicesInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfigureServicesRequest)) return false;
        ConfigureServicesRequest other = (ConfigureServicesRequest) obj;
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
            ((this.configureServicesInfo==null && other.getConfigureServicesInfo()==null) || 
             (this.configureServicesInfo!=null &&
              this.configureServicesInfo.equals(other.getConfigureServicesInfo())));
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
        if (getConfigureServicesInfo() != null) {
            _hashCode += getConfigureServicesInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfigureServicesRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">configureServicesRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "AccountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configureServicesInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "configureServicesInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "ConfigureServicesInfo"));
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
