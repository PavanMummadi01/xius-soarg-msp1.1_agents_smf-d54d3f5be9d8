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

import java.util.List;

/**
File Name:DemographicDetailsData.java
Description:
@Author : naveen.dasyam
@Created Date : Aug 29, 2013
@Modified By:
@Modified Date:
@Modifications:
@Reason for Modification
 */
public class DemographicDetailsData extends DomainDataBase{

	private String pio_transaction_no;
	private String pi_sim_no;
	private List<DemographicCursorData> po_sub_trans_det_ref_cursor;
	private Long po_retry_cnt;
	private Long po_error_code;
	private String po_error_desc;
	
	public String getPio_transaction_no() {
		return pio_transaction_no;
	}
	public void setPio_transaction_no(String pio_transaction_no) {
		this.pio_transaction_no = pio_transaction_no;
	}
	public String getPi_sim_no() {
		return pi_sim_no;
	}
	public void setPi_sim_no(String pi_sim_no) {
		this.pi_sim_no = pi_sim_no;
	}
	public Long getPo_retry_cnt() {
		return po_retry_cnt;
	}
	public List<DemographicCursorData> getPo_sub_trans_det_ref_cursor() {
		return po_sub_trans_det_ref_cursor;
	}
	public void setPo_sub_trans_det_ref_cursor(
			List<DemographicCursorData> po_sub_trans_det_ref_cursor) {
		this.po_sub_trans_det_ref_cursor = po_sub_trans_det_ref_cursor;
	}
	public void setPo_retry_cnt(Long po_retry_cnt) {
		this.po_retry_cnt = po_retry_cnt;
	}
	public Long getPo_error_code() {
		return po_error_code;
	}
	public void setPo_error_code(Long po_error_code) {
		this.po_error_code = po_error_code;
	}
	public String getPo_error_desc() {
		return po_error_desc;
	}
	public void setPo_error_desc(String po_error_desc) {
		this.po_error_desc = po_error_desc;
	}
	
}