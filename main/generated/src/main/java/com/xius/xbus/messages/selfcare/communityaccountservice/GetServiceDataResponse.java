/**
 * GetServiceDataResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.selfcare.communityaccountservice;

public class GetServiceDataResponse  extends com.xius.xbus.messages.common.WSResponse  implements java.io.Serializable {
    private com.xius.xbus.messages.selfcare.communityaccountservice.ServiceDataType[] serviceDataList;

    private com.xius.xbus.messages.selfcare.communityaccountservice.AdnlFetType[] adnlFeaturesList;

    private com.xius.xbus.messages.selfcare.communityaccountservice.CaldrType[] calendarsList;

    private com.xius.xbus.messages.selfcare.communityaccountservice.NetwksType[] visNetworksList;

    private com.xius.xbus.messages.selfcare.communityaccountservice.DeviceGroupInfoType[] deviceInfoList;

    private com.xius.xbus.messages.selfcare.communityaccountservice.DataZoneGroupInfoType[] dataZoneInfoList;

    public GetServiceDataResponse() {
    }

    public GetServiceDataResponse(
           com.xius.xbus.messages.common.StatusCode statusCode,
           java.util.Calendar timeStamp,
           java.lang.String correlationID,
           com.xius.xbus.messages.common.ErrorData[] errors,
           java.lang.String version,
           com.xius.xbus.messages.selfcare.communityaccountservice.ServiceDataType[] serviceDataList,
           com.xius.xbus.messages.selfcare.communityaccountservice.AdnlFetType[] adnlFeaturesList,
           com.xius.xbus.messages.selfcare.communityaccountservice.CaldrType[] calendarsList,
           com.xius.xbus.messages.selfcare.communityaccountservice.NetwksType[] visNetworksList,
           com.xius.xbus.messages.selfcare.communityaccountservice.DeviceGroupInfoType[] deviceInfoList,
           com.xius.xbus.messages.selfcare.communityaccountservice.DataZoneGroupInfoType[] dataZoneInfoList) {
        super(
            statusCode,
            timeStamp,
            correlationID,
            errors,
            version);
        this.serviceDataList = serviceDataList;
        this.adnlFeaturesList = adnlFeaturesList;
        this.calendarsList = calendarsList;
        this.visNetworksList = visNetworksList;
        this.deviceInfoList = deviceInfoList;
        this.dataZoneInfoList = dataZoneInfoList;
    }


    /**
     * Gets the serviceDataList value for this GetServiceDataResponse.
     * 
     * @return serviceDataList
     */
    public com.xius.xbus.messages.selfcare.communityaccountservice.ServiceDataType[] getServiceDataList() {
        return serviceDataList;
    }


    /**
     * Sets the serviceDataList value for this GetServiceDataResponse.
     * 
     * @param serviceDataList
     */
    public void setServiceDataList(com.xius.xbus.messages.selfcare.communityaccountservice.ServiceDataType[] serviceDataList) {
        this.serviceDataList = serviceDataList;
    }


    /**
     * Gets the adnlFeaturesList value for this GetServiceDataResponse.
     * 
     * @return adnlFeaturesList
     */
    public com.xius.xbus.messages.selfcare.communityaccountservice.AdnlFetType[] getAdnlFeaturesList() {
        return adnlFeaturesList;
    }


    /**
     * Sets the adnlFeaturesList value for this GetServiceDataResponse.
     * 
     * @param adnlFeaturesList
     */
    public void setAdnlFeaturesList(com.xius.xbus.messages.selfcare.communityaccountservice.AdnlFetType[] adnlFeaturesList) {
        this.adnlFeaturesList = adnlFeaturesList;
    }


    /**
     * Gets the calendarsList value for this GetServiceDataResponse.
     * 
     * @return calendarsList
     */
    public com.xius.xbus.messages.selfcare.communityaccountservice.CaldrType[] getCalendarsList() {
        return calendarsList;
    }


    /**
     * Sets the calendarsList value for this GetServiceDataResponse.
     * 
     * @param calendarsList
     */
    public void setCalendarsList(com.xius.xbus.messages.selfcare.communityaccountservice.CaldrType[] calendarsList) {
        this.calendarsList = calendarsList;
    }


    /**
     * Gets the visNetworksList value for this GetServiceDataResponse.
     * 
     * @return visNetworksList
     */
    public com.xius.xbus.messages.selfcare.communityaccountservice.NetwksType[] getVisNetworksList() {
        return visNetworksList;
    }


    /**
     * Sets the visNetworksList value for this GetServiceDataResponse.
     * 
     * @param visNetworksList
     */
    public void setVisNetworksList(com.xius.xbus.messages.selfcare.communityaccountservice.NetwksType[] visNetworksList) {
        this.visNetworksList = visNetworksList;
    }


    /**
     * Gets the deviceInfoList value for this GetServiceDataResponse.
     * 
     * @return deviceInfoList
     */
    public com.xius.xbus.messages.selfcare.communityaccountservice.DeviceGroupInfoType[] getDeviceInfoList() {
        return deviceInfoList;
    }


    /**
     * Sets the deviceInfoList value for this GetServiceDataResponse.
     * 
     * @param deviceInfoList
     */
    public void setDeviceInfoList(com.xius.xbus.messages.selfcare.communityaccountservice.DeviceGroupInfoType[] deviceInfoList) {
        this.deviceInfoList = deviceInfoList;
    }


    /**
     * Gets the dataZoneInfoList value for this GetServiceDataResponse.
     * 
     * @return dataZoneInfoList
     */
    public com.xius.xbus.messages.selfcare.communityaccountservice.DataZoneGroupInfoType[] getDataZoneInfoList() {
        return dataZoneInfoList;
    }


    /**
     * Sets the dataZoneInfoList value for this GetServiceDataResponse.
     * 
     * @param dataZoneInfoList
     */
    public void setDataZoneInfoList(com.xius.xbus.messages.selfcare.communityaccountservice.DataZoneGroupInfoType[] dataZoneInfoList) {
        this.dataZoneInfoList = dataZoneInfoList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetServiceDataResponse)) return false;
        GetServiceDataResponse other = (GetServiceDataResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.serviceDataList==null && other.getServiceDataList()==null) || 
             (this.serviceDataList!=null &&
              java.util.Arrays.equals(this.serviceDataList, other.getServiceDataList()))) &&
            ((this.adnlFeaturesList==null && other.getAdnlFeaturesList()==null) || 
             (this.adnlFeaturesList!=null &&
              java.util.Arrays.equals(this.adnlFeaturesList, other.getAdnlFeaturesList()))) &&
            ((this.calendarsList==null && other.getCalendarsList()==null) || 
             (this.calendarsList!=null &&
              java.util.Arrays.equals(this.calendarsList, other.getCalendarsList()))) &&
            ((this.visNetworksList==null && other.getVisNetworksList()==null) || 
             (this.visNetworksList!=null &&
              java.util.Arrays.equals(this.visNetworksList, other.getVisNetworksList()))) &&
            ((this.deviceInfoList==null && other.getDeviceInfoList()==null) || 
             (this.deviceInfoList!=null &&
              java.util.Arrays.equals(this.deviceInfoList, other.getDeviceInfoList()))) &&
            ((this.dataZoneInfoList==null && other.getDataZoneInfoList()==null) || 
             (this.dataZoneInfoList!=null &&
              java.util.Arrays.equals(this.dataZoneInfoList, other.getDataZoneInfoList())));
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
        if (getServiceDataList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServiceDataList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServiceDataList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAdnlFeaturesList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdnlFeaturesList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdnlFeaturesList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCalendarsList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCalendarsList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCalendarsList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVisNetworksList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVisNetworksList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVisNetworksList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeviceInfoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeviceInfoList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeviceInfoList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDataZoneInfoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDataZoneInfoList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDataZoneInfoList(), i);
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
        new org.apache.axis.description.TypeDesc(GetServiceDataResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">GetServiceDataResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceDataList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "serviceDataList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "ServiceDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "serviceDataList"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adnlFeaturesList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "adnlFeaturesList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "AdnlFetType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "adfeature"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calendarsList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "calendarsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "CaldrType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "calendar"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visNetworksList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "visNetworksList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "NetwksType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "visNetwork"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "deviceInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "DeviceGroupInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "deviceGroupInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataZoneInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "dataZoneInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "DataZoneGroupInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "dataZoneGroupInfo"));
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
