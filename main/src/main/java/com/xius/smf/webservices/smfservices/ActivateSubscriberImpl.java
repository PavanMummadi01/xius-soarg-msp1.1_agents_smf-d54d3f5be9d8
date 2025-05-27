/**
 * 
 */
package com.xius.smf.webservices.smfservices;

import java.rmi.RemoteException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.xius.agent.smf.common.error.errordetails.ErrorDetailsType;
import com.xius.agent.smf.smfmanagement.FirstLUUpdateRequest;
import com.xius.agent.smf.smfmanagement.FirstLUUpdateResponse;
import com.xius.agent.smf.smfmanagement.SIMActivationRequest;
import com.xius.agent.smf.smfmanagement.SIMActivationResponse;
import com.xius.billing.AccountManagement_xsd.MDNBasedGetNwIdRequest;
import com.xius.billing.AccountManagement_xsd.MDNBasedGetNwIdResponse;
import com.xius.billing.SubscriberManagement_xsd.GetSubscriberInfoRequest;
import com.xius.billing.SubscriberManagement_xsd.GetSubscriberInfoResponse;
import com.xius.billing.SubscriberManagement_xsd.OptionType;
import com.xius.smf.client.invoker.FirstLuActivationInvoker;
import com.xius.smf.client.invoker.GetSubscriberInfoInvoker;
import com.xius.smf.client.invoker.MDNbasedGetNwIdInvoker;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.Utilities;
import com.xius.smf.webservices.SMFReportsManagement;
import com.xius.xbus.messages.common.UserType;
import com.xius.xbus.messages.provisioning.device.FirstLUActivationRequest;
import com.xius.xbus.messages.provisioning.device.FirstLUActivationResponse;

/**
 * @author shashidhar.P
 * 
 */
public class ActivateSubscriberImpl {

	
	private  static final Logger logger = LogManager.getLogger(ActivateSubscriberImpl.class.getSimpleName());

	GetSubscriberInfoResponse getSubscriberInfoResponse = null;
	MDNBasedGetNwIdResponse  mDNBasedGetNwIdResponse =null;

	public FirstLUActivationResponse activateSubscriber(Long msisdn,String transId,String sim,Long sna,Long nir,String TPID,
			HeaderDetails headerDetails)
			throws  SMFAgentException, RemoteException {

		long startTime = System.currentTimeMillis();
		long endTime = 0;
        String IMSI = null;
		SIMActivationRequest smfRequest = null;
		SIMActivationResponse smfResponse = null;

		FirstLUActivationRequest xBusRequest = null;
		FirstLUActivationResponse xBusresponse=null;
		
		FirstLuActivationInvoker xBusInvoker =null;
		SIMActivationImpl simActivationImpl = null;
		FirstLUUpdateImpl firstLuUpdateImpl;

		FirstLUUpdateRequest trackUpdateRequest;
		FirstLUUpdateResponse trackerUpdateResponse;
		
		try {
			
			if(sim != null){
				mDNBasedGetNwIdResponse =getSimDetails(sim,headerDetails);
				if(mDNBasedGetNwIdResponse !=null){
					IMSI=mDNBasedGetNwIdResponse.getIMSI();
				}
			}else if (msisdn != null && sim == null ){
				getSubscriberInfoResponse = getDetails(String.valueOf(msisdn),headerDetails);
				if(getSubscriberInfoResponse !=null){
					IMSI=(String.valueOf(getSubscriberInfoResponse.getImsiNo()));
				}
			}
			
			simActivationImpl =  new SIMActivationImpl();
			xBusresponse = new FirstLUActivationResponse();	
			smfRequest = new SIMActivationRequest();
		
		 	if (getSubscriberInfoResponse != null || mDNBasedGetNwIdResponse !=null) {
				//msisdn null or sim null checking(simActivation) and trasid null check
				if ((msisdn != null || sim!=null) && transId !=null) {
					
					smfRequest.setIMSI(IMSI);
					smfRequest.setLinkTransId(transId);
					smfRequest.setActivityId("91");
					if(msisdn!=null){
						smfRequest.setMSISDN(String.valueOf(msisdn));
					}
					smfRequest.setChannel((String)InitiateAll.getSMFProps().getProperty("CHANNEL"));
					if(sim!=null)
						smfRequest.setSIM(sim);
					if(sna!=null)
						smfRequest.setSNA(sna);
					if(nir!=null)
						smfRequest.setNIR(nir);
				}else{
					if (logger.isDebugEnabled()) {
						logger.debug("ActivateSubscriberImpl of ActivateSubscriberRequest -details not found");
				}
				}
				smfResponse = simActivationImpl.SIMActivation(smfRequest,headerDetails);
				if (smfResponse == null) {
					if (logger.isInfoEnabled()) {
						logger
								.info("ActivateSubscriberImpl of FirstLUUpdateResponse null");

						endTime = System.currentTimeMillis();
						logger
								.info("ActivateSubscriberImpl of FirstLUUpdateResponse  Failed");
						if (logger.isInfoEnabled())
							logger.info(
									"ActivateSubscriberImpl.ActivateSubscriber  Failed..."
											+ (int) (endTime - startTime)
											+ "ms");
					}
				} else {
					if (smfResponse.getTransactionId() != null) {
						xBusInvoker = new FirstLuActivationInvoker();

						xBusRequest = new FirstLUActivationRequest();

						if (msisdn!= null) {
							xBusRequest.setMsisdn(String.valueOf(msisdn));
						} if (IMSI != null) {
							xBusRequest.setImsi(IMSI);
						}
						if(sim !=null){
						xBusRequest.setSim(sim);
						}
						if(sna !=null){
							xBusRequest.setSna(String.valueOf(sna));
							}
						if(nir !=null){
							xBusRequest.setNir(String.valueOf(nir));
							}
						if(TPID !=null){
							xBusRequest.setTpID(TPID);
						}
						xBusRequest.setCharges(0L);
						xBusRequest.setUserType(UserType.DEALER);
						xBusRequest.setZipCode("0909");
						xBusresponse = xBusInvoker.firstLuActivation(xBusRequest, headerDetails);
						
					} else {
						endTime = System.currentTimeMillis();
						logger
								.info("ActivateSubscriberInvoker.ActivateSubscriber Failed >>>> bcz of TransactionTracker transRef Num not equal to ActivateSubscriberRequest transRef Num ");
						if (logger.isInfoEnabled()) {
							logger.info(
									"ActivateSubscriberImpl.ActivateSubscriber  Success..."
											+ (int) (endTime - startTime)
											+ "ms");
						}
					}
				}
				if (xBusresponse == null) {

					if (logger.isDebugEnabled()) {
						logger
								.debug("ActivateSubscriberInvoker ActivateSubscriber response is  Null");
					}

					firstLuUpdateImpl = new FirstLUUpdateImpl();
					trackUpdateRequest = new FirstLUUpdateRequest();
					if(msisdn!=null){
					trackUpdateRequest.setOldMSISDN(String.valueOf(msisdn));
					}
					if(sim!=null){
					trackUpdateRequest.setSIM(sim);//simActivation sim reference
					}
					trackUpdateRequest.setCurrentStateId("91"); //91 For API Activation for FirstLU
					trackUpdateRequest.setStatus(SMFAgentConstants.FAILURE);
					trackUpdateRequest.setTransactionId(smfResponse
							.getTransactionId());
					trackUpdateRequest
							.setRemarks("Billing ActivateSubscriber API response is  Null");

					trackerUpdateResponse = firstLuUpdateImpl
							.firstLUUpdate(trackUpdateRequest,headerDetails);

					endTime = System.currentTimeMillis();

					if (logger.isInfoEnabled()) {
						logger.info(
								"trackerUpdateResponse.getMessage() is : "
										+ trackerUpdateResponse.getMessage()
										+ (int) (endTime - startTime) + "ms");
					}

					if (logger.isInfoEnabled()) {
						logger.info(
								"ActivateSubscriberImpl.ActivateSubscriber  Failed..."
										+ (int) (endTime - startTime) + "ms");
					}

				} else {

					if (logger.isDebugEnabled()) {
						logger
								.debug("ActivateSubscriberInvoker ActivateSubscriber response is  :"
										+ xBusresponse.getMsisdn());
					}

					firstLuUpdateImpl = new FirstLUUpdateImpl();
					trackUpdateRequest = new FirstLUUpdateRequest();
					if(msisdn!=null){
					trackUpdateRequest.setOldMSISDN(String.valueOf(msisdn));
					}
					if(sim!=null){
					trackUpdateRequest.setSIM(sim);//simActivation sim reference
					}
					trackUpdateRequest.setCurrentStateId("91"); //91 For API Activation for FirstLU
					trackUpdateRequest.setStatus(SMFAgentConstants.SUCCESS);
					trackUpdateRequest.setTransactionId(smfResponse
							.getTransactionId());
					trackUpdateRequest.setRemarks(SMFAgentConstants.SUCCESS);

					trackerUpdateResponse = firstLuUpdateImpl.firstLUUpdate(trackUpdateRequest,headerDetails);

					if (trackerUpdateResponse == null) {
						if (logger.isDebugEnabled()) {
							logger
									.debug("TrackerUpdateResponse response is  Null");
						}
						endTime = System.currentTimeMillis();

						if (logger.isInfoEnabled()) {
							logger.info(
									"ActivateSubscriberImpl.ActivateSubscriber  Failed..."
											+ (int) (endTime - startTime)
											+ "ms");
						}
					} else {

						if (logger.isDebugEnabled()) {
							logger
									.debug("TransactionUpdateInvoker response is  :"
											+ trackerUpdateResponse
													.getMessage());

						}
						if (logger.isInfoEnabled()) {
							logger.info(
									"TransactionUpdateInvoker.transactionUpdate  Success..."
											+ (int) (endTime - startTime)
											+ "ms");
						}

						endTime = System.currentTimeMillis();

						if (logger.isInfoEnabled()) {
							logger.info(
									"trackerUpdateResponse.getMessage() is : "
											+ trackerUpdateResponse
													.getMessage()
											+ (int) (endTime - startTime)
											+ "ms");
						}

						if (logger.isInfoEnabled()) {
							logger.info(
									"ActivateSubscriberImpl.ActivateSubscriber  Success..."
											+ (int) (endTime - startTime)
											+ "ms");
						}
					}
				}

			}else{
				logger
				.error(
						" ActivateSubscriberImpl--->ActivateSubscriber- GetSubscriberInfoResponse or mDNBasedGetNwIdResponse is null");
			}

		} catch (SMFAgentException e) {

			logger
					.error(
							" ActivateSubscriberImpl--->ActivateSubscriber- MSPGWException:");
			if (smfResponse != null) {
				firstLuUpdateImpl = new FirstLUUpdateImpl();
				trackUpdateRequest = new FirstLUUpdateRequest();
				if(sim!=null){
				trackUpdateRequest.setSIM(sim);//simActivation sim Reference
				}
				if(msisdn!=null){
					trackUpdateRequest.setOldMSISDN(String.valueOf(msisdn));
				}
				trackUpdateRequest.setCurrentStateId("91"); //91 For API Activation for FirstLU
				trackUpdateRequest.setStatus(SMFAgentConstants.FAILURE);
				trackUpdateRequest.setTransactionId(smfResponse.getTransactionId());
				if(e.getErrorMessage()!=null){
					trackUpdateRequest.setRemarks(e.getErrorCode() + "#"
							+ e.getErrorMessage());
				}else{
					trackUpdateRequest.setRemarks(e.getErrorCode() + "#"
							+ SMFAgentConstants.FAILURE);
				}

				trackerUpdateResponse = firstLuUpdateImpl.firstLUUpdate(trackUpdateRequest,headerDetails);
			}
			endTime = System.currentTimeMillis();
			ErrorDetailsType errorDetailsType = Utilities
					.fillErrorDetailsType(String.valueOf(e.getErrorCode()), e.getErrorMessage());
			logger.error(
					" ActivateSubscriberImpl ---->ActivateSubscriber Failure:"
							+ (int) (endTime - startTime) + "ms");
			logger.error(" " + errorDetailsType.getErrorCode() + " "
					+ errorDetailsType.getErrorMessage());

			throw new SMFAgentException(errorDetailsType.getErrorCode(),errorDetailsType.getErrorMessage());

		} finally {

			xBusInvoker = null;
			firstLuUpdateImpl = null;
		}

		return xBusresponse;

	}

	private GetSubscriberInfoResponse getDetails(String msisdn, HeaderDetails headerDetails) throws SMFAgentException {

		GetSubscriberInfoRequest ibarequest = new GetSubscriberInfoRequest();

		OptionType type = new OptionType();
		if(msisdn!=null){
		type.setMSISDN(msisdn);
		}
		ibarequest.setOption(type);

		GetSubscriberInfoInvoker ibaInvoker = new GetSubscriberInfoInvoker();

		logger
				.info("ActivateSubscriberImpl-- invoking the iba getSubscriberInfo api for accountID");
		getSubscriberInfoResponse = new GetSubscriberInfoResponse();
		try {
			getSubscriberInfoResponse = ibaInvoker.getSubscriberInfoInvoker(
					headerDetails, ibarequest); // calling IBA Invoker
			if (getSubscriberInfoResponse != null
					&& getSubscriberInfoResponse.getStatus() != null) {
				if (getSubscriberInfoResponse.getStatus()
						.equalsIgnoreCase("EX")) {
					logger
							.error(
									
									" ActivateSubscriberImpl ---->ActivateSubscriber --- Account in EX State,we updating error code to 71098");
					throw Utilities.setSMFAgentException(71098L);
				}
			}
		} catch (SMFAgentException e) {
			if (String.valueOf(e.getErrorCode()).equalsIgnoreCase("68048")) {
				logger
						.error(
								" ActivateSubscriberImpl ---->getDetails Errocode updated to 68048 - 62004");
				throw Utilities.setSMFAgentException(62004L);
			}
			else{
				throw new SMFAgentException(e.getErrorCode(),e.getErrorMessage()!=null?e.getErrorMessage():null);
			}
		}

		return getSubscriberInfoResponse;
	}
	
	private MDNBasedGetNwIdResponse getSimDetails(String sim, HeaderDetails headerDetails) throws SMFAgentException {

		MDNBasedGetNwIdRequest ibarequest = new MDNBasedGetNwIdRequest();

		if(sim !=null){
		ibarequest.setSIM(sim);
		}
		MDNbasedGetNwIdInvoker getNwIdInvoker = new MDNbasedGetNwIdInvoker();

		logger
				.info("ActivateSubscriberImpl-- invoking the iba MDNbasedGetNwId api for IMSI");
		mDNBasedGetNwIdResponse = new MDNBasedGetNwIdResponse();
		try {
			mDNBasedGetNwIdResponse = getNwIdInvoker.MDNbasedGetNwId(headerDetails, ibarequest); // calling IBA Invoker
			
		} catch (SMFAgentException e) {
			if (String.valueOf(e.getErrorCode()).equalsIgnoreCase("68048")) {
				logger
						.error(
								" ActivateSubscriberImpl ---->getDetails Errocode updated to 68048 - 62004");
				throw Utilities.setSMFAgentException(62004L);
			}
			else{
				throw new SMFAgentException(e.getErrorCode(),e.getErrorMessage()!=null?e.getErrorMessage():null);
			}
		}

		return mDNBasedGetNwIdResponse;
	}

}
