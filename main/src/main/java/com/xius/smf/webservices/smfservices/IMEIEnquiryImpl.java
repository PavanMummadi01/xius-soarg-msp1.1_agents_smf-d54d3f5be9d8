package com.xius.smf.webservices.smfservices;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.soap.SOAPException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;


import net.bcgi.util.db.SPFactory;

import com.xius.agent.smf.smfmanagement.IMEIEnquiryRequest;
import com.xius.agent.smf.smfmanagement.IMEIEnquiryResponse;
import com.xius.agent.smf.smfmanagement.IMEIHistoryType;
import com.xius.smf.client.invoker.IMEIEnquiryTiaInvoker;
import com.xius.smf.domaindata.IMEIEnquiryData;
import com.xius.smf.domaindata.Imei_His_dtls_cursor_dtls;
import com.xius.smf.domaindata.Imei_enq_dtls_cursor_dtls;
import com.xius.smf.domaindata.InsertEnquiryData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
@Service("IMEIEnquiryImpl")
public class IMEIEnquiryImpl {

	private  static final Logger logger = LogManager.getLogger(IMEIEnquiryImpl.class.getSimpleName());


	public IMEIEnquiryResponse imeiEnquiry(IMEIEnquiryRequest request,
			HeaderDetails headerDetails) throws RemoteException,
			 SMFAgentException {

		IMEIEnquiryResponse response = null;
		IMEIEnquiryData domainData = null;

		domainData = setRequestData(request, headerDetails);
		SPFactory factory = ServiceUtils.executeSPWithOutCommit(
				"pro_imei_enquiry", domainData, domainData);

		if (logger.isInfoEnabled()) {
			logger.info( "Error code from DB - IMEIEnquiry "
					+ domainData.getPo_error_code());
		}

		Utilities.commitOrRollback(factory, domainData.getPo_error_code());
		if (domainData.getPo_error_code() == 0 && domainData.getPo_imei_enq_dtls()!=null && domainData.getPo_imei_enq_dtls().size()>0) {
			response = setWebserviceResponse(domainData);
		} else if ((domainData.getPo_error_code() == 0  && (domainData.getPo_imei_enq_dtls()!=null && domainData.getPo_imei_enq_dtls().size()==0)) || domainData.getPo_error_code()!= 88888L) {
			IMEIEnquiryTiaInvoker invoker = new IMEIEnquiryTiaInvoker();
			com.xius.tia.TIAManagement_xsd.IMEIEnquiryRequest tiarequest = setTiaRequestData(request);
			try {
				com.xius.tia.TIAManagement_xsd.IMEIEnquiryResponse tiaResponse = invoker
						.ImeiEnquiry(headerDetails, tiarequest);

				if (tiaResponse != null) {
					response = settiaWebserviceResponse(tiaResponse);
					//smfInsert for Enquery Details
					insertEnquiry(response,headerDetails);
					
					if(response!=null && !response.getRespCode().equalsIgnoreCase("0")){
						if(response.getRespDescription()!=null){
							response.setRespDescription(response.getRespDescription());
						}else{
						response.setRespDescription(SMFAgentConstants.FAILURE);
						}
						response.setRespCode(response.getRespCode());
						throw new SMFAgentException(Long.valueOf(response.getRespCode()).toString(),response.getRespDescription());
					}
					
				} else {
					response = new IMEIEnquiryResponse();
					response.setRespDescription(SMFAgentConstants.FAILURE);
					response.setRespCode((String.valueOf(domainData
							.getPo_error_code())));
					throw new SMFAgentException(SMFAgentConstants.NO_DATA_FOUND_ERROR_CODE,
							SMFAgentConstants.NO_DATA_FOUND);
				}
			} catch (SOAPException e) {
				e.printStackTrace();

			}

		} else {

			response = new IMEIEnquiryResponse();
			response.setRespDescription(SMFAgentConstants.FAILURE);
			response.setRespCode((String.valueOf(domainData.getPo_error_code())));

			throw new SMFAgentException(domainData.getPo_error_code().toString(),
					domainData.getPo_error_desc());
		}

		return response;
	}

	private void insertEnquiry(IMEIEnquiryResponse response, HeaderDetails headerDetails) throws SMFAgentException {
		InsertEnquiryData domainData = new InsertEnquiryData();
		if(response.getDeviceId()!=null){
			domainData.setPi_device_id(response.getDeviceId());
		}
		if(response.getPartnerId()!=null){
			domainData.setPi_partner_id(response.getPartnerId());
		}
		if(response.getBranchId()!=null){
			domainData.setPi_branch_id(response.getBranchId());
		}
		if(headerDetails.getNetworkID()!=null){
			domainData.setPi_network_id(headerDetails.getNetworkID());
		}
		if(headerDetails.getLoginID()!=null){
			domainData.setPi_username(headerDetails.getLoginID());
		}
		if(response.getGSMAStatus()!=null){
			domainData.setPi_gsma_status(response.getGSMAStatus());
		}
		if(response.getGSMARefCode()!=null){
			domainData.setPi_gsma_refcode(response.getGSMARefCode());
		}
		if(response.getRecordIdentifier()!=null){
			domainData.setPi_record_identifier(response.getRecordIdentifier());
		}
		if(response.getBlacklistStatus()!=null){
			domainData.setPi_blacklist_status(response.getBlacklistStatus());
		}
		if(response.getGreylistStatus()!=null){
			domainData.setPi_greylist_status(response.getGreylistStatus());
		}
		if(response.getManufacturer()!=null){
			domainData.setPi_manufacturer(response.getManufacturer());
		}
		if(response.getBrandName()!=null){
			domainData.setPi_brand_name(response.getBrandName());
		}
		if(response.getMarketingName()!=null){
			domainData.setPi_marketing_name(response.getMarketingName());
		}
		if(response.getModelName()!=null){
			domainData.setPi_brand_name(response.getModelName());
		}
		if(response.getBand()!=null){
			domainData.setPi_band(response.getBand());
		}
		if(response.getOperatingSys()!=null){
			domainData.setPi_operatingsys(response.getOperatingSys());
		}
		if(response.getNfc()!=null){
			domainData.setPi_nfc(response.getNfc());
		}
		if(response.getBluetooth()!=null){
			domainData.setPi_bluetooth(response.getBluetooth());
		}
		if(response.getWLAN()!=null){
			domainData.setPi_wlan(response.getWLAN());
		}
		if(response.getDeviceType()!=null){
			domainData.setPi_devicetype(response.getDeviceType());
		}
		if(response.getRespCode()!=null){
			domainData.setPi_resp_code(response.getRespCode());
		}
		if(response.getRespDescription()!=null){
			domainData.setPi_resp_description(response.getRespDescription());
		}
		if(response.getDeviceType()!=null){
			domainData.setPi_devicetype(response.getDeviceType());
		}
		if (response.getIMEIHistory() != null) {
			//IMEIHistoryType[] Arr = response.getIMEIHistory();
			List<IMEIHistoryType> IMEIHistoryTypelist=response.getIMEIHistory();
			IMEIHistoryType[] Arr =IMEIHistoryTypelist.toArray(new IMEIHistoryType[IMEIHistoryTypelist.size()]);
			String[] country_arr=new String[Arr.length];
			String[] taskAssignedOn_arr=new String[Arr.length];
			String[] taskPerfomed_arr=new String[Arr.length];
			String[] taskPerfomedBy_arr=new String[Arr.length];
			
			for (int i = 0; i < Arr.length; i++) {
				IMEIHistoryType imei_cur = Arr[i];

				if (imei_cur.getCountry() != null) {
					country_arr[i]=(imei_cur.getCountry());
				}
				if (imei_cur.getTaskAssignedOn() != null) {
					taskAssignedOn_arr[i]=(imei_cur.getTaskAssignedOn());
				}
				if (imei_cur.getTaskPerfomed() != null) {
					taskPerfomed_arr[i]=(imei_cur.getTaskPerfomed());
				}
				if (imei_cur.getTaskPerfomedBy() != null) {
					taskPerfomedBy_arr[i]=(imei_cur.getTaskPerfomedBy());
				}
			}
			domainData.setPi_country_arr(country_arr);
			domainData.setPi_task_assignedon_arr(taskAssignedOn_arr);
			domainData.setPi_task_perfomedby_arr(taskPerfomedBy_arr);
			domainData.setPi_taskp_erfomed_arr(taskPerfomed_arr);
		}
			SPFactory factory = ServiceUtils.executeSPWithOutCommit(
					"pro_imei_enquiry_insert", domainData, domainData);
			
			if (logger.isInfoEnabled()) {
				logger.info( "Error code from DB - pro_imei_enquiry_insert "
						+ domainData.getPo_error_code());
			}

			Utilities.commitOrRollback(factory, domainData.getPo_error_code());
		
		
	}

	private IMEIEnquiryData setRequestData(IMEIEnquiryRequest request,
			HeaderDetails headerDetails) {

		IMEIEnquiryData domainData = new IMEIEnquiryData();

		domainData.setPi_network_id(headerDetails.getNetworkID());

		if (headerDetails.getLoginID() != null) {
			domainData.setPi_username(headerDetails.getLoginID());
		}

		if (request.getDeviceId() != null) {
			domainData.setPi_deviceid(request.getDeviceId());
		}

		if (request.getPartnerId() != null) {
			domainData.setPi_partnerid(request.getPartnerId());
		}

		if (request.getRecordIdentifier() != null) {
			domainData.setPi_recordidentifier(request
					.getRecordIdentifier());
		}

		return domainData;
	}

	private IMEIEnquiryResponse setWebserviceResponse(IMEIEnquiryData domainData) throws NumberFormatException, SMFAgentException {
		IMEIEnquiryResponse response = new IMEIEnquiryResponse();
		  
		if (domainData.getPo_response() != null) {
			response.setRespDescription(domainData.getPo_response());
		}
		if (domainData.getPo_error_code() != null) {
			response.setRespCode(String.valueOf(domainData.getPo_error_code()));
		}
		
		if(domainData.getPo_response()!=null && domainData.getPo_response().equalsIgnoreCase("BLOCKED")){
			response.setBlacklistStatus("yes");
		}else if(domainData.getPo_response()!=null && domainData.getPo_response().equalsIgnoreCase("UNBLOCKED")){
			response.setBlacklistStatus("No");
		}
		
		if (domainData.getPo_imei_enq_dtls() != null) {
			ArrayList<Imei_enq_dtls_cursor_dtls> Arr = domainData
					.getPo_imei_enq_dtls();
			for (int i = 0; i < Arr.size(); i++) {
				Imei_enq_dtls_cursor_dtls imei_cur = Arr.get(i);
				
				if(imei_cur!=null && !imei_cur.getResp_code().equalsIgnoreCase("0")){
					if(imei_cur.getResp_description()!=null){
						response.setRespDescription(imei_cur.getResp_description());
					}else{
						response.setRespDescription(SMFAgentConstants.FAILURE);
					}
					response.setRespCode(imei_cur.getResp_code());
					throw new SMFAgentException(Long.valueOf(imei_cur.getResp_code()).toString(),imei_cur.getResp_description());
				}
				if (imei_cur.getDevice_id() != null) {
					response.setDeviceId(imei_cur.getDevice_id());
				}
				if (imei_cur.getPartner_id() != null) {
					response.setPartnerId(imei_cur.getPartner_id());
				}

				if (imei_cur.getBranch_id() != null) {
					response.setBranchId(imei_cur.getBranch_id());
				}

				if (imei_cur.getBlacklist_status() != null) {
					response.setBlacklistStatus(imei_cur.getBlacklist_status());
				}

				if (imei_cur.getGreylist_status() != null) {
					response.setGreylistStatus(imei_cur.getGreylist_status());
				}
				if (imei_cur.getManufacturer() != null) {
					response.setManufacturer(imei_cur.getManufacturer());
				}
				if (imei_cur.getBrand_name() != null) {
					response.setBrandName(imei_cur.getBrand_name());
				}
				if (imei_cur.getMarketing_name() != null) {
					response.setMarketingName(imei_cur.getMarketing_name());
				}
				if (imei_cur.getModel_name() != null) {
					response.setModelName(imei_cur.getModel_name());
				}
				if (imei_cur.getBand() != null) {
					response.setBand(imei_cur.getBand());
				}
				if (imei_cur.getOperatingsys() != null) {
					response.setOperatingSys(imei_cur.getOperatingsys());
				}
				if (imei_cur.getNfc() != null) {
					response.setNfc(imei_cur.getNfc());
				}
				if (imei_cur.getBluetooth() != null) {
					response.setBluetooth(imei_cur.getBluetooth());
				}
				if (imei_cur.getWlan() != null) {
					response.setWLAN(imei_cur.getWlan());
				}
				if (imei_cur.getDevicetype() != null) {
					response.setDeviceType(imei_cur.getDevicetype());
				}

				if (imei_cur.getGsma_refcode() != null) {
					response.setGSMARefCode(imei_cur.getGsma_refcode());
				}
				if (imei_cur.getGsma_status() != null) {
					response.setGSMAStatus(imei_cur.getGsma_status());
				}
				if (imei_cur.getRecord_identifier() != null) {
					response.setRecordIdentifier(imei_cur
							.getRecord_identifier());
				}

			}

		}

		if (domainData.getPo_imei_his_dtls() != null) {
			ArrayList<Imei_His_dtls_cursor_dtls> Arr = domainData
					.getPo_imei_his_dtls();

			IMEIHistoryType[] IMEIHistory = new IMEIHistoryType[Arr.size()];

			for (int i = 0; i < Arr.size(); i++) {
				Imei_His_dtls_cursor_dtls imei_cur = Arr.get(i);

				IMEIHistoryType temp2 = new IMEIHistoryType();

				if (imei_cur.getCOUNTRY() != null) {
					temp2.setCountry(imei_cur.getCOUNTRY());
				}
				if (imei_cur.getTASK_ASSIGNEDON() != null) {
					temp2.setTaskAssignedOn(imei_cur.getTASK_ASSIGNEDON());
				}
				if (imei_cur.getTASKP_ERFOMED() != null) {
					temp2.setTaskPerfomed(imei_cur.getTASKP_ERFOMED());
				}
				if (imei_cur.getTASK_PERFOMEDBY() != null) {
					temp2.setTaskPerfomedBy(imei_cur.getTASK_PERFOMEDBY());
				}

				IMEIHistory[i] = temp2;
			}
			//response.getIMEIHistory(IMEIHistory);
			response.getIMEIHistory().addAll(Arrays.asList(IMEIHistory));
		}

		return response;
	}

	private com.xius.tia.TIAManagement_xsd.IMEIEnquiryRequest setTiaRequestData(
			IMEIEnquiryRequest request) {

		com.xius.tia.TIAManagement_xsd.IMEIEnquiryRequest tiaRequest = new com.xius.tia.TIAManagement_xsd.IMEIEnquiryRequest();

		if (request.getBranchId() != null) {
			tiaRequest.setBranchId(request.getBranchId());
		}

		if (request.getDeviceId() != null) {
			tiaRequest.setDeviceId(request.getDeviceId());
		}

		if (request.getPartnerId() != null) {
			tiaRequest.setPartnerId(request.getPartnerId());
		}

		if (request.getRecordIdentifier() != null) {
			tiaRequest.setRecordIdentifier(request.getRecordIdentifier());
		}

		return tiaRequest;
	}

	private IMEIEnquiryResponse settiaWebserviceResponse(
			com.xius.tia.TIAManagement_xsd.IMEIEnquiryResponse domainData) {
	
		IMEIEnquiryResponse response = new IMEIEnquiryResponse();
		  
		if(domainData.getResponseData()!=null){
			if (domainData.getResponseData().getResponsecode() != null) {
			response.setRespCode(domainData.getResponseData().getResponsecode());
			}if (domainData.getResponseData().getRespdescription()!= null) {
			response.setRespDescription(domainData.getResponseData().getRespdescription());
			}
		}

		if (domainData.getDeviceId() != null) {
			response.setDeviceId(domainData.getDeviceId());
		}
		if (domainData.getPartnerId() != null) {
			response.setPartnerId(domainData.getPartnerId());
		}

		if (domainData.getBranchId() != null) {
			response.setBranchId(domainData.getBranchId());
		}

		if (domainData.getBlacklistStatus() != null) {
			response.setBlacklistStatus(domainData.getBlacklistStatus());
		}

		if (domainData.getGreylistStatus() != null) {
			response.setGreylistStatus(domainData.getGreylistStatus());
		}
		if (domainData.getManufacturer() != null) {
			response.setManufacturer(domainData.getManufacturer());
		}
		if (domainData.getBrandName() != null) {
			response.setBrandName(domainData.getBrandName());
		}
		if (domainData.getMarketingName() != null) {
			response.setMarketingName(domainData.getMarketingName());
		}
		if (domainData.getModelName() != null) {
			response.setModelName(domainData.getModelName());
		}
		if (domainData.getBand() != null) {
			response.setBand(domainData.getBand());
		}
		if (domainData.getOperatingSys() != null) {
			response.setOperatingSys(domainData.getOperatingSys());
		}
		if (domainData.getNfc() != null) {
			response.setNfc(domainData.getNfc());
		}
		if (domainData.getBluetooth() != null) {
			response.setBluetooth(domainData.getBluetooth());
		}
		if (domainData.getWLAN() != null) {
			response.setWLAN(domainData.getWLAN());
		}
		if (domainData.getDeviceType() != null) {
			response.setDeviceType(domainData.getDeviceType());
		}

		if (domainData.getGSMARefCode() != null) {
			response.setGSMARefCode(domainData.getGSMARefCode());
		}
		if (domainData.getGSMAStatus() != null) {
			response.setGSMAStatus(domainData.getGSMAStatus());
		}
		if (domainData.getRecordIdentifier() != null) {
			response.setRecordIdentifier(domainData.getRecordIdentifier());
		}

		if (domainData.getIMEIHistory() != null) {
			com.xius.tia.TIAManagement_xsd.IMEIHistoryType[] Arr = domainData
					.getIMEIHistory();

			IMEIHistoryType[] IMEIHistory = new IMEIHistoryType[Arr.length];

			for (int i = 0; i < Arr.length; i++) {
				com.xius.tia.TIAManagement_xsd.IMEIHistoryType imei_cur = Arr[i];

				IMEIHistoryType temp2 = new IMEIHistoryType();

				if (imei_cur.getCountry() != null) {
					temp2.setCountry(imei_cur.getCountry());
				}
				if (imei_cur.getTaskAssignedOn() != null) {
					temp2.setTaskAssignedOn(imei_cur.getTaskAssignedOn());
				}
				if (imei_cur.getTaskPerfomed() != null) {
					temp2.setTaskPerfomed(imei_cur.getTaskPerfomed());
				}
				if (imei_cur.getTaskPerfomedBy() != null) {
					temp2.setTaskPerfomedBy(imei_cur.getTaskPerfomedBy());
				}

				IMEIHistory[i] = temp2;
			}
			//response.setIMEIHistory(IMEIHistory);
			response.getIMEIHistory().addAll(Arrays.asList(IMEIHistory));
		}

		return response;
	}

}
