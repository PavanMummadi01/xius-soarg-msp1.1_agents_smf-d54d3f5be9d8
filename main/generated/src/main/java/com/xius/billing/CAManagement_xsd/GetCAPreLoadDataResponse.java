/**
 * GetCAPreLoadDataResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.CAManagement_xsd;

public class GetCAPreLoadDataResponse  implements java.io.Serializable {
    private com.xius.billing.CAManagement_xsd.ServiceInfoItemType[] service;

    private com.xius.billing.CAManagement_xsd.AdnlFeturType[] features;

    private com.xius.billing.CAManagement_xsd.CalendarType[] calendars;

    private com.xius.billing.CAManagement_xsd.NetworksType[] networks;

    private com.xius.billing.CAManagement_xsd.DeviceGroupInfoType[] deviceInfo;

    private com.xius.billing.CAManagement_xsd.DataZoneGroupInfoType[] dataZoneInfo;

    public GetCAPreLoadDataResponse() {
    }

    public GetCAPreLoadDataResponse(
           com.xius.billing.CAManagement_xsd.ServiceInfoItemType[] service,
           com.xius.billing.CAManagement_xsd.AdnlFeturType[] features,
           com.xius.billing.CAManagement_xsd.CalendarType[] calendars,
           com.xius.billing.CAManagement_xsd.NetworksType[] networks,
           com.xius.billing.CAManagement_xsd.DeviceGroupInfoType[] deviceInfo,
           com.xius.billing.CAManagement_xsd.DataZoneGroupInfoType[] dataZoneInfo) {
           this.service = service;
           this.features = features;
           this.calendars = calendars;
           this.networks = networks;
           this.deviceInfo = deviceInfo;
           this.dataZoneInfo = dataZoneInfo;
    }


    /**
     * Gets the service value for this GetCAPreLoadDataResponse.
     * 
     * @return service
     */
    public com.xius.billing.CAManagement_xsd.ServiceInfoItemType[] getService() {
        return service;
    }


    /**
     * Sets the service value for this GetCAPreLoadDataResponse.
     * 
     * @param service
     */
    public void setService(com.xius.billing.CAManagement_xsd.ServiceInfoItemType[] service) {
        this.service = service;
    }


    /**
     * Gets the features value for this GetCAPreLoadDataResponse.
     * 
     * @return features
     */
    public com.xius.billing.CAManagement_xsd.AdnlFeturType[] getFeatures() {
        return features;
    }


    /**
     * Sets the features value for this GetCAPreLoadDataResponse.
     * 
     * @param features
     */
    public void setFeatures(com.xius.billing.CAManagement_xsd.AdnlFeturType[] features) {
        this.features = features;
    }


    /**
     * Gets the calendars value for this GetCAPreLoadDataResponse.
     * 
     * @return calendars
     */
    public com.xius.billing.CAManagement_xsd.CalendarType[] getCalendars() {
        return calendars;
    }


    /**
     * Sets the calendars value for this GetCAPreLoadDataResponse.
     * 
     * @param calendars
     */
    public void setCalendars(com.xius.billing.CAManagement_xsd.CalendarType[] calendars) {
        this.calendars = calendars;
    }


    /**
     * Gets the networks value for this GetCAPreLoadDataResponse.
     * 
     * @return networks
     */
    public com.xius.billing.CAManagement_xsd.NetworksType[] getNetworks() {
        return networks;
    }


    /**
     * Sets the networks value for this GetCAPreLoadDataResponse.
     * 
     * @param networks
     */
    public void setNetworks(com.xius.billing.CAManagement_xsd.NetworksType[] networks) {
        this.networks = networks;
    }


    /**
     * Gets the deviceInfo value for this GetCAPreLoadDataResponse.
     * 
     * @return deviceInfo
     */
    public com.xius.billing.CAManagement_xsd.DeviceGroupInfoType[] getDeviceInfo() {
        return deviceInfo;
    }


    /**
     * Sets the deviceInfo value for this GetCAPreLoadDataResponse.
     * 
     * @param deviceInfo
     */
    public void setDeviceInfo(com.xius.billing.CAManagement_xsd.DeviceGroupInfoType[] deviceInfo) {
        this.deviceInfo = deviceInfo;
    }


    /**
     * Gets the dataZoneInfo value for this GetCAPreLoadDataResponse.
     * 
     * @return dataZoneInfo
     */
    public com.xius.billing.CAManagement_xsd.DataZoneGroupInfoType[] getDataZoneInfo() {
        return dataZoneInfo;
    }


    /**
     * Sets the dataZoneInfo value for this GetCAPreLoadDataResponse.
     * 
     * @param dataZoneInfo
     */
    public void setDataZoneInfo(com.xius.billing.CAManagement_xsd.DataZoneGroupInfoType[] dataZoneInfo) {
        this.dataZoneInfo = dataZoneInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCAPreLoadDataResponse)) return false;
        GetCAPreLoadDataResponse other = (GetCAPreLoadDataResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.service==null && other.getService()==null) || 
             (this.service!=null &&
              java.util.Arrays.equals(this.service, other.getService()))) &&
            ((this.features==null && other.getFeatures()==null) || 
             (this.features!=null &&
              java.util.Arrays.equals(this.features, other.getFeatures()))) &&
            ((this.calendars==null && other.getCalendars()==null) || 
             (this.calendars!=null &&
              java.util.Arrays.equals(this.calendars, other.getCalendars()))) &&
            ((this.networks==null && other.getNetworks()==null) || 
             (this.networks!=null &&
              java.util.Arrays.equals(this.networks, other.getNetworks()))) &&
            ((this.deviceInfo==null && other.getDeviceInfo()==null) || 
             (this.deviceInfo!=null &&
              java.util.Arrays.equals(this.deviceInfo, other.getDeviceInfo()))) &&
            ((this.dataZoneInfo==null && other.getDataZoneInfo()==null) || 
             (this.dataZoneInfo!=null &&
              java.util.Arrays.equals(this.dataZoneInfo, other.getDataZoneInfo())));
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
        if (getService() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getService());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getService(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFeatures() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFeatures());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFeatures(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCalendars() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCalendars());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCalendars(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNetworks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNetworks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNetworks(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeviceInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeviceInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeviceInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDataZoneInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDataZoneInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDataZoneInfo(), i);
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
        new org.apache.axis.description.TypeDesc(GetCAPreLoadDataResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "GetCAPreLoadDataResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "service"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "ServiceInfoItemType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "serviceInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("features");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "features"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "AdnlFeturType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "feature"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calendars");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "Calendars"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "CalendarType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "calendar"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "networks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "NetworksType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "network"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "deviceInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "DeviceGroupInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "feature"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataZoneInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "dataZoneInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "DataZoneGroupInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "feature"));
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
