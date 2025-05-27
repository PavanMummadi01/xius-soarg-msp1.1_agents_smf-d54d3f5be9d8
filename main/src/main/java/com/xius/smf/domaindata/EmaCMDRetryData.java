package com.xius.smf.domaindata;

import java.util.ArrayList;
import java.util.Arrays;

public class EmaCMDRetryData extends DomainDataBase{
	
	private Integer[] network_id;
	private Long pi_max_records;
	private Long pi_instanceid;
	private ArrayList<EmaCMDCursorData> po_ema_cmd_request_dtls;
	private String po_error_msg;
	
	public Integer[] getNetwork_id() {
		return network_id;
	}
	public void setNetwork_id(Integer[] network_id) {
		this.network_id = network_id;
	}
	public Long getPi_max_records() {
		return pi_max_records;
	}
	public void setPi_max_records(Long pi_max_records) {
		this.pi_max_records = pi_max_records;
	}
	public Long getPi_instanceid() {
		return pi_instanceid;
	}
	public void setPi_instanceid(Long pi_instanceid) {
		this.pi_instanceid = pi_instanceid;
	}
	public ArrayList<EmaCMDCursorData> getPo_ema_cmd_request_dtls() {
		return po_ema_cmd_request_dtls;
	}
	public void setPo_ema_cmd_request_dtls(
			ArrayList<EmaCMDCursorData> po_ema_cmd_request_dtls) {
		this.po_ema_cmd_request_dtls = po_ema_cmd_request_dtls;
	}
	public String getPo_error_msg() {
		return po_error_msg;
	}
	public void setPo_error_msg(String po_error_msg) {
		this.po_error_msg = po_error_msg;
	}
	
	@Override
	public String toString() {
		return "EmaCMDRetryData [network_id=" + Arrays.toString(network_id)
				+ ", pi_max_records=" + pi_max_records + ", pi_instanceid="
				+ pi_instanceid + ", po_ema_cmd_request_dtls="
				+ po_ema_cmd_request_dtls + ", po_error_msg=" + po_error_msg
				+ "]";
	}
}
