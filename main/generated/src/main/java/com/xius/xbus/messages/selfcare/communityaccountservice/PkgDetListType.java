/**
 * PkgDetListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.selfcare.communityaccountservice;

public class PkgDetListType  implements java.io.Serializable {
    private java.lang.Long pkgId;

    private java.lang.String pkgName;

    private java.lang.Integer defaultNoOfLines;

    private java.math.BigDecimal rentalAmt;

    private java.math.BigDecimal extraLineCharges;

    private java.lang.Long homeNetworkId;

    private java.lang.String pkgStatus;

    private java.lang.String rolloverFlag;

    private java.lang.String planType;

    private java.lang.String shelfDate;

    private com.xius.xbus.messages.selfcare.communityaccountservice.PkgAdonsViewItemType[] pkgAdonMaps;

    private com.xius.xbus.messages.selfcare.communityaccountservice.SerPlanCaldrsViewItemType[] serPlanCalMaps;

    private com.xius.xbus.messages.selfcare.communityaccountservice.PkgSrvcUtsViewItemType[] pkgServiceUnits;

    private com.xius.xbus.messages.selfcare.communityaccountservice.DeviceGroupInfoType[] deviceInfo;

    private com.xius.xbus.messages.selfcare.communityaccountservice.DataZoneGroupInfoType[] dataZoneInfo;

    private java.lang.String startDate;

    private java.lang.String dataZoneMapYn;

    private java.lang.String deviceMapYn;

    public PkgDetListType() {
    }

    public PkgDetListType(
           java.lang.Long pkgId,
           java.lang.String pkgName,
           java.lang.Integer defaultNoOfLines,
           java.math.BigDecimal rentalAmt,
           java.math.BigDecimal extraLineCharges,
           java.lang.Long homeNetworkId,
           java.lang.String pkgStatus,
           java.lang.String rolloverFlag,
           java.lang.String planType,
           java.lang.String shelfDate,
           com.xius.xbus.messages.selfcare.communityaccountservice.PkgAdonsViewItemType[] pkgAdonMaps,
           com.xius.xbus.messages.selfcare.communityaccountservice.SerPlanCaldrsViewItemType[] serPlanCalMaps,
           com.xius.xbus.messages.selfcare.communityaccountservice.PkgSrvcUtsViewItemType[] pkgServiceUnits,
           com.xius.xbus.messages.selfcare.communityaccountservice.DeviceGroupInfoType[] deviceInfo,
           com.xius.xbus.messages.selfcare.communityaccountservice.DataZoneGroupInfoType[] dataZoneInfo,
           java.lang.String startDate,
           java.lang.String dataZoneMapYn,
           java.lang.String deviceMapYn) {
           this.pkgId = pkgId;
           this.pkgName = pkgName;
           this.defaultNoOfLines = defaultNoOfLines;
           this.rentalAmt = rentalAmt;
           this.extraLineCharges = extraLineCharges;
           this.homeNetworkId = homeNetworkId;
           this.pkgStatus = pkgStatus;
           this.rolloverFlag = rolloverFlag;
           this.planType = planType;
           this.shelfDate = shelfDate;
           this.pkgAdonMaps = pkgAdonMaps;
           this.serPlanCalMaps = serPlanCalMaps;
           this.pkgServiceUnits = pkgServiceUnits;
           this.deviceInfo = deviceInfo;
           this.dataZoneInfo = dataZoneInfo;
           this.startDate = startDate;
           this.dataZoneMapYn = dataZoneMapYn;
           this.deviceMapYn = deviceMapYn;
    }


    /**
     * Gets the pkgId value for this PkgDetListType.
     * 
     * @return pkgId
     */
    public java.lang.Long getPkgId() {
        return pkgId;
    }


    /**
     * Sets the pkgId value for this PkgDetListType.
     * 
     * @param pkgId
     */
    public void setPkgId(java.lang.Long pkgId) {
        this.pkgId = pkgId;
    }


    /**
     * Gets the pkgName value for this PkgDetListType.
     * 
     * @return pkgName
     */
    public java.lang.String getPkgName() {
        return pkgName;
    }


    /**
     * Sets the pkgName value for this PkgDetListType.
     * 
     * @param pkgName
     */
    public void setPkgName(java.lang.String pkgName) {
        this.pkgName = pkgName;
    }


    /**
     * Gets the defaultNoOfLines value for this PkgDetListType.
     * 
     * @return defaultNoOfLines
     */
    public java.lang.Integer getDefaultNoOfLines() {
        return defaultNoOfLines;
    }


    /**
     * Sets the defaultNoOfLines value for this PkgDetListType.
     * 
     * @param defaultNoOfLines
     */
    public void setDefaultNoOfLines(java.lang.Integer defaultNoOfLines) {
        this.defaultNoOfLines = defaultNoOfLines;
    }


    /**
     * Gets the rentalAmt value for this PkgDetListType.
     * 
     * @return rentalAmt
     */
    public java.math.BigDecimal getRentalAmt() {
        return rentalAmt;
    }


    /**
     * Sets the rentalAmt value for this PkgDetListType.
     * 
     * @param rentalAmt
     */
    public void setRentalAmt(java.math.BigDecimal rentalAmt) {
        this.rentalAmt = rentalAmt;
    }


    /**
     * Gets the extraLineCharges value for this PkgDetListType.
     * 
     * @return extraLineCharges
     */
    public java.math.BigDecimal getExtraLineCharges() {
        return extraLineCharges;
    }


    /**
     * Sets the extraLineCharges value for this PkgDetListType.
     * 
     * @param extraLineCharges
     */
    public void setExtraLineCharges(java.math.BigDecimal extraLineCharges) {
        this.extraLineCharges = extraLineCharges;
    }


    /**
     * Gets the homeNetworkId value for this PkgDetListType.
     * 
     * @return homeNetworkId
     */
    public java.lang.Long getHomeNetworkId() {
        return homeNetworkId;
    }


    /**
     * Sets the homeNetworkId value for this PkgDetListType.
     * 
     * @param homeNetworkId
     */
    public void setHomeNetworkId(java.lang.Long homeNetworkId) {
        this.homeNetworkId = homeNetworkId;
    }


    /**
     * Gets the pkgStatus value for this PkgDetListType.
     * 
     * @return pkgStatus
     */
    public java.lang.String getPkgStatus() {
        return pkgStatus;
    }


    /**
     * Sets the pkgStatus value for this PkgDetListType.
     * 
     * @param pkgStatus
     */
    public void setPkgStatus(java.lang.String pkgStatus) {
        this.pkgStatus = pkgStatus;
    }


    /**
     * Gets the rolloverFlag value for this PkgDetListType.
     * 
     * @return rolloverFlag
     */
    public java.lang.String getRolloverFlag() {
        return rolloverFlag;
    }


    /**
     * Sets the rolloverFlag value for this PkgDetListType.
     * 
     * @param rolloverFlag
     */
    public void setRolloverFlag(java.lang.String rolloverFlag) {
        this.rolloverFlag = rolloverFlag;
    }


    /**
     * Gets the planType value for this PkgDetListType.
     * 
     * @return planType
     */
    public java.lang.String getPlanType() {
        return planType;
    }


    /**
     * Sets the planType value for this PkgDetListType.
     * 
     * @param planType
     */
    public void setPlanType(java.lang.String planType) {
        this.planType = planType;
    }


    /**
     * Gets the shelfDate value for this PkgDetListType.
     * 
     * @return shelfDate
     */
    public java.lang.String getShelfDate() {
        return shelfDate;
    }


    /**
     * Sets the shelfDate value for this PkgDetListType.
     * 
     * @param shelfDate
     */
    public void setShelfDate(java.lang.String shelfDate) {
        this.shelfDate = shelfDate;
    }


    /**
     * Gets the pkgAdonMaps value for this PkgDetListType.
     * 
     * @return pkgAdonMaps
     */
    public com.xius.xbus.messages.selfcare.communityaccountservice.PkgAdonsViewItemType[] getPkgAdonMaps() {
        return pkgAdonMaps;
    }


    /**
     * Sets the pkgAdonMaps value for this PkgDetListType.
     * 
     * @param pkgAdonMaps
     */
    public void setPkgAdonMaps(com.xius.xbus.messages.selfcare.communityaccountservice.PkgAdonsViewItemType[] pkgAdonMaps) {
        this.pkgAdonMaps = pkgAdonMaps;
    }


    /**
     * Gets the serPlanCalMaps value for this PkgDetListType.
     * 
     * @return serPlanCalMaps
     */
    public com.xius.xbus.messages.selfcare.communityaccountservice.SerPlanCaldrsViewItemType[] getSerPlanCalMaps() {
        return serPlanCalMaps;
    }


    /**
     * Sets the serPlanCalMaps value for this PkgDetListType.
     * 
     * @param serPlanCalMaps
     */
    public void setSerPlanCalMaps(com.xius.xbus.messages.selfcare.communityaccountservice.SerPlanCaldrsViewItemType[] serPlanCalMaps) {
        this.serPlanCalMaps = serPlanCalMaps;
    }


    /**
     * Gets the pkgServiceUnits value for this PkgDetListType.
     * 
     * @return pkgServiceUnits
     */
    public com.xius.xbus.messages.selfcare.communityaccountservice.PkgSrvcUtsViewItemType[] getPkgServiceUnits() {
        return pkgServiceUnits;
    }


    /**
     * Sets the pkgServiceUnits value for this PkgDetListType.
     * 
     * @param pkgServiceUnits
     */
    public void setPkgServiceUnits(com.xius.xbus.messages.selfcare.communityaccountservice.PkgSrvcUtsViewItemType[] pkgServiceUnits) {
        this.pkgServiceUnits = pkgServiceUnits;
    }


    /**
     * Gets the deviceInfo value for this PkgDetListType.
     * 
     * @return deviceInfo
     */
    public com.xius.xbus.messages.selfcare.communityaccountservice.DeviceGroupInfoType[] getDeviceInfo() {
        return deviceInfo;
    }


    /**
     * Sets the deviceInfo value for this PkgDetListType.
     * 
     * @param deviceInfo
     */
    public void setDeviceInfo(com.xius.xbus.messages.selfcare.communityaccountservice.DeviceGroupInfoType[] deviceInfo) {
        this.deviceInfo = deviceInfo;
    }


    /**
     * Gets the dataZoneInfo value for this PkgDetListType.
     * 
     * @return dataZoneInfo
     */
    public com.xius.xbus.messages.selfcare.communityaccountservice.DataZoneGroupInfoType[] getDataZoneInfo() {
        return dataZoneInfo;
    }


    /**
     * Sets the dataZoneInfo value for this PkgDetListType.
     * 
     * @param dataZoneInfo
     */
    public void setDataZoneInfo(com.xius.xbus.messages.selfcare.communityaccountservice.DataZoneGroupInfoType[] dataZoneInfo) {
        this.dataZoneInfo = dataZoneInfo;
    }


    /**
     * Gets the startDate value for this PkgDetListType.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this PkgDetListType.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the dataZoneMapYn value for this PkgDetListType.
     * 
     * @return dataZoneMapYn
     */
    public java.lang.String getDataZoneMapYn() {
        return dataZoneMapYn;
    }


    /**
     * Sets the dataZoneMapYn value for this PkgDetListType.
     * 
     * @param dataZoneMapYn
     */
    public void setDataZoneMapYn(java.lang.String dataZoneMapYn) {
        this.dataZoneMapYn = dataZoneMapYn;
    }


    /**
     * Gets the deviceMapYn value for this PkgDetListType.
     * 
     * @return deviceMapYn
     */
    public java.lang.String getDeviceMapYn() {
        return deviceMapYn;
    }


    /**
     * Sets the deviceMapYn value for this PkgDetListType.
     * 
     * @param deviceMapYn
     */
    public void setDeviceMapYn(java.lang.String deviceMapYn) {
        this.deviceMapYn = deviceMapYn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PkgDetListType)) return false;
        PkgDetListType other = (PkgDetListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pkgId==null && other.getPkgId()==null) || 
             (this.pkgId!=null &&
              this.pkgId.equals(other.getPkgId()))) &&
            ((this.pkgName==null && other.getPkgName()==null) || 
             (this.pkgName!=null &&
              this.pkgName.equals(other.getPkgName()))) &&
            ((this.defaultNoOfLines==null && other.getDefaultNoOfLines()==null) || 
             (this.defaultNoOfLines!=null &&
              this.defaultNoOfLines.equals(other.getDefaultNoOfLines()))) &&
            ((this.rentalAmt==null && other.getRentalAmt()==null) || 
             (this.rentalAmt!=null &&
              this.rentalAmt.equals(other.getRentalAmt()))) &&
            ((this.extraLineCharges==null && other.getExtraLineCharges()==null) || 
             (this.extraLineCharges!=null &&
              this.extraLineCharges.equals(other.getExtraLineCharges()))) &&
            ((this.homeNetworkId==null && other.getHomeNetworkId()==null) || 
             (this.homeNetworkId!=null &&
              this.homeNetworkId.equals(other.getHomeNetworkId()))) &&
            ((this.pkgStatus==null && other.getPkgStatus()==null) || 
             (this.pkgStatus!=null &&
              this.pkgStatus.equals(other.getPkgStatus()))) &&
            ((this.rolloverFlag==null && other.getRolloverFlag()==null) || 
             (this.rolloverFlag!=null &&
              this.rolloverFlag.equals(other.getRolloverFlag()))) &&
            ((this.planType==null && other.getPlanType()==null) || 
             (this.planType!=null &&
              this.planType.equals(other.getPlanType()))) &&
            ((this.shelfDate==null && other.getShelfDate()==null) || 
             (this.shelfDate!=null &&
              this.shelfDate.equals(other.getShelfDate()))) &&
            ((this.pkgAdonMaps==null && other.getPkgAdonMaps()==null) || 
             (this.pkgAdonMaps!=null &&
              java.util.Arrays.equals(this.pkgAdonMaps, other.getPkgAdonMaps()))) &&
            ((this.serPlanCalMaps==null && other.getSerPlanCalMaps()==null) || 
             (this.serPlanCalMaps!=null &&
              java.util.Arrays.equals(this.serPlanCalMaps, other.getSerPlanCalMaps()))) &&
            ((this.pkgServiceUnits==null && other.getPkgServiceUnits()==null) || 
             (this.pkgServiceUnits!=null &&
              java.util.Arrays.equals(this.pkgServiceUnits, other.getPkgServiceUnits()))) &&
            ((this.deviceInfo==null && other.getDeviceInfo()==null) || 
             (this.deviceInfo!=null &&
              java.util.Arrays.equals(this.deviceInfo, other.getDeviceInfo()))) &&
            ((this.dataZoneInfo==null && other.getDataZoneInfo()==null) || 
             (this.dataZoneInfo!=null &&
              java.util.Arrays.equals(this.dataZoneInfo, other.getDataZoneInfo()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.dataZoneMapYn==null && other.getDataZoneMapYn()==null) || 
             (this.dataZoneMapYn!=null &&
              this.dataZoneMapYn.equals(other.getDataZoneMapYn()))) &&
            ((this.deviceMapYn==null && other.getDeviceMapYn()==null) || 
             (this.deviceMapYn!=null &&
              this.deviceMapYn.equals(other.getDeviceMapYn())));
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
        if (getPkgId() != null) {
            _hashCode += getPkgId().hashCode();
        }
        if (getPkgName() != null) {
            _hashCode += getPkgName().hashCode();
        }
        if (getDefaultNoOfLines() != null) {
            _hashCode += getDefaultNoOfLines().hashCode();
        }
        if (getRentalAmt() != null) {
            _hashCode += getRentalAmt().hashCode();
        }
        if (getExtraLineCharges() != null) {
            _hashCode += getExtraLineCharges().hashCode();
        }
        if (getHomeNetworkId() != null) {
            _hashCode += getHomeNetworkId().hashCode();
        }
        if (getPkgStatus() != null) {
            _hashCode += getPkgStatus().hashCode();
        }
        if (getRolloverFlag() != null) {
            _hashCode += getRolloverFlag().hashCode();
        }
        if (getPlanType() != null) {
            _hashCode += getPlanType().hashCode();
        }
        if (getShelfDate() != null) {
            _hashCode += getShelfDate().hashCode();
        }
        if (getPkgAdonMaps() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPkgAdonMaps());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPkgAdonMaps(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSerPlanCalMaps() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSerPlanCalMaps());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSerPlanCalMaps(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPkgServiceUnits() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPkgServiceUnits());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPkgServiceUnits(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeviceInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeviceInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeviceInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDataZoneInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDataZoneInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDataZoneInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getDataZoneMapYn() != null) {
            _hashCode += getDataZoneMapYn().hashCode();
        }
        if (getDeviceMapYn() != null) {
            _hashCode += getDeviceMapYn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PkgDetListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "PkgDetListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pkgId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "pkgId"));
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
        elemField.setFieldName("defaultNoOfLines");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "defaultNoOfLines"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rentalAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "rentalAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extraLineCharges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "extraLineCharges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setFieldName("pkgStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "pkgStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rolloverFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "rolloverFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "planType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shelfDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "shelfDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pkgAdonMaps");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "pkgAdonMaps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "PkgAdonsViewItemType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "pkgAddOn"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serPlanCalMaps");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "serPlanCalMaps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "SerPlanCaldrsViewItemType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "servcPlanCalndr"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pkgServiceUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "pkgServiceUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "PkgSrvcUtsViewItemType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "pkgServcUnit"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "deviceInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "DeviceGroupInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "deviceGroupInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataZoneInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "dataZoneInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "DataZoneGroupInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "dataZoneGroupInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataZoneMapYn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "dataZoneMapYn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceMapYn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "deviceMapYn"));
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
