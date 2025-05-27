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
public class ViewBlkActDeactStatusDetailsData extends DomainDataBase {
	
	private String pi_start_date ;    
	private String  pi_end_date ; 
	private String pi_trans_no;
	private String pi_activity_type;
	// INOUT params
	private List<ViewBlkActDeactDetailsRefCursorData> po_deactreact_dtls;
	public String getPi_activity_type() {
		return pi_activity_type;
	}
	public void setPi_activity_type(String pi_activity_type) {
		this.pi_activity_type = pi_activity_type;
	}

	
	public List<ViewBlkActDeactDetailsRefCursorData> getPo_deactreact_dtls() {
		return po_deactreact_dtls;
	}
	public void setPo_deactreact_dtls(
			List<ViewBlkActDeactDetailsRefCursorData> po_deactreact_dtls) {
		this.po_deactreact_dtls = po_deactreact_dtls;
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
	
	
	
	public String toString(ViewBlkActDeactStatusDetailsData viewBlkActDeactDetailsData){

		StringBuilder builder = new StringBuilder();

		if( null != viewBlkActDeactDetailsData ) {

			if( null != viewBlkActDeactDetailsData.getPi_trans_no() ) {

				builder.append(":Trans Number ==>").append(viewBlkActDeactDetailsData.getPi_trans_no());
			}
			if( null != viewBlkActDeactDetailsData.getPi_activity_type() ) {

				builder.append(":Activity_type ==>").append(viewBlkActDeactDetailsData.getPi_activity_type());
			}
			List <ViewBlkActDeactDetailsRefCursorData> cursorData  = viewBlkActDeactDetailsData.getPo_deactreact_dtls();

			if( null != cursorData && cursorData.size() > 0 ) {

				for( int i = 0; i < cursorData.size(); i++) {

					ViewBlkActDeactDetailsRefCursorData  viewBlkActDeactDetailsRefCursorData = (ViewBlkActDeactDetailsRefCursorData)cursorData.get(i);
					String viewBlkActDeactStatusDtls = viewBlkActDeactDetailsRefCursorData.getDeact_react_details();
					if( null != viewBlkActDeactStatusDtls )
					builder.append(":comma saperated viewBlkActDeactStatusDtls ==>").append( viewBlkActDeactStatusDtls );
					
				}
			}
		}

		return builder.toString();
	}
}
