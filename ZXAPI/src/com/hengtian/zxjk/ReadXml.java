package com.hengtian.zxjk;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;


public class ReadXml {
	private static HashMap<String, ZxFormat> map = new HashMap<String, ZxFormat>();
	// ��txt�ı���ȡ�ı�����
	private List<String> lines;
	// ��ǰ���ĵ�����(�������޸ģ�ɾ��)
	private ZxFormat curZxFormat = null;
	// ������format arrayList
	private List<String> guaranteelines;
	private String newStr = "cfg/dom.xml";
	private String KONG = "                                                       ";
	private String LING = "0000000000000000000000000000000000000000000000000000000";
	private String temp = "";
	private File file;

	@SuppressWarnings("unchecked")
	public void init() {
		Document document = null;
		SAXReader saxReader = new SAXReader();
		try {
			document = saxReader.read(new File(newStr));
			Element root = document.getRootElement();
			ZxMsgFormats zxMsgFormats = new ZxMsgFormats();
			List<ZxFormat> formatList = new ArrayList<ZxFormat>();

			for (Iterator<Element> i = root.elementIterator(); i.hasNext();) {
				Element el = (Element) i.next();
				ZxFormat zxFormat = new ZxFormat();
				List<ZxNode> children = new ArrayList<ZxNode>();
				zxFormat.setClassName((el.attributeValue("class")));
				if (el.attribute("type") != null) {
					zxFormat.setType(el.attributeValue("type"));
				}
				if (el.attribute("bottom") != null) {
					zxFormat.setBottom(el.attributeValue("bottom"));
				}
				if (el.attributeValue("messageType") != null)
					zxFormat.setMessageType(el.attributeValue("messageType"));

				for (Iterator<Element> j = el.elementIterator(); j.hasNext();) {
					Element ele = (Element) j.next();
					ZxNode zxNode = new ZxNode();
					zxNode.setPropertyName(ele.attributeValue("propertyName"));
					if (ele.attributeValue("length") != null)
						zxNode.setLength(Integer.parseInt(ele
								.attributeValue("length")));
					if (ele.attributeValue("type") != null)
						zxNode.setType(ele.attributeValue("type"));
					if (ele.attributeValue("class") != null)
						zxNode.setClassName(ele.attributeValue("class"));
					if (ele.attributeValue("state") != null)
						zxNode.setState(ele.attributeValue("state"));
					children.add(zxNode);
				}
				zxFormat.setChildren(children);
				map.put(el.attributeValue("class"), zxFormat);
				formatList.add(zxFormat);
			}
			zxMsgFormats.setFormatList(formatList);
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * ����className�ַ�����ȡZxFormat
	 * @param className
	 * @return
	 */
	private ZxFormat getZxFormatByClassName(String className) {
		return map.containsKey(className) ? map.get(className) : null;
	}

	private ZxFormat getFormatByType(String type) {
		for (ZxFormat zxFormat : map.values()) {
			if (zxFormat.getType() != null && zxFormat.getType().equals(type)) {
				return zxFormat;
			}
		}
		return null;
	}

	/**
	 * �����ϴ�
	 * @param  obj
	 * @return
	 */
	@SuppressWarnings("unchecked")
	private String parseObjectToString(Object obj) throws Exception {
		if (null != obj) {
			Class<?> c = obj.getClass();
			StringBuffer sb = new StringBuffer();
			ZxFormat zxFormat = getZxFormatByClassName(c.getName());
			if (zxFormat == null) {
				return "";
			}
			String bottom = zxFormat.getBottom();
			for (ZxNode zxNode : zxFormat.getChildren()) {
				Method propertyNameMethod = c.getMethod("get"
						+ zxNode.getPropertyName());
				int length = zxNode.getLength();
				String state = zxNode.getState();
				Object getObj = propertyNameMethod.invoke(obj);

				if (null == getObj) {
					// ��ʾ��ײ�����ԣ����Ϊ��ѡ"M",����Ҫ����type��"0"��"�ո�"
					if (bottom != null) {
						// state=="O",��ʾ��ѡ������ΪNull�����ÿո����
						if (state.toUpperCase().equals("O")) {
							if (KONG.length() > length)
								sb.append(KONG.substring(0, length));
							else {
								sb.append(KONG.substring(0, length));
								for (int i = 0; i < length - KONG.length(); i++) {
									sb.append(" ");
								}
							}
						} else if (state.toUpperCase().equals("M")) {
							throw new Exception(c.getName() + "������:"
									+ zxNode.getPropertyName() + "Ϊ��ѡ���ԣ����븳ֵ");
						} else {
							throw new Exception("dom.xml������δ֪����state��λ��"
									+ c.getName() + "������:"
									+ zxNode.getPropertyName());
						}
					}
					// ���������ײ�
					else {
						if (state.toUpperCase().equals("M")) {
							throw new Exception(zxNode.getPropertyName()
									+ "Ϊ��ѡ�����븳ֵ");
						} else if (state.toUpperCase().equals("C")) {
							sb.append("");
						} else {
							throw new Exception(zxNode.getPropertyName()
									+ "״̬���ô���");
						}
					}
				} else {
					// ��Ϣ��¼�򵣱���(list)����12aabbcc
					if (getObj instanceof List) {
						List<Object> list = (List<Object>) getObj;
						for (Object object : list) {
							String tempResult = parseObjectToString(object);
							processResult(tempResult, sb, zxNode, object, c);
						}
					}
					// ��list����
					else {
						String tempResult = parseObjectToString(getObj);
						processResult(tempResult, sb, zxNode, getObj, c);
					}
				}
			}
			return sb.toString();
		}
		return "";
	}

	private void processResult(String tempResult, StringBuffer sb,
			ZxNode zxNode, Object obj, Class<?> c) throws Exception {
		int length = zxNode.getLength();
		String type = zxNode.getType();
		// ���tempResult=="",˵����ת������һ��String���͵����ԡ�������Ҫ����Щ����ƴ���������ظ���һ�㡣
		if (tempResult.equals("")) {
			int getLength = obj.toString().length();
			if (getLength > length) {
				throw new Exception(c.getName() + "������:"
						+ zxNode.getPropertyName() + "����ܳ���" + length);
			} else {
				int l = length - getLength;
				if (type.equals("AN") || type.equals("ANC")) {
					sb.append(obj.toString());
					if (KONG.length() > l)
						sb.append(KONG.substring(0, l));
					else {
						sb.append(KONG.substring(0, KONG.length()));
						for (int i = 0; i < l - KONG.length(); i++) {
							sb.append(" ");
						}
					}
				} else if (type.equals("N")) {
					if (KONG.length() > l)
						sb.append(LING.substring(0, l));
					else {
						sb.append(LING.substring(0, l));
						for (int i = 0; i < l - LING.length(); i++) {
							sb.append("0");
						}
					}
					sb.append(obj.toString());
				} else {
					throw new Exception("dom.xml������δ֪����type��λ��" + c.getName()
							+ "������:" + zxNode.getPropertyName());
				}
			}
		}
		// ��tempResult!=""ʱ��˵�����ַ�����ת������ַ�����
		// ���Ҵ�ʱ����Ĳ���obj�����Ǳ�ת����ԭʼobj
		else {
			String foramtType = getZxFormatByClassName(obj.getClass().getName()).getType();
			// ��ת����objΪ����������
			if (foramtType != null && foramtType.equals("1")) {
				// ���������ļ�
				file = new File("D:\\֤��\\" + tempResult + ".txt");
				if (!file.exists()) {
					file.createNewFile();
				}
			} else {
				sb.append(tempResult);
				// �����ת����objΪ����ͷ����
				if (foramtType != null && foramtType.equals("2")) {
					sb.append("\r\n");
					sb.append("\r\n");
				}
				// �����ת����objΪ��Ϣ��¼����
				if (foramtType != null && foramtType.equals("4")) {
					sb.append("\r\n");
				}
			}
		}
	}

	private void parseStringToObject(Class<?> c, Object retObj)
			throws Exception, IllegalAccessException {
		ZxFormat zxFormat = null;
		zxFormat = getZxFormatByClassName(c.getName());
		//�����������������ArrayList,�������zxFormat���и�ֵ
		//������
		if (retObj instanceof ArrayList) {
			setBody(c, retObj, zxFormat);
		} else {
			//ͨ��zxFormat��retObj����Set
			setValueToObject(zxFormat, retObj);
		}
	}
	/**
	 * ��ȡ����zxFormat��ֵ,ʹ�÷�������ҵ��ʵ�������ֵ
	 */
	private void setValueToObject(ZxFormat zxFormat, Object retObj)
			throws InstantiationException, Exception {
		Class<?> c = retObj.getClass();
		for (int i = 0; i < zxFormat.getChildren().size(); i++) {
			Class<?>[] parameterTypes = new Class[1];
			Class<?> parameterType = null;
			Method propertyNameMethod = null;
			String className = zxFormat.getChildren().get(i).getClassName();
			//className�������NUll����Ϊ��ײ�
			if (className != null) {
				// ����Ǳ�����format
				if (zxFormat.getType() != null
						&& zxFormat.getType().equals("3")) {
					parameterType = ArrayList.class;
					Object paramObj = parameterType.newInstance();
					parameterTypes[0] = parameterType;
					propertyNameMethod = c.getMethod("set"
							+ zxFormat.getChildren().get(i).getPropertyName(),
							parameterTypes);
					propertyNameMethod.invoke(retObj, paramObj);
					parseStringToObject(Class.forName(zxFormat.getChildren()
							.get(0).getClassName()), paramObj);
				}
				// ����ǵ�����format
				else if ((temp = getZxFormatByClassName(
						zxFormat.getChildren().get(i).getClassName()).getType()) != null
						&& temp.equals("E")) {
					parameterType = ArrayList.class;
					Object paramObj = parameterType.newInstance();
					parameterTypes[0] = parameterType;
					propertyNameMethod = c.getMethod("set"
							+ zxFormat.getChildren().get(i).getPropertyName(),
							parameterTypes);
					propertyNameMethod.invoke(retObj, paramObj);
					parseStringToObject(Class.forName(zxFormat.getChildren()
							.get(i).getClassName()), paramObj);
				} else {
					parameterType = Class.forName(className);
					Object paramObj = parameterType.newInstance();

					parameterTypes[0] = parameterType;
					propertyNameMethod = c.getMethod("set"
							+ zxFormat.getChildren().get(i).getPropertyName(),
							parameterTypes);
					propertyNameMethod.invoke(retObj, paramObj);
					parseStringToObject(parameterType, paramObj);
				}
			} else {
				String type = zxFormat.getChildren().get(i).getType();
				if (type != null) {
					parameterType = String.class;
					parameterTypes[0] = parameterType;
					String propertyName = zxFormat.getChildren().get(i)
							.getPropertyName();
					String tempMethod = "set" + propertyName;

					propertyNameMethod = c
							.getMethod(tempMethod, parameterTypes);
					propertyNameMethod.invoke(retObj, zxFormat.getChildren()
							.get(i).getValue());
					zxFormat.getChildren().get(i).setValue(null);
				}
			}
		}
	}

	/**
	 * ��ȡtxt��������
	 */
	public Object parseTxtToObject(String nameMessage) {
		for (ZxFormat zxFormat : map.values()) {
			if (zxFormat.getMessageType() != null
					&& zxFormat.getMessageType() != null
					&& zxFormat.getClassName() != null) {
				String temMsgType = zxFormat.getMessageType();
				String[] temMsgs = temMsgType.split("-");
				// ���������ж�
				if (nameMessage.length() == Integer.valueOf(temMsgs[2])) {
					if (nameMessage.substring(Integer.valueOf(temMsgs[0]) - 1,
							Integer.valueOf(temMsgs[0])).equals(temMsgs[1])) {
						curZxFormat = zxFormat;
					}
				}
			}
		}
		// ��ȡ�ļ�����
		File file = new File("D:\\֤��\\" + nameMessage + ".txt");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		}
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(file));
			String line;
			int readCount = 0;
			lines = new ArrayList<String>();
			String firstLine = "";
			while ((line = br.readLine()) != null) {
				if (readCount == 0)
					firstLine = line;
				else if (readCount >= 2)
					lines.add(line);
				readCount++;
			}
			br.close();

			// ��ֵ
			if (curZxFormat != null) {
				Class<?> c = Class.forName(curZxFormat.getClassName());
				Object obj = c.newInstance();
				// ��������ֵ
				// �������������Children��һ��
				ZxFormat zxFormatName = getZxFormatByClassName(curZxFormat.getChildren()
						.get(0).getClassName());
				int beginOneName = 0;
				for (ZxNode zxNode : zxFormatName.getChildren()) {
					zxNode.setValue(nameMessage.substring(beginOneName,
							beginOneName + zxNode.getLength()));
					beginOneName += zxNode.getLength();
				}
				// ����ͷ��ֵ
				// ����ͷ�������Children�ڶ���
				ZxFormat zxFormatHead = getZxFormatByClassName(curZxFormat.getChildren()
						.get(1).getClassName());
				int beginOneHead = 0;
				for (ZxNode zxNode : zxFormatHead.getChildren()) {
					zxNode.setValue(firstLine.substring(beginOneHead,
							beginOneHead + zxNode.getLength()));
					beginOneHead += zxNode.getLength();
				}
				// �����帳ֵ,ͨ��lines�����ж������������壬��������������
				if (lines.size() <= 1) {
					// ������������Children������
					ZxFormat zxFormatBody = getZxFormatByClassName(curZxFormat.getChildren()
							.get(2).getClassName());
					int beginOneBody = 0;
					for (ZxNode zxNode : zxFormatBody.getChildren()) {
						zxNode.setValue(lines.get(0).substring(beginOneBody,
								beginOneBody + zxNode.getLength()));
						beginOneBody += zxNode.getLength();
					}
				} 
				// ��������������壬�����帳ֵ�ں����ڲ�
				parseStringToObject(c, obj);
				return obj;
			}
			return null;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 *  ��ȡtxt�ļ���������zxFormat���и�ֵ��Ȼ���ȡ����zxFormat��ֵ,ʹ�÷�������ҵ��ʵ�������ֵ
	 */
	@SuppressWarnings("unchecked")
	private void setBody(Class<?> c, Object retObj, ZxFormat zxFormat)
			throws Exception {
		// ������
		if (null != zxFormat.getType() && "E".equals(zxFormat.getType())) {
			for (String guaranteeInfo : guaranteelines) {
				int beginOneBody = 0;
				if (zxFormat != null) {
					for (ZxNode zxNode : zxFormat.getChildren()) {
						zxNode.setValue(guaranteeInfo.substring(beginOneBody,
								beginOneBody + zxNode.getLength()));
						beginOneBody += zxNode.getLength();
					}
				}
				//����������Ϣ
				Object obj = c.newInstance();
				((ArrayList) retObj).add(obj);
				setValueToObject(zxFormat, obj);
			}
		} else if (null != zxFormat.getType() && "4".equals(zxFormat.getType())) {
			for (String infoLine : lines) {
				guaranteelines = new ArrayList<String>();
				int beginOneBody = 0;
				// ������
				for (ZxNode zxNodeBottom : getFormatByType("A").getChildren()) {
					zxNodeBottom.setValue(infoLine.substring(beginOneBody,
							beginOneBody + zxNodeBottom.getLength()));
					beginOneBody += zxNodeBottom.getLength();
				}
				// ������
				String type = null;
				while (beginOneBody <= (infoLine.length() - 1)) {
					type = infoLine.substring(beginOneBody, beginOneBody + 1);
					if ("E".equals(type)) {
						int startPoint = beginOneBody;
						ZxFormat zxFormatBottom = getFormatByType(type);
						if (zxFormatBottom != null) {
							for (ZxNode zxNodeBottom : zxFormatBottom
									.getChildren()) {
								beginOneBody += zxNodeBottom.getLength();
							}
						}
						String guaranteeInfo = infoLine.substring(startPoint,
								beginOneBody);
						guaranteelines.add(guaranteeInfo);
					} else {
						ZxFormat zxFormatBottom = getFormatByType(type);
						if (zxFormatBottom != null) {
							for (ZxNode zxNodeBottom : zxFormatBottom
									.getChildren()) {
								zxNodeBottom.setValue(infoLine.substring(
										beginOneBody, beginOneBody
												+ zxNodeBottom.getLength()));
								beginOneBody += zxNodeBottom.getLength();
							}
						}
					}
				}
				// ������Ϣ��¼
				Object obj = c.newInstance();
				((ArrayList) retObj).add(obj);
				setValueToObject(zxFormat, obj);
			}
		}
	}

	/**
	 * ��������Txt�ļ�
	 * @param obj
	 */
	public void parseObjectToTxt(Object obj) {

		try {
			String txt = parseObjectToString(obj);
			System.out.println(txt);
			// ����д��
			PrintWriter pw = new PrintWriter(file);
			pw.print(txt);
			pw.flush();
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
