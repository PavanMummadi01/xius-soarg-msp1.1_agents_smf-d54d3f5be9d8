/**
 * GetOrderDetailsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.provisioning;

public class GetOrderDetailsResponse  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private java.lang.String correlationID;

    private net.bcgi.si.messages.mvnoapi.common.ErrorData[] errors;

    private net.bcgi.si.messages.mvnoapi.provisioning.OrderDetails[] nonSelfcareOrderDetails;

    private net.bcgi.si.messages.mvnoapi.provisioning.OrderDetails[] selfcareOrderDetails;

    private net.bcgi.si.messages.mvnoapi.common.StatusCode statusCode;

    private java.util.Calendar timeStamp;

    private java.lang.String version;

    private org.apache.axis.message.MessageElement [] _any;

    public GetOrderDetailsResponse() {
    }

    public GetOrderDetailsResponse(
           java.lang.String correlationID,
           net.bcgi.si.messages.mvnoapi.common.ErrorData[] errors,
           net.bcgi.si.messages.mvnoapi.provisioning.OrderDetails[] nonSelfcareOrderDetails,
           net.bcgi.si.messages.mvnoapi.provisioning.OrderDetails[] selfcareOrderDetails,
           net.bcgi.si.messages.mvnoapi.common.StatusCode statusCode,
           java.util.Calendar timeStamp,
           java.lang.String version,
           org.apache.axis.message.MessageElement [] _any) {
           this.correlationID = correlationID;
           this.errors = errors;
           this.nonSelfcareOrderDetails = nonSelfcareOrderDetails;
           this.selfcareOrderDetails = selfcareOrderDetails;
           this.statusCode = statusCode;
           this.timeStamp = timeStamp;
           this.version = version;
           this._any = _any;
    }


    /**
     * Gets the correlationID value for this GetOrderDetailsResponse.
     * 
     * @return correlationID
     */
    public java.lang.String getCorrelationID() {
        return correlationID;
    }


    /**
     * Sets the correlationID value for this GetOrderDetailsResponse.
     * 
     * @param correlationID
     */
    public void setCorrelationID(java.lang.String correlationID) {
        this.correlationID = correlationID;
    }


    /**
     * Gets the errors value for this GetOrderDetailsResponse.
     * 
     * @return errors
     */
    public net.bcgi.si.messages.mvnoapi.common.ErrorData[] getErrors() {
        return errors;
    }


    /**
     * Sets the errors value for this GetOrderDetailsResponse.
     * 
     * @param errors
     */
    public void setErrors(net.bcgi.si.messages.mvnoapi.common.ErrorData[] errors) {
        this.errors = errors;
    }


    /**
     * Gets the nonSelfcareOrderDetails value for this GetOrderDetailsResponse.
     * 
     * @return nonSelfcareOrderDetails
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.OrderDetails[] getNonSelfcareOrderDetails() {
        return nonSelfcareOrderDetails;
    }


    /**
     * Sets the nonSelfcareOrderDetails value for this GetOrderDetailsResponse.
     * 
     * @param nonSelfcareOrderDetails
     */
    public void setNonSelfcareOrderDetails(net.bcgi.si.messages.mvnoapi.provisioning.OrderDetails[] nonSelfcareOrderDetails) {
        this.nonSelfcareOrderDetails = nonSelfcareOrderDetails;
    }


    /**
     * Gets the selfcareOrderDetails value for this GetOrderDetailsResponse.
     * 
     * @return selfcareOrderDetails
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.OrderDetails[] getSelfcareOrderDetails() {
        return selfcareOrderDetails;
    }


    /**
     * Sets the selfcareOrderDetails value for this GetOrderDetailsResponse.
     * 
     * @param selfcareOrderDetails
     */
    public void setSelfcareOrderDetails(net.bcgi.si.messages.mvnoapi.provisioning.OrderDetails[] selfcareOrderDetails) {
        this.selfcareOrderDetails = selfcareOrderDetails;
    }


    /**
     * Gets the statusCode value for this GetOrderDetailsResponse.
     * 
     * @return statusCode
     */
    public net.bcgi.si.messages.mvnoapi.common.StatusCode getStatusCode() {
        return statusCode;
    }


    /**
     * Sets the statusCode value for this GetOrderDetailsResponse.
     * 
     * @param statusCode
     */
    public void setStatusCode(net.bcgi.si.messages.mvnoapi.common.StatusCode statusCode) {
        this.statusCode = statusCode;
    }


    /**
     * Gets the timeStamp value for this GetOrderDetailsResponse.
     * 
     * @return timeStamp
     */
    public java.util.Calendar getTimeStamp() {
        return timeStamp;
    }


    /**
     * Sets the timeStamp value for this GetOrderDetailsResponse.
     * 
     * @param timeStamp
     */
    public void setTimeStamp(java.util.Calendar timeStamp) {
        this.timeStamp = timeStamp;
    }


    /**
     * Gets the version value for this GetOrderDetailsResponse.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this GetOrderDetailsResponse.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the _any value for this GetOrderDetailsResponse.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this GetOrderDetailsResponse.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetOrderDetailsResponse)) return false;
        GetOrderDetailsResponse other = (GetOrderDetailsResponse) obj;
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
            ((this.nonSelfcareOrderDetails==null && other.getNonSelfcareOrderDetails()==null) || 
             (this.nonSelfcareOrderDetails!=null &&
              java.util.Arrays.equals(this.nonSelfcareOrderDetails, other.getNonSelfcareOrderDetails()))) &&
            ((this.selfcareOrderDetails==null && other.getSelfcareOrderDetails()==null) || 
             (this.selfcareOrderDetails!=null &&
              java.util.Arrays.equals(this.selfcareOrderDetails, other.getSelfcareOrderDetails()))) &&
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
        if (getNonSelfcareOrderDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNonSelfcareOrderDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNonSelfcareOrderDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSelfcareOrderDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSelfcareOrderDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSelfcareOrderDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        new org.apache.axis.description.TypeDesc(GetOrderDetailsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "GetOrderDetailsResponse"));
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
        elemField.setFieldName("nonSelfcareOrderDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "nonSelfcareOrderDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "OrderDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "OrderDetails"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selfcareOrderDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "selfcareOrderDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "OrderDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "OrderDetails"));
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
