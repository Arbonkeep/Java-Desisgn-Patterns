package com.arbonkeep.memento.theory;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
	//ʹ��list���ϴ洢�������¼����
	private List<Memento> mementos = new ArrayList<>();
	
	//��ӱ���¼����ķ���
	public void add(Memento memento) {
		mementos.add(memento);
	}
	
	//��ȡ����index��Originator�ı���¼����
	public Memento get(int index) {
		return mementos.get(index);
	}
	
	
}
