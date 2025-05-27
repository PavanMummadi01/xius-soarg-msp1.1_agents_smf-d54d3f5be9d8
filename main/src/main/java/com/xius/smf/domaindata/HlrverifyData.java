package com.xius.smf.domaindata;

import java.util.ArrayList;

public class HlrverifyData extends DomainDataBase{
/*	
 * PROCEDURE pro_get_simswap_simreg_chngmd (
   pi_network_id    IN       NUMBER,
   pi_flag          IN       arr_numb,
   -- 'SIM_REG - 1, SIMSWAP - 2, CHANGE_MSISDN - 3''
   pi_max_records   IN       NUMBER,
   po_simswap       OUT      sys_refcursor,
   po_sim_reg       OUT      sys_refcursor,
   po_change_mdn    OUT      sys_refcursor,
   po_error_code    OUT      NUMBER,
   po_error_msg     OUT      VARCHAR2
)
*/
	
	private Long[] pi_flag;
	private Long pi_max_records;
	private ArrayList<ProcesssimswapRecordsData> po_simswap;
	private ArrayList<ProcesssimswapRecordsData> po_sim_reg;
	private ArrayList<ProcesssimswapRecordsData> po_change_mdn;
	private String po_error_msg;
	
	
	public Long getPi_max_records() {
		return pi_max_records;
	}
	public void setPi_max_records(Long pi_max_records) {
		this.pi_max_records = pi_max_records;
	}
	public Long[] getPi_flag() {
		return pi_flag;
	}
	public void setPi_flag(Long[] pi_flag) {
		this.pi_flag = pi_flag;
	}
	public ArrayList<ProcesssimswapRecordsData> getPo_simswap() {
		return po_simswap;
	}
	public void setPo_simswap(ArrayList<ProcesssimswapRecordsData> po_simswap) {
		this.po_simswap = po_simswap;
	}
	public ArrayList<ProcesssimswapRecordsData> getPo_sim_reg() {
		return po_sim_reg;
	}
	public void setPo_sim_reg(ArrayList<ProcesssimswapRecordsData> po_sim_reg) {
		this.po_sim_reg = po_sim_reg;
	}
	public ArrayList<ProcesssimswapRecordsData> getPo_change_mdn() {
		return po_change_mdn;
	}
	public void setPo_change_mdn(ArrayList<ProcesssimswapRecordsData> po_change_mdn) {
		this.po_change_mdn = po_change_mdn;
	}
	public String getPo_error_msg() {
		return po_error_msg;
	}
	public void setPo_error_msg(String po_error_msg) {
		this.po_error_msg = po_error_msg;
	}

	
	
} 
