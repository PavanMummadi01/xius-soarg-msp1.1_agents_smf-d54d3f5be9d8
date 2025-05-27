/**
 * YFCreateInvoiceRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.TIAManagement_xsd;

public class YFCreateInvoiceRequest  implements java.io.Serializable {
    private java.lang.String NIT;

    private java.lang.String name;

    private java.lang.String lastName;

    private java.lang.String publicityID;

    private java.lang.String description;

    private java.math.BigDecimal amount;

    private java.lang.String MSISDN;

    private java.lang.String accountID;

    private java.lang.String transactionID;

    private java.lang.String ICCID;

    private java.lang.String authorizationID;

    private java.lang.String channel;

    private java.lang.String sellerCode;

    private java.lang.String userdefinedtype1;

    private java.lang.String userdefinedtype2;

    private java.lang.String userdefinedtype3;

    public YFCreateInvoiceRequest() {
    }

    public YFCreateInvoiceRequest(
           java.lang.String NIT,
           java.lang.String name,
           java.lang.String lastName,
           java.lang.String publicityID,
           java.lang.String description,
           java.math.BigDecimal amount,
           java.lang.String MSISDN,
           java.lang.String accountID,
           java.lang.String transactionID,
           java.lang.String ICCID,
           java.lang.String authorizationID,
           java.lang.String channel,
           java.lang.String sellerCode,
           java.lang.String userdefinedtype1,
           java.lang.String userdefinedtype2,
           java.lang.String userdefinedtype3) {
           this.NIT = NIT;
           this.name = name;
           this.lastName = lastName;
           this.publicityID = publicityID;
           this.description = description;
           this.amount = amount;
           this.MSISDN = MSISDN;
           this.accountID = accountID;
           this.transactionID = transactionID;
           this.ICCID = ICCID;
           this.authorizationID = authorizationID;
           this.channel = channel;
           this.sellerCode = sellerCode;
           this.userdefinedtype1 = userdefinedtype1;
           this.userdefinedtype2 = userdefinedtype2;
           this.userdefinedtype3 = userdefinedtype3;
    }


    /**
     * Gets the NIT value for this YFCreateInvoiceRequest.
     * 
     * @return NIT
     */
    public java.lang.String getNIT() {
        return NIT;
    }


    /**
     * Sets the NIT value for this YFCreateInvoiceRequest.
     * 
     * @param NIT
     */
    public void setNIT(java.lang.String NIT) {
        this.NIT = NIT;
    }


    /**
     * Gets the name value for this YFCreateInvoiceRequest.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this YFCreateInvoiceRequest.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the lastName value for this YFCreateInvoiceRequest.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this YFCreateInvoiceRequest.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the publicityID value for this YFCreateInvoiceRequest.
     * 
     * @return publicityID
     */
    public java.lang.String getPublicityID() {
        return publicityID;
    }


    /**
     * Sets the publicityID value for this YFCreateInvoiceRequest.
     * 
     * @param publicityID
     */
    public void setPublicityID(java.lang.String publicityID) {
        this.publicityID = publicityID;
    }


    /**
     * Gets the description value for this YFCreateInvoiceRequest.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this YFCreateInvoiceRequest.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the amount value for this YFCreateInvoiceRequest.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this YFCreateInvoiceRequest.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the MSISDN value for this YFCreateInvoiceRequest.
     * 
     * @return MSISDN
     */
    public java.lang.String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this YFCreateInvoiceRequest.
     * 
     * @param MSISDN
     */
    public void setMSISDN(java.lang.String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the accountID value for this YFCreateInvoiceRequest.
     * 
     * @return accountID
     */
    public java.lang.String getAccountID() {
        return accountID;
    }


    /**
     * Sets the accountID value for this YFCreateInvoiceRequest.
     * 
     * @param accountID
     */
    public void setAccountID(java.lang.String accountID) {
        this.accountID = accountID;
    }


    /**
     * Gets the transactionID value for this YFCreateInvoiceRequest.
     * 
     * @return transactionID
     */
    public java.lang.String getTransactionID() {
        return transactionID;
    }


    /**
     * Sets the transactionID value for this YFCreateInvoiceRequest.
     * 
     * @param transactionID
     */
    public void setTransactionID(java.lang.String transactionID) {
        this.transactionID = transactionID;
    }


    /**
     * Gets the ICCID value for this YFCreateInvoiceRequest.
     * 
     * @return ICCID
     */
    public java.lang.String getICCID() {
        return ICCID;
    }


    /**
     * Sets the ICCID value for this YFCreateInvoiceRequest.
     * 
     * @param ICCID
     */
    public void setICCID(java.lang.String ICCID) {
        this.ICCID = ICCID;
    }


    /**
     * Gets the authorizationID value for this YFCreateInvoiceRequest.
     * 
     * @return authorizationID
     */
    public java.lang.String getAuthorizationID() {
        return authorizationID;
    }


    /**
     * Sets the authorizationID value for this YFCreateInvoiceRequest.
     * 
     * @param authorizationID
     */
    public void setAuthorizationID(java.lang.String authorizationID) {
        this.authorizationID = authorizationID;
    }


    /**
     * Gets the channel value for this YFCreateInvoiceRequest.
     * 
     * @return channel
     */
    public java.lang.String getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this YFCreateInvoiceRequest.
     * 
     * @param channel
     */
    public void setChannel(java.lang.String channel) {
        this.channel = channel;
    }


    /**
     * Gets the sellerCode value for this YFCreateInvoiceRequest.
     * 
     * @return sellerCode
     */
    public java.lang.String getSellerCode() {
        return sellerCode;
    }


    /**
     * Sets the sellerCode value for this YFCreateInvoiceRequest.
     * 
     * @param sellerCode
     */
    public void setSellerCode(java.lang.String sellerCode) {
        this.sellerCode = sellerCode;
    }


    /**
     * Gets the userdefinedtype1 value for this YFCreateInvoiceRequest.
     * 
     * @return userdefinedtype1
     */
    public java.lang.String getUserdefinedtype1() {
        return userdefinedtype1;
    }


    /**
     * Sets the userdefinedtype1 value for this YFCreateInvoiceRequest.
     * 
     * @param userdefinedtype1
     */
    public void setUserdefinedtype1(java.lang.String userdefinedtype1) {
        this.userdefinedtype1 = userdefinedtype1;
    }


    /**
     * Gets the userdefinedtype2 value for this YFCreateInvoiceRequest.
     * 
     * @return userdefinedtype2
     */
    public java.lang.String getUserdefinedtype2() {
        return userdefinedtype2;
    }


    /**
     * Sets the userdefinedtype2 value for this YFCreateInvoiceRequest.
     * 
     * @param userdefinedtype2
     */
    public void setUserdefinedtype2(java.lang.String userdefinedtype2) {
        this.userdefinedtype2 = userdefinedtype2;
    }


    /**
     * Gets the userdefinedtype3 value for this YFCreateInvoiceRequest.
     * 
     * @return userdefinedtype3
     */
    public java.lang.String getUserdefinedtype3() {
        return userdefinedtype3;
    }


    /**
     * Sets the userdefinedtype3 value for this YFCreateInvoiceRequest.
     * 
     * @param userdefinedtype3
     */
    public void setUserdefinedtype3(java.lang.String userdefinedtype3) {
        this.userdefinedtype3 = userdefinedtype3;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof YFCreateInvoiceRequest)) return false;
        YFCreateInvoiceRequest other = (YFCreateInvoiceRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.NIT==null && other.getNIT()==null) || 
             (this.NIT!=null &&
              this.NIT.equals(other.getNIT()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.publicityID==null && other.getPublicityID()==null) || 
             (this.publicityID!=null &&
              this.publicityID.equals(other.getPublicityID()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.MSISDN==null && other.getMSISDN()==null) || 
             (this.MSISDN!=null &&
              this.MSISDN.equals(other.getMSISDN()))) &&
            ((this.accountID==null && other.getAccountID()==null) || 
             (this.accountID!=null &&
              this.accountID.equals(other.getAccountID()))) &&
            ((this.transactionID==null && other.getTransactionID()==null) || 
             (this.transactionID!=null &&
              this.transactionID.equals(other.getTransactionID()))) &&
            ((this.ICCID==null && other.getICCID()==null) || 
             (this.ICCID!=null &&
              this.ICCID.equals(other.getICCID()))) &&
            ((this.authorizationID==null && other.getAuthorizationID()==null) || 
             (this.authorizationID!=null &&
              this.authorizationID.equals(other.getAuthorizationID()))) &&
            ((this.channel==null && other.getChannel()==null) || 
             (this.channel!=null &&
              this.channel.equals(other.getChannel()))) &&
            ((this.sellerCode==null && other.getSellerCode()==null) || 
             (this.sellerCode!=null &&
              this.sellerCode.equals(other.getSellerCode()))) &&
            ((this.userdefinedtype1==null && other.getUserdefinedtype1()==null) || 
             (this.userdefinedtype1!=null &&
              this.userdefinedtype1.equals(other.getUserdefinedtype1()))) &&
            ((this.userdefinedtype2==null && other.getUserdefinedtype2()==null) || 
             (this.userdefinedtype2!=null &&
              this.userdefinedtype2.equals(other.getUserdefinedtype2()))) &&
            ((this.userdefinedtype3==null && other.getUserdefinedtype3()==null) || 
             (this.userdefinedtype3!=null &&
              this.userdefinedtype3.equals(other.getUserdefinedtype3())));
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
        if (getNIT() != null) {
            _hashCode += getNIT().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getPublicityID() != null) {
            _hashCode += getPublicityID().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getMSISDN() != null) {
            _hashCode += getMSISDN().hashCode();
        }
        if (getAccountID() != null) {
            _hashCode += getAccountID().hashCode();
        }
        if (getTransactionID() != null) {
            _hashCode += getTransactionID().hashCode();
        }
        if (getICCID() != null) {
            _hashCode += getICCID().hashCode();
        }
        if (getAuthorizationID() != null) {
            _hashCode += getAuthorizationID().hashCode();
        }
        if (getChannel() != null) {
            _hashCode += getChannel().hashCode();
        }
        if (getSellerCode() != null) {
            _hashCode += getSellerCode().hashCode();
        }
        if (getUserdefinedtype1() != null) {
            _hashCode += getUserdefinedtype1().hashCode();
        }
        if (getUserdefinedtype2() != null) {
            _hashCode += getUserdefinedtype2().hashCode();
        }
        if (getUserdefinedtype3() != null) {
            _hashCode += getUserdefinedtype3().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(YFCreateInvoiceRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "YFCreateInvoiceRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NIT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "NIT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "LastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicityID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "PublicityID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "MSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "AccountID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "TransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ICCID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "ICCID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizationID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "authorizationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "channel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "sellerCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userdefinedtype1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "userdefinedtype1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userdefinedtype2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "userdefinedtype2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userdefinedtype3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "userdefinedtype3"));
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
