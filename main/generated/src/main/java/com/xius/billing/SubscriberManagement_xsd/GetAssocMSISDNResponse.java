/**
 * GetAssocMSISDNResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class GetAssocMSISDNResponse  implements java.io.Serializable {
    private com.xius.billing.SubscriberManagement_xsd.IDInfoType[] IDInfoList;

    public GetAssocMSISDNResponse() {
    }

    public GetAssocMSISDNResponse(
           com.xius.billing.SubscriberManagement_xsd.IDInfoType[] IDInfoList) {
           this.IDInfoList = IDInfoList;
    }


    /**
     * Gets the IDInfoList value for this GetAssocMSISDNResponse.
     * 
     * @return IDInfoList
     */
    public com.xius.billing.SubscriberManagement_xsd.IDInfoType[] getIDInfoList() {
        return IDInfoList;
    }


    /**
     * Sets the IDInfoList value for this GetAssocMSISDNResponse.
     * 
     * @param IDInfoList
     */
    public void setIDInfoList(com.xius.billing.SubscriberManagement_xsd.IDInfoType[] IDInfoList) {
        this.IDInfoList = IDInfoList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAssocMSISDNResponse)) return false;
        GetAssocMSISDNResponse other = (GetAssocMSISDNResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.IDInfoList==null && other.getIDInfoList()==null) || 
             (this.IDInfoList!=null &&
              java.util.Arrays.equals(this.IDInfoList, other.getIDInfoList())));
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
        if (getIDInfoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIDInfoList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIDInfoList(), i);
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
        new org.apache.axis.description.TypeDesc(GetAssocMSISDNResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetAssocMSISDNResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "IDInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "IDInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "IDInfo"));
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
