/**
 * GetPostpaidGrpCountDetResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.CAManagement_xsd;

public class GetPostpaidGrpCountDetResponse  implements java.io.Serializable {
    private java.lang.Integer transStatus;

    private java.lang.String respCode;

    private java.lang.String respDescription;

    private java.lang.Long mainLineCount;

    private java.lang.Long subLineCount;

    private com.xius.billing.CAManagement_xsd.LineInfoType[] lineInfoList;

    public GetPostpaidGrpCountDetResponse() {
    }

    public GetPostpaidGrpCountDetResponse(
           java.lang.Integer transStatus,
           java.lang.String respCode,
           java.lang.String respDescription,
           java.lang.Long mainLineCount,
           java.lang.Long subLineCount,
           com.xius.billing.CAManagement_xsd.LineInfoType[] lineInfoList) {
           this.transStatus = transStatus;
           this.respCode = respCode;
           this.respDescription = respDescription;
           this.mainLineCount = mainLineCount;
           this.subLineCount = subLineCount;
           this.lineInfoList = lineInfoList;
    }


    /**
     * Gets the transStatus value for this GetPostpaidGrpCountDetResponse.
     * 
     * @return transStatus
     */
    public java.lang.Integer getTransStatus() {
        return transStatus;
    }


    /**
     * Sets the transStatus value for this GetPostpaidGrpCountDetResponse.
     * 
     * @param transStatus
     */
    public void setTransStatus(java.lang.Integer transStatus) {
        this.transStatus = transStatus;
    }


    /**
     * Gets the respCode value for this GetPostpaidGrpCountDetResponse.
     * 
     * @return respCode
     */
    public java.lang.String getRespCode() {
        return respCode;
    }


    /**
     * Sets the respCode value for this GetPostpaidGrpCountDetResponse.
     * 
     * @param respCode
     */
    public void setRespCode(java.lang.String respCode) {
        this.respCode = respCode;
    }


    /**
     * Gets the respDescription value for this GetPostpaidGrpCountDetResponse.
     * 
     * @return respDescription
     */
    public java.lang.String getRespDescription() {
        return respDescription;
    }


    /**
     * Sets the respDescription value for this GetPostpaidGrpCountDetResponse.
     * 
     * @param respDescription
     */
    public void setRespDescription(java.lang.String respDescription) {
        this.respDescription = respDescription;
    }


    /**
     * Gets the mainLineCount value for this GetPostpaidGrpCountDetResponse.
     * 
     * @return mainLineCount
     */
    public java.lang.Long getMainLineCount() {
        return mainLineCount;
    }


    /**
     * Sets the mainLineCount value for this GetPostpaidGrpCountDetResponse.
     * 
     * @param mainLineCount
     */
    public void setMainLineCount(java.lang.Long mainLineCount) {
        this.mainLineCount = mainLineCount;
    }


    /**
     * Gets the subLineCount value for this GetPostpaidGrpCountDetResponse.
     * 
     * @return subLineCount
     */
    public java.lang.Long getSubLineCount() {
        return subLineCount;
    }


    /**
     * Sets the subLineCount value for this GetPostpaidGrpCountDetResponse.
     * 
     * @param subLineCount
     */
    public void setSubLineCount(java.lang.Long subLineCount) {
        this.subLineCount = subLineCount;
    }


    /**
     * Gets the lineInfoList value for this GetPostpaidGrpCountDetResponse.
     * 
     * @return lineInfoList
     */
    public com.xius.billing.CAManagement_xsd.LineInfoType[] getLineInfoList() {
        return lineInfoList;
    }


    /**
     * Sets the lineInfoList value for this GetPostpaidGrpCountDetResponse.
     * 
     * @param lineInfoList
     */
    public void setLineInfoList(com.xius.billing.CAManagement_xsd.LineInfoType[] lineInfoList) {
        this.lineInfoList = lineInfoList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPostpaidGrpCountDetResponse)) return false;
        GetPostpaidGrpCountDetResponse other = (GetPostpaidGrpCountDetResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transStatus==null && other.getTransStatus()==null) || 
             (this.transStatus!=null &&
              this.transStatus.equals(other.getTransStatus()))) &&
            ((this.respCode==null && other.getRespCode()==null) || 
             (this.respCode!=null &&
              this.respCode.equals(other.getRespCode()))) &&
            ((this.respDescription==null && other.getRespDescription()==null) || 
             (this.respDescription!=null &&
              this.respDescription.equals(other.getRespDescription()))) &&
            ((this.mainLineCount==null && other.getMainLineCount()==null) || 
             (this.mainLineCount!=null &&
              this.mainLineCount.equals(other.getMainLineCount()))) &&
            ((this.subLineCount==null && other.getSubLineCount()==null) || 
             (this.subLineCount!=null &&
              this.subLineCount.equals(other.getSubLineCount()))) &&
            ((this.lineInfoList==null && other.getLineInfoList()==null) || 
             (this.lineInfoList!=null &&
              java.util.Arrays.equals(this.lineInfoList, other.getLineInfoList())));
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
        if (getTransStatus() != null) {
            _hashCode += getTransStatus().hashCode();
        }
        if (getRespCode() != null) {
            _hashCode += getRespCode().hashCode();
        }
        if (getRespDescription() != null) {
            _hashCode += getRespDescription().hashCode();
        }
        if (getMainLineCount() != null) {
            _hashCode += getMainLineCount().hashCode();
        }
        if (getSubLineCount() != null) {
            _hashCode += getSubLineCount().hashCode();
        }
        if (getLineInfoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLineInfoList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLineInfoList(), i);
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
        new org.apache.axis.description.TypeDesc(GetPostpaidGrpCountDetResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "getPostpaidGrpCountDetResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "transStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("respCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "respCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("respDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "respDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainLineCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "mainLineCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subLineCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "subLineCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "lineInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "LineInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "lineInfo"));
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
