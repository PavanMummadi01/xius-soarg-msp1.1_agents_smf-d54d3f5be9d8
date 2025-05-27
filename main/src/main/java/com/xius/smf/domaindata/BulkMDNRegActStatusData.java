/**
 * Copyright   2006 New Wireless Services, Inc.
 * All rights reserved. These computer programs, listings, and
 * Specificaions are the property of New Wireless Services,
 * Inc. and may not be copied, stored, used or transmitted, in
 * whole or in part, in any for or by any means, without the
 * prior written permission of New Wireless Services, Inc.
 *
 */
package com.xius.smf.domaindata;

import java.util.List;


/**
 * <add description here>
 *
 * @author <a href="mailto:phani.chavala@xius-bcgi.com">Phani Kuamr Chaval</a> 
 * @author last edited by: $Author: kiranmai.kode $ 
 * @version $Revision: #2 $, $Date: 2023/12/08 $ 
 *          
 */
public class BulkMDNRegActStatusData extends DomainDataBase {
  
	//null value
	private String pi_trans_no;
	// INOUT params
	private String pi_start_date;
	private String pi_end_date;
	private String pi_action_flag;

	// OUT params
	private List<BulkMDNRedActRefCursorData> po_msisdn_transdetails;

	
	
	/**
	 * @return the pi_start_date
	 */
	public String getPi_start_date() {
		return pi_start_date;
	}



	/**
	 * @param pi_start_date the pi_start_date to set
	 */
	public void setPi_start_date(String pi_start_date) {
		this.pi_start_date = pi_start_date;
	}



	/**
	 * @return the pi_end_date
	 */
	public String getPi_end_date() {
		return pi_end_date;
	}

	
	public String getPi_action_flag() {
		return pi_action_flag;
	}



	public void setPi_action_flag(String pi_action_flag) {
		this.pi_action_flag = pi_action_flag;
	}


	/**
	 * @param pi_end_date the pi_end_date to set
	 */
	public void setPi_end_date(String pi_end_date) {
		this.pi_end_date = pi_end_date;
	}



	/**
	 * @return the po_msisdn_transdetails
	 */
	public List<BulkMDNRedActRefCursorData> getPo_msisdn_transdetails() {
		return po_msisdn_transdetails;
	}



	/**
	 * @param po_msisdn_transdetails the po_msisdn_transdetails to set
	 */
	public void setPo_msisdn_transdetails(
			List<BulkMDNRedActRefCursorData> po_msisdn_transdetails) {
		this.po_msisdn_transdetails = po_msisdn_transdetails;
	}

	public String getPi_trans_no() {
		return pi_trans_no;
	}
	public void setPi_trans_no(String pi_trans_no) {
		this.pi_trans_no = pi_trans_no;
	}

	public String toString(BulkMDNRegActStatusData bulkMDNRegActStatus){

		StringBuilder builder = new StringBuilder();

		if( null != bulkMDNRegActStatus ) {

			if( null != bulkMDNRegActStatus.getPi_start_date() ) {
				builder.append("StartDate ==>").append( bulkMDNRegActStatus.getPi_start_date());
			}
			if( null != bulkMDNRegActStatus.getPi_end_date()) {

				builder.append(":End Date ==>").append(bulkMDNRegActStatus.getPi_end_date());
			}
			if( null != bulkMDNRegActStatus.getPi_action_flag()) {

				builder.append(":ActionFlag ==>").append(bulkMDNRegActStatus.getPi_action_flag());
			}
			
			List<BulkMDNRedActRefCursorData> cursorData  = bulkMDNRegActStatus.getPo_msisdn_transdetails();

			if( null != cursorData && cursorData.size() > 0 ) {

				for( int i = 0; i < cursorData.size(); i++) {

					BulkMDNRedActRefCursorData bulkMDNRedActRefCursorData = cursorData.get( i );

					if( null != bulkMDNRedActRefCursorData ) {

						if( null != bulkMDNRedActRefCursorData.getTransaction_no() )
							builder.append(":Transaction_no ==>").append(bulkMDNRedActRefCursorData.getTransaction_no() );
						if( null != bulkMDNRedActRefCursorData.getSubmission_date() )
							builder.append(":Submission_date ==>").append(bulkMDNRedActRefCursorData.getSubmission_date());
						if( null != bulkMDNRedActRefCursorData.getUser_id() )
							builder.append(":User_id ==>").append(bulkMDNRedActRefCursorData.getUser_id());
						if( null != bulkMDNRedActRefCursorData.getStatus() )
							builder.append(":Status ==>").append(bulkMDNRedActRefCursorData.getStatus() );
					}
				}

			}
		}

		return builder.toString();
	}



	
}
