/**
 * L4AdNotificationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.provisioning;

public class L4AdNotificationResponse  implements java.io.Serializable {
    private java.lang.String correlationID;

    private net.bcgi.si.messages.mvnoapi.common.ErrorData[] errors;

    private net.bcgi.si.messages.mvnoapi.common.StatusCode statusCode;

    private java.lang.String successMessage;

    private java.util.Calendar timeStamp;

    private java.lang.String version;

    public L4AdNotificationResponse() {
    }

    public L4AdNotificationResponse(
           java.lang.String correlationID,
           net.bcgi.si.messages.mvnoapi.common.ErrorData[] errors,
           net.bcgi.si.messages.mvnoapi.common.StatusCode statusCode,
           java.lang.String successMessage,
           java.util.Calendar timeStamp,
           java.lang.String version) {
           this.correlationID = correlationID;
           this.errors = errors;
           this.statusCode = statusCode;
           this.successMessage = successMessage;
           this.timeStamp = timeStamp;
           this.version = version;
    }


    /**
     * Gets the correlationID value for this L4AdNotificationResponse.
     * 
     * @return correlationID
     */
    public java.lang.String getCorrelationID() {
        return correlationID;
    }


    /**
     * Sets the correlationID value for this L4AdNotificationResponse.
     * 
     * @param correlationID
     */
    public void setCorrelationID(java.lang.String correlationID) {
        this.correlationID = correlationID;
    }


    /**
     * Gets the errors value for this L4AdNotificationResponse.
     * 
     * @return errors
     */
    public net.bcgi.si.messages.mvnoapi.common.ErrorData[] getErrors() {
        return errors;
    }


    /**
     * Sets the errors value for this L4AdNotificationResponse.
     * 
     * @param errors
     */
    public void setErrors(net.bcgi.si.messages.mvnoapi.common.ErrorData[] errors) {
        this.errors = errors;
    }


    /**
     * Gets the statusCode value for this L4AdNotificationResponse.
     * 
     * @return statusCode
     */
    public net.bcgi.si.messages.mvnoapi.common.StatusCode getStatusCode() {
        return statusCode;
    }


    /**
     * Sets the statusCode value for this L4AdNotificationResponse.
     * 
     * @param statusCode
     */
    public void setStatusCode(net.bcgi.si.messages.mvnoapi.common.StatusCode statusCode) {
        this.statusCode = statusCode;
    }


    /**
     * Gets the successMessage value for this L4AdNotificationResponse.
     * 
     * @return successMessage
     */
    public java.lang.String getSuccessMessage() {
        return successMessage;
    }


    /**
     * Sets the successMessage value for this L4AdNotificationResponse.
     * 
     * @param successMessage
     */
    public void setSuccessMessage(java.lang.String successMessage) {
        this.successMessage = successMessage;
    }


    /**
     * Gets the timeStamp value for this L4AdNotificationResponse.
     * 
     * @return timeStamp
     */
    public java.util.Calendar getTimeStamp() {
        return timeStamp;
    }


    /**
     * Sets the timeStamp value for this L4AdNotificationResponse.
     * 
     * @param timeStamp
     */
    public void setTimeStamp(java.util.Calendar timeStamp) {
        this.timeStamp = timeStamp;
    }


    /**
     * Gets the version value for this L4AdNotificationResponse.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this L4AdNotificationResponse.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof L4AdNotificationResponse)) return false;
        L4AdNotificationResponse other = (L4AdNotificationResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.correlationID==null && other.getCorrelationID()==null) || 
             (this.correlationID!=null &&
              this.correlationID.equals(other.getCorrelationID()))) &&
            ((this.errors==null && other.getErrors()==null) || 
             (this.errors!=null &&
              java.util.Arrays.equals(this.errors, other.getErrors()))) &&
            ((this.statusCode==null && other.getStatusCode()==null) || 
             (this.statusCode!=null &&
              this.statusCode.equals(other.getStatusCode()))) &&
            ((this.successMessage==null && other.getSuccessMessage()==null) || 
             (this.successMessage!=null &&
              this.successMessage.equals(other.getSuccessMessage()))) &&
            ((this.timeStamp==null && other.getTimeStamp()==null) || 
             (this.timeStamp!=null &&
              this.timeStamp.equals(other.getTimeStamp()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion())));
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
        if (getCorrelationID() != null) {
            _hashCode += getCorrelationID().hashCode();
        }
        if (getErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatusCode() != null) {
            _hashCode += getStatusCode().hashCode();
        }
        if (getSuccessMessage() != null) {
            _hashCode += getSuccessMessage().hashCode();
        }
        if (getTimeStamp() != null) {
            _hashCode += getTimeStamp().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(L4AdNotificationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "L4AdNotificationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correlationID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "correlationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "errors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "ErrorData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "ErrorData"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "statusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "StatusCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("successMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "successMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeStamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "timeStamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
