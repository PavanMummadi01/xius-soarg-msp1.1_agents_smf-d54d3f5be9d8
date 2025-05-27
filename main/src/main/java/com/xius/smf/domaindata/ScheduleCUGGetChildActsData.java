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
File Name:ScheduleCUGGetChildActsData.java
Description:
@Author : naveen.dasyam
@Created Date : Nov 19, 2012
@Modified By:
@Modified Date:
@Modifications:
@Reason for Modification
 */
public class ScheduleCUGGetChildActsData extends DomainDataBase{

	private Integer pi_maxRecords;
	private BigDecimal[] pio_customerGroupId;
	private BigDecimal[] pio_parent_msisdns;
	private BigDecimal[] po_transId;
	private String[] po_child_msisdns;
	private String[] po_topUpAmounts;
	private String[] po_validityDates;
	private String[] po_expiryDates;
	private String[] po_gracePeriodIEndDate;
	
	public Integer getPi_maxRecords() {
		return pi_maxRecords;
	}
	public void setPi_maxRecords(Integer pi_maxRecords) {
		this.pi_maxRecords = pi_maxRecords;
	}
	public BigDecimal[] getPio_customerGroupId() {
		return pio_customerGroupId;
	}
	public void setPio_customerGroupId(BigDecimal[] pio_customerGroupId) {
		this.pio_customerGroupId = pio_customerGroupId;
	}
	public BigDecimal[] getPio_parent_msisdns() {
		return pio_parent_msisdns;
	}
	public void setPio_parent_msisdns(BigDecimal[] pio_parent_msisdns) {
		this.pio_parent_msisdns = pio_parent_msisdns;
	}
	public BigDecimal[] getPo_transId() {
		return po_transId;
	}
	public void setPo_transId(BigDecimal[] po_transId) {
		this.po_transId = po_transId;
	}
	public String[] getPo_child_msisdns() {
		return po_child_msisdns;
	}
	public void setPo_child_msisdns(String[] po_child_msisdns) {
		this.po_child_msisdns = po_child_msisdns;
	}
	public String[] getPo_topUpAmounts() {
		return po_topUpAmounts;
	}
	public void setPo_topUpAmounts(String[] po_topUpAmounts) {
		this.po_topUpAmounts = po_topUpAmounts;
	}
	public String[] getPo_validityDates() {
		return po_validityDates;
	}
	public void setPo_validityDates(String[] po_validityDates) {
		this.po_validityDates = po_validityDates;
	}
	public String[] getPo_expiryDates() {
		return po_expiryDates;
	}
	public void setPo_expiryDates(String[] po_expiryDates) {
		this.po_expiryDates = po_expiryDates;
	}
	public String[] getPo_gracePeriodIEndDate() {
		return po_gracePeriodIEndDate;
	}
	public void setPo_gracePeriodIEndDate(String[] po_gracePeriodIEndDate) {
		this.po_gracePeriodIEndDate = po_gracePeriodIEndDate;
	}
	
}