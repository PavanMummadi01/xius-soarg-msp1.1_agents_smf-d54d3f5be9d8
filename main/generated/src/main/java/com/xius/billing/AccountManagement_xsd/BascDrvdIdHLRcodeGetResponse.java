/**
 * BascDrvdIdHLRcodeGetResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class BascDrvdIdHLRcodeGetResponse  implements java.io.Serializable {
    private java.lang.String transactionId;

    private java.lang.String[] subUnsubFlag;

    private java.lang.String[] hlrcodes;

    public BascDrvdIdHLRcodeGetResponse() {
    }

    public BascDrvdIdHLRcodeGetResponse(
           java.lang.String transactionId,
           java.lang.String[] subUnsubFlag,
           java.lang.String[] hlrcodes) {
           this.transactionId = transactionId;
           this.subUnsubFlag = subUnsubFlag;
           this.hlrcodes = hlrcodes;
    }


    /**
     * Gets the transactionId value for this BascDrvdIdHLRcodeGetResponse.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this BascDrvdIdHLRcodeGetResponse.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the subUnsubFlag value for this BascDrvdIdHLRcodeGetResponse.
     * 
     * @return subUnsubFlag
     */
    public java.lang.String[] getSubUnsubFlag() {
        return subUnsubFlag;
    }


    /**
     * Sets the subUnsubFlag value for this BascDrvdIdHLRcodeGetResponse.
     * 
     * @param subUnsubFlag
     */
    public void setSubUnsubFlag(java.lang.String[] subUnsubFlag) {
        this.subUnsubFlag = subUnsubFlag;
    }

    public java.lang.String getSubUnsubFlag(int i) {
        return this.subUnsubFlag[i];
    }

    public void setSubUnsubFlag(int i, java.lang.String _value) {
        this.subUnsubFlag[i] = _value;
    }


    /**
     * Gets the hlrcodes value for this BascDrvdIdHLRcodeGetResponse.
     * 
     * @return hlrcodes
     */
    public java.lang.String[] getHlrcodes() {
        return hlrcodes;
    }


    /**
     * Sets the hlrcodes value for this BascDrvdIdHLRcodeGetResponse.
     * 
     * @param hlrcodes
     */
    public void setHlrcodes(java.lang.String[] hlrcodes) {
        this.hlrcodes = hlrcodes;
    }

    public java.lang.String getHlrcodes(int i) {
        return this.hlrcodes[i];
    }

    public void setHlrcodes(int i, java.lang.String _value) {
        this.hlrcodes[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BascDrvdIdHLRcodeGetResponse)) return false;
        BascDrvdIdHLRcodeGetResponse other = (BascDrvdIdHLRcodeGetResponse) obj;
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
            ((this.subUnsubFlag==null && other.getSubUnsubFlag()==null) || 
             (this.subUnsubFlag!=null &&
              java.util.Arrays.equals(this.subUnsubFlag, other.getSubUnsubFlag()))) &&
            ((this.hlrcodes==null && other.getHlrcodes()==null) || 
             (this.hlrcodes!=null &&
              java.util.Arrays.equals(this.hlrcodes, other.getHlrcodes())));
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
        if (getSubUnsubFlag() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubUnsubFlag());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubUnsubFlag(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHlrcodes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHlrcodes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHlrcodes(), i);
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
        new org.apache.axis.description.TypeDesc(BascDrvdIdHLRcodeGetResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "bascDrvdIdHLRcodeGetResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "TransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subUnsubFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "subUnsubFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hlrcodes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "hlrcodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
