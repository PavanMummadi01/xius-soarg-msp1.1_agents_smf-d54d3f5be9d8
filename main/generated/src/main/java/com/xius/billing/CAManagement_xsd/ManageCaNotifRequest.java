/**
 * ManageCaNotifRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.CAManagement_xsd;

public class ManageCaNotifRequest  implements java.io.Serializable {
    private java.lang.String optionFlag;

    private java.lang.String caPkgId;

    private java.lang.String prntThrsldLimit;

    private java.lang.String prntNotifType;

    private java.lang.String prntThrsldNotifToChild;

    private java.lang.String childThrsldLimit;

    private java.lang.String childNotifType;

    private java.lang.String childThrsldNotifToPrnt;

    public ManageCaNotifRequest() {
    }

    public ManageCaNotifRequest(
           java.lang.String optionFlag,
           java.lang.String caPkgId,
           java.lang.String prntThrsldLimit,
           java.lang.String prntNotifType,
           java.lang.String prntThrsldNotifToChild,
           java.lang.String childThrsldLimit,
           java.lang.String childNotifType,
           java.lang.String childThrsldNotifToPrnt) {
           this.optionFlag = optionFlag;
           this.caPkgId = caPkgId;
           this.prntThrsldLimit = prntThrsldLimit;
           this.prntNotifType = prntNotifType;
           this.prntThrsldNotifToChild = prntThrsldNotifToChild;
           this.childThrsldLimit = childThrsldLimit;
           this.childNotifType = childNotifType;
           this.childThrsldNotifToPrnt = childThrsldNotifToPrnt;
    }


    /**
     * Gets the optionFlag value for this ManageCaNotifRequest.
     * 
     * @return optionFlag
     */
    public java.lang.String getOptionFlag() {
        return optionFlag;
    }


    /**
     * Sets the optionFlag value for this ManageCaNotifRequest.
     * 
     * @param optionFlag
     */
    public void setOptionFlag(java.lang.String optionFlag) {
        this.optionFlag = optionFlag;
    }


    /**
     * Gets the caPkgId value for this ManageCaNotifRequest.
     * 
     * @return caPkgId
     */
    public java.lang.String getCaPkgId() {
        return caPkgId;
    }


    /**
     * Sets the caPkgId value for this ManageCaNotifRequest.
     * 
     * @param caPkgId
     */
    public void setCaPkgId(java.lang.String caPkgId) {
        this.caPkgId = caPkgId;
    }


    /**
     * Gets the prntThrsldLimit value for this ManageCaNotifRequest.
     * 
     * @return prntThrsldLimit
     */
    public java.lang.String getPrntThrsldLimit() {
        return prntThrsldLimit;
    }


    /**
     * Sets the prntThrsldLimit value for this ManageCaNotifRequest.
     * 
     * @param prntThrsldLimit
     */
    public void setPrntThrsldLimit(java.lang.String prntThrsldLimit) {
        this.prntThrsldLimit = prntThrsldLimit;
    }


    /**
     * Gets the prntNotifType value for this ManageCaNotifRequest.
     * 
     * @return prntNotifType
     */
    public java.lang.String getPrntNotifType() {
        return prntNotifType;
    }


    /**
     * Sets the prntNotifType value for this ManageCaNotifRequest.
     * 
     * @param prntNotifType
     */
    public void setPrntNotifType(java.lang.String prntNotifType) {
        this.prntNotifType = prntNotifType;
    }


    /**
     * Gets the prntThrsldNotifToChild value for this ManageCaNotifRequest.
     * 
     * @return prntThrsldNotifToChild
     */
    public java.lang.String getPrntThrsldNotifToChild() {
        return prntThrsldNotifToChild;
    }


    /**
     * Sets the prntThrsldNotifToChild value for this ManageCaNotifRequest.
     * 
     * @param prntThrsldNotifToChild
     */
    public void setPrntThrsldNotifToChild(java.lang.String prntThrsldNotifToChild) {
        this.prntThrsldNotifToChild = prntThrsldNotifToChild;
    }


    /**
     * Gets the childThrsldLimit value for this ManageCaNotifRequest.
     * 
     * @return childThrsldLimit
     */
    public java.lang.String getChildThrsldLimit() {
        return childThrsldLimit;
    }


    /**
     * Sets the childThrsldLimit value for this ManageCaNotifRequest.
     * 
     * @param childThrsldLimit
     */
    public void setChildThrsldLimit(java.lang.String childThrsldLimit) {
        this.childThrsldLimit = childThrsldLimit;
    }


    /**
     * Gets the childNotifType value for this ManageCaNotifRequest.
     * 
     * @return childNotifType
     */
    public java.lang.String getChildNotifType() {
        return childNotifType;
    }


    /**
     * Sets the childNotifType value for this ManageCaNotifRequest.
     * 
     * @param childNotifType
     */
    public void setChildNotifType(java.lang.String childNotifType) {
        this.childNotifType = childNotifType;
    }


    /**
     * Gets the childThrsldNotifToPrnt value for this ManageCaNotifRequest.
     * 
     * @return childThrsldNotifToPrnt
     */
    public java.lang.String getChildThrsldNotifToPrnt() {
        return childThrsldNotifToPrnt;
    }


    /**
     * Sets the childThrsldNotifToPrnt value for this ManageCaNotifRequest.
     * 
     * @param childThrsldNotifToPrnt
     */
    public void setChildThrsldNotifToPrnt(java.lang.String childThrsldNotifToPrnt) {
        this.childThrsldNotifToPrnt = childThrsldNotifToPrnt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManageCaNotifRequest)) return false;
        ManageCaNotifRequest other = (ManageCaNotifRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.optionFlag==null && other.getOptionFlag()==null) || 
             (this.optionFlag!=null &&
              this.optionFlag.equals(other.getOptionFlag()))) &&
            ((this.caPkgId==null && other.getCaPkgId()==null) || 
             (this.caPkgId!=null &&
              this.caPkgId.equals(other.getCaPkgId()))) &&
            ((this.prntThrsldLimit==null && other.getPrntThrsldLimit()==null) || 
             (this.prntThrsldLimit!=null &&
              this.prntThrsldLimit.equals(other.getPrntThrsldLimit()))) &&
            ((this.prntNotifType==null && other.getPrntNotifType()==null) || 
             (this.prntNotifType!=null &&
              this.prntNotifType.equals(other.getPrntNotifType()))) &&
            ((this.prntThrsldNotifToChild==null && other.getPrntThrsldNotifToChild()==null) || 
             (this.prntThrsldNotifToChild!=null &&
              this.prntThrsldNotifToChild.equals(other.getPrntThrsldNotifToChild()))) &&
            ((this.childThrsldLimit==null && other.getChildThrsldLimit()==null) || 
             (this.childThrsldLimit!=null &&
              this.childThrsldLimit.equals(other.getChildThrsldLimit()))) &&
            ((this.childNotifType==null && other.getChildNotifType()==null) || 
             (this.childNotifType!=null &&
              this.childNotifType.equals(other.getChildNotifType()))) &&
            ((this.childThrsldNotifToPrnt==null && other.getChildThrsldNotifToPrnt()==null) || 
             (this.childThrsldNotifToPrnt!=null &&
              this.childThrsldNotifToPrnt.equals(other.getChildThrsldNotifToPrnt())));
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
        if (getOptionFlag() != null) {
            _hashCode += getOptionFlag().hashCode();
        }
        if (getCaPkgId() != null) {
            _hashCode += getCaPkgId().hashCode();
        }
        if (getPrntThrsldLimit() != null) {
            _hashCode += getPrntThrsldLimit().hashCode();
        }
        if (getPrntNotifType() != null) {
            _hashCode += getPrntNotifType().hashCode();
        }
        if (getPrntThrsldNotifToChild() != null) {
            _hashCode += getPrntThrsldNotifToChild().hashCode();
        }
        if (getChildThrsldLimit() != null) {
            _hashCode += getChildThrsldLimit().hashCode();
        }
        if (getChildNotifType() != null) {
            _hashCode += getChildNotifType().hashCode();
        }
        if (getChildThrsldNotifToPrnt() != null) {
            _hashCode += getChildThrsldNotifToPrnt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManageCaNotifRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "ManageCaNotifRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "optionFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caPkgId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "caPkgId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prntThrsldLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "prntThrsldLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prntNotifType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "prntNotifType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prntThrsldNotifToChild");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "prntThrsldNotifToChild"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childThrsldLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "childThrsldLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childNotifType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "childNotifType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childThrsldNotifToPrnt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "childThrsldNotifToPrnt"));
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
