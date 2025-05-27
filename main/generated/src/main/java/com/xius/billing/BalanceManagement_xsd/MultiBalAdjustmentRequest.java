/**
 * MultiBalAdjustmentRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.BalanceManagement_xsd;

public class MultiBalAdjustmentRequest  implements java.io.Serializable {
    private java.lang.String MSISDN;

    private java.lang.String channelType;

    private com.xius.billing.BalanceManagement_xsd.WalletType[] wallets;

    private java.lang.String oldValidity;

    private java.lang.String mrp;

    private java.lang.String tpId;

    private java.lang.String voucherPin;

    private java.lang.String voucherProfileId;

    private java.lang.String transactionId;

    public MultiBalAdjustmentRequest() {
    }

    public MultiBalAdjustmentRequest(
           java.lang.String MSISDN,
           java.lang.String channelType,
           com.xius.billing.BalanceManagement_xsd.WalletType[] wallets,
           java.lang.String oldValidity,
           java.lang.String mrp,
           java.lang.String tpId,
           java.lang.String voucherPin,
           java.lang.String voucherProfileId,
           java.lang.String transactionId) {
           this.MSISDN = MSISDN;
           this.channelType = channelType;
           this.wallets = wallets;
           this.oldValidity = oldValidity;
           this.mrp = mrp;
           this.tpId = tpId;
           this.voucherPin = voucherPin;
           this.voucherProfileId = voucherProfileId;
           this.transactionId = transactionId;
    }


    /**
     * Gets the MSISDN value for this MultiBalAdjustmentRequest.
     * 
     * @return MSISDN
     */
    public java.lang.String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this MultiBalAdjustmentRequest.
     * 
     * @param MSISDN
     */
    public void setMSISDN(java.lang.String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the channelType value for this MultiBalAdjustmentRequest.
     * 
     * @return channelType
     */
    public java.lang.String getChannelType() {
        return channelType;
    }


    /**
     * Sets the channelType value for this MultiBalAdjustmentRequest.
     * 
     * @param channelType
     */
    public void setChannelType(java.lang.String channelType) {
        this.channelType = channelType;
    }


    /**
     * Gets the wallets value for this MultiBalAdjustmentRequest.
     * 
     * @return wallets
     */
    public com.xius.billing.BalanceManagement_xsd.WalletType[] getWallets() {
        return wallets;
    }


    /**
     * Sets the wallets value for this MultiBalAdjustmentRequest.
     * 
     * @param wallets
     */
    public void setWallets(com.xius.billing.BalanceManagement_xsd.WalletType[] wallets) {
        this.wallets = wallets;
    }


    /**
     * Gets the oldValidity value for this MultiBalAdjustmentRequest.
     * 
     * @return oldValidity
     */
    public java.lang.String getOldValidity() {
        return oldValidity;
    }


    /**
     * Sets the oldValidity value for this MultiBalAdjustmentRequest.
     * 
     * @param oldValidity
     */
    public void setOldValidity(java.lang.String oldValidity) {
        this.oldValidity = oldValidity;
    }


    /**
     * Gets the mrp value for this MultiBalAdjustmentRequest.
     * 
     * @return mrp
     */
    public java.lang.String getMrp() {
        return mrp;
    }


    /**
     * Sets the mrp value for this MultiBalAdjustmentRequest.
     * 
     * @param mrp
     */
    public void setMrp(java.lang.String mrp) {
        this.mrp = mrp;
    }


    /**
     * Gets the tpId value for this MultiBalAdjustmentRequest.
     * 
     * @return tpId
     */
    public java.lang.String getTpId() {
        return tpId;
    }


    /**
     * Sets the tpId value for this MultiBalAdjustmentRequest.
     * 
     * @param tpId
     */
    public void setTpId(java.lang.String tpId) {
        this.tpId = tpId;
    }


    /**
     * Gets the voucherPin value for this MultiBalAdjustmentRequest.
     * 
     * @return voucherPin
     */
    public java.lang.String getVoucherPin() {
        return voucherPin;
    }


    /**
     * Sets the voucherPin value for this MultiBalAdjustmentRequest.
     * 
     * @param voucherPin
     */
    public void setVoucherPin(java.lang.String voucherPin) {
        this.voucherPin = voucherPin;
    }


    /**
     * Gets the voucherProfileId value for this MultiBalAdjustmentRequest.
     * 
     * @return voucherProfileId
     */
    public java.lang.String getVoucherProfileId() {
        return voucherProfileId;
    }


    /**
     * Sets the voucherProfileId value for this MultiBalAdjustmentRequest.
     * 
     * @param voucherProfileId
     */
    public void setVoucherProfileId(java.lang.String voucherProfileId) {
        this.voucherProfileId = voucherProfileId;
    }


    /**
     * Gets the transactionId value for this MultiBalAdjustmentRequest.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this MultiBalAdjustmentRequest.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MultiBalAdjustmentRequest)) return false;
        MultiBalAdjustmentRequest other = (MultiBalAdjustmentRequest) obj;
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
            ((this.channelType==null && other.getChannelType()==null) || 
             (this.channelType!=null &&
              this.channelType.equals(other.getChannelType()))) &&
            ((this.wallets==null && other.getWallets()==null) || 
             (this.wallets!=null &&
              java.util.Arrays.equals(this.wallets, other.getWallets()))) &&
            ((this.oldValidity==null && other.getOldValidity()==null) || 
             (this.oldValidity!=null &&
              this.oldValidity.equals(other.getOldValidity()))) &&
            ((this.mrp==null && other.getMrp()==null) || 
             (this.mrp!=null &&
              this.mrp.equals(other.getMrp()))) &&
            ((this.tpId==null && other.getTpId()==null) || 
             (this.tpId!=null &&
              this.tpId.equals(other.getTpId()))) &&
            ((this.voucherPin==null && other.getVoucherPin()==null) || 
             (this.voucherPin!=null &&
              this.voucherPin.equals(other.getVoucherPin()))) &&
            ((this.voucherProfileId==null && other.getVoucherProfileId()==null) || 
             (this.voucherProfileId!=null &&
              this.voucherProfileId.equals(other.getVoucherProfileId()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId())));
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
        if (getChannelType() != null) {
            _hashCode += getChannelType().hashCode();
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
        if (getOldValidity() != null) {
            _hashCode += getOldValidity().hashCode();
        }
        if (getMrp() != null) {
            _hashCode += getMrp().hashCode();
        }
        if (getTpId() != null) {
            _hashCode += getTpId().hashCode();
        }
        if (getVoucherPin() != null) {
            _hashCode += getVoucherPin().hashCode();
        }
        if (getVoucherProfileId() != null) {
            _hashCode += getVoucherProfileId().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MultiBalAdjustmentRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "multiBalAdjustmentRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "MSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "channelType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("oldValidity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "oldValidity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mrp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "mrp"));
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
        elemField.setFieldName("voucherPin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "voucherPin"));
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
