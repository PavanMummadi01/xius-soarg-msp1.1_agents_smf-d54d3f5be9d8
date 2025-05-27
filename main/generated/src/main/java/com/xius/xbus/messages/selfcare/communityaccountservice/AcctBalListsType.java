/**
 * AcctBalListsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.selfcare.communityaccountservice;

public class AcctBalListsType  implements java.io.Serializable {
    private java.lang.String msisdn;

    private java.lang.String useParntCaBal;

    private java.lang.String useParntCoreBal;

    private int allowedBalType;

    private com.xius.xbus.messages.selfcare.communityaccountservice.ServiceUnitType[] serviceUnits;

    private com.xius.xbus.messages.selfcare.communityaccountservice.ChildLmtItemType[] acctLmts;

    private java.lang.String[] deviceGrpIds;

    private java.lang.String[] zoneGrpIds;

    private java.lang.String useParntBktBal;

    private java.lang.String useOwnBktBal;

    public AcctBalListsType() {
    }

    public AcctBalListsType(
           java.lang.String msisdn,
           java.lang.String useParntCaBal,
           java.lang.String useParntCoreBal,
           int allowedBalType,
           com.xius.xbus.messages.selfcare.communityaccountservice.ServiceUnitType[] serviceUnits,
           com.xius.xbus.messages.selfcare.communityaccountservice.ChildLmtItemType[] acctLmts,
           java.lang.String[] deviceGrpIds,
           java.lang.String[] zoneGrpIds,
           java.lang.String useParntBktBal,
           java.lang.String useOwnBktBal) {
           this.msisdn = msisdn;
           this.useParntCaBal = useParntCaBal;
           this.useParntCoreBal = useParntCoreBal;
           this.allowedBalType = allowedBalType;
           this.serviceUnits = serviceUnits;
           this.acctLmts = acctLmts;
           this.deviceGrpIds = deviceGrpIds;
           this.zoneGrpIds = zoneGrpIds;
           this.useParntBktBal = useParntBktBal;
           this.useOwnBktBal = useOwnBktBal;
    }


    /**
     * Gets the msisdn value for this AcctBalListsType.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this AcctBalListsType.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the useParntCaBal value for this AcctBalListsType.
     * 
     * @return useParntCaBal
     */
    public java.lang.String getUseParntCaBal() {
        return useParntCaBal;
    }


    /**
     * Sets the useParntCaBal value for this AcctBalListsType.
     * 
     * @param useParntCaBal
     */
    public void setUseParntCaBal(java.lang.String useParntCaBal) {
        this.useParntCaBal = useParntCaBal;
    }


    /**
     * Gets the useParntCoreBal value for this AcctBalListsType.
     * 
     * @return useParntCoreBal
     */
    public java.lang.String getUseParntCoreBal() {
        return useParntCoreBal;
    }


    /**
     * Sets the useParntCoreBal value for this AcctBalListsType.
     * 
     * @param useParntCoreBal
     */
    public void setUseParntCoreBal(java.lang.String useParntCoreBal) {
        this.useParntCoreBal = useParntCoreBal;
    }


    /**
     * Gets the allowedBalType value for this AcctBalListsType.
     * 
     * @return allowedBalType
     */
    public int getAllowedBalType() {
        return allowedBalType;
    }


    /**
     * Sets the allowedBalType value for this AcctBalListsType.
     * 
     * @param allowedBalType
     */
    public void setAllowedBalType(int allowedBalType) {
        this.allowedBalType = allowedBalType;
    }


    /**
     * Gets the serviceUnits value for this AcctBalListsType.
     * 
     * @return serviceUnits
     */
    public com.xius.xbus.messages.selfcare.communityaccountservice.ServiceUnitType[] getServiceUnits() {
        return serviceUnits;
    }


    /**
     * Sets the serviceUnits value for this AcctBalListsType.
     * 
     * @param serviceUnits
     */
    public void setServiceUnits(com.xius.xbus.messages.selfcare.communityaccountservice.ServiceUnitType[] serviceUnits) {
        this.serviceUnits = serviceUnits;
    }


    /**
     * Gets the acctLmts value for this AcctBalListsType.
     * 
     * @return acctLmts
     */
    public com.xius.xbus.messages.selfcare.communityaccountservice.ChildLmtItemType[] getAcctLmts() {
        return acctLmts;
    }


    /**
     * Sets the acctLmts value for this AcctBalListsType.
     * 
     * @param acctLmts
     */
    public void setAcctLmts(com.xius.xbus.messages.selfcare.communityaccountservice.ChildLmtItemType[] acctLmts) {
        this.acctLmts = acctLmts;
    }


    /**
     * Gets the deviceGrpIds value for this AcctBalListsType.
     * 
     * @return deviceGrpIds
     */
    public java.lang.String[] getDeviceGrpIds() {
        return deviceGrpIds;
    }


    /**
     * Sets the deviceGrpIds value for this AcctBalListsType.
     * 
     * @param deviceGrpIds
     */
    public void setDeviceGrpIds(java.lang.String[] deviceGrpIds) {
        this.deviceGrpIds = deviceGrpIds;
    }

    public java.lang.String getDeviceGrpIds(int i) {
        return this.deviceGrpIds[i];
    }

    public void setDeviceGrpIds(int i, java.lang.String _value) {
        this.deviceGrpIds[i] = _value;
    }


    /**
     * Gets the zoneGrpIds value for this AcctBalListsType.
     * 
     * @return zoneGrpIds
     */
    public java.lang.String[] getZoneGrpIds() {
        return zoneGrpIds;
    }


    /**
     * Sets the zoneGrpIds value for this AcctBalListsType.
     * 
     * @param zoneGrpIds
     */
    public void setZoneGrpIds(java.lang.String[] zoneGrpIds) {
        this.zoneGrpIds = zoneGrpIds;
    }

    public java.lang.String getZoneGrpIds(int i) {
        return this.zoneGrpIds[i];
    }

    public void setZoneGrpIds(int i, java.lang.String _value) {
        this.zoneGrpIds[i] = _value;
    }


    /**
     * Gets the useParntBktBal value for this AcctBalListsType.
     * 
     * @return useParntBktBal
     */
    public java.lang.String getUseParntBktBal() {
        return useParntBktBal;
    }


    /**
     * Sets the useParntBktBal value for this AcctBalListsType.
     * 
     * @param useParntBktBal
     */
    public void setUseParntBktBal(java.lang.String useParntBktBal) {
        this.useParntBktBal = useParntBktBal;
    }


    /**
     * Gets the useOwnBktBal value for this AcctBalListsType.
     * 
     * @return useOwnBktBal
     */
    public java.lang.String getUseOwnBktBal() {
        return useOwnBktBal;
    }


    /**
     * Sets the useOwnBktBal value for this AcctBalListsType.
     * 
     * @param useOwnBktBal
     */
    public void setUseOwnBktBal(java.lang.String useOwnBktBal) {
        this.useOwnBktBal = useOwnBktBal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AcctBalListsType)) return false;
        AcctBalListsType other = (AcctBalListsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.useParntCaBal==null && other.getUseParntCaBal()==null) || 
             (this.useParntCaBal!=null &&
              this.useParntCaBal.equals(other.getUseParntCaBal()))) &&
            ((this.useParntCoreBal==null && other.getUseParntCoreBal()==null) || 
             (this.useParntCoreBal!=null &&
              this.useParntCoreBal.equals(other.getUseParntCoreBal()))) &&
            this.allowedBalType == other.getAllowedBalType() &&
            ((this.serviceUnits==null && other.getServiceUnits()==null) || 
             (this.serviceUnits!=null &&
              java.util.Arrays.equals(this.serviceUnits, other.getServiceUnits()))) &&
            ((this.acctLmts==null && other.getAcctLmts()==null) || 
             (this.acctLmts!=null &&
              java.util.Arrays.equals(this.acctLmts, other.getAcctLmts()))) &&
            ((this.deviceGrpIds==null && other.getDeviceGrpIds()==null) || 
             (this.deviceGrpIds!=null &&
              java.util.Arrays.equals(this.deviceGrpIds, other.getDeviceGrpIds()))) &&
            ((this.zoneGrpIds==null && other.getZoneGrpIds()==null) || 
             (this.zoneGrpIds!=null &&
              java.util.Arrays.equals(this.zoneGrpIds, other.getZoneGrpIds()))) &&
            ((this.useParntBktBal==null && other.getUseParntBktBal()==null) || 
             (this.useParntBktBal!=null &&
              this.useParntBktBal.equals(other.getUseParntBktBal()))) &&
            ((this.useOwnBktBal==null && other.getUseOwnBktBal()==null) || 
             (this.useOwnBktBal!=null &&
              this.useOwnBktBal.equals(other.getUseOwnBktBal())));
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
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getUseParntCaBal() != null) {
            _hashCode += getUseParntCaBal().hashCode();
        }
        if (getUseParntCoreBal() != null) {
            _hashCode += getUseParntCoreBal().hashCode();
        }
        _hashCode += getAllowedBalType();
        if (getServiceUnits() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServiceUnits());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServiceUnits(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAcctLmts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAcctLmts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAcctLmts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeviceGrpIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeviceGrpIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeviceGrpIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getZoneGrpIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getZoneGrpIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getZoneGrpIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUseParntBktBal() != null) {
            _hashCode += getUseParntBktBal().hashCode();
        }
        if (getUseOwnBktBal() != null) {
            _hashCode += getUseOwnBktBal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AcctBalListsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "AcctBalListsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useParntCaBal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "useParntCaBal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useParntCoreBal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "useParntCoreBal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowedBalType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "allowedBalType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "serviceUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "ServiceUnitType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "unit"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctLmts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "acctLmts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "ChildLmtItemType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "childLmt"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceGrpIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "deviceGrpIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zoneGrpIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "zoneGrpIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useParntBktBal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "useParntBktBal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useOwnBktBal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "useOwnBktBal"));
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
