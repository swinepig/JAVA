package com.hengtian.zxjk.entity.message;

public class BodyChangeMessage {
	/**
	 * 原金融机构代码(14)
	 */
	private String oldFinancialOrganizationCode;
	/**
	 * 新金融机构代码(14)
	 */
	private String newFinancialOrganizationCode;
	/**
	 * 原业务号(40)
	 */
	private String oldOperationNumber;
	/**
	 * 新业务号(40)
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
