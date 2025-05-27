/**
 * DataDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.ProductManagement_xsd;

public class DataDetailsType  implements java.io.Serializable {
    private java.lang.String dataMB;

    private java.lang.String dataAmt;

    private java.lang.String ratingGrp;

    public DataDetailsType() {
    }

    public DataDetailsType(
           java.lang.String dataMB,
           java.lang.String dataAmt,
           java.lang.String ratingGrp) {
           this.dataMB = dataMB;
           this.dataAmt = dataAmt;
           this.ratingGrp = ratingGrp;
    }


    /**
     * Gets the dataMB value for this DataDetailsType.
     * 
     * @return dataMB
     */
    public java.lang.String getDataMB() {
        return dataMB;
    }


    /**
     * Sets the dataMB value for this DataDetailsType.
     * 
     * @param dataMB
     */
    public void setDataMB(java.lang.String dataMB) {
        this.dataMB = dataMB;
    }


    /**
     * Gets the dataAmt value for this DataDetailsType.
     * 
     * @return dataAmt
     */
    public java.lang.String getDataAmt() {
        return dataAmt;
    }


    /**
     * Sets the dataAmt value for this DataDetailsType.
     * 
     * @param dataAmt
     */
    public void setDataAmt(java.lang.String dataAmt) {
        this.dataAmt = dataAmt;
    }


    /**
     * Gets the ratingGrp value for this DataDetailsType.
     * 
     * @return ratingGrp
     */
    public java.lang.String getRatingGrp() {
        return ratingGrp;
    }


    /**
     * Sets the ratingGrp value for this DataDetailsType.
     * 
     * @param ratingGrp
     */
    public void setRatingGrp(java.lang.String ratingGrp) {
        this.ratingGrp = ratingGrp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DataDetailsType)) return false;
        DataDetailsType other = (DataDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dataMB==null && other.getDataMB()==null) || 
             (this.dataMB!=null &&
              this.dataMB.equals(other.getDataMB()))) &&
            ((this.dataAmt==null && other.getDataAmt()==null) || 
             (this.dataAmt!=null &&
              this.dataAmt.equals(other.getDataAmt()))) &&
            ((this.ratingGrp==null && other.getRatingGrp()==null) || 
             (this.ratingGrp!=null &&
              this.ratingGrp.equals(other.getRatingGrp())));
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
        if (getDataMB() != null) {
            _hashCode += getDataMB().hashCode();
        }
        if (getDataAmt() != null) {
            _hashCode += getDataAmt().hashCode();
        }
        if (getRatingGrp() != null) {
            _hashCode += getRatingGrp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DataDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "dataDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataMB");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "dataMB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "dataAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ratingGrp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "ratingGrp"));
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
