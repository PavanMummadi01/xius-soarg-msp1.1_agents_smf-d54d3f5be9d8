/**
 * GetCAPackageChargesRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.CAManagement_xsd;

public class GetCAPackageChargesRequest  implements java.io.Serializable {
    private java.lang.Long grpPackageId;

    private java.lang.Long grpId;

    private java.lang.Long grpParentAccountId;

    private com.xius.billing.CAManagement_xsd.GrpAddOnItemType[] grpAddonFeatureId;

    private java.lang.Long childMSISDNCount;

    private java.lang.String topUpFlag;

    private com.xius.billing.CAManagement_xsd.ServiceInfoItemType[] topUpServiceIds;

    private java.lang.Long atpServiceId;

    public GetCAPackageChargesRequest() {
    }

    public GetCAPackageChargesRequest(
           java.lang.Long grpPackageId,
           java.lang.Long grpId,
           java.lang.Long grpParentAccountId,
           com.xius.billing.CAManagement_xsd.GrpAddOnItemType[] grpAddonFeatureId,
           java.lang.Long childMSISDNCount,
           java.lang.String topUpFlag,
           com.xius.billing.CAManagement_xsd.ServiceInfoItemType[] topUpServiceIds,
           java.lang.Long atpServiceId) {
           this.grpPackageId = grpPackageId;
           this.grpId = grpId;
           this.grpParentAccountId = grpParentAccountId;
           this.grpAddonFeatureId = grpAddonFeatureId;
           this.childMSISDNCount = childMSISDNCount;
           this.topUpFlag = topUpFlag;
           this.topUpServiceIds = topUpServiceIds;
           this.atpServiceId = atpServiceId;
    }


    /**
     * Gets the grpPackageId value for this GetCAPackageChargesRequest.
     * 
     * @return grpPackageId
     */
    public java.lang.Long getGrpPackageId() {
        return grpPackageId;
    }


    /**
     * Sets the grpPackageId value for this GetCAPackageChargesRequest.
     * 
     * @param grpPackageId
     */
    public void setGrpPackageId(java.lang.Long grpPackageId) {
        this.grpPackageId = grpPackageId;
    }


    /**
     * Gets the grpId value for this GetCAPackageChargesRequest.
     * 
     * @return grpId
     */
    public java.lang.Long getGrpId() {
        return grpId;
    }


    /**
     * Sets the grpId value for this GetCAPackageChargesRequest.
     * 
     * @param grpId
     */
    public void setGrpId(java.lang.Long grpId) {
        this.grpId = grpId;
    }


    /**
     * Gets the grpParentAccountId value for this GetCAPackageChargesRequest.
     * 
     * @return grpParentAccountId
     */
    public java.lang.Long getGrpParentAccountId() {
        return grpParentAccountId;
    }


    /**
     * Sets the grpParentAccountId value for this GetCAPackageChargesRequest.
     * 
     * @param grpParentAccountId
     */
    public void setGrpParentAccountId(java.lang.Long grpParentAccountId) {
        this.grpParentAccountId = grpParentAccountId;
    }


    /**
     * Gets the grpAddonFeatureId value for this GetCAPackageChargesRequest.
     * 
     * @return grpAddonFeatureId
     */
    public com.xius.billing.CAManagement_xsd.GrpAddOnItemType[] getGrpAddonFeatureId() {
        return grpAddonFeatureId;
    }


    /**
     * Sets the grpAddonFeatureId value for this GetCAPackageChargesRequest.
     * 
     * @param grpAddonFeatureId
     */
    public void setGrpAddonFeatureId(com.xius.billing.CAManagement_xsd.GrpAddOnItemType[] grpAddonFeatureId) {
        this.grpAddonFeatureId = grpAddonFeatureId;
    }


    /**
     * Gets the childMSISDNCount value for this GetCAPackageChargesRequest.
     * 
     * @return childMSISDNCount
     */
    public java.lang.Long getChildMSISDNCount() {
        return childMSISDNCount;
    }


    /**
     * Sets the childMSISDNCount value for this GetCAPackageChargesRequest.
     * 
     * @param childMSISDNCount
     */
    public void setChildMSISDNCount(java.lang.Long childMSISDNCount) {
        this.childMSISDNCount = childMSISDNCount;
    }


    /**
     * Gets the topUpFlag value for this GetCAPackageChargesRequest.
     * 
     * @return topUpFlag
     */
    public java.lang.String getTopUpFlag() {
        return topUpFlag;
    }


    /**
     * Sets the topUpFlag value for this GetCAPackageChargesRequest.
     * 
     * @param topUpFlag
     */
    public void setTopUpFlag(java.lang.String topUpFlag) {
        this.topUpFlag = topUpFlag;
    }


    /**
     * Gets the topUpServiceIds value for this GetCAPackageChargesRequest.
     * 
     * @return topUpServiceIds
     */
    public com.xius.billing.CAManagement_xsd.ServiceInfoItemType[] getTopUpServiceIds() {
        return topUpServiceIds;
    }


    /**
     * Sets the topUpServiceIds value for this GetCAPackageChargesRequest.
     * 
     * @param topUpServiceIds
     */
    public void setTopUpServiceIds(com.xius.billing.CAManagement_xsd.ServiceInfoItemType[] topUpServiceIds) {
        this.topUpServiceIds = topUpServiceIds;
    }


    /**
     * Gets the atpServiceId value for this GetCAPackageChargesRequest.
     * 
     * @return atpServiceId
     */
    public java.lang.Long getAtpServiceId() {
        return atpServiceId;
    }


    /**
     * Sets the atpServiceId value for this GetCAPackageChargesRequest.
     * 
     * @param atpServiceId
     */
    public void setAtpServiceId(java.lang.Long atpServiceId) {
        this.atpServiceId = atpServiceId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCAPackageChargesRequest)) return false;
        GetCAPackageChargesRequest other = (GetCAPackageChargesRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.grpPackageId==null && other.getGrpPackageId()==null) || 
             (this.grpPackageId!=null &&
              this.grpPackageId.equals(other.getGrpPackageId()))) &&
            ((this.grpId==null && other.getGrpId()==null) || 
             (this.grpId!=null &&
              this.grpId.equals(other.getGrpId()))) &&
            ((this.grpParentAccountId==null && other.getGrpParentAccountId()==null) || 
             (this.grpParentAccountId!=null &&
              this.grpParentAccountId.equals(other.getGrpParentAccountId()))) &&
            ((this.grpAddonFeatureId==null && other.getGrpAddonFeatureId()==null) || 
             (this.grpAddonFeatureId!=null &&
              java.util.Arrays.equals(this.grpAddonFeatureId, other.getGrpAddonFeatureId()))) &&
            ((this.childMSISDNCount==null && other.getChildMSISDNCount()==null) || 
             (this.childMSISDNCount!=null &&
              this.childMSISDNCount.equals(other.getChildMSISDNCount()))) &&
            ((this.topUpFlag==null && other.getTopUpFlag()==null) || 
             (this.topUpFlag!=null &&
              this.topUpFlag.equals(other.getTopUpFlag()))) &&
            ((this.topUpServiceIds==null && other.getTopUpServiceIds()==null) || 
             (this.topUpServiceIds!=null &&
              java.util.Arrays.equals(this.topUpServiceIds, other.getTopUpServiceIds()))) &&
            ((this.atpServiceId==null && other.getAtpServiceId()==null) || 
             (this.atpServiceId!=null &&
              this.atpServiceId.equals(other.getAtpServiceId())));
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
        if (getGrpPackageId() != null) {
            _hashCode += getGrpPackageId().hashCode();
        }
        if (getGrpId() != null) {
            _hashCode += getGrpId().hashCode();
        }
        if (getGrpParentAccountId() != null) {
            _hashCode += getGrpParentAccountId().hashCode();
        }
        if (getGrpAddonFeatureId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGrpAddonFeatureId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGrpAddonFeatureId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getChildMSISDNCount() != null) {
            _hashCode += getChildMSISDNCount().hashCode();
        }
        if (getTopUpFlag() != null) {
            _hashCode += getTopUpFlag().hashCode();
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
        if (getAtpServiceId() != null) {
            _hashCode += getAtpServiceId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCAPackageChargesRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "GetCAPackageChargesRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grpPackageId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "grpPackageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grpId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "grpId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grpParentAccountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "grpParentAccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grpAddonFeatureId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "grpAddonFeatureId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "GrpAddOnItemType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "grpAddOn"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childMSISDNCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "childMSISDNCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topUpFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "topUpFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topUpServiceIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "topUpServiceIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "ServiceInfoItemType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "serviceInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atpServiceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "atpServiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
