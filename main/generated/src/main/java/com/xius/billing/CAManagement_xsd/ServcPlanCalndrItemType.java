/**
 * ServcPlanCalndrItemType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.CAManagement_xsd;

public class ServcPlanCalndrItemType  implements java.io.Serializable {
    private long calndrSrvcId;

    private long calndrId;

    private java.lang.Long vistNetworkId;

    public ServcPlanCalndrItemType() {
    }

    public ServcPlanCalndrItemType(
           long calndrSrvcId,
           long calndrId,
           java.lang.Long vistNetworkId) {
           this.calndrSrvcId = calndrSrvcId;
           this.calndrId = calndrId;
           this.vistNetworkId = vistNetworkId;
    }


    /**
     * Gets the calndrSrvcId value for this ServcPlanCalndrItemType.
     * 
     * @return calndrSrvcId
     */
    public long getCalndrSrvcId() {
        return calndrSrvcId;
    }


    /**
     * Sets the calndrSrvcId value for this ServcPlanCalndrItemType.
     * 
     * @param calndrSrvcId
     */
    public void setCalndrSrvcId(long calndrSrvcId) {
        this.calndrSrvcId = calndrSrvcId;
    }


    /**
     * Gets the calndrId value for this ServcPlanCalndrItemType.
     * 
     * @return calndrId
     */
    public long getCalndrId() {
        return calndrId;
    }


    /**
     * Sets the calndrId value for this ServcPlanCalndrItemType.
     * 
     * @param calndrId
     */
    public void setCalndrId(long calndrId) {
        this.calndrId = calndrId;
    }


    /**
     * Gets the vistNetworkId value for this ServcPlanCalndrItemType.
     * 
     * @return vistNetworkId
     */
    public java.lang.Long getVistNetworkId() {
        return vistNetworkId;
    }


    /**
     * Sets the vistNetworkId value for this ServcPlanCalndrItemType.
     * 
     * @param vistNetworkId
     */
    public void setVistNetworkId(java.lang.Long vistNetworkId) {
        this.vistNetworkId = vistNetworkId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServcPlanCalndrItemType)) return false;
        ServcPlanCalndrItemType other = (ServcPlanCalndrItemType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.calndrSrvcId == other.getCalndrSrvcId() &&
            this.calndrId == other.getCalndrId() &&
            ((this.vistNetworkId==null && other.getVistNetworkId()==null) || 
             (this.vistNetworkId!=null &&
              this.vistNetworkId.equals(other.getVistNetworkId())));
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
        _hashCode += new Long(getCalndrSrvcId()).hashCode();
        _hashCode += new Long(getCalndrId()).hashCode();
        if (getVistNetworkId() != null) {
            _hashCode += getVistNetworkId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServcPlanCalndrItemType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "ServcPlanCalndrItemType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calndrSrvcId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "calndrSrvcId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calndrId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "calndrId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vistNetworkId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "vistNetworkId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
