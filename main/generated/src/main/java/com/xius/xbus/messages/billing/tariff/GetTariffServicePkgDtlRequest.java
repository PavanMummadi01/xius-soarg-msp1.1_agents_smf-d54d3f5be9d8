/**
 * GetTariffServicePkgDtlRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.tariff;

public class GetTariffServicePkgDtlRequest  extends com.xius.xbus.messages.common.WSRequest  implements java.io.Serializable {
    private com.xius.xbus.messages.common.AccountType account;

    private java.lang.Long tariffPackId;

    private java.lang.Long servicePackId;

    public GetTariffServicePkgDtlRequest() {
    }

    public GetTariffServicePkgDtlRequest(
           com.xius.xbus.messages.common.UserType userType,
           java.lang.String messageID,
           com.xius.xbus.messages.common.SecurityId securityId,
           com.xius.xbus.messages.common.ServiceContext serviceContext,
           java.lang.String version,
           com.xius.xbus.messages.common.AccountType account,
           java.lang.Long tariffPackId,
           java.lang.Long servicePackId) {
        super(
            userType,
            messageID,
            securityId,
            serviceContext,
            version);
        this.account = account;
        this.tariffPackId = tariffPackId;
        this.servicePackId = servicePackId;
    }


    /**
     * Gets the account value for this GetTariffServicePkgDtlRequest.
     * 
     * @return account
     */
    public com.xius.xbus.messages.common.AccountType getAccount() {
        return account;
    }


    /**
     * Sets the account value for this GetTariffServicePkgDtlRequest.
     * 
     * @param account
     */
    public void setAccount(com.xius.xbus.messages.common.AccountType account) {
        this.account = account;
    }


    /**
     * Gets the tariffPackId value for this GetTariffServicePkgDtlRequest.
     * 
     * @return tariffPackId
     */
    public java.lang.Long getTariffPackId() {
        return tariffPackId;
    }


    /**
     * Sets the tariffPackId value for this GetTariffServicePkgDtlRequest.
     * 
     * @param tariffPackId
     */
    public void setTariffPackId(java.lang.Long tariffPackId) {
        this.tariffPackId = tariffPackId;
    }


    /**
     * Gets the servicePackId value for this GetTariffServicePkgDtlRequest.
     * 
     * @return servicePackId
     */
    public java.lang.Long getServicePackId() {
        return servicePackId;
    }


    /**
     * Sets the servicePackId value for this GetTariffServicePkgDtlRequest.
     * 
     * @param servicePackId
     */
    public void setServicePackId(java.lang.Long servicePackId) {
        this.servicePackId = servicePackId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTariffServicePkgDtlRequest)) return false;
        GetTariffServicePkgDtlRequest other = (GetTariffServicePkgDtlRequest) obj;
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
            ((this.tariffPackId==null && other.getTariffPackId()==null) || 
             (this.tariffPackId!=null &&
              this.tariffPackId.equals(other.getTariffPackId()))) &&
            ((this.servicePackId==null && other.getServicePackId()==null) || 
             (this.servicePackId!=null &&
              this.servicePackId.equals(other.getServicePackId())));
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
        if (getTariffPackId() != null) {
            _hashCode += getTariffPackId().hashCode();
        }
        if (getServicePackId() != null) {
            _hashCode += getServicePackId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetTariffServicePkgDtlRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getTariffServicePkgDtlRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "AccountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tariffPackId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "tariffPackId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicePackId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "servicePackId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
