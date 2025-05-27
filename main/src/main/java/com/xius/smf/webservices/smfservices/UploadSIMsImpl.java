package com.xius.smf.webservices.smfservices;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xius.agent.smf.smfmanagement.UploadSimsRequest;
import com.xius.agent.smf.smfmanagement.UploadSimsResponse;
import com.xius.smf.domaindata.MainLineSubLineValidationData;
import com.xius.smf.domaindata.UploadSIMsData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;


import net.bcgi.util.db.SPFactory;

@Service("UploadSIMsImpl")
public class UploadSIMsImpl {

	private  static final Logger logger = LogManager.getLogger(UploadSIMsImpl.class.getSimpleName());
	SPFactory spFactory = null;

	/**
	 * This method is used map webservice request object to domain (db) object
	 * 
	 * @param request       UploadSIMSRequest
	 * @param headerDetails HeaderDetails
	 * @return uploadSIMSData
	 * @throws ErrorDetailsType
	 */
	MainLineSubLineValidationData prepaidmainlinecheck = null;
	
	private UploadSIMsData setMOSRequest(UploadSimsRequest request, HeaderDetails headerDetails) {

		UploadSIMsData Data = new UploadSIMsData();
		List<String> simList = request.getSIM();
		if (null != request.getSIM()) {
			// Data.setPi_sim_no(request.getSIM());
			String[] simArray = simList.toArray(new String[simList.size()]);
			Data.setPi_sim_no(simArray);
		}

		List<Long> idTypeList = request.getIdType();
		if (null != request.getIdType()) {
			/*
			 * Long[] data = new Long[request.getIdType().length]; for (int i = 0; i <
			 * request.getIdType().length; i++) { data[i] =
			 * Long.valueOf(request.getIdType()[i]); }
			 */
			// Data.setPi_id_type(request.getIdType());
			long[] idTypeArray = idTypeList.stream().mapToLong(Long::longValue).toArray();
			Data.setPi_id_type(idTypeArray);
		}
		List<String> idList = request.getIdNo();
		if (null != request.getIdNo()) {
			// Data.setPi_id_no(request.getIdNo());
			String[] idArray = idList.toArray(new String[idList.size()]);
			Data.setPi_id_no(idArray);
		}
		Data.setPi_username(headerDetails.getLoginID().trim());
		List<String> genList = request.getGender();
		if (null != request.getGender()) {
			// Data.setPi_gender(request.getGender());
			String[] genArray = genList.toArray(new String[genList.size()]);
			Data.setPi_gender(genArray);
		}
		List<String> firList = request.getFirstName();
		if (null != request.getFirstName()) {
			// Data.setPi_first_name(request.getFirstName());
			String[] firArray = firList.toArray(new String[firList.size()]);
			Data.setPi_first_name(firArray);
		}
		List<String> lasList = request.getLastName();
		if (null != request.getLastName()) {
			// Data.setPi_last_name(request.getLastName());
			String[] lasArray = lasList.toArray(new String[lasList.size()]);
			Data.setPi_last_name(lasArray);
		}

		if (null != request.getSurName())
			Data.setPi_sur_name(request.getSurName().toArray(new String[request.getSurName().size()]));
		if (null != request.getDateofBirth())
			Data.setPi_date_of_birth(request.getDateofBirth().toArray(new String[request.getDateofBirth().size()]));
		if (null != request.getAccountType())
			Data.setPi_account_type(request.getAccountType().toArray(new String[request.getAccountType().size()]));
		List<BigDecimal> creditLimitList = request.getCreditLimit();
		if (null != request.getCreditLimit()) {
			// Data.setPi_credit_limit(request.getCreditLimit());
			BigDecimal[] creditLimitArray = creditLimitList.toArray(new BigDecimal[creditLimitList.size()]);
			Data.setPi_credit_limit(creditLimitArray);
		}
		List<Long> billcycledaylist = request.getBillcycleday();
		if (null != request.getBillcycleday()) {
			// Data.setPi_bill_cycleday(request.getBillcycleday());
			long[] billCycleDayArray = billcycledaylist.stream().mapToLong(Long::longValue).toArray();
			Data.setPi_bill_cycleday(billCycleDayArray);
		}
		if (null != request.getMunicipoality())
			Data.setPi_municipoality(
					request.getMunicipoality().toArray(new String[request.getMunicipoality().size()]));
		if (null != request.getStreetLimits())
			Data.setPi_street_limits(request.getStreetLimits().toArray(new String[request.getStreetLimits().size()]));
		if (null != request.getStreet())
			Data.setPi_street(request.getStreet().toArray(new String[request.getStreet().size()]));
		if (null != request.getColony())
			Data.setPi_colony(request.getColony().toArray(new String[request.getColony().size()]));
		if (null != request.getCountry())
			Data.setPi_country(request.getCountry().toArray(new String[request.getCountry().size()]));
		if (null != request.getState())
			Data.setPi_state(request.getState().toArray(new String[request.getState().size()]));
		if (null != request.getCity())
			Data.setPi_city(request.getCity().toArray(new String[request.getCity().size()]));
		if (null != request.getPostalCode())
			Data.setPi_postal_code(request.getPostalCode().toArray(new String[request.getPostalCode().size()]));
		if (null != request.getEmailID())
			Data.setPi_email(request.getEmailID().toArray(new String[request.getEmailID().size()]));
		List<Long> alternateContactNolist = request.getAlternateContactNo();
		if (null != request.getAlternateContactNo()) {
			// Data.setPi_alternate_contact_no(request.getAlternateContactNo());
			long[] alternateContactNoarray = alternateContactNolist.stream().mapToLong(Long::longValue).toArray();
			Data.setPi_alternate_contact_no(alternateContactNoarray);
		}
		if (null != request.getTrafficpack()) {
			Data.setPi_tariff_package(request.getTrafficpack().toArray(new String[request.getTrafficpack().size()]));
		}
		List<Long> trafficpackIdlist = request.getTrafficpackId();
		if (null != request.getTrafficpackId()) {
			// Data.setPi_tariff_package_id(request.getTrafficpackId());
			long[] trafficpackIdarray = trafficpackIdlist.stream().mapToLong(Long::longValue).toArray();
			Data.setPi_tariff_package_id(trafficpackIdarray);
		}

		if (null != headerDetails.getNetworkID())
			Data.setPi_network_id(headerDetails.getNetworkID());
		if (null != request.getUserInputField1())
			Data.setPi_user_input_field1(
					request.getUserInputField1().toArray(new String[request.getUserInputField1().size()]));
		if (null != request.getUserInputField2())
			Data.setPi_user_input_field2(
					request.getUserInputField2().toArray(new String[request.getUserInputField2().size()]));
		if (null != request.getUserInputField3())
			Data.setPi_user_input_field3(
					request.getUserInputField3().toArray(new String[request.getUserInputField3().size()]));
		if (null != request.getUserInputField4())
			Data.setPi_user_input_field4(
					request.getUserInputField4().toArray(new String[request.getUserInputField4().size()]));
		if (null != request.getUserInputField5())
			Data.setPi_user_input_field5(
					request.getUserInputField5().toArray(new String[request.getUserInputField5().size()]));
		if (null != request.getBillType())
			Data.setPi_bill_type(request.getBillType().toArray(new String[request.getBillType().size()]));
		if (null != request.getBillFrequency())
			Data.setPi_bill_frequency(
					request.getBillFrequency().toArray(new String[request.getBillFrequency().size()]));
		if (null != request.getInternalNumber())
			Data.setPi_internal_number(
					request.getInternalNumber().toArray(new String[request.getInternalNumber().size()]));
		if (null != request.getExternalNumber())
			Data.setPi_external_number(
					request.getExternalNumber().toArray(new String[request.getExternalNumber().size()]));
		if (null != request.getDealerId())
			Data.setPi_dealer_id(request.getDealerId().toArray(new String[request.getDealerId().size()]));
		List<Long> locationcodelist = request.getLocationcode();
		if (null != request.getLocationcode()) {
			// Data.setPi_location_code(request.getLocationcode());
			long[] locationcodelistarray = locationcodelist.stream().mapToLong(Long::longValue).toArray();
			Data.setPi_location_code(locationcodelistarray);
		}
		if (null != request.getPersonalInfoFlag())
			Data.setPi_personal_information_yn(
					request.getPersonalInfoFlag().toArray(new String[request.getPersonalInfoFlag().size()]));
		if (null != request.getOfficeCode())
			Data.setPi_office_code(request.getOfficeCode());
		if (request.getIsCorp() != null)
			Data.setPi_is_corp(request.getIsCorp());
		List<Long> snaList = request.getSNA();
		if (null != request.getSNA()) {
			// Data.setPi_sna(request.getSNA());
			long[] snaArray = snaList.stream().mapToLong(Long::longValue).toArray();
			Data.setPi_sna(snaArray);
		}
		return Data;
	}

	public UploadSimsResponse uploadSims(UploadSimsRequest request, HeaderDetails headerDetails)
			throws SMFAgentException {

		/**
		 * Populate domain object with the data from web service request
		 */
		UploadSimsResponse response = new UploadSimsResponse();

		String[] userInputField = null;

		if (request.getUserInputField4() != null) {
			//userInputField = request.getUserInputField4();
			 List<String> userInputList = request.getUserInputField4();
			 userInputField = userInputList.toArray(new String[userInputList.size()]);
		}
		System.out.println("userInputField>" + userInputField);

		if (userInputField != null && userInputField.length > 0 && userInputField[0] != null
				&& userInputField[0].startsWith("RESTAPI")) {

			prepaidmainlinecheck = new MainLineSubLineValidationData();

			prepaidmainlinecheck.setPi_network_id(headerDetails.getNetworkID());

			String[] sim = null;
			if(request.getSIM()!=null) {
				List<String> simList = request.getSIM();
				sim = simList.toArray(new String[simList.size()]);
			}
			String[] externalNumber = null;
			if(request.getExternalNumber()!=null) {
				List<String> externalNumberList = request.getExternalNumber();
				externalNumber = externalNumberList.toArray(new String[externalNumberList.size()]);
			}
			String[] trafficpackId = null;
			if(request.getTrafficpack()!=null) {
				List<String> trafficpackIdList = request.getTrafficpack();
				trafficpackId = trafficpackIdList.toArray(new String[trafficpackIdList.size()]);
			}
			String[] orderID = null;
			if(request.getUserInputField5()!=null) {
				List<String> orderIDList = request.getUserInputField5();
				orderID = orderIDList.toArray(new String[orderIDList.size()]);
			}

			if (sim != null && sim.length > 0) {
				String str1 = sim[0] + "#" + externalNumber[0] + "#" + trafficpackId[0];
				prepaidmainlinecheck.setPi_main_line(str1.replaceAll("null", ""));
			}

			if (orderID != null && orderID.length > 0) {
				if (orderID[0] != null && orderID[0].length() > 0) {
					String str1 = orderID[0];
					prepaidmainlinecheck.setPi_orderid(str1.replaceAll("null", ""));
				}
			}

//		String str1=request.getSIM()
//				+ "#"
//				+ request.getExternalNumber()
//				+ "#"
//				+ request.getTrafficpackId();

			prepaidmainlinecheck.setPi_account_type(28L);

			String[] idNoArray = null;
			if(request.getIdNo()!=null) {
				List<String> idNoArrayList = request.getIdNo();
				idNoArray = idNoArrayList.toArray(new String[idNoArrayList.size()]);
			}
			if (idNoArray != null && idNoArray.length > 0) {
				prepaidmainlinecheck.setPi_id_value(idNoArray[0]);
			}

			spFactory = ServiceUtils.executeSPWithOutCommit("pro_prepaid_main_line_check", prepaidmainlinecheck,
					prepaidmainlinecheck);
			if (prepaidmainlinecheck.getPo_main_desired_msisdn() != null) {
				String[] BlockedMSISDNArray = new String[1];
				BlockedMSISDNArray[0] = prepaidmainlinecheck.getPo_main_desired_msisdn();
				//request.setExternalNumber(BlockedMSISDNArray);
				request.getExternalNumber().addAll(Arrays.asList(BlockedMSISDNArray));
			}

			if (prepaidmainlinecheck.getPo_main_line_error_code() != 0) {
				String errormsg = "";
				logger.info("===========>>>>>>>>>>>>>>  BSSDB Validation Failed. ");
				if (prepaidmainlinecheck.getPo_main_line_error_code() == 45681) {
					errormsg = sim[0] + "#" + "Given sim is invalid";
					prepaidmainlinecheck.setPo_main_line_error_msg(errormsg);
				} else if (prepaidmainlinecheck.getPo_main_line_error_code() == 45682) {
					errormsg = trafficpackId[0] + "#" + "Given tp is invalid";
					prepaidmainlinecheck.setPo_main_line_error_msg(errormsg);
				} else if (prepaidmainlinecheck.getPo_main_line_error_code() == 45683) {
					errormsg = externalNumber[0] + "#" + "Given MSISDN is invalid";
					prepaidmainlinecheck.setPo_main_line_error_msg(errormsg);
				} else if (prepaidmainlinecheck.getPo_main_line_error_code() == 45684) {
					errormsg = externalNumber[0] + "#" + "Given MSISDN is invalid";
					prepaidmainlinecheck.setPo_main_line_error_msg(errormsg);
				}

				if (logger.isInfoEnabled()) {

					logger.info(
							"mainLine Error Code ==>" + prepaidmainlinecheck.getPo_main_line_error_code());
					logger.info(
							"mainLine Error Msg ==>" + prepaidmainlinecheck.getPo_main_line_error_msg());
				}

				throw Utilities.setSMFAgentException(prepaidmainlinecheck.getPo_main_line_error_code().toString(),prepaidmainlinecheck.getPo_main_line_error_msg());
			}
		}

		UploadSIMsData domainData = setMOSRequest(request, headerDetails);
		if (logger.isDebugEnabled()) {

			logger.info( domainData.toString());
		}

		spFactory = ServiceUtils.executeSPWithOutCommit("sim_upload_data", domainData, domainData);

		if (logger.isInfoEnabled()) {

			logger.info("Error Code ==>" + domainData.getPo_error_code());
			logger.info( "Error Msg ==>" + domainData.getPo_error_desc());
		}

		Utilities.commitOrRollback(spFactory, domainData.getPo_error_code());

		if (null != domainData.getPo_error_code() && domainData.getPo_error_code() != 0) {
			logger.info( "===========>>>>>>>>>>>>>>  SMFDB Insert Failed. ");

			throw Utilities.setSMFAgentException(domainData.getPo_error_code().toString(),domainData.getPo_error_desc());

		} else {

			/**
			 * Set response
			 */
			response = setWebserviceResponse(domainData, request);

		}
		return response;
	}

	private UploadSimsResponse setWebserviceResponse(UploadSIMsData domainData, UploadSimsRequest request) {

		UploadSimsResponse response = new UploadSimsResponse();

		if (null != domainData.getPo_trans_no()) {

			response.setTransactionNumber(domainData.getPo_trans_no());
		}
		if (logger.isDebugEnabled()) {

			StringBuilder builder = new StringBuilder();
			builder.append(": TransNumber ==>").append(response.getTransactionNumber());
			logger.debug( builder.toString());
		}

		return response;
	}
}
