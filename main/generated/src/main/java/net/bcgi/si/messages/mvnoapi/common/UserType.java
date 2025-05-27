/**
 * UserType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.common;

public class UserType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected UserType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _SUBSCRIBER = "SUBSCRIBER";
    public static final java.lang.String _DEALER = "DEALER";
    public static final java.lang.String _USSD = "USSD";
    public static final java.lang.String _TTCARE = "TTCARE";
    public static final java.lang.String _CORP = "CORP";
    public static final java.lang.String _CCUI = "CCUI";
    public static final UserType SUBSCRIBER = new UserType(_SUBSCRIBER);
    public static final UserType DEALER = new UserType(_DEALER);
    public static final UserType USSD = new UserType(_USSD);
    public static final UserType TTCARE = new UserType(_TTCARE);
    public static final UserType CORP = new UserType(_CORP);
    public static final UserType CCUI = new UserType(_CCUI);
    public java.lang.String getValue() { return _value_;}
    public static UserType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        UserType enumeration = (UserType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static UserType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(UserType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "UserType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
