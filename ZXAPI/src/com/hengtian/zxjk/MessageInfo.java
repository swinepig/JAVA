package com.hengtian.zxjk;

import java.util.List;

public class MessageInfo {

	private String messageNameStr;
	private String messageHeadStr;
	private List<String> messageBodyStr;

	public MessageInfo(String name, String head, List<String> body) {
		messageNameStr = name;
		messageHeadStr = head;
		messageBodyStr = body;
	}

	public String getMessageNameStr() {
		return messageNameStr;
	}

	public void setMessageNameStr(String messageNameStr) {
		this.messageNameStr = messageNameStr;
	}

	public String getMessageHeadStr() {
		return messageHeadStr;
	}

	public void setMessageHeadStr(String messageHeadStr) {
		this.messageHeadStr = messageHeadStr;
	}

	public List<String> getMessageBodyStr() {
		return messageBodyStr;
	}

	public void setMessageBodyStr(List<String> messageBodyStr) {
		this.messageBodyStr = messageBodyStr;
	}

}
