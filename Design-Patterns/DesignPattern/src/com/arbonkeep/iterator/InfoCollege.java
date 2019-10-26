package com.arbonkeep.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InfoCollege implements College {
	//�����������ü������洢
	List<Department> departmentList;
	
	//��������ʼ������
	public InfoCollege() {
		departmentList = new ArrayList<Department>();
		addDepartment("��Ϣ��ȫרҵ", "��Ϣ��ȫרҵ");
		addDepartment("���簲ȫרҵ", "���簲ȫרҵ");
		addDepartment("ͨ�Ű�ȫרҵ", "ͨ�Ű�ȫרҵ");
	}
	
	@Override
	public String getName() {
		
		return "��ϢѧԺ";
	}

	//���ϵ�ķ���
	@Override
	public void addDepartment(String name, String desc) {
		Department department = new Department(name, desc);
		departmentList.add(department);
		
	}
	
	//���ص�����
	@Override
	public Iterator createIterator() {
		
		return new InfoCollegeIterator(departmentList);
		
	}

}
