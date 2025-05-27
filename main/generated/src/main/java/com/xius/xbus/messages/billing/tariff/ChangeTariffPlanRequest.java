/**
 * ChangeTariffPlanRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.tariff;

public class ChangeTariffPlanRequest  extends com.xius.xbus.messages.common.WSRequest  implements java.io.Serializable {
    private com.xius.xbus.messages.common.AccountType account;

    private java.math.BigDecimal charges;

    private java.lang.String newTariffPlanId;

    private java.lang.String operator;

    public ChangeTariffPlanRequest() {
    }

    public ChangeTariffPlanRequest(
           com.xius.xbus.messages.common.UserType userType,
           java.lang.String messageID,
           com.xius.xbus.messages.common.SecurityId securityId,
           com.xius.xbus.messages.common.ServiceContext serviceContext,
           java.lang.String version,
           com.xius.xbus.messages.common.AccountType account,
           java.math.BigDecimal charges,
           java.lang.String newTariffPlanId,
           java.lang.String operator) {
        super(
            userType,
            messageID,
            securityId,
            serviceContext,
            version);
        this.account = account;
        this.charges = charges;
        this.newTariffPlanId = newTariffPlanId;
        this.operator = operator;
    }


    /**
     * Gets the account value for this ChangeTariffPlanRequest.
     * 
     * @return account
     */
    public com.xius.xbus.messages.common.AccountType getAccount() {
        return account;
    }


    /**
     * Sets the account value for this ChangeTariffPlanRequest.
     * 
     * @param account
     */
    public void setAccount(com.xius.xbus.messages.common.AccountType account) {
        this.account = account;
    }


    /**
     * Gets the charges value for this ChangeTariffPlanRequest.
     * 
     * @return charges
     */
    public java.math.BigDecimal getCharges() {
        return charges;
    }


    /**
     * Sets the charges value for this ChangeTariffPlanRequest.
     * 
     * @param charges
     */
    public void setCharges(java.math.BigDecimal charges) {
        this.charges = charges;
    }


    /**
     * Gets the newTariffPlanId value for this ChangeTariffPlanRequest.
     * 
     * @return newTariffPlanId
     */
    public java.lang.String getNewTariffPlanId() {
        return newTariffPlanId;
    }


    /**
     * Sets the newTariffPlanId value for this ChangeTariffPlanRequest.
     * 
     * @param newTariffPlanId
     */
    public void setNewTariffPlanId(java.lang.String newTariffPlanId) {
        this.newTariffPlanId = newTariffPlanId;
    }


    /**
     * Gets the operator value for this ChangeTariffPlanRequest.
     * 
     * @return operator
     */
    public java.lang.String getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this ChangeTariffPlanRequest.
     * 
     * @param operator
     */
    public void setOperator(java.lang.String operator) {
        this.operator = operator;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeTariffPlanRequest)) return false;
        ChangeTariffPlanRequest other = (ChangeTariffPlanRequest) obj;
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
            ((this.charges==null && other.getCharges()==null) || 
             (this.charges!=null &&
              this.charges.equals(other.getCharges()))) &&
            ((this.newTariffPlanId==null && other.getNewTariffPlanId()==null) || 
             (this.newTariffPlanId!=null &&
              this.newTariffPlanId.equals(other.getNewTariffPlanId()))) &&
            ((this.operator==null && other.getOperator()==null) || 
             (this.operator!=null &&
              this.operator.equals(other.getOperator())));
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
        if (getCharges() != null) {
            _hashCode += getCharges().hashCode();
        }
        if (getNewTariffPlanId() != null) {
            _hashCode += getNewTariffPlanId().hashCode();
        }
        if (getOperator() != null) {
            _hashCode += getOperator().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeTariffPlanRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">changeTariffPlanRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "AccountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("charges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "charges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newTariffPlanId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "newTariffPlanId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "operator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
