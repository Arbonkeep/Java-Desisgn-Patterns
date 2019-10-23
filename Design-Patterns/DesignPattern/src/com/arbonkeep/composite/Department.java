package com.arbonkeep.composite;

public class Department extends OrganizationComponent{
	//���ڱ����ڴ�ѧ�����ϵ�����νṹ����һ��Ҷ�ӽڵ����Բ���Ҫ������������Ԫ��
	//���Բ���Ҫ����list

	public Department(String name, String desc) {
		super(name, desc);	
	}
	
	//ͬ��add��remove����Ҳ����Ҫ��д
	
	@Override
	public String getName() {
		return super.getName();
	}

	@Override
	public String getDesc() {
		return super.getDesc();
	}


	@Override
	public void print() {
		System.out.println(getName());
	}

}
