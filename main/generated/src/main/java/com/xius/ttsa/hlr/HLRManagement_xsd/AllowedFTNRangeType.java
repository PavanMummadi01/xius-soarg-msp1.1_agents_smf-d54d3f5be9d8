/**
 * AllowedFTNRangeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.ttsa.hlr.HLRManagement_xsd;

public class AllowedFTNRangeType  implements java.io.Serializable {
    private java.math.BigInteger cc;

    private java.math.BigInteger ndc;

    private java.math.BigInteger ccNdc;

    public AllowedFTNRangeType() {
    }

    public AllowedFTNRangeType(
           java.math.BigInteger cc,
           java.math.BigInteger ndc,
           java.math.BigInteger ccNdc) {
           this.cc = cc;
           this.ndc = ndc;
           this.ccNdc = ccNdc;
    }


    /**
     * Gets the cc value for this AllowedFTNRangeType.
     * 
     * @return cc
     */
    public java.math.BigInteger getCc() {
        return cc;
    }


    /**
     * Sets the cc value for this AllowedFTNRangeType.
     * 
     * @param cc
     */
    public void setCc(java.math.BigInteger cc) {
        this.cc = cc;
    }


    /**
     * Gets the ndc value for this AllowedFTNRangeType.
     * 
     * @return ndc
     */
    public java.math.BigInteger getNdc() {
        return ndc;
    }


    /**
     * Sets the ndc value for this AllowedFTNRangeType.
     * 
     * @param ndc
     */
    public void setNdc(java.math.BigInteger ndc) {
        this.ndc = ndc;
    }


    /**
     * Gets the ccNdc value for this AllowedFTNRangeType.
     * 
     * @return ccNdc
     */
    public java.math.BigInteger getCcNdc() {
        return ccNdc;
    }


    /**
     * Sets the ccNdc value for this AllowedFTNRangeType.
     * 
     * @param ccNdc
     */
    public void setCcNdc(java.math.BigInteger ccNdc) {
        this.ccNdc = ccNdc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AllowedFTNRangeType)) return false;
        AllowedFTNRangeType other = (AllowedFTNRangeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cc==null && other.getCc()==null) || 
             (this.cc!=null &&
              this.cc.equals(other.getCc()))) &&
            ((this.ndc==null && other.getNdc()==null) || 
             (this.ndc!=null &&
              this.ndc.equals(other.getNdc()))) &&
            ((this.ccNdc==null && other.getCcNdc()==null) || 
             (this.ccNdc!=null &&
              this.ccNdc.equals(other.getCcNdc())));
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
        if (getCc() != null) {
            _hashCode += getCc().hashCode();
        }
        if (getNdc() != null) {
            _hashCode += getNdc().hashCode();
        }
        if (getCcNdc() != null) {
            _hashCode += getCcNdc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AllowedFTNRangeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "AllowedFTNRangeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "cc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ndc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "ndc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccNdc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "ccNdc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
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
