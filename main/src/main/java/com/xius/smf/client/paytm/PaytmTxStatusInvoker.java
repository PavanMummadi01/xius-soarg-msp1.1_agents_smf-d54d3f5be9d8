package com.xius.smf.client.paytm;





import org.codehaus.jackson.map.DeserializationConfig.Feature;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.xius.smf.client.invoker.UpdatePaymentStatusInvoker;
import com.xius.smf.domaindata.PaytmTxStatusRetryCursorData;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;

public class PaytmTxStatusInvoker {

    private static final Logger logger = LogManager.getLogger(PaytmTxStatusInvoker.class);
	
	public PaytmTxStatusResponse callPayTM(
			PaytmTxStatusRequest request, PaytmTxStatusRetryCursorData cursorData)
			 {
		//ChangeSubMSISDNResponse response = new ChangeSubMSISDNResponse();
		PaytmTxStatusResponse resp=null;
		String url = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.PAYTM_TX_STATUS_URL);
		logger.info("Hitting PAYTM with the url from PaytmTxStatusInvoker "+url);
		try {
			Client cl=Client.create();
			ObjectMapper obj=new ObjectMapper();
			WebResource webResource = cl.resource(url);
			
			String reqjson = obj.writeValueAsString(request);
			
			logger.info("Request Sending to PAYTM "+reqjson);
			ClientResponse response = webResource.type("application/json").post(ClientResponse.class,reqjson);
			
					/*if (response.getStatus() != 201) {
						throw new RuntimeException("Failed : HTTP error code : "
						     + response.getStatus());
					}*/

			
			if(response.getStatus()==200)
			{
				logger.info("Output from PAYTM Server .... \n");
					String output = response.getEntity(String.class);
					logger.info("Response for PAYTM "+output);
					
					
					obj.configure(Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
					resp=obj.readValue(output, PaytmTxStatusResponse.class);
					
					logger.info(resp.toString());
					
					String json = obj.writeValueAsString(resp);
					logger.info(json);
					
			}
			else
			{
				
				logger.info("Output from PAYTM Server is HTTP response code: "+response.getStatus());
				logger.info("Output from PAYTM Server is HTTP response code: "+response.getStatusInfo().getReasonPhrase());
			}
					

				  } catch (Exception e) {

					e.printStackTrace();

				  }
			
		
		
		
		return resp;
		
	}
	
	
	
	
	
	
}
