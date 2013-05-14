package com.hengtian.zxjk.entity.message;

/**
 * @author xinzhu
 * 
 *         �����Ϣ��������
 */
public class IdentityInfoSection {
	/**
	 * ��Ϣ��� ����1
	 * */
	private String segmentIdentifier;
	/**
	 * �Ա� ����1
	 */
	private String gender;
	/**
	 * �������� ����8
	 */
	private String dateOfBirth;
	/**
	 * ����״�� ����2
	 */
	private String maritalStatus;
	/**
	 * ���ѧ�� ����2
	 */
	private String highestEducationLevel;
	/**
	 * ���ѧλ ����1
	 */
	private String highestEducationalDegreeObtained;
	/**
	 * סլ�绰 ����25
	 */
	private String homeTelephone;
	/**
	 * �ֻ����� ����16
	 */
	private String mobileTelephone;
	/**
	 * ��λ�绰 ����25
	 */
	private String officeTelephone;
	/**
	 * �������� ����30
	 */
	private String email;
	/**
	 * ͨѶ��ַ ����60
	 */
	private String mailingAddress;
	/**
	 * ͨѶ��ַ�������� ����6
	 */
	private String postalCodeOfMailingAddress;
	/**
	 * ������ַ ����60
	 */
	private String permanentResidenceAddress;
	/**
	 * ��ż���� ����30
	 */
	private String spouseName;
	/**
	 * ��ż֤������ ����1
	 */
	private String spouseIdentificationType;
	/**
	 * ��ż֤������ ����18
	 */
	private String spouseIdentificationNumber;
	/**
	 * ��ż������λ ����60
	 */
	private String spouseCompanyName;
	/**
	 * ��ż��ϵ�绰 ����25
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
