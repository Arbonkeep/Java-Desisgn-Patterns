package com.arbonkeep.iterator;

import java.util.Iterator;
import java.util.List;

public class OutputImpl {
	List<College> collegeList;
	
	//构造器
	public OutputImpl(List<College> collegeList) {
		this.collegeList = collegeList;
	}
	
	//输出学院，系
	public void printDepartment(Iterator iterator) {
		while(iterator.hasNext()) {
			Department d = (Department)iterator.next();
			System.out.println(d.getName());
		}
	}
	
	//遍历所有学院，然后调用printDepartment输出各个学院的系
	public void printCollege() {
		//获取学院迭代器
		Iterator<College> iterator = collegeList.iterator();//list集合实现了Iterator接口
		while(iterator.hasNext()) {
			College college = iterator.next();
			System.out.println("-----------"+ college.getName() + "----------");
			printDepartment(college.createIterator());//获取对应的迭代器
		}
		
	}
}
