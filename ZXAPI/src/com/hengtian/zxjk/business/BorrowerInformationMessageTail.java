package com.hengtian.zxjk.business;

/**
 * @author xinzhu
 * 
 *         ����β
 */
public class BorrowerInformationMessageTail {
	/**
	 * ���ڻ�������(��1��14λ)
	 */
	private String financialOrganizationCode;
	/**
	 * ��15��20λ����ʾ���ݷ������£�
	 */
	private String messageRiseTime;
	/**
	 * ��21��23λ����ʾ������ˮ��ţ���0-9�����ֺʹ�д��ĸA-Z���
	 */
	private String flowNum1;
	/**
	 * �������(��24λ)
	 */
	private String reportType;
	/**
	 * ��ˮ��(��25��27λ),��ʾ������ˮ���,��0-9�����ֺʹ�д��ĸA-Z���
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
