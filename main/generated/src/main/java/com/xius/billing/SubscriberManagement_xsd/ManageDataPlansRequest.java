/**
 * ManageDataPlansRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class ManageDataPlansRequest  implements java.io.Serializable {
    private com.xius.billing.SubscriberManagement_xsd.MSISDNDataType[] msisdnsData;

    private com.xius.billing.SubscriberManagement_xsd.SIMDataType[] simsData;

    private com.xius.billing.SubscriberManagement_xsd.IMSIDataType[] imsisData;

    public ManageDataPlansRequest() {
    }

    public ManageDataPlansRequest(
           com.xius.billing.SubscriberManagement_xsd.MSISDNDataType[] msisdnsData,
           com.xius.billing.SubscriberManagement_xsd.SIMDataType[] simsData,
           com.xius.billing.SubscriberManagement_xsd.IMSIDataType[] imsisData) {
           this.msisdnsData = msisdnsData;
           this.simsData = simsData;
           this.imsisData = imsisData;
    }


    /**
     * Gets the msisdnsData value for this ManageDataPlansRequest.
     * 
     * @return msisdnsData
     */
    public com.xius.billing.SubscriberManagement_xsd.MSISDNDataType[] getMsisdnsData() {
        return msisdnsData;
    }


    /**
     * Sets the msisdnsData value for this ManageDataPlansRequest.
     * 
     * @param msisdnsData
     */
    public void setMsisdnsData(com.xius.billing.SubscriberManagement_xsd.MSISDNDataType[] msisdnsData) {
        this.msisdnsData = msisdnsData;
    }

    public com.xius.billing.SubscriberManagement_xsd.MSISDNDataType getMsisdnsData(int i) {
        return this.msisdnsData[i];
    }

    public void setMsisdnsData(int i, com.xius.billing.SubscriberManagement_xsd.MSISDNDataType _value) {
        this.msisdnsData[i] = _value;
    }


    /**
     * Gets the simsData value for this ManageDataPlansRequest.
     * 
     * @return simsData
     */
    public com.xius.billing.SubscriberManagement_xsd.SIMDataType[] getSimsData() {
        return simsData;
    }


    /**
     * Sets the simsData value for this ManageDataPlansRequest.
     * 
     * @param simsData
     */
    public void setSimsData(com.xius.billing.SubscriberManagement_xsd.SIMDataType[] simsData) {
        this.simsData = simsData;
    }

    public com.xius.billing.SubscriberManagement_xsd.SIMDataType getSimsData(int i) {
        return this.simsData[i];
    }

    public void setSimsData(int i, com.xius.billing.SubscriberManagement_xsd.SIMDataType _value) {
        this.simsData[i] = _value;
    }


    /**
     * Gets the imsisData value for this ManageDataPlansRequest.
     * 
     * @return imsisData
     */
    public com.xius.billing.SubscriberManagement_xsd.IMSIDataType[] getImsisData() {
        return imsisData;
    }


    /**
     * Sets the imsisData value for this ManageDataPlansRequest.
     * 
     * @param imsisData
     */
    public void setImsisData(com.xius.billing.SubscriberManagement_xsd.IMSIDataType[] imsisData) {
        this.imsisData = imsisData;
    }

    public com.xius.billing.SubscriberManagement_xsd.IMSIDataType getImsisData(int i) {
        return this.imsisData[i];
    }

    public void setImsisData(int i, com.xius.billing.SubscriberManagement_xsd.IMSIDataType _value) {
        this.imsisData[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManageDataPlansRequest)) return false;
        ManageDataPlansRequest other = (ManageDataPlansRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.msisdnsData==null && other.getMsisdnsData()==null) || 
             (this.msisdnsData!=null &&
              java.util.Arrays.equals(this.msisdnsData, other.getMsisdnsData()))) &&
            ((this.simsData==null && other.getSimsData()==null) || 
             (this.simsData!=null &&
              java.util.Arrays.equals(this.simsData, other.getSimsData()))) &&
            ((this.imsisData==null && other.getImsisData()==null) || 
             (this.imsisData!=null &&
              java.util.Arrays.equals(this.imsisData, other.getImsisData())));
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
        if (getMsisdnsData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMsisdnsData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMsisdnsData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSimsData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSimsData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSimsData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getImsisData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImsisData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImsisData(), i);
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
        new org.apache.axis.description.TypeDesc(ManageDataPlansRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ManageDataPlansRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdnsData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "msisdnsData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "MSISDNDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("simsData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "simsData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "SIMDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imsisData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "imsisData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "IMSIDataType"));
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
