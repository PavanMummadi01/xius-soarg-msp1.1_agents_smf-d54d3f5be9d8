/**
 * ManageAllowedFtnRangeRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.ttsa.hlr.HLRManagement_xsd;

public class ManageAllowedFtnRangeRequest  implements java.io.Serializable {
    private java.math.BigInteger oldCC;

    private java.math.BigInteger newCC;

    private java.math.BigInteger oldNDC;

    private java.math.BigInteger newNDC;

    private com.xius.ttsa.hlr.HLRManagement_xsd.OptionFlagType actionFlag;

    public ManageAllowedFtnRangeRequest() {
    }

    public ManageAllowedFtnRangeRequest(
           java.math.BigInteger oldCC,
           java.math.BigInteger newCC,
           java.math.BigInteger oldNDC,
           java.math.BigInteger newNDC,
           com.xius.ttsa.hlr.HLRManagement_xsd.OptionFlagType actionFlag) {
           this.oldCC = oldCC;
           this.newCC = newCC;
           this.oldNDC = oldNDC;
           this.newNDC = newNDC;
           this.actionFlag = actionFlag;
    }


    /**
     * Gets the oldCC value for this ManageAllowedFtnRangeRequest.
     * 
     * @return oldCC
     */
    public java.math.BigInteger getOldCC() {
        return oldCC;
    }


    /**
     * Sets the oldCC value for this ManageAllowedFtnRangeRequest.
     * 
     * @param oldCC
     */
    public void setOldCC(java.math.BigInteger oldCC) {
        this.oldCC = oldCC;
    }


    /**
     * Gets the newCC value for this ManageAllowedFtnRangeRequest.
     * 
     * @return newCC
     */
    public java.math.BigInteger getNewCC() {
        return newCC;
    }


    /**
     * Sets the newCC value for this ManageAllowedFtnRangeRequest.
     * 
     * @param newCC
     */
    public void setNewCC(java.math.BigInteger newCC) {
        this.newCC = newCC;
    }


    /**
     * Gets the oldNDC value for this ManageAllowedFtnRangeRequest.
     * 
     * @return oldNDC
     */
    public java.math.BigInteger getOldNDC() {
        return oldNDC;
    }


    /**
     * Sets the oldNDC value for this ManageAllowedFtnRangeRequest.
     * 
     * @param oldNDC
     */
    public void setOldNDC(java.math.BigInteger oldNDC) {
        this.oldNDC = oldNDC;
    }


    /**
     * Gets the newNDC value for this ManageAllowedFtnRangeRequest.
     * 
     * @return newNDC
     */
    public java.math.BigInteger getNewNDC() {
        return newNDC;
    }


    /**
     * Sets the newNDC value for this ManageAllowedFtnRangeRequest.
     * 
     * @param newNDC
     */
    public void setNewNDC(java.math.BigInteger newNDC) {
        this.newNDC = newNDC;
    }


    /**
     * Gets the actionFlag value for this ManageAllowedFtnRangeRequest.
     * 
     * @return actionFlag
     */
    public com.xius.ttsa.hlr.HLRManagement_xsd.OptionFlagType getActionFlag() {
        return actionFlag;
    }


    /**
     * Sets the actionFlag value for this ManageAllowedFtnRangeRequest.
     * 
     * @param actionFlag
     */
    public void setActionFlag(com.xius.ttsa.hlr.HLRManagement_xsd.OptionFlagType actionFlag) {
        this.actionFlag = actionFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManageAllowedFtnRangeRequest)) return false;
        ManageAllowedFtnRangeRequest other = (ManageAllowedFtnRangeRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.oldCC==null && other.getOldCC()==null) || 
             (this.oldCC!=null &&
              this.oldCC.equals(other.getOldCC()))) &&
            ((this.newCC==null && other.getNewCC()==null) || 
             (this.newCC!=null &&
              this.newCC.equals(other.getNewCC()))) &&
            ((this.oldNDC==null && other.getOldNDC()==null) || 
             (this.oldNDC!=null &&
              this.oldNDC.equals(other.getOldNDC()))) &&
            ((this.newNDC==null && other.getNewNDC()==null) || 
             (this.newNDC!=null &&
              this.newNDC.equals(other.getNewNDC()))) &&
            ((this.actionFlag==null && other.getActionFlag()==null) || 
             (this.actionFlag!=null &&
              this.actionFlag.equals(other.getActionFlag())));
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
        if (getOldCC() != null) {
            _hashCode += getOldCC().hashCode();
        }
        if (getNewCC() != null) {
            _hashCode += getNewCC().hashCode();
        }
        if (getOldNDC() != null) {
            _hashCode += getOldNDC().hashCode();
        }
        if (getNewNDC() != null) {
            _hashCode += getNewNDC().hashCode();
        }
        if (getActionFlag() != null) {
            _hashCode += getActionFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManageAllowedFtnRangeRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "ManageAllowedFtnRangeRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldCC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "oldCC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newCC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "newCC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldNDC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "oldNDC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newNDC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "newNDC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "actionFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "OptionFlagType"));
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
