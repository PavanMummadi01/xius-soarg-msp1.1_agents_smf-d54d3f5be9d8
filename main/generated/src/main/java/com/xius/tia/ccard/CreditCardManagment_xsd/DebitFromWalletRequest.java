/**
 * DebitFromWalletRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.ccard.CreditCardManagment_xsd;

public class DebitFromWalletRequest  implements java.io.Serializable {
    private java.lang.String walletType;

    private java.lang.String toAccount;

    private java.lang.String fromAccount;

    private java.lang.String amount;

    private java.lang.String transactionID;

    private java.lang.String userdefined1;

    private java.lang.String userdefined2;

    private java.lang.String userdefined3;

    public DebitFromWalletRequest() {
    }

    public DebitFromWalletRequest(
           java.lang.String walletType,
           java.lang.String toAccount,
           java.lang.String fromAccount,
           java.lang.String amount,
           java.lang.String transactionID,
           java.lang.String userdefined1,
           java.lang.String userdefined2,
           java.lang.String userdefined3) {
           this.walletType = walletType;
           this.toAccount = toAccount;
           this.fromAccount = fromAccount;
           this.amount = amount;
           this.transactionID = transactionID;
           this.userdefined1 = userdefined1;
           this.userdefined2 = userdefined2;
           this.userdefined3 = userdefined3;
    }


    /**
     * Gets the walletType value for this DebitFromWalletRequest.
     * 
     * @return walletType
     */
    public java.lang.String getWalletType() {
        return walletType;
    }


    /**
     * Sets the walletType value for this DebitFromWalletRequest.
     * 
     * @param walletType
     */
    public void setWalletType(java.lang.String walletType) {
        this.walletType = walletType;
    }


    /**
     * Gets the toAccount value for this DebitFromWalletRequest.
     * 
     * @return toAccount
     */
    public java.lang.String getToAccount() {
        return toAccount;
    }


    /**
     * Sets the toAccount value for this DebitFromWalletRequest.
     * 
     * @param toAccount
     */
    public void setToAccount(java.lang.String toAccount) {
        this.toAccount = toAccount;
    }


    /**
     * Gets the fromAccount value for this DebitFromWalletRequest.
     * 
     * @return fromAccount
     */
    public java.lang.String getFromAccount() {
        return fromAccount;
    }


    /**
     * Sets the fromAccount value for this DebitFromWalletRequest.
     * 
     * @param fromAccount
     */
    public void setFromAccount(java.lang.String fromAccount) {
        this.fromAccount = fromAccount;
    }


    /**
     * Gets the amount value for this DebitFromWalletRequest.
     * 
     * @return amount
     */
    public java.lang.String getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this DebitFromWalletRequest.
     * 
     * @param amount
     */
    public void setAmount(java.lang.String amount) {
        this.amount = amount;
    }


    /**
     * Gets the transactionID value for this DebitFromWalletRequest.
     * 
     * @return transactionID
     */
    public java.lang.String getTransactionID() {
        return transactionID;
    }


    /**
     * Sets the transactionID value for this DebitFromWalletRequest.
     * 
     * @param transactionID
     */
    public void setTransactionID(java.lang.String transactionID) {
        this.transactionID = transactionID;
    }


    /**
     * Gets the userdefined1 value for this DebitFromWalletRequest.
     * 
     * @return userdefined1
     */
    public java.lang.String getUserdefined1() {
        return userdefined1;
    }


    /**
     * Sets the userdefined1 value for this DebitFromWalletRequest.
     * 
     * @param userdefined1
     */
    public void setUserdefined1(java.lang.String userdefined1) {
        this.userdefined1 = userdefined1;
    }


    /**
     * Gets the userdefined2 value for this DebitFromWalletRequest.
     * 
     * @return userdefined2
     */
    public java.lang.String getUserdefined2() {
        return userdefined2;
    }


    /**
     * Sets the userdefined2 value for this DebitFromWalletRequest.
     * 
     * @param userdefined2
     */
    public void setUserdefined2(java.lang.String userdefined2) {
        this.userdefined2 = userdefined2;
    }


    /**
     * Gets the userdefined3 value for this DebitFromWalletRequest.
     * 
     * @return userdefined3
     */
    public java.lang.String getUserdefined3() {
        return userdefined3;
    }


    /**
     * Sets the userdefined3 value for this DebitFromWalletRequest.
     * 
     * @param userdefined3
     */
    public void setUserdefined3(java.lang.String userdefined3) {
        this.userdefined3 = userdefined3;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DebitFromWalletRequest)) return false;
        DebitFromWalletRequest other = (DebitFromWalletRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.walletType==null && other.getWalletType()==null) || 
             (this.walletType!=null &&
              this.walletType.equals(other.getWalletType()))) &&
            ((this.toAccount==null && other.getToAccount()==null) || 
             (this.toAccount!=null &&
              this.toAccount.equals(other.getToAccount()))) &&
            ((this.fromAccount==null && other.getFromAccount()==null) || 
             (this.fromAccount!=null &&
              this.fromAccount.equals(other.getFromAccount()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.transactionID==null && other.getTransactionID()==null) || 
             (this.transactionID!=null &&
              this.transactionID.equals(other.getTransactionID()))) &&
            ((this.userdefined1==null && other.getUserdefined1()==null) || 
             (this.userdefined1!=null &&
              this.userdefined1.equals(other.getUserdefined1()))) &&
            ((this.userdefined2==null && other.getUserdefined2()==null) || 
             (this.userdefined2!=null &&
              this.userdefined2.equals(other.getUserdefined2()))) &&
            ((this.userdefined3==null && other.getUserdefined3()==null) || 
             (this.userdefined3!=null &&
              this.userdefined3.equals(other.getUserdefined3())));
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
        if (getWalletType() != null) {
            _hashCode += getWalletType().hashCode();
        }
        if (getToAccount() != null) {
            _hashCode += getToAccount().hashCode();
        }
        if (getFromAccount() != null) {
            _hashCode += getFromAccount().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getTransactionID() != null) {
            _hashCode += getTransactionID().hashCode();
        }
        if (getUserdefined1() != null) {
            _hashCode += getUserdefined1().hashCode();
        }
        if (getUserdefined2() != null) {
            _hashCode += getUserdefined2().hashCode();
        }
        if (getUserdefined3() != null) {
            _hashCode += getUserdefined3().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DebitFromWalletRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "debitFromWalletRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("walletType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "walletType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "toAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "fromAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "transactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userdefined1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "userdefined1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userdefined2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "userdefined2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userdefined3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "userdefined3"));
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
