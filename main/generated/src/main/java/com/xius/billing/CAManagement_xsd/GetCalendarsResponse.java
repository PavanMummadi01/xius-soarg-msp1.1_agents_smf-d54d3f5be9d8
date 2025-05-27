/**
 * GetCalendarsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.CAManagement_xsd;

public class GetCalendarsResponse  implements java.io.Serializable {
    private com.xius.billing.CAManagement_xsd.CalendarType[] calendars;

    public GetCalendarsResponse() {
    }

    public GetCalendarsResponse(
           com.xius.billing.CAManagement_xsd.CalendarType[] calendars) {
           this.calendars = calendars;
    }


    /**
     * Gets the calendars value for this GetCalendarsResponse.
     * 
     * @return calendars
     */
    public com.xius.billing.CAManagement_xsd.CalendarType[] getCalendars() {
        return calendars;
    }


    /**
     * Sets the calendars value for this GetCalendarsResponse.
     * 
     * @param calendars
     */
    public void setCalendars(com.xius.billing.CAManagement_xsd.CalendarType[] calendars) {
        this.calendars = calendars;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCalendarsResponse)) return false;
        GetCalendarsResponse other = (GetCalendarsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.calendars==null && other.getCalendars()==null) || 
             (this.calendars!=null &&
              java.util.Arrays.equals(this.calendars, other.getCalendars())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCalendars() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCalendars());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCalendars(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCalendarsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "GetCalendarsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calendars");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "Calendars"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "CalendarType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "calendar"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
