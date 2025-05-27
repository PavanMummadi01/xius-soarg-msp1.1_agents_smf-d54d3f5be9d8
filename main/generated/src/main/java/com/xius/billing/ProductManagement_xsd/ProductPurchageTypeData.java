/**
 * ProductPurchageTypeData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.ProductManagement_xsd;

public class ProductPurchageTypeData  implements java.io.Serializable {
    private java.lang.String internalTtransId;

    private java.lang.String responseCode;

    private java.lang.String responseDescription;

    private java.lang.String responseStatus;

    public ProductPurchageTypeData() {
    }

    public ProductPurchageTypeData(
           java.lang.String internalTtransId,
           java.lang.String responseCode,
           java.lang.String responseDescription,
           java.lang.String responseStatus) {
           this.internalTtransId = internalTtransId;
           this.responseCode = responseCode;
           this.responseDescription = responseDescription;
           this.responseStatus = responseStatus;
    }


    /**
     * Gets the internalTtransId value for this ProductPurchageTypeData.
     * 
     * @return internalTtransId
     */
    public java.lang.String getInternalTtransId() {
        return internalTtransId;
    }


    /**
     * Sets the internalTtransId value for this ProductPurchageTypeData.
     * 
     * @param internalTtransId
     */
    public void setInternalTtransId(java.lang.String internalTtransId) {
        this.internalTtransId = internalTtransId;
    }


    /**
     * Gets the responseCode value for this ProductPurchageTypeData.
     * 
     * @return responseCode
     */
    public java.lang.String getResponseCode() {
        return responseCode;
    }


    /**
     * Sets the responseCode value for this ProductPurchageTypeData.
     * 
     * @param responseCode
     */
    public void setResponseCode(java.lang.String responseCode) {
        this.responseCode = responseCode;
    }


    /**
     * Gets the responseDescription value for this ProductPurchageTypeData.
     * 
     * @return responseDescription
     */
    public java.lang.String getResponseDescription() {
        return responseDescription;
    }


    /**
     * Sets the responseDescription value for this ProductPurchageTypeData.
     * 
     * @param responseDescription
     */
    public void setResponseDescription(java.lang.String responseDescription) {
        this.responseDescription = responseDescription;
    }


    /**
     * Gets the responseStatus value for this ProductPurchageTypeData.
     * 
     * @return responseStatus
     */
    public java.lang.String getResponseStatus() {
        return responseStatus;
    }


    /**
     * Sets the responseStatus value for this ProductPurchageTypeData.
     * 
     * @param responseStatus
     */
    public void setResponseStatus(java.lang.String responseStatus) {
        this.responseStatus = responseStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductPurchageTypeData)) return false;
        ProductPurchageTypeData other = (ProductPurchageTypeData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.internalTtransId==null && other.getInternalTtransId()==null) || 
             (this.internalTtransId!=null &&
              this.internalTtransId.equals(other.getInternalTtransId()))) &&
            ((this.responseCode==null && other.getResponseCode()==null) || 
             (this.responseCode!=null &&
              this.responseCode.equals(other.getResponseCode()))) &&
            ((this.responseDescription==null && other.getResponseDescription()==null) || 
             (this.responseDescription!=null &&
              this.responseDescription.equals(other.getResponseDescription()))) &&
            ((this.responseStatus==null && other.getResponseStatus()==null) || 
             (this.responseStatus!=null &&
              this.responseStatus.equals(other.getResponseStatus())));
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
        if (getInternalTtransId() != null) {
            _hashCode += getInternalTtransId().hashCode();
        }
        if (getResponseCode() != null) {
            _hashCode += getResponseCode().hashCode();
        }
        if (getResponseDescription() != null) {
            _hashCode += getResponseDescription().hashCode();
        }
        if (getResponseStatus() != null) {
            _hashCode += getResponseStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductPurchageTypeData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "ProductPurchageTypeData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalTtransId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "internalTtransId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "responseCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "responseDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "responseStatus"));
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
