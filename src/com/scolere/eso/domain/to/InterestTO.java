package com.scolere.eso.domain.to;

public class InterestTO {
	
	private int interestId;
	private String interestName;
	
	
	public InterestTO(int interestId, String interestName) {
		
		this.interestId = interestId;
		this.interestName = interestName;
	}
	public InterestTO() {
		super();
	}
	public int getInterestId() {
		return interestId;
	}
	public void setInterestId(int interestId) {
		this.interestId = interestId;
	}
	public String getInterestName() {
		return interestName;
	}
	public void setInterestName(String interestName) {
		this.interestName = interestName;
	}

}
