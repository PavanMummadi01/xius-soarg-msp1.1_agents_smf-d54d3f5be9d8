package com.xius.smf.webservices.smfservices;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xius.agent.smf.smfmanagement.MSISDNInfo;
import com.xius.agent.smf.smfmanagement.PrepaidActivationinsertRequest;
import com.xius.agent.smf.smfmanagement.PrepaidActivationinsertResponse;
import com.xius.agent.smf.smfmanagement.SecurityId;
import com.xius.agent.smf.smfmanagement.ServiceContext;
import com.xius.agent.smf.smfmanagement.SubcriberAddressInfo;
import com.xius.agent.smf.smfmanagement.SubcriberPersonalInfo;
import com.xius.agent.smf.smfmanagement.SubscriberOtherInfo;
import com.xius.smf.domaindata.PrepaidActivationinsertdata;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;


import net.bcgi.util.db.SPFactory;

@Service("PrepaidActivationinsertimpl")
public class PrepaidActivationinsertimpl {

	private  static final Logger logger = LogManager.getLogger(PrepaidActivationinsertimpl.class.getSimpleName());

	public PrepaidActivationinsertResponse prepaidActivationinsert(PrepaidActivationinsertRequest request,
			HeaderDetails headerDetails) throws SMFAgentException {

		PrepaidActivationinsertResponse response = new PrepaidActivationinsertResponse();
		PrepaidActivationinsertdata domainData = new PrepaidActivationinsertdata();

		domainData = setRequestData(request, headerDetails);

		SPFactory factory = ServiceUtils.executeSPWithOutCommit("pro_pre_activation_ins_req", domainData, domainData);

		if (logger.isInfoEnabled()) {
			logger.info( domainData.toString());
		}
		Utilities.commitOrRollback(factory, domainData.getPo_error_code());
		if (logger.isInfoEnabled()) {

			logger.info(
					"Error Code from pro_pre_activation_ins_req  ==>" + domainData.getPo_error_code());
			logger.info( "Error Msg from pro_pre_activation_ins_req  ==>" + domainData.getPo_error_desc());
		}
		if (domainData.getPo_error_code() == 0) {
			response = setWebserviceResponse(domainData);
		}

		else {
			throw new SMFAgentException(domainData.getPo_error_code().toString(), domainData.getPo_error_desc());
		}

		return response;
	}

	private PrepaidActivationinsertResponse setWebserviceResponse(PrepaidActivationinsertdata domainData) {

		PrepaidActivationinsertResponse response = new PrepaidActivationinsertResponse();
		response.setTransID(domainData.getPo_trans_id());
		response.setRespCode(domainData.getPo_err_code());
		response.setRespDescription(domainData.getPo_err_desc());

		return response;
	}

	private PrepaidActivationinsertdata setRequestData(PrepaidActivationinsertRequest request,
			HeaderDetails headerDetails) {

		PrepaidActivationinsertdata data = new PrepaidActivationinsertdata();
		SubcriberAddressInfo addressInfo = request.getAddressInfo();
		MSISDNInfo msisdnInfo = request.getMsisdnInfo();
		SubscriberOtherInfo subscriberOtherInfo = request.getOtherInfo();
		SubcriberPersonalInfo subcriberPersonalInfo = request.getPersonalInfo();
		SecurityId securityId = request.getSecurityId();
		ServiceContext serviceContext = request.getServiceContext();

		String[] subAddressInfo = new String[14];
		String[] submsisdnInfo = new String[4];
		String[] subsubscriberOtherInfo = new String[5];
		String[] subsubcriberPersonalInfo = new String[15];
		String[] subsecurityId = new String[3];
		String[] subserviceContext = new String[3];

		if (addressInfo.getAddress1() != null) {
			subAddressInfo[0] = addressInfo.getAddress1();
		}
		if (addressInfo.getAddress2() != null) {
			subAddressInfo[1] = addressInfo.getAddress2();
		}
		if (addressInfo.getAddress3() != null) {
			subAddressInfo[2] = addressInfo.getAddress3();
		}
		if (addressInfo.getCity() != null) {
			subAddressInfo[3] = addressInfo.getCity();
		}
		if (addressInfo.getCountry() != null) {
			subAddressInfo[4] = addressInfo.getCountry();
		}
		if (addressInfo.getEmailId() != null) {
			subAddressInfo[5] = addressInfo.getEmailId();
		}
		if (addressInfo.getExternalNumber() != null) {
			subAddressInfo[6] = addressInfo.getExternalNumber();
		}
		if (addressInfo.getHomePhone() != null) {
			subAddressInfo[7] = addressInfo.getHomePhone();
		}
		if (addressInfo.getInternalNumber() != null) {
			subAddressInfo[8] = addressInfo.getInternalNumber();
		}
		if (addressInfo.getMunicipality() != null) {
			subAddressInfo[9] = addressInfo.getMunicipality();
		}
		if (addressInfo.getOfficePhone() != null) {
			subAddressInfo[10] = addressInfo.getOfficePhone();
		}
		if (addressInfo.getPostalCode() != null) {
			subAddressInfo[11] = addressInfo.getPostalCode();
		}
		if (addressInfo.getState() != null) {
			subAddressInfo[12] = addressInfo.getState();
		}
		if (addressInfo.getStreetLimits() != null) {
			subAddressInfo[13] = addressInfo.getStreetLimits();
		}
		data.setPi_sub_address_info(subAddressInfo);
		if (request.isIsCorp() != null) {
			data.setPi_iscorp(request.isIsCorp().toString());
		}
		if (request.getDealerUserId() != null) {
			data.setPi_dealeruserid(request.getDealerUserId());
		}
		if (request.getInitiatedFrom() != null) {
			data.setPi_initiatedfrom(request.getInitiatedFrom());
		}
		if (request.getLocationCode() != null) {
			data.setPi_locationcode(request.getLocationCode());
		}
		if (request.getMessageID() != null) {
			data.setPi_messageid(request.getMessageID());
		}
		if (msisdnInfo.getBlockedMSISDN() != null) {
			submsisdnInfo[0] = msisdnInfo.getBlockedMSISDN();
		}
		if (msisdnInfo.getImsi() != null) {
			submsisdnInfo[1] = msisdnInfo.getImsi();
		}
		if (msisdnInfo.getMsisdn() != null) {
			submsisdnInfo[2] = msisdnInfo.getMsisdn();
		}
		if (msisdnInfo.getSimNumber() != null) {
			submsisdnInfo[3] = msisdnInfo.getSimNumber();
		}
		data.setPi_msisdninfo(submsisdnInfo);
		if (request.getNetworkName() != null) {
			data.setPi_networkname(request.getNetworkName());
		}
		if (request.getOfficeCode() != null) {
			data.setPi_officecode(request.getOfficeCode());
		}
		if (request.getOrderID() != null) {
			data.setPi_orderid(request.getOrderID());
		}
		if (subscriberOtherInfo.getEthic() != null) {
			subsubscriberOtherInfo[0] = subscriberOtherInfo.getEthic();
		}
		if (subscriberOtherInfo.getOrderBooking() != null) {
			subsubscriberOtherInfo[1] = subscriberOtherInfo.getOrderBooking();
		}
		if (subscriberOtherInfo.getOrderInfo() != null) {
			subsubscriberOtherInfo[2] = subscriberOtherInfo.getOrderInfo();
		}
		if (subscriberOtherInfo.getPleaseSpecify() != null) {
			subsubscriberOtherInfo[3] = subscriberOtherInfo.getPleaseSpecify();
		}
		if (subscriberOtherInfo.getSourceofInfo() != null) {
			subsubscriberOtherInfo[4] = subscriberOtherInfo.getSourceofInfo();
		}
		data.setPi_otherinfo(subsubscriberOtherInfo);
		if (subcriberPersonalInfo.getAnnualIncome() != null) {
			subsubcriberPersonalInfo[0] = subcriberPersonalInfo.getAnnualIncome();
		}
		if (subcriberPersonalInfo.getDateOfBirth() != null) {
			subsubcriberPersonalInfo[1] = subcriberPersonalInfo.getDateOfBirth() + "";
		}
		if (subcriberPersonalInfo.getFirstName() != null) {
			subsubcriberPersonalInfo[2] = subcriberPersonalInfo.getFirstName();
		}
		if (subcriberPersonalInfo.getGender() != null) {
			subsubcriberPersonalInfo[3] = subcriberPersonalInfo.getGender().value();
		}
		if (subcriberPersonalInfo.getGmpc() != null) {
			subsubcriberPersonalInfo[4] = subcriberPersonalInfo.getGmpc();
		}
		if (subcriberPersonalInfo.getIdType() != null) {
			subsubcriberPersonalInfo[5] = subcriberPersonalInfo.getIdType().value();
		}
		if (subcriberPersonalInfo.getIdValue() != null) {
			subsubcriberPersonalInfo[6] = subcriberPersonalInfo.getIdValue();
		}
		if (subcriberPersonalInfo.getIndustry() != null) {
			subsubcriberPersonalInfo[7] = subcriberPersonalInfo.getIndustry();
		}
		if (subcriberPersonalInfo.getLastName() != null) {
			subsubcriberPersonalInfo[8] = subcriberPersonalInfo.getLastName();
		}
		if (subcriberPersonalInfo.getOccupation() != null) {
			subsubcriberPersonalInfo[9] = subcriberPersonalInfo.getOccupation();
		}
		if (subcriberPersonalInfo.getOldIC() != null) {
			subsubcriberPersonalInfo[10] = subcriberPersonalInfo.getOldIC();
		}
		if (subcriberPersonalInfo.getPersonalIdType() != null) {
			subsubcriberPersonalInfo[11] = subcriberPersonalInfo.getPersonalIdType();
		}
		if (subcriberPersonalInfo.getSurName() != null) {
			subsubcriberPersonalInfo[12] = subcriberPersonalInfo.getSurName();
		}
		if (subcriberPersonalInfo.getUserId() != null) {
			subsubcriberPersonalInfo[13] = subcriberPersonalInfo.getUserId();
		}
		if (subcriberPersonalInfo.getUserName() != null) {
			subsubcriberPersonalInfo[14] = subcriberPersonalInfo.getUserName();
		}
		data.setPi_personalinfo(subsubcriberPersonalInfo);

		if (request.getPromoCode() != null) {
			data.setPi_promocode(request.getPromoCode());
		}
		if (request.isRegistrationRequired() != null) {
			data.setPi_registrationrequired(request.isRegistrationRequired().toString());
		}
		if (request.getRegistrationType() != null) {
			data.setPi_registrationtype(request.getRegistrationType().value());
		}
		if (securityId.getSecurityToken() != null) {
			subsecurityId[0] = securityId.getSecurityToken();
		}
		if (securityId.getUserAccountName() != null) {
			subsecurityId[1] = securityId.getUserAccountName();
		}
		if (securityId.getUserAccountPassword() != null) {
			subsecurityId[2] = securityId.getUserAccountPassword();
		}
		data.setPi_securityid(subsecurityId);
		if (serviceContext.getCarrierId() != null) {
			subserviceContext[0] = serviceContext.getCarrierId();
		}
		if (serviceContext.getSessionId() != null) {
			subserviceContext[1] = serviceContext.getSessionId();
		}
		if (serviceContext.getTimestamp() != null) {
			subserviceContext[2] = serviceContext.getTimestamp() + "";
		}
		data.setPi_servicecontext(subserviceContext);
		if (request.getTariffPackageId() != null) {
			data.setPi_tariffpackageid(request.getTariffPackageId());
		}
		if (request.getSubscriberStatus() != null) {
			data.setPi_subscriberstatus(request.getSubscriberStatus().value());
		}
		if (request.getUserType() != null) {
			data.setPi_usertype(request.getUserType().value());
		}
		if (request.getVersion() != null) {
			data.setPi_version(request.getVersion());
		}
		if (request.getSNA() != null) {
			data.setPi_sna(request.getSNA());
		}
		if (request.getTransactionID() != null) {
			data.setPi_transactionid(request.getTransactionID());
		}

		return data;
	}
}
