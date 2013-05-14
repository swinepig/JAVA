package com.hengtian.zxjk.business;

/**
 * @author xinzhu
 * 
 *         报文尾
 */
public class BorrowerInformationMessageTail {
	/**
	 * 金融机构代码(第1～14位)
	 */
	private String financialOrganizationCode;
	/**
	 * 第15～20位：表示数据发生年月；
	 */
	private String messageRiseTime;
	/**
	 * 第21～23位：表示报文流水序号，由0-9的数字和大写字母A-Z组成
	 */
	private String flowNum1;
	/**
	 * 报文类别(第24位)
	 */
	private String reportType;
	/**
	 * 流水号(第25～27位),表示报文流水序号,由0-9的数字和大写字母A-Z组成
	 */
	private String flowNum2;

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

	public String getFlowNum1() {
		return flowNum1;
	}

	public void setFlowNum1(String flowNum1) {
		this.flowNum1 = flowNum1;
	}

	public String getReportType() {
		return reportType;
	}

	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	public String getFlowNum2() {
		return flowNum2;
	}

	public void setFlowNum2(String flowNum2) {
		this.flowNum2 = flowNum2;
	}
}
