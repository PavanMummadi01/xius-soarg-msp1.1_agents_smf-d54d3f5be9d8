package com.xius.smf.client.invoker;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;


import org.apache.axis.AxisFault;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.xbus.messages.selfcare.services.UpdatePaymentStatusRequest;
import com.xius.xbus.messages.selfcare.services.UpdatePaymentStatusResponse;
import com.xius.xbus.services.selfcare.services.SelfCareServicesBindingStub;
import com.xius.xbus.services.selfcare.services.SelfCareServicesLocator;

public class UpdatePaymentStatusInvoker {
	
    private static final Logger logger = LogManager.getLogger(UpdatePaymentStatusInvoker.class);
	
	public UpdatePaymentStatusResponse updatePaymentStatus(UpdatePaymentStatusRequest req)
	{
		
		
		UpdatePaymentStatusResponse resp=null;
		
		
		SelfCareServicesLocator service=new SelfCareServicesLocator();
		try {
		
			String url=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.XBUS_SELFCARE_SERVICES_URL);
			
			String timeout=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.XBUS_TIMEOUT);
			logger.info(" Sending request to XBUS "+url);
			SelfCareServicesBindingStub stub=new SelfCareServicesBindingStub(new URL(url), service);
			stub.setTimeout(Integer.parseInt(timeout));
			
			resp=stub.updatePaymentStatus(req);
			
			if(resp.getErrors()!=null )
			{
				
				logger.error("================Received Error response from xbus for updatePaymentStatus "+resp.getErrors()[0].getErrorCode()+": "+resp.getErrors()[0].getErrorMessage());
				
			}
			else
			{
				
				logger.info("================ response from xbus for updatePaymentStatus is SUCCESS ");
				
			}
			
			
			
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return resp;
	}

}
