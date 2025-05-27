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
public class ViewSimSwapDetailsData extends DomainDataBase {
	//null values
	/* 
	 * pi_network_id        IN       NUMBER,
      pi_trans_id          IN       VARCHAR2,
      pi_start_date        IN       VARCHAR2,
      pi_end_date          IN       VARCHAR2,
      po_simswap_details   OUT      sys_refcursor,
      po_error_code        OUT      NUMBER,
      po_error_desc        OUT      VARCHAR2
   )
	 * */
   	private String pi_start_date ;    
	private String  pi_end_date ; 
	
	// INOUT params
	private List<ViewSimSwapDetailsRefCursorData> po_simswapdetails;
	private String pi_trans_no;
	
	public String getPi_start_date() {
		return pi_start_date;
	}
	public void setPi_start_date(String pi_start_date) {
		this.pi_start_date = pi_start_date;
	}
	public List<ViewSimSwapDetailsRefCursorData> getPo_simswapdetails() {
		return po_simswapdetails;
	}
	public void setPo_simswapdetails(
			List<ViewSimSwapDetailsRefCursorData> po_simswapdetails) {
		this.po_simswapdetails = po_simswapdetails;
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
	
	
	
	public String toString(ViewSimSwapDetailsData viewSimSwapDetailsData){

		StringBuilder builder = new StringBuilder();

		if( null != viewSimSwapDetailsData ) {

			if( null != viewSimSwapDetailsData.getPi_trans_no() ) {

				builder.append(":Trans Number ==>").append(viewSimSwapDetailsData.getPi_trans_no());
			}
			List <ViewSimSwapDetailsRefCursorData> cursorData  = viewSimSwapDetailsData.getPo_simswapdetails();

			if( null != cursorData && cursorData.size() > 0 ) {

				for( int i = 0; i < cursorData.size(); i++) {

					ViewSimSwapDetailsRefCursorData  viewSimSwapDetailsRefCursorData = (ViewSimSwapDetailsRefCursorData)cursorData.get(i);
					String SwimSwapDetails = viewSimSwapDetailsRefCursorData.getSimswap_details();
					if( null != SwimSwapDetails )
					builder.append(":comma saperated msisdndetails ==>").append( SwimSwapDetails );
					
				}
			}
		}

		return builder.toString();
	}
}
