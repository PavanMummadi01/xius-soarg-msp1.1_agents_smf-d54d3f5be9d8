/**
 * TransferBalanceResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.selfcare.services;

public class TransferBalanceResponse  extends com.xius.xbus.messages.common.WSResponse  implements java.io.Serializable {
    private java.lang.String transferorMSISDN;

    private java.lang.Double transferorBalance;

    private java.lang.String transfereeMSISDN;

    private java.lang.Double transfereeBalance;

    private java.lang.Boolean statusFlag;

    private java.lang.String message;

    public TransferBalanceResponse() {
    }

    public TransferBalanceResponse(
           com.xius.xbus.messages.common.StatusCode statusCode,
           java.util.Calendar timeStamp,
           java.lang.String correlationID,
           com.xius.xbus.messages.common.ErrorData[] errors,
           java.lang.String version,
           java.lang.String transferorMSISDN,
           java.lang.Double transferorBalance,
           java.lang.String transfereeMSISDN,
           java.lang.Double transfereeBalance,
           java.lang.Boolean statusFlag,
           java.lang.String message) {
        super(
            statusCode,
            timeStamp,
            correlationID,
            errors,
            version);
        this.transferorMSISDN = transferorMSISDN;
        this.transferorBalance = transferorBalance;
        this.transfereeMSISDN = transfereeMSISDN;
        this.transfereeBalance = transfereeBalance;
        this.statusFlag = statusFlag;
        this.message = message;
    }


    /**
     * Gets the transferorMSISDN value for this TransferBalanceResponse.
     * 
     * @return transferorMSISDN
     */
    public java.lang.String getTransferorMSISDN() {
        return transferorMSISDN;
    }


    /**
     * Sets the transferorMSISDN value for this TransferBalanceResponse.
     * 
     * @param transferorMSISDN
     */
    public void setTransferorMSISDN(java.lang.String transferorMSISDN) {
        this.transferorMSISDN = transferorMSISDN;
    }


    /**
     * Gets the transferorBalance value for this TransferBalanceResponse.
     * 
     * @return transferorBalance
     */
    public java.lang.Double getTransferorBalance() {
        return transferorBalance;
    }


    /**
     * Sets the transferorBalance value for this TransferBalanceResponse.
     * 
     * @param transferorBalance
     */
    public void setTransferorBalance(java.lang.Double transferorBalance) {
        this.transferorBalance = transferorBalance;
    }


    /**
     * Gets the transfereeMSISDN value for this TransferBalanceResponse.
     * 
     * @return transfereeMSISDN
     */
    public java.lang.String getTransfereeMSISDN() {
        return transfereeMSISDN;
    }


    /**
     * Sets the transfereeMSISDN value for this TransferBalanceResponse.
     * 
     * @param transfereeMSISDN
     */
    public void setTransfereeMSISDN(java.lang.String transfereeMSISDN) {
        this.transfereeMSISDN = transfereeMSISDN;
    }


    /**
     * Gets the transfereeBalance value for this TransferBalanceResponse.
     * 
     * @return transfereeBalance
     */
    public java.lang.Double getTransfereeBalance() {
        return transfereeBalance;
    }


    /**
     * Sets the transfereeBalance value for this TransferBalanceResponse.
     * 
     * @param transfereeBalance
     */
    public void setTransfereeBalance(java.lang.Double transfereeBalance) {
        this.transfereeBalance = transfereeBalance;
    }


    /**
     * Gets the statusFlag value for this TransferBalanceResponse.
     * 
     * @return statusFlag
     */
    public java.lang.Boolean getStatusFlag() {
        return statusFlag;
    }


    /**
     * Sets the statusFlag value for this TransferBalanceResponse.
     * 
     * @param statusFlag
     */
    public void setStatusFlag(java.lang.Boolean statusFlag) {
        this.statusFlag = statusFlag;
    }


    /**
     * Gets the message value for this TransferBalanceResponse.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this TransferBalanceResponse.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransferBalanceResponse)) return false;
        TransferBalanceResponse other = (TransferBalanceResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.transferorMSISDN==null && other.getTransferorMSISDN()==null) || 
             (this.transferorMSISDN!=null &&
              this.transferorMSISDN.equals(other.getTransferorMSISDN()))) &&
            ((this.transferorBalance==null && other.getTransferorBalance()==null) || 
             (this.transferorBalance!=null &&
              this.transferorBalance.equals(other.getTransferorBalance()))) &&
            ((this.transfereeMSISDN==null && other.getTransfereeMSISDN()==null) || 
             (this.transfereeMSISDN!=null &&
              this.transfereeMSISDN.equals(other.getTransfereeMSISDN()))) &&
            ((this.transfereeBalance==null && other.getTransfereeBalance()==null) || 
             (this.transfereeBalance!=null &&
              this.transfereeBalance.equals(other.getTransfereeBalance()))) &&
            ((this.statusFlag==null && other.getStatusFlag()==null) || 
             (this.statusFlag!=null &&
              this.statusFlag.equals(other.getStatusFlag()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage())));
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
        if (getTransferorMSISDN() != null) {
            _hashCode += getTransferorMSISDN().hashCode();
        }
        if (getTransferorBalance() != null) {
            _hashCode += getTransferorBalance().hashCode();
        }
        if (getTransfereeMSISDN() != null) {
            _hashCode += getTransfereeMSISDN().hashCode();
        }
        if (getTransfereeBalance() != null) {
            _hashCode += getTransfereeBalance().hashCode();
        }
        if (getStatusFlag() != null) {
            _hashCode += getStatusFlag().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransferBalanceResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">transferBalanceResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferorMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "transferorMSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferorBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "transferorBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transfereeMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "transfereeMSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transfereeBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "transfereeBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "statusFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "message"));
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
