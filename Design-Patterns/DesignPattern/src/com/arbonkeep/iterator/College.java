package com.arbonkeep.iterator;

import java.util.Iterator;

public interface College {
	//��ȡCollege���ֵķ���
	public String getName();
	
	//����ϵ�ķ���
	public void addDepartment(String name, String desc);
	
	//���ص������ķ��������ڱ���
	public Iterator createIterator();
}
