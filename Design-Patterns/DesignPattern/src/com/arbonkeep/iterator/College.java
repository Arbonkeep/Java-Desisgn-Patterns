package com.arbonkeep.iterator;

import java.util.Iterator;

public interface College {
	//获取College名字的方法
	public String getName();
	
	//增加系的方法
	public void addDepartment(String name, String desc);
	
	//返回迭代器的方法，用于遍历
	public Iterator createIterator();
}
