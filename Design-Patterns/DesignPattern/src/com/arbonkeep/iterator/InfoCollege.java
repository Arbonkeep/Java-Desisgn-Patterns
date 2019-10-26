package com.arbonkeep.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InfoCollege implements College {
	//迭代器是利用集合来存储
	List<Department> departmentList;
	
	//构造器初始化集合
	public InfoCollege() {
		departmentList = new ArrayList<Department>();
		addDepartment("信息安全专业", "信息安全专业");
		addDepartment("网络安全专业", "网络安全专业");
		addDepartment("通信安全专业", "通信安全专业");
	}
	
	@Override
	public String getName() {
		
		return "信息学院";
	}

	//添加系的方法
	@Override
	public void addDepartment(String name, String desc) {
		Department department = new Department(name, desc);
		departmentList.add(department);
		
	}
	
	//返回迭代器
	@Override
	public Iterator createIterator() {
		
		return new InfoCollegeIterator(departmentList);
		
	}

}
