package com.xius.smf.domaindata;

public class UpdateEMADetailsData extends DomainDataBase{
/**
 *   pi_network_id   IN       NUMBER,
      pi_emaid        IN       VARCHAR2,
      pi_emacommand   IN       VARCHAR2,
      pi_user_id      IN       VARCHAR2,
      po_error_code   OUT      NUMBER,
      po_error_desc   OUT      VARCHAR2
 */
	private String pi_emaid;
	private String pi_emacommand;
	public String getPi_emaid() {
		return pi_emaid;
	}
	public void setPi_emaid(String pi_emaid) {
		this.pi_emaid = pi_emaid;
	}
	public String getPi_emacommand() {
		return pi_emacommand;
	}
	public void setPi_emacommand(String pi_emacommand) {
		this.pi_emacommand = pi_emacommand;
	}
	
	
}
