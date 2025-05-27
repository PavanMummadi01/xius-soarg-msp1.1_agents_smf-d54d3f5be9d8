package com.xius.smf.domaindata;

import java.util.ArrayList;

public class StateChangeReportData extends  ReportData {
	
	/* 
	  pi_network_id          IN       NUMBER,
      pi_msisdn              IN       NUMBER,
      pi_from_date           IN       VARCHAR2,
      pi_to_date             IN       VARCHAR2,
      pi_max_records         IN       NUMBER,
      pi_next_rec_index      IN       NUMBER,
      po_state_chng_cursor   OUT      sys_refcursor,
      po_total_records       OUT      NUMBER,
      po_error_code          OUT      NUMBER,
      po_error_desc          OUT      VARCHAR2
	 * */
	
	private ArrayList <StateChangeReportCusorData> po_state_chng_cursor; 
	private Long pi_msisdn;
	public ArrayList<StateChangeReportCusorData> getPo_state_chng_cursor() {
		return po_state_chng_cursor;
	}
	public void setPo_state_chng_cursor(
			ArrayList<StateChangeReportCusorData> po_state_chng_cursor) {
		this.po_state_chng_cursor = po_state_chng_cursor;
	}
	public Long getPi_msisdn() {
		return pi_msisdn;
	}
	public void setPi_msisdn(Long pi_msisdn) {
		this.pi_msisdn = pi_msisdn;
	}

}
