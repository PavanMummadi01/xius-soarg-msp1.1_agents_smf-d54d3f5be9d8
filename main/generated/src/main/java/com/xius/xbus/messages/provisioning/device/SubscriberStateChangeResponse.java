/**
 * SubscriberStateChangeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.provisioning.device;

public class SubscriberStateChangeResponse  extends com.xius.xbus.messages.common.WSResponse  implements java.io.Serializable {
    private java.lang.String oldStatus;

    private java.lang.String currentSatus;

    private java.lang.String transactionId;

    private java.lang.String transactionRefNum;

    public SubscriberStateChangeResponse() {
    }

    public SubscriberStateChangeResponse(
           com.xius.xbus.messages.common.StatusCode statusCode,
           java.util.Calendar timeStamp,
           java.lang.String correlationID,
           com.xius.xbus.messages.common.ErrorData[] errors,
           java.lang.String version,
           java.lang.String oldStatus,
           java.lang.String currentSatus,
           java.lang.String transactionId,
           java.lang.String transactionRefNum) {
        super(
            statusCode,
            timeStamp,
            correlationID,
            errors,
            version);
        this.oldStatus = oldStatus;
        this.currentSatus = currentSatus;
        this.transactionId = transactionId;
        this.transactionRefNum = transactionRefNum;
    }


    /**
     * Gets the oldStatus value for this SubscriberStateChangeResponse.
     * 
     * @return oldStatus
     */
    public java.lang.String getOldStatus() {
        return oldStatus;
    }


    /**
     * Sets the oldStatus value for this SubscriberStateChangeResponse.
     * 
     * @param oldStatus
     */
    public void setOldStatus(java.lang.String oldStatus) {
        this.oldStatus = oldStatus;
    }


    /**
     * Gets the currentSatus value for this SubscriberStateChangeResponse.
     * 
     * @return currentSatus
     */
    public java.lang.String getCurrentSatus() {
        return currentSatus;
    }


    /**
     * Sets the currentSatus value for this SubscriberStateChangeResponse.
     * 
     * @param currentSatus
     */
    public void setCurrentSatus(java.lang.String currentSatus) {
        this.currentSatus = currentSatus;
    }


    /**
     * Gets the transactionId value for this SubscriberStateChangeResponse.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this SubscriberStateChangeResponse.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the transactionRefNum value for this SubscriberStateChangeResponse.
     * 
     * @return transactionRefNum
     */
    public java.lang.String getTransactionRefNum() {
        return transactionRefNum;
    }


    /**
     * Sets the transactionRefNum value for this SubscriberStateChangeResponse.
     * 
     * @param transactionRefNum
     */
    public void setTransactionRefNum(java.lang.String transactionRefNum) {
        this.transactionRefNum = transactionRefNum;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubscriberStateChangeResponse)) return false;
        SubscriberStateChangeResponse other = (SubscriberStateChangeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.oldStatus==null && other.getOldStatus()==null) || 
             (this.oldStatus!=null &&
              this.oldStatus.equals(other.getOldStatus()))) &&
            ((this.currentSatus==null && other.getCurrentSatus()==null) || 
             (this.currentSatus!=null &&
              this.currentSatus.equals(other.getCurrentSatus()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.transactionRefNum==null && other.getTransactionRefNum()==null) || 
             (this.transactionRefNum!=null &&
              this.transactionRefNum.equals(other.getTransactionRefNum())));
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
        if (getOldStatus() != null) {
            _hashCode += getOldStatus().hashCode();
        }
        if (getCurrentSatus() != null) {
            _hashCode += getCurrentSatus().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getTransactionRefNum() != null) {
            _hashCode += getTransactionRefNum().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubscriberStateChangeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", ">subscriberStateChangeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "oldStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentSatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "currentSatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "transactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionRefNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "transactionRefNum"));
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
