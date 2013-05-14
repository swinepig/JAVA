package com.hengtian.zxjk.entity.message;

/**
 * @author xinzhu
 * 
 *         担保信息段数据项
 * 
 */
public class GuaranteeInfoSection {
	/**
	 * 信息类别 长度1
	 * */
	private String segmentIdentifier;
	/**
	 * 姓名 长度30
	 */
	private String name;
	/**
	 * 证件类型 长度1
	 */
	private String identificationType;
	/**
	 * 证件号码 长度18
	 */
	private String identificationNumber;
	/**
	 * 担保金额 长度10
	 * */
	private String guaranteedAmount;
	/**
	 * 担保状态 长度1
	 * */
	private String guranteeSelection;

	public GuaranteeInfoSection() {
	}

	public GuaranteeInfoSection(String segmentIdentifier, String name,
			String identificationType, String identificationNumber,
			String guaranteedAmount, String guranteeSelection) {
		this.segmentIdentifier = segmentIdentifier;
		this.name = name;
		this.identificationType = identificationType;
		this.identificationNumber = identificationNumber;
		this.guaranteedAmount = guaranteedAmount;
		this.guranteeSelection = guranteeSelection;
	}

	public String getSegmentIdentifier() {
		return segmentIdentifier;
	}

	public void setSegmentIdentifier(String segmentIdentifier) {
		this.segmentIdentifier = segmentIdentifier;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdentificationType() {
		return identificationType;
	}

	public void setIdentificationType(String identificationType) {
		this.identificationType = identificationType;
	}

	public String getIdentificationNumber() {
		return identificationNumber;
	}

	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

	public String getGuaranteedAmount() {
		return guaranteedAmount;
	}

	public void setGuaranteedAmount(String guaranteedAmount) {
		this.guaranteedAmount = guaranteedAmount;
	}

	public String getGuranteeSelection() {
		return guranteeSelection;
	}

	public void setGuranteeSelection(String guranteeSelection) {
		this.guranteeSelection = guranteeSelection;
	}

}
