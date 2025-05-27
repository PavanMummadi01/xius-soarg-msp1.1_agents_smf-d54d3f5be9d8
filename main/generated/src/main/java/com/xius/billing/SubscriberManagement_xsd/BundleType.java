/**
 * BundleType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class BundleType  implements java.io.Serializable {
    private java.math.BigInteger bundleId;

    private java.lang.String bundleName;

    private java.math.BigDecimal currentbalance;

    private java.lang.String expirationdate;

    private java.lang.String assignedDate;

    private java.lang.String balancecategory;

    private java.lang.String bundlecategoryId;

    private java.lang.String bundlecategoryName;

    private java.lang.String bundlecharge;

    private java.math.BigDecimal activationFee;

    public BundleType() {
    }

    public BundleType(
           java.math.BigInteger bundleId,
           java.lang.String bundleName,
           java.math.BigDecimal currentbalance,
           java.lang.String expirationdate,
           java.lang.String assignedDate,
           java.lang.String balancecategory,
           java.lang.String bundlecategoryId,
           java.lang.String bundlecategoryName,
           java.lang.String bundlecharge,
           java.math.BigDecimal activationFee) {
           this.bundleId = bundleId;
           this.bundleName = bundleName;
           this.currentbalance = currentbalance;
           this.expirationdate = expirationdate;
           this.assignedDate = assignedDate;
           this.balancecategory = balancecategory;
           this.bundlecategoryId = bundlecategoryId;
           this.bundlecategoryName = bundlecategoryName;
           this.bundlecharge = bundlecharge;
           this.activationFee = activationFee;
    }


    /**
     * Gets the bundleId value for this BundleType.
     * 
     * @return bundleId
     */
    public java.math.BigInteger getBundleId() {
        return bundleId;
    }


    /**
     * Sets the bundleId value for this BundleType.
     * 
     * @param bundleId
     */
    public void setBundleId(java.math.BigInteger bundleId) {
        this.bundleId = bundleId;
    }


    /**
     * Gets the bundleName value for this BundleType.
     * 
     * @return bundleName
     */
    public java.lang.String getBundleName() {
        return bundleName;
    }


    /**
     * Sets the bundleName value for this BundleType.
     * 
     * @param bundleName
     */
    public void setBundleName(java.lang.String bundleName) {
        this.bundleName = bundleName;
    }


    /**
     * Gets the currentbalance value for this BundleType.
     * 
     * @return currentbalance
     */
    public java.math.BigDecimal getCurrentbalance() {
        return currentbalance;
    }


    /**
     * Sets the currentbalance value for this BundleType.
     * 
     * @param currentbalance
     */
    public void setCurrentbalance(java.math.BigDecimal currentbalance) {
        this.currentbalance = currentbalance;
    }


    /**
     * Gets the expirationdate value for this BundleType.
     * 
     * @return expirationdate
     */
    public java.lang.String getExpirationdate() {
        return expirationdate;
    }


    /**
     * Sets the expirationdate value for this BundleType.
     * 
     * @param expirationdate
     */
    public void setExpirationdate(java.lang.String expirationdate) {
        this.expirationdate = expirationdate;
    }


    /**
     * Gets the assignedDate value for this BundleType.
     * 
     * @return assignedDate
     */
    public java.lang.String getAssignedDate() {
        return assignedDate;
    }


    /**
     * Sets the assignedDate value for this BundleType.
     * 
     * @param assignedDate
     */
    public void setAssignedDate(java.lang.String assignedDate) {
        this.assignedDate = assignedDate;
    }


    /**
     * Gets the balancecategory value for this BundleType.
     * 
     * @return balancecategory
     */
    public java.lang.String getBalancecategory() {
        return balancecategory;
    }


    /**
     * Sets the balancecategory value for this BundleType.
     * 
     * @param balancecategory
     */
    public void setBalancecategory(java.lang.String balancecategory) {
        this.balancecategory = balancecategory;
    }


    /**
     * Gets the bundlecategoryId value for this BundleType.
     * 
     * @return bundlecategoryId
     */
    public java.lang.String getBundlecategoryId() {
        return bundlecategoryId;
    }


    /**
     * Sets the bundlecategoryId value for this BundleType.
     * 
     * @param bundlecategoryId
     */
    public void setBundlecategoryId(java.lang.String bundlecategoryId) {
        this.bundlecategoryId = bundlecategoryId;
    }


    /**
     * Gets the bundlecategoryName value for this BundleType.
     * 
     * @return bundlecategoryName
     */
    public java.lang.String getBundlecategoryName() {
        return bundlecategoryName;
    }


    /**
     * Sets the bundlecategoryName value for this BundleType.
     * 
     * @param bundlecategoryName
     */
    public void setBundlecategoryName(java.lang.String bundlecategoryName) {
        this.bundlecategoryName = bundlecategoryName;
    }


    /**
     * Gets the bundlecharge value for this BundleType.
     * 
     * @return bundlecharge
     */
    public java.lang.String getBundlecharge() {
        return bundlecharge;
    }


    /**
     * Sets the bundlecharge value for this BundleType.
     * 
     * @param bundlecharge
     */
    public void setBundlecharge(java.lang.String bundlecharge) {
        this.bundlecharge = bundlecharge;
    }


    /**
     * Gets the activationFee value for this BundleType.
     * 
     * @return activationFee
     */
    public java.math.BigDecimal getActivationFee() {
        return activationFee;
    }


    /**
     * Sets the activationFee value for this BundleType.
     * 
     * @param activationFee
     */
    public void setActivationFee(java.math.BigDecimal activationFee) {
        this.activationFee = activationFee;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BundleType)) return false;
        BundleType other = (BundleType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bundleId==null && other.getBundleId()==null) || 
             (this.bundleId!=null &&
              this.bundleId.equals(other.getBundleId()))) &&
            ((this.bundleName==null && other.getBundleName()==null) || 
             (this.bundleName!=null &&
              this.bundleName.equals(other.getBundleName()))) &&
            ((this.currentbalance==null && other.getCurrentbalance()==null) || 
             (this.currentbalance!=null &&
              this.currentbalance.equals(other.getCurrentbalance()))) &&
            ((this.expirationdate==null && other.getExpirationdate()==null) || 
             (this.expirationdate!=null &&
              this.expirationdate.equals(other.getExpirationdate()))) &&
            ((this.assignedDate==null && other.getAssignedDate()==null) || 
             (this.assignedDate!=null &&
              this.assignedDate.equals(other.getAssignedDate()))) &&
            ((this.balancecategory==null && other.getBalancecategory()==null) || 
             (this.balancecategory!=null &&
              this.balancecategory.equals(other.getBalancecategory()))) &&
            ((this.bundlecategoryId==null && other.getBundlecategoryId()==null) || 
             (this.bundlecategoryId!=null &&
              this.bundlecategoryId.equals(other.getBundlecategoryId()))) &&
            ((this.bundlecategoryName==null && other.getBundlecategoryName()==null) || 
             (this.bundlecategoryName!=null &&
              this.bundlecategoryName.equals(other.getBundlecategoryName()))) &&
            ((this.bundlecharge==null && other.getBundlecharge()==null) || 
             (this.bundlecharge!=null &&
              this.bundlecharge.equals(other.getBundlecharge()))) &&
            ((this.activationFee==null && other.getActivationFee()==null) || 
             (this.activationFee!=null &&
              this.activationFee.equals(other.getActivationFee())));
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
        if (getBundleId() != null) {
            _hashCode += getBundleId().hashCode();
        }
        if (getBundleName() != null) {
            _hashCode += getBundleName().hashCode();
        }
        if (getCurrentbalance() != null) {
            _hashCode += getCurrentbalance().hashCode();
        }
        if (getExpirationdate() != null) {
            _hashCode += getExpirationdate().hashCode();
        }
        if (getAssignedDate() != null) {
            _hashCode += getAssignedDate().hashCode();
        }
        if (getBalancecategory() != null) {
            _hashCode += getBalancecategory().hashCode();
        }
        if (getBundlecategoryId() != null) {
            _hashCode += getBundlecategoryId().hashCode();
        }
        if (getBundlecategoryName() != null) {
            _hashCode += getBundlecategoryName().hashCode();
        }
        if (getBundlecharge() != null) {
            _hashCode += getBundlecharge().hashCode();
        }
        if (getActivationFee() != null) {
            _hashCode += getActivationFee().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BundleType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "BundleType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bundleId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "bundleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bundleName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "bundleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentbalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "Currentbalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationdate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "Expirationdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "AssignedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balancecategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "Balancecategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bundlecategoryId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "BundlecategoryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bundlecategoryName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "BundlecategoryName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bundlecharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "Bundlecharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "activationFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
