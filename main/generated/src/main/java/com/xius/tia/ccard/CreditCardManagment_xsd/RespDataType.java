/**
 * RespDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.ccard.CreditCardManagment_xsd;

public class RespDataType  implements java.io.Serializable {
    private java.lang.String statusCode;

    private java.lang.String status;

    private java.lang.String statusMsg;

    private java.lang.String amount;

    private java.lang.String walletAccNo;

    public RespDataType() {
    }

    public RespDataType(
           java.lang.String statusCode,
           java.lang.String status,
           java.lang.String statusMsg,
           java.lang.String amount,
           java.lang.String walletAccNo) {
           this.statusCode = statusCode;
           this.status = status;
           this.statusMsg = statusMsg;
           this.amount = amount;
           this.walletAccNo = walletAccNo;
    }


    /**
     * Gets the statusCode value for this RespDataType.
     * 
     * @return statusCode
     */
    public java.lang.String getStatusCode() {
        return statusCode;
    }


    /**
     * Sets the statusCode value for this RespDataType.
     * 
     * @param statusCode
     */
    public void setStatusCode(java.lang.String statusCode) {
        this.statusCode = statusCode;
    }


    /**
     * Gets the status value for this RespDataType.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this RespDataType.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the statusMsg value for this RespDataType.
     * 
     * @return statusMsg
     */
    public java.lang.String getStatusMsg() {
        return statusMsg;
    }


    /**
     * Sets the statusMsg value for this RespDataType.
     * 
     * @param statusMsg
     */
    public void setStatusMsg(java.lang.String statusMsg) {
        this.statusMsg = statusMsg;
    }


    /**
     * Gets the amount value for this RespDataType.
     * 
     * @return amount
     */
    public java.lang.String getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this RespDataType.
     * 
     * @param amount
     */
    public void setAmount(java.lang.String amount) {
        this.amount = amount;
    }


    /**
     * Gets the walletAccNo value for this RespDataType.
     * 
     * @return walletAccNo
     */
    public java.lang.String getWalletAccNo() {
        return walletAccNo;
    }


    /**
     * Sets the walletAccNo value for this RespDataType.
     * 
     * @param walletAccNo
     */
    public void setWalletAccNo(java.lang.String walletAccNo) {
        this.walletAccNo = walletAccNo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RespDataType)) return false;
        RespDataType other = (RespDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.statusCode==null && other.getStatusCode()==null) || 
             (this.statusCode!=null &&
              this.statusCode.equals(other.getStatusCode()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.statusMsg==null && other.getStatusMsg()==null) || 
             (this.statusMsg!=null &&
              this.statusMsg.equals(other.getStatusMsg()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.walletAccNo==null && other.getWalletAccNo()==null) || 
             (this.walletAccNo!=null &&
              this.walletAccNo.equals(other.getWalletAccNo())));
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
        if (getStatusCode() != null) {
            _hashCode += getStatusCode().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getStatusMsg() != null) {
            _hashCode += getStatusMsg().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getWalletAccNo() != null) {
            _hashCode += getWalletAccNo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RespDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "RespDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "statusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusMsg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "statusMsg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("walletAccNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "walletAccNo"));
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
