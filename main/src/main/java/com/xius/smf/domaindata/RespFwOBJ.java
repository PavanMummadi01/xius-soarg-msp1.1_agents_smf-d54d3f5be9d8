package com.xius.smf.domaindata;

import java.util.ArrayList;
import java.util.List;

public class RespFwOBJ {

	private String operation;
	private List<ProcesssimswapRecordsData> BSS;
	private List<ProcesssimswapRecordsData> HLR;
	
	public RespFwOBJ() {
		this.BSS=new ArrayList<ProcesssimswapRecordsData>();
		this.HLR=new ArrayList<ProcesssimswapRecordsData>();
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public List<ProcesssimswapRecordsData> getBSS() {
		return BSS;
	}

	public void setBSS(List<ProcesssimswapRecordsData> bSS) {
		BSS = bSS;
	}

	public List<ProcesssimswapRecordsData> getHLR() {
		return HLR;
	}

	public void setHLR(List<ProcesssimswapRecordsData> hLR) {
		HLR = hLR;
	}

}
