/**
 * UpdateBillingTypeRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class UpdateBillingTypeRequest  implements java.io.Serializable {
    private com.xius.billing.AccountManagement_xsd.BillingTypeData[] billingTypeList;

    private com.xius.billing.AccountManagement_xsd.OfficeDataType officeData;

    public UpdateBillingTypeRequest() {
    }

    public UpdateBillingTypeRequest(
           com.xius.billing.AccountManagement_xsd.BillingTypeData[] billingTypeList,
           com.xius.billing.AccountManagement_xsd.OfficeDataType officeData) {
           this.billingTypeList = billingTypeList;
           this.officeData = officeData;
    }


    /**
     * Gets the billingTypeList value for this UpdateBillingTypeRequest.
     * 
     * @return billingTypeList
     */
    public com.xius.billing.AccountManagement_xsd.BillingTypeData[] getBillingTypeList() {
        return billingTypeList;
    }


    /**
     * Sets the billingTypeList value for this UpdateBillingTypeRequest.
     * 
     * @param billingTypeList
     */
    public void setBillingTypeList(com.xius.billing.AccountManagement_xsd.BillingTypeData[] billingTypeList) {
        this.billingTypeList = billingTypeList;
    }


    /**
     * Gets the officeData value for this UpdateBillingTypeRequest.
     * 
     * @return officeData
     */
    public com.xius.billing.AccountManagement_xsd.OfficeDataType getOfficeData() {
        return officeData;
    }


    /**
     * Sets the officeData value for this UpdateBillingTypeRequest.
     * 
     * @param officeData
     */
    public void setOfficeData(com.xius.billing.AccountManagement_xsd.OfficeDataType officeData) {
        this.officeData = officeData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateBillingTypeRequest)) return false;
        UpdateBillingTypeRequest other = (UpdateBillingTypeRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billingTypeList==null && other.getBillingTypeList()==null) || 
             (this.billingTypeList!=null &&
              java.util.Arrays.equals(this.billingTypeList, other.getBillingTypeList()))) &&
            ((this.officeData==null && other.getOfficeData()==null) || 
             (this.officeData!=null &&
              this.officeData.equals(other.getOfficeData())));
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
        if (getBillingTypeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillingTypeList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillingTypeList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOfficeData() != null) {
            _hashCode += getOfficeData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateBillingTypeRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "UpdateBillingTypeRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingTypeList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "billingTypeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "BillingTypeData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "BillingTypeData"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officeData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "officeData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "OfficeDataType"));
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
