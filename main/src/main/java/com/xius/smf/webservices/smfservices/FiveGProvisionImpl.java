
package com.xius.smf.webservices.smfservices;

	import javax.xml.soap.SOAPException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;


	import com.xius.smf.client.invoker.TIAMngmtInvoker;
	import com.xius.smf.exceptions.SMFAgentException;
	import com.xius.smf.utils.HeaderDetails;
import com.xius.tia.TTprovisioning_xsd.FiveGProvisionRequest;
import com.xius.tia.TTprovisioning_xsd.FiveGProvisionResponse;


	@Service("FiveGProvisionImpl")
	public class FiveGProvisionImpl {
		private  static final Logger logger = LogManager.getLogger(FiveGProvisionImpl.class.getSimpleName());
		
	 
		public FiveGProvisionResponse fiveGprovision(FiveGProvisionRequest request,
				HeaderDetails headerDetails) throws SMFAgentException, SOAPException {
			
			logger.info("FiveGProvisionImpl---> invoice Method called ...");
			
			FiveGProvisionResponse response = null;
			
			TIAMngmtInvoker invoker=new TIAMngmtInvoker();
			try {
				response=invoker.fiveGProvision(headerDetails, request);
			} catch (com.xius.smf.exceptions.SMFAgentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(response!=null && response.getResponseData().getReturnCode().equals("0")){
				logger.info("FiveGProvisionImpl---> invoice response is success ...");
			}else{
				logger.info("FiveGProvisionImpl---> invoice response is failure ...");
			}
			logger.info("FiveGProvisionImpl---> invoice response called ...");
			request=null;
			return response;
		}

		
		
		
		
		
		
	}


 
