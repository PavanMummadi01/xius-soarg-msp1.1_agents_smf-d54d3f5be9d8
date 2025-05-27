/**
 * GetCAGroupResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.CAManagement_xsd;

public class GetCAGroupResponse  implements java.io.Serializable {
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

    private com.xius.billing.CAManagement_xsd.GrpAddOnViewItemType[] grpAddons;

    private com.xius.billing.CAManagement_xsd.SrvcUnitsItemViewType[] grpBalance;

    private com.xius.billing.CAManagement_xsd.SrvcUnitsItemViewType[] parntSrvcUnits;

    private com.xius.billing.CAManagement_xsd.ChildAcctDetailsViewType[] childAccts;

    private java.lang.String parntDeviceIds;

    private java.lang.String parntZoneGrpIds;

    private com.xius.billing.CAManagement_xsd.SrvcUnitsItemViewType[] cumulatvChildLimitDtls;

    private java.lang.String caAtpDesc;

    private java.lang.String caAtpId;

    public GetCAGroupResponse() {
    }

    public GetCAGroupResponse(
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
           com.xius.billing.CAManagement_xsd.GrpAddOnViewItemType[] grpAddons,
           com.xius.billing.CAManagement_xsd.SrvcUnitsItemViewType[] grpBalance,
           com.xius.billing.CAManagement_xsd.SrvcUnitsItemViewType[] parntSrvcUnits,
           com.xius.billing.CAManagement_xsd.ChildAcctDetailsViewType[] childAccts,
           java.lang.String parntDeviceIds,
           java.lang.String parntZoneGrpIds,
           com.xius.billing.CAManagement_xsd.SrvcUnitsItemViewType[] cumulatvChildLimitDtls,
           java.lang.String caAtpDesc,
           java.lang.String caAtpId) {
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
     * Gets the grpID value for this GetCAGroupResponse.
     * 
     * @return grpID
     */
    public java.lang.Long getGrpID() {
        return grpID;
    }


    /**
     * Sets the grpID value for this GetCAGroupResponse.
     * 
     * @param grpID
     */
    public void setGrpID(java.lang.Long grpID) {
        this.grpID = grpID;
    }


    /**
     * Gets the grpName value for this GetCAGroupResponse.
     * 
     * @return grpName
     */
    public java.lang.String getGrpName() {
        return grpName;
    }


    /**
     * Sets the grpName value for this GetCAGroupResponse.
     * 
     * @param grpName
     */
    public void setGrpName(java.lang.String grpName) {
        this.grpName = grpName;
    }


    /**
     * Gets the pkgID value for this GetCAGroupResponse.
     * 
     * @return pkgID
     */
    public java.lang.Long getPkgID() {
        return pkgID;
    }


    /**
     * Sets the pkgID value for this GetCAGroupResponse.
     * 
     * @param pkgID
     */
    public void setPkgID(java.lang.Long pkgID) {
        this.pkgID = pkgID;
    }


    /**
     * Gets the pkgName value for this GetCAGroupResponse.
     * 
     * @return pkgName
     */
    public java.lang.String getPkgName() {
        return pkgName;
    }


    /**
     * Sets the pkgName value for this GetCAGroupResponse.
     * 
     * @param pkgName
     */
    public void setPkgName(java.lang.String pkgName) {
        this.pkgName = pkgName;
    }


    /**
     * Gets the parntAcctID value for this GetCAGroupResponse.
     * 
     * @return parntAcctID
     */
    public java.lang.Long getParntAcctID() {
        return parntAcctID;
    }


    /**
     * Sets the parntAcctID value for this GetCAGroupResponse.
     * 
     * @param parntAcctID
     */
    public void setParntAcctID(java.lang.Long parntAcctID) {
        this.parntAcctID = parntAcctID;
    }


    /**
     * Gets the grpValDate value for this GetCAGroupResponse.
     * 
     * @return grpValDate
     */
    public java.lang.String getGrpValDate() {
        return grpValDate;
    }


    /**
     * Sets the grpValDate value for this GetCAGroupResponse.
     * 
     * @param grpValDate
     */
    public void setGrpValDate(java.lang.String grpValDate) {
        this.grpValDate = grpValDate;
    }


    /**
     * Gets the useParntSrvce value for this GetCAGroupResponse.
     * 
     * @return useParntSrvce
     */
    public java.lang.String getUseParntSrvce() {
        return useParntSrvce;
    }


    /**
     * Sets the useParntSrvce value for this GetCAGroupResponse.
     * 
     * @param useParntSrvce
     */
    public void setUseParntSrvce(java.lang.String useParntSrvce) {
        this.useParntSrvce = useParntSrvce;
    }


    /**
     * Gets the iterFlag value for this GetCAGroupResponse.
     * 
     * @return iterFlag
     */
    public java.lang.String getIterFlag() {
        return iterFlag;
    }


    /**
     * Sets the iterFlag value for this GetCAGroupResponse.
     * 
     * @param iterFlag
     */
    public void setIterFlag(java.lang.String iterFlag) {
        this.iterFlag = iterFlag;
    }


    /**
     * Gets the parntExpStatus value for this GetCAGroupResponse.
     * 
     * @return parntExpStatus
     */
    public java.lang.String getParntExpStatus() {
        return parntExpStatus;
    }


    /**
     * Sets the parntExpStatus value for this GetCAGroupResponse.
     * 
     * @param parntExpStatus
     */
    public void setParntExpStatus(java.lang.String parntExpStatus) {
        this.parntExpStatus = parntExpStatus;
    }


    /**
     * Gets the homeNetworkId value for this GetCAGroupResponse.
     * 
     * @return homeNetworkId
     */
    public java.lang.Long getHomeNetworkId() {
        return homeNetworkId;
    }


    /**
     * Sets the homeNetworkId value for this GetCAGroupResponse.
     * 
     * @param homeNetworkId
     */
    public void setHomeNetworkId(java.lang.Long homeNetworkId) {
        this.homeNetworkId = homeNetworkId;
    }


    /**
     * Gets the childDefltLimt value for this GetCAGroupResponse.
     * 
     * @return childDefltLimt
     */
    public java.lang.String getChildDefltLimt() {
        return childDefltLimt;
    }


    /**
     * Sets the childDefltLimt value for this GetCAGroupResponse.
     * 
     * @param childDefltLimt
     */
    public void setChildDefltLimt(java.lang.String childDefltLimt) {
        this.childDefltLimt = childDefltLimt;
    }


    /**
     * Gets the grpAddons value for this GetCAGroupResponse.
     * 
     * @return grpAddons
     */
    public com.xius.billing.CAManagement_xsd.GrpAddOnViewItemType[] getGrpAddons() {
        return grpAddons;
    }


    /**
     * Sets the grpAddons value for this GetCAGroupResponse.
     * 
     * @param grpAddons
     */
    public void setGrpAddons(com.xius.billing.CAManagement_xsd.GrpAddOnViewItemType[] grpAddons) {
        this.grpAddons = grpAddons;
    }


    /**
     * Gets the grpBalance value for this GetCAGroupResponse.
     * 
     * @return grpBalance
     */
    public com.xius.billing.CAManagement_xsd.SrvcUnitsItemViewType[] getGrpBalance() {
        return grpBalance;
    }


    /**
     * Sets the grpBalance value for this GetCAGroupResponse.
     * 
     * @param grpBalance
     */
    public void setGrpBalance(com.xius.billing.CAManagement_xsd.SrvcUnitsItemViewType[] grpBalance) {
        this.grpBalance = grpBalance;
    }


    /**
     * Gets the parntSrvcUnits value for this GetCAGroupResponse.
     * 
     * @return parntSrvcUnits
     */
    public com.xius.billing.CAManagement_xsd.SrvcUnitsItemViewType[] getParntSrvcUnits() {
        return parntSrvcUnits;
    }


    /**
     * Sets the parntSrvcUnits value for this GetCAGroupResponse.
     * 
     * @param parntSrvcUnits
     */
    public void setParntSrvcUnits(com.xius.billing.CAManagement_xsd.SrvcUnitsItemViewType[] parntSrvcUnits) {
        this.parntSrvcUnits = parntSrvcUnits;
    }


    /**
     * Gets the childAccts value for this GetCAGroupResponse.
     * 
     * @return childAccts
     */
    public com.xius.billing.CAManagement_xsd.ChildAcctDetailsViewType[] getChildAccts() {
        return childAccts;
    }


    /**
     * Sets the childAccts value for this GetCAGroupResponse.
     * 
     * @param childAccts
     */
    public void setChildAccts(com.xius.billing.CAManagement_xsd.ChildAcctDetailsViewType[] childAccts) {
        this.childAccts = childAccts;
    }


    /**
     * Gets the parntDeviceIds value for this GetCAGroupResponse.
     * 
     * @return parntDeviceIds
     */
    public java.lang.String getParntDeviceIds() {
        return parntDeviceIds;
    }


    /**
     * Sets the parntDeviceIds value for this GetCAGroupResponse.
     * 
     * @param parntDeviceIds
     */
    public void setParntDeviceIds(java.lang.String parntDeviceIds) {
        this.parntDeviceIds = parntDeviceIds;
    }


    /**
     * Gets the parntZoneGrpIds value for this GetCAGroupResponse.
     * 
     * @return parntZoneGrpIds
     */
    public java.lang.String getParntZoneGrpIds() {
        return parntZoneGrpIds;
    }


    /**
     * Sets the parntZoneGrpIds value for this GetCAGroupResponse.
     * 
     * @param parntZoneGrpIds
     */
    public void setParntZoneGrpIds(java.lang.String parntZoneGrpIds) {
        this.parntZoneGrpIds = parntZoneGrpIds;
    }


    /**
     * Gets the cumulatvChildLimitDtls value for this GetCAGroupResponse.
     * 
     * @return cumulatvChildLimitDtls
     */
    public com.xius.billing.CAManagement_xsd.SrvcUnitsItemViewType[] getCumulatvChildLimitDtls() {
        return cumulatvChildLimitDtls;
    }


    /**
     * Sets the cumulatvChildLimitDtls value for this GetCAGroupResponse.
     * 
     * @param cumulatvChildLimitDtls
     */
    public void setCumulatvChildLimitDtls(com.xius.billing.CAManagement_xsd.SrvcUnitsItemViewType[] cumulatvChildLimitDtls) {
        this.cumulatvChildLimitDtls = cumulatvChildLimitDtls;
    }


    /**
     * Gets the caAtpDesc value for this GetCAGroupResponse.
     * 
     * @return caAtpDesc
     */
    public java.lang.String getCaAtpDesc() {
        return caAtpDesc;
    }


    /**
     * Sets the caAtpDesc value for this GetCAGroupResponse.
     * 
     * @param caAtpDesc
     */
    public void setCaAtpDesc(java.lang.String caAtpDesc) {
        this.caAtpDesc = caAtpDesc;
    }


    /**
     * Gets the caAtpId value for this GetCAGroupResponse.
     * 
     * @return caAtpId
     */
    public java.lang.String getCaAtpId() {
        return caAtpId;
    }


    /**
     * Sets the caAtpId value for this GetCAGroupResponse.
     * 
     * @param caAtpId
     */
    public void setCaAtpId(java.lang.String caAtpId) {
        this.caAtpId = caAtpId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCAGroupResponse)) return false;
        GetCAGroupResponse other = (GetCAGroupResponse) obj;
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
        int _hashCode = 1;
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
        new org.apache.axis.description.TypeDesc(GetCAGroupResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "GetCAGroupResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grpID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "grpID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grpName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "grpName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pkgID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "pkgID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pkgName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "pkgName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parntAcctID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "parntAcctID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grpValDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "grpValDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useParntSrvce");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "useParntSrvce"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iterFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "iterFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parntExpStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "parntExpStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeNetworkId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "homeNetworkId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childDefltLimt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "childDefltLimt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grpAddons");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "grpAddons"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "GrpAddOnViewItemType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "grpAddOn"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grpBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "grpBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "SrvcUnitsItemViewType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "unit"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parntSrvcUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "parntSrvcUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "SrvcUnitsItemViewType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "unit"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childAccts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "childAccts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "ChildAcctDetailsViewType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "childAcctDetails"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parntDeviceIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "parntDeviceIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parntZoneGrpIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "parntZoneGrpIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cumulatvChildLimitDtls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "cumulatvChildLimitDtls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "SrvcUnitsItemViewType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "unit"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caAtpDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "caAtpDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caAtpId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "caAtpId"));
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
