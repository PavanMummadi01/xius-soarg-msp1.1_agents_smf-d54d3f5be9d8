/**
 * GroupInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xiusbcgi.xbus.scare.CorpManagement_xsd;

public class GroupInfoType  implements java.io.Serializable {
    private java.lang.Long id;

    private java.lang.String name;

    private java.lang.String discription;

    private java.lang.Long maxSize;

    private java.math.BigInteger officeCode;

    private java.math.BigInteger maxFreeLines;

    private java.math.BigDecimal chargePerLine;

    private java.lang.String parentMSISDN;

    private java.math.BigDecimal transferAmount;

    private java.math.BigInteger dayOfMonth;

    private java.lang.String status;

    private java.lang.Long transId;

    public GroupInfoType() {
    }

    public GroupInfoType(
           java.lang.Long id,
           java.lang.String name,
           java.lang.String discription,
           java.lang.Long maxSize,
           java.math.BigInteger officeCode,
           java.math.BigInteger maxFreeLines,
           java.math.BigDecimal chargePerLine,
           java.lang.String parentMSISDN,
           java.math.BigDecimal transferAmount,
           java.math.BigInteger dayOfMonth,
           java.lang.String status,
           java.lang.Long transId) {
           this.id = id;
           this.name = name;
           this.discription = discription;
           this.maxSize = maxSize;
           this.officeCode = officeCode;
           this.maxFreeLines = maxFreeLines;
           this.chargePerLine = chargePerLine;
           this.parentMSISDN = parentMSISDN;
           this.transferAmount = transferAmount;
           this.dayOfMonth = dayOfMonth;
           this.status = status;
           this.transId = transId;
    }


    /**
     * Gets the id value for this GroupInfoType.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this GroupInfoType.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this GroupInfoType.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this GroupInfoType.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the discription value for this GroupInfoType.
     * 
     * @return discription
     */
    public java.lang.String getDiscription() {
        return discription;
    }


    /**
     * Sets the discription value for this GroupInfoType.
     * 
     * @param discription
     */
    public void setDiscription(java.lang.String discription) {
        this.discription = discription;
    }


    /**
     * Gets the maxSize value for this GroupInfoType.
     * 
     * @return maxSize
     */
    public java.lang.Long getMaxSize() {
        return maxSize;
    }


    /**
     * Sets the maxSize value for this GroupInfoType.
     * 
     * @param maxSize
     */
    public void setMaxSize(java.lang.Long maxSize) {
        this.maxSize = maxSize;
    }


    /**
     * Gets the officeCode value for this GroupInfoType.
     * 
     * @return officeCode
     */
    public java.math.BigInteger getOfficeCode() {
        return officeCode;
    }


    /**
     * Sets the officeCode value for this GroupInfoType.
     * 
     * @param officeCode
     */
    public void setOfficeCode(java.math.BigInteger officeCode) {
        this.officeCode = officeCode;
    }


    /**
     * Gets the maxFreeLines value for this GroupInfoType.
     * 
     * @return maxFreeLines
     */
    public java.math.BigInteger getMaxFreeLines() {
        return maxFreeLines;
    }


    /**
     * Sets the maxFreeLines value for this GroupInfoType.
     * 
     * @param maxFreeLines
     */
    public void setMaxFreeLines(java.math.BigInteger maxFreeLines) {
        this.maxFreeLines = maxFreeLines;
    }


    /**
     * Gets the chargePerLine value for this GroupInfoType.
     * 
     * @return chargePerLine
     */
    public java.math.BigDecimal getChargePerLine() {
        return chargePerLine;
    }


    /**
     * Sets the chargePerLine value for this GroupInfoType.
     * 
     * @param chargePerLine
     */
    public void setChargePerLine(java.math.BigDecimal chargePerLine) {
        this.chargePerLine = chargePerLine;
    }


    /**
     * Gets the parentMSISDN value for this GroupInfoType.
     * 
     * @return parentMSISDN
     */
    public java.lang.String getParentMSISDN() {
        return parentMSISDN;
    }


    /**
     * Sets the parentMSISDN value for this GroupInfoType.
     * 
     * @param parentMSISDN
     */
    public void setParentMSISDN(java.lang.String parentMSISDN) {
        this.parentMSISDN = parentMSISDN;
    }


    /**
     * Gets the transferAmount value for this GroupInfoType.
     * 
     * @return transferAmount
     */
    public java.math.BigDecimal getTransferAmount() {
        return transferAmount;
    }


    /**
     * Sets the transferAmount value for this GroupInfoType.
     * 
     * @param transferAmount
     */
    public void setTransferAmount(java.math.BigDecimal transferAmount) {
        this.transferAmount = transferAmount;
    }


    /**
     * Gets the dayOfMonth value for this GroupInfoType.
     * 
     * @return dayOfMonth
     */
    public java.math.BigInteger getDayOfMonth() {
        return dayOfMonth;
    }


    /**
     * Sets the dayOfMonth value for this GroupInfoType.
     * 
     * @param dayOfMonth
     */
    public void setDayOfMonth(java.math.BigInteger dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }


    /**
     * Gets the status value for this GroupInfoType.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this GroupInfoType.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the transId value for this GroupInfoType.
     * 
     * @return transId
     */
    public java.lang.Long getTransId() {
        return transId;
    }


    /**
     * Sets the transId value for this GroupInfoType.
     * 
     * @param transId
     */
    public void setTransId(java.lang.Long transId) {
        this.transId = transId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GroupInfoType)) return false;
        GroupInfoType other = (GroupInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.discription==null && other.getDiscription()==null) || 
             (this.discription!=null &&
              this.discription.equals(other.getDiscription()))) &&
            ((this.maxSize==null && other.getMaxSize()==null) || 
             (this.maxSize!=null &&
              this.maxSize.equals(other.getMaxSize()))) &&
            ((this.officeCode==null && other.getOfficeCode()==null) || 
             (this.officeCode!=null &&
              this.officeCode.equals(other.getOfficeCode()))) &&
            ((this.maxFreeLines==null && other.getMaxFreeLines()==null) || 
             (this.maxFreeLines!=null &&
              this.maxFreeLines.equals(other.getMaxFreeLines()))) &&
            ((this.chargePerLine==null && other.getChargePerLine()==null) || 
             (this.chargePerLine!=null &&
              this.chargePerLine.equals(other.getChargePerLine()))) &&
            ((this.parentMSISDN==null && other.getParentMSISDN()==null) || 
             (this.parentMSISDN!=null &&
              this.parentMSISDN.equals(other.getParentMSISDN()))) &&
            ((this.transferAmount==null && other.getTransferAmount()==null) || 
             (this.transferAmount!=null &&
              this.transferAmount.equals(other.getTransferAmount()))) &&
            ((this.dayOfMonth==null && other.getDayOfMonth()==null) || 
             (this.dayOfMonth!=null &&
              this.dayOfMonth.equals(other.getDayOfMonth()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.transId==null && other.getTransId()==null) || 
             (this.transId!=null &&
              this.transId.equals(other.getTransId())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDiscription() != null) {
            _hashCode += getDiscription().hashCode();
        }
        if (getMaxSize() != null) {
            _hashCode += getMaxSize().hashCode();
        }
        if (getOfficeCode() != null) {
            _hashCode += getOfficeCode().hashCode();
        }
        if (getMaxFreeLines() != null) {
            _hashCode += getMaxFreeLines().hashCode();
        }
        if (getChargePerLine() != null) {
            _hashCode += getChargePerLine().hashCode();
        }
        if (getParentMSISDN() != null) {
            _hashCode += getParentMSISDN().hashCode();
        }
        if (getTransferAmount() != null) {
            _hashCode += getTransferAmount().hashCode();
        }
        if (getDayOfMonth() != null) {
            _hashCode += getDayOfMonth().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTransId() != null) {
            _hashCode += getTransId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GroupInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "GroupInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "discription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxSize");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "maxSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "officeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxFreeLines");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "maxFreeLines"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargePerLine");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "chargePerLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "parentMSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "transferAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayOfMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "dayOfMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "transId"));
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
