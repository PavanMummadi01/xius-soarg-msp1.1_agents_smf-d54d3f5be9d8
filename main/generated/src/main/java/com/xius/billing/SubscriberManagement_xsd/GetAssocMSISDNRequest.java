/**
 * GetAssocMSISDNRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class GetAssocMSISDNRequest  implements java.io.Serializable {
    private com.xius.billing.SubscriberManagement_xsd.IDInformationType[] IDInformationList;

    private java.lang.String userType;

    public GetAssocMSISDNRequest() {
    }

    public GetAssocMSISDNRequest(
           com.xius.billing.SubscriberManagement_xsd.IDInformationType[] IDInformationList,
           java.lang.String userType) {
           this.IDInformationList = IDInformationList;
           this.userType = userType;
    }


    /**
     * Gets the IDInformationList value for this GetAssocMSISDNRequest.
     * 
     * @return IDInformationList
     */
    public com.xius.billing.SubscriberManagement_xsd.IDInformationType[] getIDInformationList() {
        return IDInformationList;
    }


    /**
     * Sets the IDInformationList value for this GetAssocMSISDNRequest.
     * 
     * @param IDInformationList
     */
    public void setIDInformationList(com.xius.billing.SubscriberManagement_xsd.IDInformationType[] IDInformationList) {
        this.IDInformationList = IDInformationList;
    }


    /**
     * Gets the userType value for this GetAssocMSISDNRequest.
     * 
     * @return userType
     */
    public java.lang.String getUserType() {
        return userType;
    }


    /**
     * Sets the userType value for this GetAssocMSISDNRequest.
     * 
     * @param userType
     */
    public void setUserType(java.lang.String userType) {
        this.userType = userType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAssocMSISDNRequest)) return false;
        GetAssocMSISDNRequest other = (GetAssocMSISDNRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.IDInformationList==null && other.getIDInformationList()==null) || 
             (this.IDInformationList!=null &&
              java.util.Arrays.equals(this.IDInformationList, other.getIDInformationList()))) &&
            ((this.userType==null && other.getUserType()==null) || 
             (this.userType!=null &&
              this.userType.equals(other.getUserType())));
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
        if (getIDInformationList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIDInformationList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIDInformationList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUserType() != null) {
            _hashCode += getUserType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAssocMSISDNRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetAssocMSISDNRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDInformationList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "IDInformationList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "IDInformationType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "IDInformation"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "userType"));
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
