package com.xius.smf.webservices.smfservices;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;


import net.bcgi.util.db.SPFactory;

import com.xius.agent.smf.postpaidmanagement.PostpaidRegistrationRequest;
import com.xius.agent.smf.postpaidmanagement.PostpaidRegistrationResponse;
import com.xius.agent.smf.postpaidmanagement.SubLineInfoListType;
import com.xius.billing.CAManagement_xsd.CAAccountExistCountRequest;
import com.xius.billing.CAManagement_xsd.CAAccountExistCountResponse;
import com.xius.smf.client.invoker.CAManagementInvoker;
import com.xius.smf.domaindata.MainLineSubLineValidationData;
import com.xius.smf.domaindata.PostPaidRegistrationData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

@Service("PostPaidRegistrationImpl")
public class PostPaidRegistrationImpl {
	private  static final Logger logger = LogManager.getLogger(PostPaidRegistrationImpl.class.getSimpleName());

	SPFactory spFactory = null;
	int failurecnt=0;
	
	
    private  PostPaidRegistrationData setMOSRequest(PostpaidRegistrationRequest req,
			HeaderDetails headerDetails) throws  SMFAgentException {
    	
        SubLineInfoListType subLineInfo = null;
        PostPaidRegistrationData Data = new PostPaidRegistrationData();
        
        
		 
			if (req.getMsisdnInfo() != null
					&& req.getMsisdnInfo().getSIMNumber() != null
					&& req.getTariffPackageId() == null) {
				throw Utilities.setSMFAgentException("140001", "TPID not Provided");
			}
			if (req.getMsisdnInfo() != null
					&& req.getMsisdnInfo().getSIMNumber() == null
					&& req.getMsisdnInfo().getBlockedMSISDN() != null
					&& req.getTariffPackageId() != null) {
				  throw Utilities.setSMFAgentException("140002", "TPID not Required");
			}


		if (req.getSubLineInfo() != null) {

			for (int i = 0; i < req.getSubLineInfo().size(); i++) {
				SubLineInfoListType subLineInfotmp = new SubLineInfoListType();

				subLineInfotmp = req.getSubLineInfo().get(i);

				if (subLineInfotmp.getICCID() != null
						&& subLineInfotmp.getTPID() == null) {
					throw Utilities.setSMFAgentException("140003",
							"In SubLine TPID not Provided");
				}
				if (subLineInfotmp.getICCID() == null
						&& subLineInfotmp.getMSISDN() != null
						&& subLineInfotmp.getTPID() != null) {
					throw Utilities.setSMFAgentException("140004",
							"In SubLine TPID not Required");
				}

			}

		}
//		if(true)
//			throw Utilities.setSMFAgentException(140004l,
//					"In SubLine TPID not Required");
	 
		
		MainLineSubLineValidationData mainLineSubLineValidationData = new MainLineSubLineValidationData();

		mainLineSubLineValidationData.setPi_network_id(headerDetails.getNetworkID());
		
		
		int flgcmp=0;
		if (req.getSubLineInfo() != null) {
			String[] temparr = new String[req.getSubLineInfo().size()];
			for (int i = 0; i < req.getSubLineInfo().size(); i++) {
				SubLineInfoListType subLineInfotmp = new SubLineInfoListType();
				subLineInfotmp = req.getSubLineInfo().get(i);
				 
					temparr[i] = subLineInfotmp.getICCID() + "#"
					+ subLineInfotmp.getMSISDN() + "#"
					+ subLineInfotmp.getTPID();
				 
					temparr[i] =temparr[i].replaceAll("null", "");
					
					if(req.getMsisdnInfo() != null && req.getMsisdnInfo().getBlockedMSISDN()!=null){
						if(req.getMsisdnInfo()
								.getSIMNumber().equals(subLineInfotmp.getICCID())){
							flgcmp=1;
						}
					}
				
			}
			mainLineSubLineValidationData.setPi_sub_line(temparr);
		}
		
		if (req.getMsisdnInfo() != null) {
			
			if(flgcmp==1){
				req.getMsisdnInfo()
				.setSIMNumber(null);
				req.setTariffPackageId(null);
			}
			String str1=req.getMsisdnInfo()
			.getSIMNumber()
			+ "#"
			+ req.getMsisdnInfo().getBlockedMSISDN()
			+ "#"
			+ req.getTariffPackageId();
			
			mainLineSubLineValidationData.setPi_main_line(str1.replaceAll("null", ""));
		}
        
		
		
		spFactory =  ServiceUtils.executeSPWithOutCommit("pro_main_line_sub_line_check", mainLineSubLineValidationData, mainLineSubLineValidationData);
		
		//testing
		/*
		mainLineSubLineValidationData.setPo_main_line_error_msg("896029998811206123#INVALID SIM");
		mainLineSubLineValidationData.setPo_main_line_error_code(455569l);
		
		String [] tmparr=new String [1];
		Long [] tmplarr=new Long[1];
		tmparr[0]="896029998811206124#SIM ALREDAY USED";
		tmplarr[0]=4488556l;
		mainLineSubLineValidationData.setPo_sub_line_error_msg(tmparr);
		mainLineSubLineValidationData.setPo_sub_line_error_code(tmplarr);
		*/
		/*
		String[] tt=new String[1]; 
		tt[0]="896029998811206124#1234567890";
		mainLineSubLineValidationData.setPo_sub_line_desired_msisdn(tt);
		 
		mainLineSubLineValidationData.setPo_main_desired_msisdn("1234567893");
		*/
		//end of testing
		
		
		if(logger.isInfoEnabled()) {

			logger.info( "mainLine Error Code ==>"+mainLineSubLineValidationData.getPo_main_line_error_code());
			logger.info( "mainLine Error Msg ==>"+mainLineSubLineValidationData.getPo_main_line_error_msg());
			
			if(mainLineSubLineValidationData!=null && mainLineSubLineValidationData.getPo_sub_line_error_code()!=null){
			for(int i=0;i<mainLineSubLineValidationData.getPo_sub_line_error_code().length;i++){
			logger.info( "SubLine Error Code ==>"+mainLineSubLineValidationData.getPo_sub_line_error_code()[i]);
			logger.info( "SubLine Error Msg ==>"+mainLineSubLineValidationData.getPo_sub_line_error_msg()[i]);
			}
			}
		}
		
		if(req.getIsSubLine()!=null && req.getIsSubLine().equalsIgnoreCase("Y")){
		SubLineInfoListType[] subLineInfoListTypeNew=new SubLineInfoListType[req.getSubLineInfo().size()];
		
		
		//setting desired msisdns for sub flow
		if(mainLineSubLineValidationData.getPo_sub_line_desired_msisdn()!=null){
		for(int k=0;k<mainLineSubLineValidationData.getPo_sub_line_desired_msisdn().length;k++){
			for (int i = 0; i < req.getSubLineInfo().size(); i++) {
				SubLineInfoListType subLineInfotmp = new SubLineInfoListType();
				subLineInfotmp = req.getSubLineInfo().get(i);
				String[] splitArr=mainLineSubLineValidationData.getPo_sub_line_desired_msisdn()[k].split("#");
				if (subLineInfotmp.getICCID().equalsIgnoreCase(splitArr[0])){
				  subLineInfotmp.setMSISDN(splitArr[1]);
				  logger.info( "SubLine Desired MSISDN ==>"+splitArr[1]);
				}
				  subLineInfoListTypeNew[i]=subLineInfotmp;
			}
			if(subLineInfoListTypeNew!=null && subLineInfoListTypeNew.length>0) {
			req.getSubLineInfo().addAll(Arrays.asList(subLineInfoListTypeNew));
			}
			}
		}
		}
		
		//setting desired msisdns for main flow
				if (mainLineSubLineValidationData.getPo_main_desired_msisdn()!=null){
				  req.getMsisdnInfo().setBlockedMSISDN(mainLineSubLineValidationData.getPo_main_desired_msisdn());
				}
			 
		
		
		//concatinating error details to sim  for main flow
		if(mainLineSubLineValidationData.getPo_main_line_error_code()!=null && mainLineSubLineValidationData.getPo_main_line_error_code()!=0){
			req.getMsisdnInfo().setSIMNumber(mainLineSubLineValidationData.getPo_main_line_error_msg());
			failurecnt++;
		}

		
		
		if(req.getIsSubLine()!=null && req.getIsSubLine().equalsIgnoreCase("Y")){
			SubLineInfoListType[] subLineInfoListTypeNew=new SubLineInfoListType[req.getSubLineInfo().size()];
			
		//concatinating error details to sim for sub flow
		if(mainLineSubLineValidationData.getPo_sub_line_error_code()!=null){
		for(int k=0;k<mainLineSubLineValidationData.getPo_sub_line_error_code().length;k++){
			BigDecimal BigDecimal=new BigDecimal("0");
			if(mainLineSubLineValidationData.getPo_sub_line_error_code()[k]!=BigDecimal){
			for (int i = 0; i < req.getSubLineInfo().size(); i++) {
				SubLineInfoListType subLineInfotmp = new SubLineInfoListType();
				subLineInfotmp = req.getSubLineInfo().get(i);
				if(mainLineSubLineValidationData.getPo_sub_line_error_msg()[k]!=null){
				String[] splitArr=mainLineSubLineValidationData.getPo_sub_line_error_msg()[k].split("#");
				if (subLineInfotmp.getICCID().equalsIgnoreCase(splitArr[0])){
				  subLineInfotmp.setICCID(mainLineSubLineValidationData.getPo_sub_line_error_msg()[k]);
				}
				}
				  subLineInfoListTypeNew[i]=subLineInfotmp;
			}
			if(subLineInfoListTypeNew!=null && subLineInfoListTypeNew.length>0) {
			req.getSubLineInfo().addAll(Arrays.asList(subLineInfoListTypeNew));
			}
			failurecnt++;
			}
		}
		}
		}
		
		
		
			
		
		
		
		Utilities.commitOrRollback(spFactory, mainLineSubLineValidationData.getPo_main_line_error_code() );

		
        
        if(req.getIsSubLine()!=null && req.getIsSubLine().equalsIgnoreCase("Y")&&(req.getIsMainLine()!=null && req.getIsMainLine().equalsIgnoreCase("Y"))){
        	if (req.getSubLineInfo() != null ) {
          
           PostPaidRegistrationImpl.logger.info("Mainline  and subline registration " );
           PostPaidRegistrationImpl.logger.info("Mainlineand subline regist SImUpload Data"+ Data.toString());
            PostPaidRegistrationImpl.logger.info("req.getSubLineInfo() length " + req.getSubLineInfo().size());                 
        	String[] string1=null;String[] string2=null;String[] str3=null; BigDecimal[] decimal4 =null; long[] str5 =null;String[] str6=null; 
        	 String[] blockMsd = new String[req.getSubLineInfo().size()]; String[] bMsdn=new String[req.getSubLineInfo().size()];;
        	Data =setRequest(req, headerDetails, Data, req.getSubLineInfo().size()+1);
        	
        	
        	
        	
        	 getDataForDBREQ(req, Data);
                                   	 
                           	 
            }else{
            	throw Utilities.setSMFAgentException("40044",
  						"If both are y thenSUBLINE info is needed");
            }
        	
        }else if (req.getIsMainLine() !=null && req.getIsMainLine().equalsIgnoreCase("Y")&& req.getIsSubLine().equalsIgnoreCase("N")  && req.getSubLineInfo()==null) {
        			int itr = 1;
        			
        
        			PostPaidRegistrationImpl.logger.info("only mainline registration is called");
               Data = setRequest(req, headerDetails, Data, itr);
          
           }else if (req.getIsMainLine() !=null && req.getIsMainLine().equalsIgnoreCase("N")&&req.getIsSubLine()!=null&& req.getIsSubLine().equalsIgnoreCase("Y") ) {
   			   
        	   if (req.getSubLineInfo() != null ) {
        	          
        		   PostPaidRegistrationImpl.logger.info("only subline registration is called");
                   PostPaidRegistrationImpl.logger.info("req.getSubLineInfo() length " + req.getSubLineInfo().size());                 
               	String[] string1=null;String[] string2=null;String[] str3=null; BigDecimal[] decimal4 =null; long[] str5 =null;String[] str6=null; 
               	 String[] blockMsd = new String[req.getSubLineInfo().size()]; String[] bMsdn=new String[req.getSubLineInfo().size()];
               	Data =setRequest(req, headerDetails, Data, req.getSubLineInfo().size());
        	
        		List isMainlist = new ArrayList();
        		List issublist = new ArrayList();  
        		List Emsisdnlist = new ArrayList();  
        		List ESIMlist = new ArrayList();  
        		List<BigDecimal> creditlimitlist = new ArrayList<BigDecimal>();  
        		 List grpBillList = new ArrayList();  
        		 List GrpCreditList = new ArrayList();  
        		 List GTPIDarrList = new ArrayList();  
        		 List extMSDNList = new ArrayList();  
        		 
            	for (int i = 0; i < req.getSubLineInfo().size(); i++) {
           	        
        		    subLineInfo = req.getSubLineInfo().get(i);
        		              	
        		      PostPaidRegistrationImpl.logger.info("subLineInfo.getMSISDN()>>>>  " + subLineInfo.getMSISDN());
        		                                     
        		      if (null != req.getMsisdnInfo().getBlockedMSISDN()){
        		         	
        		      // blockMsd[i] = req.getMsisdnInfo().getBlockedMSISDN();
        		    	  extMSDNList.add( req.getMsisdnInfo().getBlockedMSISDN());       		  	            	 
        		      }else{
        		    	  extMSDNList.add(null);             		
        		      }
        		     
               //         Data.setPi_external_number(blockMsd);          			                                      
        		     
        		        	if(!Utilities.isNull(subLineInfo.getMSISDN()) ){
        		        	
        		        				Emsisdnlist.add(subLineInfo.getMSISDN());
        		        	
        		        	}else{
        		        	
        		        		Emsisdnlist.add(null);
        		        	}
        		        	
        		       //   Data.setPi_main_line_msisdn(bMsdn);
        		         // Data.setPi_external_number(bMsdn); 
        		    	
        		        	subLineInfo.setOptGRPCredit("N");
        		        	if(!Utilities.isNull(subLineInfo.getOptGRPCredit())){
        		        		GrpCreditList.add(subLineInfo.getOptGRPCredit()) ;
        		        	}else{
        		        		
        		        		GrpCreditList.add(null) ;
        		        	}
        		        	
        		            PostPaidRegistrationImpl.logger.info((Object)("   subLineInfo.getOptGRPCredit() " + subLineInfo.getOptGRPCredit()));
        		       
        		     
        		        	if(!Utilities.isNull(subLineInfo.getOptGrpBill())){
        		        		grpBillList.add(subLineInfo.getOptGrpBill());
        		        	}else{
        		        		grpBillList.add(null);
        		        	}
        		           
        		        
        		        if (subLineInfo.getCreditLimit() != null) {
        		        	
        		            	/* if(0==i)
        		            		decimal4=new BigDecimal[req.getSubLineInfo().length];
        		            	 decimal4[i] = new BigDecimal( subLineInfo.getCreditLimit());
        		            	 */
        		            	 creditlimitlist.add(new BigDecimal(subLineInfo.getCreditLimit()));
        		                                   //     Data.setPi_credit_limit(decimal4);
        		            
        		        }
        		        if (subLineInfo.getTPID() != null) {
        		        	
        		        	GTPIDarrList.add(Long.parseLong(subLineInfo.getTPID()));
        		               //        Data.setPi_tariff_package_id(str5);
        		        }
        		        if (subLineInfo.getICCID() != null) {
        		        	
        		        	if(0==i){
        		        		str6 = new String[req.getSubLineInfo().size()];
        		        	}
        		        	ESIMlist.add(subLineInfo.getICCID());
        		        //	str6[i] = subLineInfo.getICCID();
        		         //   Data.setPi_sim_no(str6);
        		        }

        		    	isMainlist.add("N");
        		        issublist.add("Y");
        		        
        		    }
        		String[] extarry=new String[Emsisdnlist.size()];
        		extarry= (String[]) Emsisdnlist.toArray(extarry);
        			System.out.print("the EXtarrayu of it "+extarry);
        			Data.setPi_external_number(extarry);
        			
        			String[] extSIMarry=new String[ESIMlist.size()];
        			extSIMarry= (String[]) ESIMlist.toArray(extSIMarry);
        		   		System.out.print("the EXtarrayu of it "+extSIMarry);
        		   		Data.setPi_sim_no(extSIMarry);
        			
        		   		BigDecimal[] extCLarry=new BigDecimal[creditlimitlist.size()];
        		   		extCLarry= (BigDecimal[]) creditlimitlist.toArray(extCLarry);
        		       		System.out.print("the CreditLimit Array of it "+extCLarry);
        		       		Data.setPi_credit_limit(extCLarry);
        		       		
        		       	
        		           		
        		           		String[] grp_billarry=new String[grpBillList.size()];
        		           		grp_billarry= (String[]) grpBillList.toArray(grp_billarry);
        		               		System.out.print("the grp_billarry of it "+grp_billarry);
        		           	 Data.setPi_opt_grp_bill(grp_billarry);
        		           	 
        		           	String[] GrpCreditListarry=new String[GrpCreditList.size()];
        		           	GrpCreditListarry= (String[]) GrpCreditList.toArray(GrpCreditListarry);
        		           		System.out.print("the GrpCreditListarry of it "+GrpCreditListarry);
        		           	 Data.setPi_opt_grp_credit(GrpCreditListarry);
        		           	 
        		           	 
        		            	long[] tpIDarry=new long[GTPIDarrList.size()];
        		            //	tpIDarry= GTPIDarrList.toArray(tpIDarry);
        		              for(int ind=0;ind<GTPIDarrList.size();ind++){
        		            	  tpIDarry[ind]=(Long) GTPIDarrList.get(ind);
        		              }
        		            	
        		            	System.out.print("the tpIDarry of it "+tpIDarry);
        		               	 Data.setPi_tariff_package_id(tpIDarry);
        		           	 
        		           	 
        		               	 
        		               	String[] msdnArr=new String[extMSDNList.size()];
        		               	msdnArr= (String[]) extMSDNList.toArray(msdnArr);
        		               		System.out.print("the extMSDNList of it "+msdnArr);
        		               	 Data.setPi_main_line_msisdn(msdnArr);
        		               	 
        		               String[] mainArr=new String[isMainlist.size()];
        		               mainArr= (String[]) isMainlist.toArray(mainArr);
        		               System.out.print("the mainList of it "+mainArr);
        		               Data.setPi_is_main_line(mainArr);
        		                   	 
        		          String[] subArr=new String[issublist.size()];
        		          subArr= (String[]) issublist.toArray(subArr);
        		          System.out.print("the sublist of it "+subArr);
        		         Data.setPi_is_sub_line(subArr);
                                          	 
                                  	 
                   }
        	   else{
               	throw Utilities.setSMFAgentException("40044",
     						"If SUBLINE is  y thenSUBLINE info is needed");
               }
        	   
        }
     
            
          if(req.getIsSubLine() ==null && req.getIsMainLine()==null ){
        	  		throw Utilities.setSMFAgentException("40044",
        	  						"Mainline Data should Y or Subline Detail's Needed");
            }
            return Data;
 
}

	private void getDataForDBREQ(PostpaidRegistrationRequest req,
			PostPaidRegistrationData Data) {
		SubLineInfoListType subLineInfo;
		String[] str6;
		String[] isMain=Data.getPi_is_main_line();
   	 List isMainlist = new ArrayList();  
   	 if(isMain!=null)
      PostPaidRegistrationImpl.logger.info("The length of isMainlist" + isMain.length);      
   	 
   	 if(isMain.length>0){
		    //  Emsisdnlist=Arrays. asList(extarr);
		    for(String tempisMain:isMain){
		    	
		    	isMainlist.add(tempisMain);
		                 		}
   	 }
		
		    String[] issub=Data.getPi_is_sub_line();
			 List issublist = new ArrayList();  
         if(issub.length>0)
		   PostPaidRegistrationImpl.logger.info("The length of isMainlist" + issub.length);      
			 
			 if(issub.length>0){
		           //  Emsisdnlist=Arrays. asList(extarr);
		           for(String tempisMain:issub){
		           	
		        	   issublist.add(tempisMain);
		                        		}
		   	
			 }
		
   	 String[] extarr=Data.getPi_external_number();
 	 List Emsisdnlist = new ArrayList();  
 	 if(extarr!=null)
    PostPaidRegistrationImpl.logger.info("The length of bLocked msisdn" + extarr.length);      
 	 
 	 if(extarr.length>0){
		 //  Emsisdnlist=Arrays. asList(extarr);
		 for(String tmpmsisdn:extarr){
		Emsisdnlist.add(tmpmsisdn);
		          }      		}
     	
 	String[] extMSDNarr=Data.getPi_external_number();// for msidn
 List extMSDNList = new ArrayList();  
 if(extMSDNarr!=null)
   PostPaidRegistrationImpl.logger.info("The length of extMSDNarr" + extMSDNarr.length);      
 
 if(extMSDNarr.length>0){
         //  Emsisdnlist=Arrays. asList(extarr);
         for(String MSDN:extMSDNarr){
		   extMSDNList.add(MSDN);
		        }      		}
 
 	 
 	 
 	String[] extSIMarr=Data.getPi_sim_no();
	 List ESIMlist = new ArrayList();  
	 if(extSIMarr!=null)
   PostPaidRegistrationImpl.logger.info("The length of ICCIDS" + extarr.length);      
	 
	 if(extarr.length>0){
		//  Emsisdnlist=Arrays. asList(extarr);
		for(String ICCIDL:extSIMarr){
			ESIMlist.add(ICCIDL);
		         }      		}
	 
	 
	BigDecimal[] creditlimitARR=Data.getPi_credit_limit();
 List<BigDecimal> creditlimitlist = new ArrayList<BigDecimal>();  
 if(creditlimitARR!=null)
   PostPaidRegistrationImpl.logger.info("The length of CreditLimit" + creditlimitARR.length);    
 if(creditlimitARR.length>0){
       //  Emsisdnlist=Arrays. asList(extarr);
       for(BigDecimal credtLimit:creditlimitARR){
    	   creditlimitlist.add(credtLimit);
		      }     
 
 }
 
 String [] Billarr=Data.getPi_opt_grp_bill();
 List grpBillList = new ArrayList();  
 if(Billarr!=null)
   PostPaidRegistrationImpl.logger.info("The length of grpBill" + Billarr.length);  
 if(Billarr.length>0){
       //  Emsisdnlist=Arrays. asList(extarr);
       for(String billgrp:Billarr){
		 grpBillList.add(billgrp);
		      }     
 
		}
 
 String [] GrpCreditarr=Data.getPi_opt_grp_credit();
 List GrpCreditList = new ArrayList();  
 if(Billarr!=null)
   PostPaidRegistrationImpl.logger.info("The length of grpcreditl" + GrpCreditarr.length);  
 if(GrpCreditarr.length>0){
       //  Emsisdnlist=Arrays. asList(extarr);
       for(String billgrpcredit:GrpCreditarr){
		 GrpCreditList.add(billgrpcredit);
		      }     
 
		}
 
 
 long [] TPIDarr=Data.getPi_tariff_package_id();
 List GTPIDarrList = new ArrayList();  
 if(TPIDarr!=null)
   PostPaidRegistrationImpl.logger.info("The length of TPID list" + TPIDarr.length);  
 if(TPIDarr.length>0){
       //  Emsisdnlist=Arrays. asList(extarr);
       for(long billgrpcredit:TPIDarr){
		 GTPIDarrList.add(billgrpcredit);
		      }     
 
		}
 
		for (int i = 0; i < req.getSubLineInfo().size(); i++) {
			           	        
		    subLineInfo = req.getSubLineInfo().get(i);
		              	
		      PostPaidRegistrationImpl.logger.info("subLineInfo.getMSISDN()>>>>  " + subLineInfo.getMSISDN());
		                                     
		      if (null != req.getMsisdnInfo().getBlockedMSISDN() && (req.getIsMainLine() !=null && req.getIsMainLine().equalsIgnoreCase("Y") )){
		         	
		      // blockMsd[i] = req.getMsisdnInfo().getBlockedMSISDN();
		    	  extMSDNList.add( req.getMsisdnInfo().getBlockedMSISDN());       		  	            	 
		      }else{
		    	  extMSDNList.add(null);             		
		      }
		     
       //         Data.setPi_external_number(blockMsd);          			                                      
		     
		        	
		
		        	if(!Utilities.isNull(subLineInfo.getMSISDN()) ){
		        	
		        		
		        	
		        				Emsisdnlist.add(subLineInfo.getMSISDN());
		        	
		        	}else{
		        	
		        		Emsisdnlist.add(null);
		        	}
		        	
		
		        	
		       //   Data.setPi_main_line_msisdn(bMsdn);
		         // Data.setPi_external_number(bMsdn); 
		    	
		          
		         	subLineInfo.setOptGRPCredit("N");
		        	if(!Utilities.isNull(subLineInfo.getOptGRPCredit())){
		        		GrpCreditList.add(subLineInfo.getOptGRPCredit()) ;
		        	}else{
		        		
		        		GrpCreditList.add(null) ;
		        	}
		        	
		            PostPaidRegistrationImpl.logger.info((Object)("   subLineInfo.getOptGRPCredit() " + subLineInfo.getOptGRPCredit()));
		       
		     
		        	if(!Utilities.isNull(subLineInfo.getOptGrpBill())){
		        		grpBillList.add(subLineInfo.getOptGrpBill());
		        	}else{
		        		grpBillList.add(null);
		        	}
		           
		        
		        if (subLineInfo.getCreditLimit() != null) {
		        	
		            	/* if(0==i)
		            		decimal4=new BigDecimal[req.getSubLineInfo().length];
		            	 decimal4[i] = new BigDecimal( subLineInfo.getCreditLimit());
		            	 */
		            	 creditlimitlist.add(new BigDecimal(subLineInfo.getCreditLimit()));
		                                   //     Data.setPi_credit_limit(decimal4);
		            
		        }
		        if (subLineInfo.getTPID() != null) {
		        	
		        	GTPIDarrList.add(Long.parseLong(subLineInfo.getTPID()));
		               //        Data.setPi_tariff_package_id(str5);
		        }
		        if (subLineInfo.getICCID() != null) {
		        	
		        	if(0==i){
		        		str6 = new String[req.getSubLineInfo().size()];
		        	}
		        	ESIMlist.add(subLineInfo.getICCID());
		        //	str6[i] = subLineInfo.getICCID();
		         //   Data.setPi_sim_no(str6);
		        }

		    	isMainlist.add("N");
		        issublist.add("Y");
		        
		    }
		String[] extarry=new String[Emsisdnlist.size()];
		extarry= (String[]) Emsisdnlist.toArray(extarry);
			System.out.print("the EXtarrayu of it "+extarry);
			Data.setPi_external_number(extarry);
			
			String[] extSIMarry=new String[ESIMlist.size()];
			extSIMarry= (String[]) ESIMlist.toArray(extSIMarry);
		   		System.out.print("the EXtarrayu of it "+extSIMarry);
		   		Data.setPi_sim_no(extSIMarry);
			
		   		BigDecimal[] extCLarry=new BigDecimal[creditlimitlist.size()];
		   		extCLarry= (BigDecimal[]) creditlimitlist.toArray(extCLarry);
		       		System.out.print("the CreditLimit Array of it "+extCLarry);
		       		Data.setPi_credit_limit(extCLarry);
		       		
		       	
		           		
		           		String[] grp_billarry=new String[grpBillList.size()];
		           		grp_billarry= (String[]) grpBillList.toArray(grp_billarry);
		               		System.out.print("the grp_billarry of it "+grp_billarry);
		           	 Data.setPi_opt_grp_bill(grp_billarry);
		           	 
		           	String[] GrpCreditListarry=new String[GrpCreditList.size()];
		           	GrpCreditListarry= (String[]) GrpCreditList.toArray(GrpCreditListarry);
		           		System.out.print("the GrpCreditListarry of it "+GrpCreditListarry);
		           	 Data.setPi_opt_grp_credit(GrpCreditListarry);
		           	 
		           	 
		            	long[] tpIDarry=new long[GTPIDarrList.size()];
		            //	tpIDarry= GTPIDarrList.toArray(tpIDarry);
		              for(int ind=0;ind<GTPIDarrList.size();ind++){
		            	  tpIDarry[ind]=(Long) GTPIDarrList.get(ind);
		              }
		            	
		            	System.out.print("the tpIDarry of it "+tpIDarry);
		               	 Data.setPi_tariff_package_id(tpIDarry);
		           	 
		           	 
		               	 
		               	String[] msdnArr=new String[extMSDNList.size()];
		               	msdnArr= (String[]) extMSDNList.toArray(msdnArr);
		               		System.out.print("the extMSDNList of it "+msdnArr);
		               	 Data.setPi_main_line_msisdn(msdnArr);
		               	 
		               String[] mainArr=new String[isMainlist.size()];
		               mainArr= (String[]) isMainlist.toArray(mainArr);
		               System.out.print("the mainList of it "+mainArr);
		               Data.setPi_is_main_line(mainArr);
		                   	 
		          String[] subArr=new String[issublist.size()];
		          subArr= (String[]) issublist.toArray(subArr);
		          System.out.print("the sublist of it "+subArr);
		         Data.setPi_is_sub_line(subArr);
	}

	public PostpaidRegistrationResponse postpaidRegistration(PostpaidRegistrationRequest request,
			HeaderDetails headerDetails) throws SMFAgentException
			 {

		/**
		 * Populate domain object with the data from web service request
		 */
		PostpaidRegistrationResponse response = new PostpaidRegistrationResponse();
		
	   	     Validate(headerDetails, request);
	   	     logger.info("IsMainLine>>>>>>>>>>>>>>>>"+request.getIsMainLine());
	   	     logger.info("IsSubLine>>>>>>>>>>>>>>>>"+request.getIsSubLine());
		PostPaidRegistrationData domainData = setMOSRequest(request, headerDetails);
		if (logger.isDebugEnabled()) {

			logger.debug( domainData.toString());
		}
		
		spFactory = ServiceUtils.executeSPWithOutCommit("sim_upload_data",domainData, domainData);
		
		if (logger.isInfoEnabled()) {

			logger.info(
					"Error Code ==>" + domainData.getPo_error_code());
			logger.info(
					"Error Msg ==>" + domainData.getPo_error_desc());
		}

		Utilities.commitOrRollback(spFactory, domainData.getPo_error_code());

		if (null != domainData.getPo_error_code()
				&& domainData.getPo_error_code() != 0) {

			throw Utilities.setSMFAgentException(domainData.getPo_error_code().toString(),
					domainData.getPo_error_desc());

		} else {

			/**
			 * Set response
			 */
			response = setWebserviceResponse(domainData, request);

		}
		return response;
	}

	private PostpaidRegistrationResponse setWebserviceResponse(PostPaidRegistrationData domainData,
			PostpaidRegistrationRequest request) {

		PostpaidRegistrationResponse response = new PostpaidRegistrationResponse();

		if (null != domainData.getPo_trans_no()) {

			response.setTransactionID(domainData.getPo_trans_no());
		}
		if(failurecnt==0){
		  response.setTransStatus(0);
		  response.setRespCode("0");
		  response.setRespDescription(SMFAgentConstants.SUCCESS);
		}
		else{
			 response.setTransStatus(1);
			  response.setRespCode("1");
			  response.setRespDescription("Registration Failed Pls check Registration Status");
		}
		if (logger.isDebugEnabled()) {

			StringBuilder builder = new StringBuilder();
			
			builder.append(": TransNumber ==>").append(response.getTransactionID());
			
			builder.append(":RespDescription").append(response.getRespDescription());
			
			logger.debug( builder.toString());
		}

		return response;
	}
	
	public void Validate(HeaderDetails headerDetails, PostpaidRegistrationRequest request) throws SMFAgentException{
		CAAccountExistCountResponse response=null;
		
		CAAccountExistCountRequest ibaRequest =new CAAccountExistCountRequest();
		
		CAManagementInvoker invoker = new CAManagementInvoker();
		
		if(null!=request.getPersonalInfo().getIdValue())
		ibaRequest.setIdValue(request.getPersonalInfo().getIdValue());
		
		response=invoker.cAAccountExistCount(headerDetails, ibaRequest);
		
		String str=response.getConfigureCaParentCount();
		int ConfigureCaParentCount=Integer.parseInt(str);
		
		String str1=response.getUsedCaParentCount();
		int UsedCaParentCoun=Integer.parseInt(str1);
		
		if(ConfigureCaParentCount<=UsedCaParentCoun){
			throw Utilities.setSMFAgentException("40045",
					"For Given ID value Configured CAParent Count Reached");
		}
		
		
	}
	
	 public  PostPaidRegistrationData setRequest( PostpaidRegistrationRequest request,  HeaderDetails headerDetails,  PostPaidRegistrationData Data,  int itr) {
	       
		 long[] lng7=new long[itr];String[] str8= new String[itr];String [] str9= new String[itr]; String[] str10=new String[itr];String[] str11=new String[itr]; String[] str12=new String[itr];String[] account_type13=new String[itr]; long[] str14=new long[itr]; String[] str15=new String[itr]; String[] str16 =new String[itr];
		    String[] str17=new String[itr]; String[] str18 =new String[itr]; String[] str19=new String[itr]; String[] str20=new String[itr];String[] str21 =new String[itr];String[] str22=new String[itr];long[] postalcode23=new long[itr];String[] str24=new String[itr];long[] str25=new long[itr]; String[] str26=new String[itr];
		    String[] str27=new String[itr];String[] str28=new String[itr];String[] str29=new String[itr];String[] str30=new String[itr];String[] str31=new String[itr]; String[] str32 =new String[itr]; String[] str33=new String[itr]; String[] str34=new String[itr]; String[] str35=new String[itr]; String[] str36=new String[itr];
		    String[] str37 =new String[1];
		    String[] str38 =new String[itr];long[] long39=new long[itr];  
		    String[] str40=new String[1];
		    String[] str41=new String[1];
		    String[] str42=new String[1];
		    String[] str43=new String[1];
		    
		    
		    String[] blockMsd = new String[1];
		    if (null != request.getMsisdnInfo().getBlockedMSISDN()) {
             	
	               blockMsd[0] = request.getMsisdnInfo().getBlockedMSISDN();
	            	
             	 }
 			 else{
 				 blockMsd[0] =null;
 			 }
 			 Data.setPi_main_line_msisdn(blockMsd);
		    
		    long[] str4 =new long[1];
		    if (null != request.getTariffPackageId()) {
         	  
                 str4[0] = Long.parseLong(request.getTariffPackageId()) ;
		    }else{
		    	str4[0]=0;
		    }
                Data.setPi_tariff_package_id(str4);
		    
			 String[] grpCredit = new String[1];
			 grpCredit[0] = "Y"; //MainLINE Info
               Data.setPi_opt_grp_credit(grpCredit);  
      
          
           	
           	 String[] grpbill = new String[1];
           	grpbill[0] = "Y";//MainLINE Info
               Data.setPi_opt_grp_bill(grpbill);
		    
		    
		    BigDecimal[] strc = new BigDecimal[1];
		    if (null != request.getPostpaidDetails() && null != request.getPostpaidDetails().getCreditLimit()) {
		    	strc[0] = request.getPostpaidDetails().getCreditLimit();
              }else{
            	  strc[0] = null;
              }
		    Data.setPi_credit_limit(strc);
		    
		    
		    
            if (null != request.getMsisdnInfo().getSIMNumber()) {
         	   String[] str3 = new  String[1];
                  str3[0] =  request.getMsisdnInfo().getSIMNumber();
                Data.setPi_sim_no(str3);
            }
		    
		    if (null != request.getMsisdnInfo().getBlockedMSISDN()) {
            	
           	 str37[0] = request.getMsisdnInfo().getBlockedMSISDN();// setting BlockedMSISDN to  Pi_external_number
              
           }
           else{
           	str37[0] =null;
           }
		    Data.setPi_external_number(str37);
		   
		 
		    if (null !=  request.getIsMainLine() && request.getIsMainLine().equalsIgnoreCase("Y")) {
            	
            	str42[0] = "N";
                Data.setPi_is_sub_line(str42);
            
           
            	
            str43[0] = "Y";
                Data.setPi_is_main_line(str43);
            }else{
            	
            	str42[0] = "Y";
                Data.setPi_is_sub_line(str42);
            
           
            	
            str43[0] = "N";
                Data.setPi_is_main_line(str43);
            	
            }
		    
		    
		    for (int i = 0; i < itr; i++) {
	        	
	            if (null != request.getPersonalInfo().getIdType()) {
	            	 lng7[i] = Long.parseLong(request.getPersonalInfo().getIdType());
	            		            
	            }else{
	            	 lng7[i] =0;
	            	
	            }
	            Data.setPi_id_type(lng7);
	            
	            
	            if (null != request.getPersonalInfo().getIdValue()) {
	            	
	            	 str8[i] = request.getPersonalInfo().getIdValue();
	               
	            }
	            else{
	            	str8[i] = null;
	            } Data.setPi_id_no(str8);
	            
	            
	            if (null != headerDetails.getLoginID()) {
	                Data.setPi_username(headerDetails.getLoginID().trim());
	            }
	            
	            
	            if (null != request.getPersonalInfo().getFirstName()) {
	            	
	             
	            	str9[i] = request.getPersonalInfo().getFirstName();
	                
	            }
	            else{
	            	str9[i]=null;
	            	
	            }
	            Data.setPi_first_name(str9);
	            
	            if (null != request.getPersonalInfo().getLastName()) {
	            	
	            		 
	            	str10[i] = request.getPersonalInfo().getLastName();
	               
	            }
	            else{
	            	str10[i] =null;
	            }
	            Data.setPi_last_name(str10);
	            if (request != null) {
	            	
					
	                 str11[i] = null;
	                Data.setPi_sur_name(str11);
	            }
	            if (null != request.getPersonalInfo().getDateOfBirth()) {
	            	
	            
	            	SimpleDateFormat df= new SimpleDateFormat("MM/dd/yyyy");
	            	
	            	String sdate=df.format(request.getPersonalInfo().getDateOfBirth());
	            	str12[i] = sdate;
	            
	              
	            }else{
	            	str12[i] =null;
	            }
	            Data.setPi_date_of_birth(str12);
	          
	            
	            account_type13[i] = "2";
	            Data.setPi_account_type(account_type13);
	         
	         
	            if (null != request.getPostpaidDetails() &&null != request.getPostpaidDetails().getBillingDate()) {
	            	
	            	str27[i] = request.getPostpaidDetails().getBillingDate();
	            	 
	                
	            	 
	            }
	            else{
	            	str27[i] = null;
	            	
	            }
	        
	            Data.setPi_user_input_field1(str27);
	            
	            
	            /*
	            if (null != request.getPostpaidDetails().get) {
	            	
	            	 str14[i] = Long.parseLong(request.getPostpaidDetails().getBillingDate());
	            	 
	                
	            	 
	            }
	            else{
	            	str14[i] = null;
	            	
	            }
	            Data.setPi_bill_cycleday(str14);
	            */
	            
	            	 
	            	str15[i] =null;
	            
	            
	            Data.setPi_municipoality(str15);
	            
	            
	            str16[i] = null;
	               
	            Data.setPi_street_limits(str16);
	            
	            
	            
	            if (null != request.getPersonalInfo().getGender()) {
	            	
	            	 str17[i] = request.getPersonalInfo().getGender();
	               
	            }
	            else{
	            	str17[i] =null;
	            }
	            Data.setPi_gender(str17);
	            
	            if (null != request.getAddressInfo().getAddress1()) {
	            	
	            	 str18[i] = request.getAddressInfo().getAddress1();
	                
	            }
	            else{
	            	 str18[i] =null;
	            }
	            Data.setPi_street(str18);
	            
	            if (null != request.getAddressInfo().getAddress2()) {
	            	
	            	 str19[i] = request.getAddressInfo().getAddress2();
	                
	            }
	            else{
	            	 str19[i] =null;
	            }
	            Data.setPi_colony(str19);
	            
	            if (null != request.getAddressInfo().getCountry()) {
	
	            	 str20[i] = request.getAddressInfo().getCountry();
	                
	            }
	            else{
	            	 str20[i] =null;
	            }
	            Data.setPi_country(str20);
	           
	            if (null != request.getAddressInfo().getState()) {
	            
	            	 str21[i] = request.getAddressInfo().getState();
	                
	            }
	            else{
	            	str21[i] =null;
	            }
	            Data.setPi_state(str21);
	            
	            if (null != request.getAddressInfo().getCity()) {

            	 str22[i] = request.getAddressInfo().getCity();
	               
	            }
	            else{
	            	str22[i] =null;
	            }
	            Data.setPi_city(str22);
	            
	            if (null != request.getAddressInfo().getPostalCode()) {
	            	
	            	postalcode23[i] = Long.parseLong(request.getAddressInfo().getPostalCode());
	            		             
	            }
	            else{
	            	postalcode23[i] =0;
	            }
	            Data.setPi_postal_code(postalcode23);
	            
	            if (null != request.getPersonalInfo().getEmail()) {
	            	
	            	str24[i] = request.getPersonalInfo().getEmail();
	               
	            }
	            else{
	            	str24[i] = null;
	            }
	            Data.setPi_email(str24);
	            
	            if (null != request.getPersonalInfo().getContactnumber()) {
	            	
	            	str25[i] = Long.parseLong(request.getPersonalInfo().getContactnumber());
	            	                	              
	            }
	            else{
	            	str25[i] =0;
	            }
	            Data.setPi_alternate_contact_no(str25);
	            
	            if (null != request.getTariffPackageId()) {
	            str26[i] = request.getTariffPackageId();
	            }else{
	            	str26[i] =null;
	            }
	            Data.setPi_tariff_package(str26);
	            
	            if (null != headerDetails.getNetworkID()) {
	                Data.setPi_network_id(headerDetails.getNetworkID());
	            	
	            }
	            
	            str14[i] = 0;
         Data.setPi_bill_cycleday(str14);
	          /*  str27[i] = " ";
	            Data.setPi_user_input_field1(str27);
	            */
	            
	             str28[i] = null;
	            Data.setPi_user_input_field2(str28);
	            
	            
	             str29[i] = null;
	            Data.setPi_user_input_field3(str29);
	            
	            
	             str30[i] = null;
	            Data.setPi_user_input_field4(str30);
	            
	         
	            str31[i] = null;
	            Data.setPi_user_input_field5(str31);
	            
	            
	            
	            
	            if (null != request.getPostpaidDetails() && null != request.getPostpaidDetails().getBillingType()) {
	            
	            	str32[i] = request.getPostpaidDetails().getBillingType();
	               
	            }
	            else{
	            	 str32[i] =null;
	            }
	            Data.setPi_bill_type(str32);
	            
	            if (null != request.getPostpaidDetails() && null != request.getPostpaidDetails().getBillingFrequency()) {
	            	
	            	 str33[i] = request.getPostpaidDetails().getBillingFrequency();
	               
	            }
	            else{
	            	 str33[i] = null;
	            }
	            Data.setPi_bill_frequency(str33);
	            
	            Data.setPi_office_code(null);
	            
	           
	            str34[i] = null;
	            Data.setPi_internal_number(str34);
	            
	           
	            str35[i] = null;
	            Data.setPi_user_input_field5(str35);
	            
	            
	            str36[i] = null;
	            Data.setPi_personal_information_yn(str36);
	           
	            Data.setPi_file_name(null);
	            
	            
	          
	            
	            Data.setPi_channel_id("API");
	            
	            
	            if (null != request.getDealerUserId()) {
	           
	            	 str38[i] = request.getDealerUserId();
	               
	            }
	            else{
	            	 str38[i] =null;
	            }
	            Data.setPi_dealer_id(str38);
	            
	          
	            long39[i] = 0;
	            Data.setPi_location_code(long39);
	        
	         
	        }
	        return Data;
	    }
	
}
