/**
 * GetTariffPackageResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class GetTariffPackageResponse  implements java.io.Serializable {
    private com.xius.billing.SubscriberManagement_xsd.TariffPackageDetailsInfoType[] tariffPackageDetailsList;

    private com.xius.billing.SubscriberManagement_xsd.MsisdnTpDetailsInfoType[] msisdnTpDetails;

    public GetTariffPackageResponse() {
    }

    public GetTariffPackageResponse(
           com.xius.billing.SubscriberManagement_xsd.TariffPackageDetailsInfoType[] tariffPackageDetailsList,
           com.xius.billing.SubscriberManagement_xsd.MsisdnTpDetailsInfoType[] msisdnTpDetails) {
           this.tariffPackageDetailsList = tariffPackageDetailsList;
           this.msisdnTpDetails = msisdnTpDetails;
    }


    /**
     * Gets the tariffPackageDetailsList value for this GetTariffPackageResponse.
     * 
     * @return tariffPackageDetailsList
     */
    public com.xius.billing.SubscriberManagement_xsd.TariffPackageDetailsInfoType[] getTariffPackageDetailsList() {
        return tariffPackageDetailsList;
    }


    /**
     * Sets the tariffPackageDetailsList value for this GetTariffPackageResponse.
     * 
     * @param tariffPackageDetailsList
     */
    public void setTariffPackageDetailsList(com.xius.billing.SubscriberManagement_xsd.TariffPackageDetailsInfoType[] tariffPackageDetailsList) {
        this.tariffPackageDetailsList = tariffPackageDetailsList;
    }


    /**
     * Gets the msisdnTpDetails value for this GetTariffPackageResponse.
     * 
     * @return msisdnTpDetails
     */
    public com.xius.billing.SubscriberManagement_xsd.MsisdnTpDetailsInfoType[] getMsisdnTpDetails() {
        return msisdnTpDetails;
    }


    /**
     * Sets the msisdnTpDetails value for this GetTariffPackageResponse.
     * 
     * @param msisdnTpDetails
     */
    public void setMsisdnTpDetails(com.xius.billing.SubscriberManagement_xsd.MsisdnTpDetailsInfoType[] msisdnTpDetails) {
        this.msisdnTpDetails = msisdnTpDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTariffPackageResponse)) return false;
        GetTariffPackageResponse other = (GetTariffPackageResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tariffPackageDetailsList==null && other.getTariffPackageDetailsList()==null) || 
             (this.tariffPackageDetailsList!=null &&
              java.util.Arrays.equals(this.tariffPackageDetailsList, other.getTariffPackageDetailsList()))) &&
            ((this.msisdnTpDetails==null && other.getMsisdnTpDetails()==null) || 
             (this.msisdnTpDetails!=null &&
              java.util.Arrays.equals(this.msisdnTpDetails, other.getMsisdnTpDetails())));
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
        if (getTariffPackageDetailsList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTariffPackageDetailsList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTariffPackageDetailsList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMsisdnTpDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMsisdnTpDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMsisdnTpDetails(), i);
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
        new org.apache.axis.description.TypeDesc(GetTariffPackageResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetTariffPackageResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tariffPackageDetailsList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "tariffPackageDetailsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "tariffPackageDetailsInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "tariffPackageDetails"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdnTpDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "msisdnTpDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "msisdnTpDetailsInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "msisdnTpDetailsList"));
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
