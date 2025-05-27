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
public class ForceSimActStatusData extends DomainDataBase {
	
	//null value
	private String pi_trans_no;
	// INOUT params
	private String pi_start_date;
	private String pi_end_date;
	
	// OUT params
	private List<ForceSimActStatusRefCursorData> po_forcesim_details;

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


	public List<ForceSimActStatusRefCursorData> getPo_forcesim_details() {
		return po_forcesim_details;
	}



	public void setPo_forcesim_details(
			List<ForceSimActStatusRefCursorData> po_forcesim_details) {
		this.po_forcesim_details = po_forcesim_details;
	}



	public String getPi_trans_no() {
		return pi_trans_no;
	}
	public void setPi_trans_no(String pi_trans_no) {
		this.pi_trans_no = pi_trans_no;
	}

	public String toString(ForceSimActStatusData ForceSimActStatusData){

		StringBuilder builder = new StringBuilder();

		if( null != ForceSimActStatusData ) {

			if( null != ForceSimActStatusData.getPi_start_date() ) {
				builder.append("StartDate ==>").append( ForceSimActStatusData.getPi_start_date());
			}
			if( null != ForceSimActStatusData.getPi_end_date()) {

				builder.append(":End Date ==>").append(ForceSimActStatusData.getPi_end_date());
			}
			
			
			List<ForceSimActStatusRefCursorData> cursorData  = ForceSimActStatusData.getPo_forcesim_details();

			if( null != cursorData && cursorData.size() > 0 ) {

				for( int i = 0; i < cursorData.size(); i++) {

					ForceSimActStatusRefCursorData forceSimActStatusRefCursorData = cursorData.get( i );

					if( null != forceSimActStatusRefCursorData ) {

						if( null != forceSimActStatusRefCursorData.getTransaction_no() )
							builder.append(":Transaction_no ==>").append(forceSimActStatusRefCursorData.getTransaction_no() );
						if( null != forceSimActStatusRefCursorData.getSubmission_date() )
							builder.append(":Submission_date ==>").append(forceSimActStatusRefCursorData.getSubmission_date());
						if( null != forceSimActStatusRefCursorData.getUser_id() )
							builder.append(":User_id ==>").append(forceSimActStatusRefCursorData.getUser_id());
						if( null != forceSimActStatusRefCursorData.getStatus() )
							builder.append(":Status ==>").append(forceSimActStatusRefCursorData.getStatus() );
					}
				}

			}
		}

		return builder.toString();
	}



	
}
