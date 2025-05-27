/**
 * AccountStatusType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.subscriber;

public class AccountStatusType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AccountStatusType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ACTIVE = "ACTIVE";
    public static final java.lang.String _EXPIRED = "EXPIRED";
    public static final java.lang.String _CANCELLED = "CANCELLED";
    public static final java.lang.String _SUSPENDED = "SUSPENDED";
    public static final java.lang.String _PORT_IN_PENDING = "PORT_IN_PENDING";
    public static final AccountStatusType ACTIVE = new AccountStatusType(_ACTIVE);
    public static final AccountStatusType EXPIRED = new AccountStatusType(_EXPIRED);
    public static final AccountStatusType CANCELLED = new AccountStatusType(_CANCELLED);
    public static final AccountStatusType SUSPENDED = new AccountStatusType(_SUSPENDED);
    public static final AccountStatusType PORT_IN_PENDING = new AccountStatusType(_PORT_IN_PENDING);
    public java.lang.String getValue() { return _value_;}
    public static AccountStatusType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AccountStatusType enumeration = (AccountStatusType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AccountStatusType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AccountStatusType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "AccountStatusType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
