/**
 * AccountDatesList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class AccountDatesList  implements java.io.Serializable {
    private java.lang.String validitydate;

    private java.lang.String g1Date;

    private java.lang.String g2Date;

    private java.lang.String g3Date;

    private java.lang.String expirydate;

    public AccountDatesList() {
    }

    public AccountDatesList(
           java.lang.String validitydate,
           java.lang.String g1Date,
           java.lang.String g2Date,
           java.lang.String g3Date,
           java.lang.String expirydate) {
           this.validitydate = validitydate;
           this.g1Date = g1Date;
           this.g2Date = g2Date;
           this.g3Date = g3Date;
           this.expirydate = expirydate;
    }


    /**
     * Gets the validitydate value for this AccountDatesList.
     * 
     * @return validitydate
     */
    public java.lang.String getValiditydate() {
        return validitydate;
    }


    /**
     * Sets the validitydate value for this AccountDatesList.
     * 
     * @param validitydate
     */
    public void setValiditydate(java.lang.String validitydate) {
        this.validitydate = validitydate;
    }


    /**
     * Gets the g1Date value for this AccountDatesList.
     * 
     * @return g1Date
     */
    public java.lang.String getG1Date() {
        return g1Date;
    }


    /**
     * Sets the g1Date value for this AccountDatesList.
     * 
     * @param g1Date
     */
    public void setG1Date(java.lang.String g1Date) {
        this.g1Date = g1Date;
    }


    /**
     * Gets the g2Date value for this AccountDatesList.
     * 
     * @return g2Date
     */
    public java.lang.String getG2Date() {
        return g2Date;
    }


    /**
     * Sets the g2Date value for this AccountDatesList.
     * 
     * @param g2Date
     */
    public void setG2Date(java.lang.String g2Date) {
        this.g2Date = g2Date;
    }


    /**
     * Gets the g3Date value for this AccountDatesList.
     * 
     * @return g3Date
     */
    public java.lang.String getG3Date() {
        return g3Date;
    }


    /**
     * Sets the g3Date value for this AccountDatesList.
     * 
     * @param g3Date
     */
    public void setG3Date(java.lang.String g3Date) {
        this.g3Date = g3Date;
    }


    /**
     * Gets the expirydate value for this AccountDatesList.
     * 
     * @return expirydate
     */
    public java.lang.String getExpirydate() {
        return expirydate;
    }


    /**
     * Sets the expirydate value for this AccountDatesList.
     * 
     * @param expirydate
     */
    public void setExpirydate(java.lang.String expirydate) {
        this.expirydate = expirydate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountDatesList)) return false;
        AccountDatesList other = (AccountDatesList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.validitydate==null && other.getValiditydate()==null) || 
             (this.validitydate!=null &&
              this.validitydate.equals(other.getValiditydate()))) &&
            ((this.g1Date==null && other.getG1Date()==null) || 
             (this.g1Date!=null &&
              this.g1Date.equals(other.getG1Date()))) &&
            ((this.g2Date==null && other.getG2Date()==null) || 
             (this.g2Date!=null &&
              this.g2Date.equals(other.getG2Date()))) &&
            ((this.g3Date==null && other.getG3Date()==null) || 
             (this.g3Date!=null &&
              this.g3Date.equals(other.getG3Date()))) &&
            ((this.expirydate==null && other.getExpirydate()==null) || 
             (this.expirydate!=null &&
              this.expirydate.equals(other.getExpirydate())));
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
        if (getValiditydate() != null) {
            _hashCode += getValiditydate().hashCode();
        }
        if (getG1Date() != null) {
            _hashCode += getG1Date().hashCode();
        }
        if (getG2Date() != null) {
            _hashCode += getG2Date().hashCode();
        }
        if (getG3Date() != null) {
            _hashCode += getG3Date().hashCode();
        }
        if (getExpirydate() != null) {
            _hashCode += getExpirydate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccountDatesList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "accountDatesList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validitydate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "validitydate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("g1Date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "G1date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("g2Date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "G2date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("g3Date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "G3date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirydate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "expirydate"));
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
