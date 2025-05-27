/**
 * LineInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.CAManagement_xsd;

public class LineInfoType  implements java.io.Serializable {
    private java.lang.Long grpID;

    private java.lang.String grpName;

    private java.lang.String[] mainLineInfo;

    private java.lang.String[] subLineInfo;

    public LineInfoType() {
    }

    public LineInfoType(
           java.lang.Long grpID,
           java.lang.String grpName,
           java.lang.String[] mainLineInfo,
           java.lang.String[] subLineInfo) {
           this.grpID = grpID;
           this.grpName = grpName;
           this.mainLineInfo = mainLineInfo;
           this.subLineInfo = subLineInfo;
    }


    /**
     * Gets the grpID value for this LineInfoType.
     * 
     * @return grpID
     */
    public java.lang.Long getGrpID() {
        return grpID;
    }


    /**
     * Sets the grpID value for this LineInfoType.
     * 
     * @param grpID
     */
    public void setGrpID(java.lang.Long grpID) {
        this.grpID = grpID;
    }


    /**
     * Gets the grpName value for this LineInfoType.
     * 
     * @return grpName
     */
    public java.lang.String getGrpName() {
        return grpName;
    }


    /**
     * Sets the grpName value for this LineInfoType.
     * 
     * @param grpName
     */
    public void setGrpName(java.lang.String grpName) {
        this.grpName = grpName;
    }


    /**
     * Gets the mainLineInfo value for this LineInfoType.
     * 
     * @return mainLineInfo
     */
    public java.lang.String[] getMainLineInfo() {
        return mainLineInfo;
    }


    /**
     * Sets the mainLineInfo value for this LineInfoType.
     * 
     * @param mainLineInfo
     */
    public void setMainLineInfo(java.lang.String[] mainLineInfo) {
        this.mainLineInfo = mainLineInfo;
    }


    /**
     * Gets the subLineInfo value for this LineInfoType.
     * 
     * @return subLineInfo
     */
    public java.lang.String[] getSubLineInfo() {
        return subLineInfo;
    }


    /**
     * Sets the subLineInfo value for this LineInfoType.
     * 
     * @param subLineInfo
     */
    public void setSubLineInfo(java.lang.String[] subLineInfo) {
        this.subLineInfo = subLineInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LineInfoType)) return false;
        LineInfoType other = (LineInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.grpID==null && other.getGrpID()==null) || 
             (this.grpID!=null &&
              this.grpID.equals(other.getGrpID()))) &&
            ((this.grpName==null && other.getGrpName()==null) || 
             (this.grpName!=null &&
              this.grpName.equals(other.getGrpName()))) &&
            ((this.mainLineInfo==null && other.getMainLineInfo()==null) || 
             (this.mainLineInfo!=null &&
              java.util.Arrays.equals(this.mainLineInfo, other.getMainLineInfo()))) &&
            ((this.subLineInfo==null && other.getSubLineInfo()==null) || 
             (this.subLineInfo!=null &&
              java.util.Arrays.equals(this.subLineInfo, other.getSubLineInfo())));
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
        if (getGrpID() != null) {
            _hashCode += getGrpID().hashCode();
        }
        if (getGrpName() != null) {
            _hashCode += getGrpName().hashCode();
        }
        if (getMainLineInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMainLineInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMainLineInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubLineInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubLineInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubLineInfo(), i);
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
        new org.apache.axis.description.TypeDesc(LineInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "LineInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grpID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "grpID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grpName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "grpName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainLineInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "mainLineInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "MSISDNType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "MSISDN"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subLineInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "subLineInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "MSISDNType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "MSISDN"));
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
