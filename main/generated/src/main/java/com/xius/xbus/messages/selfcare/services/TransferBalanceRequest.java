/**
 * TransferBalanceRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.selfcare.services;

public class TransferBalanceRequest  extends com.xius.xbus.messages.common.WSRequest  implements java.io.Serializable {
    private java.lang.String requestId;

    private java.lang.String logInId;

    private java.lang.String transferorMSISDN;

    private java.lang.String password;

    private java.lang.String transfereeMSISDN;

    private double transferAmount;

    public TransferBalanceRequest() {
    }

    public TransferBalanceRequest(
           com.xius.xbus.messages.common.UserType userType,
           java.lang.String messageID,
           com.xius.xbus.messages.common.SecurityId securityId,
           com.xius.xbus.messages.common.ServiceContext serviceContext,
           java.lang.String version,
           java.lang.String requestId,
           java.lang.String logInId,
           java.lang.String transferorMSISDN,
           java.lang.String password,
           java.lang.String transfereeMSISDN,
           double transferAmount) {
        super(
            userType,
            messageID,
            securityId,
            serviceContext,
            version);
        this.requestId = requestId;
        this.logInId = logInId;
        this.transferorMSISDN = transferorMSISDN;
        this.password = password;
        this.transfereeMSISDN = transfereeMSISDN;
        this.transferAmount = transferAmount;
    }


    /**
     * Gets the requestId value for this TransferBalanceRequest.
     * 
     * @return requestId
     */
    public java.lang.String getRequestId() {
        return requestId;
    }


    /**
     * Sets the requestId value for this TransferBalanceRequest.
     * 
     * @param requestId
     */
    public void setRequestId(java.lang.String requestId) {
        this.requestId = requestId;
    }


    /**
     * Gets the logInId value for this TransferBalanceRequest.
     * 
     * @return logInId
     */
    public java.lang.String getLogInId() {
        return logInId;
    }


    /**
     * Sets the logInId value for this TransferBalanceRequest.
     * 
     * @param logInId
     */
    public void setLogInId(java.lang.String logInId) {
        this.logInId = logInId;
    }


    /**
     * Gets the transferorMSISDN value for this TransferBalanceRequest.
     * 
     * @return transferorMSISDN
     */
    public java.lang.String getTransferorMSISDN() {
        return transferorMSISDN;
    }


    /**
     * Sets the transferorMSISDN value for this TransferBalanceRequest.
     * 
     * @param transferorMSISDN
     */
    public void setTransferorMSISDN(java.lang.String transferorMSISDN) {
        this.transferorMSISDN = transferorMSISDN;
    }


    /**
     * Gets the password value for this TransferBalanceRequest.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this TransferBalanceRequest.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the transfereeMSISDN value for this TransferBalanceRequest.
     * 
     * @return transfereeMSISDN
     */
    public java.lang.String getTransfereeMSISDN() {
        return transfereeMSISDN;
    }


    /**
     * Sets the transfereeMSISDN value for this TransferBalanceRequest.
     * 
     * @param transfereeMSISDN
     */
    public void setTransfereeMSISDN(java.lang.String transfereeMSISDN) {
        this.transfereeMSISDN = transfereeMSISDN;
    }


    /**
     * Gets the transferAmount value for this TransferBalanceRequest.
     * 
     * @return transferAmount
     */
    public double getTransferAmount() {
        return transferAmount;
    }


    /**
     * Sets the transferAmount value for this TransferBalanceRequest.
     * 
     * @param transferAmount
     */
    public void setTransferAmount(double transferAmount) {
        this.transferAmount = transferAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransferBalanceRequest)) return false;
        TransferBalanceRequest other = (TransferBalanceRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.requestId==null && other.getRequestId()==null) || 
             (this.requestId!=null &&
              this.requestId.equals(other.getRequestId()))) &&
            ((this.logInId==null && other.getLogInId()==null) || 
             (this.logInId!=null &&
              this.logInId.equals(other.getLogInId()))) &&
            ((this.transferorMSISDN==null && other.getTransferorMSISDN()==null) || 
             (this.transferorMSISDN!=null &&
              this.transferorMSISDN.equals(other.getTransferorMSISDN()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.transfereeMSISDN==null && other.getTransfereeMSISDN()==null) || 
             (this.transfereeMSISDN!=null &&
              this.transfereeMSISDN.equals(other.getTransfereeMSISDN()))) &&
            this.transferAmount == other.getTransferAmount();
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
        if (getRequestId() != null) {
            _hashCode += getRequestId().hashCode();
        }
        if (getLogInId() != null) {
            _hashCode += getLogInId().hashCode();
        }
        if (getTransferorMSISDN() != null) {
            _hashCode += getTransferorMSISDN().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getTransfereeMSISDN() != null) {
            _hashCode += getTransfereeMSISDN().hashCode();
        }
        _hashCode += new Double(getTransferAmount()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransferBalanceRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">transferBalanceRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "requestId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logInId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "logInId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferorMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "transferorMSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transfereeMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "transfereeMSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "transferAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
