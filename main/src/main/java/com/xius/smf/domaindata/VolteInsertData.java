package com.xius.smf.domaindata;

public class VolteInsertData extends DomainDataBase{
	
	private Long pi_msisdn_no;
	private Long pi_acc_type;
	private String pi_channel_name;
	private String pi_ext_transaction_id;
	private Long po_intrnl_transaction_id;
	private String pi_service_flag;
	private Long  pi_activity_id;
	private Long pi_account_id;
	private String pi_sim_serial_no;
	private Long pi_imsi_no;
	private String pi_acct_status;
	
	
	public Long getPi_activity_id() {
		return pi_activity_id;
	}
	public void setPi_activity_id(Long pi_activity_id) {
		this.pi_activity_id = pi_activity_id;
	}
	public Long getPi_account_id() {
		return pi_account_id;
	}
	public void setPi_account_id(Long pi_account_id) {
		this.pi_account_id = pi_account_id;
	}
	public String getPi_sim_serial_no() {
		return pi_sim_serial_no;
	}
	public void setPi_sim_serial_no(String pi_sim_serial_no) {
		this.pi_sim_serial_no = pi_sim_serial_no;
	}
	public Long getPi_imsi_no() {
		return pi_imsi_no;
	}
	public void setPi_imsi_no(Long pi_imsi_no) {
		this.pi_imsi_no = pi_imsi_no;
	}
	public String getPi_acct_status() {
		return pi_acct_status;
	}
	public void setPi_acct_status(String pi_acct_status) {
		this.pi_acct_status = pi_acct_status;
	}
	public Long getPi_msisdn_no() {
		return pi_msisdn_no;
	}
	public void setPi_msisdn_no(Long pi_msisdn_no) {
		this.pi_msisdn_no = pi_msisdn_no;
	}
		
	public Long getPi_acc_type() {
		return pi_acc_type;
	}
	public void setPi_acc_type(Long pi_acc_type) {
		this.pi_acc_type = pi_acc_type;
	}
	public String getPi_channel_name() {
		return pi_channel_name;
	}
	public void setPi_channel_name(String pi_channel_name) {
		this.pi_channel_name = pi_channel_name;
	}
	public String getPi_ext_transaction_id() {
		return pi_ext_transaction_id;
	}
	public void setPi_ext_transaction_id(String pi_ext_transaction_id) {
		this.pi_ext_transaction_id = pi_ext_transaction_id;
	}
	public Long getPo_intrnl_transaction_id() {
		return po_intrnl_transaction_id;
	}
	public void setPo_intrnl_transaction_id(Long po_intrnl_transaction_id) {
		this.po_intrnl_transaction_id = po_intrnl_transaction_id;
	}
	public String getPi_service_flag() {
		return pi_service_flag;
	}
	public void setPi_service_flag(String pi_service_flag) {
		this.pi_service_flag = pi_service_flag;
	}
	@Override
	public String toString() {
		return "VolteInsertData [pi_msisdn_no=" + pi_msisdn_no
				+ ", pi_acc_type=" + pi_acc_type + ", pi_channel_name="
				+ pi_channel_name + ", pi_ext_transaction_id="
				+ pi_ext_transaction_id + ", po_intrnl_transaction_id="
				+ po_intrnl_transaction_id + ", pi_service_flag="
				+ pi_service_flag + ", pi_activity_id=" + pi_activity_id
				+ ", pi_account_id=" + pi_account_id + ", pi_sim_serial_no="
				+ pi_sim_serial_no + ", pi_imsi_no=" + pi_imsi_no
				+ ", pi_acct_status=" + pi_acct_status + "]";
	}
	
	
	
}
