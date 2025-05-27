/***********************************************
 * Company XIUS-BCGI (Megasoft Pvt Ltd Hyderabad,INDIA)
 * � Copyright 2015 MEGASOFT.
 *
 * Package        : com.xius.mspgw.client.invoker
 * Name of File   : SubscriberManagementInvoker
 * $DateTime: 2023/12/08 12:29:41 $Change:  $
 * @author naveen.aalone $Author: kiranmai.kode $
 * Description    : This is used to make XBUS call to get SubscriberDetails
 * 					
 *
 * Method names   : getSubscriberServices()
 * 					
 * 
 * Modifications
 * Method Name  |  Date   |  Author  | Explanation
 * -------------------------------------------------------------              
 *              |         |          |
 *              |         |          | 
 *             
 *****************************************************/
package com.xius.smf.client.invoker;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;



import org.apache.axis.AxisFault;
import org.apache.axis.message.SOAPHeaderElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.Utilities;
import com.xiusbcgi.xbus.scare.CorpManagement_wsdl.CorpManagementServicesBindingStub;
import com.xiusbcgi.xbus.scare.CorpManagement_wsdl.CorpManagementServicesLocator;
import com.xiusbcgi.xbus.scare.CorpManagement_xsd.GetAccountRequest;
import com.xiusbcgi.xbus.scare.CorpManagement_xsd.GetAccountResponse;
import com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType;

public class CorpManagementInvoker {
	
    private static final Logger logger = LogManager.getLogger(CorpManagementInvoker.class);

	public GetAccountResponse getAccountInfo(HeaderDetails headerDetails, String request ) throws  SMFAgentException{
		long startTime= System.currentTimeMillis();
		long endTime= 0;
		
		String url = InitiateAll.getSMFProps().getProperty("selfcare.corpManagement");
		logger.info( " URL for calling SelfcareServ getAccountInfo : "+url);
		GetAccountRequest accRequest = new GetAccountRequest();
		GetAccountResponse accResponse = new GetAccountResponse();
		CorpManagementServicesBindingStub corpMgmntStub = null;
		try {
			corpMgmntStub = new CorpManagementServicesBindingStub(new URL(url),new CorpManagementServicesLocator());
			//setting SOAP Header
			headerDetails.setRequestID("1");
			SOAPHeaderElement header = Utilities.getSelfCareSoapHeader(headerDetails);
			corpMgmntStub.setHeader(header);
			
			//setting up the time out
			corpMgmntStub.setTimeout(Integer.parseInt(InitiateAll.getSMFProps().getProperty("selfcare.timeout")));
			accRequest.setMSISDN(request);
			logger.info( "<<<Calling SelfcareServ to getAccountInfo  : MSISDN : " + request);
		
			accResponse = corpMgmntStub.getAccount(accRequest);
			
			logger.info( "AccountId: "+accResponse.getAccountId());
			logger.info( "MSISDN: "+accResponse.getMSISDN());
			logger.info( "SIM: "+accResponse.getSIM());
			logger.info( "IMSNumber: "+accResponse.getIMSI());
			logger.info( "AccountStatus: "+accResponse.getAccountStatus());
			logger.info( "AccountType: "+accResponse.getAcctType());
			logger.info( "OfficeCode: "+accResponse.getOfficeCode());
			
			if(accResponse != null){
				logger.info(">>>Response from getAccountInfo, AccountId: " + accResponse.getAccountId());
				endTime = System.currentTimeMillis();
				logger.info("getAccountInfo Success:"+(int) (endTime - startTime)+"ms");
				
			}else{
				logger.error("No response from SelfcareServ for getAccountInfo api..");
				endTime = System.currentTimeMillis();
				logger.info("getAccountInfo Failure:"+(int) (endTime - startTime)+"ms");
				throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE, null);
			}
		} 
		catch(ErrorDetailsType e){
			logger.error( "CorpManagementInvoker - ErrorDetailsType ErroCode:"+e.getErrorCode());
			logger.error( "CorpManagementInvoker - ErrorDetailsType ErrorMessage:"+e.getErrorMessage());
			endTime = System.currentTimeMillis();
			logger.info("CorpManagementInvoker Failure:"+(int) (endTime - startTime)+"ms");
			throw new SMFAgentException(e.getErrorCode(), null);			
		}catch (AxisFault e) {
			logger.error( "getAccountInfo - AxisFault :"+Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			logger.info("getAccountInfo Failure:"+(int) (endTime - startTime)+"ms");
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE, null);
		} catch (RemoteException e) {
			logger.error( "getAccountInfo - RemoteException:"+Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			logger.info("getAccountInfo Failure:"+(int) (endTime - startTime)+"ms");
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE, null);
		} catch (MalformedURLException e) {
			logger.error("getAccountInfo - MalformedURLException :"+Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			logger.info("getUsage Failure:"+(int) (endTime - startTime)+"ms");
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE, null);
		}		
		return accResponse;
	}
}