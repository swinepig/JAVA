package com.hengtian.zxjk;

public class ZxNode {
	/**
	 * 属性名
	 */
	private String propertyName;
	/**
	 * 字符串长度
	 */
	private int length;
	/**
	 * 字符串类型AN,N,ANC
	 */
	private String type;
	/**
	 * 取值状态，M,C
	 */
	private String state;
	/**
	 * 属性的返回类型
	 */
	private String className;
	/**
	 *节点值，解码时存放从txt文本读取的值。 
	 */
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	/**
     * @param propertyName
     *            the propertyName to set
     */
    public void setPropertyName(String propertyName) {
	this.propertyName = propertyName;
    }

    /**
     * @return the length
     */
    public int getLength() {
	return length;
    }

    /**
     * @param length
     *            the length to set
     */
    public void setLength(int length) {
	this.length = length;
    }

    /**
     * @return the type
     */
    public String getType() {
	return type;
    }

    /**
     * @param type
     *            the type to set
     */
    public void setType(String type) {
	this.type = type;
    }

}
