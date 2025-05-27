/**
 * PublicityIdHLRcodeGetResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class PublicityIdHLRcodeGetResponse  implements java.io.Serializable {
    private java.lang.String transactionId;

    private com.xius.billing.AccountManagement_xsd.HLRCodeDetailsType[] HLRCodeDetails;

    public PublicityIdHLRcodeGetResponse() {
    }

    public PublicityIdHLRcodeGetResponse(
           java.lang.String transactionId,
           com.xius.billing.AccountManagement_xsd.HLRCodeDetailsType[] HLRCodeDetails) {
           this.transactionId = transactionId;
           this.HLRCodeDetails = HLRCodeDetails;
    }


    /**
     * Gets the transactionId value for this PublicityIdHLRcodeGetResponse.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this PublicityIdHLRcodeGetResponse.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the HLRCodeDetails value for this PublicityIdHLRcodeGetResponse.
     * 
     * @return HLRCodeDetails
     */
    public com.xius.billing.AccountManagement_xsd.HLRCodeDetailsType[] getHLRCodeDetails() {
        return HLRCodeDetails;
    }


    /**
     * Sets the HLRCodeDetails value for this PublicityIdHLRcodeGetResponse.
     * 
     * @param HLRCodeDetails
     */
    public void setHLRCodeDetails(com.xius.billing.AccountManagement_xsd.HLRCodeDetailsType[] HLRCodeDetails) {
        this.HLRCodeDetails = HLRCodeDetails;
    }

    public com.xius.billing.AccountManagement_xsd.HLRCodeDetailsType getHLRCodeDetails(int i) {
        return this.HLRCodeDetails[i];
    }

    public void setHLRCodeDetails(int i, com.xius.billing.AccountManagement_xsd.HLRCodeDetailsType _value) {
        this.HLRCodeDetails[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PublicityIdHLRcodeGetResponse)) return false;
        PublicityIdHLRcodeGetResponse other = (PublicityIdHLRcodeGetResponse) obj;
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
            ((this.HLRCodeDetails==null && other.getHLRCodeDetails()==null) || 
             (this.HLRCodeDetails!=null &&
              java.util.Arrays.equals(this.HLRCodeDetails, other.getHLRCodeDetails())));
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
        if (getHLRCodeDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHLRCodeDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHLRCodeDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PublicityIdHLRcodeGetResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "publicityIdHLRcodeGetResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "TransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HLRCodeDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "HLRCodeDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "HLRCodeDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
