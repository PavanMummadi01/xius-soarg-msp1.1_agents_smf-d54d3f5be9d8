/**
 * SerPlanCaldrsViewItemType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.selfcare.communityaccountservice;

public class SerPlanCaldrsViewItemType  implements java.io.Serializable {
    private java.lang.Long calndrSrvcId;

    private java.lang.String calndrSrvcName;

    private java.lang.Long calndrId;

    private java.lang.String calndrName;

    private java.lang.Long vistNetworkId;

    private java.lang.String vistNetworkName;

    public SerPlanCaldrsViewItemType() {
    }

    public SerPlanCaldrsViewItemType(
           java.lang.Long calndrSrvcId,
           java.lang.String calndrSrvcName,
           java.lang.Long calndrId,
           java.lang.String calndrName,
           java.lang.Long vistNetworkId,
           java.lang.String vistNetworkName) {
           this.calndrSrvcId = calndrSrvcId;
           this.calndrSrvcName = calndrSrvcName;
           this.calndrId = calndrId;
           this.calndrName = calndrName;
           this.vistNetworkId = vistNetworkId;
           this.vistNetworkName = vistNetworkName;
    }


    /**
     * Gets the calndrSrvcId value for this SerPlanCaldrsViewItemType.
     * 
     * @return calndrSrvcId
     */
    public java.lang.Long getCalndrSrvcId() {
        return calndrSrvcId;
    }


    /**
     * Sets the calndrSrvcId value for this SerPlanCaldrsViewItemType.
     * 
     * @param calndrSrvcId
     */
    public void setCalndrSrvcId(java.lang.Long calndrSrvcId) {
        this.calndrSrvcId = calndrSrvcId;
    }


    /**
     * Gets the calndrSrvcName value for this SerPlanCaldrsViewItemType.
     * 
     * @return calndrSrvcName
     */
    public java.lang.String getCalndrSrvcName() {
        return calndrSrvcName;
    }


    /**
     * Sets the calndrSrvcName value for this SerPlanCaldrsViewItemType.
     * 
     * @param calndrSrvcName
     */
    public void setCalndrSrvcName(java.lang.String calndrSrvcName) {
        this.calndrSrvcName = calndrSrvcName;
    }


    /**
     * Gets the calndrId value for this SerPlanCaldrsViewItemType.
     * 
     * @return calndrId
     */
    public java.lang.Long getCalndrId() {
        return calndrId;
    }


    /**
     * Sets the calndrId value for this SerPlanCaldrsViewItemType.
     * 
     * @param calndrId
     */
    public void setCalndrId(java.lang.Long calndrId) {
        this.calndrId = calndrId;
    }


    /**
     * Gets the calndrName value for this SerPlanCaldrsViewItemType.
     * 
     * @return calndrName
     */
    public java.lang.String getCalndrName() {
        return calndrName;
    }


    /**
     * Sets the calndrName value for this SerPlanCaldrsViewItemType.
     * 
     * @param calndrName
     */
    public void setCalndrName(java.lang.String calndrName) {
        this.calndrName = calndrName;
    }


    /**
     * Gets the vistNetworkId value for this SerPlanCaldrsViewItemType.
     * 
     * @return vistNetworkId
     */
    public java.lang.Long getVistNetworkId() {
        return vistNetworkId;
    }


    /**
     * Sets the vistNetworkId value for this SerPlanCaldrsViewItemType.
     * 
     * @param vistNetworkId
     */
    public void setVistNetworkId(java.lang.Long vistNetworkId) {
        this.vistNetworkId = vistNetworkId;
    }


    /**
     * Gets the vistNetworkName value for this SerPlanCaldrsViewItemType.
     * 
     * @return vistNetworkName
     */
    public java.lang.String getVistNetworkName() {
        return vistNetworkName;
    }


    /**
     * Sets the vistNetworkName value for this SerPlanCaldrsViewItemType.
     * 
     * @param vistNetworkName
     */
    public void setVistNetworkName(java.lang.String vistNetworkName) {
        this.vistNetworkName = vistNetworkName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SerPlanCaldrsViewItemType)) return false;
        SerPlanCaldrsViewItemType other = (SerPlanCaldrsViewItemType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.calndrSrvcId==null && other.getCalndrSrvcId()==null) || 
             (this.calndrSrvcId!=null &&
              this.calndrSrvcId.equals(other.getCalndrSrvcId()))) &&
            ((this.calndrSrvcName==null && other.getCalndrSrvcName()==null) || 
             (this.calndrSrvcName!=null &&
              this.calndrSrvcName.equals(other.getCalndrSrvcName()))) &&
            ((this.calndrId==null && other.getCalndrId()==null) || 
             (this.calndrId!=null &&
              this.calndrId.equals(other.getCalndrId()))) &&
            ((this.calndrName==null && other.getCalndrName()==null) || 
             (this.calndrName!=null &&
              this.calndrName.equals(other.getCalndrName()))) &&
            ((this.vistNetworkId==null && other.getVistNetworkId()==null) || 
             (this.vistNetworkId!=null &&
              this.vistNetworkId.equals(other.getVistNetworkId()))) &&
            ((this.vistNetworkName==null && other.getVistNetworkName()==null) || 
             (this.vistNetworkName!=null &&
              this.vistNetworkName.equals(other.getVistNetworkName())));
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
        if (getCalndrSrvcId() != null) {
            _hashCode += getCalndrSrvcId().hashCode();
        }
        if (getCalndrSrvcName() != null) {
            _hashCode += getCalndrSrvcName().hashCode();
        }
        if (getCalndrId() != null) {
            _hashCode += getCalndrId().hashCode();
        }
        if (getCalndrName() != null) {
            _hashCode += getCalndrName().hashCode();
        }
        if (getVistNetworkId() != null) {
            _hashCode += getVistNetworkId().hashCode();
        }
        if (getVistNetworkName() != null) {
            _hashCode += getVistNetworkName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SerPlanCaldrsViewItemType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "SerPlanCaldrsViewItemType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calndrSrvcId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "calndrSrvcId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calndrSrvcName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "calndrSrvcName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calndrId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "calndrId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calndrName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "calndrName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vistNetworkId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "vistNetworkId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vistNetworkName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "vistNetworkName"));
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
