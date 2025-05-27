/**
 * RegistrationFeeDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.provisioning;

public class RegistrationFeeDetails  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private java.lang.Double activationFee;

    private double servicePlanFee;

    private org.apache.axis.message.MessageElement [] _any;

    public RegistrationFeeDetails() {
    }

    public RegistrationFeeDetails(
           java.lang.Double activationFee,
           double servicePlanFee,
           org.apache.axis.message.MessageElement [] _any) {
           this.activationFee = activationFee;
           this.servicePlanFee = servicePlanFee;
           this._any = _any;
    }


    /**
     * Gets the activationFee value for this RegistrationFeeDetails.
     * 
     * @return activationFee
     */
    public java.lang.Double getActivationFee() {
        return activationFee;
    }


    /**
     * Sets the activationFee value for this RegistrationFeeDetails.
     * 
     * @param activationFee
     */
    public void setActivationFee(java.lang.Double activationFee) {
        this.activationFee = activationFee;
    }


    /**
     * Gets the servicePlanFee value for this RegistrationFeeDetails.
     * 
     * @return servicePlanFee
     */
    public double getServicePlanFee() {
        return servicePlanFee;
    }


    /**
     * Sets the servicePlanFee value for this RegistrationFeeDetails.
     * 
     * @param servicePlanFee
     */
    public void setServicePlanFee(double servicePlanFee) {
        this.servicePlanFee = servicePlanFee;
    }


    /**
     * Gets the _any value for this RegistrationFeeDetails.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this RegistrationFeeDetails.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegistrationFeeDetails)) return false;
        RegistrationFeeDetails other = (RegistrationFeeDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.activationFee==null && other.getActivationFee()==null) || 
             (this.activationFee!=null &&
              this.activationFee.equals(other.getActivationFee()))) &&
            this.servicePlanFee == other.getServicePlanFee() &&
            ((this._any==null && other.get_any()==null) || 
             (this._any!=null &&
              java.util.Arrays.equals(this._any, other.get_any())));
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
        if (getActivationFee() != null) {
            _hashCode += getActivationFee().hashCode();
        }
        _hashCode += new Double(getServicePlanFee()).hashCode();
        if (get_any() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_any());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_any(), i);
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
        new org.apache.axis.description.TypeDesc(RegistrationFeeDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "RegistrationFeeDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "activationFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicePlanFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "servicePlanFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
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
