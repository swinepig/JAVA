package com.hengtian.zxjk.entity.message;

public class BodyDelMessage {
	/**
	 * ���ڻ�������(14)
	 */
	private String financialOrganizationCode;
	/**
	 * ҵ���(40)
	 */
	private String operationNumber;
	/**
	 * ��ʼ����/Ӧ��������(8)
	 */
	private String startBillingDate;
	/**
	 * ��������/Ӧ��������(8)
	 */
	private String endBillingDate;
	
	public String getFinancialOrganizationCode() {
		return financialOrganizationCode;
	}
	public void setFinancialOrganizationCode(String financialOrganizationCode) {
		this.financialOrganizationCode = financialOrganizationCode;
	}
	public String getOperationNumber() {
		return operationNumber;
	}
	public void setOperationNumber(String operationNumber) {
		this.operationNumber = operationNumber;
	}
	public String getStartBillingDate() {
		return startBillingDate;
	}
	public void setStartBillingDate(String startBillingDate) {
		this.startBillingDate = startBillingDate;
	}
	public String getEndBillingDate() {
		return endBillingDate;
	}
	public void setEndBillingDate(String endBillingDate) {
		this.endBillingDate = endBillingDate;
	}
}
