/**
 * TopUpResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.BalanceManagement_xsd;

public class TopUpResponse  implements java.io.Serializable {
    private com.xius.billing.BalanceManagement_xsd.AccountType account;

    private java.math.BigDecimal currentBalance;

    private java.lang.String accountStatus;

    private java.lang.String vocherNo;

    private java.math.BigDecimal adminFee;

    private java.math.BigDecimal creditedAmount;

    private java.math.BigDecimal denomination;

    private java.lang.String validityDate;

    private java.lang.String gracePeriodOneEndDate;

    private java.lang.String expiryDate;

    private java.math.BigDecimal lateRechargeFee;

    private java.lang.String promoValidityDate;

    private java.math.BigDecimal promoBalance;

    private java.math.BigInteger promoTime;

    private java.lang.String dataValidityDate;

    private java.math.BigDecimal dataBalance;

    public TopUpResponse() {
    }

    public TopUpResponse(
           com.xius.billing.BalanceManagement_xsd.AccountType account,
           java.math.BigDecimal currentBalance,
           java.lang.String accountStatus,
           java.lang.String vocherNo,
           java.math.BigDecimal adminFee,
           java.math.BigDecimal creditedAmount,
           java.math.BigDecimal denomination,
           java.lang.String validityDate,
           java.lang.String gracePeriodOneEndDate,
           java.lang.String expiryDate,
           java.math.BigDecimal lateRechargeFee,
           java.lang.String promoValidityDate,
           java.math.BigDecimal promoBalance,
           java.math.BigInteger promoTime,
           java.lang.String dataValidityDate,
           java.math.BigDecimal dataBalance) {
           this.account = account;
           this.currentBalance = currentBalance;
           this.accountStatus = accountStatus;
           this.vocherNo = vocherNo;
           this.adminFee = adminFee;
           this.creditedAmount = creditedAmount;
           this.denomination = denomination;
           this.validityDate = validityDate;
           this.gracePeriodOneEndDate = gracePeriodOneEndDate;
           this.expiryDate = expiryDate;
           this.lateRechargeFee = lateRechargeFee;
           this.promoValidityDate = promoValidityDate;
           this.promoBalance = promoBalance;
           this.promoTime = promoTime;
           this.dataValidityDate = dataValidityDate;
           this.dataBalance = dataBalance;
    }


    /**
     * Gets the account value for this TopUpResponse.
     * 
     * @return account
     */
    public com.xius.billing.BalanceManagement_xsd.AccountType getAccount() {
        return account;
    }


    /**
     * Sets the account value for this TopUpResponse.
     * 
     * @param account
     */
    public void setAccount(com.xius.billing.BalanceManagement_xsd.AccountType account) {
        this.account = account;
    }


    /**
     * Gets the currentBalance value for this TopUpResponse.
     * 
     * @return currentBalance
     */
    public java.math.BigDecimal getCurrentBalance() {
        return currentBalance;
    }


    /**
     * Sets the currentBalance value for this TopUpResponse.
     * 
     * @param currentBalance
     */
    public void setCurrentBalance(java.math.BigDecimal currentBalance) {
        this.currentBalance = currentBalance;
    }


    /**
     * Gets the accountStatus value for this TopUpResponse.
     * 
     * @return accountStatus
     */
    public java.lang.String getAccountStatus() {
        return accountStatus;
    }


    /**
     * Sets the accountStatus value for this TopUpResponse.
     * 
     * @param accountStatus
     */
    public void setAccountStatus(java.lang.String accountStatus) {
        this.accountStatus = accountStatus;
    }


    /**
     * Gets the vocherNo value for this TopUpResponse.
     * 
     * @return vocherNo
     */
    public java.lang.String getVocherNo() {
        return vocherNo;
    }


    /**
     * Sets the vocherNo value for this TopUpResponse.
     * 
     * @param vocherNo
     */
    public void setVocherNo(java.lang.String vocherNo) {
        this.vocherNo = vocherNo;
    }


    /**
     * Gets the adminFee value for this TopUpResponse.
     * 
     * @return adminFee
     */
    public java.math.BigDecimal getAdminFee() {
        return adminFee;
    }


    /**
     * Sets the adminFee value for this TopUpResponse.
     * 
     * @param adminFee
     */
    public void setAdminFee(java.math.BigDecimal adminFee) {
        this.adminFee = adminFee;
    }


    /**
     * Gets the creditedAmount value for this TopUpResponse.
     * 
     * @return creditedAmount
     */
    public java.math.BigDecimal getCreditedAmount() {
        return creditedAmount;
    }


    /**
     * Sets the creditedAmount value for this TopUpResponse.
     * 
     * @param creditedAmount
     */
    public void setCreditedAmount(java.math.BigDecimal creditedAmount) {
        this.creditedAmount = creditedAmount;
    }


    /**
     * Gets the denomination value for this TopUpResponse.
     * 
     * @return denomination
     */
    public java.math.BigDecimal getDenomination() {
        return denomination;
    }


    /**
     * Sets the denomination value for this TopUpResponse.
     * 
     * @param denomination
     */
    public void setDenomination(java.math.BigDecimal denomination) {
        this.denomination = denomination;
    }


    /**
     * Gets the validityDate value for this TopUpResponse.
     * 
     * @return validityDate
     */
    public java.lang.String getValidityDate() {
        return validityDate;
    }


    /**
     * Sets the validityDate value for this TopUpResponse.
     * 
     * @param validityDate
     */
    public void setValidityDate(java.lang.String validityDate) {
        this.validityDate = validityDate;
    }


    /**
     * Gets the gracePeriodOneEndDate value for this TopUpResponse.
     * 
     * @return gracePeriodOneEndDate
     */
    public java.lang.String getGracePeriodOneEndDate() {
        return gracePeriodOneEndDate;
    }


    /**
     * Sets the gracePeriodOneEndDate value for this TopUpResponse.
     * 
     * @param gracePeriodOneEndDate
     */
    public void setGracePeriodOneEndDate(java.lang.String gracePeriodOneEndDate) {
        this.gracePeriodOneEndDate = gracePeriodOneEndDate;
    }


    /**
     * Gets the expiryDate value for this TopUpResponse.
     * 
     * @return expiryDate
     */
    public java.lang.String getExpiryDate() {
        return expiryDate;
    }


    /**
     * Sets the expiryDate value for this TopUpResponse.
     * 
     * @param expiryDate
     */
    public void setExpiryDate(java.lang.String expiryDate) {
        this.expiryDate = expiryDate;
    }


    /**
     * Gets the lateRechargeFee value for this TopUpResponse.
     * 
     * @return lateRechargeFee
     */
    public java.math.BigDecimal getLateRechargeFee() {
        return lateRechargeFee;
    }


    /**
     * Sets the lateRechargeFee value for this TopUpResponse.
     * 
     * @param lateRechargeFee
     */
    public void setLateRechargeFee(java.math.BigDecimal lateRechargeFee) {
        this.lateRechargeFee = lateRechargeFee;
    }


    /**
     * Gets the promoValidityDate value for this TopUpResponse.
     * 
     * @return promoValidityDate
     */
    public java.lang.String getPromoValidityDate() {
        return promoValidityDate;
    }


    /**
     * Sets the promoValidityDate value for this TopUpResponse.
     * 
     * @param promoValidityDate
     */
    public void setPromoValidityDate(java.lang.String promoValidityDate) {
        this.promoValidityDate = promoValidityDate;
    }


    /**
     * Gets the promoBalance value for this TopUpResponse.
     * 
     * @return promoBalance
     */
    public java.math.BigDecimal getPromoBalance() {
        return promoBalance;
    }


    /**
     * Sets the promoBalance value for this TopUpResponse.
     * 
     * @param promoBalance
     */
    public void setPromoBalance(java.math.BigDecimal promoBalance) {
        this.promoBalance = promoBalance;
    }


    /**
     * Gets the promoTime value for this TopUpResponse.
     * 
     * @return promoTime
     */
    public java.math.BigInteger getPromoTime() {
        return promoTime;
    }


    /**
     * Sets the promoTime value for this TopUpResponse.
     * 
     * @param promoTime
     */
    public void setPromoTime(java.math.BigInteger promoTime) {
        this.promoTime = promoTime;
    }


    /**
     * Gets the dataValidityDate value for this TopUpResponse.
     * 
     * @return dataValidityDate
     */
    public java.lang.String getDataValidityDate() {
        return dataValidityDate;
    }


    /**
     * Sets the dataValidityDate value for this TopUpResponse.
     * 
     * @param dataValidityDate
     */
    public void setDataValidityDate(java.lang.String dataValidityDate) {
        this.dataValidityDate = dataValidityDate;
    }


    /**
     * Gets the dataBalance value for this TopUpResponse.
     * 
     * @return dataBalance
     */
    public java.math.BigDecimal getDataBalance() {
        return dataBalance;
    }


    /**
     * Sets the dataBalance value for this TopUpResponse.
     * 
     * @param dataBalance
     */
    public void setDataBalance(java.math.BigDecimal dataBalance) {
        this.dataBalance = dataBalance;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TopUpResponse)) return false;
        TopUpResponse other = (TopUpResponse) obj;
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
            ((this.currentBalance==null && other.getCurrentBalance()==null) || 
             (this.currentBalance!=null &&
              this.currentBalance.equals(other.getCurrentBalance()))) &&
            ((this.accountStatus==null && other.getAccountStatus()==null) || 
             (this.accountStatus!=null &&
              this.accountStatus.equals(other.getAccountStatus()))) &&
            ((this.vocherNo==null && other.getVocherNo()==null) || 
             (this.vocherNo!=null &&
              this.vocherNo.equals(other.getVocherNo()))) &&
            ((this.adminFee==null && other.getAdminFee()==null) || 
             (this.adminFee!=null &&
              this.adminFee.equals(other.getAdminFee()))) &&
            ((this.creditedAmount==null && other.getCreditedAmount()==null) || 
             (this.creditedAmount!=null &&
              this.creditedAmount.equals(other.getCreditedAmount()))) &&
            ((this.denomination==null && other.getDenomination()==null) || 
             (this.denomination!=null &&
              this.denomination.equals(other.getDenomination()))) &&
            ((this.validityDate==null && other.getValidityDate()==null) || 
             (this.validityDate!=null &&
              this.validityDate.equals(other.getValidityDate()))) &&
            ((this.gracePeriodOneEndDate==null && other.getGracePeriodOneEndDate()==null) || 
             (this.gracePeriodOneEndDate!=null &&
              this.gracePeriodOneEndDate.equals(other.getGracePeriodOneEndDate()))) &&
            ((this.expiryDate==null && other.getExpiryDate()==null) || 
             (this.expiryDate!=null &&
              this.expiryDate.equals(other.getExpiryDate()))) &&
            ((this.lateRechargeFee==null && other.getLateRechargeFee()==null) || 
             (this.lateRechargeFee!=null &&
              this.lateRechargeFee.equals(other.getLateRechargeFee()))) &&
            ((this.promoValidityDate==null && other.getPromoValidityDate()==null) || 
             (this.promoValidityDate!=null &&
              this.promoValidityDate.equals(other.getPromoValidityDate()))) &&
            ((this.promoBalance==null && other.getPromoBalance()==null) || 
             (this.promoBalance!=null &&
              this.promoBalance.equals(other.getPromoBalance()))) &&
            ((this.promoTime==null && other.getPromoTime()==null) || 
             (this.promoTime!=null &&
              this.promoTime.equals(other.getPromoTime()))) &&
            ((this.dataValidityDate==null && other.getDataValidityDate()==null) || 
             (this.dataValidityDate!=null &&
              this.dataValidityDate.equals(other.getDataValidityDate()))) &&
            ((this.dataBalance==null && other.getDataBalance()==null) || 
             (this.dataBalance!=null &&
              this.dataBalance.equals(other.getDataBalance())));
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
        if (getCurrentBalance() != null) {
            _hashCode += getCurrentBalance().hashCode();
        }
        if (getAccountStatus() != null) {
            _hashCode += getAccountStatus().hashCode();
        }
        if (getVocherNo() != null) {
            _hashCode += getVocherNo().hashCode();
        }
        if (getAdminFee() != null) {
            _hashCode += getAdminFee().hashCode();
        }
        if (getCreditedAmount() != null) {
            _hashCode += getCreditedAmount().hashCode();
        }
        if (getDenomination() != null) {
            _hashCode += getDenomination().hashCode();
        }
        if (getValidityDate() != null) {
            _hashCode += getValidityDate().hashCode();
        }
        if (getGracePeriodOneEndDate() != null) {
            _hashCode += getGracePeriodOneEndDate().hashCode();
        }
        if (getExpiryDate() != null) {
            _hashCode += getExpiryDate().hashCode();
        }
        if (getLateRechargeFee() != null) {
            _hashCode += getLateRechargeFee().hashCode();
        }
        if (getPromoValidityDate() != null) {
            _hashCode += getPromoValidityDate().hashCode();
        }
        if (getPromoBalance() != null) {
            _hashCode += getPromoBalance().hashCode();
        }
        if (getPromoTime() != null) {
            _hashCode += getPromoTime().hashCode();
        }
        if (getDataValidityDate() != null) {
            _hashCode += getDataValidityDate().hashCode();
        }
        if (getDataBalance() != null) {
            _hashCode += getDataBalance().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TopUpResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "TopUpResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "AccountType"));
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
        elemField.setFieldName("accountStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "accountStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vocherNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "vocherNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adminFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "adminFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "creditedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denomination");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "denomination"));
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
        elemField.setFieldName("gracePeriodOneEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "gracePeriodOneEndDate"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lateRechargeFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "lateRechargeFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promoValidityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "promoValidityDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promoBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "promoBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promoTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "promoTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataValidityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "dataValidityDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "dataBalance"));
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
