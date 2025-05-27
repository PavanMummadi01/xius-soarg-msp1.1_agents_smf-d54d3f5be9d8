package com.xius.smf.domaindata;

public class UpdtPrsnlDtlsUpdateData extends DomainDataBase {

	private String pi_status;
	private String pi_curr_state_id;
	private String pi_trans_id;
	private String pi_remarks;
	private String pi_ext_errore_code;
	

	

	public String getPi_ext_errore_code() {
		return pi_ext_errore_code;
	}

	public void setPi_ext_errore_code(String pi_ext_errore_code) {
		this.pi_ext_errore_code = pi_ext_errore_code;
	}

	public String getPi_status() {
		return pi_status;
	}

	public void setPi_status(String pi_status) {
		this.pi_status = pi_status;
	}

	public String getPi_curr_state_id() {
		return pi_curr_state_id;
	}

	public void setPi_curr_state_id(String pi_curr_state_id) {
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

	
}
