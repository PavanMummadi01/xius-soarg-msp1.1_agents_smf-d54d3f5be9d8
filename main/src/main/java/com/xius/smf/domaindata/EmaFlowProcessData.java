package com.xius.smf.domaindata;

import java.util.ArrayList;

public class EmaFlowProcessData extends DomainDataBase {

	private Long pi_max_records;
	private String[] po_int_tranid;
	private String pi_instance_id;
	private String pi_flag;

	public String getPi_flag() {
		return pi_flag;
	}

	public void setPi_flag(String pi_flag) {
		this.pi_flag = pi_flag;
	}

	public String getPi_instance_id() {
		return pi_instance_id;
	}

	public void setPi_instance_id(String pi_instance_id) {
		this.pi_instance_id = pi_instance_id;
	}

	public String[] getPo_int_tranid() {
		return po_int_tranid;
	}

	public void setPo_int_tranid(String[] po_int_tranid) {
		this.po_int_tranid = po_int_tranid;
	}

	private ArrayList<EmaFlowProcessCursorData> po_cmd_cursor_data;

	public Long getPi_max_records() {
		return pi_max_records;
	}

	public void setPi_max_records(Long pi_max_records) {
		this.pi_max_records = pi_max_records;
	}

	public ArrayList<EmaFlowProcessCursorData> getPo_cmd_cursor_data() {
		return po_cmd_cursor_data;
	}

	public void setPo_cmd_cursor_data(
			ArrayList<EmaFlowProcessCursorData> po_cmd_cursor_data) {
		this.po_cmd_cursor_data = po_cmd_cursor_data;
	}

}
