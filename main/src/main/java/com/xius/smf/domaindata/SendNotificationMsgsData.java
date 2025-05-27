/**
 * Copyright   2006 New Wireless Services, Inc.
 * All rights reserved. These computer programs, listings, and
 * specifications are the property of New Wireless Services,
 * Inc. and may not be copied, stored, used or transmitted, in
 * whole or in part, in any for or by any means, without the
 * prior written permission of New Wireless Services, Inc.
 *
 */
package com.xius.smf.domaindata;

import java.math.BigDecimal;

import com.xius.smf.domaindata.DomainDataBase;

/**
File Name:SendNotificationMsgsData.java
Description:
@Author : Sampath.k
@Created Date : Jul 12, 2012
@Modified By:
@Modified Date:
@Modifications:
@Reason for Modification
 */
public class SendNotificationMsgsData extends DomainDataBase{
	
	private Long pi_msisdn;
	private String pi_data;
	private String pi_sms_ussd_flag;
	private String pi_flag;
	/**
	 * @return the pi_msisdn
	 */
	public Long getPi_msisdn() {
		return pi_msisdn;
	}
	/**
	 * @param pi_msisdn the pi_msisdn to set
	 */
	public void setPi_msisdn(Long pi_msisdn) {
		this.pi_msisdn = pi_msisdn;
	}
	/**
	 * @return the pi_data
	 */
	public String getPi_data() {
		return pi_data;
	}
	/**
	 * @param pi_data the pi_data to set
	 */
	public void setPi_data(String pi_data) {
		this.pi_data = pi_data;
	}
	/**
	 * @return the pi_sms_ussd_flag
	 */
	public String getPi_sms_ussd_flag() {
		return pi_sms_ussd_flag;
	}
	/**
	 * @param pi_sms_ussd_flag the pi_sms_ussd_flag to set
	 */
	public void setPi_sms_ussd_flag(String pi_sms_ussd_flag) {
		this.pi_sms_ussd_flag = pi_sms_ussd_flag;
	}
	
	public String getPi_flag() {
		return pi_flag;
	}
	public void setPi_flag(String pi_flag) {
		this.pi_flag = pi_flag;
	}
	

	
}