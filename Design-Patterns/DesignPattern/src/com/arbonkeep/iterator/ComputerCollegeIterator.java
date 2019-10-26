package com.arbonkeep.iterator;

import java.util.Iterator;

public class ComputerCollegeIterator implements Iterator {
	//����ѧԺ�����ж��ϵ�����Զ��������
	private Department[] departments;
	
	private int position = 0;
	
	//����һ����������departments����
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
	
	//��ʵ��remove
	public void remove() {
		
	}

}
