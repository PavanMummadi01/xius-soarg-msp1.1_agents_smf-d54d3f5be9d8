/**
 * GetBannerResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class GetBannerResponse  implements java.io.Serializable {
    private com.xius.billing.SubscriberManagement_xsd.BannerDetailsType[] banner;

    private java.lang.String[] bannerList;

    public GetBannerResponse() {
    }

    public GetBannerResponse(
           com.xius.billing.SubscriberManagement_xsd.BannerDetailsType[] banner,
           java.lang.String[] bannerList) {
           this.banner = banner;
           this.bannerList = bannerList;
    }


    /**
     * Gets the banner value for this GetBannerResponse.
     * 
     * @return banner
     */
    public com.xius.billing.SubscriberManagement_xsd.BannerDetailsType[] getBanner() {
        return banner;
    }


    /**
     * Sets the banner value for this GetBannerResponse.
     * 
     * @param banner
     */
    public void setBanner(com.xius.billing.SubscriberManagement_xsd.BannerDetailsType[] banner) {
        this.banner = banner;
    }


    /**
     * Gets the bannerList value for this GetBannerResponse.
     * 
     * @return bannerList
     */
    public java.lang.String[] getBannerList() {
        return bannerList;
    }


    /**
     * Sets the bannerList value for this GetBannerResponse.
     * 
     * @param bannerList
     */
    public void setBannerList(java.lang.String[] bannerList) {
        this.bannerList = bannerList;
    }

    public java.lang.String getBannerList(int i) {
        return this.bannerList[i];
    }

    public void setBannerList(int i, java.lang.String _value) {
        this.bannerList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBannerResponse)) return false;
        GetBannerResponse other = (GetBannerResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.banner==null && other.getBanner()==null) || 
             (this.banner!=null &&
              java.util.Arrays.equals(this.banner, other.getBanner()))) &&
            ((this.bannerList==null && other.getBannerList()==null) || 
             (this.bannerList!=null &&
              java.util.Arrays.equals(this.bannerList, other.getBannerList())));
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
        if (getBanner() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBanner());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBanner(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBannerList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBannerList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBannerList(), i);
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
        new org.apache.axis.description.TypeDesc(GetBannerResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetBannerResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("banner");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "banner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "BannerDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "bannerDetails"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bannerList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "bannerList"));
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
