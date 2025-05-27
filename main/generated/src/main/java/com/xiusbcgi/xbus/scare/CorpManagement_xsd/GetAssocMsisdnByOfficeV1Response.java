/**
 * GetAssocMsisdnByOfficeV1Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xiusbcgi.xbus.scare.CorpManagement_xsd;

public class GetAssocMsisdnByOfficeV1Response  implements java.io.Serializable {
    private com.xiusbcgi.xbus.scare.CorpManagement_xsd.OfficeMSISDNInfo[] officeMSISDNInfoList;

    private java.lang.Long totalRecords;

    private java.lang.Integer rowIndex;

    public GetAssocMsisdnByOfficeV1Response() {
    }

    public GetAssocMsisdnByOfficeV1Response(
           com.xiusbcgi.xbus.scare.CorpManagement_xsd.OfficeMSISDNInfo[] officeMSISDNInfoList,
           java.lang.Long totalRecords,
           java.lang.Integer rowIndex) {
           this.officeMSISDNInfoList = officeMSISDNInfoList;
           this.totalRecords = totalRecords;
           this.rowIndex = rowIndex;
    }


    /**
     * Gets the officeMSISDNInfoList value for this GetAssocMsisdnByOfficeV1Response.
     * 
     * @return officeMSISDNInfoList
     */
    public com.xiusbcgi.xbus.scare.CorpManagement_xsd.OfficeMSISDNInfo[] getOfficeMSISDNInfoList() {
        return officeMSISDNInfoList;
    }


    /**
     * Sets the officeMSISDNInfoList value for this GetAssocMsisdnByOfficeV1Response.
     * 
     * @param officeMSISDNInfoList
     */
    public void setOfficeMSISDNInfoList(com.xiusbcgi.xbus.scare.CorpManagement_xsd.OfficeMSISDNInfo[] officeMSISDNInfoList) {
        this.officeMSISDNInfoList = officeMSISDNInfoList;
    }


    /**
     * Gets the totalRecords value for this GetAssocMsisdnByOfficeV1Response.
     * 
     * @return totalRecords
     */
    public java.lang.Long getTotalRecords() {
        return totalRecords;
    }


    /**
     * Sets the totalRecords value for this GetAssocMsisdnByOfficeV1Response.
     * 
     * @param totalRecords
     */
    public void setTotalRecords(java.lang.Long totalRecords) {
        this.totalRecords = totalRecords;
    }


    /**
     * Gets the rowIndex value for this GetAssocMsisdnByOfficeV1Response.
     * 
     * @return rowIndex
     */
    public java.lang.Integer getRowIndex() {
        return rowIndex;
    }


    /**
     * Sets the rowIndex value for this GetAssocMsisdnByOfficeV1Response.
     * 
     * @param rowIndex
     */
    public void setRowIndex(java.lang.Integer rowIndex) {
        this.rowIndex = rowIndex;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAssocMsisdnByOfficeV1Response)) return false;
        GetAssocMsisdnByOfficeV1Response other = (GetAssocMsisdnByOfficeV1Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.officeMSISDNInfoList==null && other.getOfficeMSISDNInfoList()==null) || 
             (this.officeMSISDNInfoList!=null &&
              java.util.Arrays.equals(this.officeMSISDNInfoList, other.getOfficeMSISDNInfoList()))) &&
            ((this.totalRecords==null && other.getTotalRecords()==null) || 
             (this.totalRecords!=null &&
              this.totalRecords.equals(other.getTotalRecords()))) &&
            ((this.rowIndex==null && other.getRowIndex()==null) || 
             (this.rowIndex!=null &&
              this.rowIndex.equals(other.getRowIndex())));
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
        if (getOfficeMSISDNInfoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOfficeMSISDNInfoList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOfficeMSISDNInfoList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTotalRecords() != null) {
            _hashCode += getTotalRecords().hashCode();
        }
        if (getRowIndex() != null) {
            _hashCode += getRowIndex().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAssocMsisdnByOfficeV1Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "GetAssocMsisdnByOfficeV1Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officeMSISDNInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "officeMSISDNInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "OfficeMSISDNInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "officeMSISDNInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalRecords");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "totalRecords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "rowIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
