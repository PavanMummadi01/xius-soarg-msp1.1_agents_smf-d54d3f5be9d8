/**
 * 
 */
package com.xius.smf.domaindata;

import java.util.ArrayList;

/**
 * @author prince.kumar
 *
 */
public class BalTransStatusData extends DomainDataBase{
	
	private String intTransId;
	private String extTransId;
	private ArrayList<BalTransStatusCursorData> po_balance_trans_status;
	
	
	public String getIntTransId() {
		return intTransId;
	}
	public void setIntTransId(String intTransId) {
		this.intTransId = intTransId;
	}
	public String getExtTransId() {
		return extTransId;
	}
	public void setExtTransId(String extTransId) {
		this.extTransId = extTransId;
	}
	public ArrayList<BalTransStatusCursorData> getPo_balance_trans_status() {
		return po_balance_trans_status;
	}
	public void setPo_balance_trans_status(
			ArrayList<BalTransStatusCursorData> po_balance_trans_status) {
		this.po_balance_trans_status = po_balance_trans_status;
	}
	@Override
	public String toString() {
		return "BalTransStatusData [intTransId=" + intTransId + ", extTransId="
				+ extTransId + ", po_balance_trans_status="
				+ po_balance_trans_status + "]";
	}
	
	

}
