/**
 * ProductType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.TMobile_xsd;

public class ProductType  implements java.io.Serializable {
    private java.lang.String productID;

    private com.xius.tia.TMobile_xsd.RenewalInfoType renewalInfo;

    private com.xius.tia.TMobile_xsd.UsageType usage;

    public ProductType() {
    }

    public ProductType(
           java.lang.String productID,
           com.xius.tia.TMobile_xsd.RenewalInfoType renewalInfo,
           com.xius.tia.TMobile_xsd.UsageType usage) {
           this.productID = productID;
           this.renewalInfo = renewalInfo;
           this.usage = usage;
    }


    /**
     * Gets the productID value for this ProductType.
     * 
     * @return productID
     */
    public java.lang.String getProductID() {
        return productID;
    }


    /**
     * Sets the productID value for this ProductType.
     * 
     * @param productID
     */
    public void setProductID(java.lang.String productID) {
        this.productID = productID;
    }


    /**
     * Gets the renewalInfo value for this ProductType.
     * 
     * @return renewalInfo
     */
    public com.xius.tia.TMobile_xsd.RenewalInfoType getRenewalInfo() {
        return renewalInfo;
    }


    /**
     * Sets the renewalInfo value for this ProductType.
     * 
     * @param renewalInfo
     */
    public void setRenewalInfo(com.xius.tia.TMobile_xsd.RenewalInfoType renewalInfo) {
        this.renewalInfo = renewalInfo;
    }


    /**
     * Gets the usage value for this ProductType.
     * 
     * @return usage
     */
    public com.xius.tia.TMobile_xsd.UsageType getUsage() {
        return usage;
    }


    /**
     * Sets the usage value for this ProductType.
     * 
     * @param usage
     */
    public void setUsage(com.xius.tia.TMobile_xsd.UsageType usage) {
        this.usage = usage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductType)) return false;
        ProductType other = (ProductType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.productID==null && other.getProductID()==null) || 
             (this.productID!=null &&
              this.productID.equals(other.getProductID()))) &&
            ((this.renewalInfo==null && other.getRenewalInfo()==null) || 
             (this.renewalInfo!=null &&
              this.renewalInfo.equals(other.getRenewalInfo()))) &&
            ((this.usage==null && other.getUsage()==null) || 
             (this.usage!=null &&
              this.usage.equals(other.getUsage())));
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
        if (getProductID() != null) {
            _hashCode += getProductID().hashCode();
        }
        if (getRenewalInfo() != null) {
            _hashCode += getRenewalInfo().hashCode();
        }
        if (getUsage() != null) {
            _hashCode += getUsage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "productType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "productID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("renewalInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "renewalInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "renewalInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "usage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "usageType"));
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
