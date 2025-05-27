/**
 * GetTpdetailsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.ProductManagement_xsd;

public class GetTpdetailsResponse  implements java.io.Serializable {
    private java.lang.String currentplanName;

    private com.xius.billing.ProductManagement_xsd.ValueType[] voice;

    private com.xius.billing.ProductManagement_xsd.ValueType[] SMS;

    private com.xius.billing.ProductManagement_xsd.ValueType[] DATA;

    private java.math.BigDecimal planCharge;

    private java.lang.String planID;

    private java.lang.String validity;

    public GetTpdetailsResponse() {
    }

    public GetTpdetailsResponse(
           java.lang.String currentplanName,
           com.xius.billing.ProductManagement_xsd.ValueType[] voice,
           com.xius.billing.ProductManagement_xsd.ValueType[] SMS,
           com.xius.billing.ProductManagement_xsd.ValueType[] DATA,
           java.math.BigDecimal planCharge,
           java.lang.String planID,
           java.lang.String validity) {
           this.currentplanName = currentplanName;
           this.voice = voice;
           this.SMS = SMS;
           this.DATA = DATA;
           this.planCharge = planCharge;
           this.planID = planID;
           this.validity = validity;
    }


    /**
     * Gets the currentplanName value for this GetTpdetailsResponse.
     * 
     * @return currentplanName
     */
    public java.lang.String getCurrentplanName() {
        return currentplanName;
    }


    /**
     * Sets the currentplanName value for this GetTpdetailsResponse.
     * 
     * @param currentplanName
     */
    public void setCurrentplanName(java.lang.String currentplanName) {
        this.currentplanName = currentplanName;
    }


    /**
     * Gets the voice value for this GetTpdetailsResponse.
     * 
     * @return voice
     */
    public com.xius.billing.ProductManagement_xsd.ValueType[] getVoice() {
        return voice;
    }


    /**
     * Sets the voice value for this GetTpdetailsResponse.
     * 
     * @param voice
     */
    public void setVoice(com.xius.billing.ProductManagement_xsd.ValueType[] voice) {
        this.voice = voice;
    }

    public com.xius.billing.ProductManagement_xsd.ValueType getVoice(int i) {
        return this.voice[i];
    }

    public void setVoice(int i, com.xius.billing.ProductManagement_xsd.ValueType _value) {
        this.voice[i] = _value;
    }


    /**
     * Gets the SMS value for this GetTpdetailsResponse.
     * 
     * @return SMS
     */
    public com.xius.billing.ProductManagement_xsd.ValueType[] getSMS() {
        return SMS;
    }


    /**
     * Sets the SMS value for this GetTpdetailsResponse.
     * 
     * @param SMS
     */
    public void setSMS(com.xius.billing.ProductManagement_xsd.ValueType[] SMS) {
        this.SMS = SMS;
    }

    public com.xius.billing.ProductManagement_xsd.ValueType getSMS(int i) {
        return this.SMS[i];
    }

    public void setSMS(int i, com.xius.billing.ProductManagement_xsd.ValueType _value) {
        this.SMS[i] = _value;
    }


    /**
     * Gets the DATA value for this GetTpdetailsResponse.
     * 
     * @return DATA
     */
    public com.xius.billing.ProductManagement_xsd.ValueType[] getDATA() {
        return DATA;
    }


    /**
     * Sets the DATA value for this GetTpdetailsResponse.
     * 
     * @param DATA
     */
    public void setDATA(com.xius.billing.ProductManagement_xsd.ValueType[] DATA) {
        this.DATA = DATA;
    }

    public com.xius.billing.ProductManagement_xsd.ValueType getDATA(int i) {
        return this.DATA[i];
    }

    public void setDATA(int i, com.xius.billing.ProductManagement_xsd.ValueType _value) {
        this.DATA[i] = _value;
    }


    /**
     * Gets the planCharge value for this GetTpdetailsResponse.
     * 
     * @return planCharge
     */
    public java.math.BigDecimal getPlanCharge() {
        return planCharge;
    }


    /**
     * Sets the planCharge value for this GetTpdetailsResponse.
     * 
     * @param planCharge
     */
    public void setPlanCharge(java.math.BigDecimal planCharge) {
        this.planCharge = planCharge;
    }


    /**
     * Gets the planID value for this GetTpdetailsResponse.
     * 
     * @return planID
     */
    public java.lang.String getPlanID() {
        return planID;
    }


    /**
     * Sets the planID value for this GetTpdetailsResponse.
     * 
     * @param planID
     */
    public void setPlanID(java.lang.String planID) {
        this.planID = planID;
    }


    /**
     * Gets the validity value for this GetTpdetailsResponse.
     * 
     * @return validity
     */
    public java.lang.String getValidity() {
        return validity;
    }


    /**
     * Sets the validity value for this GetTpdetailsResponse.
     * 
     * @param validity
     */
    public void setValidity(java.lang.String validity) {
        this.validity = validity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTpdetailsResponse)) return false;
        GetTpdetailsResponse other = (GetTpdetailsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.currentplanName==null && other.getCurrentplanName()==null) || 
             (this.currentplanName!=null &&
              this.currentplanName.equals(other.getCurrentplanName()))) &&
            ((this.voice==null && other.getVoice()==null) || 
             (this.voice!=null &&
              java.util.Arrays.equals(this.voice, other.getVoice()))) &&
            ((this.SMS==null && other.getSMS()==null) || 
             (this.SMS!=null &&
              java.util.Arrays.equals(this.SMS, other.getSMS()))) &&
            ((this.DATA==null && other.getDATA()==null) || 
             (this.DATA!=null &&
              java.util.Arrays.equals(this.DATA, other.getDATA()))) &&
            ((this.planCharge==null && other.getPlanCharge()==null) || 
             (this.planCharge!=null &&
              this.planCharge.equals(other.getPlanCharge()))) &&
            ((this.planID==null && other.getPlanID()==null) || 
             (this.planID!=null &&
              this.planID.equals(other.getPlanID()))) &&
            ((this.validity==null && other.getValidity()==null) || 
             (this.validity!=null &&
              this.validity.equals(other.getValidity())));
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
        if (getCurrentplanName() != null) {
            _hashCode += getCurrentplanName().hashCode();
        }
        if (getVoice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVoice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVoice(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSMS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSMS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSMS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDATA() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDATA());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDATA(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPlanCharge() != null) {
            _hashCode += getPlanCharge().hashCode();
        }
        if (getPlanID() != null) {
            _hashCode += getPlanID().hashCode();
        }
        if (getValidity() != null) {
            _hashCode += getValidity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetTpdetailsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getTpdetailsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentplanName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "CurrentplanName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "Voice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "valueType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SMS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "SMS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "valueType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DATA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "DATA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "valueType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "planCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "planID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "Validity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
