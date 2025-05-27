/**
 * 
 */
package com.xius.smf.webservices.smfservices;


import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;


import net.bcgi.util.db.SPFactory;

import com.xius.agent.smf.postpaidmanagement.PostpaidRegStatusRequest;
import com.xius.agent.smf.postpaidmanagement.PostpaidRegStatusResponse;
import com.xius.agent.smf.postpaidmanagement.RegStatusInfoListtype;
import com.xius.smf.domaindata.PostPaidRegStatusData;
import com.xius.smf.domaindata.PostPaidRegStatusRefCurData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

@Service("PostPaidRegStatusImpl")
public class PostPaidRegStatusImpl {
	private  static final Logger logger = LogManager.getLogger(PostPaidRegStatusImpl.class.getSimpleName());
	SPFactory spFactory = null;
    
	private PostPaidRegStatusData setMOSRequest(PostpaidRegStatusRequest request,
			HeaderDetails headerDetails)  {
		PostPaidRegStatusData data = new PostPaidRegStatusData();
		
		if(null!=headerDetails.getNetworkID()){
			data.setPi_network_id(headerDetails.getNetworkID());
		}
		if(null!=request.getMsisdn()){
			data.setPi_msisdn_no(Long.parseLong(request.getMsisdn()));
		}
		if(null!=request.getSIMNumber()){
			data.setPi_sim_serial_no(request.getSIMNumber());
		}
		if(null!=request.getTransRefferenceID()){
			data.setPio_trans_id(request.getTransRefferenceID());
		}
		
		
		return data;
	}

	public PostpaidRegStatusResponse postpaidRegStatus(PostpaidRegStatusRequest request,
			HeaderDetails headerDetails) throws SMFAgentException
			 {

		PostpaidRegStatusResponse response = new PostpaidRegStatusResponse();
		
		PostPaidRegStatusData domainData = setMOSRequest(request, headerDetails);
		if (logger.isDebugEnabled()) {

			logger.debug( domainData.toString());
		}
		
		spFactory = ServiceUtils.executeSPWithOutCommit("pro_sim_reg_status",domainData, domainData);
				

		if (logger.isInfoEnabled()) {

			logger.info(
					"Error Code ==>" + domainData.getPo_error_code());
			logger.info(
					"Error Msg ==>" + domainData.getPo_error_desc());
		}

		Utilities.commitOrRollback(spFactory, domainData.getPo_error_code());

		if (null != domainData.getPo_error_code()
				&& domainData.getPo_error_code() != 0) {

			throw Utilities.setSMFAgentException(domainData.getPo_error_code().toString(),
					domainData.getPo_error_desc());

		} else {

			/**
			 * Set response
			 */
			response = setWebserviceResponse(domainData, request);

		}
		return response;
	}

	private PostpaidRegStatusResponse setWebserviceResponse(PostPaidRegStatusData domainData,
			PostpaidRegStatusRequest request) {

		PostpaidRegStatusResponse response = new PostpaidRegStatusResponse();
		RegStatusInfoListtype resp=null;
		PostPaidRegStatusRefCurData dbData=null;
		List <PostPaidRegStatusRefCurData> curData=	domainData.getPo_sim_reg_status();
		RegStatusInfoListtype [] regList=null;
	if(curData!=null){
		regList=new RegStatusInfoListtype[curData.size()];
		logger.info(" Po_sim_reg_status cursor size is:"+curData.size());
	}
	if(curData!=null && curData.size()>0 ){
	for(int i=0;i<curData.size();i++){
		
		dbData=new  PostPaidRegStatusRefCurData();
		resp= new RegStatusInfoListtype ();
		
		dbData=curData.get(i);
		
		if(dbData.getMsisdn_no()!=null)
			resp.setMsisdn(dbData.getMsisdn_no().toString());
		
		if(dbData.getSim_serial_no()!=null)
			resp.setSIMNumber(dbData.getSim_serial_no());
		
		if(dbData.getStatus()!=null){
			resp.setRemarks(dbData.getStatus());
			
			if(dbData.getStatus().contains("SUCCESS")){
				resp.setStatus("SUCCESS");
			}
			else{
				resp.setStatus("FAILURE");
			}
			
		
		}
		
		regList[i]=resp;
				
	}
	  response.setTransStatus(0);
	  response.setRespCode(0);
	  response.setRespDescription(SMFAgentConstants.SUCCESS);
	  
	  if(regList!=null && regList.length>0) {
	  response.getRegStatusInfo().addAll(Arrays.asList(regList));
	  }
	}
	else{ logger.info(" PostPaidRegStatusRefCurData is null" );
	 	response.setTransStatus(1);
	 	response.setRespCode(1);
	 	response.setRespDescription(SMFAgentConstants.FAILURE);
	}
	response.setTransRefferenceID(domainData.getPio_trans_id());
		  
		if (logger.isDebugEnabled()) {

			StringBuilder builder = new StringBuilder();
			builder.append(":TransRefferenceID").append(response.getTransRefferenceID());
			builder.append(":RespDescription").append(response.getRespDescription());
			
			
			logger.debug( builder.toString());
		}

		return response;
	}
}

