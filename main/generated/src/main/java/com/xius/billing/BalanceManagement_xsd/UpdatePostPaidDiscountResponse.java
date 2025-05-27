/**
 * UpdatePostPaidDiscountResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.BalanceManagement_xsd;

public class UpdatePostPaidDiscountResponse  implements java.io.Serializable {
    private long[] successAccunts;

    private long[] failedAccunts;

    private java.math.BigDecimal[] failedAccuntDiscounts;

    public UpdatePostPaidDiscountResponse() {
    }

    public UpdatePostPaidDiscountResponse(
           long[] successAccunts,
           long[] failedAccunts,
           java.math.BigDecimal[] failedAccuntDiscounts) {
           this.successAccunts = successAccunts;
           this.failedAccunts = failedAccunts;
           this.failedAccuntDiscounts = failedAccuntDiscounts;
    }


    /**
     * Gets the successAccunts value for this UpdatePostPaidDiscountResponse.
     * 
     * @return successAccunts
     */
    public long[] getSuccessAccunts() {
        return successAccunts;
    }


    /**
     * Sets the successAccunts value for this UpdatePostPaidDiscountResponse.
     * 
     * @param successAccunts
     */
    public void setSuccessAccunts(long[] successAccunts) {
        this.successAccunts = successAccunts;
    }

    public long getSuccessAccunts(int i) {
        return this.successAccunts[i];
    }

    public void setSuccessAccunts(int i, long _value) {
        this.successAccunts[i] = _value;
    }


    /**
     * Gets the failedAccunts value for this UpdatePostPaidDiscountResponse.
     * 
     * @return failedAccunts
     */
    public long[] getFailedAccunts() {
        return failedAccunts;
    }


    /**
     * Sets the failedAccunts value for this UpdatePostPaidDiscountResponse.
     * 
     * @param failedAccunts
     */
    public void setFailedAccunts(long[] failedAccunts) {
        this.failedAccunts = failedAccunts;
    }

    public long getFailedAccunts(int i) {
        return this.failedAccunts[i];
    }

    public void setFailedAccunts(int i, long _value) {
        this.failedAccunts[i] = _value;
    }


    /**
     * Gets the failedAccuntDiscounts value for this UpdatePostPaidDiscountResponse.
     * 
     * @return failedAccuntDiscounts
     */
    public java.math.BigDecimal[] getFailedAccuntDiscounts() {
        return failedAccuntDiscounts;
    }


    /**
     * Sets the failedAccuntDiscounts value for this UpdatePostPaidDiscountResponse.
     * 
     * @param failedAccuntDiscounts
     */
    public void setFailedAccuntDiscounts(java.math.BigDecimal[] failedAccuntDiscounts) {
        this.failedAccuntDiscounts = failedAccuntDiscounts;
    }

    public java.math.BigDecimal getFailedAccuntDiscounts(int i) {
        return this.failedAccuntDiscounts[i];
    }

    public void setFailedAccuntDiscounts(int i, java.math.BigDecimal _value) {
        this.failedAccuntDiscounts[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdatePostPaidDiscountResponse)) return false;
        UpdatePostPaidDiscountResponse other = (UpdatePostPaidDiscountResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.successAccunts==null && other.getSuccessAccunts()==null) || 
             (this.successAccunts!=null &&
              java.util.Arrays.equals(this.successAccunts, other.getSuccessAccunts()))) &&
            ((this.failedAccunts==null && other.getFailedAccunts()==null) || 
             (this.failedAccunts!=null &&
              java.util.Arrays.equals(this.failedAccunts, other.getFailedAccunts()))) &&
            ((this.failedAccuntDiscounts==null && other.getFailedAccuntDiscounts()==null) || 
             (this.failedAccuntDiscounts!=null &&
              java.util.Arrays.equals(this.failedAccuntDiscounts, other.getFailedAccuntDiscounts())));
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
        if (getSuccessAccunts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSuccessAccunts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSuccessAccunts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFailedAccunts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFailedAccunts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFailedAccunts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFailedAccuntDiscounts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFailedAccuntDiscounts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFailedAccuntDiscounts(), i);
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
        new org.apache.axis.description.TypeDesc(UpdatePostPaidDiscountResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "UpdatePostPaidDiscountResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("successAccunts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "successAccunts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedAccunts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "failedAccunts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedAccuntDiscounts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "failedAccuntDiscounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
