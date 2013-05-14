package com.hengtian.zxjk.business;

/**
 * @author xinzhu
 * 
 *         借款人概况信息记录
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
