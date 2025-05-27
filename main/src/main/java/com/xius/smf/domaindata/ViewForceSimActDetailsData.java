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
public class ViewForceSimActDetailsData extends DomainDataBase {

	private String pi_start_date ;    
	private String  pi_end_date ; 
	private String pi_trans_no;
	
	// INOUT params
	private List<ViewForceSimActDetailsRefCursorData> po_forcesimdetails;
	
	
	public String getPi_start_date() {
		return pi_start_date;
	}
	public void setPi_start_date(String pi_start_date) {
		this.pi_start_date = pi_start_date;
	}

	public List<ViewForceSimActDetailsRefCursorData> getPo_forcesimdetails() {
		return po_forcesimdetails;
	}
	public void setPo_forcesimdetails(
			List<ViewForceSimActDetailsRefCursorData> po_forcesimdetails) {
		this.po_forcesimdetails = po_forcesimdetails;
	}
	public String getPi_end_date() {
		return pi_end_date;
	}
	public void setPi_end_date(String pi_end_date) {
		this.pi_end_date = pi_end_date;
	}
	// OUT params
	
	
	public String getPi_trans_no() {
		return pi_trans_no;
	}
	public void setPi_trans_no(String pi_trans_no) {
		this.pi_trans_no = pi_trans_no;
	}
	
	
	
	public String toString(ViewForceSimActDetailsData viewForceSimActDetailsData){

		StringBuilder builder = new StringBuilder();

		if( null != viewForceSimActDetailsData ) {

			if( null != viewForceSimActDetailsData.getPi_trans_no() ) {

				builder.append(":Trans Number ==>").append(viewForceSimActDetailsData.getPi_trans_no());
			}
			List <ViewForceSimActDetailsRefCursorData> cursorData  = viewForceSimActDetailsData.getPo_forcesimdetails();

			if( null != cursorData && cursorData.size() > 0 ) {

				for( int i = 0; i < cursorData.size(); i++) {

					ViewForceSimActDetailsRefCursorData  viewForceSimActDetailsCursorData = (ViewForceSimActDetailsRefCursorData)cursorData.get(i);
					String ForcesimActDetails = viewForceSimActDetailsCursorData.getForce_sim_details();
					if( null != ForcesimActDetails )
					builder.append(":comma saperated ForcesimActDetails ==>").append( ForcesimActDetails );
					
				}
			}
		}

		return builder.toString();
	}
}
