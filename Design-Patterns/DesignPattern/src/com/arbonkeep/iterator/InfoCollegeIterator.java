package com.arbonkeep.iterator;

import java.util.Iterator;
import java.util.List;

public class InfoCollegeIterator implements Iterator{
	private List<Department> departments;//��Ϣ����ѧԺ��ͨ�����ϵķ�ʽ�洢
	private int index = -1;
	
	//������
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
	
	//��ʵ��remove
	public void remove() {
		
	}

}
