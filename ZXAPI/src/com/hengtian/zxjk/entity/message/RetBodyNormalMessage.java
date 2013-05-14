package com.hengtian.zxjk.entity.message;

public class RetBodyNormalMessage {
	/**
	 * 出错报文文件名
	 */
	private String errorNameMessage;
	/**
	 * 出错原因信息(35)
	 */
	private String errorReasionInfo;
	/**
	 * 出错账户记录
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
