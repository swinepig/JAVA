package com.hengtian.zxjk.business;

/**
 * @author xinzhu
 * 
 *         ����ͷ
 */
public class BorrowerInformationMessageHead {
	/**
	 * ���ݸ�ʽ�汾�� ����3
	 * */
	private String dataFormatVersionNumber;
	/**
	 * ���ڻ������� ����14
	 * */
	private String financialOrganizationCode;
	/**
	 * ��������ʱ�� ����14
	 * */
	private String messageRiseTime;
	/**
	 * �ϴ����ĵİ汾�� ����3
	 * */
	private String softwareVersionNumber;
	/**
	 * �ر���ʾ ����1
	 * */
	private String retransmissionIndicator;
	/**
	 * ������� ����1
	 * */
	private String reportType;
	/**
	 * �˻���¼���� ����10
	 * */
	private String totalBaseRecords;
	/**
	 * �������/Ӧ�������� ����8
	 * */
	private String earliestBillingDate;
	/**
	 * �������/Ӧ�������� ����8
	 * */
	private String latestBillingDate;
	/**
	 * ��ϵ�� ����30
	 * */
	private String contactPerson;
	/**
	 * ��ϵ�绰 ����25
	 * */
	private String contactTelephone;
	/**
	 * Ԥ���ֶ� ����30
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

	public String getSoftwareVersionNumber() {
		return softwareVersionNumber;
	}

	public void setSoftwareVersionNumber(String softwareVersionNumber) {
		this.softwareVersionNumber = softwareVersionNumber;
	}

	public String getRetransmissionIndicator() {
		return retransmissionIndicator;
	}

	public void setRetransmissionIndicator(String retransmissionIndicator) {
		this.retransmissionIndicator = retransmissionIndicator;
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

	public String getEarliestBillingDate() {
		return earliestBillingDate;
	}

	public void setEarliestBillingDate(String earliestBillingDate) {
		this.earliestBillingDate = earliestBillingDate;
	}

	public String getLatestBillingDate() {
		return latestBillingDate;
	}

	public void setLatestBillingDate(String latestBillingDate) {
		this.latestBillingDate = latestBillingDate;
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
