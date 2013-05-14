package com.hengtian.zxjk.entity.message;

public class RetHeadChangeMessage {
	/**
	 * 数据格式版本号 长度3
	 * */
	private String dataFormatVersionNumber;
	/**
	 * 报文生成时间	长度14
	 * */
	private String messageRiseTime;
	/**
	 * 出错报文文件名 长度27
	 * */
	private String errorNameMessage;
	/**
	 * 出错信息
	 */
	private String errorInfo;
}
