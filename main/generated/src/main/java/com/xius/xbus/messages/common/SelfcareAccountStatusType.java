/**
 * SelfcareAccountStatusType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.common;

public class SelfcareAccountStatusType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SelfcareAccountStatusType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ACTIVE = "ACTIVE";
    public static final java.lang.String _LOCKED = "LOCKED";
    public static final java.lang.String _EXPIRED = "EXPIRED";
    public static final java.lang.String _DEACTIVE = "DEACTIVE";
    public static final java.lang.String _PENDING = "PENDING";
    public static final java.lang.String _SUBMITTED = "SUBMITTED";
    public static final SelfcareAccountStatusType ACTIVE = new SelfcareAccountStatusType(_ACTIVE);
    public static final SelfcareAccountStatusType LOCKED = new SelfcareAccountStatusType(_LOCKED);
    public static final SelfcareAccountStatusType EXPIRED = new SelfcareAccountStatusType(_EXPIRED);
    public static final SelfcareAccountStatusType DEACTIVE = new SelfcareAccountStatusType(_DEACTIVE);
    public static final SelfcareAccountStatusType PENDING = new SelfcareAccountStatusType(_PENDING);
    public static final SelfcareAccountStatusType SUBMITTED = new SelfcareAccountStatusType(_SUBMITTED);
    public java.lang.String getValue() { return _value_;}
    public static SelfcareAccountStatusType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SelfcareAccountStatusType enumeration = (SelfcareAccountStatusType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SelfcareAccountStatusType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SelfcareAccountStatusType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "SelfcareAccountStatusType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
