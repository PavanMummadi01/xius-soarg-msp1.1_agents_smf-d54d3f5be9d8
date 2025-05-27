package com.xius.smf.domaindata;

public class VolteUpdateData extends DomainDataBase{
	
	/* pi_network_id   IN       NUMBER,
      pi_trans_id     IN       NUMBER,
      pi_status       IN       VARCHAR2,
      pi_remarks      IN       VARCHAR2,
      po_error_code   OUT      NUMBER,
      po_error_desc   OUT      VARCHAR2   */
	
	private Long pi_trans_id;
	private String pi_status;
	private String pi_remarks;
//	private String pi_ext_error_code;
	
	public Long getPi_trans_id() {
		return pi_trans_id;
	}
	public void setPi_trans_id(Long pi_trans_id) {
		this.pi_trans_id = pi_trans_id;
	}
	public String getPi_status() {
		return pi_status;
	}
	public void setPi_status(String pi_status) {
		this.pi_status = pi_status;
	}
	public String getPi_remarks() {
		return pi_remarks;
	}
	public void setPi_remarks(String pi_remarks) {
		this.pi_remarks = pi_remarks;
	}
	
	public String toString() {
		return "VolteUpdateData [pi_trans_id="
				+ pi_trans_id + ", pi_status=" + pi_status
				+ ", pi_remarks=" + pi_remarks +  ", pi_network_id=" + pi_network_id
				+ ", pi_login_id=" + pi_login_id + ", pi_password="
				+ pi_password + ", pi_username=" + pi_username
				+ ", po_error_code=" + po_error_code + ", pi_app_id="
				+ pi_app_id + ", po_error_desc=" + po_error_desc + "]";
	}
	
}
