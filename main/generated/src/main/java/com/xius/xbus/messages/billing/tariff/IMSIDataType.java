/**
 * IMSIDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.tariff;

public class IMSIDataType  implements java.io.Serializable {
    private java.lang.String imsi;

    private com.xius.xbus.messages.billing.tariff.DataPlanTinyInfoType[] dataPlansList;

    public IMSIDataType() {
    }

    public IMSIDataType(
           java.lang.String imsi,
           com.xius.xbus.messages.billing.tariff.DataPlanTinyInfoType[] dataPlansList) {
           this.imsi = imsi;
           this.dataPlansList = dataPlansList;
    }


    /**
     * Gets the imsi value for this IMSIDataType.
     * 
     * @return imsi
     */
    public java.lang.String getImsi() {
        return imsi;
    }


    /**
     * Sets the imsi value for this IMSIDataType.
     * 
     * @param imsi
     */
    public void setImsi(java.lang.String imsi) {
        this.imsi = imsi;
    }


    /**
     * Gets the dataPlansList value for this IMSIDataType.
     * 
     * @return dataPlansList
     */
    public com.xius.xbus.messages.billing.tariff.DataPlanTinyInfoType[] getDataPlansList() {
        return dataPlansList;
    }


    /**
     * Sets the dataPlansList value for this IMSIDataType.
     * 
     * @param dataPlansList
     */
    public void setDataPlansList(com.xius.xbus.messages.billing.tariff.DataPlanTinyInfoType[] dataPlansList) {
        this.dataPlansList = dataPlansList;
    }

    public com.xius.xbus.messages.billing.tariff.DataPlanTinyInfoType getDataPlansList(int i) {
        return this.dataPlansList[i];
    }

    public void setDataPlansList(int i, com.xius.xbus.messages.billing.tariff.DataPlanTinyInfoType _value) {
        this.dataPlansList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IMSIDataType)) return false;
        IMSIDataType other = (IMSIDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.imsi==null && other.getImsi()==null) || 
             (this.imsi!=null &&
              this.imsi.equals(other.getImsi()))) &&
            ((this.dataPlansList==null && other.getDataPlansList()==null) || 
             (this.dataPlansList!=null &&
              java.util.Arrays.equals(this.dataPlansList, other.getDataPlansList())));
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
        if (getImsi() != null) {
            _hashCode += getImsi().hashCode();
        }
        if (getDataPlansList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDataPlansList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDataPlansList(), i);
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
        new org.apache.axis.description.TypeDesc(IMSIDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "IMSIDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imsi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "imsi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataPlansList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "dataPlansList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "DataPlanTinyInfoType"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
