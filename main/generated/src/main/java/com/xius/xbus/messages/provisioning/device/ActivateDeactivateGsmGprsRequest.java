/**
 * ActivateDeactivateGsmGprsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.provisioning.device;

public class ActivateDeactivateGsmGprsRequest  extends com.xius.xbus.messages.common.WSRequest  implements java.io.Serializable {
    private java.lang.String deviceValue;

    private com.xius.xbus.messages.common.AccountIdKeyType deviceFlag;

    private com.xius.xbus.messages.provisioning.device.GsmGprsFlag gsmGprsFlag;

    private com.xius.xbus.messages.common.OptionFlagType state;

    public ActivateDeactivateGsmGprsRequest() {
    }

    public ActivateDeactivateGsmGprsRequest(
           com.xius.xbus.messages.common.UserType userType,
           java.lang.String messageID,
           com.xius.xbus.messages.common.SecurityId securityId,
           com.xius.xbus.messages.common.ServiceContext serviceContext,
           java.lang.String version,
           java.lang.String deviceValue,
           com.xius.xbus.messages.common.AccountIdKeyType deviceFlag,
           com.xius.xbus.messages.provisioning.device.GsmGprsFlag gsmGprsFlag,
           com.xius.xbus.messages.common.OptionFlagType state) {
        super(
            userType,
            messageID,
            securityId,
            serviceContext,
            version);
        this.deviceValue = deviceValue;
        this.deviceFlag = deviceFlag;
        this.gsmGprsFlag = gsmGprsFlag;
        this.state = state;
    }


    /**
     * Gets the deviceValue value for this ActivateDeactivateGsmGprsRequest.
     * 
     * @return deviceValue
     */
    public java.lang.String getDeviceValue() {
        return deviceValue;
    }


    /**
     * Sets the deviceValue value for this ActivateDeactivateGsmGprsRequest.
     * 
     * @param deviceValue
     */
    public void setDeviceValue(java.lang.String deviceValue) {
        this.deviceValue = deviceValue;
    }


    /**
     * Gets the deviceFlag value for this ActivateDeactivateGsmGprsRequest.
     * 
     * @return deviceFlag
     */
    public com.xius.xbus.messages.common.AccountIdKeyType getDeviceFlag() {
        return deviceFlag;
    }


    /**
     * Sets the deviceFlag value for this ActivateDeactivateGsmGprsRequest.
     * 
     * @param deviceFlag
     */
    public void setDeviceFlag(com.xius.xbus.messages.common.AccountIdKeyType deviceFlag) {
        this.deviceFlag = deviceFlag;
    }


    /**
     * Gets the gsmGprsFlag value for this ActivateDeactivateGsmGprsRequest.
     * 
     * @return gsmGprsFlag
     */
    public com.xius.xbus.messages.provisioning.device.GsmGprsFlag getGsmGprsFlag() {
        return gsmGprsFlag;
    }


    /**
     * Sets the gsmGprsFlag value for this ActivateDeactivateGsmGprsRequest.
     * 
     * @param gsmGprsFlag
     */
    public void setGsmGprsFlag(com.xius.xbus.messages.provisioning.device.GsmGprsFlag gsmGprsFlag) {
        this.gsmGprsFlag = gsmGprsFlag;
    }


    /**
     * Gets the state value for this ActivateDeactivateGsmGprsRequest.
     * 
     * @return state
     */
    public com.xius.xbus.messages.common.OptionFlagType getState() {
        return state;
    }


    /**
     * Sets the state value for this ActivateDeactivateGsmGprsRequest.
     * 
     * @param state
     */
    public void setState(com.xius.xbus.messages.common.OptionFlagType state) {
        this.state = state;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ActivateDeactivateGsmGprsRequest)) return false;
        ActivateDeactivateGsmGprsRequest other = (ActivateDeactivateGsmGprsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.deviceValue==null && other.getDeviceValue()==null) || 
             (this.deviceValue!=null &&
              this.deviceValue.equals(other.getDeviceValue()))) &&
            ((this.deviceFlag==null && other.getDeviceFlag()==null) || 
             (this.deviceFlag!=null &&
              this.deviceFlag.equals(other.getDeviceFlag()))) &&
            ((this.gsmGprsFlag==null && other.getGsmGprsFlag()==null) || 
             (this.gsmGprsFlag!=null &&
              this.gsmGprsFlag.equals(other.getGsmGprsFlag()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState())));
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
        if (getDeviceValue() != null) {
            _hashCode += getDeviceValue().hashCode();
        }
        if (getDeviceFlag() != null) {
            _hashCode += getDeviceFlag().hashCode();
        }
        if (getGsmGprsFlag() != null) {
            _hashCode += getGsmGprsFlag().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ActivateDeactivateGsmGprsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", ">activateDeactivateGsmGprsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "deviceValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "deviceFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "AccountIdKeyType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gsmGprsFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "gsmGprsFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "GsmGprsFlag"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "OptionFlagType"));
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
