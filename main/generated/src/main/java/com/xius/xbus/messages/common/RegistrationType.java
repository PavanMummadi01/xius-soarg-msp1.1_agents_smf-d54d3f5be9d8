/**
 * RegistrationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.common;

public class RegistrationType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected RegistrationType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _REG_BLOCK_MDN = "REG_BLOCK_MDN";
    public static final java.lang.String _REG_SUB_ONLY = "REG_SUB_ONLY";
    public static final java.lang.String _REG_WITHOUT_MDN = "REG_WITHOUT_MDN";
    public static final java.lang.String _REG_NEW_MDN = "REG_NEW_MDN";
    public static final java.lang.String _REG_BARE_BONE = "REG_BARE_BONE";
    public static final RegistrationType REG_BLOCK_MDN = new RegistrationType(_REG_BLOCK_MDN);
    public static final RegistrationType REG_SUB_ONLY = new RegistrationType(_REG_SUB_ONLY);
    public static final RegistrationType REG_WITHOUT_MDN = new RegistrationType(_REG_WITHOUT_MDN);
    public static final RegistrationType REG_NEW_MDN = new RegistrationType(_REG_NEW_MDN);
    public static final RegistrationType REG_BARE_BONE = new RegistrationType(_REG_BARE_BONE);
    public java.lang.String getValue() { return _value_;}
    public static RegistrationType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        RegistrationType enumeration = (RegistrationType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static RegistrationType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(RegistrationType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "RegistrationType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
