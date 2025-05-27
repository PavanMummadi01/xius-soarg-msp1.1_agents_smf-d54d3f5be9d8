/**
 * AccountDetailType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.SorianacardIntegration_xsd;

public class AccountDetailType  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String parentalsurname;

    private java.lang.String maternalsurname;

    private java.math.BigDecimal cardnumber;

    public AccountDetailType() {
    }

    public AccountDetailType(
           java.lang.String name,
           java.lang.String parentalsurname,
           java.lang.String maternalsurname,
           java.math.BigDecimal cardnumber) {
           this.name = name;
           this.parentalsurname = parentalsurname;
           this.maternalsurname = maternalsurname;
           this.cardnumber = cardnumber;
    }


    /**
     * Gets the name value for this AccountDetailType.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this AccountDetailType.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the parentalsurname value for this AccountDetailType.
     * 
     * @return parentalsurname
     */
    public java.lang.String getParentalsurname() {
        return parentalsurname;
    }


    /**
     * Sets the parentalsurname value for this AccountDetailType.
     * 
     * @param parentalsurname
     */
    public void setParentalsurname(java.lang.String parentalsurname) {
        this.parentalsurname = parentalsurname;
    }


    /**
     * Gets the maternalsurname value for this AccountDetailType.
     * 
     * @return maternalsurname
     */
    public java.lang.String getMaternalsurname() {
        return maternalsurname;
    }


    /**
     * Sets the maternalsurname value for this AccountDetailType.
     * 
     * @param maternalsurname
     */
    public void setMaternalsurname(java.lang.String maternalsurname) {
        this.maternalsurname = maternalsurname;
    }


    /**
     * Gets the cardnumber value for this AccountDetailType.
     * 
     * @return cardnumber
     */
    public java.math.BigDecimal getCardnumber() {
        return cardnumber;
    }


    /**
     * Sets the cardnumber value for this AccountDetailType.
     * 
     * @param cardnumber
     */
    public void setCardnumber(java.math.BigDecimal cardnumber) {
        this.cardnumber = cardnumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountDetailType)) return false;
        AccountDetailType other = (AccountDetailType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.parentalsurname==null && other.getParentalsurname()==null) || 
             (this.parentalsurname!=null &&
              this.parentalsurname.equals(other.getParentalsurname()))) &&
            ((this.maternalsurname==null && other.getMaternalsurname()==null) || 
             (this.maternalsurname!=null &&
              this.maternalsurname.equals(other.getMaternalsurname()))) &&
            ((this.cardnumber==null && other.getCardnumber()==null) || 
             (this.cardnumber!=null &&
              this.cardnumber.equals(other.getCardnumber())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getParentalsurname() != null) {
            _hashCode += getParentalsurname().hashCode();
        }
        if (getMaternalsurname() != null) {
            _hashCode += getMaternalsurname().hashCode();
        }
        if (getCardnumber() != null) {
            _hashCode += getCardnumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccountDetailType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/SorianacardIntegration.xsd", "AccountDetailType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/SorianacardIntegration.xsd", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentalsurname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/SorianacardIntegration.xsd", "Parentalsurname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maternalsurname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/SorianacardIntegration.xsd", "Maternalsurname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardnumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/SorianacardIntegration.xsd", "Cardnumber"));
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
