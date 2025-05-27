/**
 * GetSubscriberInfoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class GetSubscriberInfoRequest  implements java.io.Serializable {
    private com.xius.billing.SubscriberManagement_xsd.OptionType option;

    private java.lang.String VMS;

    private java.lang.String IVR;

    private java.lang.String requestFrom;

    public GetSubscriberInfoRequest() {
    }

    public GetSubscriberInfoRequest(
           com.xius.billing.SubscriberManagement_xsd.OptionType option,
           java.lang.String VMS,
           java.lang.String IVR,
           java.lang.String requestFrom) {
           this.option = option;
           this.VMS = VMS;
           this.IVR = IVR;
           this.requestFrom = requestFrom;
    }


    /**
     * Gets the option value for this GetSubscriberInfoRequest.
     * 
     * @return option
     */
    public com.xius.billing.SubscriberManagement_xsd.OptionType getOption() {
        return option;
    }


    /**
     * Sets the option value for this GetSubscriberInfoRequest.
     * 
     * @param option
     */
    public void setOption(com.xius.billing.SubscriberManagement_xsd.OptionType option) {
        this.option = option;
    }


    /**
     * Gets the VMS value for this GetSubscriberInfoRequest.
     * 
     * @return VMS
     */
    public java.lang.String getVMS() {
        return VMS;
    }


    /**
     * Sets the VMS value for this GetSubscriberInfoRequest.
     * 
     * @param VMS
     */
    public void setVMS(java.lang.String VMS) {
        this.VMS = VMS;
    }


    /**
     * Gets the IVR value for this GetSubscriberInfoRequest.
     * 
     * @return IVR
     */
    public java.lang.String getIVR() {
        return IVR;
    }


    /**
     * Sets the IVR value for this GetSubscriberInfoRequest.
     * 
     * @param IVR
     */
    public void setIVR(java.lang.String IVR) {
        this.IVR = IVR;
    }


    /**
     * Gets the requestFrom value for this GetSubscriberInfoRequest.
     * 
     * @return requestFrom
     */
    public java.lang.String getRequestFrom() {
        return requestFrom;
    }


    /**
     * Sets the requestFrom value for this GetSubscriberInfoRequest.
     * 
     * @param requestFrom
     */
    public void setRequestFrom(java.lang.String requestFrom) {
        this.requestFrom = requestFrom;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSubscriberInfoRequest)) return false;
        GetSubscriberInfoRequest other = (GetSubscriberInfoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.option==null && other.getOption()==null) || 
             (this.option!=null &&
              this.option.equals(other.getOption()))) &&
            ((this.VMS==null && other.getVMS()==null) || 
             (this.VMS!=null &&
              this.VMS.equals(other.getVMS()))) &&
            ((this.IVR==null && other.getIVR()==null) || 
             (this.IVR!=null &&
              this.IVR.equals(other.getIVR()))) &&
            ((this.requestFrom==null && other.getRequestFrom()==null) || 
             (this.requestFrom!=null &&
              this.requestFrom.equals(other.getRequestFrom())));
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
        if (getOption() != null) {
            _hashCode += getOption().hashCode();
        }
        if (getVMS() != null) {
            _hashCode += getVMS().hashCode();
        }
        if (getIVR() != null) {
            _hashCode += getIVR().hashCode();
        }
        if (getRequestFrom() != null) {
            _hashCode += getRequestFrom().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSubscriberInfoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetSubscriberInfoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("option");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "option"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "OptionType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VMS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "VMS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IVR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "IVR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "requestFrom"));
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
