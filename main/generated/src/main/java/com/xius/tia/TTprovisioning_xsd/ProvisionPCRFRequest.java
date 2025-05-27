/**
 * ProvisionPCRFRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.TTprovisioning_xsd;

public class ProvisionPCRFRequest  implements java.io.Serializable {
    private java.lang.String IMSI;

    private java.lang.String MSISDN;

    private java.lang.String threegind;

    private com.xius.tia.TTprovisioning_xsd.ProdListType[] prodList;

    public ProvisionPCRFRequest() {
    }

    public ProvisionPCRFRequest(
           java.lang.String IMSI,
           java.lang.String MSISDN,
           java.lang.String threegind,
           com.xius.tia.TTprovisioning_xsd.ProdListType[] prodList) {
           this.IMSI = IMSI;
           this.MSISDN = MSISDN;
           this.threegind = threegind;
           this.prodList = prodList;
    }


    /**
     * Gets the IMSI value for this ProvisionPCRFRequest.
     * 
     * @return IMSI
     */
    public java.lang.String getIMSI() {
        return IMSI;
    }


    /**
     * Sets the IMSI value for this ProvisionPCRFRequest.
     * 
     * @param IMSI
     */
    public void setIMSI(java.lang.String IMSI) {
        this.IMSI = IMSI;
    }


    /**
     * Gets the MSISDN value for this ProvisionPCRFRequest.
     * 
     * @return MSISDN
     */
    public java.lang.String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this ProvisionPCRFRequest.
     * 
     * @param MSISDN
     */
    public void setMSISDN(java.lang.String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the threegind value for this ProvisionPCRFRequest.
     * 
     * @return threegind
     */
    public java.lang.String getThreegind() {
        return threegind;
    }


    /**
     * Sets the threegind value for this ProvisionPCRFRequest.
     * 
     * @param threegind
     */
    public void setThreegind(java.lang.String threegind) {
        this.threegind = threegind;
    }


    /**
     * Gets the prodList value for this ProvisionPCRFRequest.
     * 
     * @return prodList
     */
    public com.xius.tia.TTprovisioning_xsd.ProdListType[] getProdList() {
        return prodList;
    }


    /**
     * Sets the prodList value for this ProvisionPCRFRequest.
     * 
     * @param prodList
     */
    public void setProdList(com.xius.tia.TTprovisioning_xsd.ProdListType[] prodList) {
        this.prodList = prodList;
    }

    public com.xius.tia.TTprovisioning_xsd.ProdListType getProdList(int i) {
        return this.prodList[i];
    }

    public void setProdList(int i, com.xius.tia.TTprovisioning_xsd.ProdListType _value) {
        this.prodList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProvisionPCRFRequest)) return false;
        ProvisionPCRFRequest other = (ProvisionPCRFRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.IMSI==null && other.getIMSI()==null) || 
             (this.IMSI!=null &&
              this.IMSI.equals(other.getIMSI()))) &&
            ((this.MSISDN==null && other.getMSISDN()==null) || 
             (this.MSISDN!=null &&
              this.MSISDN.equals(other.getMSISDN()))) &&
            ((this.threegind==null && other.getThreegind()==null) || 
             (this.threegind!=null &&
              this.threegind.equals(other.getThreegind()))) &&
            ((this.prodList==null && other.getProdList()==null) || 
             (this.prodList!=null &&
              java.util.Arrays.equals(this.prodList, other.getProdList())));
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
        if (getIMSI() != null) {
            _hashCode += getIMSI().hashCode();
        }
        if (getMSISDN() != null) {
            _hashCode += getMSISDN().hashCode();
        }
        if (getThreegind() != null) {
            _hashCode += getThreegind().hashCode();
        }
        if (getProdList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProdList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProdList(), i);
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
        new org.apache.axis.description.TypeDesc(ProvisionPCRFRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "provisionPCRFRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IMSI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "IMSI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "MSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("threegind");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "threegind"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prodList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "prodList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "ProdListType"));
        elemField.setMinOccurs(0);
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
