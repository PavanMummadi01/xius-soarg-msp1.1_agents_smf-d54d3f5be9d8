/**
 * TktHistoryTypeData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class TktHistoryTypeData  implements java.io.Serializable {
    private java.lang.Long tktNo;

    private java.lang.String creationDate;

    private java.lang.String heading;

    private java.lang.String assignedTo;

    private java.lang.String status;

    private java.lang.String statusChangeDate;

    private java.lang.String severity;

    private java.lang.String tktCreatedBy;

    private java.lang.String tktUpdatedBy;

    private java.lang.String problemDesc;

    public TktHistoryTypeData() {
    }

    public TktHistoryTypeData(
           java.lang.Long tktNo,
           java.lang.String creationDate,
           java.lang.String heading,
           java.lang.String assignedTo,
           java.lang.String status,
           java.lang.String statusChangeDate,
           java.lang.String severity,
           java.lang.String tktCreatedBy,
           java.lang.String tktUpdatedBy,
           java.lang.String problemDesc) {
           this.tktNo = tktNo;
           this.creationDate = creationDate;
           this.heading = heading;
           this.assignedTo = assignedTo;
           this.status = status;
           this.statusChangeDate = statusChangeDate;
           this.severity = severity;
           this.tktCreatedBy = tktCreatedBy;
           this.tktUpdatedBy = tktUpdatedBy;
           this.problemDesc = problemDesc;
    }


    /**
     * Gets the tktNo value for this TktHistoryTypeData.
     * 
     * @return tktNo
     */
    public java.lang.Long getTktNo() {
        return tktNo;
    }


    /**
     * Sets the tktNo value for this TktHistoryTypeData.
     * 
     * @param tktNo
     */
    public void setTktNo(java.lang.Long tktNo) {
        this.tktNo = tktNo;
    }


    /**
     * Gets the creationDate value for this TktHistoryTypeData.
     * 
     * @return creationDate
     */
    public java.lang.String getCreationDate() {
        return creationDate;
    }


    /**
     * Sets the creationDate value for this TktHistoryTypeData.
     * 
     * @param creationDate
     */
    public void setCreationDate(java.lang.String creationDate) {
        this.creationDate = creationDate;
    }


    /**
     * Gets the heading value for this TktHistoryTypeData.
     * 
     * @return heading
     */
    public java.lang.String getHeading() {
        return heading;
    }


    /**
     * Sets the heading value for this TktHistoryTypeData.
     * 
     * @param heading
     */
    public void setHeading(java.lang.String heading) {
        this.heading = heading;
    }


    /**
     * Gets the assignedTo value for this TktHistoryTypeData.
     * 
     * @return assignedTo
     */
    public java.lang.String getAssignedTo() {
        return assignedTo;
    }


    /**
     * Sets the assignedTo value for this TktHistoryTypeData.
     * 
     * @param assignedTo
     */
    public void setAssignedTo(java.lang.String assignedTo) {
        this.assignedTo = assignedTo;
    }


    /**
     * Gets the status value for this TktHistoryTypeData.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this TktHistoryTypeData.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the statusChangeDate value for this TktHistoryTypeData.
     * 
     * @return statusChangeDate
     */
    public java.lang.String getStatusChangeDate() {
        return statusChangeDate;
    }


    /**
     * Sets the statusChangeDate value for this TktHistoryTypeData.
     * 
     * @param statusChangeDate
     */
    public void setStatusChangeDate(java.lang.String statusChangeDate) {
        this.statusChangeDate = statusChangeDate;
    }


    /**
     * Gets the severity value for this TktHistoryTypeData.
     * 
     * @return severity
     */
    public java.lang.String getSeverity() {
        return severity;
    }


    /**
     * Sets the severity value for this TktHistoryTypeData.
     * 
     * @param severity
     */
    public void setSeverity(java.lang.String severity) {
        this.severity = severity;
    }


    /**
     * Gets the tktCreatedBy value for this TktHistoryTypeData.
     * 
     * @return tktCreatedBy
     */
    public java.lang.String getTktCreatedBy() {
        return tktCreatedBy;
    }


    /**
     * Sets the tktCreatedBy value for this TktHistoryTypeData.
     * 
     * @param tktCreatedBy
     */
    public void setTktCreatedBy(java.lang.String tktCreatedBy) {
        this.tktCreatedBy = tktCreatedBy;
    }


    /**
     * Gets the tktUpdatedBy value for this TktHistoryTypeData.
     * 
     * @return tktUpdatedBy
     */
    public java.lang.String getTktUpdatedBy() {
        return tktUpdatedBy;
    }


    /**
     * Sets the tktUpdatedBy value for this TktHistoryTypeData.
     * 
     * @param tktUpdatedBy
     */
    public void setTktUpdatedBy(java.lang.String tktUpdatedBy) {
        this.tktUpdatedBy = tktUpdatedBy;
    }


    /**
     * Gets the problemDesc value for this TktHistoryTypeData.
     * 
     * @return problemDesc
     */
    public java.lang.String getProblemDesc() {
        return problemDesc;
    }


    /**
     * Sets the problemDesc value for this TktHistoryTypeData.
     * 
     * @param problemDesc
     */
    public void setProblemDesc(java.lang.String problemDesc) {
        this.problemDesc = problemDesc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TktHistoryTypeData)) return false;
        TktHistoryTypeData other = (TktHistoryTypeData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tktNo==null && other.getTktNo()==null) || 
             (this.tktNo!=null &&
              this.tktNo.equals(other.getTktNo()))) &&
            ((this.creationDate==null && other.getCreationDate()==null) || 
             (this.creationDate!=null &&
              this.creationDate.equals(other.getCreationDate()))) &&
            ((this.heading==null && other.getHeading()==null) || 
             (this.heading!=null &&
              this.heading.equals(other.getHeading()))) &&
            ((this.assignedTo==null && other.getAssignedTo()==null) || 
             (this.assignedTo!=null &&
              this.assignedTo.equals(other.getAssignedTo()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.statusChangeDate==null && other.getStatusChangeDate()==null) || 
             (this.statusChangeDate!=null &&
              this.statusChangeDate.equals(other.getStatusChangeDate()))) &&
            ((this.severity==null && other.getSeverity()==null) || 
             (this.severity!=null &&
              this.severity.equals(other.getSeverity()))) &&
            ((this.tktCreatedBy==null && other.getTktCreatedBy()==null) || 
             (this.tktCreatedBy!=null &&
              this.tktCreatedBy.equals(other.getTktCreatedBy()))) &&
            ((this.tktUpdatedBy==null && other.getTktUpdatedBy()==null) || 
             (this.tktUpdatedBy!=null &&
              this.tktUpdatedBy.equals(other.getTktUpdatedBy()))) &&
            ((this.problemDesc==null && other.getProblemDesc()==null) || 
             (this.problemDesc!=null &&
              this.problemDesc.equals(other.getProblemDesc())));
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
        if (getTktNo() != null) {
            _hashCode += getTktNo().hashCode();
        }
        if (getCreationDate() != null) {
            _hashCode += getCreationDate().hashCode();
        }
        if (getHeading() != null) {
            _hashCode += getHeading().hashCode();
        }
        if (getAssignedTo() != null) {
            _hashCode += getAssignedTo().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getStatusChangeDate() != null) {
            _hashCode += getStatusChangeDate().hashCode();
        }
        if (getSeverity() != null) {
            _hashCode += getSeverity().hashCode();
        }
        if (getTktCreatedBy() != null) {
            _hashCode += getTktCreatedBy().hashCode();
        }
        if (getTktUpdatedBy() != null) {
            _hashCode += getTktUpdatedBy().hashCode();
        }
        if (getProblemDesc() != null) {
            _hashCode += getProblemDesc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TktHistoryTypeData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "TktHistoryTypeData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tktNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "tktNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "CreationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("heading");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "heading"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignedTo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "assignedTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusChangeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "statusChangeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("severity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "severity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tktCreatedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "tktCreatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tktUpdatedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "tktUpdatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("problemDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "problemDesc"));
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
