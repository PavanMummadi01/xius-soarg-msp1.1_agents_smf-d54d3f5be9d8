/**
 * RequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.SorianacardIntegration_xsd;

public class RequestType  implements java.io.Serializable {
    private java.lang.String transactionId;

    private java.lang.Integer customerid;

    private java.lang.String MSISDN;

    private boolean isPrimary;

    private java.math.BigDecimal cardnumber;

    private com.xius.tia.SorianacardIntegration_xsd.UserDefinedType userdefinedtype;

    public RequestType() {
    }

    public RequestType(
           java.lang.String transactionId,
           java.lang.Integer customerid,
           java.lang.String MSISDN,
           boolean isPrimary,
           java.math.BigDecimal cardnumber,
           com.xius.tia.SorianacardIntegration_xsd.UserDefinedType userdefinedtype) {
           this.transactionId = transactionId;
           this.customerid = customerid;
           this.MSISDN = MSISDN;
           this.isPrimary = isPrimary;
           this.cardnumber = cardnumber;
           this.userdefinedtype = userdefinedtype;
    }


    /**
     * Gets the transactionId value for this RequestType.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this RequestType.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the customerid value for this RequestType.
     * 
     * @return customerid
     */
    public java.lang.Integer getCustomerid() {
        return customerid;
    }


    /**
     * Sets the customerid value for this RequestType.
     * 
     * @param customerid
     */
    public void setCustomerid(java.lang.Integer customerid) {
        this.customerid = customerid;
    }


    /**
     * Gets the MSISDN value for this RequestType.
     * 
     * @return MSISDN
     */
    public java.lang.String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this RequestType.
     * 
     * @param MSISDN
     */
    public void setMSISDN(java.lang.String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the isPrimary value for this RequestType.
     * 
     * @return isPrimary
     */
    public boolean isIsPrimary() {
        return isPrimary;
    }


    /**
     * Sets the isPrimary value for this RequestType.
     * 
     * @param isPrimary
     */
    public void setIsPrimary(boolean isPrimary) {
        this.isPrimary = isPrimary;
    }


    /**
     * Gets the cardnumber value for this RequestType.
     * 
     * @return cardnumber
     */
    public java.math.BigDecimal getCardnumber() {
        return cardnumber;
    }


    /**
     * Sets the cardnumber value for this RequestType.
     * 
     * @param cardnumber
     */
    public void setCardnumber(java.math.BigDecimal cardnumber) {
        this.cardnumber = cardnumber;
    }


    /**
     * Gets the userdefinedtype value for this RequestType.
     * 
     * @return userdefinedtype
     */
    public com.xius.tia.SorianacardIntegration_xsd.UserDefinedType getUserdefinedtype() {
        return userdefinedtype;
    }


    /**
     * Sets the userdefinedtype value for this RequestType.
     * 
     * @param userdefinedtype
     */
    public void setUserdefinedtype(com.xius.tia.SorianacardIntegration_xsd.UserDefinedType userdefinedtype) {
        this.userdefinedtype = userdefinedtype;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestType)) return false;
        RequestType other = (RequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.customerid==null && other.getCustomerid()==null) || 
             (this.customerid!=null &&
              this.customerid.equals(other.getCustomerid()))) &&
            ((this.MSISDN==null && other.getMSISDN()==null) || 
             (this.MSISDN!=null &&
              this.MSISDN.equals(other.getMSISDN()))) &&
            this.isPrimary == other.isIsPrimary() &&
            ((this.cardnumber==null && other.getCardnumber()==null) || 
             (this.cardnumber!=null &&
              this.cardnumber.equals(other.getCardnumber()))) &&
            ((this.userdefinedtype==null && other.getUserdefinedtype()==null) || 
             (this.userdefinedtype!=null &&
              this.userdefinedtype.equals(other.getUserdefinedtype())));
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
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getCustomerid() != null) {
            _hashCode += getCustomerid().hashCode();
        }
        if (getMSISDN() != null) {
            _hashCode += getMSISDN().hashCode();
        }
        _hashCode += (isIsPrimary() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCardnumber() != null) {
            _hashCode += getCardnumber().hashCode();
        }
        if (getUserdefinedtype() != null) {
            _hashCode += getUserdefinedtype().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/SorianacardIntegration.xsd", "RequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/SorianacardIntegration.xsd", "TransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/SorianacardIntegration.xsd", "Customerid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/SorianacardIntegration.xsd", "MSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPrimary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/SorianacardIntegration.xsd", "IsPrimary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardnumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/SorianacardIntegration.xsd", "Cardnumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userdefinedtype");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/SorianacardIntegration.xsd", "userdefinedtype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/SorianacardIntegration.xsd", "UserDefinedType"));
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
