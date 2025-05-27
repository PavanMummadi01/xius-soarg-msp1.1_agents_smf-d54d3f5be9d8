package com.xius.smf.domaindata;

import java.math.BigDecimal;
import java.util.ArrayList;

public class TIARetryData extends DomainDataBase {

	private BigDecimal[]   pi_networkid ;
	private BigDecimal[]  pi_activityid;
	private Long   pi_max_records;
	private ArrayList<TIARetryCursorDtlsData> po_activationcursor;
	
	
	/**
	 * @return the pi_networkid
	 */
	public BigDecimal[] getPi_networkid() {
		return pi_networkid;
	}
	/**
	 * @param pi_networkid the pi_networkid to set
	 */
	public void setPi_networkid(BigDecimal[] pi_networkid) {
		this.pi_networkid = pi_networkid;
	}
	/**
	 * @return the pi_activityid
	 */
	public BigDecimal[] getPi_activityid() {
		return pi_activityid;
	}
	/**
	 * @param pi_activityid the pi_activityid to set
	 */
	public void setPi_activityid(BigDecimal[] pi_activityid) {
		this.pi_activityid = pi_activityid;
	}
	/**
	 * @return the pi_max_records
	 */
	public Long getPi_max_records() {
		return pi_max_records;
	}
	/**
	 * @param pi_max_records the pi_max_records to set
	 */
	public void setPi_max_records(Long pi_max_records) {
		this.pi_max_records = pi_max_records;
	}
	/**
	 * @return the po_activationcursor
	 */
	public ArrayList<TIARetryCursorDtlsData> getPo_activationcursor() {
		return po_activationcursor;
	}
	/**
	 * @param po_activationcursor the po_activationcursor to set
	 */
	public void setPo_activationcursor(
			ArrayList<TIARetryCursorDtlsData> po_activationcursor) {
		this.po_activationcursor = po_activationcursor;
	}
	
	
}
