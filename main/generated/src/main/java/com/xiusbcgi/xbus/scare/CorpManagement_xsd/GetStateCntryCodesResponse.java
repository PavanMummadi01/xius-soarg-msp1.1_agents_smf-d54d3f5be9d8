/**
 * GetStateCntryCodesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xiusbcgi.xbus.scare.CorpManagement_xsd;

public class GetStateCntryCodesResponse  implements java.io.Serializable {
    private com.xiusbcgi.xbus.scare.CorpManagement_xsd.StateCntyInfoType[] stateList;

    private com.xiusbcgi.xbus.scare.CorpManagement_xsd.StateCntyInfoType[] countryList;

    public GetStateCntryCodesResponse() {
    }

    public GetStateCntryCodesResponse(
           com.xiusbcgi.xbus.scare.CorpManagement_xsd.StateCntyInfoType[] stateList,
           com.xiusbcgi.xbus.scare.CorpManagement_xsd.StateCntyInfoType[] countryList) {
           this.stateList = stateList;
           this.countryList = countryList;
    }


    /**
     * Gets the stateList value for this GetStateCntryCodesResponse.
     * 
     * @return stateList
     */
    public com.xiusbcgi.xbus.scare.CorpManagement_xsd.StateCntyInfoType[] getStateList() {
        return stateList;
    }


    /**
     * Sets the stateList value for this GetStateCntryCodesResponse.
     * 
     * @param stateList
     */
    public void setStateList(com.xiusbcgi.xbus.scare.CorpManagement_xsd.StateCntyInfoType[] stateList) {
        this.stateList = stateList;
    }


    /**
     * Gets the countryList value for this GetStateCntryCodesResponse.
     * 
     * @return countryList
     */
    public com.xiusbcgi.xbus.scare.CorpManagement_xsd.StateCntyInfoType[] getCountryList() {
        return countryList;
    }


    /**
     * Sets the countryList value for this GetStateCntryCodesResponse.
     * 
     * @param countryList
     */
    public void setCountryList(com.xiusbcgi.xbus.scare.CorpManagement_xsd.StateCntyInfoType[] countryList) {
        this.countryList = countryList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetStateCntryCodesResponse)) return false;
        GetStateCntryCodesResponse other = (GetStateCntryCodesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.stateList==null && other.getStateList()==null) || 
             (this.stateList!=null &&
              java.util.Arrays.equals(this.stateList, other.getStateList()))) &&
            ((this.countryList==null && other.getCountryList()==null) || 
             (this.countryList!=null &&
              java.util.Arrays.equals(this.countryList, other.getCountryList())));
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
        if (getStateList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStateList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStateList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCountryList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCountryList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCountryList(), i);
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
        new org.apache.axis.description.TypeDesc(GetStateCntryCodesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "GetStateCntryCodesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "stateList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "StateCntyInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "stateCntyInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "countryList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "StateCntyInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "stateCntyInfo"));
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
