/**
 * ChangeMSISDNRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class ChangeMSISDNRequest  implements java.io.Serializable {
    private java.lang.String userType;

    private com.xius.billing.AccountManagement_xsd.AccountType account;

    private java.lang.String zipCode;

    private java.lang.String operator;

    private com.xius.billing.AccountManagement_xsd.General general;

    private java.lang.Boolean HLRFlag;

    public ChangeMSISDNRequest() {
    }

    public ChangeMSISDNRequest(
           java.lang.String userType,
           com.xius.billing.AccountManagement_xsd.AccountType account,
           java.lang.String zipCode,
           java.lang.String operator,
           com.xius.billing.AccountManagement_xsd.General general,
           java.lang.Boolean HLRFlag) {
           this.userType = userType;
           this.account = account;
           this.zipCode = zipCode;
           this.operator = operator;
           this.general = general;
           this.HLRFlag = HLRFlag;
    }


    /**
     * Gets the userType value for this ChangeMSISDNRequest.
     * 
     * @return userType
     */
    public java.lang.String getUserType() {
        return userType;
    }


    /**
     * Sets the userType value for this ChangeMSISDNRequest.
     * 
     * @param userType
     */
    public void setUserType(java.lang.String userType) {
        this.userType = userType;
    }


    /**
     * Gets the account value for this ChangeMSISDNRequest.
     * 
     * @return account
     */
    public com.xius.billing.AccountManagement_xsd.AccountType getAccount() {
        return account;
    }


    /**
     * Sets the account value for this ChangeMSISDNRequest.
     * 
     * @param account
     */
    public void setAccount(com.xius.billing.AccountManagement_xsd.AccountType account) {
        this.account = account;
    }


    /**
     * Gets the zipCode value for this ChangeMSISDNRequest.
     * 
     * @return zipCode
     */
    public java.lang.String getZipCode() {
        return zipCode;
    }


    /**
     * Sets the zipCode value for this ChangeMSISDNRequest.
     * 
     * @param zipCode
     */
    public void setZipCode(java.lang.String zipCode) {
        this.zipCode = zipCode;
    }


    /**
     * Gets the operator value for this ChangeMSISDNRequest.
     * 
     * @return operator
     */
    public java.lang.String getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this ChangeMSISDNRequest.
     * 
     * @param operator
     */
    public void setOperator(java.lang.String operator) {
        this.operator = operator;
    }


    /**
     * Gets the general value for this ChangeMSISDNRequest.
     * 
     * @return general
     */
    public com.xius.billing.AccountManagement_xsd.General getGeneral() {
        return general;
    }


    /**
     * Sets the general value for this ChangeMSISDNRequest.
     * 
     * @param general
     */
    public void setGeneral(com.xius.billing.AccountManagement_xsd.General general) {
        this.general = general;
    }


    /**
     * Gets the HLRFlag value for this ChangeMSISDNRequest.
     * 
     * @return HLRFlag
     */
    public java.lang.Boolean getHLRFlag() {
        return HLRFlag;
    }


    /**
     * Sets the HLRFlag value for this ChangeMSISDNRequest.
     * 
     * @param HLRFlag
     */
    public void setHLRFlag(java.lang.Boolean HLRFlag) {
        this.HLRFlag = HLRFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeMSISDNRequest)) return false;
        ChangeMSISDNRequest other = (ChangeMSISDNRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userType==null && other.getUserType()==null) || 
             (this.userType!=null &&
              this.userType.equals(other.getUserType()))) &&
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.zipCode==null && other.getZipCode()==null) || 
             (this.zipCode!=null &&
              this.zipCode.equals(other.getZipCode()))) &&
            ((this.operator==null && other.getOperator()==null) || 
             (this.operator!=null &&
              this.operator.equals(other.getOperator()))) &&
            ((this.general==null && other.getGeneral()==null) || 
             (this.general!=null &&
              this.general.equals(other.getGeneral()))) &&
            ((this.HLRFlag==null && other.getHLRFlag()==null) || 
             (this.HLRFlag!=null &&
              this.HLRFlag.equals(other.getHLRFlag())));
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
        if (getUserType() != null) {
            _hashCode += getUserType().hashCode();
        }
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getZipCode() != null) {
            _hashCode += getZipCode().hashCode();
        }
        if (getOperator() != null) {
            _hashCode += getOperator().hashCode();
        }
        if (getGeneral() != null) {
            _hashCode += getGeneral().hashCode();
        }
        if (getHLRFlag() != null) {
            _hashCode += getHLRFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeMSISDNRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ChangeMSISDNRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "userType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "AccountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "zipCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "operator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("general");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "General"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", ">General"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HLRFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "HLRFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
