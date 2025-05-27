package com.xius.smf.domaindata;

import java.util.ArrayList;

public class DataRenewalDataThresholdData extends DomainDataBase{
	private Long pi_maxRecords;
	private ArrayList<DataRenewalDataThresholdCursorData> cursor;
	
	//To Update
	private String status;
	private String remarks;
	private Long transaction_id;
	
	//To Get LAC SAC
	private Long account_id;
	private String  lac_sac;
	private String  sim;
	private Long  imsi;
	
	public Long getPi_maxRecords() {
		return pi_maxRecords;
	}
	public void setPi_maxRecords(Long pi_maxRecords) {
		this.pi_maxRecords = pi_maxRecords;
	}
	public ArrayList<DataRenewalDataThresholdCursorData> getCursor() {
		return cursor;
	}
	public void setCursor(ArrayList<DataRenewalDataThresholdCursorData> cursor) {
		this.cursor = cursor;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getSim() {
		return sim;
	}
	public void setSim(String sim) {
		this.sim = sim;
	}
	public Long getAccount_id() {
		return account_id;
	}
	public void setAccount_id(Long account_id) {
		this.account_id = account_id;
	}
	public Long getImsi() {
		return imsi;
	}
	public void setImsi(Long imsi) {
		this.imsi = imsi;
	}
	public String getLac_sac() {
		return lac_sac;
	}
	public void setLac_sac(String lac_sac) {
		this.lac_sac = lac_sac;
	}
	public Long getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(Long transaction_id) {
		this.transaction_id = transaction_id;
	}
	
	
}
