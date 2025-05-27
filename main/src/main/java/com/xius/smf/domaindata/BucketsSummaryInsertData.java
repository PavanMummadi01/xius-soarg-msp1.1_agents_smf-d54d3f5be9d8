package com.xius.smf.domaindata;

public class BucketsSummaryInsertData extends DomainDataBase{
	
	private Long pi_msisdn_no;
	private Long pi_account_id;
	private String pi_channel_id;
	private String pi_ext_trans_id;
	private String po_transaction_id;
	
	public Long getPi_msisdn_no() {
		return pi_msisdn_no;
	}
	public void setPi_msisdn_no(Long pi_msisdn_no) {
		this.pi_msisdn_no = pi_msisdn_no;
	}
	public Long getPi_account_id() {
		return pi_account_id;
	}
	public void setPi_account_id(Long pi_account_id) {
		this.pi_account_id = pi_account_id;
	}
	public String getPi_channel_id() {
		return pi_channel_id;
	}
	public void setPi_channel_id(String pi_channel_id) {
		this.pi_channel_id = pi_channel_id;
	}
	public String getPi_ext_trans_id() {
		return pi_ext_trans_id;
	}
	public void setPi_ext_trans_id(String pi_ext_trans_id) {
		this.pi_ext_trans_id = pi_ext_trans_id;
	}
	public String getPo_transaction_id() {
		return po_transaction_id;
	}
	public void setPo_transaction_id(String po_transaction_id) {
		this.po_transaction_id = po_transaction_id;
	}
	
	public String toString() {
		return "BucketsSummaryInsertData [pi_msisdn_no=" + pi_msisdn_no
				+ ", pi_account_id=" + pi_account_id + ", pi_channel_id="
				+ pi_channel_id + ", pi_ext_trans_id=" + pi_ext_trans_id
				+ ", po_transaction_id=" + po_transaction_id
				+ ", pi_network_id=" + pi_network_id + ", pi_login_id="
				+ pi_login_id + ", pi_password=" + pi_password
				+ ", pi_username=" + pi_username + ", po_error_code="
				+ po_error_code + ", pi_app_id=" + pi_app_id
				+ ", po_error_desc=" + po_error_desc + "]";
	}
	
	
}
