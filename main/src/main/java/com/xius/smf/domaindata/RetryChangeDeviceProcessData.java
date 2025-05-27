package com.xius.smf.domaindata;

import java.util.ArrayList;

public class RetryChangeDeviceProcessData extends DomainDataBase{
	
	private Long pi_max_rows ;
	private ArrayList<GetRetryChangeDeviceDtlsCursorData> po_sim_swap_retry_dtls;
	
	public Long getPi_max_rows() {
		return pi_max_rows;
	}
	public void setPi_max_rows(Long pi_max_rows) {
		this.pi_max_rows = pi_max_rows;
	}
	public ArrayList<GetRetryChangeDeviceDtlsCursorData> getPo_sim_swap_retry_dtls() {
		return po_sim_swap_retry_dtls;
	}
	public void setPo_sim_swap_retry_dtls(
			ArrayList<GetRetryChangeDeviceDtlsCursorData> po_sim_swap_retry_dtls) {
		this.po_sim_swap_retry_dtls = po_sim_swap_retry_dtls;
	}
	
}
