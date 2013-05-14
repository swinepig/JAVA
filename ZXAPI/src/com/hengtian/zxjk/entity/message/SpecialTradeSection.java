package com.hengtian.zxjk.entity.message;

/**
 * @author xinzhu
 * 
 *         特殊交易段数据项
 */
public class SpecialTradeSection {
	/**
	 * 信息类别 长度1
	 * */
	private String segmentIdentifier;
	/**
	 * 特殊交易类型 长度1
	 */
	private String specialTransactionType;
	/**
	 * 发生日期 长度8
	 */
	private String specialDate;
	/**
	 * 发生金额 长度10
	 */
	private String specialAmount;
	/**
	 * 变更月数 长度4
	 */
	private String changingTerms;
	/**
	 * 明细信息 长度200
	 */
	private String detailedInformation;

	public SpecialTradeSection() {
	}

	public SpecialTradeSection(String segmentIdentifier,
			String specialTransactionType, String specialDate, String specialAmount,
			String changingTerms, String detailedInformation) {
		this.segmentIdentifier = segmentIdentifier;
		this.specialTransactionType = specialTransactionType;
		this.specialDate = specialDate;
		this.specialAmount = specialAmount;
		this.changingTerms = changingTerms;
		this.detailedInformation = detailedInformation;
	}

	public String getSegmentIdentifier() {
		return segmentIdentifier;
	}

	public void setSegmentIdentifier(String segmentIdentifier) {
		this.segmentIdentifier = segmentIdentifier;
	}

	public String getSpecialTransactionType() {
		return specialTransactionType;
	}

	public void setSpecialTransactionType(String specialTransactionType) {
		this.specialTransactionType = specialTransactionType;
	}

	public String getSpecialDate() {
		return specialDate;
	}

	public void setSpecialDate(String specialDate) {
		this.specialDate = specialDate;
	}

	public String getSpecialAmount() {
		return specialAmount;
	}

	public void setSpecialAmount(String specialAmount) {
		this.specialAmount = specialAmount;
	}

	public String getChangingTerms() {
		return changingTerms;
	}

	public void setChangingTerms(String changingTerms) {
		this.changingTerms = changingTerms;
	}

	public String getDetailedInformation() {
		return detailedInformation;
	}

	public void setDetailedInformation(String detailedInformation) {
		this.detailedInformation = detailedInformation;
	}

}
