/**
 * SubscriberDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.provisioning;

public class SubscriberDetails  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private net.bcgi.si.messages.mvnoapi.provisioning.AddressInfo addressInfo;

    private java.lang.String age;

    private java.lang.String dateOfBirth;

    private net.bcgi.si.messages.mvnoapi.common.GenderType gender;

    private net.bcgi.si.messages.mvnoapi.provisioning.IdentityData identityData;

    private java.lang.String motherMaidenName;

    private java.lang.String race;

    private org.apache.axis.message.MessageElement [] _any;

    public SubscriberDetails() {
    }

    public SubscriberDetails(
           net.bcgi.si.messages.mvnoapi.provisioning.AddressInfo addressInfo,
           java.lang.String age,
           java.lang.String dateOfBirth,
           net.bcgi.si.messages.mvnoapi.common.GenderType gender,
           net.bcgi.si.messages.mvnoapi.provisioning.IdentityData identityData,
           java.lang.String motherMaidenName,
           java.lang.String race,
           org.apache.axis.message.MessageElement [] _any) {
           this.addressInfo = addressInfo;
           this.age = age;
           this.dateOfBirth = dateOfBirth;
           this.gender = gender;
           this.identityData = identityData;
           this.motherMaidenName = motherMaidenName;
           this.race = race;
           this._any = _any;
    }


    /**
     * Gets the addressInfo value for this SubscriberDetails.
     * 
     * @return addressInfo
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.AddressInfo getAddressInfo() {
        return addressInfo;
    }


    /**
     * Sets the addressInfo value for this SubscriberDetails.
     * 
     * @param addressInfo
     */
    public void setAddressInfo(net.bcgi.si.messages.mvnoapi.provisioning.AddressInfo addressInfo) {
        this.addressInfo = addressInfo;
    }


    /**
     * Gets the age value for this SubscriberDetails.
     * 
     * @return age
     */
    public java.lang.String getAge() {
        return age;
    }


    /**
     * Sets the age value for this SubscriberDetails.
     * 
     * @param age
     */
    public void setAge(java.lang.String age) {
        this.age = age;
    }


    /**
     * Gets the dateOfBirth value for this SubscriberDetails.
     * 
     * @return dateOfBirth
     */
    public java.lang.String getDateOfBirth() {
        return dateOfBirth;
    }


    /**
     * Sets the dateOfBirth value for this SubscriberDetails.
     * 
     * @param dateOfBirth
     */
    public void setDateOfBirth(java.lang.String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    /**
     * Gets the gender value for this SubscriberDetails.
     * 
     * @return gender
     */
    public net.bcgi.si.messages.mvnoapi.common.GenderType getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this SubscriberDetails.
     * 
     * @param gender
     */
    public void setGender(net.bcgi.si.messages.mvnoapi.common.GenderType gender) {
        this.gender = gender;
    }


    /**
     * Gets the identityData value for this SubscriberDetails.
     * 
     * @return identityData
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.IdentityData getIdentityData() {
        return identityData;
    }


    /**
     * Sets the identityData value for this SubscriberDetails.
     * 
     * @param identityData
     */
    public void setIdentityData(net.bcgi.si.messages.mvnoapi.provisioning.IdentityData identityData) {
        this.identityData = identityData;
    }


    /**
     * Gets the motherMaidenName value for this SubscriberDetails.
     * 
     * @return motherMaidenName
     */
    public java.lang.String getMotherMaidenName() {
        return motherMaidenName;
    }


    /**
     * Sets the motherMaidenName value for this SubscriberDetails.
     * 
     * @param motherMaidenName
     */
    public void setMotherMaidenName(java.lang.String motherMaidenName) {
        this.motherMaidenName = motherMaidenName;
    }


    /**
     * Gets the race value for this SubscriberDetails.
     * 
     * @return race
     */
    public java.lang.String getRace() {
        return race;
    }


    /**
     * Sets the race value for this SubscriberDetails.
     * 
     * @param race
     */
    public void setRace(java.lang.String race) {
        this.race = race;
    }


    /**
     * Gets the _any value for this SubscriberDetails.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this SubscriberDetails.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubscriberDetails)) return false;
        SubscriberDetails other = (SubscriberDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addressInfo==null && other.getAddressInfo()==null) || 
             (this.addressInfo!=null &&
              this.addressInfo.equals(other.getAddressInfo()))) &&
            ((this.age==null && other.getAge()==null) || 
             (this.age!=null &&
              this.age.equals(other.getAge()))) &&
            ((this.dateOfBirth==null && other.getDateOfBirth()==null) || 
             (this.dateOfBirth!=null &&
              this.dateOfBirth.equals(other.getDateOfBirth()))) &&
            ((this.gender==null && other.getGender()==null) || 
             (this.gender!=null &&
              this.gender.equals(other.getGender()))) &&
            ((this.identityData==null && other.getIdentityData()==null) || 
             (this.identityData!=null &&
              this.identityData.equals(other.getIdentityData()))) &&
            ((this.motherMaidenName==null && other.getMotherMaidenName()==null) || 
             (this.motherMaidenName!=null &&
              this.motherMaidenName.equals(other.getMotherMaidenName()))) &&
            ((this.race==null && other.getRace()==null) || 
             (this.race!=null &&
              this.race.equals(other.getRace()))) &&
            ((this._any==null && other.get_any()==null) || 
             (this._any!=null &&
              java.util.Arrays.equals(this._any, other.get_any())));
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
        if (getAddressInfo() != null) {
            _hashCode += getAddressInfo().hashCode();
        }
        if (getAge() != null) {
            _hashCode += getAge().hashCode();
        }
        if (getDateOfBirth() != null) {
            _hashCode += getDateOfBirth().hashCode();
        }
        if (getGender() != null) {
            _hashCode += getGender().hashCode();
        }
        if (getIdentityData() != null) {
            _hashCode += getIdentityData().hashCode();
        }
        if (getMotherMaidenName() != null) {
            _hashCode += getMotherMaidenName().hashCode();
        }
        if (getRace() != null) {
            _hashCode += getRace().hashCode();
        }
        if (get_any() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_any());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_any(), i);
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
        new org.apache.axis.description.TypeDesc(SubscriberDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "SubscriberDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "addressInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "AddressInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("age");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "age"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfBirth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "dateOfBirth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gender");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "gender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "GenderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identityData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "identityData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "IdentityData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motherMaidenName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "motherMaidenName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("race");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "race"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
