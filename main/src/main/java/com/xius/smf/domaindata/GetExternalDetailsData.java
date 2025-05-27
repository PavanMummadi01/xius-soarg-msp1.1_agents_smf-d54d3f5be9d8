package com.xius.smf.domaindata;

import java.util.ArrayList;
import java.util.List;

public class GetExternalDetailsData extends DomainDataBase{
	
	/*
	 * pi_msisdn_no       IN       NUMBER,
      pi_sim_no          IN       VARCHAR2,
      pi_id_value        IN       VARCHAR2,
      pi_network_id      IN       NUMBER,
      po_external_dtls   OUT      sys_refcursor,
	 */
	private ArrayList<GetExternalDetailsRefCursorData> po_external_dtls;
	private Long pi_msisdn_no;
	private String pi_sim_no;
	private String pi_id_value;
	public ArrayList<GetExternalDetailsRefCursorData> getPo_external_dtls() {
		return po_external_dtls;
	}
	public void setPo_external_dtls(
			ArrayList<GetExternalDetailsRefCursorData> po_external_dtls) {
		this.po_external_dtls = po_external_dtls;
	}
	public Long getPi_msisdn_no() {
		return pi_msisdn_no;
	}
	public void setPi_msisdn_no(Long pi_msisdn_no) {
		this.pi_msisdn_no = pi_msisdn_no;
	}
	public String getPi_sim_no() {
		return pi_sim_no;
	}
	public void setPi_sim_no(String pi_sim_no) {
		this.pi_sim_no = pi_sim_no;
	}
	public String getPi_id_value() {
		return pi_id_value;
	}
	public void setPi_id_value(String pi_id_value) {
		this.pi_id_value = pi_id_value;
	}
	
}
