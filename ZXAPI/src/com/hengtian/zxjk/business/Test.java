package com.hengtian.zxjk.business;

import java.util.ArrayList;


public class Test {

	/**
	 * @param args
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		// xml ��ʼ��
		EnterpriseZXMsgProcessor rx = new EnterpriseZXMsgProcessor();
		rx.init();

		// ����
		BorrowerInformationMessageSet borrowerInformationMessageSet = new BorrowerInformationMessageSet();
		BorrowerInformationMessage borrowerInformationMessage = new BorrowerInformationMessage();
		BorrowerInformationMessageHead msg = new BorrowerInformationMessageHead();
		BorrowerInformationMessageName nameMsg = new BorrowerInformationMessageName();
		BorrowerInformationMessageBody bodyMessage = new BorrowerInformationMessageBody();
		BorrowerInformationMessageTail messageTail = new BorrowerInformationMessageTail();
		borrowerInformationMessage.setMessageHead(msg);
		borrowerInformationMessage.setMessageName(nameMsg);
		borrowerInformationMessage.setBorrowerInformationMessageBody(bodyMessage);
		borrowerInformationMessage.setMessageTail(messageTail);
		borrowerInformationMessageSet.setBorrowerInformationMessage(borrowerInformationMessage);
		borrowerInformationMessageSet.setBorrowerInformationMessage2(borrowerInformationMessage);
		
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
		
		//����β
		messageTail.setFinancialOrganizationCode("BCH1088000004");
		messageTail.setMessageRiseTime("201203");
		messageTail.setFlowNum1("00A");
		messageTail.setReportType("1");
		messageTail.setFlowNum2("00B");
		

		// ������
		BorrowerInformationType borrowerInformationType=new BorrowerInformationType();
		ArrayList informationRecordList = new ArrayList();
		BorrowerInformationRecord informationRecord = new BorrowerInformationRecord();
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


		informationRecord.setBaseSection(baseSection);
		informationRecord.setIdentityInfoSection(identityInfoSection);
		informationRecordList.add(informationRecord);
		informationRecordList.add(informationRecord);
		borrowerInformationType.setInformationRecordList(informationRecordList);
		bodyMessage.setBorrowerInformationType(borrowerInformationType);

		// ����
//		Object obj =rx.parseTxtToObject("BCH1088000004 20120300A100B");
		// �ٱ���
		rx.parseObjectToTxt(borrowerInformationMessageSet);
		//rx.parseObjectToTxt(borrowerInformationMessageSet);
	}

}
