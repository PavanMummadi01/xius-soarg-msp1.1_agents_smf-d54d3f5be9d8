/**
 * UpdateDeviceAll.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap_binding.servicemix;

public class UpdateDeviceAll  implements java.io.Serializable {
    private net.bcgi.si.messages.mvnoapi.device.UpdateDeviceAllRequest in0;

    public UpdateDeviceAll() {
    }

    public UpdateDeviceAll(
           net.bcgi.si.messages.mvnoapi.device.UpdateDeviceAllRequest in0) {
           this.in0 = in0;
    }


    /**
     * Gets the in0 value for this UpdateDeviceAll.
     * 
     * @return in0
     */
    public net.bcgi.si.messages.mvnoapi.device.UpdateDeviceAllRequest getIn0() {
        return in0;
    }


    /**
     * Sets the in0 value for this UpdateDeviceAll.
     * 
     * @param in0
     */
    public void setIn0(net.bcgi.si.messages.mvnoapi.device.UpdateDeviceAllRequest in0) {
        this.in0 = in0;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateDeviceAll)) return false;
        UpdateDeviceAll other = (UpdateDeviceAll) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.in0==null && other.getIn0()==null) || 
             (this.in0!=null &&
              this.in0.equals(other.getIn0())));
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
        if (getIn0() != null) {
            _hashCode += getIn0().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateDeviceAll.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">updateDeviceAll"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("in0");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "UpdateDeviceAllRequest"));
        elemField.setNillable(true);
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
