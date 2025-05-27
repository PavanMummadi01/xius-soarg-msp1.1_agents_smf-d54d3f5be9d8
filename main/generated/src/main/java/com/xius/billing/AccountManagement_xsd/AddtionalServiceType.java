/**
 * AddtionalServiceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class AddtionalServiceType  implements java.io.Serializable {
    private java.lang.Long serviceId;

    private java.lang.String serviceName;

    private java.lang.Long airTimeCalId;

    private java.lang.String airTimeCalName;

    private java.lang.Long pstnCalId;

    private java.lang.String pstnCalName;

    public AddtionalServiceType() {
    }

    public AddtionalServiceType(
           java.lang.Long serviceId,
           java.lang.String serviceName,
           java.lang.Long airTimeCalId,
           java.lang.String airTimeCalName,
           java.lang.Long pstnCalId,
           java.lang.String pstnCalName) {
           this.serviceId = serviceId;
           this.serviceName = serviceName;
           this.airTimeCalId = airTimeCalId;
           this.airTimeCalName = airTimeCalName;
           this.pstnCalId = pstnCalId;
           this.pstnCalName = pstnCalName;
    }


    /**
     * Gets the serviceId value for this AddtionalServiceType.
     * 
     * @return serviceId
     */
    public java.lang.Long getServiceId() {
        return serviceId;
    }


    /**
     * Sets the serviceId value for this AddtionalServiceType.
     * 
     * @param serviceId
     */
    public void setServiceId(java.lang.Long serviceId) {
        this.serviceId = serviceId;
    }


    /**
     * Gets the serviceName value for this AddtionalServiceType.
     * 
     * @return serviceName
     */
    public java.lang.String getServiceName() {
        return serviceName;
    }


    /**
     * Sets the serviceName value for this AddtionalServiceType.
     * 
     * @param serviceName
     */
    public void setServiceName(java.lang.String serviceName) {
        this.serviceName = serviceName;
    }


    /**
     * Gets the airTimeCalId value for this AddtionalServiceType.
     * 
     * @return airTimeCalId
     */
    public java.lang.Long getAirTimeCalId() {
        return airTimeCalId;
    }


    /**
     * Sets the airTimeCalId value for this AddtionalServiceType.
     * 
     * @param airTimeCalId
     */
    public void setAirTimeCalId(java.lang.Long airTimeCalId) {
        this.airTimeCalId = airTimeCalId;
    }


    /**
     * Gets the airTimeCalName value for this AddtionalServiceType.
     * 
     * @return airTimeCalName
     */
    public java.lang.String getAirTimeCalName() {
        return airTimeCalName;
    }


    /**
     * Sets the airTimeCalName value for this AddtionalServiceType.
     * 
     * @param airTimeCalName
     */
    public void setAirTimeCalName(java.lang.String airTimeCalName) {
        this.airTimeCalName = airTimeCalName;
    }


    /**
     * Gets the pstnCalId value for this AddtionalServiceType.
     * 
     * @return pstnCalId
     */
    public java.lang.Long getPstnCalId() {
        return pstnCalId;
    }


    /**
     * Sets the pstnCalId value for this AddtionalServiceType.
     * 
     * @param pstnCalId
     */
    public void setPstnCalId(java.lang.Long pstnCalId) {
        this.pstnCalId = pstnCalId;
    }


    /**
     * Gets the pstnCalName value for this AddtionalServiceType.
     * 
     * @return pstnCalName
     */
    public java.lang.String getPstnCalName() {
        return pstnCalName;
    }


    /**
     * Sets the pstnCalName value for this AddtionalServiceType.
     * 
     * @param pstnCalName
     */
    public void setPstnCalName(java.lang.String pstnCalName) {
        this.pstnCalName = pstnCalName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddtionalServiceType)) return false;
        AddtionalServiceType other = (AddtionalServiceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serviceId==null && other.getServiceId()==null) || 
             (this.serviceId!=null &&
              this.serviceId.equals(other.getServiceId()))) &&
            ((this.serviceName==null && other.getServiceName()==null) || 
             (this.serviceName!=null &&
              this.serviceName.equals(other.getServiceName()))) &&
            ((this.airTimeCalId==null && other.getAirTimeCalId()==null) || 
             (this.airTimeCalId!=null &&
              this.airTimeCalId.equals(other.getAirTimeCalId()))) &&
            ((this.airTimeCalName==null && other.getAirTimeCalName()==null) || 
             (this.airTimeCalName!=null &&
              this.airTimeCalName.equals(other.getAirTimeCalName()))) &&
            ((this.pstnCalId==null && other.getPstnCalId()==null) || 
             (this.pstnCalId!=null &&
              this.pstnCalId.equals(other.getPstnCalId()))) &&
            ((this.pstnCalName==null && other.getPstnCalName()==null) || 
             (this.pstnCalName!=null &&
              this.pstnCalName.equals(other.getPstnCalName())));
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
        if (getServiceId() != null) {
            _hashCode += getServiceId().hashCode();
        }
        if (getServiceName() != null) {
            _hashCode += getServiceName().hashCode();
        }
        if (getAirTimeCalId() != null) {
            _hashCode += getAirTimeCalId().hashCode();
        }
        if (getAirTimeCalName() != null) {
            _hashCode += getAirTimeCalName().hashCode();
        }
        if (getPstnCalId() != null) {
            _hashCode += getPstnCalId().hashCode();
        }
        if (getPstnCalName() != null) {
            _hashCode += getPstnCalName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddtionalServiceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "AddtionalServiceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "serviceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "serviceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("airTimeCalId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "airTimeCalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("airTimeCalName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "airTimeCalName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pstnCalId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "pstnCalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pstnCalName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "pstnCalName"));
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
