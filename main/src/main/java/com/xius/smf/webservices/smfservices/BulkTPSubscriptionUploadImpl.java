package com.xius.smf.webservices.smfservices;

import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import net.bcgi.util.db.SPFactory;

import com.xius.agent.smf.smfmanagement.BulkTPSubscriptionUploadRequest;
import com.xius.agent.smf.smfmanagement.BulkTPSubscriptionUploadResponse;
import com.xius.smf.domaindata.BulkTPSubsUpldData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
@Service("BulkTPSubscriptionUploadImpl")
public class BulkTPSubscriptionUploadImpl {
	private  static final Logger logger = LogManager.getLogger(BulkTPSubscriptionUploadImpl.class.getSimpleName());
	public BulkTPSubscriptionUploadResponse bulkTPSubscriptionUpload(
			BulkTPSubscriptionUploadRequest request,HeaderDetails headerDetails) throws RemoteException,SMFAgentException {


			BulkTPSubsUpldData domainData =null;
			BulkTPSubscriptionUploadResponse response=new BulkTPSubscriptionUploadResponse();
		
			domainData = setRequestData(request, headerDetails);	

		SPFactory spfactory=ServiceUtils.executeSPWithOutCommit("pro_bulk_tarifpack_change_upld", domainData, domainData);

		Utilities.commitOrRollback(spfactory, domainData.getPo_error_code());
		
		if(domainData.getPo_error_code()!=0)
		{
			
			throw Utilities.setSMFAgentException(domainData.getPo_error_code().toString(), domainData.getPo_error_desc());
		}
		else
		{
			response=setWebserviceResponse(domainData);
		}
		
			
		return response;





	}
		private BulkTPSubsUpldData setRequestData(
				BulkTPSubscriptionUploadRequest request, HeaderDetails headerDetails2) {
			BulkTPSubsUpldData domainData = new BulkTPSubsUpldData();
			Long[] msisdns={};
			String[]NewTariffPlanID ={};
			BigDecimal[]Charge={};
			
			if(headerDetails2.getNetworkID()!=null)
			domainData.setPi_network_id(headerDetails2.getNetworkID());
			
			if(request.getMSISDN().size()>0 && request.getMSISDN()!=null)
			{
				msisdns=Utilities.convertStringArytoLongAry(request.getMSISDN().toArray(new String [request.getMSISDN().size()]));
				domainData.setPi_msisdn_no(msisdns);
			}
			if(request.getNewTariffPlanID().size()>0 && request.getNewTariffPlanID()!=null)		
			{
				/*NewTariffPlanID=request.getNewTariffPlanID();*/
				List<String> newTariffPlanIDList = request.getNewTariffPlanID();
				String[] newTariffPlanID = newTariffPlanIDList.toArray(new String[newTariffPlanIDList.size()]);
				domainData.setPi_new_tarrif_pack_id(newTariffPlanID);
			}
			
			if(request.getFileName().length()>0 && request.getFileName()!=null)
			{
				domainData.setPi_file_name(request.getFileName());
			}
			
			if(request.getCharge().size()>0 && request.getCharge()!=null)
			{
				Charge=Utilities.convertStringArytoBigDecimalAry(request.getCharge().toArray(new String[request.getCharge().size()]));
				domainData.setPi_charge(Charge);
			}
			if(request.getReason().size()>0 && request.getReason()!=null)
			{
				List<String> ReasonList = request.getReason();
				String[] ReasonListarray = ReasonList.toArray(new String[ReasonList.size()]);
				domainData.setPi_reason(ReasonListarray);
	        }
			if(request.getChannelID().length()>0 && request.getChannelID()!=null)
			{
				 domainData.setPi_channel_id(request.getChannelID());
	        }
			
			if(request.getOfficeCode()!=null)
			domainData.setPi_office_code(Long.parseLong(request.getOfficeCode()));
			   
			return domainData;
		}	

		private BulkTPSubscriptionUploadResponse setWebserviceResponse(
				BulkTPSubsUpldData domainData) {
			BulkTPSubscriptionUploadResponse response=new BulkTPSubscriptionUploadResponse();
			response.setBatchId(domainData.getPo_batch_id());
			response.setMessage(SMFAgentConstants.SUCCESS);
			return response;
		}



	}
