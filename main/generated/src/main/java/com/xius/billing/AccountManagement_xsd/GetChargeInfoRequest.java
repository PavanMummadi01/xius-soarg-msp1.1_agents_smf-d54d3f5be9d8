/**
 * GetChargeInfoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class GetChargeInfoRequest  implements java.io.Serializable {
    private java.lang.Long oldAccountId;

    private java.lang.Long oldMSISDN;

    private java.lang.Long newMSISDN;

    private java.lang.String operationType;

    public GetChargeInfoRequest() {
    }

    public GetChargeInfoRequest(
           java.lang.Long oldAccountId,
           java.lang.Long oldMSISDN,
           java.lang.Long newMSISDN,
           java.lang.String operationType) {
           this.oldAccountId = oldAccountId;
           this.oldMSISDN = oldMSISDN;
           this.newMSISDN = newMSISDN;
           this.operationType = operationType;
    }


    /**
     * Gets the oldAccountId value for this GetChargeInfoRequest.
     * 
     * @return oldAccountId
     */
    public java.lang.Long getOldAccountId() {
        return oldAccountId;
    }


    /**
     * Sets the oldAccountId value for this GetChargeInfoRequest.
     * 
     * @param oldAccountId
     */
    public void setOldAccountId(java.lang.Long oldAccountId) {
        this.oldAccountId = oldAccountId;
    }


    /**
     * Gets the oldMSISDN value for this GetChargeInfoRequest.
     * 
     * @return oldMSISDN
     */
    public java.lang.Long getOldMSISDN() {
        return oldMSISDN;
    }


    /**
     * Sets the oldMSISDN value for this GetChargeInfoRequest.
     * 
     * @param oldMSISDN
     */
    public void setOldMSISDN(java.lang.Long oldMSISDN) {
        this.oldMSISDN = oldMSISDN;
    }


    /**
     * Gets the newMSISDN value for this GetChargeInfoRequest.
     * 
     * @return newMSISDN
     */
    public java.lang.Long getNewMSISDN() {
        return newMSISDN;
    }


    /**
     * Sets the newMSISDN value for this GetChargeInfoRequest.
     * 
     * @param newMSISDN
     */
    public void setNewMSISDN(java.lang.Long newMSISDN) {
        this.newMSISDN = newMSISDN;
    }


    /**
     * Gets the operationType value for this GetChargeInfoRequest.
     * 
     * @return operationType
     */
    public java.lang.String getOperationType() {
        return operationType;
    }


    /**
     * Sets the operationType value for this GetChargeInfoRequest.
     * 
     * @param operationType
     */
    public void setOperationType(java.lang.String operationType) {
        this.operationType = operationType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetChargeInfoRequest)) return false;
        GetChargeInfoRequest other = (GetChargeInfoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.oldAccountId==null && other.getOldAccountId()==null) || 
             (this.oldAccountId!=null &&
              this.oldAccountId.equals(other.getOldAccountId()))) &&
            ((this.oldMSISDN==null && other.getOldMSISDN()==null) || 
             (this.oldMSISDN!=null &&
              this.oldMSISDN.equals(other.getOldMSISDN()))) &&
            ((this.newMSISDN==null && other.getNewMSISDN()==null) || 
             (this.newMSISDN!=null &&
              this.newMSISDN.equals(other.getNewMSISDN()))) &&
            ((this.operationType==null && other.getOperationType()==null) || 
             (this.operationType!=null &&
              this.operationType.equals(other.getOperationType())));
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
        if (getOldAccountId() != null) {
            _hashCode += getOldAccountId().hashCode();
        }
        if (getOldMSISDN() != null) {
            _hashCode += getOldMSISDN().hashCode();
        }
        if (getNewMSISDN() != null) {
            _hashCode += getNewMSISDN().hashCode();
        }
        if (getOperationType() != null) {
            _hashCode += getOperationType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetChargeInfoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetChargeInfoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldAccountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "oldAccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "oldMSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "newMSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "operationType"));
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
