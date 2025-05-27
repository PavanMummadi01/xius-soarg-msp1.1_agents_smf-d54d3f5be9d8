package com.xius.smf.webservices.smfservices;

import java.math.BigDecimal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import net.bcgi.util.db.SPFactory;

import com.xius.agent.smf.smfmanagement.ProductPurchaseUpdateRequest;
import com.xius.agent.smf.smfmanagement.ProductPurchaseUpdateResponse;
import com.xius.smf.domaindata.ProductPurchaseUpdateData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
@Service("ProductPurchaseUpdateImpl")
public class ProductPurchaseUpdateImpl {

	ProductPurchaseUpdateData domainData = null;
	SPFactory spFactory = null;

	private  static final Logger logger = LogManager.getLogger(ProductPurchaseUpdateImpl.class.getSimpleName());

	public ProductPurchaseUpdateResponse productPurchaseupdate(
			ProductPurchaseUpdateRequest request, HeaderDetails headerDetails)
			throws SMFAgentException {

		ProductPurchaseUpdateResponse response = new ProductPurchaseUpdateResponse();
		domainData = setRequestData(request, headerDetails);

		spFactory = ServiceUtils.executeSPWithOutCommit(
				"pro_prod_purchage_req_update", domainData, domainData);

		if (logger.isInfoEnabled()) {
			logger.info( domainData.toString());
		}

		Long errCode = domainData.getPo_error_code();
		String errMsg = domainData.getPo_error_desc();
		if (logger.isInfoEnabled()) {

			logger.info( "Error Code from   ==>" + errCode);
			logger.info( "Error Msg from  ==>" + errMsg);
		}

		Utilities.commitOrRollback(spFactory, errCode);

		if (errCode == 0) {
			response = setWebserviceResponse(domainData);
		} else
			throw Utilities.setSMFAgentException(errCode.toString(), errMsg);

		return response;
	}

	private ProductPurchaseUpdateData setRequestData(
			ProductPurchaseUpdateRequest request, HeaderDetails headerDetails) {

		ProductPurchaseUpdateData domainData = new ProductPurchaseUpdateData();

		if (headerDetails.getNetworkID() != null)
			domainData.setPi_network_id(headerDetails.getNetworkID());

		if (Utilities.isNull(request.getInternalTransId()) == false)
			domainData.setPi_trans_id(request.getInternalTransId().trim());

		if (Utilities.isNull(request.getStatus()) == false)
			domainData.setPi_status(request.getStatus().trim());

		if (Utilities.isNull(request.getRemarks()) == false)
			domainData.setPi_remarks(request.getRemarks().trim());
		
		if(request.getCharge() != null)
		domainData.setPi_charge(new BigDecimal(request.getCharge()));

		return domainData;
	}

	private ProductPurchaseUpdateResponse setWebserviceResponse(
			ProductPurchaseUpdateData domainData) {

		ProductPurchaseUpdateResponse response = new ProductPurchaseUpdateResponse();

		if (Utilities.isNull(domainData.getPo_error_desc()) == false)
			response.setMessage(domainData.getPo_error_desc());

		return response;
	}

}
