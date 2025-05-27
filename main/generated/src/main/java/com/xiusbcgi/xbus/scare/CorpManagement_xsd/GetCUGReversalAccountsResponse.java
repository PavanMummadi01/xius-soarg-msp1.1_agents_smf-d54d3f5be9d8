/**
 * GetCUGReversalAccountsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xiusbcgi.xbus.scare.CorpManagement_xsd;

public class GetCUGReversalAccountsResponse  implements java.io.Serializable {
    private com.xiusbcgi.xbus.scare.CorpManagement_xsd.CUGRvrslInfoType[] CUGRvrslInfoList;

    private java.lang.Long totalRecords;

    private java.lang.Integer rowIndex;

    public GetCUGReversalAccountsResponse() {
    }

    public GetCUGReversalAccountsResponse(
           com.xiusbcgi.xbus.scare.CorpManagement_xsd.CUGRvrslInfoType[] CUGRvrslInfoList,
           java.lang.Long totalRecords,
           java.lang.Integer rowIndex) {
           this.CUGRvrslInfoList = CUGRvrslInfoList;
           this.totalRecords = totalRecords;
           this.rowIndex = rowIndex;
    }


    /**
     * Gets the CUGRvrslInfoList value for this GetCUGReversalAccountsResponse.
     * 
     * @return CUGRvrslInfoList
     */
    public com.xiusbcgi.xbus.scare.CorpManagement_xsd.CUGRvrslInfoType[] getCUGRvrslInfoList() {
        return CUGRvrslInfoList;
    }


    /**
     * Sets the CUGRvrslInfoList value for this GetCUGReversalAccountsResponse.
     * 
     * @param CUGRvrslInfoList
     */
    public void setCUGRvrslInfoList(com.xiusbcgi.xbus.scare.CorpManagement_xsd.CUGRvrslInfoType[] CUGRvrslInfoList) {
        this.CUGRvrslInfoList = CUGRvrslInfoList;
    }


    /**
     * Gets the totalRecords value for this GetCUGReversalAccountsResponse.
     * 
     * @return totalRecords
     */
    public java.lang.Long getTotalRecords() {
        return totalRecords;
    }


    /**
     * Sets the totalRecords value for this GetCUGReversalAccountsResponse.
     * 
     * @param totalRecords
     */
    public void setTotalRecords(java.lang.Long totalRecords) {
        this.totalRecords = totalRecords;
    }


    /**
     * Gets the rowIndex value for this GetCUGReversalAccountsResponse.
     * 
     * @return rowIndex
     */
    public java.lang.Integer getRowIndex() {
        return rowIndex;
    }


    /**
     * Sets the rowIndex value for this GetCUGReversalAccountsResponse.
     * 
     * @param rowIndex
     */
    public void setRowIndex(java.lang.Integer rowIndex) {
        this.rowIndex = rowIndex;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCUGReversalAccountsResponse)) return false;
        GetCUGReversalAccountsResponse other = (GetCUGReversalAccountsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CUGRvrslInfoList==null && other.getCUGRvrslInfoList()==null) || 
             (this.CUGRvrslInfoList!=null &&
              java.util.Arrays.equals(this.CUGRvrslInfoList, other.getCUGRvrslInfoList()))) &&
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
        if (getCUGRvrslInfoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCUGRvrslInfoList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCUGRvrslInfoList(), i);
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
        new org.apache.axis.description.TypeDesc(GetCUGReversalAccountsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "GetCUGReversalAccountsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CUGRvrslInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "CUGRvrslInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "CUGRvrslInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "CUGRvrslInfo"));
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
