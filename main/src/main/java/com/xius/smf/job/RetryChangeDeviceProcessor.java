package com.xius.smf.job;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.xius.smf.client.ws.XBusRetryChangeDeviceAppClient;
import com.xius.smf.domaindata.BulkChangeMsisdnProcessData;
import com.xius.smf.domaindata.BulkChangeMsisdnStatusUpdateData;
import com.xius.smf.domaindata.BulkSimSwapProcessData;
import com.xius.smf.domaindata.BulkSimSwapStatusUpdateData;
import com.xius.smf.domaindata.GetBulkChangeMsisdnDtlsCursorData;
import com.xius.smf.domaindata.GetBulkSimSwapDtlsCursorData;
import com.xius.smf.domaindata.GetRetryChangeDeviceDtlsCursorData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
import com.xius.xbus.messages.provisioning.device.ChangeDeviceRetryResponse;

public class RetryChangeDeviceProcessor implements Runnable {
	
	private static final Logger logger = LogManager.getLogger(RetryChangeDeviceProcessor.class.getSimpleName());

	CountDownLatch latch = null;
	GetRetryChangeDeviceDtlsCursorData data = null;
	BulkSimSwapStatusUpdateData updatedata = new BulkSimSwapStatusUpdateData();
	BulkChangeMsisdnStatusUpdateData mdnUpdatedata= new BulkChangeMsisdnStatusUpdateData();
	

	String transID = null;
	Long nwID = null;

	String failedNode = "~";
	String simSaleTransID = "~";

	BulkSimSwapFinalStatUpdate finalupdate = new BulkSimSwapFinalStatUpdate();
	BulkChangeMsisdnStatusUpdate finalMSDNupdate = new BulkChangeMsisdnStatusUpdate();

	public RetryChangeDeviceProcessor(CountDownLatch latch,
			GetRetryChangeDeviceDtlsCursorData data) {
		this.latch = latch;
		this.data = data;

	}

	@Override
	public void run() {

		if (logger.isInfoEnabled())
			logger.info("RetryChangeDeviceProcessor - run method called");

		try {
			// call xBus call deviceServiceClient
			XBusRetryChangeDeviceAppClient deviceServiceClient = new XBusRetryChangeDeviceAppClient();
			
			ChangeDeviceRetryResponse resp = null;

			ArrayList<GetBulkSimSwapDtlsCursorData> simSwapCursordata = null;
			ArrayList<GetBulkChangeMsisdnDtlsCursorData> mdnCcursordata = null;

			logger.info("Activity_type::::::::::: "+data.getActivity_type()+" , TransID :: "+data.getTransaction_id());
			
			if (data.getActivity_type() != null
					&& data.getActivity_type().equalsIgnoreCase("105")
					&& data.getTransaction_id() != null) {
				BulkSimSwapProcessData simSwapData = new BulkSimSwapProcessData();
				if (data.getNetwork_id() != null) {
					simSwapData.setPi_network_id(data.getNetwork_id());
				}
				if (data.getTransaction_id() != null) {
					simSwapData.setPi_trans_id(Long.parseLong(data
							.getTransaction_id()));
				}
				
				simSwapCursordata = fetchSimSwapDataFromDb(simSwapData);
				if(simSwapCursordata!=null){
				for(GetBulkSimSwapDtlsCursorData curData:simSwapCursordata){
					//resp = deviceServiceClient.doxBusSimSwapRetry(simSwapCursordata.get(0));	
					simSaleTransID="~"+curData.getSimSaleTransID();
					resp = deviceServiceClient.doxBusSimSwapRetry(curData);
				}}else {logger.info("SimSwapCursordata::::::::::: is null"+" , TransID :: "+data.getTransaction_id());}

			} else if (data.getActivity_type() != null
					&& data.getActivity_type().equalsIgnoreCase("106")
					&& data.getTransaction_id() != null) {

				BulkChangeMsisdnProcessData changeMsisdnData = new BulkChangeMsisdnProcessData();
				if (data.getNetwork_id() != null) {
					changeMsisdnData.setPi_network_id(data.getNetwork_id());
				}
				if (data.getTransaction_id() != null) {
					changeMsisdnData.setPi_transaction_id(data
							.getTransaction_id());
				}
				mdnCcursordata = fetchChangeMSDNDataFromDb(changeMsisdnData);
				if(mdnCcursordata!=null){
				for(GetBulkChangeMsisdnDtlsCursorData chngMsisdn:mdnCcursordata){
					simSaleTransID="~"+chngMsisdn.getSimSaleTransID();
					resp = deviceServiceClient.doxBusChangeMSISDNRetry(chngMsisdn);
				}}else{logger.info("Change MDN Ccursordata::::::::::: is null"+" , TransID :: "+data.getTransaction_id());}
			}
			
			if (resp != null && resp.getFailedNode() != null) {
				failedNode = resp.getFailedNode() + "~";
			}
			
			if (resp != null
					&& (resp.getErrors() != null && resp.getErrors().length > 0)) {
				logger.debug(resp.getErrors()[0].getErrorCode());
				logger.debug(resp.getErrors()[0].getErrorMessage());
				
				logger.debug(":::got failed from  xbus:::");
				if (data.getActivity_type() != null
						&& data.getActivity_type().equalsIgnoreCase("105")
						&& data.getTransaction_id() != null) {
					updatedata.setPi_network_id(data.getNetwork_id());
					updatedata.setTrans_id(data.getTransaction_id());
					updatedata.setFinalStatus(SMFAgentConstants.FAILURE);
					updatedata.setRemarks(failedNode
							+ resp.getErrors()[0].getErrorCode() + "#"
							+ resp.getErrors()[0].getErrorMessage()+simSaleTransID);
				}
			
					// MDN final status update 
				else if(data.getActivity_type() != null
					&& data.getActivity_type().equalsIgnoreCase("106")){
				mdnUpdatedata.setPi_network_id(data.getNetwork_id());
				mdnUpdatedata.setPi_trans_id(data.getTransaction_id());
				mdnUpdatedata.setPi_status(SMFAgentConstants.FAILURE);
				
				mdnUpdatedata.setPi_remarks(failedNode+resp.getErrors()[0]
						.getErrorCode()
						+ "#" + resp.getErrors()[0].getErrorMessage()+simSaleTransID);
			}
				
				
			} else if (resp != null) {
				logger.debug(":::got sucess from  xbus:::");
				if (data.getActivity_type() != null
						&& data.getActivity_type().equalsIgnoreCase("105")
						&& data.getTransaction_id() != null) {
					
				
				updatedata.setPi_network_id(data.getNetwork_id());
				updatedata.setFinalStatus(SMFAgentConstants.SUCCESS);
				updatedata.setTrans_id(data.getTransaction_id());
				updatedata.setRemarks(SMFAgentConstants.SUCCESS);
				}
				if(data.getActivity_type() != null
						&& data.getActivity_type().equalsIgnoreCase("106")){
					
					mdnUpdatedata.setPi_network_id(data.getNetwork_id());
					mdnUpdatedata.setPi_trans_id(data.getTransaction_id());
					mdnUpdatedata.setPi_status(SMFAgentConstants.SUCCESS);
					mdnUpdatedata.setPi_remarks(SMFAgentConstants.SUCCESS);
				}

			} else if (resp == null) {
				logger.debug(":::got NULL from  xbus:::");
				if (data.getActivity_type() != null
						&& data.getActivity_type().equalsIgnoreCase("105")
						&& data.getTransaction_id() != null) {
					
				
				updatedata.setPi_network_id(data.getNetwork_id());
				updatedata.setFinalStatus(SMFAgentConstants.FAILURE);
				updatedata.setTrans_id(data.getTransaction_id());
				updatedata
						.setRemarks(failedNode + "response is NULL from xBus"+simSaleTransID);
				}
				
				if(data.getActivity_type() != null
						&& data.getActivity_type().equalsIgnoreCase("106")){
					
					mdnUpdatedata.setPi_network_id(data.getNetwork_id());
					mdnUpdatedata.setPi_trans_id(data.getTransaction_id());
					mdnUpdatedata.setPi_status(SMFAgentConstants.FAILURE);
					mdnUpdatedata.setPi_remarks(failedNode + "response is NULL from xBus"+simSaleTransID);
				}
			}

			if (resp != null
					&& (resp.getErrors() != null && resp.getErrors().length > 0)) {
				logger.debug(resp.getErrors()[0].getErrorCode());
				logger.debug(resp.getErrors()[0].getErrorMessage());

				if (data.getActivity_type() != null
						&& data.getActivity_type().equalsIgnoreCase("105")
						&& data.getTransaction_id() != null) {
				logger.debug(":::got failed from  xbus:::");
				updatedata.setPi_network_id(data.getNetwork_id());
				updatedata.setTrans_id(data.getTransaction_id());
				updatedata.setFinalStatus(SMFAgentConstants.FAILURE);

				updatedata.setRemarks(failedNode
						+ resp.getErrors()[0].getErrorCode() + "#"
						+ resp.getErrors()[0].getErrorMessage()+simSaleTransID);
				updatedata.setInternal_ref_id(data.getTransaction_id() + "");
				}
				if(data.getActivity_type() != null
						&& data.getActivity_type().equalsIgnoreCase("106")){
					mdnUpdatedata.setPi_network_id(data.getNetwork_id());
					mdnUpdatedata.setPi_trans_id(data.getTransaction_id());
					mdnUpdatedata.setPi_status(SMFAgentConstants.FAILURE);
					
					mdnUpdatedata.setPi_remarks(failedNode+resp.getErrors()[0]
							.getErrorCode()
							+ "#" + resp.getErrors()[0].getErrorMessage()+simSaleTransID);
				}

			} else if (resp != null) {
				logger.debug(":::got sucess from  xbus:::");
				if (data.getActivity_type() != null
				&& data.getActivity_type().equalsIgnoreCase("105")
				&& data.getTransaction_id() != null) {
				updatedata.setPi_network_id(data.getNetwork_id());
				updatedata.setFinalStatus(SMFAgentConstants.SUCCESS);
				updatedata.setInternal_ref_id(data.getTransaction_id() + "");
				updatedata.setTrans_id(data.getTransaction_id());
				updatedata.setRemarks(SMFAgentConstants.SUCCESS);
				}
				if(data.getActivity_type() != null
						&& data.getActivity_type().equalsIgnoreCase("106")){
					
					mdnUpdatedata.setPi_network_id(data.getNetwork_id());
					mdnUpdatedata.setPi_trans_id(data.getTransaction_id());
					mdnUpdatedata.setPi_status(SMFAgentConstants.SUCCESS);
					mdnUpdatedata.setPi_remarks(SMFAgentConstants.SUCCESS);
				}


			} else if (resp == null) {
				logger.debug(":::got NULL from  xbus:::");
				if (data.getActivity_type() != null
						&& data.getActivity_type().equalsIgnoreCase("105")
						&& data.getTransaction_id() != null) {
				updatedata.setPi_network_id(data.getNetwork_id());
				updatedata.setFinalStatus(SMFAgentConstants.FAILURE);
				updatedata.setTrans_id(data.getTransaction_id());
				updatedata.setRemarks(failedNode + "response is NULL from xBus"+simSaleTransID);
				}
				if(data.getActivity_type() != null
						&& data.getActivity_type().equalsIgnoreCase("106")){
					
					mdnUpdatedata.setPi_network_id(data.getNetwork_id());
					mdnUpdatedata.setPi_trans_id(data.getTransaction_id());
					mdnUpdatedata.setPi_status(SMFAgentConstants.FAILURE);
					mdnUpdatedata.setPi_remarks(failedNode + "response is NULL from xBus"+simSaleTransID);
				}

			}
			

		} catch (SMFAgentException _exp) {
			logger.debug(":::got failed from  xbus:::");
			if (data.getActivity_type() != null
					&& data.getActivity_type().equalsIgnoreCase("105")
					&& data.getTransaction_id() != null) {
			updatedata.setPi_network_id(data.getNetwork_id());
			updatedata.setTrans_id(data.getTransaction_id());
			updatedata.setFinalStatus(SMFAgentConstants.FAILURE);
			updatedata.setRemarks(failedNode + _exp.getErrorCode() + "#"
					+ _exp.getErrorMessage()+simSaleTransID);
			}
			if(data.getActivity_type() != null
					&& data.getActivity_type().equalsIgnoreCase("106")){
				
				mdnUpdatedata.setPi_network_id(data.getNetwork_id());
				mdnUpdatedata.setPi_trans_id(data.getTransaction_id());
				mdnUpdatedata.setPi_status(SMFAgentConstants.FAILURE);
				mdnUpdatedata.setPi_remarks(failedNode + _exp.getErrorCode() + "#"
						+ _exp.getErrorMessage()+simSaleTransID);
			}
			
			} catch (Exception _exp) {
			logger.error(Utilities.getStackTrace(_exp));
		}

		finally {
			try {
				latch.countDown();
				
				if(data.getActivity_type() != null
						&& data.getActivity_type().equalsIgnoreCase("106")){
					finalMSDNupdate.statuUpdate(mdnUpdatedata);
				}else{
					finalupdate.statuUpdate(updatedata);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 
	 * @param GET
	 *            DATA FOR SIM SWAP
	 * @return
	 * @throws SMFAgentException
	 */
	private ArrayList<GetBulkSimSwapDtlsCursorData> fetchSimSwapDataFromDb(
			BulkSimSwapProcessData data) throws SMFAgentException {

		ArrayList<GetBulkSimSwapDtlsCursorData> cursordate = null;
		logger.info("Data Sending to DB (pro_get_sim_swap_action_dtls):::::::" + data.toString());
		ServiceUtils._executeStoredProcedure("pro_get_sim_swap_action_dtls", data, data);
		
		if (data.getPo_error_code() == 0) {
			cursordate = new ArrayList<GetBulkSimSwapDtlsCursorData>();
			cursordate = data.getPo_sim_swap_cursor();
		}

		return cursordate;
	}

	/**
	 * 
	 * @param GET
	 *            DATA FOR CHANGE MSISDN
	 * @return
	 * @throws SMFAgentException
	 */
	private ArrayList<GetBulkChangeMsisdnDtlsCursorData> fetchChangeMSDNDataFromDb(
			BulkChangeMsisdnProcessData data) throws SMFAgentException {

		ArrayList<GetBulkChangeMsisdnDtlsCursorData> cursordate = null;
		logger.info("Data Sending to DB (pro_get_chg_msisdn_upld_dtls):::::::: " + data.toString());
		ServiceUtils._executeStoredProcedure("pro_get_chg_msisdn_upld_dtls", data, data);

		logger.info("pro_get_chg_msisdn_upld_dtls error code::::: " + data.getPo_error_code());
		
		if (data.getPo_error_code() == 0) {
			cursordate = new ArrayList<GetBulkChangeMsisdnDtlsCursorData>();
			cursordate = data.getPo_chg_msisdn_dtls();

		}

		return cursordate;
	}

}
