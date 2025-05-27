/**
 * CallBarredNumbers.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.tariff;


/**
 * CallBarredNumbers
 */
public class CallBarredNumbers  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String maxLimit;

    private java.lang.String[] MTC;

    private java.lang.String[] roamingMTC;

    public CallBarredNumbers() {
    }

    public CallBarredNumbers(
           java.lang.String name,
           java.lang.String maxLimit,
           java.lang.String[] MTC,
           java.lang.String[] roamingMTC) {
           this.name = name;
           this.maxLimit = maxLimit;
           this.MTC = MTC;
           this.roamingMTC = roamingMTC;
    }


    /**
     * Gets the name value for this CallBarredNumbers.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CallBarredNumbers.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the maxLimit value for this CallBarredNumbers.
     * 
     * @return maxLimit
     */
    public java.lang.String getMaxLimit() {
        return maxLimit;
    }


    /**
     * Sets the maxLimit value for this CallBarredNumbers.
     * 
     * @param maxLimit
     */
    public void setMaxLimit(java.lang.String maxLimit) {
        this.maxLimit = maxLimit;
    }


    /**
     * Gets the MTC value for this CallBarredNumbers.
     * 
     * @return MTC
     */
    public java.lang.String[] getMTC() {
        return MTC;
    }


    /**
     * Sets the MTC value for this CallBarredNumbers.
     * 
     * @param MTC
     */
    public void setMTC(java.lang.String[] MTC) {
        this.MTC = MTC;
    }

    public java.lang.String getMTC(int i) {
        return this.MTC[i];
    }

    public void setMTC(int i, java.lang.String _value) {
        this.MTC[i] = _value;
    }


    /**
     * Gets the roamingMTC value for this CallBarredNumbers.
     * 
     * @return roamingMTC
     */
    public java.lang.String[] getRoamingMTC() {
        return roamingMTC;
    }


    /**
     * Sets the roamingMTC value for this CallBarredNumbers.
     * 
     * @param roamingMTC
     */
    public void setRoamingMTC(java.lang.String[] roamingMTC) {
        this.roamingMTC = roamingMTC;
    }

    public java.lang.String getRoamingMTC(int i) {
        return this.roamingMTC[i];
    }

    public void setRoamingMTC(int i, java.lang.String _value) {
        this.roamingMTC[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CallBarredNumbers)) return false;
        CallBarredNumbers other = (CallBarredNumbers) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.maxLimit==null && other.getMaxLimit()==null) || 
             (this.maxLimit!=null &&
              this.maxLimit.equals(other.getMaxLimit()))) &&
            ((this.MTC==null && other.getMTC()==null) || 
             (this.MTC!=null &&
              java.util.Arrays.equals(this.MTC, other.getMTC()))) &&
            ((this.roamingMTC==null && other.getRoamingMTC()==null) || 
             (this.roamingMTC!=null &&
              java.util.Arrays.equals(this.roamingMTC, other.getRoamingMTC())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getMaxLimit() != null) {
            _hashCode += getMaxLimit().hashCode();
        }
        if (getMTC() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMTC());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMTC(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRoamingMTC() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRoamingMTC());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRoamingMTC(), i);
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
        new org.apache.axis.description.TypeDesc(CallBarredNumbers.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "CallBarredNumbers"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "maxLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MTC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "MTC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "MsisdnType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roamingMTC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "roamingMTC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "MsisdnType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
