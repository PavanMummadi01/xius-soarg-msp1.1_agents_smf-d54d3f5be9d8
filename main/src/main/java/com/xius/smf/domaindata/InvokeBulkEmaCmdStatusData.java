package com.xius.smf.domaindata;

import java.util.ArrayList;

public class InvokeBulkEmaCmdStatusData extends DomainDataBase{

	private String pi_transaction_id;
	private ArrayList<InvokeBulkEmaCmdStatusCursorData> po_ema_cmd_request_dtls; 
	private String po_error_msg;
	
	public String getPi_transaction_id() {
		return pi_transaction_id;
	}
	public void setPi_transaction_id(String pi_transaction_id) {
		this.pi_transaction_id = pi_transaction_id;
	}
	public ArrayList<InvokeBulkEmaCmdStatusCursorData> getPo_ema_cmd_request_dtls() {
		return po_ema_cmd_request_dtls;
	}
	public void setPo_ema_cmd_request_dtls(
			ArrayList<InvokeBulkEmaCmdStatusCursorData> po_ema_cmd_request_dtls) {
		this.po_ema_cmd_request_dtls = po_ema_cmd_request_dtls;
	}
	public String getPo_error_msg() {
		return po_error_msg;
	}
	public void setPo_error_msg(String po_error_msg) {
		this.po_error_msg = po_error_msg;
	}
	
	
}
