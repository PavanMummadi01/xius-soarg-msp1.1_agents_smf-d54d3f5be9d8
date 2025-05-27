package com.xius.smf.domaindata;

import java.util.ArrayList;

public class PrepaidActivationData extends DomainDataBase{
	
	/*
	 * pro_get_trans_sim_reg_dtls (
	      pi_networkid              IN       NUMBER,
	      pi_trans_ref_number       IN       VARCHAR2,
	      po_nw_pend_sim_reg_dtls   OUT      sys_refcursor,
	      po_error_code             OUT      NUMBER,
	      po_error_desc             OUT      VARCHAR2
	   )
	 */
	
		private String  pi_trans_ref_number;

		private ArrayList<PrepaidActivationRetryCursorData> po_nw_pend_sim_reg_dtls;

		public String getPi_trans_ref_number() {
			return pi_trans_ref_number;
		}

		public void setPi_trans_ref_number(String pi_trans_ref_number) {
			this.pi_trans_ref_number = pi_trans_ref_number;
		}

		public ArrayList<PrepaidActivationRetryCursorData> getPo_nw_pend_sim_reg_dtls() {
			return po_nw_pend_sim_reg_dtls;
		}

		public void setPo_nw_pend_sim_reg_dtls(ArrayList<PrepaidActivationRetryCursorData> po_nw_pend_sim_reg_dtls) {
			this.po_nw_pend_sim_reg_dtls = po_nw_pend_sim_reg_dtls;
		}

}
