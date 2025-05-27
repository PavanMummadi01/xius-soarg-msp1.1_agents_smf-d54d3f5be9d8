package com.xius.smf.domaindata;

public class StateChangeRetryCursorData {

	private Integer network_id;
	private Long account_id;
	private Long imsi_no;
	private Long msisdn_no;
	private String status_change_date;
	private String old_state;
	private String new_state;
	private String processing_flag;
	private String transaction_date;
	private String trans_status;
	private String remarks;
	private String ext_trans_id;
	private String retry_processing_flag;
	private String retry_counter;
	private String notification_flag;
	private String technology;
	private String retry_transaction_ext_id;
	private String sim_serial_no;

	public String getSim_serial_no() {
		return sim_serial_no;
	}

	public void setSim_serial_no(String sim_serial_no) {
		this.sim_serial_no = sim_serial_no;
	}

	public Integer getNetwork_id() {
		return network_id;
	}

	public void setNetwork_id(Integer network_id) {
		this.network_id = network_id;
	}

	public Long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(Long account_id) {
		this.account_id = account_id;
	}

	public Long getImsi_no() {
		return imsi_no;
	}

	public void setImsi_no(Long imsi_no) {
		this.imsi_no = imsi_no;
	}

	public Long getMsisdn_no() {
		return msisdn_no;
	}

	public void setMsisdn_no(Long msisdn_no) {
		this.msisdn_no = msisdn_no;
	}

	public String getStatus_change_date() {
		return status_change_date;
	}

	public void setStatus_change_date(String status_change_date) {
		this.status_change_date = status_change_date;
	}

	public String getOld_state() {
		return old_state;
	}

	public void setOld_state(String old_state) {
		this.old_state = old_state;
	}

	public String getNew_state() {
		return new_state;
	}

	public void setNew_state(String new_state) {
		this.new_state = new_state;
	}

	public String getProcessing_flag() {
		return processing_flag;
	}

	public void setProcessing_flag(String processing_flag) {
		this.processing_flag = processing_flag;
	}

	public String getTransaction_date() {
		return transaction_date;
	}

	public void setTransaction_date(String transaction_date) {
		this.transaction_date = transaction_date;
	}

	public String getTrans_status() {
		return trans_status;
	}

	public void setTrans_status(String trans_status) {
		this.trans_status = trans_status;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getExt_trans_id() {
		return ext_trans_id;
	}

	public void setExt_trans_id(String ext_trans_id) {
		this.ext_trans_id = ext_trans_id;
	}

	public String getRetry_processing_flag() {
		return retry_processing_flag;
	}

	public void setRetry_processing_flag(String retry_processing_flag) {
		this.retry_processing_flag = retry_processing_flag;
	}

	public String getRetry_counter() {
		return retry_counter;
	}

	public void setRetry_counter(String retry_counter) {
		this.retry_counter = retry_counter;
	}

	public String getNotification_flag() {
		return notification_flag;
	}

	public void setNotification_flag(String notification_flag) {
		this.notification_flag = notification_flag;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public String getRetry_transaction_ext_id() {
		return retry_transaction_ext_id;
	}

	public void setRetry_transaction_ext_id(String retry_transaction_ext_id) {
		this.retry_transaction_ext_id = retry_transaction_ext_id;
	}

}
