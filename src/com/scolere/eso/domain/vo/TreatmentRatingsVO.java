package com.scolere.eso.domain.vo;

public class TreatmentRatingsVO {
	
	private int ratingId;
	private int treatmentId;
	private int rating;
	private int lastUpdtBy;
	private String lastUpdtTm;
	
	
	public int getRatingId() {
		return ratingId;
	}
	public void setRatingId(int ratingId) {
		this.ratingId = ratingId;
	}
	public int getTreatmentId() {
		return treatmentId;
	}
	public void setTreatmentId(int treatmentId) {
		this.treatmentId = treatmentId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
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
