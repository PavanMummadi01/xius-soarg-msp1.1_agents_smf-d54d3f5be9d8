/**
 * TransferBalanceResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.BalanceManagement_xsd;

public class TransferBalanceResponse  implements java.io.Serializable {
    private java.lang.String sourceMSISDN;

    private java.math.BigDecimal sourceAccountBalance;

    private java.lang.String destinationMSISDN;

    public TransferBalanceResponse() {
    }

    public TransferBalanceResponse(
           java.lang.String sourceMSISDN,
           java.math.BigDecimal sourceAccountBalance,
           java.lang.String destinationMSISDN) {
           this.sourceMSISDN = sourceMSISDN;
           this.sourceAccountBalance = sourceAccountBalance;
           this.destinationMSISDN = destinationMSISDN;
    }


    /**
     * Gets the sourceMSISDN value for this TransferBalanceResponse.
     * 
     * @return sourceMSISDN
     */
    public java.lang.String getSourceMSISDN() {
        return sourceMSISDN;
    }


    /**
     * Sets the sourceMSISDN value for this TransferBalanceResponse.
     * 
     * @param sourceMSISDN
     */
    public void setSourceMSISDN(java.lang.String sourceMSISDN) {
        this.sourceMSISDN = sourceMSISDN;
    }


    /**
     * Gets the sourceAccountBalance value for this TransferBalanceResponse.
     * 
     * @return sourceAccountBalance
     */
    public java.math.BigDecimal getSourceAccountBalance() {
        return sourceAccountBalance;
    }


    /**
     * Sets the sourceAccountBalance value for this TransferBalanceResponse.
     * 
     * @param sourceAccountBalance
     */
    public void setSourceAccountBalance(java.math.BigDecimal sourceAccountBalance) {
        this.sourceAccountBalance = sourceAccountBalance;
    }


    /**
     * Gets the destinationMSISDN value for this TransferBalanceResponse.
     * 
     * @return destinationMSISDN
     */
    public java.lang.String getDestinationMSISDN() {
        return destinationMSISDN;
    }


    /**
     * Sets the destinationMSISDN value for this TransferBalanceResponse.
     * 
     * @param destinationMSISDN
     */
    public void setDestinationMSISDN(java.lang.String destinationMSISDN) {
        this.destinationMSISDN = destinationMSISDN;
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
        _equals = true && 
            ((this.sourceMSISDN==null && other.getSourceMSISDN()==null) || 
             (this.sourceMSISDN!=null &&
              this.sourceMSISDN.equals(other.getSourceMSISDN()))) &&
            ((this.sourceAccountBalance==null && other.getSourceAccountBalance()==null) || 
             (this.sourceAccountBalance!=null &&
              this.sourceAccountBalance.equals(other.getSourceAccountBalance()))) &&
            ((this.destinationMSISDN==null && other.getDestinationMSISDN()==null) || 
             (this.destinationMSISDN!=null &&
              this.destinationMSISDN.equals(other.getDestinationMSISDN())));
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
        if (getSourceMSISDN() != null) {
            _hashCode += getSourceMSISDN().hashCode();
        }
        if (getSourceAccountBalance() != null) {
            _hashCode += getSourceAccountBalance().hashCode();
        }
        if (getDestinationMSISDN() != null) {
            _hashCode += getDestinationMSISDN().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransferBalanceResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "TransferBalanceResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "sourceMSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceAccountBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "sourceAccountBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "destinationMSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
