/**
 * DebitFromCCRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.ccard.CreditCardManagment_xsd;

public class DebitFromCCRequest  implements java.io.Serializable {
    private java.lang.String MSISDN;

    private java.lang.String accountID;

    private java.lang.String amount;

    private java.lang.String transactionId;

    private java.lang.String userdefined1;

    private java.lang.String userdefined2;

    private java.lang.String userdefined3;

    private java.lang.String userdefined4;

    private java.lang.String userdefined5;

    public DebitFromCCRequest() {
    }

    public DebitFromCCRequest(
           java.lang.String MSISDN,
           java.lang.String accountID,
           java.lang.String amount,
           java.lang.String transactionId,
           java.lang.String userdefined1,
           java.lang.String userdefined2,
           java.lang.String userdefined3,
           java.lang.String userdefined4,
           java.lang.String userdefined5) {
           this.MSISDN = MSISDN;
           this.accountID = accountID;
           this.amount = amount;
           this.transactionId = transactionId;
           this.userdefined1 = userdefined1;
           this.userdefined2 = userdefined2;
           this.userdefined3 = userdefined3;
           this.userdefined4 = userdefined4;
           this.userdefined5 = userdefined5;
    }


    /**
     * Gets the MSISDN value for this DebitFromCCRequest.
     * 
     * @return MSISDN
     */
    public java.lang.String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this DebitFromCCRequest.
     * 
     * @param MSISDN
     */
    public void setMSISDN(java.lang.String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the accountID value for this DebitFromCCRequest.
     * 
     * @return accountID
     */
    public java.lang.String getAccountID() {
        return accountID;
    }


    /**
     * Sets the accountID value for this DebitFromCCRequest.
     * 
     * @param accountID
     */
    public void setAccountID(java.lang.String accountID) {
        this.accountID = accountID;
    }


    /**
     * Gets the amount value for this DebitFromCCRequest.
     * 
     * @return amount
     */
    public java.lang.String getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this DebitFromCCRequest.
     * 
     * @param amount
     */
    public void setAmount(java.lang.String amount) {
        this.amount = amount;
    }


    /**
     * Gets the transactionId value for this DebitFromCCRequest.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this DebitFromCCRequest.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the userdefined1 value for this DebitFromCCRequest.
     * 
     * @return userdefined1
     */
    public java.lang.String getUserdefined1() {
        return userdefined1;
    }


    /**
     * Sets the userdefined1 value for this DebitFromCCRequest.
     * 
     * @param userdefined1
     */
    public void setUserdefined1(java.lang.String userdefined1) {
        this.userdefined1 = userdefined1;
    }


    /**
     * Gets the userdefined2 value for this DebitFromCCRequest.
     * 
     * @return userdefined2
     */
    public java.lang.String getUserdefined2() {
        return userdefined2;
    }


    /**
     * Sets the userdefined2 value for this DebitFromCCRequest.
     * 
     * @param userdefined2
     */
    public void setUserdefined2(java.lang.String userdefined2) {
        this.userdefined2 = userdefined2;
    }


    /**
     * Gets the userdefined3 value for this DebitFromCCRequest.
     * 
     * @return userdefined3
     */
    public java.lang.String getUserdefined3() {
        return userdefined3;
    }


    /**
     * Sets the userdefined3 value for this DebitFromCCRequest.
     * 
     * @param userdefined3
     */
    public void setUserdefined3(java.lang.String userdefined3) {
        this.userdefined3 = userdefined3;
    }


    /**
     * Gets the userdefined4 value for this DebitFromCCRequest.
     * 
     * @return userdefined4
     */
    public java.lang.String getUserdefined4() {
        return userdefined4;
    }


    /**
     * Sets the userdefined4 value for this DebitFromCCRequest.
     * 
     * @param userdefined4
     */
    public void setUserdefined4(java.lang.String userdefined4) {
        this.userdefined4 = userdefined4;
    }


    /**
     * Gets the userdefined5 value for this DebitFromCCRequest.
     * 
     * @return userdefined5
     */
    public java.lang.String getUserdefined5() {
        return userdefined5;
    }


    /**
     * Sets the userdefined5 value for this DebitFromCCRequest.
     * 
     * @param userdefined5
     */
    public void setUserdefined5(java.lang.String userdefined5) {
        this.userdefined5 = userdefined5;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DebitFromCCRequest)) return false;
        DebitFromCCRequest other = (DebitFromCCRequest) obj;
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
            ((this.accountID==null && other.getAccountID()==null) || 
             (this.accountID!=null &&
              this.accountID.equals(other.getAccountID()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.userdefined1==null && other.getUserdefined1()==null) || 
             (this.userdefined1!=null &&
              this.userdefined1.equals(other.getUserdefined1()))) &&
            ((this.userdefined2==null && other.getUserdefined2()==null) || 
             (this.userdefined2!=null &&
              this.userdefined2.equals(other.getUserdefined2()))) &&
            ((this.userdefined3==null && other.getUserdefined3()==null) || 
             (this.userdefined3!=null &&
              this.userdefined3.equals(other.getUserdefined3()))) &&
            ((this.userdefined4==null && other.getUserdefined4()==null) || 
             (this.userdefined4!=null &&
              this.userdefined4.equals(other.getUserdefined4()))) &&
            ((this.userdefined5==null && other.getUserdefined5()==null) || 
             (this.userdefined5!=null &&
              this.userdefined5.equals(other.getUserdefined5())));
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
        if (getAccountID() != null) {
            _hashCode += getAccountID().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
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
        if (getUserdefined4() != null) {
            _hashCode += getUserdefined4().hashCode();
        }
        if (getUserdefined5() != null) {
            _hashCode += getUserdefined5().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DebitFromCCRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "debitFromCCRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "MSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "accountID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "transactionId"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userdefined4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "userdefined4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userdefined5");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "userdefined5"));
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
