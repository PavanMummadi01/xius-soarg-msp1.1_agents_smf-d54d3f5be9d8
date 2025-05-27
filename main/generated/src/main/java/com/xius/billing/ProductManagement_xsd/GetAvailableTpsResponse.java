/**
 * GetAvailableTpsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.ProductManagement_xsd;

public class GetAvailableTpsResponse  implements java.io.Serializable {
    private com.xius.billing.ProductManagement_xsd.PlansType[] avilableplans;

    public GetAvailableTpsResponse() {
    }

    public GetAvailableTpsResponse(
           com.xius.billing.ProductManagement_xsd.PlansType[] avilableplans) {
           this.avilableplans = avilableplans;
    }


    /**
     * Gets the avilableplans value for this GetAvailableTpsResponse.
     * 
     * @return avilableplans
     */
    public com.xius.billing.ProductManagement_xsd.PlansType[] getAvilableplans() {
        return avilableplans;
    }


    /**
     * Sets the avilableplans value for this GetAvailableTpsResponse.
     * 
     * @param avilableplans
     */
    public void setAvilableplans(com.xius.billing.ProductManagement_xsd.PlansType[] avilableplans) {
        this.avilableplans = avilableplans;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAvailableTpsResponse)) return false;
        GetAvailableTpsResponse other = (GetAvailableTpsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.avilableplans==null && other.getAvilableplans()==null) || 
             (this.avilableplans!=null &&
              java.util.Arrays.equals(this.avilableplans, other.getAvilableplans())));
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
        if (getAvilableplans() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvilableplans());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvilableplans(), i);
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
        new org.apache.axis.description.TypeDesc(GetAvailableTpsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getAvailableTpsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avilableplans");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "Avilableplans"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "plansType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "planlistName"));
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
