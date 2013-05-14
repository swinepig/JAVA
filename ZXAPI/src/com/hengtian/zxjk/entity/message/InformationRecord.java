package com.hengtian.zxjk.entity.message;

import java.util.ArrayList;
import java.util.List;

public class InformationRecord {
	// 基础段
	private BaseSection baseSection;
	// 身份信息段
	private IdentityInfoSection identityInfoSection;
	// 职业信息段
	private ProfessionalInfoSection professionalInfoSection;
	// 居住地址段
	private ResidentialAddressSection residentialAddressSection;
	// 担保信息段
	private ArrayList guaranteeInfoSectionList;
	// 交易标识变更段
	private TransactionChangeSection transactionChangeSection;
	// 特殊交易段
	private SpecialTradeSection specialTradeSection;

	public BaseSection getBaseSection() {
		return baseSection;
	}

	public void setBaseSection(BaseSection baseSection) {
		this.baseSection = baseSection;
	}

	public IdentityInfoSection getIdentityInfoSection() {
		return identityInfoSection;
	}

	public void setIdentityInfoSection(IdentityInfoSection identityInfoSection) {
		this.identityInfoSection = identityInfoSection;
	}

	public ProfessionalInfoSection getProfessionalInfoSection() {
		return professionalInfoSection;
	}

	public void setProfessionalInfoSection(
			ProfessionalInfoSection professionalInfoSection) {
		this.professionalInfoSection = professionalInfoSection;
	}

	public ResidentialAddressSection getResidentialAddressSection() {
		return residentialAddressSection;
	}

	public void setResidentialAddressSection(
			ResidentialAddressSection residentialAddressSection) {
		this.residentialAddressSection = residentialAddressSection;
	}

	public ArrayList getGuaranteeInfoSectionList() {
		return guaranteeInfoSectionList;
	}

	public void setGuaranteeInfoSectionList(ArrayList guaranteeInfoSectionList) {
		this.guaranteeInfoSectionList = guaranteeInfoSectionList;
	}

	public TransactionChangeSection getTransactionChangeSection() {
		return transactionChangeSection;
	}

	public void setTransactionChangeSection(
			TransactionChangeSection transactionChangeSection) {
		this.transactionChangeSection = transactionChangeSection;
	}

	public SpecialTradeSection getSpecialTradeSection() {
		return specialTradeSection;
	}

	public void setSpecialTradeSection(SpecialTradeSection specialTradeSection) {
		this.specialTradeSection = specialTradeSection;
	}
}
