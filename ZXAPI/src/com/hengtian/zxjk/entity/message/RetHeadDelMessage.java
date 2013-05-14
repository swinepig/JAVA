package com.hengtian.zxjk.entity.message;

public class RetHeadDelMessage {
	/**
	 * 数据格式版本号
	 * */
	private String dataFormatVersionNumber;
	/**
	 * 报文生成时间
	 * */
	private String messageRiseTime;
	/**
	 * 出错文件名
	 */
	private String errorNameMessage;
	/**
	 * 出错信息
	 */
	private String errorInfo;
	/**
	 * 联系人
	 * */
	private String contactPerson;
	/**
	 * 联系电话
	 * */
	private String contactTelephone;
	/**
	 * 预留字段
	 * */
	private String reservedField;
	public String getDataFormatVersionNumber() {
		return dataFormatVersionNumber;
	}
	public void setDataFormatVersionNumber(String dataFormatVersionNumber) {
		this.dataFormatVersionNumber = dataFormatVersionNumber;
	}
	public String getMessageRiseTime() {
		return messageRiseTime;
	}
	public void setMessageRiseTime(String messageRiseTime) {
		this.messageRiseTime = messageRiseTime;
	}
	public String getErrorNameMessage() {
		return errorNameMessage;
	}
	public void setErrorNameMessage(String errorNameMessage) {
		this.errorNameMessage = errorNameMessage;
	}
	public String getErrorInfo() {
		return errorInfo;
	}
	public void setErrorInfo(String errorInfo) {
		this.errorInfo = errorInfo;
	}
	public String getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	public String getContactTelephone() {
		return contactTelephone;
	}
	public void setContactTelephone(String contactTelephone) {
		this.contactTelephone = contactTelephone;
	}
	public String getReservedField() {
		return reservedField;
	}
	public void setReservedField(String reservedField) {
		this.reservedField = reservedField;
	}
	
}
