/**
 * ProductPurchageEnquiryResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.ProductManagement_xsd;

public class ProductPurchageEnquiryResponse  implements java.io.Serializable {
    private com.xius.billing.ProductManagement_xsd.ProductTransTypeData[] productPurchageEnquiryData;

    public ProductPurchageEnquiryResponse() {
    }

    public ProductPurchageEnquiryResponse(
           com.xius.billing.ProductManagement_xsd.ProductTransTypeData[] productPurchageEnquiryData) {
           this.productPurchageEnquiryData = productPurchageEnquiryData;
    }


    /**
     * Gets the productPurchageEnquiryData value for this ProductPurchageEnquiryResponse.
     * 
     * @return productPurchageEnquiryData
     */
    public com.xius.billing.ProductManagement_xsd.ProductTransTypeData[] getProductPurchageEnquiryData() {
        return productPurchageEnquiryData;
    }


    /**
     * Sets the productPurchageEnquiryData value for this ProductPurchageEnquiryResponse.
     * 
     * @param productPurchageEnquiryData
     */
    public void setProductPurchageEnquiryData(com.xius.billing.ProductManagement_xsd.ProductTransTypeData[] productPurchageEnquiryData) {
        this.productPurchageEnquiryData = productPurchageEnquiryData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductPurchageEnquiryResponse)) return false;
        ProductPurchageEnquiryResponse other = (ProductPurchageEnquiryResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.productPurchageEnquiryData==null && other.getProductPurchageEnquiryData()==null) || 
             (this.productPurchageEnquiryData!=null &&
              java.util.Arrays.equals(this.productPurchageEnquiryData, other.getProductPurchageEnquiryData())));
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
        if (getProductPurchageEnquiryData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductPurchageEnquiryData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductPurchageEnquiryData(), i);
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
        new org.apache.axis.description.TypeDesc(ProductPurchageEnquiryResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "productPurchageEnquiryResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productPurchageEnquiryData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "productPurchageEnquiryData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "ProductTransTypeData"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "ProductTransData"));
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
