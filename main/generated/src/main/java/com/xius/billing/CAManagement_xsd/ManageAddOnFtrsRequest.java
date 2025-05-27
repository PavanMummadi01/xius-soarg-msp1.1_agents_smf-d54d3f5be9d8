/**
 * ManageAddOnFtrsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.CAManagement_xsd;

public class ManageAddOnFtrsRequest  implements java.io.Serializable {
    private com.xius.billing.CAManagement_xsd.OptionFlagType actionFlag;

    private com.xius.billing.CAManagement_xsd.AddOnFtrsDataType[] addOnFtrsList;

    public ManageAddOnFtrsRequest() {
    }

    public ManageAddOnFtrsRequest(
           com.xius.billing.CAManagement_xsd.OptionFlagType actionFlag,
           com.xius.billing.CAManagement_xsd.AddOnFtrsDataType[] addOnFtrsList) {
           this.actionFlag = actionFlag;
           this.addOnFtrsList = addOnFtrsList;
    }


    /**
     * Gets the actionFlag value for this ManageAddOnFtrsRequest.
     * 
     * @return actionFlag
     */
    public com.xius.billing.CAManagement_xsd.OptionFlagType getActionFlag() {
        return actionFlag;
    }


    /**
     * Sets the actionFlag value for this ManageAddOnFtrsRequest.
     * 
     * @param actionFlag
     */
    public void setActionFlag(com.xius.billing.CAManagement_xsd.OptionFlagType actionFlag) {
        this.actionFlag = actionFlag;
    }


    /**
     * Gets the addOnFtrsList value for this ManageAddOnFtrsRequest.
     * 
     * @return addOnFtrsList
     */
    public com.xius.billing.CAManagement_xsd.AddOnFtrsDataType[] getAddOnFtrsList() {
        return addOnFtrsList;
    }


    /**
     * Sets the addOnFtrsList value for this ManageAddOnFtrsRequest.
     * 
     * @param addOnFtrsList
     */
    public void setAddOnFtrsList(com.xius.billing.CAManagement_xsd.AddOnFtrsDataType[] addOnFtrsList) {
        this.addOnFtrsList = addOnFtrsList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManageAddOnFtrsRequest)) return false;
        ManageAddOnFtrsRequest other = (ManageAddOnFtrsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.actionFlag==null && other.getActionFlag()==null) || 
             (this.actionFlag!=null &&
              this.actionFlag.equals(other.getActionFlag()))) &&
            ((this.addOnFtrsList==null && other.getAddOnFtrsList()==null) || 
             (this.addOnFtrsList!=null &&
              java.util.Arrays.equals(this.addOnFtrsList, other.getAddOnFtrsList())));
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
        if (getActionFlag() != null) {
            _hashCode += getActionFlag().hashCode();
        }
        if (getAddOnFtrsList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddOnFtrsList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddOnFtrsList(), i);
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
        new org.apache.axis.description.TypeDesc(ManageAddOnFtrsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "ManageAddOnFtrsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "actionFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "OptionFlagType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addOnFtrsList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "addOnFtrsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "AddOnFtrsDataType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "AddOnFeatures"));
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
