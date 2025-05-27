/**
 * GetETNotifInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class GetETNotifInfoResponse  implements java.io.Serializable {
    private java.lang.String isSendNotification;

    private java.lang.String rejectReason;

    public GetETNotifInfoResponse() {
    }

    public GetETNotifInfoResponse(
           java.lang.String isSendNotification,
           java.lang.String rejectReason) {
           this.isSendNotification = isSendNotification;
           this.rejectReason = rejectReason;
    }


    /**
     * Gets the isSendNotification value for this GetETNotifInfoResponse.
     * 
     * @return isSendNotification
     */
    public java.lang.String getIsSendNotification() {
        return isSendNotification;
    }


    /**
     * Sets the isSendNotification value for this GetETNotifInfoResponse.
     * 
     * @param isSendNotification
     */
    public void setIsSendNotification(java.lang.String isSendNotification) {
        this.isSendNotification = isSendNotification;
    }


    /**
     * Gets the rejectReason value for this GetETNotifInfoResponse.
     * 
     * @return rejectReason
     */
    public java.lang.String getRejectReason() {
        return rejectReason;
    }


    /**
     * Sets the rejectReason value for this GetETNotifInfoResponse.
     * 
     * @param rejectReason
     */
    public void setRejectReason(java.lang.String rejectReason) {
        this.rejectReason = rejectReason;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetETNotifInfoResponse)) return false;
        GetETNotifInfoResponse other = (GetETNotifInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.isSendNotification==null && other.getIsSendNotification()==null) || 
             (this.isSendNotification!=null &&
              this.isSendNotification.equals(other.getIsSendNotification()))) &&
            ((this.rejectReason==null && other.getRejectReason()==null) || 
             (this.rejectReason!=null &&
              this.rejectReason.equals(other.getRejectReason())));
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
        if (getIsSendNotification() != null) {
            _hashCode += getIsSendNotification().hashCode();
        }
        if (getRejectReason() != null) {
            _hashCode += getRejectReason().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetETNotifInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetETNotifInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSendNotification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "isSendNotification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rejectReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "rejectReason"));
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
