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
public class BlkActDeactStatusData extends DomainDataBase {
	
	//null value
	private String pi_trans_no;
	// INOUT params
	private String pi_start_date;
	
	private String pi_end_date;
	private String pi_activity_type;
	
	// OUT params
	private List<BlkActDeactRefCursorData> po_deact_react_details;
	
	public String getPi_activity_type() {
		return pi_activity_type;
	}



	public void setPi_activity_type(String pi_activity_type) {
		this.pi_activity_type = pi_activity_type;
	}


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



	public List<BlkActDeactRefCursorData> getPo_deact_react_details() {
		return po_deact_react_details;
	}



	public void setPo_deact_react_details(
			List<BlkActDeactRefCursorData> po_deact_react_details) {
		this.po_deact_react_details = po_deact_react_details;
	}



	public String getPi_trans_no() {
		return pi_trans_no;
	}
	public void setPi_trans_no(String pi_trans_no) {
		this.pi_trans_no = pi_trans_no;
	}

	public String toString(BlkActDeactStatusData blkActDeactStatusData){

		StringBuilder builder = new StringBuilder();

		if( null != blkActDeactStatusData ) {

			if( null != blkActDeactStatusData.getPi_start_date() ) {
				builder.append("StartDate ==>").append( blkActDeactStatusData.getPi_start_date());
			}
			if( null != blkActDeactStatusData.getPi_end_date()) {

				builder.append(":End Date ==>").append(blkActDeactStatusData.getPi_end_date());
			}
			if( null != blkActDeactStatusData.getPi_activity_type()) {

				builder.append(":Activity_type ==>").append(blkActDeactStatusData.getPi_activity_type());
			}
			
			
			List<BlkActDeactRefCursorData> cursorData  = blkActDeactStatusData.getPo_deact_react_details();

			if( null != cursorData && cursorData.size() > 0 ) {

				for( int i = 0; i < cursorData.size(); i++) {

					BlkActDeactRefCursorData blkActDeactRefCursorData = cursorData.get( i );

					if( null != blkActDeactRefCursorData ) {

						if( null != blkActDeactRefCursorData.getTransaction_no() )
							builder.append(":Transaction_no ==>").append(blkActDeactRefCursorData.getTransaction_no() );
						if( null != blkActDeactRefCursorData.getSubmission_date() )
							builder.append(":Submission_date ==>").append(blkActDeactRefCursorData.getSubmission_date());
						if( null != blkActDeactRefCursorData.getUser_id() )
							builder.append(":User_id ==>").append(blkActDeactRefCursorData.getUser_id());
						if( null != blkActDeactRefCursorData.getStatus() )
							builder.append(":Status ==>").append(blkActDeactRefCursorData.getStatus() );
					}
				}

			}
		}

		return builder.toString();
	}
	
}
