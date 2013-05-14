package com.hengtian.zxjk.business;


/**
 * @author xinzhu
 * 
 * 借款人概况信息报文
 */
public class BorrowerInformationMessage {
	
	private BorrowerInformationMessageName messageName;
	
	private BorrowerInformationMessageHead messageHead;
	
	private BorrowerInformationMessageTail messageTail;
	
	private BorrowerInformationMessageBody borrowerInformationMessageBody;

	public BorrowerInformationMessageHead getMessageHead() {
		return messageHead;
	}

	public void setMessageHead(BorrowerInformationMessageHead messageHead) {
		this.messageHead = messageHead;
	}

	public BorrowerInformationMessageTail getMessageTail() {
		return messageTail;
	}

	public void setMessageTail(BorrowerInformationMessageTail messageTail) {
		this.messageTail = messageTail;
	}

	public BorrowerInformationMessageBody getBorrowerInformationMessageBody() {
		return borrowerInformationMessageBody;
	}

	public void setBorrowerInformationMessageBody(
			BorrowerInformationMessageBody borrowerInformationMessageBody) {
		this.borrowerInformationMessageBody = borrowerInformationMessageBody;
	}

	public BorrowerInformationMessageName getMessageName() {
		return messageName;
	}

	public void setMessageName(BorrowerInformationMessageName messageName) {
		this.messageName = messageName;
	}


}
