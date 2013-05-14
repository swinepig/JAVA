package com.hengtian.zxjk.entity.message;

public class RetBodyDelMessage {
	/**
	 * 错误代码
	 */
	private String errorCode;
	/**
	 * 未删除记录的结算年月
	 */
	private String billingDate;
	/**
	 * 出错记录
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
