package com.xius.smf.domaindata;

public class InsertSubsFlowTrackerData extends DomainDataBase {

	private String pi_request_data;
	private String pi_flow_id;
	private String pi_channel;
	private String pi_user_id;
	private String po_transaction_id;
	private Long pi_msisdn_no;
	private Long pi_acc_type;
	private String pi_trans_id;
	private String pi_publicity_id;

	public String getPi_publicity_id() {
		return pi_publicity_id;
	}

	public void setPi_publicity_id(String pi_publicity_id) {
		this.pi_publicity_id = pi_publicity_id;
	}

	public String getPi_trans_id() {
		return pi_trans_id;
	}

	public void setPi_trans_id(String pi_trans_id) {
		this.pi_trans_id = pi_trans_id;
	}

	private Long pi_account_id;
	private String pi_sim_serial_no;
	private Long pi_imsi_no;
	private String pi_acct_status;

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

	public String getPi_request_data() {
		return pi_request_data;
	}

	public void setPi_request_data(String pi_request_data) {
		this.pi_request_data = pi_request_data;
	}

	public String getPi_flow_id() {
		return pi_flow_id;
	}

	public void setPi_flow_id(String pi_flow_id) {
		this.pi_flow_id = pi_flow_id;
	}

	public String getPi_channel() {
		return pi_channel;
	}

	public void setPi_channel(String pi_channel) {
		this.pi_channel = pi_channel;
	}

	public String getPi_user_id() {
		return pi_user_id;
	}

	public void setPi_user_id(String pi_user_id) {
		this.pi_user_id = pi_user_id;
	}

	public String getPo_transaction_id() {
		return po_transaction_id;
	}

	public void setPo_transaction_id(String po_transaction_id) {
		this.po_transaction_id = po_transaction_id;
	}

}
