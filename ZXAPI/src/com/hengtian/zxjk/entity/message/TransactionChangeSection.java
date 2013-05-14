package com.hengtian.zxjk.entity.message;

/**
 * @author xinzhu
 * 
 *         ���ױ�ʶ�����������
 * 
 */
public class TransactionChangeSection {
	/**
	 * ��Ϣ��� ����1
	 * */
	private String segmentIdentifier;
	/**
	 * ҵ���(ҵ������Ϊ����ʱ����������Ϊ����ҵ�����) ����40
	 * */
	private String operationNumber;
	/**
	 * ���ڻ������� ����14
	 * */
	private String financialOrganizationCode;
	/**
	 * ����/Ӧ�������� ����8
	 * */
	private String billingDate;

	public TransactionChangeSection() {
	}

	public TransactionChangeSection(String segmentIdentifier,
			String operationNumber, String financialOrganizationCode,
			String billingDate) {
		this.segmentIdentifier = segmentIdentifier;
		this.operationNumber = operationNumber;
		this.financialOrganizationCode = financialOrganizationCode;
		this.billingDate = billingDate;
	}

	public String getSegmentIdentifier() {
		return segmentIdentifier;
	}

	public void setSegmentIdentifier(String segmentIdentifier) {
		this.segmentIdentifier = segmentIdentifier;
	}

	public String getOperationNumber() {
		return operationNumber;
	}

	public void setOperationNumber(String operationNumber) {
		this.operationNumber = operationNumber;
	}

	public String getFinancialOrganizationCode() {
		return financialOrganizationCode;
	}

	public void setFinancialOrganizationCode(String financialOrganizationCode) {
		this.financialOrganizationCode = financialOrganizationCode;
	}

	public String getBillingDate() {
		return billingDate;
	}

	public void setBillingDate(String billingDate) {
		this.billingDate = billingDate;
	}

}
