/**
 * BulkBalAdjustmentRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.BalanceManagement_xsd;

public class BulkBalAdjustmentRequest  implements java.io.Serializable {
    private java.lang.String[] msisdns;

    private java.math.BigDecimal adjustementAmt;

    private java.lang.String adjustementType;

    public BulkBalAdjustmentRequest() {
    }

    public BulkBalAdjustmentRequest(
           java.lang.String[] msisdns,
           java.math.BigDecimal adjustementAmt,
           java.lang.String adjustementType) {
           this.msisdns = msisdns;
           this.adjustementAmt = adjustementAmt;
           this.adjustementType = adjustementType;
    }


    /**
     * Gets the msisdns value for this BulkBalAdjustmentRequest.
     * 
     * @return msisdns
     */
    public java.lang.String[] getMsisdns() {
        return msisdns;
    }


    /**
     * Sets the msisdns value for this BulkBalAdjustmentRequest.
     * 
     * @param msisdns
     */
    public void setMsisdns(java.lang.String[] msisdns) {
        this.msisdns = msisdns;
    }


    /**
     * Gets the adjustementAmt value for this BulkBalAdjustmentRequest.
     * 
     * @return adjustementAmt
     */
    public java.math.BigDecimal getAdjustementAmt() {
        return adjustementAmt;
    }


    /**
     * Sets the adjustementAmt value for this BulkBalAdjustmentRequest.
     * 
     * @param adjustementAmt
     */
    public void setAdjustementAmt(java.math.BigDecimal adjustementAmt) {
        this.adjustementAmt = adjustementAmt;
    }


    /**
     * Gets the adjustementType value for this BulkBalAdjustmentRequest.
     * 
     * @return adjustementType
     */
    public java.lang.String getAdjustementType() {
        return adjustementType;
    }


    /**
     * Sets the adjustementType value for this BulkBalAdjustmentRequest.
     * 
     * @param adjustementType
     */
    public void setAdjustementType(java.lang.String adjustementType) {
        this.adjustementType = adjustementType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BulkBalAdjustmentRequest)) return false;
        BulkBalAdjustmentRequest other = (BulkBalAdjustmentRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.msisdns==null && other.getMsisdns()==null) || 
             (this.msisdns!=null &&
              java.util.Arrays.equals(this.msisdns, other.getMsisdns()))) &&
            ((this.adjustementAmt==null && other.getAdjustementAmt()==null) || 
             (this.adjustementAmt!=null &&
              this.adjustementAmt.equals(other.getAdjustementAmt()))) &&
            ((this.adjustementType==null && other.getAdjustementType()==null) || 
             (this.adjustementType!=null &&
              this.adjustementType.equals(other.getAdjustementType())));
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
        if (getMsisdns() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMsisdns());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMsisdns(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAdjustementAmt() != null) {
            _hashCode += getAdjustementAmt().hashCode();
        }
        if (getAdjustementType() != null) {
            _hashCode += getAdjustementType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BulkBalAdjustmentRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "BulkBalAdjustmentRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdns");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "msisdns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "MSISDNType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "msisdn"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustementAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "adjustementAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustementType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "adjustementType"));
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
