/**
 * FetchByType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.common;

public class FetchByType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FetchByType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _BY_CITY = "BY_CITY";
    public static final java.lang.String _BY_STATE = "BY_STATE";
    public static final java.lang.String _GET_STATES = "GET_STATES";
    public static final java.lang.String _BY_POSTALCODE = "BY_POSTALCODE";
    public static final java.lang.String _GET_POSTALCODES = "GET_POSTALCODES";
    public static final java.lang.String _GET_CITIES = "GET_CITIES";
    public static final FetchByType BY_CITY = new FetchByType(_BY_CITY);
    public static final FetchByType BY_STATE = new FetchByType(_BY_STATE);
    public static final FetchByType GET_STATES = new FetchByType(_GET_STATES);
    public static final FetchByType BY_POSTALCODE = new FetchByType(_BY_POSTALCODE);
    public static final FetchByType GET_POSTALCODES = new FetchByType(_GET_POSTALCODES);
    public static final FetchByType GET_CITIES = new FetchByType(_GET_CITIES);
    public java.lang.String getValue() { return _value_;}
    public static FetchByType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FetchByType enumeration = (FetchByType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FetchByType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(FetchByType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "FetchByType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
