/**
 * GetRechargeInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.BalanceManagement_xsd;

public class GetRechargeInfoResponse  implements java.io.Serializable {
    private java.lang.String MSISDN;

    private java.lang.String voucherPin;

    private java.lang.String voucherSerialNo;

    private java.lang.String voucherProfileId;

    private java.lang.String transactionId;

    private com.xius.billing.BalanceManagement_xsd.MainBalanceType balance;

    private com.xius.billing.BalanceManagement_xsd.WalletType[] wallets;

    private java.lang.String rctId;

    private java.lang.String charge;

    private java.lang.String tpId;

    private java.lang.String oldValidity;

    private java.lang.String rcCatogory;

    private java.lang.String respCode;

    private java.lang.String respDescription;

    public GetRechargeInfoResponse() {
    }

    public GetRechargeInfoResponse(
           java.lang.String MSISDN,
           java.lang.String voucherPin,
           java.lang.String voucherSerialNo,
           java.lang.String voucherProfileId,
           java.lang.String transactionId,
           com.xius.billing.BalanceManagement_xsd.MainBalanceType balance,
           com.xius.billing.BalanceManagement_xsd.WalletType[] wallets,
           java.lang.String rctId,
           java.lang.String charge,
           java.lang.String tpId,
           java.lang.String oldValidity,
           java.lang.String rcCatogory,
           java.lang.String respCode,
           java.lang.String respDescription) {
           this.MSISDN = MSISDN;
           this.voucherPin = voucherPin;
           this.voucherSerialNo = voucherSerialNo;
           this.voucherProfileId = voucherProfileId;
           this.transactionId = transactionId;
           this.balance = balance;
           this.wallets = wallets;
           this.rctId = rctId;
           this.charge = charge;
           this.tpId = tpId;
           this.oldValidity = oldValidity;
           this.rcCatogory = rcCatogory;
           this.respCode = respCode;
           this.respDescription = respDescription;
    }


    /**
     * Gets the MSISDN value for this GetRechargeInfoResponse.
     * 
     * @return MSISDN
     */
    public java.lang.String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this GetRechargeInfoResponse.
     * 
     * @param MSISDN
     */
    public void setMSISDN(java.lang.String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the voucherPin value for this GetRechargeInfoResponse.
     * 
     * @return voucherPin
     */
    public java.lang.String getVoucherPin() {
        return voucherPin;
    }


    /**
     * Sets the voucherPin value for this GetRechargeInfoResponse.
     * 
     * @param voucherPin
     */
    public void setVoucherPin(java.lang.String voucherPin) {
        this.voucherPin = voucherPin;
    }


    /**
     * Gets the voucherSerialNo value for this GetRechargeInfoResponse.
     * 
     * @return voucherSerialNo
     */
    public java.lang.String getVoucherSerialNo() {
        return voucherSerialNo;
    }


    /**
     * Sets the voucherSerialNo value for this GetRechargeInfoResponse.
     * 
     * @param voucherSerialNo
     */
    public void setVoucherSerialNo(java.lang.String voucherSerialNo) {
        this.voucherSerialNo = voucherSerialNo;
    }


    /**
     * Gets the voucherProfileId value for this GetRechargeInfoResponse.
     * 
     * @return voucherProfileId
     */
    public java.lang.String getVoucherProfileId() {
        return voucherProfileId;
    }


    /**
     * Sets the voucherProfileId value for this GetRechargeInfoResponse.
     * 
     * @param voucherProfileId
     */
    public void setVoucherProfileId(java.lang.String voucherProfileId) {
        this.voucherProfileId = voucherProfileId;
    }


    /**
     * Gets the transactionId value for this GetRechargeInfoResponse.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this GetRechargeInfoResponse.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the balance value for this GetRechargeInfoResponse.
     * 
     * @return balance
     */
    public com.xius.billing.BalanceManagement_xsd.MainBalanceType getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this GetRechargeInfoResponse.
     * 
     * @param balance
     */
    public void setBalance(com.xius.billing.BalanceManagement_xsd.MainBalanceType balance) {
        this.balance = balance;
    }


    /**
     * Gets the wallets value for this GetRechargeInfoResponse.
     * 
     * @return wallets
     */
    public com.xius.billing.BalanceManagement_xsd.WalletType[] getWallets() {
        return wallets;
    }


    /**
     * Sets the wallets value for this GetRechargeInfoResponse.
     * 
     * @param wallets
     */
    public void setWallets(com.xius.billing.BalanceManagement_xsd.WalletType[] wallets) {
        this.wallets = wallets;
    }


    /**
     * Gets the rctId value for this GetRechargeInfoResponse.
     * 
     * @return rctId
     */
    public java.lang.String getRctId() {
        return rctId;
    }


    /**
     * Sets the rctId value for this GetRechargeInfoResponse.
     * 
     * @param rctId
     */
    public void setRctId(java.lang.String rctId) {
        this.rctId = rctId;
    }


    /**
     * Gets the charge value for this GetRechargeInfoResponse.
     * 
     * @return charge
     */
    public java.lang.String getCharge() {
        return charge;
    }


    /**
     * Sets the charge value for this GetRechargeInfoResponse.
     * 
     * @param charge
     */
    public void setCharge(java.lang.String charge) {
        this.charge = charge;
    }


    /**
     * Gets the tpId value for this GetRechargeInfoResponse.
     * 
     * @return tpId
     */
    public java.lang.String getTpId() {
        return tpId;
    }


    /**
     * Sets the tpId value for this GetRechargeInfoResponse.
     * 
     * @param tpId
     */
    public void setTpId(java.lang.String tpId) {
        this.tpId = tpId;
    }


    /**
     * Gets the oldValidity value for this GetRechargeInfoResponse.
     * 
     * @return oldValidity
     */
    public java.lang.String getOldValidity() {
        return oldValidity;
    }


    /**
     * Sets the oldValidity value for this GetRechargeInfoResponse.
     * 
     * @param oldValidity
     */
    public void setOldValidity(java.lang.String oldValidity) {
        this.oldValidity = oldValidity;
    }


    /**
     * Gets the rcCatogory value for this GetRechargeInfoResponse.
     * 
     * @return rcCatogory
     */
    public java.lang.String getRcCatogory() {
        return rcCatogory;
    }


    /**
     * Sets the rcCatogory value for this GetRechargeInfoResponse.
     * 
     * @param rcCatogory
     */
    public void setRcCatogory(java.lang.String rcCatogory) {
        this.rcCatogory = rcCatogory;
    }


    /**
     * Gets the respCode value for this GetRechargeInfoResponse.
     * 
     * @return respCode
     */
    public java.lang.String getRespCode() {
        return respCode;
    }


    /**
     * Sets the respCode value for this GetRechargeInfoResponse.
     * 
     * @param respCode
     */
    public void setRespCode(java.lang.String respCode) {
        this.respCode = respCode;
    }


    /**
     * Gets the respDescription value for this GetRechargeInfoResponse.
     * 
     * @return respDescription
     */
    public java.lang.String getRespDescription() {
        return respDescription;
    }


    /**
     * Sets the respDescription value for this GetRechargeInfoResponse.
     * 
     * @param respDescription
     */
    public void setRespDescription(java.lang.String respDescription) {
        this.respDescription = respDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetRechargeInfoResponse)) return false;
        GetRechargeInfoResponse other = (GetRechargeInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MSISDN==null && other.getMSISDN()==null) || 
             (this.MSISDN!=null &&
              this.MSISDN.equals(other.getMSISDN()))) &&
            ((this.voucherPin==null && other.getVoucherPin()==null) || 
             (this.voucherPin!=null &&
              this.voucherPin.equals(other.getVoucherPin()))) &&
            ((this.voucherSerialNo==null && other.getVoucherSerialNo()==null) || 
             (this.voucherSerialNo!=null &&
              this.voucherSerialNo.equals(other.getVoucherSerialNo()))) &&
            ((this.voucherProfileId==null && other.getVoucherProfileId()==null) || 
             (this.voucherProfileId!=null &&
              this.voucherProfileId.equals(other.getVoucherProfileId()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.balance==null && other.getBalance()==null) || 
             (this.balance!=null &&
              this.balance.equals(other.getBalance()))) &&
            ((this.wallets==null && other.getWallets()==null) || 
             (this.wallets!=null &&
              java.util.Arrays.equals(this.wallets, other.getWallets()))) &&
            ((this.rctId==null && other.getRctId()==null) || 
             (this.rctId!=null &&
              this.rctId.equals(other.getRctId()))) &&
            ((this.charge==null && other.getCharge()==null) || 
             (this.charge!=null &&
              this.charge.equals(other.getCharge()))) &&
            ((this.tpId==null && other.getTpId()==null) || 
             (this.tpId!=null &&
              this.tpId.equals(other.getTpId()))) &&
            ((this.oldValidity==null && other.getOldValidity()==null) || 
             (this.oldValidity!=null &&
              this.oldValidity.equals(other.getOldValidity()))) &&
            ((this.rcCatogory==null && other.getRcCatogory()==null) || 
             (this.rcCatogory!=null &&
              this.rcCatogory.equals(other.getRcCatogory()))) &&
            ((this.respCode==null && other.getRespCode()==null) || 
             (this.respCode!=null &&
              this.respCode.equals(other.getRespCode()))) &&
            ((this.respDescription==null && other.getRespDescription()==null) || 
             (this.respDescription!=null &&
              this.respDescription.equals(other.getRespDescription())));
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
        if (getMSISDN() != null) {
            _hashCode += getMSISDN().hashCode();
        }
        if (getVoucherPin() != null) {
            _hashCode += getVoucherPin().hashCode();
        }
        if (getVoucherSerialNo() != null) {
            _hashCode += getVoucherSerialNo().hashCode();
        }
        if (getVoucherProfileId() != null) {
            _hashCode += getVoucherProfileId().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getBalance() != null) {
            _hashCode += getBalance().hashCode();
        }
        if (getWallets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWallets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWallets(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRctId() != null) {
            _hashCode += getRctId().hashCode();
        }
        if (getCharge() != null) {
            _hashCode += getCharge().hashCode();
        }
        if (getTpId() != null) {
            _hashCode += getTpId().hashCode();
        }
        if (getOldValidity() != null) {
            _hashCode += getOldValidity().hashCode();
        }
        if (getRcCatogory() != null) {
            _hashCode += getRcCatogory().hashCode();
        }
        if (getRespCode() != null) {
            _hashCode += getRespCode().hashCode();
        }
        if (getRespDescription() != null) {
            _hashCode += getRespDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetRechargeInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "getRechargeInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "MSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voucherPin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "voucherPin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voucherSerialNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "voucherSerialNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voucherProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "voucherProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "transactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "mainBalanceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wallets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "wallets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "walletType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "walletList"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rctId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "rctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("charge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "charge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tpId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "tpId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldValidity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "oldValidity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rcCatogory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "rcCatogory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("respCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "respCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("respDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "respDescription"));
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
