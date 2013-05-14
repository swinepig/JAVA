package com.hengtian.zxjk.business;

/**
 * @author xinzhu
 * 
 *         报文头
 */
public class BorrowerInformationMessageHead {
	/**
	 * 数据格式版本号 长度3
	 * */
	private String dataFormatVersionNumber;
	/**
	 * 金融机构代码 长度14
	 * */
	private String financialOrganizationCode;
	/**
	 * 报文生成时间 长度14
	 * */
	private String messageRiseTime;
	/**
	 * 上传报文的版本号 长度3
	 * */
	private String softwareVersionNumber;
	/**
	 * 重报提示 长度1
	 * */
	private String retransmissionIndicator;
	/**
	 * 报文类别 长度1
	 * */
	private String reportType;
	/**
	 * 账户记录总数 长度10
	 * */
	private String totalBaseRecords;
	/**
	 * 最早结算/应还款日期 长度8
	 * */
	private String earliestBillingDate;
	/**
	 * 最晚结算/应还款日期 长度8
	 * */
	private String latestBillingDate;
	/**
	 * 联系人 长度30
	 * */
	private String contactPerson;
	/**
	 * 联系电话 长度25
	 * */
	private String contactTelephone;
	/**
	 * 预留字段 长度30
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
