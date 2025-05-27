/**
 * AcctBalDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.CAManagement_xsd;

public class AcctBalDetailsType  implements java.io.Serializable {
    private java.lang.String msisdn;

    private java.lang.String useParntCaBal;

    private java.lang.String useParntCoreBal;

    private int allowedBalType;

    private com.xius.billing.CAManagement_xsd.SrvcUnitsItemType[] srvcUnits;

    private com.xius.billing.CAManagement_xsd.ChildLimitItemType[] acctLimits;

    private java.lang.String[] deviceGrpIds;

    private java.lang.String[] zoneGrpIds;

    private java.lang.String useParentBktBalance;

    private java.lang.String useOwnBktBalance;

    public AcctBalDetailsType() {
    }

    public AcctBalDetailsType(
           java.lang.String msisdn,
           java.lang.String useParntCaBal,
           java.lang.String useParntCoreBal,
           int allowedBalType,
           com.xius.billing.CAManagement_xsd.SrvcUnitsItemType[] srvcUnits,
           com.xius.billing.CAManagement_xsd.ChildLimitItemType[] acctLimits,
           java.lang.String[] deviceGrpIds,
           java.lang.String[] zoneGrpIds,
           java.lang.String useParentBktBalance,
           java.lang.String useOwnBktBalance) {
           this.msisdn = msisdn;
           this.useParntCaBal = useParntCaBal;
           this.useParntCoreBal = useParntCoreBal;
           this.allowedBalType = allowedBalType;
           this.srvcUnits = srvcUnits;
           this.acctLimits = acctLimits;
           this.deviceGrpIds = deviceGrpIds;
           this.zoneGrpIds = zoneGrpIds;
           this.useParentBktBalance = useParentBktBalance;
           this.useOwnBktBalance = useOwnBktBalance;
    }


    /**
     * Gets the msisdn value for this AcctBalDetailsType.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this AcctBalDetailsType.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the useParntCaBal value for this AcctBalDetailsType.
     * 
     * @return useParntCaBal
     */
    public java.lang.String getUseParntCaBal() {
        return useParntCaBal;
    }


    /**
     * Sets the useParntCaBal value for this AcctBalDetailsType.
     * 
     * @param useParntCaBal
     */
    public void setUseParntCaBal(java.lang.String useParntCaBal) {
        this.useParntCaBal = useParntCaBal;
    }


    /**
     * Gets the useParntCoreBal value for this AcctBalDetailsType.
     * 
     * @return useParntCoreBal
     */
    public java.lang.String getUseParntCoreBal() {
        return useParntCoreBal;
    }


    /**
     * Sets the useParntCoreBal value for this AcctBalDetailsType.
     * 
     * @param useParntCoreBal
     */
    public void setUseParntCoreBal(java.lang.String useParntCoreBal) {
        this.useParntCoreBal = useParntCoreBal;
    }


    /**
     * Gets the allowedBalType value for this AcctBalDetailsType.
     * 
     * @return allowedBalType
     */
    public int getAllowedBalType() {
        return allowedBalType;
    }


    /**
     * Sets the allowedBalType value for this AcctBalDetailsType.
     * 
     * @param allowedBalType
     */
    public void setAllowedBalType(int allowedBalType) {
        this.allowedBalType = allowedBalType;
    }


    /**
     * Gets the srvcUnits value for this AcctBalDetailsType.
     * 
     * @return srvcUnits
     */
    public com.xius.billing.CAManagement_xsd.SrvcUnitsItemType[] getSrvcUnits() {
        return srvcUnits;
    }


    /**
     * Sets the srvcUnits value for this AcctBalDetailsType.
     * 
     * @param srvcUnits
     */
    public void setSrvcUnits(com.xius.billing.CAManagement_xsd.SrvcUnitsItemType[] srvcUnits) {
        this.srvcUnits = srvcUnits;
    }


    /**
     * Gets the acctLimits value for this AcctBalDetailsType.
     * 
     * @return acctLimits
     */
    public com.xius.billing.CAManagement_xsd.ChildLimitItemType[] getAcctLimits() {
        return acctLimits;
    }


    /**
     * Sets the acctLimits value for this AcctBalDetailsType.
     * 
     * @param acctLimits
     */
    public void setAcctLimits(com.xius.billing.CAManagement_xsd.ChildLimitItemType[] acctLimits) {
        this.acctLimits = acctLimits;
    }


    /**
     * Gets the deviceGrpIds value for this AcctBalDetailsType.
     * 
     * @return deviceGrpIds
     */
    public java.lang.String[] getDeviceGrpIds() {
        return deviceGrpIds;
    }


    /**
     * Sets the deviceGrpIds value for this AcctBalDetailsType.
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
     * Gets the zoneGrpIds value for this AcctBalDetailsType.
     * 
     * @return zoneGrpIds
     */
    public java.lang.String[] getZoneGrpIds() {
        return zoneGrpIds;
    }


    /**
     * Sets the zoneGrpIds value for this AcctBalDetailsType.
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
     * Gets the useParentBktBalance value for this AcctBalDetailsType.
     * 
     * @return useParentBktBalance
     */
    public java.lang.String getUseParentBktBalance() {
        return useParentBktBalance;
    }


    /**
     * Sets the useParentBktBalance value for this AcctBalDetailsType.
     * 
     * @param useParentBktBalance
     */
    public void setUseParentBktBalance(java.lang.String useParentBktBalance) {
        this.useParentBktBalance = useParentBktBalance;
    }


    /**
     * Gets the useOwnBktBalance value for this AcctBalDetailsType.
     * 
     * @return useOwnBktBalance
     */
    public java.lang.String getUseOwnBktBalance() {
        return useOwnBktBalance;
    }


    /**
     * Sets the useOwnBktBalance value for this AcctBalDetailsType.
     * 
     * @param useOwnBktBalance
     */
    public void setUseOwnBktBalance(java.lang.String useOwnBktBalance) {
        this.useOwnBktBalance = useOwnBktBalance;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AcctBalDetailsType)) return false;
        AcctBalDetailsType other = (AcctBalDetailsType) obj;
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
            ((this.srvcUnits==null && other.getSrvcUnits()==null) || 
             (this.srvcUnits!=null &&
              java.util.Arrays.equals(this.srvcUnits, other.getSrvcUnits()))) &&
            ((this.acctLimits==null && other.getAcctLimits()==null) || 
             (this.acctLimits!=null &&
              java.util.Arrays.equals(this.acctLimits, other.getAcctLimits()))) &&
            ((this.deviceGrpIds==null && other.getDeviceGrpIds()==null) || 
             (this.deviceGrpIds!=null &&
              java.util.Arrays.equals(this.deviceGrpIds, other.getDeviceGrpIds()))) &&
            ((this.zoneGrpIds==null && other.getZoneGrpIds()==null) || 
             (this.zoneGrpIds!=null &&
              java.util.Arrays.equals(this.zoneGrpIds, other.getZoneGrpIds()))) &&
            ((this.useParentBktBalance==null && other.getUseParentBktBalance()==null) || 
             (this.useParentBktBalance!=null &&
              this.useParentBktBalance.equals(other.getUseParentBktBalance()))) &&
            ((this.useOwnBktBalance==null && other.getUseOwnBktBalance()==null) || 
             (this.useOwnBktBalance!=null &&
              this.useOwnBktBalance.equals(other.getUseOwnBktBalance())));
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
        if (getSrvcUnits() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSrvcUnits());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSrvcUnits(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAcctLimits() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAcctLimits());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAcctLimits(), i);
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
        if (getUseParentBktBalance() != null) {
            _hashCode += getUseParentBktBalance().hashCode();
        }
        if (getUseOwnBktBalance() != null) {
            _hashCode += getUseOwnBktBalance().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AcctBalDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "AcctBalDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useParntCaBal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "useParntCaBal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useParntCoreBal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "useParntCoreBal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowedBalType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "allowedBalType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srvcUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "srvcUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "SrvcUnitsItemType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "unit"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctLimits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "acctLimits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "ChildLimitItemType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "childLimit"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceGrpIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "deviceGrpIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zoneGrpIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "zoneGrpIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useParentBktBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "useParentBktBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useOwnBktBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "useOwnBktBalance"));
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
