package com.arbonkeep.iterator;

import java.util.Iterator;
import java.util.List;

public class OutputImpl {
	List<College> collegeList;
	
	//������
	public OutputImpl(List<College> collegeList) {
		this.collegeList = collegeList;
	}
	
	//���ѧԺ��ϵ
	public void printDepartment(Iterator iterator) {
		while(iterator.hasNext()) {
			Department d = (Department)iterator.next();
			System.out.println(d.getName());
		}
	}
	
	//��������ѧԺ��Ȼ�����printDepartment�������ѧԺ��ϵ
	public void printCollege() {
		//��ȡѧԺ������
		Iterator<College> iterator = collegeList.iterator();//list����ʵ����Iterator�ӿ�
		while(iterator.hasNext()) {
			College college = iterator.next();
			System.out.println("-----------"+ college.getName() + "----------");
			printDepartment(college.createIterator());//��ȡ��Ӧ�ĵ�����
		}
		
	}
}
