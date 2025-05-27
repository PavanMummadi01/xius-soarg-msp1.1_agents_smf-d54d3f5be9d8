/**
 * ManageMultipleDataPlansResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.tariff;

public class ManageMultipleDataPlansResponse  extends com.xius.xbus.messages.common.WSResponse  implements java.io.Serializable {
    private com.xius.xbus.messages.billing.tariff.PlanDataType[] subSuccessActsData;

    private com.xius.xbus.messages.billing.tariff.PlanDataType[] subFailureActsData;

    private com.xius.xbus.messages.billing.tariff.PlanDataType[] unSubSuccessActsData;

    private com.xius.xbus.messages.billing.tariff.PlanDataType[] unSubFailureActsData;

    public ManageMultipleDataPlansResponse() {
    }

    public ManageMultipleDataPlansResponse(
           com.xius.xbus.messages.common.StatusCode statusCode,
           java.util.Calendar timeStamp,
           java.lang.String correlationID,
           com.xius.xbus.messages.common.ErrorData[] errors,
           java.lang.String version,
           com.xius.xbus.messages.billing.tariff.PlanDataType[] subSuccessActsData,
           com.xius.xbus.messages.billing.tariff.PlanDataType[] subFailureActsData,
           com.xius.xbus.messages.billing.tariff.PlanDataType[] unSubSuccessActsData,
           com.xius.xbus.messages.billing.tariff.PlanDataType[] unSubFailureActsData) {
        super(
            statusCode,
            timeStamp,
            correlationID,
            errors,
            version);
        this.subSuccessActsData = subSuccessActsData;
        this.subFailureActsData = subFailureActsData;
        this.unSubSuccessActsData = unSubSuccessActsData;
        this.unSubFailureActsData = unSubFailureActsData;
    }


    /**
     * Gets the subSuccessActsData value for this ManageMultipleDataPlansResponse.
     * 
     * @return subSuccessActsData
     */
    public com.xius.xbus.messages.billing.tariff.PlanDataType[] getSubSuccessActsData() {
        return subSuccessActsData;
    }


    /**
     * Sets the subSuccessActsData value for this ManageMultipleDataPlansResponse.
     * 
     * @param subSuccessActsData
     */
    public void setSubSuccessActsData(com.xius.xbus.messages.billing.tariff.PlanDataType[] subSuccessActsData) {
        this.subSuccessActsData = subSuccessActsData;
    }


    /**
     * Gets the subFailureActsData value for this ManageMultipleDataPlansResponse.
     * 
     * @return subFailureActsData
     */
    public com.xius.xbus.messages.billing.tariff.PlanDataType[] getSubFailureActsData() {
        return subFailureActsData;
    }


    /**
     * Sets the subFailureActsData value for this ManageMultipleDataPlansResponse.
     * 
     * @param subFailureActsData
     */
    public void setSubFailureActsData(com.xius.xbus.messages.billing.tariff.PlanDataType[] subFailureActsData) {
        this.subFailureActsData = subFailureActsData;
    }


    /**
     * Gets the unSubSuccessActsData value for this ManageMultipleDataPlansResponse.
     * 
     * @return unSubSuccessActsData
     */
    public com.xius.xbus.messages.billing.tariff.PlanDataType[] getUnSubSuccessActsData() {
        return unSubSuccessActsData;
    }


    /**
     * Sets the unSubSuccessActsData value for this ManageMultipleDataPlansResponse.
     * 
     * @param unSubSuccessActsData
     */
    public void setUnSubSuccessActsData(com.xius.xbus.messages.billing.tariff.PlanDataType[] unSubSuccessActsData) {
        this.unSubSuccessActsData = unSubSuccessActsData;
    }


    /**
     * Gets the unSubFailureActsData value for this ManageMultipleDataPlansResponse.
     * 
     * @return unSubFailureActsData
     */
    public com.xius.xbus.messages.billing.tariff.PlanDataType[] getUnSubFailureActsData() {
        return unSubFailureActsData;
    }


    /**
     * Sets the unSubFailureActsData value for this ManageMultipleDataPlansResponse.
     * 
     * @param unSubFailureActsData
     */
    public void setUnSubFailureActsData(com.xius.xbus.messages.billing.tariff.PlanDataType[] unSubFailureActsData) {
        this.unSubFailureActsData = unSubFailureActsData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManageMultipleDataPlansResponse)) return false;
        ManageMultipleDataPlansResponse other = (ManageMultipleDataPlansResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.subSuccessActsData==null && other.getSubSuccessActsData()==null) || 
             (this.subSuccessActsData!=null &&
              java.util.Arrays.equals(this.subSuccessActsData, other.getSubSuccessActsData()))) &&
            ((this.subFailureActsData==null && other.getSubFailureActsData()==null) || 
             (this.subFailureActsData!=null &&
              java.util.Arrays.equals(this.subFailureActsData, other.getSubFailureActsData()))) &&
            ((this.unSubSuccessActsData==null && other.getUnSubSuccessActsData()==null) || 
             (this.unSubSuccessActsData!=null &&
              java.util.Arrays.equals(this.unSubSuccessActsData, other.getUnSubSuccessActsData()))) &&
            ((this.unSubFailureActsData==null && other.getUnSubFailureActsData()==null) || 
             (this.unSubFailureActsData!=null &&
              java.util.Arrays.equals(this.unSubFailureActsData, other.getUnSubFailureActsData())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getSubSuccessActsData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubSuccessActsData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubSuccessActsData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubFailureActsData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubFailureActsData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubFailureActsData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUnSubSuccessActsData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnSubSuccessActsData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnSubSuccessActsData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUnSubFailureActsData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnSubFailureActsData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnSubFailureActsData(), i);
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
        new org.apache.axis.description.TypeDesc(ManageMultipleDataPlansResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">manageMultipleDataPlansResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subSuccessActsData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "subSuccessActsData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "PlanDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "dataPlanData"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subFailureActsData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "subFailureActsData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "PlanDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "dataPlanData"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unSubSuccessActsData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "unSubSuccessActsData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "PlanDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "dataPlanData"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unSubFailureActsData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "unSubFailureActsData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "PlanDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "dataPlanData"));
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
