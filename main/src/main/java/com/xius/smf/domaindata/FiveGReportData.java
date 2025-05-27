package com.xius.smf.domaindata;

import java.util.ArrayList;

public class FiveGReportData extends ReportData {

	/*
	 * PROCEDURE pro_subs_bulk_flw_trcr_report ( pi_network_id IN NUMBER,
	 * pi_msisdn IN NUMBER, pi_from_date IN VARCHAR2, pi_to_date IN VARCHAR2,
	 * pi_max_records IN NUMBER, pi_next_rec_index IN NUMBER, po_subs_bulk_flw
	 * OUT sys_refcursor, po_error_code OUT NUMBER, po_error_desc OUT VARCHAR2 )
	 */

	private ArrayList<FiveGReportCusorData> po_fiveG_cursor;

	public ArrayList<FiveGReportCusorData> getPo_fiveG_cursor() {
		return po_fiveG_cursor;
	}

	public void setPo_fiveG_cursor(
			ArrayList<FiveGReportCusorData> po_fiveG_cursor) {
		this.po_fiveG_cursor = po_fiveG_cursor;
	}

	public Long msisdn_no;

	public Long getMsisdn_no() {
		return msisdn_no;
	}

	public void setMsisdn_no(Long msisdn_no) {
		this.msisdn_no = msisdn_no;
	}

	@Override
	public String toString() {
		return "FiveGReportData [po_fiveG_cursor=" + po_fiveG_cursor
				+ ", msisdn_no=" + msisdn_no + "]";
	}

}
