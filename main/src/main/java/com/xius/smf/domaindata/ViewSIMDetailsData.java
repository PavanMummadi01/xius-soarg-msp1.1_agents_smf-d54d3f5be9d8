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
public class ViewSIMDetailsData extends DomainDataBase {

	// INOUT params
	private String pi_trans_no;

	// OUT params
	private List<ViewSIMDetailsRefCursorData> po_simdetails;

	public String getPi_trans_no() {
		return pi_trans_no;
	}
	public void setPi_trans_no(String pi_trans_no) {
		this.pi_trans_no = pi_trans_no;
	}
	

	public List<ViewSIMDetailsRefCursorData> getPo_simdetails() {
		return po_simdetails;
	}
	public void setPo_simdetails(List<ViewSIMDetailsRefCursorData> po_simdetails) {
		this.po_simdetails = po_simdetails;
	}
	public String toString(ViewSIMDetailsData viewSIMDetailsData){

		StringBuilder builder = new StringBuilder();

		if( null != viewSIMDetailsData ) {

			if( null != viewSIMDetailsData.getPi_trans_no() ) {

				builder.append(":Trans Number ==>").append(viewSIMDetailsData.getPi_trans_no());
			}
			List <ViewSIMDetailsRefCursorData> cursorData  = viewSIMDetailsData.getPo_simdetails();

			if( null != cursorData && cursorData.size() > 0 ) {

				for( int i = 0; i < cursorData.size(); i++) {

					ViewSIMDetailsRefCursorData  viewSIMDetailsRefCursorData = (ViewSIMDetailsRefCursorData)cursorData.get(i);
					String commaSaparatedDispensedSIMDetails = viewSIMDetailsRefCursorData.getSim_details();
					if( null != commaSaparatedDispensedSIMDetails )
					builder.append(":Comma Saparted Striing ==>").append( commaSaparatedDispensedSIMDetails );
				}
			}
		}

		return builder.toString();
	}
}
