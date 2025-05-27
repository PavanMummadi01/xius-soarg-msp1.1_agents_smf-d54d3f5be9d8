package com.xius.smf.job;

import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.concurrent.CountDownLatch;

import javax.xml.soap.SOAPException;

import net.bcgi.util.db.SPFactory;

import org.apache.axis.AxisFault;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.xius.smf.domaindata.BulkTPSubsUpdateData;
import com.xius.smf.domaindata.BulkTpSubsCursorData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
import com.xius.xbus.messages.billing.tariff.ChangeTPRequest;
import com.xius.xbus.messages.billing.tariff.ChangeTPResponse;
import com.xius.xbus.messages.common.AccountType;
import com.xius.xbus.messages.common.SecurityId;
import com.xius.xbus.messages.common.ServiceContext;
import com.xius.xbus.messages.common.UserType;
import com.xius.xbus.services.billing.tariff.TariffServiceBindingStub;
import com.xius.xbus.services.billing.tariff.TariffServiceLocator;

public class BulkTpSubsProcessor implements Runnable {
	private	 static final Logger logger = LogManager.getLogger(BulkTpSubsProcessor.class.getSimpleName());
	CountDownLatch latch=null;
	BulkTpSubsCursorData cursorData=null;
	public BulkTpSubsProcessor(CountDownLatch latch,BulkTpSubsCursorData curData){
		this.latch=latch;
		this.cursorData=curData;
	}
	public void run() {
		logger.info("---------In BulkTpSubsProcessor run------------ transid "+cursorData.getTransaction_id());
		ChangeTPRequest request = null;
		ChangeTPResponse response = null;
		request = setRequest(cursorData);

		try {
			response = callXbus(request, cursorData);

			if (response != null)
				try {
					updateStatusDb(response, cursorData);

				} catch (SMFAgentException e) {

					logger.error("SMFAgentException in BulkTpSubsProcessor transid "+cursorData.getTransaction_id()+Utilities.getStackTrace(e));
				}

		}
			catch (AxisFault e) {

			String errormsg=InitiateAll.getErrorProps().getProperty(SMFAgentConstants.XBUS_ERRCODE);
			String errorcode=SMFAgentConstants.XBUS_ERRCODE;

			logger.error("Communication error from XBUS:: transid "+cursorData.getTransaction_id()+" "+errorcode+":"+errormsg);
			failUpdate(cursorData,errormsg);

			logger.error(""+Utilities.getStackTrace( e ) );


		}

		catch (MalformedURLException e) {

		logger.error("MalformedURLException in BulkTpSubsProcessor transid "+cursorData.getTransaction_id()+Utilities.getStackTrace(e));
		} catch (RemoteException e) {

			logger.error("RemoteException in BulkTpSubsProcessor transid "+cursorData.getTransaction_id()+Utilities.getStackTrace(e));
		} catch (SOAPException e) {

			logger.error("SOAPException in BulkTpSubsProcessor transid "+cursorData.getTransaction_id()+Utilities.getStackTrace(e));
		}
		finally {
			latch.countDown();
		}

	}


	public ChangeTPRequest setRequest(BulkTpSubsCursorData cursorData) {
		ChangeTPRequest request = new ChangeTPRequest();
		logger.info("Setting Request For xbus BulkTpSubsProcessor with transid "+cursorData.getTransaction_id()+cursorData.toString());

		SecurityId securityId=new SecurityId();

		securityId.setUserAccountName("smfjob");
		securityId.setUserAccountPassword("11111111");



		ServiceContext serviceContext=new ServiceContext();
		serviceContext.setCarrierId(cursorData.getNetwork_id().toString());
		AccountType type =new  AccountType();
		if(cursorData.getMsisdn_no()!=null)
		type.setMsisdn(cursorData.getMsisdn_no().toString());
        request.setAccount(type);
		if(cursorData.getNew_tarrif_pack_id()!=null)
		request.setNewTariffPlanId(cursorData.getNew_tarrif_pack_id());

		if(cursorData.getTransaction_id()!=null)
	//	request.setTransationId(cursorData.getTransaction_id());
			if(cursorData.getCharge()!=null)
		request.setActivationFee(cursorData.getCharge());	
		
		request.setSecurityId(securityId);
		request.setUserType(UserType.DEALER);
		request.setServiceContext(serviceContext);
		request.setMessageID("123");//dummy
	if(cursorData.getChannel_id()!=null)
	{
		request.setChannelId(cursorData.getChannel_id());
	}
	
	if(cursorData.getOffice_code()!=null)
	request.setOfficeCode(cursorData.getOffice_code().toString());
	
	
		return request;

	}

	public ChangeTPResponse callXbus(
			ChangeTPRequest request, BulkTpSubsCursorData cursorData)
			throws AxisFault,MalformedURLException, RemoteException, SOAPException {
		ChangeTPResponse response = new ChangeTPResponse();
		TariffServiceLocator service = new TariffServiceLocator();
		String url = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BULK_TP_SUBSCRIPTION_XBUS_URL);
		logger.info("Calling XBUS with the url from BulkTpSubsProcessor "+url);
		TariffServiceBindingStub stub = new TariffServiceBindingStub(new URL(url), service);


		response = stub.changeTP(request);

		return response;
	}



	public void updateStatusDb(ChangeTPResponse response,
			BulkTpSubsCursorData cursorData) throws SMFAgentException {
		BulkTPSubsUpdateData data = null;
		
		data = setData(response, cursorData);

		logger.info("Setting Data to BulkTpSubsProcessor pro_bulk_tarifpack_change_upd"+data.toString());
		SPFactory spfactory = ServiceUtils.executeSPWithOutCommit("pro_bulk_tarifpack_change_upd", data, data);

		Long errorcode = data.getPo_error_code();
		Utilities.commitOrRollback(spfactory, errorcode);

	}

	public BulkTPSubsUpdateData setData(ChangeTPResponse response, BulkTpSubsCursorData cursorData) {
		BulkTPSubsUpdateData data = new BulkTPSubsUpdateData();

		data.setPi_network_id(cursorData.getNetwork_id());

		data.setPi_transaction_id(cursorData.getTransaction_id());
       data.setPi_old_tarrif_pack_id(response.getOldTariffPlanName());
       System.out.println("planid"+response.getOldTariffPlanName());
		/*if(response.getChargeId()!=null)
		data.setPi_charge_id(response.getChargeId());
*/
		if(response.getDebitedAmmount()!=null)
		data.setPi_charge(new BigDecimal(response.getDebitedAmmount()));

		if(response.getErrors()!=null)
		{
		data.setPi_status("FAIL");
     System.out.println(response.getErrors(0).getErrorCode());
     System.out.println(response.getErrors(0).getErrorMessage());
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

	public void failUpdate(BulkTpSubsCursorData cursorData,String msg)
	{
	BulkTPSubsUpdateData data = new BulkTPSubsUpdateData();

		data.setPi_transaction_id(cursorData.getTransaction_id());
		data.setPi_network_id(cursorData.getNetwork_id());
		data.setPi_status("FAIL");
		data.setPi_remarks(msg);

		try {
			SPFactory spfactory = ServiceUtils.executeSPWithOutCommit("pro_bulk_tarifpack_change_upd", data, data);
			Long errorcode = data.getPo_error_code();
			Utilities.commitOrRollback(spfactory, errorcode);

		} catch (SMFAgentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}
	
}
