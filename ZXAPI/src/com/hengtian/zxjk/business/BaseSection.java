package com.hengtian.zxjk.business;

/**
 * @author xinzhu
 * 
 *         基础段
 * 
 */
public class BaseSection {
	/**
	 * 账户记录长度 长度4
	 * */
	private String recordLength;
	/**
	 * 信息类别 长度1
	 * */
	private String segmentIdentifier;
	/**
	 * 金融机构代码 长度14
	 * */
	private String financialOrganizationCode;
	/**
	 * 业务种类 长度1
	 * */
	private String bussinessType;
	/**
	 * 业务种类细分 长度2
	 * */
	private String accountType;
	/**
	 * 业务号(业务种类为贷款时，此数据项为贷款业务号码) 长度40
	 * */
	private String operationNumber;
	/**
	 * 发生地点 长度6
	 * */
	private String originationPlace;
	/**
	 * 开户日期 长度8
	 * */
	private String dateOpened;
	/**
	 * 到期日期 长度8
	 * */
	private String matureDate;
	/**
	 * 币种 长度3
	 * */
	private String currency;
	/**
	 * 授信额度(业务种类为贷款时，此数据元是指贷款合同金额) 长度10
	 * */
	private String creditLimit;
	/**
	 * 共享授信额度(业务种类为贷款时，‘共享授信额度’填写‘贷款合同金额’) 长度10
	 * */
	private String sharedCreditLimit;
	/**
	 * 最大负债额(业务种类为贷款时，此数据元是指在该项借款协议下的最高贷款余额) 长度10
	 * */
	private String highestCredit;
	/**
	 * 担保方式 长度1
	 * */
	private String guaranteeType;
	/**
	 * 还款频率 长度2
	 * */
	private String termsFrequency;
	/**
	 * 还款月数 长度3
	 * */
	private String termsDuration;
	/**
	 * 剩余还款月数 长度3
	 * */
	private String monthsLeftforTermsDuration;
	/**
	 * 结算/应还款日期 长度8
	 * */
	private String billingDate;
	/**
	 * 最近一次实际还款日期 长度8
	 * */
	private String dateOfLastPayment;
	/**
	 * 本月应还款金额 长度10
	 * */
	private String scheduledMonthlyPaymentAmount;
	/**
	 * 本月实际还款金额 长度10
	 * */
	private String actualPaymentAmount;
	/**
	 * 余额(对于贷款，此数据项是指贷款本金余额) 长度10
	 * */
	private String balance;
	/**
	 * 当前逾期期数 长度2
	 * */
	private String delinquencyTerm;
	/**
	 * 当前逾期总额 长度10
	 * */
	private String amountPastDue;
	/**
	 * 逾期31-60天未归还贷款本金 长度10
	 * */
	private String noRepayLoanPrincipal31_60;
	/**
	 * 逾期61-90天未归还贷款本金 长度10
	 * */
	private String noRepayLoanPrincipal61_90;
	/**
	 * 逾期91-180天未归还贷款本金 长度10
	 * */
	private String noRepayLoanPrincipal91_180;
	/**
	 * 逾期180天以上未归还贷款本金 长度10
	 * */
	private String noRepayLoanPrincipalOver180;
	/**
	 * 累计逾期期数 长度3
	 * */
	private String delinquencyCounts;
	/**
	 * 最高逾期期数 长度2
	 * */
	private String highestDelinquencyTerm;
	/**
	 * 五级分类状态 长度1
	 * */
	private String fiveCategoryAssetsClassification;
	/**
	 * 账户状态 长度1
	 * */
	private String accountStatus;
	/**
	 * 24个月（账户）还款状态 长度24
	 * */
	private String twentyFourMonthsPaymentStatus;
	/**
	 * 透支180天以上未付余额(业务种类细分为准贷记卡时，此数据项有意义) 长度10
	 * */
	private String overdraftAmountOver180Days;
	/**
	 * 账户拥有者信息提示 长度1
	 * */
	private String idIndicator;
	/**
	 * 姓名 长度30
	 * */
	private String name;
	/**
	 * 证件类型 长度1
	 * */
	private String identificationType;
	/**
	 * 证件号码 长度18
	 * */
	private String identificationNumber;
	/**
	 * 预留字段 长度30
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
