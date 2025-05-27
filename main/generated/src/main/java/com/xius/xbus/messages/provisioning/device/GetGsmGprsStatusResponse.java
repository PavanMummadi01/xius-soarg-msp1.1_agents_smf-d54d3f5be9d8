/**
 * GetGsmGprsStatusResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.provisioning.device;

public class GetGsmGprsStatusResponse  extends com.xius.xbus.messages.common.WSResponse  implements java.io.Serializable {
    private java.lang.Integer gsmStatus;

    private java.lang.Integer gprsStatus;

    private java.lang.Integer epsStatus;

    public GetGsmGprsStatusResponse() {
    }

    public GetGsmGprsStatusResponse(
           com.xius.xbus.messages.common.StatusCode statusCode,
           java.util.Calendar timeStamp,
           java.lang.String correlationID,
           com.xius.xbus.messages.common.ErrorData[] errors,
           java.lang.String version,
           java.lang.Integer gsmStatus,
           java.lang.Integer gprsStatus,
           java.lang.Integer epsStatus) {
        super(
            statusCode,
            timeStamp,
            correlationID,
            errors,
            version);
        this.gsmStatus = gsmStatus;
        this.gprsStatus = gprsStatus;
        this.epsStatus = epsStatus;
    }


    /**
     * Gets the gsmStatus value for this GetGsmGprsStatusResponse.
     * 
     * @return gsmStatus
     */
    public java.lang.Integer getGsmStatus() {
        return gsmStatus;
    }


    /**
     * Sets the gsmStatus value for this GetGsmGprsStatusResponse.
     * 
     * @param gsmStatus
     */
    public void setGsmStatus(java.lang.Integer gsmStatus) {
        this.gsmStatus = gsmStatus;
    }


    /**
     * Gets the gprsStatus value for this GetGsmGprsStatusResponse.
     * 
     * @return gprsStatus
     */
    public java.lang.Integer getGprsStatus() {
        return gprsStatus;
    }


    /**
     * Sets the gprsStatus value for this GetGsmGprsStatusResponse.
     * 
     * @param gprsStatus
     */
    public void setGprsStatus(java.lang.Integer gprsStatus) {
        this.gprsStatus = gprsStatus;
    }


    /**
     * Gets the epsStatus value for this GetGsmGprsStatusResponse.
     * 
     * @return epsStatus
     */
    public java.lang.Integer getEpsStatus() {
        return epsStatus;
    }


    /**
     * Sets the epsStatus value for this GetGsmGprsStatusResponse.
     * 
     * @param epsStatus
     */
    public void setEpsStatus(java.lang.Integer epsStatus) {
        this.epsStatus = epsStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetGsmGprsStatusResponse)) return false;
        GetGsmGprsStatusResponse other = (GetGsmGprsStatusResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.gsmStatus==null && other.getGsmStatus()==null) || 
             (this.gsmStatus!=null &&
              this.gsmStatus.equals(other.getGsmStatus()))) &&
            ((this.gprsStatus==null && other.getGprsStatus()==null) || 
             (this.gprsStatus!=null &&
              this.gprsStatus.equals(other.getGprsStatus()))) &&
            ((this.epsStatus==null && other.getEpsStatus()==null) || 
             (this.epsStatus!=null &&
              this.epsStatus.equals(other.getEpsStatus())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getGsmStatus() != null) {
            _hashCode += getGsmStatus().hashCode();
        }
        if (getGprsStatus() != null) {
            _hashCode += getGprsStatus().hashCode();
        }
        if (getEpsStatus() != null) {
            _hashCode += getEpsStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetGsmGprsStatusResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", ">getGsmGprsStatusResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gsmStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "GsmStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gprsStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "GprsStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("epsStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "EpsStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
