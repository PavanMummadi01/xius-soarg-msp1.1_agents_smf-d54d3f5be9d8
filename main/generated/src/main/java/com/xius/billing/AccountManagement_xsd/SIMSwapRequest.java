/**
 * SIMSwapRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class SIMSwapRequest  implements java.io.Serializable {
    private com.xius.billing.AccountManagement_xsd.AccountType account;

    private java.lang.String newIMSI;

    private java.lang.Boolean HLRFlag;

    public SIMSwapRequest() {
    }

    public SIMSwapRequest(
           com.xius.billing.AccountManagement_xsd.AccountType account,
           java.lang.String newIMSI,
           java.lang.Boolean HLRFlag) {
           this.account = account;
           this.newIMSI = newIMSI;
           this.HLRFlag = HLRFlag;
    }


    /**
     * Gets the account value for this SIMSwapRequest.
     * 
     * @return account
     */
    public com.xius.billing.AccountManagement_xsd.AccountType getAccount() {
        return account;
    }


    /**
     * Sets the account value for this SIMSwapRequest.
     * 
     * @param account
     */
    public void setAccount(com.xius.billing.AccountManagement_xsd.AccountType account) {
        this.account = account;
    }


    /**
     * Gets the newIMSI value for this SIMSwapRequest.
     * 
     * @return newIMSI
     */
    public java.lang.String getNewIMSI() {
        return newIMSI;
    }


    /**
     * Sets the newIMSI value for this SIMSwapRequest.
     * 
     * @param newIMSI
     */
    public void setNewIMSI(java.lang.String newIMSI) {
        this.newIMSI = newIMSI;
    }


    /**
     * Gets the HLRFlag value for this SIMSwapRequest.
     * 
     * @return HLRFlag
     */
    public java.lang.Boolean getHLRFlag() {
        return HLRFlag;
    }


    /**
     * Sets the HLRFlag value for this SIMSwapRequest.
     * 
     * @param HLRFlag
     */
    public void setHLRFlag(java.lang.Boolean HLRFlag) {
        this.HLRFlag = HLRFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SIMSwapRequest)) return false;
        SIMSwapRequest other = (SIMSwapRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.newIMSI==null && other.getNewIMSI()==null) || 
             (this.newIMSI!=null &&
              this.newIMSI.equals(other.getNewIMSI()))) &&
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
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getNewIMSI() != null) {
            _hashCode += getNewIMSI().hashCode();
        }
        if (getHLRFlag() != null) {
            _hashCode += getHLRFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SIMSwapRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SIMSwapRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "AccountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newIMSI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "NewIMSI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
