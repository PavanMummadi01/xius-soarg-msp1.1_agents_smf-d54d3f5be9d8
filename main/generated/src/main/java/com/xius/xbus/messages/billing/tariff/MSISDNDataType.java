/**
 * MSISDNDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.tariff;

public class MSISDNDataType  implements java.io.Serializable {
    private java.lang.String msisdn;

    private com.xius.xbus.messages.billing.tariff.DataPlanTinyInfoType[] dataPlansList;

    public MSISDNDataType() {
    }

    public MSISDNDataType(
           java.lang.String msisdn,
           com.xius.xbus.messages.billing.tariff.DataPlanTinyInfoType[] dataPlansList) {
           this.msisdn = msisdn;
           this.dataPlansList = dataPlansList;
    }


    /**
     * Gets the msisdn value for this MSISDNDataType.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this MSISDNDataType.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the dataPlansList value for this MSISDNDataType.
     * 
     * @return dataPlansList
     */
    public com.xius.xbus.messages.billing.tariff.DataPlanTinyInfoType[] getDataPlansList() {
        return dataPlansList;
    }


    /**
     * Sets the dataPlansList value for this MSISDNDataType.
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
        if (!(obj instanceof MSISDNDataType)) return false;
        MSISDNDataType other = (MSISDNDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
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
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
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
        new org.apache.axis.description.TypeDesc(MSISDNDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "MSISDNDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "msisdn"));
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
