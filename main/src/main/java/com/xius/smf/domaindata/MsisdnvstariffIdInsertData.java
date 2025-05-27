package com.xius.smf.domaindata;

public class MsisdnvstariffIdInsertData extends DomainDataBase {
	
	/* 
	 * pro_msisdnvstpid_insert (
      pi_network_id         IN       NUMBER,
      pi_msisdn             IN       NUMBER,
      pi_sim                IN       NUMBER,
      pi_imsi               IN       VARCHAR2,
      pi_new_tariffpackid   IN       VARCHAR2,
      po_error_code         OUT      NUMBER,
      po_error_desc         OUT      VARCHAR2
	 *  */
	

	private Long pi_msisdn;
	private Long pi_sim;
	private String pi_new_tariffpackid;
	private String pi_imsi;
	public String getPi_imsi() {
		return pi_imsi;
	}
	public void setPi_imsi(String pi_imsi) {
		this.pi_imsi = pi_imsi;
	}
	public Long getPi_msisdn() {
		return pi_msisdn;
	}
	public void setPi_msisdn(Long pi_msisdn) {
		this.pi_msisdn = pi_msisdn;
	}
	public Long getPi_sim() {
		return pi_sim;
	}
	public void setPi_sim(Long pi_sim) {
		this.pi_sim = pi_sim;
	}
	public String getPi_new_tariffpackid() {
		return pi_new_tariffpackid;
	}
	public void setPi_new_tariffpackid(String pi_new_tariffpackid) {
		this.pi_new_tariffpackid = pi_new_tariffpackid;
	}
	
}
