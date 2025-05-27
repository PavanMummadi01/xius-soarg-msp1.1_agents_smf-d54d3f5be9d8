package com.xius.smf.domaindata;

import java.math.BigDecimal;
import java.util.ArrayList;

public class YFAPIProcessData extends DomainDataBase{
	
	
	private Long pi_max_records ;
	private BigDecimal[] pi_activity;
	private ArrayList<YFAPICursorDtlsData> po_api_data_cursor;
	
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
	 * @return the po_api_data_cursor
	 */
	public ArrayList<YFAPICursorDtlsData> getPo_api_data_cursor() {
		return po_api_data_cursor;
	}
	/**
	 * @param po_api_data_cursor the po_api_data_cursor to set
	 */
	public void setPo_api_data_cursor(
			ArrayList<YFAPICursorDtlsData> po_api_data_cursor) {
		this.po_api_data_cursor = po_api_data_cursor;
	}
	
	/**
	 * @param pi_activity the pi_activity to set
	 */
	public void setPi_activity(BigDecimal[] pi_activity) {
		this.pi_activity = pi_activity;
	}
	/**
	 * @return the pi_activity
	 */
	public BigDecimal[] getPi_activity() {
		return pi_activity;
	}
	
	
	
	
	
}
