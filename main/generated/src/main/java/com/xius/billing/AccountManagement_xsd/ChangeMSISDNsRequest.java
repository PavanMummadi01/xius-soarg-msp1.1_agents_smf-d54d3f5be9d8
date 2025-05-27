/**
 * ChangeMSISDNsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class ChangeMSISDNsRequest  implements java.io.Serializable {
    private java.lang.Boolean hlrFlag;

    private java.lang.String[] SIMSerialNos;

    private java.lang.String[] portInMSISDNs;

    private java.lang.String[] newRoutes;

    public ChangeMSISDNsRequest() {
    }

    public ChangeMSISDNsRequest(
           java.lang.Boolean hlrFlag,
           java.lang.String[] SIMSerialNos,
           java.lang.String[] portInMSISDNs,
           java.lang.String[] newRoutes) {
           this.hlrFlag = hlrFlag;
           this.SIMSerialNos = SIMSerialNos;
           this.portInMSISDNs = portInMSISDNs;
           this.newRoutes = newRoutes;
    }


    /**
     * Gets the hlrFlag value for this ChangeMSISDNsRequest.
     * 
     * @return hlrFlag
     */
    public java.lang.Boolean getHlrFlag() {
        return hlrFlag;
    }


    /**
     * Sets the hlrFlag value for this ChangeMSISDNsRequest.
     * 
     * @param hlrFlag
     */
    public void setHlrFlag(java.lang.Boolean hlrFlag) {
        this.hlrFlag = hlrFlag;
    }


    /**
     * Gets the SIMSerialNos value for this ChangeMSISDNsRequest.
     * 
     * @return SIMSerialNos
     */
    public java.lang.String[] getSIMSerialNos() {
        return SIMSerialNos;
    }


    /**
     * Sets the SIMSerialNos value for this ChangeMSISDNsRequest.
     * 
     * @param SIMSerialNos
     */
    public void setSIMSerialNos(java.lang.String[] SIMSerialNos) {
        this.SIMSerialNos = SIMSerialNos;
    }


    /**
     * Gets the portInMSISDNs value for this ChangeMSISDNsRequest.
     * 
     * @return portInMSISDNs
     */
    public java.lang.String[] getPortInMSISDNs() {
        return portInMSISDNs;
    }


    /**
     * Sets the portInMSISDNs value for this ChangeMSISDNsRequest.
     * 
     * @param portInMSISDNs
     */
    public void setPortInMSISDNs(java.lang.String[] portInMSISDNs) {
        this.portInMSISDNs = portInMSISDNs;
    }


    /**
     * Gets the newRoutes value for this ChangeMSISDNsRequest.
     * 
     * @return newRoutes
     */
    public java.lang.String[] getNewRoutes() {
        return newRoutes;
    }


    /**
     * Sets the newRoutes value for this ChangeMSISDNsRequest.
     * 
     * @param newRoutes
     */
    public void setNewRoutes(java.lang.String[] newRoutes) {
        this.newRoutes = newRoutes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeMSISDNsRequest)) return false;
        ChangeMSISDNsRequest other = (ChangeMSISDNsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hlrFlag==null && other.getHlrFlag()==null) || 
             (this.hlrFlag!=null &&
              this.hlrFlag.equals(other.getHlrFlag()))) &&
            ((this.SIMSerialNos==null && other.getSIMSerialNos()==null) || 
             (this.SIMSerialNos!=null &&
              java.util.Arrays.equals(this.SIMSerialNos, other.getSIMSerialNos()))) &&
            ((this.portInMSISDNs==null && other.getPortInMSISDNs()==null) || 
             (this.portInMSISDNs!=null &&
              java.util.Arrays.equals(this.portInMSISDNs, other.getPortInMSISDNs()))) &&
            ((this.newRoutes==null && other.getNewRoutes()==null) || 
             (this.newRoutes!=null &&
              java.util.Arrays.equals(this.newRoutes, other.getNewRoutes())));
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
        if (getHlrFlag() != null) {
            _hashCode += getHlrFlag().hashCode();
        }
        if (getSIMSerialNos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSIMSerialNos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSIMSerialNos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPortInMSISDNs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPortInMSISDNs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPortInMSISDNs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNewRoutes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNewRoutes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNewRoutes(), i);
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
        new org.apache.axis.description.TypeDesc(ChangeMSISDNsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ChangeMSISDNsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hlrFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "hlrFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SIMSerialNos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SIMSerialNos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SIMSerialNoType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SIMSerialNo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portInMSISDNs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "portInMSISDNs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "MSISDNType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "MSISDN"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newRoutes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "newRoutes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "NewRouteType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "newRoute"));
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
