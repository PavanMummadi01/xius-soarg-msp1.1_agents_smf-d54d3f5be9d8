/**
 * TroubleTicketStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.subscriber;

public class TroubleTicketStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TroubleTicketStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NEW = "NEW";
    public static final java.lang.String _WORK_IN_PROGRESS = "WORK_IN_PROGRESS";
    public static final java.lang.String _REJECT = "REJECT";
    public static final java.lang.String _WAITING_FOR_MORE_INFO = "WAITING_FOR_MORE_INFO";
    public static final java.lang.String _ASSIGNED_TO_GTS = "ASSIGNED_TO_GTS";
    public static final java.lang.String _CLOSED = "CLOSED";
    public static final java.lang.String _REOPEN = "REOPEN";
    public static final TroubleTicketStatus NEW = new TroubleTicketStatus(_NEW);
    public static final TroubleTicketStatus WORK_IN_PROGRESS = new TroubleTicketStatus(_WORK_IN_PROGRESS);
    public static final TroubleTicketStatus REJECT = new TroubleTicketStatus(_REJECT);
    public static final TroubleTicketStatus WAITING_FOR_MORE_INFO = new TroubleTicketStatus(_WAITING_FOR_MORE_INFO);
    public static final TroubleTicketStatus ASSIGNED_TO_GTS = new TroubleTicketStatus(_ASSIGNED_TO_GTS);
    public static final TroubleTicketStatus CLOSED = new TroubleTicketStatus(_CLOSED);
    public static final TroubleTicketStatus REOPEN = new TroubleTicketStatus(_REOPEN);
    public java.lang.String getValue() { return _value_;}
    public static TroubleTicketStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TroubleTicketStatus enumeration = (TroubleTicketStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TroubleTicketStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TroubleTicketStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "TroubleTicketStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
