/**
 * EventIdType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class EventIdType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected EventIdType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _SIMSWAP = "SIMSWAP";
    public static final java.lang.String _CHNGMSISDN = "CHNGMSISDN";
    public static final java.lang.String _CREATE_ACCOUNT = "CREATE_ACCOUNT";
    public static final java.lang.String _CREATE_SUBSCRIBER = "CREATE_SUBSCRIBER";
    public static final EventIdType SIMSWAP = new EventIdType(_SIMSWAP);
    public static final EventIdType CHNGMSISDN = new EventIdType(_CHNGMSISDN);
    public static final EventIdType CREATE_ACCOUNT = new EventIdType(_CREATE_ACCOUNT);
    public static final EventIdType CREATE_SUBSCRIBER = new EventIdType(_CREATE_SUBSCRIBER);
    public java.lang.String getValue() { return _value_;}
    public static EventIdType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        EventIdType enumeration = (EventIdType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static EventIdType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(EventIdType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "eventIdType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
