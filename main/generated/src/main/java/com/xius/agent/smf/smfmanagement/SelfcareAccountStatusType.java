
package com.xius.agent.smf.smfmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SelfcareAccountStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SelfcareAccountStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="LOCKED"/>
 *     &lt;enumeration value="EXPIRED"/>
 *     &lt;enumeration value="DEACTIVE"/>
 *     &lt;enumeration value="PENDING"/>
 *     &lt;enumeration value="SUBMITTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SelfcareAccountStatusType")
@XmlEnum
public enum SelfcareAccountStatusType {

    ACTIVE,
    LOCKED,
    EXPIRED,
    DEACTIVE,
    PENDING,
    SUBMITTED;

    public String value() {
        return name();
    }

    public static SelfcareAccountStatusType fromValue(String v) {
        return valueOf(v);
    }

}
