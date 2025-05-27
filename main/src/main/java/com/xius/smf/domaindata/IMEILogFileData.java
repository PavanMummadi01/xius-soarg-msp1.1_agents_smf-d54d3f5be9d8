package com.xius.smf.domaindata;


public class IMEILogFileData extends DomainDataBase {

	/* pi_network      IN       NUMBER,
	   po_file_name    OUT      VARCHAR2,
	   po_error_code   OUT      NUMBER,
	   po_error_desc   OUT      VARCHAR2*/
     
	private String po_file_name;

	/**
	 * @return the po_file_name
	 */
	public String getPo_file_name() {
		return po_file_name;
	}

	/**
	 * @param po_file_name the po_file_name to set
	 */
	public void setPo_file_name(String po_file_name) {
		this.po_file_name = po_file_name;
	}
	
	
		
}
