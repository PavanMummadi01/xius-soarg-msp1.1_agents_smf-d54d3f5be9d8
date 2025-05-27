/**
 * PackageType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.CAManagement_xsd;

public class PackageType  implements java.io.Serializable {
    private java.lang.Long pkgId;

    private java.lang.String pkgName;

    private int defaultNoOfLines;

    private java.math.BigDecimal rentalAmt;

    private java.math.BigDecimal extraLineCharges;

    /* Based on Roll over flag, unused amount of current
     * 						month will be transferred to next month */
    private java.lang.String rolloverFlag;

    /* Daily/weekly/Monthly/Yearly package */
    private java.lang.String planType;

    private java.lang.String shelfDate;

    private com.xius.billing.CAManagement_xsd.PkgAddOnItemType[] pkgAddons;

    private com.xius.billing.CAManagement_xsd.ServcPlanCalndrItemType[] servcPlanCalndrs;

    private com.xius.billing.CAManagement_xsd.PkgServcUnitsItemType[] pkgServcUnits;

    private java.lang.String piPackageStartDate;

    private long[] piDeviceGroupIdArr;

    private long[] piDataZoneGroupIdArr;

    private java.math.BigDecimal[] piPkgUnitTopupChargeArr;

    public PackageType() {
    }

    public PackageType(
           java.lang.Long pkgId,
           java.lang.String pkgName,
           int defaultNoOfLines,
           java.math.BigDecimal rentalAmt,
           java.math.BigDecimal extraLineCharges,
           java.lang.String rolloverFlag,
           java.lang.String planType,
           java.lang.String shelfDate,
           com.xius.billing.CAManagement_xsd.PkgAddOnItemType[] pkgAddons,
           com.xius.billing.CAManagement_xsd.ServcPlanCalndrItemType[] servcPlanCalndrs,
           com.xius.billing.CAManagement_xsd.PkgServcUnitsItemType[] pkgServcUnits,
           java.lang.String piPackageStartDate,
           long[] piDeviceGroupIdArr,
           long[] piDataZoneGroupIdArr,
           java.math.BigDecimal[] piPkgUnitTopupChargeArr) {
           this.pkgId = pkgId;
           this.pkgName = pkgName;
           this.defaultNoOfLines = defaultNoOfLines;
           this.rentalAmt = rentalAmt;
           this.extraLineCharges = extraLineCharges;
           this.rolloverFlag = rolloverFlag;
           this.planType = planType;
           this.shelfDate = shelfDate;
           this.pkgAddons = pkgAddons;
           this.servcPlanCalndrs = servcPlanCalndrs;
           this.pkgServcUnits = pkgServcUnits;
           this.piPackageStartDate = piPackageStartDate;
           this.piDeviceGroupIdArr = piDeviceGroupIdArr;
           this.piDataZoneGroupIdArr = piDataZoneGroupIdArr;
           this.piPkgUnitTopupChargeArr = piPkgUnitTopupChargeArr;
    }


    /**
     * Gets the pkgId value for this PackageType.
     * 
     * @return pkgId
     */
    public java.lang.Long getPkgId() {
        return pkgId;
    }


    /**
     * Sets the pkgId value for this PackageType.
     * 
     * @param pkgId
     */
    public void setPkgId(java.lang.Long pkgId) {
        this.pkgId = pkgId;
    }


    /**
     * Gets the pkgName value for this PackageType.
     * 
     * @return pkgName
     */
    public java.lang.String getPkgName() {
        return pkgName;
    }


    /**
     * Sets the pkgName value for this PackageType.
     * 
     * @param pkgName
     */
    public void setPkgName(java.lang.String pkgName) {
        this.pkgName = pkgName;
    }


    /**
     * Gets the defaultNoOfLines value for this PackageType.
     * 
     * @return defaultNoOfLines
     */
    public int getDefaultNoOfLines() {
        return defaultNoOfLines;
    }


    /**
     * Sets the defaultNoOfLines value for this PackageType.
     * 
     * @param defaultNoOfLines
     */
    public void setDefaultNoOfLines(int defaultNoOfLines) {
        this.defaultNoOfLines = defaultNoOfLines;
    }


    /**
     * Gets the rentalAmt value for this PackageType.
     * 
     * @return rentalAmt
     */
    public java.math.BigDecimal getRentalAmt() {
        return rentalAmt;
    }


    /**
     * Sets the rentalAmt value for this PackageType.
     * 
     * @param rentalAmt
     */
    public void setRentalAmt(java.math.BigDecimal rentalAmt) {
        this.rentalAmt = rentalAmt;
    }


    /**
     * Gets the extraLineCharges value for this PackageType.
     * 
     * @return extraLineCharges
     */
    public java.math.BigDecimal getExtraLineCharges() {
        return extraLineCharges;
    }


    /**
     * Sets the extraLineCharges value for this PackageType.
     * 
     * @param extraLineCharges
     */
    public void setExtraLineCharges(java.math.BigDecimal extraLineCharges) {
        this.extraLineCharges = extraLineCharges;
    }


    /**
     * Gets the rolloverFlag value for this PackageType.
     * 
     * @return rolloverFlag   * Based on Roll over flag, unused amount of current
     * 						month will be transferred to next month
     */
    public java.lang.String getRolloverFlag() {
        return rolloverFlag;
    }


    /**
     * Sets the rolloverFlag value for this PackageType.
     * 
     * @param rolloverFlag   * Based on Roll over flag, unused amount of current
     * 						month will be transferred to next month
     */
    public void setRolloverFlag(java.lang.String rolloverFlag) {
        this.rolloverFlag = rolloverFlag;
    }


    /**
     * Gets the planType value for this PackageType.
     * 
     * @return planType   * Daily/weekly/Monthly/Yearly package
     */
    public java.lang.String getPlanType() {
        return planType;
    }


    /**
     * Sets the planType value for this PackageType.
     * 
     * @param planType   * Daily/weekly/Monthly/Yearly package
     */
    public void setPlanType(java.lang.String planType) {
        this.planType = planType;
    }


    /**
     * Gets the shelfDate value for this PackageType.
     * 
     * @return shelfDate
     */
    public java.lang.String getShelfDate() {
        return shelfDate;
    }


    /**
     * Sets the shelfDate value for this PackageType.
     * 
     * @param shelfDate
     */
    public void setShelfDate(java.lang.String shelfDate) {
        this.shelfDate = shelfDate;
    }


    /**
     * Gets the pkgAddons value for this PackageType.
     * 
     * @return pkgAddons
     */
    public com.xius.billing.CAManagement_xsd.PkgAddOnItemType[] getPkgAddons() {
        return pkgAddons;
    }


    /**
     * Sets the pkgAddons value for this PackageType.
     * 
     * @param pkgAddons
     */
    public void setPkgAddons(com.xius.billing.CAManagement_xsd.PkgAddOnItemType[] pkgAddons) {
        this.pkgAddons = pkgAddons;
    }


    /**
     * Gets the servcPlanCalndrs value for this PackageType.
     * 
     * @return servcPlanCalndrs
     */
    public com.xius.billing.CAManagement_xsd.ServcPlanCalndrItemType[] getServcPlanCalndrs() {
        return servcPlanCalndrs;
    }


    /**
     * Sets the servcPlanCalndrs value for this PackageType.
     * 
     * @param servcPlanCalndrs
     */
    public void setServcPlanCalndrs(com.xius.billing.CAManagement_xsd.ServcPlanCalndrItemType[] servcPlanCalndrs) {
        this.servcPlanCalndrs = servcPlanCalndrs;
    }


    /**
     * Gets the pkgServcUnits value for this PackageType.
     * 
     * @return pkgServcUnits
     */
    public com.xius.billing.CAManagement_xsd.PkgServcUnitsItemType[] getPkgServcUnits() {
        return pkgServcUnits;
    }


    /**
     * Sets the pkgServcUnits value for this PackageType.
     * 
     * @param pkgServcUnits
     */
    public void setPkgServcUnits(com.xius.billing.CAManagement_xsd.PkgServcUnitsItemType[] pkgServcUnits) {
        this.pkgServcUnits = pkgServcUnits;
    }


    /**
     * Gets the piPackageStartDate value for this PackageType.
     * 
     * @return piPackageStartDate
     */
    public java.lang.String getPiPackageStartDate() {
        return piPackageStartDate;
    }


    /**
     * Sets the piPackageStartDate value for this PackageType.
     * 
     * @param piPackageStartDate
     */
    public void setPiPackageStartDate(java.lang.String piPackageStartDate) {
        this.piPackageStartDate = piPackageStartDate;
    }


    /**
     * Gets the piDeviceGroupIdArr value for this PackageType.
     * 
     * @return piDeviceGroupIdArr
     */
    public long[] getPiDeviceGroupIdArr() {
        return piDeviceGroupIdArr;
    }


    /**
     * Sets the piDeviceGroupIdArr value for this PackageType.
     * 
     * @param piDeviceGroupIdArr
     */
    public void setPiDeviceGroupIdArr(long[] piDeviceGroupIdArr) {
        this.piDeviceGroupIdArr = piDeviceGroupIdArr;
    }

    public long getPiDeviceGroupIdArr(int i) {
        return this.piDeviceGroupIdArr[i];
    }

    public void setPiDeviceGroupIdArr(int i, long _value) {
        this.piDeviceGroupIdArr[i] = _value;
    }


    /**
     * Gets the piDataZoneGroupIdArr value for this PackageType.
     * 
     * @return piDataZoneGroupIdArr
     */
    public long[] getPiDataZoneGroupIdArr() {
        return piDataZoneGroupIdArr;
    }


    /**
     * Sets the piDataZoneGroupIdArr value for this PackageType.
     * 
     * @param piDataZoneGroupIdArr
     */
    public void setPiDataZoneGroupIdArr(long[] piDataZoneGroupIdArr) {
        this.piDataZoneGroupIdArr = piDataZoneGroupIdArr;
    }

    public long getPiDataZoneGroupIdArr(int i) {
        return this.piDataZoneGroupIdArr[i];
    }

    public void setPiDataZoneGroupIdArr(int i, long _value) {
        this.piDataZoneGroupIdArr[i] = _value;
    }


    /**
     * Gets the piPkgUnitTopupChargeArr value for this PackageType.
     * 
     * @return piPkgUnitTopupChargeArr
     */
    public java.math.BigDecimal[] getPiPkgUnitTopupChargeArr() {
        return piPkgUnitTopupChargeArr;
    }


    /**
     * Sets the piPkgUnitTopupChargeArr value for this PackageType.
     * 
     * @param piPkgUnitTopupChargeArr
     */
    public void setPiPkgUnitTopupChargeArr(java.math.BigDecimal[] piPkgUnitTopupChargeArr) {
        this.piPkgUnitTopupChargeArr = piPkgUnitTopupChargeArr;
    }

    public java.math.BigDecimal getPiPkgUnitTopupChargeArr(int i) {
        return this.piPkgUnitTopupChargeArr[i];
    }

    public void setPiPkgUnitTopupChargeArr(int i, java.math.BigDecimal _value) {
        this.piPkgUnitTopupChargeArr[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PackageType)) return false;
        PackageType other = (PackageType) obj;
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
            this.defaultNoOfLines == other.getDefaultNoOfLines() &&
            ((this.rentalAmt==null && other.getRentalAmt()==null) || 
             (this.rentalAmt!=null &&
              this.rentalAmt.equals(other.getRentalAmt()))) &&
            ((this.extraLineCharges==null && other.getExtraLineCharges()==null) || 
             (this.extraLineCharges!=null &&
              this.extraLineCharges.equals(other.getExtraLineCharges()))) &&
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
            ((this.piPackageStartDate==null && other.getPiPackageStartDate()==null) || 
             (this.piPackageStartDate!=null &&
              this.piPackageStartDate.equals(other.getPiPackageStartDate()))) &&
            ((this.piDeviceGroupIdArr==null && other.getPiDeviceGroupIdArr()==null) || 
             (this.piDeviceGroupIdArr!=null &&
              java.util.Arrays.equals(this.piDeviceGroupIdArr, other.getPiDeviceGroupIdArr()))) &&
            ((this.piDataZoneGroupIdArr==null && other.getPiDataZoneGroupIdArr()==null) || 
             (this.piDataZoneGroupIdArr!=null &&
              java.util.Arrays.equals(this.piDataZoneGroupIdArr, other.getPiDataZoneGroupIdArr()))) &&
            ((this.piPkgUnitTopupChargeArr==null && other.getPiPkgUnitTopupChargeArr()==null) || 
             (this.piPkgUnitTopupChargeArr!=null &&
              java.util.Arrays.equals(this.piPkgUnitTopupChargeArr, other.getPiPkgUnitTopupChargeArr())));
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
        _hashCode += getDefaultNoOfLines();
        if (getRentalAmt() != null) {
            _hashCode += getRentalAmt().hashCode();
        }
        if (getExtraLineCharges() != null) {
            _hashCode += getExtraLineCharges().hashCode();
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
        if (getPiPackageStartDate() != null) {
            _hashCode += getPiPackageStartDate().hashCode();
        }
        if (getPiDeviceGroupIdArr() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPiDeviceGroupIdArr());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPiDeviceGroupIdArr(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPiDataZoneGroupIdArr() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPiDataZoneGroupIdArr());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPiDataZoneGroupIdArr(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPiPkgUnitTopupChargeArr() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPiPkgUnitTopupChargeArr());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPiPkgUnitTopupChargeArr(), i);
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
        new org.apache.axis.description.TypeDesc(PackageType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "PackageType"));
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
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultNoOfLines");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "defaultNoOfLines"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pkgAddons");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "pkgAddons"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "PkgAddOnItemType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "pkgAddOn"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servcPlanCalndrs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "servcPlanCalndrs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "ServcPlanCalndrItemType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "servcPlanCalndr"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pkgServcUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "pkgServcUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "PkgServcUnitsItemType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "pkgServcUnit"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("piPackageStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "piPackageStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("piDeviceGroupIdArr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "piDeviceGroupIdArr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("piDataZoneGroupIdArr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "piDataZoneGroupIdArr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("piPkgUnitTopupChargeArr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "piPkgUnitTopupChargeArr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
