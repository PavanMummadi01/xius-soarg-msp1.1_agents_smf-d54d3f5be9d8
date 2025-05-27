/**
 * CAGroupType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.selfcare.communityaccountservice;

public class CAGroupType  implements java.io.Serializable {
    private java.lang.Long grpID;

    private java.lang.String grpName;

    private long pkgID;

    private long parntAcctID;

    private java.lang.Long grpParentMsisdnNO;

    private java.lang.String useParntSrvce;

    private java.lang.String iterFlag;

    private java.lang.String parntExpStatus;

    private java.lang.String childDefltLimt;

    private com.xius.xbus.messages.selfcare.communityaccountservice.GrpAddOnItemType[] grpAddons;

    private com.xius.xbus.messages.selfcare.communityaccountservice.AcctBalListsType[] childAccts;

    private java.lang.String[] grpPrntDeviceIds;

    private java.lang.String[] grpPrntZoneIds;

    private long[] topUpServiceIds;

    public CAGroupType() {
    }

    public CAGroupType(
           java.lang.Long grpID,
           java.lang.String grpName,
           long pkgID,
           long parntAcctID,
           java.lang.Long grpParentMsisdnNO,
           java.lang.String useParntSrvce,
           java.lang.String iterFlag,
           java.lang.String parntExpStatus,
           java.lang.String childDefltLimt,
           com.xius.xbus.messages.selfcare.communityaccountservice.GrpAddOnItemType[] grpAddons,
           com.xius.xbus.messages.selfcare.communityaccountservice.AcctBalListsType[] childAccts,
           java.lang.String[] grpPrntDeviceIds,
           java.lang.String[] grpPrntZoneIds,
           long[] topUpServiceIds) {
           this.grpID = grpID;
           this.grpName = grpName;
           this.pkgID = pkgID;
           this.parntAcctID = parntAcctID;
           this.grpParentMsisdnNO = grpParentMsisdnNO;
           this.useParntSrvce = useParntSrvce;
           this.iterFlag = iterFlag;
           this.parntExpStatus = parntExpStatus;
           this.childDefltLimt = childDefltLimt;
           this.grpAddons = grpAddons;
           this.childAccts = childAccts;
           this.grpPrntDeviceIds = grpPrntDeviceIds;
           this.grpPrntZoneIds = grpPrntZoneIds;
           this.topUpServiceIds = topUpServiceIds;
    }


    /**
     * Gets the grpID value for this CAGroupType.
     * 
     * @return grpID
     */
    public java.lang.Long getGrpID() {
        return grpID;
    }


    /**
     * Sets the grpID value for this CAGroupType.
     * 
     * @param grpID
     */
    public void setGrpID(java.lang.Long grpID) {
        this.grpID = grpID;
    }


    /**
     * Gets the grpName value for this CAGroupType.
     * 
     * @return grpName
     */
    public java.lang.String getGrpName() {
        return grpName;
    }


    /**
     * Sets the grpName value for this CAGroupType.
     * 
     * @param grpName
     */
    public void setGrpName(java.lang.String grpName) {
        this.grpName = grpName;
    }


    /**
     * Gets the pkgID value for this CAGroupType.
     * 
     * @return pkgID
     */
    public long getPkgID() {
        return pkgID;
    }


    /**
     * Sets the pkgID value for this CAGroupType.
     * 
     * @param pkgID
     */
    public void setPkgID(long pkgID) {
        this.pkgID = pkgID;
    }


    /**
     * Gets the parntAcctID value for this CAGroupType.
     * 
     * @return parntAcctID
     */
    public long getParntAcctID() {
        return parntAcctID;
    }


    /**
     * Sets the parntAcctID value for this CAGroupType.
     * 
     * @param parntAcctID
     */
    public void setParntAcctID(long parntAcctID) {
        this.parntAcctID = parntAcctID;
    }


    /**
     * Gets the grpParentMsisdnNO value for this CAGroupType.
     * 
     * @return grpParentMsisdnNO
     */
    public java.lang.Long getGrpParentMsisdnNO() {
        return grpParentMsisdnNO;
    }


    /**
     * Sets the grpParentMsisdnNO value for this CAGroupType.
     * 
     * @param grpParentMsisdnNO
     */
    public void setGrpParentMsisdnNO(java.lang.Long grpParentMsisdnNO) {
        this.grpParentMsisdnNO = grpParentMsisdnNO;
    }


    /**
     * Gets the useParntSrvce value for this CAGroupType.
     * 
     * @return useParntSrvce
     */
    public java.lang.String getUseParntSrvce() {
        return useParntSrvce;
    }


    /**
     * Sets the useParntSrvce value for this CAGroupType.
     * 
     * @param useParntSrvce
     */
    public void setUseParntSrvce(java.lang.String useParntSrvce) {
        this.useParntSrvce = useParntSrvce;
    }


    /**
     * Gets the iterFlag value for this CAGroupType.
     * 
     * @return iterFlag
     */
    public java.lang.String getIterFlag() {
        return iterFlag;
    }


    /**
     * Sets the iterFlag value for this CAGroupType.
     * 
     * @param iterFlag
     */
    public void setIterFlag(java.lang.String iterFlag) {
        this.iterFlag = iterFlag;
    }


    /**
     * Gets the parntExpStatus value for this CAGroupType.
     * 
     * @return parntExpStatus
     */
    public java.lang.String getParntExpStatus() {
        return parntExpStatus;
    }


    /**
     * Sets the parntExpStatus value for this CAGroupType.
     * 
     * @param parntExpStatus
     */
    public void setParntExpStatus(java.lang.String parntExpStatus) {
        this.parntExpStatus = parntExpStatus;
    }


    /**
     * Gets the childDefltLimt value for this CAGroupType.
     * 
     * @return childDefltLimt
     */
    public java.lang.String getChildDefltLimt() {
        return childDefltLimt;
    }


    /**
     * Sets the childDefltLimt value for this CAGroupType.
     * 
     * @param childDefltLimt
     */
    public void setChildDefltLimt(java.lang.String childDefltLimt) {
        this.childDefltLimt = childDefltLimt;
    }


    /**
     * Gets the grpAddons value for this CAGroupType.
     * 
     * @return grpAddons
     */
    public com.xius.xbus.messages.selfcare.communityaccountservice.GrpAddOnItemType[] getGrpAddons() {
        return grpAddons;
    }


    /**
     * Sets the grpAddons value for this CAGroupType.
     * 
     * @param grpAddons
     */
    public void setGrpAddons(com.xius.xbus.messages.selfcare.communityaccountservice.GrpAddOnItemType[] grpAddons) {
        this.grpAddons = grpAddons;
    }


    /**
     * Gets the childAccts value for this CAGroupType.
     * 
     * @return childAccts
     */
    public com.xius.xbus.messages.selfcare.communityaccountservice.AcctBalListsType[] getChildAccts() {
        return childAccts;
    }


    /**
     * Sets the childAccts value for this CAGroupType.
     * 
     * @param childAccts
     */
    public void setChildAccts(com.xius.xbus.messages.selfcare.communityaccountservice.AcctBalListsType[] childAccts) {
        this.childAccts = childAccts;
    }


    /**
     * Gets the grpPrntDeviceIds value for this CAGroupType.
     * 
     * @return grpPrntDeviceIds
     */
    public java.lang.String[] getGrpPrntDeviceIds() {
        return grpPrntDeviceIds;
    }


    /**
     * Sets the grpPrntDeviceIds value for this CAGroupType.
     * 
     * @param grpPrntDeviceIds
     */
    public void setGrpPrntDeviceIds(java.lang.String[] grpPrntDeviceIds) {
        this.grpPrntDeviceIds = grpPrntDeviceIds;
    }

    public java.lang.String getGrpPrntDeviceIds(int i) {
        return this.grpPrntDeviceIds[i];
    }

    public void setGrpPrntDeviceIds(int i, java.lang.String _value) {
        this.grpPrntDeviceIds[i] = _value;
    }


    /**
     * Gets the grpPrntZoneIds value for this CAGroupType.
     * 
     * @return grpPrntZoneIds
     */
    public java.lang.String[] getGrpPrntZoneIds() {
        return grpPrntZoneIds;
    }


    /**
     * Sets the grpPrntZoneIds value for this CAGroupType.
     * 
     * @param grpPrntZoneIds
     */
    public void setGrpPrntZoneIds(java.lang.String[] grpPrntZoneIds) {
        this.grpPrntZoneIds = grpPrntZoneIds;
    }

    public java.lang.String getGrpPrntZoneIds(int i) {
        return this.grpPrntZoneIds[i];
    }

    public void setGrpPrntZoneIds(int i, java.lang.String _value) {
        this.grpPrntZoneIds[i] = _value;
    }


    /**
     * Gets the topUpServiceIds value for this CAGroupType.
     * 
     * @return topUpServiceIds
     */
    public long[] getTopUpServiceIds() {
        return topUpServiceIds;
    }


    /**
     * Sets the topUpServiceIds value for this CAGroupType.
     * 
     * @param topUpServiceIds
     */
    public void setTopUpServiceIds(long[] topUpServiceIds) {
        this.topUpServiceIds = topUpServiceIds;
    }

    public long getTopUpServiceIds(int i) {
        return this.topUpServiceIds[i];
    }

    public void setTopUpServiceIds(int i, long _value) {
        this.topUpServiceIds[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CAGroupType)) return false;
        CAGroupType other = (CAGroupType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.grpID==null && other.getGrpID()==null) || 
             (this.grpID!=null &&
              this.grpID.equals(other.getGrpID()))) &&
            ((this.grpName==null && other.getGrpName()==null) || 
             (this.grpName!=null &&
              this.grpName.equals(other.getGrpName()))) &&
            this.pkgID == other.getPkgID() &&
            this.parntAcctID == other.getParntAcctID() &&
            ((this.grpParentMsisdnNO==null && other.getGrpParentMsisdnNO()==null) || 
             (this.grpParentMsisdnNO!=null &&
              this.grpParentMsisdnNO.equals(other.getGrpParentMsisdnNO()))) &&
            ((this.useParntSrvce==null && other.getUseParntSrvce()==null) || 
             (this.useParntSrvce!=null &&
              this.useParntSrvce.equals(other.getUseParntSrvce()))) &&
            ((this.iterFlag==null && other.getIterFlag()==null) || 
             (this.iterFlag!=null &&
              this.iterFlag.equals(other.getIterFlag()))) &&
            ((this.parntExpStatus==null && other.getParntExpStatus()==null) || 
             (this.parntExpStatus!=null &&
              this.parntExpStatus.equals(other.getParntExpStatus()))) &&
            ((this.childDefltLimt==null && other.getChildDefltLimt()==null) || 
             (this.childDefltLimt!=null &&
              this.childDefltLimt.equals(other.getChildDefltLimt()))) &&
            ((this.grpAddons==null && other.getGrpAddons()==null) || 
             (this.grpAddons!=null &&
              java.util.Arrays.equals(this.grpAddons, other.getGrpAddons()))) &&
            ((this.childAccts==null && other.getChildAccts()==null) || 
             (this.childAccts!=null &&
              java.util.Arrays.equals(this.childAccts, other.getChildAccts()))) &&
            ((this.grpPrntDeviceIds==null && other.getGrpPrntDeviceIds()==null) || 
             (this.grpPrntDeviceIds!=null &&
              java.util.Arrays.equals(this.grpPrntDeviceIds, other.getGrpPrntDeviceIds()))) &&
            ((this.grpPrntZoneIds==null && other.getGrpPrntZoneIds()==null) || 
             (this.grpPrntZoneIds!=null &&
              java.util.Arrays.equals(this.grpPrntZoneIds, other.getGrpPrntZoneIds()))) &&
            ((this.topUpServiceIds==null && other.getTopUpServiceIds()==null) || 
             (this.topUpServiceIds!=null &&
              java.util.Arrays.equals(this.topUpServiceIds, other.getTopUpServiceIds())));
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
        if (getGrpID() != null) {
            _hashCode += getGrpID().hashCode();
        }
        if (getGrpName() != null) {
            _hashCode += getGrpName().hashCode();
        }
        _hashCode += new Long(getPkgID()).hashCode();
        _hashCode += new Long(getParntAcctID()).hashCode();
        if (getGrpParentMsisdnNO() != null) {
            _hashCode += getGrpParentMsisdnNO().hashCode();
        }
        if (getUseParntSrvce() != null) {
            _hashCode += getUseParntSrvce().hashCode();
        }
        if (getIterFlag() != null) {
            _hashCode += getIterFlag().hashCode();
        }
        if (getParntExpStatus() != null) {
            _hashCode += getParntExpStatus().hashCode();
        }
        if (getChildDefltLimt() != null) {
            _hashCode += getChildDefltLimt().hashCode();
        }
        if (getGrpAddons() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGrpAddons());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGrpAddons(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
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
        if (getGrpPrntDeviceIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGrpPrntDeviceIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGrpPrntDeviceIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGrpPrntZoneIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGrpPrntZoneIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGrpPrntZoneIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTopUpServiceIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTopUpServiceIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTopUpServiceIds(), i);
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
        new org.apache.axis.description.TypeDesc(CAGroupType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "CAGroupType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grpID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "grpID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grpName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "grpName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pkgID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "pkgID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parntAcctID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "parntAcctID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grpParentMsisdnNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "grpParentMsisdnNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useParntSrvce");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "useParntSrvce"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iterFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "iterFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parntExpStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "parntExpStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childDefltLimt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "childDefltLimt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grpAddons");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "grpAddons"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "GrpAddOnItemType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "grpAddOn"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childAccts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "childAccts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "AcctBalListsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "acctBalLists"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grpPrntDeviceIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "grpPrntDeviceIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grpPrntZoneIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "grpPrntZoneIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topUpServiceIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "topUpServiceIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
