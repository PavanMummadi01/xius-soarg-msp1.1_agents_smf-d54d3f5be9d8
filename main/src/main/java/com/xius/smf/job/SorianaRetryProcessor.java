package com.xius.smf.job;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.concurrent.CountDownLatch;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.xius.smf.domaindata.SorianaRetryCurData;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.Utilities;
import com.xius.xbus.messages.common.SecurityId;
import com.xius.xbus.messages.common.ServiceContext;
import com.xius.xbus.messages.common.UserType;
import com.xius.xbus.messages.provisioning.device.RetryRequest;
import com.xius.xbus.services.provisioning.device.DeviceServiceBindingStub;
import com.xius.xbus.services.provisioning.device.DeviceServiceLocator;

public class SorianaRetryProcessor implements Runnable  {


	private static final Logger logger = LogManager.getLogger(SorianaRetryProcessor.class.getSimpleName());

	
CountDownLatch latch=null;
	
	
SorianaRetryCurData cursorData=null;
	
	
	public SorianaRetryProcessor(CountDownLatch latch,SorianaRetryCurData curData){
		
		this.latch=latch;
		this.cursorData=curData;
		
	}
	public void run() {
	
		logger.info("---------In SorianaRetryProcessor run------------transid "+cursorData.getRetry_transaction_id());
		
		
		logger.info("---------In SorianaRetryProcessor run------------cursorData "+cursorData.toString());
		
		 
		try {
		xbusInvoker(cursorData);
		
		}
		catch (MalformedURLException e) {
			logger.error("MalformedURLException in SorianaRetryProcessor transid "+cursorData.getRetry_transaction_id()+Utilities.getStackTrace(e));
		} catch (RemoteException e) {
			logger.error("RemoteException in SorianaRetryProcessor transid "+cursorData.getRetry_transaction_id()+Utilities.getStackTrace(e));
		}
		finally {			
			latch.countDown();
		}
	}
	
	
	
	
	
	
	public void xbusInvoker(SorianaRetryCurData curData) throws MalformedURLException, RemoteException
	{
		
		String url = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.XBUS_URL);
		
			
			RetryRequest request =formXbusRequest(curData);
			
			DeviceServiceBindingStub stub=new DeviceServiceBindingStub(new URL(url), new DeviceServiceLocator());
		
			stub.retry(request);
		
		
	}
	
	
	public RetryRequest formXbusRequest(SorianaRetryCurData curData)
	{
		RetryRequest request=new RetryRequest();
		
		
		if(curData.getActivity_type()!=null)
		request.setActivityId(curData.getActivity_type());
		
		if(curData.getBussines_account_id()!=null)
		request.setBAN(curData.getBussines_account_id());
		
		
		if(curData.getImsi()!=null)
		request.setNewImsi(curData.getImsi().toString());
		
		if(curData.getImsi()!=null)
		request.setOldImsi(curData.getImsi().toString());
		
		if(curData.getSim_serial_no()!=null)
		request.setNewSim(curData.getSim_serial_no().toString());
		
		if(curData.getSim_serial_no()!=null)
		request.setOldSim(curData.getSim_serial_no().toString());
		
		if(curData.getMsisdn_no()!=null)
		request.setNewMsisdn(curData.getMsisdn_no().toString());
		
		if(curData.getOld_msisdn_no()!=null)
		request.setOldMsisdn(curData.getOld_msisdn_no().toString());
		
		if(curData.getTrans_id()!=null)
		request.setTransactionId(curData.getTrans_id());
		
		if(curData.getRetry_transaction_id()!=null)
		request.setReTransId(curData.getRetry_transaction_id());
		
		
		SecurityId securityId=new SecurityId();
		securityId.setUserAccountName("JOB");
		securityId.setUserAccountPassword("12345678"); //dummy
		
		ServiceContext serviceContext=new ServiceContext();
		
		if(curData.getNetwork_id()!=null)
		serviceContext.setCarrierId(curData.getNetwork_id().toString());
		
		request.setMessageID("123"); //dummy value
		request.setUserType(UserType.CCUSER);
		request.setSecurityId(securityId);
		request.setServiceContext(serviceContext);
		
		return request;
		
		
	}


	
	
	
}
