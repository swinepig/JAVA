package com.hengtian.zxjk.business;

/**
 * @author xinzhu
 * 
 *         ������
 * 
 */
public class BaseSection {
	/**
	 * �˻���¼���� ����4
	 * */
	private String recordLength;
	/**
	 * ��Ϣ��� ����1
	 * */
	private String segmentIdentifier;
	/**
	 * ���ڻ������� ����14
	 * */
	private String financialOrganizationCode;
	/**
	 * ҵ������ ����1
	 * */
	private String bussinessType;
	/**
	 * ҵ������ϸ�� ����2
	 * */
	private String accountType;
	/**
	 * ҵ���(ҵ������Ϊ����ʱ����������Ϊ����ҵ�����) ����40
	 * */
	private String operationNumber;
	/**
	 * �����ص� ����6
	 * */
	private String originationPlace;
	/**
	 * �������� ����8
	 * */
	private String dateOpened;
	/**
	 * �������� ����8
	 * */
	private String matureDate;
	/**
	 * ���� ����3
	 * */
	private String currency;
	/**
	 * ���Ŷ��(ҵ������Ϊ����ʱ��������Ԫ��ָ�����ͬ���) ����10
	 * */
	private String creditLimit;
	/**
	 * �������Ŷ��(ҵ������Ϊ����ʱ�����������Ŷ�ȡ���д�������ͬ��) ����10
	 * */
	private String sharedCreditLimit;
	/**
	 * ���ծ��(ҵ������Ϊ����ʱ��������Ԫ��ָ�ڸ�����Э���µ���ߴ������) ����10
	 * */
	private String highestCredit;
	/**
	 * ������ʽ ����1
	 * */
	private String guaranteeType;
	/**
	 * ����Ƶ�� ����2
	 * */
	private String termsFrequency;
	/**
	 * �������� ����3
	 * */
	private String termsDuration;
	/**
	 * ʣ�໹������ ����3
	 * */
	private String monthsLeftforTermsDuration;
	/**
	 * ����/Ӧ�������� ����8
	 * */
	private String billingDate;
	/**
	 * ���һ��ʵ�ʻ������� ����8
	 * */
	private String dateOfLastPayment;
	/**
	 * ����Ӧ������ ����10
	 * */
	private String scheduledMonthlyPaymentAmount;
	/**
	 * ����ʵ�ʻ����� ����10
	 * */
	private String actualPaymentAmount;
	/**
	 * ���(���ڴ������������ָ��������) ����10
	 * */
	private String balance;
	/**
	 * ��ǰ�������� ����2
	 * */
	private String delinquencyTerm;
	/**
	 * ��ǰ�����ܶ� ����10
	 * */
	private String amountPastDue;
	/**
	 * ����31-60��δ�黹����� ����10
	 * */
	private String noRepayLoanPrincipal31_60;
	/**
	 * ����61-90��δ�黹����� ����10
	 * */
	private String noRepayLoanPrincipal61_90;
	/**
	 * ����91-180��δ�黹����� ����10
	 * */
	private String noRepayLoanPrincipal91_180;
	/**
	 * ����180������δ�黹����� ����10
	 * */
	private String noRepayLoanPrincipalOver180;
	/**
	 * �ۼ��������� ����3
	 * */
	private String delinquencyCounts;
	/**
	 * ����������� ����2
	 * */
	private String highestDelinquencyTerm;
	/**
	 * �弶����״̬ ����1
	 * */
	private String fiveCategoryAssetsClassification;
	/**
	 * �˻�״̬ ����1
	 * */
	private String accountStatus;
	/**
	 * 24���£��˻�������״̬ ����24
	 * */
	private String twentyFourMonthsPaymentStatus;
	/**
	 * ͸֧180������δ�����(ҵ������ϸ��Ϊ׼���ǿ�ʱ����������������) ����10
	 * */
	private String overdraftAmountOver180Days;
	/**
	 * �˻�ӵ������Ϣ��ʾ ����1
	 * */
	private String idIndicator;
	/**
	 * ���� ����30
	 * */
	private String name;
	/**
	 * ֤������ ����1
	 * */
	private String identificationType;
	/**
	 * ֤������ ����18
	 * */
	private String identificationNumber;
	/**
	 * Ԥ���ֶ� ����30
	 * */
	private String reservedField;

	public String getRecordLength() {
		return recordLength;
	}

	public void setRecordLength(String recordLength) {
		this.recordLength = recordLength;
	}

	public String getSegmentIdentifier() {
		return segmentIdentifier;
	}

	public void setSegmentIdentifier(String segmentIdentifier) {
		this.segmentIdentifier = segmentIdentifier;
	}

	public String getFinancialOrganizationCode() {
		return financialOrganizationCode;
	}

	public void setFinancialOrganizationCode(String financialOrganizationCode) {
		this.financialOrganizationCode = financialOrganizationCode;
	}

	public String getBussinessType() {
		return bussinessType;
	}

	public void setBussinessType(String bussinessType) {
		this.bussinessType = bussinessType;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getOperationNumber() {
		return operationNumber;
	}

	public void setOperationNumber(String operationNumber) {
		this.operationNumber = operationNumber;
	}

	public String getOriginationPlace() {
		return originationPlace;
	}

	public void setOriginationPlace(String originationPlace) {
		this.originationPlace = originationPlace;
	}

	public String getDateOpened() {
		return dateOpened;
	}

	public void setDateOpened(String dateOpened) {
		this.dateOpened = dateOpened;
	}

	public String getMatureDate() {
		return matureDate;
	}

	public void setMatureDate(String matureDate) {
		this.matureDate = matureDate;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(String creditLimit) {
		this.creditLimit = creditLimit;
	}

	public String getSharedCreditLimit() {
		return sharedCreditLimit;
	}

	public void setSharedCreditLimit(String sharedCreditLimit) {
		this.sharedCreditLimit = sharedCreditLimit;
	}

	public String getHighestCredit() {
		return highestCredit;
	}

	public void setHighestCredit(String highestCredit) {
		this.highestCredit = highestCredit;
	}

	public String getGuaranteeType() {
		return guaranteeType;
	}

	public void setGuaranteeType(String guaranteeType) {
		this.guaranteeType = guaranteeType;
	}

	public String getTermsFrequency() {
		return termsFrequency;
	}

	public void setTermsFrequency(String termsFrequency) {
		this.termsFrequency = termsFrequency;
	}

	public String getTermsDuration() {
		return termsDuration;
	}

	public void setTermsDuration(String termsDuration) {
		this.termsDuration = termsDuration;
	}

	public String getMonthsLeftforTermsDuration() {
		return monthsLeftforTermsDuration;
	}

	public void setMonthsLeftforTermsDuration(String monthsLeftforTermsDuration) {
		this.monthsLeftforTermsDuration = monthsLeftforTermsDuration;
	}

	public String getBillingDate() {
		return billingDate;
	}

	public void setBillingDate(String billingDate) {
		this.billingDate = billingDate;
	}

	public String getDateOfLastPayment() {
		return dateOfLastPayment;
	}

	public void setDateOfLastPayment(String dateOfLastPayment) {
		this.dateOfLastPayment = dateOfLastPayment;
	}

	public String getScheduledMonthlyPaymentAmount() {
		return scheduledMonthlyPaymentAmount;
	}

	public void setScheduledMonthlyPaymentAmount(
			String scheduledMonthlyPaymentAmount) {
		this.scheduledMonthlyPaymentAmount = scheduledMonthlyPaymentAmount;
	}

	public String getActualPaymentAmount() {
		return actualPaymentAmount;
	}

	public void setActualPaymentAmount(String actualPaymentAmount) {
		this.actualPaymentAmount = actualPaymentAmount;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getDelinquencyTerm() {
		return delinquencyTerm;
	}

	public void setDelinquencyTerm(String delinquencyTerm) {
		this.delinquencyTerm = delinquencyTerm;
	}

	public String getAmountPastDue() {
		return amountPastDue;
	}

	public void setAmountPastDue(String amountPastDue) {
		this.amountPastDue = amountPastDue;
	}

	public String getNoRepayLoanPrincipal31_60() {
		return noRepayLoanPrincipal31_60;
	}

	public void setNoRepayLoanPrincipal31_60(String noRepayLoanPrincipal31_60) {
		this.noRepayLoanPrincipal31_60 = noRepayLoanPrincipal31_60;
	}

	public String getNoRepayLoanPrincipal61_90() {
		return noRepayLoanPrincipal61_90;
	}

	public void setNoRepayLoanPrincipal61_90(String noRepayLoanPrincipal61_90) {
		this.noRepayLoanPrincipal61_90 = noRepayLoanPrincipal61_90;
	}

	public String getNoRepayLoanPrincipal91_180() {
		return noRepayLoanPrincipal91_180;
	}

	public void setNoRepayLoanPrincipal91_180(String noRepayLoanPrincipal91_180) {
		this.noRepayLoanPrincipal91_180 = noRepayLoanPrincipal91_180;
	}

	public String getNoRepayLoanPrincipalOver180() {
		return noRepayLoanPrincipalOver180;
	}

	public void setNoRepayLoanPrincipalOver180(
			String noRepayLoanPrincipalOver180) {
		this.noRepayLoanPrincipalOver180 = noRepayLoanPrincipalOver180;
	}

	public String getDelinquencyCounts() {
		return delinquencyCounts;
	}

	public void setDelinquencyCounts(String delinquencyCounts) {
		this.delinquencyCounts = delinquencyCounts;
	}

	public String getHighestDelinquencyTerm() {
		return highestDelinquencyTerm;
	}

	public void setHighestDelinquencyTerm(String highestDelinquencyTerm) {
		this.highestDelinquencyTerm = highestDelinquencyTerm;
	}

	public String getFiveCategoryAssetsClassification() {
		return fiveCategoryAssetsClassification;
	}

	public void setFiveCategoryAssetsClassification(
			String fiveCategoryAssetsClassification) {
		this.fiveCategoryAssetsClassification = fiveCategoryAssetsClassification;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public String getTwentyFourMonthsPaymentStatus() {
		return twentyFourMonthsPaymentStatus;
	}

	public void setTwentyFourMonthsPaymentStatus(
			String twentyFourMonthsPaymentStatus) {
		this.twentyFourMonthsPaymentStatus = twentyFourMonthsPaymentStatus;
	}

	public String getOverdraftAmountOver180Days() {
		return overdraftAmountOver180Days;
	}

	public void setOverdraftAmountOver180Days(String overdraftAmountOver180Days) {
		this.overdraftAmountOver180Days = overdraftAmountOver180Days;
	}

	public String getIdIndicator() {
		return idIndicator;
	}

	public void setIdIndicator(String idIndicator) {
		this.idIndicator = idIndicator;
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

	public String getReservedField() {
		return reservedField;
	}

	public void setReservedField(String reservedField) {
		this.reservedField = reservedField;
	}
}
