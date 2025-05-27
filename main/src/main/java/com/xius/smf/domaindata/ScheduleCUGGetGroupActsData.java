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
File Name:ScheduleCUGGetGroupActsData.java
Description:
@Author : naveen.dasyam
@Created Date : Nov 19, 2012
@Modified By:
@Modified Date:
@Modifications:
@Reason for Modification
 */
public class ScheduleCUGGetGroupActsData extends DomainDataBase{

	private Integer pi_maxRecords;
	private BigDecimal[] po_customerGroupId;
	private BigDecimal[] po_parent_msisdns;
	private BigDecimal[] po_debitAmounts;
	
	public Integer getPi_maxRecords() {
		return pi_maxRecords;
	}
	public void setPi_maxRecords(Integer pi_maxRecords) {
		this.pi_maxRecords = pi_maxRecords;
	}
	public BigDecimal[] getPo_customerGroupId() {
		return po_customerGroupId;
	}
	public void setPo_customerGroupId(BigDecimal[] po_customerGroupId) {
		this.po_customerGroupId = po_customerGroupId;
	}
	public BigDecimal[] getPo_parent_msisdns() {
		return po_parent_msisdns;
	}
	public void setPo_parent_msisdns(BigDecimal[] po_parent_msisdns) {
		this.po_parent_msisdns = po_parent_msisdns;
	}
	public BigDecimal[] getPo_debitAmounts() {
		return po_debitAmounts;
	}
	public void setPo_debitAmounts(BigDecimal[] po_debitAmounts) {
		this.po_debitAmounts = po_debitAmounts;
	}
	
}