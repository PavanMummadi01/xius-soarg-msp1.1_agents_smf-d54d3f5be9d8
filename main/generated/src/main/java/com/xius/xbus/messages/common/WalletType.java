/**
 * WalletType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.common;

public class WalletType  implements java.io.Serializable {
    private java.lang.String walletId;

    private java.lang.String walletName;

    private java.lang.String walletAmount;

    private java.lang.String walletValidity;

    public WalletType() {
    }

    public WalletType(
           java.lang.String walletId,
           java.lang.String walletName,
           java.lang.String walletAmount,
           java.lang.String walletValidity) {
           this.walletId = walletId;
           this.walletName = walletName;
           this.walletAmount = walletAmount;
           this.walletValidity = walletValidity;
    }


    /**
     * Gets the walletId value for this WalletType.
     * 
     * @return walletId
     */
    public java.lang.String getWalletId() {
        return walletId;
    }


    /**
     * Sets the walletId value for this WalletType.
     * 
     * @param walletId
     */
    public void setWalletId(java.lang.String walletId) {
        this.walletId = walletId;
    }


    /**
     * Gets the walletName value for this WalletType.
     * 
     * @return walletName
     */
    public java.lang.String getWalletName() {
        return walletName;
    }


    /**
     * Sets the walletName value for this WalletType.
     * 
     * @param walletName
     */
    public void setWalletName(java.lang.String walletName) {
        this.walletName = walletName;
    }


    /**
     * Gets the walletAmount value for this WalletType.
     * 
     * @return walletAmount
     */
    public java.lang.String getWalletAmount() {
        return walletAmount;
    }


    /**
     * Sets the walletAmount value for this WalletType.
     * 
     * @param walletAmount
     */
    public void setWalletAmount(java.lang.String walletAmount) {
        this.walletAmount = walletAmount;
    }


    /**
     * Gets the walletValidity value for this WalletType.
     * 
     * @return walletValidity
     */
    public java.lang.String getWalletValidity() {
        return walletValidity;
    }


    /**
     * Sets the walletValidity value for this WalletType.
     * 
     * @param walletValidity
     */
    public void setWalletValidity(java.lang.String walletValidity) {
        this.walletValidity = walletValidity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WalletType)) return false;
        WalletType other = (WalletType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.walletId==null && other.getWalletId()==null) || 
             (this.walletId!=null &&
              this.walletId.equals(other.getWalletId()))) &&
            ((this.walletName==null && other.getWalletName()==null) || 
             (this.walletName!=null &&
              this.walletName.equals(other.getWalletName()))) &&
            ((this.walletAmount==null && other.getWalletAmount()==null) || 
             (this.walletAmount!=null &&
              this.walletAmount.equals(other.getWalletAmount()))) &&
            ((this.walletValidity==null && other.getWalletValidity()==null) || 
             (this.walletValidity!=null &&
              this.walletValidity.equals(other.getWalletValidity())));
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
        if (getWalletId() != null) {
            _hashCode += getWalletId().hashCode();
        }
        if (getWalletName() != null) {
            _hashCode += getWalletName().hashCode();
        }
        if (getWalletAmount() != null) {
            _hashCode += getWalletAmount().hashCode();
        }
        if (getWalletValidity() != null) {
            _hashCode += getWalletValidity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WalletType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "walletType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("walletId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "walletId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("walletName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "walletName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("walletAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "walletAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("walletValidity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "walletValidity"));
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
