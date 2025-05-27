package com.xius.smf.domaindata;

public class UpdateSIMActivationData extends DomainDataBase {

	private String pi_status;
	private Long pi_curr_state_id;
	private String pi_trans_id;
	private String pi_remarks;
	private String resp_msg;
	private Long pi_new_msisdn_no;

	public Long getPi_new_msisdn_no() {
		return pi_new_msisdn_no;
	}

	public void setPi_new_msisdn_no(Long pi_new_msisdn_no) {
		this.pi_new_msisdn_no = pi_new_msisdn_no;
	}

	public String getPi_status() {
		return pi_status;
	}

	public void setPi_status(String pi_status) {
		this.pi_status = pi_status;
	}

	public Long getPi_curr_state_id() {
		return pi_curr_state_id;
	}

	public void setPi_curr_state_id(Long pi_curr_state_id) {
		this.pi_curr_state_id = pi_curr_state_id;
	}

	public String getPi_trans_id() {
		return pi_trans_id;
	}

	public void setPi_trans_id(String pi_trans_id) {
		this.pi_trans_id = pi_trans_id;
	}

	public String getPi_remarks() {
		return pi_remarks;
	}

	public void setPi_remarks(String pi_remarks) {
		this.pi_remarks = pi_remarks;
	}

	public String getResp_msg() {
		return resp_msg;
	}

	public void setResp_msg(String resp_msg) {
		this.resp_msg = resp_msg;
	}

}
