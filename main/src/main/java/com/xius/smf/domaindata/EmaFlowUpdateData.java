package com.xius.smf.domaindata;

import java.util.Arrays;

public class EmaFlowUpdateData extends DomainDataBase {

	private String[] pi_status;
	private String[] pi_trans_id;
	private String[] pi_remarks;
	private String[] pi_int_trans_id;
	private String[] pi_cmds;
	private String[] pi_error_codes;
	private String[] pi_error_msg;
	private String[] pi_cmd_resp_time;
	
	
	public String[] getPi_cmd_resp_time() {
		return pi_cmd_resp_time;
	}

	public void setPi_cmd_resp_time(String[] pi_cmd_resp_time) {
		this.pi_cmd_resp_time = pi_cmd_resp_time;
	}

	public String[] getPi_error_msg() {
		return pi_error_msg;
	}

	public void setPi_error_msg(String[] pi_error_msg) {
		this.pi_error_msg = pi_error_msg;
	}

	public String[] getPi_cmds() {
		return pi_cmds;
	}

	public void setPi_cmds(String[] pi_cmds) {
		this.pi_cmds = pi_cmds;
	}

	public String[] getPi_error_codes() {
		return pi_error_codes;
	}

	public void setPi_error_codes(String[] pi_error_codes) {
		this.pi_error_codes = pi_error_codes;
	}

	public String[] getPi_status() {
		return pi_status;
	}

	public void setPi_status(String[] pi_status) {
		this.pi_status = pi_status;
	}

	public String[] getPi_trans_id() {
		return pi_trans_id;
	}

	public void setPi_trans_id(String[] pi_trans_id) {
		this.pi_trans_id = pi_trans_id;
	}

	public String[] getPi_remarks() {
		return pi_remarks;
	}

	public void setPi_remarks(String[] pi_remarks) {
		this.pi_remarks = pi_remarks;
	}

	public String[] getPi_int_trans_id() {
		return pi_int_trans_id;
	}

	public void setPi_int_trans_id(String[] pi_int_trans_id) {
		this.pi_int_trans_id = pi_int_trans_id;
	}

	@Override
	public String toString() {
		return "EmaFlowUpdateData [pi_status=" + Arrays.toString(pi_status)
				+ ", pi_trans_id=" + Arrays.toString(pi_trans_id)
				+ ", pi_remarks=" + Arrays.toString(pi_remarks)
				+ ", pi_int_trans_id=" + Arrays.toString(pi_int_trans_id)
				+ ", pi_cmds=" + Arrays.toString(pi_cmds) + ", pi_error_codes="
				+ Arrays.toString(pi_error_codes) + ", pi_error_msg="
				+ Arrays.toString(pi_error_msg) + ", pi_cmd_resp_time="
				+ Arrays.toString(pi_cmd_resp_time) + "]";
	}

}
