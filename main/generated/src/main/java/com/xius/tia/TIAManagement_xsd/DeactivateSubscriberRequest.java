/**
 * DeactivateSubscriberRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.TIAManagement_xsd;

public class DeactivateSubscriberRequest  implements java.io.Serializable {
    private java.lang.String IMSI;

    private java.lang.String MSISDN;

    private java.lang.String ICC;

    private com.xius.tia.TIAManagement_xsd.SubscriberRequestType subscriberData;

    public DeactivateSubscriberRequest() {
    }

    public DeactivateSubscriberRequest(
           java.lang.String IMSI,
           java.lang.String MSISDN,
           java.lang.String ICC,
           com.xius.tia.TIAManagement_xsd.SubscriberRequestType subscriberData) {
           this.IMSI = IMSI;
           this.MSISDN = MSISDN;
           this.ICC = ICC;
           this.subscriberData = subscriberData;
    }


    /**
     * Gets the IMSI value for this DeactivateSubscriberRequest.
     * 
     * @return IMSI
     */
    public java.lang.String getIMSI() {
        return IMSI;
    }


    /**
     * Sets the IMSI value for this DeactivateSubscriberRequest.
     * 
     * @param IMSI
     */
    public void setIMSI(java.lang.String IMSI) {
        this.IMSI = IMSI;
    }


    /**
     * Gets the MSISDN value for this DeactivateSubscriberRequest.
     * 
     * @return MSISDN
     */
    public java.lang.String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this DeactivateSubscriberRequest.
     * 
     * @param MSISDN
     */
    public void setMSISDN(java.lang.String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the ICC value for this DeactivateSubscriberRequest.
     * 
     * @return ICC
     */
    public java.lang.String getICC() {
        return ICC;
    }


    /**
     * Sets the ICC value for this DeactivateSubscriberRequest.
     * 
     * @param ICC
     */
    public void setICC(java.lang.String ICC) {
        this.ICC = ICC;
    }


    /**
     * Gets the subscriberData value for this DeactivateSubscriberRequest.
     * 
     * @return subscriberData
     */
    public com.xius.tia.TIAManagement_xsd.SubscriberRequestType getSubscriberData() {
        return subscriberData;
    }


    /**
     * Sets the subscriberData value for this DeactivateSubscriberRequest.
     * 
     * @param subscriberData
     */
    public void setSubscriberData(com.xius.tia.TIAManagement_xsd.SubscriberRequestType subscriberData) {
        this.subscriberData = subscriberData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeactivateSubscriberRequest)) return false;
        DeactivateSubscriberRequest other = (DeactivateSubscriberRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.IMSI==null && other.getIMSI()==null) || 
             (this.IMSI!=null &&
              this.IMSI.equals(other.getIMSI()))) &&
            ((this.MSISDN==null && other.getMSISDN()==null) || 
             (this.MSISDN!=null &&
              this.MSISDN.equals(other.getMSISDN()))) &&
            ((this.ICC==null && other.getICC()==null) || 
             (this.ICC!=null &&
              this.ICC.equals(other.getICC()))) &&
            ((this.subscriberData==null && other.getSubscriberData()==null) || 
             (this.subscriberData!=null &&
              this.subscriberData.equals(other.getSubscriberData())));
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
        if (getIMSI() != null) {
            _hashCode += getIMSI().hashCode();
        }
        if (getMSISDN() != null) {
            _hashCode += getMSISDN().hashCode();
        }
        if (getICC() != null) {
            _hashCode += getICC().hashCode();
        }
        if (getSubscriberData() != null) {
            _hashCode += getSubscriberData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeactivateSubscriberRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "DeactivateSubscriberRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IMSI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "IMSI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "MSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ICC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "ICC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "subscriberData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "subscriberRequestType"));
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
