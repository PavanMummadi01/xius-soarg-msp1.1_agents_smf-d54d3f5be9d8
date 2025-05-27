/**
 * GetDeviceAllResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.device;

public class GetDeviceAllResponse  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private net.bcgi.si.messages.mvnoapi.common.BillingAddressData addressData;

    private java.lang.String correlationID;

    private net.bcgi.si.messages.mvnoapi.device.DeviceHardwareData deviceHardwareData;

    private net.bcgi.si.messages.mvnoapi.device.DeviceLockData deviceLockData;

    private net.bcgi.si.messages.mvnoapi.device.DeviceNetworkData deviceNetworkData;

    private net.bcgi.si.messages.mvnoapi.common.ErrorData[] errors;

    private net.bcgi.si.messages.mvnoapi.account.MiscInfo[] miscInfo;

    private net.bcgi.si.messages.mvnoapi.device.PrepaidAccountDetails prepaidAccountDetails;

    private net.bcgi.si.messages.mvnoapi.device.ServicePlanDetails servicePlanDetails;

    private net.bcgi.si.messages.mvnoapi.common.StatusCode statusCode;

    private java.util.Calendar timeStamp;

    private java.lang.String version;

    private org.apache.axis.message.MessageElement [] _any;

    public GetDeviceAllResponse() {
    }

    public GetDeviceAllResponse(
           net.bcgi.si.messages.mvnoapi.common.BillingAddressData addressData,
           java.lang.String correlationID,
           net.bcgi.si.messages.mvnoapi.device.DeviceHardwareData deviceHardwareData,
           net.bcgi.si.messages.mvnoapi.device.DeviceLockData deviceLockData,
           net.bcgi.si.messages.mvnoapi.device.DeviceNetworkData deviceNetworkData,
           net.bcgi.si.messages.mvnoapi.common.ErrorData[] errors,
           net.bcgi.si.messages.mvnoapi.account.MiscInfo[] miscInfo,
           net.bcgi.si.messages.mvnoapi.device.PrepaidAccountDetails prepaidAccountDetails,
           net.bcgi.si.messages.mvnoapi.device.ServicePlanDetails servicePlanDetails,
           net.bcgi.si.messages.mvnoapi.common.StatusCode statusCode,
           java.util.Calendar timeStamp,
           java.lang.String version,
           org.apache.axis.message.MessageElement [] _any) {
           this.addressData = addressData;
           this.correlationID = correlationID;
           this.deviceHardwareData = deviceHardwareData;
           this.deviceLockData = deviceLockData;
           this.deviceNetworkData = deviceNetworkData;
           this.errors = errors;
           this.miscInfo = miscInfo;
           this.prepaidAccountDetails = prepaidAccountDetails;
           this.servicePlanDetails = servicePlanDetails;
           this.statusCode = statusCode;
           this.timeStamp = timeStamp;
           this.version = version;
           this._any = _any;
    }


    /**
     * Gets the addressData value for this GetDeviceAllResponse.
     * 
     * @return addressData
     */
    public net.bcgi.si.messages.mvnoapi.common.BillingAddressData getAddressData() {
        return addressData;
    }


    /**
     * Sets the addressData value for this GetDeviceAllResponse.
     * 
     * @param addressData
     */
    public void setAddressData(net.bcgi.si.messages.mvnoapi.common.BillingAddressData addressData) {
        this.addressData = addressData;
    }


    /**
     * Gets the correlationID value for this GetDeviceAllResponse.
     * 
     * @return correlationID
     */
    public java.lang.String getCorrelationID() {
        return correlationID;
    }


    /**
     * Sets the correlationID value for this GetDeviceAllResponse.
     * 
     * @param correlationID
     */
    public void setCorrelationID(java.lang.String correlationID) {
        this.correlationID = correlationID;
    }


    /**
     * Gets the deviceHardwareData value for this GetDeviceAllResponse.
     * 
     * @return deviceHardwareData
     */
    public net.bcgi.si.messages.mvnoapi.device.DeviceHardwareData getDeviceHardwareData() {
        return deviceHardwareData;
    }


    /**
     * Sets the deviceHardwareData value for this GetDeviceAllResponse.
     * 
     * @param deviceHardwareData
     */
    public void setDeviceHardwareData(net.bcgi.si.messages.mvnoapi.device.DeviceHardwareData deviceHardwareData) {
        this.deviceHardwareData = deviceHardwareData;
    }


    /**
     * Gets the deviceLockData value for this GetDeviceAllResponse.
     * 
     * @return deviceLockData
     */
    public net.bcgi.si.messages.mvnoapi.device.DeviceLockData getDeviceLockData() {
        return deviceLockData;
    }


    /**
     * Sets the deviceLockData value for this GetDeviceAllResponse.
     * 
     * @param deviceLockData
     */
    public void setDeviceLockData(net.bcgi.si.messages.mvnoapi.device.DeviceLockData deviceLockData) {
        this.deviceLockData = deviceLockData;
    }


    /**
     * Gets the deviceNetworkData value for this GetDeviceAllResponse.
     * 
     * @return deviceNetworkData
     */
    public net.bcgi.si.messages.mvnoapi.device.DeviceNetworkData getDeviceNetworkData() {
        return deviceNetworkData;
    }


    /**
     * Sets the deviceNetworkData value for this GetDeviceAllResponse.
     * 
     * @param deviceNetworkData
     */
    public void setDeviceNetworkData(net.bcgi.si.messages.mvnoapi.device.DeviceNetworkData deviceNetworkData) {
        this.deviceNetworkData = deviceNetworkData;
    }


    /**
     * Gets the errors value for this GetDeviceAllResponse.
     * 
     * @return errors
     */
    public net.bcgi.si.messages.mvnoapi.common.ErrorData[] getErrors() {
        return errors;
    }


    /**
     * Sets the errors value for this GetDeviceAllResponse.
     * 
     * @param errors
     */
    public void setErrors(net.bcgi.si.messages.mvnoapi.common.ErrorData[] errors) {
        this.errors = errors;
    }


    /**
     * Gets the miscInfo value for this GetDeviceAllResponse.
     * 
     * @return miscInfo
     */
    public net.bcgi.si.messages.mvnoapi.account.MiscInfo[] getMiscInfo() {
        return miscInfo;
    }


    /**
     * Sets the miscInfo value for this GetDeviceAllResponse.
     * 
     * @param miscInfo
     */
    public void setMiscInfo(net.bcgi.si.messages.mvnoapi.account.MiscInfo[] miscInfo) {
        this.miscInfo = miscInfo;
    }


    /**
     * Gets the prepaidAccountDetails value for this GetDeviceAllResponse.
     * 
     * @return prepaidAccountDetails
     */
    public net.bcgi.si.messages.mvnoapi.device.PrepaidAccountDetails getPrepaidAccountDetails() {
        return prepaidAccountDetails;
    }


    /**
     * Sets the prepaidAccountDetails value for this GetDeviceAllResponse.
     * 
     * @param prepaidAccountDetails
     */
    public void setPrepaidAccountDetails(net.bcgi.si.messages.mvnoapi.device.PrepaidAccountDetails prepaidAccountDetails) {
        this.prepaidAccountDetails = prepaidAccountDetails;
    }


    /**
     * Gets the servicePlanDetails value for this GetDeviceAllResponse.
     * 
     * @return servicePlanDetails
     */
    public net.bcgi.si.messages.mvnoapi.device.ServicePlanDetails getServicePlanDetails() {
        return servicePlanDetails;
    }


    /**
     * Sets the servicePlanDetails value for this GetDeviceAllResponse.
     * 
     * @param servicePlanDetails
     */
    public void setServicePlanDetails(net.bcgi.si.messages.mvnoapi.device.ServicePlanDetails servicePlanDetails) {
        this.servicePlanDetails = servicePlanDetails;
    }


    /**
     * Gets the statusCode value for this GetDeviceAllResponse.
     * 
     * @return statusCode
     */
    public net.bcgi.si.messages.mvnoapi.common.StatusCode getStatusCode() {
        return statusCode;
    }


    /**
     * Sets the statusCode value for this GetDeviceAllResponse.
     * 
     * @param statusCode
     */
    public void setStatusCode(net.bcgi.si.messages.mvnoapi.common.StatusCode statusCode) {
        this.statusCode = statusCode;
    }


    /**
     * Gets the timeStamp value for this GetDeviceAllResponse.
     * 
     * @return timeStamp
     */
    public java.util.Calendar getTimeStamp() {
        return timeStamp;
    }


    /**
     * Sets the timeStamp value for this GetDeviceAllResponse.
     * 
     * @param timeStamp
     */
    public void setTimeStamp(java.util.Calendar timeStamp) {
        this.timeStamp = timeStamp;
    }


    /**
     * Gets the version value for this GetDeviceAllResponse.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this GetDeviceAllResponse.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the _any value for this GetDeviceAllResponse.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this GetDeviceAllResponse.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDeviceAllResponse)) return false;
        GetDeviceAllResponse other = (GetDeviceAllResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addressData==null && other.getAddressData()==null) || 
             (this.addressData!=null &&
              this.addressData.equals(other.getAddressData()))) &&
            ((this.correlationID==null && other.getCorrelationID()==null) || 
             (this.correlationID!=null &&
              this.correlationID.equals(other.getCorrelationID()))) &&
            ((this.deviceHardwareData==null && other.getDeviceHardwareData()==null) || 
             (this.deviceHardwareData!=null &&
              this.deviceHardwareData.equals(other.getDeviceHardwareData()))) &&
            ((this.deviceLockData==null && other.getDeviceLockData()==null) || 
             (this.deviceLockData!=null &&
              this.deviceLockData.equals(other.getDeviceLockData()))) &&
            ((this.deviceNetworkData==null && other.getDeviceNetworkData()==null) || 
             (this.deviceNetworkData!=null &&
              this.deviceNetworkData.equals(other.getDeviceNetworkData()))) &&
            ((this.errors==null && other.getErrors()==null) || 
             (this.errors!=null &&
              java.util.Arrays.equals(this.errors, other.getErrors()))) &&
            ((this.miscInfo==null && other.getMiscInfo()==null) || 
             (this.miscInfo!=null &&
              java.util.Arrays.equals(this.miscInfo, other.getMiscInfo()))) &&
            ((this.prepaidAccountDetails==null && other.getPrepaidAccountDetails()==null) || 
             (this.prepaidAccountDetails!=null &&
              this.prepaidAccountDetails.equals(other.getPrepaidAccountDetails()))) &&
            ((this.servicePlanDetails==null && other.getServicePlanDetails()==null) || 
             (this.servicePlanDetails!=null &&
              this.servicePlanDetails.equals(other.getServicePlanDetails()))) &&
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
        if (getAddressData() != null) {
            _hashCode += getAddressData().hashCode();
        }
        if (getCorrelationID() != null) {
            _hashCode += getCorrelationID().hashCode();
        }
        if (getDeviceHardwareData() != null) {
            _hashCode += getDeviceHardwareData().hashCode();
        }
        if (getDeviceLockData() != null) {
            _hashCode += getDeviceLockData().hashCode();
        }
        if (getDeviceNetworkData() != null) {
            _hashCode += getDeviceNetworkData().hashCode();
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
        if (getMiscInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMiscInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMiscInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPrepaidAccountDetails() != null) {
            _hashCode += getPrepaidAccountDetails().hashCode();
        }
        if (getServicePlanDetails() != null) {
            _hashCode += getServicePlanDetails().hashCode();
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
        new org.apache.axis.description.TypeDesc(GetDeviceAllResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "GetDeviceAllResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "addressData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "BillingAddressData"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correlationID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "correlationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceHardwareData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "deviceHardwareData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "DeviceHardwareData"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceLockData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "deviceLockData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "DeviceLockData"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceNetworkData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "deviceNetworkData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "DeviceNetworkData"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "errors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "ErrorData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "ErrorData"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("miscInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "miscInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://account.mvnoapi.messages.si.bcgi.net", "MiscInfo"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://account.mvnoapi.messages.si.bcgi.net", "MiscInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prepaidAccountDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "prepaidAccountDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "PrepaidAccountDetails"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicePlanDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "servicePlanDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "ServicePlanDetails"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "statusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "StatusCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeStamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "timeStamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "version"));
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
