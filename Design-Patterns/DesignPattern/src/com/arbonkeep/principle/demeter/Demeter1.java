package com.arbonkeep.principle.demeter;

import java.util.ArrayList;
import java.util.List;
/*
	实现一个迪米特法则类(方式1)
 		分析:CollegeEmployee以局部变量的方式出现在SchoolManager类中，违反迪米特法则
 		
 		改进:	1.需要避免类中出现非直接朋友的关系(以局部变量的方式出现)
 			2.将SchoolManager中输出学院员工的方法，封装到CollegeManager中
 */
public class Demeter1 {

	public static void main(String[] args) {
		//创建一个SchoolManager对象
		SchoolManager s = new SchoolManager();
		//调用输出方法
		s.printAllEmployee(new CollegeManager());
	}
}
//学校总部员工
class Employee {
	private String id;
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	} 
}

//学院员工
class CollegeEmployee {
	private String id;
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	} 
}

//管理学院员工的管理类
class CollegeManager {
	//返回学院所有员工
	public List<CollegeEmployee> getAllEmployee() {
		List<CollegeEmployee> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {//增加10个员工到list
			CollegeEmployee emp = new CollegeEmployee();
			emp.setId("学院员工id= " + i);
			list.add(emp);
		}
		return list;
	}
}

//学校的管理类

//分析：SchoolManager的直接朋友有哪些Employee，CollegeManager
//    CollegeEmployee不是直接朋友，违反了迪米特法则
class SchoolManager {
	//返回学校的员工
	public List<Employee> getAllEmployee() {
		List<Employee> list = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {//增加5个员工
			Employee emp = new Employee();
			emp.setId("学校总部员工id= " + i);
			list.add(emp);
		}
		
		return list;
	}
	//完成输出学校总部和学院员工信息的方法
	void printAllEmployee(CollegeManager sub) {
		//获取到学院员工
		List<CollegeEmployee> list1 = sub.getAllEmployee();
		//CollegeEmployee以局部变量的方式出现在本类中，违反迪米特法则
		System.out.println("------------学院员工-------------");
		
		for (CollegeEmployee e : list1) {
			System.out.println(e.getId());
		}
		//获取到学校总部员工
		List<Employee> list2 = this.getAllEmployee();
		System.out.println("------------学校总部员工-------------");
		
		for (Employee employee : list2) {
			System.out.println(employee.getId());
		}
	}
}
