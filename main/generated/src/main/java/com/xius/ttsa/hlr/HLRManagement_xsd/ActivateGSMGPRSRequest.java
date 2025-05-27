/**
 * ActivateGSMGPRSRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.ttsa.hlr.HLRManagement_xsd;

public class ActivateGSMGPRSRequest  implements java.io.Serializable {
    private java.lang.Long MSISDN;

    private java.lang.Long IMSI;

    private int targetGSMstate;

    private int targetGPRSstate;

    public ActivateGSMGPRSRequest() {
    }

    public ActivateGSMGPRSRequest(
           java.lang.Long MSISDN,
           java.lang.Long IMSI,
           int targetGSMstate,
           int targetGPRSstate) {
           this.MSISDN = MSISDN;
           this.IMSI = IMSI;
           this.targetGSMstate = targetGSMstate;
           this.targetGPRSstate = targetGPRSstate;
    }


    /**
     * Gets the MSISDN value for this ActivateGSMGPRSRequest.
     * 
     * @return MSISDN
     */
    public java.lang.Long getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this ActivateGSMGPRSRequest.
     * 
     * @param MSISDN
     */
    public void setMSISDN(java.lang.Long MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the IMSI value for this ActivateGSMGPRSRequest.
     * 
     * @return IMSI
     */
    public java.lang.Long getIMSI() {
        return IMSI;
    }


    /**
     * Sets the IMSI value for this ActivateGSMGPRSRequest.
     * 
     * @param IMSI
     */
    public void setIMSI(java.lang.Long IMSI) {
        this.IMSI = IMSI;
    }


    /**
     * Gets the targetGSMstate value for this ActivateGSMGPRSRequest.
     * 
     * @return targetGSMstate
     */
    public int getTargetGSMstate() {
        return targetGSMstate;
    }


    /**
     * Sets the targetGSMstate value for this ActivateGSMGPRSRequest.
     * 
     * @param targetGSMstate
     */
    public void setTargetGSMstate(int targetGSMstate) {
        this.targetGSMstate = targetGSMstate;
    }


    /**
     * Gets the targetGPRSstate value for this ActivateGSMGPRSRequest.
     * 
     * @return targetGPRSstate
     */
    public int getTargetGPRSstate() {
        return targetGPRSstate;
    }


    /**
     * Sets the targetGPRSstate value for this ActivateGSMGPRSRequest.
     * 
     * @param targetGPRSstate
     */
    public void setTargetGPRSstate(int targetGPRSstate) {
        this.targetGPRSstate = targetGPRSstate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ActivateGSMGPRSRequest)) return false;
        ActivateGSMGPRSRequest other = (ActivateGSMGPRSRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MSISDN==null && other.getMSISDN()==null) || 
             (this.MSISDN!=null &&
              this.MSISDN.equals(other.getMSISDN()))) &&
            ((this.IMSI==null && other.getIMSI()==null) || 
             (this.IMSI!=null &&
              this.IMSI.equals(other.getIMSI()))) &&
            this.targetGSMstate == other.getTargetGSMstate() &&
            this.targetGPRSstate == other.getTargetGPRSstate();
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
        if (getMSISDN() != null) {
            _hashCode += getMSISDN().hashCode();
        }
        if (getIMSI() != null) {
            _hashCode += getIMSI().hashCode();
        }
        _hashCode += getTargetGSMstate();
        _hashCode += getTargetGPRSstate();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ActivateGSMGPRSRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "ActivateGSMGPRSRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "MSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IMSI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "IMSI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetGSMstate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "targetGSMstate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetGPRSstate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "targetGPRSstate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
