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
import com.xius.billing.AccountManagement_xsd.GetDtlsForRegistrationRequest;
import com.xius.billing.AccountManagement_xsd.GetDtlsForRegistrationResponse;
import com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.Utilities;

public class GetDtlsForRegistrationInvoker {
    private static final Logger logger = LogManager.getLogger(GetDtlsForRegistrationInvoker.class);

	

	public GetDtlsForRegistrationResponse getDtlsForRegistration(HeaderDetails headerDetails,
			GetDtlsForRegistrationRequest request) throws SMFAgentException {
		
		GetDtlsForRegistrationResponse response = null;
		long startTime = System.currentTimeMillis();
		long endTime = 0;

		String url = InitiateAll.getSMFProps().getProperty("iba.AccountManagement");
		if (logger.isInfoEnabled()) {
			logger.info("****  GetDtlsForRegistrationInvoker url for request  ****   :  " + url);
		}

		AccountManagementBindingStub bindingStub = null;
		try {
			bindingStub = new AccountManagementBindingStub(new URL(url),new AccountServiceLocator());
			SOAPHeaderElement header = Utilities.getSoapHeader(headerDetails);
			bindingStub.setHeader(header);
			bindingStub.setTimeout(Integer.parseInt(InitiateAll.getSMFProps().getProperty("iba.timeout")));
			if(request!=null){
				response = bindingStub.getDtlsForRegistration(request);
			}else{
				logger.info(">>>>>>>>>>>>>> reqest is null");
			}
			

			if (response != null) {
				if (logger.isInfoEnabled()) {

					logger.info(
							">>>Response from  GetDtlsForRegistrationInvoker--->  response - ICCID : "
									+ response.getICCID());
					logger.info(
							">>>Response from  GetDtlsForRegistrationInvoker--->  response AccountType: "
									+ response.getAccountType());
					
					endTime = System.currentTimeMillis();
					logger.info(
							" GetDtlsForRegistrationInvoker--->Success:"
									+ (int) (endTime - startTime) + "ms");
				}

			} else {
				logger
						.error(
								"No response from IBA for GetDtlsForRegistrationInvoker---> GetDtlsForRegistration api..");
				endTime = System.currentTimeMillis();
				logger.info(
						" GetDtlsForRegistrationInvoker--->GetDtlsForRegistration Failure:"
								+ (int) (endTime - startTime) + "ms");
				throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR, null);
			}

		} catch (ErrorDetailsType e) {
			logger.error(
					" GetDtlsForRegistrationInvoker--->GetDtlsForRegistration - ErrorDetailsType ErroCode:"
							+ e.getErrorCode());
			logger.error(
					"GetDtlsForRegistrationInvoker--->GetDtlsForRegistration - ErrorDetailsType ErrorMessage:"
							+ e.getErrorMessage());
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" GetDtlsForRegistration--->GetDtlsForRegistration Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(e.getErrorCode(), e.getErrorMessage());
		} catch (AxisFault e) {
			logger.error(
					" GetDtlsForRegistrationInvoker--->GetDtlsForRegistration - AxisFault :"
							+ Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" GetDtlsForRegistrationInvoker--->GetDtlsForRegistration Filure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR, null);
		} catch (RemoteException e) {
			logger.error(
					" GetDtlsForRegistrationInvoker--->GetDtlsForRegistration - RemoteException:"
							+ Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" GetDtlsForRegistrationInvoker--->GetDtlsForRegistration Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR, null);
		} catch (MalformedURLException e) {
			logger.error(
					" GetDtlsForRegistrationInvoker--->GetDtlsForRegistration - MalformedURLException :"
							+ Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" GetDtlsForRegistrationInvoker--->GetDtlsForRegistration Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR, null);
		}

		return response;
	}

}
