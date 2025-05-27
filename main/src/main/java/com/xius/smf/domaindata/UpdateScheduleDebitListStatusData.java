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
File Name:UpdateScheduleDebitListStatusData.java
Description:
@Author : naveen.dasyam
@Created Date : Nov 19, 2012
@Modified By:
@Modified Date:
@Modifications:
@Reason for Modification
 */
public class UpdateScheduleDebitListStatusData extends DomainDataBase{

	private BigDecimal[] pi_success_msisdn_list;
	private BigDecimal[] pi_failure_msisdn_list;
	private Long pi_trans_id;
	private BigDecimal[] po_trans_id;
	
	public BigDecimal[] getPo_trans_id() {
		return po_trans_id;
	}
	public void setPo_trans_id(BigDecimal[] po_trans_id) {
		this.po_trans_id = po_trans_id;
	}
	public Long getPi_trans_id() {
		return pi_trans_id;
	}
	public void setPi_trans_id(Long pi_trans_id) {
		this.pi_trans_id = pi_trans_id;
	}
	public BigDecimal[] getPi_success_msisdn_list() {
		return pi_success_msisdn_list;
	}
	public void setPi_success_msisdn_list(BigDecimal[] pi_success_msisdn_list) {
		this.pi_success_msisdn_list = pi_success_msisdn_list;
	}
	public BigDecimal[] getPi_failure_msisdn_list() {
		return pi_failure_msisdn_list;
	}
	public void setPi_failure_msisdn_list(BigDecimal[] pi_failure_msisdn_list) {
		this.pi_failure_msisdn_list = pi_failure_msisdn_list;
	}
	
}