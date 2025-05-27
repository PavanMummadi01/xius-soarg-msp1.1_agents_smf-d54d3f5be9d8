/**
 * TrblTktsPreInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class TrblTktsPreInfoResponse  implements java.io.Serializable {
    private com.xius.billing.AccountManagement_xsd.TktsPreInfoType[] infoList;

    private com.xius.billing.AccountManagement_xsd.TktsPreInfoType[] severityList;

    public TrblTktsPreInfoResponse() {
    }

    public TrblTktsPreInfoResponse(
           com.xius.billing.AccountManagement_xsd.TktsPreInfoType[] infoList,
           com.xius.billing.AccountManagement_xsd.TktsPreInfoType[] severityList) {
           this.infoList = infoList;
           this.severityList = severityList;
    }


    /**
     * Gets the infoList value for this TrblTktsPreInfoResponse.
     * 
     * @return infoList
     */
    public com.xius.billing.AccountManagement_xsd.TktsPreInfoType[] getInfoList() {
        return infoList;
    }


    /**
     * Sets the infoList value for this TrblTktsPreInfoResponse.
     * 
     * @param infoList
     */
    public void setInfoList(com.xius.billing.AccountManagement_xsd.TktsPreInfoType[] infoList) {
        this.infoList = infoList;
    }


    /**
     * Gets the severityList value for this TrblTktsPreInfoResponse.
     * 
     * @return severityList
     */
    public com.xius.billing.AccountManagement_xsd.TktsPreInfoType[] getSeverityList() {
        return severityList;
    }


    /**
     * Sets the severityList value for this TrblTktsPreInfoResponse.
     * 
     * @param severityList
     */
    public void setSeverityList(com.xius.billing.AccountManagement_xsd.TktsPreInfoType[] severityList) {
        this.severityList = severityList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrblTktsPreInfoResponse)) return false;
        TrblTktsPreInfoResponse other = (TrblTktsPreInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.infoList==null && other.getInfoList()==null) || 
             (this.infoList!=null &&
              java.util.Arrays.equals(this.infoList, other.getInfoList()))) &&
            ((this.severityList==null && other.getSeverityList()==null) || 
             (this.severityList!=null &&
              java.util.Arrays.equals(this.severityList, other.getSeverityList())));
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
        if (getInfoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInfoList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInfoList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSeverityList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSeverityList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSeverityList(), i);
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
        new org.apache.axis.description.TypeDesc(TrblTktsPreInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "TrblTktsPreInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infoList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "infoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "TktsPreInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "info"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("severityList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "severityList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "TktsPreInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "info"));
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
