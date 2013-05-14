package com.hengtian.zxjk.entity.message;

public class RetNameDelMessage {
	/**
	 * 金融机构代码(第1～14位)
	 */
	private String financialOrganizationCode;
	/**
	 * 报文生成时间(第15～22位)
	 */
	private String messageRiseTime;
	/**
	 * 常量(第23位)
	 */
	private static  final String  constantvalue = "0";
	/**
	 * 报文类别(第24位)
	 */
	private String reportType;
	/**
	 * 流水号(第25～27位),只能填写“0～9”的数字和大写英文字母
	 */
	private String flowNum;
	/**
	 * 标志反馈报文类型
	 */
	private String retType;
	
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
	public String getReportType() {
		return reportType;
	}
	public void setReportType(String reportType) {
		this.reportType = reportType;
	}
	public String getFlowNum() {
		return flowNum;
	}
	public void setFlowNum(String flowNum) {
		this.flowNum = flowNum;
	}
	public String getRetType() {
		return retType;
	}
	public void setRetType(String retType) {
		this.retType = retType;
	}
	public static String getConstantvalue() {
		return constantvalue;
	}
}
