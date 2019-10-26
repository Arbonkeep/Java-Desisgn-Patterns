package com.arbonkeep.iterator;

import java.util.Iterator;

public class ComputerCollege implements College {
	//������������ʵ�ֵ�
	Department[] departments;
	int numberOfDepartment = 0;//���浱ǰ����Ķ������
	
	//����������������г�ʼ��
    public ComputerCollege() {
		departments = new Department[5];
		addDepartment("Javaרҵ", "Javaרҵ");
		addDepartment("Phpרҵ", "Phpרҵ");
		addDepartment("������רҵ", "������רҵ");
		addDepartment("��׿רҵ", "��׿רҵ");
	}
	
	@Override
	public String getName() {
		
		return "�����ѧԺ";
	}

	@Override
	public void addDepartment(String name, String desc) {
		Department department = new Department(name, desc);//����һ��ϵ
		departments[numberOfDepartment] = department; //��ϵ��ӵ�������
		numberOfDepartment ++;//ά������Ԫ�ظ���
		
	}

	@Override
	public Iterator createIterator() {
		//����һ�������ѧԺ�ĵ�����
		return new ComputerCollegeIterator(departments);
	}

}
