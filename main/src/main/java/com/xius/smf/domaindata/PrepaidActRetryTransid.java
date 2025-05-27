package com.xius.smf.domaindata;

public class PrepaidActRetryTransid extends DomainDataBase {
	
	/*
	pi_networkid            IN       NUMBER,
    pi_no_of_records        IN       NUMBER,
    po_nw_failed_trans_id   OUT      arr_varchar,
    */
    private Long pi_no_of_records;
	private String[] po_nw_failed_trans_id;

	public Long getPi_no_of_records() {
		return pi_no_of_records;
	}
	public void setPi_no_of_records(Long pi_no_of_records) {
		this.pi_no_of_records = pi_no_of_records;
	}
	public String[] getPo_nw_failed_trans_id() {
		return po_nw_failed_trans_id;
	}
	public void setPo_nw_failed_trans_id(String[] po_nw_failed_trans_id) {
		this.po_nw_failed_trans_id = po_nw_failed_trans_id;
	}
    

}
