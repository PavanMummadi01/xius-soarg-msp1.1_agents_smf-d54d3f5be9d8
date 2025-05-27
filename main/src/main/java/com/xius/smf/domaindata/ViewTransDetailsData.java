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
public class ViewTransDetailsData extends DomainDataBase {

	// INOUT params
	private String pi_start_date;
	private String pi_end_date;

	// OUT params
	private List<ViewTransDetailsRefCursorData> po_sim_transdetails;

	
	
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



	/**
	 * @return the po_sim_transdetails
	 */
	public List<ViewTransDetailsRefCursorData> getPo_sim_transdetails() {
		return po_sim_transdetails;
	}



	/**
	 * @param po_sim_transdetails the po_sim_transdetails to set
	 */
	public void setPo_sim_transdetails(
			List<ViewTransDetailsRefCursorData> po_sim_transdetails) {
		this.po_sim_transdetails = po_sim_transdetails;
	}



	public String toString(ViewTransDetailsData viewTransDetails){

		StringBuilder builder = new StringBuilder();

		if( null != viewTransDetails ) {

			if( null != viewTransDetails.getPi_start_date() ) {
				builder.append("StartDate ==>").append( viewTransDetails.getPi_start_date());
			}
			if( null != viewTransDetails.getPi_end_date()) {

				builder.append(":End Date ==>").append(viewTransDetails.getPi_end_date());
			}
			List<ViewTransDetailsRefCursorData> cursorData  = viewTransDetails.getPo_sim_transdetails();

			if( null != cursorData && cursorData.size() > 0 ) {

				for( int i = 0; i < cursorData.size(); i++) {

					ViewTransDetailsRefCursorData transDetailsRefCursorData = cursorData.get( i );

					if( null != transDetailsRefCursorData ) {

						if( null != transDetailsRefCursorData.getTransaction_no() )
							builder.append(":Transaction_no ==>").append(transDetailsRefCursorData.getTransaction_no() );
						if( null != transDetailsRefCursorData.getTransaction_date() )
							builder.append(":Transaction_date ==>").append(transDetailsRefCursorData.getTransaction_date() );
						if( null != transDetailsRefCursorData.getUser_id() )
							builder.append(":User_id ==>").append(transDetailsRefCursorData.getUser_id());
						if( null != transDetailsRefCursorData.getStatus() )
							builder.append(":Status ==>").append(transDetailsRefCursorData.getStatus() );
					}
				}

			}
		}

		return builder.toString();
	}
}
