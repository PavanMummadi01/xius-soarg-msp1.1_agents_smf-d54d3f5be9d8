/**
 * GetPortInStatusResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.provisioning;

public class GetPortInStatusResponse  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private java.lang.String correlationID;

    private java.lang.String donorID;

    private net.bcgi.si.messages.mvnoapi.common.ErrorData[] errors;

    private java.lang.String failureReason;

    private java.lang.Long messageID;

    private java.lang.String[] portInMSISDNs;

    private java.lang.String portInStatus;

    private java.lang.String portReqFormID;

    private java.lang.String recipientID;

    private net.bcgi.si.messages.mvnoapi.common.StatusCode statusCode;

    private java.util.Calendar timeStamp;

    private java.lang.String transTime;

    private java.lang.String version;

    private org.apache.axis.message.MessageElement [] _any;

    public GetPortInStatusResponse() {
    }

    public GetPortInStatusResponse(
           java.lang.String correlationID,
           java.lang.String donorID,
           net.bcgi.si.messages.mvnoapi.common.ErrorData[] errors,
           java.lang.String failureReason,
           java.lang.Long messageID,
           java.lang.String[] portInMSISDNs,
           java.lang.String portInStatus,
           java.lang.String portReqFormID,
           java.lang.String recipientID,
           net.bcgi.si.messages.mvnoapi.common.StatusCode statusCode,
           java.util.Calendar timeStamp,
           java.lang.String transTime,
           java.lang.String version,
           org.apache.axis.message.MessageElement [] _any) {
           this.correlationID = correlationID;
           this.donorID = donorID;
           this.errors = errors;
           this.failureReason = failureReason;
           this.messageID = messageID;
           this.portInMSISDNs = portInMSISDNs;
           this.portInStatus = portInStatus;
           this.portReqFormID = portReqFormID;
           this.recipientID = recipientID;
           this.statusCode = statusCode;
           this.timeStamp = timeStamp;
           this.transTime = transTime;
           this.version = version;
           this._any = _any;
    }


    /**
     * Gets the correlationID value for this GetPortInStatusResponse.
     * 
     * @return correlationID
     */
    public java.lang.String getCorrelationID() {
        return correlationID;
    }


    /**
     * Sets the correlationID value for this GetPortInStatusResponse.
     * 
     * @param correlationID
     */
    public void setCorrelationID(java.lang.String correlationID) {
        this.correlationID = correlationID;
    }


    /**
     * Gets the donorID value for this GetPortInStatusResponse.
     * 
     * @return donorID
     */
    public java.lang.String getDonorID() {
        return donorID;
    }


    /**
     * Sets the donorID value for this GetPortInStatusResponse.
     * 
     * @param donorID
     */
    public void setDonorID(java.lang.String donorID) {
        this.donorID = donorID;
    }


    /**
     * Gets the errors value for this GetPortInStatusResponse.
     * 
     * @return errors
     */
    public net.bcgi.si.messages.mvnoapi.common.ErrorData[] getErrors() {
        return errors;
    }


    /**
     * Sets the errors value for this GetPortInStatusResponse.
     * 
     * @param errors
     */
    public void setErrors(net.bcgi.si.messages.mvnoapi.common.ErrorData[] errors) {
        this.errors = errors;
    }


    /**
     * Gets the failureReason value for this GetPortInStatusResponse.
     * 
     * @return failureReason
     */
    public java.lang.String getFailureReason() {
        return failureReason;
    }


    /**
     * Sets the failureReason value for this GetPortInStatusResponse.
     * 
     * @param failureReason
     */
    public void setFailureReason(java.lang.String failureReason) {
        this.failureReason = failureReason;
    }


    /**
     * Gets the messageID value for this GetPortInStatusResponse.
     * 
     * @return messageID
     */
    public java.lang.Long getMessageID() {
        return messageID;
    }


    /**
     * Sets the messageID value for this GetPortInStatusResponse.
     * 
     * @param messageID
     */
    public void setMessageID(java.lang.Long messageID) {
        this.messageID = messageID;
    }


    /**
     * Gets the portInMSISDNs value for this GetPortInStatusResponse.
     * 
     * @return portInMSISDNs
     */
    public java.lang.String[] getPortInMSISDNs() {
        return portInMSISDNs;
    }


    /**
     * Sets the portInMSISDNs value for this GetPortInStatusResponse.
     * 
     * @param portInMSISDNs
     */
    public void setPortInMSISDNs(java.lang.String[] portInMSISDNs) {
        this.portInMSISDNs = portInMSISDNs;
    }


    /**
     * Gets the portInStatus value for this GetPortInStatusResponse.
     * 
     * @return portInStatus
     */
    public java.lang.String getPortInStatus() {
        return portInStatus;
    }


    /**
     * Sets the portInStatus value for this GetPortInStatusResponse.
     * 
     * @param portInStatus
     */
    public void setPortInStatus(java.lang.String portInStatus) {
        this.portInStatus = portInStatus;
    }


    /**
     * Gets the portReqFormID value for this GetPortInStatusResponse.
     * 
     * @return portReqFormID
     */
    public java.lang.String getPortReqFormID() {
        return portReqFormID;
    }


    /**
     * Sets the portReqFormID value for this GetPortInStatusResponse.
     * 
     * @param portReqFormID
     */
    public void setPortReqFormID(java.lang.String portReqFormID) {
        this.portReqFormID = portReqFormID;
    }


    /**
     * Gets the recipientID value for this GetPortInStatusResponse.
     * 
     * @return recipientID
     */
    public java.lang.String getRecipientID() {
        return recipientID;
    }


    /**
     * Sets the recipientID value for this GetPortInStatusResponse.
     * 
     * @param recipientID
     */
    public void setRecipientID(java.lang.String recipientID) {
        this.recipientID = recipientID;
    }


    /**
     * Gets the statusCode value for this GetPortInStatusResponse.
     * 
     * @return statusCode
     */
    public net.bcgi.si.messages.mvnoapi.common.StatusCode getStatusCode() {
        return statusCode;
    }


    /**
     * Sets the statusCode value for this GetPortInStatusResponse.
     * 
     * @param statusCode
     */
    public void setStatusCode(net.bcgi.si.messages.mvnoapi.common.StatusCode statusCode) {
        this.statusCode = statusCode;
    }


    /**
     * Gets the timeStamp value for this GetPortInStatusResponse.
     * 
     * @return timeStamp
     */
    public java.util.Calendar getTimeStamp() {
        return timeStamp;
    }


    /**
     * Sets the timeStamp value for this GetPortInStatusResponse.
     * 
     * @param timeStamp
     */
    public void setTimeStamp(java.util.Calendar timeStamp) {
        this.timeStamp = timeStamp;
    }


    /**
     * Gets the transTime value for this GetPortInStatusResponse.
     * 
     * @return transTime
     */
    public java.lang.String getTransTime() {
        return transTime;
    }


    /**
     * Sets the transTime value for this GetPortInStatusResponse.
     * 
     * @param transTime
     */
    public void setTransTime(java.lang.String transTime) {
        this.transTime = transTime;
    }


    /**
     * Gets the version value for this GetPortInStatusResponse.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this GetPortInStatusResponse.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the _any value for this GetPortInStatusResponse.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this GetPortInStatusResponse.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPortInStatusResponse)) return false;
        GetPortInStatusResponse other = (GetPortInStatusResponse) obj;
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
            ((this.donorID==null && other.getDonorID()==null) || 
             (this.donorID!=null &&
              this.donorID.equals(other.getDonorID()))) &&
            ((this.errors==null && other.getErrors()==null) || 
             (this.errors!=null &&
              java.util.Arrays.equals(this.errors, other.getErrors()))) &&
            ((this.failureReason==null && other.getFailureReason()==null) || 
             (this.failureReason!=null &&
              this.failureReason.equals(other.getFailureReason()))) &&
            ((this.messageID==null && other.getMessageID()==null) || 
             (this.messageID!=null &&
              this.messageID.equals(other.getMessageID()))) &&
            ((this.portInMSISDNs==null && other.getPortInMSISDNs()==null) || 
             (this.portInMSISDNs!=null &&
              java.util.Arrays.equals(this.portInMSISDNs, other.getPortInMSISDNs()))) &&
            ((this.portInStatus==null && other.getPortInStatus()==null) || 
             (this.portInStatus!=null &&
              this.portInStatus.equals(other.getPortInStatus()))) &&
            ((this.portReqFormID==null && other.getPortReqFormID()==null) || 
             (this.portReqFormID!=null &&
              this.portReqFormID.equals(other.getPortReqFormID()))) &&
            ((this.recipientID==null && other.getRecipientID()==null) || 
             (this.recipientID!=null &&
              this.recipientID.equals(other.getRecipientID()))) &&
            ((this.statusCode==null && other.getStatusCode()==null) || 
             (this.statusCode!=null &&
              this.statusCode.equals(other.getStatusCode()))) &&
            ((this.timeStamp==null && other.getTimeStamp()==null) || 
             (this.timeStamp!=null &&
              this.timeStamp.equals(other.getTimeStamp()))) &&
            ((this.transTime==null && other.getTransTime()==null) || 
             (this.transTime!=null &&
              this.transTime.equals(other.getTransTime()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this._any==null && other.get_any()==null) || 
             (this._any!=null &&
              java.util.Arrays.equals(this._any, other.get_any())));
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
        if (getDonorID() != null) {
            _hashCode += getDonorID().hashCode();
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
        if (getFailureReason() != null) {
            _hashCode += getFailureReason().hashCode();
        }
        if (getMessageID() != null) {
            _hashCode += getMessageID().hashCode();
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
        if (getPortInStatus() != null) {
            _hashCode += getPortInStatus().hashCode();
        }
        if (getPortReqFormID() != null) {
            _hashCode += getPortReqFormID().hashCode();
        }
        if (getRecipientID() != null) {
            _hashCode += getRecipientID().hashCode();
        }
        if (getStatusCode() != null) {
            _hashCode += getStatusCode().hashCode();
        }
        if (getTimeStamp() != null) {
            _hashCode += getTimeStamp().hashCode();
        }
        if (getTransTime() != null) {
            _hashCode += getTransTime().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (get_any() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_any());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_any(), i);
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
        new org.apache.axis.description.TypeDesc(GetPortInStatusResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "GetPortInStatusResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correlationID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "correlationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("donorID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "donorID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
        elemField.setFieldName("failureReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "failureReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "messageID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portInMSISDNs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "portInMSISDNs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portInStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "portInStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portReqFormID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "portReqFormID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "recipientID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "statusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "StatusCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeStamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "timeStamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "transTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
