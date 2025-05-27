/**
 * AccountNumberMap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.subscriber;

public class AccountNumberMap  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private java.lang.String altAccountId01;

    private java.lang.String altAccountId02;

    private java.lang.String altAccountId03;

    private java.lang.String altAccountId04;

    private java.lang.String altAccountId05;

    private org.apache.axis.message.MessageElement [] _any;

    public AccountNumberMap() {
    }

    public AccountNumberMap(
           java.lang.String altAccountId01,
           java.lang.String altAccountId02,
           java.lang.String altAccountId03,
           java.lang.String altAccountId04,
           java.lang.String altAccountId05,
           org.apache.axis.message.MessageElement [] _any) {
           this.altAccountId01 = altAccountId01;
           this.altAccountId02 = altAccountId02;
           this.altAccountId03 = altAccountId03;
           this.altAccountId04 = altAccountId04;
           this.altAccountId05 = altAccountId05;
           this._any = _any;
    }


    /**
     * Gets the altAccountId01 value for this AccountNumberMap.
     * 
     * @return altAccountId01
     */
    public java.lang.String getAltAccountId01() {
        return altAccountId01;
    }


    /**
     * Sets the altAccountId01 value for this AccountNumberMap.
     * 
     * @param altAccountId01
     */
    public void setAltAccountId01(java.lang.String altAccountId01) {
        this.altAccountId01 = altAccountId01;
    }


    /**
     * Gets the altAccountId02 value for this AccountNumberMap.
     * 
     * @return altAccountId02
     */
    public java.lang.String getAltAccountId02() {
        return altAccountId02;
    }


    /**
     * Sets the altAccountId02 value for this AccountNumberMap.
     * 
     * @param altAccountId02
     */
    public void setAltAccountId02(java.lang.String altAccountId02) {
        this.altAccountId02 = altAccountId02;
    }


    /**
     * Gets the altAccountId03 value for this AccountNumberMap.
     * 
     * @return altAccountId03
     */
    public java.lang.String getAltAccountId03() {
        return altAccountId03;
    }


    /**
     * Sets the altAccountId03 value for this AccountNumberMap.
     * 
     * @param altAccountId03
     */
    public void setAltAccountId03(java.lang.String altAccountId03) {
        this.altAccountId03 = altAccountId03;
    }


    /**
     * Gets the altAccountId04 value for this AccountNumberMap.
     * 
     * @return altAccountId04
     */
    public java.lang.String getAltAccountId04() {
        return altAccountId04;
    }


    /**
     * Sets the altAccountId04 value for this AccountNumberMap.
     * 
     * @param altAccountId04
     */
    public void setAltAccountId04(java.lang.String altAccountId04) {
        this.altAccountId04 = altAccountId04;
    }


    /**
     * Gets the altAccountId05 value for this AccountNumberMap.
     * 
     * @return altAccountId05
     */
    public java.lang.String getAltAccountId05() {
        return altAccountId05;
    }


    /**
     * Sets the altAccountId05 value for this AccountNumberMap.
     * 
     * @param altAccountId05
     */
    public void setAltAccountId05(java.lang.String altAccountId05) {
        this.altAccountId05 = altAccountId05;
    }


    /**
     * Gets the _any value for this AccountNumberMap.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this AccountNumberMap.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountNumberMap)) return false;
        AccountNumberMap other = (AccountNumberMap) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.altAccountId01==null && other.getAltAccountId01()==null) || 
             (this.altAccountId01!=null &&
              this.altAccountId01.equals(other.getAltAccountId01()))) &&
            ((this.altAccountId02==null && other.getAltAccountId02()==null) || 
             (this.altAccountId02!=null &&
              this.altAccountId02.equals(other.getAltAccountId02()))) &&
            ((this.altAccountId03==null && other.getAltAccountId03()==null) || 
             (this.altAccountId03!=null &&
              this.altAccountId03.equals(other.getAltAccountId03()))) &&
            ((this.altAccountId04==null && other.getAltAccountId04()==null) || 
             (this.altAccountId04!=null &&
              this.altAccountId04.equals(other.getAltAccountId04()))) &&
            ((this.altAccountId05==null && other.getAltAccountId05()==null) || 
             (this.altAccountId05!=null &&
              this.altAccountId05.equals(other.getAltAccountId05()))) &&
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
        if (getAltAccountId01() != null) {
            _hashCode += getAltAccountId01().hashCode();
        }
        if (getAltAccountId02() != null) {
            _hashCode += getAltAccountId02().hashCode();
        }
        if (getAltAccountId03() != null) {
            _hashCode += getAltAccountId03().hashCode();
        }
        if (getAltAccountId04() != null) {
            _hashCode += getAltAccountId04().hashCode();
        }
        if (getAltAccountId05() != null) {
            _hashCode += getAltAccountId05().hashCode();
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
        new org.apache.axis.description.TypeDesc(AccountNumberMap.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "AccountNumberMap"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altAccountId01");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "altAccountId01"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altAccountId02");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "altAccountId02"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altAccountId03");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "altAccountId03"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altAccountId04");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "altAccountId04"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altAccountId05");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "altAccountId05"));
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
