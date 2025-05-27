package com.xius.smf.domaindata;

import java.util.ArrayList;

public class UsageThresholdLimitData extends DomainDataBase {
	private String  pi_flag      ;           
	
	private Long   pi_max_records       ;    
		private String   pi_reason   ;             
		private String   pi_status   ;            
		private String   pi_transaction_id  ;      
		 ArrayList<UsageThresholdLimitCursorData>   po_threshold_notif_dtls;
		public String getPi_flag() {
			return pi_flag;
		}
		public void setPi_flag(String pi_flag) {
			this.pi_flag = pi_flag;
		}
		
		public Long getPi_max_records() {
			return pi_max_records;
		}
		public void setPi_max_records(Long pi_max_records) {
			this.pi_max_records = pi_max_records;
		}
		public String getPi_reason() {
			return pi_reason;
		}
		public void setPi_reason(String pi_reason) {
			this.pi_reason = pi_reason;
		}
		public String getPi_status() {
			return pi_status;
		}
		public void setPi_status(String pi_status) {
			this.pi_status = pi_status;
		}
		public String getPi_transaction_id() {
			return pi_transaction_id;
		}
		public void setPi_transaction_id(String pi_transaction_id) {
			this.pi_transaction_id = pi_transaction_id;
		}
		public ArrayList<UsageThresholdLimitCursorData> getPo_threshold_notif_dtls() {
			return po_threshold_notif_dtls;
		}
		public void setPo_threshold_notif_dtls(
				ArrayList<UsageThresholdLimitCursorData> po_threshold_notif_dtls) {
			this.po_threshold_notif_dtls = po_threshold_notif_dtls;
		}
	 
}
