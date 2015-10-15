package com.scolere.eso.domain.vo;

public class HealthTopicReportsVO {
	
	private int reportId;
	private int topicId;
	private String reportTitle;
	private String reportFile;
	private int displayOrder;
	private String enableFl;
	private int lastUpdtBy;
	private String lastUpdtTm;
	
	public int getReportId() {
		return reportId;
	}
	public void setReportId(int reportId) {
		this.reportId = reportId;
	}
	public int getTopicId() {
		return topicId;
	}
	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}
	public String getReportTitle() {
		return reportTitle;
	}
	public void setReportTitle(String reportTitle) {
		this.reportTitle = reportTitle;
	}
	public String getReportFile() {
		return reportFile;
	}
	public void setReportFile(String reportFile) {
		this.reportFile = reportFile;
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
