/**
 * NotificationPurposeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.provisioning;

public class NotificationPurposeType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected NotificationPurposeType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _PORT_IN_COMPLETE = "PORT_IN_COMPLETE";
    public static final java.lang.String _PORT_OUT_VALIDATION = "PORT_OUT_VALIDATION";
    public static final java.lang.String _PORT_IN_PENDING = "PORT_IN_PENDING";
    public static final java.lang.String _PORT_IN_REJECT = "PORT_IN_REJECT";
    public static final java.lang.String _PCRF_FORGOT_PASSWORD = "PCRF_FORGOT_PASSWORD";
    public static final java.lang.String _LBS_FORGOT_PASSWORD = "LBS_FORGOT_PASSWORD";
    public static final java.lang.String _PB_MEDIATION_FAILURE = "PB_MEDIATION_FAILURE";
    public static final NotificationPurposeType PORT_IN_COMPLETE = new NotificationPurposeType(_PORT_IN_COMPLETE);
    public static final NotificationPurposeType PORT_OUT_VALIDATION = new NotificationPurposeType(_PORT_OUT_VALIDATION);
    public static final NotificationPurposeType PORT_IN_PENDING = new NotificationPurposeType(_PORT_IN_PENDING);
    public static final NotificationPurposeType PORT_IN_REJECT = new NotificationPurposeType(_PORT_IN_REJECT);
    public static final NotificationPurposeType PCRF_FORGOT_PASSWORD = new NotificationPurposeType(_PCRF_FORGOT_PASSWORD);
    public static final NotificationPurposeType LBS_FORGOT_PASSWORD = new NotificationPurposeType(_LBS_FORGOT_PASSWORD);
    public static final NotificationPurposeType PB_MEDIATION_FAILURE = new NotificationPurposeType(_PB_MEDIATION_FAILURE);
    public java.lang.String getValue() { return _value_;}
    public static NotificationPurposeType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        NotificationPurposeType enumeration = (NotificationPurposeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static NotificationPurposeType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(NotificationPurposeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "NotificationPurposeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
