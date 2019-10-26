package com.arbonkeep.visitor;

import java.util.LinkedList;
import java.util.List;

public class ObjectStructure {
	//ά����һ������(���������ڴ�Ŷ��������)
	private List<Person> list = new LinkedList<>();
	
	//��ӵ�list��
	public void attach(Person p) {
		list.add(p);
	}
	
	//��list���Ƴ�
	public void detach(Person p) {
		list.remove(p);
	}
	
	//�鿴���еķ�����״������ʾ���������
	public void display(Action action) {
		for (Person person : list) {
			person.accept(action);
		}
	}
}
