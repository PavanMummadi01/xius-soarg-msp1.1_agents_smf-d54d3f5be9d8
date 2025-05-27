/**
 * BalancesheetType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.SorianacardIntegration_xsd;

public class BalancesheetType  implements java.io.Serializable {
    private int customerid;

    private int points;

    private java.math.BigDecimal cash;

    private java.math.BigDecimal electronicMoney;

    public BalancesheetType() {
    }

    public BalancesheetType(
           int customerid,
           int points,
           java.math.BigDecimal cash,
           java.math.BigDecimal electronicMoney) {
           this.customerid = customerid;
           this.points = points;
           this.cash = cash;
           this.electronicMoney = electronicMoney;
    }


    /**
     * Gets the customerid value for this BalancesheetType.
     * 
     * @return customerid
     */
    public int getCustomerid() {
        return customerid;
    }


    /**
     * Sets the customerid value for this BalancesheetType.
     * 
     * @param customerid
     */
    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }


    /**
     * Gets the points value for this BalancesheetType.
     * 
     * @return points
     */
    public int getPoints() {
        return points;
    }


    /**
     * Sets the points value for this BalancesheetType.
     * 
     * @param points
     */
    public void setPoints(int points) {
        this.points = points;
    }


    /**
     * Gets the cash value for this BalancesheetType.
     * 
     * @return cash
     */
    public java.math.BigDecimal getCash() {
        return cash;
    }


    /**
     * Sets the cash value for this BalancesheetType.
     * 
     * @param cash
     */
    public void setCash(java.math.BigDecimal cash) {
        this.cash = cash;
    }


    /**
     * Gets the electronicMoney value for this BalancesheetType.
     * 
     * @return electronicMoney
     */
    public java.math.BigDecimal getElectronicMoney() {
        return electronicMoney;
    }


    /**
     * Sets the electronicMoney value for this BalancesheetType.
     * 
     * @param electronicMoney
     */
    public void setElectronicMoney(java.math.BigDecimal electronicMoney) {
        this.electronicMoney = electronicMoney;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BalancesheetType)) return false;
        BalancesheetType other = (BalancesheetType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.customerid == other.getCustomerid() &&
            this.points == other.getPoints() &&
            ((this.cash==null && other.getCash()==null) || 
             (this.cash!=null &&
              this.cash.equals(other.getCash()))) &&
            ((this.electronicMoney==null && other.getElectronicMoney()==null) || 
             (this.electronicMoney!=null &&
              this.electronicMoney.equals(other.getElectronicMoney())));
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
        _hashCode += getCustomerid();
        _hashCode += getPoints();
        if (getCash() != null) {
            _hashCode += getCash().hashCode();
        }
        if (getElectronicMoney() != null) {
            _hashCode += getElectronicMoney().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BalancesheetType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/SorianacardIntegration.xsd", "BalancesheetType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/SorianacardIntegration.xsd", "customerid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("points");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/SorianacardIntegration.xsd", "Points"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cash");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/SorianacardIntegration.xsd", "Cash"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("electronicMoney");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/SorianacardIntegration.xsd", "ElectronicMoney"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
