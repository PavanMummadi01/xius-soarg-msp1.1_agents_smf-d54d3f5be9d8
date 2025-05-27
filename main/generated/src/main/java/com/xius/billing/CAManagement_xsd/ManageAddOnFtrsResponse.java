/**
 * ManageAddOnFtrsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.CAManagement_xsd;

public class ManageAddOnFtrsResponse  implements java.io.Serializable {
    private java.lang.String messge;

    private com.xius.billing.CAManagement_xsd.FailureType[] failedList;

    public ManageAddOnFtrsResponse() {
    }

    public ManageAddOnFtrsResponse(
           java.lang.String messge,
           com.xius.billing.CAManagement_xsd.FailureType[] failedList) {
           this.messge = messge;
           this.failedList = failedList;
    }


    /**
     * Gets the messge value for this ManageAddOnFtrsResponse.
     * 
     * @return messge
     */
    public java.lang.String getMessge() {
        return messge;
    }


    /**
     * Sets the messge value for this ManageAddOnFtrsResponse.
     * 
     * @param messge
     */
    public void setMessge(java.lang.String messge) {
        this.messge = messge;
    }


    /**
     * Gets the failedList value for this ManageAddOnFtrsResponse.
     * 
     * @return failedList
     */
    public com.xius.billing.CAManagement_xsd.FailureType[] getFailedList() {
        return failedList;
    }


    /**
     * Sets the failedList value for this ManageAddOnFtrsResponse.
     * 
     * @param failedList
     */
    public void setFailedList(com.xius.billing.CAManagement_xsd.FailureType[] failedList) {
        this.failedList = failedList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManageAddOnFtrsResponse)) return false;
        ManageAddOnFtrsResponse other = (ManageAddOnFtrsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.messge==null && other.getMessge()==null) || 
             (this.messge!=null &&
              this.messge.equals(other.getMessge()))) &&
            ((this.failedList==null && other.getFailedList()==null) || 
             (this.failedList!=null &&
              java.util.Arrays.equals(this.failedList, other.getFailedList())));
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
        if (getMessge() != null) {
            _hashCode += getMessge().hashCode();
        }
        if (getFailedList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFailedList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFailedList(), i);
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
        new org.apache.axis.description.TypeDesc(ManageAddOnFtrsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "ManageAddOnFtrsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "messge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "failedList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "FailureType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "failure"));
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
