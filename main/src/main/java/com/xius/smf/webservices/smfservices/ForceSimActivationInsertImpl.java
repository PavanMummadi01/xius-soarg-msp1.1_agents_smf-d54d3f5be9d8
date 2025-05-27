package com.xius.smf.webservices.smfservices;

import net.bcgi.util.db.SPFactory;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xius.agent.smf.smfmanagement.ForceSimActivationInsertRequest;
import com.xius.agent.smf.smfmanagement.ForceSimActivationInsertResponse;
import com.xius.smf.domaindata.ForceSimActivationInsertData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
@Service("ForceSimActivationInsertImpl")
public class ForceSimActivationInsertImpl {

	private  static final Logger logger = LogManager.getLogger(ForceSimActivationInsertImpl.class.getSimpleName());

	SPFactory spFactory = null;

	/**
	 * This method is used map webservice request object to domain (db) object
	 * 
	 * @param request
	 *            ForceSimActivationInsertRequest
	 * @param headerDetails
	 *            HeaderDetails
	 * @return ForceSimActivationInsertData
	 * @throws ErrorDetailsType
	 */
	private ForceSimActivationInsertData setMOSRequest(ForceSimActivationInsertRequest request,
			HeaderDetails headerDetails) {

		ForceSimActivationInsertData data = new ForceSimActivationInsertData();
		
		if (null != headerDetails.getNetworkID()){
	         data.setPi_network_id(headerDetails.getNetworkID());
			}
			if (null != headerDetails.getLoginID()){
	         data.setPi_username(headerDetails.getLoginID().trim() );
			}
			if (null != request.getFileName()){
				data.setPi_file_name(request.getFileName());
			}
			if (null != request.getNetworkName()){
				data.setPi_network_name(request.getNetworkName());
			}

	       	/*if (null != request.getSIM()) {
			data.setPi_sim(request.getSIM());
	      	}*/
			if (null != request.getSIM()) {
			    List<String> simList = request.getSIM();
			    String[] simArray = simList.toArray(new String[simList.size()]);
			    data.setPi_sim(simArray);
			}
			
	     	/*if (null != request.getMSISDN()) {
			data.setPi_msisdn(request.getMSISDN());
	     	}*/
			if (null != request.getMSISDN()) {
			    List<String> msisdnList = request.getMSISDN();
			    String[] msisdnArray = msisdnList.toArray(new String[msisdnList.size()]);
			    data.setPi_msisdn(msisdnArray);
			}
	    	/*if (null != request.getNIR()) {
			data.setPi_nir(request.getNIR());
	     	}*/
			if (null != request.getNIR()) {
			    List<Long> nirList = request.getNIR();
			    String[] nirArray = nirList.toArray(new String[nirList.size()]);
			    data.setPi_msisdn(nirArray);
			}
	    	/*if (null != request.getSNA()){
			data.setPi_sna(request.getSNA());
		    }*/
			if (null != request.getSNA()) {
			    List<Long> snaList = request.getSNA();
			    String[] snaArray = snaList.toArray(new String[snaList.size()]);
			    data.setPi_msisdn(snaArray);
			}
		    /*if (null != request.getTPID()){
			data.setPi_tpid(request.getTPID());
	    	}*/
			if (null != request.getTPID()) {
			    List<String> tpidList = request.getTPID();
			    String[] tpidArray = tpidList.toArray(new String[tpidList.size()]);
			    data.setPi_msisdn(tpidArray);
			}

		return data;
	}

	public ForceSimActivationInsertResponse forceSimActivation(ForceSimActivationInsertRequest request,
			HeaderDetails headerDetails) throws SMFAgentException {

		/**
		 * Populate domain object with the data from web service request
		 */
		ForceSimActivationInsertResponse response = new ForceSimActivationInsertResponse();
		ForceSimActivationInsertData domainData = setMOSRequest(request, headerDetails);
		if (logger.isDebugEnabled()) {

			logger.info( domainData.toString());
		}
		
		spFactory = ServiceUtils.executeSPWithOutCommit("pro_force_sim_bulk_insert",
				domainData, domainData);

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

	private ForceSimActivationInsertResponse setWebserviceResponse(ForceSimActivationInsertData domainData,
			ForceSimActivationInsertRequest request) {

		ForceSimActivationInsertResponse response = new ForceSimActivationInsertResponse();

		if ( domainData.getPo_trans_id()!=null) {
			response.setTransactionNumber(domainData.getPo_trans_id());
			
			if (logger.isDebugEnabled()) {
				logger.debug("TransNumber ==> "+response.getTransactionNumber());
			}
		}
		

		return response;
	}
}
