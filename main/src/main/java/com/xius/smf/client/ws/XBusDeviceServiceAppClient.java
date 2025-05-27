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

import net.bcgi.si.messages.mvnoapi.common.GenderType;
import net.bcgi.si.messages.mvnoapi.common.PersonalIdentityType;
import net.bcgi.si.messages.mvnoapi.device.PrepaidActivationRetryRequest;
import net.bcgi.si.messages.mvnoapi.device.PrepaidActivationRetryResponse;

import net.bcgi.si.messages.mvnoapi.provisioning.MSISDNInfo;
import net.bcgi.si.messages.mvnoapi.provisioning.SubcriberAddressInfo;
import net.bcgi.si.messages.mvnoapi.provisioning.SubcriberPersonalInfo;

import org.apache.axis.AxisFault;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import soap_binding.servicemix.IDeviceAppLocator;
import soap_binding.servicemix.IDeviceAppPortType;

import com.xius.smf.domaindata.PrepaidActivationRetryCursorData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.Utilities;

public class XBusDeviceServiceAppClient {

    private static final Logger logger = LogManager.getLogger(XBusDeviceServiceAppClient.class);

	IDeviceAppPortType PortType = null;

	public XBusDeviceServiceAppClient() throws MalformedURLException, ServiceException, InstantiationException {

		String xBusUrl = InitiateAll.getSMFProps().getProperty("xbus.url.cxf.Device");
		IDeviceAppLocator iDeviceAppLocator = new IDeviceAppLocator();
		PortType = iDeviceAppLocator.getDeviceApp(new URL(xBusUrl.trim()));

		if (null == PortType) {
			throw new InstantiationException("Instance of IDeviceAppPortType is null");
		}
	}

	public PrepaidActivationRetryResponse doxBusPrepaidActivation(ArrayList<PrepaidActivationRetryCursorData> datalist)
			throws SMFAgentException {
		PrepaidActivationRetryResponse response = null;
		PrepaidActivationRetryRequest request = new PrepaidActivationRetryRequest();
		logger.info("XBusDeviceAppClient-doxBusPrepaidActivation  call started---------------------");

		try {
			if (datalist != null && datalist.size() > 0) {
				PrepaidActivationRetryCursorData data = datalist.get(0);

				net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext = new net.bcgi.si.messages.mvnoapi.common.ServiceContext();
				net.bcgi.si.messages.mvnoapi.common.SecurityId securityId = new net.bcgi.si.messages.mvnoapi.common.SecurityId();
				request.setVersion("1.0");
				request.setMessageID("1");

				if (data.getUser_account_name() != null)
					securityId.setUserAccountName(data.getUser_account_name());
				if (data.getUser_account_password() != null)
					securityId.setUserAccountPassword(data.getUser_account_password());

				if (data.getUserType() != null) {
					request.setUserType(data.getUserType());
				}

				if (data.getUser_account_name() != null)
					request.setUserAccountName(data.getUser_account_name());

				if (data.getUser_account_password() != null)
					request.setUserAccountPassword(data.getUser_account_password());

				request.setSecurityId(securityId);

				if (data.getNetwork_id() != null) {
					serviceContext.setCarrierId(data.getNetwork_id().toString());
					request.setServiceContext(serviceContext);

				} else {
					if (logger.isDebugEnabled())
						logger.debug("CarrierId is Null");
				}

				if (data.getSub_transaction_id() != null) {
					request.setSubtransactionid(data.getSub_transaction_id());
				}

				if (data.getInternal_trans_id() != null) {
					request.setTransactionID(data.getInternal_trans_id());
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
					if (data.getGender().equalsIgnoreCase("MALE")) {
						subcriberPersonalInfo.setGender(GenderType.MALE);
					} else if (data.getGender().equalsIgnoreCase("FEMALE")) {
						subcriberPersonalInfo.setGender(GenderType.FEMALE);
					}

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

				if (data.getId_type() != null) {

					if (data.getId_type() != null && data.getId_type().equalsIgnoreCase("1")) {
						subcriberPersonalInfo.setIdType(PersonalIdentityType.MYKAD_ID);
					} else if (data.getId_type() != null && data.getId_type().equalsIgnoreCase("2")) {
						subcriberPersonalInfo.setIdType(PersonalIdentityType.PASSPORT_NO);
					}

				}

				request.setPersonalInfo(subcriberPersonalInfo);

				if (data.getTrafficpack_id() != null) {
					request.setTariffPackageId(data.getTrafficpack_id());
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
				if (data.getEventFlag() != null) {
					request.setEventFlag(data.getEventFlag());
				}

				if (data.getNetwork_name() != null) {
					request.setNetworkName(data.getNetwork_name());
				}

				if (data.getPromoCode() != null) {
					request.setPromoCode(data.getPromoCode());
				}

				if (data.getATPId() != null) {
					request.setATPId(data.getATPId());
				}

				if (data.getInitiated_from() != null) {
					request.setInitiatedFrom(data.getInitiated_from());
				}

				if (data.getIscorp() != null) {
					request.setIsCorp(data.getIscorp());
				}

				logger.info("XBusDeviceAppClient-doxBusPrepaidActivation iscorp :---------------------"
						+ request.getIsCorp());

				if (data.getAccount_mdn() != null) {
					request.setAccountMdn(data.getAccount_mdn());
				}
				if (data.getNew_password() != null) {
					request.setNewPassword(data.getNew_password());
				}

				if (data.getRegistration_required() != null) {
					request.setRegistrationRequired(Boolean.parseBoolean(data.getRegistration_required()));
				}
				if (data.getIcc_no() != null) {
					request.setIccNo(data.getIcc_no());
				}

				if (data.getId_type() != null) {

					if (data.getId_type() != null && data.getId_type().equalsIgnoreCase("1")) {
						subcriberPersonalInfo.setIdType(PersonalIdentityType.MYKAD_ID);
					} else if (data.getId_type() != null && data.getId_type().equalsIgnoreCase("2")) {
						subcriberPersonalInfo.setIdType(PersonalIdentityType.PASSPORT_NO);
					}

				}

				if (data.getAccount_status() != null) {
					request.setAccountStatus(data.getAccount_status());
				}
				if (data.getSc_iccno() != null) {
					request.setScIccno(data.getSc_iccno());
				}
				if (data.getGolden_icc_no() != null) {
					request.setGoldenIccno(data.getGolden_icc_no());
				}
				if (data.getNormal_order_id() != null) {
					request.setNormalOrderId(data.getNormal_order_id());
				}

				if (data.getSub_account_status() != null) {
					request.setSubAccountStatus(data.getSub_account_status());
				}

				if (data.getHlr_fr_connection() != null) {
					request.setHlrfrConnection(data.getHlr_fr_connection());
				}

				/*
				 * if(data.getHlrfr_connection_on()!=null) {
				 * request.setHlrfrConnectionOn(data.getHlrfr_connection_on()); }
				 */
				if (data.getOrder_list() != null) {
					request.setOrderList(data.getOrder_list());
				}
				if (data.getMsisdn_list_long() != null) {
					request.setMsisdnlistlong(data.getMsisdn_list_long());
				}
				if (data.getUtil_list() != null) {
					request.setUtilList(data.getUtil_list());
				}
				if (data.getCharges() != null) {
					request.setCharges(data.getCharges());
				}
				if (data.getMsisdn_list() != null) {
					request.setMsisdnlist(data.getMsisdn_list());
				}
				if (data.getDevice_id_key() != null) {
					request.setDeviceIdKey(data.getDevice_id_key());
				}
				if (data.getNew_value() != null) {
					request.setNewValue(data.getNew_value());
				}
				if (data.getAuthenticate_carrierid() != null) {
					request.setAuthenticateCarrierid(data.getAuthenticate_carrierid());
				}

				if (data.getDt_failure_error_code() != null) {
					request.setDtFailureErrorCode(data.getDt_failure_error_code());
				}
				if (data.getDenominations() != null) {
					request.setDenominations(data.getDenominations());
				}
				if (data.getTax_id() != null) {
					request.setTaxId(data.getTax_id());
				}
				if (data.getBalance_amount() != null) {
					request.setBalanceAmount(data.getBalance_amount());
				}
				if (data.getOrder_date() != null) {
					request.setOrderDate(data.getOrder_date());
				}
				if (data.getNew_validity_date() != null) {
					request.setNewValidityDate(data.getNew_validity_date());
				}
				if (data.getPort_req_form_id() != null) {
					request.setPortReqFormId(data.getPort_req_form_id());
				}
				if (data.getPort_id() != null) {
					request.setPortId(data.getPort_id());
				}
				if (data.getRejected_data() != null) {
					request.setRejectedData(data.getRejected_data());
				}
				if (data.getNpr_subm_time() != null) {
					request.setNprSubmTime(data.getNpr_subm_time());
				}
				if (data.getThreshold_time() != null) {
					request.setThresholdTime(data.getThreshold_time());
				}
				if (data.getComp_email_id() != null) {
					request.setCompEmailId(data.getComp_email_id());
				}
				if (data.getNotification_data_email() != null) {
					request.setNotificationDataEmail(data.getNotification_data_email());
				}
				if (data.getMdn() != null) {
					request.setMdn(data.getMdn());
				}
				if (data.getNew_mdn() != null) {
					request.setNewMdn(data.getNew_mdn());
				}
				if (data.getFr_trn_no() != null) {
					request.setFrTrnNo(data.getFr_trn_no());
				}
				if (data.getNew_cc_msisdn() != null) {
					request.setNewCCmsisdn(data.getNew_cc_msisdn());
				}
				if (data.getOld_cc_msisdn() != null) {
					request.setOldCCmsisdn(data.getOld_cc_msisdn());
				}
				if (data.getOld_imsi() != null) {
					request.setOldIMSI(data.getOld_imsi());
				}
				if (data.getService_type() != null) {
					request.setServiceType(data.getService_type());
				}
				if (data.getImsi_sim_registration() != null) {
					request.setImsiSimRegistration(data.getImsi_sim_registration());
				}
				if (data.getOld_imsi_sim_registration() != null) {
					request.setOldImsiSimRegistration(data.getOld_imsi_sim_registration());
				}
				if (data.getActual_msisdn() != null) {
					request.setActualMsisdn(data.getActual_msisdn());
				}

				if (data.getAccount_id() != null) {
					request.setAccountId(data.getAccount_id());
				}
				if (data.getBlocked_msisdn() != null) {
					request.setBlockedMsisdn(data.getBlocked_msisdn());
				}
				if (data.getCredit_limit() != null) {
					request.setCreditLimti(data.getCredit_limit());
				}
				if (data.getOld_cc_mdn_list() != null) {
					request.setOldCCMMdnList(data.getOld_cc_mdn_list());
				}
				if (data.getNew_cc_mdn_list() != null) {
					request.setNewCCMMdnList(data.getNew_cc_mdn_list());
				}
				/*
				 * if(data.getPromo_code()!=null) { request.setPromoCode(data.getPromo_code());
				 * }
				 */

				if (data.getUssd_mdn() != null) {
					request.setUssdMdn(data.getUssd_mdn());
				}
				if (data.getDealer_user_id() != null) {
					request.setDealerUserId(data.getDealer_user_id());
				}

				if (data.getInput_icc_no() != null) {
					request.setInputIccNo(data.getInput_icc_no());
				}
				/*
				 * if(data.getLocation_code()!=null) {
				 * request.setLocationCode(data.getLocation_code()); }
				 */

				if (data.getWorkgroup_id() != null) {
					request.setWorkgroupId(data.getWorkgroup_id());
				}

				if (data.getImei() != null) {
					request.setImei(data.getImei());
				}
				if (data.getSale_type() != null) {
					request.setSaleType(data.getSale_type());
				}

				if (data.getPrice() != null) {
					request.setPrice(data.getPrice());
				}

				if (data.getSim_is_actual() != null) {
					request.setSimisactual(data.getSim_is_actual());
				}
				if (data.getSim_psuedo() != null) {
					request.setSimpsuedo(data.getSim_psuedo());
				}
				if (data.getInvalid_account_state() != null) {
					request.setInvalidaccountstate(data.getInvalid_account_state());
				}
				if (data.getReason() != null) {
					request.setReason(data.getReason());
				}
				if (data.getUpdate_product_status() != null) {
					request.setUpdateproductstatus(data.getUpdate_product_status());
				}
				if (data.getNo_kad_id_code() != null) {
					request.setNokadidcode(data.getNo_kad_id_code());
				}
				if (data.getGet_order_details() != null) {
					request.setGetorderdetails(data.getGet_order_details());
				}
				if (data.getError_code() != null) {
					request.setErrorcode(data.getError_code());
				}
				if (data.getInput_personal_data() != null) {
					request.setInputpersonaldata(data.getInput_personal_data());
				}
				if (data.getGet_account_details() != null) {
					request.setGetaccountdetails(data.getGet_account_details());
				}
				if (data.getRequest_type() != null) {
					request.setRequesttype(data.getRequest_type());
				}
				if (data.getUser_name() != null) {
					request.setUsername(data.getUser_name());
				}
				if (data.getMiddle_name() != null) {
					request.setMiddlename(data.getMiddle_name());
				}
				if (data.getPost_paid() != null) {
					request.setPostpaid(data.getPost_paid());
				}
				if (data.getOld_mdn() != null) {
					request.setOldmdn(data.getOld_mdn());
				}
				if (data.getZipcode() != null) {
					request.setZipcode(data.getZipcode());
				}
				if (data.getOld_value() != null) {
					request.setOldvalue(data.getOld_value());
				}
				if (data.getNew_imsi() != null) {
					request.setNewimsi(data.getNew_imsi());
				}

				if (data.getIcc_id() != null) {
					request.setIccid(data.getIcc_id());
				}
				if (data.getAudit_old_sim() != null) {
					request.setAuditoldsim(data.getAudit_old_sim());
				}
				if (data.getImsi() != null) {
					request.setImsi(data.getImsi());
				}
				if (data.getMsisdn() != null) {
					request.setMsisdn(data.getMsisdn());
				}
				/*
				 * if (data.getOffice_code() != null) {
				 * request.setOfficeCode(data.getOffice_code()); }
				 */
				if (data.getAudit_old_msisdn() != null) {
					request.setAuditoldmsisdn(data.getAudit_old_msisdn());
				}
				if (data.getAudit_new_msisdn() != null) {
					request.setAuditnewmsisdn(data.getAudit_new_msisdn());
				}
				if (data.getAudit_imsi() != null) {
					request.setAuditimsi(data.getAudit_imsi());
				}
				if (data.getAudit_action() != null) {
					request.setAuditaction(data.getAudit_action());
				}
				if (data.getAudit_icc_id() != null) {
					request.setAuditiccid(data.getAudit_icc_id());
				}
				if (data.getData() != null) {
					request.setData(data.getData());
				}
				if (data.getAudit_new_sim() != null) {
					request.setAuditnewsim(data.getAudit_new_sim());
				}
				if (data.getAudit_msisdn() != null) {
					request.setAuditmsisdn(data.getAudit_msisdn());
				}
				if (data.getOld_msisdn() != null) {
					request.setOldmsisdn(data.getOld_msisdn());
				}
				if (data.getNew_msisdn() != null) {
					request.setNewmsisdn(data.getNew_msisdn());
				}
				if (data.getFailed_msisdns_list_old() != null) {
					request.setFailedmsisdnslistold(data.getFailed_msisdns_list_old());
				}
				if (data.getFailed_msisdns_list_new() != null) {
					request.setFailedmsisdnslistnew(data.getFailed_msisdns_list_new());
				}
				if (data.getIs_subscribed() != null) {
					request.setIssubscribed(data.getIs_subscribed());
				}
				if (data.getFlag_5g() != null) {
					request.setFlag5G(data.getFlag_5g());
				}
				if (data.getReturn_code() != null) {
					request.setReturncode(data.getReturn_code());
				}
				if (data.getResponse_code() != null) {
					request.setResponsecode(data.getResponse_code());
				}
				if (data.getNew_sim() != null) {
					request.setNewsim(data.getNew_sim());
				}
				if (data.getOld_sim() != null) {
					request.setOldsim(data.getOld_sim());
				}
				if (data.getExternal_trans_id_2() != null) {
					request.setExternaltransid2(data.getExternal_trans_id_2());
				}
				if (data.getLogin_id() != null) {
					request.setLoginid(data.getLogin_id());
				}
				if (data.getActive() != null) {
					request.setActive(data.getActive());
				}
				/*
				 * if (data.getUser_id() != null) { request.setUserid(data.getUser_id()); }
				 */
				if (data.getContent() != null) {
					request.setContent(data.getContent());
				}

				response = PortType.prepaidActivationRetry(request);

				if (response != null && (response.getErrors() != null && response.getErrors().length > 0)) {

					logger.info("XBusDeviceAppClient-doxBusPrepaidActivation Retry Sim :" + data.getSim()
							+ " :::got failed from  xbus:::---------------------"
							+ response.getErrors()[0].getErrorCode() + "#" + response.getErrors()[0].getErrorMessage());
				} else {
					logger.info("XBusDeviceAppClient-doxBusPrepaidActivation Retry Sim :" + data.getSim()
							+ " :::got failed from  xbus response is null:::---------------------");
				}
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
		return response;
	}

}
