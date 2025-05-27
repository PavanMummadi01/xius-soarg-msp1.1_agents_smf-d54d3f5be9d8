/**
 * NotifyMessageRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.ne.NotificationManagement_xsd;

public class NotifyMessageRequest  implements java.io.Serializable {
    private com.xius.ne.NotificationManagement_xsd.MessageType messageType;

    public NotifyMessageRequest() {
    }

    public NotifyMessageRequest(
           com.xius.ne.NotificationManagement_xsd.MessageType messageType) {
           this.messageType = messageType;
    }


    /**
     * Gets the messageType value for this NotifyMessageRequest.
     * 
     * @return messageType
     */
    public com.xius.ne.NotificationManagement_xsd.MessageType getMessageType() {
        return messageType;
    }


    /**
     * Sets the messageType value for this NotifyMessageRequest.
     * 
     * @param messageType
     */
    public void setMessageType(com.xius.ne.NotificationManagement_xsd.MessageType messageType) {
        this.messageType = messageType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NotifyMessageRequest)) return false;
        NotifyMessageRequest other = (NotifyMessageRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.messageType==null && other.getMessageType()==null) || 
             (this.messageType!=null &&
              this.messageType.equals(other.getMessageType())));
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
        if (getMessageType() != null) {
            _hashCode += getMessageType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NotifyMessageRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ne.xius.com/NotificationManagement.xsd", "NotifyMessageRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ne.xius.com/NotificationManagement.xsd", "messageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ne.xius.com/NotificationManagement.xsd", "MessageType"));
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
