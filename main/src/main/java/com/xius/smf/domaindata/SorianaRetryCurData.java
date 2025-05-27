package com.xius.smf.domaindata;

public class SorianaRetryCurData {
	
	
	private Long network_id; 
	private String trans_id; 
	private String retry_transaction_id; 
	private Long msisdn_no;
	private Long imsi;
	private Long sim_serial_no; 
	private Long old_msisdn_no; 
	private String bussines_account_id;
	private String activity_type;
	
	
	
	public Long getNetwork_id() {
		return network_id;
	}
	public void setNetwork_id(Long network_id) {
		this.network_id = network_id;
	}
	public String getTrans_id() {
		return trans_id;
	}
	public void setTrans_id(String trans_id) {
		this.trans_id = trans_id;
	}
	public String getRetry_transaction_id() {
		return retry_transaction_id;
	}
	public void setRetry_transaction_id(String retry_transaction_id) {
		this.retry_transaction_id = retry_transaction_id;
	}
	public Long getMsisdn_no() {
		return msisdn_no;
	}
	public void setMsisdn_no(Long msisdn_no) {
		this.msisdn_no = msisdn_no;
	}
	public Long getImsi() {
		return imsi;
	}
	public void setImsi(Long imsi) {
		this.imsi = imsi;
	}
	public Long getSim_serial_no() {
		return sim_serial_no;
	}
	public void setSim_serial_no(Long sim_serial_no) {
		this.sim_serial_no = sim_serial_no;
	}
	public Long getOld_msisdn_no() {
		return old_msisdn_no;
	}
	public void setOld_msisdn_no(Long old_msisdn_no) {
		this.old_msisdn_no = old_msisdn_no;
	}
	public String getBussines_account_id() {
		return bussines_account_id;
	}
	public void setBussines_account_id(String bussines_account_id) {
		this.bussines_account_id = bussines_account_id;
	}
	public String getActivity_type() {
		return activity_type;
	}
	public void setActivity_type(String activity_type) {
		this.activity_type = activity_type;
	}
	
	
	@Override
	public String toString() {
		return "SorianaRetryCurData [network_id=" + network_id + ", trans_id="
				+ trans_id + ", retry_transaction_id=" + retry_transaction_id
				+ ", msisdn_no=" + msisdn_no + ", imsi=" + imsi
				+ ", sim_serial_no=" + sim_serial_no + ", old_msisdn_no="
				+ old_msisdn_no + ", bussines_account_id="
				+ bussines_account_id + ", activity_type=" + activity_type
				+ "]";
	}
	
	
	
	
}
