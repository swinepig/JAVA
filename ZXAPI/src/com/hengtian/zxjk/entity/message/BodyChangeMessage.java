package com.hengtian.zxjk.entity.message;

public class BodyChangeMessage {
	/**
	 * ԭ���ڻ�������(14)
	 */
	private String oldFinancialOrganizationCode;
	/**
	 * �½��ڻ�������(14)
	 */
	private String newFinancialOrganizationCode;
	/**
	 * ԭҵ���(40)
	 */
	private String oldOperationNumber;
	/**
	 * ��ҵ���(40)
	 */
	private String newOperationNumber;
	
	public String getOldFinancialOrganizationCode() {
		return oldFinancialOrganizationCode;
	}
	public void setOldFinancialOrganizationCode(String oldFinancialOrganizationCode) {
		this.oldFinancialOrganizationCode = oldFinancialOrganizationCode;
	}
	public String getNewFinancialOrganizationCode() {
		return newFinancialOrganizationCode;
	}
	public void setNewFinancialOrganizationCode(String newFinancialOrganizationCode) {
		this.newFinancialOrganizationCode = newFinancialOrganizationCode;
	}
	public String getOldOperationNumber() {
		return oldOperationNumber;
	}
	public void setOldOperationNumber(String oldOperationNumber) {
		this.oldOperationNumber = oldOperationNumber;
	}
	public String getNewOperationNumber() {
		return newOperationNumber;
	}
	public void setNewOperationNumber(String newOperationNumber) {
		this.newOperationNumber = newOperationNumber;
	}
	
	
}
