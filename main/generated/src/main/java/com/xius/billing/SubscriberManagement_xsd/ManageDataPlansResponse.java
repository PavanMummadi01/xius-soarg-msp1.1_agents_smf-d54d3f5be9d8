/**
 * ManageDataPlansResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class ManageDataPlansResponse  implements java.io.Serializable {
    private java.lang.String message;

    private com.xius.billing.SubscriberManagement_xsd.PlanDataType[] subSuccessActsData;

    private com.xius.billing.SubscriberManagement_xsd.PlanDataType[] subFailureActsData;

    private com.xius.billing.SubscriberManagement_xsd.PlanDataType[] unSubSuccessActsData;

    private com.xius.billing.SubscriberManagement_xsd.PlanDataType[] unSubFailureActsData;

    public ManageDataPlansResponse() {
    }

    public ManageDataPlansResponse(
           java.lang.String message,
           com.xius.billing.SubscriberManagement_xsd.PlanDataType[] subSuccessActsData,
           com.xius.billing.SubscriberManagement_xsd.PlanDataType[] subFailureActsData,
           com.xius.billing.SubscriberManagement_xsd.PlanDataType[] unSubSuccessActsData,
           com.xius.billing.SubscriberManagement_xsd.PlanDataType[] unSubFailureActsData) {
           this.message = message;
           this.subSuccessActsData = subSuccessActsData;
           this.subFailureActsData = subFailureActsData;
           this.unSubSuccessActsData = unSubSuccessActsData;
           this.unSubFailureActsData = unSubFailureActsData;
    }


    /**
     * Gets the message value for this ManageDataPlansResponse.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this ManageDataPlansResponse.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the subSuccessActsData value for this ManageDataPlansResponse.
     * 
     * @return subSuccessActsData
     */
    public com.xius.billing.SubscriberManagement_xsd.PlanDataType[] getSubSuccessActsData() {
        return subSuccessActsData;
    }


    /**
     * Sets the subSuccessActsData value for this ManageDataPlansResponse.
     * 
     * @param subSuccessActsData
     */
    public void setSubSuccessActsData(com.xius.billing.SubscriberManagement_xsd.PlanDataType[] subSuccessActsData) {
        this.subSuccessActsData = subSuccessActsData;
    }

    public com.xius.billing.SubscriberManagement_xsd.PlanDataType getSubSuccessActsData(int i) {
        return this.subSuccessActsData[i];
    }

    public void setSubSuccessActsData(int i, com.xius.billing.SubscriberManagement_xsd.PlanDataType _value) {
        this.subSuccessActsData[i] = _value;
    }


    /**
     * Gets the subFailureActsData value for this ManageDataPlansResponse.
     * 
     * @return subFailureActsData
     */
    public com.xius.billing.SubscriberManagement_xsd.PlanDataType[] getSubFailureActsData() {
        return subFailureActsData;
    }


    /**
     * Sets the subFailureActsData value for this ManageDataPlansResponse.
     * 
     * @param subFailureActsData
     */
    public void setSubFailureActsData(com.xius.billing.SubscriberManagement_xsd.PlanDataType[] subFailureActsData) {
        this.subFailureActsData = subFailureActsData;
    }

    public com.xius.billing.SubscriberManagement_xsd.PlanDataType getSubFailureActsData(int i) {
        return this.subFailureActsData[i];
    }

    public void setSubFailureActsData(int i, com.xius.billing.SubscriberManagement_xsd.PlanDataType _value) {
        this.subFailureActsData[i] = _value;
    }


    /**
     * Gets the unSubSuccessActsData value for this ManageDataPlansResponse.
     * 
     * @return unSubSuccessActsData
     */
    public com.xius.billing.SubscriberManagement_xsd.PlanDataType[] getUnSubSuccessActsData() {
        return unSubSuccessActsData;
    }


    /**
     * Sets the unSubSuccessActsData value for this ManageDataPlansResponse.
     * 
     * @param unSubSuccessActsData
     */
    public void setUnSubSuccessActsData(com.xius.billing.SubscriberManagement_xsd.PlanDataType[] unSubSuccessActsData) {
        this.unSubSuccessActsData = unSubSuccessActsData;
    }

    public com.xius.billing.SubscriberManagement_xsd.PlanDataType getUnSubSuccessActsData(int i) {
        return this.unSubSuccessActsData[i];
    }

    public void setUnSubSuccessActsData(int i, com.xius.billing.SubscriberManagement_xsd.PlanDataType _value) {
        this.unSubSuccessActsData[i] = _value;
    }


    /**
     * Gets the unSubFailureActsData value for this ManageDataPlansResponse.
     * 
     * @return unSubFailureActsData
     */
    public com.xius.billing.SubscriberManagement_xsd.PlanDataType[] getUnSubFailureActsData() {
        return unSubFailureActsData;
    }


    /**
     * Sets the unSubFailureActsData value for this ManageDataPlansResponse.
     * 
     * @param unSubFailureActsData
     */
    public void setUnSubFailureActsData(com.xius.billing.SubscriberManagement_xsd.PlanDataType[] unSubFailureActsData) {
        this.unSubFailureActsData = unSubFailureActsData;
    }

    public com.xius.billing.SubscriberManagement_xsd.PlanDataType getUnSubFailureActsData(int i) {
        return this.unSubFailureActsData[i];
    }

    public void setUnSubFailureActsData(int i, com.xius.billing.SubscriberManagement_xsd.PlanDataType _value) {
        this.unSubFailureActsData[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManageDataPlansResponse)) return false;
        ManageDataPlansResponse other = (ManageDataPlansResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
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
        int _hashCode = 1;
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
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
        new org.apache.axis.description.TypeDesc(ManageDataPlansResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ManageDataPlansResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subSuccessActsData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "subSuccessActsData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "PlanDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subFailureActsData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "subFailureActsData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "PlanDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unSubSuccessActsData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "unSubSuccessActsData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "PlanDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unSubFailureActsData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "unSubFailureActsData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "PlanDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
