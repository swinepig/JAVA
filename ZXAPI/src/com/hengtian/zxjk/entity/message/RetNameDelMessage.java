package com.hengtian.zxjk.entity.message;

public class RetNameDelMessage {
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
	private static  final String  constantvalue = "0";
	/**
	 * �������(��24λ)
	 */
	private String reportType;
	/**
	 * ��ˮ��(��25��27λ),ֻ����д��0��9�������ֺʹ�дӢ����ĸ
	 */
	private String flowNum;
	/**
	 * ��־������������
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
