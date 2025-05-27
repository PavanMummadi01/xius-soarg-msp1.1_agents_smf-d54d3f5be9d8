/**
 * ChngMSISDNPreInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class ChngMSISDNPreInfoResponse  implements java.io.Serializable {
    private java.lang.String oldMSISDN;

    private java.math.BigDecimal currentBalance;

    private java.math.BigDecimal generalAmt;

    private java.math.BigDecimal reservedAmt;

    public ChngMSISDNPreInfoResponse() {
    }

    public ChngMSISDNPreInfoResponse(
           java.lang.String oldMSISDN,
           java.math.BigDecimal currentBalance,
           java.math.BigDecimal generalAmt,
           java.math.BigDecimal reservedAmt) {
           this.oldMSISDN = oldMSISDN;
           this.currentBalance = currentBalance;
           this.generalAmt = generalAmt;
           this.reservedAmt = reservedAmt;
    }


    /**
     * Gets the oldMSISDN value for this ChngMSISDNPreInfoResponse.
     * 
     * @return oldMSISDN
     */
    public java.lang.String getOldMSISDN() {
        return oldMSISDN;
    }


    /**
     * Sets the oldMSISDN value for this ChngMSISDNPreInfoResponse.
     * 
     * @param oldMSISDN
     */
    public void setOldMSISDN(java.lang.String oldMSISDN) {
        this.oldMSISDN = oldMSISDN;
    }


    /**
     * Gets the currentBalance value for this ChngMSISDNPreInfoResponse.
     * 
     * @return currentBalance
     */
    public java.math.BigDecimal getCurrentBalance() {
        return currentBalance;
    }


    /**
     * Sets the currentBalance value for this ChngMSISDNPreInfoResponse.
     * 
     * @param currentBalance
     */
    public void setCurrentBalance(java.math.BigDecimal currentBalance) {
        this.currentBalance = currentBalance;
    }


    /**
     * Gets the generalAmt value for this ChngMSISDNPreInfoResponse.
     * 
     * @return generalAmt
     */
    public java.math.BigDecimal getGeneralAmt() {
        return generalAmt;
    }


    /**
     * Sets the generalAmt value for this ChngMSISDNPreInfoResponse.
     * 
     * @param generalAmt
     */
    public void setGeneralAmt(java.math.BigDecimal generalAmt) {
        this.generalAmt = generalAmt;
    }


    /**
     * Gets the reservedAmt value for this ChngMSISDNPreInfoResponse.
     * 
     * @return reservedAmt
     */
    public java.math.BigDecimal getReservedAmt() {
        return reservedAmt;
    }


    /**
     * Sets the reservedAmt value for this ChngMSISDNPreInfoResponse.
     * 
     * @param reservedAmt
     */
    public void setReservedAmt(java.math.BigDecimal reservedAmt) {
        this.reservedAmt = reservedAmt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChngMSISDNPreInfoResponse)) return false;
        ChngMSISDNPreInfoResponse other = (ChngMSISDNPreInfoResponse) obj;
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
            ((this.currentBalance==null && other.getCurrentBalance()==null) || 
             (this.currentBalance!=null &&
              this.currentBalance.equals(other.getCurrentBalance()))) &&
            ((this.generalAmt==null && other.getGeneralAmt()==null) || 
             (this.generalAmt!=null &&
              this.generalAmt.equals(other.getGeneralAmt()))) &&
            ((this.reservedAmt==null && other.getReservedAmt()==null) || 
             (this.reservedAmt!=null &&
              this.reservedAmt.equals(other.getReservedAmt())));
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
        if (getCurrentBalance() != null) {
            _hashCode += getCurrentBalance().hashCode();
        }
        if (getGeneralAmt() != null) {
            _hashCode += getGeneralAmt().hashCode();
        }
        if (getReservedAmt() != null) {
            _hashCode += getReservedAmt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChngMSISDNPreInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ChngMSISDNPreInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "oldMSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "currentBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("generalAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "generalAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservedAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "reservedAmt"));
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
