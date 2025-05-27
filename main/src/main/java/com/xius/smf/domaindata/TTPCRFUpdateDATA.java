package com.xius.smf.domaindata;

public class TTPCRFUpdateDATA extends DomainDataBase {
	private Long pi_network_id;
	private Long pi_transation_id;
	private String pi_status;
	private String pi_config_error;
	private Long po_error_code;
	private String po_error_desc;

	public Long getPi_network_id() {
		return pi_network_id;
	}

	public void setPi_transation_id(Long pi_transation_id) {
		this.pi_transation_id = pi_transation_id;
	}

	public Long getPi_transation_id() {
		return pi_transation_id;
	}

	public void setPi_status(String pi_status) {
		this.pi_status = pi_status;
	}

	public String getPi_status() {
		return pi_status;
	}

	public void setPo_error_code(Long po_error_code) {
		this.po_error_code = po_error_code;
	}

	public Long getPo_error_code() {
		return po_error_code;
	}

	public void setPi_config_error(String pi_config_error) {
		this.pi_config_error = pi_config_error;
	}

	public String getPi_config_error() {
		return pi_config_error;
	}

	public void setPo_error_desc(String po_error_desc) {
		this.po_error_desc = po_error_desc;
	}

	public String getPo_error_desc() {
		return po_error_desc;
	}

}
