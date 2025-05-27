/**
 * SubscribedTPType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.ProductManagement_xsd;

public class SubscribedTPType  implements java.io.Serializable {
    private java.lang.String TPid;

    private java.lang.String TPdesc;

    public SubscribedTPType() {
    }

    public SubscribedTPType(
           java.lang.String TPid,
           java.lang.String TPdesc) {
           this.TPid = TPid;
           this.TPdesc = TPdesc;
    }


    /**
     * Gets the TPid value for this SubscribedTPType.
     * 
     * @return TPid
     */
    public java.lang.String getTPid() {
        return TPid;
    }


    /**
     * Sets the TPid value for this SubscribedTPType.
     * 
     * @param TPid
     */
    public void setTPid(java.lang.String TPid) {
        this.TPid = TPid;
    }


    /**
     * Gets the TPdesc value for this SubscribedTPType.
     * 
     * @return TPdesc
     */
    public java.lang.String getTPdesc() {
        return TPdesc;
    }


    /**
     * Sets the TPdesc value for this SubscribedTPType.
     * 
     * @param TPdesc
     */
    public void setTPdesc(java.lang.String TPdesc) {
        this.TPdesc = TPdesc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubscribedTPType)) return false;
        SubscribedTPType other = (SubscribedTPType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.TPid==null && other.getTPid()==null) || 
             (this.TPid!=null &&
              this.TPid.equals(other.getTPid()))) &&
            ((this.TPdesc==null && other.getTPdesc()==null) || 
             (this.TPdesc!=null &&
              this.TPdesc.equals(other.getTPdesc())));
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
        if (getTPid() != null) {
            _hashCode += getTPid().hashCode();
        }
        if (getTPdesc() != null) {
            _hashCode += getTPdesc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubscribedTPType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "SubscribedTPType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TPid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "TPid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TPdesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "TPdesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
