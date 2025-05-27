/**
 * SubscriberStatusType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.subscriber;

public class SubscriberStatusType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SubscriberStatusType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ACTIVE = "ACTIVE";
    public static final java.lang.String _EXPIRED = "EXPIRED";
    public static final java.lang.String _CANCELLED = "CANCELLED";
    public static final java.lang.String _SUSPENDED = "SUSPENDED";
    public static final java.lang.String _TDNP = "TDNP";
    public static final java.lang.String _DEACTIVATED = "DEACTIVATED";
    public static final java.lang.String _PDNP = "PDNP";
    public static final java.lang.String _MERGED = "MERGED";
    public static final java.lang.String _PENDING = "PENDING";
    public static final java.lang.String _SUSP_NRT = "SUSP_NRT";
    public static final java.lang.String _WRITEOFF = "WRITEOFF";
    public static final java.lang.String _PORT_IN_PENDING = "PORT_IN_PENDING";
    public static final SubscriberStatusType ACTIVE = new SubscriberStatusType(_ACTIVE);
    public static final SubscriberStatusType EXPIRED = new SubscriberStatusType(_EXPIRED);
    public static final SubscriberStatusType CANCELLED = new SubscriberStatusType(_CANCELLED);
    public static final SubscriberStatusType SUSPENDED = new SubscriberStatusType(_SUSPENDED);
    public static final SubscriberStatusType TDNP = new SubscriberStatusType(_TDNP);
    public static final SubscriberStatusType DEACTIVATED = new SubscriberStatusType(_DEACTIVATED);
    public static final SubscriberStatusType PDNP = new SubscriberStatusType(_PDNP);
    public static final SubscriberStatusType MERGED = new SubscriberStatusType(_MERGED);
    public static final SubscriberStatusType PENDING = new SubscriberStatusType(_PENDING);
    public static final SubscriberStatusType SUSP_NRT = new SubscriberStatusType(_SUSP_NRT);
    public static final SubscriberStatusType WRITEOFF = new SubscriberStatusType(_WRITEOFF);
    public static final SubscriberStatusType PORT_IN_PENDING = new SubscriberStatusType(_PORT_IN_PENDING);
    public java.lang.String getValue() { return _value_;}
    public static SubscriberStatusType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SubscriberStatusType enumeration = (SubscriberStatusType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SubscriberStatusType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SubscriberStatusType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "SubscriberStatusType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
