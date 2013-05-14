package com.hengtian.zxjk.entity.message;


public class NormalMessage extends Message{
	private NameNormalMessage nameMessage;
	private HeadNormalMessage headMessage;
	private BodyNormalMessage bodyMessage;
	private TailNormalMessage tailMessage;
	
	public TailNormalMessage getTailMessage() {
		return tailMessage;
	}
	public void setTailMessage(TailNormalMessage tailMessage) {
		this.tailMessage = tailMessage;
	}
	public NameNormalMessage getNameMessage() {
		return nameMessage;
	}
	public void setNameMessage(NameNormalMessage nameMessage) {
		this.nameMessage = nameMessage;
	}
	public HeadNormalMessage getHeadMessage() {
		return headMessage;
	}
	public void setHeadMessage(HeadNormalMessage headMessage) {
		this.headMessage = headMessage;
	}
	public BodyNormalMessage getBodyMessage() {
		return bodyMessage;
	}
	public void setBodyMessage(BodyNormalMessage bodyMessage) {
		this.bodyMessage = bodyMessage;
	}
}
