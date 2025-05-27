/**
 * SIMRegistrationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class SIMRegistrationRequest  implements java.io.Serializable {
    private java.lang.Boolean hlrFlag;

    private java.lang.String SIM;

    private java.lang.String IDNo;

    private java.lang.String IDType;

    private java.lang.String promoCode;

    private java.lang.String dealerMSISDN;

    private java.lang.String userType;

    private java.lang.String orderId;

    private com.xius.billing.AccountManagement_xsd.BillingType accountType;

    private java.lang.String billType;

    private java.lang.String billFreq;

    private java.lang.String isCorpAcct;

    private java.math.BigDecimal creditLimit;

    private java.lang.String billingDate;

    private java.lang.String locationCode;

    private java.lang.Long tariffPackageId;

    public SIMRegistrationRequest() {
    }

    public SIMRegistrationRequest(
           java.lang.Boolean hlrFlag,
           java.lang.String SIM,
           java.lang.String IDNo,
           java.lang.String IDType,
           java.lang.String promoCode,
           java.lang.String dealerMSISDN,
           java.lang.String userType,
           java.lang.String orderId,
           com.xius.billing.AccountManagement_xsd.BillingType accountType,
           java.lang.String billType,
           java.lang.String billFreq,
           java.lang.String isCorpAcct,
           java.math.BigDecimal creditLimit,
           java.lang.String billingDate,
           java.lang.String locationCode,
           java.lang.Long tariffPackageId) {
           this.hlrFlag = hlrFlag;
           this.SIM = SIM;
           this.IDNo = IDNo;
           this.IDType = IDType;
           this.promoCode = promoCode;
           this.dealerMSISDN = dealerMSISDN;
           this.userType = userType;
           this.orderId = orderId;
           this.accountType = accountType;
           this.billType = billType;
           this.billFreq = billFreq;
           this.isCorpAcct = isCorpAcct;
           this.creditLimit = creditLimit;
           this.billingDate = billingDate;
           this.locationCode = locationCode;
           this.tariffPackageId = tariffPackageId;
    }


    /**
     * Gets the hlrFlag value for this SIMRegistrationRequest.
     * 
     * @return hlrFlag
     */
    public java.lang.Boolean getHlrFlag() {
        return hlrFlag;
    }


    /**
     * Sets the hlrFlag value for this SIMRegistrationRequest.
     * 
     * @param hlrFlag
     */
    public void setHlrFlag(java.lang.Boolean hlrFlag) {
        this.hlrFlag = hlrFlag;
    }


    /**
     * Gets the SIM value for this SIMRegistrationRequest.
     * 
     * @return SIM
     */
    public java.lang.String getSIM() {
        return SIM;
    }


    /**
     * Sets the SIM value for this SIMRegistrationRequest.
     * 
     * @param SIM
     */
    public void setSIM(java.lang.String SIM) {
        this.SIM = SIM;
    }


    /**
     * Gets the IDNo value for this SIMRegistrationRequest.
     * 
     * @return IDNo
     */
    public java.lang.String getIDNo() {
        return IDNo;
    }


    /**
     * Sets the IDNo value for this SIMRegistrationRequest.
     * 
     * @param IDNo
     */
    public void setIDNo(java.lang.String IDNo) {
        this.IDNo = IDNo;
    }


    /**
     * Gets the IDType value for this SIMRegistrationRequest.
     * 
     * @return IDType
     */
    public java.lang.String getIDType() {
        return IDType;
    }


    /**
     * Sets the IDType value for this SIMRegistrationRequest.
     * 
     * @param IDType
     */
    public void setIDType(java.lang.String IDType) {
        this.IDType = IDType;
    }


    /**
     * Gets the promoCode value for this SIMRegistrationRequest.
     * 
     * @return promoCode
     */
    public java.lang.String getPromoCode() {
        return promoCode;
    }


    /**
     * Sets the promoCode value for this SIMRegistrationRequest.
     * 
     * @param promoCode
     */
    public void setPromoCode(java.lang.String promoCode) {
        this.promoCode = promoCode;
    }


    /**
     * Gets the dealerMSISDN value for this SIMRegistrationRequest.
     * 
     * @return dealerMSISDN
     */
    public java.lang.String getDealerMSISDN() {
        return dealerMSISDN;
    }


    /**
     * Sets the dealerMSISDN value for this SIMRegistrationRequest.
     * 
     * @param dealerMSISDN
     */
    public void setDealerMSISDN(java.lang.String dealerMSISDN) {
        this.dealerMSISDN = dealerMSISDN;
    }


    /**
     * Gets the userType value for this SIMRegistrationRequest.
     * 
     * @return userType
     */
    public java.lang.String getUserType() {
        return userType;
    }


    /**
     * Sets the userType value for this SIMRegistrationRequest.
     * 
     * @param userType
     */
    public void setUserType(java.lang.String userType) {
        this.userType = userType;
    }


    /**
     * Gets the orderId value for this SIMRegistrationRequest.
     * 
     * @return orderId
     */
    public java.lang.String getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this SIMRegistrationRequest.
     * 
     * @param orderId
     */
    public void setOrderId(java.lang.String orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the accountType value for this SIMRegistrationRequest.
     * 
     * @return accountType
     */
    public com.xius.billing.AccountManagement_xsd.BillingType getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this SIMRegistrationRequest.
     * 
     * @param accountType
     */
    public void setAccountType(com.xius.billing.AccountManagement_xsd.BillingType accountType) {
        this.accountType = accountType;
    }


    /**
     * Gets the billType value for this SIMRegistrationRequest.
     * 
     * @return billType
     */
    public java.lang.String getBillType() {
        return billType;
    }


    /**
     * Sets the billType value for this SIMRegistrationRequest.
     * 
     * @param billType
     */
    public void setBillType(java.lang.String billType) {
        this.billType = billType;
    }


    /**
     * Gets the billFreq value for this SIMRegistrationRequest.
     * 
     * @return billFreq
     */
    public java.lang.String getBillFreq() {
        return billFreq;
    }


    /**
     * Sets the billFreq value for this SIMRegistrationRequest.
     * 
     * @param billFreq
     */
    public void setBillFreq(java.lang.String billFreq) {
        this.billFreq = billFreq;
    }


    /**
     * Gets the isCorpAcct value for this SIMRegistrationRequest.
     * 
     * @return isCorpAcct
     */
    public java.lang.String getIsCorpAcct() {
        return isCorpAcct;
    }


    /**
     * Sets the isCorpAcct value for this SIMRegistrationRequest.
     * 
     * @param isCorpAcct
     */
    public void setIsCorpAcct(java.lang.String isCorpAcct) {
        this.isCorpAcct = isCorpAcct;
    }


    /**
     * Gets the creditLimit value for this SIMRegistrationRequest.
     * 
     * @return creditLimit
     */
    public java.math.BigDecimal getCreditLimit() {
        return creditLimit;
    }


    /**
     * Sets the creditLimit value for this SIMRegistrationRequest.
     * 
     * @param creditLimit
     */
    public void setCreditLimit(java.math.BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }


    /**
     * Gets the billingDate value for this SIMRegistrationRequest.
     * 
     * @return billingDate
     */
    public java.lang.String getBillingDate() {
        return billingDate;
    }


    /**
     * Sets the billingDate value for this SIMRegistrationRequest.
     * 
     * @param billingDate
     */
    public void setBillingDate(java.lang.String billingDate) {
        this.billingDate = billingDate;
    }


    /**
     * Gets the locationCode value for this SIMRegistrationRequest.
     * 
     * @return locationCode
     */
    public java.lang.String getLocationCode() {
        return locationCode;
    }


    /**
     * Sets the locationCode value for this SIMRegistrationRequest.
     * 
     * @param locationCode
     */
    public void setLocationCode(java.lang.String locationCode) {
        this.locationCode = locationCode;
    }


    /**
     * Gets the tariffPackageId value for this SIMRegistrationRequest.
     * 
     * @return tariffPackageId
     */
    public java.lang.Long getTariffPackageId() {
        return tariffPackageId;
    }


    /**
     * Sets the tariffPackageId value for this SIMRegistrationRequest.
     * 
     * @param tariffPackageId
     */
    public void setTariffPackageId(java.lang.Long tariffPackageId) {
        this.tariffPackageId = tariffPackageId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SIMRegistrationRequest)) return false;
        SIMRegistrationRequest other = (SIMRegistrationRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hlrFlag==null && other.getHlrFlag()==null) || 
             (this.hlrFlag!=null &&
              this.hlrFlag.equals(other.getHlrFlag()))) &&
            ((this.SIM==null && other.getSIM()==null) || 
             (this.SIM!=null &&
              this.SIM.equals(other.getSIM()))) &&
            ((this.IDNo==null && other.getIDNo()==null) || 
             (this.IDNo!=null &&
              this.IDNo.equals(other.getIDNo()))) &&
            ((this.IDType==null && other.getIDType()==null) || 
             (this.IDType!=null &&
              this.IDType.equals(other.getIDType()))) &&
            ((this.promoCode==null && other.getPromoCode()==null) || 
             (this.promoCode!=null &&
              this.promoCode.equals(other.getPromoCode()))) &&
            ((this.dealerMSISDN==null && other.getDealerMSISDN()==null) || 
             (this.dealerMSISDN!=null &&
              this.dealerMSISDN.equals(other.getDealerMSISDN()))) &&
            ((this.userType==null && other.getUserType()==null) || 
             (this.userType!=null &&
              this.userType.equals(other.getUserType()))) &&
            ((this.orderId==null && other.getOrderId()==null) || 
             (this.orderId!=null &&
              this.orderId.equals(other.getOrderId()))) &&
            ((this.accountType==null && other.getAccountType()==null) || 
             (this.accountType!=null &&
              this.accountType.equals(other.getAccountType()))) &&
            ((this.billType==null && other.getBillType()==null) || 
             (this.billType!=null &&
              this.billType.equals(other.getBillType()))) &&
            ((this.billFreq==null && other.getBillFreq()==null) || 
             (this.billFreq!=null &&
              this.billFreq.equals(other.getBillFreq()))) &&
            ((this.isCorpAcct==null && other.getIsCorpAcct()==null) || 
             (this.isCorpAcct!=null &&
              this.isCorpAcct.equals(other.getIsCorpAcct()))) &&
            ((this.creditLimit==null && other.getCreditLimit()==null) || 
             (this.creditLimit!=null &&
              this.creditLimit.equals(other.getCreditLimit()))) &&
            ((this.billingDate==null && other.getBillingDate()==null) || 
             (this.billingDate!=null &&
              this.billingDate.equals(other.getBillingDate()))) &&
            ((this.locationCode==null && other.getLocationCode()==null) || 
             (this.locationCode!=null &&
              this.locationCode.equals(other.getLocationCode()))) &&
            ((this.tariffPackageId==null && other.getTariffPackageId()==null) || 
             (this.tariffPackageId!=null &&
              this.tariffPackageId.equals(other.getTariffPackageId())));
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
        if (getHlrFlag() != null) {
            _hashCode += getHlrFlag().hashCode();
        }
        if (getSIM() != null) {
            _hashCode += getSIM().hashCode();
        }
        if (getIDNo() != null) {
            _hashCode += getIDNo().hashCode();
        }
        if (getIDType() != null) {
            _hashCode += getIDType().hashCode();
        }
        if (getPromoCode() != null) {
            _hashCode += getPromoCode().hashCode();
        }
        if (getDealerMSISDN() != null) {
            _hashCode += getDealerMSISDN().hashCode();
        }
        if (getUserType() != null) {
            _hashCode += getUserType().hashCode();
        }
        if (getOrderId() != null) {
            _hashCode += getOrderId().hashCode();
        }
        if (getAccountType() != null) {
            _hashCode += getAccountType().hashCode();
        }
        if (getBillType() != null) {
            _hashCode += getBillType().hashCode();
        }
        if (getBillFreq() != null) {
            _hashCode += getBillFreq().hashCode();
        }
        if (getIsCorpAcct() != null) {
            _hashCode += getIsCorpAcct().hashCode();
        }
        if (getCreditLimit() != null) {
            _hashCode += getCreditLimit().hashCode();
        }
        if (getBillingDate() != null) {
            _hashCode += getBillingDate().hashCode();
        }
        if (getLocationCode() != null) {
            _hashCode += getLocationCode().hashCode();
        }
        if (getTariffPackageId() != null) {
            _hashCode += getTariffPackageId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SIMRegistrationRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SIMRegistrationRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hlrFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "hlrFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SIM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SIM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "IDNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "IDType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promoCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "PromoCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dealerMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "DealerMSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "UserType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "OrderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "accountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "BillingType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "billType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billFreq");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "billFreq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCorpAcct");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "isCorpAcct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("billingDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "billingDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "locationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tariffPackageId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "tariffPackageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
