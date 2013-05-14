package com.hengtian.zxjk.entity.message;

/**
 * @author xinzhu
 * 
 *         交易标识变更段数据项
 * 
 */
public class TransactionChangeSection {
	/**
	 * 信息类别 长度1
	 * */
	private String segmentIdentifier;
	/**
	 * 业务号(业务种类为贷款时，此数据项为贷款业务号码) 长度40
	 * */
	private String operationNumber;
	/**
	 * 金融机构代码 长度14
	 * */
	private String financialOrganizationCode;
	/**
	 * 结算/应还款日期 长度8
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
