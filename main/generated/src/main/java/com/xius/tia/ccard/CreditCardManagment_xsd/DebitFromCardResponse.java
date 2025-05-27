/**
 * DebitFromCardResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.ccard.CreditCardManagment_xsd;

public class DebitFromCardResponse  implements java.io.Serializable {
    private java.lang.String transactionId;

    private java.lang.String responsecode;

    private java.lang.String respdescription;

    public DebitFromCardResponse() {
    }

    public DebitFromCardResponse(
           java.lang.String transactionId,
           java.lang.String responsecode,
           java.lang.String respdescription) {
           this.transactionId = transactionId;
           this.responsecode = responsecode;
           this.respdescription = respdescription;
    }


    /**
     * Gets the transactionId value for this DebitFromCardResponse.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this DebitFromCardResponse.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the responsecode value for this DebitFromCardResponse.
     * 
     * @return responsecode
     */
    public java.lang.String getResponsecode() {
        return responsecode;
    }


    /**
     * Sets the responsecode value for this DebitFromCardResponse.
     * 
     * @param responsecode
     */
    public void setResponsecode(java.lang.String responsecode) {
        this.responsecode = responsecode;
    }


    /**
     * Gets the respdescription value for this DebitFromCardResponse.
     * 
     * @return respdescription
     */
    public java.lang.String getRespdescription() {
        return respdescription;
    }


    /**
     * Sets the respdescription value for this DebitFromCardResponse.
     * 
     * @param respdescription
     */
    public void setRespdescription(java.lang.String respdescription) {
        this.respdescription = respdescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DebitFromCardResponse)) return false;
        DebitFromCardResponse other = (DebitFromCardResponse) obj;
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
            ((this.responsecode==null && other.getResponsecode()==null) || 
             (this.responsecode!=null &&
              this.responsecode.equals(other.getResponsecode()))) &&
            ((this.respdescription==null && other.getRespdescription()==null) || 
             (this.respdescription!=null &&
              this.respdescription.equals(other.getRespdescription())));
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
        if (getResponsecode() != null) {
            _hashCode += getResponsecode().hashCode();
        }
        if (getRespdescription() != null) {
            _hashCode += getRespdescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DebitFromCardResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "debitFromCardResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "transactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responsecode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "responsecode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("respdescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "respdescription"));
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
