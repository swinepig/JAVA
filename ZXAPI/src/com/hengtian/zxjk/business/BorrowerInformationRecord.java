package com.hengtian.zxjk.business;

/**
 * @author xinzhu
 * 
 *         ����˸ſ���Ϣ��¼
 * 
 */
public class BorrowerInformationRecord {

	private BaseSection baseSection;
	private IdentityInfoSection identityInfoSection;

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
}
