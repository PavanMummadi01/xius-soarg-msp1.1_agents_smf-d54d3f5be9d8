/**
 * IMEIEnquiryResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.TIAManagement_xsd;

public class IMEIEnquiryResponse  implements java.io.Serializable {
    private com.xius.tia.TIAManagement_xsd.ResponseDataType responseData;

    private java.lang.String GSMARefCode;

    private java.lang.String GSMAStatus;

    private java.lang.String deviceId;

    private java.lang.String partnerId;

    private java.lang.String branchId;

    private java.lang.String recordIdentifier;

    private java.lang.String blacklistStatus;

    private java.lang.String greylistStatus;

    private java.lang.String manufacturer;

    private java.lang.String brandName;

    private java.lang.String marketingName;

    private java.lang.String modelName;

    private java.lang.String band;

    private java.lang.String operatingSys;

    private java.lang.String nfc;

    private java.lang.String bluetooth;

    private java.lang.String WLAN;

    private java.lang.String deviceType;

    private com.xius.tia.TIAManagement_xsd.IMEIHistoryType[] IMEIHistory;

    public IMEIEnquiryResponse() {
    }

    public IMEIEnquiryResponse(
           com.xius.tia.TIAManagement_xsd.ResponseDataType responseData,
           java.lang.String GSMARefCode,
           java.lang.String GSMAStatus,
           java.lang.String deviceId,
           java.lang.String partnerId,
           java.lang.String branchId,
           java.lang.String recordIdentifier,
           java.lang.String blacklistStatus,
           java.lang.String greylistStatus,
           java.lang.String manufacturer,
           java.lang.String brandName,
           java.lang.String marketingName,
           java.lang.String modelName,
           java.lang.String band,
           java.lang.String operatingSys,
           java.lang.String nfc,
           java.lang.String bluetooth,
           java.lang.String WLAN,
           java.lang.String deviceType,
           com.xius.tia.TIAManagement_xsd.IMEIHistoryType[] IMEIHistory) {
           this.responseData = responseData;
           this.GSMARefCode = GSMARefCode;
           this.GSMAStatus = GSMAStatus;
           this.deviceId = deviceId;
           this.partnerId = partnerId;
           this.branchId = branchId;
           this.recordIdentifier = recordIdentifier;
           this.blacklistStatus = blacklistStatus;
           this.greylistStatus = greylistStatus;
           this.manufacturer = manufacturer;
           this.brandName = brandName;
           this.marketingName = marketingName;
           this.modelName = modelName;
           this.band = band;
           this.operatingSys = operatingSys;
           this.nfc = nfc;
           this.bluetooth = bluetooth;
           this.WLAN = WLAN;
           this.deviceType = deviceType;
           this.IMEIHistory = IMEIHistory;
    }


    /**
     * Gets the responseData value for this IMEIEnquiryResponse.
     * 
     * @return responseData
     */
    public com.xius.tia.TIAManagement_xsd.ResponseDataType getResponseData() {
        return responseData;
    }


    /**
     * Sets the responseData value for this IMEIEnquiryResponse.
     * 
     * @param responseData
     */
    public void setResponseData(com.xius.tia.TIAManagement_xsd.ResponseDataType responseData) {
        this.responseData = responseData;
    }


    /**
     * Gets the GSMARefCode value for this IMEIEnquiryResponse.
     * 
     * @return GSMARefCode
     */
    public java.lang.String getGSMARefCode() {
        return GSMARefCode;
    }


    /**
     * Sets the GSMARefCode value for this IMEIEnquiryResponse.
     * 
     * @param GSMARefCode
     */
    public void setGSMARefCode(java.lang.String GSMARefCode) {
        this.GSMARefCode = GSMARefCode;
    }


    /**
     * Gets the GSMAStatus value for this IMEIEnquiryResponse.
     * 
     * @return GSMAStatus
     */
    public java.lang.String getGSMAStatus() {
        return GSMAStatus;
    }


    /**
     * Sets the GSMAStatus value for this IMEIEnquiryResponse.
     * 
     * @param GSMAStatus
     */
    public void setGSMAStatus(java.lang.String GSMAStatus) {
        this.GSMAStatus = GSMAStatus;
    }


    /**
     * Gets the deviceId value for this IMEIEnquiryResponse.
     * 
     * @return deviceId
     */
    public java.lang.String getDeviceId() {
        return deviceId;
    }


    /**
     * Sets the deviceId value for this IMEIEnquiryResponse.
     * 
     * @param deviceId
     */
    public void setDeviceId(java.lang.String deviceId) {
        this.deviceId = deviceId;
    }


    /**
     * Gets the partnerId value for this IMEIEnquiryResponse.
     * 
     * @return partnerId
     */
    public java.lang.String getPartnerId() {
        return partnerId;
    }


    /**
     * Sets the partnerId value for this IMEIEnquiryResponse.
     * 
     * @param partnerId
     */
    public void setPartnerId(java.lang.String partnerId) {
        this.partnerId = partnerId;
    }


    /**
     * Gets the branchId value for this IMEIEnquiryResponse.
     * 
     * @return branchId
     */
    public java.lang.String getBranchId() {
        return branchId;
    }


    /**
     * Sets the branchId value for this IMEIEnquiryResponse.
     * 
     * @param branchId
     */
    public void setBranchId(java.lang.String branchId) {
        this.branchId = branchId;
    }


    /**
     * Gets the recordIdentifier value for this IMEIEnquiryResponse.
     * 
     * @return recordIdentifier
     */
    public java.lang.String getRecordIdentifier() {
        return recordIdentifier;
    }


    /**
     * Sets the recordIdentifier value for this IMEIEnquiryResponse.
     * 
     * @param recordIdentifier
     */
    public void setRecordIdentifier(java.lang.String recordIdentifier) {
        this.recordIdentifier = recordIdentifier;
    }


    /**
     * Gets the blacklistStatus value for this IMEIEnquiryResponse.
     * 
     * @return blacklistStatus
     */
    public java.lang.String getBlacklistStatus() {
        return blacklistStatus;
    }


    /**
     * Sets the blacklistStatus value for this IMEIEnquiryResponse.
     * 
     * @param blacklistStatus
     */
    public void setBlacklistStatus(java.lang.String blacklistStatus) {
        this.blacklistStatus = blacklistStatus;
    }


    /**
     * Gets the greylistStatus value for this IMEIEnquiryResponse.
     * 
     * @return greylistStatus
     */
    public java.lang.String getGreylistStatus() {
        return greylistStatus;
    }


    /**
     * Sets the greylistStatus value for this IMEIEnquiryResponse.
     * 
     * @param greylistStatus
     */
    public void setGreylistStatus(java.lang.String greylistStatus) {
        this.greylistStatus = greylistStatus;
    }


    /**
     * Gets the manufacturer value for this IMEIEnquiryResponse.
     * 
     * @return manufacturer
     */
    public java.lang.String getManufacturer() {
        return manufacturer;
    }


    /**
     * Sets the manufacturer value for this IMEIEnquiryResponse.
     * 
     * @param manufacturer
     */
    public void setManufacturer(java.lang.String manufacturer) {
        this.manufacturer = manufacturer;
    }


    /**
     * Gets the brandName value for this IMEIEnquiryResponse.
     * 
     * @return brandName
     */
    public java.lang.String getBrandName() {
        return brandName;
    }


    /**
     * Sets the brandName value for this IMEIEnquiryResponse.
     * 
     * @param brandName
     */
    public void setBrandName(java.lang.String brandName) {
        this.brandName = brandName;
    }


    /**
     * Gets the marketingName value for this IMEIEnquiryResponse.
     * 
     * @return marketingName
     */
    public java.lang.String getMarketingName() {
        return marketingName;
    }


    /**
     * Sets the marketingName value for this IMEIEnquiryResponse.
     * 
     * @param marketingName
     */
    public void setMarketingName(java.lang.String marketingName) {
        this.marketingName = marketingName;
    }


    /**
     * Gets the modelName value for this IMEIEnquiryResponse.
     * 
     * @return modelName
     */
    public java.lang.String getModelName() {
        return modelName;
    }


    /**
     * Sets the modelName value for this IMEIEnquiryResponse.
     * 
     * @param modelName
     */
    public void setModelName(java.lang.String modelName) {
        this.modelName = modelName;
    }


    /**
     * Gets the band value for this IMEIEnquiryResponse.
     * 
     * @return band
     */
    public java.lang.String getBand() {
        return band;
    }


    /**
     * Sets the band value for this IMEIEnquiryResponse.
     * 
     * @param band
     */
    public void setBand(java.lang.String band) {
        this.band = band;
    }


    /**
     * Gets the operatingSys value for this IMEIEnquiryResponse.
     * 
     * @return operatingSys
     */
    public java.lang.String getOperatingSys() {
        return operatingSys;
    }


    /**
     * Sets the operatingSys value for this IMEIEnquiryResponse.
     * 
     * @param operatingSys
     */
    public void setOperatingSys(java.lang.String operatingSys) {
        this.operatingSys = operatingSys;
    }


    /**
     * Gets the nfc value for this IMEIEnquiryResponse.
     * 
     * @return nfc
     */
    public java.lang.String getNfc() {
        return nfc;
    }


    /**
     * Sets the nfc value for this IMEIEnquiryResponse.
     * 
     * @param nfc
     */
    public void setNfc(java.lang.String nfc) {
        this.nfc = nfc;
    }


    /**
     * Gets the bluetooth value for this IMEIEnquiryResponse.
     * 
     * @return bluetooth
     */
    public java.lang.String getBluetooth() {
        return bluetooth;
    }


    /**
     * Sets the bluetooth value for this IMEIEnquiryResponse.
     * 
     * @param bluetooth
     */
    public void setBluetooth(java.lang.String bluetooth) {
        this.bluetooth = bluetooth;
    }


    /**
     * Gets the WLAN value for this IMEIEnquiryResponse.
     * 
     * @return WLAN
     */
    public java.lang.String getWLAN() {
        return WLAN;
    }


    /**
     * Sets the WLAN value for this IMEIEnquiryResponse.
     * 
     * @param WLAN
     */
    public void setWLAN(java.lang.String WLAN) {
        this.WLAN = WLAN;
    }


    /**
     * Gets the deviceType value for this IMEIEnquiryResponse.
     * 
     * @return deviceType
     */
    public java.lang.String getDeviceType() {
        return deviceType;
    }


    /**
     * Sets the deviceType value for this IMEIEnquiryResponse.
     * 
     * @param deviceType
     */
    public void setDeviceType(java.lang.String deviceType) {
        this.deviceType = deviceType;
    }


    /**
     * Gets the IMEIHistory value for this IMEIEnquiryResponse.
     * 
     * @return IMEIHistory
     */
    public com.xius.tia.TIAManagement_xsd.IMEIHistoryType[] getIMEIHistory() {
        return IMEIHistory;
    }


    /**
     * Sets the IMEIHistory value for this IMEIEnquiryResponse.
     * 
     * @param IMEIHistory
     */
    public void setIMEIHistory(com.xius.tia.TIAManagement_xsd.IMEIHistoryType[] IMEIHistory) {
        this.IMEIHistory = IMEIHistory;
    }

    public com.xius.tia.TIAManagement_xsd.IMEIHistoryType getIMEIHistory(int i) {
        return this.IMEIHistory[i];
    }

    public void setIMEIHistory(int i, com.xius.tia.TIAManagement_xsd.IMEIHistoryType _value) {
        this.IMEIHistory[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IMEIEnquiryResponse)) return false;
        IMEIEnquiryResponse other = (IMEIEnquiryResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.responseData==null && other.getResponseData()==null) || 
             (this.responseData!=null &&
              this.responseData.equals(other.getResponseData()))) &&
            ((this.GSMARefCode==null && other.getGSMARefCode()==null) || 
             (this.GSMARefCode!=null &&
              this.GSMARefCode.equals(other.getGSMARefCode()))) &&
            ((this.GSMAStatus==null && other.getGSMAStatus()==null) || 
             (this.GSMAStatus!=null &&
              this.GSMAStatus.equals(other.getGSMAStatus()))) &&
            ((this.deviceId==null && other.getDeviceId()==null) || 
             (this.deviceId!=null &&
              this.deviceId.equals(other.getDeviceId()))) &&
            ((this.partnerId==null && other.getPartnerId()==null) || 
             (this.partnerId!=null &&
              this.partnerId.equals(other.getPartnerId()))) &&
            ((this.branchId==null && other.getBranchId()==null) || 
             (this.branchId!=null &&
              this.branchId.equals(other.getBranchId()))) &&
            ((this.recordIdentifier==null && other.getRecordIdentifier()==null) || 
             (this.recordIdentifier!=null &&
              this.recordIdentifier.equals(other.getRecordIdentifier()))) &&
            ((this.blacklistStatus==null && other.getBlacklistStatus()==null) || 
             (this.blacklistStatus!=null &&
              this.blacklistStatus.equals(other.getBlacklistStatus()))) &&
            ((this.greylistStatus==null && other.getGreylistStatus()==null) || 
             (this.greylistStatus!=null &&
              this.greylistStatus.equals(other.getGreylistStatus()))) &&
            ((this.manufacturer==null && other.getManufacturer()==null) || 
             (this.manufacturer!=null &&
              this.manufacturer.equals(other.getManufacturer()))) &&
            ((this.brandName==null && other.getBrandName()==null) || 
             (this.brandName!=null &&
              this.brandName.equals(other.getBrandName()))) &&
            ((this.marketingName==null && other.getMarketingName()==null) || 
             (this.marketingName!=null &&
              this.marketingName.equals(other.getMarketingName()))) &&
            ((this.modelName==null && other.getModelName()==null) || 
             (this.modelName!=null &&
              this.modelName.equals(other.getModelName()))) &&
            ((this.band==null && other.getBand()==null) || 
             (this.band!=null &&
              this.band.equals(other.getBand()))) &&
            ((this.operatingSys==null && other.getOperatingSys()==null) || 
             (this.operatingSys!=null &&
              this.operatingSys.equals(other.getOperatingSys()))) &&
            ((this.nfc==null && other.getNfc()==null) || 
             (this.nfc!=null &&
              this.nfc.equals(other.getNfc()))) &&
            ((this.bluetooth==null && other.getBluetooth()==null) || 
             (this.bluetooth!=null &&
              this.bluetooth.equals(other.getBluetooth()))) &&
            ((this.WLAN==null && other.getWLAN()==null) || 
             (this.WLAN!=null &&
              this.WLAN.equals(other.getWLAN()))) &&
            ((this.deviceType==null && other.getDeviceType()==null) || 
             (this.deviceType!=null &&
              this.deviceType.equals(other.getDeviceType()))) &&
            ((this.IMEIHistory==null && other.getIMEIHistory()==null) || 
             (this.IMEIHistory!=null &&
              java.util.Arrays.equals(this.IMEIHistory, other.getIMEIHistory())));
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
        if (getResponseData() != null) {
            _hashCode += getResponseData().hashCode();
        }
        if (getGSMARefCode() != null) {
            _hashCode += getGSMARefCode().hashCode();
        }
        if (getGSMAStatus() != null) {
            _hashCode += getGSMAStatus().hashCode();
        }
        if (getDeviceId() != null) {
            _hashCode += getDeviceId().hashCode();
        }
        if (getPartnerId() != null) {
            _hashCode += getPartnerId().hashCode();
        }
        if (getBranchId() != null) {
            _hashCode += getBranchId().hashCode();
        }
        if (getRecordIdentifier() != null) {
            _hashCode += getRecordIdentifier().hashCode();
        }
        if (getBlacklistStatus() != null) {
            _hashCode += getBlacklistStatus().hashCode();
        }
        if (getGreylistStatus() != null) {
            _hashCode += getGreylistStatus().hashCode();
        }
        if (getManufacturer() != null) {
            _hashCode += getManufacturer().hashCode();
        }
        if (getBrandName() != null) {
            _hashCode += getBrandName().hashCode();
        }
        if (getMarketingName() != null) {
            _hashCode += getMarketingName().hashCode();
        }
        if (getModelName() != null) {
            _hashCode += getModelName().hashCode();
        }
        if (getBand() != null) {
            _hashCode += getBand().hashCode();
        }
        if (getOperatingSys() != null) {
            _hashCode += getOperatingSys().hashCode();
        }
        if (getNfc() != null) {
            _hashCode += getNfc().hashCode();
        }
        if (getBluetooth() != null) {
            _hashCode += getBluetooth().hashCode();
        }
        if (getWLAN() != null) {
            _hashCode += getWLAN().hashCode();
        }
        if (getDeviceType() != null) {
            _hashCode += getDeviceType().hashCode();
        }
        if (getIMEIHistory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIMEIHistory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIMEIHistory(), i);
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
        new org.apache.axis.description.TypeDesc(IMEIEnquiryResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "IMEIEnquiryResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "ResponseData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "ResponseDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GSMARefCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "GSMARefCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GSMAStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "GSMAStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "deviceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "partnerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("branchId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "branchId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "recordIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blacklistStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "blacklistStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("greylistStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "greylistStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "manufacturer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brandName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "brandName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketingName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "marketingName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "modelName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("band");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "band"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatingSys");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "operatingSys"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nfc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "nfc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bluetooth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "bluetooth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WLAN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "WLAN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "deviceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IMEIHistory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "IMEIHistory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "IMEIHistoryType"));
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
