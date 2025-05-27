/**
 * DeviceHardwareData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.device;

public class DeviceHardwareData  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private java.lang.String IMEI;

    private java.lang.String antennaType;

    private java.lang.String equipmentManufacturer;

    private java.lang.String equipmentModel;

    private java.lang.String equipmentType;

    private java.lang.String simCardNumber;

    private org.apache.axis.message.MessageElement [] _any;

    public DeviceHardwareData() {
    }

    public DeviceHardwareData(
           java.lang.String IMEI,
           java.lang.String antennaType,
           java.lang.String equipmentManufacturer,
           java.lang.String equipmentModel,
           java.lang.String equipmentType,
           java.lang.String simCardNumber,
           org.apache.axis.message.MessageElement [] _any) {
           this.IMEI = IMEI;
           this.antennaType = antennaType;
           this.equipmentManufacturer = equipmentManufacturer;
           this.equipmentModel = equipmentModel;
           this.equipmentType = equipmentType;
           this.simCardNumber = simCardNumber;
           this._any = _any;
    }


    /**
     * Gets the IMEI value for this DeviceHardwareData.
     * 
     * @return IMEI
     */
    public java.lang.String getIMEI() {
        return IMEI;
    }


    /**
     * Sets the IMEI value for this DeviceHardwareData.
     * 
     * @param IMEI
     */
    public void setIMEI(java.lang.String IMEI) {
        this.IMEI = IMEI;
    }


    /**
     * Gets the antennaType value for this DeviceHardwareData.
     * 
     * @return antennaType
     */
    public java.lang.String getAntennaType() {
        return antennaType;
    }


    /**
     * Sets the antennaType value for this DeviceHardwareData.
     * 
     * @param antennaType
     */
    public void setAntennaType(java.lang.String antennaType) {
        this.antennaType = antennaType;
    }


    /**
     * Gets the equipmentManufacturer value for this DeviceHardwareData.
     * 
     * @return equipmentManufacturer
     */
    public java.lang.String getEquipmentManufacturer() {
        return equipmentManufacturer;
    }


    /**
     * Sets the equipmentManufacturer value for this DeviceHardwareData.
     * 
     * @param equipmentManufacturer
     */
    public void setEquipmentManufacturer(java.lang.String equipmentManufacturer) {
        this.equipmentManufacturer = equipmentManufacturer;
    }


    /**
     * Gets the equipmentModel value for this DeviceHardwareData.
     * 
     * @return equipmentModel
     */
    public java.lang.String getEquipmentModel() {
        return equipmentModel;
    }


    /**
     * Sets the equipmentModel value for this DeviceHardwareData.
     * 
     * @param equipmentModel
     */
    public void setEquipmentModel(java.lang.String equipmentModel) {
        this.equipmentModel = equipmentModel;
    }


    /**
     * Gets the equipmentType value for this DeviceHardwareData.
     * 
     * @return equipmentType
     */
    public java.lang.String getEquipmentType() {
        return equipmentType;
    }


    /**
     * Sets the equipmentType value for this DeviceHardwareData.
     * 
     * @param equipmentType
     */
    public void setEquipmentType(java.lang.String equipmentType) {
        this.equipmentType = equipmentType;
    }


    /**
     * Gets the simCardNumber value for this DeviceHardwareData.
     * 
     * @return simCardNumber
     */
    public java.lang.String getSimCardNumber() {
        return simCardNumber;
    }


    /**
     * Sets the simCardNumber value for this DeviceHardwareData.
     * 
     * @param simCardNumber
     */
    public void setSimCardNumber(java.lang.String simCardNumber) {
        this.simCardNumber = simCardNumber;
    }


    /**
     * Gets the _any value for this DeviceHardwareData.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this DeviceHardwareData.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeviceHardwareData)) return false;
        DeviceHardwareData other = (DeviceHardwareData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.IMEI==null && other.getIMEI()==null) || 
             (this.IMEI!=null &&
              this.IMEI.equals(other.getIMEI()))) &&
            ((this.antennaType==null && other.getAntennaType()==null) || 
             (this.antennaType!=null &&
              this.antennaType.equals(other.getAntennaType()))) &&
            ((this.equipmentManufacturer==null && other.getEquipmentManufacturer()==null) || 
             (this.equipmentManufacturer!=null &&
              this.equipmentManufacturer.equals(other.getEquipmentManufacturer()))) &&
            ((this.equipmentModel==null && other.getEquipmentModel()==null) || 
             (this.equipmentModel!=null &&
              this.equipmentModel.equals(other.getEquipmentModel()))) &&
            ((this.equipmentType==null && other.getEquipmentType()==null) || 
             (this.equipmentType!=null &&
              this.equipmentType.equals(other.getEquipmentType()))) &&
            ((this.simCardNumber==null && other.getSimCardNumber()==null) || 
             (this.simCardNumber!=null &&
              this.simCardNumber.equals(other.getSimCardNumber()))) &&
            ((this._any==null && other.get_any()==null) || 
             (this._any!=null &&
              java.util.Arrays.equals(this._any, other.get_any())));
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
        if (getIMEI() != null) {
            _hashCode += getIMEI().hashCode();
        }
        if (getAntennaType() != null) {
            _hashCode += getAntennaType().hashCode();
        }
        if (getEquipmentManufacturer() != null) {
            _hashCode += getEquipmentManufacturer().hashCode();
        }
        if (getEquipmentModel() != null) {
            _hashCode += getEquipmentModel().hashCode();
        }
        if (getEquipmentType() != null) {
            _hashCode += getEquipmentType().hashCode();
        }
        if (getSimCardNumber() != null) {
            _hashCode += getSimCardNumber().hashCode();
        }
        if (get_any() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_any());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_any(), i);
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
        new org.apache.axis.description.TypeDesc(DeviceHardwareData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "DeviceHardwareData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IMEI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "IMEI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("antennaType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "antennaType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("equipmentManufacturer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "equipmentManufacturer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("equipmentModel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "equipmentModel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("equipmentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "equipmentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("simCardNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "simCardNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
