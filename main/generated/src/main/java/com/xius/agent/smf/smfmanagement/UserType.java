
package com.xius.agent.smf.smfmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SUBSCRIBER"/>
 *     &lt;enumeration value="DEALER"/>
 *     &lt;enumeration value="USSD"/>
 *     &lt;enumeration value="TTCARE"/>
 *     &lt;enumeration value="CORP"/>
 *     &lt;enumeration value="CCUI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UserType")
@XmlEnum
public enum UserType {

    SUBSCRIBER,
    DEALER,
    USSD,
    TTCARE,
    CORP,
    CCUI;

    public String value() {
        return name();
    }

    public static UserType fromValue(String v) {
        return valueOf(v);
    }

}
