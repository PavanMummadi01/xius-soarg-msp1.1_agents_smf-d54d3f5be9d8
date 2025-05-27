package com.xius.smf.domaindata;

public class ReportData extends DomainDataBase {

	private Integer	maxRecords;
	private Integer	nextRecordIndex;
	private String fromDate;
	private String toDate;
	private Integer rowCount;
	private Long totalRecords;
	
	public Long getTotalRecords() {
		return totalRecords;
	}
	public void setTotalRecords(Long totalRecords) {
		this.totalRecords = totalRecords;
	}
	
	
	
	public Integer getMaxRecords() {
		return maxRecords;
	}
	public void setMaxRecords(Integer maxRecords) {
		this.maxRecords = maxRecords;
	}
	public Integer getNextRecordIndex() {
		return nextRecordIndex;
	}
	public void setNextRecordIndex(Integer nextRecordIndex) {
		this.nextRecordIndex = nextRecordIndex;
	}
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	public Integer getRowCount() {
		return rowCount;
	}
	public void setRowCount(Integer rowCount) {
		this.rowCount = rowCount;
	}
	
	
	
	
	
	
	
}
