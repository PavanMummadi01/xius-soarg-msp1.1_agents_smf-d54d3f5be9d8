/**
 * Copyright   2012 XIUS.
 * All rights reserved. These computer programs, listings, and
 * specifications are the property of XIUS.
 * And may not be copied, stored, used or transmitted, in
 * whole or in part, in any for or by any means, without the
 * prior written permission of XIUS.
 *
 */


/**
 * 	@company	XIUS (Megasoft Pvt Ltd Hyderabad,INDIA)
 *	@package	com.xius.smf.job.task
 * 	@author		SaiRajesh.g
 *	@Date		Jan 30, 2014,10:43:44 AM
*/

package com.xius.smf.job.task;

import java.net.URL;
import java.rmi.RemoteException;
import java.util.concurrent.CountDownLatch;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.xius.smf.domaindata.HLRCursorData;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.Utilities;
import com.xius.ttsa.hlr.HLRManagement_wsdl.HLRManagementBindingStub;
import com.xius.ttsa.hlr.HLRManagement_wsdl.HLRManagementLocator;
import com.xius.ttsa.hlr.HLRManagement_xsd.UnbarServicesRequest;
import com.xius.ttsa.hlr.HLRManagement_xsd.UnbarServicesResponse;
import com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType;

public class ScheduleHLRThread implements Runnable{

	static Logger logger = LogManager.getLogger("ScheduleHLRThread");

	private HLRCursorData cursorData;
	private CountDownLatch latch;

	public ScheduleHLRThread(HLRCursorData cursorData) {
		this.cursorData = cursorData;
	}

	public ScheduleHLRThread(HLRCursorData cursorData, CountDownLatch latch) {
		this.cursorData = cursorData;
		this.latch= latch;
	}
	public void run() {
		try{
			processUnbarService(cursorData);
		}catch (Exception e) {
			logger.error("Error in ScheduleHLRThread run():"+Utilities.getStackTrace( e ) );
		}finally {			
			latch.countDown();
		}
		
	}

	

	/**
	 * @param cursorData2
	 * @return
	 */
	private void processUnbarService(HLRCursorData data) {
		
		String msg= null;
	
		UnbarServicesRequest request = new UnbarServicesRequest();
		UnbarServicesResponse response = null;
		HLRManagementBindingStub hlrManagementStub = null;
				
		try {
			msg = String.valueOf(System.currentTimeMillis());
			String url = InitiateAll.getSMFProps().getProperty("unbarservice.app.url");

			if (logger.isDebugEnabled())
				logger.debug(" xbus URL -->< " + url);
			
			
		request.setIMSI(data.getImsi());
		request.setMSISDN(data.getMsisdn_no());
		request.setEnableODBValue(data.getOdb_value());
			
		if(logger.isDebugEnabled())
			logger.debug( "Processing HLRManagementStub to get UnbarServicesResponseE===>>>");
	 			
			hlrManagementStub = new HLRManagementBindingStub(new URL(url),new HLRManagementLocator());
			response = hlrManagementStub.unbarServices(request);  
			
			if(response!=null){
				int returnCode = response.getReturnCode();
				if(returnCode==0){
					if(logger.isDebugEnabled())
						logger.debug( "UnbarServicesResponse Return Code is 0. Updating Process Flag to S");
						data.setRemarks("SUCCESS");
					ScheduleHLRTask.callDBToUpdateScheduleHLR(data.getTransaction_id(), data.getRemarks(), "S");
				} else{
					if(logger.isDebugEnabled())
						logger.debug( "UnbarServicesResponse Return Code not 0. Updating Process Flag to F");
						data.setRemarks("UnbarServicesResponse Return Code not 0");
					ScheduleHLRTask.callDBToUpdateScheduleHLR(data.getTransaction_id(), data.getRemarks(), "F");
				}
			} else{
				if(logger.isDebugEnabled())
					logger.debug( "UnbarServicesResponse Is NULL");
					data.setRemarks("UnbarServiceResponse is NULL");
				ScheduleHLRTask.callDBToUpdateScheduleHLR(data.getTransaction_id(), data.getRemarks(), "F");
			}
			if(logger.isDebugEnabled())
				logger.debug( "<<<=== Processed UnbarServicesResponseE Obj from HLRManagementStub");
		}catch (ErrorDetailsType e) {
			if(logger.isDebugEnabled()){
				logger.debug( "ErrorDetailsType ErrorCode:"+e.getErrorCode());
				logger.debug( "ErrorDetailsType ErrorMessage:"+e.getErrorMessage());
			}
				data.setRemarks(e.getErrorMessage());
			ScheduleHLRTask.callDBToUpdateScheduleHLR(data.getTransaction_id(), data.getRemarks(), "F");
		} 
		catch (RemoteException e) {
			logger.error( Utilities.getStackTrace(e));
		} 
		catch(Exception e)
		{
			logger.error( "Exception in ScheduleHLRThread ::"+ Utilities.getStackTrace(e));
		}
		
	}
}
