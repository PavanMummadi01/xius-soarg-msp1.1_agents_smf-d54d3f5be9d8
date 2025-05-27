package com.xius.smf.domaindata;

import java.util.List;

import com.xius.smf.domaindata.DomainDataBase;


public class ViewStateChanegReportsData extends DomainDataBase{
	
	private String pi_trans_id;
	private String pi_start_date;
	private String pi_end_date;
	
	private List<ViewStateChanegReportsCursorData> po_statechange_details;

	
	
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



	public List<ViewStateChanegReportsCursorData> getPo_statechange_details() {
		return po_statechange_details;
	}



	public void setPo_statechange_details(
			List<ViewStateChanegReportsCursorData> po_statechange_details) {
		this.po_statechange_details = po_statechange_details;
	}



	public String toString(ViewStateChanegReportsData viewStateChanegReportsData){

		StringBuilder builder = new StringBuilder();

		if( null != viewStateChanegReportsData ) {

			if( null != viewStateChanegReportsData.getPi_trans_id() ) {

				builder.append(":Trans Number ==>").append(viewStateChanegReportsData.getPi_trans_id());
			}
			List <ViewStateChanegReportsCursorData> cursorData  = viewStateChanegReportsData.getPo_statechange_details();

			if( null != cursorData && cursorData.size() > 0 ) {

				for( int i = 0; i < cursorData.size(); i++) {

					ViewStateChanegReportsCursorData  viewStateChanegReportsCursorData = (ViewStateChanegReportsCursorData)cursorData.get(i);
					String stateChange = viewStateChanegReportsCursorData.getState_change_details();
					if( null != stateChange )
					builder.append(":comma saperated msisdndetails ==>").append( stateChange );
					
				}
			}
		}

		return builder.toString();
	}

}
