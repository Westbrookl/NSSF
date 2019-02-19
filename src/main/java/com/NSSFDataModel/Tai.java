package com.NSSFDataModel;

public class Tai {
	PlmnId plmnId;
	String  tac;//Tac:
				//type: string
    			//pattern: '(^[A-Fa-f0-9]{4}$)|(^[A-Fa-f0-9]{6}$)'
	public Tai(PlmnId plmnId, String tac) {
		super();
		this.plmnId = plmnId;
		this.tac = tac;
	}
	public PlmnId getPlmnId() {
		return plmnId;
	}
	public void setPlmnId(PlmnId plmnId) {
		this.plmnId = plmnId;
	}
	public String getTac() {
		return tac;
	}
	public void setTac(String tac) {
		this.tac = tac;
	}
}
