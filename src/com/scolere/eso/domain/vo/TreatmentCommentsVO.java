package com.scolere.eso.domain.vo;

public class TreatmentCommentsVO{
	
	private int commentId;
	private int treatmentId;
	private String commentTxt;
	private int parentCommentId;
	private int lastUpdtBy;
	private String lastUpdtTm;
	
	
	public int getCommentId() {
		return commentId;
	}
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
	public int getTreatmentId() {
		return treatmentId;
	}
	public void setTreatmentId(int treatmentId) {
		this.treatmentId = treatmentId;
	}
	public String getCommentTxt() {
		return commentTxt;
	}
	public void setCommentTxt(String commentTxt) {
		this.commentTxt = commentTxt;
	}
	public int getParentCommentId() {
		return parentCommentId;
	}
	public void setParentCommentId(int parentCommentId) {
		this.parentCommentId = parentCommentId;
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
