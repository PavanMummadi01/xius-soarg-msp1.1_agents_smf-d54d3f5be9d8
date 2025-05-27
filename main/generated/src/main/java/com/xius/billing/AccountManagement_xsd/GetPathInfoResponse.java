/**
 * GetPathInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class GetPathInfoResponse  implements java.io.Serializable {
    private com.xius.billing.AccountManagement_xsd.PathInfoType[] pathDetails;

    public GetPathInfoResponse() {
    }

    public GetPathInfoResponse(
           com.xius.billing.AccountManagement_xsd.PathInfoType[] pathDetails) {
           this.pathDetails = pathDetails;
    }


    /**
     * Gets the pathDetails value for this GetPathInfoResponse.
     * 
     * @return pathDetails
     */
    public com.xius.billing.AccountManagement_xsd.PathInfoType[] getPathDetails() {
        return pathDetails;
    }


    /**
     * Sets the pathDetails value for this GetPathInfoResponse.
     * 
     * @param pathDetails
     */
    public void setPathDetails(com.xius.billing.AccountManagement_xsd.PathInfoType[] pathDetails) {
        this.pathDetails = pathDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPathInfoResponse)) return false;
        GetPathInfoResponse other = (GetPathInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pathDetails==null && other.getPathDetails()==null) || 
             (this.pathDetails!=null &&
              java.util.Arrays.equals(this.pathDetails, other.getPathDetails())));
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
        if (getPathDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPathDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPathDetails(), i);
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
        new org.apache.axis.description.TypeDesc(GetPathInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetPathInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pathDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "pathDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "PathInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "pathInfo"));
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
