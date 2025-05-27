/**
 * GetPostpaidGrpCountDetRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.CAManagement_xsd;

public class GetPostpaidGrpCountDetRequest  implements java.io.Serializable {
    private java.lang.String idValue;

    private java.lang.String undefined1;

    private java.lang.String undefined2;

    public GetPostpaidGrpCountDetRequest() {
    }

    public GetPostpaidGrpCountDetRequest(
           java.lang.String idValue,
           java.lang.String undefined1,
           java.lang.String undefined2) {
           this.idValue = idValue;
           this.undefined1 = undefined1;
           this.undefined2 = undefined2;
    }


    /**
     * Gets the idValue value for this GetPostpaidGrpCountDetRequest.
     * 
     * @return idValue
     */
    public java.lang.String getIdValue() {
        return idValue;
    }


    /**
     * Sets the idValue value for this GetPostpaidGrpCountDetRequest.
     * 
     * @param idValue
     */
    public void setIdValue(java.lang.String idValue) {
        this.idValue = idValue;
    }


    /**
     * Gets the undefined1 value for this GetPostpaidGrpCountDetRequest.
     * 
     * @return undefined1
     */
    public java.lang.String getUndefined1() {
        return undefined1;
    }


    /**
     * Sets the undefined1 value for this GetPostpaidGrpCountDetRequest.
     * 
     * @param undefined1
     */
    public void setUndefined1(java.lang.String undefined1) {
        this.undefined1 = undefined1;
    }


    /**
     * Gets the undefined2 value for this GetPostpaidGrpCountDetRequest.
     * 
     * @return undefined2
     */
    public java.lang.String getUndefined2() {
        return undefined2;
    }


    /**
     * Sets the undefined2 value for this GetPostpaidGrpCountDetRequest.
     * 
     * @param undefined2
     */
    public void setUndefined2(java.lang.String undefined2) {
        this.undefined2 = undefined2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPostpaidGrpCountDetRequest)) return false;
        GetPostpaidGrpCountDetRequest other = (GetPostpaidGrpCountDetRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idValue==null && other.getIdValue()==null) || 
             (this.idValue!=null &&
              this.idValue.equals(other.getIdValue()))) &&
            ((this.undefined1==null && other.getUndefined1()==null) || 
             (this.undefined1!=null &&
              this.undefined1.equals(other.getUndefined1()))) &&
            ((this.undefined2==null && other.getUndefined2()==null) || 
             (this.undefined2!=null &&
              this.undefined2.equals(other.getUndefined2())));
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
        if (getIdValue() != null) {
            _hashCode += getIdValue().hashCode();
        }
        if (getUndefined1() != null) {
            _hashCode += getUndefined1().hashCode();
        }
        if (getUndefined2() != null) {
            _hashCode += getUndefined2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPostpaidGrpCountDetRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "getPostpaidGrpCountDetRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "idValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("undefined1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "undefined1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("undefined2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "undefined2"));
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
