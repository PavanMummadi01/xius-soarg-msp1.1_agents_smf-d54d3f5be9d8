package com.xius.smf.webservices.smfservices;

import java.rmi.RemoteException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import net.bcgi.util.db.SPFactory;

import com.xius.agent.smf.smfmanagement.BulkCAGroupInsertRequest;
import com.xius.agent.smf.smfmanagement.BulkCAGroupInsertResponse;
import com.xius.smf.domaindata.BulkCAGroupInsertData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

@Service("BulkCAGroupInsertImpl")
public class BulkCAGroupInsertImpl {
	
	private  static final Logger logger = LogManager.getLogger(BulkCAGroupInsertImpl.class.getSimpleName());

	public BulkCAGroupInsertResponse bulkCAGroupInsert(
			BulkCAGroupInsertRequest request, HeaderDetails headerDetails) throws RemoteException,	
	SMFAgentException {
		
		BulkCAGroupInsertResponse response=null;		
		BulkCAGroupInsertData domainData =null;		
		
		domainData = setRequestData(request, headerDetails);		
		SPFactory factory=ServiceUtils.executeSPWithOutCommit("pro_bulk_ca_group_insert",domainData, domainData);
		
		if(logger.isInfoEnabled()) {
			logger.info("Error code from DB - bulkCAGroupInsert " + domainData.getPo_error_code() );
		}
		
		Utilities.commitOrRollback(factory, domainData.getPo_error_code());		
		if (domainData.getPo_error_code() == 0) {
			response = setWebserviceResponse(domainData);
		} else {

			response = new BulkCAGroupInsertResponse();
			response.setMessge(SMFAgentConstants.FAILURE);
			response.setTransactionID(String.valueOf(domainData.getPo_transaction_id()));

			throw new SMFAgentException(String.valueOf(domainData.getPo_error_code()),domainData.getPo_error_desc());
		}
		
		return response;
	}
	
	private BulkCAGroupInsertData setRequestData(BulkCAGroupInsertRequest request,
			HeaderDetails headerDetails) {
	
		BulkCAGroupInsertData domainData = new BulkCAGroupInsertData();
		
		domainData.setPi_network_id(headerDetails.getNetworkID());
		
		if(headerDetails.getLoginID()!=null) {
			domainData.setPi_username(headerDetails.getLoginID());
		}
		
		if(request.getChannel()!=null){
			domainData.setPi_channel(request.getChannel());
		}
		
		if(request.getActionFlag()!=null){
			domainData.setPi_action_flag(request.getActionFlag());
		}
		
		if(request.getFileName()!=null){
			domainData.setPi_file_name(request.getFileName());
		}
		
		if (request.getCaGroup() != null) {
			if (request.getCaGroup().getGrpID() != null) {
				domainData.setPi_grp_id(Long.valueOf(request.getCaGroup()
						.getGrpID()));
			}

			if (request.getCaGroup().getGrpName() != null) {
				domainData.setPi_grp_name(request.getCaGroup().getGrpName());
			}

			if (request.getCaGroup().getPkgID() != 0L) {
				domainData.setPi_pkg_id(request.getCaGroup().getPkgID());
			}

			if (request.getCaGroup().getParntAcctID() != 0L) {
				domainData.setPi_parntAcct_id(request.getCaGroup().getParntAcctID());
			}
			
			if (request.getCaGroup().getGrpParentMsisdnNO() != 0L) {
				domainData.setPi_grp_parent_msisdn_no(request.getCaGroup().getGrpParentMsisdnNO());
			}
			
			if (request.getCaGroup().getUseParntSrvce() != null) {
				domainData.setPi_useParntSrvce(request.getCaGroup().getUseParntSrvce());
			}
			
			if (request.getCaGroup().getIterFlag() != null) {
				domainData.setPi_iterFlag(request.getCaGroup().getIterFlag());
			}
			
			if (request.getCaGroup().getParntExpStatus() != null) {
				domainData.setPi_parnt_exp_status(request.getCaGroup().getParntExpStatus());
			}
			
			if (request.getCaGroup().getUseParntCaBal() != null) {
				domainData.setPi_use_parnt_ca_bal(request.getCaGroup().getUseParntCaBal());
			}
			
			if (request.getCaGroup().getUseParntCoreBal() != null) {
				domainData.setPi_use_parnt_core_bal(request.getCaGroup().getUseParntCoreBal());
			}
			
			if (request.getCaGroup().getAllowedBalType()!=-1) {
				domainData.setPi_allowed_bal_type(Long.valueOf(request.getCaGroup().getAllowedBalType()));
			}
			
			if (request.getCaGroup().getChildDefltLimt() != null) {
				domainData.setPi_child_deflt_limt(request.getCaGroup().getChildDefltLimt());
			}
			
			if (request.getCaGroup().getOfficeCode() != 0L) {
				domainData.setPi_office_code(String.valueOf(request.getCaGroup().getOfficeCode()));
			}
			
			if (request.getCaGroup().getChildDetails() != null && request.getCaGroup().getChildDetails().size()> 0) {
				domainData.setPi_child_msisdns(request.getCaGroup().getChildDetails().toArray(new String[request.getCaGroup().getChildDetails().size()]));
			}
		}
		
		
	 	return domainData;
	}
	
	
	private BulkCAGroupInsertResponse setWebserviceResponse(
			BulkCAGroupInsertData  domainData) {
		BulkCAGroupInsertResponse response = new BulkCAGroupInsertResponse();
			response.setMessge(SMFAgentConstants.SUCCESS);
			response.setTransactionID(String.valueOf(domainData.getPo_transaction_id()));
		return response;
	}


}
