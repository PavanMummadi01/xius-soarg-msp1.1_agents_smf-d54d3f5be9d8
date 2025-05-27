/**
 * VoucherTopUpResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.selfcare.services;

public class VoucherTopUpResponse  extends com.xius.xbus.messages.common.WSResponse  implements java.io.Serializable {
    private java.lang.String accountId;

    private java.lang.String msisdn;

    private java.lang.Double currentBalance;

    private java.lang.String status;

    private java.lang.String voucherNo;

    private java.lang.Double adminFee;

    private java.lang.Double creditedAmount;

    private java.lang.Double denomination;

    private java.lang.Double dataBalance;

    private java.lang.String validityDate;

    private java.lang.String gracePeriodOneEndDate;

    private java.lang.String expiryDate;

    private java.lang.String promoValidityDate;

    private java.lang.String dataValidityDate;

    public VoucherTopUpResponse() {
    }

    public VoucherTopUpResponse(
           com.xius.xbus.messages.common.StatusCode statusCode,
           java.util.Calendar timeStamp,
           java.lang.String correlationID,
           com.xius.xbus.messages.common.ErrorData[] errors,
           java.lang.String version,
           java.lang.String accountId,
           java.lang.String msisdn,
           java.lang.Double currentBalance,
           java.lang.String status,
           java.lang.String voucherNo,
           java.lang.Double adminFee,
           java.lang.Double creditedAmount,
           java.lang.Double denomination,
           java.lang.Double dataBalance,
           java.lang.String validityDate,
           java.lang.String gracePeriodOneEndDate,
           java.lang.String expiryDate,
           java.lang.String promoValidityDate,
           java.lang.String dataValidityDate) {
        super(
            statusCode,
            timeStamp,
            correlationID,
            errors,
            version);
        this.accountId = accountId;
        this.msisdn = msisdn;
        this.currentBalance = currentBalance;
        this.status = status;
        this.voucherNo = voucherNo;
        this.adminFee = adminFee;
        this.creditedAmount = creditedAmount;
        this.denomination = denomination;
        this.dataBalance = dataBalance;
        this.validityDate = validityDate;
        this.gracePeriodOneEndDate = gracePeriodOneEndDate;
        this.expiryDate = expiryDate;
        this.promoValidityDate = promoValidityDate;
        this.dataValidityDate = dataValidityDate;
    }


    /**
     * Gets the accountId value for this VoucherTopUpResponse.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this VoucherTopUpResponse.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the msisdn value for this VoucherTopUpResponse.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this VoucherTopUpResponse.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the currentBalance value for this VoucherTopUpResponse.
     * 
     * @return currentBalance
     */
    public java.lang.Double getCurrentBalance() {
        return currentBalance;
    }


    /**
     * Sets the currentBalance value for this VoucherTopUpResponse.
     * 
     * @param currentBalance
     */
    public void setCurrentBalance(java.lang.Double currentBalance) {
        this.currentBalance = currentBalance;
    }


    /**
     * Gets the status value for this VoucherTopUpResponse.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this VoucherTopUpResponse.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the voucherNo value for this VoucherTopUpResponse.
     * 
     * @return voucherNo
     */
    public java.lang.String getVoucherNo() {
        return voucherNo;
    }


    /**
     * Sets the voucherNo value for this VoucherTopUpResponse.
     * 
     * @param voucherNo
     */
    public void setVoucherNo(java.lang.String voucherNo) {
        this.voucherNo = voucherNo;
    }


    /**
     * Gets the adminFee value for this VoucherTopUpResponse.
     * 
     * @return adminFee
     */
    public java.lang.Double getAdminFee() {
        return adminFee;
    }


    /**
     * Sets the adminFee value for this VoucherTopUpResponse.
     * 
     * @param adminFee
     */
    public void setAdminFee(java.lang.Double adminFee) {
        this.adminFee = adminFee;
    }


    /**
     * Gets the creditedAmount value for this VoucherTopUpResponse.
     * 
     * @return creditedAmount
     */
    public java.lang.Double getCreditedAmount() {
        return creditedAmount;
    }


    /**
     * Sets the creditedAmount value for this VoucherTopUpResponse.
     * 
     * @param creditedAmount
     */
    public void setCreditedAmount(java.lang.Double creditedAmount) {
        this.creditedAmount = creditedAmount;
    }


    /**
     * Gets the denomination value for this VoucherTopUpResponse.
     * 
     * @return denomination
     */
    public java.lang.Double getDenomination() {
        return denomination;
    }


    /**
     * Sets the denomination value for this VoucherTopUpResponse.
     * 
     * @param denomination
     */
    public void setDenomination(java.lang.Double denomination) {
        this.denomination = denomination;
    }


    /**
     * Gets the dataBalance value for this VoucherTopUpResponse.
     * 
     * @return dataBalance
     */
    public java.lang.Double getDataBalance() {
        return dataBalance;
    }


    /**
     * Sets the dataBalance value for this VoucherTopUpResponse.
     * 
     * @param dataBalance
     */
    public void setDataBalance(java.lang.Double dataBalance) {
        this.dataBalance = dataBalance;
    }


    /**
     * Gets the validityDate value for this VoucherTopUpResponse.
     * 
     * @return validityDate
     */
    public java.lang.String getValidityDate() {
        return validityDate;
    }


    /**
     * Sets the validityDate value for this VoucherTopUpResponse.
     * 
     * @param validityDate
     */
    public void setValidityDate(java.lang.String validityDate) {
        this.validityDate = validityDate;
    }


    /**
     * Gets the gracePeriodOneEndDate value for this VoucherTopUpResponse.
     * 
     * @return gracePeriodOneEndDate
     */
    public java.lang.String getGracePeriodOneEndDate() {
        return gracePeriodOneEndDate;
    }


    /**
     * Sets the gracePeriodOneEndDate value for this VoucherTopUpResponse.
     * 
     * @param gracePeriodOneEndDate
     */
    public void setGracePeriodOneEndDate(java.lang.String gracePeriodOneEndDate) {
        this.gracePeriodOneEndDate = gracePeriodOneEndDate;
    }


    /**
     * Gets the expiryDate value for this VoucherTopUpResponse.
     * 
     * @return expiryDate
     */
    public java.lang.String getExpiryDate() {
        return expiryDate;
    }


    /**
     * Sets the expiryDate value for this VoucherTopUpResponse.
     * 
     * @param expiryDate
     */
    public void setExpiryDate(java.lang.String expiryDate) {
        this.expiryDate = expiryDate;
    }


    /**
     * Gets the promoValidityDate value for this VoucherTopUpResponse.
     * 
     * @return promoValidityDate
     */
    public java.lang.String getPromoValidityDate() {
        return promoValidityDate;
    }


    /**
     * Sets the promoValidityDate value for this VoucherTopUpResponse.
     * 
     * @param promoValidityDate
     */
    public void setPromoValidityDate(java.lang.String promoValidityDate) {
        this.promoValidityDate = promoValidityDate;
    }


    /**
     * Gets the dataValidityDate value for this VoucherTopUpResponse.
     * 
     * @return dataValidityDate
     */
    public java.lang.String getDataValidityDate() {
        return dataValidityDate;
    }


    /**
     * Sets the dataValidityDate value for this VoucherTopUpResponse.
     * 
     * @param dataValidityDate
     */
    public void setDataValidityDate(java.lang.String dataValidityDate) {
        this.dataValidityDate = dataValidityDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VoucherTopUpResponse)) return false;
        VoucherTopUpResponse other = (VoucherTopUpResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.currentBalance==null && other.getCurrentBalance()==null) || 
             (this.currentBalance!=null &&
              this.currentBalance.equals(other.getCurrentBalance()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.voucherNo==null && other.getVoucherNo()==null) || 
             (this.voucherNo!=null &&
              this.voucherNo.equals(other.getVoucherNo()))) &&
            ((this.adminFee==null && other.getAdminFee()==null) || 
             (this.adminFee!=null &&
              this.adminFee.equals(other.getAdminFee()))) &&
            ((this.creditedAmount==null && other.getCreditedAmount()==null) || 
             (this.creditedAmount!=null &&
              this.creditedAmount.equals(other.getCreditedAmount()))) &&
            ((this.denomination==null && other.getDenomination()==null) || 
             (this.denomination!=null &&
              this.denomination.equals(other.getDenomination()))) &&
            ((this.dataBalance==null && other.getDataBalance()==null) || 
             (this.dataBalance!=null &&
              this.dataBalance.equals(other.getDataBalance()))) &&
            ((this.validityDate==null && other.getValidityDate()==null) || 
             (this.validityDate!=null &&
              this.validityDate.equals(other.getValidityDate()))) &&
            ((this.gracePeriodOneEndDate==null && other.getGracePeriodOneEndDate()==null) || 
             (this.gracePeriodOneEndDate!=null &&
              this.gracePeriodOneEndDate.equals(other.getGracePeriodOneEndDate()))) &&
            ((this.expiryDate==null && other.getExpiryDate()==null) || 
             (this.expiryDate!=null &&
              this.expiryDate.equals(other.getExpiryDate()))) &&
            ((this.promoValidityDate==null && other.getPromoValidityDate()==null) || 
             (this.promoValidityDate!=null &&
              this.promoValidityDate.equals(other.getPromoValidityDate()))) &&
            ((this.dataValidityDate==null && other.getDataValidityDate()==null) || 
             (this.dataValidityDate!=null &&
              this.dataValidityDate.equals(other.getDataValidityDate())));
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
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getCurrentBalance() != null) {
            _hashCode += getCurrentBalance().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getVoucherNo() != null) {
            _hashCode += getVoucherNo().hashCode();
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
        if (getDataBalance() != null) {
            _hashCode += getDataBalance().hashCode();
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
        if (getPromoValidityDate() != null) {
            _hashCode += getPromoValidityDate().hashCode();
        }
        if (getDataValidityDate() != null) {
            _hashCode += getDataValidityDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VoucherTopUpResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">voucherTopUpResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "accountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "currentBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voucherNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "voucherNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adminFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "adminFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "creditedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denomination");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "denomination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "dataBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "validityDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gracePeriodOneEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "gracePeriodOneEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "expiryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promoValidityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "promoValidityDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataValidityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "dataValidityDate"));
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
