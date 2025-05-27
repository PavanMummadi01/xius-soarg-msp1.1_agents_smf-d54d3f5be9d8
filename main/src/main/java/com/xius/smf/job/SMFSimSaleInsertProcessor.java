package com.xius.smf.job;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.xius.smf.domaindata.HlrStateChngCurData;
import com.xius.smf.domaindata.SIMSaleData;
import com.xius.smf.domaindata.UpdateSIMSaleData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;


import net.bcgi.util.db.SPFactory;

public class SMFSimSaleInsertProcessor {

	private static final Logger logger = LogManager.getLogger(SMFSimSaleInsertProcessor.class.getSimpleName());

	
	HlrStateChngCurData curData=null;
	SPFactory spFactory=null;
	
     public SMFSimSaleInsertProcessor(HlrStateChngCurData curData){
		this.curData=curData; 
     
     }

	
  public SIMSaleData callSIMSaleInsert() {
	
	  //calling method to form requestdata object
	SIMSaleData domainData= formdoaminData(curData);
		
	try {
		spFactory = ServiceUtils.executeSPWithOutCommit("pro_sim_sale_req_insert", domainData, domainData);
	
	if (logger.isInfoEnabled()) {
		logger.debug( domainData.toString());
	}
	/**
	 * invoke Stored Procedure.
	 */
	Long errCode  = domainData.getPo_error_code();
	String errMsg  = domainData.getPo_error_desc();
	if (logger.isInfoEnabled()) {

		logger.info( "Error Code from pro_sim_sale_req_insert  ==>" + errCode);
		logger.info( "Error Msg from pro_sim_sale_req_insert ==>" + errMsg);
	}
	Utilities.commitOrRollback(spFactory, errCode);

	if ( errCode != 0) {

		logger.error("Error Code returned by smfdb" + domainData.getPo_error_code());
		logger.error( "Error Message by smfdb" + domainData.getPo_error_desc());
		
	}
	logger.info( "TransactionId returned by smfdb" + domainData.getPo_trans_id());
	
	} catch (SMFAgentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		logger.error( "Error Code by SMFAGENTEXCEPTION" + e.getErrorCode());
		logger.error( "Error Message by SMFAGENTEXCEPTION" + e.getErrorMessage());
		
		
	}
	    	
	return domainData;
	}
	
  public SIMSaleData formdoaminData(HlrStateChngCurData curData){
	  SIMSaleData   simSaleData=new SIMSaleData();
	  
	  if(null!=curData.getAccount_id())
	  simSaleData.setPi_new_account_id(curData.getAccount_id().toString());
	  
	  if(null!=curData.getImsi_no())
	  simSaleData.setPi_new_imsi(curData.getImsi_no());
	  
	  if(null!=curData.getMsisdn_no())
      simSaleData.setPi_new_msisdn(curData.getMsisdn_no());
	  
	  if(null!=curData.getNetwork_id())
	  simSaleData.setPi_network_id(curData.getNetwork_id().longValue());
	  
	  if(null!=curData.getNew_state()&&curData.getNew_state().length()>0)
	   simSaleData.setPi_NEW_STATE(curData.getNew_state());	 
	  
	  if(null!=curData.getOld_state()&&curData.getOld_state().length()>0)
	   simSaleData.setPi_OLD_STATE(curData.getOld_state());  
	  
	  if(null!=curData.getSim_serial_no()&&curData.getSim_serial_no().length()>0)
		  simSaleData.setPi_new_sim(curData.getSim_serial_no());  
	  
	  if(null!=curData.getStatus_change_date()&&curData.getStatus_change_date().length()>0)
	  {  
		  
		  	SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		  		Date parsedDate;
		  		String newFormatttedDate=null;
		  		try {
					parsedDate = simpleDateFormat2.parse(curData.getStatus_change_date());
					simpleDateFormat2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");	
			  		newFormatttedDate = simpleDateFormat2.format(parsedDate);				
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					logger.error("The exception u have entered ");
				}
		  	
		  
		  
		  simSaleData.setPi_STATUS_CHANGE_DATE(newFormatttedDate);
	  }
	  if(null!=curData.getTechnology()&&curData.getTechnology().length()>0)
		  simSaleData.setPi_technology(curData.getTechnology());
       // inserting activity type of 109      
	  if(null!=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.STATE_CHANGE_ACTIVITY_ID))
	  simSaleData.setPi_activity_type(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.STATE_CHANGE_ACTIVITY_ID));
	 //inserting current state transaction
	  if(null!=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.SMF_CURRENTSTATE_ID))
	  simSaleData.setPi_curr_state_id(new Long(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.SMF_CURRENTSTATE_ID)));
	  
	  return simSaleData;
  }
  public void SIMSaleUpdate(UpdateSIMSaleData domainData){
		try {
			spFactory = ServiceUtils.executeSPWithOutCommit("pro_sim_sale_req_update", domainData, domainData);
		
		if (logger.isInfoEnabled()) {
			logger.debug( domainData.toString());
		}
		/**
		 * invoke Stored Procedure.
		 */
		
		
		Long errCode  = domainData.getPo_error_code();
		String errMsg  = domainData.getPo_error_desc();
		if (logger.isInfoEnabled()) {

			logger.info( "Error Code from pro_sim_sale_req_update  ==>" + errCode);
			logger.info( "Error Msg from pro_sim_sale_req_update  ==>" + errMsg);
		}
		Utilities.commitOrRollback(spFactory, errCode);
		} catch (SMFAgentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error( "Error Code by SMFAGENTEXCEPTION" + e.getErrorCode());
			logger.error( "Error Message by SMFAGENTEXCEPTION" + e.getErrorMessage());
		}
		
  }		
  
}
