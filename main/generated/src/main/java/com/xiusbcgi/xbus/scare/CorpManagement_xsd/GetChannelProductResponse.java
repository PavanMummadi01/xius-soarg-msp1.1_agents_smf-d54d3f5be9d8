/**
 * GetChannelProductResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xiusbcgi.xbus.scare.CorpManagement_xsd;

public class GetChannelProductResponse  implements java.io.Serializable {
    private com.xiusbcgi.xbus.scare.CorpManagement_xsd.OfficeProductType[] officeProductList;

    public GetChannelProductResponse() {
    }

    public GetChannelProductResponse(
           com.xiusbcgi.xbus.scare.CorpManagement_xsd.OfficeProductType[] officeProductList) {
           this.officeProductList = officeProductList;
    }


    /**
     * Gets the officeProductList value for this GetChannelProductResponse.
     * 
     * @return officeProductList
     */
    public com.xiusbcgi.xbus.scare.CorpManagement_xsd.OfficeProductType[] getOfficeProductList() {
        return officeProductList;
    }


    /**
     * Sets the officeProductList value for this GetChannelProductResponse.
     * 
     * @param officeProductList
     */
    public void setOfficeProductList(com.xiusbcgi.xbus.scare.CorpManagement_xsd.OfficeProductType[] officeProductList) {
        this.officeProductList = officeProductList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetChannelProductResponse)) return false;
        GetChannelProductResponse other = (GetChannelProductResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.officeProductList==null && other.getOfficeProductList()==null) || 
             (this.officeProductList!=null &&
              java.util.Arrays.equals(this.officeProductList, other.getOfficeProductList())));
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
        if (getOfficeProductList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOfficeProductList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOfficeProductList(), i);
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
        new org.apache.axis.description.TypeDesc(GetChannelProductResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "GetChannelProductResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officeProductList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "officeProductList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "OfficeProductType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "officeProductList"));
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
