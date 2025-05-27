/**
 * GetTpdetailsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.ProductManagement_xsd;

public class GetTpdetailsRequest  implements java.io.Serializable {
    private java.lang.String MSISDN;

    private java.lang.String planName;

    private java.lang.String atpCategory;

    public GetTpdetailsRequest() {
    }

    public GetTpdetailsRequest(
           java.lang.String MSISDN,
           java.lang.String planName,
           java.lang.String atpCategory) {
           this.MSISDN = MSISDN;
           this.planName = planName;
           this.atpCategory = atpCategory;
    }


    /**
     * Gets the MSISDN value for this GetTpdetailsRequest.
     * 
     * @return MSISDN
     */
    public java.lang.String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this GetTpdetailsRequest.
     * 
     * @param MSISDN
     */
    public void setMSISDN(java.lang.String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the planName value for this GetTpdetailsRequest.
     * 
     * @return planName
     */
    public java.lang.String getPlanName() {
        return planName;
    }


    /**
     * Sets the planName value for this GetTpdetailsRequest.
     * 
     * @param planName
     */
    public void setPlanName(java.lang.String planName) {
        this.planName = planName;
    }


    /**
     * Gets the atpCategory value for this GetTpdetailsRequest.
     * 
     * @return atpCategory
     */
    public java.lang.String getAtpCategory() {
        return atpCategory;
    }


    /**
     * Sets the atpCategory value for this GetTpdetailsRequest.
     * 
     * @param atpCategory
     */
    public void setAtpCategory(java.lang.String atpCategory) {
        this.atpCategory = atpCategory;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTpdetailsRequest)) return false;
        GetTpdetailsRequest other = (GetTpdetailsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MSISDN==null && other.getMSISDN()==null) || 
             (this.MSISDN!=null &&
              this.MSISDN.equals(other.getMSISDN()))) &&
            ((this.planName==null && other.getPlanName()==null) || 
             (this.planName!=null &&
              this.planName.equals(other.getPlanName()))) &&
            ((this.atpCategory==null && other.getAtpCategory()==null) || 
             (this.atpCategory!=null &&
              this.atpCategory.equals(other.getAtpCategory())));
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
        if (getMSISDN() != null) {
            _hashCode += getMSISDN().hashCode();
        }
        if (getPlanName() != null) {
            _hashCode += getPlanName().hashCode();
        }
        if (getAtpCategory() != null) {
            _hashCode += getAtpCategory().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetTpdetailsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getTpdetailsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "MSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "planName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atpCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "atpCategory"));
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
