/**
 * GetChangeMSISDNChargesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.provisioning.device;

public class GetChangeMSISDNChargesResponse  extends com.xius.xbus.messages.common.WSResponse  implements java.io.Serializable {
    private java.lang.String oldMsisdn;

    private java.lang.Double genAmount;

    private java.lang.Double resAmount;

    private java.lang.Double curbalance;

    public GetChangeMSISDNChargesResponse() {
    }

    public GetChangeMSISDNChargesResponse(
           com.xius.xbus.messages.common.StatusCode statusCode,
           java.util.Calendar timeStamp,
           java.lang.String correlationID,
           com.xius.xbus.messages.common.ErrorData[] errors,
           java.lang.String version,
           java.lang.String oldMsisdn,
           java.lang.Double genAmount,
           java.lang.Double resAmount,
           java.lang.Double curbalance) {
        super(
            statusCode,
            timeStamp,
            correlationID,
            errors,
            version);
        this.oldMsisdn = oldMsisdn;
        this.genAmount = genAmount;
        this.resAmount = resAmount;
        this.curbalance = curbalance;
    }


    /**
     * Gets the oldMsisdn value for this GetChangeMSISDNChargesResponse.
     * 
     * @return oldMsisdn
     */
    public java.lang.String getOldMsisdn() {
        return oldMsisdn;
    }


    /**
     * Sets the oldMsisdn value for this GetChangeMSISDNChargesResponse.
     * 
     * @param oldMsisdn
     */
    public void setOldMsisdn(java.lang.String oldMsisdn) {
        this.oldMsisdn = oldMsisdn;
    }


    /**
     * Gets the genAmount value for this GetChangeMSISDNChargesResponse.
     * 
     * @return genAmount
     */
    public java.lang.Double getGenAmount() {
        return genAmount;
    }


    /**
     * Sets the genAmount value for this GetChangeMSISDNChargesResponse.
     * 
     * @param genAmount
     */
    public void setGenAmount(java.lang.Double genAmount) {
        this.genAmount = genAmount;
    }


    /**
     * Gets the resAmount value for this GetChangeMSISDNChargesResponse.
     * 
     * @return resAmount
     */
    public java.lang.Double getResAmount() {
        return resAmount;
    }


    /**
     * Sets the resAmount value for this GetChangeMSISDNChargesResponse.
     * 
     * @param resAmount
     */
    public void setResAmount(java.lang.Double resAmount) {
        this.resAmount = resAmount;
    }


    /**
     * Gets the curbalance value for this GetChangeMSISDNChargesResponse.
     * 
     * @return curbalance
     */
    public java.lang.Double getCurbalance() {
        return curbalance;
    }


    /**
     * Sets the curbalance value for this GetChangeMSISDNChargesResponse.
     * 
     * @param curbalance
     */
    public void setCurbalance(java.lang.Double curbalance) {
        this.curbalance = curbalance;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetChangeMSISDNChargesResponse)) return false;
        GetChangeMSISDNChargesResponse other = (GetChangeMSISDNChargesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.oldMsisdn==null && other.getOldMsisdn()==null) || 
             (this.oldMsisdn!=null &&
              this.oldMsisdn.equals(other.getOldMsisdn()))) &&
            ((this.genAmount==null && other.getGenAmount()==null) || 
             (this.genAmount!=null &&
              this.genAmount.equals(other.getGenAmount()))) &&
            ((this.resAmount==null && other.getResAmount()==null) || 
             (this.resAmount!=null &&
              this.resAmount.equals(other.getResAmount()))) &&
            ((this.curbalance==null && other.getCurbalance()==null) || 
             (this.curbalance!=null &&
              this.curbalance.equals(other.getCurbalance())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getOldMsisdn() != null) {
            _hashCode += getOldMsisdn().hashCode();
        }
        if (getGenAmount() != null) {
            _hashCode += getGenAmount().hashCode();
        }
        if (getResAmount() != null) {
            _hashCode += getResAmount().hashCode();
        }
        if (getCurbalance() != null) {
            _hashCode += getCurbalance().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetChangeMSISDNChargesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", ">getChangeMSISDNChargesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldMsisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "oldMsisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("genAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "genAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "resAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("curbalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "curbalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
