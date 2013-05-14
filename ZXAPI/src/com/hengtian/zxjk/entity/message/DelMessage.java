package com.hengtian.zxjk.entity.message;

public class DelMessage extends Message{
	private NameDelMessage nameMessage;
	private HeadDelMessage headMessage;
	private BodyDelMessage bodyMessage;
	
	public NameDelMessage getNameMessage() {
		return nameMessage;
	}
	public void setNameMessage(NameDelMessage nameMessage) {
		this.nameMessage = nameMessage;
	}
	public HeadDelMessage getHeadMessage() {
		return headMessage;
	}
	public void setHeadMessage(HeadDelMessage headMessage) {
		this.headMessage = headMessage;
	}
	public BodyDelMessage getBodyMessage() {
		return bodyMessage;
	}
	public void setBodyMessage(BodyDelMessage bodyMessage) {
		this.bodyMessage = bodyMessage;
	}
	
}
