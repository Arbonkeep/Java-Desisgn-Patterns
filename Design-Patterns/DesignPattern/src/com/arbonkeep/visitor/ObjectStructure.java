package com.arbonkeep.visitor;

import java.util.LinkedList;
import java.util.List;

public class ObjectStructure {
	//维护了一个集合(集合中用于存放多个访问者)
	private List<Person> list = new LinkedList<>();
	
	//添加到list中
	public void attach(Person p) {
		list.add(p);
	}
	
	//从list中移除
	public void detach(Person p) {
		list.remove(p);
	}
	
	//查看所有的访问者状况（显示测评情况）
	public void display(Action action) {
		for (Person person : list) {
			person.accept(action);
		}
	}
}
