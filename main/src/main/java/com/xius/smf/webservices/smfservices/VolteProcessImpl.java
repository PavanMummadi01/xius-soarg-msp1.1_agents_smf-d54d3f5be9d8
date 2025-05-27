package com.xius.smf.webservices.smfservices;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xius.smf.client.invoker.TIAVOlteProvisionInvoker;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.tia.TTprovisioning_xsd.VolteDeProvisionRequest;
import com.xius.tia.TTprovisioning_xsd.VolteDeProvisionResponse;
import com.xius.tia.TTprovisioning_xsd.VolteProvisionRequest;
import com.xius.tia.TTprovisioning_xsd.VolteProvisionResponse;

@Service("VolteProcessImpl")
public class VolteProcessImpl {
	private  static final Logger logger = LogManager.getLogger(VolteProcessImpl.class.getSimpleName());
	
	public VolteProvisionResponse provision(VolteProvisionRequest request,
			HeaderDetails headerDetails) throws  SMFAgentException {
		
		logger.info("TTprovisioningProcessImpl---> tia provision Method called ...");
		
		VolteProvisionResponse response = null;
		 
		TIAVOlteProvisionInvoker invoker=new TIAVOlteProvisionInvoker();
		response=invoker.provision(headerDetails, request);
		if(response!=null && (response.getStatus().equals("0") || response.getStatus().equalsIgnoreCase("successfully provisioned"))){
			logger.info("TTprovisioningProcessImpl---> tia provision response is success ...");
		}
		else if(response!=null && (response.getStatus()!=null)){
			logger.info("TTprovisioningProcessImpl---> tia deprovision response is status> ..."+response.getStatus());
		}else{
			logger.info("TTprovisioningProcessImpl---> tia provision response is failure ...");
		}
		return response;
	}



	public VolteDeProvisionResponse deprovision(VolteDeProvisionRequest request,
			HeaderDetails headerDetails) throws SMFAgentException {
		
		logger.info("TTprovisioningProcessImpl---> tia deprovision Method called ...");
		
		VolteDeProvisionResponse response = null;
		
		TIAVOlteProvisionInvoker invoker=new TIAVOlteProvisionInvoker();
		response=invoker.deprovision(headerDetails, request);
		if(response!=null && (response.getStatus()!=null)){
			logger.info("TTprovisioningProcessImpl---> tia deprovision response is status> ..."+response.getStatus());
		}else{
			logger.info("TTprovisioningProcessImpl---> tia deprovision response is failure ...");
		}
		 
		
		return response;
	}

}


