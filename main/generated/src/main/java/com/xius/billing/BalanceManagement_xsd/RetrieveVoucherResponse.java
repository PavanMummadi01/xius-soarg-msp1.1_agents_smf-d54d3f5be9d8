/**
 * RetrieveVoucherResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.BalanceManagement_xsd;

public class RetrieveVoucherResponse  implements java.io.Serializable {
    private java.lang.Long vchrNumber;

    private java.lang.String status;

    private java.math.BigDecimal mrp;

    private java.math.BigDecimal talkTime;

    private java.lang.String expiryDate;

    private java.lang.String brandPartner;

    public RetrieveVoucherResponse() {
    }

    public RetrieveVoucherResponse(
           java.lang.Long vchrNumber,
           java.lang.String status,
           java.math.BigDecimal mrp,
           java.math.BigDecimal talkTime,
           java.lang.String expiryDate,
           java.lang.String brandPartner) {
           this.vchrNumber = vchrNumber;
           this.status = status;
           this.mrp = mrp;
           this.talkTime = talkTime;
           this.expiryDate = expiryDate;
           this.brandPartner = brandPartner;
    }


    /**
     * Gets the vchrNumber value for this RetrieveVoucherResponse.
     * 
     * @return vchrNumber
     */
    public java.lang.Long getVchrNumber() {
        return vchrNumber;
    }


    /**
     * Sets the vchrNumber value for this RetrieveVoucherResponse.
     * 
     * @param vchrNumber
     */
    public void setVchrNumber(java.lang.Long vchrNumber) {
        this.vchrNumber = vchrNumber;
    }


    /**
     * Gets the status value for this RetrieveVoucherResponse.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this RetrieveVoucherResponse.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the mrp value for this RetrieveVoucherResponse.
     * 
     * @return mrp
     */
    public java.math.BigDecimal getMrp() {
        return mrp;
    }


    /**
     * Sets the mrp value for this RetrieveVoucherResponse.
     * 
     * @param mrp
     */
    public void setMrp(java.math.BigDecimal mrp) {
        this.mrp = mrp;
    }


    /**
     * Gets the talkTime value for this RetrieveVoucherResponse.
     * 
     * @return talkTime
     */
    public java.math.BigDecimal getTalkTime() {
        return talkTime;
    }


    /**
     * Sets the talkTime value for this RetrieveVoucherResponse.
     * 
     * @param talkTime
     */
    public void setTalkTime(java.math.BigDecimal talkTime) {
        this.talkTime = talkTime;
    }


    /**
     * Gets the expiryDate value for this RetrieveVoucherResponse.
     * 
     * @return expiryDate
     */
    public java.lang.String getExpiryDate() {
        return expiryDate;
    }


    /**
     * Sets the expiryDate value for this RetrieveVoucherResponse.
     * 
     * @param expiryDate
     */
    public void setExpiryDate(java.lang.String expiryDate) {
        this.expiryDate = expiryDate;
    }


    /**
     * Gets the brandPartner value for this RetrieveVoucherResponse.
     * 
     * @return brandPartner
     */
    public java.lang.String getBrandPartner() {
        return brandPartner;
    }


    /**
     * Sets the brandPartner value for this RetrieveVoucherResponse.
     * 
     * @param brandPartner
     */
    public void setBrandPartner(java.lang.String brandPartner) {
        this.brandPartner = brandPartner;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetrieveVoucherResponse)) return false;
        RetrieveVoucherResponse other = (RetrieveVoucherResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vchrNumber==null && other.getVchrNumber()==null) || 
             (this.vchrNumber!=null &&
              this.vchrNumber.equals(other.getVchrNumber()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.mrp==null && other.getMrp()==null) || 
             (this.mrp!=null &&
              this.mrp.equals(other.getMrp()))) &&
            ((this.talkTime==null && other.getTalkTime()==null) || 
             (this.talkTime!=null &&
              this.talkTime.equals(other.getTalkTime()))) &&
            ((this.expiryDate==null && other.getExpiryDate()==null) || 
             (this.expiryDate!=null &&
              this.expiryDate.equals(other.getExpiryDate()))) &&
            ((this.brandPartner==null && other.getBrandPartner()==null) || 
             (this.brandPartner!=null &&
              this.brandPartner.equals(other.getBrandPartner())));
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
        if (getVchrNumber() != null) {
            _hashCode += getVchrNumber().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getMrp() != null) {
            _hashCode += getMrp().hashCode();
        }
        if (getTalkTime() != null) {
            _hashCode += getTalkTime().hashCode();
        }
        if (getExpiryDate() != null) {
            _hashCode += getExpiryDate().hashCode();
        }
        if (getBrandPartner() != null) {
            _hashCode += getBrandPartner().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RetrieveVoucherResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "RetrieveVoucherResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vchrNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "vchrNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mrp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "mrp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("talkTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "talkTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "expiryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brandPartner");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "brandPartner"));
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
