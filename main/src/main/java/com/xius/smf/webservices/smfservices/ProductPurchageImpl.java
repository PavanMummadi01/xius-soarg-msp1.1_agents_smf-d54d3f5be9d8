package com.xius.smf.webservices.smfservices;

import java.math.BigDecimal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;


import com.xius.agent.smf.smfmanagement.ProductPurchageRequest;
import com.xius.agent.smf.smfmanagement.ProductPurchageResponse;
import com.xius.smf.domaindata.ProductPurchageData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
@Service("ProductPurchageImpl")
public class ProductPurchageImpl {
	
	private  static final Logger logger = LogManager.getLogger(ProductPurchageImpl.class.getSimpleName());

	ProductPurchageData domainData =null;
	
	public ProductPurchageResponse productPurchage(
			ProductPurchageRequest request, HeaderDetails headerDetails) throws SMFAgentException {
		
		ProductPurchageResponse response = new ProductPurchageResponse();
		domainData = setRequestData(request, headerDetails);
		
		ServiceUtils._executeStoredProcedure("pro_prod_purchage_req_insert",domainData, domainData);
		if (logger.isInfoEnabled()) {
			logger.info( domainData.toString());
		}
		
		Long errCode  = domainData.getPo_error_code();
		String errMsg  = domainData.getPo_error_desc();
		if (logger.isInfoEnabled()) {

			logger.info( "Error Code from pro_prod_purchage_req_insert  ==>" + errCode);
			logger.info( "Error Msg from pro_prod_purchage_req_insert ==>" + errMsg);
		}
		
		if ( errCode == 0) {
			response=setWebserviceResponse(domainData,"Initiated");
			logger.info( "response from pro_prod_purchage_req_insert  ==>" + response);
		} 
		else{
		response=setWebserviceResponse(domainData,"Failed");
		logger.info( "response from pro_prod_purchage_req_insert  ==>" + response);
		}
		return response;
	}


	private ProductPurchageData setRequestData(ProductPurchageRequest request,
			HeaderDetails headerDetails) {
	
		ProductPurchageData domainData = new ProductPurchageData();
		
		if(headerDetails.getNetworkID()!=null)
			domainData.setPi_network_id(headerDetails.getNetworkID());
		
		if(Utilities.isNull(request.getMSISDN())==false)
			domainData.setPi_msisdn_no(Long.parseLong(request.getMSISDN().trim()));
				
		if(Utilities.isNull(request.getPublicityId())==false)
			domainData.setPi_publicity_id(request.getPublicityId().trim());
		
		if(Utilities.isNull(request.getRefTransId())==false)
			domainData.setPi_ext_trans_id(request.getRefTransId().trim());
			
		if(headerDetails.getLoginID()!=null)
			domainData.setPi_login_id(headerDetails.getLoginID().trim());
		
		if(Utilities.isNull(request.getChannel())==false)
			domainData.setChannel(request.getChannel().trim());
		
		if(Utilities.isNull(request.getSubUnsubFlag())==false)
			domainData.setFlag(request.getSubUnsubFlag().trim());
		
		if(request.getCharge()!=null)
			domainData.setPi_charge(new BigDecimal(request.getCharge()));
		
		
		if(request.getUserDefined1()!=null)
			domainData.setPi_user_data1(request.getUserDefined1());
		
		if(request.getUserDefined2()!=null)
			domainData.setPi_user_data2(request.getUserDefined2());
		
		return domainData;
	}

	private ProductPurchageResponse setWebserviceResponse(
			ProductPurchageData domainData,String status) {
		ProductPurchageResponse response = new ProductPurchageResponse();
		
		if(Utilities.isNull(domainData.getPo_trans_id())==false)
		response.setInternalTtransId(domainData.getPo_trans_id());
		response.setResponseCode(domainData.getPo_error_code().toString());
		response.setResponseDescription(domainData.getPo_error_desc());
		response.setResponseStatus(status);
		
		return response;
	}
		
}
	