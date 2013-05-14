package com.hengtian.zxjk;

import java.util.ArrayList;

import com.hengtian.zxjk.entity.message.BaseSection;
import com.hengtian.zxjk.entity.message.BodyNormalMessage;
import com.hengtian.zxjk.entity.message.GuaranteeInfoSection;
import com.hengtian.zxjk.entity.message.HeadNormalMessage;
import com.hengtian.zxjk.entity.message.IdentityInfoSection;
import com.hengtian.zxjk.entity.message.InformationRecord;
import com.hengtian.zxjk.entity.message.NameNormalMessage;
import com.hengtian.zxjk.entity.message.NormalMessage;
import com.hengtian.zxjk.entity.message.ProfessionalInfoSection;
import com.hengtian.zxjk.entity.message.ResidentialAddressSection;
import com.hengtian.zxjk.entity.message.RetBodyNormalMessage;
import com.hengtian.zxjk.entity.message.RetHeadNormalMessage;
import com.hengtian.zxjk.entity.message.RetNameNormalMessage;
import com.hengtian.zxjk.entity.message.RetNormalMessage;
import com.hengtian.zxjk.entity.message.SpecialTradeSection;
import com.hengtian.zxjk.entity.message.TransactionChangeSection;

public class Test {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// xml ��ʼ��
		ReadXml rx = new ReadXml();
		rx.init();

		// ����
		NormalMessage normaLMessage = new NormalMessage();
		HeadNormalMessage msg = new HeadNormalMessage();
		NameNormalMessage nameMsg = new NameNormalMessage();
		BodyNormalMessage bodyMessage = new BodyNormalMessage();
		normaLMessage.setHeadMessage(msg);
		normaLMessage.setNameMessage(nameMsg);
		normaLMessage.setBodyMessage(bodyMessage);
		// ����ͷ
		msg.setDataFormatVersionNumber("1.3");
		msg.setFinancialOrganizationCode("BCH1088000004");
		msg.setMessageRiseTime("20120303");
		msg.setSoftwareVersionNumber("1.2");
		msg.setRetransmissionIndicator("1");
		msg.setReportType("1");
		msg.setTotalBaseRecords("a111111a");
		msg.setEarliestBillingDate("b111111b");
		msg.setLatestBillingDate("c111111c");
		msg.setContactPerson("d11111111d");
		msg.setContactTelephone("e111111e");
		msg.setReservedField("    f");

		// ������
		nameMsg.setFinancialOrganizationCode("BCH1088000004");
		nameMsg.setMessageRiseTime("201203");
		nameMsg.setFlowNum1("00A");
		nameMsg.setReportType("1");
		nameMsg.setFlowNum2("00B");

		// ������
		ArrayList informationRecordList = new ArrayList();
		InformationRecord informationRecord = new InformationRecord();
		// ������
		BaseSection baseSection = new BaseSection();
		baseSection.setRecordLength("2000");
		baseSection.setSegmentIdentifier("A");
		baseSection.setFinancialOrganizationCode("B10111000H0001");
		// �����Ϣ��
		IdentityInfoSection identityInfoSection = new IdentityInfoSection();
		identityInfoSection.setDateOfBirth("19701125");
		identityInfoSection.setGender("1");
		identityInfoSection.setMaritalStatus("10");
		identityInfoSection.setSegmentIdentifier("B");

		// ְҵ��Ϣ��
		ProfessionalInfoSection professionalInfoSection = new ProfessionalInfoSection();
		professionalInfoSection.setAccountNumberforSalaryAccount("45698");
		professionalInfoSection.setAnnualIncome("100000");
		professionalInfoSection.setBankforSalaryAccount("1021000568");
		professionalInfoSection.setCompanyAddress("���������������ڴ��35��");
		professionalInfoSection.setCompanyName("�����й������������");
		professionalInfoSection.setIndustrialCodeOfCompany("S");
		professionalInfoSection.setOccupation("1");
		professionalInfoSection.setPostalCodeOfCompanyAddress("100140");
		professionalInfoSection.setSegmentIdentifier("C");
		professionalInfoSection.setTechnicalTitleLevel("2");
		professionalInfoSection.setTitle("2");
		professionalInfoSection.setYearStartedWorking("1999");

		// ��ס��ַ��
		ResidentialAddressSection residentialAddressSection = new ResidentialAddressSection();
		residentialAddressSection.setCurrentAddress("�����к��������·178���Ǻ�С��48��¥908");
		residentialAddressSection.setPostalCodeOfCurrentAddress("100456");
		residentialAddressSection.setResidenceStatus("1");
		residentialAddressSection.setSegmentIdentifier("D");

		// ������Ϣ��
		ArrayList guaranteeInfoSectionList = new ArrayList();
		GuaranteeInfoSection guaranteeInfoSection1 = new GuaranteeInfoSection();
		guaranteeInfoSection1.setGuaranteedAmount("60000");
		guaranteeInfoSection1.setGuranteeSelection("1");
		guaranteeInfoSection1.setIdentificationNumber("100012198401210315");
		guaranteeInfoSection1.setIdentificationType("0");
		guaranteeInfoSection1.setName("����");
		guaranteeInfoSection1.setSegmentIdentifier("E");
		GuaranteeInfoSection guaranteeInfoSection2 = new GuaranteeInfoSection();
		guaranteeInfoSection2.setGuaranteedAmount("60001");
		guaranteeInfoSection2.setGuranteeSelection("2");
		guaranteeInfoSection2.setIdentificationNumber("200012198401210315");
		guaranteeInfoSection2.setIdentificationType("1");
		guaranteeInfoSection2.setName("����1");
		guaranteeInfoSection2.setSegmentIdentifier("E");
		guaranteeInfoSectionList.add(guaranteeInfoSection1);
		guaranteeInfoSectionList.add(guaranteeInfoSection2);
		// ���ױ�ʶ�����
		TransactionChangeSection transactionChangeSection = new TransactionChangeSection();
		transactionChangeSection.setBillingDate("20120924");
		transactionChangeSection.setFinancialOrganizationCode("BCH1088000004");
		transactionChangeSection
				.setOperationNumber("212200312021548123165432165");
		transactionChangeSection.setSegmentIdentifier("F");

		// ���⽻�׶�
		SpecialTradeSection specialTradeSection = new SpecialTradeSection();
		specialTradeSection.setSegmentIdentifier("G");
		specialTradeSection.setSpecialTransactionType("1");
		specialTradeSection.setSpecialDate("20120924");
		specialTradeSection.setChangingTerms("+612");
		specialTradeSection.setSpecialAmount("10000000");
		specialTradeSection.setDetailedInformation("��ϸ��Ϣ");

		informationRecord.setBaseSection(baseSection);
		informationRecord.setGuaranteeInfoSectionList(guaranteeInfoSectionList);
		informationRecord.setIdentityInfoSection(identityInfoSection);
		informationRecord.setProfessionalInfoSection(professionalInfoSection);
		informationRecord
				.setResidentialAddressSection(residentialAddressSection);
		informationRecord.setSpecialTradeSection(specialTradeSection);
		informationRecord.setTransactionChangeSection(transactionChangeSection);
		informationRecordList.add(informationRecord);
		informationRecordList.add(informationRecord);
		bodyMessage.setInformationRecordList(informationRecordList);

		// ����
//		Object obj =rx.parseTxtToObject("BCH1088000004 20120300A100B");
//		// �ٱ���
//		rx.parseObjectToTxt(obj);
		
		
		
		
		RetNormalMessage retNormaLMessage = new RetNormalMessage();
		RetHeadNormalMessage retHeadNormalMessage = new RetHeadNormalMessage();
		RetNameNormalMessage retNameNormalMessage = new RetNameNormalMessage();
		RetBodyNormalMessage retBodyNormalMessage = new RetBodyNormalMessage();
		retNormaLMessage.setHeadMessage(retHeadNormalMessage);
		retNormaLMessage.setNameMessage(retNameNormalMessage);
		retNormaLMessage.setBodyMessage(retBodyNormalMessage);

		// ������������ͷ
		retHeadNormalMessage.setDataFormatVersionNumber("1.3");
		retHeadNormalMessage.setFinancialOrganizationCode("BCH1088000004");
		retHeadNormalMessage.setMessageRiseTime("201203");
		retHeadNormalMessage.setSrcNameMessage("1.2");
		retHeadNormalMessage.setErrorNameMessage("1");
		retHeadNormalMessage.setTotalBaseRecords("a111111a");
		retHeadNormalMessage.setErrorReason("b111111b");
		retHeadNormalMessage.setReportType("1");
		retHeadNormalMessage.setContactPerson("d11111111d");
		retHeadNormalMessage.setContactTelephone("e111111e");
		retHeadNormalMessage.setReservedField("    f");

		// ��������������
		retNameNormalMessage.setFinancialOrganizationCode("BCH1088000004");
		retNameNormalMessage.setMessageRiseTime("201203");
		retNameNormalMessage.setFlowNum1("00A");
		retNameNormalMessage.setReportType("1");
		retNameNormalMessage.setFlowNum2("00B");
		retNameNormalMessage.setIdentifierBit("1");
		// ��������������
		retBodyNormalMessage.setErrorNameMessage("errorNameMessage");
		retBodyNormalMessage.setErrorReasionInfo("errorReasionInfo");
		retBodyNormalMessage.setErrorUserHistory("errorUserHistory");
//		rx.parseObjectToTxt(retNormaLMessage);
		Object obj =rx.parseTxtToObject("BCH1088000004 20120300A100B1");
		// �ٱ���
		rx.parseObjectToTxt(obj);
	}

}
