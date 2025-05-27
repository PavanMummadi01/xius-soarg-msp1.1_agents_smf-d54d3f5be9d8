package com.xius.smf.webservices.smfservices;

import java.rmi.RemoteException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import net.bcgi.util.db.SPFactory;

import com.xius.agent.smf.smfmanagement.InsertSubsFlowTrackerRequest;
import com.xius.agent.smf.smfmanagement.InsertSubsFlowTrackerResponse;
import com.xius.billing.SubscriberManagement_xsd.GetSubDataRequest;
import com.xius.billing.SubscriberManagement_xsd.GetSubDataResponse;
import com.xius.smf.client.invoker.GetSubDataInvoker;
import com.xius.smf.domaindata.InsertSubsFlowTrackerData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

@Service("InsertSubsFlowTrackerImpl")
public class InsertSubsFlowTrackerImpl {

	private  static final Logger logger = LogManager.getLogger(InsertSubsFlowTrackerImpl.class.getSimpleName());


	public InsertSubsFlowTrackerResponse InsertSubsFlowTracker(
			InsertSubsFlowTrackerRequest request, HeaderDetails headerDetails)
			throws RemoteException,SMFAgentException, com.xius.smf.exceptions.SMFAgentException {

		InsertSubsFlowTrackerResponse response = new InsertSubsFlowTrackerResponse();

		InsertSubsFlowTrackerData domainData = null;
		logger.info("setRequestData........................");

		domainData = setRequestData(request, headerDetails);

		String msisdnNonCC = null;
		if (request.getRequestData() != null) {
			if (request.getRequestData() != null) {
				String splitArr[] = request.getRequestData().split("~");

				msisdnNonCC = splitArr[0];
				
				String prop5Gsimswap=InitiateAll.getSMFProps().getProperty("InsertSubFLowSimSwapFlowId");
				
				if(prop5Gsimswap!=null && request.getFlowId().equalsIgnoreCase(prop5Gsimswap)){
					
					msisdnNonCC = splitArr[1];
				}
				
			}

		}

		// getsubdata
		try {
			GetSubDataRequest idRequest = new GetSubDataRequest();

			com.xius.billing.SubscriberManagement_xsd.AccountType account1 = new com.xius.billing.SubscriberManagement_xsd.AccountType();
			account1.setMSISDN(msisdnNonCC);
			idRequest.setAccount(account1);

			GetSubDataInvoker getSubDataInvoker = new GetSubDataInvoker();
			GetSubDataResponse resp = getSubDataInvoker.GetSubData(
					headerDetails, idRequest);

			if (resp != null) {
				domainData.setPi_msisdn_no(Long.parseLong(msisdnNonCC));
				if (resp.getAccountType() != null) {
					domainData.setPi_acc_type(Long.parseLong(resp
							.getAccountType()));
				}
				if (resp.getAccountID() != null) {
					domainData.setPi_account_id(resp.getAccountID());
				}
				if (resp.getSIM() != null) {
					domainData.setPi_sim_serial_no(resp.getSIM());
				}
				if (resp.getIMSI() != null) {
					domainData.setPi_imsi_no(resp.getIMSI());
				}
				if (resp.getAccountStatus() != null) {
					domainData.setPi_acct_status(resp.getAccountStatus());
				}

			}

		} catch (Exception e) {
			logger.info(
					"Exception in InsertSubsFlowTracker while getsubdata for MSISDN="
							+ msisdnNonCC);
		}
		// end of getsubdata

		SPFactory factory = ServiceUtils.executeSPWithOutCommit(
				"pro_subs_bulk_flow_tracker_insert", domainData, domainData);
		if (logger.isInfoEnabled()) {
			logger.info( domainData.toString());
		}
		Utilities.commitOrRollback(factory, domainData.getPo_error_code());
		if (logger.isInfoEnabled()) {

			logger.info(
					"Error Code from  pro_subs_bulk_flow_tracker_insert  ==>"
							+ domainData.getPo_error_code());
			logger.info(
					"Error Msg from  pro_subs_bulk_flow_tracker_insert  ==>"
							+ domainData.getPo_error_desc());
		}
		if (domainData.getPo_error_code() == 0) {
			response = setWebserviceResponse(domainData);
		}

		else {
			throw new SMFAgentException(domainData.getPo_error_code().toString(),domainData.getPo_error_desc());
		}

		return response;

	}

	public InsertSubsFlowTrackerData setRequestData(
			InsertSubsFlowTrackerRequest request, HeaderDetails headerDetails) {

		InsertSubsFlowTrackerData data = new InsertSubsFlowTrackerData();
		String requestData = "";
		if (headerDetails.getNetworkID() != null)
			data.setPi_network_id(headerDetails.getNetworkID());
		if (request.getRequestData() != null)
			requestData = request.getRequestData();
		if (request.getFlowId() != null)
			data.setPi_flow_id(request.getFlowId());

		if (request.getUserDefined1() != null) {
			requestData = requestData + "~" + request.getUserDefined1();
		}
		if (request.getUserDefined2() != null) {
			requestData = requestData + "~" + request.getUserDefined2();
		}
		if (request.getUserDefined3() != null) {
			data.setPi_trans_id(request.getUserDefined3());
		}
		if (request.getUserId() != null) {
			data.setPi_user_id(request.getUserId());
		}

		if (headerDetails.getLoginID() != null) {
			data.setPi_user_id(headerDetails.getLoginID());
		}

		if (request.getChannel() != null) {
			data.setPi_channel(request.getChannel());
		}
		
		data.setPi_request_data(requestData);
		return data;
	}

	private InsertSubsFlowTrackerResponse setWebserviceResponse(
			InsertSubsFlowTrackerData domainData) {

		InsertSubsFlowTrackerResponse response = new InsertSubsFlowTrackerResponse();
		if (domainData.getPo_transaction_id() != null)
			response.setTransID(domainData.getPo_transaction_id());
		return response;

	}

}
