/**
 * ErrorCategory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.common;

public class ErrorCategory implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ErrorCategory(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _FAILED_BUSINESS_LOGIC = "FAILED_BUSINESS_LOGIC";
    public static final java.lang.String _WSFORMAT_ERROR = "WSFORMAT_ERROR";
    public static final java.lang.String _DATA_ERROR = "DATA_ERROR";
    public static final java.lang.String _SYSTEM_ERROR = "SYSTEM_ERROR";
    public static final java.lang.String _SYSTEM_OFFLINE = "SYSTEM_OFFLINE";
    public static final java.lang.String _TIME_LIMIT_ERROR = "TIME_LIMIT_ERROR";
    public static final ErrorCategory FAILED_BUSINESS_LOGIC = new ErrorCategory(_FAILED_BUSINESS_LOGIC);
    public static final ErrorCategory WSFORMAT_ERROR = new ErrorCategory(_WSFORMAT_ERROR);
    public static final ErrorCategory DATA_ERROR = new ErrorCategory(_DATA_ERROR);
    public static final ErrorCategory SYSTEM_ERROR = new ErrorCategory(_SYSTEM_ERROR);
    public static final ErrorCategory SYSTEM_OFFLINE = new ErrorCategory(_SYSTEM_OFFLINE);
    public static final ErrorCategory TIME_LIMIT_ERROR = new ErrorCategory(_TIME_LIMIT_ERROR);
    public java.lang.String getValue() { return _value_;}
    public static ErrorCategory fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ErrorCategory enumeration = (ErrorCategory)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ErrorCategory fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ErrorCategory.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "ErrorCategory"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
