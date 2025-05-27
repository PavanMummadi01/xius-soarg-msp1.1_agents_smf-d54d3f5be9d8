/**
 * AvailableATPType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.ProductManagement_xsd;

public class AvailableATPType  implements java.io.Serializable {
    private java.lang.String bucketunitvalue;

    private java.lang.String balancecategory;

    private java.lang.String zonegroupId;

    private java.lang.String bucketUnitType;

    private java.lang.String ATPid;

    public AvailableATPType() {
    }

    public AvailableATPType(
           java.lang.String bucketunitvalue,
           java.lang.String balancecategory,
           java.lang.String zonegroupId,
           java.lang.String bucketUnitType,
           java.lang.String ATPid) {
           this.bucketunitvalue = bucketunitvalue;
           this.balancecategory = balancecategory;
           this.zonegroupId = zonegroupId;
           this.bucketUnitType = bucketUnitType;
           this.ATPid = ATPid;
    }


    /**
     * Gets the bucketunitvalue value for this AvailableATPType.
     * 
     * @return bucketunitvalue
     */
    public java.lang.String getBucketunitvalue() {
        return bucketunitvalue;
    }


    /**
     * Sets the bucketunitvalue value for this AvailableATPType.
     * 
     * @param bucketunitvalue
     */
    public void setBucketunitvalue(java.lang.String bucketunitvalue) {
        this.bucketunitvalue = bucketunitvalue;
    }


    /**
     * Gets the balancecategory value for this AvailableATPType.
     * 
     * @return balancecategory
     */
    public java.lang.String getBalancecategory() {
        return balancecategory;
    }


    /**
     * Sets the balancecategory value for this AvailableATPType.
     * 
     * @param balancecategory
     */
    public void setBalancecategory(java.lang.String balancecategory) {
        this.balancecategory = balancecategory;
    }


    /**
     * Gets the zonegroupId value for this AvailableATPType.
     * 
     * @return zonegroupId
     */
    public java.lang.String getZonegroupId() {
        return zonegroupId;
    }


    /**
     * Sets the zonegroupId value for this AvailableATPType.
     * 
     * @param zonegroupId
     */
    public void setZonegroupId(java.lang.String zonegroupId) {
        this.zonegroupId = zonegroupId;
    }


    /**
     * Gets the bucketUnitType value for this AvailableATPType.
     * 
     * @return bucketUnitType
     */
    public java.lang.String getBucketUnitType() {
        return bucketUnitType;
    }


    /**
     * Sets the bucketUnitType value for this AvailableATPType.
     * 
     * @param bucketUnitType
     */
    public void setBucketUnitType(java.lang.String bucketUnitType) {
        this.bucketUnitType = bucketUnitType;
    }


    /**
     * Gets the ATPid value for this AvailableATPType.
     * 
     * @return ATPid
     */
    public java.lang.String getATPid() {
        return ATPid;
    }


    /**
     * Sets the ATPid value for this AvailableATPType.
     * 
     * @param ATPid
     */
    public void setATPid(java.lang.String ATPid) {
        this.ATPid = ATPid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AvailableATPType)) return false;
        AvailableATPType other = (AvailableATPType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bucketunitvalue==null && other.getBucketunitvalue()==null) || 
             (this.bucketunitvalue!=null &&
              this.bucketunitvalue.equals(other.getBucketunitvalue()))) &&
            ((this.balancecategory==null && other.getBalancecategory()==null) || 
             (this.balancecategory!=null &&
              this.balancecategory.equals(other.getBalancecategory()))) &&
            ((this.zonegroupId==null && other.getZonegroupId()==null) || 
             (this.zonegroupId!=null &&
              this.zonegroupId.equals(other.getZonegroupId()))) &&
            ((this.bucketUnitType==null && other.getBucketUnitType()==null) || 
             (this.bucketUnitType!=null &&
              this.bucketUnitType.equals(other.getBucketUnitType()))) &&
            ((this.ATPid==null && other.getATPid()==null) || 
             (this.ATPid!=null &&
              this.ATPid.equals(other.getATPid())));
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
        if (getBucketunitvalue() != null) {
            _hashCode += getBucketunitvalue().hashCode();
        }
        if (getBalancecategory() != null) {
            _hashCode += getBalancecategory().hashCode();
        }
        if (getZonegroupId() != null) {
            _hashCode += getZonegroupId().hashCode();
        }
        if (getBucketUnitType() != null) {
            _hashCode += getBucketUnitType().hashCode();
        }
        if (getATPid() != null) {
            _hashCode += getATPid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AvailableATPType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "AvailableATPType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bucketunitvalue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "bucketunitvalue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balancecategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "balancecategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zonegroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "zonegroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bucketUnitType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "bucketUnitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ATPid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "ATPid"));
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
