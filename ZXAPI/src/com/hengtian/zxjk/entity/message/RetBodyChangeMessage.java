package com.hengtian.zxjk.entity.message;

public class RetBodyChangeMessage {
	/**
	 * �������
	 */
	private String errorCode;
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
	public String getErrorHistory() {
		return errorHistory;
	}
	public void setErrorHistory(String errorHistory) {
		this.errorHistory = errorHistory;
	}
	
}
