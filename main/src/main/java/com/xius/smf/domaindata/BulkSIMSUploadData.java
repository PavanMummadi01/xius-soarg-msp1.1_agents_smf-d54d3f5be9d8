package com.xius.smf.domaindata;

import java.util.List;

public class BulkSIMSUploadData extends DomainDataBase {
	private String  pi_transaction_no;
	private String po_transaction_no;
	private String  pi_sim_no;
	private Long po_retry_cnt   ;	

	private List<BulkSIMSUploadCursorData> po_sim_upload_data;
	
public String getPi_sim_no() {
	return pi_sim_no;
}
public void setPi_sim_no(String pi_sim_no) {
	this.pi_sim_no = pi_sim_no;
}

public Long getPo_retry_cnt() {
	return po_retry_cnt;
}
public void setPo_retry_cnt(Long po_retry_cnt) {
	this.po_retry_cnt = po_retry_cnt;
}

public List<BulkSIMSUploadCursorData> getPo_sim_upload_data() {
	return po_sim_upload_data;
}
public void setPo_sim_upload_data(
		List<BulkSIMSUploadCursorData> po_sim_upload_data) {
	this.po_sim_upload_data = po_sim_upload_data;
}
public String getPi_transaction_no() {
	return pi_transaction_no;
}
public void setPi_transaction_no(String pi_transaction_no) {
	this.pi_transaction_no = pi_transaction_no;
}
public String getPo_transaction_no() {
	return po_transaction_no;
}
public void setPo_transaction_no(String po_transaction_no) {
	this.po_transaction_no = po_transaction_no;
}


}