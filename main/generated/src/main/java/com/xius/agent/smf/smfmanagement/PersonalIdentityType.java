
package com.xius.agent.smf.smfmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonalIdentityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PersonalIdentityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MYKAD_ID"/>
 *     &lt;enumeration value="PASSPORT_NO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PersonalIdentityType")
@XmlEnum
public enum PersonalIdentityType {

    MYKAD_ID,
    PASSPORT_NO;

    public String value() {
        return name();
    }

    public static PersonalIdentityType fromValue(String v) {
        return valueOf(v);
    }

}
