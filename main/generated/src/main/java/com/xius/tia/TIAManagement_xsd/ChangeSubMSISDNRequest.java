/**
 * ChangeSubMSISDNRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.TIAManagement_xsd;

public class ChangeSubMSISDNRequest  implements java.io.Serializable {
    private com.xius.tia.TIAManagement_xsd.SimDataType simData;

    private java.lang.String newIMSI;

    private java.lang.String oldMSISDN;

    private java.lang.String newICC;

    private java.lang.String NIR;

    public ChangeSubMSISDNRequest() {
    }

    public ChangeSubMSISDNRequest(
           com.xius.tia.TIAManagement_xsd.SimDataType simData,
           java.lang.String newIMSI,
           java.lang.String oldMSISDN,
           java.lang.String newICC,
           java.lang.String NIR) {
           this.simData = simData;
           this.newIMSI = newIMSI;
           this.oldMSISDN = oldMSISDN;
           this.newICC = newICC;
           this.NIR = NIR;
    }


    /**
     * Gets the simData value for this ChangeSubMSISDNRequest.
     * 
     * @return simData
     */
    public com.xius.tia.TIAManagement_xsd.SimDataType getSimData() {
        return simData;
    }


    /**
     * Sets the simData value for this ChangeSubMSISDNRequest.
     * 
     * @param simData
     */
    public void setSimData(com.xius.tia.TIAManagement_xsd.SimDataType simData) {
        this.simData = simData;
    }


    /**
     * Gets the newIMSI value for this ChangeSubMSISDNRequest.
     * 
     * @return newIMSI
     */
    public java.lang.String getNewIMSI() {
        return newIMSI;
    }


    /**
     * Sets the newIMSI value for this ChangeSubMSISDNRequest.
     * 
     * @param newIMSI
     */
    public void setNewIMSI(java.lang.String newIMSI) {
        this.newIMSI = newIMSI;
    }


    /**
     * Gets the oldMSISDN value for this ChangeSubMSISDNRequest.
     * 
     * @return oldMSISDN
     */
    public java.lang.String getOldMSISDN() {
        return oldMSISDN;
    }


    /**
     * Sets the oldMSISDN value for this ChangeSubMSISDNRequest.
     * 
     * @param oldMSISDN
     */
    public void setOldMSISDN(java.lang.String oldMSISDN) {
        this.oldMSISDN = oldMSISDN;
    }


    /**
     * Gets the newICC value for this ChangeSubMSISDNRequest.
     * 
     * @return newICC
     */
    public java.lang.String getNewICC() {
        return newICC;
    }


    /**
     * Sets the newICC value for this ChangeSubMSISDNRequest.
     * 
     * @param newICC
     */
    public void setNewICC(java.lang.String newICC) {
        this.newICC = newICC;
    }


    /**
     * Gets the NIR value for this ChangeSubMSISDNRequest.
     * 
     * @return NIR
     */
    public java.lang.String getNIR() {
        return NIR;
    }


    /**
     * Sets the NIR value for this ChangeSubMSISDNRequest.
     * 
     * @param NIR
     */
    public void setNIR(java.lang.String NIR) {
        this.NIR = NIR;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeSubMSISDNRequest)) return false;
        ChangeSubMSISDNRequest other = (ChangeSubMSISDNRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.simData==null && other.getSimData()==null) || 
             (this.simData!=null &&
              this.simData.equals(other.getSimData()))) &&
            ((this.newIMSI==null && other.getNewIMSI()==null) || 
             (this.newIMSI!=null &&
              this.newIMSI.equals(other.getNewIMSI()))) &&
            ((this.oldMSISDN==null && other.getOldMSISDN()==null) || 
             (this.oldMSISDN!=null &&
              this.oldMSISDN.equals(other.getOldMSISDN()))) &&
            ((this.newICC==null && other.getNewICC()==null) || 
             (this.newICC!=null &&
              this.newICC.equals(other.getNewICC()))) &&
            ((this.NIR==null && other.getNIR()==null) || 
             (this.NIR!=null &&
              this.NIR.equals(other.getNIR())));
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
        if (getSimData() != null) {
            _hashCode += getSimData().hashCode();
        }
        if (getNewIMSI() != null) {
            _hashCode += getNewIMSI().hashCode();
        }
        if (getOldMSISDN() != null) {
            _hashCode += getOldMSISDN().hashCode();
        }
        if (getNewICC() != null) {
            _hashCode += getNewICC().hashCode();
        }
        if (getNIR() != null) {
            _hashCode += getNIR().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeSubMSISDNRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "ChangeSubMSISDNRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("simData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "simData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "simDataType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newIMSI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "newIMSI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "oldMSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newICC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "newICC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NIR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "NIR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
