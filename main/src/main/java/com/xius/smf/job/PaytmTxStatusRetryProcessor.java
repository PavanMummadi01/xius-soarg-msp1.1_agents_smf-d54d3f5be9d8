package com.xius.smf.job;

import java.util.TreeMap;
import java.util.concurrent.CountDownLatch;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.bcgi.util.db.SPFactory;

//import com.paytm.merchant.CheckSumServiceHelper;
import com.xius.smf.client.invoker.UpdatePaymentStatusInvoker;
import com.xius.smf.client.paytm.PaytmTxStatusInvoker;
import com.xius.smf.client.paytm.PaytmTxStatusRequest;
import com.xius.smf.client.paytm.PaytmTxStatusResponse;
import com.xius.smf.domaindata.PaymentRetryUpdateData;
import com.xius.smf.domaindata.PaytmTxStatusRetryCursorData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
import com.xius.xbus.messages.common.SecurityId;
import com.xius.xbus.messages.common.ServiceContext;
import com.xius.xbus.messages.common.UserType;
import com.xius.xbus.messages.selfcare.services.UpdatePaymentStatusRequest;
import com.xius.xbus.messages.selfcare.services.UpdatePaymentStatusResponse;

/*******************************************************************
 * Company XIUS (Megasoft Pvt Ltd Hyderabad,INDIA)
 * � Copyright 2006 MEGASOFT. 
 *
 * Package      : com.xius.smf.job;
 * Name of File : PaytmTxStatusRetryProcessor.java
 * Date /Year   : May 28, 2018
 * Author       : Aditya Thumma
 * Discription  :   
 * 				  
 * 
 *
 * Method names : 
 * 
 * Modifications
 * Method Name  |  Date   |  Author  | Explanation
 * -------------------------------------------------------------              
 *              |         |          |
 *              |         |          | 
 *             
 ********************************************************************/

public class PaytmTxStatusRetryProcessor implements Runnable {
	private static final Logger logger = LogManager.getLogger(PaytmTxStatusRetryProcessor.class.getSimpleName());

	CountDownLatch latch = null;
	PaytmTxStatusRetryCursorData cursordata=null;
	
	public PaytmTxStatusRetryProcessor(CountDownLatch latch,PaytmTxStatusRetryCursorData cursordata)
	{
		this.latch=latch;
		this.cursordata=cursordata;
		
	}
	
	public void run() {
		
		PaytmTxStatusRequest request=null;
		PaytmTxStatusResponse response=null;
		
		request=setPaytmTxStatustRequest(cursordata);
		
		try {
			PaytmTxStatusInvoker invoker=new PaytmTxStatusInvoker();
			response=invoker.callPayTM(request,cursordata);
			
			
			
			if (response != null)
				try {
					updatePaymentStatus(response, cursordata);

				} catch (SMFAgentException e) {
					
					logger.error("SMFAgentException in PaytmTxStatusRetryProcessor "+Utilities.getStackTrace(e));
				}
			
			
		
			
		
		}
		finally {			
			latch.countDown();
		}

		
		
		
	}
	public PaytmTxStatusRequest setPaytmTxStatustRequest(PaytmTxStatusRetryCursorData cursordata)
	{
		PaytmTxStatusRequest request=new PaytmTxStatusRequest();
		TreeMap<String,String> parameters = new TreeMap<String,String>();
		
		String mId=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.MID);
		String marchentKey=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.MARCHENTKEY);
		
		request.setmId(mId);
		parameters.put("MID", mId);
		
		
		request.setOrderId(cursordata.getTransaction_id());
		parameters.put("ORDERID", cursordata.getTransaction_id());
		
		String checksum="";
		try {
			//checksum = CheckSumServiceHelper.getCheckSumServiceHelper().genrateCheckSum(marchentKey, parameters);
			
			logger.info("=====================CHECKSUM===================== "+checksum);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				request.setChecksumhash(checksum);
		
		return request;
	}

	
	public void updatePaymentStatus(PaytmTxStatusResponse response,
			PaytmTxStatusRetryCursorData cursorData) throws SMFAgentException {
		UpdatePaymentStatusRequest xbusReq = null;
		
		
		xbusReq = setUpdatePaymentStatusReq(response, cursorData);
		retryTransUpdate(xbusReq,cursorData,response);
		if(xbusReq.getResult().equalsIgnoreCase("0") || xbusReq.getResult().equalsIgnoreCase("1"))
		{
		UpdatePaymentStatusInvoker invoker=new UpdatePaymentStatusInvoker();
			
		UpdatePaymentStatusResponse xbusResp=invoker.updatePaymentStatus(xbusReq);
		}
		

	}
	
	public UpdatePaymentStatusRequest setUpdatePaymentStatusReq(
			PaytmTxStatusResponse response, PaytmTxStatusRetryCursorData cursorData) {
		UpdatePaymentStatusRequest req = new UpdatePaymentStatusRequest();
		
		if(response.getStatus().equalsIgnoreCase("PENDING") || response.getStatus().equalsIgnoreCase("OPEN"))
		{
			
			req.setResult("2");
			req.setResponseMessage(response.getRespMsg());
		}
		else if(response.getStatus().contains("SUCCESS"))
		{
			req.setResult("0");
			req.setResponseMessage("SUCCESS");
			
		}
		else if(response.getStatus().contains("FAILURE")){
			req.setResult("1");
			req.setResponseMessage(response.getRespMsg());
			
		}

		
		if(cursorData.getMsisdn_no()!=null)
			req.setMSISDN(cursorData.getMsisdn_no().toString());
		
		if(cursorData.getRc_code()!=null)
			req.setRcCode(cursorData.getRc_code());
		
		if(cursorData.getChannel()!=null)
			req.setChannel(cursorData.getChannel());
		
		if(response.getTxnId()!=null)
			req.setExternalTransId(response.getTxnId());
		else
			req.setExternalTransId(String.valueOf(System.currentTimeMillis()));
		
		req.setTransactionId(response.getOrderId());
		
		req.setMessageID("123");
		
		req.setPaymentType(cursorData.getPayment_type());
		
		
		req.setUserType(UserType.SUBSCRIBER);
		
		
		SecurityId securityId=new SecurityId();
		
		securityId.setUserAccountName(cursorData.getUser_id());
		
		securityId.setUserAccountPassword("123423"); //dummy value
		
		req.setSecurityId(securityId);
		
		ServiceContext serviceContext=new ServiceContext();
		
		serviceContext.setCarrierId(cursorData.getNetwork_id().toString());
		
		req.setServiceContext(serviceContext);
		
		
		return req;
	}
	
	public void retryTransUpdate(UpdatePaymentStatusRequest req, PaytmTxStatusRetryCursorData cursorData,PaytmTxStatusResponse response)
	{
		
		
		PaymentRetryUpdateData data = new PaymentRetryUpdateData();
		
		data.setPi_retry_transaction_id(cursorData.getRetry_transaction_id());
		data.setPi_network_id(cursorData.getNetwork_id().longValue());
		if(req.getResult().equalsIgnoreCase("0")){
			data.setPi_status("SUCCESS");
			
		}
		else {
		data.setPi_status("FAILURE");
		}
		
		data.setPi_ext_err_code(response.getRespCode());
		
		data.setPi_ext_trans_id(req.getExternalTransId());
		
		data.setPi_ext_error_msg(req.getResponseMessage());
		
		data.setPi_payment_type(cursorData.getPayment_type());
		
		try {
			SPFactory spfactory = ServiceUtils.executeSPWithOutCommit("pro_payment_retry_upd", data, data);
			Long errorcode = data.getPo_error_code();
			ServiceUtils.commit(spfactory);
		
		} catch (SMFAgentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}

}