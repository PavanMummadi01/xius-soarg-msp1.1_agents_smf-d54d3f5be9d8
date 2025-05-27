package com.xius.smf.domaindata;

import java.util.ArrayList;

public class LTERetryProcessData extends DomainDataBase{
	
	private  Long pi_max_records;     
	private  Long pi_max_retry;
    private ArrayList<LTERetryProcessCursorData>  po_retry_cursor;
    
    
    
	public Long getPi_max_records() {
		return pi_max_records;
	}
	public void setPi_max_records(Long pi_max_records) {
		this.pi_max_records = pi_max_records;
	}
	public Long getPi_max_retry() {
		return pi_max_retry;
	}
	public void setPi_max_retry(Long pi_max_retry) {
		this.pi_max_retry = pi_max_retry;
	}
	public ArrayList<LTERetryProcessCursorData> getPo_retry_cursor() {
		return po_retry_cursor;
	}
	public void setPo_retry_cursor(
			ArrayList<LTERetryProcessCursorData> po_retry_cursor) {
		this.po_retry_cursor = po_retry_cursor;
	}

    
    
    
}
