
package com.xius.agent.smf.smfmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegistrationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RegistrationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="REG_BLOCK_MDN"/>
 *     &lt;enumeration value="REG_SUB_ONLY"/>
 *     &lt;enumeration value="REG_WITHOUT_MDN"/>
 *     &lt;enumeration value="REG_NEW_MDN"/>
 *     &lt;enumeration value="REG_BARE_BONE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RegistrationType")
@XmlEnum
public enum RegistrationType {

    REG_BLOCK_MDN,
    REG_SUB_ONLY,
    REG_WITHOUT_MDN,
    REG_NEW_MDN,
    REG_BARE_BONE;

    public String value() {
        return name();
    }

    public static RegistrationType fromValue(String v) {
        return valueOf(v);
    }

}
