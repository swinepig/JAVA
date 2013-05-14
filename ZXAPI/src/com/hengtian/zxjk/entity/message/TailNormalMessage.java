package com.hengtian.zxjk.entity.message;

public class TailNormalMessage {
	/**
	 * 报文尾标志位
	 */
	private String identifierBit = "Z";
	private String infoCount;
	public String getIdentifierBit() {
		return identifierBit;
	}
	public void setIdentifierBit(String identifierBit) {
		this.identifierBit = identifierBit;
	}
	public String getInfoCount() {
		return infoCount;
	}
	public void setInfoCount(String infoCount) {
		this.infoCount = infoCount;
	}
	
}
