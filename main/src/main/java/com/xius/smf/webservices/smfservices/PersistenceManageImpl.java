package com.xius.smf.webservices.smfservices;


import net.bcgi.util.db.SPFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xius.agent.smf.smfmanagement.PersistenceManageRequest;
import com.xius.agent.smf.smfmanagement.PersistenceManageResponse;
import com.xius.smf.domaindata.PersistenceManageData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
@Service("PersistenceManageImpl")
public class PersistenceManageImpl {

	private  static final Logger logger = LogManager.getLogger(PersistenceManageImpl.class.getSimpleName());

	HeaderDetails headerDetails = null;
	PersistenceManageData domainData =null;
	SPFactory spFactory=null;
	
	public PersistenceManageResponse persistenceManage(
			PersistenceManageRequest request, HeaderDetails headerDetails) 
					throws SMFAgentException {
		
		this.headerDetails = headerDetails;
		
		domainData = setDataPlanRequest(request, headerDetails);
		spFactory = ServiceUtils.executeSPWithOutCommit("pro_persistance_manage", domainData, domainData);
		
		if (logger.isInfoEnabled()) {
			logger.info( domainData.toString());
		}
		/**
		 * invoke Stored Procedure.
		 */
		Long errCode  = domainData.getPo_error_code();
		String errMsg  = domainData.getPo_error_desc();
		if (logger.isInfoEnabled()) {

			logger.info( "Error Code from pro_persistance_manage  ==>" + errCode);
			logger.info( "Error Msg from pro_persistance_manage  ==>" + errMsg);
		}
		Utilities.commitOrRollback(spFactory, errCode);

		if ( errCode != 0) {

			throw Utilities.setSMFAgentException( errCode.toString(), errMsg );
		}
		PersistenceManageResponse response=setWebserviceResponse(domainData);;
		
		return response;
	}

	private PersistenceManageData setDataPlanRequest(
			PersistenceManageRequest request, HeaderDetails headerDetails2) {
		PersistenceManageData domainData = new PersistenceManageData();
		
		if(Utilities.isNull(request.getPersistenceManageType().getMsisdn())==false)
			domainData.setMsisdn(request.getPersistenceManageType().getMsisdn());
		
		if(Utilities.isNull(request.getPersistenceManageType().getSimNumber())==false)
			domainData.setSimNumber(request.getPersistenceManageType().getSimNumber());
		
		if(Utilities.isNull(request.getPersistenceManageType().getImsi())==false)
			domainData.setImsi(request.getPersistenceManageType().getImsi());

		if(Utilities.isNull(request.getPersistenceManageType().getPublicityId())==false)
			domainData.setPublicityID(request.getPersistenceManageType().getPublicityId());

		if(Utilities.isNull(request.getPersistenceManageType().getSubscriptionType())==false)
			domainData.setSubscriptionType(request.getPersistenceManageType().getSubscriptionType());
		
		if(Utilities.isNull(request.getPersistenceManageType().getOperationName())==false)
			domainData.setOperationName(request.getPersistenceManageType().getOperationName());
		
		if(Utilities.isNull(request.getPersistenceManageType().getStatus())==false)
			domainData.setStatus(request.getPersistenceManageType().getStatus());
		
		if(Utilities.isNull(request.getPersistenceManageType().getTransactionId())==false)
			domainData.setTransactionId(request.getPersistenceManageType().getTransactionId());
		
		if(request.getPersistenceManageType().getErrorCode()!=null)
			domainData.setErrorCode(request.getPersistenceManageType().getErrorCode());
		
		if(Utilities.isNull(request.getPersistenceManageType().getErrorMessage())==false)
			domainData.setErrorMessage(request.getPersistenceManageType().getErrorMessage());
		
		return domainData;
	}

	private PersistenceManageResponse setWebserviceResponse(
			PersistenceManageData domainData) {
		PersistenceManageResponse response=new PersistenceManageResponse();
		if(domainData!=null){
			response.setTransactionId(domainData.getTransactionId());
		}
		response.setMessage(SMFAgentConstants.SUCCESS);
		return response;
	}

	/*private PersistenceManageData setMOSRequest(PersistenceManageRequest request,
			HeaderDetails headerDetails) {
		
		PersistenceManageData domainData = new PersistenceManageData();
		if(null!=request.getPersistenceManageType()){
			if(Utilities.isNull(request.getPersistenceManageType().getNetworkName())==false){
				domainData.setNetworkName(request.getPersistenceManageType().getNetworkName());
			}
				domainData.setPi_network_id(headerDetails.getNetworkID());
			if(Utilities.isNull(request.getPersistenceManageType().getRegistrationType())==false)
				domainData.setRegistrationType(request.getPersistenceManageType().getRegistrationType());
			if(Utilities.isNull(request.getPersistenceManageType().getTransactionId())==false)
				domainData.setTransactionId(request.getPersistenceManageType().getTransactionId());
			if(Utilities.isNull(request.getPersistenceManageType().getSelfcareActStatusType())==false)
				domainData.setSelfcareActStatusType(request.getPersistenceManageType().getSelfcareActStatusType());
			if(Utilities.isNull(request.getPersistenceManageType().getStatus())==false)
				domainData.setStatus(request.getPersistenceManageType().getStatus());
			if(Utilities.isNull(request.getPersistenceManageType().getActionFlag())==false)
				domainData.setActionFlag(request.getPersistenceManageType().getActionFlag());
			if(Utilities.isNull(request.getPersistenceManageType().getOperationName())==false)
				domainData.setOperationName(request.getPersistenceManageType().getOperationName());
			if(Utilities.isNull(request.getPersistenceManageType().getNode())==false)
				domainData.setNode(request.getPersistenceManageType().getNode());
			if(Utilities.isNull(request.getPersistenceManageType().getChannel())==false)
				domainData.setChannel(request.getPersistenceManageType().getChannel());
			if(Utilities.isNull(request.getPersistenceManageType().getRetryUserName())==false)
				domainData.setRetryUserName(request.getPersistenceManageType().getRetryUserName());
			if(Utilities.isNull(request.getPersistenceManageType().getMtiRemarks())==false)
				domainData.setMtiRemarks(request.getPersistenceManageType().getMtiRemarks());
			if(Utilities.isNull(request.getPersistenceManageType().getMtiActionFlag())==false)
				domainData.setMtiActionFlag(request.getPersistenceManageType().getMtiActionFlag());
			if(Utilities.isNull(request.getPersistenceManageType().getMtiStatus())==false)
				domainData.setMtiStatus(request.getPersistenceManageType().getMtiStatus());
			if(Utilities.isNull(request.getPersistenceManageType().getDealerMsisdn())==false)
				domainData.setDealerMsisdn(request.getPersistenceManageType().getDealerMsisdn());
			if(Utilities.isNull(request.getPersistenceManageType().getDealerUserId())==false)
				domainData.setDealerUserId(request.getPersistenceManageType().getDealerUserId());
			if(Utilities.isNull(request.getPersistenceManageType().getOrderID())==false)
				domainData.setOrderID(request.getPersistenceManageType().getOrderID());
			if(Utilities.isNull(request.getPersistenceManageType().getInitiatedFrom())==false)
				domainData.setInitiatedFrom(request.getPersistenceManageType().getInitiatedFrom());
			if(Utilities.isNull(request.getPersistenceManageType().getPromoCode())==false)
				domainData.setPromoCode(request.getPersistenceManageType().getPromoCode());
			if(Utilities.isNull(request.getPersistenceManageType().getRegistrationRequ())==false)
				domainData.setRegistrationRequ(request.getPersistenceManageType().getRegistrationRequ());
			if(Utilities.isNull(request.getPersistenceManageType().getChargeCode())==false)
				domainData.setChargeCode(request.getPersistenceManageType().getChargeCode());
			if(Utilities.isNull(request.getPersistenceManageType().getMessage())==false)
				domainData.setMessage(request.getPersistenceManageType().getMessage());
			if(Utilities.isNull(request.getPersistenceManageType().getLogId())==false)
				domainData.setLogId(request.getPersistenceManageType().getLogId());
			if(Utilities.isNull(request.getPersistenceManageType().getAddress1())==false)
				domainData.setAddress1(request.getPersistenceManageType().getAddress1());
			if(Utilities.isNull(request.getPersistenceManageType().getAddress2())==false)
				domainData.setAddress2(request.getPersistenceManageType().getAddress2());
			if(Utilities.isNull(request.getPersistenceManageType().getAddress3())==false)
				domainData.setAddress3(request.getPersistenceManageType().getAddress3());
			if(Utilities.isNull(request.getPersistenceManageType().getPostalCode())==false)
				domainData.setPostalCode(request.getPersistenceManageType().getPostalCode());
			if(Utilities.isNull(request.getPersistenceManageType().getState())==false)
				domainData.setState(request.getPersistenceManageType().getState());
			if(Utilities.isNull(request.getPersistenceManageType().getCity())==false)
				domainData.setCity(request.getPersistenceManageType().getCity());
			if(Utilities.isNull(request.getPersistenceManageType().getHomePhone())==false)
				domainData.setHomePhone(request.getPersistenceManageType().getHomePhone());
			if(Utilities.isNull(request.getPersistenceManageType().getOfficePhone())==false)
				domainData.setOfficePhone(request.getPersistenceManageType().getOfficePhone());
			if(Utilities.isNull(request.getPersistenceManageType().getCountry())==false)
				domainData.setCountry(request.getPersistenceManageType().getCountry());
			if(Utilities.isNull(request.getPersistenceManageType().getEmailId())==false)
				domainData.setEmailId(request.getPersistenceManageType().getEmailId());
			if(Utilities.isNull(request.getPersistenceManageType().getEmailLangPref())==false)
				domainData.setEmailLangPref(request.getPersistenceManageType().getEmailLangPref());
			if(Utilities.isNull(request.getPersistenceManageType().getOrderInfo())==false)
				domainData.setOrderInfo(request.getPersistenceManageType().getOrderInfo());
			if(Utilities.isNull(request.getPersistenceManageType().getOrderBooking())==false)
				domainData.setOrderBooking(request.getPersistenceManageType().getOrderBooking());
			if(Utilities.isNull(request.getPersistenceManageType().getEthic())==false)
				domainData.setEthic(request.getPersistenceManageType().getEthic());
			if(Utilities.isNull(request.getPersistenceManageType().getPleaseSpecify())==false)
				domainData.setPleaseSpecify(request.getPersistenceManageType().getPleaseSpecify());
			if(Utilities.isNull(request.getPersistenceManageType().getSourceofInfo())==false)
				domainData.setSourceofInfo(request.getPersistenceManageType().getSourceofInfo());
			if(Utilities.isNull(request.getPersistenceManageType().getFirstName())==false)
				domainData.setFirstName(request.getPersistenceManageType().getFirstName());
			if(Utilities.isNull(request.getPersistenceManageType().getLastName())==false)
				domainData.setLastName(request.getPersistenceManageType().getLastName());
			if(Utilities.isNull(request.getPersistenceManageType().getUserName())==false)
				domainData.setUserName(request.getPersistenceManageType().getUserName());
			if(Utilities.isNull(request.getPersistenceManageType().getDateOfBirth())==false)
				domainData.setDateOfBirth(request.getPersistenceManageType().getDateOfBirth());
			if(Utilities.isNull(request.getPersistenceManageType().getGender())==false)
				domainData.setGender(request.getPersistenceManageType().getGender());
			if(Utilities.isNull(request.getPersistenceManageType().getIdType())==false)
				domainData.setIdType(request.getPersistenceManageType().getIdType());
			if(Utilities.isNull(request.getPersistenceManageType().getIdValue())==false)
				domainData.setIdValue(request.getPersistenceManageType().getIdValue());
			if(Utilities.isNull(request.getPersistenceManageType().getOccupation())==false)
				domainData.setOccupation(request.getPersistenceManageType().getOccupation());
			if(Utilities.isNull(request.getPersistenceManageType().getIndustry())==false)
				domainData.setIndustry(request.getPersistenceManageType().getIndustry());
			if(Utilities.isNull(request.getPersistenceManageType().getAnnualIncome())==false)
				domainData.setAnnualIncome(request.getPersistenceManageType().getAnnualIncome());
			if(Utilities.isNull(request.getPersistenceManageType().getOldIC())==false)
				domainData.setOldIC(request.getPersistenceManageType().getOldIC());
			if(Utilities.isNull(request.getPersistenceManageType().getGmpc())==false)
				domainData.setGmpc(request.getPersistenceManageType().getGmpc());
			if(Utilities.isNull(request.getPersistenceManageType().getUserId())==false)
				domainData.setUserId(request.getPersistenceManageType().getUserId());
			if(Utilities.isNull(request.getPersistenceManageType().getIssueDate())==false)
				domainData.setIssueDate(request.getPersistenceManageType().getIssueDate());
			if(Utilities.isNull(request.getPersistenceManageType().getExpiryDate())==false)
				domainData.setExpiryDate(request.getPersistenceManageType().getExpiryDate());
			if(Utilities.isNull(request.getPersistenceManageType().getIdDoB())==false)
				domainData.setIdDoB(request.getPersistenceManageType().getIdDoB());
			if(Utilities.isNull(request.getPersistenceManageType().getNationalityCode())==false)
				domainData.setNationalityCode(request.getPersistenceManageType().getNationalityCode());
			if(Utilities.isNull(request.getPersistenceManageType().getFamilyName())==false)
				domainData.setFamilyName(request.getPersistenceManageType().getFamilyName());
			if(Utilities.isNull(request.getPersistenceManageType().getFatherName())==false)
				domainData.setFatherName(request.getPersistenceManageType().getFatherName());
			if(Utilities.isNull(request.getPersistenceManageType().getGrandFatherName())==false)
				domainData.setGrandFatherName(request.getPersistenceManageType().getGrandFatherName());
			if(Utilities.isNull(request.getPersistenceManageType().getIdExpiryDate())==false)
				domainData.setIdExpiryDate(request.getPersistenceManageType().getIdExpiryDate());
			if(Utilities.isNull(request.getPersistenceManageType().getSubtribeName())==false)
				domainData.setSubtribeName(request.getPersistenceManageType().getSubtribeName());
			if(Utilities.isNull(request.getPersistenceManageType().getEnglishFirstName())==false)
				domainData.setEnglishFirstName(request.getPersistenceManageType().getEnglishFirstName());
			if(Utilities.isNull(request.getPersistenceManageType().getEnglishLastName())==false)
				domainData.setEnglishLastName(request.getPersistenceManageType().getEnglishLastName());
			if(Utilities.isNull(request.getPersistenceManageType().getEnglishSecondName())==false)
				domainData.setEnglishSecondName(request.getPersistenceManageType().getEnglishSecondName());
			if(Utilities.isNull(request.getPersistenceManageType().getEnglishThirdName())==false)
				domainData.setEnglishThirdName(request.getPersistenceManageType().getEnglishThirdName());
			if(Utilities.isNull(request.getPersistenceManageType().getSecondName())==false)
				domainData.setSecondName(request.getPersistenceManageType().getSecondName());
			if(Utilities.isNull(request.getPersistenceManageType().getThirdName())==false)
				domainData.setThirdName(request.getPersistenceManageType().getThirdName());
			if(Utilities.isNull(request.getPersistenceManageType().getWorkPhone())==false)
				domainData.setWorkPhone(request.getPersistenceManageType().getWorkPhone());
			if(Utilities.isNull(request.getPersistenceManageType().getSimNumber())==false)
				domainData.setSimNumber(request.getPersistenceManageType().getSimNumber());
			if(Utilities.isNull(request.getPersistenceManageType().getImsi())==false)
				domainData.setImsi(request.getPersistenceManageType().getImsi());
			if(Utilities.isNull(request.getPersistenceManageType().getBlockedMSISDN())==false)
				domainData.setBlockedMSISDN(request.getPersistenceManageType().getBlockedMSISDN());
			if(Utilities.isNull(request.getPersistenceManageType().getMsisdn())==false)
				domainData.setMsisdn(request.getPersistenceManageType().getMsisdn());
			if(Utilities.isNull(request.getPersistenceManageType().getBillType())==false)
				domainData.setBillType(request.getPersistenceManageType().getBillType());
			if(Utilities.isNull(request.getPersistenceManageType().getBillFreq())==false)
				domainData.setBillFreq(request.getPersistenceManageType().getBillFreq());
			if(request.getPersistenceManageType().getCreditLimit()!=null)
				domainData.setCreditLimit(request.getPersistenceManageType().getCreditLimit());
			if(Utilities.isNull(request.getPersistenceManageType().getBillingDate())==false)
				domainData.setBillingDate(request.getPersistenceManageType().getBillingDate());
			if(request.getPersistenceManageType().getTariffPlanID()!=null)
				domainData.setTariffPlanID(request.getPersistenceManageType().getTariffPlanID());
			if(request.getPersistenceManageType().getIsSudo()!=null)
				domainData.setIsSudo(request.getPersistenceManageType().getIsSudo());
			if(request.getPersistenceManageType().getFRTransNo()!=null)
				domainData.setFRTransNo(request.getPersistenceManageType().getFRTransNo());
			if(Utilities.isNull(request.getPersistenceManageType().getOldIMSI())==false)
				domainData.setOldIMSI(request.getPersistenceManageType().getOldIMSI());
			if(Utilities.isNull(request.getPersistenceManageType().getServiceType())==false)
				domainData.setServiceType(request.getPersistenceManageType().getServiceType());
			if(Utilities.isNull(request.getPersistenceManageType().getOldCCNDC())==false)
				domainData.setOldCCNDC(request.getPersistenceManageType().getOldCCNDC());
			if(Utilities.isNull(request.getPersistenceManageType().getNewCCNDC())==false)
				domainData.setNewCCNDC(request.getPersistenceManageType().getNewCCNDC());
			if(Utilities.isNull(request.getPersistenceManageType().getActualMsisdn())==false)
				domainData.setActualMsisdn(request.getPersistenceManageType().getActualMsisdn());
			if(request.getPersistenceManageType().getAccountId()!=null)
				domainData.setAccountId(request.getPersistenceManageType().getAccountId());
			if(Utilities.isNull(request.getPersistenceManageType().getPseudoMSISDN())==false)
				domainData.setPseudoMSISDN(request.getPersistenceManageType().getPseudoMSISDN());
			if(Utilities.isNull(request.getPersistenceManageType().getGsmImsiTransNo())==false)
				domainData.setGsmImsiTransNo(request.getPersistenceManageType().getGsmImsiTransNo());
			if(Utilities.isNull(request.getPersistenceManageType().getGprsImsiTransNo())==false)
				domainData.setGprsImsiTransNo(request.getPersistenceManageType().getGprsImsiTransNo());
			if(Utilities.isNull(request.getPersistenceManageType().getTransactionNo())==false)
				domainData.setTransactionNo(request.getPersistenceManageType().getTransactionNo());
			if(Utilities.isNull(request.getPersistenceManageType().getSimType())==false)
				domainData.setSimType(request.getPersistenceManageType().getSimType());
			if(Utilities.isNull(request.getPersistenceManageType().getCreatedBy())==false)
				domainData.setCreatedBy(request.getPersistenceManageType().getCreatedBy());
			if(Utilities.isNull(request.getPersistenceManageType().getIccStatus())==false)
				domainData.setIccStatus(request.getPersistenceManageType().getIccStatus());
			if(request.getPersistenceManageType().getErrorCode()!=null)
				domainData.setErrorCode(request.getPersistenceManageType().getErrorCode());
			if(Utilities.isNull(request.getPersistenceManageType().getErrorMessage())==false)
				domainData.setErrorMessage(request.getPersistenceManageType().getErrorMessage());
			if(Utilities.isNull(request.getPersistenceManageType().getUserType())==false)
				domainData.setUserType(request.getPersistenceManageType().getUserType());
			if(Utilities.isNull(request.getPersistenceManageType().getIdExistsFlag())==false)
				domainData.setIdExistsFlag(request.getPersistenceManageType().getIdExistsFlag());
			if(Utilities.isNull(request.getPersistenceManageType().getMessageId())==false)
				domainData.setMessageId(request.getPersistenceManageType().getMessageId());
		    if(Utilities.isNull(request.getPersistenceManageType().getAccountType())==false)
				domainData.setAccountType(request.getPersistenceManageType().getAccountType());
			if(Utilities.isNull(request.getPersistenceManageType().getNewMsisdnCCNDC())==false)
				domainData.setNewMsisdnCCNDC(request.getPersistenceManageType().getNewMsisdnCCNDC());
			if(Utilities.isNull(request.getPersistenceManageType().getOldMsisdnCCNDC())==false)
				domainData.setOldMsisdnCCNDC(request.getPersistenceManageType().getOldMsisdnCCNDC());
			if(Utilities.isNull(request.getPersistenceManageType().getPassword())==false)
				domainData.setPassword(request.getPersistenceManageType().getPassword());
		    if(Utilities.isNull(request.getPersistenceManageType().getNewMDN())==false)
				domainData.setNewMDN(request.getPersistenceManageType().getNewMDN());
		    if(Utilities.isNull(request.getPersistenceManageType().getOldMDN())==false)
				domainData.setOldMDN(request.getPersistenceManageType().getOldMDN());
		    if(Utilities.isNull(request.getPersistenceManageType().getRequestType())==false)
				domainData.setRequestType(request.getPersistenceManageType().getRequestType());
		    if(Utilities.isNull(request.getPersistenceManageType().getNewPassword())==false)
				domainData.setNewPassword(request.getPersistenceManageType().getNewPassword());
		    if(Utilities.isNull(request.getPersistenceManageType().getOrderDate())==false)
				domainData.setOrderDate(request.getPersistenceManageType().getOrderDate());
		    if(request.getPersistenceManageType().getSmsLanguageId()!=null)
				domainData.setSmsLanguageId(request.getPersistenceManageType().getSmsLanguageId());
		    if(request.getPersistenceManageType().getSendNotificationFlag()!=null)
				domainData.setSendNotificationFlag(request.getPersistenceManageType().getSendNotificationFlag());
		    if(Utilities.isNull(request.getPersistenceManageType().getIsSendNotification())==false)
				domainData.setIsSendNotification(request.getPersistenceManageType().getIsSendNotification());
		    if(Utilities.isNull(request.getPersistenceManageType().getMessageConnFlag())==false)
				domainData.setMessageConnFlag(request.getPersistenceManageType().getMessageConnFlag());
		    if(Utilities.isNull(request.getPersistenceManageType().getGoldenOrderId())==false)
				domainData.setGoldenOrderId(request.getPersistenceManageType().getGoldenOrderId());
		    if(Utilities.isNull(request.getPersistenceManageType().getFailedNode())==false)
				domainData.setFailedNode(request.getPersistenceManageType().getFailedNode());
		    if(Utilities.isNull(request.getPersistenceManageType().getSimCategory())==false)
				domainData.setSimCategory(request.getPersistenceManageType().getSimCategory());
		    
		     Added For TT-OCS 1.1 
		    if(Utilities.isNull(request.getPersistenceManageType().getNewValidityDate())==false){
				domainData.setNewValidityDate(request.getPersistenceManageType().getNewValidityDate());
		    }
		    if(Utilities.isNull(request.getPersistenceManageType().getNewGracePeroidIEndDate())==false){
				domainData.setNewGracePeroidIEndDate(request.getPersistenceManageType().getNewGracePeroidIEndDate());
		    }
		    if(Utilities.isNull(request.getPersistenceManageType().getReason())==false){
				domainData.setReason(request.getPersistenceManageType().getReason());
		    }
		    if(request.getPersistenceManageType().getAmount()!=null){
				domainData.setAmount(request.getPersistenceManageType().getAmount());
		    }
		    if(Utilities.isNull(request.getPersistenceManageType().getAcctRetrievalType())==false){
				domainData.setAcctRetrievalType(request.getPersistenceManageType().getAcctRetrievalType());
	   
		    }
		    if(Utilities.isNull(request.getPersistenceManageType().getRetrievalType())==false){
				domainData.setRetrievalType(request.getPersistenceManageType().getRetrievalType());
	   
		    }
		    if(Utilities.isNull(request.getPersistenceManageType().getTransactionData())==false){
				domainData.setTransactionData(request.getPersistenceManageType().getTransactionData());
		    }

		    if(Utilities.isNull(request.getPersistenceManageType().getErrorCategory())==false){
				domainData.setErrorCategory(request.getPersistenceManageType().getErrorCategory());
		    }
		    if(Utilities.isNull(request.getPersistenceManageType().getPreferFourDigits())==false){
				domainData.setPreferFourDigits(request.getPersistenceManageType().getPreferFourDigits());
		    }
		    if(Utilities.isNull(request.getPersistenceManageType().getCorrelationID())==false){
				domainData.setCorrelationID(request.getPersistenceManageType().getCorrelationID());
		    }
		    if(Utilities.isNull(request.getPersistenceManageType().getVoucherPIN())==false){
				domainData.setVoucherPIN(request.getPersistenceManageType().getVoucherPIN());
		    }
		    if(Utilities.isNull(request.getPersistenceManageType().getProvisionType())==false){
				domainData.setProvisionType(request.getPersistenceManageType().getProvisionType());
		    }
		    
		    if(Utilities.isNull(request.getPersistenceManageType().getTransfereeMSISDN())==false){
				domainData.setTransfereeMSISDN(request.getPersistenceManageType().getTransfereeMSISDN());
		    }
		    if(Utilities.isNull(request.getPersistenceManageType().getTransferorMSISDN())==false){
				domainData.setTransferorMSISDN(request.getPersistenceManageType().getTransferorMSISDN());
		    }
		    if(Utilities.isNull(request.getPersistenceManageType().getVmsData())==false){
				domainData.setVmsData(request.getPersistenceManageType().getVmsData());
		    }
		    if(Utilities.isNull(request.getPersistenceManageType().getIvrData())==false){
				domainData.setIvrData(request.getPersistenceManageType().getIvrData());
		    }
		    
		    if(null!=request.getPersistenceManageType().getIndexNo()){
				domainData.setIndexNo(request.getPersistenceManageType().getIndexNo());
		    }
		    
		    if(null!=request.getPersistenceManageType().getMaxRecords()){
				domainData.setMaxRecords(request.getPersistenceManageType().getMaxRecords());
		    }
		    if(null!=request.getPersistenceManageType().getIsCorp()){
				domainData.setIsCorp(request.getPersistenceManageType().getIsCorp());
		    }
			if(Utilities.isNull(request.getPersistenceManageType().getDebit())==false)
				domainData.setDebit(request.getPersistenceManageType().getDebit());

		    if(Utilities.isNull(request.getPersistenceManageType().getUssdMDN())==false){
				domainData.setUssdMDN(request.getPersistenceManageType().getUssdMDN());
		    }
		    if(Utilities.isNull(request.getPersistenceManageType().getHlrFrConnection())==false){
				domainData.setHlrFrConnection(request.getPersistenceManageType().getHlrFrConnection());
		    }
		}
		return domainData;
	}*/
}
