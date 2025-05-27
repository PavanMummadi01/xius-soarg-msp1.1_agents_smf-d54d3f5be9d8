package com.xius.smf.domaindata;

public class ChangeMSISDNRetryUpdateData extends DomainDataBase {

	private String pi_trans_id;
	private String pi_status;
	private String pi_remarks;
	private String pi_ext_error_code;
	private String pi_retry_trans_id;

	public String getPi_retry_trans_id() {
		return pi_retry_trans_id;
	}

	public void setPi_retry_trans_id(String pi_retry_trans_id) {
		this.pi_retry_trans_id = pi_retry_trans_id;
	}

	public String getPi_ext_error_code() {
		return pi_ext_error_code;
	}

	public void setPi_ext_error_code(String pi_ext_error_code) {
		this.pi_ext_error_code = pi_ext_error_code;
	}

	public String getPi_trans_id() {
		return pi_trans_id;
	}

	public void setPi_trans_id(String pi_trans_id) {
		this.pi_trans_id = pi_trans_id;
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

	@Override
	public String toString() {
		return "ChangeMSISDNRetryUpdateData [pi_trans_id=" + pi_trans_id
				+ ", pi_status=" + pi_status + ", pi_remarks=" + pi_remarks
				+ "]";
	}

}
