package com.arbonkeep.flyweight;
//��վ������

import java.util.HashMap;

public class WebSiteFactory {
	//��һ�������൱�ڳ��Ӵ洢WebSite
	private HashMap<String, WebSite> pool = new HashMap<String, WebSite>();
	
	//������վ�����ͷ���һ����վ�����û�и���վ�ʹ���һ����Ȼ�󷵻�
	
	public WebSite getWebSiteCategory(String type) {
		//���������û�оʹ���һ��Ȼ�󷵻�
		if (!pool.containsKey(type)) {
			pool.put(type, new ConcreteWebSite(type));
		}
		
		
		return (WebSite)pool.get(type);
	}
	
	//��ȡ��վ���������
	public int getWebSiteCount() {
		return pool.size();
	}
}
