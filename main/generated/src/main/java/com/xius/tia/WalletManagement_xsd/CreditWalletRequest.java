/**
 * CreditWalletRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.WalletManagement_xsd;

public class CreditWalletRequest  implements java.io.Serializable {
    private java.lang.String walletID;

    private java.lang.String transAmount;

    private java.lang.String tansID;

    public CreditWalletRequest() {
    }

    public CreditWalletRequest(
           java.lang.String walletID,
           java.lang.String transAmount,
           java.lang.String tansID) {
           this.walletID = walletID;
           this.transAmount = transAmount;
           this.tansID = tansID;
    }


    /**
     * Gets the walletID value for this CreditWalletRequest.
     * 
     * @return walletID
     */
    public java.lang.String getWalletID() {
        return walletID;
    }


    /**
     * Sets the walletID value for this CreditWalletRequest.
     * 
     * @param walletID
     */
    public void setWalletID(java.lang.String walletID) {
        this.walletID = walletID;
    }


    /**
     * Gets the transAmount value for this CreditWalletRequest.
     * 
     * @return transAmount
     */
    public java.lang.String getTransAmount() {
        return transAmount;
    }


    /**
     * Sets the transAmount value for this CreditWalletRequest.
     * 
     * @param transAmount
     */
    public void setTransAmount(java.lang.String transAmount) {
        this.transAmount = transAmount;
    }


    /**
     * Gets the tansID value for this CreditWalletRequest.
     * 
     * @return tansID
     */
    public java.lang.String getTansID() {
        return tansID;
    }


    /**
     * Sets the tansID value for this CreditWalletRequest.
     * 
     * @param tansID
     */
    public void setTansID(java.lang.String tansID) {
        this.tansID = tansID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditWalletRequest)) return false;
        CreditWalletRequest other = (CreditWalletRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.walletID==null && other.getWalletID()==null) || 
             (this.walletID!=null &&
              this.walletID.equals(other.getWalletID()))) &&
            ((this.transAmount==null && other.getTransAmount()==null) || 
             (this.transAmount!=null &&
              this.transAmount.equals(other.getTransAmount()))) &&
            ((this.tansID==null && other.getTansID()==null) || 
             (this.tansID!=null &&
              this.tansID.equals(other.getTansID())));
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
        if (getWalletID() != null) {
            _hashCode += getWalletID().hashCode();
        }
        if (getTransAmount() != null) {
            _hashCode += getTransAmount().hashCode();
        }
        if (getTansID() != null) {
            _hashCode += getTansID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreditWalletRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/WalletManagement.xsd", "creditWalletRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("walletID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/WalletManagement.xsd", "walletID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/WalletManagement.xsd", "transAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tansID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/WalletManagement.xsd", "tansID"));
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
