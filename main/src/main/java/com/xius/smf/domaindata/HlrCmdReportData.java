package com.xius.smf.domaindata;

import java.util.ArrayList;

public class HlrCmdReportData extends DomainDataBase {

	private Long pi_msisdn_no;
	private Long pi_imsi;
	private String pi_fromdate;
	private String pi_todate;
	private String pi_flag_type;
	private String pi_get_flag;
	
	private ArrayList<HlrCmdReportCursorData> po_hlr_his_cursor;

	public Long getPi_msisdn_no() {
		return pi_msisdn_no;
	}

	public void setPi_msisdn_no(Long pi_msisdn_no) {
		this.pi_msisdn_no = pi_msisdn_no;
	}

	public Long getPi_imsi() {
		return pi_imsi;
	}

	public void setPi_imsi(Long pi_imsi) {
		this.pi_imsi = pi_imsi;
	}

	public String getPi_fromdate() {
		return pi_fromdate;
	}

	public void setPi_fromdate(String pi_fromdate) {
		this.pi_fromdate = pi_fromdate;
	}

	public String getPi_todate() {
		return pi_todate;
	}

	public void setPi_todate(String pi_todate) {
		this.pi_todate = pi_todate;
	}

	public String getPi_flag_type() {
		return pi_flag_type;
	}

	public void setPi_flag_type(String pi_flag_type) {
		this.pi_flag_type = pi_flag_type;
	}

	public String getPi_get_flag() {
		return pi_get_flag;
	}

	public void setPi_get_flag(String pi_get_flag) {
		this.pi_get_flag = pi_get_flag;
	}

	public ArrayList<HlrCmdReportCursorData> getPo_hlr_his_cursor() {
		return po_hlr_his_cursor;
	}

	public void setPo_hlr_his_cursor(
			ArrayList<HlrCmdReportCursorData> po_hlr_his_cursor) {
		this.po_hlr_his_cursor = po_hlr_his_cursor;
	}

	@Override
	public String toString() {
		return "HlrCmdReportData [pi_msisdn_no=" + pi_msisdn_no + ", pi_imsi="
				+ pi_imsi + ", pi_fromdate=" + pi_fromdate + ", pi_todate="
				+ pi_todate + ", pi_flag_type=" + pi_flag_type
				+ ", pi_get_flag=" + pi_get_flag + ", po_hlr_his_cursor="
				+ po_hlr_his_cursor + "]";
	}
	
}
