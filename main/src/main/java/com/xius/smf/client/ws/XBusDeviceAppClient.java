package com.xius.smf.client.ws;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.xml.rpc.ServiceException;


import org.apache.axis.AxisFault;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.xius.smf.domaindata.BulkLUJobData;
import com.xius.smf.domaindata.BulkSimSwapJobData;
import com.xius.smf.domaindata.BulkStateChangeJobData;
import com.xius.smf.domaindata.GetBulkChangeMsisdnDtlsCursorData;
import com.xius.smf.domaindata.PrepaidActivationRetryCursorData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.Utilities;
import com.xius.xbus.messages.common.AccountType;
import com.xius.xbus.messages.common.SecurityId;
import com.xius.xbus.messages.common.ServiceContext;
import com.xius.xbus.messages.common.UserType;
import com.xius.xbus.messages.provisioning.device.ChangeDeviceRequest;
import com.xius.xbus.messages.provisioning.device.ChangeDeviceResponse;
import com.xius.xbus.messages.provisioning.device.ChangeDeviceRestRequest;
import com.xius.xbus.messages.provisioning.device.ChangeDeviceRestResponse;
import com.xius.xbus.messages.provisioning.device.DeviceType;
import com.xius.xbus.messages.provisioning.device.FirstLUActivationRequest;
import com.xius.xbus.messages.provisioning.device.FirstLUActivationResponse;
import com.xius.xbus.messages.provisioning.device.InitiateChngSimSwapRequest;
import com.xius.xbus.messages.provisioning.device.InitiateChngSimSwapResponse;
import com.xius.xbus.messages.provisioning.device.MSISDNInfo;
import com.xius.xbus.messages.provisioning.device.PrepaidActivationRetryRequest;
import com.xius.xbus.messages.provisioning.device.PrepaidActivationRetryResponse;
import com.xius.xbus.messages.provisioning.device.SubcriberAddressInfo;
import com.xius.xbus.messages.provisioning.device.SubcriberPersonalInfo;
import com.xius.xbus.messages.provisioning.device.SubscriberStateChangeRequest;
import com.xius.xbus.messages.provisioning.device.SubscriberStateChangeResponse;
import com.xius.xbus.services.provisioning.device.DeviceServiceLocator;
import com.xius.xbus.services.provisioning.device.DeviceServicePortType;

public class XBusDeviceAppClient {

    private static final Logger logger = LogManager.getLogger(XBusDeviceAppClient.class);

	DeviceServicePortType portType = null;

	public XBusDeviceAppClient() throws MalformedURLException, ServiceException, InstantiationException {
		String xBusURL = InitiateAll.getSMFProps().getProperty("xbus.url.cxf.DeviceService");
		DeviceServiceLocator locator = new DeviceServiceLocator();
		portType = locator.getDeviceServicePort(new URL(xBusURL.trim()));

		if (null == portType) {
			throw new InstantiationException("Instance of DeviceServicePortType is null");
		}

	}

	public FirstLUActivationResponse doxBusFirstLU(String IMSI, BulkLUJobData data) {

		FirstLUActivationRequest request = new FirstLUActivationRequest();
		FirstLUActivationResponse response = null;
		if (logger.isDebugEnabled())
			logger.debug("IMSI-----" + IMSI);

		ServiceContext serviceContext = new ServiceContext();
		SecurityId securityId = new SecurityId();
		securityId.setUserAccountName("SMF-CORP");
		securityId.setUserAccountPassword("SMF-CORP");
		if (data.getPi_network_id() != null)
			serviceContext.setCarrierId(data.getPi_network_id().toString());
		else {
			if (logger.isDebugEnabled())
				logger.debug("CarrierId is Null");
		}

		request.setUserType(UserType.CORPUSER);
		request.setMessageID("1");
		if (data.getPi_nir_code() == null) {
			securityId.setUserAccountName("IVR");
			securityId.setUserAccountPassword("IVR");

			request.setMessageID(data.getPi_office_code());
			request.setUserType(UserType.IVR);

			request.setSim(data.getPi_iccid());

		}
		request.setSecurityId(securityId);
		request.setServiceContext(serviceContext);
		if (null != data.getChannel())
			request.setChannel(data.getChannel());

		request.setImsi(IMSI);

		request.setZipCode("123456");

		try {
			response = portType.firstLUActivation(request);
		} catch (AxisFault e) {
			logger.error(Utilities.getStackTrace(e));
		} catch (RemoteException e) {
			logger.error(Utilities.getStackTrace(e));
		}
		return response;
	}

	public InitiateChngSimSwapResponse doxBusInitiateChngSimSwap(String sim, BulkSimSwapJobData data)
			throws SMFAgentException {

		logger.info("XBusDeviceAppClient-doxBusInitiateChngSimSwap called");

		InitiateChngSimSwapRequest request = new InitiateChngSimSwapRequest();
		InitiateChngSimSwapResponse response = null;
		if (logger.isDebugEnabled())
			logger.debug("SIM-----" + sim);
		ServiceContext serviceContext = new ServiceContext();
		SecurityId securityId = new SecurityId();

		request.setDeviceType(DeviceType.SIM);
		securityId.setUserAccountName(data.getPi_login_id());
		securityId.setUserAccountPassword("SMF-JOB");
		if (data.getPi_network_id() != null)
			serviceContext.setCarrierId(data.getPi_network_id().toString());
		else {
			if (logger.isDebugEnabled())
				logger.debug("CarrierId is Null");
		}

		request.setUserType(UserType.CCUSER);
		request.setMessageID("1");
		request.setSecurityId(securityId);
		request.setServiceContext(serviceContext);
		if (null != data.getTrans_id()) {
			request.setExTransId(data.getTrans_id());
		}
		if (null != sim) {
			request.setOldsim(sim);
		}
		if (null != data.getPi_new_sim()) {
			request.setNewsim(data.getPi_new_sim());
		}
		if (null != data.getPi_old_msisdn()) {
			request.setOldMSISDN(data.getPi_old_msisdn());
		}
		try {
			response = portType.initiateChngSimSwap(request);
		} catch (AxisFault e) {
			logger.error("AxisFault " + Utilities.getStackTrace(e));
			throw new SMFAgentException(SMFAgentConstants.DEFAULT_ERROR_CODE, e.getLocalizedMessage());
		} catch (RemoteException e) {
			logger.error("RemoteException " + Utilities.getStackTrace(e));
			throw new SMFAgentException(SMFAgentConstants.DEFAULT_ERROR_CODE, e.getLocalizedMessage());
		} catch (Exception e) {
			logger.error("Exception " + Utilities.getStackTrace(e));
			throw new SMFAgentException(SMFAgentConstants.DEFAULT_ERROR_CODE, e.getLocalizedMessage());
		}
		logger.info("XBusDeviceAppClient-doxBusInitiateChngSimSwap call Ended");
		return response;
	}

	public SubscriberStateChangeResponse doxBusSubscriberStateChange(BulkStateChangeJobData data)
			throws SMFAgentException {

		logger.info("XBusDeviceAppClient-doxBusSubscriberStateChange called");

		SubscriberStateChangeRequest request = new SubscriberStateChangeRequest();
		SubscriberStateChangeResponse response = null;
		if (logger.isDebugEnabled())
			logger.debug("MSISDN-----" + data.getMSISDN());
		ServiceContext serviceContext = new ServiceContext();
		SecurityId securityId = new SecurityId();

		securityId.setUserAccountName(data.getPi_login_id());
		securityId.setUserAccountPassword("SMF-JOB");
		if (data.getPi_network_id() != null)
			serviceContext.setCarrierId(data.getPi_network_id().toString());
		else {
			if (logger.isDebugEnabled())
				logger.debug("CarrierId is Null");
		}
		request.setVersion("1.0");
		request.setUserType(UserType.CCUSER);
		request.setMessageID("1");
		request.setSecurityId(securityId);
		request.setServiceContext(serviceContext);

		if (null != data.getPi_network_id()) {
			request.setTransactionId(data.getTransactionId());
			;
		}
		if (null != data.getChannelId()) {
			request.setChannelId(data.getChannelId());
		}
		if (null != data.getMSISDN()) {
			request.setMSISDN(data.getMSISDN());
		}
		if (null != data.getNewStatus()) {
			request.setNewStatus(data.getNewStatus());
		}
		if (null != data.getReason()) {
			request.setReason(data.getReason());
		}
		if (null != data.getTransactionId()) {
			request.setTransactionId(data.getTransactionId());

		}

		try {
			response = portType.subscriberStateChange(request);
		} catch (AxisFault e) {
			logger.error("AxisFault " + Utilities.getStackTrace(e));
			throw new SMFAgentException(SMFAgentConstants.DEFAULT_ERROR_CODE, e.getLocalizedMessage());
		} catch (RemoteException e) {
			logger.error("RemoteException " + Utilities.getStackTrace(e));
			throw new SMFAgentException(SMFAgentConstants.DEFAULT_ERROR_CODE, e.getLocalizedMessage());
		} catch (Exception e) {
			logger.error("Exception " + Utilities.getStackTrace(e));
			throw new SMFAgentException(SMFAgentConstants.DEFAULT_ERROR_CODE, e.getLocalizedMessage());
		}
		logger.info("XBusDeviceAppClient-doxBusSubscriberStateChange call Ended");
		return response;
	}

	public ChangeDeviceResponse doxBusChangeMsisdn(GetBulkChangeMsisdnDtlsCursorData data) throws SMFAgentException {

		logger.info("XBusDeviceAppClient-doxBusChangeMsisdn called");

		ChangeDeviceRequest request = new ChangeDeviceRequest();
		ChangeDeviceResponse response = null;
		if (logger.isDebugEnabled())
			logger.debug("MSISDN-----" + data.getMsisdn());
		ServiceContext serviceContext = new ServiceContext();
		SecurityId securityId = new SecurityId();

		if (data.getUser_id() != null)
			securityId.setUserAccountName(data.getUser_id());

		securityId.setUserAccountPassword("SMF-JOB");
		if (data.getNetwork_id() != null)
			serviceContext.setCarrierId(data.getNetwork_id().toString());
		else {
			if (logger.isDebugEnabled())
				logger.debug("CarrierId is Null");
		}
		request.setVersion("1.0");
		request.setUserType(UserType.CCUSER);
		request.setMessageID("1");
		request.setSecurityId(securityId);
		request.setServiceContext(serviceContext);

		AccountType actype = new AccountType();
		if (data.getMsisdn() != null) {
			actype.setMsisdn(data.getMsisdn().toString());
		}
		if (data.getAccount_id() != null) {
			actype.setAccountId(data.getAccount_id());
		}
		request.setAccount(actype);

		if (data.getCharge() != null)
			request.setCharges(Long.parseLong(data.getCharge()));

		request.setDeviceType(DeviceType.MSISDN);

		if (data.getId_value() != null)
			request.setIdValue(data.getId_value());

		if (data.getNew_serial_no() != null)
			request.setNewSerialNo(data.getNew_serial_no());

		if (data.getProvcomp() != null)
			request.setProvComp(data.getProvcomp());

		if (data.getOld_value() != null)
			request.setOldValue(data.getOld_value());

		if (data.getNew_value() != null)
			request.setNewValue(data.getNew_value());

		if (data.getZip_code() != null)
			request.setZipCode(data.getZip_code());

		try {
			response = portType.changeDevice(request);
		} catch (AxisFault e) {
			logger.error("AxisFault " + Utilities.getStackTrace(e));
			throw new SMFAgentException(SMFAgentConstants.DEFAULT_ERROR_CODE, e.getLocalizedMessage());
		} catch (RemoteException e) {
			logger.error("RemoteException " + Utilities.getStackTrace(e));
			throw new SMFAgentException(SMFAgentConstants.DEFAULT_ERROR_CODE, e.getLocalizedMessage());
		} catch (Exception e) {
			logger.error("Exception " + Utilities.getStackTrace(e));
			throw new SMFAgentException(SMFAgentConstants.DEFAULT_ERROR_CODE, e.getLocalizedMessage());
		}
		logger.info("XBusDeviceAppClient-doxBusSubscriberStateChange call Ended");
		return response;
	}

	public ChangeDeviceRestResponse doxBusChangeDeviceRest(GetBulkChangeMsisdnDtlsCursorData data)
			throws SMFAgentException {

		logger.info("XBusDeviceAppClient-doxBusChangeDeviceRest called");

		ChangeDeviceRestRequest request = new ChangeDeviceRestRequest();
		ChangeDeviceRestResponse response = null;
		if (logger.isDebugEnabled())
			logger.debug("MSISDN-----" + data.getMsisdn());
		ServiceContext serviceContext = new ServiceContext();
		SecurityId securityId = new SecurityId();

		if (data.getUser_id() != null)
			securityId.setUserAccountName(data.getUser_id());

		securityId.setUserAccountPassword("SMF-JOB");
		if (data.getNetwork_id() != null)
			serviceContext.setCarrierId(data.getNetwork_id().toString());
		else {
			if (logger.isDebugEnabled())
				logger.debug("CarrierId is Null");
		}
		request.setVersion("1.0");
		// request.setUserType(UserType.CCUSER);

		String userTypeString = InitiateAll.getSMFProps().getProperty("MDN_USER_TYPE");
		try {
			if (userTypeString != null) {
				UserType userType = UserType.fromString(userTypeString);
				request.setUserType(userType);
			} else {
				logger.info("XBusDeviceAppClient - UserType :" + userTypeString
						+ " ,not founded in UserType Type so setting Default Value as CCUSER ");
				request.setUserType(UserType.CCUSER);
			}
		} catch (Exception e) {
			logger.info("XBusRetryChangeDeviceAppClient - UserType :" + userTypeString
					+ " ,not founded in UserType Type so setting Default Value as CCUSER ");
			request.setUserType(UserType.CCUSER);
		}

		request.setMessageID("1");
		request.setSecurityId(securityId);
		request.setServiceContext(serviceContext);

		AccountType actype = new AccountType();
		if (data.getMsisdn() != null) {
			actype.setMsisdn(data.getMsisdn().toString());
		}
		if (data.getAccount_id() != null) {
			actype.setAccountId(data.getAccount_id());
		}
		request.setAccount(actype);

		if (data.getCharge() != null)
			request.setCharges(Long.parseLong(data.getCharge()));

		request.setDeviceType(DeviceType.MSISDN);

		if (data.getId_value() != null)
			request.setIdValue(data.getId_value());

		if (data.getNew_serial_no() != null)
			request.setNewSerialNo(data.getNew_serial_no());

		if (data.getProvcomp() != null)
			request.setProvComp(data.getProvcomp());

		if (data.getOld_value() != null)
			request.setOldValue(data.getOld_value());

		if (data.getNew_value() != null)
			request.setNewValue(data.getNew_value());

		if (data.getZip_code() != null)
			request.setZipCode(data.getZip_code());

		try {
			response = portType.changeDeviceRest(request);
		} catch (AxisFault e) {
			logger.error("AxisFault " + Utilities.getStackTrace(e));
			throw new SMFAgentException(SMFAgentConstants.DEFAULT_ERROR_CODE, e.getLocalizedMessage());
		} catch (RemoteException e) {
			logger.error("RemoteException " + Utilities.getStackTrace(e));
			throw new SMFAgentException(SMFAgentConstants.DEFAULT_ERROR_CODE, e.getLocalizedMessage());
		} catch (Exception e) {
			logger.error("Exception " + Utilities.getStackTrace(e));
			throw new SMFAgentException(SMFAgentConstants.DEFAULT_ERROR_CODE, e.getLocalizedMessage());
		}
		logger.info("XBusDeviceAppClient-doxBusChangeDeviceRest call Ended");
		return response;
	}

	public ChangeDeviceRestResponse doxBusInitiateChngSimSwapRest(String sim, BulkSimSwapJobData data)
			throws SMFAgentException {

		logger.info("XBusDeviceAppClient-doxBusInitiateChngSimSwapRest called");

		ChangeDeviceRestRequest request = new ChangeDeviceRestRequest();
		ChangeDeviceRestResponse response = null;
		if (logger.isDebugEnabled())
			logger.debug("SIM-----" + sim);
		ServiceContext serviceContext = new ServiceContext();
		SecurityId securityId = new SecurityId();

		request.setDeviceType(DeviceType.SIM);

		securityId.setUserAccountName(data.getPi_login_id());
		securityId.setUserAccountPassword("SMF-JOB");
		if (data.getPi_network_id() != null)
			serviceContext.setCarrierId(data.getPi_network_id().toString());
		else {
			if (logger.isDebugEnabled())
				logger.debug("CarrierId is Null");
		}

		// request.setUserType(UserType.CCUSER);
		String userTypeString = InitiateAll.getSMFProps().getProperty("SIM_USER_TYPE");
		try {
			if (userTypeString != null) {
				UserType userType = UserType.fromString(userTypeString);
				request.setUserType(userType);
			} else {
				logger.info("XBusRetryChangeDeviceAppClient - UserType :" + userTypeString
						+ " ,not founded in UserType Type so setting Default Value as CCUSER ");
				request.setUserType(UserType.CCUSER);
			}
		} catch (Exception e) {
			logger.info("XBusRetryChangeDeviceAppClient - UserType :" + userTypeString
					+ " ,not founded in UserType Type so setting Default Value as CCUSER ");
			request.setUserType(UserType.CCUSER);
		}

		request.setMessageID("1");
		request.setSecurityId(securityId);
		request.setServiceContext(serviceContext);

		if (null != sim) {
			request.setOldValue(sim);
		}
		if (null != data.getPi_new_sim()) {
			request.setNewValue(data.getPi_new_sim());
		}
		if (null != data.getPi_old_msisdn()) {
			AccountType account = new AccountType();
			account.setMsisdn(data.getPi_old_msisdn());
			request.setAccount(account);
		}

		try {
			response = portType.changeDeviceRest(request);
		} catch (AxisFault e) {
			logger.error("AxisFault " + Utilities.getStackTrace(e));
			throw new SMFAgentException(SMFAgentConstants.DEFAULT_ERROR_CODE, e.getLocalizedMessage());
		} catch (RemoteException e) {
			logger.error("RemoteException " + Utilities.getStackTrace(e));
			throw new SMFAgentException(SMFAgentConstants.DEFAULT_ERROR_CODE, e.getLocalizedMessage());
		} catch (Exception e) {
			logger.error("Exception " + Utilities.getStackTrace(e));
			throw new SMFAgentException(SMFAgentConstants.DEFAULT_ERROR_CODE, e.getLocalizedMessage());
		}
		logger.info("XBusDeviceAppClient-doxBusInitiateChngSimSwapRest call Ended");
		return response;
	}

	public PrepaidActivationRetryResponse doxBusPrepaidActivation(ArrayList<PrepaidActivationRetryCursorData> datalist)
			throws SMFAgentException {
		PrepaidActivationRetryResponse response = null;
		PrepaidActivationRetryRequest request = new PrepaidActivationRetryRequest();

		logger.info("XBusDeviceAppClient-doxBusPrepaidActivation  call started");

		try {
			if (datalist != null && datalist.size() > 0) {
				PrepaidActivationRetryCursorData data = datalist.get(0);

				ServiceContext serviceContext = new ServiceContext();
				SecurityId securityId = new SecurityId();
				request.setVersion("1.0");
				request.setUserType(UserType.DEALER);
				request.setMessageID("1224");
				logger.info("XBusDeviceAppClient-doxBusPrepaidActivation: " + request.getMessageID());
				request.setSecurityId(securityId);
				request.setServiceContext(serviceContext);

				if (data.getUser_account_name() != null)
					securityId.setUserAccountName(data.getUser_account_name());

				if (data.getUser_account_password() != null)
					securityId.setUserAccountPassword(data.getUser_account_password());

				if (data.getNetwork_id() != null) {
					serviceContext.setCarrierId(data.getNetwork_id().toString());
				} else {
					if (logger.isDebugEnabled())
						logger.debug("CarrierId is Null");
				}

				if (data.getSna() != null) {
					request.setSNA(data.getSna());
				}
				SubcriberAddressInfo subcriberAddressInfo = new SubcriberAddressInfo();

				if (data.getAddress_1() != null) {
					subcriberAddressInfo.setAddress1(data.getAddress_1());
				}
				if (data.getAddress_2() != null) {
					subcriberAddressInfo.setAddress2(data.getAddress_2());
				}
				if (data.getAddress_3() != null) {
					subcriberAddressInfo.setAddress3(data.getAddress_3());
				}
				if (data.getCity() != null) {
					subcriberAddressInfo.setCity(data.getCity());
				}
				if (data.getCountry() != null) {
					subcriberAddressInfo.setCountry(data.getCountry());
				}
				if (data.getEmailid() != null) {
					subcriberAddressInfo.setEmailId(data.getEmailid());
				}
				if (data.getExttransid() != null) {
					subcriberAddressInfo.setExternalNumber(data.getExttransid());
				}

				if (data.getMunicipoality() != null) {
					subcriberAddressInfo.setMunicipality(data.getMunicipoality());
				}
				if (data.getPostalcode() != null) {
					subcriberAddressInfo.setPostalCode(data.getPostalcode());
				}
				if (data.getState() != null) {
					subcriberAddressInfo.setState(data.getState());
				}
				if (data.getStreet_limits() != null) {
					subcriberAddressInfo.setStreetLimits(data.getStreet_limits());
				}
				request.setAddressInfo(subcriberAddressInfo);

				if (data.getBillcycle_day() != null) {
					request.setBillDay(data.getBillcycle_day().toString());
				}

				if (data.getIscorp() != null && data.getIscorp().equalsIgnoreCase("Y")) {
					request.setIsCorp(true);
				} else if (data.getIscorp() != null && data.getIscorp().equalsIgnoreCase("N")) {
					request.setIsCorp(false);
				}

				if (data.getDealerid() != null) {
					request.setDealerUserId(data.getDealerid());
				}

				if (data.getLocationcode() != null) {
					request.setLocationCode(data.getLocationcode());
				}

				MSISDNInfo mSISDNInfo = new MSISDNInfo();

				if (data.getBlocked_msisdn() != null) {
					mSISDNInfo.setBlockedMSISDN(data.getBlocked_msisdn());
				}
				if (data.getSim() != null) {
					mSISDNInfo.setSimNumber(data.getSim());
				}
				request.setMsisdnInfo(mSISDNInfo);

				if (data.getNetwork_name() != null) {
					request.setNetworkName(data.getNetwork_name());
				}

				if (data.getOfficecode() != null) {
					request.setOfficeCode(data.getOfficecode());
				}

				if (data.getOrder_id() != null) {
					request.setOrderID(data.getOrder_id());
				}

				SubcriberPersonalInfo subcriberPersonalInfo = new SubcriberPersonalInfo();

				if (data.getDate_of_birth() != null) {
					String dateString = data.getDate_of_birth().toString();
					SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
					Date date;
					try {
						date = dateFormat.parse(dateString);
						Calendar calendar = Calendar.getInstance();
						calendar.setTime(date);
						subcriberPersonalInfo.setDateOfBirth(calendar);
					} catch (ParseException e) {
						e.printStackTrace();
					}

				}

				if (data.getFirst_name() != null) {
					subcriberPersonalInfo.setFirstName(data.getFirst_name());
				}
				if (data.getGender() != null) {
					subcriberPersonalInfo.setGender(data.getGender());
				}

				if (data.getId_no() != null) {
					subcriberPersonalInfo.setIdValue(data.getId_no());
				}
				if (data.getLast_name() != null) {
					subcriberPersonalInfo.setLastName(data.getLast_name());
				}

				if (data.getSur_name() != null) {
					subcriberPersonalInfo.setSurName(data.getSur_name());
				}
				if (data.getUserid() != null) {
					subcriberPersonalInfo.setUserId(data.getUserid());
				}

				if (data.getId_type() != null) {
					subcriberPersonalInfo.setPersonalIdType(data.getId_type());
				}
				request.setPersonalInfo(subcriberPersonalInfo);

				if (data.getTrafficpack_id() != null) {
					request.setTariffPackageId(data.getTrafficpack_id());
				}

				if (data.getInternal_trans_id() != null) {
					request.setTransactionID(data.getInternal_trans_id());
				}

				if (data.getFailednode() != null) {
					request.setFailedNode(data.getFailednode());
				}

				if (data.getUserinputfield3() != null) {
					request.setUserDefined1(data.getUserinputfield3());
				}

				if (data.getUserinputfield4() != null) {
					request.setUserDefined2(data.getUserinputfield4());
				}
				if (data.getUserinputfield5() != null) {
					request.setUserDefined3(data.getUserinputfield5());
				}
				if (data.getChannel() != null) {
					request.setInitiatedFrom(data.getChannel());
				}
				response = portType.prepaidActivationRetry(request);
			}

		} catch (AxisFault e) {
			logger.error("AxisFault " + Utilities.getStackTrace(e));
			throw new SMFAgentException(SMFAgentConstants.DEFAULT_ERROR_CODE, e.getLocalizedMessage());
		} catch (RemoteException e) {
			logger.error("RemoteException " + Utilities.getStackTrace(e));
			throw new SMFAgentException(SMFAgentConstants.DEFAULT_ERROR_CODE, e.getLocalizedMessage());
		} catch (Exception e) {
			logger.error("Exception " + Utilities.getStackTrace(e));
			throw new SMFAgentException(SMFAgentConstants.DEFAULT_ERROR_CODE, e.getLocalizedMessage());
		}
		logger.info("XBusDeviceAppClient-doxBusPrepaidActivation call Ended");
		return response;
	}

}
