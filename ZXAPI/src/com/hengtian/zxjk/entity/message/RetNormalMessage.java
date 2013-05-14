package com.hengtian.zxjk.entity.message;

public class RetNormalMessage extends Message{
	private RetNameNormalMessage nameMessage;
	private RetHeadNormalMessage headMessage;
	private RetBodyNormalMessage bodyMessage;
	
	public RetNameNormalMessage getNameMessage() {
		return nameMessage;
	}
	public void setNameMessage(RetNameNormalMessage nameMessage) {
		this.nameMessage = nameMessage;
	}
	public RetHeadNormalMessage getHeadMessage() {
		return headMessage;
	}
	public void setHeadMessage(RetHeadNormalMessage headMessage) {
		this.headMessage = headMessage;
	}
	public RetBodyNormalMessage getBodyMessage() {
		return bodyMessage;
	}
	public void setBodyMessage(RetBodyNormalMessage bodyMessage) {
		this.bodyMessage = bodyMessage;
	}
	
}
