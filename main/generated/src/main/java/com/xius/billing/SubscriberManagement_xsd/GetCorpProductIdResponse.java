/**
 * GetCorpProductIdResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class GetCorpProductIdResponse  implements java.io.Serializable {
    private java.lang.String officeProduct;

    public GetCorpProductIdResponse() {
    }

    public GetCorpProductIdResponse(
           java.lang.String officeProduct) {
           this.officeProduct = officeProduct;
    }


    /**
     * Gets the officeProduct value for this GetCorpProductIdResponse.
     * 
     * @return officeProduct
     */
    public java.lang.String getOfficeProduct() {
        return officeProduct;
    }


    /**
     * Sets the officeProduct value for this GetCorpProductIdResponse.
     * 
     * @param officeProduct
     */
    public void setOfficeProduct(java.lang.String officeProduct) {
        this.officeProduct = officeProduct;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCorpProductIdResponse)) return false;
        GetCorpProductIdResponse other = (GetCorpProductIdResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.officeProduct==null && other.getOfficeProduct()==null) || 
             (this.officeProduct!=null &&
              this.officeProduct.equals(other.getOfficeProduct())));
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
        if (getOfficeProduct() != null) {
            _hashCode += getOfficeProduct().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCorpProductIdResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getCorpProductIdResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officeProduct");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "officeProduct"));
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
