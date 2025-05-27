package com.xius.smf.domaindata;

import java.util.List;

public class GetUploadSIMSData extends DomainDataBase {

	private String pi_tx_number;
	private String pi_sim;
	private List<UploadSIMSCursorData> cursor;

	private Long retrayCounter;
	private String po_txNumber;
	
	private String po_error_desc;
	
	public String getPo_error_desc() {
		return po_error_desc;
	}
	public void setPo_error_desc(String po_error_desc) {
		this.po_error_desc = po_error_desc;
	}

	public String getPo_txNumber() {
		return po_txNumber;
	}
	public void setPo_txNumber(String po_txNumber) {
		this.po_txNumber = po_txNumber;
	}
	public Long getRetrayCounter() {
		return retrayCounter;
	}
	public void setRetrayCounter(Long retrayCounter) {
		this.retrayCounter = retrayCounter;
	}
	public String getPi_tx_number() {
		return pi_tx_number;
	}
	public void setPi_tx_number(String pi_tx_number) {
		this.pi_tx_number = pi_tx_number;
	}
	public String getPi_sim() {
		return pi_sim;
	}
	public void setPi_sim(String pi_sim) {
		this.pi_sim = pi_sim;
	}
	public List<UploadSIMSCursorData> getCursor() {
		return cursor;
	}
	public void setCursor(List<UploadSIMSCursorData> cursor) {
		this.cursor = cursor;
	}
}
