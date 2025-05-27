/**
 * MainBalanceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.common;

public class MainBalanceType  implements java.io.Serializable {
    private java.lang.String accountBalance;

    private java.lang.String validityDate;

    private java.lang.String gracePeriod1;

    private java.lang.String gracePeriod2;

    private java.lang.String gracePeriod3;

    private java.lang.String expiryData;

    public MainBalanceType() {
    }

    public MainBalanceType(
           java.lang.String accountBalance,
           java.lang.String validityDate,
           java.lang.String gracePeriod1,
           java.lang.String gracePeriod2,
           java.lang.String gracePeriod3,
           java.lang.String expiryData) {
           this.accountBalance = accountBalance;
           this.validityDate = validityDate;
           this.gracePeriod1 = gracePeriod1;
           this.gracePeriod2 = gracePeriod2;
           this.gracePeriod3 = gracePeriod3;
           this.expiryData = expiryData;
    }


    /**
     * Gets the accountBalance value for this MainBalanceType.
     * 
     * @return accountBalance
     */
    public java.lang.String getAccountBalance() {
        return accountBalance;
    }


    /**
     * Sets the accountBalance value for this MainBalanceType.
     * 
     * @param accountBalance
     */
    public void setAccountBalance(java.lang.String accountBalance) {
        this.accountBalance = accountBalance;
    }


    /**
     * Gets the validityDate value for this MainBalanceType.
     * 
     * @return validityDate
     */
    public java.lang.String getValidityDate() {
        return validityDate;
    }


    /**
     * Sets the validityDate value for this MainBalanceType.
     * 
     * @param validityDate
     */
    public void setValidityDate(java.lang.String validityDate) {
        this.validityDate = validityDate;
    }


    /**
     * Gets the gracePeriod1 value for this MainBalanceType.
     * 
     * @return gracePeriod1
     */
    public java.lang.String getGracePeriod1() {
        return gracePeriod1;
    }


    /**
     * Sets the gracePeriod1 value for this MainBalanceType.
     * 
     * @param gracePeriod1
     */
    public void setGracePeriod1(java.lang.String gracePeriod1) {
        this.gracePeriod1 = gracePeriod1;
    }


    /**
     * Gets the gracePeriod2 value for this MainBalanceType.
     * 
     * @return gracePeriod2
     */
    public java.lang.String getGracePeriod2() {
        return gracePeriod2;
    }


    /**
     * Sets the gracePeriod2 value for this MainBalanceType.
     * 
     * @param gracePeriod2
     */
    public void setGracePeriod2(java.lang.String gracePeriod2) {
        this.gracePeriod2 = gracePeriod2;
    }


    /**
     * Gets the gracePeriod3 value for this MainBalanceType.
     * 
     * @return gracePeriod3
     */
    public java.lang.String getGracePeriod3() {
        return gracePeriod3;
    }


    /**
     * Sets the gracePeriod3 value for this MainBalanceType.
     * 
     * @param gracePeriod3
     */
    public void setGracePeriod3(java.lang.String gracePeriod3) {
        this.gracePeriod3 = gracePeriod3;
    }


    /**
     * Gets the expiryData value for this MainBalanceType.
     * 
     * @return expiryData
     */
    public java.lang.String getExpiryData() {
        return expiryData;
    }


    /**
     * Sets the expiryData value for this MainBalanceType.
     * 
     * @param expiryData
     */
    public void setExpiryData(java.lang.String expiryData) {
        this.expiryData = expiryData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MainBalanceType)) return false;
        MainBalanceType other = (MainBalanceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountBalance==null && other.getAccountBalance()==null) || 
             (this.accountBalance!=null &&
              this.accountBalance.equals(other.getAccountBalance()))) &&
            ((this.validityDate==null && other.getValidityDate()==null) || 
             (this.validityDate!=null &&
              this.validityDate.equals(other.getValidityDate()))) &&
            ((this.gracePeriod1==null && other.getGracePeriod1()==null) || 
             (this.gracePeriod1!=null &&
              this.gracePeriod1.equals(other.getGracePeriod1()))) &&
            ((this.gracePeriod2==null && other.getGracePeriod2()==null) || 
             (this.gracePeriod2!=null &&
              this.gracePeriod2.equals(other.getGracePeriod2()))) &&
            ((this.gracePeriod3==null && other.getGracePeriod3()==null) || 
             (this.gracePeriod3!=null &&
              this.gracePeriod3.equals(other.getGracePeriod3()))) &&
            ((this.expiryData==null && other.getExpiryData()==null) || 
             (this.expiryData!=null &&
              this.expiryData.equals(other.getExpiryData())));
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
        if (getAccountBalance() != null) {
            _hashCode += getAccountBalance().hashCode();
        }
        if (getValidityDate() != null) {
            _hashCode += getValidityDate().hashCode();
        }
        if (getGracePeriod1() != null) {
            _hashCode += getGracePeriod1().hashCode();
        }
        if (getGracePeriod2() != null) {
            _hashCode += getGracePeriod2().hashCode();
        }
        if (getGracePeriod3() != null) {
            _hashCode += getGracePeriod3().hashCode();
        }
        if (getExpiryData() != null) {
            _hashCode += getExpiryData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MainBalanceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "mainBalanceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "accountBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "validityDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gracePeriod1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "gracePeriod1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gracePeriod2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "gracePeriod2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gracePeriod3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "gracePeriod3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiryData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "expiryData"));
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
