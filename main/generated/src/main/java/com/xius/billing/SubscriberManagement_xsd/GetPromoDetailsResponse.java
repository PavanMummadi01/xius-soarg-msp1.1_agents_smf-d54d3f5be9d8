/**
 * GetPromoDetailsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class GetPromoDetailsResponse  implements java.io.Serializable {
    private com.xius.billing.SubscriberManagement_xsd.PromoDetailsType[] promoList;

    public GetPromoDetailsResponse() {
    }

    public GetPromoDetailsResponse(
           com.xius.billing.SubscriberManagement_xsd.PromoDetailsType[] promoList) {
           this.promoList = promoList;
    }


    /**
     * Gets the promoList value for this GetPromoDetailsResponse.
     * 
     * @return promoList
     */
    public com.xius.billing.SubscriberManagement_xsd.PromoDetailsType[] getPromoList() {
        return promoList;
    }


    /**
     * Sets the promoList value for this GetPromoDetailsResponse.
     * 
     * @param promoList
     */
    public void setPromoList(com.xius.billing.SubscriberManagement_xsd.PromoDetailsType[] promoList) {
        this.promoList = promoList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPromoDetailsResponse)) return false;
        GetPromoDetailsResponse other = (GetPromoDetailsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.promoList==null && other.getPromoList()==null) || 
             (this.promoList!=null &&
              java.util.Arrays.equals(this.promoList, other.getPromoList())));
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
        if (getPromoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPromoList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPromoList(), i);
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
        new org.apache.axis.description.TypeDesc(GetPromoDetailsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetPromoDetailsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promoList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "promoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "PromoDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "promos"));
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
