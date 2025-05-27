package com.xius.smf.domaindata;

public class EmaCmdRetryUpdateData extends DomainDataBase{
	
	private String pi_transaction_id;
	private String pi_retry_login_id;
	private String po_error_msg ;
	
	public String getPi_transaction_id() {
		return pi_transaction_id;
	}
	public void setPi_transaction_id(String pi_transaction_id) {
		this.pi_transaction_id = pi_transaction_id;
	}
	public String getPi_retry_login_id() {
		return pi_retry_login_id;
	}
	public void setPi_retry_login_id(String pi_retry_login_id) {
		this.pi_retry_login_id = pi_retry_login_id;
	}
	public String getPo_error_msg() {
		return po_error_msg;
	}
	public void setPo_error_msg(String po_error_msg) {
		this.po_error_msg = po_error_msg;
	}
}
