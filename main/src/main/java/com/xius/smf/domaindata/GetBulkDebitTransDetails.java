package com.xius.smf.domaindata;

import java.util.ArrayList;

public class GetBulkDebitTransDetails  extends DomainDataBase {
		
		private String pi_batch_id         ;
		private String pi_startdate       ;
		private String  pi_enddate          ;
	   public String getPi_batch_id() {
			return pi_batch_id;
		}
		public void setPi_batch_id(String pi_batch_id) {
			this.pi_batch_id = pi_batch_id;
		}
		public String getPi_startdate() {
			return pi_startdate;
		}
		public void setPi_startdate(String pi_startdate) {
			this.pi_startdate = pi_startdate;
		}
		public String getPi_enddate() {
			return pi_enddate;
		}
		public void setPi_enddate(String pi_enddate) {
			this.pi_enddate = pi_enddate;
		}
		
private	ArrayList<GetBulkDebitTransCursorData> po_debit_trans_dtls   ;
private	ArrayList<GetBulkDebitTransCursorData> po_debit_batch_ids   ;

public ArrayList<GetBulkDebitTransCursorData> getPo_debit_batch_ids() {
	return po_debit_batch_ids;
}
public void setPo_debit_batch_ids(
		ArrayList<GetBulkDebitTransCursorData> po_debit_batch_ids) {
	this.po_debit_batch_ids = po_debit_batch_ids;
}
public ArrayList<GetBulkDebitTransCursorData> getPo_debit_trans_dtls() {
	return po_debit_trans_dtls;
}
public void setPo_debit_trans_dtls(
		ArrayList<GetBulkDebitTransCursorData> po_debit_trans_dtls) {
	this.po_debit_trans_dtls = po_debit_trans_dtls;
}
	  
	

}
