package com.hengtian.zxjk.entity.message;

public class RetHeadDelMessage {
	/**
	 * ���ݸ�ʽ�汾��
	 * */
	private String dataFormatVersionNumber;
	/**
	 * ��������ʱ��
	 * */
	private String messageRiseTime;
	/**
	 * �����ļ���
	 */
	private String errorNameMessage;
	/**
	 * ������Ϣ
	 */
	private String errorInfo;
	/**
	 * ��ϵ��
	 * */
	private String contactPerson;
	/**
	 * ��ϵ�绰
	 * */
	private String contactTelephone;
	/**
	 * Ԥ���ֶ�
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
