package com.hengtian.zxjk;

import java.util.List;

public class ZxFormat {
	/**
	 * ����ʵ�弰�����Ե�class
	 */
	private String className;
	/**
	 * �ж� type=1�������� type=2������ͷ type=3�������� type=4, ��Ϣ��¼ type="A" ������
	 */
	private String type;
	/**
	 * �жϱ������� messageType:24-1-28
	 * ��ȡ��������24�����Ҹ�λ�õ�ֵΪ1.���ĳ���.
	 */
	private String messageType;
	/**
	 * �ж��Ƿ�����ײ�����
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
