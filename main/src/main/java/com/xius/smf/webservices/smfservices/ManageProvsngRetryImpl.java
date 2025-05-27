package com.xius.smf.webservices.smfservices;


import net.bcgi.util.db.SPFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xius.agent.smf.smfmanagement.ManageProvsngRetryRequest;
import com.xius.agent.smf.smfmanagement.ManageProvsngRetryResponse;
import com.xius.smf.domaindata.ManageProvsngRetryData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;


@Service("ManageProvsngRetryImpl")
public class ManageProvsngRetryImpl {

	//creating the logger
	private  static final Logger logger = LogManager.getLogger(ManageProvsngRetryImpl.class.getSimpleName());

	public ManageProvsngRetryResponse manageRollback(ManageProvsngRetryRequest request,
			HeaderDetails headerDetails)throws SMFAgentException  {
		ManageProvsngRetryData domainData = setMOSRequest(request, headerDetails);
		

		SPFactory factory=ServiceUtils.executeSPWithOutCommit("pro_simreg_retry", domainData, domainData);
		Long eCode = domainData.getPo_error_code();
		String eMsg = domainData.getPo_error_desc();
		if(logger.isInfoEnabled()) {

			logger.error( "Error Code from pro_sim_reg_node_track ==>" + eCode);
			logger.error( "Error Msg from pro_sim_reg_node_track ==>" + eMsg );
		}
		Utilities.commitOrRollback(factory, domainData.getPo_error_code());
		//If return value is zero then success else throwing the error back to user
		if( eCode !=0) {
			if(Utilities.isNull( eMsg ) == false ) {
				throw Utilities.setSMFAgentException(String.valueOf(eCode),  eMsg);
			}
			throw Utilities.setSMFAgentException( eCode );
		}
		/**
		 * Set response
		 */
		ManageProvsngRetryResponse response = setWebserviceResponse( domainData );
		return response;
	}

	private ManageProvsngRetryResponse setWebserviceResponse(
			ManageProvsngRetryData domainData) {
		ManageProvsngRetryResponse response = new ManageProvsngRetryResponse();
		
		
		response.setMessage(SMFAgentConstants.SUCCESS);
		response.setTransID(domainData.getTransId());
		return response;
	}

	private ManageProvsngRetryData setMOSRequest(ManageProvsngRetryRequest request,
			HeaderDetails headerDetails) {
		
		ManageProvsngRetryData domainData = new ManageProvsngRetryData();
		if(null!=request.getManageProvsngRetryType()){
			if(Utilities.isNull(request.getManageProvsngRetryType().getNetworkName())==false){
				domainData.setNetworkName(request.getManageProvsngRetryType().getNetworkName());
			}
				domainData.setPi_network_id(headerDetails.getNetworkID());
			if(Utilities.isNull(request.getManageProvsngRetryType().getRegistrationType())==false)
				domainData.setRegistrationType(request.getManageProvsngRetryType().getRegistrationType());
			if(Utilities.isNull(request.getManageProvsngRetryType().getTransId())==false)
				domainData.setTransId(request.getManageProvsngRetryType().getTransId());
			if(Utilities.isNull(request.getManageProvsngRetryType().getSelfcareActStatusType())==false)
				domainData.setSelfcareActStatusType(request.getManageProvsngRetryType().getSelfcareActStatusType());
			if(Utilities.isNull(request.getManageProvsngRetryType().getStatus())==false)
				domainData.setStatus(request.getManageProvsngRetryType().getStatus());
			if(Utilities.isNull(request.getManageProvsngRetryType().getActionFlag())==false)
				domainData.setActionFlag(request.getManageProvsngRetryType().getActionFlag());
			if(Utilities.isNull(request.getManageProvsngRetryType().getOperationName())==false)
				domainData.setOperationName(request.getManageProvsngRetryType().getOperationName());
			if(Utilities.isNull(request.getManageProvsngRetryType().getNode())==false)
				domainData.setNode(request.getManageProvsngRetryType().getNode());
			if(Utilities.isNull(request.getManageProvsngRetryType().getChannel())==false)
				domainData.setChannel(request.getManageProvsngRetryType().getChannel());
			if(Utilities.isNull(request.getManageProvsngRetryType().getRetryUserName())==false)
				domainData.setRetryUserName(request.getManageProvsngRetryType().getRetryUserName());
			if(Utilities.isNull(request.getManageProvsngRetryType().getMtiRemarks())==false)
				domainData.setMtiRemarks(request.getManageProvsngRetryType().getMtiRemarks());
			if(Utilities.isNull(request.getManageProvsngRetryType().getMtiActionFlag())==false)
				domainData.setMtiActionFlag(request.getManageProvsngRetryType().getMtiActionFlag());
			if(Utilities.isNull(request.getManageProvsngRetryType().getMtiStatus())==false)
				domainData.setMtiStatus(request.getManageProvsngRetryType().getMtiStatus());
			if(Utilities.isNull(request.getManageProvsngRetryType().getDealerMsisdn())==false)
				domainData.setDealerMsisdn(request.getManageProvsngRetryType().getDealerMsisdn());
			if(Utilities.isNull(request.getManageProvsngRetryType().getDealerUserId())==false)
				domainData.setDealerUserId(request.getManageProvsngRetryType().getDealerUserId());
			if(Utilities.isNull(request.getManageProvsngRetryType().getOrderID())==false)
				domainData.setOrderID(request.getManageProvsngRetryType().getOrderID());
			if(Utilities.isNull(request.getManageProvsngRetryType().getInitiatedFrom())==false)
				domainData.setInitiatedFrom(request.getManageProvsngRetryType().getInitiatedFrom());
			if(Utilities.isNull(request.getManageProvsngRetryType().getPromoCode())==false)
				domainData.setPromoCode(request.getManageProvsngRetryType().getPromoCode());
			if(Utilities.isNull(request.getManageProvsngRetryType().getRegistrationRequ())==false)
				domainData.setRegistrationRequ(request.getManageProvsngRetryType().getRegistrationRequ());
			if(Utilities.isNull(request.getManageProvsngRetryType().getChargeCode())==false)
				domainData.setChargeCode(request.getManageProvsngRetryType().getChargeCode());
			if(Utilities.isNull(request.getManageProvsngRetryType().getMessage())==false)
				domainData.setMessage(request.getManageProvsngRetryType().getMessage());
			if(Utilities.isNull(request.getManageProvsngRetryType().getLogId())==false)
				domainData.setLogId(request.getManageProvsngRetryType().getLogId());
			if(Utilities.isNull(request.getManageProvsngRetryType().getAddress1())==false)
				domainData.setAddress1(request.getManageProvsngRetryType().getAddress1());
			if(Utilities.isNull(request.getManageProvsngRetryType().getAddress2())==false)
				domainData.setAddress2(request.getManageProvsngRetryType().getAddress2());
			if(Utilities.isNull(request.getManageProvsngRetryType().getAddress3())==false)
				domainData.setAddress3(request.getManageProvsngRetryType().getAddress3());
			if(Utilities.isNull(request.getManageProvsngRetryType().getPostalCode())==false)
				domainData.setPostalCode(request.getManageProvsngRetryType().getPostalCode());
			if(Utilities.isNull(request.getManageProvsngRetryType().getState())==false)
				domainData.setState(request.getManageProvsngRetryType().getState());
			if(Utilities.isNull(request.getManageProvsngRetryType().getCity())==false)
				domainData.setCity(request.getManageProvsngRetryType().getCity());
			if(Utilities.isNull(request.getManageProvsngRetryType().getHomePhone())==false)
				domainData.setHomePhone(request.getManageProvsngRetryType().getHomePhone());
			if(Utilities.isNull(request.getManageProvsngRetryType().getOfficePhone())==false)
				domainData.setOfficePhone(request.getManageProvsngRetryType().getOfficePhone());
			if(Utilities.isNull(request.getManageProvsngRetryType().getCountry())==false)
				domainData.setCountry(request.getManageProvsngRetryType().getCountry());
			if(Utilities.isNull(request.getManageProvsngRetryType().getEmailId())==false)
				domainData.setEmailId(request.getManageProvsngRetryType().getEmailId());
			if(Utilities.isNull(request.getManageProvsngRetryType().getEmailLangPref())==false)
				domainData.setEmailLangPref(request.getManageProvsngRetryType().getEmailLangPref());
			if(Utilities.isNull(request.getManageProvsngRetryType().getOrderInfo())==false)
				domainData.setOrderInfo(request.getManageProvsngRetryType().getOrderInfo());
			if(Utilities.isNull(request.getManageProvsngRetryType().getOrderBooking())==false)
				domainData.setOrderBooking(request.getManageProvsngRetryType().getOrderBooking());
			if(Utilities.isNull(request.getManageProvsngRetryType().getEthic())==false)
				domainData.setEthic(request.getManageProvsngRetryType().getEthic());
			if(Utilities.isNull(request.getManageProvsngRetryType().getPleaseSpecify())==false)
				domainData.setPleaseSpecify(request.getManageProvsngRetryType().getPleaseSpecify());
			if(Utilities.isNull(request.getManageProvsngRetryType().getSourceofInfo())==false)
				domainData.setSourceofInfo(request.getManageProvsngRetryType().getSourceofInfo());
			if(Utilities.isNull(request.getManageProvsngRetryType().getFirstName())==false)
				domainData.setFirstName(request.getManageProvsngRetryType().getFirstName());
			if(Utilities.isNull(request.getManageProvsngRetryType().getLastName())==false)
				domainData.setLastName(request.getManageProvsngRetryType().getLastName());
			if(Utilities.isNull(request.getManageProvsngRetryType().getUserName())==false)
				domainData.setUserName(request.getManageProvsngRetryType().getUserName());
			if(Utilities.isNull(request.getManageProvsngRetryType().getDateOfBirth())==false)
				domainData.setDateOfBirth(request.getManageProvsngRetryType().getDateOfBirth());
			if(Utilities.isNull(request.getManageProvsngRetryType().getGender())==false)
				domainData.setGender(request.getManageProvsngRetryType().getGender());
			if(Utilities.isNull(request.getManageProvsngRetryType().getIdType())==false)
				domainData.setIdType(request.getManageProvsngRetryType().getIdType());
			if(Utilities.isNull(request.getManageProvsngRetryType().getIdValue())==false)
				domainData.setIdValue(request.getManageProvsngRetryType().getIdValue());
			if(Utilities.isNull(request.getManageProvsngRetryType().getOccupation())==false)
				domainData.setOccupation(request.getManageProvsngRetryType().getOccupation());
			if(Utilities.isNull(request.getManageProvsngRetryType().getIndustry())==false)
				domainData.setIndustry(request.getManageProvsngRetryType().getIndustry());
			if(Utilities.isNull(request.getManageProvsngRetryType().getAnnualIncome())==false)
				domainData.setAnnualIncome(request.getManageProvsngRetryType().getAnnualIncome());
			if(Utilities.isNull(request.getManageProvsngRetryType().getOldIC())==false)
				domainData.setOldIC(request.getManageProvsngRetryType().getOldIC());
			if(Utilities.isNull(request.getManageProvsngRetryType().getGmpc())==false)
				domainData.setGmpc(request.getManageProvsngRetryType().getGmpc());
			if(Utilities.isNull(request.getManageProvsngRetryType().getUserId())==false)
				domainData.setUserId(request.getManageProvsngRetryType().getUserId());
			if(Utilities.isNull(request.getManageProvsngRetryType().getIssueDate())==false)
				domainData.setIssueDate(request.getManageProvsngRetryType().getIssueDate());
			if(Utilities.isNull(request.getManageProvsngRetryType().getExpiryDate())==false)
				domainData.setExpiryDate(request.getManageProvsngRetryType().getExpiryDate());
			if(Utilities.isNull(request.getManageProvsngRetryType().getIdDoB())==false)
				domainData.setIdDoB(request.getManageProvsngRetryType().getIdDoB());
			if(Utilities.isNull(request.getManageProvsngRetryType().getNationalityCode())==false)
				domainData.setNationalityCode(request.getManageProvsngRetryType().getNationalityCode());
			if(Utilities.isNull(request.getManageProvsngRetryType().getFamilyName())==false)
				domainData.setFamilyName(request.getManageProvsngRetryType().getFamilyName());
			if(Utilities.isNull(request.getManageProvsngRetryType().getFatherName())==false)
				domainData.setFatherName(request.getManageProvsngRetryType().getFatherName());
			if(Utilities.isNull(request.getManageProvsngRetryType().getGrandFatherName())==false)
				domainData.setGrandFatherName(request.getManageProvsngRetryType().getGrandFatherName());
			if(Utilities.isNull(request.getManageProvsngRetryType().getIdExpiryDate())==false)
				domainData.setIdExpiryDate(request.getManageProvsngRetryType().getIdExpiryDate());
			if(Utilities.isNull(request.getManageProvsngRetryType().getSubtribeName())==false)
				domainData.setSubtribeName(request.getManageProvsngRetryType().getSubtribeName());
			if(Utilities.isNull(request.getManageProvsngRetryType().getEnglishFirstName())==false)
				domainData.setEnglishFirstName(request.getManageProvsngRetryType().getEnglishFirstName());
			if(Utilities.isNull(request.getManageProvsngRetryType().getEnglishLastName())==false)
				domainData.setEnglishLastName(request.getManageProvsngRetryType().getEnglishLastName());
			if(Utilities.isNull(request.getManageProvsngRetryType().getEnglishSecondName())==false)
				domainData.setEnglishSecondName(request.getManageProvsngRetryType().getEnglishSecondName());
			if(Utilities.isNull(request.getManageProvsngRetryType().getEnglishThirdName())==false)
				domainData.setEnglishThirdName(request.getManageProvsngRetryType().getEnglishThirdName());
			if(Utilities.isNull(request.getManageProvsngRetryType().getSecondName())==false)
				domainData.setSecondName(request.getManageProvsngRetryType().getSecondName());
			if(Utilities.isNull(request.getManageProvsngRetryType().getThirdName())==false)
				domainData.setThirdName(request.getManageProvsngRetryType().getThirdName());
			if(Utilities.isNull(request.getManageProvsngRetryType().getWorkPhone())==false)
				domainData.setWorkPhone(request.getManageProvsngRetryType().getWorkPhone());
			if(Utilities.isNull(request.getManageProvsngRetryType().getSimNumber())==false)
				domainData.setSimNumber(request.getManageProvsngRetryType().getSimNumber());
			if(Utilities.isNull(request.getManageProvsngRetryType().getImsi())==false)
				domainData.setImsi(request.getManageProvsngRetryType().getImsi());
			if(Utilities.isNull(request.getManageProvsngRetryType().getBlockedMSISDN())==false)
				domainData.setBlockedMSISDN(request.getManageProvsngRetryType().getBlockedMSISDN());
			if(Utilities.isNull(request.getManageProvsngRetryType().getMsisdn())==false)
				domainData.setMsisdn(request.getManageProvsngRetryType().getMsisdn());
			if(Utilities.isNull(request.getManageProvsngRetryType().getBillType())==false)
				domainData.setBillType(request.getManageProvsngRetryType().getBillType());
			if(Utilities.isNull(request.getManageProvsngRetryType().getBillFreq())==false)
				domainData.setBillFreq(request.getManageProvsngRetryType().getBillFreq());
			if(request.getManageProvsngRetryType().getCreditLimit()!=null)
				domainData.setCreditLimit(request.getManageProvsngRetryType().getCreditLimit());
			if(Utilities.isNull(request.getManageProvsngRetryType().getBillingDate())==false)
				domainData.setBillingDate(request.getManageProvsngRetryType().getBillingDate());
			if(request.getManageProvsngRetryType().getTariffPlanID()!=null)
				domainData.setTariffPlanID(request.getManageProvsngRetryType().getTariffPlanID());
			if(request.getManageProvsngRetryType().getIsSudo()!=null)
				domainData.setIsSudo(request.getManageProvsngRetryType().getIsSudo());
			if(request.getManageProvsngRetryType().getFRTransNo()!=null)
				domainData.setFRTransNo(request.getManageProvsngRetryType().getFRTransNo());
			if(Utilities.isNull(request.getManageProvsngRetryType().getOldIMSI())==false)
				domainData.setOldIMSI(request.getManageProvsngRetryType().getOldIMSI());
			if(Utilities.isNull(request.getManageProvsngRetryType().getServiceType())==false)
				domainData.setServiceType(request.getManageProvsngRetryType().getServiceType());
			if(Utilities.isNull(request.getManageProvsngRetryType().getOldCCNDC())==false)
				domainData.setOldCCNDC(request.getManageProvsngRetryType().getOldCCNDC());
			if(Utilities.isNull(request.getManageProvsngRetryType().getNewCCNDC())==false)
				domainData.setNewCCNDC(request.getManageProvsngRetryType().getNewCCNDC());
			if(Utilities.isNull(request.getManageProvsngRetryType().getActualMsisdn())==false)
				domainData.setActualMsisdn(request.getManageProvsngRetryType().getActualMsisdn());
			if(request.getManageProvsngRetryType().getAccountId()!=null)
				domainData.setAccountId(request.getManageProvsngRetryType().getAccountId());
			if(Utilities.isNull(request.getManageProvsngRetryType().getPseudoMSISDN())==false)
				domainData.setPseudoMSISDN(request.getManageProvsngRetryType().getPseudoMSISDN());
			if(Utilities.isNull(request.getManageProvsngRetryType().getGsmImsiTransNo())==false)
				domainData.setGsmImsiTransNo(request.getManageProvsngRetryType().getGsmImsiTransNo());
			if(Utilities.isNull(request.getManageProvsngRetryType().getGprsImsiTransNo())==false)
				domainData.setGprsImsiTransNo(request.getManageProvsngRetryType().getGprsImsiTransNo());
			if(Utilities.isNull(request.getManageProvsngRetryType().getTransactionNo())==false)
				domainData.setTransactionNo(request.getManageProvsngRetryType().getTransactionNo());
			if(Utilities.isNull(request.getManageProvsngRetryType().getSimType())==false)
				domainData.setSimType(request.getManageProvsngRetryType().getSimType());
			if(Utilities.isNull(request.getManageProvsngRetryType().getCreatedBy())==false)
				domainData.setCreatedBy(request.getManageProvsngRetryType().getCreatedBy());
			if(Utilities.isNull(request.getManageProvsngRetryType().getIccStatus())==false)
				domainData.setIccStatus(request.getManageProvsngRetryType().getIccStatus());
			if(request.getManageProvsngRetryType().getErrorCode()!=null)
				domainData.setErrorCode(request.getManageProvsngRetryType().getErrorCode());
			if(Utilities.isNull(request.getManageProvsngRetryType().getErrorMessage())==false)
				domainData.setErrorMessage(request.getManageProvsngRetryType().getErrorMessage());
			if(Utilities.isNull(request.getManageProvsngRetryType().getUserType())==false)
				domainData.setUserType(request.getManageProvsngRetryType().getUserType());
			if(Utilities.isNull(request.getManageProvsngRetryType().getIdExistsFlag())==false)
				domainData.setIdExistsFlag(request.getManageProvsngRetryType().getIdExistsFlag());
			if(Utilities.isNull(request.getManageProvsngRetryType().getMessageId())==false)
				domainData.setMessageId(request.getManageProvsngRetryType().getMessageId());
		    if(Utilities.isNull(request.getManageProvsngRetryType().getAccountType())==false)
				domainData.setAccountType(request.getManageProvsngRetryType().getAccountType());
			if(Utilities.isNull(request.getManageProvsngRetryType().getNewMsisdnCCNDC())==false)
				domainData.setNewMsisdnCCNDC(request.getManageProvsngRetryType().getNewMsisdnCCNDC());
			if(Utilities.isNull(request.getManageProvsngRetryType().getOldMsisdnCCNDC())==false)
				domainData.setOldMsisdnCCNDC(request.getManageProvsngRetryType().getOldMsisdnCCNDC());
			if(Utilities.isNull(request.getManageProvsngRetryType().getPassword())==false)
				domainData.setPassword(request.getManageProvsngRetryType().getPassword());
		    if(Utilities.isNull(request.getManageProvsngRetryType().getNewMDN())==false)
				domainData.setNewMDN(request.getManageProvsngRetryType().getNewMDN());
		    if(Utilities.isNull(request.getManageProvsngRetryType().getOldMDN())==false)
				domainData.setOldMDN(request.getManageProvsngRetryType().getOldMDN());
		    if(Utilities.isNull(request.getManageProvsngRetryType().getRequestType())==false)
				domainData.setRequestType(request.getManageProvsngRetryType().getRequestType());
		    if(Utilities.isNull(request.getManageProvsngRetryType().getNewPassword())==false)
				domainData.setNewPassword(request.getManageProvsngRetryType().getNewPassword());
		    if(Utilities.isNull(request.getManageProvsngRetryType().getOrderDate())==false)
				domainData.setOrderDate(request.getManageProvsngRetryType().getOrderDate());
		    if(request.getManageProvsngRetryType().getSmsLanguageId()!=null)
				domainData.setSmsLanguageId(request.getManageProvsngRetryType().getSmsLanguageId());
		    if(request.getManageProvsngRetryType().isSendNotificationFlag())
				domainData.setSendNotificationFlag(request.getManageProvsngRetryType().isSendNotificationFlag());
		    if(Utilities.isNull(request.getManageProvsngRetryType().getIsSendNotification())==false)
				domainData.setIsSendNotification(request.getManageProvsngRetryType().getIsSendNotification());
		    if(Utilities.isNull(request.getManageProvsngRetryType().getMessageConnFlag())==false)
				domainData.setMessageConnFlag(request.getManageProvsngRetryType().getMessageConnFlag());
		    if(Utilities.isNull(request.getManageProvsngRetryType().getGoldenOrderId())==false)
				domainData.setGoldenOrderId(request.getManageProvsngRetryType().getGoldenOrderId());
		    if(Utilities.isNull(request.getManageProvsngRetryType().getFailedNode())==false)
				domainData.setFailedNode(request.getManageProvsngRetryType().getFailedNode());
		    if(Utilities.isNull(request.getManageProvsngRetryType().getSimCategory())==false)
				domainData.setSimCategory(request.getManageProvsngRetryType().getSimCategory());
		    
		    /* Added For TT-OCS 1.1 */
		    if(Utilities.isNull(request.getManageProvsngRetryType().getNewValidityDate())==false){
				domainData.setNewValidityDate(request.getManageProvsngRetryType().getNewValidityDate());
		    }
		    if(Utilities.isNull(request.getManageProvsngRetryType().getNewGracePeroidIEndDate())==false){
				domainData.setNewGracePeroidIEndDate(request.getManageProvsngRetryType().getNewGracePeroidIEndDate());
		    }
		    if(Utilities.isNull(request.getManageProvsngRetryType().getReason())==false){
				domainData.setReason(request.getManageProvsngRetryType().getReason());
		    }
		    if(request.getManageProvsngRetryType().getAmount()!=null){
				domainData.setAmount(request.getManageProvsngRetryType().getAmount());
		    }
		    if(Utilities.isNull(request.getManageProvsngRetryType().getAcctRetrievalType())==false){
				domainData.setAcctRetrievalType(request.getManageProvsngRetryType().getAcctRetrievalType());
	   
		    }
		    if(Utilities.isNull(request.getManageProvsngRetryType().getRetrievalType())==false){
				domainData.setRetrievalType(request.getManageProvsngRetryType().getRetrievalType());
	   
		    }
		    if(Utilities.isNull(request.getManageProvsngRetryType().getTransactionData())==false){
				domainData.setTransactionData(request.getManageProvsngRetryType().getTransactionData());
		    }

		    if(Utilities.isNull(request.getManageProvsngRetryType().getErrorCategory())==false){
				domainData.setErrorCategory(request.getManageProvsngRetryType().getErrorCategory());
		    }
		    if(Utilities.isNull(request.getManageProvsngRetryType().getPreferFourDigits())==false){
				domainData.setPreferFourDigits(request.getManageProvsngRetryType().getPreferFourDigits());
		    }
		    if(Utilities.isNull(request.getManageProvsngRetryType().getCorrelationID())==false){
				domainData.setCorrelationID(request.getManageProvsngRetryType().getCorrelationID());
		    }
		    if(Utilities.isNull(request.getManageProvsngRetryType().getVoucherPIN())==false){
				domainData.setVoucherPIN(request.getManageProvsngRetryType().getVoucherPIN());
		    }
		    if(Utilities.isNull(request.getManageProvsngRetryType().getProvisionType())==false){
				domainData.setProvisionType(request.getManageProvsngRetryType().getProvisionType());
		    }
		    
		    if(Utilities.isNull(request.getManageProvsngRetryType().getTransfereeMSISDN())==false){
				domainData.setTransfereeMSISDN(request.getManageProvsngRetryType().getTransfereeMSISDN());
		    }
		    if(Utilities.isNull(request.getManageProvsngRetryType().getTransferorMSISDN())==false){
				domainData.setTransferorMSISDN(request.getManageProvsngRetryType().getTransferorMSISDN());
		    }
		    if(Utilities.isNull(request.getManageProvsngRetryType().getVmsData())==false){
				domainData.setVmsData(request.getManageProvsngRetryType().getVmsData());
		    }
		    if(Utilities.isNull(request.getManageProvsngRetryType().getIvrData())==false){
				domainData.setIvrData(request.getManageProvsngRetryType().getIvrData());
		    }
		    
		    if(null!=request.getManageProvsngRetryType().getIndexNo()){
				domainData.setIndexNo(request.getManageProvsngRetryType().getIndexNo());
		    }
		    
		    if(null!=request.getManageProvsngRetryType().getMaxRecords()){
				domainData.setMaxRecords(request.getManageProvsngRetryType().getMaxRecords());
		    }
		    
		    
			/*
			 * if(null!=request.getManageProvsngRetryType().iscgetIsCorp()){
			 * domainData.setIsCorp(request.getManageProvsngRetryType().getIsCorp()); }
			 */
		    if(null!=request.getManageProvsngRetryType().isIsCorp()){
				domainData.setIsCorp(request.getManageProvsngRetryType().isIsCorp());
		    }
		    
		    if(Utilities.isNull(request.getManageProvsngRetryType().getUssdMDN())==false){
				domainData.setUssdMDN(request.getManageProvsngRetryType().getUssdMDN());
		    }
		    if(Utilities.isNull(request.getManageProvsngRetryType().getHlrFrConnection())==false){
				domainData.setHlrFrConnection(request.getManageProvsngRetryType().getHlrFrConnection());
		    }
		}
		return domainData;
	}

}
