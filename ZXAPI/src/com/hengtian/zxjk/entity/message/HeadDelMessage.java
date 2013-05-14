package com.hengtian.zxjk.entity.message;

public class HeadDelMessage {
	/**
	 * 数据格式版本号
	 * */
	private String dataFormatVersionNumber;
	/**
	 * 报文生成时间
	 * */
	private String messageRiseTime;
	/**
	 * 金融机构代码
	 * */
	private String financialOrganizationCode;
	/**
	 * 报文类别
	 * */
	private String reportType;
	/**
	 * 账户记录总数
	 * */
	private String totalBaseRecords;
	/**
	 * 联系人
	 * */
	private String contactPerson;
	/**
	 * 联系电话
	 * */
	private String contactTelephone;
	/**
	 * 预留字段
	 * */
	private String reservedField;
	
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
	public String getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	public String getContactTelephone() {
		return contactTelephone;
	}
	public void setContactTelephone(String contactTelephone) {
		this.contactTelephone = contactTelephone;
	}
	public String getReservedField() {
		return reservedField;
	}
	public void setReservedField(String reservedField) {
		this.reservedField = reservedField;
	}
}
