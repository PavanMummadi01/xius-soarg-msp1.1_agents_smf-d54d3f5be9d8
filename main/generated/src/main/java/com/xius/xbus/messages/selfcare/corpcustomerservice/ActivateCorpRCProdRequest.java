/**
 * ActivateCorpRCProdRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.selfcare.corpcustomerservice;

public class ActivateCorpRCProdRequest  extends com.xius.xbus.messages.common.WSRequest  implements java.io.Serializable {
    private com.xius.xbus.messages.common.AccountType accountType;

    private com.xius.xbus.messages.common.VoucherDetailsType voucher;

    private com.xius.xbus.messages.common.ETopUpDetailsType eTopUp;

    private java.lang.String mrp;

    private java.lang.String transId;

    private java.lang.String channel;

    private java.lang.String reason;

    private java.lang.String officeCode;

    private java.lang.String amtToDebit;

    public ActivateCorpRCProdRequest() {
    }

    public ActivateCorpRCProdRequest(
           com.xius.xbus.messages.common.UserType userType,
           java.lang.String messageID,
           com.xius.xbus.messages.common.SecurityId securityId,
           com.xius.xbus.messages.common.ServiceContext serviceContext,
           java.lang.String version,
           com.xius.xbus.messages.common.AccountType accountType,
           com.xius.xbus.messages.common.VoucherDetailsType voucher,
           com.xius.xbus.messages.common.ETopUpDetailsType eTopUp,
           java.lang.String mrp,
           java.lang.String transId,
           java.lang.String channel,
           java.lang.String reason,
           java.lang.String officeCode,
           java.lang.String amtToDebit) {
        super(
            userType,
            messageID,
            securityId,
            serviceContext,
            version);
        this.accountType = accountType;
        this.voucher = voucher;
        this.eTopUp = eTopUp;
        this.mrp = mrp;
        this.transId = transId;
        this.channel = channel;
        this.reason = reason;
        this.officeCode = officeCode;
        this.amtToDebit = amtToDebit;
    }


    /**
     * Gets the accountType value for this ActivateCorpRCProdRequest.
     * 
     * @return accountType
     */
    public com.xius.xbus.messages.common.AccountType getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this ActivateCorpRCProdRequest.
     * 
     * @param accountType
     */
    public void setAccountType(com.xius.xbus.messages.common.AccountType accountType) {
        this.accountType = accountType;
    }


    /**
     * Gets the voucher value for this ActivateCorpRCProdRequest.
     * 
     * @return voucher
     */
    public com.xius.xbus.messages.common.VoucherDetailsType getVoucher() {
        return voucher;
    }


    /**
     * Sets the voucher value for this ActivateCorpRCProdRequest.
     * 
     * @param voucher
     */
    public void setVoucher(com.xius.xbus.messages.common.VoucherDetailsType voucher) {
        this.voucher = voucher;
    }


    /**
     * Gets the eTopUp value for this ActivateCorpRCProdRequest.
     * 
     * @return eTopUp
     */
    public com.xius.xbus.messages.common.ETopUpDetailsType getETopUp() {
        return eTopUp;
    }


    /**
     * Sets the eTopUp value for this ActivateCorpRCProdRequest.
     * 
     * @param eTopUp
     */
    public void setETopUp(com.xius.xbus.messages.common.ETopUpDetailsType eTopUp) {
        this.eTopUp = eTopUp;
    }


    /**
     * Gets the mrp value for this ActivateCorpRCProdRequest.
     * 
     * @return mrp
     */
    public java.lang.String getMrp() {
        return mrp;
    }


    /**
     * Sets the mrp value for this ActivateCorpRCProdRequest.
     * 
     * @param mrp
     */
    public void setMrp(java.lang.String mrp) {
        this.mrp = mrp;
    }


    /**
     * Gets the transId value for this ActivateCorpRCProdRequest.
     * 
     * @return transId
     */
    public java.lang.String getTransId() {
        return transId;
    }


    /**
     * Sets the transId value for this ActivateCorpRCProdRequest.
     * 
     * @param transId
     */
    public void setTransId(java.lang.String transId) {
        this.transId = transId;
    }


    /**
     * Gets the channel value for this ActivateCorpRCProdRequest.
     * 
     * @return channel
     */
    public java.lang.String getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this ActivateCorpRCProdRequest.
     * 
     * @param channel
     */
    public void setChannel(java.lang.String channel) {
        this.channel = channel;
    }


    /**
     * Gets the reason value for this ActivateCorpRCProdRequest.
     * 
     * @return reason
     */
    public java.lang.String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this ActivateCorpRCProdRequest.
     * 
     * @param reason
     */
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }


    /**
     * Gets the officeCode value for this ActivateCorpRCProdRequest.
     * 
     * @return officeCode
     */
    public java.lang.String getOfficeCode() {
        return officeCode;
    }


    /**
     * Sets the officeCode value for this ActivateCorpRCProdRequest.
     * 
     * @param officeCode
     */
    public void setOfficeCode(java.lang.String officeCode) {
        this.officeCode = officeCode;
    }


    /**
     * Gets the amtToDebit value for this ActivateCorpRCProdRequest.
     * 
     * @return amtToDebit
     */
    public java.lang.String getAmtToDebit() {
        return amtToDebit;
    }


    /**
     * Sets the amtToDebit value for this ActivateCorpRCProdRequest.
     * 
     * @param amtToDebit
     */
    public void setAmtToDebit(java.lang.String amtToDebit) {
        this.amtToDebit = amtToDebit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ActivateCorpRCProdRequest)) return false;
        ActivateCorpRCProdRequest other = (ActivateCorpRCProdRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accountType==null && other.getAccountType()==null) || 
             (this.accountType!=null &&
              this.accountType.equals(other.getAccountType()))) &&
            ((this.voucher==null && other.getVoucher()==null) || 
             (this.voucher!=null &&
              this.voucher.equals(other.getVoucher()))) &&
            ((this.eTopUp==null && other.getETopUp()==null) || 
             (this.eTopUp!=null &&
              this.eTopUp.equals(other.getETopUp()))) &&
            ((this.mrp==null && other.getMrp()==null) || 
             (this.mrp!=null &&
              this.mrp.equals(other.getMrp()))) &&
            ((this.transId==null && other.getTransId()==null) || 
             (this.transId!=null &&
              this.transId.equals(other.getTransId()))) &&
            ((this.channel==null && other.getChannel()==null) || 
             (this.channel!=null &&
              this.channel.equals(other.getChannel()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason()))) &&
            ((this.officeCode==null && other.getOfficeCode()==null) || 
             (this.officeCode!=null &&
              this.officeCode.equals(other.getOfficeCode()))) &&
            ((this.amtToDebit==null && other.getAmtToDebit()==null) || 
             (this.amtToDebit!=null &&
              this.amtToDebit.equals(other.getAmtToDebit())));
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
        if (getAccountType() != null) {
            _hashCode += getAccountType().hashCode();
        }
        if (getVoucher() != null) {
            _hashCode += getVoucher().hashCode();
        }
        if (getETopUp() != null) {
            _hashCode += getETopUp().hashCode();
        }
        if (getMrp() != null) {
            _hashCode += getMrp().hashCode();
        }
        if (getTransId() != null) {
            _hashCode += getTransId().hashCode();
        }
        if (getChannel() != null) {
            _hashCode += getChannel().hashCode();
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        if (getOfficeCode() != null) {
            _hashCode += getOfficeCode().hashCode();
        }
        if (getAmtToDebit() != null) {
            _hashCode += getAmtToDebit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ActivateCorpRCProdRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/corpcustomerservice", ">activateCorpRCProdRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/corpcustomerservice", "accountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "AccountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voucher");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/corpcustomerservice", "voucher"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "voucherDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ETopUp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/corpcustomerservice", "eTopUp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "eTopUpDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mrp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/corpcustomerservice", "mrp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/corpcustomerservice", "transId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/corpcustomerservice", "channel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/corpcustomerservice", "reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/corpcustomerservice", "officeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amtToDebit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/corpcustomerservice", "amtToDebit"));
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
