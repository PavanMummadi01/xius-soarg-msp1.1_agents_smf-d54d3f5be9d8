/**
 * SimActivateResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class SimActivateResponse  implements java.io.Serializable {
    private java.lang.String oldMSISDN;

    private java.lang.String newMSISDN;

    private java.lang.String oldIDValue;

    private java.lang.String SIM;

    private java.lang.String[] publicityIds;

    private java.lang.String[] walletUnits;

    public SimActivateResponse() {
    }

    public SimActivateResponse(
           java.lang.String oldMSISDN,
           java.lang.String newMSISDN,
           java.lang.String oldIDValue,
           java.lang.String SIM,
           java.lang.String[] publicityIds,
           java.lang.String[] walletUnits) {
           this.oldMSISDN = oldMSISDN;
           this.newMSISDN = newMSISDN;
           this.oldIDValue = oldIDValue;
           this.SIM = SIM;
           this.publicityIds = publicityIds;
           this.walletUnits = walletUnits;
    }


    /**
     * Gets the oldMSISDN value for this SimActivateResponse.
     * 
     * @return oldMSISDN
     */
    public java.lang.String getOldMSISDN() {
        return oldMSISDN;
    }


    /**
     * Sets the oldMSISDN value for this SimActivateResponse.
     * 
     * @param oldMSISDN
     */
    public void setOldMSISDN(java.lang.String oldMSISDN) {
        this.oldMSISDN = oldMSISDN;
    }


    /**
     * Gets the newMSISDN value for this SimActivateResponse.
     * 
     * @return newMSISDN
     */
    public java.lang.String getNewMSISDN() {
        return newMSISDN;
    }


    /**
     * Sets the newMSISDN value for this SimActivateResponse.
     * 
     * @param newMSISDN
     */
    public void setNewMSISDN(java.lang.String newMSISDN) {
        this.newMSISDN = newMSISDN;
    }


    /**
     * Gets the oldIDValue value for this SimActivateResponse.
     * 
     * @return oldIDValue
     */
    public java.lang.String getOldIDValue() {
        return oldIDValue;
    }


    /**
     * Sets the oldIDValue value for this SimActivateResponse.
     * 
     * @param oldIDValue
     */
    public void setOldIDValue(java.lang.String oldIDValue) {
        this.oldIDValue = oldIDValue;
    }


    /**
     * Gets the SIM value for this SimActivateResponse.
     * 
     * @return SIM
     */
    public java.lang.String getSIM() {
        return SIM;
    }


    /**
     * Sets the SIM value for this SimActivateResponse.
     * 
     * @param SIM
     */
    public void setSIM(java.lang.String SIM) {
        this.SIM = SIM;
    }


    /**
     * Gets the publicityIds value for this SimActivateResponse.
     * 
     * @return publicityIds
     */
    public java.lang.String[] getPublicityIds() {
        return publicityIds;
    }


    /**
     * Sets the publicityIds value for this SimActivateResponse.
     * 
     * @param publicityIds
     */
    public void setPublicityIds(java.lang.String[] publicityIds) {
        this.publicityIds = publicityIds;
    }

    public java.lang.String getPublicityIds(int i) {
        return this.publicityIds[i];
    }

    public void setPublicityIds(int i, java.lang.String _value) {
        this.publicityIds[i] = _value;
    }


    /**
     * Gets the walletUnits value for this SimActivateResponse.
     * 
     * @return walletUnits
     */
    public java.lang.String[] getWalletUnits() {
        return walletUnits;
    }


    /**
     * Sets the walletUnits value for this SimActivateResponse.
     * 
     * @param walletUnits
     */
    public void setWalletUnits(java.lang.String[] walletUnits) {
        this.walletUnits = walletUnits;
    }

    public java.lang.String getWalletUnits(int i) {
        return this.walletUnits[i];
    }

    public void setWalletUnits(int i, java.lang.String _value) {
        this.walletUnits[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SimActivateResponse)) return false;
        SimActivateResponse other = (SimActivateResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.oldMSISDN==null && other.getOldMSISDN()==null) || 
             (this.oldMSISDN!=null &&
              this.oldMSISDN.equals(other.getOldMSISDN()))) &&
            ((this.newMSISDN==null && other.getNewMSISDN()==null) || 
             (this.newMSISDN!=null &&
              this.newMSISDN.equals(other.getNewMSISDN()))) &&
            ((this.oldIDValue==null && other.getOldIDValue()==null) || 
             (this.oldIDValue!=null &&
              this.oldIDValue.equals(other.getOldIDValue()))) &&
            ((this.SIM==null && other.getSIM()==null) || 
             (this.SIM!=null &&
              this.SIM.equals(other.getSIM()))) &&
            ((this.publicityIds==null && other.getPublicityIds()==null) || 
             (this.publicityIds!=null &&
              java.util.Arrays.equals(this.publicityIds, other.getPublicityIds()))) &&
            ((this.walletUnits==null && other.getWalletUnits()==null) || 
             (this.walletUnits!=null &&
              java.util.Arrays.equals(this.walletUnits, other.getWalletUnits())));
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
        if (getOldMSISDN() != null) {
            _hashCode += getOldMSISDN().hashCode();
        }
        if (getNewMSISDN() != null) {
            _hashCode += getNewMSISDN().hashCode();
        }
        if (getOldIDValue() != null) {
            _hashCode += getOldIDValue().hashCode();
        }
        if (getSIM() != null) {
            _hashCode += getSIM().hashCode();
        }
        if (getPublicityIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPublicityIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPublicityIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWalletUnits() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWalletUnits());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWalletUnits(), i);
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
        new org.apache.axis.description.TypeDesc(SimActivateResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "simActivateResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "oldMSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "newMSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldIDValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "oldIDValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SIM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SIM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicityIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "publicityIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("walletUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "walletUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
