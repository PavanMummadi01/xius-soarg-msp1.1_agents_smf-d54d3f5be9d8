package com.xius.smf.domaindata;


 

public class FluValidationData extends DomainDataBase {

	   private String pi_iccid;
	   private Long pi_nir_code;
	   private String pi_office_code;
	   private String po_IMSI;
	   
	   
	public String getPo_IMSI() {
		return po_IMSI;
	}
	public void setPo_IMSI(String po_IMSI) {
		this.po_IMSI = po_IMSI;
	}
	/**
	 * @return the pi_iccid
	 */
	public String getPi_iccid() {
		return pi_iccid;
	}
	/**
	 * @param pi_iccid the pi_iccid to set
	 */
	public void setPi_iccid(String pi_iccid) {
		this.pi_iccid = pi_iccid;
	}
	/**
	 * @return the pi_nir_code
	 */
	public Long getPi_nir_code() {
		return pi_nir_code;
	}
	/**
	 * @param pi_nir_code the pi_nir_code to set
	 */
	public void setPi_nir_code(Long pi_nir_code) {
		this.pi_nir_code = pi_nir_code;
	}
	/**
	 * @return the pi_office_code
	 */
	public String getPi_office_code() {
		return pi_office_code;
	}
	/**
	 * @param pi_office_code the pi_office_code to set
	 */
	public void setPi_office_code(String pi_office_code) {
		this.pi_office_code = pi_office_code;
	}
	   
	   
}
