package com.hengtian.zxjk.entity.message;

/**
 * @author xinzhu
 * 
 *         身份信息段数据项
 */
public class IdentityInfoSection {
	/**
	 * 信息类别 长度1
	 * */
	private String segmentIdentifier;
	/**
	 * 性别 长度1
	 */
	private String gender;
	/**
	 * 出生日期 长度8
	 */
	private String dateOfBirth;
	/**
	 * 婚姻状况 长度2
	 */
	private String maritalStatus;
	/**
	 * 最高学历 长度2
	 */
	private String highestEducationLevel;
	/**
	 * 最高学位 长度1
	 */
	private String highestEducationalDegreeObtained;
	/**
	 * 住宅电话 长度25
	 */
	private String homeTelephone;
	/**
	 * 手机号码 长度16
	 */
	private String mobileTelephone;
	/**
	 * 单位电话 长度25
	 */
	private String officeTelephone;
	/**
	 * 电子邮箱 长度30
	 */
	private String email;
	/**
	 * 通讯地址 长度60
	 */
	private String mailingAddress;
	/**
	 * 通讯地址邮政编码 长度6
	 */
	private String postalCodeOfMailingAddress;
	/**
	 * 户籍地址 长度60
	 */
	private String permanentResidenceAddress;
	/**
	 * 配偶姓名 长度30
	 */
	private String spouseName;
	/**
	 * 配偶证件类型 长度1
	 */
	private String spouseIdentificationType;
	/**
	 * 配偶证件号码 长度18
	 */
	private String spouseIdentificationNumber;
	/**
	 * 配偶工作单位 长度60
	 */
	private String spouseCompanyName;
	/**
	 * 配偶联系电话 长度25
	 */
	private String spouseTelephone;

	public IdentityInfoSection() {
	}

	public IdentityInfoSection(String segmentIdentifier, String gender,
			String dateOfBirth, String maritalStatus,
			String highestEducationLevel,
			String highestEducationalDegreeObtained, String homeTelephone,
			String mobileTelephone, String officeTelephone, String email,
			String mailingAddress, String postalCodeOfMailingAddress,
			String permanentResidenceAddress, String spouseName,
			String spouseIdentificationType, String spouseIdentificationNumber,
			String spouseCompanyName, String spouseTelephone) {
		this.segmentIdentifier = segmentIdentifier;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.maritalStatus = maritalStatus;
		this.highestEducationLevel = highestEducationLevel;
		this.highestEducationalDegreeObtained = highestEducationalDegreeObtained;
		this.homeTelephone = homeTelephone;
		this.mobileTelephone = mobileTelephone;
		this.officeTelephone = officeTelephone;
		this.email = email;
		this.mailingAddress = mailingAddress;
		this.postalCodeOfMailingAddress = postalCodeOfMailingAddress;
		this.permanentResidenceAddress = permanentResidenceAddress;
		this.spouseName = spouseName;
		this.spouseIdentificationType = spouseIdentificationType;
		this.spouseIdentificationNumber = spouseIdentificationNumber;
		this.spouseCompanyName = spouseCompanyName;
		this.spouseTelephone = spouseTelephone;
	}

	public String getSegmentIdentifier() {
		return segmentIdentifier;
	}

	public void setSegmentIdentifier(String segmentIdentifier) {
		this.segmentIdentifier = segmentIdentifier;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getHighestEducationLevel() {
		return highestEducationLevel;
	}

	public void setHighestEducationLevel(String highestEducationLevel) {
		this.highestEducationLevel = highestEducationLevel;
	}

	public String getHighestEducationalDegreeObtained() {
		return highestEducationalDegreeObtained;
	}

	public void setHighestEducationalDegreeObtained(
			String highestEducationalDegreeObtained) {
		this.highestEducationalDegreeObtained = highestEducationalDegreeObtained;
	}

	public String getHomeTelephone() {
		return homeTelephone;
	}

	public void setHomeTelephone(String homeTelephone) {
		this.homeTelephone = homeTelephone;
	}

	public String getMobileTelephone() {
		return mobileTelephone;
	}

	public void setMobileTelephone(String mobileTelephone) {
		this.mobileTelephone = mobileTelephone;
	}

	public String getOfficeTelephone() {
		return officeTelephone;
	}

	public void setOfficeTelephone(String officeTelephone) {
		this.officeTelephone = officeTelephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMailingAddress() {
		return mailingAddress;
	}

	public void setMailingAddress(String mailingAddress) {
		this.mailingAddress = mailingAddress;
	}

	public String getPostalCodeOfMailingAddress() {
		return postalCodeOfMailingAddress;
	}

	public void setPostalCodeOfMailingAddress(String postalCodeOfMailingAddress) {
		this.postalCodeOfMailingAddress = postalCodeOfMailingAddress;
	}

	public String getPermanentResidenceAddress() {
		return permanentResidenceAddress;
	}

	public void setPermanentResidenceAddress(String permanentResidenceAddress) {
		this.permanentResidenceAddress = permanentResidenceAddress;
	}

	public String getSpouseName() {
		return spouseName;
	}

	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}

	public String getSpouseIdentificationType() {
		return spouseIdentificationType;
	}

	public void setSpouseIdentificationType(String spouseIdentificationType) {
		this.spouseIdentificationType = spouseIdentificationType;
	}

	public String getSpouseIdentificationNumber() {
		return spouseIdentificationNumber;
	}

	public void setSpouseIdentificationNumber(String spouseIdentificationNumber) {
		this.spouseIdentificationNumber = spouseIdentificationNumber;
	}

	public String getSpouseCompanyName() {
		return spouseCompanyName;
	}

	public void setSpouseCompanyName(String spouseCompanyName) {
		this.spouseCompanyName = spouseCompanyName;
	}

	public String getSpouseTelephone() {
		return spouseTelephone;
	}

	public void setSpouseTelephone(String spouseTelephone) {
		this.spouseTelephone = spouseTelephone;
	}

}
