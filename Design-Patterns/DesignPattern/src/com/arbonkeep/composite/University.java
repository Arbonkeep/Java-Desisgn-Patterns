package com.arbonkeep.composite;


import java.util.ArrayList;
import java.util.List;

public class University extends OrganizationComponent {
	//�������ϴ洢���ѧԺ��Ϣ
	List<OrganizationComponent> list = new ArrayList<OrganizationComponent>();
	
	//���췽��
	public University(String name, String desc) {
		super(name, desc);
		
	}
	
	@Override
	public void add(OrganizationComponent oc) {
		list.add(oc);
	}
	
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
	
	//��дprint����
	@Override
	public void print() {
		//���ȴ�ӡһ�±��������
		System.out.println("------------------------" + getName() + "------------------------");
		
		//Ȼ��Ա����������ݽ��б�����Ҳ���Ǳ���List
		for (OrganizationComponent organizationComponent : list) {
			organizationComponent.print();
		}
	}

}
