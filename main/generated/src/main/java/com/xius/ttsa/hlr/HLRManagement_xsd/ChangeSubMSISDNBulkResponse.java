/**
 * ChangeSubMSISDNBulkResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.ttsa.hlr.HLRManagement_xsd;

public class ChangeSubMSISDNBulkResponse  implements java.io.Serializable {
    private long[] failedPortInList;

    private java.lang.String[] failedPortInMessages;

    public ChangeSubMSISDNBulkResponse() {
    }

    public ChangeSubMSISDNBulkResponse(
           long[] failedPortInList,
           java.lang.String[] failedPortInMessages) {
           this.failedPortInList = failedPortInList;
           this.failedPortInMessages = failedPortInMessages;
    }


    /**
     * Gets the failedPortInList value for this ChangeSubMSISDNBulkResponse.
     * 
     * @return failedPortInList
     */
    public long[] getFailedPortInList() {
        return failedPortInList;
    }


    /**
     * Sets the failedPortInList value for this ChangeSubMSISDNBulkResponse.
     * 
     * @param failedPortInList
     */
    public void setFailedPortInList(long[] failedPortInList) {
        this.failedPortInList = failedPortInList;
    }

    public long getFailedPortInList(int i) {
        return this.failedPortInList[i];
    }

    public void setFailedPortInList(int i, long _value) {
        this.failedPortInList[i] = _value;
    }


    /**
     * Gets the failedPortInMessages value for this ChangeSubMSISDNBulkResponse.
     * 
     * @return failedPortInMessages
     */
    public java.lang.String[] getFailedPortInMessages() {
        return failedPortInMessages;
    }


    /**
     * Sets the failedPortInMessages value for this ChangeSubMSISDNBulkResponse.
     * 
     * @param failedPortInMessages
     */
    public void setFailedPortInMessages(java.lang.String[] failedPortInMessages) {
        this.failedPortInMessages = failedPortInMessages;
    }

    public java.lang.String getFailedPortInMessages(int i) {
        return this.failedPortInMessages[i];
    }

    public void setFailedPortInMessages(int i, java.lang.String _value) {
        this.failedPortInMessages[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeSubMSISDNBulkResponse)) return false;
        ChangeSubMSISDNBulkResponse other = (ChangeSubMSISDNBulkResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.failedPortInList==null && other.getFailedPortInList()==null) || 
             (this.failedPortInList!=null &&
              java.util.Arrays.equals(this.failedPortInList, other.getFailedPortInList()))) &&
            ((this.failedPortInMessages==null && other.getFailedPortInMessages()==null) || 
             (this.failedPortInMessages!=null &&
              java.util.Arrays.equals(this.failedPortInMessages, other.getFailedPortInMessages())));
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
        if (getFailedPortInList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFailedPortInList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFailedPortInList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFailedPortInMessages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFailedPortInMessages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFailedPortInMessages(), i);
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
        new org.apache.axis.description.TypeDesc(ChangeSubMSISDNBulkResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "ChangeSubMSISDNBulkResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedPortInList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "failedPortInList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedPortInMessages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "failedPortInMessages"));
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
