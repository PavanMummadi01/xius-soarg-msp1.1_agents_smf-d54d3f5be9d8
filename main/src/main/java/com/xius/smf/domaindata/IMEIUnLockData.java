package com.xius.smf.domaindata;


public class IMEIUnLockData extends DomainDataBase{


	private String pio_imei;
	private Long pi_transreferencenumb;
	private String pi_reason;
	private String po_resp_description ;
	private Long po_transce_id ;
	private String po_effective_date ;
	private String pi_comments ;
	private String pi_clarify_reason ;
	private String pi_source_of_request ;
	
	
	public String getPi_comments() {
		return pi_comments;
	}
	public void setPi_comments(String pi_comments) {
		this.pi_comments = pi_comments;
	}
	public String getPi_clarify_reason() {
		return pi_clarify_reason;
	}
	public void setPi_clarify_reason(String pi_clarify_reason) {
		this.pi_clarify_reason = pi_clarify_reason;
	}
	public String getPi_source_of_request() {
		return pi_source_of_request;
	}
	public void setPi_source_of_request(String pi_source_of_request) {
		this.pi_source_of_request = pi_source_of_request;
	}
	public String getPio_imei() {
		return pio_imei;
	}
	public void setPio_imei(String pio_imei) {
		this.pio_imei = pio_imei;
	}
	public Long getPi_transreferencenumb() {
		return pi_transreferencenumb;
	}
	public void setPi_transreferencenumb(Long pi_transreferencenumb) {
		this.pi_transreferencenumb = pi_transreferencenumb;
	}
	public String getPi_reason() {
		return pi_reason;
	}
	public void setPi_reason(String pi_reason) {
		this.pi_reason = pi_reason;
	}
	public String getPo_resp_description() {
		return po_resp_description;
	}
	public void setPo_resp_description(String po_resp_description) {
		this.po_resp_description = po_resp_description;
	}
	public Long getPo_transce_id() {
		return po_transce_id;
	}
	public void setPo_transce_id(Long po_transce_id) {
		this.po_transce_id = po_transce_id;
	}
	public String getPo_effective_date() {
		return po_effective_date;
	}
	public void setPo_effective_date(String po_effective_date) {
		this.po_effective_date = po_effective_date;
	}
		}
