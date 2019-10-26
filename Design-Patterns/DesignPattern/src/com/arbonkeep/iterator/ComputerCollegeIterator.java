package com.arbonkeep.iterator;

import java.util.Iterator;

public class ComputerCollegeIterator implements Iterator {
	//由于学院里面有多个系，所以定义成数组
	private Department[] departments;
	
	private int position = 0;
	
	//定义一个构造器间departments传入
	public ComputerCollegeIterator(Department[] departments) {
		this.departments = departments;
	}	
	
	@Override
	public boolean hasNext() {
		if(position >= departments.length -1 || departments[position] == null) {
			return false;
		}else {
			return true;
		}
		
	}

	@Override
	public Object next() {
		Department department = departments[position];
		position += 1;
		return department;
	}
	
	//空实现remove
	public void remove() {
		
	}

}
