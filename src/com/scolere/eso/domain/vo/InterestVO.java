package com.scolere.eso.domain.vo;

public class InterestVO {
	
	private int interestId;
	private String interestName;
	
	
	public InterestVO(int interestId, String interestName) {
		
		this.interestId = interestId;
		this.interestName = interestName;
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
