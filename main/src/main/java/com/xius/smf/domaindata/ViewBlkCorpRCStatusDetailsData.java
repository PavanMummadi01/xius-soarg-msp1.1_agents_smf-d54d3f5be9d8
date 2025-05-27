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
public class ViewBlkCorpRCStatusDetailsData extends DomainDataBase {

	private String pi_start_date ;    
	private String  pi_end_date ; 
	private String pi_trans_no;
	
	// INOUT params
	private List<ViewBlkCorpRCDetailsRefCursorData> po_corprct_details;
	
	
	public List<ViewBlkCorpRCDetailsRefCursorData> getPo_corprct_details() {
		return po_corprct_details;
	}
	public void setPo_corprct_details(
			List<ViewBlkCorpRCDetailsRefCursorData> po_corprct_details) {
		this.po_corprct_details = po_corprct_details;
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
	
	
	public String getPi_trans_no() {
		return pi_trans_no;
	}
	public void setPi_trans_no(String pi_trans_no) {
		this.pi_trans_no = pi_trans_no;
	}
	
	
	
	public String toString(ViewBlkCorpRCStatusDetailsData viewBlkCorpRCStatusDetailsData){

		StringBuilder builder = new StringBuilder();

		if( null != viewBlkCorpRCStatusDetailsData ) {

			if( null != viewBlkCorpRCStatusDetailsData.getPi_trans_no() ) {

				builder.append(":Trans Number ==>").append(viewBlkCorpRCStatusDetailsData.getPi_trans_no());
			}
			List <ViewBlkCorpRCDetailsRefCursorData> cursorData  = viewBlkCorpRCStatusDetailsData.getPo_corprct_details();

			if( null != cursorData && cursorData.size() > 0 ) {

				for( int i = 0; i < cursorData.size(); i++) {

					ViewBlkCorpRCDetailsRefCursorData  viewBlkCorpRCStatusCursorData = (ViewBlkCorpRCDetailsRefCursorData)cursorData.get(i);
					String viewBlkCorpRCStatusDtls = viewBlkCorpRCStatusCursorData.getCorp_rct_details();
					if( null != viewBlkCorpRCStatusDtls )
					builder.append(":comma saperated viewBlkCorpRCStatusDtls ==>").append( viewBlkCorpRCStatusDtls );
					
				}
			}
		}

		return builder.toString();
	}
}
