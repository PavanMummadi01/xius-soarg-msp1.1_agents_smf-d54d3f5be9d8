package com.xius.smf.domaindata;

public class MsisdnvstariffIdViewData extends DomainDataBase {
	
	/*  pro_msisdnvstariffid_view (
      pi_network_id           IN       NUMBER,
      pi_msisdn               IN       NUMBER,
      pi_sim                  IN       NUMBER,
      pi_imsi                 IN       VARCHAR2,
      po_new_tariff_pack_id   OUT      VARCHAR2,
      po_old_tariff_pack_id   OUT      VARCHAR2,
      po_error_code           OUT      NUMBER,
      po_error_desc           OUT      VARCHAR2
   
   );
	 * 
	 *  */

	private Long pi_msisdn;
	private Long pi_sim;
	private String pi_imsi;
	public String getPi_imsi() {
		return pi_imsi;
	}
	public void setPi_imsi(String pi_imsi) {
		this.pi_imsi = pi_imsi;
	}
	private String po_new_tariff_pack_id;
	private String po_old_tariff_pack_id;
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
	public String getPo_new_tariff_pack_id() {
		return po_new_tariff_pack_id;
	}
	public void setPo_new_tariff_pack_id(String po_new_tariff_pack_id) {
		this.po_new_tariff_pack_id = po_new_tariff_pack_id;
	}
	public String getPo_old_tariff_pack_id() {
		return po_old_tariff_pack_id;
	}
	public void setPo_old_tariff_pack_id(String po_old_tariff_pack_id) {
		this.po_old_tariff_pack_id = po_old_tariff_pack_id;
	}
	
	
}
