/**
 * PostpaidDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.common;

public class PostpaidDetails  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private java.math.BigDecimal availableCreditLimit;

    private java.lang.String billingDate;

    private java.lang.String billingFrequency;

    private java.lang.String billingType;

    private java.math.BigDecimal creditLimit;

    private org.apache.axis.message.MessageElement [] _any;

    public PostpaidDetails() {
    }

    public PostpaidDetails(
           java.math.BigDecimal availableCreditLimit,
           java.lang.String billingDate,
           java.lang.String billingFrequency,
           java.lang.String billingType,
           java.math.BigDecimal creditLimit,
           org.apache.axis.message.MessageElement [] _any) {
           this.availableCreditLimit = availableCreditLimit;
           this.billingDate = billingDate;
           this.billingFrequency = billingFrequency;
           this.billingType = billingType;
           this.creditLimit = creditLimit;
           this._any = _any;
    }


    /**
     * Gets the availableCreditLimit value for this PostpaidDetails.
     * 
     * @return availableCreditLimit
     */
    public java.math.BigDecimal getAvailableCreditLimit() {
        return availableCreditLimit;
    }


    /**
     * Sets the availableCreditLimit value for this PostpaidDetails.
     * 
     * @param availableCreditLimit
     */
    public void setAvailableCreditLimit(java.math.BigDecimal availableCreditLimit) {
        this.availableCreditLimit = availableCreditLimit;
    }


    /**
     * Gets the billingDate value for this PostpaidDetails.
     * 
     * @return billingDate
     */
    public java.lang.String getBillingDate() {
        return billingDate;
    }


    /**
     * Sets the billingDate value for this PostpaidDetails.
     * 
     * @param billingDate
     */
    public void setBillingDate(java.lang.String billingDate) {
        this.billingDate = billingDate;
    }


    /**
     * Gets the billingFrequency value for this PostpaidDetails.
     * 
     * @return billingFrequency
     */
    public java.lang.String getBillingFrequency() {
        return billingFrequency;
    }


    /**
     * Sets the billingFrequency value for this PostpaidDetails.
     * 
     * @param billingFrequency
     */
    public void setBillingFrequency(java.lang.String billingFrequency) {
        this.billingFrequency = billingFrequency;
    }


    /**
     * Gets the billingType value for this PostpaidDetails.
     * 
     * @return billingType
     */
    public java.lang.String getBillingType() {
        return billingType;
    }


    /**
     * Sets the billingType value for this PostpaidDetails.
     * 
     * @param billingType
     */
    public void setBillingType(java.lang.String billingType) {
        this.billingType = billingType;
    }


    /**
     * Gets the creditLimit value for this PostpaidDetails.
     * 
     * @return creditLimit
     */
    public java.math.BigDecimal getCreditLimit() {
        return creditLimit;
    }


    /**
     * Sets the creditLimit value for this PostpaidDetails.
     * 
     * @param creditLimit
     */
    public void setCreditLimit(java.math.BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }


    /**
     * Gets the _any value for this PostpaidDetails.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this PostpaidDetails.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PostpaidDetails)) return false;
        PostpaidDetails other = (PostpaidDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.availableCreditLimit==null && other.getAvailableCreditLimit()==null) || 
             (this.availableCreditLimit!=null &&
              this.availableCreditLimit.equals(other.getAvailableCreditLimit()))) &&
            ((this.billingDate==null && other.getBillingDate()==null) || 
             (this.billingDate!=null &&
              this.billingDate.equals(other.getBillingDate()))) &&
            ((this.billingFrequency==null && other.getBillingFrequency()==null) || 
             (this.billingFrequency!=null &&
              this.billingFrequency.equals(other.getBillingFrequency()))) &&
            ((this.billingType==null && other.getBillingType()==null) || 
             (this.billingType!=null &&
              this.billingType.equals(other.getBillingType()))) &&
            ((this.creditLimit==null && other.getCreditLimit()==null) || 
             (this.creditLimit!=null &&
              this.creditLimit.equals(other.getCreditLimit()))) &&
            ((this._any==null && other.get_any()==null) || 
             (this._any!=null &&
              java.util.Arrays.equals(this._any, other.get_any())));
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
        if (getAvailableCreditLimit() != null) {
            _hashCode += getAvailableCreditLimit().hashCode();
        }
        if (getBillingDate() != null) {
            _hashCode += getBillingDate().hashCode();
        }
        if (getBillingFrequency() != null) {
            _hashCode += getBillingFrequency().hashCode();
        }
        if (getBillingType() != null) {
            _hashCode += getBillingType().hashCode();
        }
        if (getCreditLimit() != null) {
            _hashCode += getCreditLimit().hashCode();
        }
        if (get_any() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_any());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_any(), i);
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
        new org.apache.axis.description.TypeDesc(PostpaidDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "PostpaidDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableCreditLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "availableCreditLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "billingDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingFrequency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "billingFrequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "billingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "creditLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
