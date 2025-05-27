package com.xius.smf.domaindata;

import java.util.ArrayList;

public class SlpnPointsTransactionReportData extends ReportData {
	
	private ArrayList <SlpnPointsTransactionReportCusorData> slpnPointsTransactionReportCusorData; 
	private Long pi_msisdn_no;
private String operationtype;

public ArrayList<SlpnPointsTransactionReportCusorData> getSlpnPointsTransactionReportCusorData() {
	return slpnPointsTransactionReportCusorData;
}

public void setSlpnPointsTransactionReportCusorData(
		ArrayList<SlpnPointsTransactionReportCusorData> slpnPointsTransactionReportCusorData) {
	this.slpnPointsTransactionReportCusorData = slpnPointsTransactionReportCusorData;
}

public String getOperationtype() {
	return operationtype;
}

public void setOperationtype(String operationtype) {
	this.operationtype = operationtype;
}

public Long getPi_msisdn_no() {
	return pi_msisdn_no;
}

public void setPi_msisdn_no(Long pi_msisdn_no) {
	this.pi_msisdn_no = pi_msisdn_no;
}	
	



}
