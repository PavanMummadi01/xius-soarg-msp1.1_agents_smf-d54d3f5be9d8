/**
 * ThresholdInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.TMobile_xsd;

public class ThresholdInfoType  implements java.io.Serializable {
    private java.lang.String thresholdType;

    private java.lang.String type;

    private java.lang.String behavior;

    public ThresholdInfoType() {
    }

    public ThresholdInfoType(
           java.lang.String thresholdType,
           java.lang.String type,
           java.lang.String behavior) {
           this.thresholdType = thresholdType;
           this.type = type;
           this.behavior = behavior;
    }


    /**
     * Gets the thresholdType value for this ThresholdInfoType.
     * 
     * @return thresholdType
     */
    public java.lang.String getThresholdType() {
        return thresholdType;
    }


    /**
     * Sets the thresholdType value for this ThresholdInfoType.
     * 
     * @param thresholdType
     */
    public void setThresholdType(java.lang.String thresholdType) {
        this.thresholdType = thresholdType;
    }


    /**
     * Gets the type value for this ThresholdInfoType.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this ThresholdInfoType.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the behavior value for this ThresholdInfoType.
     * 
     * @return behavior
     */
    public java.lang.String getBehavior() {
        return behavior;
    }


    /**
     * Sets the behavior value for this ThresholdInfoType.
     * 
     * @param behavior
     */
    public void setBehavior(java.lang.String behavior) {
        this.behavior = behavior;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ThresholdInfoType)) return false;
        ThresholdInfoType other = (ThresholdInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.thresholdType==null && other.getThresholdType()==null) || 
             (this.thresholdType!=null &&
              this.thresholdType.equals(other.getThresholdType()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.behavior==null && other.getBehavior()==null) || 
             (this.behavior!=null &&
              this.behavior.equals(other.getBehavior())));
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
        if (getThresholdType() != null) {
            _hashCode += getThresholdType().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getBehavior() != null) {
            _hashCode += getBehavior().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ThresholdInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "thresholdInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thresholdType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "thresholdType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("behavior");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "behavior"));
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
