/**
 * GetTariffServicePkgDtlResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.tariff;

public class GetTariffServicePkgDtlResponse  extends com.xius.xbus.messages.common.WSResponse  implements java.io.Serializable {
    private com.xius.xbus.messages.billing.tariff.ServicePackInfoType[] servicePackInfoList;

    private com.xius.xbus.messages.billing.tariff.BucketType[] bucketDataDtls;

    private com.xius.xbus.messages.billing.tariff.DiscountType[] discountDataDtls;

    private com.xius.xbus.messages.billing.tariff.CADataType[] caDataDtls;

    public GetTariffServicePkgDtlResponse() {
    }

    public GetTariffServicePkgDtlResponse(
           com.xius.xbus.messages.common.StatusCode statusCode,
           java.util.Calendar timeStamp,
           java.lang.String correlationID,
           com.xius.xbus.messages.common.ErrorData[] errors,
           java.lang.String version,
           com.xius.xbus.messages.billing.tariff.ServicePackInfoType[] servicePackInfoList,
           com.xius.xbus.messages.billing.tariff.BucketType[] bucketDataDtls,
           com.xius.xbus.messages.billing.tariff.DiscountType[] discountDataDtls,
           com.xius.xbus.messages.billing.tariff.CADataType[] caDataDtls) {
        super(
            statusCode,
            timeStamp,
            correlationID,
            errors,
            version);
        this.servicePackInfoList = servicePackInfoList;
        this.bucketDataDtls = bucketDataDtls;
        this.discountDataDtls = discountDataDtls;
        this.caDataDtls = caDataDtls;
    }


    /**
     * Gets the servicePackInfoList value for this GetTariffServicePkgDtlResponse.
     * 
     * @return servicePackInfoList
     */
    public com.xius.xbus.messages.billing.tariff.ServicePackInfoType[] getServicePackInfoList() {
        return servicePackInfoList;
    }


    /**
     * Sets the servicePackInfoList value for this GetTariffServicePkgDtlResponse.
     * 
     * @param servicePackInfoList
     */
    public void setServicePackInfoList(com.xius.xbus.messages.billing.tariff.ServicePackInfoType[] servicePackInfoList) {
        this.servicePackInfoList = servicePackInfoList;
    }


    /**
     * Gets the bucketDataDtls value for this GetTariffServicePkgDtlResponse.
     * 
     * @return bucketDataDtls
     */
    public com.xius.xbus.messages.billing.tariff.BucketType[] getBucketDataDtls() {
        return bucketDataDtls;
    }


    /**
     * Sets the bucketDataDtls value for this GetTariffServicePkgDtlResponse.
     * 
     * @param bucketDataDtls
     */
    public void setBucketDataDtls(com.xius.xbus.messages.billing.tariff.BucketType[] bucketDataDtls) {
        this.bucketDataDtls = bucketDataDtls;
    }


    /**
     * Gets the discountDataDtls value for this GetTariffServicePkgDtlResponse.
     * 
     * @return discountDataDtls
     */
    public com.xius.xbus.messages.billing.tariff.DiscountType[] getDiscountDataDtls() {
        return discountDataDtls;
    }


    /**
     * Sets the discountDataDtls value for this GetTariffServicePkgDtlResponse.
     * 
     * @param discountDataDtls
     */
    public void setDiscountDataDtls(com.xius.xbus.messages.billing.tariff.DiscountType[] discountDataDtls) {
        this.discountDataDtls = discountDataDtls;
    }


    /**
     * Gets the caDataDtls value for this GetTariffServicePkgDtlResponse.
     * 
     * @return caDataDtls
     */
    public com.xius.xbus.messages.billing.tariff.CADataType[] getCaDataDtls() {
        return caDataDtls;
    }


    /**
     * Sets the caDataDtls value for this GetTariffServicePkgDtlResponse.
     * 
     * @param caDataDtls
     */
    public void setCaDataDtls(com.xius.xbus.messages.billing.tariff.CADataType[] caDataDtls) {
        this.caDataDtls = caDataDtls;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTariffServicePkgDtlResponse)) return false;
        GetTariffServicePkgDtlResponse other = (GetTariffServicePkgDtlResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.servicePackInfoList==null && other.getServicePackInfoList()==null) || 
             (this.servicePackInfoList!=null &&
              java.util.Arrays.equals(this.servicePackInfoList, other.getServicePackInfoList()))) &&
            ((this.bucketDataDtls==null && other.getBucketDataDtls()==null) || 
             (this.bucketDataDtls!=null &&
              java.util.Arrays.equals(this.bucketDataDtls, other.getBucketDataDtls()))) &&
            ((this.discountDataDtls==null && other.getDiscountDataDtls()==null) || 
             (this.discountDataDtls!=null &&
              java.util.Arrays.equals(this.discountDataDtls, other.getDiscountDataDtls()))) &&
            ((this.caDataDtls==null && other.getCaDataDtls()==null) || 
             (this.caDataDtls!=null &&
              java.util.Arrays.equals(this.caDataDtls, other.getCaDataDtls())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getServicePackInfoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServicePackInfoList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServicePackInfoList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBucketDataDtls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBucketDataDtls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBucketDataDtls(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDiscountDataDtls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDiscountDataDtls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDiscountDataDtls(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCaDataDtls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCaDataDtls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCaDataDtls(), i);
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
        new org.apache.axis.description.TypeDesc(GetTariffServicePkgDtlResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getTariffServicePkgDtlResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicePackInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "servicePackInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "ServicePackInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "ServicePackInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bucketDataDtls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "bucketDataDtls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "bucketType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "bucket"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountDataDtls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "discountDataDtls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "discountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "discount"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caDataDtls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "caDataDtls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "CADataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "ca"));
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
