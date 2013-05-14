package com.hengtian.zxjk.entity.message;

public class RetDelMessage extends Message{
	private RetNameDelMessage nameMessage;
	private RetHeadDelMessage headMessage;
	private RetBodyDelMessage bodyMessage;
	public RetNameDelMessage getNameMessage() {
		return nameMessage;
	}
	public void setNameMessage(RetNameDelMessage nameMessage) {
		this.nameMessage = nameMessage;
	}
	public RetHeadDelMessage getHeadMessage() {
		return headMessage;
	}
	public void setHeadMessage(RetHeadDelMessage headMessage) {
		this.headMessage = headMessage;
	}
	public RetBodyDelMessage getBodyMessage() {
		return bodyMessage;
	}
	public void setBodyMessage(RetBodyDelMessage bodyMessage) {
		this.bodyMessage = bodyMessage;
	}
	
	
}
