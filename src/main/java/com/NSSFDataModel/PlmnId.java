package com.NSSFDataModel;

public class PlmnId {
	String mcc;//Mobile Country Code pattern: '^[0-9]{3}$'
	String mnc;//Mobile Network Code Pattern: '^[0-9]{2,3}$'
	public PlmnId(String mcc, String mnc) {
		super();
		this.mcc = mcc;
		this.mnc = mnc;
	}
	
}
