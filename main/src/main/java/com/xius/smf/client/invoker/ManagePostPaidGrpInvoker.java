package com.xius.smf.client.invoker;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import org.apache.axis.AxisFault;
import org.apache.axis.message.SOAPHeaderElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.xius.billing.AccountManagement_wsdl.AccountManagementBindingStub;
import com.xius.billing.AccountManagement_wsdl.AccountServiceLocator;
import com.xius.billing.AccountManagement_xsd.ManagePostPaidGrpRequest;
import com.xius.billing.AccountManagement_xsd.ManagePostPaidGrpResponse;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.Utilities;

public class ManagePostPaidGrpInvoker {
    private static final Logger logger = LogManager.getLogger(ManagePostPaidGrpInvoker.class);

    public ManagePostPaidGrpResponse managePostPaidGrp(ManagePostPaidGrpRequest request ,HeaderDetails headerDetails ) throws SMFAgentException{
    	long startTime = System.currentTimeMillis();
		long endTime = 0;
		String url = InitiateAll.getSMFProps().getProperty("postpaid.AccountManagement");

		if (logger.isInfoEnabled()) {
			logger.info("the url for request" + url);
		}
		ManagePostPaidGrpResponse response= null;
		AccountManagementBindingStub stub=null;
		try{
			stub= new AccountManagementBindingStub(new URL(url),new AccountServiceLocator());
			SOAPHeaderElement header = Utilities.getSoapHeader(headerDetails);
			stub.setHeader(header);
			stub.setTimeout(Integer.parseInt(InitiateAll.getSMFProps().getProperty("iba.timeout")));
			
			response=stub.managePostPaidGrp(request);
			
			if (response != null) {
				if (logger.isInfoEnabled()) {
					logger.info(
							">>>Response from  ManagePostPaidGrpInvoker---> managePostPaidGrp api Messsage  : "
									+ response.getMessage());
					endTime = System.currentTimeMillis();
					logger.info(
							" ManagePostPaidGrpInvoker--->managePostPaidGrp()  Success:"
									+ (int) (endTime - startTime) + "ms");
				}
			} else {
				logger.error(
						"No response from IBA for ManagePostPaidGrpInvoker---> ManagePostPaidGrp api..");
				endTime = System.currentTimeMillis();
				logger.info(
						" ManagePostPaidGrpInvoker--->ManagePostPaidGrp Failure:"
								+ (int) (endTime - startTime) + "ms");
				throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR, null);
			}
			
		}
		
		catch (AxisFault e) {
			logger.error( "ManagePostPaidGrp - AxisFault :"+Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			logger.info("ManagePostPaidGrp Failure:"+(int) (endTime - startTime)+"ms");
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR, null);
			}
			catch (RemoteException e) {
			logger.error( "ManagePostPaidGrp - RemoteException:"+Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			logger.info("ManagePostPaidGrp Failure:"+(int) (endTime - startTime)+"ms");
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR, null);
			}
			catch (MalformedURLException e) {
			logger.error( "ManagePostPaidGrp - MalformedURLException :"+Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			logger.info("createCAGRP Failure:"+(int) (endTime - startTime)+"ms");
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR, null);
			}
			return response;
		}

    	
    }


