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
public class BulkSimSwapStatusData extends DomainDataBase {
  
	//null value
	private String pi_trans_no;
	// INOUT params
	private String pi_start_date;
	private String pi_end_date;
	
	// OUT params
	private List<BulkSimSwapStatusRefCursorData> po_simswap_transdetails;

	
	
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

	

	/**
	 * @param pi_end_date the pi_end_date to set
	 */
	public void setPi_end_date(String pi_end_date) {
		this.pi_end_date = pi_end_date;
	}

	

	public List<BulkSimSwapStatusRefCursorData> getPo_simswap_transdetails() {
		return po_simswap_transdetails;
	}



	public void setPo_simswap_transdetails(
			List<BulkSimSwapStatusRefCursorData> po_simswap_transdetails) {
		this.po_simswap_transdetails = po_simswap_transdetails;
	}



	public String getPi_trans_no() {
		return pi_trans_no;
	}
	public void setPi_trans_no(String pi_trans_no) {
		this.pi_trans_no = pi_trans_no;
	}

	public String toString(BulkSimSwapStatusData BulkSimSwapStatusData){

		StringBuilder builder = new StringBuilder();

		if( null != BulkSimSwapStatusData ) {

			if( null != BulkSimSwapStatusData.getPi_start_date() ) {
				builder.append("StartDate ==>").append( BulkSimSwapStatusData.getPi_start_date());
			}
			if( null != BulkSimSwapStatusData.getPi_end_date()) {

				builder.append(":End Date ==>").append(BulkSimSwapStatusData.getPi_end_date());
			}
			
			
			List<BulkSimSwapStatusRefCursorData> cursorData  = BulkSimSwapStatusData.getPo_simswap_transdetails();

			if( null != cursorData && cursorData.size() > 0 ) {

				for( int i = 0; i < cursorData.size(); i++) {

					BulkSimSwapStatusRefCursorData bulkSimSwapStatusRefCursorData = cursorData.get( i );

					if( null != bulkSimSwapStatusRefCursorData ) {

						if( null != bulkSimSwapStatusRefCursorData.getTransaction_no() )
							builder.append(":Transaction_no ==>").append(bulkSimSwapStatusRefCursorData.getTransaction_no() );
						if( null != bulkSimSwapStatusRefCursorData.getSubmission_date() )
							builder.append(":Submission_date ==>").append(bulkSimSwapStatusRefCursorData.getSubmission_date());
						if( null != bulkSimSwapStatusRefCursorData.getUser_id() )
							builder.append(":User_id ==>").append(bulkSimSwapStatusRefCursorData.getUser_id());
						if( null != bulkSimSwapStatusRefCursorData.getStatus() )
							builder.append(":Status ==>").append(bulkSimSwapStatusRefCursorData.getStatus() );
					}
				}

			}
		}

		return builder.toString();
	}



	
}
