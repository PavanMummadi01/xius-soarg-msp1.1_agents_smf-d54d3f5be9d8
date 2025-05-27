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


import com.xius.agent.smf.smfmanagement.BlkActDeActListType;
import com.xius.agent.smf.smfmanagement.BlkActDeActReportsListType;
import com.xius.agent.smf.smfmanagement.BlkActDeActReportsRequest;
import com.xius.agent.smf.smfmanagement.BlkActDeActReportsResponse;
import com.xius.agent.smf.smfmanagement.BlkCorpRCStatusReportsListType;
import com.xius.smf.domaindata.BlkActDeactRefCursorData;
import com.xius.smf.domaindata.BlkActDeactStatusData;
import com.xius.smf.domaindata.BlkCorpRCRefCursorData;
import com.xius.smf.domaindata.ViewBlkActDeactDetailsRefCursorData;
import com.xius.smf.domaindata.ViewBlkActDeactStatusDetailsData;
import com.xius.smf.domaindata.ViewBlkCorpRCDetailsRefCursorData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.DateUtil;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;



public class BlkActDeactReportsImpl {

	private  static final Logger logger = LogManager.getLogger(BlkActDeactReportsImpl.class.getSimpleName());
	
	private Object setMOSRequest(BlkActDeActReportsRequest request, HeaderDetails headerDetails) {


		BlkActDeactStatusData blkActDeactData = null;
		ViewBlkActDeactStatusDetailsData ViewBlkActDeactDetailsData = null;


		if(null != request.getTransdates()) {

			blkActDeactData = new BlkActDeactStatusData();
			Date date = null;


			if( null != (date = DateUtil.getCalendarToDate( request.getTransdates().getStartDate())) ) {

				String dateAsString  = DateUtil.getMMDDYYYYFormatedDate( date );
				blkActDeactData.setPi_start_date( dateAsString );
			}
			
			/*XMLGregorianCalendar xmlGregorianCalendar = request.getTransdates().getStartDate();
			date = xmlGregorianCalendar.toGregorianCalendar().getTime();
			if (date != null) {
				String dateAsString  = DateUtil.getMMDDYYYYFormatedDate( date );
				blkActDeactData.setPi_start_date( dateAsString );
			}*/

			if( null != (date = DateUtil.getCalendarToDate( request.getTransdates().getEndDate())) ) {

				String dateAsString  = DateUtil.getMMDDYYYYFormatedDate( date );
				blkActDeactData.setPi_end_date( dateAsString );
			}
			
		/*	xmlGregorianCalendar = request.getTransdates().getEndDate();
			date = xmlGregorianCalendar.toGregorianCalendar().getTime();
			if (date != null) {
				String dateAsString  = DateUtil.getMMDDYYYYFormatedDate( date );
				blkActDeactData.setPi_end_date( dateAsString );
			}*/
			
			
			if (null != headerDetails.getNetworkID()){
				blkActDeactData.setPi_network_id(headerDetails.getNetworkID());
			}
			if(null != headerDetails.getLoginID()){
				blkActDeactData.setPi_username(headerDetails.getLoginID().trim() );
			}
			if (null != request.getActivityType()){
				blkActDeactData.setPi_activity_type(request.getActivityType());
			}
			if(logger.isDebugEnabled()){

				logger.debug( blkActDeactData.toString( blkActDeactData ));
			}

			return blkActDeactData;
			
		} else if( null != request.getTransNumber() && request.getTransNumber().trim().length() > 0) {

			ViewBlkActDeactDetailsData = new ViewBlkActDeactStatusDetailsData();
			
			ViewBlkActDeactDetailsData.setPi_trans_no(request.getTransNumber());
			if (null != headerDetails.getNetworkID()){
				ViewBlkActDeactDetailsData.setPi_network_id(headerDetails.getNetworkID());
			}if(null != headerDetails.getLoginID()){
				ViewBlkActDeactDetailsData.setPi_username(headerDetails.getLoginID().trim() );
			}
			if (null != request.getActivityType()){
				ViewBlkActDeactDetailsData.setPi_activity_type(request.getActivityType());
			}
			
			return ViewBlkActDeactDetailsData;
		}
		return null;
	}

	
	 // This method is used for View TransDetails based on input has given. 
	
	public BlkActDeActReportsResponse  blkActDeActReports(BlkActDeActReportsRequest request, HeaderDetails headerDetails) 
	throws SMFAgentException{

		/**
		 * Populate domain object with the data from web service request		
		 */

		BlkActDeActReportsResponse blkActDeActReports = null;
		Object domainDataObj = setMOSRequest(request, headerDetails);

		if( domainDataObj instanceof BlkActDeactStatusData ) {

			BlkActDeactStatusData domainData = ( BlkActDeactStatusData )domainDataObj;
			/**
			 * invoke Stored Procedure.
			 */
			ServiceUtils._executeStoredProcedure("pro_deact_react_report_dtls", domainData, domainData);
			if(logger.isInfoEnabled()) {

				logger.info( "Error Code ==>"+domainData.getPo_error_code());
			}
			//Utilities.commitOrRollback(spFactory, domainData.getPo_error_code());
			if(domainData.getPo_error_code() !=0) {

				throw Utilities.setSMFAgentException(domainData.getPo_error_code().toString(),null);
			}

			/**
			 * Set response
			 */
			blkActDeActReports = setWebserviceResponse(domainData, request);


		} else if( domainDataObj instanceof ViewBlkActDeactStatusDetailsData ) {

			ViewBlkActDeactStatusDetailsData domainData = ( ViewBlkActDeactStatusDetailsData )domainDataObj;
			/**
			 * invoke Stored Procedure.
			 */
			ServiceUtils._executeStoredProcedure("blkActDeactstatus_transno", domainData, domainData);
			if(logger.isInfoEnabled()) {

				logger.info( "Error Code ==>"+domainData.getPo_error_code());
			}
			//Utilities.commitOrRollback(spFactory, domainData.getPo_error_code());
			if(domainData.getPo_error_code() !=0) {

				throw Utilities.setSMFAgentException(domainData.getPo_error_code().toString(),null);
			}

			/**
			 * Set response
			 */
			blkActDeActReports = setWebserviceResponse(domainData, request);

		}
		return blkActDeActReports;
	}

	
	 // This method is used to map webservices response object from domain(DB) object
	
	 
	private BlkActDeActReportsResponse setWebserviceResponse(Object domainDataObject,
			BlkActDeActReportsRequest request) {

		BlkActDeActReportsResponse blkActDeActReports = new BlkActDeActReportsResponse();

		if( domainDataObject instanceof ViewBlkActDeactStatusDetailsData ) {

			ViewBlkActDeactStatusDetailsData domainData = (ViewBlkActDeactStatusDetailsData) domainDataObject;

			List<ViewBlkActDeactDetailsRefCursorData> cursorData  = domainData.getPo_deactreact_dtls();
			
			BlkActDeActListType blkActDeActListType=new BlkActDeActListType();
			//String[] commaSaparatedStrings = new String[cursorData.size()];

			if( null != cursorData && cursorData.size() > 0 ) {

		/*		for( int i = 0; i < cursorData.size(); i++) {

					ViewBlkActDeactDetailsRefCursorData viewBlkActDeactDetailsRefCursor = cursorData.get( i );

					if( null != viewBlkActDeactDetailsRefCursor.getDeact_react_details()) {
						
						commaSaparatedStrings[i] = viewBlkActDeactDetailsRefCursor.getDeact_react_details();
					}
				}*/
				for (ViewBlkActDeactDetailsRefCursorData viewBlkActDeactDetailsRefCursorData : cursorData) {
			        if (viewBlkActDeactDetailsRefCursorData.getDeact_react_details() != null) {
			        	blkActDeActListType.getBlkActDeActList().add(viewBlkActDeactDetailsRefCursorData.getDeact_react_details());
			        }
			    }
				
			}
			blkActDeActReports.setBlkActDeActLists(blkActDeActListType );
			
			if(logger.isDebugEnabled()){

				logger.debug( domainData.toString( domainData ));
			}

		} else if( domainDataObject instanceof BlkActDeactStatusData ) {


			BlkActDeactStatusData domainData = (BlkActDeactStatusData) domainDataObject;

			List <BlkActDeactRefCursorData>cursorData  = domainData.getPo_deact_react_details();
			List<BlkActDeActReportsListType> blkActDeActReportsListType=new ArrayList<BlkActDeActReportsListType>();
			//BlkActDeActReportsListType[] blkActDeActReportsListType = new BlkActDeActReportsListType[ cursorData.size() ];

			if( null != cursorData && cursorData.size() > 0 ) {

			/*	for( int i = 0; i < cursorData.size(); i++) {

					BlkActDeactRefCursorData blkActDeactRefCursorData = cursorData.get( i );

					if( null != blkActDeactRefCursorData ) {
						
						blkActDeActReportsListType[i] = new BlkActDeActReportsListType();

						blkActDeActReportsListType[i].setTransNumber( blkActDeactRefCursorData.getTransaction_no());
						blkActDeActReportsListType[i].setSubmissionDate( blkActDeactRefCursorData.getSubmission_date() );
						blkActDeActReportsListType[i].setUserId( blkActDeactRefCursorData.getUser_id());
						blkActDeActReportsListType[i].setStatus( blkActDeactRefCursorData.getStatus() );
					}
				}*/
				
				for (BlkActDeactRefCursorData blkActDeactRefCursorData : cursorData) {
					 logger.info("BulkStateChanegReportsData ================>");
				        if (blkActDeactRefCursorData != null) {
				        	BlkActDeActReportsListType blkActDeActReportsListTypes=new BlkActDeActReportsListType();
				        	blkActDeActReportsListTypes.setTransNumber( blkActDeactRefCursorData.getTransaction_no());
				        	blkActDeActReportsListTypes.setSubmissionDate( blkActDeactRefCursorData.getSubmission_date());
				        	blkActDeActReportsListTypes.setUserId( blkActDeactRefCursorData.getUser_id());
				        	blkActDeActReportsListTypes.setStatus( blkActDeactRefCursorData.getStatus());

				        	blkActDeActReportsListType.add(blkActDeActReportsListTypes);
				        }
				    }

			}

			blkActDeActReports.getBlkActDeActReportsList().addAll(blkActDeActReportsListType);

			if(logger.isDebugEnabled()){

				logger.debug( domainData.toString( domainData ));
			}
		} 

		return blkActDeActReports;
	}

}
