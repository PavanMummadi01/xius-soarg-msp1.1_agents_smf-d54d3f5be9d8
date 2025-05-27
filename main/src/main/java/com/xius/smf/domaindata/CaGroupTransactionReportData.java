package com.xius.smf.domaindata;

import java.util.ArrayList;

public class CaGroupTransactionReportData extends  ReportData {
	
	private ArrayList <CaGroupTransactionReportCusorData> po_transdetails;
	private Long pi_ext_transaction_id;

	/**
	 * @param po_transdetails the po_transdetails to set
	 */
	public void setPo_transdetails(ArrayList <CaGroupTransactionReportCusorData> po_transdetails) {
		this.po_transdetails = po_transdetails;
	}

	/**
	 * @return the po_transdetails
	 */
	public ArrayList <CaGroupTransactionReportCusorData> getPo_transdetails() {
		return po_transdetails;
	}

	/**
	 * @param pi_ext_transaction_id the pi_ext_transaction_id to set
	 */
	public void setPi_ext_transaction_id(Long pi_ext_transaction_id) {
		this.pi_ext_transaction_id = pi_ext_transaction_id;
	}

	/**
	 * @return the pi_ext_transaction_id
	 */
	public Long getPi_ext_transaction_id() {
		return pi_ext_transaction_id;
	} 
	

}
