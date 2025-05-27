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
 * 
 */
public class BlkCorpRCStatusData extends DomainDataBase {
	/*
	 * 
	 * pro_corp_rct_report_dtls (
      pi_network_id         IN       NUMBER,
      pi_trans_no           IN       VARCHAR2,
      pi_start_date         IN       VARCHAR2,
      pi_end_date           IN       VARCHAR2,
      po_corp_rct_details   OUT      sys_refcursor,
      po_error_code         OUT      NUMBER,
      po_error_desc         OUT      VARCHAR2
	 * 
	 */
	//null value
	private String pi_trans_no;
	// INOUT params
	private String pi_start_date;
	private String pi_end_date;
	
	// OUT params
	private List<BlkCorpRCRefCursorData> po_corp_rct_details;

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




	public List<BlkCorpRCRefCursorData> getPo_corp_rct_details() {
		return po_corp_rct_details;
	}



	public void setPo_corp_rct_details(
			List<BlkCorpRCRefCursorData> po_corp_rct_details) {
		this.po_corp_rct_details = po_corp_rct_details;
	}



	public String getPi_trans_no() {
		return pi_trans_no;
	}
	public void setPi_trans_no(String pi_trans_no) {
		this.pi_trans_no = pi_trans_no;
	}

	public String toString(BlkCorpRCStatusData blkCorpRCStatusData){

		StringBuilder builder = new StringBuilder();

		if( null != blkCorpRCStatusData ) {

			if( null != blkCorpRCStatusData.getPi_start_date() ) {
				builder.append("StartDate ==>").append( blkCorpRCStatusData.getPi_start_date());
			}
			if( null != blkCorpRCStatusData.getPi_end_date()) {

				builder.append(":End Date ==>").append(blkCorpRCStatusData.getPi_end_date());
			}
			
			
			List<BlkCorpRCRefCursorData> cursorData  = blkCorpRCStatusData.getPo_corp_rct_details();

			if( null != cursorData && cursorData.size() > 0 ) {

				for( int i = 0; i < cursorData.size(); i++) {

					BlkCorpRCRefCursorData blkCorpRCRefCursorData = cursorData.get( i );

					if( null != blkCorpRCRefCursorData ) {

						if( null != blkCorpRCRefCursorData.getTransaction_no() )
							builder.append(":Transaction_no ==>").append(blkCorpRCRefCursorData.getTransaction_no() );
						if( null != blkCorpRCRefCursorData.getSubmission_date() )
							builder.append(":Submission_date ==>").append(blkCorpRCRefCursorData.getSubmission_date());
						if( null != blkCorpRCRefCursorData.getUser_id() )
							builder.append(":User_id ==>").append(blkCorpRCRefCursorData.getUser_id());
						if( null != blkCorpRCRefCursorData.getStatus() )
							builder.append(":Status ==>").append(blkCorpRCRefCursorData.getStatus() );
					}
				}

			}
		}

		return builder.toString();
	}



	
}
