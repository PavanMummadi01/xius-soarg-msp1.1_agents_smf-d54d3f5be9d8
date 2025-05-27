/**
 * L4AdNotificationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.provisioning;

public class L4AdNotificationType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected L4AdNotificationType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CLICK_TO_CALL = "CLICK_TO_CALL";
    public static final java.lang.String _CLICK_TO_SURF = "CLICK_TO_SURF";
    public static final java.lang.String _CLICK_TO_SAVE = "CLICK_TO_SAVE";
    public static final java.lang.String _CALL_ME = "CALL_ME";
    public static final L4AdNotificationType CLICK_TO_CALL = new L4AdNotificationType(_CLICK_TO_CALL);
    public static final L4AdNotificationType CLICK_TO_SURF = new L4AdNotificationType(_CLICK_TO_SURF);
    public static final L4AdNotificationType CLICK_TO_SAVE = new L4AdNotificationType(_CLICK_TO_SAVE);
    public static final L4AdNotificationType CALL_ME = new L4AdNotificationType(_CALL_ME);
    public java.lang.String getValue() { return _value_;}
    public static L4AdNotificationType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        L4AdNotificationType enumeration = (L4AdNotificationType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static L4AdNotificationType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(L4AdNotificationType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "L4AdNotificationType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
