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


public class BulkStateChanegReportsData extends DomainDataBase {

	
	private String pi_trans_id;
	private String pi_start_date;
	private String pi_end_date;
	
	private List<BulkStateChanegReportsCursorData> po_state_change_details;
	public String getPi_trans_id() {
		return pi_trans_id;
	}
	public void setPi_trans_id(String pi_trans_id) {
		this.pi_trans_id = pi_trans_id;
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
	public List<BulkStateChanegReportsCursorData> getPo_state_change_details() {
		return po_state_change_details;
	}
	public void setPo_state_change_details(
			List<BulkStateChanegReportsCursorData> po_state_change_details) {
		this.po_state_change_details = po_state_change_details;
	}
	 
	public String toString(BulkStateChanegReportsData bulkStateChanegReportsData){

		StringBuilder builder = new StringBuilder();

		if( null != bulkStateChanegReportsData ) {

			if( null != bulkStateChanegReportsData.getPi_start_date()) {
				builder.append("StartDate ==>").append( bulkStateChanegReportsData.getPi_start_date());
			}
			if( null != bulkStateChanegReportsData.getPi_end_date()) {

				builder.append(":End Date ==>").append(bulkStateChanegReportsData.getPi_end_date());
			}
			if( null != bulkStateChanegReportsData.getPi_trans_id()) {

				builder.append(":Transe Id ==>").append(bulkStateChanegReportsData.getPi_trans_id());
			}
			
			
			List<BulkStateChanegReportsCursorData> cursorData  = bulkStateChanegReportsData.getPo_state_change_details();

			if( null != cursorData && cursorData.size() > 0 ) {

				for( int i = 0; i < cursorData.size(); i++) {

					BulkStateChanegReportsCursorData bulkStateChanegReportsCursorData = cursorData.get( i );

					if( null != bulkStateChanegReportsCursorData ) {

						if( null != bulkStateChanegReportsCursorData.getTransation_date() )
							builder.append(":Transaction_Date ==>").append(bulkStateChanegReportsCursorData.getTransation_date());
						if( null != bulkStateChanegReportsCursorData.getFile_status() )
							builder.append(":File Status ==>").append(bulkStateChanegReportsCursorData.getFile_status());
						if( null != bulkStateChanegReportsCursorData.getUser_id() )
							builder.append(":User_id ==>").append(bulkStateChanegReportsCursorData.getUser_id());
						if( null != bulkStateChanegReportsCursorData.getFile_trans_id() )
							builder.append(":trans Id ==>").append(bulkStateChanegReportsCursorData.getFile_trans_id() );
					}
				}

			}
		}

		return builder.toString();
	}
	

}
