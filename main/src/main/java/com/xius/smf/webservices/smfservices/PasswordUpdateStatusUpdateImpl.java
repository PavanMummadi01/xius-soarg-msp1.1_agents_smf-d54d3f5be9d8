/******************************************************************
 * Company XIUS (Megasoft Pvt Ltd Hyderabad,INDIA)
 * � Copyright 2006 MEGASOFT. 
 *
 * Package      : com.xius.smf.webservices.smfservices;
 * Name of File : PasswordUpdateStatusUpdateImpl.java
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

import com.xius.agent.smf.postpaidmanagement.PasswordUpdateStatusUpdateReq;
import com.xius.agent.smf.postpaidmanagement.PasswordUpdateStatusUpdateRes;
import com.xius.smf.domaindata.PasswordUpdateStatusUpdateData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

@Service("PasswordUpdateStatusUpdateImpl")
public class PasswordUpdateStatusUpdateImpl {
	private  static final Logger logger = LogManager.getLogger(PasswordUpdateStatusUpdateImpl.class.getSimpleName());
	public PasswordUpdateStatusUpdateRes passwordUpdateStatusUpdate(PasswordUpdateStatusUpdateReq request,HeaderDetails header) throws RemoteException,
		SMFAgentException {
		
		PasswordUpdateStatusUpdateRes response=new PasswordUpdateStatusUpdateRes();
		
		PasswordUpdateStatusUpdateData domainData =null;
		
		
		domainData = setRequestData(request, header);
		
		if (logger.isInfoEnabled()) {
			logger.info("Data Sending To Db :  " + domainData.toString());
		}

		SPFactory factory = ServiceUtils.executeSPWithOutCommit("pro_password_reqst_status_upd", domainData, domainData);
		if (logger.isInfoEnabled()) {
			logger.info("Data Recieving  From  Db :  " + domainData.toString());

		}
		Utilities.commitOrRollback(factory, domainData.getPo_error_code());
		
		if (domainData.getPo_error_code() == 0) {

			response = setWebserviceResponse(domainData);

		} else {
			throw new SMFAgentException(domainData.getPo_error_code().toString(),domainData.getPo_error_desc());

		}
		return response;
	}
	
	private PasswordUpdateStatusUpdateData setRequestData(PasswordUpdateStatusUpdateReq request,
			HeaderDetails headerDetails) {
	
		PasswordUpdateStatusUpdateData domainData = new PasswordUpdateStatusUpdateData();
		
		if(headerDetails.getNetworkID()!=null)
		domainData.setPi_network_id(headerDetails.getNetworkID());
			
		if(headerDetails.getNetworkID()!=null)
			domainData.setPi_network_id(headerDetails.getNetworkID());
				
			if(request.getTransId()!=null)
			domainData.setPi_transaction_id(request.getTransId());
			
			if(request.getExtErrCode()!=null)
			domainData.setPi_ext_err_code(request.getExtErrCode());
			
			if(request.getStatus()!=null)
			domainData.setPi_status(request.getStatus());
			
			if(request.getRemarks()!=null)
				domainData.setPi_remarks(request.getRemarks());
		
		return domainData;
	}
	
	
	private PasswordUpdateStatusUpdateRes setWebserviceResponse(PasswordUpdateStatusUpdateData domainData) {
		PasswordUpdateStatusUpdateRes response=new PasswordUpdateStatusUpdateRes();
		//response.setTransId(domainData.ge);
		response.setMessage(domainData.getPo_error_desc());
				return response;
	}
	
	
	
	
	

}
