package com.xius.smf.domaindata;

import java.util.ArrayList;

public class VolteProcessReportData extends  ReportData {
	
	
	/* PROCEDURE pro_lte_srvc_volte_report (
      pi_network_id       IN       NUMBER,
      pi_msisdn           IN       NUMBER,
      pi_from_date        IN       VARCHAR2,
      pi_to_date          IN       VARCHAR2,
      pi_max_records      IN       NUMBER,
      pi_next_rec_index   IN       NUMBER,
      po_volte_cursor     OUT      sys_refcursor,
      po_total_records    OUT      NUMBER,
      po_error_code       OUT      NUMBER,
      po_error_desc       OUT      VARCHAR2
   );
	 * 
	 * */
	
	private ArrayList <VolteProcessReportCusorData> po_volte_cursor; 
	public ArrayList<VolteProcessReportCusorData> getPo_volte_cursor() {
		return po_volte_cursor;
	}
	public void setPo_volte_cursor(
			ArrayList<VolteProcessReportCusorData> po_volte_cursor) {
		this.po_volte_cursor = po_volte_cursor;
	}
	private Long pi_msisdn;
	
	public Long getPi_msisdn() {
		return pi_msisdn;
	}
	public void setPi_msisdn(Long pi_msisdn) {
		this.pi_msisdn = pi_msisdn;
	}
	@Override
	public String toString() {
		return "VolteProcessReportData [po_volte_cursor=" + po_volte_cursor
				+ ", pi_msisdn=" + pi_msisdn + "]";
	}

}
