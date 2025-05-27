/**
 * ChildAddAccType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.provisioning;

public class ChildAddAccType  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private java.lang.String mainLineMSISDN;

    private java.lang.String optGRPCredit;

    private java.lang.String optGrpBill;

    private org.apache.axis.message.MessageElement [] _any;

    public ChildAddAccType() {
    }

    public ChildAddAccType(
           java.lang.String mainLineMSISDN,
           java.lang.String optGRPCredit,
           java.lang.String optGrpBill,
           org.apache.axis.message.MessageElement [] _any) {
           this.mainLineMSISDN = mainLineMSISDN;
           this.optGRPCredit = optGRPCredit;
           this.optGrpBill = optGrpBill;
           this._any = _any;
    }


    /**
     * Gets the mainLineMSISDN value for this ChildAddAccType.
     * 
     * @return mainLineMSISDN
     */
    public java.lang.String getMainLineMSISDN() {
        return mainLineMSISDN;
    }


    /**
     * Sets the mainLineMSISDN value for this ChildAddAccType.
     * 
     * @param mainLineMSISDN
     */
    public void setMainLineMSISDN(java.lang.String mainLineMSISDN) {
        this.mainLineMSISDN = mainLineMSISDN;
    }


    /**
     * Gets the optGRPCredit value for this ChildAddAccType.
     * 
     * @return optGRPCredit
     */
    public java.lang.String getOptGRPCredit() {
        return optGRPCredit;
    }


    /**
     * Sets the optGRPCredit value for this ChildAddAccType.
     * 
     * @param optGRPCredit
     */
    public void setOptGRPCredit(java.lang.String optGRPCredit) {
        this.optGRPCredit = optGRPCredit;
    }


    /**
     * Gets the optGrpBill value for this ChildAddAccType.
     * 
     * @return optGrpBill
     */
    public java.lang.String getOptGrpBill() {
        return optGrpBill;
    }


    /**
     * Sets the optGrpBill value for this ChildAddAccType.
     * 
     * @param optGrpBill
     */
    public void setOptGrpBill(java.lang.String optGrpBill) {
        this.optGrpBill = optGrpBill;
    }


    /**
     * Gets the _any value for this ChildAddAccType.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this ChildAddAccType.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChildAddAccType)) return false;
        ChildAddAccType other = (ChildAddAccType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mainLineMSISDN==null && other.getMainLineMSISDN()==null) || 
             (this.mainLineMSISDN!=null &&
              this.mainLineMSISDN.equals(other.getMainLineMSISDN()))) &&
            ((this.optGRPCredit==null && other.getOptGRPCredit()==null) || 
             (this.optGRPCredit!=null &&
              this.optGRPCredit.equals(other.getOptGRPCredit()))) &&
            ((this.optGrpBill==null && other.getOptGrpBill()==null) || 
             (this.optGrpBill!=null &&
              this.optGrpBill.equals(other.getOptGrpBill()))) &&
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
        if (getMainLineMSISDN() != null) {
            _hashCode += getMainLineMSISDN().hashCode();
        }
        if (getOptGRPCredit() != null) {
            _hashCode += getOptGRPCredit().hashCode();
        }
        if (getOptGrpBill() != null) {
            _hashCode += getOptGrpBill().hashCode();
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
        new org.apache.axis.description.TypeDesc(ChildAddAccType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "childAddAccType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainLineMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "mainLineMSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optGRPCredit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "optGRPCredit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optGrpBill");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "optGrpBill"));
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
