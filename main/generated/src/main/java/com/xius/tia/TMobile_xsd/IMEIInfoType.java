/**
 * IMEIInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.TMobile_xsd;

public class IMEIInfoType  implements java.io.Serializable {
    private java.lang.String IMEI;

    private java.lang.String make;

    private java.lang.String model;

    private java.lang.String lastUpdateDateTime;

    private java.lang.String blocked;

    private java.lang.String reason;

    public IMEIInfoType() {
    }

    public IMEIInfoType(
           java.lang.String IMEI,
           java.lang.String make,
           java.lang.String model,
           java.lang.String lastUpdateDateTime,
           java.lang.String blocked,
           java.lang.String reason) {
           this.IMEI = IMEI;
           this.make = make;
           this.model = model;
           this.lastUpdateDateTime = lastUpdateDateTime;
           this.blocked = blocked;
           this.reason = reason;
    }


    /**
     * Gets the IMEI value for this IMEIInfoType.
     * 
     * @return IMEI
     */
    public java.lang.String getIMEI() {
        return IMEI;
    }


    /**
     * Sets the IMEI value for this IMEIInfoType.
     * 
     * @param IMEI
     */
    public void setIMEI(java.lang.String IMEI) {
        this.IMEI = IMEI;
    }


    /**
     * Gets the make value for this IMEIInfoType.
     * 
     * @return make
     */
    public java.lang.String getMake() {
        return make;
    }


    /**
     * Sets the make value for this IMEIInfoType.
     * 
     * @param make
     */
    public void setMake(java.lang.String make) {
        this.make = make;
    }


    /**
     * Gets the model value for this IMEIInfoType.
     * 
     * @return model
     */
    public java.lang.String getModel() {
        return model;
    }


    /**
     * Sets the model value for this IMEIInfoType.
     * 
     * @param model
     */
    public void setModel(java.lang.String model) {
        this.model = model;
    }


    /**
     * Gets the lastUpdateDateTime value for this IMEIInfoType.
     * 
     * @return lastUpdateDateTime
     */
    public java.lang.String getLastUpdateDateTime() {
        return lastUpdateDateTime;
    }


    /**
     * Sets the lastUpdateDateTime value for this IMEIInfoType.
     * 
     * @param lastUpdateDateTime
     */
    public void setLastUpdateDateTime(java.lang.String lastUpdateDateTime) {
        this.lastUpdateDateTime = lastUpdateDateTime;
    }


    /**
     * Gets the blocked value for this IMEIInfoType.
     * 
     * @return blocked
     */
    public java.lang.String getBlocked() {
        return blocked;
    }


    /**
     * Sets the blocked value for this IMEIInfoType.
     * 
     * @param blocked
     */
    public void setBlocked(java.lang.String blocked) {
        this.blocked = blocked;
    }


    /**
     * Gets the reason value for this IMEIInfoType.
     * 
     * @return reason
     */
    public java.lang.String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this IMEIInfoType.
     * 
     * @param reason
     */
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IMEIInfoType)) return false;
        IMEIInfoType other = (IMEIInfoType) obj;
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
            ((this.make==null && other.getMake()==null) || 
             (this.make!=null &&
              this.make.equals(other.getMake()))) &&
            ((this.model==null && other.getModel()==null) || 
             (this.model!=null &&
              this.model.equals(other.getModel()))) &&
            ((this.lastUpdateDateTime==null && other.getLastUpdateDateTime()==null) || 
             (this.lastUpdateDateTime!=null &&
              this.lastUpdateDateTime.equals(other.getLastUpdateDateTime()))) &&
            ((this.blocked==null && other.getBlocked()==null) || 
             (this.blocked!=null &&
              this.blocked.equals(other.getBlocked()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason())));
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
        if (getMake() != null) {
            _hashCode += getMake().hashCode();
        }
        if (getModel() != null) {
            _hashCode += getModel().hashCode();
        }
        if (getLastUpdateDateTime() != null) {
            _hashCode += getLastUpdateDateTime().hashCode();
        }
        if (getBlocked() != null) {
            _hashCode += getBlocked().hashCode();
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IMEIInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "IMEIInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IMEI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "IMEI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("make");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "make"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("model");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "model"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastUpdateDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "lastUpdateDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blocked");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "blocked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "reason"));
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
