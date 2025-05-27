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



/**
File Name:UpdateScheduleTopUpListStatusData.java
Description:
@Author : naveen.dasyam
@Created Date : Nov 19, 2012
@Modified By:
@Modified Date:
@Modifications:
@Reason for Modification
 */
public class UpdateScheduleTopUpListStatusData extends DomainDataBase{

	private BigDecimal[] pi_parent_msisdns;
	private BigDecimal[] pi_transIds;
	private String[] pi_success_msisdn_list;
	private String[] pi_failure_msisdn_list;
	private String[] pi_failure_msisdn_topup_list;
	
	public BigDecimal[] getPi_parent_msisdns() {
		return pi_parent_msisdns;
	}
	public void setPi_parent_msisdns(BigDecimal[] pi_parent_msisdns) {
		this.pi_parent_msisdns = pi_parent_msisdns;
	}
	public BigDecimal[] getPi_transIds() {
		return pi_transIds;
	}
	public void setPi_transIds(BigDecimal[] pi_transIds) {
		this.pi_transIds = pi_transIds;
	}
	public String[] getPi_success_msisdn_list() {
		return pi_success_msisdn_list;
	}
	public void setPi_success_msisdn_list(String[] pi_success_msisdn_list) {
		this.pi_success_msisdn_list = pi_success_msisdn_list;
	}
	public String[] getPi_failure_msisdn_list() {
		return pi_failure_msisdn_list;
	}
	public void setPi_failure_msisdn_list(String[] pi_failure_msisdn_list) {
		this.pi_failure_msisdn_list = pi_failure_msisdn_list;
	}
	public String[] getPi_failure_msisdn_topup_list() {
		return pi_failure_msisdn_topup_list;
	}
	public void setPi_failure_msisdn_topup_list(
			String[] pi_failure_msisdn_topup_list) {
		this.pi_failure_msisdn_topup_list = pi_failure_msisdn_topup_list;
	}
	
}