
package com.xius.smf.webservices.smfservices;

	import javax.xml.soap.SOAPException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;


	import com.xius.smf.client.invoker.TIAMngmtInvoker;
	import com.xius.smf.exceptions.SMFAgentException;
	import com.xius.smf.utils.HeaderDetails;
import com.xius.tia.TTprovisioning_xsd.FiveGDeProvisionRequest;
import com.xius.tia.TTprovisioning_xsd.FiveGDeProvisionResponse;
import com.xius.tia.TTprovisioning_xsd.FiveGProvisionRequest;
import com.xius.tia.TTprovisioning_xsd.FiveGProvisionResponse;


	@Service("FiveGDeProvisionImpl")
	public class FiveGDeProvisionImpl {
		private  static final Logger logger = LogManager.getLogger(FiveGDeProvisionImpl.class.getSimpleName());
		
	 
		public FiveGDeProvisionResponse fiveGDeProvision(FiveGDeProvisionRequest request,
				HeaderDetails headerDetails) throws SMFAgentException, SOAPException, com.xius.smf.exceptions.SMFAgentException {
			
			logger.info("FiveGDeProvisionImpl---> invoice Method called ...");
			
			FiveGDeProvisionResponse response = null;
			
			TIAMngmtInvoker invoker=new TIAMngmtInvoker();
			response=invoker.fiveGDeProvision(headerDetails, request);
			if(response!=null && response.getResponseData().getReturnCode().equals("0")){
				logger.info("FiveGDeProvisionImpl---> invoice response is success ...");
			}else{
				logger.info("FiveGDeProvisionImpl---> invoice response is failure ...");
			}
			logger.info("FiveGDeProvisionImpl---> invoice response called ...");
			request=null;
			return response;
		}	
	}



 
