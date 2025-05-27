/******************************************************************
 * Company XIUS (Megasoft Pvt Ltd Hyderabad,INDIA)
 * � Copyright 2006 MEGASOFT. 
 *
 * Package      : com.xius.smf.webservices.smfservices;
 * Name of File : PasswordUpdateImpl.java
 * Date /Year   : Sep 22, 2017
 * Author       : Sambasiva Rao Aakula
 * Discription  :
 *
 * Method names : 
 * 
 * Modifications
 * Method Name  |  Date   |  Author  | Explanation
 * -------------------------------------------------------------              
 *              |         |          |
 *              |         |          | 
 *             
 ********************************************************************/
package com.xius.smf.webservices.smfservices;

import java.rmi.RemoteException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;


import net.bcgi.util.db.SPFactory;

import com.xius.agent.smf.postpaidmanagement.PasswordUpdateRequest;
import com.xius.agent.smf.postpaidmanagement.PasswordUpdateResponse;
import com.xius.smf.domaindata.PasswordUpdateData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

@Service("PasswordUpdateImpl")
public class PasswordUpdateImpl {
	
	private  static final Logger logger = LogManager.getLogger(PasswordUpdateImpl.class.getSimpleName());
	public PasswordUpdateResponse updatePassword(PasswordUpdateRequest request,HeaderDetails header) throws RemoteException,
		SMFAgentException {
		
		PasswordUpdateResponse response=new PasswordUpdateResponse();
		
		PasswordUpdateData domainData =null;
		
		
		domainData = setRequestData(request, header);
		
		if (logger.isInfoEnabled()) {
			logger.info("Data Sending To Db :  " + domainData.toString());
		}
		
		SPFactory factory=ServiceUtils.executeSPWithOutCommit("pro_password_update_request",domainData, domainData);
		if (logger.isInfoEnabled()) {
			logger.info("Data Recieving From  Db :  " + domainData.toString());
		}
		
		Utilities.commitOrRollback(factory, domainData.getPo_error_code());
		
		if (domainData.getPo_error_code() == 0) {

			response = setWebserviceResponse(domainData);

		} else {
			throw new SMFAgentException(domainData.getPo_error_code().toString(),domainData.getPo_error_desc());

		}
		
		
		
		return response;
	}
	
	private PasswordUpdateData setRequestData(PasswordUpdateRequest request,
			HeaderDetails headerDetails) {
	
		PasswordUpdateData domainData = new PasswordUpdateData();
		
		if(headerDetails.getNetworkID()!=null)
		domainData.setPi_network_id(headerDetails.getNetworkID());
			
		if(Utilities.isEmpty(request.getChannel())==false)
		domainData.setPi_channel(request.getChannel());
		
		if(Utilities.isEmpty(request.getLoginId())==false){
			domainData.setPi_login_id(request.getLoginId());
		}
		else {
			domainData.setPi_login_id(headerDetails.getLoginID());
		}
		
		if(Utilities.isEmpty(request.getExternalTransId())==false){
			domainData.setPi_ext_trans_id(request.getExternalTransId());
		}
		
		if(Utilities.isEmpty(request.getUserDefined1())==false){
			domainData.setPi_reason(request.getUserDefined1());
		}
		
		return domainData;
	}
	
	
	private PasswordUpdateResponse setWebserviceResponse(
			PasswordUpdateData domainData) {
		PasswordUpdateResponse response=new PasswordUpdateResponse();
		response.setTransId(domainData.getPo_transaction_id());
		response.setMessage(domainData.getPo_error_desc());
				return response;
	}
}
