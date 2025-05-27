/**
 * ReActivateMSISDNRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class ReActivateMSISDNRequest  implements java.io.Serializable {
    private java.lang.String sim;

    private java.lang.String expiredMSISDN;

    private java.lang.String msisdnType;

    public ReActivateMSISDNRequest() {
    }

    public ReActivateMSISDNRequest(
           java.lang.String sim,
           java.lang.String expiredMSISDN,
           java.lang.String msisdnType) {
           this.sim = sim;
           this.expiredMSISDN = expiredMSISDN;
           this.msisdnType = msisdnType;
    }


    /**
     * Gets the sim value for this ReActivateMSISDNRequest.
     * 
     * @return sim
     */
    public java.lang.String getSim() {
        return sim;
    }


    /**
     * Sets the sim value for this ReActivateMSISDNRequest.
     * 
     * @param sim
     */
    public void setSim(java.lang.String sim) {
        this.sim = sim;
    }


    /**
     * Gets the expiredMSISDN value for this ReActivateMSISDNRequest.
     * 
     * @return expiredMSISDN
     */
    public java.lang.String getExpiredMSISDN() {
        return expiredMSISDN;
    }


    /**
     * Sets the expiredMSISDN value for this ReActivateMSISDNRequest.
     * 
     * @param expiredMSISDN
     */
    public void setExpiredMSISDN(java.lang.String expiredMSISDN) {
        this.expiredMSISDN = expiredMSISDN;
    }


    /**
     * Gets the msisdnType value for this ReActivateMSISDNRequest.
     * 
     * @return msisdnType
     */
    public java.lang.String getMsisdnType() {
        return msisdnType;
    }


    /**
     * Sets the msisdnType value for this ReActivateMSISDNRequest.
     * 
     * @param msisdnType
     */
    public void setMsisdnType(java.lang.String msisdnType) {
        this.msisdnType = msisdnType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReActivateMSISDNRequest)) return false;
        ReActivateMSISDNRequest other = (ReActivateMSISDNRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sim==null && other.getSim()==null) || 
             (this.sim!=null &&
              this.sim.equals(other.getSim()))) &&
            ((this.expiredMSISDN==null && other.getExpiredMSISDN()==null) || 
             (this.expiredMSISDN!=null &&
              this.expiredMSISDN.equals(other.getExpiredMSISDN()))) &&
            ((this.msisdnType==null && other.getMsisdnType()==null) || 
             (this.msisdnType!=null &&
              this.msisdnType.equals(other.getMsisdnType())));
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
        if (getSim() != null) {
            _hashCode += getSim().hashCode();
        }
        if (getExpiredMSISDN() != null) {
            _hashCode += getExpiredMSISDN().hashCode();
        }
        if (getMsisdnType() != null) {
            _hashCode += getMsisdnType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReActivateMSISDNRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ReActivateMSISDNRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sim");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "sim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiredMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "expiredMSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdnType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "msisdnType"));
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
