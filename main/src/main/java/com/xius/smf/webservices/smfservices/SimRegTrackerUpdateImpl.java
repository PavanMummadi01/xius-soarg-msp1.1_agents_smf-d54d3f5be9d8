package com.xius.smf.webservices.smfservices;

import java.rmi.RemoteException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xius.agent.smf.smfmanagement.SimRegTrackerUpdateRequest;
import com.xius.agent.smf.smfmanagement.SimRegTrackerUpdateResponse;
import com.xius.smf.domaindata.SIMRegTrackerUpdateData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;


import net.bcgi.util.db.SPFactory;

@Service("SimRegTrackerUpdateImpl")
public class SimRegTrackerUpdateImpl {

	private  static final Logger logger = LogManager.getLogger(SimRegTrackerUpdateImpl.class.getSimpleName());

	public SimRegTrackerUpdateResponse simRegTrackerUpdate(SimRegTrackerUpdateRequest request,
			HeaderDetails headerDetails) throws RemoteException, SMFAgentException {

		SimRegTrackerUpdateResponse response = new SimRegTrackerUpdateResponse();

		SIMRegTrackerUpdateData domainData = null;
		logger.info("setRequestData........................");

		domainData = setRequestData(request, headerDetails);
		SPFactory factory = ServiceUtils.executeSPWithOutCommit("pro_sim_reg_tracker_update", domainData, domainData);
		if (logger.isInfoEnabled()) {
			logger.info( domainData.toString());
		}
		Utilities.commitOrRollback(factory, domainData.getPo_error_code());
		if (logger.isInfoEnabled()) {

			logger.info(
					"Error Code from  pro_sim_reg_tracker_update  ==>" + domainData.getPo_error_code());
			logger.info(
					"Error Msg from  pro_sim_reg_tracker_update  ==>" + domainData.getPo_error_desc());
		}
		if (domainData.getPo_error_code() == 0) {
			response = setWebserviceResponse(domainData);
		}

		else {
			throw new SMFAgentException(domainData.getPo_error_code().toString(), domainData.getPo_error_desc());
		}

		return response;

	}

	public SIMRegTrackerUpdateData setRequestData(SimRegTrackerUpdateRequest request, HeaderDetails headerDetails) {

		SIMRegTrackerUpdateData data = new SIMRegTrackerUpdateData();

		if (headerDetails.getNetworkID() != null)
			data.setPi_network_id(headerDetails.getNetworkID());
		if (request.getTransRefNumber() != null)
			data.setPi_trans_ref_number(request.getTransRefNumber());
		if (request.getStatus() != null)
			data.setPi_status(request.getStatus());
		if (request.getRemarks() != null)
			data.setPi_remarks(request.getRemarks());
		if(request.getFailedNode()!=null){
			data.setPi_failednode(request.getFailedNode());
		}
		if(request.getINITIATEDFROM()!=null){
			data.setPi_initiated_from(request.getINITIATEDFROM());
		}
		if(request.getACCOUNTMDN()!=null){
			data.setPi_account_mdn(request.getACCOUNTMDN());
		}
		if(request.getSIMNUMBER()!=null){
			data.setPi_sim_number(request.getSIMNUMBER());
		}
		if(request.getEVENTFLAG()!=null){
			data.setPi_event_flag(request.getEVENTFLAG());
		}
		if(request.getNEWPASSWORD()!=null){
			data.setPi_new_password(request.getNEWPASSWORD());
		}
		if(request.getREGISTRATIONREQUIRED()!=null){
			data.setPi_registration_required(request.getREGISTRATIONREQUIRED());
		}
		if(request.getICCNO()!=null){
			data.setPi_icc_no(request.getICCNO());
		}
		if(request.getREGISTRATIONTYPE()!=null){
			data.setPi_registration_type(request.getREGISTRATIONTYPE());
		}
		if(request.getACCOUNTSTATUS()!=null){
			data.setPi_account_status(request.getACCOUNTSTATUS());
		}
		if(request.getSCICCNO()!=null){
			data.setPi_sc_iccno(request.getSCICCNO());
		}
		if(request.getGOLDENICCNO()!=null){
			data.setPi_golden_icc_no(request.getGOLDENICCNO());
		}
		if(request.getNORMALORDERID()!=null){
			data.setPi_normal_order_id(request.getNORMALORDERID());
		}
		if(request.getSUBACCOUNTSTATUS()!=null){
			data.setPi_account_status(request.getSUBACCOUNTSTATUS());
		}
		if(request.getHLRFRCONNECTION()!=null){
			data.setPi_hlr_fr_connection(request.getHLRFRCONNECTION());
		}
		if(request.getHLRFRCONNECTIONON()!=null){
			data.setPi_hlrfr_connection_on(request.getHLRFRCONNECTIONON());
		}
		if(request.getISCORP()!=null){
			data.setPi_is_corp(request.getISCORP());
		}
		if(request.getORDERLIST()!=null){
			data.setPi_order_list(request.getORDERLIST());
		}
		if(request.getMSISDNLISTLong()!=null){
			data.setPi_msisdn_list_long(String.valueOf(request.getMSISDNLISTLong()));
		}
		if(request.getUTILLIST()!=null){
			data.setPi_util_list(String.valueOf(request.getUTILLIST()));
		}
		if(request.getCHARGES()!=null){
			data.setPi_charges(request.getCHARGES());
		}
		if(request.getMSISDNLIST()!=null){
			data.setPi_msisdn_list(request.getMSISDNLIST());
		}
		if(request.getDEVICEIDKEY()!=null){
			data.setPi_device_id_key(request.getDEVICEIDKEY());
		}
		if(request.getNEWVALUE()!=null){
			data.setPi_new_value(request.getNEWVALUE());
		}
		if(request.getAUTHENTICATECARRIERID()!=null){
			data.setPi_authenticate_carrierid(request.getAUTHENTICATECARRIERID());
		}
		if(request.getDTFAILUREERRORCODE()!=null){
			data.setPi_dt_failure_error_code(request.getDTFAILUREERRORCODE());
		}
		if(request.getDENOMINATIONS()!=null){
			data.setPi_denominations(request.getDENOMINATIONS());
		}
		if(request.getTAXID()!=null){
			data.setPi_tax_id(request.getTAXID());
		}
		if(request.getEMAILID()!=null){
			data.setPi_email_id(request.getEMAILID());
		}
		if(request.getBALANCEAMOUNT()!=null){
			data.setPi_balance_amount(request.getBALANCEAMOUNT());
		}
		if(request.getORDERDATE()!=null){
			data.setPi_order_date(request.getORDERDATE());
		}
		if(request.getNEWVALIDITYDATE()!=null){
			data.setPi_new_validity_date(request.getNEWVALIDITYDATE());
		}
		if(request.getPORTREQFORMID()!=null){
			data.setPi_port_req_form_id(request.getPORTREQFORMID());
		}
		if(request.getPORTID()!=null){
			data.setPi_port_id(request.getPORTID());
		}
		if(request.getREJECTEDDATA()!=null){
			data.setPi_rejected_data(request.getREJECTEDDATA());
		}
		if(request.getNPRSUBMTIME()!=null){
			data.setPi_npr_subm_time(request.getNPRSUBMTIME());
		}
		if(request.getTHRESHOLDTIME()!=null){
			data.setPi_threshold_time(request.getTHRESHOLDTIME());
		}
		if(request.getCOMPEMAILID()!=null){
			data.setPi_port_req_form_id(request.getPORTREQFORMID());
		}
		if(request.getPORTREQFORMID()!=null){
			data.setPi_comp_email_id(request.getCOMPEMAILID());
		}
		if(request.getNOTIFICATIONDATAEMAIL()!=null){
			data.setPi_notification_data_email(request.getNOTIFICATIONDATAEMAIL());
		}
		if(request.getMDN()!=null){
			data.setPi_mdn(request.getMDN());
		}
		if(request.getNEWMDN()!=null){
			data.setPi_new_mdn(request.getNEWMDN());
		}
		if(request.getFRTRNNO()!=null){
			data.setPi_fr_trn_no(request.getFRTRNNO());
		}
		if(request.getNEWCCMSISDN()!=null){
			data.setPi_new_cc_msisdn(request.getNEWCCMSISDN());
		}
		if(request.getOLDCCMSISDN()!=null){
			data.setPi_old_cc_msisdn(request.getOLDCCMSISDN());
		}
		if(request.getOLDIMSI()!=null){
			data.setPi_old_imsi(request.getOLDIMSI());
		}
		if(request.getSERVICETYPE()!=null){
			data.setPi_service_type(request.getSERVICETYPE());
		}
		if(request.getIMSISIMREGISTRATION()!=null){
			data.setPi_imsi_sim_registration(request.getIMSISIMREGISTRATION());
		}
		if(request.getOLDIMSISIMREGISTRATION()!=null){
			data.setPi_old_imsi_sim_registration(request.getOLDIMSISIMREGISTRATION());
		}
		if(request.getACTUALMSISDN()!=null){
			data.setPi_actual_msisdn(request.getACTUALMSISDN());
		}
		if(request.getACCOUNTID()!=null){
			data.setPi_account_id(request.getACCOUNTID());
		}
		if(request.getBLOCKEDMSISDN()!=null){
			data.setPi_blocked_msisdn(request.getBLOCKEDMSISDN());
		}
		if(request.getCREDITLIMTI()!=null){
			data.setPi_credit_limti(request.getCREDITLIMTI());
		}
		if(request.getOLDCCMDNLIST()!=null){
			data.setPi_old_cc_mdn_list(request.getOLDCCMDNLIST());
		}
		if(request.getNEWCCMDNLIST()!=null){
			data.setPi_new_cc_mdn_list(request.getNEWCCMDNLIST());
		}
		if(request.getPROMOCODE()!=null){
			data.setPi_promo_code(request.getPROMOCODE());
		}
		if(request.getUSSDMDN()!=null){
			data.setPi_ussd_mdn(request.getUSSDMDN());
		}
		if(request.getDEALERUSERID()!=null){
			data.setPi_dealer_user_id(request.getDEALERUSERID());
		}
		if(request.getINPUTICCNO()!=null){
			data.setPi_input_icc_no(request.getINPUTICCNO());
		}
		if(request.getACCOUNTTYPE()!=null){
			data.setPi_account_type(request.getACCOUNTTYPE());
		}
		if(request.getLOCATIONCODE()!=null){
			data.setPi_location_code(request.getLOCATIONCODE());
		}
		if(request.getTARIFFID()!=null){
			data.setPi_tariff_id(request.getTARIFFID());
		}
		if(request.getWORKGROUPID()!=null){
			data.setPi_workgroup_id(request.getWORKGROUPID());
		}
		if(request.getIMEI()!=null){
			data.setPi_imei(request.getIMEI());
		}
		if(request.getSALETYPE()!=null){
			data.setPi_sale_type(request.getSALETYPE());
		}
		if(request.getPRICE()!=null){
			data.setPi_price(request.getPRICE());
		}
		if (request.getSimisactual() != null) {
		    data.setPi_sim_is_actual(request.getSimisactual());
		}
		if (request.getSimpsuedo() != null) {
		    data.setPi_sim_psuedo(request.getSimpsuedo());
		}
		if (request.getInvalidaccountstate() != null) {
		    data.setPi_invalid_account_state(request.getInvalidaccountstate());
		}
		if (request.getReason() != null) {
		    data.setPi_reason(request.getReason());
		}
		if (request.getUpdateproductstatus() != null) {
		    data.setPi_update_product_status(request.getUpdateproductstatus());
		}
		if (request.getNokadidcode() != null) {
		    data.setPi_no_kad_id_code(request.getNokadidcode());
		}
		if (request.getGetorderdetails() != null) {
		    data.setPi_get_order_details(request.getGetorderdetails());
		}
		if (request.getErrorcode() != null) {
		    data.setPi_error_code(request.getErrorcode());
		}
		if (request.getInputpersonaldata() != null) {
		    data.setPi_input_personal_data(request.getInputpersonaldata());
		}
		if (request.getGetaccountdetails() != null) {
		    data.setPi_get_account_details(request.getGetaccountdetails());
		}
		if (request.getRequesttype() != null) {
		    data.setPi_request_type(request.getRequesttype());
		}
		if (request.getUsername() != null) {
		    data.setPi_user_name(request.getUsername());
		}
		if (request.getMiddlename() != null) {
		    data.setPi_middle_name(request.getMiddlename());
		}
		if (request.getPostpaid() != null) {
		    data.setPi_post_paid(request.getPostpaid());
		}
		if (request.getOldmsisdn() != null) {
		    data.setPi_old_mdn(request.getOldmsisdn());
		}
		if (request.getZipCode() != null) {
		    data.setPi_zipcode(request.getZipCode());
		}
		if (request.getOldvalue() != null) {
		    data.setPi_old_value(request.getOldvalue());
		}
		if (request.getNewimsi() != null) {
		    data.setPi_new_imsi(request.getNewimsi());
		}
		if (request.getTransactionid() != null) {
		    data.setPi_transaction_id(request.getTransactionid());
		}
		if (request.getSubtransactionid() != null) {
		    data.setPi_sub_transaction_id(request.getSubtransactionid());
		}
		if (request.getIccid() != null) {
		    data.setPi_icc_id(request.getIccid());
		}
		if (request.getAuditoldsim() != null) {
		    data.setPi_audit_old_sim(request.getAuditoldsim());
		}
		if (request.getAuditimsi() != null) {
		    data.setPi_imsi(request.getAuditimsi());
		}
		if (request.getMsisdn() != null) {
		    data.setPi_msisdn(request.getMsisdn());
		}
		if (request.getOfficecode() != null) {
		    data.setPi_office_code(request.getOfficecode());
		}
		if (request.getAuditoldmsisdn() != null) {
		    data.setPi_audit_old_msisdn(request.getAuditoldmsisdn());
		}
		if (request.getAuditnewmsisdn() != null) {
		    data.setPi_audit_new_msisdn(request.getAuditnewmsisdn());
		}
		if (request.getAuditimsi() != null) {
		    data.setPi_audit_imsi(request.getAuditimsi());
		}
		if (request.getAuditaction() != null) {
		    data.setPi_audit_action(request.getAuditaction());
		}
		if (request.getAuditiccid() != null) {
		    data.setPi_audit_icc_id(request.getAuditiccid());
		}
		if (request.getData() != null) {
		    data.setPi_data(request.getData());
		}
		if (request.getAuditnewsim() != null) {
		    data.setPi_audit_new_sim(request.getAuditnewsim());
		}
		if (request.getAuditmsisdn() != null) {
		    data.setPi_audit_msisdn(request.getAuditmsisdn());
		}
		if (request.getOldmsisdn() != null) {
		    data.setPi_old_msisdn(request.getOldmsisdn());
		}
		if (request.getNewmsisdn() != null) {
		    data.setPi_new_msisdn(request.getNewmsisdn());
		}
		if (request.getFailedmsisdnslistold() != null) {
		    data.setPi_failed_msisdns_list_old(request.getFailedmsisdnslistold());
		}
		if (request.getFailedmsisdnslistnew() != null) {
		    data.setPi_failed_msisdns_list_new(request.getFailedmsisdnslistnew());
		}
		if (request.getIssubscribed() != null) {
		    data.setPi_is_subscribed(request.getIssubscribed());
		}
		if (request.getFlag5G() != null) {
		    data.setPi_flag_5g(request.getFlag5G());
		}
		if (request.getReturncode() != null) {
		    data.setPi_return_code(request.getReturncode());
		}
		if (request.getResponsecode() != null) {
		    data.setPi_response_code(request.getResponsecode());
		}
		if (request.getNewsim() != null) {
		    data.setPi_new_sim(request.getNewsim());
		}
		if (request.getOldsim() != null) {
		    data.setPi_old_sim(request.getOldsim());
		}
		if (request.getExternaltransid2() != null) {
		    data.setPi_external_trans_id_2(request.getExternaltransid2());
		}
		if (request.getLoginid() != null) {
		    data.setPi_login_id(request.getLoginid());
		}
		if (request.getActive() != null) {
		    data.setPi_active(request.getActive());
		}
		if (request.getUserid() != null) {
		    data.setPi_user_id(request.getUserid());
		}
		if (request.getContent() != null) {
		    data.setPi_content(request.getContent());
		}
		if (request.getErrorCode() != null) {
		    data.setPi_errorcode(request.getErrorCode());
		}
		
		return data;
	}

	private SimRegTrackerUpdateResponse setWebserviceResponse(SIMRegTrackerUpdateData domainData) {

		SimRegTrackerUpdateResponse response = new SimRegTrackerUpdateResponse();

		return response;

	}

}
