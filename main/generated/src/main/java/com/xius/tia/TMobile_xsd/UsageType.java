/**
 * UsageType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.TMobile_xsd;

public class UsageType  implements java.io.Serializable {
    private com.xius.tia.TMobile_xsd.LimitType limit;

    private java.lang.String status;

    private java.lang.String used;

    private java.lang.String remaining;

    private java.lang.String currentBehavior;

    public UsageType() {
    }

    public UsageType(
           com.xius.tia.TMobile_xsd.LimitType limit,
           java.lang.String status,
           java.lang.String used,
           java.lang.String remaining,
           java.lang.String currentBehavior) {
           this.limit = limit;
           this.status = status;
           this.used = used;
           this.remaining = remaining;
           this.currentBehavior = currentBehavior;
    }


    /**
     * Gets the limit value for this UsageType.
     * 
     * @return limit
     */
    public com.xius.tia.TMobile_xsd.LimitType getLimit() {
        return limit;
    }


    /**
     * Sets the limit value for this UsageType.
     * 
     * @param limit
     */
    public void setLimit(com.xius.tia.TMobile_xsd.LimitType limit) {
        this.limit = limit;
    }


    /**
     * Gets the status value for this UsageType.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this UsageType.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the used value for this UsageType.
     * 
     * @return used
     */
    public java.lang.String getUsed() {
        return used;
    }


    /**
     * Sets the used value for this UsageType.
     * 
     * @param used
     */
    public void setUsed(java.lang.String used) {
        this.used = used;
    }


    /**
     * Gets the remaining value for this UsageType.
     * 
     * @return remaining
     */
    public java.lang.String getRemaining() {
        return remaining;
    }


    /**
     * Sets the remaining value for this UsageType.
     * 
     * @param remaining
     */
    public void setRemaining(java.lang.String remaining) {
        this.remaining = remaining;
    }


    /**
     * Gets the currentBehavior value for this UsageType.
     * 
     * @return currentBehavior
     */
    public java.lang.String getCurrentBehavior() {
        return currentBehavior;
    }


    /**
     * Sets the currentBehavior value for this UsageType.
     * 
     * @param currentBehavior
     */
    public void setCurrentBehavior(java.lang.String currentBehavior) {
        this.currentBehavior = currentBehavior;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UsageType)) return false;
        UsageType other = (UsageType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.limit==null && other.getLimit()==null) || 
             (this.limit!=null &&
              this.limit.equals(other.getLimit()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.used==null && other.getUsed()==null) || 
             (this.used!=null &&
              this.used.equals(other.getUsed()))) &&
            ((this.remaining==null && other.getRemaining()==null) || 
             (this.remaining!=null &&
              this.remaining.equals(other.getRemaining()))) &&
            ((this.currentBehavior==null && other.getCurrentBehavior()==null) || 
             (this.currentBehavior!=null &&
              this.currentBehavior.equals(other.getCurrentBehavior())));
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
        if (getLimit() != null) {
            _hashCode += getLimit().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getUsed() != null) {
            _hashCode += getUsed().hashCode();
        }
        if (getRemaining() != null) {
            _hashCode += getRemaining().hashCode();
        }
        if (getCurrentBehavior() != null) {
            _hashCode += getCurrentBehavior().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UsageType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "usageType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "limit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "limitType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("used");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "used"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remaining");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "remaining"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentBehavior");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "currentBehavior"));
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
