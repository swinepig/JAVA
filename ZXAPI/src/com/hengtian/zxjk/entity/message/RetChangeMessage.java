package com.hengtian.zxjk.entity.message;

public class RetChangeMessage extends Message{
	private RetNameChangeMessage nameMessage;
	private RetHeadChangeMessage headMessage;
	private RetBodyChangeMessage bodyMessage;
	
	public RetNameChangeMessage getNameMessage() {
		return nameMessage;
	}
	public void setNameMessage(RetNameChangeMessage nameMessage) {
		this.nameMessage = nameMessage;
	}
	public RetHeadChangeMessage getHeadMessage() {
		return headMessage;
	}
	public void setHeadMessage(RetHeadChangeMessage headMessage) {
		this.headMessage = headMessage;
	}
	public RetBodyChangeMessage getBodyMessage() {
		return bodyMessage;
	}
	public void setBodyMessage(RetBodyChangeMessage bodyMessage) {
		this.bodyMessage = bodyMessage;
	}
	
	
	
	
	
	
}
