/**
 * Copyright   2012 XIUS.
 * All rights reserved. These computer programs, listings, and
 * specifications are the property of XIUS.
 * And may not be copied, stored, used or transmitted, in
 * whole or in part, in any for or by any means, without the
 * prior written permission of XIUS.
 *
 */


/**
 * 	@company	XIUS (Megasoft Pvt Ltd Hyderabad,INDIA)
 *	@package	com.xius.smf.domaindata
 * 	@author		SaiRajesh.g
 *	@Date		Jan 29, 2014,4:37:22 PM
*/

package com.xius.smf.domaindata;

import java.util.ArrayList;

public class HLRData extends DomainDataBase{
	
//	network_id, account_id, imsi, msisdn_no, old_status,
//    new_status, odb_value, status_change_date,
//    status_change_reason,
//	process_flag,
//    processed_date, remarks, transaction_id,
//    row_num
	
	private Long pi_maxRecords;
	private Long po_total_records;
	private ArrayList<HLRCursorData> cursor;
	
	
	public Long getPi_maxRecords() {
		return pi_maxRecords;
	}
	public void setPi_maxRecords(Long pi_maxRecords) {
		this.pi_maxRecords = pi_maxRecords;
	}
	public Long getPo_total_records() {
		return po_total_records;
	}
	public void setPo_total_records(Long po_total_records) {
		this.po_total_records = po_total_records;
	}
	public ArrayList<HLRCursorData> getCursor() {
		return cursor;
	}
	public void setCursor(ArrayList<HLRCursorData> cursor) {
		this.cursor = cursor;
	}	
}
