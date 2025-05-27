package com.xius.smf.domaindata;

public class InvokeBulkEmaCmdData extends DomainDataBase {

	/*
	 * pkg_ttsa_ema_cmd_request.pro_ttsa_ema_cmd_insert ( pi_network_id IN
	 * NUMBER, pi_login_id IN VARCHAR2, pi_msisdn IN arr_varchar,
	 * pi_command_name IN VARCHAR2, po_transaction_id OUT VARCHAR2,
	 * po_error_code OUT NUMBER, po_error_msg OUT VARCHAR2 );
	 */
	private String[] pi_reason_arr;

	public String[] getPi_reason_arr() {
		return pi_reason_arr;
	}

	public void setPi_reason_arr(String[] pi_reason_arr) {
		this.pi_reason_arr = pi_reason_arr;
	}

	private String[] pi_msisdn;
	private String pi_command_name;
	private String po_transaction_id;

	public String[] getPi_msisdn() {
		return pi_msisdn;
	}

	public void setPi_msisdn(String[] pi_msisdn) {
		this.pi_msisdn = pi_msisdn;
	}

	public String getPi_command_name() {
		return pi_command_name;
	}

	public void setPi_command_name(String pi_command_name) {
		this.pi_command_name = pi_command_name;
	}

	public String getPo_transaction_id() {
		return po_transaction_id;
	}

	public void setPo_transaction_id(String po_transaction_id) {
		this.po_transaction_id = po_transaction_id;
	}

}
