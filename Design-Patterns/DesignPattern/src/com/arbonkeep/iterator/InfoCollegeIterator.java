package com.arbonkeep.iterator;

import java.util.Iterator;
import java.util.List;

public class InfoCollegeIterator implements Iterator{
	private List<Department> departments;//信息工程学院是通过集合的方式存储
	private int index = -1;
	
	//构造器
	public InfoCollegeIterator(List<Department> departments) {
		this.departments = departments;
	}

	
	@Override
	public boolean hasNext() {
		if(index >= departments.size() -1) {
			return false;
		}else {
			index += 1;
			return true;
		}
		
	}

	
	@Override
	public Object next() {
		Department department = departments.get(index);
		return department;
	}
	
	//空实现remove
	public void remove() {
		
	}

}
