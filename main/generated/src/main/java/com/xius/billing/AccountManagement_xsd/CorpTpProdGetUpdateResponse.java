/**
 * CorpTpProdGetUpdateResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class CorpTpProdGetUpdateResponse  implements java.io.Serializable {
    private java.lang.String transactionId;

    private java.lang.String oldProdId;

    private java.lang.String newProdId;

    public CorpTpProdGetUpdateResponse() {
    }

    public CorpTpProdGetUpdateResponse(
           java.lang.String transactionId,
           java.lang.String oldProdId,
           java.lang.String newProdId) {
           this.transactionId = transactionId;
           this.oldProdId = oldProdId;
           this.newProdId = newProdId;
    }


    /**
     * Gets the transactionId value for this CorpTpProdGetUpdateResponse.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this CorpTpProdGetUpdateResponse.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the oldProdId value for this CorpTpProdGetUpdateResponse.
     * 
     * @return oldProdId
     */
    public java.lang.String getOldProdId() {
        return oldProdId;
    }


    /**
     * Sets the oldProdId value for this CorpTpProdGetUpdateResponse.
     * 
     * @param oldProdId
     */
    public void setOldProdId(java.lang.String oldProdId) {
        this.oldProdId = oldProdId;
    }


    /**
     * Gets the newProdId value for this CorpTpProdGetUpdateResponse.
     * 
     * @return newProdId
     */
    public java.lang.String getNewProdId() {
        return newProdId;
    }


    /**
     * Sets the newProdId value for this CorpTpProdGetUpdateResponse.
     * 
     * @param newProdId
     */
    public void setNewProdId(java.lang.String newProdId) {
        this.newProdId = newProdId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CorpTpProdGetUpdateResponse)) return false;
        CorpTpProdGetUpdateResponse other = (CorpTpProdGetUpdateResponse) obj;
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
            ((this.oldProdId==null && other.getOldProdId()==null) || 
             (this.oldProdId!=null &&
              this.oldProdId.equals(other.getOldProdId()))) &&
            ((this.newProdId==null && other.getNewProdId()==null) || 
             (this.newProdId!=null &&
              this.newProdId.equals(other.getNewProdId())));
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
        if (getOldProdId() != null) {
            _hashCode += getOldProdId().hashCode();
        }
        if (getNewProdId() != null) {
            _hashCode += getNewProdId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CorpTpProdGetUpdateResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "corpTpProdGetUpdateResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "transactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldProdId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "oldProdId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newProdId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "newProdId"));
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
