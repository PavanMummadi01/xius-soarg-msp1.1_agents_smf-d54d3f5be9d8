/**
 * GetLocationAssoMsisdnResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class GetLocationAssoMsisdnResponse  implements java.io.Serializable {
    private java.lang.String availableMSISDN;

    private java.lang.String[] promotions;

    private java.lang.String oldMSISDN;

    private java.lang.String locationCode;

    private java.lang.String oldSIM;

    public GetLocationAssoMsisdnResponse() {
    }

    public GetLocationAssoMsisdnResponse(
           java.lang.String availableMSISDN,
           java.lang.String[] promotions,
           java.lang.String oldMSISDN,
           java.lang.String locationCode,
           java.lang.String oldSIM) {
           this.availableMSISDN = availableMSISDN;
           this.promotions = promotions;
           this.oldMSISDN = oldMSISDN;
           this.locationCode = locationCode;
           this.oldSIM = oldSIM;
    }


    /**
     * Gets the availableMSISDN value for this GetLocationAssoMsisdnResponse.
     * 
     * @return availableMSISDN
     */
    public java.lang.String getAvailableMSISDN() {
        return availableMSISDN;
    }


    /**
     * Sets the availableMSISDN value for this GetLocationAssoMsisdnResponse.
     * 
     * @param availableMSISDN
     */
    public void setAvailableMSISDN(java.lang.String availableMSISDN) {
        this.availableMSISDN = availableMSISDN;
    }


    /**
     * Gets the promotions value for this GetLocationAssoMsisdnResponse.
     * 
     * @return promotions
     */
    public java.lang.String[] getPromotions() {
        return promotions;
    }


    /**
     * Sets the promotions value for this GetLocationAssoMsisdnResponse.
     * 
     * @param promotions
     */
    public void setPromotions(java.lang.String[] promotions) {
        this.promotions = promotions;
    }

    public java.lang.String getPromotions(int i) {
        return this.promotions[i];
    }

    public void setPromotions(int i, java.lang.String _value) {
        this.promotions[i] = _value;
    }


    /**
     * Gets the oldMSISDN value for this GetLocationAssoMsisdnResponse.
     * 
     * @return oldMSISDN
     */
    public java.lang.String getOldMSISDN() {
        return oldMSISDN;
    }


    /**
     * Sets the oldMSISDN value for this GetLocationAssoMsisdnResponse.
     * 
     * @param oldMSISDN
     */
    public void setOldMSISDN(java.lang.String oldMSISDN) {
        this.oldMSISDN = oldMSISDN;
    }


    /**
     * Gets the locationCode value for this GetLocationAssoMsisdnResponse.
     * 
     * @return locationCode
     */
    public java.lang.String getLocationCode() {
        return locationCode;
    }


    /**
     * Sets the locationCode value for this GetLocationAssoMsisdnResponse.
     * 
     * @param locationCode
     */
    public void setLocationCode(java.lang.String locationCode) {
        this.locationCode = locationCode;
    }


    /**
     * Gets the oldSIM value for this GetLocationAssoMsisdnResponse.
     * 
     * @return oldSIM
     */
    public java.lang.String getOldSIM() {
        return oldSIM;
    }


    /**
     * Sets the oldSIM value for this GetLocationAssoMsisdnResponse.
     * 
     * @param oldSIM
     */
    public void setOldSIM(java.lang.String oldSIM) {
        this.oldSIM = oldSIM;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetLocationAssoMsisdnResponse)) return false;
        GetLocationAssoMsisdnResponse other = (GetLocationAssoMsisdnResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.availableMSISDN==null && other.getAvailableMSISDN()==null) || 
             (this.availableMSISDN!=null &&
              this.availableMSISDN.equals(other.getAvailableMSISDN()))) &&
            ((this.promotions==null && other.getPromotions()==null) || 
             (this.promotions!=null &&
              java.util.Arrays.equals(this.promotions, other.getPromotions()))) &&
            ((this.oldMSISDN==null && other.getOldMSISDN()==null) || 
             (this.oldMSISDN!=null &&
              this.oldMSISDN.equals(other.getOldMSISDN()))) &&
            ((this.locationCode==null && other.getLocationCode()==null) || 
             (this.locationCode!=null &&
              this.locationCode.equals(other.getLocationCode()))) &&
            ((this.oldSIM==null && other.getOldSIM()==null) || 
             (this.oldSIM!=null &&
              this.oldSIM.equals(other.getOldSIM())));
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
        if (getAvailableMSISDN() != null) {
            _hashCode += getAvailableMSISDN().hashCode();
        }
        if (getPromotions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPromotions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPromotions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOldMSISDN() != null) {
            _hashCode += getOldMSISDN().hashCode();
        }
        if (getLocationCode() != null) {
            _hashCode += getLocationCode().hashCode();
        }
        if (getOldSIM() != null) {
            _hashCode += getOldSIM().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetLocationAssoMsisdnResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetLocationAssoMsisdnResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "availableMSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "promotions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "oldMSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "locationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldSIM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "oldSIM"));
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
