package com.hengtian.zxjk.entity.message;

public class ChangeMessage extends Message{
	private NameChangeMessage nameMessage;
	private HeadChangeMessage headMessage;
	private BodyChangeMessage bodyMessage;
	
	
	public NameChangeMessage getNameMessage() {
		return nameMessage;
	}
	public void setNameMessage(NameChangeMessage nameMessage) {
		this.nameMessage = nameMessage;
	}
	public HeadChangeMessage getHeadMessage() {
		return headMessage;
	}
	public void setHeadMessage(HeadChangeMessage headMessage) {
		this.headMessage = headMessage;
	}
	public BodyChangeMessage getBodyMessage() {
		return bodyMessage;
	}
	public void setBodyMessage(BodyChangeMessage bodyMessage) {
		this.bodyMessage = bodyMessage;
	}
}
