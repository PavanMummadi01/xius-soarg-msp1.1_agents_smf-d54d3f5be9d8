package com.xius.smf.domaindata;

public class HlrStateChngCurData {

	private Long imsi_no;

	@Override
	public String toString() {
		return "HlrStateChngCurData [imsi_no=" + imsi_no + ", msisdn_no="
				+ msisdn_no + ", status_change_date=" + status_change_date
				+ ", old_state=" + old_state + ", new_state=" + new_state
				+ ", processing_flag=" + processing_flag
				+ ", transaction_date=" + transaction_date + ", ext_trans_id="
				+ ext_trans_id + ", technology=" + technology + ", account_id="
				+ account_id + ", sim_serial_no=" + sim_serial_no
				+ ", network_id=" + network_id + "]";
	}

	private Long msisdn_no;
	private String status_change_date;
	private String old_state;
	private String new_state;
	private String processing_flag;
	private String transaction_date;
	private String ext_trans_id;
	private String technology;
	private Long account_id;
	private String sim_serial_no;
	private Integer network_id;

	

	public Integer getNetwork_id() {
		return network_id;
	}

	public void setNetwork_id(Integer network_id) {
		this.network_id = network_id;
	}

	public String getSim_serial_no() {
		return sim_serial_no;
	}

	public void setSim_serial_no(String sim_serial_no) {
		this.sim_serial_no = sim_serial_no;
	}

	/*public String getAccount_id() {
		return account_id;
	}

	public void setAccount_id(String account_id) {
		this.account_id = account_id;
	}

	public String getImsi_no() {
		return imsi_no;
	}

	public void setImsi_no(String imsi_no) {
		this.imsi_no = imsi_no;
	}

	public String getMsisdn_no() {
		return msisdn_no;
	}

	public void setMsisdn_no(String msisdn_no) {
		this.msisdn_no = msisdn_no;
	}*/

	public String getStatus_change_date() {
		return status_change_date;
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

	public Long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(Long account_id) {
		this.account_id = account_id;
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

	public String getExt_trans_id() {
		return ext_trans_id;
	}

	public void setExt_trans_id(String ext_trans_id) {
		this.ext_trans_id = ext_trans_id;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

}
