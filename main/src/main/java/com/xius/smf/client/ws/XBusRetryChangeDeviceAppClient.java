package com.xius.smf.client.ws;


import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.ArrayList;

import javax.xml.rpc.ServiceException;


import org.apache.axis.AxisFault;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.xius.smf.domaindata.GetBulkChangeMsisdnDtlsCursorData;
import com.xius.smf.domaindata.GetBulkSimSwapDtlsCursorData;
import com.xius.smf.domaindata.GetMDNRetryCursorData;
import com.xius.smf.domaindata.GetMDNRetryData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
import com.xius.xbus.messages.common.AccountType;
import com.xius.xbus.messages.common.SecurityId;
import com.xius.xbus.messages.common.ServiceContext;
import com.xius.xbus.messages.common.UserType;
import com.xius.xbus.messages.provisioning.device.ChangeDeviceRetryRequest;
import com.xius.xbus.messages.provisioning.device.ChangeDeviceRetryResponse;
import com.xius.xbus.messages.provisioning.device.DeviceType;
import com.xius.xbus.services.provisioning.device.DeviceServiceLocator;
import com.xius.xbus.services.provisioning.device.DeviceServicePortType;

public class XBusRetryChangeDeviceAppClient {

    private static final Logger logger = LogManager.getLogger(XBusRetryChangeDeviceAppClient.class);

	DeviceServicePortType portType = null;

	public XBusRetryChangeDeviceAppClient() throws MalformedURLException,
			ServiceException, InstantiationException {

		String xBusUrl = InitiateAll.getSMFProps().getProperty(
				"xbus.url.cxf.DeviceService");
		logger.info("XBusRetryChangeDeviceAppClient-URL-:::::" + xBusUrl);

		DeviceServiceLocator locator = new DeviceServiceLocator();
		portType = locator.getDeviceServicePort(new URL(xBusUrl.trim()));

		if (null == portType) {
			throw new InstantiationException(
					"Instance of IDeviceAppPortType is null");
		}
	}

	public ChangeDeviceRetryResponse doxBusSimSwapRetry(
			GetBulkSimSwapDtlsCursorData data) throws SMFAgentException {

		logger.info("XBusRetryChangeDeviceAppClient-::::::::::::-doxBusSimSwapRetry called");

		GetMDNRetryData getMDNRetryData = new GetMDNRetryData();
		ArrayList<GetMDNRetryCursorData> cursorData = new ArrayList<GetMDNRetryCursorData>();

		ChangeDeviceRetryRequest request = new ChangeDeviceRetryRequest();
		ChangeDeviceRetryResponse response = null;

		ServiceContext serviceContext = new ServiceContext();
		SecurityId securityId = new SecurityId();

		request.setDeviceType(DeviceType.SIM);

		securityId.setUserAccountName(data.getUser_id());
		securityId.setUserAccountPassword("SMF-JOB");
		if (data.getNetwork_id() != null) {
			serviceContext.setCarrierId(data.getNetwork_id().toString());
			getMDNRetryData
					.setPi_network_id(Long.valueOf(data.getNetwork_id()));
		} else {
			if (logger.isDebugEnabled())
				logger.debug("CarrierId is Null");
		}

		if (getMDNRetryData.getPi_user_type() != null) {
			request.setChannel(getMDNRetryData.getPi_user_type());
			try {

				request.setUserType(UserType.fromString(getMDNRetryData
						.getPi_user_type()));
			} catch (Exception e) {
				logger.info("XBusRetryChangeDeviceAppClient - UserType :"
						+ getMDNRetryData
						.getPi_user_type()
						+ " ,not founded in UserType Type so setting Default Value as CCUSER ");

			}
		}

		request.setMessageID("1");
		request.setSecurityId(securityId);
		request.setServiceContext(serviceContext);
		
		
		
		if(null != data.getFailednode()){
			request.setFailedNode(data.getFailednode());
		}

		if (null != data.getNEW_SIM()) {
			request.setNewValue(data.getNEW_SIM());
		}
		if (null != data.getOLD_MSISDN()) {
			AccountType account = new AccountType();
			account.setMsisdn(data.getOLD_MSISDN());
			request.setAccount(account);
		}

		if (data.getTRANS_ID() != null) {
			request.setTransactionID(data.getTRANS_ID());
			
		}

		if (data.getSimSaleTransID() != null) {
			getMDNRetryData.setPi_retry_trans_id(data.getSimSaleTransID());
			request.setSimSaleTransID(data.getSimSaleTransID());
			
		}

		cursorData = fetchChangeMDNRetryFromDb(getMDNRetryData);

		if (cursorData != null)
			for (GetMDNRetryCursorData msdRetryCurdata : cursorData) {

				if (msdRetryCurdata.getActivity_type() != null)
					request.setActivityType(msdRetryCurdata.getActivity_type());

				if (msdRetryCurdata.getOld_msisdn() != null)
					request.setOldMsisdn(msdRetryCurdata.getOld_msisdn());

				if (msdRetryCurdata.getNew_msisdn() != null)
					request.setNewMsisdn(msdRetryCurdata.getNew_msisdn());

				if (msdRetryCurdata.getOld_imsi() != null)
					request.setOldIMSI(msdRetryCurdata.getOld_imsi());

				if (msdRetryCurdata.getNew_imsi() != null)
					request.setNewIMSI(msdRetryCurdata.getNew_imsi());

				if (msdRetryCurdata.getCurr_state_id() != null)
					request.setCurrStateId(msdRetryCurdata.getCurr_state_id());

				if (msdRetryCurdata.getStatus() != null)
					request.setStatus(msdRetryCurdata.getStatus());

				if (msdRetryCurdata.getRemarks() != null)
					request.setRemarks(msdRetryCurdata.getRemarks());

				if (msdRetryCurdata.getCustom_field1() != null)
					request.setCustomField1(msdRetryCurdata.getCustom_field1());

				if (msdRetryCurdata.getOld_account_id() != null)
					request.setOldAccountId(msdRetryCurdata.getOld_account_id());

				if (msdRetryCurdata.getNew_account_id() != null)
					request.setNewAccountId(msdRetryCurdata.getNew_account_id());

				if (msdRetryCurdata.getStatus_change_date() != null)
					request.setStatusChangeDate(msdRetryCurdata
							.getStatus_change_date());

				if (msdRetryCurdata.getOld_state() != null)
					request.setOldState(msdRetryCurdata.getOld_state());

				if (msdRetryCurdata.getNew_state() != null)
					request.setNewState(msdRetryCurdata.getNew_state());

				if (msdRetryCurdata.getTechnology() != null)
					request.setTechnology(msdRetryCurdata.getTechnology());

				if (msdRetryCurdata.getExt_trans_id2() != null)
					request.setExtTransId2(msdRetryCurdata.getExt_trans_id2());

				if (msdRetryCurdata.getChannel() != null)
					request.setChannel(msdRetryCurdata.getChannel());

				if (msdRetryCurdata.getCustom_field2() != null)
					request.setCustomField2(msdRetryCurdata.getCustom_field2());

				if (msdRetryCurdata.getCustom_field3() != null)
					request.setCustomField3(msdRetryCurdata.getCustom_field3());

				if (msdRetryCurdata.getCustom_field4() != null)
					request.setCustomField4(msdRetryCurdata.getCustom_field4());

				if (msdRetryCurdata.getCustom_field5() != null)
					request.setCustomField5(msdRetryCurdata.getCustom_field5());

				if (msdRetryCurdata.getCustom_field6() != null)
					request.setCustomField6(msdRetryCurdata.getCustom_field6());

				if (msdRetryCurdata.getUnsub_atp_yn() != null)
					request.setUnsubATP_YN(msdRetryCurdata.getUnsub_atp_yn());

				if (msdRetryCurdata.getNir() != null)
					request.setNir(msdRetryCurdata.getNir());

				if (msdRetryCurdata.getVolteTransID() != null)
					request.setVolteTransID(msdRetryCurdata.getVolteTransID());

				if (msdRetryCurdata.getVolteDeProvRespCode() != null)
					request.setVolteDeProvRespCode(msdRetryCurdata
							.getVolteDeProvRespCode());

				/*if (msdRetryCurdata.getSIMSaleTransID() != null)
					request.setSimSaleTransID(msdRetryCurdata
							.getSIMSaleTransID());*/

				if (msdRetryCurdata.getFlag_4G() != null)
					request.setFlag_4G(msdRetryCurdata.getFlag_4G());

				if (msdRetryCurdata.getFlag_5G() != null)
					request.setFlag_5G(msdRetryCurdata.getFlag_5G());

				if (msdRetryCurdata.getInsertSubsFlowTrackerTransID() != null)
					request.setInsertSubsFlowTrackerTransID(msdRetryCurdata
							.getInsertSubsFlowTrackerTransID());

				if (msdRetryCurdata.getInsertSubsFlowTrackGenTransID() != null)
					request.setInsertSubsFlowTrackGenTransID(msdRetryCurdata
							.getInsertSubsFlowTrackGenTransID());
				
				if (msdRetryCurdata.getNewccmsisdn() != null) {
					request.setNewCCMsisdn(String.valueOf(msdRetryCurdata.getNewccmsisdn()));
				}
				if (msdRetryCurdata.getOldccmsisdn() != null) {
					request.setOldCCMsisdn(String.valueOf(msdRetryCurdata.getOldccmsisdn()));
				}

			}

		try {
			response = portType.changeDeviceRetry(request);

			if ((response != null && (response.getErrors() != null && response
					.getErrors().length > 0))) {

				logger.info("XBusRetryChangeDeviceAppClient---doxBusRetryChangeDeviceRetry Retry transID :"
						+ data.getTRANS_ID()
						+ " :::got failed from  xbus:::---------------------"
						+ response.getErrors()[0].getErrorCode()
						+ "#"
						+ response.getErrors()[0].getErrorMessage());
			} else {
				logger.info("XBusRetryChangeDeviceAppClient---doxBusRetryChangeDeviceRetry Retry transID :"
						+ data.getTRANS_ID()
						+ " :::got failed from  xbus response is null:::---------------------");
			}

		} catch (AxisFault e) {
			logger.error("AxisFault " + Utilities.getStackTrace(e));
			throw new SMFAgentException(SMFAgentConstants.DEFAULT_ERROR_CODE,
					e.getLocalizedMessage());
		} catch (RemoteException e) {
			logger.error("RemoteException " + Utilities.getStackTrace(e));
			throw new SMFAgentException(SMFAgentConstants.DEFAULT_ERROR_CODE,
					e.getLocalizedMessage());
		} catch (Exception e) {
			logger.error("Exception " + Utilities.getStackTrace(e));
			throw new SMFAgentException(SMFAgentConstants.DEFAULT_ERROR_CODE,
					e.getLocalizedMessage());
		}
		logger.info("XBusRetryChangeDeviceAppClient-doxBusSimSwapRetry call Ended");
		return response;
	}

	public ChangeDeviceRetryResponse doxBusChangeMSISDNRetry(
			GetBulkChangeMsisdnDtlsCursorData data) throws SMFAgentException {

		logger.info("XBusRetryChangeDeviceAppClient-::::::::::::::::::-doxBusChangeMSISDNRetry called");
		GetMDNRetryData getMDNRetryData = new GetMDNRetryData();
		ArrayList<GetMDNRetryCursorData> cursorData = new ArrayList<GetMDNRetryCursorData>();

		ChangeDeviceRetryRequest request = new ChangeDeviceRetryRequest();
		ChangeDeviceRetryResponse response = null;
		if (logger.isDebugEnabled())
			logger.debug("MSISDN-----" + data.getMsisdn());
		ServiceContext serviceContext = new ServiceContext();
		SecurityId securityId = new SecurityId();

		if (data.getUser_id() != null)
			securityId.setUserAccountName(data.getUser_id());

		securityId.setUserAccountPassword("SMF-JOB");
		if (data.getNetwork_id() != null) {
			serviceContext.setCarrierId(data.getNetwork_id().toString());
			getMDNRetryData.setPi_network_id(data.getNetwork_id());
		} else {
			if (logger.isDebugEnabled())
				logger.debug("CarrierId is Null");
		}
		request.setVersion("1.0");

		if (getMDNRetryData.getPi_user_type() != null) {
			request.setChannel(getMDNRetryData.getPi_user_type());
			try {

				request.setUserType(UserType.fromString(getMDNRetryData
						.getPi_user_type()));
			} catch (Exception e) {
				logger.info("XBusRetryChangeDeviceAppClient - UserType :"
						+ getMDNRetryData
						.getPi_user_type()
						+ " ,not founded in UserType Type so setting Default Value as CCUSER ");

			}
		}
		request.setMessageID("1");
		request.setSecurityId(securityId);
		request.setServiceContext(serviceContext);
		
		
		if(null != data.getFailed_node()){
			request.setFailedNode(data.getFailed_node());
		}

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

		if (data.getTransaction_id() != null) {
			request.setTransactionID(data.getTransaction_id());
		}
		
		
		if (data.getSimSaleTransID() != null) {
			getMDNRetryData.setPi_retry_trans_id(data.getSimSaleTransID());
			request.setSimSaleTransID(data.getSimSaleTransID());
			
		}

		cursorData = fetchChangeMDNRetryFromDb(getMDNRetryData);
		if (cursorData != null)
			for (GetMDNRetryCursorData msdRetryCurdata : cursorData) {

				if (msdRetryCurdata.getActivity_type() != null)
					request.setActivityType(msdRetryCurdata.getActivity_type());

				if (msdRetryCurdata.getOld_msisdn() != null)
					request.setOldMsisdn(msdRetryCurdata.getOld_msisdn());

				if (msdRetryCurdata.getNew_msisdn() != null)
					request.setNewMsisdn(msdRetryCurdata.getNew_msisdn());

				if (msdRetryCurdata.getOld_imsi() != null)
					request.setOldIMSI(msdRetryCurdata.getOld_imsi());

				if (msdRetryCurdata.getNew_imsi() != null)
					request.setNewIMSI(msdRetryCurdata.getNew_imsi());

				if (msdRetryCurdata.getCurr_state_id() != null)
					request.setCurrStateId(msdRetryCurdata.getCurr_state_id());

				if (msdRetryCurdata.getStatus() != null)
					request.setStatus(msdRetryCurdata.getStatus());

				if (msdRetryCurdata.getRemarks() != null)
					request.setRemarks(msdRetryCurdata.getRemarks());

				if (msdRetryCurdata.getCustom_field1() != null)
					request.setCustomField1(msdRetryCurdata.getCustom_field1());

				if (msdRetryCurdata.getOld_account_id() != null)
					request.setOldAccountId(msdRetryCurdata.getOld_account_id());

				if (msdRetryCurdata.getNew_account_id() != null)
					request.setNewAccountId(msdRetryCurdata.getNew_account_id());

				if (msdRetryCurdata.getStatus_change_date() != null)
					request.setStatusChangeDate(msdRetryCurdata
							.getStatus_change_date());

				if (msdRetryCurdata.getOld_state() != null)
					request.setOldState(msdRetryCurdata.getOld_state());

				if (msdRetryCurdata.getNew_state() != null)
					request.setNewState(msdRetryCurdata.getNew_state());

				if (msdRetryCurdata.getTechnology() != null)
					request.setTechnology(msdRetryCurdata.getTechnology());

				if (msdRetryCurdata.getExt_trans_id2() != null)
					request.setExtTransId2(msdRetryCurdata.getExt_trans_id2());

				if (msdRetryCurdata.getChannel() != null)
					request.setChannel(msdRetryCurdata.getChannel());

				if (msdRetryCurdata.getCustom_field2() != null)
					request.setCustomField2(msdRetryCurdata.getCustom_field2());

				if (msdRetryCurdata.getCustom_field3() != null)
					request.setCustomField3(msdRetryCurdata.getCustom_field3());

				if (msdRetryCurdata.getCustom_field4() != null)
					request.setCustomField4(msdRetryCurdata.getCustom_field4());

				if (msdRetryCurdata.getCustom_field5() != null)
					request.setCustomField5(msdRetryCurdata.getCustom_field5());

				if (msdRetryCurdata.getCustom_field6() != null)
					request.setCustomField6(msdRetryCurdata.getCustom_field6());

				if (msdRetryCurdata.getUnsub_atp_yn() != null)
					request.setUnsubATP_YN(msdRetryCurdata.getUnsub_atp_yn());

				if (msdRetryCurdata.getNir() != null)
					request.setNir(msdRetryCurdata.getNir());

				if (msdRetryCurdata.getVolteTransID() != null)
					request.setVolteTransID(msdRetryCurdata.getVolteTransID());

				if (msdRetryCurdata.getVolteDeProvRespCode() != null)
					request.setVolteDeProvRespCode(msdRetryCurdata
							.getVolteDeProvRespCode());

				/*if (msdRetryCurdata.getSIMSaleTransID() != null)
					request.setSimSaleTransID(msdRetryCurdata
							.getSIMSaleTransID());*/

				if (msdRetryCurdata.getFlag_4G() != null)
					request.setFlag_4G(msdRetryCurdata.getFlag_4G());

				if (msdRetryCurdata.getFlag_5G() != null)
					request.setFlag_5G(msdRetryCurdata.getFlag_5G());

				if (msdRetryCurdata.getInsertSubsFlowTrackerTransID() != null)
					request.setInsertSubsFlowTrackerTransID(msdRetryCurdata
							.getInsertSubsFlowTrackerTransID());

				if (msdRetryCurdata.getInsertSubsFlowTrackGenTransID() != null)
					request.setInsertSubsFlowTrackGenTransID(msdRetryCurdata
							.getInsertSubsFlowTrackGenTransID());

				if (msdRetryCurdata.getNewccmsisdn() != null) {
					request.setNewCCMsisdn(String.valueOf(msdRetryCurdata.getNewccmsisdn()));
				}
				if (msdRetryCurdata.getOldccmsisdn() != null) {
					request.setOldCCMsisdn(String.valueOf(msdRetryCurdata.getOldccmsisdn()));
				}

			}
		try {
			response = portType.changeDeviceRetry(request);

			if (response != null
					&& (response.getErrors() != null && response.getErrors().length > 0)) {

				logger.info("XBusRetryChangeDeviceAppClient---doxBusChangeMSISDNRetry  TransactionId :"
						+ data.getTransaction_id()
						+ " :::got failed from  xbus:::---------------------"
						+ response.getErrors()[0].getErrorCode()
						+ "#"
						+ response.getErrors()[0].getErrorMessage());
			} else {
				logger.info("XBusRetryChangeDeviceAppClient---doxBusChangeMSISDNRetry Retry TransactionId :"
						+ data.getTransaction_id()
						+ " :::got failed from  xbus response is null:::---------------------");
			}

		} catch (AxisFault e) {
			logger.error("AxisFault " + Utilities.getStackTrace(e));
			throw new SMFAgentException(SMFAgentConstants.DEFAULT_ERROR_CODE,
					e.getLocalizedMessage());
		} catch (RemoteException e) {
			logger.error("RemoteException " + Utilities.getStackTrace(e));
			throw new SMFAgentException(SMFAgentConstants.DEFAULT_ERROR_CODE,
					e.getLocalizedMessage());
		} catch (Exception e) {
			logger.error("Exception " + Utilities.getStackTrace(e));
			throw new SMFAgentException(SMFAgentConstants.DEFAULT_ERROR_CODE,
					e.getLocalizedMessage());
		}
		logger.info("XBusRetryChangeDeviceAppClient-doxBusChangeMSISDNRetry call Ended");
		return response;
	}

	private ArrayList<GetMDNRetryCursorData> fetchChangeMDNRetryFromDb(
			GetMDNRetryData data) throws SMFAgentException {

		ArrayList<GetMDNRetryCursorData> cursordate = null;
		logger.info("Data Sending to DB (pro_get_mdn_retry_trans_id):::::::: "
				+ data.toString());
		ServiceUtils._executeStoredProcedure("pro_get_mdn_retry_trans_id",
				data, data);
		logger.info("pro_get_mdn_retry_trans_id error code::::: "
				+ data.getPo_error_code());

		if (data.getPo_error_code() == 0) {
			cursordate = new ArrayList<GetMDNRetryCursorData>();
			cursordate = data.getPo_retry_trans_details();

		}

		return cursordate;
	}

}
