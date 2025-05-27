/**
 * GetAccntsCountOfIDResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class GetAccntsCountOfIDResponse  implements java.io.Serializable {
    private java.lang.Long idExistFlag;

    private java.lang.Long accountCount;

    public GetAccntsCountOfIDResponse() {
    }

    public GetAccntsCountOfIDResponse(
           java.lang.Long idExistFlag,
           java.lang.Long accountCount) {
           this.idExistFlag = idExistFlag;
           this.accountCount = accountCount;
    }


    /**
     * Gets the idExistFlag value for this GetAccntsCountOfIDResponse.
     * 
     * @return idExistFlag
     */
    public java.lang.Long getIdExistFlag() {
        return idExistFlag;
    }


    /**
     * Sets the idExistFlag value for this GetAccntsCountOfIDResponse.
     * 
     * @param idExistFlag
     */
    public void setIdExistFlag(java.lang.Long idExistFlag) {
        this.idExistFlag = idExistFlag;
    }


    /**
     * Gets the accountCount value for this GetAccntsCountOfIDResponse.
     * 
     * @return accountCount
     */
    public java.lang.Long getAccountCount() {
        return accountCount;
    }


    /**
     * Sets the accountCount value for this GetAccntsCountOfIDResponse.
     * 
     * @param accountCount
     */
    public void setAccountCount(java.lang.Long accountCount) {
        this.accountCount = accountCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAccntsCountOfIDResponse)) return false;
        GetAccntsCountOfIDResponse other = (GetAccntsCountOfIDResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idExistFlag==null && other.getIdExistFlag()==null) || 
             (this.idExistFlag!=null &&
              this.idExistFlag.equals(other.getIdExistFlag()))) &&
            ((this.accountCount==null && other.getAccountCount()==null) || 
             (this.accountCount!=null &&
              this.accountCount.equals(other.getAccountCount())));
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
        if (getIdExistFlag() != null) {
            _hashCode += getIdExistFlag().hashCode();
        }
        if (getAccountCount() != null) {
            _hashCode += getAccountCount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAccntsCountOfIDResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetAccntsCountOfIDResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idExistFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "idExistFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "accountCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
