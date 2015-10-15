package com.scolere.eso.domain.vo;

public class TreatmentVO {

	private int treatmentId;
	private int topicId;
	private String treatmentTitle;
	private String descTxt;
	private int displayOrder;
	private String enableFl;
	private int lastUpdtBy;
	private String lastUpdtTm;
	
	
	public int getTreatmentId() {
		return treatmentId;
	}
	public void setTreatmentId(int treatmentId) {
		this.treatmentId = treatmentId;
	}
	public int getTopicId() {
		return topicId;
	}
	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}
	public String getTreatmentTitle() {
		return treatmentTitle;
	}
	public void setTreatmentTitle(String treatmentTitle) {
		this.treatmentTitle = treatmentTitle;
	}
	public String getDescTxt() {
		return descTxt;
	}
	public void setDescTxt(String descTxt) {
		this.descTxt = descTxt;
	}
	public int getDisplayOrder() {
		return displayOrder;
	}
	public void setDisplayOrder(int displayOrder) {
		this.displayOrder = displayOrder;
	}
	public String getEnableFl() {
		return enableFl;
	}
	public void setEnableFl(String enableFl) {
		this.enableFl = enableFl;
	}
	public int getLastUpdtBy() {
		return lastUpdtBy;
	}
	public void setLastUpdtBy(int lastUpdtBy) {
		this.lastUpdtBy = lastUpdtBy;
	}
	public String getLastUpdtTm() {
		return lastUpdtTm;
	}
	public void setLastUpdtTm(String lastUpdtTm) {
		this.lastUpdtTm = lastUpdtTm;
	}
	


}
