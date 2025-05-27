package com.xius.smf.webservices.smfservices;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xius.agent.smf.smfmanagement.SimRegTrackerInsertRequest;
import com.xius.agent.smf.smfmanagement.SimRegTrackerInsertResponse;
import com.xius.smf.domaindata.SIMRegTrackerData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;


import net.bcgi.util.db.SPFactory;

@Service("SimRegTrackerInsertImpl")
public class SimRegTrackerInsertImpl {

	private  static final Logger logger = LogManager.getLogger(SimRegTrackerInsertImpl.class.getSimpleName());

	SPFactory spFactory = null;

	public SimRegTrackerInsertResponse simRegTrackerInsert(
			SimRegTrackerInsertRequest request, HeaderDetails headerDetails)
			throws SMFAgentException {

		/**
		 * Populate domain object with the data from web service request
		 */
		SimRegTrackerInsertResponse response = new SimRegTrackerInsertResponse();
		SIMRegTrackerData domainData = setMOSRequest(request, headerDetails);
		if (logger.isDebugEnabled()) {

			logger.debug( domainData.toString());
		}

		spFactory = ServiceUtils.executeSPWithOutCommit(
				"pro_sim_reg_tracker_insert", domainData, domainData);

		if (logger.isInfoEnabled()) {

			logger.info( "Error Code ==>"
					+ domainData.getPo_error_code());
			logger.info( "Error Msg ==>"
					+ domainData.getPo_error_desc());
		}

		Utilities.commitOrRollback(spFactory, domainData.getPo_error_code());

		if (null != domainData.getPo_error_code()
				&& domainData.getPo_error_code() != 0) {

			throw new SMFAgentException(domainData.getPo_error_code().toString(),
					domainData.getPo_error_desc());

		} else {

			/**
			 * Set response
			 */
			response = setWebserviceResponse(domainData, request);

		}
		return response;
	}

	private SIMRegTrackerData setMOSRequest(SimRegTrackerInsertRequest request,
			HeaderDetails headerDetails) {

		SIMRegTrackerData data = new SIMRegTrackerData();
		
		data.setPi_network_id(headerDetails.getNetworkID());
		
		
		if (null != request.getDealerName()) {
			data.setPi_dealerName(request.getDealerName());
		}
		
		if (null != request.getTpName()) {
			data.setPi_tpName(request.getTpName());
		}
		
		if (null != request.getSIM()) {
			data.setPi_sim_no(request.getSIM());
		}

		if (null != request.getIdType()) {
			data.setPi_id_type(request.getIdType());
		}
		if (null != request.getIdNo()) {
			data.setPi_id_no(request.getIdNo());
		}
		data.setPi_username(headerDetails.getLoginID().trim());
		if (null != request.getGender()) {
			data.setPi_gender(request.getGender());
		}
		if (null != request.getFirstName())
			data.setPi_first_name(request.getFirstName());
		if (null != request.getLastName())
			data.setPi_last_name(request.getLastName());
		if (null != request.getSurName())
			data.setPi_sur_name(request.getSurName());
		if (null != request.getDateofBirth())
			data.setPi_date_of_birth(request.getDateofBirth());
		if (null != request.getAccountType())
			data.setPi_account_type(request.getAccountType());
		if (null != request.getCreditLimit())

			data.setPi_credit_limit(request.getCreditLimit());
		if (null != request.getBillcycleday())
			data.setPi_bill_cycleday(request.getBillcycleday());
		if (null != request.getMunicipoality())
			data.setPi_municipoality(request.getMunicipoality());
		if (null != request.getStreetLimits())
			data.setPi_street_limits(request.getStreetLimits());
		if (null != request.getStreet())
			data.setPi_street(request.getStreet());
		if (null != request.getColony())
			data.setPi_colony(request.getColony());
		if (null != request.getCountry())
			data.setPi_country(request.getCountry());
		if (null != request.getState())
			data.setPi_state(request.getState());
		if (null != request.getCity())
			data.setPi_city(request.getCity());
		if (null != request.getPostalCode())
			data.setPi_postal_code(request.getPostalCode());
		if (null != request.getEmailID())
			data.setPi_email(request.getEmailID());
		if (null != request.getAlternateContactNo())
			data.setPi_alternate_contact_no(request.getAlternateContactNo());
		if (null != request.getTrafficpackId())
			data.setPi_tariff_package_id(request.getTrafficpackId());
		if (null != headerDetails.getNetworkID())
			data.setPi_network_id(headerDetails.getNetworkID());
		if (null != request.getUserInputField1())
			data.setPi_user_input_field1(request.getUserInputField1());
		if (null != request.getUserInputField2())
			data.setPi_user_input_field2(request.getUserInputField2());
		if (null != request.getUserInputField3())
			data.setPi_user_input_field3(request.getUserInputField3());
		if (null != request.getUserInputField4())
			data.setPi_user_input_field4(request.getUserInputField4());
		if (null != request.getUserInputField5())
			data.setPi_user_input_field5(request.getUserInputField5());
		if (null != request.getBillType())
			data.setPi_bill_type(request.getBillType());
		if (null != request.getBillFrequency())
			data.setPi_bill_frequency(request.getBillFrequency());
		if (null != request.getExtTransID())
			data.setPi_external_number(request.getExtTransID());
		if (null != request.getDealerId())
			data.setPi_dealer_id(request.getDealerId());
		if (null != request.getLocationcode())
			data.setPi_location_code(request.getLocationcode());
		if (null != request.getPersonalInfoFlag())
			data.setPi_personal_information_yn(request.getPersonalInfoFlag());
		if (null != request.getOfficeCode())
			data.setPi_office_code(request.getOfficeCode());
		if (request.getIsCorp() != null)
			data.setPi_is_corp(request.getIsCorp());
		if (null != request.getSNA()) {
			data.setPi_sna(request.getSNA());
		}
		if (null != request.getOrderId()) {
			data.setPi_orderId(request.getOrderId());
		}
		if (null != request.getBlockMDN()) {
			data.setPi_block_mdn(request.getBlockMDN());
		}
		if (null != request.getAddress1()) {
			data.setPi_address1(request.getAddress1());
		}
		if (null != request.getAddress2()) {
			data.setPi_address2(request.getAddress2());
		}
		if (null != request.getAddress3()) {
			data.setPi_address3(request.getAddress3());
		}
		if (null != request.getChannel()) {
			data.setPi_channel_id(request.getChannel());
		}
		
		if (null != request.getParish()) {
			data.setPi_parish(request.getParish());
		}
		
		if (null != request.getUrbanization()) {
			data.setPi_urbanization(request.getUrbanization());
		}
		
		if(null!=request.getUserAccountName()){
			data.setPi_user_account_name(request.getUserAccountName());
		}
		if(null!=request.getUserAccountPassword()){
			data.setPi_user_account_password(request.getUserAccountPassword());
		}	
 if (null != request.getUserType()) {
      data.setPi_usertype(request.getUserType());
    }

    if (null != request.getNetworkName()) {
      data.setPi_network_name(request.getNetworkName());
    }

		
		return data;
	}

	private SimRegTrackerInsertResponse setWebserviceResponse(
			SIMRegTrackerData domainData, SimRegTrackerInsertRequest request) {

		SimRegTrackerInsertResponse response = new SimRegTrackerInsertResponse();

		if (null != domainData.getPo_trans_no()) {

			response.setTransRefNumber(domainData.getPo_trans_no());
		}
		if (logger.isDebugEnabled()) {

			StringBuilder builder = new StringBuilder();
			builder.append(": TransNumber ==>").append(
					response.getTransRefNumber());
			logger.debug( builder.toString());
		}

		return response;
	}
}
