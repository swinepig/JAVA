package com.hengtian.zxjk.entity.message;

public class RetBodyNormalMessage {
	/**
	 * �������ļ���
	 */
	private String errorNameMessage;
	/**
	 * ����ԭ����Ϣ(35)
	 */
	private String errorReasionInfo;
	/**
	 * �����˻���¼
	 */
	private String errorUserHistory;
	
	public String getErrorNameMessage() {
		return errorNameMessage;
	}
	public void setErrorNameMessage(String errorNameMessage) {
		this.errorNameMessage = errorNameMessage;
	}
	public String getErrorReasionInfo() {
		return errorReasionInfo;
	}
	public void setErrorReasionInfo(String errorReasionInfo) {
		this.errorReasionInfo = errorReasionInfo;
	}
	public String getErrorUserHistory() {
		return errorUserHistory;
	}
	public void setErrorUserHistory(String errorUserHistory) {
		this.errorUserHistory = errorUserHistory;
	}
}
