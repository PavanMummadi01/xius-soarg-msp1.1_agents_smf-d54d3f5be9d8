/**
 * ChangeDeviceResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.provisioning.device;

public class ChangeDeviceResponse  extends com.xius.xbus.messages.common.WSResponse  implements java.io.Serializable {
    private java.lang.String oldValue;

    private java.lang.String newValue;

    private java.lang.String failedNode;

    public ChangeDeviceResponse() {
    }

    public ChangeDeviceResponse(
           com.xius.xbus.messages.common.StatusCode statusCode,
           java.util.Calendar timeStamp,
           java.lang.String correlationID,
           com.xius.xbus.messages.common.ErrorData[] errors,
           java.lang.String version,
           java.lang.String oldValue,
           java.lang.String newValue,
           java.lang.String failedNode) {
        super(
            statusCode,
            timeStamp,
            correlationID,
            errors,
            version);
        this.oldValue = oldValue;
        this.newValue = newValue;
        this.failedNode = failedNode;
    }


    /**
     * Gets the oldValue value for this ChangeDeviceResponse.
     * 
     * @return oldValue
     */
    public java.lang.String getOldValue() {
        return oldValue;
    }


    /**
     * Sets the oldValue value for this ChangeDeviceResponse.
     * 
     * @param oldValue
     */
    public void setOldValue(java.lang.String oldValue) {
        this.oldValue = oldValue;
    }


    /**
     * Gets the newValue value for this ChangeDeviceResponse.
     * 
     * @return newValue
     */
    public java.lang.String getNewValue() {
        return newValue;
    }


    /**
     * Sets the newValue value for this ChangeDeviceResponse.
     * 
     * @param newValue
     */
    public void setNewValue(java.lang.String newValue) {
        this.newValue = newValue;
    }


    /**
     * Gets the failedNode value for this ChangeDeviceResponse.
     * 
     * @return failedNode
     */
    public java.lang.String getFailedNode() {
        return failedNode;
    }


    /**
     * Sets the failedNode value for this ChangeDeviceResponse.
     * 
     * @param failedNode
     */
    public void setFailedNode(java.lang.String failedNode) {
        this.failedNode = failedNode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeDeviceResponse)) return false;
        ChangeDeviceResponse other = (ChangeDeviceResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.oldValue==null && other.getOldValue()==null) || 
             (this.oldValue!=null &&
              this.oldValue.equals(other.getOldValue()))) &&
            ((this.newValue==null && other.getNewValue()==null) || 
             (this.newValue!=null &&
              this.newValue.equals(other.getNewValue()))) &&
            ((this.failedNode==null && other.getFailedNode()==null) || 
             (this.failedNode!=null &&
              this.failedNode.equals(other.getFailedNode())));
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
        if (getOldValue() != null) {
            _hashCode += getOldValue().hashCode();
        }
        if (getNewValue() != null) {
            _hashCode += getNewValue().hashCode();
        }
        if (getFailedNode() != null) {
            _hashCode += getFailedNode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeDeviceResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", ">changeDeviceResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "oldValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "newValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedNode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "failedNode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
