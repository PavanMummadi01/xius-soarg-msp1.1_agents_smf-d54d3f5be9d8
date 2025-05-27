/**
 * UploadTopUpScheduleResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xiusbcgi.xbus.scare.CorpManagement_xsd;

public class UploadTopUpScheduleResponse  implements java.io.Serializable {
    private java.lang.String messge;

    private com.xiusbcgi.xbus.scare.CorpManagement_xsd.FailureMSISDNsType[] failureMSISDNList;

    public UploadTopUpScheduleResponse() {
    }

    public UploadTopUpScheduleResponse(
           java.lang.String messge,
           com.xiusbcgi.xbus.scare.CorpManagement_xsd.FailureMSISDNsType[] failureMSISDNList) {
           this.messge = messge;
           this.failureMSISDNList = failureMSISDNList;
    }


    /**
     * Gets the messge value for this UploadTopUpScheduleResponse.
     * 
     * @return messge
     */
    public java.lang.String getMessge() {
        return messge;
    }


    /**
     * Sets the messge value for this UploadTopUpScheduleResponse.
     * 
     * @param messge
     */
    public void setMessge(java.lang.String messge) {
        this.messge = messge;
    }


    /**
     * Gets the failureMSISDNList value for this UploadTopUpScheduleResponse.
     * 
     * @return failureMSISDNList
     */
    public com.xiusbcgi.xbus.scare.CorpManagement_xsd.FailureMSISDNsType[] getFailureMSISDNList() {
        return failureMSISDNList;
    }


    /**
     * Sets the failureMSISDNList value for this UploadTopUpScheduleResponse.
     * 
     * @param failureMSISDNList
     */
    public void setFailureMSISDNList(com.xiusbcgi.xbus.scare.CorpManagement_xsd.FailureMSISDNsType[] failureMSISDNList) {
        this.failureMSISDNList = failureMSISDNList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UploadTopUpScheduleResponse)) return false;
        UploadTopUpScheduleResponse other = (UploadTopUpScheduleResponse) obj;
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
            ((this.failureMSISDNList==null && other.getFailureMSISDNList()==null) || 
             (this.failureMSISDNList!=null &&
              java.util.Arrays.equals(this.failureMSISDNList, other.getFailureMSISDNList())));
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
        if (getFailureMSISDNList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFailureMSISDNList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFailureMSISDNList(), i);
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
        new org.apache.axis.description.TypeDesc(UploadTopUpScheduleResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "UploadTopUpScheduleResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "messge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failureMSISDNList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "failureMSISDNList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "FailureMSISDNsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "failureMSISDNs"));
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
