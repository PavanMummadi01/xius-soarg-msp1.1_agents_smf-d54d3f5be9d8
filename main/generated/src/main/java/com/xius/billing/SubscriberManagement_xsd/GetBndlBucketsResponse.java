/**
 * GetBndlBucketsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class GetBndlBucketsResponse  implements java.io.Serializable {
    private com.xius.billing.SubscriberManagement_xsd.BundleType[] asgndBundlesList;

    private com.xius.billing.SubscriberManagement_xsd.BucketDataType[] asgndBucketsList;

    public GetBndlBucketsResponse() {
    }

    public GetBndlBucketsResponse(
           com.xius.billing.SubscriberManagement_xsd.BundleType[] asgndBundlesList,
           com.xius.billing.SubscriberManagement_xsd.BucketDataType[] asgndBucketsList) {
           this.asgndBundlesList = asgndBundlesList;
           this.asgndBucketsList = asgndBucketsList;
    }


    /**
     * Gets the asgndBundlesList value for this GetBndlBucketsResponse.
     * 
     * @return asgndBundlesList
     */
    public com.xius.billing.SubscriberManagement_xsd.BundleType[] getAsgndBundlesList() {
        return asgndBundlesList;
    }


    /**
     * Sets the asgndBundlesList value for this GetBndlBucketsResponse.
     * 
     * @param asgndBundlesList
     */
    public void setAsgndBundlesList(com.xius.billing.SubscriberManagement_xsd.BundleType[] asgndBundlesList) {
        this.asgndBundlesList = asgndBundlesList;
    }


    /**
     * Gets the asgndBucketsList value for this GetBndlBucketsResponse.
     * 
     * @return asgndBucketsList
     */
    public com.xius.billing.SubscriberManagement_xsd.BucketDataType[] getAsgndBucketsList() {
        return asgndBucketsList;
    }


    /**
     * Sets the asgndBucketsList value for this GetBndlBucketsResponse.
     * 
     * @param asgndBucketsList
     */
    public void setAsgndBucketsList(com.xius.billing.SubscriberManagement_xsd.BucketDataType[] asgndBucketsList) {
        this.asgndBucketsList = asgndBucketsList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBndlBucketsResponse)) return false;
        GetBndlBucketsResponse other = (GetBndlBucketsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.asgndBundlesList==null && other.getAsgndBundlesList()==null) || 
             (this.asgndBundlesList!=null &&
              java.util.Arrays.equals(this.asgndBundlesList, other.getAsgndBundlesList()))) &&
            ((this.asgndBucketsList==null && other.getAsgndBucketsList()==null) || 
             (this.asgndBucketsList!=null &&
              java.util.Arrays.equals(this.asgndBucketsList, other.getAsgndBucketsList())));
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
        if (getAsgndBundlesList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAsgndBundlesList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAsgndBundlesList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAsgndBucketsList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAsgndBucketsList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAsgndBucketsList(), i);
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
        new org.apache.axis.description.TypeDesc(GetBndlBucketsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetBndlBucketsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asgndBundlesList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "AsgndBundlesList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "BundleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "bundle"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asgndBucketsList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "AsgndBucketsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "BucketDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "bucket"));
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
