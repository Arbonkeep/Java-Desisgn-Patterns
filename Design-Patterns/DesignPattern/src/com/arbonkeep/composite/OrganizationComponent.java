package com.arbonkeep.composite;

public abstract class OrganizationComponent {
	private String name;//����
	
	private String desc;//����
	
	public void add(OrganizationComponent oc) {
		//Ĭ��ʵ��
		throw new UnsupportedOperationException("error");
	}
	
	public void remove(OrganizationComponent oc) {
		//Ĭ��ʵ��
		throw new UnsupportedOperationException("error");
	}

	//�ṩ���췽��
	public OrganizationComponent(String name, String desc) {
		super();
		this.name = name;
		this.desc = desc;
	}
	
	//�ṩset��get����
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	//print����
	public abstract void print();
	
	
	

}
