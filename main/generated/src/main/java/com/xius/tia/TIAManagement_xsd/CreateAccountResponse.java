/**
 * CreateAccountResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.TIAManagement_xsd;

public class CreateAccountResponse  implements java.io.Serializable {
    private java.lang.String BAN;

    private java.lang.String parent;

    private java.lang.Boolean responsible;

    private java.lang.Long role;

    private com.xius.tia.TIAManagement_xsd.CommonData commonData;

    private com.xius.tia.TIAManagement_xsd.ResponseDataType responseData;

    public CreateAccountResponse() {
    }

    public CreateAccountResponse(
           java.lang.String BAN,
           java.lang.String parent,
           java.lang.Boolean responsible,
           java.lang.Long role,
           com.xius.tia.TIAManagement_xsd.CommonData commonData,
           com.xius.tia.TIAManagement_xsd.ResponseDataType responseData) {
           this.BAN = BAN;
           this.parent = parent;
           this.responsible = responsible;
           this.role = role;
           this.commonData = commonData;
           this.responseData = responseData;
    }


    /**
     * Gets the BAN value for this CreateAccountResponse.
     * 
     * @return BAN
     */
    public java.lang.String getBAN() {
        return BAN;
    }


    /**
     * Sets the BAN value for this CreateAccountResponse.
     * 
     * @param BAN
     */
    public void setBAN(java.lang.String BAN) {
        this.BAN = BAN;
    }


    /**
     * Gets the parent value for this CreateAccountResponse.
     * 
     * @return parent
     */
    public java.lang.String getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this CreateAccountResponse.
     * 
     * @param parent
     */
    public void setParent(java.lang.String parent) {
        this.parent = parent;
    }


    /**
     * Gets the responsible value for this CreateAccountResponse.
     * 
     * @return responsible
     */
    public java.lang.Boolean getResponsible() {
        return responsible;
    }


    /**
     * Sets the responsible value for this CreateAccountResponse.
     * 
     * @param responsible
     */
    public void setResponsible(java.lang.Boolean responsible) {
        this.responsible = responsible;
    }


    /**
     * Gets the role value for this CreateAccountResponse.
     * 
     * @return role
     */
    public java.lang.Long getRole() {
        return role;
    }


    /**
     * Sets the role value for this CreateAccountResponse.
     * 
     * @param role
     */
    public void setRole(java.lang.Long role) {
        this.role = role;
    }


    /**
     * Gets the commonData value for this CreateAccountResponse.
     * 
     * @return commonData
     */
    public com.xius.tia.TIAManagement_xsd.CommonData getCommonData() {
        return commonData;
    }


    /**
     * Sets the commonData value for this CreateAccountResponse.
     * 
     * @param commonData
     */
    public void setCommonData(com.xius.tia.TIAManagement_xsd.CommonData commonData) {
        this.commonData = commonData;
    }


    /**
     * Gets the responseData value for this CreateAccountResponse.
     * 
     * @return responseData
     */
    public com.xius.tia.TIAManagement_xsd.ResponseDataType getResponseData() {
        return responseData;
    }


    /**
     * Sets the responseData value for this CreateAccountResponse.
     * 
     * @param responseData
     */
    public void setResponseData(com.xius.tia.TIAManagement_xsd.ResponseDataType responseData) {
        this.responseData = responseData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateAccountResponse)) return false;
        CreateAccountResponse other = (CreateAccountResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.BAN==null && other.getBAN()==null) || 
             (this.BAN!=null &&
              this.BAN.equals(other.getBAN()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
            ((this.responsible==null && other.getResponsible()==null) || 
             (this.responsible!=null &&
              this.responsible.equals(other.getResponsible()))) &&
            ((this.role==null && other.getRole()==null) || 
             (this.role!=null &&
              this.role.equals(other.getRole()))) &&
            ((this.commonData==null && other.getCommonData()==null) || 
             (this.commonData!=null &&
              this.commonData.equals(other.getCommonData()))) &&
            ((this.responseData==null && other.getResponseData()==null) || 
             (this.responseData!=null &&
              this.responseData.equals(other.getResponseData())));
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
        if (getBAN() != null) {
            _hashCode += getBAN().hashCode();
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        if (getResponsible() != null) {
            _hashCode += getResponsible().hashCode();
        }
        if (getRole() != null) {
            _hashCode += getRole().hashCode();
        }
        if (getCommonData() != null) {
            _hashCode += getCommonData().hashCode();
        }
        if (getResponseData() != null) {
            _hashCode += getResponseData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateAccountResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "CreateAccountResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BAN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "BAN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responsible");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "responsible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("role");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "role"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commonData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "CommonData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "CommonData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "ResponseData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "ResponseDataType"));
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
