package com.xius.smf.domaindata;

import java.util.ArrayList;

public class InvokeBulkEmaStatusDataTrans extends DomainDataBase {

	private String pi_transaction_id;
	private ArrayList<InvokeBulkEmaStatusCursorTrans> po_ema_cmd_req_dtls;

	public ArrayList<InvokeBulkEmaStatusCursorTrans> getPo_ema_cmd_req_dtls() {
		return po_ema_cmd_req_dtls;
	}

	public void setPo_ema_cmd_req_dtls(
			ArrayList<InvokeBulkEmaStatusCursorTrans> po_ema_cmd_req_dtls) {
		this.po_ema_cmd_req_dtls = po_ema_cmd_req_dtls;
	}

	private String po_error_msg;

	public String getPi_transaction_id() {
		return pi_transaction_id;
	}

	public void setPi_transaction_id(String pi_transaction_id) {
		this.pi_transaction_id = pi_transaction_id;
	}

	public String getPo_error_msg() {
		return po_error_msg;
	}

	public void setPo_error_msg(String po_error_msg) {
		this.po_error_msg = po_error_msg;
	}

	@Override
	public String toString() {
		return "InvokeBulkEmaStatusDataTrans [pi_transaction_id="
				+ pi_transaction_id + ", po_ema_cmd_req_dtls="
				+ po_ema_cmd_req_dtls + ", po_error_msg=" + po_error_msg + "]";
	}

}
