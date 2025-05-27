package com.xius.smf.webservices.smfservices;


import net.bcgi.si.messages.mvnoapi.common.ErrorData;
import net.bcgi.si.messages.mvnoapi.common.GenderType;
import net.bcgi.si.messages.mvnoapi.common.PersonalIdentityType;
import net.bcgi.si.messages.mvnoapi.common.SecurityId;
import net.bcgi.si.messages.mvnoapi.common.ServiceContext;
import net.bcgi.si.messages.mvnoapi.provisioning.PrepaidActivationResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.xius.billing.AccountManagement_xsd.GetDtlsForRegistrationRequest;
import com.xius.billing.AccountManagement_xsd.GetDtlsForRegistrationResponse;
import com.xius.smf.client.invoker.GetDtlsForRegistrationInvoker;
import com.xius.smf.client.invoker.PrepaidRegistrationInvoker;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.Utilities;
import com.xius.xbus.messages.common.StatusCode;

public class MSISDNRegistrationImpl {
	private  static final Logger logger = LogManager.getLogger(MSISDNRegistrationImpl.class.getSimpleName());


	public PrepaidActivationResponse msisdnRegistration(Long msisdn,
			String networkName, String tpId, HeaderDetails details) throws SMFAgentException {

		net.bcgi.si.messages.mvnoapi.provisioning.PrepaidActivationRequest xbusreqprepaidReg = null;
		net.bcgi.si.messages.mvnoapi.provisioning.PrepaidActivationResponse xbusrespprepaidReg = null;

		GetDtlsForRegistrationRequest ibaRequest = null;
		GetDtlsForRegistrationResponse ibaResponse = null;

		try {

			GetDtlsForRegistrationInvoker ibaInvoker = new GetDtlsForRegistrationInvoker();
			ibaRequest = new GetDtlsForRegistrationRequest();
			ibaRequest.setMSISDN(String.valueOf(msisdn));
			if(tpId!=null && tpId.length()>0){
				ibaRequest.setTpID(tpId);
			}
			if (logger.isDebugEnabled()) {
				logger.debug("MSISDNRegistrationImpl GetDtlsForRegistrationRequest-MSIDN :"+msisdn);
				logger.debug("MSISDNRegistrationImpl GetDtlsForRegistrationRequest-tpID :"+tpId);
			}
			ibaResponse = ibaInvoker
					.getDtlsForRegistration(details, ibaRequest);
			if (ibaResponse != null && ibaResponse.getICCID() != null) {
				if (logger.isDebugEnabled()) {
					logger
							.debug("MSISDNRegistration GetDtlsForRegistrationInvoker-ICCID "
									+ ibaResponse.getICCID());
				}
				if (logger.isDebugEnabled()) {
					logger
							.debug("MSISDNRegistration GetDtlsForRegistrationInvoker-AccountType "
									+ ibaResponse.getAccountType());
				}
				if (ibaResponse.getAccountType().equals(Long.valueOf("28"))) {
					PrepaidRegistrationInvoker prepaidRegistrationInvoker = new PrepaidRegistrationInvoker();
					xbusreqprepaidReg = new net.bcgi.si.messages.mvnoapi.provisioning.PrepaidActivationRequest();
					net.bcgi.si.messages.mvnoapi.provisioning.SubcriberPersonalInfo xbuspersonalinfo = new net.bcgi.si.messages.mvnoapi.provisioning.SubcriberPersonalInfo();
					net.bcgi.si.messages.mvnoapi.provisioning.SubcriberAddressInfo xbusaddressinfo = new net.bcgi.si.messages.mvnoapi.provisioning.SubcriberAddressInfo();
					net.bcgi.si.messages.mvnoapi.provisioning.MSISDNInfo xbusMsisdnInfo = new net.bcgi.si.messages.mvnoapi.provisioning.MSISDNInfo();
					if (!Utilities.isNull(ibaResponse.getICCID())) {
						xbuspersonalinfo.setFirstName(ibaResponse.getICCID());
						xbuspersonalinfo.setLastName(ibaResponse.getICCID());
						xbuspersonalinfo.setGender(GenderType.MALE);
						xbuspersonalinfo.setIdValue(ibaResponse.getICCID());
						xbuspersonalinfo.setUserId(ibaResponse.getICCID());
						xbuspersonalinfo
								.setIdType(PersonalIdentityType.PASSPORT_NO);
						xbuspersonalinfo.setPersonalIdType("2");
						xbusreqprepaidReg.setPersonalInfo(xbuspersonalinfo);
						xbusreqprepaidReg.setAddressInfo(xbusaddressinfo);
						xbusMsisdnInfo.setSimNumber(ibaResponse.getICCID());
						xbusreqprepaidReg.setMsisdnInfo(xbusMsisdnInfo);
						if(tpId!=null && tpId.length()>0){
						xbusreqprepaidReg.setTariffPackageId(tpId);
						}
						xbusreqprepaidReg
								.setUserType(net.bcgi.si.messages.mvnoapi.common.UserType.DEALER);
						xbusreqprepaidReg
								.setInitiatedFrom(net.bcgi.si.messages.mvnoapi.common.UserType._DEALER
										+ "/" + details.getLoginID());

					} else {
						throw Utilities
								.setSMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,"ICCID is Null");
					}

					if (null != details.getLoginID()
							&& details.getLoginID().length() > 0) {
						SecurityId securityId = new SecurityId();
						securityId.setUserAccountName(details.getLoginID());
						securityId.setUserAccountPassword(new String(details
								.getPassword()));
						xbusreqprepaidReg.setSecurityId(securityId);
					}
					ServiceContext serviceContext = new ServiceContext();
					if (null != (details.getNetworkID()))
						serviceContext.setCarrierId(details.getNetworkID()
								.toString());

					xbusreqprepaidReg.setServiceContext(serviceContext);

					xbusreqprepaidReg.setMessageID(details.getRequestID());
					xbusreqprepaidReg.setNetworkName(networkName);
					xbusrespprepaidReg = prepaidRegistrationInvoker
							.prepaidRegistration(details, xbusreqprepaidReg);

					if (null != xbusrespprepaidReg) {
						if (xbusrespprepaidReg.getErrors() != null
								&& !xbusrespprepaidReg.getStatusCode().equals(
										StatusCode.SUCCESS)) {
							ErrorData[] Errors = xbusrespprepaidReg.getErrors();
							throw new SMFAgentException(Errors[0].getErrorCode(), Errors[0].getErrorMessage());
						}
					} else {
						if (logger.isDebugEnabled()) {
							logger
									.debug("MSISDNRegistration - GetDtlsForRegistrationInvoker Response of ICCID is Not Prepaid SIM,AccountType is "
											+ ibaResponse.getAccountType());
						}
					}

				} else {
					if (logger.isDebugEnabled()) {
						logger
								.debug("MSISDNRegistration - GetDtlsForRegistrationInvoker Response as Null "
										+ ibaResponse.getICCID());
					}
				}
			}else{
				logger
				.debug("MSISDNRegistration - GetDtlsForRegistrationInvoker Response ICCID is Null");
			}
		} catch (SMFAgentException e) {
			throw new SMFAgentException(e.getErrorCode(), e.getErrorMessage());
		}
		return xbusrespprepaidReg;
	}
}
