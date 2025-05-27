package com.xius.smf.webservices.smfservices;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.xius.smf.client.invoker.TIAPCRFInvoker;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.tia.TTprovisioning_xsd.DeletePCRFRequest;
import com.xius.tia.TTprovisioning_xsd.DeletePCRFResponse;
import com.xius.tia.TTprovisioning_xsd.ProvisionPCRFRequest;
import com.xius.tia.TTprovisioning_xsd.ProvisionPCRFResponse;


public class TTPCRFProcessImpl {
	private  static final Logger logger = LogManager.getLogger(TTPCRFProcessImpl.class.getSimpleName());

	

	public ProvisionPCRFResponse provision(ProvisionPCRFRequest request,
			HeaderDetails headerDetails) throws  SMFAgentException {
		
		logger.info("TTprovisioningProcessImpl---> tia provision Method called ...");
		
		ProvisionPCRFResponse response = null;
		
		TIAPCRFInvoker invoker=new TIAPCRFInvoker();
		response=invoker.provision(headerDetails, request);
		if(response!=null && (response.getStatus().equals("0") || response.getStatus().equalsIgnoreCase("successfully provisioned"))){
			logger.info("TTprovisioningProcessImpl---> tia provision response is success ...");
		}else{
			logger.info("TTprovisioningProcessImpl---> tia provision response is failure ...");
		}
		return response;
	}



	public DeletePCRFResponse delete(DeletePCRFRequest request,
			HeaderDetails headerDetails) throws SMFAgentException {
		
		logger.info(
				"TTprovisioningProcessImpl---> tia delete Method called ...");
		
		DeletePCRFResponse response = null;
		
		TIAPCRFInvoker invoker=new TIAPCRFInvoker();
		response=invoker.delete(headerDetails, request);
		if(response!=null && (response.getStatus().equals("0") || response.getStatus().equalsIgnoreCase("successfully deprovisioned"))){
			logger.info("TTprovisioningProcessImpl---> tia delete response is success ...");
		}else{
			logger.info("TTprovisioningProcessImpl---> tia delete response is failure ...");
		}
		 
		
		return response;
	}

}


