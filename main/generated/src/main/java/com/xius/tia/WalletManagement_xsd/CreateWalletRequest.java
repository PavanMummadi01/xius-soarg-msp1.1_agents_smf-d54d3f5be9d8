/**
 * CreateWalletRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.WalletManagement_xsd;

public class CreateWalletRequest  implements java.io.Serializable {
    private java.lang.String walletID;

    private java.lang.String walletamount;

    public CreateWalletRequest() {
    }

    public CreateWalletRequest(
           java.lang.String walletID,
           java.lang.String walletamount) {
           this.walletID = walletID;
           this.walletamount = walletamount;
    }


    /**
     * Gets the walletID value for this CreateWalletRequest.
     * 
     * @return walletID
     */
    public java.lang.String getWalletID() {
        return walletID;
    }


    /**
     * Sets the walletID value for this CreateWalletRequest.
     * 
     * @param walletID
     */
    public void setWalletID(java.lang.String walletID) {
        this.walletID = walletID;
    }


    /**
     * Gets the walletamount value for this CreateWalletRequest.
     * 
     * @return walletamount
     */
    public java.lang.String getWalletamount() {
        return walletamount;
    }


    /**
     * Sets the walletamount value for this CreateWalletRequest.
     * 
     * @param walletamount
     */
    public void setWalletamount(java.lang.String walletamount) {
        this.walletamount = walletamount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateWalletRequest)) return false;
        CreateWalletRequest other = (CreateWalletRequest) obj;
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
            ((this.walletamount==null && other.getWalletamount()==null) || 
             (this.walletamount!=null &&
              this.walletamount.equals(other.getWalletamount())));
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
        if (getWalletamount() != null) {
            _hashCode += getWalletamount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateWalletRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/WalletManagement.xsd", "createWalletRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("walletID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/WalletManagement.xsd", "walletID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("walletamount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/WalletManagement.xsd", "walletamount"));
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
