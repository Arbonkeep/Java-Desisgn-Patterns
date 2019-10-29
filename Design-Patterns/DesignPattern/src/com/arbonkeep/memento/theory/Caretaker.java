package com.arbonkeep.memento.theory;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
	//使用list集合存储多个备忘录对象
	private List<Memento> mementos = new ArrayList<>();
	
	//添加备忘录对象的方法
	public void add(Memento memento) {
		mementos.add(memento);
	}
	
	//获取到第index个Originator的备忘录对象
	public Memento get(int index) {
		return mementos.get(index);
	}
	
	
}
