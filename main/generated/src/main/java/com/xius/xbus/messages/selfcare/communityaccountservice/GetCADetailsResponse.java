/**
 * GetCADetailsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.selfcare.communityaccountservice;

public class GetCADetailsResponse  extends com.xius.xbus.messages.common.WSResponse  implements java.io.Serializable {
    private java.lang.Long parntAcctId;

    private java.math.BigDecimal coreBal;

    private java.lang.Long grpID;

    private java.lang.String grpName;

    private java.lang.Long pkgID;

    private java.lang.String pkgName;

    private java.lang.String grpValDate;

    private java.lang.String acctHolder;

    private java.math.BigDecimal rentalAmt;

    private com.xius.xbus.messages.selfcare.communityaccountservice.ChildAcctViewType childAcctInfo;

    private java.lang.String parntDeviceIds;

    private java.lang.String parntZoneGrpIds;

    public GetCADetailsResponse() {
    }

    public GetCADetailsResponse(
           com.xius.xbus.messages.common.StatusCode statusCode,
           java.util.Calendar timeStamp,
           java.lang.String correlationID,
           com.xius.xbus.messages.common.ErrorData[] errors,
           java.lang.String version,
           java.lang.Long parntAcctId,
           java.math.BigDecimal coreBal,
           java.lang.Long grpID,
           java.lang.String grpName,
           java.lang.Long pkgID,
           java.lang.String pkgName,
           java.lang.String grpValDate,
           java.lang.String acctHolder,
           java.math.BigDecimal rentalAmt,
           com.xius.xbus.messages.selfcare.communityaccountservice.ChildAcctViewType childAcctInfo,
           java.lang.String parntDeviceIds,
           java.lang.String parntZoneGrpIds) {
        super(
            statusCode,
            timeStamp,
            correlationID,
            errors,
            version);
        this.parntAcctId = parntAcctId;
        this.coreBal = coreBal;
        this.grpID = grpID;
        this.grpName = grpName;
        this.pkgID = pkgID;
        this.pkgName = pkgName;
        this.grpValDate = grpValDate;
        this.acctHolder = acctHolder;
        this.rentalAmt = rentalAmt;
        this.childAcctInfo = childAcctInfo;
        this.parntDeviceIds = parntDeviceIds;
        this.parntZoneGrpIds = parntZoneGrpIds;
    }


    /**
     * Gets the parntAcctId value for this GetCADetailsResponse.
     * 
     * @return parntAcctId
     */
    public java.lang.Long getParntAcctId() {
        return parntAcctId;
    }


    /**
     * Sets the parntAcctId value for this GetCADetailsResponse.
     * 
     * @param parntAcctId
     */
    public void setParntAcctId(java.lang.Long parntAcctId) {
        this.parntAcctId = parntAcctId;
    }


    /**
     * Gets the coreBal value for this GetCADetailsResponse.
     * 
     * @return coreBal
     */
    public java.math.BigDecimal getCoreBal() {
        return coreBal;
    }


    /**
     * Sets the coreBal value for this GetCADetailsResponse.
     * 
     * @param coreBal
     */
    public void setCoreBal(java.math.BigDecimal coreBal) {
        this.coreBal = coreBal;
    }


    /**
     * Gets the grpID value for this GetCADetailsResponse.
     * 
     * @return grpID
     */
    public java.lang.Long getGrpID() {
        return grpID;
    }


    /**
     * Sets the grpID value for this GetCADetailsResponse.
     * 
     * @param grpID
     */
    public void setGrpID(java.lang.Long grpID) {
        this.grpID = grpID;
    }


    /**
     * Gets the grpName value for this GetCADetailsResponse.
     * 
     * @return grpName
     */
    public java.lang.String getGrpName() {
        return grpName;
    }


    /**
     * Sets the grpName value for this GetCADetailsResponse.
     * 
     * @param grpName
     */
    public void setGrpName(java.lang.String grpName) {
        this.grpName = grpName;
    }


    /**
     * Gets the pkgID value for this GetCADetailsResponse.
     * 
     * @return pkgID
     */
    public java.lang.Long getPkgID() {
        return pkgID;
    }


    /**
     * Sets the pkgID value for this GetCADetailsResponse.
     * 
     * @param pkgID
     */
    public void setPkgID(java.lang.Long pkgID) {
        this.pkgID = pkgID;
    }


    /**
     * Gets the pkgName value for this GetCADetailsResponse.
     * 
     * @return pkgName
     */
    public java.lang.String getPkgName() {
        return pkgName;
    }


    /**
     * Sets the pkgName value for this GetCADetailsResponse.
     * 
     * @param pkgName
     */
    public void setPkgName(java.lang.String pkgName) {
        this.pkgName = pkgName;
    }


    /**
     * Gets the grpValDate value for this GetCADetailsResponse.
     * 
     * @return grpValDate
     */
    public java.lang.String getGrpValDate() {
        return grpValDate;
    }


    /**
     * Sets the grpValDate value for this GetCADetailsResponse.
     * 
     * @param grpValDate
     */
    public void setGrpValDate(java.lang.String grpValDate) {
        this.grpValDate = grpValDate;
    }


    /**
     * Gets the acctHolder value for this GetCADetailsResponse.
     * 
     * @return acctHolder
     */
    public java.lang.String getAcctHolder() {
        return acctHolder;
    }


    /**
     * Sets the acctHolder value for this GetCADetailsResponse.
     * 
     * @param acctHolder
     */
    public void setAcctHolder(java.lang.String acctHolder) {
        this.acctHolder = acctHolder;
    }


    /**
     * Gets the rentalAmt value for this GetCADetailsResponse.
     * 
     * @return rentalAmt
     */
    public java.math.BigDecimal getRentalAmt() {
        return rentalAmt;
    }


    /**
     * Sets the rentalAmt value for this GetCADetailsResponse.
     * 
     * @param rentalAmt
     */
    public void setRentalAmt(java.math.BigDecimal rentalAmt) {
        this.rentalAmt = rentalAmt;
    }


    /**
     * Gets the childAcctInfo value for this GetCADetailsResponse.
     * 
     * @return childAcctInfo
     */
    public com.xius.xbus.messages.selfcare.communityaccountservice.ChildAcctViewType getChildAcctInfo() {
        return childAcctInfo;
    }


    /**
     * Sets the childAcctInfo value for this GetCADetailsResponse.
     * 
     * @param childAcctInfo
     */
    public void setChildAcctInfo(com.xius.xbus.messages.selfcare.communityaccountservice.ChildAcctViewType childAcctInfo) {
        this.childAcctInfo = childAcctInfo;
    }


    /**
     * Gets the parntDeviceIds value for this GetCADetailsResponse.
     * 
     * @return parntDeviceIds
     */
    public java.lang.String getParntDeviceIds() {
        return parntDeviceIds;
    }


    /**
     * Sets the parntDeviceIds value for this GetCADetailsResponse.
     * 
     * @param parntDeviceIds
     */
    public void setParntDeviceIds(java.lang.String parntDeviceIds) {
        this.parntDeviceIds = parntDeviceIds;
    }


    /**
     * Gets the parntZoneGrpIds value for this GetCADetailsResponse.
     * 
     * @return parntZoneGrpIds
     */
    public java.lang.String getParntZoneGrpIds() {
        return parntZoneGrpIds;
    }


    /**
     * Sets the parntZoneGrpIds value for this GetCADetailsResponse.
     * 
     * @param parntZoneGrpIds
     */
    public void setParntZoneGrpIds(java.lang.String parntZoneGrpIds) {
        this.parntZoneGrpIds = parntZoneGrpIds;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCADetailsResponse)) return false;
        GetCADetailsResponse other = (GetCADetailsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.parntAcctId==null && other.getParntAcctId()==null) || 
             (this.parntAcctId!=null &&
              this.parntAcctId.equals(other.getParntAcctId()))) &&
            ((this.coreBal==null && other.getCoreBal()==null) || 
             (this.coreBal!=null &&
              this.coreBal.equals(other.getCoreBal()))) &&
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
            ((this.grpValDate==null && other.getGrpValDate()==null) || 
             (this.grpValDate!=null &&
              this.grpValDate.equals(other.getGrpValDate()))) &&
            ((this.acctHolder==null && other.getAcctHolder()==null) || 
             (this.acctHolder!=null &&
              this.acctHolder.equals(other.getAcctHolder()))) &&
            ((this.rentalAmt==null && other.getRentalAmt()==null) || 
             (this.rentalAmt!=null &&
              this.rentalAmt.equals(other.getRentalAmt()))) &&
            ((this.childAcctInfo==null && other.getChildAcctInfo()==null) || 
             (this.childAcctInfo!=null &&
              this.childAcctInfo.equals(other.getChildAcctInfo()))) &&
            ((this.parntDeviceIds==null && other.getParntDeviceIds()==null) || 
             (this.parntDeviceIds!=null &&
              this.parntDeviceIds.equals(other.getParntDeviceIds()))) &&
            ((this.parntZoneGrpIds==null && other.getParntZoneGrpIds()==null) || 
             (this.parntZoneGrpIds!=null &&
              this.parntZoneGrpIds.equals(other.getParntZoneGrpIds())));
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
        if (getParntAcctId() != null) {
            _hashCode += getParntAcctId().hashCode();
        }
        if (getCoreBal() != null) {
            _hashCode += getCoreBal().hashCode();
        }
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
        if (getGrpValDate() != null) {
            _hashCode += getGrpValDate().hashCode();
        }
        if (getAcctHolder() != null) {
            _hashCode += getAcctHolder().hashCode();
        }
        if (getRentalAmt() != null) {
            _hashCode += getRentalAmt().hashCode();
        }
        if (getChildAcctInfo() != null) {
            _hashCode += getChildAcctInfo().hashCode();
        }
        if (getParntDeviceIds() != null) {
            _hashCode += getParntDeviceIds().hashCode();
        }
        if (getParntZoneGrpIds() != null) {
            _hashCode += getParntZoneGrpIds().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCADetailsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">GetCADetailsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parntAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "parntAcctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coreBal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "coreBal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("grpValDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "grpValDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctHolder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "acctHolder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("childAcctInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "childAcctInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "ChildAcctViewType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
