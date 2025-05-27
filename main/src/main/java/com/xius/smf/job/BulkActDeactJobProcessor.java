package com.xius.smf.job;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.concurrent.CountDownLatch;

import javax.xml.soap.SOAPException;

import net.bcgi.util.db.SPFactory;

import org.apache.axis.AxisFault;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.xius.billing.AccountManagement_xsd.MDNBasedGetNwIdRequest;
import com.xius.smf.client.invoker.MDNbasedGetNwIdInvoker;
import com.xius.smf.domaindata.BulkActDeactCursorData;
import com.xius.smf.domaindata.BulkActDeactUpdateData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
import com.xius.xbus.messages.common.AccountType;
import com.xius.xbus.messages.common.ActivationType;
import com.xius.xbus.messages.common.SecurityId;
import com.xius.xbus.messages.common.ServiceContext;
import com.xius.xbus.messages.common.UserType;
import com.xius.xbus.messages.provisioning.device.UpdateMSISDNStatusRequest;
import com.xius.xbus.messages.provisioning.device.UpdateMSISDNStatusResponse;
import com.xius.xbus.services.provisioning.device.DeviceServiceBindingStub;
import com.xius.xbus.services.provisioning.device.DeviceServiceLocator;

public class BulkActDeactJobProcessor implements Runnable {
	private	 static final Logger logger = LogManager.getLogger(BulkActDeactJobProcessor.class.getSimpleName());

	CountDownLatch latch=null;
	BulkActDeactCursorData cursorData=null;
	public BulkActDeactJobProcessor(CountDownLatch latch,BulkActDeactCursorData curData){
		this.latch=latch;
		this.cursorData=curData;
	}
	public void run() {
		logger.info("---------In BulkActDeactJobProcessor run------------ transid "+cursorData.getTransaction_id());
		UpdateMSISDNStatusRequest request = null;
		UpdateMSISDNStatusResponse response = null;
		request = setRequest(cursorData);
		
		MDNbasedGetNwIdInvoker getNwIdInvoker=new MDNbasedGetNwIdInvoker();
		
		HeaderDetails details=new HeaderDetails();
		details.setLoginID(cursorData.getUser_id()); 
		details.setNetworkID(cursorData.getNetwork_id());
		details.setRequestID("123"); //dummy
		details.setPassword("12345678"); //dummy
		
		MDNBasedGetNwIdRequest idRequest=new MDNBasedGetNwIdRequest();
		
		idRequest.setMSISDN(cursorData.getMsisdn_no().toString());
		
		 Long accountId=null;
		try {
			
			accountId = getNwIdInvoker.MDNbasedGetNwId(details, idRequest).getAccountId();
			
		} catch (SMFAgentException e1) {
			logger.error("SMFAgentException in BulkActDeactJobProcessor while getting accountID transid "+cursorData.getTransaction_id()+Utilities.getStackTrace(e1));
		}
		

		try {
			response = callXbus(request, cursorData);

			if (response != null)
				try {
					updateStatusDb(response, cursorData,accountId);

				} catch (SMFAgentException e) {

					logger.error("SMFAgentException in BulkActDeactJobProcessor transid "+cursorData.getTransaction_id()+Utilities.getStackTrace(e));
				}

		}
			catch (AxisFault e) {

			String errormsg=InitiateAll.getErrorProps().getProperty(SMFAgentConstants.XBUS_ERRCODE);
			String errorcode=SMFAgentConstants.XBUS_ERRCODE;

			logger.error("Communication error from XBUS:: transid "+cursorData.getTransaction_id()+" "+errorcode+":"+errormsg);
			failUpdate(cursorData,errormsg,accountId);

			logger.error(""+Utilities.getStackTrace( e ) );


		}

		catch (MalformedURLException e) {

		logger.error("MalformedURLException in BulkActDeactJobProcessor transid "+cursorData.getTransaction_id()+Utilities.getStackTrace(e));
		} catch (RemoteException e) {

			logger.error("RemoteException in BulkActDeactJobProcessor transid "+cursorData.getTransaction_id()+Utilities.getStackTrace(e));
		} catch (SOAPException e) {

			logger.error("SOAPException in BulkActDeactJobProcessor transid "+cursorData.getTransaction_id()+Utilities.getStackTrace(e));
		}
		finally {
			latch.countDown();
		}

	}


	public UpdateMSISDNStatusRequest setRequest(BulkActDeactCursorData cursorData) {
		UpdateMSISDNStatusRequest request = new UpdateMSISDNStatusRequest();
		logger.info("Setting Request For xbus BulkActDeactJobProcessor with transid "+cursorData.getTransaction_id()+cursorData.toString());

		SecurityId securityId=new SecurityId();

		securityId.setUserAccountName(cursorData.getUser_id());
		securityId.setUserAccountPassword("11111111");

		ServiceContext serviceContext=new ServiceContext();
		serviceContext.setCarrierId(cursorData.getNetwork_id().toString());
		
		AccountType type =new  AccountType();
		if(cursorData.getMsisdn_no()!=null)
		type.setMsisdn(cursorData.getMsisdn_no().toString());
        request.setAccount(type);
		
        
        
        if(cursorData.getActivity_type()!=null && cursorData.getActivity_type().equalsIgnoreCase("AC"))
        request.setOperationType(ActivationType.REACTIVATE);
        else
        	request.setOperationType(ActivationType.DEACTIVATE);

		if(cursorData.getTransaction_id()!=null)
	//	request.setTransationId(cursorData.getTransaction_id());
		
			if(cursorData.getReason()!=null)
		request.setReason(cursorData.getReason());
		
		
		request.setSecurityId(securityId);
		request.setUserType(UserType.CORPUSER);
		request.setServiceContext(serviceContext);
		request.setMessageID("123");//dummy
	if(cursorData.getChannel_id()!=null)
	{
		request.setChannel(cursorData.getChannel_id());
	}
	
	     // ADDED for bulk React Deact from mgmtui
		// based on this channel we skipping SMF Insert in xBus 
		// added by maheswar
		if (cursorData.getChannel_id() != null
				&& cursorData.getChannel_id().equalsIgnoreCase("MGMT_UI")) {
			request.setUserType(UserType.CCUSER);
		} else {
			request.setUserType(UserType.CORPUSER);
		}
	

		return request;

	}

	public UpdateMSISDNStatusResponse callXbus(
			UpdateMSISDNStatusRequest request, BulkActDeactCursorData cursorData)
			throws AxisFault,MalformedURLException, RemoteException, SOAPException {
		UpdateMSISDNStatusResponse response = new UpdateMSISDNStatusResponse();
		DeviceServiceLocator service = new DeviceServiceLocator();
		String url = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.XBUS_CXF_DEVICE_MGMT_URL);
		logger.info("Calling XBUS with the url from BulkActDeactJobProcessor "+url);
		DeviceServiceBindingStub stub = new DeviceServiceBindingStub(new URL(url), service);


		response = stub.updateMSISDNStatus(request);

		return response;
	}



	public void updateStatusDb(UpdateMSISDNStatusResponse response,
			BulkActDeactCursorData cursorData,Long accountId) throws SMFAgentException {
		BulkActDeactUpdateData data = null;
		
		data = setData(response, cursorData,accountId);

		logger.info("Setting Data to BulkTpSubsProcessor pro_corp_deact_react_upd"+data.toString());
		SPFactory spfactory = ServiceUtils.executeSPWithOutCommit("pro_corp_deact_react_upd", data, data);

		Long errorcode = data.getPo_error_code();
		Utilities.commitOrRollback(spfactory, errorcode);

	}

	public BulkActDeactUpdateData setData(UpdateMSISDNStatusResponse response, BulkActDeactCursorData cursorData,Long accountId) {
		BulkActDeactUpdateData data = new BulkActDeactUpdateData();

		data.setPi_network_id(cursorData.getNetwork_id());

		data.setPi_transaction_id(cursorData.getTransaction_id());
		
		if(accountId!=null)
		data.setPi_account_id(accountId);
      
		
		if(response.getErrors()!=null)
		{
		data.setPi_status("FAIL");
     
		if(response.getErrors().length>0)
		{
		data.setPi_remarks(response.getErrors()[0].getErrorMessage());
		data.setPi_ext_error_code(response.getErrors()[0].getErrorCode());
		}
		}
		else
		{
			data.setPi_status("SUCCESS");
			data.setPi_remarks("SUCCESS");
		}
		return data;
	}

	public void failUpdate(BulkActDeactCursorData cursorData,String msg,Long accountId)
	{
		BulkActDeactUpdateData data = new BulkActDeactUpdateData();

		data.setPi_transaction_id(cursorData.getTransaction_id());
		
		if(accountId!=null)
			data.setPi_account_id(accountId);
		
		data.setPi_network_id(cursorData.getNetwork_id());
		data.setPi_status("FAIL");
		data.setPi_remarks(msg);

		try {
			SPFactory spfactory = ServiceUtils.executeSPWithOutCommit("pro_corp_deact_react_upd", data, data);
			Long errorcode = data.getPo_error_code();
			Utilities.commitOrRollback(spfactory, errorcode);

		} catch (SMFAgentException e) {
			e.printStackTrace();
		}



	}
	
}
