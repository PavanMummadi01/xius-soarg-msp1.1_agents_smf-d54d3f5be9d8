/**
 * GetBundlesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class GetBundlesResponse  implements java.io.Serializable {
    private com.xius.billing.SubscriberManagement_xsd.BundleType[] avlblBundlesList;

    private com.xius.billing.SubscriberManagement_xsd.BundleType[] asgndBundlesList;

    private com.xius.billing.SubscriberManagement_xsd.BundleType[] immedAvlblBundlesList;

    private com.xius.billing.SubscriberManagement_xsd.BundleType[] immedAsgndBundlesList;

    public GetBundlesResponse() {
    }

    public GetBundlesResponse(
           com.xius.billing.SubscriberManagement_xsd.BundleType[] avlblBundlesList,
           com.xius.billing.SubscriberManagement_xsd.BundleType[] asgndBundlesList,
           com.xius.billing.SubscriberManagement_xsd.BundleType[] immedAvlblBundlesList,
           com.xius.billing.SubscriberManagement_xsd.BundleType[] immedAsgndBundlesList) {
           this.avlblBundlesList = avlblBundlesList;
           this.asgndBundlesList = asgndBundlesList;
           this.immedAvlblBundlesList = immedAvlblBundlesList;
           this.immedAsgndBundlesList = immedAsgndBundlesList;
    }


    /**
     * Gets the avlblBundlesList value for this GetBundlesResponse.
     * 
     * @return avlblBundlesList
     */
    public com.xius.billing.SubscriberManagement_xsd.BundleType[] getAvlblBundlesList() {
        return avlblBundlesList;
    }


    /**
     * Sets the avlblBundlesList value for this GetBundlesResponse.
     * 
     * @param avlblBundlesList
     */
    public void setAvlblBundlesList(com.xius.billing.SubscriberManagement_xsd.BundleType[] avlblBundlesList) {
        this.avlblBundlesList = avlblBundlesList;
    }


    /**
     * Gets the asgndBundlesList value for this GetBundlesResponse.
     * 
     * @return asgndBundlesList
     */
    public com.xius.billing.SubscriberManagement_xsd.BundleType[] getAsgndBundlesList() {
        return asgndBundlesList;
    }


    /**
     * Sets the asgndBundlesList value for this GetBundlesResponse.
     * 
     * @param asgndBundlesList
     */
    public void setAsgndBundlesList(com.xius.billing.SubscriberManagement_xsd.BundleType[] asgndBundlesList) {
        this.asgndBundlesList = asgndBundlesList;
    }


    /**
     * Gets the immedAvlblBundlesList value for this GetBundlesResponse.
     * 
     * @return immedAvlblBundlesList
     */
    public com.xius.billing.SubscriberManagement_xsd.BundleType[] getImmedAvlblBundlesList() {
        return immedAvlblBundlesList;
    }


    /**
     * Sets the immedAvlblBundlesList value for this GetBundlesResponse.
     * 
     * @param immedAvlblBundlesList
     */
    public void setImmedAvlblBundlesList(com.xius.billing.SubscriberManagement_xsd.BundleType[] immedAvlblBundlesList) {
        this.immedAvlblBundlesList = immedAvlblBundlesList;
    }


    /**
     * Gets the immedAsgndBundlesList value for this GetBundlesResponse.
     * 
     * @return immedAsgndBundlesList
     */
    public com.xius.billing.SubscriberManagement_xsd.BundleType[] getImmedAsgndBundlesList() {
        return immedAsgndBundlesList;
    }


    /**
     * Sets the immedAsgndBundlesList value for this GetBundlesResponse.
     * 
     * @param immedAsgndBundlesList
     */
    public void setImmedAsgndBundlesList(com.xius.billing.SubscriberManagement_xsd.BundleType[] immedAsgndBundlesList) {
        this.immedAsgndBundlesList = immedAsgndBundlesList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBundlesResponse)) return false;
        GetBundlesResponse other = (GetBundlesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.avlblBundlesList==null && other.getAvlblBundlesList()==null) || 
             (this.avlblBundlesList!=null &&
              java.util.Arrays.equals(this.avlblBundlesList, other.getAvlblBundlesList()))) &&
            ((this.asgndBundlesList==null && other.getAsgndBundlesList()==null) || 
             (this.asgndBundlesList!=null &&
              java.util.Arrays.equals(this.asgndBundlesList, other.getAsgndBundlesList()))) &&
            ((this.immedAvlblBundlesList==null && other.getImmedAvlblBundlesList()==null) || 
             (this.immedAvlblBundlesList!=null &&
              java.util.Arrays.equals(this.immedAvlblBundlesList, other.getImmedAvlblBundlesList()))) &&
            ((this.immedAsgndBundlesList==null && other.getImmedAsgndBundlesList()==null) || 
             (this.immedAsgndBundlesList!=null &&
              java.util.Arrays.equals(this.immedAsgndBundlesList, other.getImmedAsgndBundlesList())));
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
        if (getAvlblBundlesList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvlblBundlesList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvlblBundlesList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
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
        if (getImmedAvlblBundlesList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImmedAvlblBundlesList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImmedAvlblBundlesList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getImmedAsgndBundlesList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImmedAsgndBundlesList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImmedAsgndBundlesList(), i);
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
        new org.apache.axis.description.TypeDesc(GetBundlesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetBundlesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avlblBundlesList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "AvlblBundlesList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "BundleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "bundle"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asgndBundlesList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "AsgndBundlesList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "BundleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "bundle"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("immedAvlblBundlesList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ImmedAvlblBundlesList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "BundleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "bundle"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("immedAsgndBundlesList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ImmedAsgndBundlesList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "BundleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "bundle"));
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
