/**
 * PostpaidAcctDetType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class PostpaidAcctDetType  implements java.io.Serializable {
    private java.lang.Long accountId;

    private java.math.BigDecimal creditLimit;

    private java.math.BigDecimal availabletLimit;

    private java.lang.String billingType;

    private java.lang.String billingFreq;

    private java.lang.String billingDate;

    private java.lang.String modifiedDate;

    private java.math.BigDecimal oldCreditBal;

    public PostpaidAcctDetType() {
    }

    public PostpaidAcctDetType(
           java.lang.Long accountId,
           java.math.BigDecimal creditLimit,
           java.math.BigDecimal availabletLimit,
           java.lang.String billingType,
           java.lang.String billingFreq,
           java.lang.String billingDate,
           java.lang.String modifiedDate,
           java.math.BigDecimal oldCreditBal) {
           this.accountId = accountId;
           this.creditLimit = creditLimit;
           this.availabletLimit = availabletLimit;
           this.billingType = billingType;
           this.billingFreq = billingFreq;
           this.billingDate = billingDate;
           this.modifiedDate = modifiedDate;
           this.oldCreditBal = oldCreditBal;
    }


    /**
     * Gets the accountId value for this PostpaidAcctDetType.
     * 
     * @return accountId
     */
    public java.lang.Long getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this PostpaidAcctDetType.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.Long accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the creditLimit value for this PostpaidAcctDetType.
     * 
     * @return creditLimit
     */
    public java.math.BigDecimal getCreditLimit() {
        return creditLimit;
    }


    /**
     * Sets the creditLimit value for this PostpaidAcctDetType.
     * 
     * @param creditLimit
     */
    public void setCreditLimit(java.math.BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }


    /**
     * Gets the availabletLimit value for this PostpaidAcctDetType.
     * 
     * @return availabletLimit
     */
    public java.math.BigDecimal getAvailabletLimit() {
        return availabletLimit;
    }


    /**
     * Sets the availabletLimit value for this PostpaidAcctDetType.
     * 
     * @param availabletLimit
     */
    public void setAvailabletLimit(java.math.BigDecimal availabletLimit) {
        this.availabletLimit = availabletLimit;
    }


    /**
     * Gets the billingType value for this PostpaidAcctDetType.
     * 
     * @return billingType
     */
    public java.lang.String getBillingType() {
        return billingType;
    }


    /**
     * Sets the billingType value for this PostpaidAcctDetType.
     * 
     * @param billingType
     */
    public void setBillingType(java.lang.String billingType) {
        this.billingType = billingType;
    }


    /**
     * Gets the billingFreq value for this PostpaidAcctDetType.
     * 
     * @return billingFreq
     */
    public java.lang.String getBillingFreq() {
        return billingFreq;
    }


    /**
     * Sets the billingFreq value for this PostpaidAcctDetType.
     * 
     * @param billingFreq
     */
    public void setBillingFreq(java.lang.String billingFreq) {
        this.billingFreq = billingFreq;
    }


    /**
     * Gets the billingDate value for this PostpaidAcctDetType.
     * 
     * @return billingDate
     */
    public java.lang.String getBillingDate() {
        return billingDate;
    }


    /**
     * Sets the billingDate value for this PostpaidAcctDetType.
     * 
     * @param billingDate
     */
    public void setBillingDate(java.lang.String billingDate) {
        this.billingDate = billingDate;
    }


    /**
     * Gets the modifiedDate value for this PostpaidAcctDetType.
     * 
     * @return modifiedDate
     */
    public java.lang.String getModifiedDate() {
        return modifiedDate;
    }


    /**
     * Sets the modifiedDate value for this PostpaidAcctDetType.
     * 
     * @param modifiedDate
     */
    public void setModifiedDate(java.lang.String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


    /**
     * Gets the oldCreditBal value for this PostpaidAcctDetType.
     * 
     * @return oldCreditBal
     */
    public java.math.BigDecimal getOldCreditBal() {
        return oldCreditBal;
    }


    /**
     * Sets the oldCreditBal value for this PostpaidAcctDetType.
     * 
     * @param oldCreditBal
     */
    public void setOldCreditBal(java.math.BigDecimal oldCreditBal) {
        this.oldCreditBal = oldCreditBal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PostpaidAcctDetType)) return false;
        PostpaidAcctDetType other = (PostpaidAcctDetType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.creditLimit==null && other.getCreditLimit()==null) || 
             (this.creditLimit!=null &&
              this.creditLimit.equals(other.getCreditLimit()))) &&
            ((this.availabletLimit==null && other.getAvailabletLimit()==null) || 
             (this.availabletLimit!=null &&
              this.availabletLimit.equals(other.getAvailabletLimit()))) &&
            ((this.billingType==null && other.getBillingType()==null) || 
             (this.billingType!=null &&
              this.billingType.equals(other.getBillingType()))) &&
            ((this.billingFreq==null && other.getBillingFreq()==null) || 
             (this.billingFreq!=null &&
              this.billingFreq.equals(other.getBillingFreq()))) &&
            ((this.billingDate==null && other.getBillingDate()==null) || 
             (this.billingDate!=null &&
              this.billingDate.equals(other.getBillingDate()))) &&
            ((this.modifiedDate==null && other.getModifiedDate()==null) || 
             (this.modifiedDate!=null &&
              this.modifiedDate.equals(other.getModifiedDate()))) &&
            ((this.oldCreditBal==null && other.getOldCreditBal()==null) || 
             (this.oldCreditBal!=null &&
              this.oldCreditBal.equals(other.getOldCreditBal())));
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
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getCreditLimit() != null) {
            _hashCode += getCreditLimit().hashCode();
        }
        if (getAvailabletLimit() != null) {
            _hashCode += getAvailabletLimit().hashCode();
        }
        if (getBillingType() != null) {
            _hashCode += getBillingType().hashCode();
        }
        if (getBillingFreq() != null) {
            _hashCode += getBillingFreq().hashCode();
        }
        if (getBillingDate() != null) {
            _hashCode += getBillingDate().hashCode();
        }
        if (getModifiedDate() != null) {
            _hashCode += getModifiedDate().hashCode();
        }
        if (getOldCreditBal() != null) {
            _hashCode += getOldCreditBal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PostpaidAcctDetType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "PostpaidAcctDetType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "accountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "creditLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availabletLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "availabletLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "billingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingFreq");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "billingFreq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "billingDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "modifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldCreditBal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "oldCreditBal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
