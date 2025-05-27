/**
 * ActivateSubscriberRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.TIAManagement_xsd;

public class ActivateSubscriberRequest  implements java.io.Serializable {
    private java.lang.String IMSI;

    private java.lang.String MSISDN;

    private java.lang.String ICC;

    private com.xius.tia.TIAManagement_xsd.SubscriberRequestType subscriberData;

    private java.lang.String directionalType;

    public ActivateSubscriberRequest() {
    }

    public ActivateSubscriberRequest(
           java.lang.String IMSI,
           java.lang.String MSISDN,
           java.lang.String ICC,
           com.xius.tia.TIAManagement_xsd.SubscriberRequestType subscriberData,
           java.lang.String directionalType) {
           this.IMSI = IMSI;
           this.MSISDN = MSISDN;
           this.ICC = ICC;
           this.subscriberData = subscriberData;
           this.directionalType = directionalType;
    }


    /**
     * Gets the IMSI value for this ActivateSubscriberRequest.
     * 
     * @return IMSI
     */
    public java.lang.String getIMSI() {
        return IMSI;
    }


    /**
     * Sets the IMSI value for this ActivateSubscriberRequest.
     * 
     * @param IMSI
     */
    public void setIMSI(java.lang.String IMSI) {
        this.IMSI = IMSI;
    }


    /**
     * Gets the MSISDN value for this ActivateSubscriberRequest.
     * 
     * @return MSISDN
     */
    public java.lang.String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this ActivateSubscriberRequest.
     * 
     * @param MSISDN
     */
    public void setMSISDN(java.lang.String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the ICC value for this ActivateSubscriberRequest.
     * 
     * @return ICC
     */
    public java.lang.String getICC() {
        return ICC;
    }


    /**
     * Sets the ICC value for this ActivateSubscriberRequest.
     * 
     * @param ICC
     */
    public void setICC(java.lang.String ICC) {
        this.ICC = ICC;
    }


    /**
     * Gets the subscriberData value for this ActivateSubscriberRequest.
     * 
     * @return subscriberData
     */
    public com.xius.tia.TIAManagement_xsd.SubscriberRequestType getSubscriberData() {
        return subscriberData;
    }


    /**
     * Sets the subscriberData value for this ActivateSubscriberRequest.
     * 
     * @param subscriberData
     */
    public void setSubscriberData(com.xius.tia.TIAManagement_xsd.SubscriberRequestType subscriberData) {
        this.subscriberData = subscriberData;
    }


    /**
     * Gets the directionalType value for this ActivateSubscriberRequest.
     * 
     * @return directionalType
     */
    public java.lang.String getDirectionalType() {
        return directionalType;
    }


    /**
     * Sets the directionalType value for this ActivateSubscriberRequest.
     * 
     * @param directionalType
     */
    public void setDirectionalType(java.lang.String directionalType) {
        this.directionalType = directionalType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ActivateSubscriberRequest)) return false;
        ActivateSubscriberRequest other = (ActivateSubscriberRequest) obj;
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
              this.subscriberData.equals(other.getSubscriberData()))) &&
            ((this.directionalType==null && other.getDirectionalType()==null) || 
             (this.directionalType!=null &&
              this.directionalType.equals(other.getDirectionalType())));
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
        if (getDirectionalType() != null) {
            _hashCode += getDirectionalType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ActivateSubscriberRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "ActivateSubscriberRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IMSI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "IMSI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "MSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ICC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "ICC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "subscriberData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "subscriberRequestType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("directionalType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "DirectionalType"));
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
