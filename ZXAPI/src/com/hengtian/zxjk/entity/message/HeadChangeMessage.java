package com.hengtian.zxjk.entity.message;

public class HeadChangeMessage {
	/**
	 * 数据格式版本号(3)
	 * */
	private String dataFormatVersionNumber;
	/**
	 * 报文生成时间(14)
	 * */
	private String messageRiseTime;
	/**
	 * 金融机构代码(14)
	 * */
	private String financialOrganizationCode;
	/**
	 * 报文类别(1)
	 * */
	private String reportType;
	/**
	 * 账户记录总数(8)
	 * */
	private String totalBaseRecords;
	
	public String getDataFormatVersionNumber() {
		return dataFormatVersionNumber;
	}
	public void setDataFormatVersionNumber(String dataFormatVersionNumber) {
		this.dataFormatVersionNumber = dataFormatVersionNumber;
	}
	public String getMessageRiseTime() {
		return messageRiseTime;
	}
	public void setMessageRiseTime(String messageRiseTime) {
		this.messageRiseTime = messageRiseTime;
	}
	public String getFinancialOrganizationCode() {
		return financialOrganizationCode;
	}
	public void setFinancialOrganizationCode(String financialOrganizationCode) {
		this.financialOrganizationCode = financialOrganizationCode;
	}
	public String getReportType() {
		return reportType;
	}
	public void setReportType(String reportType) {
		this.reportType = reportType;
	}
	public String getTotalBaseRecords() {
		return totalBaseRecords;
	}
	public void setTotalBaseRecords(String totalBaseRecords) {
		this.totalBaseRecords = totalBaseRecords;
	}
	
	
}
