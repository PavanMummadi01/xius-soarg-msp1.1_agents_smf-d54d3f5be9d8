/**
 * Copyright   2006 New Wireless Services, Inc.
 * All rights reserved. These computer programs, listings, and
 * Specificaions are the property of New Wireless Services,
 * Inc. and may not be copied, stored, used or transmitted, in
 * whole or in part, in any for or by any means, without the
 * prior written permission of New Wireless Services, Inc.
 *
 */
package com.xius.smf.webservices.smfservices;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;


import com.xius.agent.smf.smfmanagement.BlkActDeActReportsListType;
import com.xius.agent.smf.smfmanagement.BulkMDNRegActStatusReportsRequest;
import com.xius.agent.smf.smfmanagement.BulkMDNRegActStatusReportsResponse;
import com.xius.agent.smf.smfmanagement.MDNRegActStatusReportsListType;
import com.xius.agent.smf.smfmanagement.UploadMSISDNListType;
import com.xius.smf.domaindata.BlkActDeactRefCursorData;
import com.xius.smf.domaindata.BulkMDNRedActRefCursorData;
import com.xius.smf.domaindata.BulkMDNRegActStatusData;
import com.xius.smf.domaindata.ViewBlkActDeactDetailsRefCursorData;
import com.xius.smf.domaindata.ViewMSISDNDetailsData;
import com.xius.smf.domaindata.ViewMSISDNDetailsRefCursorData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.DateUtil;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

@Service("BulkMDNRegActStatusReportsImpl")

public class BulkMDNRegActStatusReportsImpl {

	private  static final Logger logger = LogManager.getLogger(BulkMDNRegActStatusReportsImpl.class.getSimpleName());

	private Object setMOSRequest(BulkMDNRegActStatusReportsRequest request, HeaderDetails headerDetails) {


		BulkMDNRegActStatusData bulkMDNRegActStatusData = null;
		ViewMSISDNDetailsData viewMSISDNDetailsData = null;


		if(null != request.getTransdates()) {

			bulkMDNRegActStatusData = new BulkMDNRegActStatusData();
			Date date = null;


			if( null != (date = DateUtil.getCalendarToDate( request.getTransdates().getStartDate())) ) {

				String dateAsString  = DateUtil.getMMDDYYYYFormatedDate( date );
				bulkMDNRegActStatusData.setPi_start_date( dateAsString );
			}
			
		/*	XMLGregorianCalendar xmlGregorianCalendar = request.getTransdates().getStartDate();
			date = xmlGregorianCalendar.toGregorianCalendar().getTime();
			if (date != null) {
				String dateAsString  = DateUtil.getMMDDYYYYFormatedDate( date );
				bulkMDNRegActStatusData.setPi_start_date( dateAsString );
			}*/
			

			if( null != (date = DateUtil.getCalendarToDate( request.getTransdates().getEndDate())) ) {

				String dateAsString  = DateUtil.getMMDDYYYYFormatedDate( date );
				bulkMDNRegActStatusData.setPi_end_date( dateAsString );
			}
			
			/*xmlGregorianCalendar = request.getTransdates().getEndDate();
			date = xmlGregorianCalendar.toGregorianCalendar().getTime();
			if (date != null) {
				String dateAsString  = DateUtil.getMMDDYYYYFormatedDate( date );
				bulkMDNRegActStatusData.setPi_end_date( dateAsString );
			}*/
			
			if( null !=  request.getActionflag() ) {

				bulkMDNRegActStatusData.setPi_action_flag( request.getActionflag() );
			}


			bulkMDNRegActStatusData.setPi_network_id(headerDetails.getNetworkID());
			bulkMDNRegActStatusData.setPi_username(headerDetails.getLoginID().trim() );
			if(logger.isDebugEnabled()){

				logger.debug( bulkMDNRegActStatusData.toString( bulkMDNRegActStatusData ));
			}

			return bulkMDNRegActStatusData;
			
		} else if( null != request.getTransNumber() && request.getTransNumber().trim().length() > 0) {

			viewMSISDNDetailsData = new ViewMSISDNDetailsData();
			viewMSISDNDetailsData.setPi_trans_no(request.getTransNumber());
			viewMSISDNDetailsData.setPi_network_id(headerDetails.getNetworkID());
			viewMSISDNDetailsData.setPi_username(headerDetails.getLoginID().trim() );
			return viewMSISDNDetailsData;
		}
		return null;
	}

	/**
	 * This method is used for View TransDetails based on input has given. 
	 * This would be done with 3 steps
	 * 		1. Construct Domain(DB) object from webservice request objcet
	 * 		2. invoke SP(Stored Procedure)
	 *  	3. Constuct webservice response object form domain object. 
	 *  
	 * @param request BulkMDNRegActStatusReportsRequest
	 * @param headerDetails HeaderDetails
	 * @return bulkMDNRegActStatusReports BulkMDNRegActStatusReportsResponse
	 * @throws  SMFAgentException
	 */
	public BulkMDNRegActStatusReportsResponse  BulkMDNRegActStatusReports(BulkMDNRegActStatusReportsRequest request, HeaderDetails headerDetails) 
	throws SMFAgentException{

		/**
		 * Populate domain object with the data from web service request		
		 */

		BulkMDNRegActStatusReportsResponse bulkMDNRegActStatusReports = null;
		Object domainDataObj = setMOSRequest(request, headerDetails);

		if( domainDataObj instanceof BulkMDNRegActStatusData ) {

			BulkMDNRegActStatusData domainData = ( BulkMDNRegActStatusData )domainDataObj;
			/**
			 * invoke Stored Procedure.
			 */
			ServiceUtils._executeStoredProcedure("pro_get_msdn_report_dtls", domainData, domainData);
			if(logger.isInfoEnabled()) {

				logger.info("Error Code ==>"+domainData.getPo_error_code());
			}
			//Utilities.commitOrRollback(spFactory, domainData.getPo_error_code());
			if(domainData.getPo_error_code() !=0) {

				throw Utilities.setSMFAgentException(domainData.getPo_error_code());
			}

			/**
			 * Set response
			 */
			bulkMDNRegActStatusReports = setWebserviceResponse(domainData, request);


		} else if( domainDataObj instanceof ViewMSISDNDetailsData ) {

			ViewMSISDNDetailsData domainData = ( ViewMSISDNDetailsData )domainDataObj;
			/**
			 * invoke Stored Procedure.
			 */
			ServiceUtils._executeStoredProcedure("msisdndetails_transno", domainData, domainData);
			if(logger.isInfoEnabled()) {

				logger.info( "Error Code ==>"+domainData.getPo_error_code());
			}
			//Utilities.commitOrRollback(spFactory, domainData.getPo_error_code());
			if(domainData.getPo_error_code() !=0) {

				throw Utilities.setSMFAgentException(domainData.getPo_error_code());
			}

			/**
			 * Set response
			 */
			bulkMDNRegActStatusReports = setWebserviceResponse(domainData, request);

		}
		return bulkMDNRegActStatusReports;
	}

	/**
	 * This method is used to map webservices response object from domain(DB) object
	 * @param domainData ViewMSISDNDetailsData
	 * @param request BulkMDNRegActStatusReportsRequest
	 * @return bulkMDNRegActStatusReports BulkMDNRegActStatusReportsResponse
	 */
	private BulkMDNRegActStatusReportsResponse setWebserviceResponse(Object domainDataObject, BulkMDNRegActStatusReportsRequest request) {

		BulkMDNRegActStatusReportsResponse bulkMDNRegActStatusReports = new BulkMDNRegActStatusReportsResponse();

		if( domainDataObject instanceof ViewMSISDNDetailsData ) {

			ViewMSISDNDetailsData domainData = (ViewMSISDNDetailsData) domainDataObject;

			List<ViewMSISDNDetailsRefCursorData> cursorData  = domainData.getPo_msisdndetails();
			
			UploadMSISDNListType commaSaparatedStrings=new UploadMSISDNListType();
			//String[] commaSaparatedStrings = new String[cursorData.size()];

			if( null != cursorData && cursorData.size() > 0 ) {

				/*for( int i = 0; i < cursorData.size(); i++) {

					ViewMSISDNDetailsRefCursorData viewMSISDNDetailsRefCursorData = cursorData.get( i );

					if( null != viewMSISDNDetailsRefCursorData.getMsisdn_details() ) {
						
						commaSaparatedStrings[i] = viewMSISDNDetailsRefCursorData.getMsisdn_details();
					}
				}*/
				
				for (ViewMSISDNDetailsRefCursorData viewMSISDNDetailsRefCursorData : cursorData) {
			        if (viewMSISDNDetailsRefCursorData.getMsisdn_details() != null) {
			        	commaSaparatedStrings.getMSISDNsList().add(viewMSISDNDetailsRefCursorData.getMsisdn_details());
			        }
			    }
			}
			bulkMDNRegActStatusReports.setMSISDNsList( commaSaparatedStrings );
			
			if(logger.isDebugEnabled()){

				logger.debug( domainData.toString( domainData ));
			}

		} else if( domainDataObject instanceof BulkMDNRegActStatusData ) {


			BulkMDNRegActStatusData domainData = (BulkMDNRegActStatusData) domainDataObject;

			List <BulkMDNRedActRefCursorData>cursorData  = domainData.getPo_msisdn_transdetails();
			List<MDNRegActStatusReportsListType> mDNRegActStatusReportsListType=new ArrayList<MDNRegActStatusReportsListType>();
			//MDNRegActStatusReportsListType[] mDNRegActStatusReportsListType = new MDNRegActStatusReportsListType[ cursorData.size() ];

			if( null != cursorData && cursorData.size() > 0 ) {

				/*for( int i = 0; i < cursorData.size(); i++) {

					BulkMDNRedActRefCursorData bulkMDNRedActRefCursorData = cursorData.get( i );

					if( null != bulkMDNRedActRefCursorData ) {
						
						mDNRegActStatusReportsListType[i] = new MDNRegActStatusReportsListType();

						mDNRegActStatusReportsListType[i].setTransNumber( bulkMDNRedActRefCursorData.getTransaction_no());
						mDNRegActStatusReportsListType[i].setSubmissionDate( bulkMDNRedActRefCursorData.getSubmission_date() );
						mDNRegActStatusReportsListType[i].setUserId( bulkMDNRedActRefCursorData.getUser_id());
						mDNRegActStatusReportsListType[i].setStatus( bulkMDNRedActRefCursorData.getStatus() );
					}
				}*/
				
				for (BulkMDNRedActRefCursorData bulkMDNRedActRefCursorData : cursorData) {
					 logger.info("BulkStateChanegReportsData ================>");
				        if (bulkMDNRedActRefCursorData != null) {
				        	MDNRegActStatusReportsListType mDNRegActStatusReportsListType1=new MDNRegActStatusReportsListType();
				        	mDNRegActStatusReportsListType1.setTransNumber( bulkMDNRedActRefCursorData.getTransaction_no());
				        	mDNRegActStatusReportsListType1.setSubmissionDate( bulkMDNRedActRefCursorData.getSubmission_date());
				        	mDNRegActStatusReportsListType1.setUserId( bulkMDNRedActRefCursorData.getUser_id());
				        	mDNRegActStatusReportsListType1.setStatus( bulkMDNRedActRefCursorData.getStatus());

				        	mDNRegActStatusReportsListType.add(mDNRegActStatusReportsListType1);
				        }
				    }

			}
				bulkMDNRegActStatusReports.getMDNRegActStatusReportsList().addAll(mDNRegActStatusReportsListType);

			if(logger.isDebugEnabled()){

				logger.debug( domainData.toString( domainData ));
			}
		} 

		return bulkMDNRegActStatusReports;
	}

}
