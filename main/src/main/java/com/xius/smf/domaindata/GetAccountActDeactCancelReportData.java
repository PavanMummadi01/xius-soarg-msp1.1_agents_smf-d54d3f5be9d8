package com.xius.smf.domaindata;

import java.util.ArrayList;

public class GetAccountActDeactCancelReportData extends  ReportData {
	
	private ArrayList <GetAccountActDeactCancelReportCusorData> getaccountActDeactCancelReportCusorData; 
	private Long pi_msisdn_no;
	private String operationtype;
	private Long pi_account_no;
	
	public ArrayList<GetAccountActDeactCancelReportCusorData> getGetaccountActDeactCancelReportCusorData() {
		return getaccountActDeactCancelReportCusorData;
	}
	public void setGetaccountActDeactCancelReportCusorData(
			ArrayList<GetAccountActDeactCancelReportCusorData> getaccountActDeactCancelReportCusorData) {
		this.getaccountActDeactCancelReportCusorData = getaccountActDeactCancelReportCusorData;
	}
	public Long getPi_msisdn_no() {
		return pi_msisdn_no;
	}
	public void setPi_msisdn_no(Long pi_msisdn_no) {
		this.pi_msisdn_no = pi_msisdn_no;
	}
	public String getOperationtype() {
		return operationtype;
	}
	public void setOperationtype(String operationtype) {
		this.operationtype = operationtype;
	}
	public void setPi_account_no(Long pi_account_no) {
		this.pi_account_no = pi_account_no;
	}
	public Long getPi_account_no() {
		return pi_account_no;
	}	
	
	

}
