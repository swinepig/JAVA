package com.hengtian.zxjk.entity.message;

public class RetBodyDelMessage {
	/**
	 * �������
	 */
	private String errorCode;
	/**
	 * δɾ����¼�Ľ�������
	 */
	private String billingDate;
	/**
	 * �����¼
	 */
	private String errorHistory;
	
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getBillingDate() {
		return billingDate;
	}
	public void setBillingDate(String billingDate) {
		this.billingDate = billingDate;
	}
	public String getErrorHistory() {
		return errorHistory;
	}
	public void setErrorHistory(String errorHistory) {
		this.errorHistory = errorHistory;
	}
}
