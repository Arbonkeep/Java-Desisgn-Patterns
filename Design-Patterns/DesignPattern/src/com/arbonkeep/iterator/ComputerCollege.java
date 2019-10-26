package com.arbonkeep.iterator;

import java.util.Iterator;

public class ComputerCollege implements College {
	//迭代器是数组实现的
	Department[] departments;
	int numberOfDepartment = 0;//保存当前数组的对象个数
	
	//构造器，对数组进行初始化
    public ComputerCollege() {
		departments = new Department[5];
		addDepartment("Java专业", "Java专业");
		addDepartment("Php专业", "Php专业");
		addDepartment("大数据专业", "大数据专业");
		addDepartment("安卓专业", "安卓专业");
	}
	
	@Override
	public String getName() {
		
		return "计算机学院";
	}

	@Override
	public void addDepartment(String name, String desc) {
		Department department = new Department(name, desc);//创建一个系
		departments[numberOfDepartment] = department; //将系添加到数组中
		numberOfDepartment ++;//维护数组元素个数
		
	}

	@Override
	public Iterator createIterator() {
		//返回一个计算机学院的迭代器
		return new ComputerCollegeIterator(departments);
	}

}
