/**
 * GetCommAcctResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.selfcare.communityaccountservice;

public class GetCommAcctResponse  extends com.xius.xbus.messages.common.WSResponse  implements java.io.Serializable {
    private java.lang.Long grpID;

    private java.lang.String grpName;

    private java.lang.Long pkgID;

    private java.lang.String pkgName;

    private java.lang.Long parntAcctID;

    private java.lang.String grpValDate;

    private java.lang.String useParntSrvce;

    private java.lang.String iterFlag;

    private java.lang.String parntExpStatus;

    private java.lang.Long homeNetworkId;

    private java.lang.String childDefltLimt;

    private com.xius.xbus.messages.selfcare.communityaccountservice.GrpAddOnViewItemType[] grpAddons;

    private com.xius.xbus.messages.selfcare.communityaccountservice.ServUnitsItemViewType[] grpBalance;

    private com.xius.xbus.messages.selfcare.communityaccountservice.ServUnitsItemViewType[] parntSrvcUnits;

    private com.xius.xbus.messages.selfcare.communityaccountservice.ChildAcctDetailsViewType[] childAccts;

    private java.lang.String parntDeviceIds;

    private java.lang.String parntZoneGrpIds;

    private com.xius.xbus.messages.selfcare.communityaccountservice.ServUnitsItemViewType[] cumulatvChildLimitDtls;

    private java.lang.String caAtpDesc;

    private java.lang.String caAtpId;

    public GetCommAcctResponse() {
    }

    public GetCommAcctResponse(
           com.xius.xbus.messages.common.StatusCode statusCode,
           java.util.Calendar timeStamp,
           java.lang.String correlationID,
           com.xius.xbus.messages.common.ErrorData[] errors,
           java.lang.String version,
           java.lang.Long grpID,
           java.lang.String grpName,
           java.lang.Long pkgID,
           java.lang.String pkgName,
           java.lang.Long parntAcctID,
           java.lang.String grpValDate,
           java.lang.String useParntSrvce,
           java.lang.String iterFlag,
           java.lang.String parntExpStatus,
           java.lang.Long homeNetworkId,
           java.lang.String childDefltLimt,
           com.xius.xbus.messages.selfcare.communityaccountservice.GrpAddOnViewItemType[] grpAddons,
           com.xius.xbus.messages.selfcare.communityaccountservice.ServUnitsItemViewType[] grpBalance,
           com.xius.xbus.messages.selfcare.communityaccountservice.ServUnitsItemViewType[] parntSrvcUnits,
           com.xius.xbus.messages.selfcare.communityaccountservice.ChildAcctDetailsViewType[] childAccts,
           java.lang.String parntDeviceIds,
           java.lang.String parntZoneGrpIds,
           com.xius.xbus.messages.selfcare.communityaccountservice.ServUnitsItemViewType[] cumulatvChildLimitDtls,
           java.lang.String caAtpDesc,
           java.lang.String caAtpId) {
        super(
            statusCode,
            timeStamp,
            correlationID,
            errors,
            version);
        this.grpID = grpID;
        this.grpName = grpName;
        this.pkgID = pkgID;
        this.pkgName = pkgName;
        this.parntAcctID = parntAcctID;
        this.grpValDate = grpValDate;
        this.useParntSrvce = useParntSrvce;
        this.iterFlag = iterFlag;
        this.parntExpStatus = parntExpStatus;
        this.homeNetworkId = homeNetworkId;
        this.childDefltLimt = childDefltLimt;
        this.grpAddons = grpAddons;
        this.grpBalance = grpBalance;
        this.parntSrvcUnits = parntSrvcUnits;
        this.childAccts = childAccts;
        this.parntDeviceIds = parntDeviceIds;
        this.parntZoneGrpIds = parntZoneGrpIds;
        this.cumulatvChildLimitDtls = cumulatvChildLimitDtls;
        this.caAtpDesc = caAtpDesc;
        this.caAtpId = caAtpId;
    }


    /**
     * Gets the grpID value for this GetCommAcctResponse.
     * 
     * @return grpID
     */
    public java.lang.Long getGrpID() {
        return grpID;
    }


    /**
     * Sets the grpID value for this GetCommAcctResponse.
     * 
     * @param grpID
     */
    public void setGrpID(java.lang.Long grpID) {
        this.grpID = grpID;
    }


    /**
     * Gets the grpName value for this GetCommAcctResponse.
     * 
     * @return grpName
     */
    public java.lang.String getGrpName() {
        return grpName;
    }


    /**
     * Sets the grpName value for this GetCommAcctResponse.
     * 
     * @param grpName
     */
    public void setGrpName(java.lang.String grpName) {
        this.grpName = grpName;
    }


    /**
     * Gets the pkgID value for this GetCommAcctResponse.
     * 
     * @return pkgID
     */
    public java.lang.Long getPkgID() {
        return pkgID;
    }


    /**
     * Sets the pkgID value for this GetCommAcctResponse.
     * 
     * @param pkgID
     */
    public void setPkgID(java.lang.Long pkgID) {
        this.pkgID = pkgID;
    }


    /**
     * Gets the pkgName value for this GetCommAcctResponse.
     * 
     * @return pkgName
     */
    public java.lang.String getPkgName() {
        return pkgName;
    }


    /**
     * Sets the pkgName value for this GetCommAcctResponse.
     * 
     * @param pkgName
     */
    public void setPkgName(java.lang.String pkgName) {
        this.pkgName = pkgName;
    }


    /**
     * Gets the parntAcctID value for this GetCommAcctResponse.
     * 
     * @return parntAcctID
     */
    public java.lang.Long getParntAcctID() {
        return parntAcctID;
    }


    /**
     * Sets the parntAcctID value for this GetCommAcctResponse.
     * 
     * @param parntAcctID
     */
    public void setParntAcctID(java.lang.Long parntAcctID) {
        this.parntAcctID = parntAcctID;
    }


    /**
     * Gets the grpValDate value for this GetCommAcctResponse.
     * 
     * @return grpValDate
     */
    public java.lang.String getGrpValDate() {
        return grpValDate;
    }


    /**
     * Sets the grpValDate value for this GetCommAcctResponse.
     * 
     * @param grpValDate
     */
    public void setGrpValDate(java.lang.String grpValDate) {
        this.grpValDate = grpValDate;
    }


    /**
     * Gets the useParntSrvce value for this GetCommAcctResponse.
     * 
     * @return useParntSrvce
     */
    public java.lang.String getUseParntSrvce() {
        return useParntSrvce;
    }


    /**
     * Sets the useParntSrvce value for this GetCommAcctResponse.
     * 
     * @param useParntSrvce
     */
    public void setUseParntSrvce(java.lang.String useParntSrvce) {
        this.useParntSrvce = useParntSrvce;
    }


    /**
     * Gets the iterFlag value for this GetCommAcctResponse.
     * 
     * @return iterFlag
     */
    public java.lang.String getIterFlag() {
        return iterFlag;
    }


    /**
     * Sets the iterFlag value for this GetCommAcctResponse.
     * 
     * @param iterFlag
     */
    public void setIterFlag(java.lang.String iterFlag) {
        this.iterFlag = iterFlag;
    }


    /**
     * Gets the parntExpStatus value for this GetCommAcctResponse.
     * 
     * @return parntExpStatus
     */
    public java.lang.String getParntExpStatus() {
        return parntExpStatus;
    }


    /**
     * Sets the parntExpStatus value for this GetCommAcctResponse.
     * 
     * @param parntExpStatus
     */
    public void setParntExpStatus(java.lang.String parntExpStatus) {
        this.parntExpStatus = parntExpStatus;
    }


    /**
     * Gets the homeNetworkId value for this GetCommAcctResponse.
     * 
     * @return homeNetworkId
     */
    public java.lang.Long getHomeNetworkId() {
        return homeNetworkId;
    }


    /**
     * Sets the homeNetworkId value for this GetCommAcctResponse.
     * 
     * @param homeNetworkId
     */
    public void setHomeNetworkId(java.lang.Long homeNetworkId) {
        this.homeNetworkId = homeNetworkId;
    }


    /**
     * Gets the childDefltLimt value for this GetCommAcctResponse.
     * 
     * @return childDefltLimt
     */
    public java.lang.String getChildDefltLimt() {
        return childDefltLimt;
    }


    /**
     * Sets the childDefltLimt value for this GetCommAcctResponse.
     * 
     * @param childDefltLimt
     */
    public void setChildDefltLimt(java.lang.String childDefltLimt) {
        this.childDefltLimt = childDefltLimt;
    }


    /**
     * Gets the grpAddons value for this GetCommAcctResponse.
     * 
     * @return grpAddons
     */
    public com.xius.xbus.messages.selfcare.communityaccountservice.GrpAddOnViewItemType[] getGrpAddons() {
        return grpAddons;
    }


    /**
     * Sets the grpAddons value for this GetCommAcctResponse.
     * 
     * @param grpAddons
     */
    public void setGrpAddons(com.xius.xbus.messages.selfcare.communityaccountservice.GrpAddOnViewItemType[] grpAddons) {
        this.grpAddons = grpAddons;
    }


    /**
     * Gets the grpBalance value for this GetCommAcctResponse.
     * 
     * @return grpBalance
     */
    public com.xius.xbus.messages.selfcare.communityaccountservice.ServUnitsItemViewType[] getGrpBalance() {
        return grpBalance;
    }


    /**
     * Sets the grpBalance value for this GetCommAcctResponse.
     * 
     * @param grpBalance
     */
    public void setGrpBalance(com.xius.xbus.messages.selfcare.communityaccountservice.ServUnitsItemViewType[] grpBalance) {
        this.grpBalance = grpBalance;
    }


    /**
     * Gets the parntSrvcUnits value for this GetCommAcctResponse.
     * 
     * @return parntSrvcUnits
     */
    public com.xius.xbus.messages.selfcare.communityaccountservice.ServUnitsItemViewType[] getParntSrvcUnits() {
        return parntSrvcUnits;
    }


    /**
     * Sets the parntSrvcUnits value for this GetCommAcctResponse.
     * 
     * @param parntSrvcUnits
     */
    public void setParntSrvcUnits(com.xius.xbus.messages.selfcare.communityaccountservice.ServUnitsItemViewType[] parntSrvcUnits) {
        this.parntSrvcUnits = parntSrvcUnits;
    }


    /**
     * Gets the childAccts value for this GetCommAcctResponse.
     * 
     * @return childAccts
     */
    public com.xius.xbus.messages.selfcare.communityaccountservice.ChildAcctDetailsViewType[] getChildAccts() {
        return childAccts;
    }


    /**
     * Sets the childAccts value for this GetCommAcctResponse.
     * 
     * @param childAccts
     */
    public void setChildAccts(com.xius.xbus.messages.selfcare.communityaccountservice.ChildAcctDetailsViewType[] childAccts) {
        this.childAccts = childAccts;
    }


    /**
     * Gets the parntDeviceIds value for this GetCommAcctResponse.
     * 
     * @return parntDeviceIds
     */
    public java.lang.String getParntDeviceIds() {
        return parntDeviceIds;
    }


    /**
     * Sets the parntDeviceIds value for this GetCommAcctResponse.
     * 
     * @param parntDeviceIds
     */
    public void setParntDeviceIds(java.lang.String parntDeviceIds) {
        this.parntDeviceIds = parntDeviceIds;
    }


    /**
     * Gets the parntZoneGrpIds value for this GetCommAcctResponse.
     * 
     * @return parntZoneGrpIds
     */
    public java.lang.String getParntZoneGrpIds() {
        return parntZoneGrpIds;
    }


    /**
     * Sets the parntZoneGrpIds value for this GetCommAcctResponse.
     * 
     * @param parntZoneGrpIds
     */
    public void setParntZoneGrpIds(java.lang.String parntZoneGrpIds) {
        this.parntZoneGrpIds = parntZoneGrpIds;
    }


    /**
     * Gets the cumulatvChildLimitDtls value for this GetCommAcctResponse.
     * 
     * @return cumulatvChildLimitDtls
     */
    public com.xius.xbus.messages.selfcare.communityaccountservice.ServUnitsItemViewType[] getCumulatvChildLimitDtls() {
        return cumulatvChildLimitDtls;
    }


    /**
     * Sets the cumulatvChildLimitDtls value for this GetCommAcctResponse.
     * 
     * @param cumulatvChildLimitDtls
     */
    public void setCumulatvChildLimitDtls(com.xius.xbus.messages.selfcare.communityaccountservice.ServUnitsItemViewType[] cumulatvChildLimitDtls) {
        this.cumulatvChildLimitDtls = cumulatvChildLimitDtls;
    }


    /**
     * Gets the caAtpDesc value for this GetCommAcctResponse.
     * 
     * @return caAtpDesc
     */
    public java.lang.String getCaAtpDesc() {
        return caAtpDesc;
    }


    /**
     * Sets the caAtpDesc value for this GetCommAcctResponse.
     * 
     * @param caAtpDesc
     */
    public void setCaAtpDesc(java.lang.String caAtpDesc) {
        this.caAtpDesc = caAtpDesc;
    }


    /**
     * Gets the caAtpId value for this GetCommAcctResponse.
     * 
     * @return caAtpId
     */
    public java.lang.String getCaAtpId() {
        return caAtpId;
    }


    /**
     * Sets the caAtpId value for this GetCommAcctResponse.
     * 
     * @param caAtpId
     */
    public void setCaAtpId(java.lang.String caAtpId) {
        this.caAtpId = caAtpId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCommAcctResponse)) return false;
        GetCommAcctResponse other = (GetCommAcctResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.grpID==null && other.getGrpID()==null) || 
             (this.grpID!=null &&
              this.grpID.equals(other.getGrpID()))) &&
            ((this.grpName==null && other.getGrpName()==null) || 
             (this.grpName!=null &&
              this.grpName.equals(other.getGrpName()))) &&
            ((this.pkgID==null && other.getPkgID()==null) || 
             (this.pkgID!=null &&
              this.pkgID.equals(other.getPkgID()))) &&
            ((this.pkgName==null && other.getPkgName()==null) || 
             (this.pkgName!=null &&
              this.pkgName.equals(other.getPkgName()))) &&
            ((this.parntAcctID==null && other.getParntAcctID()==null) || 
             (this.parntAcctID!=null &&
              this.parntAcctID.equals(other.getParntAcctID()))) &&
            ((this.grpValDate==null && other.getGrpValDate()==null) || 
             (this.grpValDate!=null &&
              this.grpValDate.equals(other.getGrpValDate()))) &&
            ((this.useParntSrvce==null && other.getUseParntSrvce()==null) || 
             (this.useParntSrvce!=null &&
              this.useParntSrvce.equals(other.getUseParntSrvce()))) &&
            ((this.iterFlag==null && other.getIterFlag()==null) || 
             (this.iterFlag!=null &&
              this.iterFlag.equals(other.getIterFlag()))) &&
            ((this.parntExpStatus==null && other.getParntExpStatus()==null) || 
             (this.parntExpStatus!=null &&
              this.parntExpStatus.equals(other.getParntExpStatus()))) &&
            ((this.homeNetworkId==null && other.getHomeNetworkId()==null) || 
             (this.homeNetworkId!=null &&
              this.homeNetworkId.equals(other.getHomeNetworkId()))) &&
            ((this.childDefltLimt==null && other.getChildDefltLimt()==null) || 
             (this.childDefltLimt!=null &&
              this.childDefltLimt.equals(other.getChildDefltLimt()))) &&
            ((this.grpAddons==null && other.getGrpAddons()==null) || 
             (this.grpAddons!=null &&
              java.util.Arrays.equals(this.grpAddons, other.getGrpAddons()))) &&
            ((this.grpBalance==null && other.getGrpBalance()==null) || 
             (this.grpBalance!=null &&
              java.util.Arrays.equals(this.grpBalance, other.getGrpBalance()))) &&
            ((this.parntSrvcUnits==null && other.getParntSrvcUnits()==null) || 
             (this.parntSrvcUnits!=null &&
              java.util.Arrays.equals(this.parntSrvcUnits, other.getParntSrvcUnits()))) &&
            ((this.childAccts==null && other.getChildAccts()==null) || 
             (this.childAccts!=null &&
              java.util.Arrays.equals(this.childAccts, other.getChildAccts()))) &&
            ((this.parntDeviceIds==null && other.getParntDeviceIds()==null) || 
             (this.parntDeviceIds!=null &&
              this.parntDeviceIds.equals(other.getParntDeviceIds()))) &&
            ((this.parntZoneGrpIds==null && other.getParntZoneGrpIds()==null) || 
             (this.parntZoneGrpIds!=null &&
              this.parntZoneGrpIds.equals(other.getParntZoneGrpIds()))) &&
            ((this.cumulatvChildLimitDtls==null && other.getCumulatvChildLimitDtls()==null) || 
             (this.cumulatvChildLimitDtls!=null &&
              java.util.Arrays.equals(this.cumulatvChildLimitDtls, other.getCumulatvChildLimitDtls()))) &&
            ((this.caAtpDesc==null && other.getCaAtpDesc()==null) || 
             (this.caAtpDesc!=null &&
              this.caAtpDesc.equals(other.getCaAtpDesc()))) &&
            ((this.caAtpId==null && other.getCaAtpId()==null) || 
             (this.caAtpId!=null &&
              this.caAtpId.equals(other.getCaAtpId())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getGrpID() != null) {
            _hashCode += getGrpID().hashCode();
        }
        if (getGrpName() != null) {
            _hashCode += getGrpName().hashCode();
        }
        if (getPkgID() != null) {
            _hashCode += getPkgID().hashCode();
        }
        if (getPkgName() != null) {
            _hashCode += getPkgName().hashCode();
        }
        if (getParntAcctID() != null) {
            _hashCode += getParntAcctID().hashCode();
        }
        if (getGrpValDate() != null) {
            _hashCode += getGrpValDate().hashCode();
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
        if (getHomeNetworkId() != null) {
            _hashCode += getHomeNetworkId().hashCode();
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
        if (getGrpBalance() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGrpBalance());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGrpBalance(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getParntSrvcUnits() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParntSrvcUnits());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParntSrvcUnits(), i);
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
        if (getParntDeviceIds() != null) {
            _hashCode += getParntDeviceIds().hashCode();
        }
        if (getParntZoneGrpIds() != null) {
            _hashCode += getParntZoneGrpIds().hashCode();
        }
        if (getCumulatvChildLimitDtls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCumulatvChildLimitDtls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCumulatvChildLimitDtls(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCaAtpDesc() != null) {
            _hashCode += getCaAtpDesc().hashCode();
        }
        if (getCaAtpId() != null) {
            _hashCode += getCaAtpId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCommAcctResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">GetCommAcctResponse"));
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
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pkgID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "pkgID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pkgName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "pkgName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parntAcctID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "parntAcctID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grpValDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "grpValDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useParntSrvce");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "useParntSrvce"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iterFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "iterFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parntExpStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "parntExpStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeNetworkId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "homeNetworkId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childDefltLimt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "childDefltLimt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grpAddons");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "grpAddons"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "GrpAddOnViewItemType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "grpAddOn"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grpBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "grpBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "ServUnitsItemViewType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "unit"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parntSrvcUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "parntSrvcUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "ServUnitsItemViewType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "unit"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childAccts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "childAccts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "ChildAcctDetailsViewType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "childAcctDetails"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parntDeviceIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "parntDeviceIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parntZoneGrpIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "parntZoneGrpIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cumulatvChildLimitDtls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "cumulatvChildLimitDtls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "ServUnitsItemViewType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "unit"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caAtpDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "caAtpDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caAtpId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "caAtpId"));
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
