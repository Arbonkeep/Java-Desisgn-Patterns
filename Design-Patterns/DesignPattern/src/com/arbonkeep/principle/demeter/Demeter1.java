package com.arbonkeep.principle.demeter;

import java.util.ArrayList;
import java.util.List;
/*
	ʵ��һ�������ط�����(��ʽ1)
 		����:CollegeEmployee�Ծֲ������ķ�ʽ������SchoolManager���У�Υ�������ط���
 		
 		�Ľ�:	1.��Ҫ�������г��ַ�ֱ�����ѵĹ�ϵ(�Ծֲ������ķ�ʽ����)
 			2.��SchoolManager�����ѧԺԱ���ķ�������װ��CollegeManager��
 */
public class Demeter1 {

	public static void main(String[] args) {
		//����һ��SchoolManager����
		SchoolManager s = new SchoolManager();
		//�����������
		s.printAllEmployee(new CollegeManager());
	}
}
//ѧУ�ܲ�Ա��
class Employee {
	private String id;
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	} 
}

//ѧԺԱ��
class CollegeEmployee {
	private String id;
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	} 
}

//����ѧԺԱ���Ĺ�����
class CollegeManager {
	//����ѧԺ����Ա��
	public List<CollegeEmployee> getAllEmployee() {
		List<CollegeEmployee> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {//����10��Ա����list
			CollegeEmployee emp = new CollegeEmployee();
			emp.setId("ѧԺԱ��id= " + i);
			list.add(emp);
		}
		return list;
	}
}

//ѧУ�Ĺ�����

//������SchoolManager��ֱ����������ЩEmployee��CollegeManager
//    CollegeEmployee����ֱ�����ѣ�Υ���˵����ط���
class SchoolManager {
	//����ѧУ��Ա��
	public List<Employee> getAllEmployee() {
		List<Employee> list = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {//����5��Ա��
			Employee emp = new Employee();
			emp.setId("ѧУ�ܲ�Ա��id= " + i);
			list.add(emp);
		}
		
		return list;
	}
	//������ѧУ�ܲ���ѧԺԱ����Ϣ�ķ���
	void printAllEmployee(CollegeManager sub) {
		//��ȡ��ѧԺԱ��
		List<CollegeEmployee> list1 = sub.getAllEmployee();
		//CollegeEmployee�Ծֲ������ķ�ʽ�����ڱ����У�Υ�������ط���
		System.out.println("------------ѧԺԱ��-------------");
		
		for (CollegeEmployee e : list1) {
			System.out.println(e.getId());
		}
		//��ȡ��ѧУ�ܲ�Ա��
		List<Employee> list2 = this.getAllEmployee();
		System.out.println("------------ѧУ�ܲ�Ա��-------------");
		
		for (Employee employee : list2) {
			System.out.println(employee.getId());
		}
	}
}
