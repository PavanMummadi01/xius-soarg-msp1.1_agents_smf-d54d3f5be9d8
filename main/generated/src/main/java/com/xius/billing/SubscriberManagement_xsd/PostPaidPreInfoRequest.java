/**
 * PostPaidPreInfoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class PostPaidPreInfoRequest  implements java.io.Serializable {
    private java.lang.String SIM;

    private java.lang.String msisdn;

    private java.lang.Long billCycleDay;

    private java.lang.String tariffPackId;

    private java.lang.String creditLimit;

    private java.lang.String priceGroup;

    private java.lang.String prePostFlag;

    public PostPaidPreInfoRequest() {
    }

    public PostPaidPreInfoRequest(
           java.lang.String SIM,
           java.lang.String msisdn,
           java.lang.Long billCycleDay,
           java.lang.String tariffPackId,
           java.lang.String creditLimit,
           java.lang.String priceGroup,
           java.lang.String prePostFlag) {
           this.SIM = SIM;
           this.msisdn = msisdn;
           this.billCycleDay = billCycleDay;
           this.tariffPackId = tariffPackId;
           this.creditLimit = creditLimit;
           this.priceGroup = priceGroup;
           this.prePostFlag = prePostFlag;
    }


    /**
     * Gets the SIM value for this PostPaidPreInfoRequest.
     * 
     * @return SIM
     */
    public java.lang.String getSIM() {
        return SIM;
    }


    /**
     * Sets the SIM value for this PostPaidPreInfoRequest.
     * 
     * @param SIM
     */
    public void setSIM(java.lang.String SIM) {
        this.SIM = SIM;
    }


    /**
     * Gets the msisdn value for this PostPaidPreInfoRequest.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this PostPaidPreInfoRequest.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the billCycleDay value for this PostPaidPreInfoRequest.
     * 
     * @return billCycleDay
     */
    public java.lang.Long getBillCycleDay() {
        return billCycleDay;
    }


    /**
     * Sets the billCycleDay value for this PostPaidPreInfoRequest.
     * 
     * @param billCycleDay
     */
    public void setBillCycleDay(java.lang.Long billCycleDay) {
        this.billCycleDay = billCycleDay;
    }


    /**
     * Gets the tariffPackId value for this PostPaidPreInfoRequest.
     * 
     * @return tariffPackId
     */
    public java.lang.String getTariffPackId() {
        return tariffPackId;
    }


    /**
     * Sets the tariffPackId value for this PostPaidPreInfoRequest.
     * 
     * @param tariffPackId
     */
    public void setTariffPackId(java.lang.String tariffPackId) {
        this.tariffPackId = tariffPackId;
    }


    /**
     * Gets the creditLimit value for this PostPaidPreInfoRequest.
     * 
     * @return creditLimit
     */
    public java.lang.String getCreditLimit() {
        return creditLimit;
    }


    /**
     * Sets the creditLimit value for this PostPaidPreInfoRequest.
     * 
     * @param creditLimit
     */
    public void setCreditLimit(java.lang.String creditLimit) {
        this.creditLimit = creditLimit;
    }


    /**
     * Gets the priceGroup value for this PostPaidPreInfoRequest.
     * 
     * @return priceGroup
     */
    public java.lang.String getPriceGroup() {
        return priceGroup;
    }


    /**
     * Sets the priceGroup value for this PostPaidPreInfoRequest.
     * 
     * @param priceGroup
     */
    public void setPriceGroup(java.lang.String priceGroup) {
        this.priceGroup = priceGroup;
    }


    /**
     * Gets the prePostFlag value for this PostPaidPreInfoRequest.
     * 
     * @return prePostFlag
     */
    public java.lang.String getPrePostFlag() {
        return prePostFlag;
    }


    /**
     * Sets the prePostFlag value for this PostPaidPreInfoRequest.
     * 
     * @param prePostFlag
     */
    public void setPrePostFlag(java.lang.String prePostFlag) {
        this.prePostFlag = prePostFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PostPaidPreInfoRequest)) return false;
        PostPaidPreInfoRequest other = (PostPaidPreInfoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.SIM==null && other.getSIM()==null) || 
             (this.SIM!=null &&
              this.SIM.equals(other.getSIM()))) &&
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.billCycleDay==null && other.getBillCycleDay()==null) || 
             (this.billCycleDay!=null &&
              this.billCycleDay.equals(other.getBillCycleDay()))) &&
            ((this.tariffPackId==null && other.getTariffPackId()==null) || 
             (this.tariffPackId!=null &&
              this.tariffPackId.equals(other.getTariffPackId()))) &&
            ((this.creditLimit==null && other.getCreditLimit()==null) || 
             (this.creditLimit!=null &&
              this.creditLimit.equals(other.getCreditLimit()))) &&
            ((this.priceGroup==null && other.getPriceGroup()==null) || 
             (this.priceGroup!=null &&
              this.priceGroup.equals(other.getPriceGroup()))) &&
            ((this.prePostFlag==null && other.getPrePostFlag()==null) || 
             (this.prePostFlag!=null &&
              this.prePostFlag.equals(other.getPrePostFlag())));
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
        if (getSIM() != null) {
            _hashCode += getSIM().hashCode();
        }
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getBillCycleDay() != null) {
            _hashCode += getBillCycleDay().hashCode();
        }
        if (getTariffPackId() != null) {
            _hashCode += getTariffPackId().hashCode();
        }
        if (getCreditLimit() != null) {
            _hashCode += getCreditLimit().hashCode();
        }
        if (getPriceGroup() != null) {
            _hashCode += getPriceGroup().hashCode();
        }
        if (getPrePostFlag() != null) {
            _hashCode += getPrePostFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PostPaidPreInfoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "PostPaidPreInfoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SIM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "SIM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("priceGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "priceGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prePostFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "prePostFlag"));
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
