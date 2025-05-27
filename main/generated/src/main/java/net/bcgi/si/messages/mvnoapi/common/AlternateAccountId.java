/**
 * AlternateAccountId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.common;

public class AlternateAccountId  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private java.lang.String alternateAccountId1;

    private java.lang.String alternateAccountId2;

    private java.lang.String alternateAccountId3;

    private java.lang.String alternateAccountId4;

    private org.apache.axis.message.MessageElement [] _any;

    public AlternateAccountId() {
    }

    public AlternateAccountId(
           java.lang.String alternateAccountId1,
           java.lang.String alternateAccountId2,
           java.lang.String alternateAccountId3,
           java.lang.String alternateAccountId4,
           org.apache.axis.message.MessageElement [] _any) {
           this.alternateAccountId1 = alternateAccountId1;
           this.alternateAccountId2 = alternateAccountId2;
           this.alternateAccountId3 = alternateAccountId3;
           this.alternateAccountId4 = alternateAccountId4;
           this._any = _any;
    }


    /**
     * Gets the alternateAccountId1 value for this AlternateAccountId.
     * 
     * @return alternateAccountId1
     */
    public java.lang.String getAlternateAccountId1() {
        return alternateAccountId1;
    }


    /**
     * Sets the alternateAccountId1 value for this AlternateAccountId.
     * 
     * @param alternateAccountId1
     */
    public void setAlternateAccountId1(java.lang.String alternateAccountId1) {
        this.alternateAccountId1 = alternateAccountId1;
    }


    /**
     * Gets the alternateAccountId2 value for this AlternateAccountId.
     * 
     * @return alternateAccountId2
     */
    public java.lang.String getAlternateAccountId2() {
        return alternateAccountId2;
    }


    /**
     * Sets the alternateAccountId2 value for this AlternateAccountId.
     * 
     * @param alternateAccountId2
     */
    public void setAlternateAccountId2(java.lang.String alternateAccountId2) {
        this.alternateAccountId2 = alternateAccountId2;
    }


    /**
     * Gets the alternateAccountId3 value for this AlternateAccountId.
     * 
     * @return alternateAccountId3
     */
    public java.lang.String getAlternateAccountId3() {
        return alternateAccountId3;
    }


    /**
     * Sets the alternateAccountId3 value for this AlternateAccountId.
     * 
     * @param alternateAccountId3
     */
    public void setAlternateAccountId3(java.lang.String alternateAccountId3) {
        this.alternateAccountId3 = alternateAccountId3;
    }


    /**
     * Gets the alternateAccountId4 value for this AlternateAccountId.
     * 
     * @return alternateAccountId4
     */
    public java.lang.String getAlternateAccountId4() {
        return alternateAccountId4;
    }


    /**
     * Sets the alternateAccountId4 value for this AlternateAccountId.
     * 
     * @param alternateAccountId4
     */
    public void setAlternateAccountId4(java.lang.String alternateAccountId4) {
        this.alternateAccountId4 = alternateAccountId4;
    }


    /**
     * Gets the _any value for this AlternateAccountId.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this AlternateAccountId.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AlternateAccountId)) return false;
        AlternateAccountId other = (AlternateAccountId) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.alternateAccountId1==null && other.getAlternateAccountId1()==null) || 
             (this.alternateAccountId1!=null &&
              this.alternateAccountId1.equals(other.getAlternateAccountId1()))) &&
            ((this.alternateAccountId2==null && other.getAlternateAccountId2()==null) || 
             (this.alternateAccountId2!=null &&
              this.alternateAccountId2.equals(other.getAlternateAccountId2()))) &&
            ((this.alternateAccountId3==null && other.getAlternateAccountId3()==null) || 
             (this.alternateAccountId3!=null &&
              this.alternateAccountId3.equals(other.getAlternateAccountId3()))) &&
            ((this.alternateAccountId4==null && other.getAlternateAccountId4()==null) || 
             (this.alternateAccountId4!=null &&
              this.alternateAccountId4.equals(other.getAlternateAccountId4()))) &&
            ((this._any==null && other.get_any()==null) || 
             (this._any!=null &&
              java.util.Arrays.equals(this._any, other.get_any())));
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
        if (getAlternateAccountId1() != null) {
            _hashCode += getAlternateAccountId1().hashCode();
        }
        if (getAlternateAccountId2() != null) {
            _hashCode += getAlternateAccountId2().hashCode();
        }
        if (getAlternateAccountId3() != null) {
            _hashCode += getAlternateAccountId3().hashCode();
        }
        if (getAlternateAccountId4() != null) {
            _hashCode += getAlternateAccountId4().hashCode();
        }
        if (get_any() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_any());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_any(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AlternateAccountId.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "AlternateAccountId"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateAccountId1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "alternateAccountId1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateAccountId2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "alternateAccountId2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateAccountId3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "alternateAccountId3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateAccountId4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "alternateAccountId4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
