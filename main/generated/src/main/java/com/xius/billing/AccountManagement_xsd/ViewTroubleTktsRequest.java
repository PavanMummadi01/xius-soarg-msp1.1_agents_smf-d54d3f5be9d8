/**
 * ViewTroubleTktsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class ViewTroubleTktsRequest  implements java.io.Serializable {
    private java.lang.Long acctId;

    private java.lang.Long msisdn;

    private java.lang.Long tktNum;

    private int maxTkts;

    private int rowCount;

    public ViewTroubleTktsRequest() {
    }

    public ViewTroubleTktsRequest(
           java.lang.Long acctId,
           java.lang.Long msisdn,
           java.lang.Long tktNum,
           int maxTkts,
           int rowCount) {
           this.acctId = acctId;
           this.msisdn = msisdn;
           this.tktNum = tktNum;
           this.maxTkts = maxTkts;
           this.rowCount = rowCount;
    }


    /**
     * Gets the acctId value for this ViewTroubleTktsRequest.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this ViewTroubleTktsRequest.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the msisdn value for this ViewTroubleTktsRequest.
     * 
     * @return msisdn
     */
    public java.lang.Long getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this ViewTroubleTktsRequest.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.Long msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the tktNum value for this ViewTroubleTktsRequest.
     * 
     * @return tktNum
     */
    public java.lang.Long getTktNum() {
        return tktNum;
    }


    /**
     * Sets the tktNum value for this ViewTroubleTktsRequest.
     * 
     * @param tktNum
     */
    public void setTktNum(java.lang.Long tktNum) {
        this.tktNum = tktNum;
    }


    /**
     * Gets the maxTkts value for this ViewTroubleTktsRequest.
     * 
     * @return maxTkts
     */
    public int getMaxTkts() {
        return maxTkts;
    }


    /**
     * Sets the maxTkts value for this ViewTroubleTktsRequest.
     * 
     * @param maxTkts
     */
    public void setMaxTkts(int maxTkts) {
        this.maxTkts = maxTkts;
    }


    /**
     * Gets the rowCount value for this ViewTroubleTktsRequest.
     * 
     * @return rowCount
     */
    public int getRowCount() {
        return rowCount;
    }


    /**
     * Sets the rowCount value for this ViewTroubleTktsRequest.
     * 
     * @param rowCount
     */
    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ViewTroubleTktsRequest)) return false;
        ViewTroubleTktsRequest other = (ViewTroubleTktsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.tktNum==null && other.getTktNum()==null) || 
             (this.tktNum!=null &&
              this.tktNum.equals(other.getTktNum()))) &&
            this.maxTkts == other.getMaxTkts() &&
            this.rowCount == other.getRowCount();
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
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getTktNum() != null) {
            _hashCode += getTktNum().hashCode();
        }
        _hashCode += getMaxTkts();
        _hashCode += getRowCount();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ViewTroubleTktsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ViewTroubleTktsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "acctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tktNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "tktNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxTkts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "maxTkts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "rowCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
