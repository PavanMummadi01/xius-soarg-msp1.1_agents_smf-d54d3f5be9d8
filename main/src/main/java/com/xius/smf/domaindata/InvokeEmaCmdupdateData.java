package com.xius.smf.domaindata;

public class InvokeEmaCmdupdateData extends DomainDataBase {

	private String pi_transaction_id;
	private String pi_status;
	private String pi_remarks;
	private Long pi_max_retry_count;
	private String pi_cmd;
	private String po_error_msg;
	private String pi_error_code;
	private String pi_error_msg;
	private String pi_cmd_resp_time;

	@Override
	public String toString() {
		return "InvokeEmaCmdupdateData [pi_transaction_id=" + pi_transaction_id
				+ ", pi_status=" + pi_status + ", pi_remarks=" + pi_remarks
				+ ", pi_max_retry_count=" + pi_max_retry_count + ", pi_cmd="
				+ pi_cmd + ", po_error_msg=" + po_error_msg
				+ ", pi_error_code=" + pi_error_code + ", pi_error_msg="
				+ pi_error_msg + ", pi_cmd_resp_time=" + pi_cmd_resp_time + "]";
	}

	public String getPi_cmd_resp_time() {
		return pi_cmd_resp_time;
	}

	public void setPi_cmd_resp_time(String pi_cmd_resp_time) {
		this.pi_cmd_resp_time = pi_cmd_resp_time;
	}

	public String getPi_error_code() {
		return pi_error_code;
	}

	public void setPi_error_code(String pi_error_code) {
		this.pi_error_code = pi_error_code;
	}

	public String getPi_error_msg() {
		return pi_error_msg;
	}

	public void setPi_error_msg(String pi_error_msg) {
		this.pi_error_msg = pi_error_msg;
	}

	public String getPi_transaction_id() {
		return pi_transaction_id;
	}

	public void setPi_transaction_id(String pi_transaction_id) {
		this.pi_transaction_id = pi_transaction_id;
	}

	public String getPi_status() {
		return pi_status;
	}

	public void setPi_status(String pi_status) {
		this.pi_status = pi_status;
	}

	public String getPi_remarks() {
		return pi_remarks;
	}

	public void setPi_remarks(String pi_remarks) {
		this.pi_remarks = pi_remarks;
	}

	public Long getPi_max_retry_count() {
		return pi_max_retry_count;
	}

	public void setPi_max_retry_count(Long pi_max_retry_count) {
		this.pi_max_retry_count = pi_max_retry_count;
	}

	public String getPi_cmd() {
		return pi_cmd;
	}

	public void setPi_cmd(String pi_cmd) {
		this.pi_cmd = pi_cmd;
	}

	public String getPo_error_msg() {
		return po_error_msg;
	}

	public void setPo_error_msg(String po_error_msg) {
		this.po_error_msg = po_error_msg;
	}
}
