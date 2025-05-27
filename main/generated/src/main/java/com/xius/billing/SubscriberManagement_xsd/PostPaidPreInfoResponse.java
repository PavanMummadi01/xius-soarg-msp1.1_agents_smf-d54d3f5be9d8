/**
 * PostPaidPreInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class PostPaidPreInfoResponse  implements java.io.Serializable {
    private java.lang.Long billCycleDay;

    private java.lang.String tariffPackId;

    private java.lang.String creditLimit;

    private java.lang.String priceGroupId;

    private java.lang.String tarrifPakageName;

    public PostPaidPreInfoResponse() {
    }

    public PostPaidPreInfoResponse(
           java.lang.Long billCycleDay,
           java.lang.String tariffPackId,
           java.lang.String creditLimit,
           java.lang.String priceGroupId,
           java.lang.String tarrifPakageName) {
           this.billCycleDay = billCycleDay;
           this.tariffPackId = tariffPackId;
           this.creditLimit = creditLimit;
           this.priceGroupId = priceGroupId;
           this.tarrifPakageName = tarrifPakageName;
    }


    /**
     * Gets the billCycleDay value for this PostPaidPreInfoResponse.
     * 
     * @return billCycleDay
     */
    public java.lang.Long getBillCycleDay() {
        return billCycleDay;
    }


    /**
     * Sets the billCycleDay value for this PostPaidPreInfoResponse.
     * 
     * @param billCycleDay
     */
    public void setBillCycleDay(java.lang.Long billCycleDay) {
        this.billCycleDay = billCycleDay;
    }


    /**
     * Gets the tariffPackId value for this PostPaidPreInfoResponse.
     * 
     * @return tariffPackId
     */
    public java.lang.String getTariffPackId() {
        return tariffPackId;
    }


    /**
     * Sets the tariffPackId value for this PostPaidPreInfoResponse.
     * 
     * @param tariffPackId
     */
    public void setTariffPackId(java.lang.String tariffPackId) {
        this.tariffPackId = tariffPackId;
    }


    /**
     * Gets the creditLimit value for this PostPaidPreInfoResponse.
     * 
     * @return creditLimit
     */
    public java.lang.String getCreditLimit() {
        return creditLimit;
    }


    /**
     * Sets the creditLimit value for this PostPaidPreInfoResponse.
     * 
     * @param creditLimit
     */
    public void setCreditLimit(java.lang.String creditLimit) {
        this.creditLimit = creditLimit;
    }


    /**
     * Gets the priceGroupId value for this PostPaidPreInfoResponse.
     * 
     * @return priceGroupId
     */
    public java.lang.String getPriceGroupId() {
        return priceGroupId;
    }


    /**
     * Sets the priceGroupId value for this PostPaidPreInfoResponse.
     * 
     * @param priceGroupId
     */
    public void setPriceGroupId(java.lang.String priceGroupId) {
        this.priceGroupId = priceGroupId;
    }


    /**
     * Gets the tarrifPakageName value for this PostPaidPreInfoResponse.
     * 
     * @return tarrifPakageName
     */
    public java.lang.String getTarrifPakageName() {
        return tarrifPakageName;
    }


    /**
     * Sets the tarrifPakageName value for this PostPaidPreInfoResponse.
     * 
     * @param tarrifPakageName
     */
    public void setTarrifPakageName(java.lang.String tarrifPakageName) {
        this.tarrifPakageName = tarrifPakageName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PostPaidPreInfoResponse)) return false;
        PostPaidPreInfoResponse other = (PostPaidPreInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billCycleDay==null && other.getBillCycleDay()==null) || 
             (this.billCycleDay!=null &&
              this.billCycleDay.equals(other.getBillCycleDay()))) &&
            ((this.tariffPackId==null && other.getTariffPackId()==null) || 
             (this.tariffPackId!=null &&
              this.tariffPackId.equals(other.getTariffPackId()))) &&
            ((this.creditLimit==null && other.getCreditLimit()==null) || 
             (this.creditLimit!=null &&
              this.creditLimit.equals(other.getCreditLimit()))) &&
            ((this.priceGroupId==null && other.getPriceGroupId()==null) || 
             (this.priceGroupId!=null &&
              this.priceGroupId.equals(other.getPriceGroupId()))) &&
            ((this.tarrifPakageName==null && other.getTarrifPakageName()==null) || 
             (this.tarrifPakageName!=null &&
              this.tarrifPakageName.equals(other.getTarrifPakageName())));
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
        if (getBillCycleDay() != null) {
            _hashCode += getBillCycleDay().hashCode();
        }
        if (getTariffPackId() != null) {
            _hashCode += getTariffPackId().hashCode();
        }
        if (getCreditLimit() != null) {
            _hashCode += getCreditLimit().hashCode();
        }
        if (getPriceGroupId() != null) {
            _hashCode += getPriceGroupId().hashCode();
        }
        if (getTarrifPakageName() != null) {
            _hashCode += getTarrifPakageName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PostPaidPreInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "PostPaidPreInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billCycleDay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "billCycleDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tariffPackId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "tariffPackId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "creditLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "priceGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tarrifPakageName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "tarrifPakageName"));
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
