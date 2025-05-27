/**
 * PackageInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.selfcare.communityaccountservice;

public class PackageInfoType  implements java.io.Serializable {
    private java.lang.Long pkgId;

    private java.lang.String pkgName;

    private int defaultNoOfLines;

    private java.math.BigDecimal rentalAmt;

    private java.math.BigDecimal extraLineCharges;

    private java.lang.String planType;

    private java.lang.String rolloverFlag;

    private java.lang.String shelfDate;

    private com.xius.xbus.messages.selfcare.communityaccountservice.PkgAdOnMapType[] pkgAdonMaps;

    private com.xius.xbus.messages.selfcare.communityaccountservice.SerPlanCalMapType[] serPlanCalMaps;

    private com.xius.xbus.messages.selfcare.communityaccountservice.PkgSrvcUnitsItemsType[] pkgServiceUnits;

    private java.lang.String packageStartDate;

    private long[] deviceGroupIdArr;

    private long[] dataZoneGroupIdArr;

    public PackageInfoType() {
    }

    public PackageInfoType(
           java.lang.Long pkgId,
           java.lang.String pkgName,
           int defaultNoOfLines,
           java.math.BigDecimal rentalAmt,
           java.math.BigDecimal extraLineCharges,
           java.lang.String planType,
           java.lang.String rolloverFlag,
           java.lang.String shelfDate,
           com.xius.xbus.messages.selfcare.communityaccountservice.PkgAdOnMapType[] pkgAdonMaps,
           com.xius.xbus.messages.selfcare.communityaccountservice.SerPlanCalMapType[] serPlanCalMaps,
           com.xius.xbus.messages.selfcare.communityaccountservice.PkgSrvcUnitsItemsType[] pkgServiceUnits,
           java.lang.String packageStartDate,
           long[] deviceGroupIdArr,
           long[] dataZoneGroupIdArr) {
           this.pkgId = pkgId;
           this.pkgName = pkgName;
           this.defaultNoOfLines = defaultNoOfLines;
           this.rentalAmt = rentalAmt;
           this.extraLineCharges = extraLineCharges;
           this.planType = planType;
           this.rolloverFlag = rolloverFlag;
           this.shelfDate = shelfDate;
           this.pkgAdonMaps = pkgAdonMaps;
           this.serPlanCalMaps = serPlanCalMaps;
           this.pkgServiceUnits = pkgServiceUnits;
           this.packageStartDate = packageStartDate;
           this.deviceGroupIdArr = deviceGroupIdArr;
           this.dataZoneGroupIdArr = dataZoneGroupIdArr;
    }


    /**
     * Gets the pkgId value for this PackageInfoType.
     * 
     * @return pkgId
     */
    public java.lang.Long getPkgId() {
        return pkgId;
    }


    /**
     * Sets the pkgId value for this PackageInfoType.
     * 
     * @param pkgId
     */
    public void setPkgId(java.lang.Long pkgId) {
        this.pkgId = pkgId;
    }


    /**
     * Gets the pkgName value for this PackageInfoType.
     * 
     * @return pkgName
     */
    public java.lang.String getPkgName() {
        return pkgName;
    }


    /**
     * Sets the pkgName value for this PackageInfoType.
     * 
     * @param pkgName
     */
    public void setPkgName(java.lang.String pkgName) {
        this.pkgName = pkgName;
    }


    /**
     * Gets the defaultNoOfLines value for this PackageInfoType.
     * 
     * @return defaultNoOfLines
     */
    public int getDefaultNoOfLines() {
        return defaultNoOfLines;
    }


    /**
     * Sets the defaultNoOfLines value for this PackageInfoType.
     * 
     * @param defaultNoOfLines
     */
    public void setDefaultNoOfLines(int defaultNoOfLines) {
        this.defaultNoOfLines = defaultNoOfLines;
    }


    /**
     * Gets the rentalAmt value for this PackageInfoType.
     * 
     * @return rentalAmt
     */
    public java.math.BigDecimal getRentalAmt() {
        return rentalAmt;
    }


    /**
     * Sets the rentalAmt value for this PackageInfoType.
     * 
     * @param rentalAmt
     */
    public void setRentalAmt(java.math.BigDecimal rentalAmt) {
        this.rentalAmt = rentalAmt;
    }


    /**
     * Gets the extraLineCharges value for this PackageInfoType.
     * 
     * @return extraLineCharges
     */
    public java.math.BigDecimal getExtraLineCharges() {
        return extraLineCharges;
    }


    /**
     * Sets the extraLineCharges value for this PackageInfoType.
     * 
     * @param extraLineCharges
     */
    public void setExtraLineCharges(java.math.BigDecimal extraLineCharges) {
        this.extraLineCharges = extraLineCharges;
    }


    /**
     * Gets the planType value for this PackageInfoType.
     * 
     * @return planType
     */
    public java.lang.String getPlanType() {
        return planType;
    }


    /**
     * Sets the planType value for this PackageInfoType.
     * 
     * @param planType
     */
    public void setPlanType(java.lang.String planType) {
        this.planType = planType;
    }


    /**
     * Gets the rolloverFlag value for this PackageInfoType.
     * 
     * @return rolloverFlag
     */
    public java.lang.String getRolloverFlag() {
        return rolloverFlag;
    }


    /**
     * Sets the rolloverFlag value for this PackageInfoType.
     * 
     * @param rolloverFlag
     */
    public void setRolloverFlag(java.lang.String rolloverFlag) {
        this.rolloverFlag = rolloverFlag;
    }


    /**
     * Gets the shelfDate value for this PackageInfoType.
     * 
     * @return shelfDate
     */
    public java.lang.String getShelfDate() {
        return shelfDate;
    }


    /**
     * Sets the shelfDate value for this PackageInfoType.
     * 
     * @param shelfDate
     */
    public void setShelfDate(java.lang.String shelfDate) {
        this.shelfDate = shelfDate;
    }


    /**
     * Gets the pkgAdonMaps value for this PackageInfoType.
     * 
     * @return pkgAdonMaps
     */
    public com.xius.xbus.messages.selfcare.communityaccountservice.PkgAdOnMapType[] getPkgAdonMaps() {
        return pkgAdonMaps;
    }


    /**
     * Sets the pkgAdonMaps value for this PackageInfoType.
     * 
     * @param pkgAdonMaps
     */
    public void setPkgAdonMaps(com.xius.xbus.messages.selfcare.communityaccountservice.PkgAdOnMapType[] pkgAdonMaps) {
        this.pkgAdonMaps = pkgAdonMaps;
    }


    /**
     * Gets the serPlanCalMaps value for this PackageInfoType.
     * 
     * @return serPlanCalMaps
     */
    public com.xius.xbus.messages.selfcare.communityaccountservice.SerPlanCalMapType[] getSerPlanCalMaps() {
        return serPlanCalMaps;
    }


    /**
     * Sets the serPlanCalMaps value for this PackageInfoType.
     * 
     * @param serPlanCalMaps
     */
    public void setSerPlanCalMaps(com.xius.xbus.messages.selfcare.communityaccountservice.SerPlanCalMapType[] serPlanCalMaps) {
        this.serPlanCalMaps = serPlanCalMaps;
    }


    /**
     * Gets the pkgServiceUnits value for this PackageInfoType.
     * 
     * @return pkgServiceUnits
     */
    public com.xius.xbus.messages.selfcare.communityaccountservice.PkgSrvcUnitsItemsType[] getPkgServiceUnits() {
        return pkgServiceUnits;
    }


    /**
     * Sets the pkgServiceUnits value for this PackageInfoType.
     * 
     * @param pkgServiceUnits
     */
    public void setPkgServiceUnits(com.xius.xbus.messages.selfcare.communityaccountservice.PkgSrvcUnitsItemsType[] pkgServiceUnits) {
        this.pkgServiceUnits = pkgServiceUnits;
    }


    /**
     * Gets the packageStartDate value for this PackageInfoType.
     * 
     * @return packageStartDate
     */
    public java.lang.String getPackageStartDate() {
        return packageStartDate;
    }


    /**
     * Sets the packageStartDate value for this PackageInfoType.
     * 
     * @param packageStartDate
     */
    public void setPackageStartDate(java.lang.String packageStartDate) {
        this.packageStartDate = packageStartDate;
    }


    /**
     * Gets the deviceGroupIdArr value for this PackageInfoType.
     * 
     * @return deviceGroupIdArr
     */
    public long[] getDeviceGroupIdArr() {
        return deviceGroupIdArr;
    }


    /**
     * Sets the deviceGroupIdArr value for this PackageInfoType.
     * 
     * @param deviceGroupIdArr
     */
    public void setDeviceGroupIdArr(long[] deviceGroupIdArr) {
        this.deviceGroupIdArr = deviceGroupIdArr;
    }

    public long getDeviceGroupIdArr(int i) {
        return this.deviceGroupIdArr[i];
    }

    public void setDeviceGroupIdArr(int i, long _value) {
        this.deviceGroupIdArr[i] = _value;
    }


    /**
     * Gets the dataZoneGroupIdArr value for this PackageInfoType.
     * 
     * @return dataZoneGroupIdArr
     */
    public long[] getDataZoneGroupIdArr() {
        return dataZoneGroupIdArr;
    }


    /**
     * Sets the dataZoneGroupIdArr value for this PackageInfoType.
     * 
     * @param dataZoneGroupIdArr
     */
    public void setDataZoneGroupIdArr(long[] dataZoneGroupIdArr) {
        this.dataZoneGroupIdArr = dataZoneGroupIdArr;
    }

    public long getDataZoneGroupIdArr(int i) {
        return this.dataZoneGroupIdArr[i];
    }

    public void setDataZoneGroupIdArr(int i, long _value) {
        this.dataZoneGroupIdArr[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PackageInfoType)) return false;
        PackageInfoType other = (PackageInfoType) obj;
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
            ((this.planType==null && other.getPlanType()==null) || 
             (this.planType!=null &&
              this.planType.equals(other.getPlanType()))) &&
            ((this.rolloverFlag==null && other.getRolloverFlag()==null) || 
             (this.rolloverFlag!=null &&
              this.rolloverFlag.equals(other.getRolloverFlag()))) &&
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
            ((this.packageStartDate==null && other.getPackageStartDate()==null) || 
             (this.packageStartDate!=null &&
              this.packageStartDate.equals(other.getPackageStartDate()))) &&
            ((this.deviceGroupIdArr==null && other.getDeviceGroupIdArr()==null) || 
             (this.deviceGroupIdArr!=null &&
              java.util.Arrays.equals(this.deviceGroupIdArr, other.getDeviceGroupIdArr()))) &&
            ((this.dataZoneGroupIdArr==null && other.getDataZoneGroupIdArr()==null) || 
             (this.dataZoneGroupIdArr!=null &&
              java.util.Arrays.equals(this.dataZoneGroupIdArr, other.getDataZoneGroupIdArr())));
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
        if (getPlanType() != null) {
            _hashCode += getPlanType().hashCode();
        }
        if (getRolloverFlag() != null) {
            _hashCode += getRolloverFlag().hashCode();
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
        if (getPackageStartDate() != null) {
            _hashCode += getPackageStartDate().hashCode();
        }
        if (getDeviceGroupIdArr() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeviceGroupIdArr());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeviceGroupIdArr(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDataZoneGroupIdArr() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDataZoneGroupIdArr());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDataZoneGroupIdArr(), i);
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
        new org.apache.axis.description.TypeDesc(PackageInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "PackageInfoType"));
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
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultNoOfLines");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "defaultNoOfLines"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("rolloverFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "rolloverFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shelfDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "shelfDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pkgAdonMaps");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "pkgAdonMaps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "PkgAdOnMapType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "pkgAdOnMap"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serPlanCalMaps");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "serPlanCalMaps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "SerPlanCalMapType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "serPlanCalMap"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pkgServiceUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "pkgServiceUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "PkgSrvcUnitsItemsType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "pkgServcUnit"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "packageStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceGroupIdArr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "deviceGroupIdArr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataZoneGroupIdArr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "dataZoneGroupIdArr"));
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
