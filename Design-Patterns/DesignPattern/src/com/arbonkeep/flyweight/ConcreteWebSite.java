package com.arbonkeep.flyweight;

public class ConcreteWebSite extends WebSite {
	private String type = "";//��վ������
	
	public ConcreteWebSite(String type) {
		this.type = type;
	}
	
	@Override
	public void use(User user) {
		System.out.println("��վ��" + type + "����ʽ������ʹ������" + user.getName());
	}

}
