/**
 * GetPostpaidAcctDetResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class GetPostpaidAcctDetResponse  implements java.io.Serializable {
    private com.xius.billing.AccountManagement_xsd.PostpaidAcctDetType[] postpaidAcctDetList;

    public GetPostpaidAcctDetResponse() {
    }

    public GetPostpaidAcctDetResponse(
           com.xius.billing.AccountManagement_xsd.PostpaidAcctDetType[] postpaidAcctDetList) {
           this.postpaidAcctDetList = postpaidAcctDetList;
    }


    /**
     * Gets the postpaidAcctDetList value for this GetPostpaidAcctDetResponse.
     * 
     * @return postpaidAcctDetList
     */
    public com.xius.billing.AccountManagement_xsd.PostpaidAcctDetType[] getPostpaidAcctDetList() {
        return postpaidAcctDetList;
    }


    /**
     * Sets the postpaidAcctDetList value for this GetPostpaidAcctDetResponse.
     * 
     * @param postpaidAcctDetList
     */
    public void setPostpaidAcctDetList(com.xius.billing.AccountManagement_xsd.PostpaidAcctDetType[] postpaidAcctDetList) {
        this.postpaidAcctDetList = postpaidAcctDetList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPostpaidAcctDetResponse)) return false;
        GetPostpaidAcctDetResponse other = (GetPostpaidAcctDetResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.postpaidAcctDetList==null && other.getPostpaidAcctDetList()==null) || 
             (this.postpaidAcctDetList!=null &&
              java.util.Arrays.equals(this.postpaidAcctDetList, other.getPostpaidAcctDetList())));
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
        if (getPostpaidAcctDetList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPostpaidAcctDetList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPostpaidAcctDetList(), i);
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
        new org.apache.axis.description.TypeDesc(GetPostpaidAcctDetResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetPostpaidAcctDetResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postpaidAcctDetList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "postpaidAcctDetList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "PostpaidAcctDetType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "postpaidAcctDetails"));
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
