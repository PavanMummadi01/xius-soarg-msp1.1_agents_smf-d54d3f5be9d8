/**
 * ATPSubscriptionWithCCResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.tariff;

public class ATPSubscriptionWithCCResponse  extends com.xius.xbus.messages.common.WSResponse  implements java.io.Serializable {
    private java.lang.String transationId;

    private java.lang.String transationRefNum;

    public ATPSubscriptionWithCCResponse() {
    }

    public ATPSubscriptionWithCCResponse(
           com.xius.xbus.messages.common.StatusCode statusCode,
           java.util.Calendar timeStamp,
           java.lang.String correlationID,
           com.xius.xbus.messages.common.ErrorData[] errors,
           java.lang.String version,
           java.lang.String transationId,
           java.lang.String transationRefNum) {
        super(
            statusCode,
            timeStamp,
            correlationID,
            errors,
            version);
        this.transationId = transationId;
        this.transationRefNum = transationRefNum;
    }


    /**
     * Gets the transationId value for this ATPSubscriptionWithCCResponse.
     * 
     * @return transationId
     */
    public java.lang.String getTransationId() {
        return transationId;
    }


    /**
     * Sets the transationId value for this ATPSubscriptionWithCCResponse.
     * 
     * @param transationId
     */
    public void setTransationId(java.lang.String transationId) {
        this.transationId = transationId;
    }


    /**
     * Gets the transationRefNum value for this ATPSubscriptionWithCCResponse.
     * 
     * @return transationRefNum
     */
    public java.lang.String getTransationRefNum() {
        return transationRefNum;
    }


    /**
     * Sets the transationRefNum value for this ATPSubscriptionWithCCResponse.
     * 
     * @param transationRefNum
     */
    public void setTransationRefNum(java.lang.String transationRefNum) {
        this.transationRefNum = transationRefNum;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ATPSubscriptionWithCCResponse)) return false;
        ATPSubscriptionWithCCResponse other = (ATPSubscriptionWithCCResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.transationId==null && other.getTransationId()==null) || 
             (this.transationId!=null &&
              this.transationId.equals(other.getTransationId()))) &&
            ((this.transationRefNum==null && other.getTransationRefNum()==null) || 
             (this.transationRefNum!=null &&
              this.transationRefNum.equals(other.getTransationRefNum())));
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
        if (getTransationId() != null) {
            _hashCode += getTransationId().hashCode();
        }
        if (getTransationRefNum() != null) {
            _hashCode += getTransationRefNum().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ATPSubscriptionWithCCResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">ATPSubscriptionWithCCResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "transationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transationRefNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "transationRefNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
