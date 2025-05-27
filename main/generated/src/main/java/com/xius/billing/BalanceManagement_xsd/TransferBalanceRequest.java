/**
 * TransferBalanceRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.BalanceManagement_xsd;

public class TransferBalanceRequest  implements java.io.Serializable {
    private java.lang.String MSISDN;

    private java.lang.String destinationMSISDN;

    private java.math.BigDecimal transferAmount;

    public TransferBalanceRequest() {
    }

    public TransferBalanceRequest(
           java.lang.String MSISDN,
           java.lang.String destinationMSISDN,
           java.math.BigDecimal transferAmount) {
           this.MSISDN = MSISDN;
           this.destinationMSISDN = destinationMSISDN;
           this.transferAmount = transferAmount;
    }


    /**
     * Gets the MSISDN value for this TransferBalanceRequest.
     * 
     * @return MSISDN
     */
    public java.lang.String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this TransferBalanceRequest.
     * 
     * @param MSISDN
     */
    public void setMSISDN(java.lang.String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the destinationMSISDN value for this TransferBalanceRequest.
     * 
     * @return destinationMSISDN
     */
    public java.lang.String getDestinationMSISDN() {
        return destinationMSISDN;
    }


    /**
     * Sets the destinationMSISDN value for this TransferBalanceRequest.
     * 
     * @param destinationMSISDN
     */
    public void setDestinationMSISDN(java.lang.String destinationMSISDN) {
        this.destinationMSISDN = destinationMSISDN;
    }


    /**
     * Gets the transferAmount value for this TransferBalanceRequest.
     * 
     * @return transferAmount
     */
    public java.math.BigDecimal getTransferAmount() {
        return transferAmount;
    }


    /**
     * Sets the transferAmount value for this TransferBalanceRequest.
     * 
     * @param transferAmount
     */
    public void setTransferAmount(java.math.BigDecimal transferAmount) {
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
        _equals = true && 
            ((this.MSISDN==null && other.getMSISDN()==null) || 
             (this.MSISDN!=null &&
              this.MSISDN.equals(other.getMSISDN()))) &&
            ((this.destinationMSISDN==null && other.getDestinationMSISDN()==null) || 
             (this.destinationMSISDN!=null &&
              this.destinationMSISDN.equals(other.getDestinationMSISDN()))) &&
            ((this.transferAmount==null && other.getTransferAmount()==null) || 
             (this.transferAmount!=null &&
              this.transferAmount.equals(other.getTransferAmount())));
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
        if (getDestinationMSISDN() != null) {
            _hashCode += getDestinationMSISDN().hashCode();
        }
        if (getTransferAmount() != null) {
            _hashCode += getTransferAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransferBalanceRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "TransferBalanceRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "MSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "destinationMSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "transferAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
