/*
 *
 * File Name: GetSubTransDetailsData.java 
 * Description:
 * Author: ravi.shaganti
 * Created Date: 12/02/26
 * Modified By:
 * Modified Date: 12/02/26
 * Modifications:
 * Reason for Modification
 *
 */



package com.xius.smf.domaindata;


//~--- non-JDK imports --------------------------------------------------------


public class UploadSubTransDetailsData extends DomainDataBase {

	private String[] pi_icc_num_array;
	private String[] pi_id_no_array;
	private String[] pi_id_type_array;
	private String[] pi_first_name_array;
	private String[] pi_last_name_array ;
	private String[] pi_first_address_array;
	private String[] pi_second_address_array;
	private String[] pi_postcode_array;
	private String[] pi_city_array;
	private String[] pi_state_array;
	private String[] pi_country_array;
	
	private String[] pi_gender;
	private String[] pi_date_of_birth;
	private String pi_user_id;
	private String[] pi_network_name;
	private String[] pi_user_type; //(from smfagent always TTCARE)
	private String po_trans_id;
	private String po_error_desc;
	

    /**
	 * @return the pi_icc_num_array
	 */
	public String[] getPi_icc_num_array() {
		return pi_icc_num_array;
	}


	/**
	 * @param piIccNumArray the pi_icc_num_array to set
	 */
	public void setPi_icc_num_array(String[] piIccNumArray) {
		pi_icc_num_array = piIccNumArray;
	}


	/**
	 * @return the pi_id_no_array
	 */
	public String[] getPi_id_no_array() {
		return pi_id_no_array;
	}


	/**
	 * @param piIdNoArray the pi_id_no_array to set
	 */
	public void setPi_id_no_array(String[] piIdNoArray) {
		pi_id_no_array = piIdNoArray;
	}


	/**
	 * @return the pi_id_type_array
	 */
	public String[] getPi_id_type_array() {
		return pi_id_type_array;
	}


	/**
	 * @param piIdTypeArray the pi_id_type_array to set
	 */
	public void setPi_id_type_array(String[] piIdTypeArray) {
		pi_id_type_array = piIdTypeArray;
	}


	/**
	 * @return the pi_first_name_array
	 */
	public String[] getPi_first_name_array() {
		return pi_first_name_array;
	}


	/**
	 * @param piFirstNameArray the pi_first_name_array to set
	 */
	public void setPi_first_name_array(String[] piFirstNameArray) {
		pi_first_name_array = piFirstNameArray;
	}


	/**
	 * @return the pi_last_name_array
	 */
	public String[] getPi_last_name_array() {
		return pi_last_name_array;
	}


	/**
	 * @param piLastNameArray the pi_last_name_array to set
	 */
	public void setPi_last_name_array(String[] piLastNameArray) {
		pi_last_name_array = piLastNameArray;
	}


	/**
	 * @return the pi_first_address_array
	 */
	public String[] getPi_first_address_array() {
		return pi_first_address_array;
	}


	/**
	 * @param piFirstAddressArray the pi_first_address_array to set
	 */
	public void setPi_first_address_array(String[] piFirstAddressArray) {
		pi_first_address_array = piFirstAddressArray;
	}


	/**
	 * @return the pi_second_address_array
	 */
	public String[] getPi_second_address_array() {
		return pi_second_address_array;
	}


	/**
	 * @param piSecondAddressArray the pi_second_address_array to set
	 */
	public void setPi_second_address_array(String[] piSecondAddressArray) {
		pi_second_address_array = piSecondAddressArray;
	}


	/**
	 * @return the pi_postcode_array
	 */
	public String[] getPi_postcode_array() {
		return pi_postcode_array;
	}


	/**
	 * @param piPostcodeArray the pi_postcode_array to set
	 */
	public void setPi_postcode_array(String[] piPostcodeArray) {
		pi_postcode_array = piPostcodeArray;
	}


	/**
	 * @return the pi_city_array
	 */
	public String[] getPi_city_array() {
		return pi_city_array;
	}


	/**
	 * @param piCityArray the pi_city_array to set
	 */
	public void setPi_city_array(String[] piCityArray) {
		pi_city_array = piCityArray;
	}


	/**
	 * @return the pi_state_array
	 */
	public String[] getPi_state_array() {
		return pi_state_array;
	}


	/**
	 * @param piStateArray the pi_state_array to set
	 */
	public void setPi_state_array(String[] piStateArray) {
		pi_state_array = piStateArray;
	}


	/**
	 * @return the pi_country_array
	 */
	public String[] getPi_country_array() {
		return pi_country_array;
	}


	/**
	 * @param piCountryArray the pi_country_array to set
	 */
	public void setPi_country_array(String[] piCountryArray) {
		pi_country_array = piCountryArray;
	}


	/**
	 * @return the po_trans_id
	 */
	public String getPo_trans_id() {
		return po_trans_id;
	}


	/**
	 * @param poTransId the po_trans_id to set
	 */
	public void setPo_trans_id(String poTransId) {
		po_trans_id = poTransId;
	}

	/**
	 * @return the pi_date_of_birth
	 */
	public String[] getPi_date_of_birth() {
		return pi_date_of_birth;
	}


	/**
	 * @param piDateOfBirth the pi_date_of_birth to set
	 */
	public void setPi_date_of_birth(String[] piDateOfBirth) {
		pi_date_of_birth = piDateOfBirth;
	}


	/**
	 * @return the pi_gender
	 */
	public String[] getPi_gender() {
		return pi_gender;
	}


	/**
	 * @param piGender the pi_gender to set
	 */
	public void setPi_gender(String[] piGender) {
		pi_gender = piGender;
	}


	public String getPi_user_id() {
		return pi_user_id;
	}


	public void setPi_user_id(String pi_user_id) {
		this.pi_user_id = pi_user_id;
	}


	public String[] getPi_network_name() {
		return pi_network_name;
	}


	public void setPi_network_name(String[] pi_network_name) {
		this.pi_network_name = pi_network_name;
	}


	public String[] getPi_user_type() {
		return pi_user_type;
	}


	public void setPi_user_type(String[] pi_user_type) {
		this.pi_user_type = pi_user_type;
	}

	public String getPo_error_desc() {
		return po_error_desc;
	}


	public void setPo_error_desc(String po_error_desc) {
		this.po_error_desc = po_error_desc;
	}


		public String toString() {
        StringBuilder builder = new StringBuilder(300);

        builder.append("\n ============= GetSubsTransData =============");
        builder.append("\n Network Id ===>").append(pi_network_id);
        builder.append("\n trans ID ===>").append(getPo_trans_id());
        builder.append("\n ============= End of GetSubTransData =============");

        return builder.toString();
    }
}
