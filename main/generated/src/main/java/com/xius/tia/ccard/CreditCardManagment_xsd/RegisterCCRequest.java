/**
 * RegisterCCRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.ccard.CreditCardManagment_xsd;

public class RegisterCCRequest  implements java.io.Serializable {
    private java.lang.String MSISDN;

    private java.lang.String accountID;

    private java.lang.String DPI;

    private java.lang.String SIMNO;

    private java.lang.String IMSI;

    private java.lang.String sellerCode;

    private java.lang.String transactionId;

    private java.lang.String channel;

    private java.lang.String userdefined1;

    private java.lang.String userdefined2;

    private java.lang.String userdefined3;

    private java.lang.String userdefined4;

    private java.lang.String userdefined5;

    public RegisterCCRequest() {
    }

    public RegisterCCRequest(
           java.lang.String MSISDN,
           java.lang.String accountID,
           java.lang.String DPI,
           java.lang.String SIMNO,
           java.lang.String IMSI,
           java.lang.String sellerCode,
           java.lang.String transactionId,
           java.lang.String channel,
           java.lang.String userdefined1,
           java.lang.String userdefined2,
           java.lang.String userdefined3,
           java.lang.String userdefined4,
           java.lang.String userdefined5) {
           this.MSISDN = MSISDN;
           this.accountID = accountID;
           this.DPI = DPI;
           this.SIMNO = SIMNO;
           this.IMSI = IMSI;
           this.sellerCode = sellerCode;
           this.transactionId = transactionId;
           this.channel = channel;
           this.userdefined1 = userdefined1;
           this.userdefined2 = userdefined2;
           this.userdefined3 = userdefined3;
           this.userdefined4 = userdefined4;
           this.userdefined5 = userdefined5;
    }


    /**
     * Gets the MSISDN value for this RegisterCCRequest.
     * 
     * @return MSISDN
     */
    public java.lang.String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this RegisterCCRequest.
     * 
     * @param MSISDN
     */
    public void setMSISDN(java.lang.String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the accountID value for this RegisterCCRequest.
     * 
     * @return accountID
     */
    public java.lang.String getAccountID() {
        return accountID;
    }


    /**
     * Sets the accountID value for this RegisterCCRequest.
     * 
     * @param accountID
     */
    public void setAccountID(java.lang.String accountID) {
        this.accountID = accountID;
    }


    /**
     * Gets the DPI value for this RegisterCCRequest.
     * 
     * @return DPI
     */
    public java.lang.String getDPI() {
        return DPI;
    }


    /**
     * Sets the DPI value for this RegisterCCRequest.
     * 
     * @param DPI
     */
    public void setDPI(java.lang.String DPI) {
        this.DPI = DPI;
    }


    /**
     * Gets the SIMNO value for this RegisterCCRequest.
     * 
     * @return SIMNO
     */
    public java.lang.String getSIMNO() {
        return SIMNO;
    }


    /**
     * Sets the SIMNO value for this RegisterCCRequest.
     * 
     * @param SIMNO
     */
    public void setSIMNO(java.lang.String SIMNO) {
        this.SIMNO = SIMNO;
    }


    /**
     * Gets the IMSI value for this RegisterCCRequest.
     * 
     * @return IMSI
     */
    public java.lang.String getIMSI() {
        return IMSI;
    }


    /**
     * Sets the IMSI value for this RegisterCCRequest.
     * 
     * @param IMSI
     */
    public void setIMSI(java.lang.String IMSI) {
        this.IMSI = IMSI;
    }


    /**
     * Gets the sellerCode value for this RegisterCCRequest.
     * 
     * @return sellerCode
     */
    public java.lang.String getSellerCode() {
        return sellerCode;
    }


    /**
     * Sets the sellerCode value for this RegisterCCRequest.
     * 
     * @param sellerCode
     */
    public void setSellerCode(java.lang.String sellerCode) {
        this.sellerCode = sellerCode;
    }


    /**
     * Gets the transactionId value for this RegisterCCRequest.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this RegisterCCRequest.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the channel value for this RegisterCCRequest.
     * 
     * @return channel
     */
    public java.lang.String getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this RegisterCCRequest.
     * 
     * @param channel
     */
    public void setChannel(java.lang.String channel) {
        this.channel = channel;
    }


    /**
     * Gets the userdefined1 value for this RegisterCCRequest.
     * 
     * @return userdefined1
     */
    public java.lang.String getUserdefined1() {
        return userdefined1;
    }


    /**
     * Sets the userdefined1 value for this RegisterCCRequest.
     * 
     * @param userdefined1
     */
    public void setUserdefined1(java.lang.String userdefined1) {
        this.userdefined1 = userdefined1;
    }


    /**
     * Gets the userdefined2 value for this RegisterCCRequest.
     * 
     * @return userdefined2
     */
    public java.lang.String getUserdefined2() {
        return userdefined2;
    }


    /**
     * Sets the userdefined2 value for this RegisterCCRequest.
     * 
     * @param userdefined2
     */
    public void setUserdefined2(java.lang.String userdefined2) {
        this.userdefined2 = userdefined2;
    }


    /**
     * Gets the userdefined3 value for this RegisterCCRequest.
     * 
     * @return userdefined3
     */
    public java.lang.String getUserdefined3() {
        return userdefined3;
    }


    /**
     * Sets the userdefined3 value for this RegisterCCRequest.
     * 
     * @param userdefined3
     */
    public void setUserdefined3(java.lang.String userdefined3) {
        this.userdefined3 = userdefined3;
    }


    /**
     * Gets the userdefined4 value for this RegisterCCRequest.
     * 
     * @return userdefined4
     */
    public java.lang.String getUserdefined4() {
        return userdefined4;
    }


    /**
     * Sets the userdefined4 value for this RegisterCCRequest.
     * 
     * @param userdefined4
     */
    public void setUserdefined4(java.lang.String userdefined4) {
        this.userdefined4 = userdefined4;
    }


    /**
     * Gets the userdefined5 value for this RegisterCCRequest.
     * 
     * @return userdefined5
     */
    public java.lang.String getUserdefined5() {
        return userdefined5;
    }


    /**
     * Sets the userdefined5 value for this RegisterCCRequest.
     * 
     * @param userdefined5
     */
    public void setUserdefined5(java.lang.String userdefined5) {
        this.userdefined5 = userdefined5;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegisterCCRequest)) return false;
        RegisterCCRequest other = (RegisterCCRequest) obj;
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
            ((this.DPI==null && other.getDPI()==null) || 
             (this.DPI!=null &&
              this.DPI.equals(other.getDPI()))) &&
            ((this.SIMNO==null && other.getSIMNO()==null) || 
             (this.SIMNO!=null &&
              this.SIMNO.equals(other.getSIMNO()))) &&
            ((this.IMSI==null && other.getIMSI()==null) || 
             (this.IMSI!=null &&
              this.IMSI.equals(other.getIMSI()))) &&
            ((this.sellerCode==null && other.getSellerCode()==null) || 
             (this.sellerCode!=null &&
              this.sellerCode.equals(other.getSellerCode()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.channel==null && other.getChannel()==null) || 
             (this.channel!=null &&
              this.channel.equals(other.getChannel()))) &&
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
        if (getDPI() != null) {
            _hashCode += getDPI().hashCode();
        }
        if (getSIMNO() != null) {
            _hashCode += getSIMNO().hashCode();
        }
        if (getIMSI() != null) {
            _hashCode += getIMSI().hashCode();
        }
        if (getSellerCode() != null) {
            _hashCode += getSellerCode().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getChannel() != null) {
            _hashCode += getChannel().hashCode();
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
        new org.apache.axis.description.TypeDesc(RegisterCCRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "registerCCRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "MSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "accountID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DPI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "DPI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SIMNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "SIMNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IMSI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "IMSI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "sellerCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "transactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "channel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
