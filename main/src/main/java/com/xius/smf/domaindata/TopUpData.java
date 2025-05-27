package com.xius.smf.domaindata;

import java.util.ArrayList;

public class TopUpData extends DomainDataBase{
	private Long pi_maxRecords;
	private Long po_total_records;
	private ArrayList<TopUpCursorData> cursor;
	//These are used for Update
	private String status;
	private String remarks;
	private String transaction_Id;
	private String sourceType;
	
	public Long getPi_maxRecords() {
		return pi_maxRecords;
	}
	public void setPi_maxRecords(Long pi_maxRecords) {
		this.pi_maxRecords = pi_maxRecords;
	}
	public Long getPo_total_records() {
		return po_total_records;
	}
	public void setPo_total_records(Long po_total_records) {
		this.po_total_records = po_total_records;
	}
	public ArrayList<TopUpCursorData> getCursor() {
		return cursor;
	}
	public void setCursor(ArrayList<TopUpCursorData> cursor) {
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
	public String getTransaction_Id() {
		return transaction_Id;
	}
	public void setTransaction_Id(String transaction_Id) {
		this.transaction_Id = transaction_Id;
	}
	public String getSourceType() {
		return sourceType;
	}
	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}	
}
