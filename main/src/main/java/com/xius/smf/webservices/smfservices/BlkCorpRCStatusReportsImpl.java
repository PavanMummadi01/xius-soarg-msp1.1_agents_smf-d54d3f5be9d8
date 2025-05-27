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



import com.xius.agent.smf.smfmanagement.BlkCorpRCStatusListType;
import com.xius.agent.smf.smfmanagement.BlkCorpRCStatusReportsListType;
import com.xius.agent.smf.smfmanagement.BlkCorpRCStatusReportsRequest;
import com.xius.agent.smf.smfmanagement.BlkCorpRCStatusReportsResponse;
import com.xius.agent.smf.smfmanagement.BulkStateChangeReportsListType;
import com.xius.smf.domaindata.BlkCorpRCRefCursorData;
import com.xius.smf.domaindata.BlkCorpRCStatusData;
import com.xius.smf.domaindata.BulkStateChanegReportsCursorData;
import com.xius.smf.domaindata.ViewBlkCorpRCDetailsRefCursorData;
import com.xius.smf.domaindata.ViewBlkCorpRCStatusDetailsData;
import com.xius.smf.domaindata.ViewStateChanegReportsCursorData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.DateUtil;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;


@Service("BlkCorpRCStatusReportsImpl")
public class BlkCorpRCStatusReportsImpl {

	private  static final Logger logger = LogManager.getLogger(BlkCorpRCStatusReportsImpl.class.getSimpleName());

	private Object setMOSRequest(BlkCorpRCStatusReportsRequest request, HeaderDetails headerDetails) {


		BlkCorpRCStatusData blkCorpRCStatusData = null;
		ViewBlkCorpRCStatusDetailsData viewBlkCorpRCStatusDetailsData = null;


		if(null != request.getTransdates()) {

			blkCorpRCStatusData = new BlkCorpRCStatusData();
			Date date = null;


			if( null != (date = DateUtil.getCalendarToDate( request.getTransdates().getStartDate())) ) {

				String dateAsString  = DateUtil.getMMDDYYYYFormatedDate( date );
				blkCorpRCStatusData.setPi_start_date( dateAsString );
			}
			/*XMLGregorianCalendar xmlGregorianCalendar = request.getTransdates().getStartDate();
			date = xmlGregorianCalendar.toGregorianCalendar().getTime();
			if (date != null) {
				String dateAsString  = DateUtil.getMMDDYYYYFormatedDate( date );
				blkCorpRCStatusData.setPi_start_date( dateAsString );
			}*/
			

			if( null != (date = DateUtil.getCalendarToDate( request.getTransdates().getEndDate())) ) {

				String dateAsString  = DateUtil.getMMDDYYYYFormatedDate( date );
				blkCorpRCStatusData.setPi_end_date( dateAsString );
			}
			/*xmlGregorianCalendar = request.getTransdates().getEndDate();
			date = xmlGregorianCalendar.toGregorianCalendar().getTime();
			if (date != null) {
				String dateAsString  = DateUtil.getMMDDYYYYFormatedDate( date );
				blkCorpRCStatusData.setPi_end_date( dateAsString );
			}*/
			
			if (null != headerDetails.getNetworkID()){
				blkCorpRCStatusData.setPi_network_id(headerDetails.getNetworkID());
			}
			if(null != headerDetails.getLoginID()){
				blkCorpRCStatusData.setPi_username(headerDetails.getLoginID().trim() );
			}
			if(logger.isDebugEnabled()){

				logger.debug( blkCorpRCStatusData.toString( blkCorpRCStatusData ));
			}

			return blkCorpRCStatusData;
			
		} else if( null != request.getTransNumber() && request.getTransNumber().trim().length() > 0) {

			viewBlkCorpRCStatusDetailsData = new ViewBlkCorpRCStatusDetailsData();
			
			viewBlkCorpRCStatusDetailsData.setPi_trans_no(request.getTransNumber());
			if (null != headerDetails.getNetworkID()){
				viewBlkCorpRCStatusDetailsData.setPi_network_id(headerDetails.getNetworkID());
			}if(null != headerDetails.getLoginID()){
				viewBlkCorpRCStatusDetailsData.setPi_username(headerDetails.getLoginID().trim() );
			}
			return viewBlkCorpRCStatusDetailsData;
		}
		return null;
	}

	
	 // This method is used for View TransDetails based on input has given. 
	
	public BlkCorpRCStatusReportsResponse  blkCorpRCStatusReports(BlkCorpRCStatusReportsRequest request, HeaderDetails headerDetails) 
	throws SMFAgentException{

		/**
		 * Populate domain object with the data from web service request		
		 */

		BlkCorpRCStatusReportsResponse blkCorpRCStatusReports = null;
		Object domainDataObj = setMOSRequest(request, headerDetails);

		if( domainDataObj instanceof BlkCorpRCStatusData ) {

			BlkCorpRCStatusData domainData = ( BlkCorpRCStatusData )domainDataObj;
			/**
			 * invoke Stored Procedure.
			 */
			ServiceUtils._executeStoredProcedure("pro_corp_rct_report_dtls", domainData, domainData);
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
			blkCorpRCStatusReports = setWebserviceResponse(domainData, request);


		} else if( domainDataObj instanceof ViewBlkCorpRCStatusDetailsData ) {

			ViewBlkCorpRCStatusDetailsData domainData = ( ViewBlkCorpRCStatusDetailsData )domainDataObj;
			/**
			 * invoke Stored Procedure.
			 */
			ServiceUtils._executeStoredProcedure("blkCorpRCstatus_transno", domainData, domainData);
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
			blkCorpRCStatusReports = setWebserviceResponse(domainData, request);

		}
		return blkCorpRCStatusReports;
	}

	
	 // This method is used to map webservices response object from domain(DB) object
	
	 
	private BlkCorpRCStatusReportsResponse setWebserviceResponse(Object domainDataObject,
			BlkCorpRCStatusReportsRequest request) {

		BlkCorpRCStatusReportsResponse blkCorpRCStatusReports = new BlkCorpRCStatusReportsResponse();

		if( domainDataObject instanceof ViewBlkCorpRCStatusDetailsData ) {

			ViewBlkCorpRCStatusDetailsData domainData = (ViewBlkCorpRCStatusDetailsData) domainDataObject;

			List<ViewBlkCorpRCDetailsRefCursorData> cursorData  = domainData.getPo_corprct_details();

			BlkCorpRCStatusListType blkCorpRCStatusList = new BlkCorpRCStatusListType();
			
			//String[] commaSaparatedStrings = new String[cursorData.size()];

			if( null != cursorData && cursorData.size() > 0 ) {

				/*for( int i = 0; i < cursorData.size(); i++) {

					ViewBlkCorpRCDetailsRefCursorData viewBlkCorpRCDetailsRefCursorData = cursorData.get( i );

					if( null != viewBlkCorpRCDetailsRefCursorData.getCorp_rct_details()) {
						
						commaSaparatedStrings[i] = viewBlkCorpRCDetailsRefCursorData.getCorp_rct_details();
					}
				}*/
				 for (ViewBlkCorpRCDetailsRefCursorData viewBlkCorpRCDetailsRefCursorData : cursorData) {
				        if (viewBlkCorpRCDetailsRefCursorData.getCorp_rct_details() != null) {
				        	blkCorpRCStatusList.getBlkCorpRCStatusList().add(viewBlkCorpRCDetailsRefCursorData.getCorp_rct_details());
				        }
				    }
			}
			//blkCorpRCStatusReports.setBlkCorpRCStatusLists(commaSaparatedStrings );
			blkCorpRCStatusReports.setBlkCorpRCStatusLists(blkCorpRCStatusList );
			if(logger.isDebugEnabled()){

				logger.debug( domainData.toString( domainData ));
			}

		} else if( domainDataObject instanceof BlkCorpRCStatusData ) {


			BlkCorpRCStatusData domainData = (BlkCorpRCStatusData) domainDataObject;

			List <BlkCorpRCRefCursorData>cursorData  = domainData.getPo_corp_rct_details();
			//BlkCorpRCStatusReportsListType[] blkCorpRCStatusReportsListType = new BlkCorpRCStatusReportsListType[ cursorData.size() ];
			List<BlkCorpRCStatusReportsListType> BlkCorpRCStatusReportsListTypeList = new ArrayList<BlkCorpRCStatusReportsListType>();
			if( null != cursorData && cursorData.size() > 0 ) {

				/*for( int i = 0; i < cursorData.size(); i++) {

					BlkCorpRCRefCursorData blkCorpRCRefCursorData = cursorData.get( i );

					if( null != blkCorpRCRefCursorData ) {
						
						blkCorpRCStatusReportsListType[i] = new BlkCorpRCStatusReportsListType();

						blkCorpRCStatusReportsListType[i].setTransNumber( blkCorpRCRefCursorData.getTransaction_no());
						blkCorpRCStatusReportsListType[i].setSubmissionDate( blkCorpRCRefCursorData.getSubmission_date() );
						blkCorpRCStatusReportsListType[i].setUserId( blkCorpRCRefCursorData.getUser_id());
						blkCorpRCStatusReportsListType[i].setStatus( blkCorpRCRefCursorData.getStatus() );
					}
				}*/
				for (BlkCorpRCRefCursorData blkCorpRCRefCursorData : cursorData) {
					 logger.info("BulkStateChanegReportsData ================>");
				        if (blkCorpRCRefCursorData != null) {
				        	BlkCorpRCStatusReportsListType BlkCorpRCStatusReportsListType=new BlkCorpRCStatusReportsListType();
				        	BlkCorpRCStatusReportsListType.setTransNumber( blkCorpRCRefCursorData.getTransaction_no());
				        	BlkCorpRCStatusReportsListType.setSubmissionDate( blkCorpRCRefCursorData.getSubmission_date());
				        	BlkCorpRCStatusReportsListType.setUserId( blkCorpRCRefCursorData.getUser_id());
				        	BlkCorpRCStatusReportsListType.setStatus( blkCorpRCRefCursorData.getStatus());

				        	BlkCorpRCStatusReportsListTypeList.add(BlkCorpRCStatusReportsListType);
				        }
				    }

			}

			//blkCorpRCStatusReports.getBlkCorpRCStatusReportsList(blkCorpRCStatusReportsListType);
			blkCorpRCStatusReports.getBlkCorpRCStatusReportsList().addAll(BlkCorpRCStatusReportsListTypeList);
			if(logger.isDebugEnabled()){

				logger.debug( domainData.toString( domainData ));
			}
		} 

		return blkCorpRCStatusReports;
	}

}
