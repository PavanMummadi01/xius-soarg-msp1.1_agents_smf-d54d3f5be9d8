/**
 * IMEIHistoryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.TIAManagement_xsd;

public class IMEIHistoryType  implements java.io.Serializable {
    private java.lang.String taskPerfomed;

    private java.lang.String taskAssignedOn;

    private java.lang.String taskPerfomedBy;

    private java.lang.String country;

    public IMEIHistoryType() {
    }

    public IMEIHistoryType(
           java.lang.String taskPerfomed,
           java.lang.String taskAssignedOn,
           java.lang.String taskPerfomedBy,
           java.lang.String country) {
           this.taskPerfomed = taskPerfomed;
           this.taskAssignedOn = taskAssignedOn;
           this.taskPerfomedBy = taskPerfomedBy;
           this.country = country;
    }


    /**
     * Gets the taskPerfomed value for this IMEIHistoryType.
     * 
     * @return taskPerfomed
     */
    public java.lang.String getTaskPerfomed() {
        return taskPerfomed;
    }


    /**
     * Sets the taskPerfomed value for this IMEIHistoryType.
     * 
     * @param taskPerfomed
     */
    public void setTaskPerfomed(java.lang.String taskPerfomed) {
        this.taskPerfomed = taskPerfomed;
    }


    /**
     * Gets the taskAssignedOn value for this IMEIHistoryType.
     * 
     * @return taskAssignedOn
     */
    public java.lang.String getTaskAssignedOn() {
        return taskAssignedOn;
    }


    /**
     * Sets the taskAssignedOn value for this IMEIHistoryType.
     * 
     * @param taskAssignedOn
     */
    public void setTaskAssignedOn(java.lang.String taskAssignedOn) {
        this.taskAssignedOn = taskAssignedOn;
    }


    /**
     * Gets the taskPerfomedBy value for this IMEIHistoryType.
     * 
     * @return taskPerfomedBy
     */
    public java.lang.String getTaskPerfomedBy() {
        return taskPerfomedBy;
    }


    /**
     * Sets the taskPerfomedBy value for this IMEIHistoryType.
     * 
     * @param taskPerfomedBy
     */
    public void setTaskPerfomedBy(java.lang.String taskPerfomedBy) {
        this.taskPerfomedBy = taskPerfomedBy;
    }


    /**
     * Gets the country value for this IMEIHistoryType.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this IMEIHistoryType.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IMEIHistoryType)) return false;
        IMEIHistoryType other = (IMEIHistoryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.taskPerfomed==null && other.getTaskPerfomed()==null) || 
             (this.taskPerfomed!=null &&
              this.taskPerfomed.equals(other.getTaskPerfomed()))) &&
            ((this.taskAssignedOn==null && other.getTaskAssignedOn()==null) || 
             (this.taskAssignedOn!=null &&
              this.taskAssignedOn.equals(other.getTaskAssignedOn()))) &&
            ((this.taskPerfomedBy==null && other.getTaskPerfomedBy()==null) || 
             (this.taskPerfomedBy!=null &&
              this.taskPerfomedBy.equals(other.getTaskPerfomedBy()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry())));
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
        if (getTaskPerfomed() != null) {
            _hashCode += getTaskPerfomed().hashCode();
        }
        if (getTaskAssignedOn() != null) {
            _hashCode += getTaskAssignedOn().hashCode();
        }
        if (getTaskPerfomedBy() != null) {
            _hashCode += getTaskPerfomedBy().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IMEIHistoryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "IMEIHistoryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskPerfomed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "taskPerfomed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskAssignedOn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "taskAssignedOn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskPerfomedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "taskPerfomedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "country"));
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
