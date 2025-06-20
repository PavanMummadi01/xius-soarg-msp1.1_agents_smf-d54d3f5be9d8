/**
 * GetCARenewalsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.CAManagement_xsd;

public class GetCARenewalsResponse  implements java.io.Serializable {
    private com.xius.billing.CAManagement_xsd.CARenewalType[] caRenewals;

    public GetCARenewalsResponse() {
    }

    public GetCARenewalsResponse(
           com.xius.billing.CAManagement_xsd.CARenewalType[] caRenewals) {
           this.caRenewals = caRenewals;
    }


    /**
     * Gets the caRenewals value for this GetCARenewalsResponse.
     * 
     * @return caRenewals
     */
    public com.xius.billing.CAManagement_xsd.CARenewalType[] getCaRenewals() {
        return caRenewals;
    }


    /**
     * Sets the caRenewals value for this GetCARenewalsResponse.
     * 
     * @param caRenewals
     */
    public void setCaRenewals(com.xius.billing.CAManagement_xsd.CARenewalType[] caRenewals) {
        this.caRenewals = caRenewals;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCARenewalsResponse)) return false;
        GetCARenewalsResponse other = (GetCARenewalsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.caRenewals==null && other.getCaRenewals()==null) || 
             (this.caRenewals!=null &&
              java.util.Arrays.equals(this.caRenewals, other.getCaRenewals())));
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
        if (getCaRenewals() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCaRenewals());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCaRenewals(), i);
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
        new org.apache.axis.description.TypeDesc(GetCARenewalsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "GetCARenewalsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caRenewals");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "caRenewals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "CARenewalType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "renewalInfo"));
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
