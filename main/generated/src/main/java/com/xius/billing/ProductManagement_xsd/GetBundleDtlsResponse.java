/**
 * GetBundleDtlsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.ProductManagement_xsd;

public class GetBundleDtlsResponse  implements java.io.Serializable {
    private com.xius.billing.ProductManagement_xsd.BundleDtlsType[] bundlesDtls;

    public GetBundleDtlsResponse() {
    }

    public GetBundleDtlsResponse(
           com.xius.billing.ProductManagement_xsd.BundleDtlsType[] bundlesDtls) {
           this.bundlesDtls = bundlesDtls;
    }


    /**
     * Gets the bundlesDtls value for this GetBundleDtlsResponse.
     * 
     * @return bundlesDtls
     */
    public com.xius.billing.ProductManagement_xsd.BundleDtlsType[] getBundlesDtls() {
        return bundlesDtls;
    }


    /**
     * Sets the bundlesDtls value for this GetBundleDtlsResponse.
     * 
     * @param bundlesDtls
     */
    public void setBundlesDtls(com.xius.billing.ProductManagement_xsd.BundleDtlsType[] bundlesDtls) {
        this.bundlesDtls = bundlesDtls;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBundleDtlsResponse)) return false;
        GetBundleDtlsResponse other = (GetBundleDtlsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bundlesDtls==null && other.getBundlesDtls()==null) || 
             (this.bundlesDtls!=null &&
              java.util.Arrays.equals(this.bundlesDtls, other.getBundlesDtls())));
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
        if (getBundlesDtls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBundlesDtls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBundlesDtls(), i);
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
        new org.apache.axis.description.TypeDesc(GetBundleDtlsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getBundleDtlsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bundlesDtls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "BundlesDtls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "BundleDtlsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "BundleDtls"));
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
