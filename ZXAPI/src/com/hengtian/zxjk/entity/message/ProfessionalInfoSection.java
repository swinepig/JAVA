package com.hengtian.zxjk.entity.message;

/**
 * @author xinzhu
 * 
 *         ְҵ��Ϣ��������
 */
public class ProfessionalInfoSection {
	/**
	 * ��Ϣ��� ����1
	 * */
	private String segmentIdentifier;
	/**
	 * ְҵ ����1
	 */
	private String occupation;
	/**
	 * ��λ���� ����60
	 */
	private String companyName;
	/**
	 * ��λ��ַ ����60
	 */
	private String companyAddress;
	/**
	 * ��λ��ַ�������� ����6
	 */
	private String postalCodeOfCompanyAddress;
	/**
	 * ��λ������ҵ ����1
	 */
	private String industrialCodeOfCompany;
	/**
	 * ְ�� ����1
	 */
	private String title;
	/**
	 * ְ�� ����1
	 */
	private String technicalTitleLevel;
	/**
	 * ����λ������ʼ��� ����4
	 */
	private String yearStartedWorking;
	/**
	 * ������ ����10
	 */
	private String annualIncome;
	/**
	 * �����˺� ����40
	 */
	private String accountNumberforSalaryAccount;
	/**
	 * �����˺ſ������� ����14
	 */
	private String bankforSalaryAccount;

	public ProfessionalInfoSection() {
	}

	public ProfessionalInfoSection(String segmentIdentifier, String occupation,
			String companyName, String companyAddress,
			String postalCodeOfCompanyAddress, String industrialCodeOfCompany,
			String title, String technicalTitleLevel,
			String yearStartedWorking, String annualIncome,
			String accountNumberforSalaryAccount, String bankforSalaryAccount) {
		this.segmentIdentifier = segmentIdentifier;
		this.occupation = occupation;
		this.companyName = companyName;
		this.companyAddress = companyAddress;
		this.postalCodeOfCompanyAddress = postalCodeOfCompanyAddress;
		this.industrialCodeOfCompany = industrialCodeOfCompany;
		this.title = title;
		this.technicalTitleLevel = technicalTitleLevel;
		this.yearStartedWorking = yearStartedWorking;
		this.annualIncome = annualIncome;
		this.accountNumberforSalaryAccount = accountNumberforSalaryAccount;
		this.bankforSalaryAccount = bankforSalaryAccount;
	}

	public String getSegmentIdentifier() {
		return segmentIdentifier;
	}

	public void setSegmentIdentifier(String segmentIdentifier) {
		this.segmentIdentifier = segmentIdentifier;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getPostalCodeOfCompanyAddress() {
		return postalCodeOfCompanyAddress;
	}

	public void setPostalCodeOfCompanyAddress(String postalCodeOfCompanyAddress) {
		this.postalCodeOfCompanyAddress = postalCodeOfCompanyAddress;
	}

	public String getIndustrialCodeOfCompany() {
		return industrialCodeOfCompany;
	}

	public void setIndustrialCodeOfCompany(String industrialCodeOfCompany) {
		this.industrialCodeOfCompany = industrialCodeOfCompany;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTechnicalTitleLevel() {
		return technicalTitleLevel;
	}

	public void setTechnicalTitleLevel(String technicalTitleLevel) {
		this.technicalTitleLevel = technicalTitleLevel;
	}

	public String getYearStartedWorking() {
		return yearStartedWorking;
	}

	public void setYearStartedWorking(String yearStartedWorking) {
		this.yearStartedWorking = yearStartedWorking;
	}

	public String getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(String annualIncome) {
		this.annualIncome = annualIncome;
	}

	public String getAccountNumberforSalaryAccount() {
		return accountNumberforSalaryAccount;
	}

	public void setAccountNumberforSalaryAccount(
			String accountNumberforSalaryAccount) {
		this.accountNumberforSalaryAccount = accountNumberforSalaryAccount;
	}

	public String getBankforSalaryAccount() {
		return bankforSalaryAccount;
	}

	public void setBankforSalaryAccount(String bankforSalaryAccount) {
		this.bankforSalaryAccount = bankforSalaryAccount;
	}

}
