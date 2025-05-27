package com.xius.smf.job;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.google.gson.Gson;
import com.xius.smf.client.invoker.Restinvoker;
import com.xius.smf.domaindata.ProcesssimswapRecordsData;
import com.xius.smf.domaindata.RespFwOBJ;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.Utilities;

public class HLRVerifyJobProcessor implements Runnable  {

	private static final Logger logger = LogManager.getLogger(HLRVerifyJobProcessor.class.getSimpleName());
	CountDownLatch latch = null;
	private ProcesssimswapRecordsData  processRecordsData;;
	private String command;
	private String operation; 
	
	boolean flag=true;
	
	public HLRVerifyJobProcessor(CountDownLatch latch,
			ProcesssimswapRecordsData processRecordsData,String Opertaion) {
		super();
		this.latch = latch;
		this.processRecordsData = processRecordsData;
		this.command=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.hlr_verify_job_Switch_COMMAND_TYPE);
		this.operation=Opertaion;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if (!Utilities.isNull(command)) {
			ProcesssimswapRecordsData ossdata = new ProcesssimswapRecordsData();
			RespFwOBJ respFwOBJ = new RespFwOBJ();
			respFwOBJ.setOperation(operation);
			respFwOBJ.getBSS().add(processRecordsData);
			try {
				String cmdValue = command;
				cmdValue = cmdValue.replace("$IMSI",String.valueOf(processRecordsData.getImsi_no()));
				logger.info( "updated command  ==>" + cmdValue);
				Restinvoker rinv = new Restinvoker();
				logger.info( "Invoking Hlr Call");
				String resp = rinv.getinvokeEmaCmdDetails(cmdValue);
				if (resp != null) {
					JSONObject jsonObject = new JSONObject(resp);
					if (jsonObject != null) {
						String rsp = jsonObject.getString("responseMessage");
						if (rsp != null) {
							String aactresp = checkResposnse(rsp);
							if (aactresp != null&& aactresp.equalsIgnoreCase("0")) {
								logger.info("Db MSISDN "+processRecordsData.getMsisdn_no());
								logger.info( "Db IMSI "+processRecordsData.getImsi_no());
								Map<String, String> prsdmap = parseDetails(rsp);
								if (prsdmap.get("IMSI").equalsIgnoreCase(processRecordsData.getImsi_no())) {
									if (prsdmap.get("MSISDN").equalsIgnoreCase(processRecordsData.getMsisdn_no())) {
										logger.info("Hlr Response Data Matched With Db Data");
									} else {
										logger.info("Hlr Response IMSI Matched With DB IMSI But Hlr Response MSISDN Not Matched With Db MSISDN");
										ossdata.setImsi_no(prsdmap.get("IMSI"));
										ossdata.setMsisdn_no(prsdmap.get("MSISDN"));
										respFwOBJ.getHLR().add(ossdata);
										flag=false;
									}
								} else {
									logger.info("Hlr Response IMSI Not Matched With DB IMSI");
									ossdata.setImsi_no(prsdmap.get("IMSI"));
									ossdata.setMsisdn_no(prsdmap.get("MSISDN"));
									respFwOBJ.getHLR().add(ossdata);
									flag=false;
								}
							} else {
								logger.info("Hlr Response Status is not Getting Zero");
								ossdata.setImsi_no("HLR IMSI NO DATA FOUND");
								ossdata.setMsisdn_no("HLR MSISDN NO DATA FOUND");
								respFwOBJ.getHLR().add(ossdata);
								flag=false;
							}
						}
					}
				} else {
					logger.info( "Hlr Response is Getting Null");
					ossdata.setImsi_no("HLR IMSI NULL");
					ossdata.setMsisdn_no("HLR MSISDN NULL");
					respFwOBJ.getHLR().add(ossdata);
					flag=false;
				}
				
				if(flag==false){
					// write to file 
					//FileSynWriter writer=FileSynWriter.getInstaceofFileSynWriter();
					FileSynWriter writer=FileSynWriter.getInstance();
					Gson gson = new Gson();
					
					JSONObject writejsonObject = new JSONObject( gson.toJson(respFwOBJ));
					writer.writeFile(String.valueOf(writejsonObject));
				}
			} catch (JSONException e) {
				e.printStackTrace();
			} finally {
				try {
					latch.countDown();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static String checkResposnse(String resinput){
		   int respStart = resinput.indexOf("RESP:");
           if (respStart != -1) {
               int errespEnd = resinput.indexOf(";", respStart);
               if (errespEnd != -1) {
                   String resp = resinput.substring(respStart + 5, errespEnd);
                   logger.info( "Hlr Response Status "+resp);
                   return resp;
               }else {
                   int respEnd = resinput.indexOf(":", respStart + 5);
                   if (respEnd != -1) {
                       String resp = resinput.substring(respStart + 5, respEnd);
                       logger.info( "Hlr Response Status "+resp);
                    return resp;
                   }
               }
           }
		return null;
	}
	
	   public static Map<String, String> parseDetails(String input) {
           Map<String, String> details = new HashMap<String, String>();

           // Parse MSISDN
           int msisdnStart = input.indexOf("MSISDN,");
           if (msisdnStart != -1) {
               int msisdnEnd = input.indexOf(":", msisdnStart);
               if (msisdnEnd != -1) {
                   String msisdn = input.substring(msisdnStart + 7, msisdnEnd);
                   logger.info("Hlr Response MSISDN "+msisdn);
                   details.put("MSISDN", msisdn);
               }
           }

           // Parse IMSI
           int imsiStart = input.indexOf("IMSI,");
           if (imsiStart != -1) {
               int imsiEnd = input.indexOf(":", imsiStart);
               if (imsiEnd != -1) {
                   String imsi = input.substring(imsiStart + 5, imsiEnd);
                   logger.info( "Hlr Response IMSI "+imsi);
                   details.put("IMSI", imsi);
               }
           }
           return details;
       }
}