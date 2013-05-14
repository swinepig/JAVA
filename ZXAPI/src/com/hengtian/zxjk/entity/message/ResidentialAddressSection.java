package com.hengtian.zxjk.entity.message;

/**
 * @author xinzhu
 * 
 *         ��ס��ַ��������
 * 
 */
public class ResidentialAddressSection {
	/**
	 * ��Ϣ��� ����1
	 * */
	private String segmentIdentifier;
	/**
	 * ��ס��ַ ����60
	 */
	private String currentAddress;
	/**
	 * ��ס��ַ�������� ����6
	 */
	private String postalCodeOfCurrentAddress;
	/**
	 * ��ס״�� ����1
	 */
	private String residenceStatus;

	public ResidentialAddressSection() {
	}

	public ResidentialAddressSection(String segmentIdentifier,
			String currentAddress, String postalCodeOfCurrentAddress,
			String residenceStatus) {
		this.segmentIdentifier = segmentIdentifier;
		this.currentAddress = currentAddress;
		this.postalCodeOfCurrentAddress = postalCodeOfCurrentAddress;
		this.residenceStatus = residenceStatus;
	}

	public String getSegmentIdentifier() {
		return segmentIdentifier;
	}

	public void setSegmentIdentifier(String segmentIdentifier) {
		this.segmentIdentifier = segmentIdentifier;
	}

	public String getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}

	public String getPostalCodeOfCurrentAddress() {
		return postalCodeOfCurrentAddress;
	}

	public void setPostalCodeOfCurrentAddress(String postalCodeOfCurrentAddress) {
		this.postalCodeOfCurrentAddress = postalCodeOfCurrentAddress;
	}

	public String getResidenceStatus() {
		return residenceStatus;
	}

	public void setResidenceStatus(String residenceStatus) {
		this.residenceStatus = residenceStatus;
	}

}
