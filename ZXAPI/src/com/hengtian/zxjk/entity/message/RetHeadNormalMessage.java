package com.hengtian.zxjk.entity.message;

public class RetHeadNormalMessage {
	/**
	 * ���ݸ�ʽ�汾�� ����3
	 * */
	private String dataFormatVersionNumber;
	/**
	 * ���ڻ�������  ����14
	 * */
	private String financialOrganizationCode;
	/**
	 * ��������ʱ��	����14
	 * */
	private String messageRiseTime;
	/**
	 * ԭ�����ļ���	����27
	 * */
	private String srcNameMessage;
	/**
	 * �������ļ��� ����27
	 * */
	private String errorNameMessage;
	/**
	 * �˻���¼����	����10
	 * */
	private String totalBaseRecords;
	/**
	 * ����ԭ�����(10)
	 */
	private String errorReason;
	/**
	 * �ر�Ҫ��
	 */
	private String reportType;
	/**
	 * ��ϵ��	����30
	 * */
	private String contactPerson;
	/**
	 * ��ϵ�绰	����25
	 * */
	private String contactTelephone;
	/**
	 * Ԥ���ֶ�	����30
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
