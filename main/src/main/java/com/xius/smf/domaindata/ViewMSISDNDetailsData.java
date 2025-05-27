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
public class ViewMSISDNDetailsData extends DomainDataBase {
	//null values
	private String pi_action_flag;
   	private String pi_start_date ;    
	private String  pi_end_date ;  
	// INOUT params
	private String pi_trans_no;
	
	public String getPi_action_flag() {
		return pi_action_flag;
	}
	public void setPi_action_flag(String pi_action_flag) {
		this.pi_action_flag = pi_action_flag;
	}
	public String getPi_start_date() {
		return pi_start_date;
	}
	public void setPi_start_date(String pi_start_date) {
		this.pi_start_date = pi_start_date;
	}
	public String getPi_end_date() {
		return pi_end_date;
	}
	public void setPi_end_date(String pi_end_date) {
		this.pi_end_date = pi_end_date;
	}
	// OUT params
	private List<ViewMSISDNDetailsRefCursorData> po_msisdndetails;
	
	public List<ViewMSISDNDetailsRefCursorData> getPo_msisdndetails() {
		return po_msisdndetails;
	}
	public void setPo_msisdndetails(
			List<ViewMSISDNDetailsRefCursorData> po_msisdndetails) {
		this.po_msisdndetails = po_msisdndetails;
	}
	public String getPi_trans_no() {
		return pi_trans_no;
	}
	public void setPi_trans_no(String pi_trans_no) {
		this.pi_trans_no = pi_trans_no;
	}
	
	
	
	public String toString(ViewMSISDNDetailsData viewMSISDNDetailsData){

		StringBuilder builder = new StringBuilder();

		if( null != viewMSISDNDetailsData ) {

			if( null != viewMSISDNDetailsData.getPi_trans_no() ) {

				builder.append(":Trans Number ==>").append(viewMSISDNDetailsData.getPi_trans_no());
			}
			List <ViewMSISDNDetailsRefCursorData> cursorData  = viewMSISDNDetailsData.getPo_msisdndetails();

			if( null != cursorData && cursorData.size() > 0 ) {

				for( int i = 0; i < cursorData.size(); i++) {

					ViewMSISDNDetailsRefCursorData  viewMSISDNDetailsRefCursorData = (ViewMSISDNDetailsRefCursorData)cursorData.get(i);
					String MSISDNDetails = viewMSISDNDetailsRefCursorData.getMsisdn_details();
					if( null != MSISDNDetails )
					builder.append(":comma saperated msisdndetails ==>").append( MSISDNDetails );
					
				}
			}
		}

		return builder.toString();
	}
}
