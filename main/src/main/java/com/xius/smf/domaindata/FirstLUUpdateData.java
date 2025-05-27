package com.xius.smf.domaindata;

public class FirstLUUpdateData extends DomainDataBase {

	private String pi_trans_id ;
	private Long pi_curr_state_id ;
	private String pi_sim_serial_no ;
	private Long pi_new_msisdn_no ;
	private String pi_status ;
	private String pi_remarks ;
	private Long pi_old_msisdn_no;
	private String pi_ban;
	private String pi_link_transaction_id;
	private String pi_ext_error_code;
	
	
	
	public String getPi_ext_error_code() {
		return pi_ext_error_code;
	}
	public void setPi_ext_error_code(String pi_ext_error_code) {
		this.pi_ext_error_code = pi_ext_error_code;
	}
	public String getPi_link_transaction_id() {
		return pi_link_transaction_id;
	}
	public void setPi_link_transaction_id(String pi_link_transaction_id) {
		this.pi_link_transaction_id = pi_link_transaction_id;
	}
	public Long getPi_new_msisdn_no() {
		return pi_new_msisdn_no;
	}
	public void setPi_new_msisdn_no(Long pi_new_msisdn_no) {
		this.pi_new_msisdn_no = pi_new_msisdn_no;
	}
	public Long getPi_old_msisdn_no() {
		return pi_old_msisdn_no;
	}
	public void setPi_old_msisdn_no(Long pi_old_msisdn_no) {
		this.pi_old_msisdn_no = pi_old_msisdn_no;
	}
	public String getPi_ban() {
		return pi_ban;
	}
	public void setPi_ban(String pi_ban) {
		this.pi_ban = pi_ban;
	}
	public String getPi_trans_id() {
		return pi_trans_id;
	}
	public void setPi_trans_id(String pi_trans_id) {
		this.pi_trans_id = pi_trans_id;
	}
	public Long getPi_curr_state_id() {
		return pi_curr_state_id;
	}
	public void setPi_curr_state_id(Long pi_curr_state_id) {
		this.pi_curr_state_id = pi_curr_state_id;
	}
	public String getPi_sim_serial_no() {
		return pi_sim_serial_no;
	}
	public void setPi_sim_serial_no(String pi_sim_serial_no) {
		this.pi_sim_serial_no = pi_sim_serial_no;
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
	
	
}
