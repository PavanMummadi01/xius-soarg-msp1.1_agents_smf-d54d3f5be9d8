/**
 * ChildAcctViewType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.selfcare.communityaccountservice;

public class ChildAcctViewType  implements java.io.Serializable {
    private java.lang.String msisdn;

    private java.lang.Long childAcctId;

    private java.lang.String useParntCaBal;

    private java.lang.String isAcctActive;

    private java.lang.String useParntCoreBal;

    private java.lang.Integer allowedBalType;

    private com.xius.xbus.messages.selfcare.communityaccountservice.ServUnitsItemViewType[] childSrvcUnits;

    private java.lang.String childDeviceIds;

    private java.lang.String childZoneGrpIds;

    private java.lang.String useParntBktBal;

    private java.lang.String useOwnBktBal;

    public ChildAcctViewType() {
    }

    public ChildAcctViewType(
           java.lang.String msisdn,
           java.lang.Long childAcctId,
           java.lang.String useParntCaBal,
           java.lang.String isAcctActive,
           java.lang.String useParntCoreBal,
           java.lang.Integer allowedBalType,
           com.xius.xbus.messages.selfcare.communityaccountservice.ServUnitsItemViewType[] childSrvcUnits,
           java.lang.String childDeviceIds,
           java.lang.String childZoneGrpIds,
           java.lang.String useParntBktBal,
           java.lang.String useOwnBktBal) {
           this.msisdn = msisdn;
           this.childAcctId = childAcctId;
           this.useParntCaBal = useParntCaBal;
           this.isAcctActive = isAcctActive;
           this.useParntCoreBal = useParntCoreBal;
           this.allowedBalType = allowedBalType;
           this.childSrvcUnits = childSrvcUnits;
           this.childDeviceIds = childDeviceIds;
           this.childZoneGrpIds = childZoneGrpIds;
           this.useParntBktBal = useParntBktBal;
           this.useOwnBktBal = useOwnBktBal;
    }


    /**
     * Gets the msisdn value for this ChildAcctViewType.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this ChildAcctViewType.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the childAcctId value for this ChildAcctViewType.
     * 
     * @return childAcctId
     */
    public java.lang.Long getChildAcctId() {
        return childAcctId;
    }


    /**
     * Sets the childAcctId value for this ChildAcctViewType.
     * 
     * @param childAcctId
     */
    public void setChildAcctId(java.lang.Long childAcctId) {
        this.childAcctId = childAcctId;
    }


    /**
     * Gets the useParntCaBal value for this ChildAcctViewType.
     * 
     * @return useParntCaBal
     */
    public java.lang.String getUseParntCaBal() {
        return useParntCaBal;
    }


    /**
     * Sets the useParntCaBal value for this ChildAcctViewType.
     * 
     * @param useParntCaBal
     */
    public void setUseParntCaBal(java.lang.String useParntCaBal) {
        this.useParntCaBal = useParntCaBal;
    }


    /**
     * Gets the isAcctActive value for this ChildAcctViewType.
     * 
     * @return isAcctActive
     */
    public java.lang.String getIsAcctActive() {
        return isAcctActive;
    }


    /**
     * Sets the isAcctActive value for this ChildAcctViewType.
     * 
     * @param isAcctActive
     */
    public void setIsAcctActive(java.lang.String isAcctActive) {
        this.isAcctActive = isAcctActive;
    }


    /**
     * Gets the useParntCoreBal value for this ChildAcctViewType.
     * 
     * @return useParntCoreBal
     */
    public java.lang.String getUseParntCoreBal() {
        return useParntCoreBal;
    }


    /**
     * Sets the useParntCoreBal value for this ChildAcctViewType.
     * 
     * @param useParntCoreBal
     */
    public void setUseParntCoreBal(java.lang.String useParntCoreBal) {
        this.useParntCoreBal = useParntCoreBal;
    }


    /**
     * Gets the allowedBalType value for this ChildAcctViewType.
     * 
     * @return allowedBalType
     */
    public java.lang.Integer getAllowedBalType() {
        return allowedBalType;
    }


    /**
     * Sets the allowedBalType value for this ChildAcctViewType.
     * 
     * @param allowedBalType
     */
    public void setAllowedBalType(java.lang.Integer allowedBalType) {
        this.allowedBalType = allowedBalType;
    }


    /**
     * Gets the childSrvcUnits value for this ChildAcctViewType.
     * 
     * @return childSrvcUnits
     */
    public com.xius.xbus.messages.selfcare.communityaccountservice.ServUnitsItemViewType[] getChildSrvcUnits() {
        return childSrvcUnits;
    }


    /**
     * Sets the childSrvcUnits value for this ChildAcctViewType.
     * 
     * @param childSrvcUnits
     */
    public void setChildSrvcUnits(com.xius.xbus.messages.selfcare.communityaccountservice.ServUnitsItemViewType[] childSrvcUnits) {
        this.childSrvcUnits = childSrvcUnits;
    }


    /**
     * Gets the childDeviceIds value for this ChildAcctViewType.
     * 
     * @return childDeviceIds
     */
    public java.lang.String getChildDeviceIds() {
        return childDeviceIds;
    }


    /**
     * Sets the childDeviceIds value for this ChildAcctViewType.
     * 
     * @param childDeviceIds
     */
    public void setChildDeviceIds(java.lang.String childDeviceIds) {
        this.childDeviceIds = childDeviceIds;
    }


    /**
     * Gets the childZoneGrpIds value for this ChildAcctViewType.
     * 
     * @return childZoneGrpIds
     */
    public java.lang.String getChildZoneGrpIds() {
        return childZoneGrpIds;
    }


    /**
     * Sets the childZoneGrpIds value for this ChildAcctViewType.
     * 
     * @param childZoneGrpIds
     */
    public void setChildZoneGrpIds(java.lang.String childZoneGrpIds) {
        this.childZoneGrpIds = childZoneGrpIds;
    }


    /**
     * Gets the useParntBktBal value for this ChildAcctViewType.
     * 
     * @return useParntBktBal
     */
    public java.lang.String getUseParntBktBal() {
        return useParntBktBal;
    }


    /**
     * Sets the useParntBktBal value for this ChildAcctViewType.
     * 
     * @param useParntBktBal
     */
    public void setUseParntBktBal(java.lang.String useParntBktBal) {
        this.useParntBktBal = useParntBktBal;
    }


    /**
     * Gets the useOwnBktBal value for this ChildAcctViewType.
     * 
     * @return useOwnBktBal
     */
    public java.lang.String getUseOwnBktBal() {
        return useOwnBktBal;
    }


    /**
     * Sets the useOwnBktBal value for this ChildAcctViewType.
     * 
     * @param useOwnBktBal
     */
    public void setUseOwnBktBal(java.lang.String useOwnBktBal) {
        this.useOwnBktBal = useOwnBktBal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChildAcctViewType)) return false;
        ChildAcctViewType other = (ChildAcctViewType) obj;
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
            ((this.childDeviceIds==null && other.getChildDeviceIds()==null) || 
             (this.childDeviceIds!=null &&
              this.childDeviceIds.equals(other.getChildDeviceIds()))) &&
            ((this.childZoneGrpIds==null && other.getChildZoneGrpIds()==null) || 
             (this.childZoneGrpIds!=null &&
              this.childZoneGrpIds.equals(other.getChildZoneGrpIds()))) &&
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
        if (getChildDeviceIds() != null) {
            _hashCode += getChildDeviceIds().hashCode();
        }
        if (getChildZoneGrpIds() != null) {
            _hashCode += getChildZoneGrpIds().hashCode();
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
        new org.apache.axis.description.TypeDesc(ChildAcctViewType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "ChildAcctViewType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "childAcctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useParntCaBal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "useParntCaBal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAcctActive");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "isAcctActive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useParntCoreBal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "useParntCoreBal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowedBalType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "allowedBalType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childSrvcUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "childSrvcUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "ServUnitsItemViewType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "unit"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childDeviceIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "childDeviceIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childZoneGrpIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "childZoneGrpIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
