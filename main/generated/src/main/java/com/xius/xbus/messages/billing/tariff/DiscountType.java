/**
 * DiscountType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.tariff;

public class DiscountType  implements java.io.Serializable {
    private java.lang.Long discountId;

    private java.lang.String discountName;

    private java.lang.String priority;

    private java.lang.String unitFrom;

    private java.lang.String unitTo;

    private java.lang.String discountPercentage;

    public DiscountType() {
    }

    public DiscountType(
           java.lang.Long discountId,
           java.lang.String discountName,
           java.lang.String priority,
           java.lang.String unitFrom,
           java.lang.String unitTo,
           java.lang.String discountPercentage) {
           this.discountId = discountId;
           this.discountName = discountName;
           this.priority = priority;
           this.unitFrom = unitFrom;
           this.unitTo = unitTo;
           this.discountPercentage = discountPercentage;
    }


    /**
     * Gets the discountId value for this DiscountType.
     * 
     * @return discountId
     */
    public java.lang.Long getDiscountId() {
        return discountId;
    }


    /**
     * Sets the discountId value for this DiscountType.
     * 
     * @param discountId
     */
    public void setDiscountId(java.lang.Long discountId) {
        this.discountId = discountId;
    }


    /**
     * Gets the discountName value for this DiscountType.
     * 
     * @return discountName
     */
    public java.lang.String getDiscountName() {
        return discountName;
    }


    /**
     * Sets the discountName value for this DiscountType.
     * 
     * @param discountName
     */
    public void setDiscountName(java.lang.String discountName) {
        this.discountName = discountName;
    }


    /**
     * Gets the priority value for this DiscountType.
     * 
     * @return priority
     */
    public java.lang.String getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this DiscountType.
     * 
     * @param priority
     */
    public void setPriority(java.lang.String priority) {
        this.priority = priority;
    }


    /**
     * Gets the unitFrom value for this DiscountType.
     * 
     * @return unitFrom
     */
    public java.lang.String getUnitFrom() {
        return unitFrom;
    }


    /**
     * Sets the unitFrom value for this DiscountType.
     * 
     * @param unitFrom
     */
    public void setUnitFrom(java.lang.String unitFrom) {
        this.unitFrom = unitFrom;
    }


    /**
     * Gets the unitTo value for this DiscountType.
     * 
     * @return unitTo
     */
    public java.lang.String getUnitTo() {
        return unitTo;
    }


    /**
     * Sets the unitTo value for this DiscountType.
     * 
     * @param unitTo
     */
    public void setUnitTo(java.lang.String unitTo) {
        this.unitTo = unitTo;
    }


    /**
     * Gets the discountPercentage value for this DiscountType.
     * 
     * @return discountPercentage
     */
    public java.lang.String getDiscountPercentage() {
        return discountPercentage;
    }


    /**
     * Sets the discountPercentage value for this DiscountType.
     * 
     * @param discountPercentage
     */
    public void setDiscountPercentage(java.lang.String discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DiscountType)) return false;
        DiscountType other = (DiscountType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.discountId==null && other.getDiscountId()==null) || 
             (this.discountId!=null &&
              this.discountId.equals(other.getDiscountId()))) &&
            ((this.discountName==null && other.getDiscountName()==null) || 
             (this.discountName!=null &&
              this.discountName.equals(other.getDiscountName()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.unitFrom==null && other.getUnitFrom()==null) || 
             (this.unitFrom!=null &&
              this.unitFrom.equals(other.getUnitFrom()))) &&
            ((this.unitTo==null && other.getUnitTo()==null) || 
             (this.unitTo!=null &&
              this.unitTo.equals(other.getUnitTo()))) &&
            ((this.discountPercentage==null && other.getDiscountPercentage()==null) || 
             (this.discountPercentage!=null &&
              this.discountPercentage.equals(other.getDiscountPercentage())));
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
        if (getDiscountId() != null) {
            _hashCode += getDiscountId().hashCode();
        }
        if (getDiscountName() != null) {
            _hashCode += getDiscountName().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getUnitFrom() != null) {
            _hashCode += getUnitFrom().hashCode();
        }
        if (getUnitTo() != null) {
            _hashCode += getUnitTo().hashCode();
        }
        if (getDiscountPercentage() != null) {
            _hashCode += getDiscountPercentage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DiscountType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "discountType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "discountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "discountName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "unitFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitTo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "unitTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountPercentage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "discountPercentage"));
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
