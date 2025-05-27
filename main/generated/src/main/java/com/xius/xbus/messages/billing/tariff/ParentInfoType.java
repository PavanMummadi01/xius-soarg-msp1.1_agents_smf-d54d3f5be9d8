/**
 * ParentInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.tariff;

public class ParentInfoType  implements java.io.Serializable {
    /* Group Name */
    private java.lang.String groupName;

    /* Id for the pacakage */
    private long pkgID;

    /* Parent Msisdn */
    private long parntMsisdn;

    /* Attaching Childs */
    private com.xius.xbus.messages.billing.tariff.ChildAcctListsType[] childAccts;

    public ParentInfoType() {
    }

    public ParentInfoType(
           java.lang.String groupName,
           long pkgID,
           long parntMsisdn,
           com.xius.xbus.messages.billing.tariff.ChildAcctListsType[] childAccts) {
           this.groupName = groupName;
           this.pkgID = pkgID;
           this.parntMsisdn = parntMsisdn;
           this.childAccts = childAccts;
    }


    /**
     * Gets the groupName value for this ParentInfoType.
     * 
     * @return groupName   * Group Name
     */
    public java.lang.String getGroupName() {
        return groupName;
    }


    /**
     * Sets the groupName value for this ParentInfoType.
     * 
     * @param groupName   * Group Name
     */
    public void setGroupName(java.lang.String groupName) {
        this.groupName = groupName;
    }


    /**
     * Gets the pkgID value for this ParentInfoType.
     * 
     * @return pkgID   * Id for the pacakage
     */
    public long getPkgID() {
        return pkgID;
    }


    /**
     * Sets the pkgID value for this ParentInfoType.
     * 
     * @param pkgID   * Id for the pacakage
     */
    public void setPkgID(long pkgID) {
        this.pkgID = pkgID;
    }


    /**
     * Gets the parntMsisdn value for this ParentInfoType.
     * 
     * @return parntMsisdn   * Parent Msisdn
     */
    public long getParntMsisdn() {
        return parntMsisdn;
    }


    /**
     * Sets the parntMsisdn value for this ParentInfoType.
     * 
     * @param parntMsisdn   * Parent Msisdn
     */
    public void setParntMsisdn(long parntMsisdn) {
        this.parntMsisdn = parntMsisdn;
    }


    /**
     * Gets the childAccts value for this ParentInfoType.
     * 
     * @return childAccts   * Attaching Childs
     */
    public com.xius.xbus.messages.billing.tariff.ChildAcctListsType[] getChildAccts() {
        return childAccts;
    }


    /**
     * Sets the childAccts value for this ParentInfoType.
     * 
     * @param childAccts   * Attaching Childs
     */
    public void setChildAccts(com.xius.xbus.messages.billing.tariff.ChildAcctListsType[] childAccts) {
        this.childAccts = childAccts;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParentInfoType)) return false;
        ParentInfoType other = (ParentInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.groupName==null && other.getGroupName()==null) || 
             (this.groupName!=null &&
              this.groupName.equals(other.getGroupName()))) &&
            this.pkgID == other.getPkgID() &&
            this.parntMsisdn == other.getParntMsisdn() &&
            ((this.childAccts==null && other.getChildAccts()==null) || 
             (this.childAccts!=null &&
              java.util.Arrays.equals(this.childAccts, other.getChildAccts())));
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
        if (getGroupName() != null) {
            _hashCode += getGroupName().hashCode();
        }
        _hashCode += new Long(getPkgID()).hashCode();
        _hashCode += new Long(getParntMsisdn()).hashCode();
        if (getChildAccts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChildAccts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChildAccts(), i);
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
        new org.apache.axis.description.TypeDesc(ParentInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "ParentInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "groupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pkgID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "pkgID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parntMsisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "parntMsisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childAccts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "childAccts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "ChildAcctListsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "acctBalLists"));
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
