/**
 * Copyright   2006 New Wireless Services, Inc.
 * All rights reserved. These computer programs, listings, and
 * Specificaions are the property of New Wireless Services,
 * Inc. and may not be copied, stored, used or transmitted, in
 * whole or in part, in any for or by any means, without the
 * prior written permission of New Wireless Services, Inc.
 *
 */
package com.xius.smf.domaindata;

import java.util.List;

public class PostPaidRegStatusData extends DomainDataBase {

	private String  pio_trans_id;
	private String pi_sim_serial_no;
	private Long   pi_msisdn_no;
	
	List <PostPaidRegStatusRefCurData> po_sim_reg_status;

	public String getPio_trans_id() {
		return pio_trans_id;
	}

	public void setPio_trans_id(String pio_trans_id) {
		this.pio_trans_id = pio_trans_id;
	}

	public String getPi_sim_serial_no() {
		return pi_sim_serial_no;
	}

	public void setPi_sim_serial_no(String pi_sim_serial_no) {
		this.pi_sim_serial_no = pi_sim_serial_no;
	}

	public Long getPi_msisdn_no() {
		return pi_msisdn_no;
	}

	public void setPi_msisdn_no(Long pi_msisdn_no) {
		this.pi_msisdn_no = pi_msisdn_no;
	}

	public List<PostPaidRegStatusRefCurData> getPo_sim_reg_status() {
		return po_sim_reg_status;
	}

	public void setPo_sim_reg_status(
			List<PostPaidRegStatusRefCurData> po_sim_reg_status) {
		this.po_sim_reg_status = po_sim_reg_status;
	}
	
	
}