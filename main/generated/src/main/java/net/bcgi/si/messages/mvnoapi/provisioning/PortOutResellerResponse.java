/**
 * PortOutResellerResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.provisioning;

public class PortOutResellerResponse  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private java.lang.String contactRep;

    private java.lang.String correlationID;

    private java.lang.String delayCode;

    private java.lang.String dueDateTime;

    private net.bcgi.si.messages.mvnoapi.common.ErrorData[] errors;

    private java.lang.String mdn;

    private java.lang.String mqRequestMessageId;

    private java.lang.String reasonCode;

    private java.lang.String reasonCodeDesc;

    private java.lang.String remarks;

    private java.lang.String repContactNo;

    private java.lang.String responseType;

    private net.bcgi.si.messages.mvnoapi.common.StatusCode statusCode;

    private java.util.Calendar timeStamp;

    private java.lang.String version;

    private org.apache.axis.message.MessageElement [] _any;

    public PortOutResellerResponse() {
    }

    public PortOutResellerResponse(
           java.lang.String contactRep,
           java.lang.String correlationID,
           java.lang.String delayCode,
           java.lang.String dueDateTime,
           net.bcgi.si.messages.mvnoapi.common.ErrorData[] errors,
           java.lang.String mdn,
           java.lang.String mqRequestMessageId,
           java.lang.String reasonCode,
           java.lang.String reasonCodeDesc,
           java.lang.String remarks,
           java.lang.String repContactNo,
           java.lang.String responseType,
           net.bcgi.si.messages.mvnoapi.common.StatusCode statusCode,
           java.util.Calendar timeStamp,
           java.lang.String version,
           org.apache.axis.message.MessageElement [] _any) {
           this.contactRep = contactRep;
           this.correlationID = correlationID;
           this.delayCode = delayCode;
           this.dueDateTime = dueDateTime;
           this.errors = errors;
           this.mdn = mdn;
           this.mqRequestMessageId = mqRequestMessageId;
           this.reasonCode = reasonCode;
           this.reasonCodeDesc = reasonCodeDesc;
           this.remarks = remarks;
           this.repContactNo = repContactNo;
           this.responseType = responseType;
           this.statusCode = statusCode;
           this.timeStamp = timeStamp;
           this.version = version;
           this._any = _any;
    }


    /**
     * Gets the contactRep value for this PortOutResellerResponse.
     * 
     * @return contactRep
     */
    public java.lang.String getContactRep() {
        return contactRep;
    }


    /**
     * Sets the contactRep value for this PortOutResellerResponse.
     * 
     * @param contactRep
     */
    public void setContactRep(java.lang.String contactRep) {
        this.contactRep = contactRep;
    }


    /**
     * Gets the correlationID value for this PortOutResellerResponse.
     * 
     * @return correlationID
     */
    public java.lang.String getCorrelationID() {
        return correlationID;
    }


    /**
     * Sets the correlationID value for this PortOutResellerResponse.
     * 
     * @param correlationID
     */
    public void setCorrelationID(java.lang.String correlationID) {
        this.correlationID = correlationID;
    }


    /**
     * Gets the delayCode value for this PortOutResellerResponse.
     * 
     * @return delayCode
     */
    public java.lang.String getDelayCode() {
        return delayCode;
    }


    /**
     * Sets the delayCode value for this PortOutResellerResponse.
     * 
     * @param delayCode
     */
    public void setDelayCode(java.lang.String delayCode) {
        this.delayCode = delayCode;
    }


    /**
     * Gets the dueDateTime value for this PortOutResellerResponse.
     * 
     * @return dueDateTime
     */
    public java.lang.String getDueDateTime() {
        return dueDateTime;
    }


    /**
     * Sets the dueDateTime value for this PortOutResellerResponse.
     * 
     * @param dueDateTime
     */
    public void setDueDateTime(java.lang.String dueDateTime) {
        this.dueDateTime = dueDateTime;
    }


    /**
     * Gets the errors value for this PortOutResellerResponse.
     * 
     * @return errors
     */
    public net.bcgi.si.messages.mvnoapi.common.ErrorData[] getErrors() {
        return errors;
    }


    /**
     * Sets the errors value for this PortOutResellerResponse.
     * 
     * @param errors
     */
    public void setErrors(net.bcgi.si.messages.mvnoapi.common.ErrorData[] errors) {
        this.errors = errors;
    }


    /**
     * Gets the mdn value for this PortOutResellerResponse.
     * 
     * @return mdn
     */
    public java.lang.String getMdn() {
        return mdn;
    }


    /**
     * Sets the mdn value for this PortOutResellerResponse.
     * 
     * @param mdn
     */
    public void setMdn(java.lang.String mdn) {
        this.mdn = mdn;
    }


    /**
     * Gets the mqRequestMessageId value for this PortOutResellerResponse.
     * 
     * @return mqRequestMessageId
     */
    public java.lang.String getMqRequestMessageId() {
        return mqRequestMessageId;
    }


    /**
     * Sets the mqRequestMessageId value for this PortOutResellerResponse.
     * 
     * @param mqRequestMessageId
     */
    public void setMqRequestMessageId(java.lang.String mqRequestMessageId) {
        this.mqRequestMessageId = mqRequestMessageId;
    }


    /**
     * Gets the reasonCode value for this PortOutResellerResponse.
     * 
     * @return reasonCode
     */
    public java.lang.String getReasonCode() {
        return reasonCode;
    }


    /**
     * Sets the reasonCode value for this PortOutResellerResponse.
     * 
     * @param reasonCode
     */
    public void setReasonCode(java.lang.String reasonCode) {
        this.reasonCode = reasonCode;
    }


    /**
     * Gets the reasonCodeDesc value for this PortOutResellerResponse.
     * 
     * @return reasonCodeDesc
     */
    public java.lang.String getReasonCodeDesc() {
        return reasonCodeDesc;
    }


    /**
     * Sets the reasonCodeDesc value for this PortOutResellerResponse.
     * 
     * @param reasonCodeDesc
     */
    public void setReasonCodeDesc(java.lang.String reasonCodeDesc) {
        this.reasonCodeDesc = reasonCodeDesc;
    }


    /**
     * Gets the remarks value for this PortOutResellerResponse.
     * 
     * @return remarks
     */
    public java.lang.String getRemarks() {
        return remarks;
    }


    /**
     * Sets the remarks value for this PortOutResellerResponse.
     * 
     * @param remarks
     */
    public void setRemarks(java.lang.String remarks) {
        this.remarks = remarks;
    }


    /**
     * Gets the repContactNo value for this PortOutResellerResponse.
     * 
     * @return repContactNo
     */
    public java.lang.String getRepContactNo() {
        return repContactNo;
    }


    /**
     * Sets the repContactNo value for this PortOutResellerResponse.
     * 
     * @param repContactNo
     */
    public void setRepContactNo(java.lang.String repContactNo) {
        this.repContactNo = repContactNo;
    }


    /**
     * Gets the responseType value for this PortOutResellerResponse.
     * 
     * @return responseType
     */
    public java.lang.String getResponseType() {
        return responseType;
    }


    /**
     * Sets the responseType value for this PortOutResellerResponse.
     * 
     * @param responseType
     */
    public void setResponseType(java.lang.String responseType) {
        this.responseType = responseType;
    }


    /**
     * Gets the statusCode value for this PortOutResellerResponse.
     * 
     * @return statusCode
     */
    public net.bcgi.si.messages.mvnoapi.common.StatusCode getStatusCode() {
        return statusCode;
    }


    /**
     * Sets the statusCode value for this PortOutResellerResponse.
     * 
     * @param statusCode
     */
    public void setStatusCode(net.bcgi.si.messages.mvnoapi.common.StatusCode statusCode) {
        this.statusCode = statusCode;
    }


    /**
     * Gets the timeStamp value for this PortOutResellerResponse.
     * 
     * @return timeStamp
     */
    public java.util.Calendar getTimeStamp() {
        return timeStamp;
    }


    /**
     * Sets the timeStamp value for this PortOutResellerResponse.
     * 
     * @param timeStamp
     */
    public void setTimeStamp(java.util.Calendar timeStamp) {
        this.timeStamp = timeStamp;
    }


    /**
     * Gets the version value for this PortOutResellerResponse.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this PortOutResellerResponse.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the _any value for this PortOutResellerResponse.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this PortOutResellerResponse.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PortOutResellerResponse)) return false;
        PortOutResellerResponse other = (PortOutResellerResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contactRep==null && other.getContactRep()==null) || 
             (this.contactRep!=null &&
              this.contactRep.equals(other.getContactRep()))) &&
            ((this.correlationID==null && other.getCorrelationID()==null) || 
             (this.correlationID!=null &&
              this.correlationID.equals(other.getCorrelationID()))) &&
            ((this.delayCode==null && other.getDelayCode()==null) || 
             (this.delayCode!=null &&
              this.delayCode.equals(other.getDelayCode()))) &&
            ((this.dueDateTime==null && other.getDueDateTime()==null) || 
             (this.dueDateTime!=null &&
              this.dueDateTime.equals(other.getDueDateTime()))) &&
            ((this.errors==null && other.getErrors()==null) || 
             (this.errors!=null &&
              java.util.Arrays.equals(this.errors, other.getErrors()))) &&
            ((this.mdn==null && other.getMdn()==null) || 
             (this.mdn!=null &&
              this.mdn.equals(other.getMdn()))) &&
            ((this.mqRequestMessageId==null && other.getMqRequestMessageId()==null) || 
             (this.mqRequestMessageId!=null &&
              this.mqRequestMessageId.equals(other.getMqRequestMessageId()))) &&
            ((this.reasonCode==null && other.getReasonCode()==null) || 
             (this.reasonCode!=null &&
              this.reasonCode.equals(other.getReasonCode()))) &&
            ((this.reasonCodeDesc==null && other.getReasonCodeDesc()==null) || 
             (this.reasonCodeDesc!=null &&
              this.reasonCodeDesc.equals(other.getReasonCodeDesc()))) &&
            ((this.remarks==null && other.getRemarks()==null) || 
             (this.remarks!=null &&
              this.remarks.equals(other.getRemarks()))) &&
            ((this.repContactNo==null && other.getRepContactNo()==null) || 
             (this.repContactNo!=null &&
              this.repContactNo.equals(other.getRepContactNo()))) &&
            ((this.responseType==null && other.getResponseType()==null) || 
             (this.responseType!=null &&
              this.responseType.equals(other.getResponseType()))) &&
            ((this.statusCode==null && other.getStatusCode()==null) || 
             (this.statusCode!=null &&
              this.statusCode.equals(other.getStatusCode()))) &&
            ((this.timeStamp==null && other.getTimeStamp()==null) || 
             (this.timeStamp!=null &&
              this.timeStamp.equals(other.getTimeStamp()))) &&
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
        if (getContactRep() != null) {
            _hashCode += getContactRep().hashCode();
        }
        if (getCorrelationID() != null) {
            _hashCode += getCorrelationID().hashCode();
        }
        if (getDelayCode() != null) {
            _hashCode += getDelayCode().hashCode();
        }
        if (getDueDateTime() != null) {
            _hashCode += getDueDateTime().hashCode();
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
        if (getMdn() != null) {
            _hashCode += getMdn().hashCode();
        }
        if (getMqRequestMessageId() != null) {
            _hashCode += getMqRequestMessageId().hashCode();
        }
        if (getReasonCode() != null) {
            _hashCode += getReasonCode().hashCode();
        }
        if (getReasonCodeDesc() != null) {
            _hashCode += getReasonCodeDesc().hashCode();
        }
        if (getRemarks() != null) {
            _hashCode += getRemarks().hashCode();
        }
        if (getRepContactNo() != null) {
            _hashCode += getRepContactNo().hashCode();
        }
        if (getResponseType() != null) {
            _hashCode += getResponseType().hashCode();
        }
        if (getStatusCode() != null) {
            _hashCode += getStatusCode().hashCode();
        }
        if (getTimeStamp() != null) {
            _hashCode += getTimeStamp().hashCode();
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
        new org.apache.axis.description.TypeDesc(PortOutResellerResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "PortOutResellerResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactRep");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "contactRep"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correlationID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "correlationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delayCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "delayCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dueDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "dueDateTime"));
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
        elemField.setFieldName("mdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "mdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mqRequestMessageId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "mqRequestMessageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "reasonCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonCodeDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "reasonCodeDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remarks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "remarks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repContactNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "repContactNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "responseType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
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
