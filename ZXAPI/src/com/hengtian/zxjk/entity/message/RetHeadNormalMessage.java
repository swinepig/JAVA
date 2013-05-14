package com.hengtian.zxjk.entity.message;

public class RetHeadNormalMessage {
	/**
	 * 数据格式版本号 长度3
	 * */
	private String dataFormatVersionNumber;
	/**
	 * 金融机构代码  长度14
	 * */
	private String financialOrganizationCode;
	/**
	 * 报文生成时间	长度14
	 * */
	private String messageRiseTime;
	/**
	 * 原报文文件名	长度27
	 * */
	private String srcNameMessage;
	/**
	 * 出错报文文件名 长度27
	 * */
	private String errorNameMessage;
	/**
	 * 账户记录总数	长度10
	 * */
	private String totalBaseRecords;
	/**
	 * 出错原因代码(10)
	 */
	private String errorReason;
	/**
	 * 重报要求
	 */
	private String reportType;
	/**
	 * 联系人	长度30
	 * */
	private String contactPerson;
	/**
	 * 联系电话	长度25
	 * */
	private String contactTelephone;
	/**
	 * 预留字段	长度30
	 * */
	private String reservedField;
	
	public String getDataFormatVersionNumber() {
		return dataFormatVersionNumber;
	}
	public void setDataFormatVersionNumber(String dataFormatVersionNumber) {
		this.dataFormatVersionNumber = dataFormatVersionNumber;
	}
	public String getFinancialOrganizationCode() {
		return financialOrganizationCode;
	}
	public void setFinancialOrganizationCode(String financialOrganizationCode) {
		this.financialOrganizationCode = financialOrganizationCode;
	}
	public String getMessageRiseTime() {
		return messageRiseTime;
	}
	public void setMessageRiseTime(String messageRiseTime) {
		this.messageRiseTime = messageRiseTime;
	}
	public String getSrcNameMessage() {
		return srcNameMessage;
	}
	public void setSrcNameMessage(String srcNameMessage) {
		this.srcNameMessage = srcNameMessage;
	}
	public String getErrorNameMessage() {
		return errorNameMessage;
	}
	public void setErrorNameMessage(String errorNameMessage) {
		this.errorNameMessage = errorNameMessage;
	}
	public String getTotalBaseRecords() {
		return totalBaseRecords;
	}
	public void setTotalBaseRecords(String totalBaseRecords) {
		this.totalBaseRecords = totalBaseRecords;
	}
	public String getErrorReason() {
		return errorReason;
	}
	public void setErrorReason(String errorReason) {
		this.errorReason = errorReason;
	}
	public String getReportType() {
		return reportType;
	}
	public void setReportType(String reportType) {
		this.reportType = reportType;
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
