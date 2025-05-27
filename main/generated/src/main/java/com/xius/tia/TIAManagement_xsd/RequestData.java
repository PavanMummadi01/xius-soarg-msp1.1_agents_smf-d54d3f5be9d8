/**
 * RequestData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.TIAManagement_xsd;

public class RequestData  implements java.io.Serializable {
    private java.lang.String technology;

    private java.lang.String transactionId;

    private java.lang.String extenalAccountId;

    private java.lang.String userdefined1;

    private java.lang.String userdefined2;

    private java.lang.String userdefined3;

    private java.lang.String userdefined4;

    private java.lang.String userdefined5;

    public RequestData() {
    }

    public RequestData(
           java.lang.String technology,
           java.lang.String transactionId,
           java.lang.String extenalAccountId,
           java.lang.String userdefined1,
           java.lang.String userdefined2,
           java.lang.String userdefined3,
           java.lang.String userdefined4,
           java.lang.String userdefined5) {
           this.technology = technology;
           this.transactionId = transactionId;
           this.extenalAccountId = extenalAccountId;
           this.userdefined1 = userdefined1;
           this.userdefined2 = userdefined2;
           this.userdefined3 = userdefined3;
           this.userdefined4 = userdefined4;
           this.userdefined5 = userdefined5;
    }


    /**
     * Gets the technology value for this RequestData.
     * 
     * @return technology
     */
    public java.lang.String getTechnology() {
        return technology;
    }


    /**
     * Sets the technology value for this RequestData.
     * 
     * @param technology
     */
    public void setTechnology(java.lang.String technology) {
        this.technology = technology;
    }


    /**
     * Gets the transactionId value for this RequestData.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this RequestData.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the extenalAccountId value for this RequestData.
     * 
     * @return extenalAccountId
     */
    public java.lang.String getExtenalAccountId() {
        return extenalAccountId;
    }


    /**
     * Sets the extenalAccountId value for this RequestData.
     * 
     * @param extenalAccountId
     */
    public void setExtenalAccountId(java.lang.String extenalAccountId) {
        this.extenalAccountId = extenalAccountId;
    }


    /**
     * Gets the userdefined1 value for this RequestData.
     * 
     * @return userdefined1
     */
    public java.lang.String getUserdefined1() {
        return userdefined1;
    }


    /**
     * Sets the userdefined1 value for this RequestData.
     * 
     * @param userdefined1
     */
    public void setUserdefined1(java.lang.String userdefined1) {
        this.userdefined1 = userdefined1;
    }


    /**
     * Gets the userdefined2 value for this RequestData.
     * 
     * @return userdefined2
     */
    public java.lang.String getUserdefined2() {
        return userdefined2;
    }


    /**
     * Sets the userdefined2 value for this RequestData.
     * 
     * @param userdefined2
     */
    public void setUserdefined2(java.lang.String userdefined2) {
        this.userdefined2 = userdefined2;
    }


    /**
     * Gets the userdefined3 value for this RequestData.
     * 
     * @return userdefined3
     */
    public java.lang.String getUserdefined3() {
        return userdefined3;
    }


    /**
     * Sets the userdefined3 value for this RequestData.
     * 
     * @param userdefined3
     */
    public void setUserdefined3(java.lang.String userdefined3) {
        this.userdefined3 = userdefined3;
    }


    /**
     * Gets the userdefined4 value for this RequestData.
     * 
     * @return userdefined4
     */
    public java.lang.String getUserdefined4() {
        return userdefined4;
    }


    /**
     * Sets the userdefined4 value for this RequestData.
     * 
     * @param userdefined4
     */
    public void setUserdefined4(java.lang.String userdefined4) {
        this.userdefined4 = userdefined4;
    }


    /**
     * Gets the userdefined5 value for this RequestData.
     * 
     * @return userdefined5
     */
    public java.lang.String getUserdefined5() {
        return userdefined5;
    }


    /**
     * Sets the userdefined5 value for this RequestData.
     * 
     * @param userdefined5
     */
    public void setUserdefined5(java.lang.String userdefined5) {
        this.userdefined5 = userdefined5;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestData)) return false;
        RequestData other = (RequestData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.technology==null && other.getTechnology()==null) || 
             (this.technology!=null &&
              this.technology.equals(other.getTechnology()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.extenalAccountId==null && other.getExtenalAccountId()==null) || 
             (this.extenalAccountId!=null &&
              this.extenalAccountId.equals(other.getExtenalAccountId()))) &&
            ((this.userdefined1==null && other.getUserdefined1()==null) || 
             (this.userdefined1!=null &&
              this.userdefined1.equals(other.getUserdefined1()))) &&
            ((this.userdefined2==null && other.getUserdefined2()==null) || 
             (this.userdefined2!=null &&
              this.userdefined2.equals(other.getUserdefined2()))) &&
            ((this.userdefined3==null && other.getUserdefined3()==null) || 
             (this.userdefined3!=null &&
              this.userdefined3.equals(other.getUserdefined3()))) &&
            ((this.userdefined4==null && other.getUserdefined4()==null) || 
             (this.userdefined4!=null &&
              this.userdefined4.equals(other.getUserdefined4()))) &&
            ((this.userdefined5==null && other.getUserdefined5()==null) || 
             (this.userdefined5!=null &&
              this.userdefined5.equals(other.getUserdefined5())));
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
        if (getTechnology() != null) {
            _hashCode += getTechnology().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getExtenalAccountId() != null) {
            _hashCode += getExtenalAccountId().hashCode();
        }
        if (getUserdefined1() != null) {
            _hashCode += getUserdefined1().hashCode();
        }
        if (getUserdefined2() != null) {
            _hashCode += getUserdefined2().hashCode();
        }
        if (getUserdefined3() != null) {
            _hashCode += getUserdefined3().hashCode();
        }
        if (getUserdefined4() != null) {
            _hashCode += getUserdefined4().hashCode();
        }
        if (getUserdefined5() != null) {
            _hashCode += getUserdefined5().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "requestData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("technology");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "technology"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "transactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extenalAccountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "extenalAccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userdefined1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "userdefined1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userdefined2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "userdefined2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userdefined3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "userdefined3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userdefined4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "userdefined4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userdefined5");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "userdefined5"));
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
