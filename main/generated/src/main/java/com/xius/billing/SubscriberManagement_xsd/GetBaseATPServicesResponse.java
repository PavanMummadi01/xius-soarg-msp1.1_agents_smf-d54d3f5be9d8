/**
 * GetBaseATPServicesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class GetBaseATPServicesResponse  implements java.io.Serializable {
    private com.xius.billing.SubscriberManagement_xsd.ServicePlanType[] atpList;

    public GetBaseATPServicesResponse() {
    }

    public GetBaseATPServicesResponse(
           com.xius.billing.SubscriberManagement_xsd.ServicePlanType[] atpList) {
           this.atpList = atpList;
    }


    /**
     * Gets the atpList value for this GetBaseATPServicesResponse.
     * 
     * @return atpList
     */
    public com.xius.billing.SubscriberManagement_xsd.ServicePlanType[] getAtpList() {
        return atpList;
    }


    /**
     * Sets the atpList value for this GetBaseATPServicesResponse.
     * 
     * @param atpList
     */
    public void setAtpList(com.xius.billing.SubscriberManagement_xsd.ServicePlanType[] atpList) {
        this.atpList = atpList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBaseATPServicesResponse)) return false;
        GetBaseATPServicesResponse other = (GetBaseATPServicesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.atpList==null && other.getAtpList()==null) || 
             (this.atpList!=null &&
              java.util.Arrays.equals(this.atpList, other.getAtpList())));
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
        if (getAtpList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAtpList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAtpList(), i);
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
        new org.apache.axis.description.TypeDesc(GetBaseATPServicesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetBaseATPServicesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atpList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "atpList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ServicePlanType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "atpDetailItem"));
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
