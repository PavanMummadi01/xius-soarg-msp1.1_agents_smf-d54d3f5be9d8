/**
 * ChildAcctDetailsViewType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.CAManagement_xsd;

public class ChildAcctDetailsViewType  implements java.io.Serializable {
    private java.lang.String msisdn;

    private java.lang.Long childAcctId;

    private java.lang.String useParntCaBal;

    private java.lang.String isAcctActive;

    private java.lang.String useParntCoreBal;

    private java.lang.Integer allowedBalType;

    private com.xius.billing.CAManagement_xsd.SrvcUnitsItemViewType[] childSrvcUnits;

    private com.xius.billing.CAManagement_xsd.ChildLimitItemViewType[] childLimits;

    private java.lang.String childDeviceIds;

    private java.lang.String childZoneGrpIds;

    private java.lang.String useParentBktBalance;

    private java.lang.String useOwnBktBalance;

    public ChildAcctDetailsViewType() {
    }

    public ChildAcctDetailsViewType(
           java.lang.String msisdn,
           java.lang.Long childAcctId,
           java.lang.String useParntCaBal,
           java.lang.String isAcctActive,
           java.lang.String useParntCoreBal,
           java.lang.Integer allowedBalType,
           com.xius.billing.CAManagement_xsd.SrvcUnitsItemViewType[] childSrvcUnits,
           com.xius.billing.CAManagement_xsd.ChildLimitItemViewType[] childLimits,
           java.lang.String childDeviceIds,
           java.lang.String childZoneGrpIds,
           java.lang.String useParentBktBalance,
           java.lang.String useOwnBktBalance) {
           this.msisdn = msisdn;
           this.childAcctId = childAcctId;
           this.useParntCaBal = useParntCaBal;
           this.isAcctActive = isAcctActive;
           this.useParntCoreBal = useParntCoreBal;
           this.allowedBalType = allowedBalType;
           this.childSrvcUnits = childSrvcUnits;
           this.childLimits = childLimits;
           this.childDeviceIds = childDeviceIds;
           this.childZoneGrpIds = childZoneGrpIds;
           this.useParentBktBalance = useParentBktBalance;
           this.useOwnBktBalance = useOwnBktBalance;
    }


    /**
     * Gets the msisdn value for this ChildAcctDetailsViewType.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this ChildAcctDetailsViewType.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the childAcctId value for this ChildAcctDetailsViewType.
     * 
     * @return childAcctId
     */
    public java.lang.Long getChildAcctId() {
        return childAcctId;
    }


    /**
     * Sets the childAcctId value for this ChildAcctDetailsViewType.
     * 
     * @param childAcctId
     */
    public void setChildAcctId(java.lang.Long childAcctId) {
        this.childAcctId = childAcctId;
    }


    /**
     * Gets the useParntCaBal value for this ChildAcctDetailsViewType.
     * 
     * @return useParntCaBal
     */
    public java.lang.String getUseParntCaBal() {
        return useParntCaBal;
    }


    /**
     * Sets the useParntCaBal value for this ChildAcctDetailsViewType.
     * 
     * @param useParntCaBal
     */
    public void setUseParntCaBal(java.lang.String useParntCaBal) {
        this.useParntCaBal = useParntCaBal;
    }


    /**
     * Gets the isAcctActive value for this ChildAcctDetailsViewType.
     * 
     * @return isAcctActive
     */
    public java.lang.String getIsAcctActive() {
        return isAcctActive;
    }


    /**
     * Sets the isAcctActive value for this ChildAcctDetailsViewType.
     * 
     * @param isAcctActive
     */
    public void setIsAcctActive(java.lang.String isAcctActive) {
        this.isAcctActive = isAcctActive;
    }


    /**
     * Gets the useParntCoreBal value for this ChildAcctDetailsViewType.
     * 
     * @return useParntCoreBal
     */
    public java.lang.String getUseParntCoreBal() {
        return useParntCoreBal;
    }


    /**
     * Sets the useParntCoreBal value for this ChildAcctDetailsViewType.
     * 
     * @param useParntCoreBal
     */
    public void setUseParntCoreBal(java.lang.String useParntCoreBal) {
        this.useParntCoreBal = useParntCoreBal;
    }


    /**
     * Gets the allowedBalType value for this ChildAcctDetailsViewType.
     * 
     * @return allowedBalType
     */
    public java.lang.Integer getAllowedBalType() {
        return allowedBalType;
    }


    /**
     * Sets the allowedBalType value for this ChildAcctDetailsViewType.
     * 
     * @param allowedBalType
     */
    public void setAllowedBalType(java.lang.Integer allowedBalType) {
        this.allowedBalType = allowedBalType;
    }


    /**
     * Gets the childSrvcUnits value for this ChildAcctDetailsViewType.
     * 
     * @return childSrvcUnits
     */
    public com.xius.billing.CAManagement_xsd.SrvcUnitsItemViewType[] getChildSrvcUnits() {
        return childSrvcUnits;
    }


    /**
     * Sets the childSrvcUnits value for this ChildAcctDetailsViewType.
     * 
     * @param childSrvcUnits
     */
    public void setChildSrvcUnits(com.xius.billing.CAManagement_xsd.SrvcUnitsItemViewType[] childSrvcUnits) {
        this.childSrvcUnits = childSrvcUnits;
    }


    /**
     * Gets the childLimits value for this ChildAcctDetailsViewType.
     * 
     * @return childLimits
     */
    public com.xius.billing.CAManagement_xsd.ChildLimitItemViewType[] getChildLimits() {
        return childLimits;
    }


    /**
     * Sets the childLimits value for this ChildAcctDetailsViewType.
     * 
     * @param childLimits
     */
    public void setChildLimits(com.xius.billing.CAManagement_xsd.ChildLimitItemViewType[] childLimits) {
        this.childLimits = childLimits;
    }


    /**
     * Gets the childDeviceIds value for this ChildAcctDetailsViewType.
     * 
     * @return childDeviceIds
     */
    public java.lang.String getChildDeviceIds() {
        return childDeviceIds;
    }


    /**
     * Sets the childDeviceIds value for this ChildAcctDetailsViewType.
     * 
     * @param childDeviceIds
     */
    public void setChildDeviceIds(java.lang.String childDeviceIds) {
        this.childDeviceIds = childDeviceIds;
    }


    /**
     * Gets the childZoneGrpIds value for this ChildAcctDetailsViewType.
     * 
     * @return childZoneGrpIds
     */
    public java.lang.String getChildZoneGrpIds() {
        return childZoneGrpIds;
    }


    /**
     * Sets the childZoneGrpIds value for this ChildAcctDetailsViewType.
     * 
     * @param childZoneGrpIds
     */
    public void setChildZoneGrpIds(java.lang.String childZoneGrpIds) {
        this.childZoneGrpIds = childZoneGrpIds;
    }


    /**
     * Gets the useParentBktBalance value for this ChildAcctDetailsViewType.
     * 
     * @return useParentBktBalance
     */
    public java.lang.String getUseParentBktBalance() {
        return useParentBktBalance;
    }


    /**
     * Sets the useParentBktBalance value for this ChildAcctDetailsViewType.
     * 
     * @param useParentBktBalance
     */
    public void setUseParentBktBalance(java.lang.String useParentBktBalance) {
        this.useParentBktBalance = useParentBktBalance;
    }


    /**
     * Gets the useOwnBktBalance value for this ChildAcctDetailsViewType.
     * 
     * @return useOwnBktBalance
     */
    public java.lang.String getUseOwnBktBalance() {
        return useOwnBktBalance;
    }


    /**
     * Sets the useOwnBktBalance value for this ChildAcctDetailsViewType.
     * 
     * @param useOwnBktBalance
     */
    public void setUseOwnBktBalance(java.lang.String useOwnBktBalance) {
        this.useOwnBktBalance = useOwnBktBalance;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChildAcctDetailsViewType)) return false;
        ChildAcctDetailsViewType other = (ChildAcctDetailsViewType) obj;
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
            ((this.childAcctId==null && other.getChildAcctId()==null) || 
             (this.childAcctId!=null &&
              this.childAcctId.equals(other.getChildAcctId()))) &&
            ((this.useParntCaBal==null && other.getUseParntCaBal()==null) || 
             (this.useParntCaBal!=null &&
              this.useParntCaBal.equals(other.getUseParntCaBal()))) &&
            ((this.isAcctActive==null && other.getIsAcctActive()==null) || 
             (this.isAcctActive!=null &&
              this.isAcctActive.equals(other.getIsAcctActive()))) &&
            ((this.useParntCoreBal==null && other.getUseParntCoreBal()==null) || 
             (this.useParntCoreBal!=null &&
              this.useParntCoreBal.equals(other.getUseParntCoreBal()))) &&
            ((this.allowedBalType==null && other.getAllowedBalType()==null) || 
             (this.allowedBalType!=null &&
              this.allowedBalType.equals(other.getAllowedBalType()))) &&
            ((this.childSrvcUnits==null && other.getChildSrvcUnits()==null) || 
             (this.childSrvcUnits!=null &&
              java.util.Arrays.equals(this.childSrvcUnits, other.getChildSrvcUnits()))) &&
            ((this.childLimits==null && other.getChildLimits()==null) || 
             (this.childLimits!=null &&
              java.util.Arrays.equals(this.childLimits, other.getChildLimits()))) &&
            ((this.childDeviceIds==null && other.getChildDeviceIds()==null) || 
             (this.childDeviceIds!=null &&
              this.childDeviceIds.equals(other.getChildDeviceIds()))) &&
            ((this.childZoneGrpIds==null && other.getChildZoneGrpIds()==null) || 
             (this.childZoneGrpIds!=null &&
              this.childZoneGrpIds.equals(other.getChildZoneGrpIds()))) &&
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
        if (getChildAcctId() != null) {
            _hashCode += getChildAcctId().hashCode();
        }
        if (getUseParntCaBal() != null) {
            _hashCode += getUseParntCaBal().hashCode();
        }
        if (getIsAcctActive() != null) {
            _hashCode += getIsAcctActive().hashCode();
        }
        if (getUseParntCoreBal() != null) {
            _hashCode += getUseParntCoreBal().hashCode();
        }
        if (getAllowedBalType() != null) {
            _hashCode += getAllowedBalType().hashCode();
        }
        if (getChildSrvcUnits() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChildSrvcUnits());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChildSrvcUnits(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getChildLimits() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChildLimits());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChildLimits(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getChildDeviceIds() != null) {
            _hashCode += getChildDeviceIds().hashCode();
        }
        if (getChildZoneGrpIds() != null) {
            _hashCode += getChildZoneGrpIds().hashCode();
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
        new org.apache.axis.description.TypeDesc(ChildAcctDetailsViewType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "ChildAcctDetailsViewType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "childAcctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useParntCaBal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "useParntCaBal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAcctActive");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "isAcctActive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useParntCoreBal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "useParntCoreBal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowedBalType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "allowedBalType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childSrvcUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "childSrvcUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "SrvcUnitsItemViewType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "unit"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childLimits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "childLimits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "ChildLimitItemViewType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "childLimit"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childDeviceIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "childDeviceIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childZoneGrpIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "childZoneGrpIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
