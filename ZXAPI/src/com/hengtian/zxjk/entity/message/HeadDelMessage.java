package com.hengtian.zxjk.entity.message;

public class HeadDelMessage {
	/**
	 * ���ݸ�ʽ�汾��
	 * */
	private String dataFormatVersionNumber;
	/**
	 * ��������ʱ��
	 * */
	private String messageRiseTime;
	/**
	 * ���ڻ�������
	 * */
	private String financialOrganizationCode;
	/**
	 * �������
	 * */
	private String reportType;
	/**
	 * �˻���¼����
	 * */
	private String totalBaseRecords;
	/**
	 * ��ϵ��
	 * */
	private String contactPerson;
	/**
	 * ��ϵ�绰
	 * */
	private String contactTelephone;
	/**
	 * Ԥ���ֶ�
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
