/**
 * AttachedATPType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.ProductManagement_xsd;

public class AttachedATPType  implements java.io.Serializable {
    private java.lang.String bucketunitvalue;

    private java.lang.String balancetype;

    private java.lang.String zonegroupId;

    private java.lang.String bucketUnitType;

    private java.lang.String publicityID;

    public AttachedATPType() {
    }

    public AttachedATPType(
           java.lang.String bucketunitvalue,
           java.lang.String balancetype,
           java.lang.String zonegroupId,
           java.lang.String bucketUnitType,
           java.lang.String publicityID) {
           this.bucketunitvalue = bucketunitvalue;
           this.balancetype = balancetype;
           this.zonegroupId = zonegroupId;
           this.bucketUnitType = bucketUnitType;
           this.publicityID = publicityID;
    }


    /**
     * Gets the bucketunitvalue value for this AttachedATPType.
     * 
     * @return bucketunitvalue
     */
    public java.lang.String getBucketunitvalue() {
        return bucketunitvalue;
    }


    /**
     * Sets the bucketunitvalue value for this AttachedATPType.
     * 
     * @param bucketunitvalue
     */
    public void setBucketunitvalue(java.lang.String bucketunitvalue) {
        this.bucketunitvalue = bucketunitvalue;
    }


    /**
     * Gets the balancetype value for this AttachedATPType.
     * 
     * @return balancetype
     */
    public java.lang.String getBalancetype() {
        return balancetype;
    }


    /**
     * Sets the balancetype value for this AttachedATPType.
     * 
     * @param balancetype
     */
    public void setBalancetype(java.lang.String balancetype) {
        this.balancetype = balancetype;
    }


    /**
     * Gets the zonegroupId value for this AttachedATPType.
     * 
     * @return zonegroupId
     */
    public java.lang.String getZonegroupId() {
        return zonegroupId;
    }


    /**
     * Sets the zonegroupId value for this AttachedATPType.
     * 
     * @param zonegroupId
     */
    public void setZonegroupId(java.lang.String zonegroupId) {
        this.zonegroupId = zonegroupId;
    }


    /**
     * Gets the bucketUnitType value for this AttachedATPType.
     * 
     * @return bucketUnitType
     */
    public java.lang.String getBucketUnitType() {
        return bucketUnitType;
    }


    /**
     * Sets the bucketUnitType value for this AttachedATPType.
     * 
     * @param bucketUnitType
     */
    public void setBucketUnitType(java.lang.String bucketUnitType) {
        this.bucketUnitType = bucketUnitType;
    }


    /**
     * Gets the publicityID value for this AttachedATPType.
     * 
     * @return publicityID
     */
    public java.lang.String getPublicityID() {
        return publicityID;
    }


    /**
     * Sets the publicityID value for this AttachedATPType.
     * 
     * @param publicityID
     */
    public void setPublicityID(java.lang.String publicityID) {
        this.publicityID = publicityID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AttachedATPType)) return false;
        AttachedATPType other = (AttachedATPType) obj;
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
            ((this.balancetype==null && other.getBalancetype()==null) || 
             (this.balancetype!=null &&
              this.balancetype.equals(other.getBalancetype()))) &&
            ((this.zonegroupId==null && other.getZonegroupId()==null) || 
             (this.zonegroupId!=null &&
              this.zonegroupId.equals(other.getZonegroupId()))) &&
            ((this.bucketUnitType==null && other.getBucketUnitType()==null) || 
             (this.bucketUnitType!=null &&
              this.bucketUnitType.equals(other.getBucketUnitType()))) &&
            ((this.publicityID==null && other.getPublicityID()==null) || 
             (this.publicityID!=null &&
              this.publicityID.equals(other.getPublicityID())));
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
        if (getBalancetype() != null) {
            _hashCode += getBalancetype().hashCode();
        }
        if (getZonegroupId() != null) {
            _hashCode += getZonegroupId().hashCode();
        }
        if (getBucketUnitType() != null) {
            _hashCode += getBucketUnitType().hashCode();
        }
        if (getPublicityID() != null) {
            _hashCode += getPublicityID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AttachedATPType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "AttachedATPType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bucketunitvalue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "bucketunitvalue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balancetype");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "balancetype"));
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
        elemField.setFieldName("publicityID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "publicityID"));
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
