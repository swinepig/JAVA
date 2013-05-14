package com.hengtian.zxjk.entity.message;

import java.util.ArrayList;
import java.util.List;

public class InformationRecord {
	// ������
	private BaseSection baseSection;
	// �����Ϣ��
	private IdentityInfoSection identityInfoSection;
	// ְҵ��Ϣ��
	private ProfessionalInfoSection professionalInfoSection;
	// ��ס��ַ��
	private ResidentialAddressSection residentialAddressSection;
	// ������Ϣ��
	private ArrayList guaranteeInfoSectionList;
	// ���ױ�ʶ�����
	private TransactionChangeSection transactionChangeSection;
	// ���⽻�׶�
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
