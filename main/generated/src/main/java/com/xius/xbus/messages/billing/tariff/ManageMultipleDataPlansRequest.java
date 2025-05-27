/**
 * ManageMultipleDataPlansRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.tariff;

public class ManageMultipleDataPlansRequest  extends com.xius.xbus.messages.common.WSRequest  implements java.io.Serializable {
    private com.xius.xbus.messages.billing.tariff.MSISDNDataType[] msisdnsData;

    private com.xius.xbus.messages.billing.tariff.SIMDataType[] simsData;

    private com.xius.xbus.messages.billing.tariff.IMSIDataType[] imsisData;

    public ManageMultipleDataPlansRequest() {
    }

    public ManageMultipleDataPlansRequest(
           com.xius.xbus.messages.common.UserType userType,
           java.lang.String messageID,
           com.xius.xbus.messages.common.SecurityId securityId,
           com.xius.xbus.messages.common.ServiceContext serviceContext,
           java.lang.String version,
           com.xius.xbus.messages.billing.tariff.MSISDNDataType[] msisdnsData,
           com.xius.xbus.messages.billing.tariff.SIMDataType[] simsData,
           com.xius.xbus.messages.billing.tariff.IMSIDataType[] imsisData) {
        super(
            userType,
            messageID,
            securityId,
            serviceContext,
            version);
        this.msisdnsData = msisdnsData;
        this.simsData = simsData;
        this.imsisData = imsisData;
    }


    /**
     * Gets the msisdnsData value for this ManageMultipleDataPlansRequest.
     * 
     * @return msisdnsData
     */
    public com.xius.xbus.messages.billing.tariff.MSISDNDataType[] getMsisdnsData() {
        return msisdnsData;
    }


    /**
     * Sets the msisdnsData value for this ManageMultipleDataPlansRequest.
     * 
     * @param msisdnsData
     */
    public void setMsisdnsData(com.xius.xbus.messages.billing.tariff.MSISDNDataType[] msisdnsData) {
        this.msisdnsData = msisdnsData;
    }

    public com.xius.xbus.messages.billing.tariff.MSISDNDataType getMsisdnsData(int i) {
        return this.msisdnsData[i];
    }

    public void setMsisdnsData(int i, com.xius.xbus.messages.billing.tariff.MSISDNDataType _value) {
        this.msisdnsData[i] = _value;
    }


    /**
     * Gets the simsData value for this ManageMultipleDataPlansRequest.
     * 
     * @return simsData
     */
    public com.xius.xbus.messages.billing.tariff.SIMDataType[] getSimsData() {
        return simsData;
    }


    /**
     * Sets the simsData value for this ManageMultipleDataPlansRequest.
     * 
     * @param simsData
     */
    public void setSimsData(com.xius.xbus.messages.billing.tariff.SIMDataType[] simsData) {
        this.simsData = simsData;
    }

    public com.xius.xbus.messages.billing.tariff.SIMDataType getSimsData(int i) {
        return this.simsData[i];
    }

    public void setSimsData(int i, com.xius.xbus.messages.billing.tariff.SIMDataType _value) {
        this.simsData[i] = _value;
    }


    /**
     * Gets the imsisData value for this ManageMultipleDataPlansRequest.
     * 
     * @return imsisData
     */
    public com.xius.xbus.messages.billing.tariff.IMSIDataType[] getImsisData() {
        return imsisData;
    }


    /**
     * Sets the imsisData value for this ManageMultipleDataPlansRequest.
     * 
     * @param imsisData
     */
    public void setImsisData(com.xius.xbus.messages.billing.tariff.IMSIDataType[] imsisData) {
        this.imsisData = imsisData;
    }

    public com.xius.xbus.messages.billing.tariff.IMSIDataType getImsisData(int i) {
        return this.imsisData[i];
    }

    public void setImsisData(int i, com.xius.xbus.messages.billing.tariff.IMSIDataType _value) {
        this.imsisData[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManageMultipleDataPlansRequest)) return false;
        ManageMultipleDataPlansRequest other = (ManageMultipleDataPlansRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
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
        int _hashCode = super.hashCode();
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
        new org.apache.axis.description.TypeDesc(ManageMultipleDataPlansRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">manageMultipleDataPlansRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdnsData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "msisdnsData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "MSISDNDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("simsData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "simsData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "SIMDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imsisData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "imsisData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "IMSIDataType"));
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
