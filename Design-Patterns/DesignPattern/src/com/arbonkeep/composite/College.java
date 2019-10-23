package com.arbonkeep.composite;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent{
	List<OrganizationComponent> list = new ArrayList<OrganizationComponent>();
	
	//���췽��
	public College(String name, String desc) {
		super(name, desc);
		
	}
	
	//add
	//��Ҫע����ǽ���ʵ��ҵ���У�College��add��University�е�add������ȫһ����
	@Override
	public void add(OrganizationComponent oc) {
		list.add(oc);
	}
	
	//remove
	@Override
	public void remove(OrganizationComponent oc) {
		list.remove(oc);
	}
	
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
		System.out.println("-------------" + getName() + "--------------");
		
		for (OrganizationComponent organizationComponent : list) {
			organizationComponent.print();
		}
		
	}

}
