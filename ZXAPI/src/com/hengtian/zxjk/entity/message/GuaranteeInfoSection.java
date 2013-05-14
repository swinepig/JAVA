package com.hengtian.zxjk.entity.message;

/**
 * @author xinzhu
 * 
 *         ������Ϣ��������
 * 
 */
public class GuaranteeInfoSection {
	/**
	 * ��Ϣ��� ����1
	 * */
	private String segmentIdentifier;
	/**
	 * ���� ����30
	 */
	private String name;
	/**
	 * ֤������ ����1
	 */
	private String identificationType;
	/**
	 * ֤������ ����18
	 */
	private String identificationNumber;
	/**
	 * ������� ����10
	 * */
	private String guaranteedAmount;
	/**
	 * ����״̬ ����1
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
