package com.xius.smf.domaindata;

public class statechangeTrackUpdateData extends DomainDataBase {

	private Long pi_MSISDN;
	private String pi_transactionRefNum;
	private String pi_oldSubcrStatus;
	private String pi_remarks;
	private String pi_status;
	public Long getPi_MSISDN() {
		return pi_MSISDN;
	}
	public void setPi_MSISDN(Long pi_MSISDN) {
		this.pi_MSISDN = pi_MSISDN;
	}
	public String getPi_transactionRefNum() {
		return pi_transactionRefNum;
	}
	public void setPi_transactionRefNum(String pi_transactionRefNum) {
		this.pi_transactionRefNum = pi_transactionRefNum;
	}
	public String getPi_oldSubcrStatus() {
		return pi_oldSubcrStatus;
	}
	public void setPi_oldSubcrStatus(String pi_oldSubcrStatus) {
		this.pi_oldSubcrStatus = pi_oldSubcrStatus;
	}
	public String getPi_remarks() {
		return pi_remarks;
	}
	public void setPi_remarks(String pi_remarks) {
		this.pi_remarks = pi_remarks;
	}
	public String getPi_status() {
		return pi_status;
	}
	public void setPi_status(String pi_status) {
		this.pi_status = pi_status;
	}
	
}
