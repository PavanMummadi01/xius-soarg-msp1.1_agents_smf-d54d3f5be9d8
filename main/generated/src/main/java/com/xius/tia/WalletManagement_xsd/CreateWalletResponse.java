/**
 * CreateWalletResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.WalletManagement_xsd;

public class CreateWalletResponse  implements java.io.Serializable {
    private com.xius.tia.WalletManagement_xsd.ResponseDataType responseData;

    private java.lang.String transID;

    public CreateWalletResponse() {
    }

    public CreateWalletResponse(
           com.xius.tia.WalletManagement_xsd.ResponseDataType responseData,
           java.lang.String transID) {
           this.responseData = responseData;
           this.transID = transID;
    }


    /**
     * Gets the responseData value for this CreateWalletResponse.
     * 
     * @return responseData
     */
    public com.xius.tia.WalletManagement_xsd.ResponseDataType getResponseData() {
        return responseData;
    }


    /**
     * Sets the responseData value for this CreateWalletResponse.
     * 
     * @param responseData
     */
    public void setResponseData(com.xius.tia.WalletManagement_xsd.ResponseDataType responseData) {
        this.responseData = responseData;
    }


    /**
     * Gets the transID value for this CreateWalletResponse.
     * 
     * @return transID
     */
    public java.lang.String getTransID() {
        return transID;
    }


    /**
     * Sets the transID value for this CreateWalletResponse.
     * 
     * @param transID
     */
    public void setTransID(java.lang.String transID) {
        this.transID = transID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateWalletResponse)) return false;
        CreateWalletResponse other = (CreateWalletResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.responseData==null && other.getResponseData()==null) || 
             (this.responseData!=null &&
              this.responseData.equals(other.getResponseData()))) &&
            ((this.transID==null && other.getTransID()==null) || 
             (this.transID!=null &&
              this.transID.equals(other.getTransID())));
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
        if (getResponseData() != null) {
            _hashCode += getResponseData().hashCode();
        }
        if (getTransID() != null) {
            _hashCode += getTransID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateWalletResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/WalletManagement.xsd", "createWalletResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/WalletManagement.xsd", "responseData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/WalletManagement.xsd", "ResponseDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/WalletManagement.xsd", "transID"));
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
