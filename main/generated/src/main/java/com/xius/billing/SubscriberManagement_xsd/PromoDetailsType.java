/**
 * PromoDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class PromoDetailsType  implements java.io.Serializable {
    private java.lang.Long key;

    private java.lang.String name;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private java.lang.String upldBy;

    private java.lang.String upldDate;

    private java.lang.String aprvdBy;

    private java.lang.String aprvdDate;

    private java.lang.String status;

    private java.math.BigDecimal faceValue;

    private java.lang.String remarks;

    public PromoDetailsType() {
    }

    public PromoDetailsType(
           java.lang.Long key,
           java.lang.String name,
           java.lang.String startDate,
           java.lang.String endDate,
           java.lang.String upldBy,
           java.lang.String upldDate,
           java.lang.String aprvdBy,
           java.lang.String aprvdDate,
           java.lang.String status,
           java.math.BigDecimal faceValue,
           java.lang.String remarks) {
           this.key = key;
           this.name = name;
           this.startDate = startDate;
           this.endDate = endDate;
           this.upldBy = upldBy;
           this.upldDate = upldDate;
           this.aprvdBy = aprvdBy;
           this.aprvdDate = aprvdDate;
           this.status = status;
           this.faceValue = faceValue;
           this.remarks = remarks;
    }


    /**
     * Gets the key value for this PromoDetailsType.
     * 
     * @return key
     */
    public java.lang.Long getKey() {
        return key;
    }


    /**
     * Sets the key value for this PromoDetailsType.
     * 
     * @param key
     */
    public void setKey(java.lang.Long key) {
        this.key = key;
    }


    /**
     * Gets the name value for this PromoDetailsType.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this PromoDetailsType.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the startDate value for this PromoDetailsType.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this PromoDetailsType.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this PromoDetailsType.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this PromoDetailsType.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the upldBy value for this PromoDetailsType.
     * 
     * @return upldBy
     */
    public java.lang.String getUpldBy() {
        return upldBy;
    }


    /**
     * Sets the upldBy value for this PromoDetailsType.
     * 
     * @param upldBy
     */
    public void setUpldBy(java.lang.String upldBy) {
        this.upldBy = upldBy;
    }


    /**
     * Gets the upldDate value for this PromoDetailsType.
     * 
     * @return upldDate
     */
    public java.lang.String getUpldDate() {
        return upldDate;
    }


    /**
     * Sets the upldDate value for this PromoDetailsType.
     * 
     * @param upldDate
     */
    public void setUpldDate(java.lang.String upldDate) {
        this.upldDate = upldDate;
    }


    /**
     * Gets the aprvdBy value for this PromoDetailsType.
     * 
     * @return aprvdBy
     */
    public java.lang.String getAprvdBy() {
        return aprvdBy;
    }


    /**
     * Sets the aprvdBy value for this PromoDetailsType.
     * 
     * @param aprvdBy
     */
    public void setAprvdBy(java.lang.String aprvdBy) {
        this.aprvdBy = aprvdBy;
    }


    /**
     * Gets the aprvdDate value for this PromoDetailsType.
     * 
     * @return aprvdDate
     */
    public java.lang.String getAprvdDate() {
        return aprvdDate;
    }


    /**
     * Sets the aprvdDate value for this PromoDetailsType.
     * 
     * @param aprvdDate
     */
    public void setAprvdDate(java.lang.String aprvdDate) {
        this.aprvdDate = aprvdDate;
    }


    /**
     * Gets the status value for this PromoDetailsType.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this PromoDetailsType.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the faceValue value for this PromoDetailsType.
     * 
     * @return faceValue
     */
    public java.math.BigDecimal getFaceValue() {
        return faceValue;
    }


    /**
     * Sets the faceValue value for this PromoDetailsType.
     * 
     * @param faceValue
     */
    public void setFaceValue(java.math.BigDecimal faceValue) {
        this.faceValue = faceValue;
    }


    /**
     * Gets the remarks value for this PromoDetailsType.
     * 
     * @return remarks
     */
    public java.lang.String getRemarks() {
        return remarks;
    }


    /**
     * Sets the remarks value for this PromoDetailsType.
     * 
     * @param remarks
     */
    public void setRemarks(java.lang.String remarks) {
        this.remarks = remarks;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PromoDetailsType)) return false;
        PromoDetailsType other = (PromoDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.upldBy==null && other.getUpldBy()==null) || 
             (this.upldBy!=null &&
              this.upldBy.equals(other.getUpldBy()))) &&
            ((this.upldDate==null && other.getUpldDate()==null) || 
             (this.upldDate!=null &&
              this.upldDate.equals(other.getUpldDate()))) &&
            ((this.aprvdBy==null && other.getAprvdBy()==null) || 
             (this.aprvdBy!=null &&
              this.aprvdBy.equals(other.getAprvdBy()))) &&
            ((this.aprvdDate==null && other.getAprvdDate()==null) || 
             (this.aprvdDate!=null &&
              this.aprvdDate.equals(other.getAprvdDate()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.faceValue==null && other.getFaceValue()==null) || 
             (this.faceValue!=null &&
              this.faceValue.equals(other.getFaceValue()))) &&
            ((this.remarks==null && other.getRemarks()==null) || 
             (this.remarks!=null &&
              this.remarks.equals(other.getRemarks())));
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
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getUpldBy() != null) {
            _hashCode += getUpldBy().hashCode();
        }
        if (getUpldDate() != null) {
            _hashCode += getUpldDate().hashCode();
        }
        if (getAprvdBy() != null) {
            _hashCode += getAprvdBy().hashCode();
        }
        if (getAprvdDate() != null) {
            _hashCode += getAprvdDate().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getFaceValue() != null) {
            _hashCode += getFaceValue().hashCode();
        }
        if (getRemarks() != null) {
            _hashCode += getRemarks().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PromoDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "PromoDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upldBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "upldBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upldDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "upldDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aprvdBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "aprvdBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aprvdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "aprvdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faceValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "faceValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remarks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "remarks"));
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
