/**
 * GetForceRenDetailsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class GetForceRenDetailsResponse  implements java.io.Serializable {
    private java.lang.String oldTp;

    private java.lang.String newTp;

    private java.lang.String oldTpName;

    private java.lang.String newTpName;

    private java.math.BigDecimal oldTpCharge;

    private java.math.BigDecimal newTpCharge;

    public GetForceRenDetailsResponse() {
    }

    public GetForceRenDetailsResponse(
           java.lang.String oldTp,
           java.lang.String newTp,
           java.lang.String oldTpName,
           java.lang.String newTpName,
           java.math.BigDecimal oldTpCharge,
           java.math.BigDecimal newTpCharge) {
           this.oldTp = oldTp;
           this.newTp = newTp;
           this.oldTpName = oldTpName;
           this.newTpName = newTpName;
           this.oldTpCharge = oldTpCharge;
           this.newTpCharge = newTpCharge;
    }


    /**
     * Gets the oldTp value for this GetForceRenDetailsResponse.
     * 
     * @return oldTp
     */
    public java.lang.String getOldTp() {
        return oldTp;
    }


    /**
     * Sets the oldTp value for this GetForceRenDetailsResponse.
     * 
     * @param oldTp
     */
    public void setOldTp(java.lang.String oldTp) {
        this.oldTp = oldTp;
    }


    /**
     * Gets the newTp value for this GetForceRenDetailsResponse.
     * 
     * @return newTp
     */
    public java.lang.String getNewTp() {
        return newTp;
    }


    /**
     * Sets the newTp value for this GetForceRenDetailsResponse.
     * 
     * @param newTp
     */
    public void setNewTp(java.lang.String newTp) {
        this.newTp = newTp;
    }


    /**
     * Gets the oldTpName value for this GetForceRenDetailsResponse.
     * 
     * @return oldTpName
     */
    public java.lang.String getOldTpName() {
        return oldTpName;
    }


    /**
     * Sets the oldTpName value for this GetForceRenDetailsResponse.
     * 
     * @param oldTpName
     */
    public void setOldTpName(java.lang.String oldTpName) {
        this.oldTpName = oldTpName;
    }


    /**
     * Gets the newTpName value for this GetForceRenDetailsResponse.
     * 
     * @return newTpName
     */
    public java.lang.String getNewTpName() {
        return newTpName;
    }


    /**
     * Sets the newTpName value for this GetForceRenDetailsResponse.
     * 
     * @param newTpName
     */
    public void setNewTpName(java.lang.String newTpName) {
        this.newTpName = newTpName;
    }


    /**
     * Gets the oldTpCharge value for this GetForceRenDetailsResponse.
     * 
     * @return oldTpCharge
     */
    public java.math.BigDecimal getOldTpCharge() {
        return oldTpCharge;
    }


    /**
     * Sets the oldTpCharge value for this GetForceRenDetailsResponse.
     * 
     * @param oldTpCharge
     */
    public void setOldTpCharge(java.math.BigDecimal oldTpCharge) {
        this.oldTpCharge = oldTpCharge;
    }


    /**
     * Gets the newTpCharge value for this GetForceRenDetailsResponse.
     * 
     * @return newTpCharge
     */
    public java.math.BigDecimal getNewTpCharge() {
        return newTpCharge;
    }


    /**
     * Sets the newTpCharge value for this GetForceRenDetailsResponse.
     * 
     * @param newTpCharge
     */
    public void setNewTpCharge(java.math.BigDecimal newTpCharge) {
        this.newTpCharge = newTpCharge;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetForceRenDetailsResponse)) return false;
        GetForceRenDetailsResponse other = (GetForceRenDetailsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.oldTp==null && other.getOldTp()==null) || 
             (this.oldTp!=null &&
              this.oldTp.equals(other.getOldTp()))) &&
            ((this.newTp==null && other.getNewTp()==null) || 
             (this.newTp!=null &&
              this.newTp.equals(other.getNewTp()))) &&
            ((this.oldTpName==null && other.getOldTpName()==null) || 
             (this.oldTpName!=null &&
              this.oldTpName.equals(other.getOldTpName()))) &&
            ((this.newTpName==null && other.getNewTpName()==null) || 
             (this.newTpName!=null &&
              this.newTpName.equals(other.getNewTpName()))) &&
            ((this.oldTpCharge==null && other.getOldTpCharge()==null) || 
             (this.oldTpCharge!=null &&
              this.oldTpCharge.equals(other.getOldTpCharge()))) &&
            ((this.newTpCharge==null && other.getNewTpCharge()==null) || 
             (this.newTpCharge!=null &&
              this.newTpCharge.equals(other.getNewTpCharge())));
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
        if (getOldTp() != null) {
            _hashCode += getOldTp().hashCode();
        }
        if (getNewTp() != null) {
            _hashCode += getNewTp().hashCode();
        }
        if (getOldTpName() != null) {
            _hashCode += getOldTpName().hashCode();
        }
        if (getNewTpName() != null) {
            _hashCode += getNewTpName().hashCode();
        }
        if (getOldTpCharge() != null) {
            _hashCode += getOldTpCharge().hashCode();
        }
        if (getNewTpCharge() != null) {
            _hashCode += getNewTpCharge().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetForceRenDetailsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getForceRenDetailsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldTp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "oldTp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newTp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "newTp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldTpName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "oldTpName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newTpName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "newTpName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldTpCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "oldTpCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newTpCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "newTpCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
