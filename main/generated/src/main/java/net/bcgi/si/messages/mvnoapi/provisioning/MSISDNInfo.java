/**
 * MSISDNInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.provisioning;

public class MSISDNInfo  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private java.lang.String blockedMSISDN;

    private java.lang.String imsi;

    private java.lang.String msisdn;

    private java.lang.String simNumber;

    private org.apache.axis.message.MessageElement [] _any;

    public MSISDNInfo() {
    }

    public MSISDNInfo(
           java.lang.String blockedMSISDN,
           java.lang.String imsi,
           java.lang.String msisdn,
           java.lang.String simNumber,
           org.apache.axis.message.MessageElement [] _any) {
           this.blockedMSISDN = blockedMSISDN;
           this.imsi = imsi;
           this.msisdn = msisdn;
           this.simNumber = simNumber;
           this._any = _any;
    }


    /**
     * Gets the blockedMSISDN value for this MSISDNInfo.
     * 
     * @return blockedMSISDN
     */
    public java.lang.String getBlockedMSISDN() {
        return blockedMSISDN;
    }


    /**
     * Sets the blockedMSISDN value for this MSISDNInfo.
     * 
     * @param blockedMSISDN
     */
    public void setBlockedMSISDN(java.lang.String blockedMSISDN) {
        this.blockedMSISDN = blockedMSISDN;
    }


    /**
     * Gets the imsi value for this MSISDNInfo.
     * 
     * @return imsi
     */
    public java.lang.String getImsi() {
        return imsi;
    }


    /**
     * Sets the imsi value for this MSISDNInfo.
     * 
     * @param imsi
     */
    public void setImsi(java.lang.String imsi) {
        this.imsi = imsi;
    }


    /**
     * Gets the msisdn value for this MSISDNInfo.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this MSISDNInfo.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the simNumber value for this MSISDNInfo.
     * 
     * @return simNumber
     */
    public java.lang.String getSimNumber() {
        return simNumber;
    }


    /**
     * Sets the simNumber value for this MSISDNInfo.
     * 
     * @param simNumber
     */
    public void setSimNumber(java.lang.String simNumber) {
        this.simNumber = simNumber;
    }


    /**
     * Gets the _any value for this MSISDNInfo.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this MSISDNInfo.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MSISDNInfo)) return false;
        MSISDNInfo other = (MSISDNInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blockedMSISDN==null && other.getBlockedMSISDN()==null) || 
             (this.blockedMSISDN!=null &&
              this.blockedMSISDN.equals(other.getBlockedMSISDN()))) &&
            ((this.imsi==null && other.getImsi()==null) || 
             (this.imsi!=null &&
              this.imsi.equals(other.getImsi()))) &&
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.simNumber==null && other.getSimNumber()==null) || 
             (this.simNumber!=null &&
              this.simNumber.equals(other.getSimNumber()))) &&
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
        if (getBlockedMSISDN() != null) {
            _hashCode += getBlockedMSISDN().hashCode();
        }
        if (getImsi() != null) {
            _hashCode += getImsi().hashCode();
        }
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getSimNumber() != null) {
            _hashCode += getSimNumber().hashCode();
        }
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
        new org.apache.axis.description.TypeDesc(MSISDNInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "MSISDNInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blockedMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "blockedMSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imsi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "imsi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("simNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "simNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
