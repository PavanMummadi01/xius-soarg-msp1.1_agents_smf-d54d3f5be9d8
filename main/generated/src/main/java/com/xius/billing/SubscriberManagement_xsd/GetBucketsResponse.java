/**
 * GetBucketsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class GetBucketsResponse  implements java.io.Serializable {
    private com.xius.billing.SubscriberManagement_xsd.BucketDataType[] asgndBucketsList;

    public GetBucketsResponse() {
    }

    public GetBucketsResponse(
           com.xius.billing.SubscriberManagement_xsd.BucketDataType[] asgndBucketsList) {
           this.asgndBucketsList = asgndBucketsList;
    }


    /**
     * Gets the asgndBucketsList value for this GetBucketsResponse.
     * 
     * @return asgndBucketsList
     */
    public com.xius.billing.SubscriberManagement_xsd.BucketDataType[] getAsgndBucketsList() {
        return asgndBucketsList;
    }


    /**
     * Sets the asgndBucketsList value for this GetBucketsResponse.
     * 
     * @param asgndBucketsList
     */
    public void setAsgndBucketsList(com.xius.billing.SubscriberManagement_xsd.BucketDataType[] asgndBucketsList) {
        this.asgndBucketsList = asgndBucketsList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBucketsResponse)) return false;
        GetBucketsResponse other = (GetBucketsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
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
        new org.apache.axis.description.TypeDesc(GetBucketsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetBucketsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
