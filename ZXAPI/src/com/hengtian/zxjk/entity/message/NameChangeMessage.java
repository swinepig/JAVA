package com.hengtian.zxjk.entity.message;

public class NameChangeMessage {
	/**
	 * ���ڻ�������(��1��14λ)
	 */
	private String financialOrganizationCode;
	/**
	 * ��������ʱ��(��15��22λ)
	 */
	private String messageRiseTime;
	/**
	 * ����(��23λ)
	 */
	private String  constantvalue = "0";
	/**
	 * �������(��24λ)
	 */
	private String reportType;
	/**
	 * ��ˮ��(��25��27λ),ֻ����д��0��9�������ֺʹ�дӢ����ĸ
	 */
	private String flowNum;
	
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
	public String getConstantvalue() {
		return constantvalue;
	}
	public void setConstantvalue(String constantvalue) {
		this.constantvalue = constantvalue;
	}
}