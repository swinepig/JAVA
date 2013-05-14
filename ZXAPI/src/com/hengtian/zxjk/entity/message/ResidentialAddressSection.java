package com.hengtian.zxjk.entity.message;

/**
 * @author xinzhu
 * 
 *         居住地址段数据项
 * 
 */
public class ResidentialAddressSection {
	/**
	 * 信息类别 长度1
	 * */
	private String segmentIdentifier;
	/**
	 * 居住地址 长度60
	 */
	private String currentAddress;
	/**
	 * 居住地址邮政编码 长度6
	 */
	private String postalCodeOfCurrentAddress;
	/**
	 * 居住状况 长度1
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
