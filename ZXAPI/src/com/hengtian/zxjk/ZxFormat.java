package com.hengtian.zxjk;

import java.util.List;

public class ZxFormat {
	/**
	 * 报文实体及其属性的class
	 */
	private String className;
	/**
	 * 判断 type=1，报文名 type=2，报文头 type=3，报文体 type=4, 信息记录 type="A" 基础段
	 */
	private String type;
	/**
	 * 判断报文类型 messageType:24-1-28
	 * 读取报文名第24，并且该位置的值为1.报文长度.
	 */
	private String messageType;
	/**
	 * 判断是否是最底层数据
	 */
	private String bottom;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBottom() {
		return bottom;
	}

	public void setBottom(String bottom) {
		this.bottom = bottom;
	}

	public String getMessageType() {
		return messageType;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	private List<ZxNode> children;

	public List<ZxNode> getChildren() {
		return children;
	}

	public void setChildren(List<ZxNode> children) {
		this.children = children;
	}

}
