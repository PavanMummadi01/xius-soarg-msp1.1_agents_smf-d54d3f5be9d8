/**
 * PackageItemType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.CAManagement_xsd;

public class PackageItemType  implements java.io.Serializable {
    private java.lang.Long pkgId;

    private java.lang.String pkgName;

    private java.lang.Integer defaultNoOfLines;

    private java.math.BigDecimal rentalAmt;

    private java.math.BigDecimal extraLineCharges;

    private java.lang.String pkgStatus;

    /* This is will be used only in case of getPackage.
     * 						During create and modify package network id which in header
     * will
     * 						be used */
    private java.lang.Long homeNetworkId;

    /* Based on Roll over flag, unused amount of current
     * 						month will be transferred to next month */
    private java.lang.String rolloverFlag;

    /* Daily/weekly/Monthly/Yearly package */
    private java.lang.String planType;

    private java.lang.String shelfDate;

    private com.xius.billing.CAManagement_xsd.PkgAddOnViewItemType[] pkgAddons;

    private com.xius.billing.CAManagement_xsd.ServcPlanCalndrViewItemType[] servcPlanCalndrs;

    private com.xius.billing.CAManagement_xsd.PkgServcUnitsViewItemType[] pkgServcUnits;

    private com.xius.billing.CAManagement_xsd.DeviceGroupInfoType[] deviceInfo;

    private com.xius.billing.CAManagement_xsd.DataZoneGroupInfoType[] dataZoneInfo;

    private java.lang.String startDate;

    private java.lang.String dataZoneMapYn;

    private java.lang.String deviceMapYn;

    public PackageItemType() {
    }

    public PackageItemType(
           java.lang.Long pkgId,
           java.lang.String pkgName,
           java.lang.Integer defaultNoOfLines,
           java.math.BigDecimal rentalAmt,
           java.math.BigDecimal extraLineCharges,
           java.lang.String pkgStatus,
           java.lang.Long homeNetworkId,
           java.lang.String rolloverFlag,
           java.lang.String planType,
           java.lang.String shelfDate,
           com.xius.billing.CAManagement_xsd.PkgAddOnViewItemType[] pkgAddons,
           com.xius.billing.CAManagement_xsd.ServcPlanCalndrViewItemType[] servcPlanCalndrs,
           com.xius.billing.CAManagement_xsd.PkgServcUnitsViewItemType[] pkgServcUnits,
           com.xius.billing.CAManagement_xsd.DeviceGroupInfoType[] deviceInfo,
           com.xius.billing.CAManagement_xsd.DataZoneGroupInfoType[] dataZoneInfo,
           java.lang.String startDate,
           java.lang.String dataZoneMapYn,
           java.lang.String deviceMapYn) {
           this.pkgId = pkgId;
           this.pkgName = pkgName;
           this.defaultNoOfLines = defaultNoOfLines;
           this.rentalAmt = rentalAmt;
           this.extraLineCharges = extraLineCharges;
           this.pkgStatus = pkgStatus;
           this.homeNetworkId = homeNetworkId;
           this.rolloverFlag = rolloverFlag;
           this.planType = planType;
           this.shelfDate = shelfDate;
           this.pkgAddons = pkgAddons;
           this.servcPlanCalndrs = servcPlanCalndrs;
           this.pkgServcUnits = pkgServcUnits;
           this.deviceInfo = deviceInfo;
           this.dataZoneInfo = dataZoneInfo;
           this.startDate = startDate;
           this.dataZoneMapYn = dataZoneMapYn;
           this.deviceMapYn = deviceMapYn;
    }


    /**
     * Gets the pkgId value for this PackageItemType.
     * 
     * @return pkgId
     */
    public java.lang.Long getPkgId() {
        return pkgId;
    }


    /**
     * Sets the pkgId value for this PackageItemType.
     * 
     * @param pkgId
     */
    public void setPkgId(java.lang.Long pkgId) {
        this.pkgId = pkgId;
    }


    /**
     * Gets the pkgName value for this PackageItemType.
     * 
     * @return pkgName
     */
    public java.lang.String getPkgName() {
        return pkgName;
    }


    /**
     * Sets the pkgName value for this PackageItemType.
     * 
     * @param pkgName
     */
    public void setPkgName(java.lang.String pkgName) {
        this.pkgName = pkgName;
    }


    /**
     * Gets the defaultNoOfLines value for this PackageItemType.
     * 
     * @return defaultNoOfLines
     */
    public java.lang.Integer getDefaultNoOfLines() {
        return defaultNoOfLines;
    }


    /**
     * Sets the defaultNoOfLines value for this PackageItemType.
     * 
     * @param defaultNoOfLines
     */
    public void setDefaultNoOfLines(java.lang.Integer defaultNoOfLines) {
        this.defaultNoOfLines = defaultNoOfLines;
    }


    /**
     * Gets the rentalAmt value for this PackageItemType.
     * 
     * @return rentalAmt
     */
    public java.math.BigDecimal getRentalAmt() {
        return rentalAmt;
    }


    /**
     * Sets the rentalAmt value for this PackageItemType.
     * 
     * @param rentalAmt
     */
    public void setRentalAmt(java.math.BigDecimal rentalAmt) {
        this.rentalAmt = rentalAmt;
    }


    /**
     * Gets the extraLineCharges value for this PackageItemType.
     * 
     * @return extraLineCharges
     */
    public java.math.BigDecimal getExtraLineCharges() {
        return extraLineCharges;
    }


    /**
     * Sets the extraLineCharges value for this PackageItemType.
     * 
     * @param extraLineCharges
     */
    public void setExtraLineCharges(java.math.BigDecimal extraLineCharges) {
        this.extraLineCharges = extraLineCharges;
    }


    /**
     * Gets the pkgStatus value for this PackageItemType.
     * 
     * @return pkgStatus
     */
    public java.lang.String getPkgStatus() {
        return pkgStatus;
    }


    /**
     * Sets the pkgStatus value for this PackageItemType.
     * 
     * @param pkgStatus
     */
    public void setPkgStatus(java.lang.String pkgStatus) {
        this.pkgStatus = pkgStatus;
    }


    /**
     * Gets the homeNetworkId value for this PackageItemType.
     * 
     * @return homeNetworkId   * This is will be used only in case of getPackage.
     * 						During create and modify package network id which in header
     * will
     * 						be used
     */
    public java.lang.Long getHomeNetworkId() {
        return homeNetworkId;
    }


    /**
     * Sets the homeNetworkId value for this PackageItemType.
     * 
     * @param homeNetworkId   * This is will be used only in case of getPackage.
     * 						During create and modify package network id which in header
     * will
     * 						be used
     */
    public void setHomeNetworkId(java.lang.Long homeNetworkId) {
        this.homeNetworkId = homeNetworkId;
    }


    /**
     * Gets the rolloverFlag value for this PackageItemType.
     * 
     * @return rolloverFlag   * Based on Roll over flag, unused amount of current
     * 						month will be transferred to next month
     */
    public java.lang.String getRolloverFlag() {
        return rolloverFlag;
    }


    /**
     * Sets the rolloverFlag value for this PackageItemType.
     * 
     * @param rolloverFlag   * Based on Roll over flag, unused amount of current
     * 						month will be transferred to next month
     */
    public void setRolloverFlag(java.lang.String rolloverFlag) {
        this.rolloverFlag = rolloverFlag;
    }


    /**
     * Gets the planType value for this PackageItemType.
     * 
     * @return planType   * Daily/weekly/Monthly/Yearly package
     */
    public java.lang.String getPlanType() {
        return planType;
    }


    /**
     * Sets the planType value for this PackageItemType.
     * 
     * @param planType   * Daily/weekly/Monthly/Yearly package
     */
    public void setPlanType(java.lang.String planType) {
        this.planType = planType;
    }


    /**
     * Gets the shelfDate value for this PackageItemType.
     * 
     * @return shelfDate
     */
    public java.lang.String getShelfDate() {
        return shelfDate;
    }


    /**
     * Sets the shelfDate value for this PackageItemType.
     * 
     * @param shelfDate
     */
    public void setShelfDate(java.lang.String shelfDate) {
        this.shelfDate = shelfDate;
    }


    /**
     * Gets the pkgAddons value for this PackageItemType.
     * 
     * @return pkgAddons
     */
    public com.xius.billing.CAManagement_xsd.PkgAddOnViewItemType[] getPkgAddons() {
        return pkgAddons;
    }


    /**
     * Sets the pkgAddons value for this PackageItemType.
     * 
     * @param pkgAddons
     */
    public void setPkgAddons(com.xius.billing.CAManagement_xsd.PkgAddOnViewItemType[] pkgAddons) {
        this.pkgAddons = pkgAddons;
    }


    /**
     * Gets the servcPlanCalndrs value for this PackageItemType.
     * 
     * @return servcPlanCalndrs
     */
    public com.xius.billing.CAManagement_xsd.ServcPlanCalndrViewItemType[] getServcPlanCalndrs() {
        return servcPlanCalndrs;
    }


    /**
     * Sets the servcPlanCalndrs value for this PackageItemType.
     * 
     * @param servcPlanCalndrs
     */
    public void setServcPlanCalndrs(com.xius.billing.CAManagement_xsd.ServcPlanCalndrViewItemType[] servcPlanCalndrs) {
        this.servcPlanCalndrs = servcPlanCalndrs;
    }


    /**
     * Gets the pkgServcUnits value for this PackageItemType.
     * 
     * @return pkgServcUnits
     */
    public com.xius.billing.CAManagement_xsd.PkgServcUnitsViewItemType[] getPkgServcUnits() {
        return pkgServcUnits;
    }


    /**
     * Sets the pkgServcUnits value for this PackageItemType.
     * 
     * @param pkgServcUnits
     */
    public void setPkgServcUnits(com.xius.billing.CAManagement_xsd.PkgServcUnitsViewItemType[] pkgServcUnits) {
        this.pkgServcUnits = pkgServcUnits;
    }


    /**
     * Gets the deviceInfo value for this PackageItemType.
     * 
     * @return deviceInfo
     */
    public com.xius.billing.CAManagement_xsd.DeviceGroupInfoType[] getDeviceInfo() {
        return deviceInfo;
    }


    /**
     * Sets the deviceInfo value for this PackageItemType.
     * 
     * @param deviceInfo
     */
    public void setDeviceInfo(com.xius.billing.CAManagement_xsd.DeviceGroupInfoType[] deviceInfo) {
        this.deviceInfo = deviceInfo;
    }


    /**
     * Gets the dataZoneInfo value for this PackageItemType.
     * 
     * @return dataZoneInfo
     */
    public com.xius.billing.CAManagement_xsd.DataZoneGroupInfoType[] getDataZoneInfo() {
        return dataZoneInfo;
    }


    /**
     * Sets the dataZoneInfo value for this PackageItemType.
     * 
     * @param dataZoneInfo
     */
    public void setDataZoneInfo(com.xius.billing.CAManagement_xsd.DataZoneGroupInfoType[] dataZoneInfo) {
        this.dataZoneInfo = dataZoneInfo;
    }


    /**
     * Gets the startDate value for this PackageItemType.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this PackageItemType.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the dataZoneMapYn value for this PackageItemType.
     * 
     * @return dataZoneMapYn
     */
    public java.lang.String getDataZoneMapYn() {
        return dataZoneMapYn;
    }


    /**
     * Sets the dataZoneMapYn value for this PackageItemType.
     * 
     * @param dataZoneMapYn
     */
    public void setDataZoneMapYn(java.lang.String dataZoneMapYn) {
        this.dataZoneMapYn = dataZoneMapYn;
    }


    /**
     * Gets the deviceMapYn value for this PackageItemType.
     * 
     * @return deviceMapYn
     */
    public java.lang.String getDeviceMapYn() {
        return deviceMapYn;
    }


    /**
     * Sets the deviceMapYn value for this PackageItemType.
     * 
     * @param deviceMapYn
     */
    public void setDeviceMapYn(java.lang.String deviceMapYn) {
        this.deviceMapYn = deviceMapYn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PackageItemType)) return false;
        PackageItemType other = (PackageItemType) obj;
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
            ((this.pkgStatus==null && other.getPkgStatus()==null) || 
             (this.pkgStatus!=null &&
              this.pkgStatus.equals(other.getPkgStatus()))) &&
            ((this.homeNetworkId==null && other.getHomeNetworkId()==null) || 
             (this.homeNetworkId!=null &&
              this.homeNetworkId.equals(other.getHomeNetworkId()))) &&
            ((this.rolloverFlag==null && other.getRolloverFlag()==null) || 
             (this.rolloverFlag!=null &&
              this.rolloverFlag.equals(other.getRolloverFlag()))) &&
            ((this.planType==null && other.getPlanType()==null) || 
             (this.planType!=null &&
              this.planType.equals(other.getPlanType()))) &&
            ((this.shelfDate==null && other.getShelfDate()==null) || 
             (this.shelfDate!=null &&
              this.shelfDate.equals(other.getShelfDate()))) &&
            ((this.pkgAddons==null && other.getPkgAddons()==null) || 
             (this.pkgAddons!=null &&
              java.util.Arrays.equals(this.pkgAddons, other.getPkgAddons()))) &&
            ((this.servcPlanCalndrs==null && other.getServcPlanCalndrs()==null) || 
             (this.servcPlanCalndrs!=null &&
              java.util.Arrays.equals(this.servcPlanCalndrs, other.getServcPlanCalndrs()))) &&
            ((this.pkgServcUnits==null && other.getPkgServcUnits()==null) || 
             (this.pkgServcUnits!=null &&
              java.util.Arrays.equals(this.pkgServcUnits, other.getPkgServcUnits()))) &&
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
        if (getPkgStatus() != null) {
            _hashCode += getPkgStatus().hashCode();
        }
        if (getHomeNetworkId() != null) {
            _hashCode += getHomeNetworkId().hashCode();
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
        if (getPkgAddons() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPkgAddons());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPkgAddons(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getServcPlanCalndrs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServcPlanCalndrs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServcPlanCalndrs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPkgServcUnits() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPkgServcUnits());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPkgServcUnits(), i);
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
        new org.apache.axis.description.TypeDesc(PackageItemType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "PackageItemType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pkgId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "pkgId"));
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
        elemField.setFieldName("defaultNoOfLines");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "defaultNoOfLines"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rentalAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "rentalAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extraLineCharges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "extraLineCharges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pkgStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "pkgStatus"));
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
        elemField.setFieldName("rolloverFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "rolloverFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "planType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shelfDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "shelfDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pkgAddons");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "pkgAddons"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "PkgAddOnViewItemType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "pkgAddOn"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servcPlanCalndrs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "servcPlanCalndrs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "ServcPlanCalndrViewItemType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "servcPlanCalndr"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pkgServcUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "pkgServcUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "PkgServcUnitsViewItemType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "pkgServcUnit"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "deviceInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "DeviceGroupInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "feature"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataZoneInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "dataZoneInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "DataZoneGroupInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "feature"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataZoneMapYn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "dataZoneMapYn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceMapYn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "deviceMapYn"));
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
