package com.xius.smf.domaindata;

import java.util.ArrayList;


public class DataEnableDisableData extends DomainDataBase {
	private String pi_flag             ;

	private Long   pi_instance_id      ;
	private Long   pi_max_records    ;
	private Long   pi_account_id       ;
	private Long  pi_event_code       ;
	   private String  pi_set_gprs_to     ;
	   private String   pi_reason        ;
	   private String    pi_status;
	   public String getPi_status() {
		return pi_status;
	}
	public void setPi_status(String pi_status) {
		this.pi_status = pi_status;
	}
	private String    pi_transaction_id    ;
	   public String getPi_transaction_id() {
		return pi_transaction_id;
	}
	public void setPi_transaction_id(String pi_transaction_id) {
		this.pi_transaction_id = pi_transaction_id;
	}
	private  ArrayList<DataEnableDisableCursorData>  po_switch_gprs_ref ;
	public String getPi_flag() {
		return pi_flag;
	}
	public void setPi_flag(String pi_flag) {
		this.pi_flag = pi_flag;
	}

	public Long getPi_instance_id() {
		return pi_instance_id;
	}
	public void setPi_instance_id(Long pi_instance_id) {
		this.pi_instance_id = pi_instance_id;
	}
	public Long getPi_max_records() {
		return pi_max_records;
	}
	public void setPi_max_records(Long pi_max_records) {
		this.pi_max_records = pi_max_records;
	}
	public Long getPi_account_id() {
		return pi_account_id;
	}
	public void setPi_account_id(Long pi_account_id) {
		this.pi_account_id = pi_account_id;
	}
	public Long getPi_event_code() {
		return pi_event_code;
	}
	public void setPi_event_code(Long pi_event_code) {
		this.pi_event_code = pi_event_code;
	}
	public String getPi_set_gprs_to() {
		return pi_set_gprs_to;
	}
	public void setPi_set_gprs_to(String pi_set_gprs_to) {
		this.pi_set_gprs_to = pi_set_gprs_to;
	}
	public String getPi_reason() {
		return pi_reason;
	}
	public void setPi_reason(String pi_reason) {
		this.pi_reason = pi_reason;
	}
	public ArrayList<DataEnableDisableCursorData> getPo_switch_gprs_ref() {
		return po_switch_gprs_ref;
	}
	public void setPo_switch_gprs_ref(
			ArrayList<DataEnableDisableCursorData> po_switch_gprs_ref) {
		this.po_switch_gprs_ref = po_switch_gprs_ref;
	}
	
}
