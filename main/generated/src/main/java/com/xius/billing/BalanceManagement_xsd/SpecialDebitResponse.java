/**
 * SpecialDebitResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.BalanceManagement_xsd;

public class SpecialDebitResponse  implements java.io.Serializable {
    private java.lang.String accountId;

    private java.math.BigDecimal currentBalance;

    private java.lang.String status;

    private java.math.BigDecimal debitedAmt;

    private java.lang.String validityDate;

    private java.lang.String gracePeriodIEndDate;

    private java.lang.String expiryDate;

    public SpecialDebitResponse() {
    }

    public SpecialDebitResponse(
           java.lang.String accountId,
           java.math.BigDecimal currentBalance,
           java.lang.String status,
           java.math.BigDecimal debitedAmt,
           java.lang.String validityDate,
           java.lang.String gracePeriodIEndDate,
           java.lang.String expiryDate) {
           this.accountId = accountId;
           this.currentBalance = currentBalance;
           this.status = status;
           this.debitedAmt = debitedAmt;
           this.validityDate = validityDate;
           this.gracePeriodIEndDate = gracePeriodIEndDate;
           this.expiryDate = expiryDate;
    }


    /**
     * Gets the accountId value for this SpecialDebitResponse.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this SpecialDebitResponse.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the currentBalance value for this SpecialDebitResponse.
     * 
     * @return currentBalance
     */
    public java.math.BigDecimal getCurrentBalance() {
        return currentBalance;
    }


    /**
     * Sets the currentBalance value for this SpecialDebitResponse.
     * 
     * @param currentBalance
     */
    public void setCurrentBalance(java.math.BigDecimal currentBalance) {
        this.currentBalance = currentBalance;
    }


    /**
     * Gets the status value for this SpecialDebitResponse.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this SpecialDebitResponse.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the debitedAmt value for this SpecialDebitResponse.
     * 
     * @return debitedAmt
     */
    public java.math.BigDecimal getDebitedAmt() {
        return debitedAmt;
    }


    /**
     * Sets the debitedAmt value for this SpecialDebitResponse.
     * 
     * @param debitedAmt
     */
    public void setDebitedAmt(java.math.BigDecimal debitedAmt) {
        this.debitedAmt = debitedAmt;
    }


    /**
     * Gets the validityDate value for this SpecialDebitResponse.
     * 
     * @return validityDate
     */
    public java.lang.String getValidityDate() {
        return validityDate;
    }


    /**
     * Sets the validityDate value for this SpecialDebitResponse.
     * 
     * @param validityDate
     */
    public void setValidityDate(java.lang.String validityDate) {
        this.validityDate = validityDate;
    }


    /**
     * Gets the gracePeriodIEndDate value for this SpecialDebitResponse.
     * 
     * @return gracePeriodIEndDate
     */
    public java.lang.String getGracePeriodIEndDate() {
        return gracePeriodIEndDate;
    }


    /**
     * Sets the gracePeriodIEndDate value for this SpecialDebitResponse.
     * 
     * @param gracePeriodIEndDate
     */
    public void setGracePeriodIEndDate(java.lang.String gracePeriodIEndDate) {
        this.gracePeriodIEndDate = gracePeriodIEndDate;
    }


    /**
     * Gets the expiryDate value for this SpecialDebitResponse.
     * 
     * @return expiryDate
     */
    public java.lang.String getExpiryDate() {
        return expiryDate;
    }


    /**
     * Sets the expiryDate value for this SpecialDebitResponse.
     * 
     * @param expiryDate
     */
    public void setExpiryDate(java.lang.String expiryDate) {
        this.expiryDate = expiryDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SpecialDebitResponse)) return false;
        SpecialDebitResponse other = (SpecialDebitResponse) obj;
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
            ((this.currentBalance==null && other.getCurrentBalance()==null) || 
             (this.currentBalance!=null &&
              this.currentBalance.equals(other.getCurrentBalance()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.debitedAmt==null && other.getDebitedAmt()==null) || 
             (this.debitedAmt!=null &&
              this.debitedAmt.equals(other.getDebitedAmt()))) &&
            ((this.validityDate==null && other.getValidityDate()==null) || 
             (this.validityDate!=null &&
              this.validityDate.equals(other.getValidityDate()))) &&
            ((this.gracePeriodIEndDate==null && other.getGracePeriodIEndDate()==null) || 
             (this.gracePeriodIEndDate!=null &&
              this.gracePeriodIEndDate.equals(other.getGracePeriodIEndDate()))) &&
            ((this.expiryDate==null && other.getExpiryDate()==null) || 
             (this.expiryDate!=null &&
              this.expiryDate.equals(other.getExpiryDate())));
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
        if (getCurrentBalance() != null) {
            _hashCode += getCurrentBalance().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getDebitedAmt() != null) {
            _hashCode += getDebitedAmt().hashCode();
        }
        if (getValidityDate() != null) {
            _hashCode += getValidityDate().hashCode();
        }
        if (getGracePeriodIEndDate() != null) {
            _hashCode += getGracePeriodIEndDate().hashCode();
        }
        if (getExpiryDate() != null) {
            _hashCode += getExpiryDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SpecialDebitResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "SpecialDebitResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "accountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "currentBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debitedAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "debitedAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "validityDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gracePeriodIEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "gracePeriodIEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "expiryDate"));
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
