/**
 * ServicePlanDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.device;

public class ServicePlanDetails  implements java.io.Serializable {
    private java.lang.String fundSource;

    private java.lang.String ldRatePlan;

    private int mrcAnniversaryDate;

    private java.lang.String ratePlan;

    public ServicePlanDetails() {
    }

    public ServicePlanDetails(
           java.lang.String fundSource,
           java.lang.String ldRatePlan,
           int mrcAnniversaryDate,
           java.lang.String ratePlan) {
           this.fundSource = fundSource;
           this.ldRatePlan = ldRatePlan;
           this.mrcAnniversaryDate = mrcAnniversaryDate;
           this.ratePlan = ratePlan;
    }


    /**
     * Gets the fundSource value for this ServicePlanDetails.
     * 
     * @return fundSource
     */
    public java.lang.String getFundSource() {
        return fundSource;
    }


    /**
     * Sets the fundSource value for this ServicePlanDetails.
     * 
     * @param fundSource
     */
    public void setFundSource(java.lang.String fundSource) {
        this.fundSource = fundSource;
    }


    /**
     * Gets the ldRatePlan value for this ServicePlanDetails.
     * 
     * @return ldRatePlan
     */
    public java.lang.String getLdRatePlan() {
        return ldRatePlan;
    }


    /**
     * Sets the ldRatePlan value for this ServicePlanDetails.
     * 
     * @param ldRatePlan
     */
    public void setLdRatePlan(java.lang.String ldRatePlan) {
        this.ldRatePlan = ldRatePlan;
    }


    /**
     * Gets the mrcAnniversaryDate value for this ServicePlanDetails.
     * 
     * @return mrcAnniversaryDate
     */
    public int getMrcAnniversaryDate() {
        return mrcAnniversaryDate;
    }


    /**
     * Sets the mrcAnniversaryDate value for this ServicePlanDetails.
     * 
     * @param mrcAnniversaryDate
     */
    public void setMrcAnniversaryDate(int mrcAnniversaryDate) {
        this.mrcAnniversaryDate = mrcAnniversaryDate;
    }


    /**
     * Gets the ratePlan value for this ServicePlanDetails.
     * 
     * @return ratePlan
     */
    public java.lang.String getRatePlan() {
        return ratePlan;
    }


    /**
     * Sets the ratePlan value for this ServicePlanDetails.
     * 
     * @param ratePlan
     */
    public void setRatePlan(java.lang.String ratePlan) {
        this.ratePlan = ratePlan;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServicePlanDetails)) return false;
        ServicePlanDetails other = (ServicePlanDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fundSource==null && other.getFundSource()==null) || 
             (this.fundSource!=null &&
              this.fundSource.equals(other.getFundSource()))) &&
            ((this.ldRatePlan==null && other.getLdRatePlan()==null) || 
             (this.ldRatePlan!=null &&
              this.ldRatePlan.equals(other.getLdRatePlan()))) &&
            this.mrcAnniversaryDate == other.getMrcAnniversaryDate() &&
            ((this.ratePlan==null && other.getRatePlan()==null) || 
             (this.ratePlan!=null &&
              this.ratePlan.equals(other.getRatePlan())));
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
        if (getFundSource() != null) {
            _hashCode += getFundSource().hashCode();
        }
        if (getLdRatePlan() != null) {
            _hashCode += getLdRatePlan().hashCode();
        }
        _hashCode += getMrcAnniversaryDate();
        if (getRatePlan() != null) {
            _hashCode += getRatePlan().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServicePlanDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "ServicePlanDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fundSource");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "fundSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ldRatePlan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "ldRatePlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mrcAnniversaryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "mrcAnniversaryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ratePlan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "ratePlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
