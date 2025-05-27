/**
 * ChangeSubMSISDNRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.ttsa.hlr.HLRManagement_xsd;

public class ChangeSubMSISDNRequest  implements java.io.Serializable {
    private long oldMSISDN;

    private long newMSISDN;

    private java.lang.Long oldIMSI;

    public ChangeSubMSISDNRequest() {
    }

    public ChangeSubMSISDNRequest(
           long oldMSISDN,
           long newMSISDN,
           java.lang.Long oldIMSI) {
           this.oldMSISDN = oldMSISDN;
           this.newMSISDN = newMSISDN;
           this.oldIMSI = oldIMSI;
    }


    /**
     * Gets the oldMSISDN value for this ChangeSubMSISDNRequest.
     * 
     * @return oldMSISDN
     */
    public long getOldMSISDN() {
        return oldMSISDN;
    }


    /**
     * Sets the oldMSISDN value for this ChangeSubMSISDNRequest.
     * 
     * @param oldMSISDN
     */
    public void setOldMSISDN(long oldMSISDN) {
        this.oldMSISDN = oldMSISDN;
    }


    /**
     * Gets the newMSISDN value for this ChangeSubMSISDNRequest.
     * 
     * @return newMSISDN
     */
    public long getNewMSISDN() {
        return newMSISDN;
    }


    /**
     * Sets the newMSISDN value for this ChangeSubMSISDNRequest.
     * 
     * @param newMSISDN
     */
    public void setNewMSISDN(long newMSISDN) {
        this.newMSISDN = newMSISDN;
    }


    /**
     * Gets the oldIMSI value for this ChangeSubMSISDNRequest.
     * 
     * @return oldIMSI
     */
    public java.lang.Long getOldIMSI() {
        return oldIMSI;
    }


    /**
     * Sets the oldIMSI value for this ChangeSubMSISDNRequest.
     * 
     * @param oldIMSI
     */
    public void setOldIMSI(java.lang.Long oldIMSI) {
        this.oldIMSI = oldIMSI;
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
            this.oldMSISDN == other.getOldMSISDN() &&
            this.newMSISDN == other.getNewMSISDN() &&
            ((this.oldIMSI==null && other.getOldIMSI()==null) || 
             (this.oldIMSI!=null &&
              this.oldIMSI.equals(other.getOldIMSI())));
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
        _hashCode += new Long(getOldMSISDN()).hashCode();
        _hashCode += new Long(getNewMSISDN()).hashCode();
        if (getOldIMSI() != null) {
            _hashCode += getOldIMSI().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeSubMSISDNRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "ChangeSubMSISDNRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "oldMSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "newMSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldIMSI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "oldIMSI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
